package ui.model

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
import model.GeyserType
import model.GeyserType.ALUMINIUM_VOLCANO
import model.GeyserType.CHLORINE
import model.GeyserType.CHLORINE_COOL
import model.GeyserType.COBALT_VOLCANO
import model.GeyserType.COOL_SALT_WATER
import model.GeyserType.COOL_SLUSH_WATER
import model.GeyserType.COOL_STEAM
import model.GeyserType.COPPER_VOLCANO
import model.GeyserType.GOLD_VOLCANO
import model.GeyserType.HOT_CO2
import model.GeyserType.HOT_POLLUTED_O2
import model.GeyserType.HOT_SALT_WATER
import model.GeyserType.HOT_STEAM
import model.GeyserType.HYDROGEN
import model.GeyserType.INFECTIOUS_POLLUTED_O2
import model.GeyserType.IRON_VOLCANO
import model.GeyserType.LEAKY_OIL_FISSURE
import model.GeyserType.LIQUID_CO2
import model.GeyserType.LIQUID_SULFUR_GEYSER
import model.GeyserType.MINOR_VOLCANO
import model.GeyserType.NATURAL_GAS
import model.GeyserType.NIOBIUM_VOLCANO
import model.GeyserType.OIL_RESERVOIR
import model.GeyserType.POLLUTED_WATER
import model.GeyserType.TUNGSTEN_VOLCANO
import model.GeyserType.VOLCANO
import model.GeyserType.WATER
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
