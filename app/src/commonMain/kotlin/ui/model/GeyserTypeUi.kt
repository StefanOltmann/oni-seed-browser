package ui.model

import de.stefan_oltmann.oni.model.GeyserType
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
import io.github.stefanoltmann.app.generated.resources.geyserTypePollutedBrine
import io.github.stefanoltmann.app.generated.resources.geyserTypePollutedWaterVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeSaltWaterGeyser
import io.github.stefanoltmann.app.generated.resources.geyserTypeSteamVent
import io.github.stefanoltmann.app.generated.resources.geyserTypeThermalGasFissure
import io.github.stefanoltmann.app.generated.resources.geyserTypeTidalSpring
import io.github.stefanoltmann.app.generated.resources.geyserTypeTungstenVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeVolcano
import io.github.stefanoltmann.app.generated.resources.geyserTypeWaterGeyser
import org.jetbrains.compose.resources.StringResource

/** i18n resource */
val GeyserType.stringResource: StringResource
    get() = when (this) {
        GeyserType.COOL_STEAM -> Res.string.geyserTypeCoolSteamVent
        GeyserType.HYDROGEN -> Res.string.geyserTypeHydrogenVent
        GeyserType.NATURAL_GAS -> Res.string.geyserTypeNaturalGasGeyser
        GeyserType.CHLORINE -> Res.string.geyserTypeChlorineGasVent
        GeyserType.CHLORINE_COOL -> Res.string.geyserTypeChlorineCoolGasVent
        GeyserType.HOT_STEAM -> Res.string.geyserTypeSteamVent
        GeyserType.HOT_CO2 -> Res.string.geyserTypeCarbonDioxideVent
        GeyserType.HOT_POLLUTED_O2 -> Res.string.geyserTypeHotPollutedOxygenVent
        GeyserType.INFECTIOUS_POLLUTED_O2 -> Res.string.geyserTypeInfectiousPollutedOxygenVent
        GeyserType.WATER -> Res.string.geyserTypeWaterGeyser
        GeyserType.COOL_SLUSH_WATER -> Res.string.geyserTypeCoolSlushGeyser
        GeyserType.POLLUTED_WATER -> Res.string.geyserTypePollutedWaterVent
        GeyserType.COOL_SALT_WATER -> Res.string.geyserTypeCoolSaltSlushGeyser
        GeyserType.HOT_SALT_WATER -> Res.string.geyserTypeSaltWaterGeyser
        GeyserType.LIQUID_CO2 -> Res.string.geyserTypeCarbonDioxideGeyser
        GeyserType.LEAKY_OIL_FISSURE -> Res.string.geyserTypeLeakyOilFissure
        GeyserType.LIQUID_SULFUR_GEYSER -> Res.string.geyserTypeLiquidSulfurGeyser
        GeyserType.IRON_VOLCANO -> Res.string.geyserTypeIronVolcano
        GeyserType.COPPER_VOLCANO -> Res.string.geyserTypeCopperVolcano
        GeyserType.GOLD_VOLCANO -> Res.string.geyserTypeGoldVolcano
        GeyserType.ALUMINIUM_VOLCANO -> Res.string.geyserTypeAluminiumVolcano
        GeyserType.COBALT_VOLCANO -> Res.string.geyserTypeCobaltVolcano
        GeyserType.TUNGSTEN_VOLCANO -> Res.string.geyserTypeTungstenVolcano
        GeyserType.NIOBIUM_VOLCANO -> Res.string.geyserTypeNiobiumVolcano
        GeyserType.VOLCANO -> Res.string.geyserTypeVolcano
        GeyserType.MINOR_VOLCANO -> Res.string.geyserTypeMinorVolcano
        GeyserType.OIL_RESERVOIR -> Res.string.geyserTypeOilReservoir
        GeyserType.TIDAL_SPRING -> Res.string.geyserTypeTidalSpring
        GeyserType.POLLUTED_BRINE -> Res.string.geyserTypePollutedBrine
        GeyserType.THERMAL_GAS_FISSURE -> Res.string.geyserTypeThermalGasFissure
    }
