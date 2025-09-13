package ui.model

import de.stefan_oltmann.oni.model.GeyserType
import de.stefan_oltmann.oni.model.GeyserType.ALUMINIUM_VOLCANO
import de.stefan_oltmann.oni.model.GeyserType.CHLORINE
import de.stefan_oltmann.oni.model.GeyserType.CHLORINE_COOL
import de.stefan_oltmann.oni.model.GeyserType.COBALT_VOLCANO
import de.stefan_oltmann.oni.model.GeyserType.COOL_SALT_WATER
import de.stefan_oltmann.oni.model.GeyserType.COOL_SLUSH_WATER
import de.stefan_oltmann.oni.model.GeyserType.COOL_STEAM
import de.stefan_oltmann.oni.model.GeyserType.COPPER_VOLCANO
import de.stefan_oltmann.oni.model.GeyserType.GOLD_VOLCANO
import de.stefan_oltmann.oni.model.GeyserType.HOT_CO2
import de.stefan_oltmann.oni.model.GeyserType.HOT_POLLUTED_O2
import de.stefan_oltmann.oni.model.GeyserType.HOT_SALT_WATER
import de.stefan_oltmann.oni.model.GeyserType.HOT_STEAM
import de.stefan_oltmann.oni.model.GeyserType.HYDROGEN
import de.stefan_oltmann.oni.model.GeyserType.INFECTIOUS_POLLUTED_O2
import de.stefan_oltmann.oni.model.GeyserType.IRON_VOLCANO
import de.stefan_oltmann.oni.model.GeyserType.LEAKY_OIL_FISSURE
import de.stefan_oltmann.oni.model.GeyserType.LIQUID_CO2
import de.stefan_oltmann.oni.model.GeyserType.LIQUID_SULFUR_GEYSER
import de.stefan_oltmann.oni.model.GeyserType.MINOR_VOLCANO
import de.stefan_oltmann.oni.model.GeyserType.NATURAL_GAS
import de.stefan_oltmann.oni.model.GeyserType.NIOBIUM_VOLCANO
import de.stefan_oltmann.oni.model.GeyserType.OIL_RESERVOIR
import de.stefan_oltmann.oni.model.GeyserType.POLLUTED_WATER
import de.stefan_oltmann.oni.model.GeyserType.TUNGSTEN_VOLCANO
import de.stefan_oltmann.oni.model.GeyserType.VOLCANO
import de.stefan_oltmann.oni.model.GeyserType.WATER
import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.geyserTypeAluminiumVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeCarbonDioxideGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeCarbonDioxideVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeChlorineCoolGasVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeChlorineGasVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeCobaltVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeCoolSaltSlushGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeCoolSlushGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeCoolSteamVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeCopperVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeGoldVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeHotPollutedOxygenVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeHydrogenVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeInfectiousPollutedOxygenVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeIronVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeLeakyOilFissure
import io.github.stefanoltmann.app.generated.resources.geyserTypeLiquidSulfurGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeMinorVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeNaturalGasGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeNiobiumVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeOilReservoir
import io.github.stefanoltmann.app.generated.resources.geyserTypePollutedWaterVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeSaltWaterGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeSteamVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeTungstenVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeWaterGeyser
import org.jetbrains.compose.resources.StringResource

/** i18n resource */
val GeyserType.stringResource: StringResource
    get() = when (this) {
        COOL_STEAM -> Res.string.geyserTypeCoolSteamVent
        HYDROGEN -> Res.string.geyserTypeHydrogenVent
        NATURAL_GAS -> Res.string.geyserTypeNaturalGasGeyser
        CHLORINE -> Res.string.geyserTypeChlorineGasVent
        CHLORINE_COOL -> Res.string.geyserTypeChlorineCoolGasVent
        HOT_STEAM -> Res.string.geyserTypeSteamVent
        HOT_CO2 -> Res.string.geyserTypeCarbonDioxideVent
        HOT_POLLUTED_O2 -> Res.string.geyserTypeHotPollutedOxygenVent
        INFECTIOUS_POLLUTED_O2 -> Res.string.geyserTypeInfectiousPollutedOxygenVent
        WATER -> Res.string.geyserTypeWaterGeyser
        COOL_SLUSH_WATER -> Res.string.geyserTypeCoolSlushGeyser
        POLLUTED_WATER -> Res.string.geyserTypePollutedWaterVent
        COOL_SALT_WATER -> Res.string.geyserTypeCoolSaltSlushGeyser
        HOT_SALT_WATER -> Res.string.geyserTypeSaltWaterGeyser
        LIQUID_CO2 -> Res.string.geyserTypeCarbonDioxideGeyser
        LEAKY_OIL_FISSURE -> Res.string.geyserTypeLeakyOilFissure
        LIQUID_SULFUR_GEYSER -> Res.string.geyserTypeLiquidSulfurGeyser
        IRON_VOLCANO -> Res.string.geyserTypeIronVolcano
        COPPER_VOLCANO -> Res.string.geyserTypeCopperVolcano
        GOLD_VOLCANO -> Res.string.geyserTypeGoldVolcano
        ALUMINIUM_VOLCANO -> Res.string.geyserTypeAluminiumVolcano
        COBALT_VOLCANO -> Res.string.geyserTypeCobaltVolcano
        TUNGSTEN_VOLCANO -> Res.string.geyserTypeTungstenVolcano
        NIOBIUM_VOLCANO -> Res.string.geyserTypeNiobiumVolcano
        VOLCANO -> Res.string.geyserTypeVolcano
        MINOR_VOLCANO -> Res.string.geyserTypeMinorVolcano
        OIL_RESERVOIR -> Res.string.geyserTypeOilReservoir
    }
