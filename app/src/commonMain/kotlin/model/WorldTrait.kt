/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
 * https://stefan-oltmann.de/oni-seed-browser
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package model

import androidx.compose.ui.graphics.Color
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.worldTraitBouldersLarge
import io.github.stefanoltmann.app.generated.resources.worldTraitBouldersMedium
import io.github.stefanoltmann.app.generated.resources.worldTraitBouldersMixed
import io.github.stefanoltmann.app.generated.resources.worldTraitBouldersSmall
import io.github.stefanoltmann.app.generated.resources.worldTraitCrashedSatellites
import io.github.stefanoltmann.app.generated.resources.worldTraitDeepOil
import io.github.stefanoltmann.app.generated.resources.worldTraitDistressSignal
import io.github.stefanoltmann.app.generated.resources.worldTraitFrozenCore
import io.github.stefanoltmann.app.generated.resources.worldTraitGeoActive
import io.github.stefanoltmann.app.generated.resources.worldTraitGeoDormant
import io.github.stefanoltmann.app.generated.resources.worldTraitGeodes
import io.github.stefanoltmann.app.generated.resources.worldTraitGlaciersLarge
import io.github.stefanoltmann.app.generated.resources.worldTraitIrregularOil
import io.github.stefanoltmann.app.generated.resources.worldTraitLushCore
import io.github.stefanoltmann.app.generated.resources.worldTraitMagmaVents
import io.github.stefanoltmann.app.generated.resources.worldTraitMetalCaves
import io.github.stefanoltmann.app.generated.resources.worldTraitMetalPoor
import io.github.stefanoltmann.app.generated.resources.worldTraitMetalRich
import io.github.stefanoltmann.app.generated.resources.worldTraitMisalignedStart
import io.github.stefanoltmann.app.generated.resources.worldTraitRadioactiveCrust
import io.github.stefanoltmann.app.generated.resources.worldTraitSlimeSplats
import io.github.stefanoltmann.app.generated.resources.worldTraitSubsurfaceOcean
import io.github.stefanoltmann.app.generated.resources.worldTraitVolcanoes
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.StringResource

/*
 * See https://oxygennotincluded.fandom.com/wiki/World_Trait
 */

@Suppress("UNUSED")
@Serializable
enum class WorldTrait(
    val stringResource: StringResource,
    val color: Color,
    val rating: Rating = Rating.NEUTRAL
) {

    BouldersLarge(
        stringResource = Res.string.worldTraitBouldersLarge,
        color = Color(0xFFBDBDBD)
    ),
    BouldersMedium(
        stringResource = Res.string.worldTraitBouldersMedium,
        color = Color(0xFFBDBDBD)
    ),
    BouldersMixed(
        stringResource = Res.string.worldTraitBouldersMixed,
        color = Color(0xFFBDBDBD)
    ),
    BouldersSmall(
        stringResource = Res.string.worldTraitBouldersSmall,
        color = Color(0xFFBDBDBD)
    ),
    DeepOil(
        stringResource = Res.string.worldTraitDeepOil,
        color = Color(0xFF6E6E6E),
        /* More oil reservoirs */
        rating = Rating.VERY_GOOD
    ),
    FrozenCore(
        stringResource = Res.string.worldTraitFrozenCore,
        color = Color(0xFFA1D6ED),
        /* Frozen core helps early with CO2 and to cool down the planet */
        rating = Rating.GOOD
    ),
    GeoActive(
        stringResource = Res.string.worldTraitGeoActive,
        color = Color(0xFFECA649),
        /* More geyser output */
        rating = Rating.VERY_GOOD
    ),
    Geodes(
        stringResource = Res.string.worldTraitGeodes,
        color = Color(0xFFC47BF4),
        /* Helpful materials. */
        rating = Rating.VERY_GOOD
    ),
    GeoDormant(
        stringResource = Res.string.worldTraitGeoDormant,
        color = Color(0xFF8895A1),
        /* Less geyser output */
        rating = Rating.VERY_BAD
    ),
    GlaciersLarge(
        stringResource = Res.string.worldTraitGlaciersLarge,
        color = Color(0xFFA1D6ED)
    ),
    IrregularOil(
        stringResource = Res.string.worldTraitIrregularOil,
        color = Color(0xFF6C6C6C),
        /* More oil patches, easier to access. */
        rating = Rating.VERY_GOOD
    ),
    MagmaVents(
        stringResource = Res.string.worldTraitMagmaVents,
        color = Color(0xFFE7544D),
        /* Makes the game harder */
        rating = Rating.BAD
    ),
    MetalPoor(
        stringResource = Res.string.worldTraitMetalPoor,
        color = Color(0xFF8794A0),
        /* Less metal */
        rating = Rating.VERY_BAD
    ),
    MetalRich(
        stringResource = Res.string.worldTraitMetalRich,
        color = Color(0xFFD2AB4B),
        /* More metal */
        rating = Rating.VERY_GOOD
    ),
    MisalignedStart(
        stringResource = Res.string.worldTraitMisalignedStart,
        color = Color(0xFFE7DC93)
    ),
    SlimeSplats(
        stringResource = Res.string.worldTraitSlimeSplats,
        color = Color(0xFF8EB542)
    ),
    SubsurfaceOcean(
        stringResource = Res.string.worldTraitSubsurfaceOcean,
        color = Color(0xFF61CEF0)
    ),
    Volcanoes(
        stringResource = Res.string.worldTraitVolcanoes,
        color = Color(0xFFE7544D),
        /* Makes the game harder, but more heat energy. */
        rating = Rating.BAD
    ),
    CrashedSatellites(
        stringResource = Res.string.worldTraitCrashedSatellites,
        color = Color(0xFF7ED360),
        /* Lots of free radiation */
        rating = Rating.VERY_GOOD
    ),
    DistressSignal(
        stringResource = Res.string.worldTraitDistressSignal,
        color = Color(0xFF8794A0)
    ),
    LushCore(
        stringResource = Res.string.worldTraitLushCore,
        color = Color(0xFF66A052),
        /* Access to pips */
        rating = Rating.GOOD
    ),
    MetalCaves(
        stringResource = Res.string.worldTraitMetalCaves,
        color = Color(0xFFD2AB4B),
        /* More free metal */
        rating = Rating.GOOD
    ),
    RadioactiveCrust(
        stringResource = Res.string.worldTraitRadioactiveCrust,
        color = Color(0xFF7ED360),
        /* More free radiation */
        rating = Rating.GOOD
    )
}

