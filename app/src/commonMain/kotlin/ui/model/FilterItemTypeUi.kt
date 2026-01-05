package ui.model

import de.stefan_oltmann.oni.model.filter.FilterItemType
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.uiGeyserCount
import io.github.stefanoltmann.app.generated.resources.uiGoodGeyserCount
import io.github.stefanoltmann.app.generated.resources.uiWorldTrait
import io.github.stefanoltmann.app.generated.resources.uiZoneType
import org.jetbrains.compose.resources.StringResource

val FilterItemType.stringResource: StringResource
    get() = when (this) {
        FilterItemType.WORLD_TRAIT -> Res.string.uiWorldTrait
        FilterItemType.ZONE_TYPE -> Res.string.uiZoneType
        FilterItemType.GEYSER_COUNT -> Res.string.uiGeyserCount
        FilterItemType.GOOD_GEYSER_COUNT -> Res.string.uiGoodGeyserCount
    }
