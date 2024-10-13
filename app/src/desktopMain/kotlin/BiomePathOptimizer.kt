import com.menecats.polybool.Epsilon
import com.menecats.polybool.PolyBool
import com.menecats.polybool.helpers.PolyBoolHelper.epsilon
import com.menecats.polybool.helpers.PolyBoolHelper.polygon
import com.menecats.polybool.models.Polygon
import model.BiomePaths
import model.Point
import model.ZoneType
import kotlin.math.roundToInt

fun BiomePaths.optimize(): BiomePaths {

    val mergedPolygonMap = mutableMapOf<ZoneType, List<List<Point>>>()

    for ((zoneType, regions) in polygonMap.entries) {

        val regionPointsList = mutableListOf<List<DoubleArray>>()

        for (region in regions) {

            val regionPoints = mutableListOf<DoubleArray>()

            for (point in region)
                regionPoints.add(arrayOf(point.x.toDouble(), point.y.toDouble()).toDoubleArray())

            regionPointsList.add(regionPoints)
        }

        val polygon = Polygon(regionPointsList)

        val epsilon: Epsilon = epsilon()

        val mergedPolygon: Polygon = PolyBool.union(
            epsilon,
            polygon,
            polygon()
        )

        val resultListList = mutableListOf<List<Point>>()

        for (mergedPolygonRegion in mergedPolygon.regions) {

            val mergedPoints = mutableListOf<Point>()

            for (point in mergedPolygonRegion) {

                mergedPoints.add(
                    Point(
                        x = point[0].roundToInt(),
                        y = point[1].roundToInt()
                    )
                )
            }

            resultListList.add(mergedPoints)
        }

        mergedPolygonMap[zoneType] = resultListList
    }

    return BiomePaths(mergedPolygonMap)
}
