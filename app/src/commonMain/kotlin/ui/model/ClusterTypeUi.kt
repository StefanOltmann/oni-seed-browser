package ui.model

import io.github.stefanoltmann.app.generated.resources.Res
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseArboria
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseAridio
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseBlastedCeres
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseCeres
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseOasisse
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseOceania
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseRelica
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseRelicaLab
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseRime
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseTerra
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseTheBadlands
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseVerdante
import io.github.stefanoltmann.app.generated.resources.clusterTypeBaseVolcanea
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcArboria
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcAridio
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcBlastedCeres
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcCeres
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcCeresMantle
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcCeresMinor
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcFlippedMoonlet
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcFolia
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcFrozenForestMoonlet
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcMetallicSwampyMoonlet
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcOasisse
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcOceania
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcQuagmiris
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcRadioactiveOceanMoonlet
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcRelica
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcRelicaLab
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcRelicaMinor
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcRime
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcSquelchy
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcTerra
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcTerrania
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcTheBadlands
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcTheDesolandsMoonlet
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcVerdante
import io.github.stefanoltmann.app.generated.resources.clusterTypeDlcVolcanea
import de.stefan_oltmann.oni.model.ClusterType
import org.jetbrains.compose.resources.StringResource

val ClusterType.stringResource: StringResource
    get() = when (this) {
        ClusterType.BASE_TERRA -> Res.string.clusterTypeBaseTerra
        ClusterType.BASE_CERES -> Res.string.clusterTypeBaseCeres
        ClusterType.BASE_BLASTED_CERES -> Res.string.clusterTypeBaseBlastedCeres
        ClusterType.BASE_RELICA -> Res.string.clusterTypeBaseRelica
        ClusterType.BASE_RELICA_LAB -> Res.string.clusterTypeBaseRelicaLab
        ClusterType.BASE_OCEANIA -> Res.string.clusterTypeBaseOceania
        ClusterType.BASE_RIME -> Res.string.clusterTypeBaseRime
        ClusterType.BASE_VERDANTE -> Res.string.clusterTypeBaseVerdante
        ClusterType.BASE_ARBORIA -> Res.string.clusterTypeBaseArboria
        ClusterType.BASE_VOLCANEA -> Res.string.clusterTypeBaseVolcanea
        ClusterType.BASE_THE_BADLANDS -> Res.string.clusterTypeBaseTheBadlands
        ClusterType.BASE_ARIDIO -> Res.string.clusterTypeBaseAridio
        ClusterType.BASE_OASISSE -> Res.string.clusterTypeBaseOasisse
        ClusterType.DLC_TERRA -> Res.string.clusterTypeDlcTerra
        ClusterType.DLC_CERES -> Res.string.clusterTypeDlcCeres
        ClusterType.DLC_BLASTED_CERES -> Res.string.clusterTypeDlcBlastedCeres
        ClusterType.DLC_RELICA -> Res.string.clusterTypeDlcRelica
        ClusterType.DLC_RELICA_LAB -> Res.string.clusterTypeDlcRelicaLab
        ClusterType.DLC_OCEANIA -> Res.string.clusterTypeDlcOceania
        ClusterType.DLC_SQUELCHY -> Res.string.clusterTypeDlcSquelchy
        ClusterType.DLC_RIME -> Res.string.clusterTypeDlcRime
        ClusterType.DLC_VERDANTE -> Res.string.clusterTypeDlcVerdante
        ClusterType.DLC_ARBORIA -> Res.string.clusterTypeDlcArboria
        ClusterType.DLC_VOLCANEA -> Res.string.clusterTypeDlcVolcanea
        ClusterType.DLC_THE_BADLANDS -> Res.string.clusterTypeDlcTheBadlands
        ClusterType.DLC_ARIDIO -> Res.string.clusterTypeDlcAridio
        ClusterType.DLC_OASISSE -> Res.string.clusterTypeDlcOasisse
        ClusterType.DLC_TERRANIA -> Res.string.clusterTypeDlcTerrania
        ClusterType.DLC_CERES_MINOR -> Res.string.clusterTypeDlcCeresMinor
        ClusterType.DLC_RELICA_MINOR -> Res.string.clusterTypeDlcRelicaMinor
        ClusterType.DLC_FOLIA -> Res.string.clusterTypeDlcFolia
        ClusterType.DLC_QUAGMIRIS -> Res.string.clusterTypeDlcQuagmiris
        ClusterType.DLC_METALLIC_SWAMPY_MOONLET -> Res.string.clusterTypeDlcMetallicSwampyMoonlet
        ClusterType.DLC_THE_DESOLANDS_MOONLET -> Res.string.clusterTypeDlcTheDesolandsMoonlet
        ClusterType.DLC_FROZEN_FOREST_MOONLET -> Res.string.clusterTypeDlcFrozenForestMoonlet
        ClusterType.DLC_FLIPPED_MOONLET -> Res.string.clusterTypeDlcFlippedMoonlet
        ClusterType.DLC_RADIOACTIVE_OCEAN_MOONLET -> Res.string.clusterTypeDlcRadioactiveOceanMoonlet
        ClusterType.DLC_CERES_MANTLE -> Res.string.clusterTypeDlcCeresMantle
    }
