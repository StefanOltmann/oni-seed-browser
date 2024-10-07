/*
 * Copyright 2024 JetBrains s.r.o.
 * https://github.com/JetBrains/compose-multiplatform
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.compose.resources

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.isSpecified
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.toSize
import org.jetbrains.skia.Data
import org.jetbrains.skia.Rect
import org.jetbrains.skia.svg.SVGDOM
import org.jetbrains.skia.svg.SVGLength
import org.jetbrains.skia.svg.SVGLengthUnit
import org.jetbrains.skia.svg.SVGPreserveAspectRatio
import org.jetbrains.skia.svg.SVGPreserveAspectRatioAlign
import kotlin.math.ceil

/**
 * Modified version of org.jetbrains.compose.resources.SvgPainter
 */

fun loadSvgPainter(
    encodedData: ByteArray,
    density: Density
): Painter {
    return SVGPainter(listOf(SVGDOM(Data.makeFromBytes(encodedData))), density)
}

private class SVGPainter(
    private val doms: List<SVGDOM>,
    private val density: Density
) : Painter() {

    private val dom = doms[0]

    private val defaultSizePx: Size = run {

        val width = dom.root?.width?.let { if (it.unit != SVGLengthUnit.PERCENTAGE) it.value else 0f } ?: 0f
        val height = dom.root?.height?.let { if (it.unit != SVGLengthUnit.PERCENTAGE) it.value else 0f } ?: 0f

        if (width == 0f && height == 0f)
            Size.Unspecified
        else
            Size(width, height)
    }

    init {
        if (dom.root?.viewBox == null && defaultSizePx.isSpecified) {
            val rect = Rect.makeXYWH(0f, 0f, defaultSizePx.width, defaultSizePx.height)
            doms.forEach { layerDom -> layerDom.root?.viewBox = rect }
        }
    }

    override val intrinsicSize: Size
        get() {

            val viewBox = dom.root?.viewBox

            return if (viewBox != null)
                Size(viewBox.width, viewBox.height) * density.density
            else if (defaultSizePx.isSpecified)
                defaultSizePx * density.density
            else
                Size.Unspecified
        }

    private var previousDrawSize: Size = Size.Unspecified
    private var alpha: Float = 1.0f
    private var colorFilter: ColorFilter? = null

    // with caching into bitmap FPS is 3x-4x higher (tested with idea-logo.svg with 30x30 icons)
    private val drawCache = DrawCache()

    override fun applyAlpha(alpha: Float): Boolean {
        this.alpha = alpha
        return true
    }

    override fun applyColorFilter(colorFilter: ColorFilter?): Boolean {
        this.colorFilter = colorFilter
        return true
    }

    override fun DrawScope.onDraw() {
        if (previousDrawSize != size) {
            previousDrawSize = size
            drawCache.drawCachedImage(
                IntSize(ceil(size.width).toInt(), ceil(size.height).toInt()),
                density = this,
                layoutDirection,
            ) {
                drawSvg(size)
            }
        }

        drawCache.drawInto(this, alpha, colorFilter)
    }

    private fun DrawScope.drawSvg(size: Size) {
        drawIntoCanvas { canvas ->
            doms.forEach { layerDom ->
                layerDom.root?.width = SVGLength(size.width, SVGLengthUnit.PX)
                layerDom.root?.height = SVGLength(size.height, SVGLengthUnit.PX)
                layerDom.root?.preserveAspectRatio = SVGPreserveAspectRatio(SVGPreserveAspectRatioAlign.NONE)
                layerDom.render(canvas.nativeCanvas)
            }
        }
    }
}

private class DrawCache {

    @PublishedApi
    internal var mCachedImage: ImageBitmap? = null
    private var cachedCanvas: Canvas? = null
    private var scopeDensity: Density? = null
    private var layoutDirection: LayoutDirection = LayoutDirection.Ltr
    private var size: IntSize = IntSize.Zero

    private val cacheScope = CanvasDrawScope()

    /**
     * Draw the contents of the lambda with receiver scope into an [ImageBitmap] with the provided
     * size. If the same size is provided across calls, the same [ImageBitmap] instance is
     * re-used and the contents are cleared out before drawing content in it again
     */
    fun drawCachedImage(
        size: IntSize,
        density: Density,
        layoutDirection: LayoutDirection,
        block: DrawScope.() -> Unit
    ) {
        this.scopeDensity = density
        this.layoutDirection = layoutDirection
        var targetImage = mCachedImage
        var targetCanvas = cachedCanvas
        if (targetImage == null ||
            targetCanvas == null ||
            size.width > targetImage.width ||
            size.height > targetImage.height
        ) {
            targetImage = ImageBitmap(size.width, size.height)
            targetCanvas = Canvas(targetImage)

            mCachedImage = targetImage
            cachedCanvas = targetCanvas
        }
        this.size = size
        cacheScope.draw(density, layoutDirection, targetCanvas, size.toSize()) {
            clear()
            block()
        }
        targetImage.prepareToDraw()
    }

    /**
     * Draw the cached content into the provided [DrawScope] instance
     */
    fun drawInto(
        target: DrawScope,
        alpha: Float = 1.0f,
        colorFilter: ColorFilter? = null
    ) {
        val targetImage = mCachedImage
        check(targetImage != null) {
            "drawCachedImage must be invoked first before attempting to draw the result " +
                "into another destination"
        }
        target.drawImage(targetImage, srcSize = size, alpha = alpha, colorFilter = colorFilter)
    }

    /**
     * Helper method to clear contents of the draw environment from the given bounds of the
     * DrawScope
     */
    private fun DrawScope.clear() {
        drawRect(color = Color.Black, blendMode = BlendMode.Clear)
    }
}
