/*
 * ONI Seed Browser
 * Copyright (C) 2024 Stefan Oltmann
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

package service

val sampleWorldsJson: String = """
[
{
  "coordinate": "V-VOLCA-C-969803082-0-0-KH",
  "cluster": "V-VOLCA-C",
  "dlcs": [
    "FrostyPlanet",
    "SpacedOut"
  ],
  "asteroids": [
    {
      "id": "VanillaVolcanic",
      "offsetX": 0,
      "offsetY": 0,
      "sizeX": 240,
      "sizeY": 380,
      "worldTraits": [
        "GeoDormant",
        "BouldersSmall",
        "MagmaVents"
      ],
      "pointsOfInterest": [
        {
          "id": "Headquarters",
          "posX": 117,
          "posY": 177
        },
        {
          "id": "MassiveHeatSink",
          "posX": 37,
          "posY": 268
        },
        {
          "id": "MassiveHeatSink",
          "posX": 149,
          "posY": 95
        },
        {
          "id": "MassiveHeatSink",
          "posX": 225,
          "posY": 168
        },
        {
          "id": "WarpConduitSender",
          "posX": 176,
          "posY": 272
        },
        {
          "id": "WarpConduitReceiver",
          "posX": 221,
          "posY": 196
        },
        {
          "id": "GravitasPedestal",
          "posX": 43,
          "posY": 215
        },
        {
          "id": "WarpReceiver",
          "posX": 107,
          "posY": 94
        },
        {
          "id": "WarpPortal",
          "posX": 106,
          "posY": 88
        },
        {
          "id": "GeneShuffler",
          "posX": 20,
          "posY": 323
        },
        {
          "id": "GeneShuffler",
          "posX": 216,
          "posY": 117
        }
      ],
      "geysers": [
        {
          "emitRate": 5347.53955,
          "idleTime": 235.428864,
          "eruptionTime": 240.092743,
          "dormancyCycles": 63.56222,
          "activeCycles": 103.336281,
          "id": "steam",
          "posX": 153,
          "posY": 149
        },
        {
          "emitRate": 318.426147,
          "idleTime": 351.8757,
          "eruptionTime": 381.258453,
          "dormancyCycles": 44.2787933,
          "activeCycles": 45.397274,
          "id": "methane",
          "posX": 157,
          "posY": 110
        },
        {
          "emitRate": 4334.855,
          "idleTime": 293.347778,
          "eruptionTime": 370.696716,
          "dormancyCycles": 48.2961235,
          "activeCycles": 66.99809,
          "id": "steam",
          "posX": 140,
          "posY": 223
        },
        {
          "emitRate": 489.435852,
          "idleTime": 495.075226,
          "eruptionTime": 252.307953,
          "dormancyCycles": 43.7350464,
          "activeCycles": 58.6462631,
          "id": "methane",
          "posX": 81,
          "posY": 235
        },
        {
          "emitRate": 21234.3066,
          "idleTime": 364.044861,
          "eruptionTime": 123.744652,
          "dormancyCycles": 21.6685219,
          "activeCycles": 43.9301758,
          "id": "salt_water",
          "posX": 31,
          "posY": 228
        },
        {
          "emitRate": 3333.33,
          "idleTime": 0,
          "eruptionTime": 1,
          "dormancyCycles": 0,
          "activeCycles": 1,
          "id": "OilWell",
          "posX": 21,
          "posY": 339
        },
        {
          "emitRate": 3333.33,
          "idleTime": 0,
          "eruptionTime": 1,
          "dormancyCycles": 0,
          "activeCycles": 1,
          "id": "OilWell",
          "posX": 150,
          "posY": 308
        },
        {
          "emitRate": 3333.33,
          "idleTime": 0,
          "eruptionTime": 1,
          "dormancyCycles": 0,
          "activeCycles": 1,
          "id": "OilWell",
          "posX": 24,
          "posY": 301
        },
        {
          "emitRate": 444.494354,
          "idleTime": 131.834488,
          "eruptionTime": 162.04155,
          "dormancyCycles": 48.18796,
          "activeCycles": 98.92334,
          "id": "liquid_co2",
          "posX": 30,
          "posY": 289
        },
        {
          "emitRate": 246174.078,
          "idleTime": 9282.229,
          "eruptionTime": 73.57408,
          "dormancyCycles": 48.2961235,
          "activeCycles": 66.99809,
          "id": "big_volcano",
          "posX": 50,
          "posY": 133
        },
        {
          "emitRate": 6385.612,
          "idleTime": 317.398468,
          "eruptionTime": 275.307831,
          "dormancyCycles": 38.74082,
          "activeCycles": 53.992157,
          "id": "liquid_sulfur",
          "posX": 164,
          "posY": 309
        },
        {
          "emitRate": 9754.882,
          "idleTime": 803.819763,
          "eruptionTime": 47.77375,
          "dormancyCycles": 43.26069,
          "activeCycles": 78.5508041,
          "id": "molten_aluminum",
          "posX": 134,
          "posY": 329
        },
        {
          "emitRate": 131508.969,
          "idleTime": 9727.435,
          "eruptionTime": 71.59472,
          "dormancyCycles": 52.51614,
          "activeCycles": 99.9122238,
          "id": "small_volcano",
          "posX": 203,
          "posY": 265
        },
        {
          "emitRate": 409.352875,
          "idleTime": 312.953278,
          "eruptionTime": 242.17807,
          "dormancyCycles": 49.7872,
          "activeCycles": 75.16482,
          "id": "slimy_po2",
          "posX": 24,
          "posY": 275
        },
        {
          "emitRate": 504.7825,
          "idleTime": 435.8693,
          "eruptionTime": 408.888641,
          "dormancyCycles": 36.181778,
          "activeCycles": 64.080986,
          "id": "liquid_co2",
          "posX": 57,
          "posY": 272
        },
        {
          "emitRate": 10546.668,
          "idleTime": 360.753479,
          "eruptionTime": 260.209473,
          "dormancyCycles": 17.9377232,
          "activeCycles": 28.0942,
          "id": "hot_water",
          "posX": 127,
          "posY": 132
        },
        {
          "emitRate": 9639.198,
          "idleTime": 745.72644,
          "eruptionTime": 43.3461876,
          "dormancyCycles": 67.50141,
          "activeCycles": 130.155991,
          "id": "molten_iron",
          "posX": 60,
          "posY": 215
        }
      ],
      "biomePaths": "Sandstone:136,197 144,180 139,161 122,151 103,157 93,174 94,188 111,204;39,286 30,265 0,268 0,293 30,296;94,188 93,174 75,167 71,169 68,193 72,198;103,157 93,143 85,144 75,167 93,174;122,151 123,142 104,131 93,143 103,157;145,213 145,208 136,197 111,204 111,212 124,223;150,154 151,142 138,132 123,142 122,151 139,161;168,193 164,182 144,180 136,197 145,208;169,168 150,154 139,161 144,180 164,182\nMagmaCore:31,353 0,345 0,380 32,380;52,160 47,142 36,138 20,155 25,170 33,174;61,351 42,343 31,353 32,380 61,380;73,344 73,332 60,319 41,326 42,343 61,351;92,356 73,344 61,351 61,380 92,380;93,319 91,302 90,301 64,306 60,319 73,332;122,350 113,344 92,356 92,380 123,380;117,298 122,282 104,271 90,280 90,301 91,302;126,313 117,298 91,302 93,319 111,330;130,278 133,252 124,246 106,253 104,271 122,282;153,353 143,345 122,350 123,380 152,380;177,345 173,327 148,324 143,345 153,353;181,347 177,345 153,353 152,380 183,380;211,349 206,343 181,347 183,380 208,380;240,348 240,327 209,328 206,343 211,349;211,299 202,284 194,283 178,300 183,313 203,316;214,238 205,222 185,222 182,226 190,254 204,255;215,157 205,138 187,142 183,162 202,174;240,348 211,349 208,380 240,380\nOilField:33,320 30,296 0,293 0,330;42,343 41,326 33,320 0,330 0,345 31,353;60,319 64,306 52,287 39,286 30,296 33,320 41,326;113,344 111,330 93,319 73,332 73,344 92,356;143,345 148,324 143,316 126,313 111,330 113,344 122,350;183,313 178,300 155,292 143,316 148,324 173,327;206,343 209,328 203,316 183,313 173,327 177,345 181,347;240,327 240,299 211,299 203,316 209,328\nFrozenWastes:30,265 34,255 23,233 0,233 0,268;69,268 66,256 59,250 34,255 30,265 39,286 52,287;153,103 154,85 138,73 120,85 120,104 138,113;182,263 190,254 182,226 160,231 154,247 167,263;240,299 240,271 211,270 202,284 211,299;240,184 240,159 215,157 202,174 204,184 212,191\nWasteland:36,216 33,203 0,200 0,233 23,233;68,193 71,169 52,160 33,174 38,193;54,106 62,76 61,74 34,72 24,90 36,108;111,212 111,204 94,188 72,198 72,214 90,226;93,143 104,131 103,114 88,106 67,118 67,128 85,144;216,205 212,191 204,184 180,199 185,222 205,222\nSugarWoods:38,193 33,174 25,170 0,179 0,200 33,203;29,122 36,108 24,90 0,90 0,122;104,271 106,253 91,242 66,256 69,268 90,280;88,106 87,85 62,76 54,106 67,118;120,104 120,85 101,74 87,85 88,106 103,114;167,263 154,247 133,252 130,278 153,287;240,126 212,126 205,138 215,157 240,159\nRadioactive:25,170 20,155 0,151 0,179;211,270 204,255 190,254 182,263 194,283 202,284;240,184 212,191 216,205 240,208\nBoggyMarsh:36,138 29,122 0,122 0,151 20,155;72,214 72,198 68,193 38,193 33,203 36,216 58,224;91,242 90,226 72,214 58,224 59,250 66,256;138,132 138,113 120,104 103,114 104,131 123,142;154,247 160,231 145,213 124,223 124,246 133,252;186,106 182,77 178,74 154,85 153,103 174,115;205,138 212,126 205,111 186,106 174,115 173,129 187,142\nBarren:24,90 34,72 27,58 0,56 0,90;65,59 45,36 39,36 27,58 34,72 61,74;101,74 100,61 85,49 65,59 61,74 62,76 87,85;138,73 138,60 120,47 100,61 101,74 120,85;178,74 175,59 156,48 138,60 138,73 154,85;207,73 213,60 200,37 197,37 175,59 178,74 182,77;240,57 213,60 207,73 219,92 240,93\nOcean:59,250 58,224 36,216 23,233 34,255;67,128 67,118 54,106 36,108 29,122 36,138 47,142;90,301 90,280 69,268 52,287 64,306;155,292 153,287 130,278 122,282 117,298 126,313 143,316;194,283 182,263 167,263 153,287 155,292 178,300;219,92 207,73 182,77 186,106 205,111;240,208 216,205 205,222 214,238 240,239\nToxicJungle:75,167 85,144 67,128 47,142 52,160 71,169;124,246 124,223 111,212 90,226 91,242 106,253;173,129 174,115 153,103 138,113 138,132 151,142;182,226 185,222 180,199 168,193 145,208 145,213 160,231;183,162 187,142 173,129 151,142 150,154 169,168;204,184 202,174 183,162 169,168 164,182 168,193 180,199;240,239 214,238 204,255 211,270 240,271;240,93 219,92 205,111 212,126 240,126"
    },
    {
      "id": "MediumRadioactiveVanillaWarpPlanet",
      "offsetX": 242,
      "offsetY": 0,
      "sizeX": 160,
      "sizeY": 176,
      "worldTraits": [
        "DistressSignal",
        "RadioactiveCrust"
      ],
      "pointsOfInterest": [
        {
          "id": "MassiveHeatSink",
          "posX": 29,
          "posY": 63
        },
        {
          "id": "WarpConduitSender",
          "posX": 89,
          "posY": 87
        },
        {
          "id": "WarpConduitReceiver",
          "posX": 129,
          "posY": 127
        },
        {
          "id": "WarpReceiver",
          "posX": 100,
          "posY": 104
        },
        {
          "id": "WarpPortal",
          "posX": 78,
          "posY": 104
        },
        {
          "id": "GeneShuffler",
          "posX": 25,
          "posY": 102
        }
      ],
      "geysers": [
        {
          "emitRate": 433.485474,
          "idleTime": 293.347778,
          "eruptionTime": 370.696716,
          "dormancyCycles": 48.2961235,
          "activeCycles": 66.99809,
          "id": "liquid_co2",
          "posX": 38,
          "posY": 159
        },
        {
          "emitRate": 856.209351,
          "idleTime": 393.322571,
          "eruptionTime": 223.3366,
          "dormancyCycles": 58.4921761,
          "activeCycles": 75.6720047,
          "id": "liquid_co2",
          "posX": 129,
          "posY": 155
        },
        {
          "emitRate": 4831.2,
          "idleTime": 337.10907,
          "eruptionTime": 361.274048,
          "dormancyCycles": 41.37198,
          "activeCycles": 64.50672,
          "id": "slush_water",
          "posX": 68,
          "posY": 49
        },
        {
          "emitRate": 5210.931,
          "idleTime": 530.567749,
          "eruptionTime": 461.075256,
          "dormancyCycles": 60.0287971,
          "activeCycles": 116.588982,
          "id": "slush_salt_water",
          "posX": 80,
          "posY": 67
        },
        {
          "emitRate": 8943.322,
          "idleTime": 256.071564,
          "eruptionTime": 347.7701,
          "dormancyCycles": 54.5329857,
          "activeCycles": 71.81818,
          "id": "filthy_water",
          "posX": 133,
          "posY": 108
        },
        {
          "emitRate": 10525.6455,
          "idleTime": 618.709167,
          "eruptionTime": 26.4582653,
          "dormancyCycles": 35.4956627,
          "activeCycles": 65.27314,
          "id": "molten_aluminum",
          "posX": 42,
          "posY": 131
        },
        {
          "emitRate": 16841.459,
          "idleTime": 818.052734,
          "eruptionTime": 30.1052361,
          "dormancyCycles": 47.649826,
          "activeCycles": 93.46211,
          "id": "molten_gold",
          "posX": 77,
          "posY": 126
        },
        {
          "emitRate": 6657.911,
          "idleTime": 239.762985,
          "eruptionTime": 444.774536,
          "dormancyCycles": 61.050396,
          "activeCycles": 63.1891975,
          "id": "hot_water",
          "posX": 113,
          "posY": 135
        },
        {
          "emitRate": 371.856232,
          "idleTime": 223.215088,
          "eruptionTime": 258.8045,
          "dormancyCycles": 32.3004951,
          "activeCycles": 78.5532455,
          "id": "methane",
          "posX": 52,
          "posY": 103
        },
        {
          "emitRate": 266.7432,
          "idleTime": 239.663132,
          "eruptionTime": 316.160217,
          "dormancyCycles": 62.6870842,
          "activeCycles": 84.17337,
          "id": "hot_po2",
          "posX": 132,
          "posY": 87
        }
      ],
      "biomePaths": "Swamp:99,109 103,95 96,88 79,93 77,103 85,111;115,93 121,80 115,71 101,69 96,73 96,88 103,95;96,88 96,73 78,70 72,84 79,93;125,104 115,93 103,95 99,109 106,118 117,119;106,118 99,109 85,111 82,127 96,134;82,127 85,111 77,103 63,108 61,117 76,129;77,103 79,93 72,84 60,84 53,97 63,108\nBoggyMarsh:123,56 116,46 105,45 98,52 101,69 115,71;160,45 143,45 136,56 142,69 160,69;142,69 136,56 123,56 115,71 121,80 136,80;61,60 55,47 44,46 36,54 43,72 52,72;21,49 22,33 0,30 0,49;22,99 16,88 0,88 0,108 18,109\nForest:136,103 142,92 136,80 121,80 115,93 125,104;72,84 78,70 75,62 61,60 52,72 60,84;123,127 117,119 106,118 96,134 97,137 115,141;160,115 144,115 136,129 141,136 160,137;76,129 61,117 51,123 54,139 71,140;39,96 37,77 22,76 16,88 22,99;61,117 63,108 53,97 42,99 40,120 51,123\nFrozenWastes:101,69 98,52 82,50 75,62 78,70 96,73;82,50 78,41 63,38 55,47 61,60 75,62;43,72 36,54 24,53 18,68 22,76 37,77;94,158 91,152 76,151 71,158 75,176 91,176;160,157 138,157 136,176 160,176;71,158 55,158 50,176 75,176;19,157 16,153 0,153 0,176 16,176;34,158 19,157 16,176 40,176;24,53 21,49 0,49 0,67 18,68\nRust:144,115 136,103 125,104 117,119 123,127 136,129;53,97 60,84 52,72 43,72 37,77 39,96 42,99;16,88 22,76 18,68 0,67 0,88;160,92 160,69 142,69 136,80 142,92;40,120 42,99 39,96 22,99 18,109 21,115 38,120;32,137 38,120 21,115 13,130 21,139;13,130 21,115 18,109 0,108 0,130;160,115 160,92 142,92 136,103 144,115\nRadioactive:141,136 136,129 123,127 115,141 119,151 135,153;119,151 115,141 97,137 91,152 94,158 114,159;97,137 96,134 82,127 76,129 71,140 76,151 91,152;138,157 135,153 119,151 114,159 116,176 136,176;71,158 76,151 71,140 54,139 47,148 55,158;47,148 54,139 51,123 40,120 38,120 32,137 43,148;21,139 13,130 0,130 0,153 16,153;43,148 32,137 21,139 16,153 19,157 34,158;160,137 141,136 135,153 138,157 160,157;114,159 94,158 91,176 116,176;55,158 47,148 43,148 34,158 40,176 50,176"
    },
    {
      "id": "TundraMoonlet",
      "offsetX": 324,
      "offsetY": 178,
      "sizeX": 64,
      "sizeY": 128,
      "worldTraits": [
        "MetalPoor",
        "LushCore"
      ],
      "pointsOfInterest": [
        {
          "id": "TemporalTearOpener",
          "posX": 39,
          "posY": 36
        },
        {
          "id": "GravitasPedestal",
          "posX": 35,
          "posY": 81
        }
      ],
      "geysers": [
        {
          "emitRate": 13546.18,
          "idleTime": 713.207153,
          "eruptionTime": 26.4930954,
          "dormancyCycles": 54.08202,
          "activeCycles": 74.9438248,
          "id": "molten_iron",
          "posX": 43,
          "posY": 108
        },
        {
          "emitRate": 7140.195,
          "idleTime": 648.0247,
          "eruptionTime": 51.2424126,
          "dormancyCycles": 59.63158,
          "activeCycles": 62.561245,
          "id": "molten_iron",
          "posX": 27,
          "posY": 55
        },
        {
          "emitRate": 10635.8721,
          "idleTime": 489.334137,
          "eruptionTime": 25.5181656,
          "dormancyCycles": 71.8701248,
          "activeCycles": 112.955,
          "id": "molten_iron",
          "posX": 43,
          "posY": 92
        },
        {
          "emitRate": 6327.37451,
          "idleTime": 821.805847,
          "eruptionTime": 74.40888,
          "dormancyCycles": 47.1774635,
          "activeCycles": 68.78245,
          "id": "molten_iron",
          "posX": 42,
          "posY": 47
        }
      ],
      "biomePaths": "FrozenWastes:40,43 33,32 32,32 19,42 21,49 34,52;37,60 34,52 21,49 16,57 19,66 31,68;47,43 54,33 45,23 33,32 40,43;55,52 47,43 40,43 34,52 37,60 47,62;51,72 47,62 37,60 31,68 34,78 45,80;21,49 19,42 16,39 0,44 0,55 16,57;19,66 16,57 0,55 0,73 14,73;25,106 32,96 28,86 18,85 12,92 19,107;12,92 18,85 14,73 0,73 0,92;34,78 31,68 19,66 14,73 18,85 28,86;64,53 55,52 47,62 51,72 64,73;64,32 54,33 47,43 55,52 64,53;64,73 51,72 45,80 49,90 64,91;49,90 45,80 34,78 28,86 32,96 44,97;64,108 64,91 49,90 44,97 48,109;47,111 48,109 44,97 32,96 25,106 33,114;15,111 19,107 12,92 0,92 0,111;16,39 13,28 0,25 0,44\nForest:33,114 25,106 19,107 15,111 17,128 31,128;15,111 0,111 0,128 17,128;47,111 33,114 31,128 50,128;64,108 48,109 47,111 50,128 64,128"
    },
    {
      "id": "MarshyMoonlet",
      "offsetX": 324,
      "offsetY": 308,
      "sizeX": 64,
      "sizeY": 96,
      "worldTraits": [],
      "pointsOfInterest": [
        {
          "id": "GravitasPedestal",
          "posX": 42,
          "posY": 43
        },
        {
          "id": "GravitasPedestal",
          "posX": 28,
          "posY": 43
        },
        {
          "id": "SapTree",
          "posX": 35,
          "posY": 43
        }
      ],
      "geysers": [
        {
          "emitRate": 8162.945,
          "idleTime": 674.603638,
          "eruptionTime": 52.04938,
          "dormancyCycles": 54.1490479,
          "activeCycles": 85.79172,
          "id": "molten_tungsten",
          "posX": 54,
          "posY": 57
        },
        {
          "emitRate": 10865.2266,
          "idleTime": 663.1209,
          "eruptionTime": 34.14714,
          "dormancyCycles": 33.89808,
          "activeCycles": 53.8302269,
          "id": "molten_tungsten",
          "posX": 55,
          "posY": 89
        },
        {
          "emitRate": 292.9988,
          "idleTime": 231.3451,
          "eruptionTime": 322.7334,
          "dormancyCycles": 36.17814,
          "activeCycles": 46.4775047,
          "id": "hot_po2",
          "posX": 47,
          "posY": 53
        },
        {
          "emitRate": 226.644745,
          "idleTime": 208.786011,
          "eruptionTime": 397.6748,
          "dormancyCycles": 39.17247,
          "activeCycles": 60.00276,
          "id": "hot_po2",
          "posX": 8,
          "posY": 51
        }
      ],
      "biomePaths": "BoggyMarsh:46,46 47,44 42,31 23,37 23,38 34,51;64,41 64,28 43,28 42,31 47,44;23,38 23,37 20,32 0,32 0,47 13,49;40,67 32,56 19,62 18,64 32,78;32,78 32,78 18,64 15,66 13,81 22,87;64,60 52,60 47,66 53,78 64,80;13,81 15,66 0,65 0,84\nToxicJungle:64,60 64,41 47,44 46,46 52,60;32,56 34,51 23,38 13,49 19,62;18,64 19,62 13,49 0,47 0,65 15,66;53,78 47,66 40,67 32,78 32,78 44,87;47,66 52,60 46,46 34,51 32,56 40,67\nMagmaCore:44,87 32,78 22,87 22,96 44,96;64,80 53,78 44,87 44,96 64,96;22,87 13,81 0,84 0,96 22,96"
    },
    {
      "id": "NiobiumMoonlet",
      "offsetX": 390,
      "offsetY": 308,
      "sizeX": 64,
      "sizeY": 96,
      "worldTraits": [
        "MetalRich"
      ],
      "pointsOfInterest": [
        {
          "id": "GravitasPedestal",
          "posX": 21,
          "posY": 65
        }
      ],
      "geysers": [
        {
          "emitRate": 279090.219,
          "idleTime": 9405.201,
          "eruptionTime": 68.9376144,
          "dormancyCycles": 49.7850952,
          "activeCycles": 96.02909,
          "id": "molten_niobium",
          "posX": 6,
          "posY": 70
        }
      ],
      "biomePaths": "MagmaCore:49,49 45,37 34,37 28,43 34,57 44,57;64,66 49,66 43,79 44,81 64,82;34,57 28,43 19,44 13,56 18,63 29,63;64,32 48,32 45,37 49,49 64,49;64,49 49,49 44,57 49,66 64,66;49,66 44,57 34,57 29,63 34,77 43,79;64,82 44,81 43,96 64,96;19,44 13,37 0,37 0,56 13,56;21,86 12,77 0,78 0,96 21,96\nOilField:34,77 29,63 18,63 12,77 21,86;12,77 18,63 13,56 0,56 0,78;44,81 43,79 34,77 21,86 21,96 43,96"
    },
    {
      "id": "MixingCeresAsteroid",
      "offsetX": 390,
      "offsetY": 178,
      "sizeX": 64,
      "sizeY": 128,
      "worldTraits": [],
      "pointsOfInterest": [
        {
          "id": "GravitasPedestal",
          "posX": 17,
          "posY": 105
        },
        {
          "id": "GravitasPedestal",
          "posX": 10,
          "posY": 105
        }
      ],
      "geysers": [
        {
          "emitRate": 424.083466,
          "idleTime": 433.551239,
          "eruptionTime": 293.220978,
          "dormancyCycles": 54.131588,
          "activeCycles": 62.664608,
          "id": "chlorine_gas",
          "posX": 33,
          "posY": 118
        },
        {
          "emitRate": 265.967651,
          "idleTime": 213.314392,
          "eruptionTime": 441.97052,
          "dormancyCycles": 64.67676,
          "activeCycles": 97.44715,
          "id": "chlorine_gas",
          "posX": 21,
          "posY": 52
        },
        {
          "emitRate": 3252.4978,
          "idleTime": 214.661728,
          "eruptionTime": 499.191833,
          "dormancyCycles": 54.08244,
          "activeCycles": 80.15766,
          "id": "slush_water",
          "posX": 54,
          "posY": 105
        },
        {
          "emitRate": 291.683441,
          "idleTime": 260.909882,
          "eruptionTime": 389.738556,
          "dormancyCycles": 57.17428,
          "activeCycles": 70.03248,
          "id": "hot_hydrogen",
          "posX": 53,
          "posY": 67
        },
        {
          "emitRate": 4041.94067,
          "idleTime": 296.298248,
          "eruptionTime": 376.030182,
          "dormancyCycles": 28.18082,
          "activeCycles": 38.68571,
          "id": "slush_water",
          "posX": 43,
          "posY": 50
        }
      ],
      "biomePaths": "Moo:64,51 64,34 49,34 47,36 46,44 53,52;46,44 47,36 31,32 29,34 28,47 33,51;28,47 29,34 17,31 10,39 17,50;14,56 17,50 10,39 0,39 0,58\nCarrotQuarry:53,52 46,44 33,51 34,59 47,64;64,95 52,97 50,112 50,112 64,112;31,111 28,99 13,100 12,103 23,115;12,103 13,100 6,84 0,83 0,105;50,112 50,112 36,114 36,128 50,128;36,114 31,111 23,115 20,128 36,128;64,112 50,112 50,128 64,128\nSugarWoods:64,51 53,52 47,64 50,69 64,71;34,59 33,51 28,47 17,50 14,56 23,66\nIceCaves:39,87 50,69 47,64 34,59 23,66 23,74 36,87;64,95 64,71 50,69 39,87 52,97;28,99 36,87 23,74 6,84 13,100;23,74 23,66 14,56 0,58 0,83 6,84;50,112 52,97 39,87 36,87 28,99 31,111 36,114;23,115 12,103 0,105 0,128 20,128"
    },
    {
      "id": "WaterMoonlet",
      "offsetX": 242,
      "offsetY": 178,
      "sizeX": 80,
      "sizeY": 174,
      "worldTraits": [],
      "pointsOfInterest": [
        {
          "id": "GravitasPedestal",
          "posX": 34,
          "posY": 154
        },
        {
          "id": "GravitasPedestal",
          "posX": 36,
          "posY": 154
        }
      ],
      "geysers": [
        {
          "emitRate": 13770.3887,
          "idleTime": 311.569183,
          "eruptionTime": 191.9783,
          "dormancyCycles": 36.3499527,
          "activeCycles": 45.134655,
          "id": "filthy_water",
          "posX": 20,
          "posY": 56
        },
        {
          "emitRate": 12176.8838,
          "idleTime": 286.678,
          "eruptionTime": 321.7518,
          "dormancyCycles": 74.9538,
          "activeCycles": 52.4915581,
          "id": "salt_water",
          "posX": 65,
          "posY": 66
        }
      ],
      "biomePaths": "Barren:59,84 61,79 57,64 53,63 38,69 43,86;64,59 66,43 60,38 47,47 53,63 57,64;59,106 64,97 59,84 43,86 42,88 46,106;80,78 80,63 64,59 57,64 61,79;36,69 31,53 20,52 14,65 21,74;53,63 47,47 39,45 31,53 36,69 38,69;43,109 46,106 42,88 26,91 22,102 30,109;80,97 80,78 61,79 59,84 64,97;42,88 43,86 38,69 36,69 21,74 19,82 26,91;39,45 36,35 28,31 19,36 16,45 20,52 31,53;60,38 60,36 48,25 36,35 39,45 47,47;80,42 66,43 64,59 80,63;20,52 16,45 0,46 0,65 14,65;45,124 43,109 30,109 25,127 30,130;22,102 26,91 19,82 0,88 0,95 18,104;25,127 30,109 22,102 18,104 10,118 21,128;58,128 65,117 59,106 46,106 43,109 45,124 52,129;19,82 21,74 14,65 0,65 0,88;14,139 21,128 10,118 0,119 0,139;52,129 45,124 30,130 35,143 46,144;80,137 80,117 65,117 58,128 67,137;80,117 80,97 64,97 59,106 65,117;40,165 28,152 22,153 18,157 19,174 40,174;61,156 59,154 53,152 40,165 40,174 61,174;10,118 18,104 0,95 0,119;80,157 61,156 61,174 80,174;18,157 0,157 0,174 19,174\nSwamp:28,152 35,143 30,130 25,127 21,128 14,139 22,153;67,137 58,128 52,129 46,144 53,152 59,154;53,152 46,144 35,143 28,152 40,165;80,137 67,137 59,154 61,156 80,157;18,157 22,153 14,139 0,139 0,157"
    },
    {
      "id": "MiniRegolithMoonlet",
      "offsetX": 404,
      "offsetY": 0,
      "sizeX": 96,
      "sizeY": 96,
      "worldTraits": [],
      "pointsOfInterest": [
        {
          "id": "GravitasPedestal",
          "posX": 58,
          "posY": 74
        },
        {
          "id": "GravitasPedestal",
          "posX": 62,
          "posY": 74
        },
        {
          "id": "GeneShuffler",
          "posX": 60,
          "posY": 68
        }
      ],
      "geysers": [
        {
          "emitRate": 5536.00049,
          "idleTime": 362.721069,
          "eruptionTime": 296.909546,
          "dormancyCycles": 54.73106,
          "activeCycles": 79.1778,
          "id": "steam",
          "posX": 67,
          "posY": 86
        },
        {
          "emitRate": 2942.694,
          "idleTime": 411.398315,
          "eruptionTime": 349.242676,
          "dormancyCycles": 34.6785126,
          "activeCycles": 70.11193,
          "id": "hot_steam",
          "posX": 35,
          "posY": 84
        }
      ],
      "biomePaths": "Sandstone:72,56 72,54 61,39 49,50 53,61;59,77 52,62 38,67 38,77 44,82;52,62 53,61 49,50 39,45 33,51 33,63 38,67\nBarren:96,61 96,51 81,47 72,54 72,56 74,62 82,66;64,77 74,62 72,56 53,61 52,62 59,77 60,78;96,61 82,66 83,80 96,82;83,80 82,66 74,62 64,77 77,84;33,63 33,51 20,46 13,58 19,66;17,76 19,66 13,58 0,58 0,76 14,77;38,77 38,67 33,63 19,66 17,76 28,82\nFrozenWastes:96,82 83,80 77,84 76,96 96,96;77,84 64,77 60,78 60,96 76,96;60,78 59,77 44,82 44,96 60,96;28,82 17,76 14,77 12,96 28,96;14,77 0,76 0,96 12,96;44,82 38,77 28,82 28,96 44,96"
    }
  ],
  "starMapEntriesVanilla": null,
  "starMapEntriesSpacedOut": [
    {
      "id": "VanillaVolcanic",
      "q": 0,
      "r": 0
    },
    {
      "id": "MediumRadioactiveVanillaWarpPlanet",
      "q": 2,
      "r": 1
    },
    {
      "id": "TundraMoonlet",
      "q": -5,
      "r": 4
    },
    {
      "id": "MarshyMoonlet",
      "q": -1,
      "r": 6
    },
    {
      "id": "NiobiumMoonlet",
      "q": 4,
      "r": -5
    },
    {
      "id": "MixingCeresAsteroid",
      "q": -1,
      "r": -6
    },
    {
      "id": "WaterMoonlet",
      "q": -6,
      "r": 0
    },
    {
      "id": "MiniRegolithMoonlet",
      "q": 6,
      "r": 2
    },
    {
      "id": "TemporalTear",
      "q": 3,
      "r": 6
    },
    {
      "id": "HarvestableSpacePOI_SandyOreField",
      "q": -2,
      "r": 3
    },
    {
      "id": "HarvestableSpacePOI_OrganicMassField",
      "q": 5,
      "r": 0
    },
    {
      "id": "HarvestableSpacePOI_OilyAsteroidField",
      "q": 1,
      "r": 10
    },
    {
      "id": "HarvestableSpacePOI_FrozenOreField",
      "q": 1,
      "r": 9
    },
    {
      "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
      "q": 0,
      "r": 11
    },
    {
      "id": "HarvestableSpacePOI_GildedAsteroidField",
      "q": -4,
      "r": -6
    },
    {
      "id": "HarvestableSpacePOI_HeliumCloud",
      "q": -5,
      "r": -6
    },
    {
      "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
      "q": 3,
      "r": -11
    },
    {
      "id": "HarvestableSpacePOI_RadioactiveGasCloud",
      "q": -10,
      "r": 9
    },
    {
      "id": "HarvestableSpacePOI_ForestyOreField",
      "q": -5,
      "r": 7
    },
    {
      "id": "HarvestableSpacePOI_OrganicMassField",
      "q": 7,
      "r": -7
    },
    {
      "id": "HarvestableSpacePOI_RockyAsteroidField",
      "q": 1,
      "r": -5
    },
    {
      "id": "HarvestableSpacePOI_ForestyOreField",
      "q": -3,
      "r": -3
    },
    {
      "id": "HarvestableSpacePOI_SwampyOreField",
      "q": -2,
      "r": -3
    },
    {
      "id": "HarvestableSpacePOI_GasGiantCloud",
      "q": -8,
      "r": -2
    },
    {
      "id": "HarvestableSpacePOI_OilyAsteroidField",
      "q": 10,
      "r": 1
    },
    {
      "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
      "q": 9,
      "r": -3
    },
    {
      "id": "HarvestableSpacePOI_OxidizedAsteroidField",
      "q": 8,
      "r": -2
    },
    {
      "id": "HarvestableSpacePOI_GasGiantCloud",
      "q": 5,
      "r": -9
    },
    {
      "id": "HarvestableSpacePOI_RadioactiveGasCloud",
      "q": 6,
      "r": -10
    },
    {
      "id": "HarvestableSpacePOI_IceAsteroidField",
      "q": 7,
      "r": -11
    },
    {
      "id": "HarvestableSpacePOI_SaltyAsteroidField",
      "q": 7,
      "r": -10
    },
    {
      "id": "HarvestableSpacePOI_GildedAsteroidField",
      "q": -11,
      "r": 4
    },
    {
      "id": "HarvestableSpacePOI_SatelliteField",
      "q": -10,
      "r": 3
    },
    {
      "id": "ArtifactSpacePOI_GravitasSpaceStation4",
      "q": 3,
      "r": -2
    },
    {
      "id": "ArtifactSpacePOI_RussellsTeapot",
      "q": 11,
      "r": -8
    },
    {
      "id": "ArtifactSpacePOI_GravitasSpaceStation3",
      "q": -4,
      "r": 10
    },
    {
      "id": "ArtifactSpacePOI_GravitasSpaceStation5",
      "q": -8,
      "r": 11
    },
    {
      "id": "ArtifactSpacePOI_GravitasSpaceStation8",
      "q": -8,
      "r": 5
    },
    {
      "id": "ArtifactSpacePOI_GravitasSpaceStation7",
      "q": -4,
      "r": 1
    },
    {
      "id": "HarvestableSpacePOI_DLC2CeresField",
      "q": -1,
      "r": -10
    }
  ]
},
{
    "coordinate": "V-VOLCA-C-478948923-0-0-OL",
    "cluster": "V-VOLCA-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaVolcanic",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "MisalignedStart",
          "Volcanoes"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 141,
            "posY": 246
          },
          {
            "id": "MassiveHeatSink",
            "posX": 181,
            "posY": 186
          },
          {
            "id": "MassiveHeatSink",
            "posX": 205,
            "posY": 148
          },
          {
            "id": "MassiveHeatSink",
            "posX": 220,
            "posY": 282
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 79,
            "posY": 291
          },
          {
            "id": "WarpConduitSender",
            "posX": 53,
            "posY": 151
          },
          {
            "id": "GravitasPedestal",
            "posX": 62,
            "posY": 197
          },
          {
            "id": "WarpReceiver",
            "posX": 32,
            "posY": 225
          },
          {
            "id": "WarpPortal",
            "posX": 31,
            "posY": 231
          },
          {
            "id": "GeneShuffler",
            "posX": 88,
            "posY": 54
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 172,
            "posY": 51,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 140,
            "posY": 44,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 72,
            "posY": 63,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 36,
            "posY": 179,
            "emitRate": 11972.496,
            "idleTime": 451.3581,
            "eruptionTime": 296.21167,
            "dormancyCycles": 59.70707,
            "activeCycles": 76.90957
          },
          {
            "id": "steam",
            "posX": 78,
            "posY": 180,
            "emitRate": 6315.9556,
            "idleTime": 339.11594,
            "eruptionTime": 245.1422,
            "dormancyCycles": 57.914185,
            "activeCycles": 95.31128
          },
          {
            "id": "steam",
            "posX": 104,
            "posY": 238,
            "emitRate": 3754.9768,
            "idleTime": 128.09207,
            "eruptionTime": 279.33005,
            "dormancyCycles": 56.557453,
            "activeCycles": 88.98306
          },
          {
            "id": "chlorine_gas",
            "posX": 53,
            "posY": 229,
            "emitRate": 969.8322,
            "idleTime": 496.67593,
            "eruptionTime": 102.68423,
            "dormancyCycles": 72.55568,
            "activeCycles": 108.5891
          },
          {
            "id": "methane",
            "posX": 71,
            "posY": 257,
            "emitRate": 430.4301,
            "idleTime": 638.8232,
            "eruptionTime": 407.36993,
            "dormancyCycles": 63.649357,
            "activeCycles": 83.03211
          },
          {
            "id": "big_volcano",
            "posX": 130,
            "posY": 77,
            "emitRate": 230930.88,
            "idleTime": 8915.125,
            "eruptionTime": 68.58955,
            "dormancyCycles": 67.692955,
            "activeCycles": 109.64853
          },
          {
            "id": "big_volcano",
            "posX": 198,
            "posY": 264,
            "emitRate": 235782.8,
            "idleTime": 8540.346,
            "eruptionTime": 70.04161,
            "dormancyCycles": 42.43959,
            "activeCycles": 75.056755
          },
          {
            "id": "big_volcano",
            "posX": 142,
            "posY": 198,
            "emitRate": 269081.25,
            "idleTime": 8964.398,
            "eruptionTime": 68.43771,
            "dormancyCycles": 42.955822,
            "activeCycles": 71.68794
          },
          {
            "id": "big_volcano",
            "posX": 117,
            "posY": 64,
            "emitRate": 273603.16,
            "idleTime": 9839.595,
            "eruptionTime": 72.795204,
            "dormancyCycles": 39.163097,
            "activeCycles": 79.89018
          },
          {
            "id": "big_volcano",
            "posX": 219,
            "posY": 111,
            "emitRate": 255158.97,
            "idleTime": 9095.693,
            "eruptionTime": 69.596695,
            "dormancyCycles": 46.890926,
            "activeCycles": 56.594467
          },
          {
            "id": "slush_salt_water",
            "posX": 36,
            "posY": 133,
            "emitRate": 9577.438,
            "idleTime": 408.55823,
            "eruptionTime": 132.82288,
            "dormancyCycles": 61.92086,
            "activeCycles": 91.76137
          },
          {
            "id": "liquid_sulfur",
            "posX": 196,
            "posY": 72,
            "emitRate": 7171.279,
            "idleTime": 327.23712,
            "eruptionTime": 232.84337,
            "dormancyCycles": 85.110374,
            "activeCycles": 103.484505
          },
          {
            "id": "molten_iron",
            "posX": 38,
            "posY": 153,
            "emitRate": 9553.44,
            "idleTime": 800.95496,
            "eruptionTime": 47.011414,
            "dormancyCycles": 52.749416,
            "activeCycles": 75.292206
          },
          {
            "id": "hot_co2",
            "posX": 201,
            "posY": 177,
            "emitRate": 479.12268,
            "idleTime": 423.4552,
            "eruptionTime": 238.48763,
            "dormancyCycles": 42.257393,
            "activeCycles": 80.053604
          },
          {
            "id": "steam",
            "posX": 130,
            "posY": 117,
            "emitRate": 3363.2412,
            "idleTime": 240.35814,
            "eruptionTime": 250.84535,
            "dormancyCycles": 46.57171,
            "activeCycles": 78.33066
          },
          {
            "id": "liquid_sulfur",
            "posX": 192,
            "posY": 99,
            "emitRate": 6972.639,
            "idleTime": 243.76321,
            "eruptionTime": 193.43253,
            "dormancyCycles": 62.54808,
            "activeCycles": 96.974655
          },
          {
            "id": "molten_gold",
            "posX": 54,
            "posY": 252,
            "emitRate": 8088.485,
            "idleTime": 735.16516,
            "eruptionTime": 52.864384,
            "dormancyCycles": 36.89608,
            "activeCycles": 50.27891
          },
          {
            "id": "molten_copper",
            "posX": 151,
            "posY": 61,
            "emitRate": 12772.282,
            "idleTime": 896.23395,
            "eruptionTime": 38.461964,
            "dormancyCycles": 22.220009,
            "activeCycles": 45.049904
          },
          {
            "id": "liquid_co2",
            "posX": 15,
            "posY": 116,
            "emitRate": 500.0621,
            "idleTime": 241.09897,
            "eruptionTime": 230.44748,
            "dormancyCycles": 60.423462,
            "activeCycles": 81.83358
          },
          {
            "id": "slush_water",
            "posX": 125,
            "posY": 151,
            "emitRate": 3793.9124,
            "idleTime": 279.53754,
            "eruptionTime": 412.9818,
            "dormancyCycles": 49.275135,
            "activeCycles": 88.8613
          },
          {
            "id": "hot_water",
            "posX": 50,
            "posY": 113,
            "emitRate": 7374.4316,
            "idleTime": 250.0653,
            "eruptionTime": 379.35236,
            "dormancyCycles": 46.683758,
            "activeCycles": 82.94438
          }
        ]
      },
      {
        "id": "MediumRadioactiveVanillaWarpPlanet",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "Volcanoes",
          "CrashedSatellites"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 279,
            "posY": 120
          },
          {
            "id": "WarpConduitSender",
            "posX": 355,
            "posY": 49
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 289,
            "posY": 64
          },
          {
            "id": "WarpReceiver",
            "posX": 339,
            "posY": 80
          },
          {
            "id": "WarpPortal",
            "posX": 317,
            "posY": 80
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 257,
            "posY": 108
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 261,
            "posY": 92
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 384,
            "posY": 111
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 322,
            "posY": 21,
            "emitRate": 420.23157,
            "idleTime": 259.29202,
            "eruptionTime": 303.18747,
            "dormancyCycles": 99.71055,
            "activeCycles": 96.97903
          },
          {
            "id": "liquid_co2",
            "posX": 383,
            "posY": 19,
            "emitRate": 474.49234,
            "idleTime": 248.87947,
            "eruptionTime": 430.5791,
            "dormancyCycles": 49.05356,
            "activeCycles": 81.44759
          },
          {
            "id": "slush_salt_water",
            "posX": 309,
            "posY": 119,
            "emitRate": 8027.996,
            "idleTime": 369.28934,
            "eruptionTime": 170.26578,
            "dormancyCycles": 38.62808,
            "activeCycles": 55.20214
          },
          {
            "id": "slush_water",
            "posX": 347,
            "posY": 118,
            "emitRate": 4219.8394,
            "idleTime": 160.42033,
            "eruptionTime": 312.16574,
            "dormancyCycles": 31.656126,
            "activeCycles": 36.201916
          },
          {
            "id": "steam",
            "posX": 328,
            "posY": 100,
            "emitRate": 8027.996,
            "idleTime": 369.28934,
            "eruptionTime": 170.26578,
            "dormancyCycles": 38.62808,
            "activeCycles": 55.20214
          },
          {
            "id": "salt_water",
            "posX": 382,
            "posY": 30,
            "emitRate": 7361.8926,
            "idleTime": 243.06311,
            "eruptionTime": 409.474,
            "dormancyCycles": 62.91575,
            "activeCycles": 77.45839
          },
          {
            "id": "molten_aluminum",
            "posX": 275,
            "posY": 33,
            "emitRate": 11549.973,
            "idleTime": 651.7622,
            "eruptionTime": 32.720505,
            "dormancyCycles": 55.438244,
            "activeCycles": 70.79268
          },
          {
            "id": "molten_aluminum",
            "posX": 387,
            "posY": 39,
            "emitRate": 7977.904,
            "idleTime": 782.24097,
            "eruptionTime": 52.491467,
            "dormancyCycles": 55.586967,
            "activeCycles": 83.83736
          },
          {
            "id": "hot_water",
            "posX": 328,
            "posY": 40,
            "emitRate": 12651.318,
            "idleTime": 436.83643,
            "eruptionTime": 253.16724,
            "dormancyCycles": 47.915073,
            "activeCycles": 64.978455
          },
          {
            "id": "liquid_co2",
            "posX": 334,
            "posY": 29,
            "emitRate": 479.59836,
            "idleTime": 237.47586,
            "eruptionTime": 271.3036,
            "dormancyCycles": 52.35169,
            "activeCycles": 55.137924
          },
          {
            "id": "hot_co2",
            "posX": 386,
            "posY": 49,
            "emitRate": 234.6134,
            "idleTime": 172.00197,
            "eruptionTime": 388.42032,
            "dormancyCycles": 52.10357,
            "activeCycles": 81.4228
          },
          {
            "id": "big_volcano",
            "posX": 378,
            "posY": 98,
            "emitRate": 268386.78,
            "idleTime": 8774.402,
            "eruptionTime": 67.93241,
            "dormancyCycles": 55.847942,
            "activeCycles": 60.820663
          },
          {
            "id": "big_volcano",
            "posX": 289,
            "posY": 96,
            "emitRate": 345451.84,
            "idleTime": 9422.291,
            "eruptionTime": 48.060303,
            "dormancyCycles": 36.950035,
            "activeCycles": 137.6252
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "SlimeSplats"
        ],
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 343,
            "posY": 267
          },
          {
            "id": "GravitasPedestal",
            "posX": 357,
            "posY": 212
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 340,
            "posY": 193,
            "emitRate": 8609.981,
            "idleTime": 653.0465,
            "eruptionTime": 39.449078,
            "dormancyCycles": 44.76417,
            "activeCycles": 83.10911
          },
          {
            "id": "molten_iron",
            "posX": 346,
            "posY": 248,
            "emitRate": 11198.626,
            "idleTime": 602.94366,
            "eruptionTime": 26.664951,
            "dormancyCycles": 54.1615,
            "activeCycles": 75.05502
          },
          {
            "id": "molten_iron",
            "posX": 375,
            "posY": 195,
            "emitRate": 10007.619,
            "idleTime": 490.24973,
            "eruptionTime": 27.389563,
            "dormancyCycles": 48.033394,
            "activeCycles": 73.00733
          },
          {
            "id": "molten_iron",
            "posX": 375,
            "posY": 243,
            "emitRate": 7622.1187,
            "idleTime": 616.46014,
            "eruptionTime": 47.19048,
            "dormancyCycles": 61.64825,
            "activeCycles": 76.29429
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "DistressSignal"
        ],
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 357,
            "posY": 358
          },
          {
            "id": "GravitasPedestal",
            "posX": 343,
            "posY": 358
          },
          {
            "id": "SapTree",
            "posX": 350,
            "posY": 358
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 331,
            "posY": 315,
            "emitRate": 8739.018,
            "idleTime": 696.7096,
            "eruptionTime": 41.77191,
            "dormancyCycles": 47.103172,
            "activeCycles": 89.05992
          },
          {
            "id": "molten_tungsten",
            "posX": 376,
            "posY": 313,
            "emitRate": 9712.213,
            "idleTime": 848.1053,
            "eruptionTime": 52.348145,
            "dormancyCycles": 66.51973,
            "activeCycles": 85.94696
          },
          {
            "id": "molten_tungsten",
            "posX": 365,
            "posY": 313,
            "emitRate": 6692.88,
            "idleTime": 764.416,
            "eruptionTime": 55.83259,
            "dormancyCycles": 53.609074,
            "activeCycles": 70.888824
          },
          {
            "id": "hot_po2",
            "posX": 380,
            "posY": 345,
            "emitRate": 339.17868,
            "idleTime": 271.40463,
            "eruptionTime": 322.38187,
            "dormancyCycles": 50.57483,
            "activeCycles": 76.03504
          },
          {
            "id": "hot_hydrogen",
            "posX": 330,
            "posY": 340,
            "emitRate": 521.51636,
            "idleTime": 318.39072,
            "eruptionTime": 224.07266,
            "dormancyCycles": 55.08278,
            "activeCycles": 91.35152
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 441,
            "posY": 202
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 425,
            "posY": 202,
            "emitRate": 295570.06,
            "idleTime": 9423.97,
            "eruptionTime": 64.52741,
            "dormancyCycles": 57.494816,
            "activeCycles": 74.70257
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 438,
            "posY": 34
          },
          {
            "id": "GravitasPedestal",
            "posX": 431,
            "posY": 34
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 455,
            "posY": 30,
            "emitRate": 261.45776,
            "idleTime": 127.65191,
            "eruptionTime": 231.43906,
            "dormancyCycles": 50.744854,
            "activeCycles": 60.049706
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 268,
            "posY": 197
          },
          {
            "id": "GravitasPedestal",
            "posX": 270,
            "posY": 197
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "posX": 269,
            "posY": 274,
            "emitRate": 10653.009,
            "idleTime": 197.70016,
            "eruptionTime": 185.55966,
            "dormancyCycles": 58.074036,
            "activeCycles": 79.24112
          },
          {
            "id": "slush_water",
            "posX": 258,
            "posY": 244,
            "emitRate": 3976.721,
            "idleTime": 141.0917,
            "eruptionTime": 198.59775,
            "dormancyCycles": 58.215965,
            "activeCycles": 108.50422
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 402,
            "posY": 296
          },
          {
            "id": "GravitasPedestal",
            "posX": 406,
            "posY": 296
          },
          {
            "id": "GeneShuffler",
            "posX": 404,
            "posY": 302
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 449,
            "posY": 289,
            "emitRate": 2197.0632,
            "idleTime": 224.62909,
            "eruptionTime": 298.30127,
            "dormancyCycles": 46.254272,
            "activeCycles": 64.62418
          },
          {
            "id": "hot_steam",
            "posX": 433,
            "posY": 287,
            "emitRate": 2826.0024,
            "idleTime": 146.09198,
            "eruptionTime": 93.79473,
            "dormancyCycles": 53.374924,
            "activeCycles": 68.7679
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaVolcanic",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumRadioactiveVanillaWarpPlanet",
        "q": 3,
        "r": -3
      },
      {
        "id": "TundraMoonlet",
        "q": -4,
        "r": -1
      },
      {
        "id": "MarshyMoonlet",
        "q": 2,
        "r": 3
      },
      {
        "id": "NiobiumMoonlet",
        "q": -5,
        "r": 4
      },
      {
        "id": "MooMoonlet",
        "q": 1,
        "r": -7
      },
      {
        "id": "WaterMoonlet",
        "q": 7,
        "r": -1
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 7,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": -1,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -1,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 0,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 9,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 3,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 4,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -10,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -9,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 6,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 5,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -3,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -7,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 6,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 6,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 7,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 5,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -10,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -9,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 10,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -4,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": -1,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -6,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_DLC2CeresField",
        "q": 8,
        "r": 1
      }
    ]
  },
  {
    "coordinate": "SNDST-C-971302415-0-0-0",
    "cluster": "SNDST-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "TerraMoonlet",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 274,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 76,
            "posY": 104
          },
          {
            "id": "WarpConduitSender",
            "posX": 121,
            "posY": 95
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 35,
            "posY": 140
          },
          {
            "id": "WarpPortal",
            "posX": 114,
            "posY": 148
          },
          {
            "id": "WarpReceiver",
            "posX": 115,
            "posY": 142
          },
          {
            "id": "GeneShuffler",
            "posX": 144,
            "posY": 168
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 102,
            "posY": 66,
            "emitRate": 2076.2153,
            "idleTime": 83.507286,
            "eruptionTime": 453.17435,
            "dormancyCycles": 41.10372,
            "activeCycles": 40.418175
          },
          {
            "id": "slush_water",
            "posX": 50,
            "posY": 160,
            "emitRate": 6272.7603,
            "idleTime": 354.60443,
            "eruptionTime": 302.3023,
            "dormancyCycles": 39.89035,
            "activeCycles": 29.001635
          },
          {
            "id": "slush_salt_water",
            "posX": 36,
            "posY": 160,
            "emitRate": 4965.628,
            "idleTime": 296.97922,
            "eruptionTime": 319.5126,
            "dormancyCycles": 27.78085,
            "activeCycles": 46.3405
          },
          {
            "id": "methane",
            "posX": 36,
            "posY": 122,
            "emitRate": 989.6496,
            "idleTime": 455.90747,
            "eruptionTime": 106.29255,
            "dormancyCycles": 66.67555,
            "activeCycles": 101.40311
          },
          {
            "id": "small_volcano",
            "posX": 76,
            "posY": 36,
            "emitRate": 128773.27,
            "idleTime": 9997.993,
            "eruptionTime": 82.949554,
            "dormancyCycles": 33.009514,
            "activeCycles": 58.06845
          },
          {
            "id": "small_volcano",
            "posX": 37,
            "posY": 41,
            "emitRate": 186753.62,
            "idleTime": 10157.239,
            "eruptionTime": 66.81913,
            "dormancyCycles": 63.76826,
            "activeCycles": 90.779045
          },
          {
            "id": "small_volcano",
            "posX": 30,
            "posY": 55,
            "emitRate": 113545.35,
            "idleTime": 10715.102,
            "eruptionTime": 98.28137,
            "dormancyCycles": 44.896496,
            "activeCycles": 69.88957
          },
          {
            "id": "methane",
            "posX": 109,
            "posY": 175,
            "emitRate": 528.993,
            "idleTime": 364.55338,
            "eruptionTime": 186.54459,
            "dormancyCycles": 62.076824,
            "activeCycles": 88.67499
          },
          {
            "id": "filthy_water",
            "posX": 16,
            "posY": 33,
            "emitRate": 9086.626,
            "idleTime": 227.95132,
            "eruptionTime": 340.7042,
            "dormancyCycles": 58.156128,
            "activeCycles": 78.33917
          },
          {
            "id": "steam",
            "posX": 64,
            "posY": 37,
            "emitRate": 8444.664,
            "idleTime": 403.2919,
            "eruptionTime": 260.56485,
            "dormancyCycles": 51.496265,
            "activeCycles": 93.123985
          }
        ]
      },
      {
        "id": "IdealLandingSite",
        "offsetX": 244,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MetalCaves",
          "SlimeSplats"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 288,
            "posY": 84,
            "emitRate": 9701.221,
            "idleTime": 223.13028,
            "eruptionTime": 245.86008,
            "dormancyCycles": 60.77364,
            "activeCycles": 71.55956
          },
          {
            "id": "liquid_co2",
            "posX": 325,
            "posY": 17,
            "emitRate": 527.2577,
            "idleTime": 260.8077,
            "eruptionTime": 297.26492,
            "dormancyCycles": 39.689,
            "activeCycles": 62.92224
          },
          {
            "id": "liquid_co2",
            "posX": 289,
            "posY": 26,
            "emitRate": 470.21268,
            "idleTime": 251.01344,
            "eruptionTime": 335.6095,
            "dormancyCycles": 49.961906,
            "activeCycles": 71.210175
          },
          {
            "id": "molten_gold",
            "posX": 350,
            "posY": 55,
            "emitRate": 8615.872,
            "idleTime": 819.4866,
            "eruptionTime": 54.93185,
            "dormancyCycles": 68.05792,
            "activeCycles": 67.38101
          },
          {
            "id": "molten_aluminum",
            "posX": 293,
            "posY": 59,
            "emitRate": 7279.4556,
            "idleTime": 696.72687,
            "eruptionTime": 45.609444,
            "dormancyCycles": 53.35204,
            "activeCycles": 60.647118
          },
          {
            "id": "molten_aluminum",
            "posX": 270,
            "posY": 58,
            "emitRate": 7338.9136,
            "idleTime": 681.4462,
            "eruptionTime": 50.900703,
            "dormancyCycles": 44.803295,
            "activeCycles": 58.97615
          },
          {
            "id": "methane",
            "posX": 330,
            "posY": 29,
            "emitRate": 374.36893,
            "idleTime": 276.2646,
            "eruptionTime": 277.28925,
            "dormancyCycles": 65.59503,
            "activeCycles": 86.115425
          },
          {
            "id": "hot_hydrogen",
            "posX": 276,
            "posY": 96,
            "emitRate": 339.54272,
            "idleTime": 223.13028,
            "eruptionTime": 245.86008,
            "dormancyCycles": 60.77364,
            "activeCycles": 71.55956
          },
          {
            "id": "chlorine_gas",
            "posX": 255,
            "posY": 56,
            "emitRate": 263.78232,
            "idleTime": 157.88565,
            "eruptionTime": 361.57095,
            "dormancyCycles": 50.57944,
            "activeCycles": 80.37218
          }
        ]
      },
      {
        "id": "WarpOilySwamp",
        "offsetX": 374,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "FrozenCore"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 478,
            "posY": 106
          },
          {
            "id": "WarpConduitSender",
            "posX": 447,
            "posY": 71
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 426,
            "posY": 105
          },
          {
            "id": "WarpReceiver",
            "posX": 431,
            "posY": 76
          },
          {
            "id": "WarpPortal",
            "posX": 409,
            "posY": 76
          },
          {
            "id": "GeneShuffler",
            "posX": 476,
            "posY": 61
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 449,
            "posY": 26,
            "emitRate": 4657.626,
            "idleTime": 270.5605,
            "eruptionTime": 296.7387,
            "dormancyCycles": 49.891937,
            "activeCycles": 81.37799
          },
          {
            "id": "OilWell",
            "posX": 394,
            "posY": 29,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 419,
            "posY": 43,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 419,
            "posY": 31,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 404,
            "posY": 35,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 406,
            "posY": 44,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "hot_co2",
            "posX": 390,
            "posY": 54,
            "emitRate": 244.53992,
            "idleTime": 180.83351,
            "eruptionTime": 349.10358,
            "dormancyCycles": 70.43739,
            "activeCycles": 115.169014
          },
          {
            "id": "liquid_co2",
            "posX": 450,
            "posY": 90,
            "emitRate": 967.7794,
            "idleTime": 445.65485,
            "eruptionTime": 147.8637,
            "dormancyCycles": 30.305346,
            "activeCycles": 92.516205
          },
          {
            "id": "hot_hydrogen",
            "posX": 472,
            "posY": 42,
            "emitRate": 303.75516,
            "idleTime": 292.9561,
            "eruptionTime": 464.0679,
            "dormancyCycles": 71.781555,
            "activeCycles": 92.957535
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 162,
        "offsetY": 176,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "DistressSignal",
          "MetalPoor"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 211,
            "posY": 188,
            "emitRate": 9093.295,
            "idleTime": 637.6221,
            "eruptionTime": 38.762947,
            "dormancyCycles": 49.19912,
            "activeCycles": 67.10116
          },
          {
            "id": "molten_iron",
            "posX": 185,
            "posY": 231,
            "emitRate": 9402.505,
            "idleTime": 633.9953,
            "eruptionTime": 36.139988,
            "dormancyCycles": 14.772378,
            "activeCycles": 12.037053
          },
          {
            "id": "molten_iron",
            "posX": 203,
            "posY": 209,
            "emitRate": 8324.652,
            "idleTime": 849.6915,
            "eruptionTime": 53.962418,
            "dormancyCycles": 42.699802,
            "activeCycles": 53.16171
          },
          {
            "id": "molten_iron",
            "posX": 195,
            "posY": 199,
            "emitRate": 5264.145,
            "idleTime": 743.25214,
            "eruptionTime": 65.97022,
            "dormancyCycles": 53.707928,
            "activeCycles": 57.605194
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 228,
        "offsetY": 176,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 262,
            "posY": 228
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 268,
            "posY": 213,
            "emitRate": 7490.2236,
            "idleTime": 654.33093,
            "eruptionTime": 47.039284,
            "dormancyCycles": 65.918526,
            "activeCycles": 91.09439
          },
          {
            "id": "molten_tungsten",
            "posX": 283,
            "posY": 185,
            "emitRate": 8245.994,
            "idleTime": 702.4664,
            "eruptionTime": 48.001465,
            "dormancyCycles": 35.618107,
            "activeCycles": 53.000484
          },
          {
            "id": "molten_tungsten",
            "posX": 244,
            "posY": 182,
            "emitRate": 10000.518,
            "idleTime": 580.53296,
            "eruptionTime": 32.89081,
            "dormancyCycles": 37.41441,
            "activeCycles": 56.843918
          },
          {
            "id": "hot_po2",
            "posX": 242,
            "posY": 206,
            "emitRate": 296.05835,
            "idleTime": 261.74023,
            "eruptionTime": 333.7458,
            "dormancyCycles": 61.40546,
            "activeCycles": 89.8831
          },
          {
            "id": "hot_po2",
            "posX": 261,
            "posY": 205,
            "emitRate": 412.62253,
            "idleTime": 394.58746,
            "eruptionTime": 312.94873,
            "dormancyCycles": 53.25618,
            "activeCycles": 83.66599
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 504,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 574,
            "posY": 31,
            "emitRate": 342.07632,
            "idleTime": 317.22595,
            "eruptionTime": 302.23804,
            "dormancyCycles": 48.156094,
            "activeCycles": 65.921364
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 162,
        "offsetY": 0,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 186,
            "posY": 91,
            "emitRate": 14376.565,
            "idleTime": 316.426,
            "eruptionTime": 213.13327,
            "dormancyCycles": 49.44879,
            "activeCycles": 63.939888
          },
          {
            "id": "slush_water",
            "posX": 216,
            "posY": 86,
            "emitRate": 3408.9067,
            "idleTime": 298.34726,
            "eruptionTime": 356.3986,
            "dormancyCycles": 53.924335,
            "activeCycles": 82.65015
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 294,
        "offsetY": 155,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "MetalRich"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 351,
            "posY": 163,
            "emitRate": 259320.83,
            "idleTime": 9791.34,
            "eruptionTime": 81.016014,
            "dormancyCycles": 71.781555,
            "activeCycles": 92.957535
          }
        ]
      },
      {
        "id": "RegolithMoonlet",
        "offsetX": 360,
        "offsetY": 155,
        "sizeX": 160,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 470,
            "posY": 190
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 387,
            "posY": 170,
            "emitRate": 3599.1387,
            "idleTime": 207.82146,
            "eruptionTime": 381.43027,
            "dormancyCycles": 33.147305,
            "activeCycles": 54.80885
          },
          {
            "id": "hot_steam",
            "posX": 430,
            "posY": 171,
            "emitRate": 2133.206,
            "idleTime": 253.9315,
            "eruptionTime": 302.40668,
            "dormancyCycles": 49.115116,
            "activeCycles": 75.03733
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "TerraMoonlet",
        "q": 0,
        "r": 0
      },
      {
        "id": "IdealLandingSite",
        "q": 3,
        "r": -3
      },
      {
        "id": "WarpOilySwamp",
        "q": -4,
        "r": -1
      },
      {
        "id": "TundraMoonlet",
        "q": 0,
        "r": -7
      },
      {
        "id": "MarshyMoonlet",
        "q": 6,
        "r": -1
      },
      {
        "id": "MooMoonlet",
        "q": -8,
        "r": 8
      },
      {
        "id": "WaterMoonlet",
        "q": -1,
        "r": 7
      },
      {
        "id": "NiobiumMoonlet",
        "q": 6,
        "r": -9
      },
      {
        "id": "RegolithMoonlet",
        "q": -5,
        "r": -5
      },
      {
        "id": "TemporalTear",
        "q": 9,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -1,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 4,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 5,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -8,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 9,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 10,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 11,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -9,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -10,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -3,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -2,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -5,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -7,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -7,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -8,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -2,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -2,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -3,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -3,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 9,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 0,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -1,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 10,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": 3,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 2,
        "r": 9
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -11,
        "r": 10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": 2,
        "r": -6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 5,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -3,
        "r": -4
      }
    ]
  },
  {
    "coordinate": "M-BAD-C-982225032-0-0-0",
    "cluster": "M-BAD-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "MiniBadlandsStart",
        "offsetX": 82,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MetalCaves",
          "BouldersMixed"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 152,
            "posY": 73
          },
          {
            "id": "WarpConduitSender",
            "posX": 127,
            "posY": 36
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 191,
            "posY": 47
          },
          {
            "id": "WarpReceiver",
            "posX": 162,
            "posY": 11
          },
          {
            "id": "WarpPortal",
            "posX": 162,
            "posY": 16
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 99,
            "posY": 28,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 114,
            "posY": 79,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 160,
            "posY": 31,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 191,
            "posY": 69,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 191,
            "posY": 12,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 118,
            "posY": 62,
            "emitRate": 4486.6685,
            "idleTime": 232.74562,
            "eruptionTime": 410.57648,
            "dormancyCycles": 54.457333,
            "activeCycles": 66.32655
          },
          {
            "id": "chlorine_gas",
            "posX": 130,
            "posY": 88,
            "emitRate": 385.05344,
            "idleTime": 362.7596,
            "eruptionTime": 344.58878,
            "dormancyCycles": 54.210545,
            "activeCycles": 73.95741
          },
          {
            "id": "liquid_co2",
            "posX": 93,
            "posY": 99,
            "emitRate": 529.2354,
            "idleTime": 246.53809,
            "eruptionTime": 191.17264,
            "dormancyCycles": 83.45141,
            "activeCycles": 132.03607
          },
          {
            "id": "filthy_water",
            "posX": 97,
            "posY": 70,
            "emitRate": 7595.469,
            "idleTime": 295.46115,
            "eruptionTime": 430.8367,
            "dormancyCycles": 58.11864,
            "activeCycles": 78.02706
          },
          {
            "id": "big_volcano",
            "posX": 133,
            "posY": 13,
            "emitRate": 272804.12,
            "idleTime": 9229.21,
            "eruptionTime": 62.20375,
            "dormancyCycles": 34.79094,
            "activeCycles": 65.08356
          }
        ]
      },
      {
        "id": "MiniRadioactiveOceanWarp",
        "offsetX": 212,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "BouldersSmall"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 261,
            "posY": 51
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 311,
            "posY": 68
          },
          {
            "id": "WarpReceiver",
            "posX": 294,
            "posY": 66
          },
          {
            "id": "WarpPortal",
            "posX": 272,
            "posY": 66
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 237,
            "posY": 65,
            "emitRate": 13202.806,
            "idleTime": 345.40204,
            "eruptionTime": 224.1215,
            "dormancyCycles": 53.700947,
            "activeCycles": 69.76016
          },
          {
            "id": "slush_water",
            "posX": 240,
            "posY": 83,
            "emitRate": 4212.7256,
            "idleTime": 243.38522,
            "eruptionTime": 384.60648,
            "dormancyCycles": 64.55375,
            "activeCycles": 112.09543
          },
          {
            "id": "slush_water",
            "posX": 276,
            "posY": 40,
            "emitRate": 4380.037,
            "idleTime": 184.50888,
            "eruptionTime": 423.94662,
            "dormancyCycles": 47.772964,
            "activeCycles": 74.90276
          },
          {
            "id": "hot_water",
            "posX": 325,
            "posY": 68,
            "emitRate": 7967.528,
            "idleTime": 175.47041,
            "eruptionTime": 244.11098,
            "dormancyCycles": 67.97698,
            "activeCycles": 93.302956
          }
        ]
      },
      {
        "id": "MiniMetallicSwampy",
        "offsetX": 342,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MetalRich",
          "SlimeSplats"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "methane",
            "posX": 435,
            "posY": 53,
            "emitRate": 478.9505,
            "idleTime": 604.7811,
            "eruptionTime": 401.42862,
            "dormancyCycles": 43.738182,
            "activeCycles": 55.85347
          },
          {
            "id": "molten_gold",
            "posX": 440,
            "posY": 31,
            "emitRate": 11206.935,
            "idleTime": 496.47415,
            "eruptionTime": 27.420856,
            "dormancyCycles": 50.281334,
            "activeCycles": 77.95769
          },
          {
            "id": "molten_cobalt",
            "posX": 367,
            "posY": 44,
            "emitRate": 9453.527,
            "idleTime": 718.2855,
            "eruptionTime": 41.203228,
            "dormancyCycles": 57.56862,
            "activeCycles": 84.94229
          },
          {
            "id": "molten_gold",
            "posX": 400,
            "posY": 45,
            "emitRate": 10862.667,
            "idleTime": 720.73987,
            "eruptionTime": 33.763348,
            "dormancyCycles": 76.96553,
            "activeCycles": 143.15407
          },
          {
            "id": "molten_gold",
            "posX": 379,
            "posY": 28,
            "emitRate": 8376.941,
            "idleTime": 675.3434,
            "eruptionTime": 43.11696,
            "dormancyCycles": 60.094635,
            "activeCycles": 99.14772
          },
          {
            "id": "molten_cobalt",
            "posX": 380,
            "posY": 94,
            "emitRate": 9092.546,
            "idleTime": 831.78503,
            "eruptionTime": 48.70918,
            "dormancyCycles": 32.503395,
            "activeCycles": 68.38822
          },
          {
            "id": "molten_copper",
            "posX": 365,
            "posY": 95,
            "emitRate": 7564.7007,
            "idleTime": 790.07294,
            "eruptionTime": 51.622986,
            "dormancyCycles": 39.57791,
            "activeCycles": 62.553783
          },
          {
            "id": "chlorine_gas",
            "posX": 378,
            "posY": 49,
            "emitRate": 409.37076,
            "idleTime": 194.35231,
            "eruptionTime": 202.85152,
            "dormancyCycles": 36.250774,
            "activeCycles": 60.972805
          }
        ]
      },
      {
        "id": "MiniForestFrozen",
        "offsetX": 472,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "LushCore"
        ],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 572,
            "posY": 57
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 497,
            "posY": 58,
            "emitRate": 902.3623,
            "idleTime": 516.69946,
            "eruptionTime": 138.97119,
            "dormancyCycles": 49.672718,
            "activeCycles": 73.85895
          },
          {
            "id": "slush_water",
            "posX": 524,
            "posY": 39,
            "emitRate": 3777.5574,
            "idleTime": 513.194,
            "eruptionTime": 573.1903,
            "dormancyCycles": 47.63687,
            "activeCycles": 52.867107
          },
          {
            "id": "salt_water",
            "posX": 507,
            "posY": 23,
            "emitRate": 10507.098,
            "idleTime": 260.19183,
            "eruptionTime": 270.34424,
            "dormancyCycles": 42.52488,
            "activeCycles": 52.71036
          },
          {
            "id": "chlorine_gas",
            "posX": 544,
            "posY": 20,
            "emitRate": 397.819,
            "idleTime": 289.21518,
            "eruptionTime": 231.2623,
            "dormancyCycles": 46.532017,
            "activeCycles": 71.666214
          },
          {
            "id": "liquid_sulfur",
            "posX": 503,
            "posY": 43,
            "emitRate": 4003.0813,
            "idleTime": 89.77833,
            "eruptionTime": 115.44831,
            "dormancyCycles": 52.88142,
            "activeCycles": 75.90897
          }
        ]
      },
      {
        "id": "MiniFlipped",
        "offsetX": 602,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "BouldersMedium",
          "MetalCaves"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 639,
            "posY": 60
          },
          {
            "id": "MassiveHeatSink",
            "posX": 637,
            "posY": 26
          },
          {
            "id": "MassiveHeatSink",
            "posX": 704,
            "posY": 44
          },
          {
            "id": "GeneShuffler",
            "posX": 685,
            "posY": 24
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 635,
            "posY": 93,
            "emitRate": 3443.1672,
            "idleTime": 184.04271,
            "eruptionTime": 384.12686,
            "dormancyCycles": 45.95773,
            "activeCycles": 72.56074
          },
          {
            "id": "steam",
            "posX": 615,
            "posY": 72,
            "emitRate": 6173.6973,
            "idleTime": 313.83655,
            "eruptionTime": 243.04956,
            "dormancyCycles": 65.05842,
            "activeCycles": 70.37575
          },
          {
            "id": "big_volcano",
            "posX": 663,
            "posY": 26,
            "emitRate": 280660.2,
            "idleTime": 10596.397,
            "eruptionTime": 83.33457,
            "dormancyCycles": 22.739147,
            "activeCycles": 61.85026
          },
          {
            "id": "hot_hydrogen",
            "posX": 703,
            "posY": 69,
            "emitRate": 293.0954,
            "idleTime": 238.28798,
            "eruptionTime": 295.25616,
            "dormancyCycles": 59.82805,
            "activeCycles": 87.61159
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 732,
        "offsetY": 0,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "SlimeSplats"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 747,
            "posY": 25,
            "emitRate": 7252.815,
            "idleTime": 695.6014,
            "eruptionTime": 47.478683,
            "dormancyCycles": 59.82805,
            "activeCycles": 87.61159
          },
          {
            "id": "molten_iron",
            "posX": 764,
            "posY": 30,
            "emitRate": 12943.098,
            "idleTime": 808.1294,
            "eruptionTime": 34.08598,
            "dormancyCycles": 51.61278,
            "activeCycles": 72.77288
          },
          {
            "id": "molten_iron",
            "posX": 779,
            "posY": 36,
            "emitRate": 7900.693,
            "idleTime": 854.9872,
            "eruptionTime": 60.24815,
            "dormancyCycles": 61.79463,
            "activeCycles": 121.54732
          },
          {
            "id": "molten_iron",
            "posX": 783,
            "posY": 25,
            "emitRate": 5546.983,
            "idleTime": 819.19763,
            "eruptionTime": 62.1705,
            "dormancyCycles": 45.771984,
            "activeCycles": 77.830215
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 798,
        "offsetY": 0,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "DistressSignal"
        ],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 832,
            "posY": 50
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 808,
            "posY": 44,
            "emitRate": 5854.614,
            "idleTime": 795.54724,
            "eruptionTime": 52.06686,
            "dormancyCycles": 61.013504,
            "activeCycles": 95.46353
          },
          {
            "id": "molten_tungsten",
            "posX": 848,
            "posY": 8,
            "emitRate": 7855.1426,
            "idleTime": 896.4981,
            "eruptionTime": 52.88693,
            "dormancyCycles": 58.66136,
            "activeCycles": 82.33626
          },
          {
            "id": "molten_tungsten",
            "posX": 833,
            "posY": 7,
            "emitRate": 10628.591,
            "idleTime": 695.43097,
            "eruptionTime": 36.363384,
            "dormancyCycles": 50.86047,
            "activeCycles": 60.808804
          },
          {
            "id": "chlorine_gas",
            "posX": 839,
            "posY": 31,
            "emitRate": 423.36102,
            "idleTime": 225.98529,
            "eruptionTime": 153.7015,
            "dormancyCycles": 52.03258,
            "activeCycles": 88.000114
          },
          {
            "id": "slimy_po2",
            "posX": 808,
            "posY": 29,
            "emitRate": 429.31714,
            "idleTime": 352.98743,
            "eruptionTime": 208.71985,
            "dormancyCycles": 48.29884,
            "activeCycles": 88.35007
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 864,
        "offsetY": 98,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 948,
            "posY": 128,
            "emitRate": 351.5859,
            "idleTime": 363.9778,
            "eruptionTime": 243.81345,
            "dormancyCycles": 51.003323,
            "activeCycles": 86.6169
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "filthy_water",
            "posX": 28,
            "posY": 110,
            "emitRate": 12326.755,
            "idleTime": 256.49295,
            "eruptionTime": 265.56668,
            "dormancyCycles": 54.553062,
            "activeCycles": 68.5994
          },
          {
            "id": "salt_water",
            "posX": 16,
            "posY": 80,
            "emitRate": 10559.107,
            "idleTime": 548.48114,
            "eruptionTime": 361.80286,
            "dormancyCycles": 54.721237,
            "activeCycles": 70.78129
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 798,
        "offsetY": 98,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 847,
            "posY": 128,
            "emitRate": 246711.66,
            "idleTime": 9941.522,
            "eruptionTime": 76.57279,
            "dormancyCycles": 43.53073,
            "activeCycles": 49.154533
          }
        ]
      },
      {
        "id": "RegolithMoonlet",
        "offsetX": 864,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 96,
        "worldTraits": [
          "LushCore"
        ],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 906,
            "posY": 22
          }
        ],
        "geysers": []
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlandsStart",
        "q": 1,
        "r": 0
      },
      {
        "id": "MiniRadioactiveOceanWarp",
        "q": 2,
        "r": -4
      },
      {
        "id": "MiniMetallicSwampy",
        "q": -2,
        "r": 1
      },
      {
        "id": "MiniForestFrozen",
        "q": -1,
        "r": -2
      },
      {
        "id": "MiniFlipped",
        "q": -2,
        "r": 4
      },
      {
        "id": "TundraMoonlet",
        "q": 0,
        "r": 9
      },
      {
        "id": "MarshyMoonlet",
        "q": 4,
        "r": 2
      },
      {
        "id": "MooMoonlet",
        "q": -7,
        "r": 4
      },
      {
        "id": "WaterMoonlet",
        "q": 7,
        "r": -3
      },
      {
        "id": "NiobiumMoonlet",
        "q": -4,
        "r": -7
      },
      {
        "id": "RegolithMoonlet",
        "q": -9,
        "r": 11
      },
      {
        "id": "TemporalTear",
        "q": 10,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 1,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 8,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 9,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -12,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -12,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 4,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 12,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -3,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 7,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -6,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -5,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -5,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -4,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 0,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -10,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 9,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 10,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 11,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -7,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -7,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": 4,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 0,
        "r": 12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -6,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 5,
        "r": -12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -12,
        "r": 4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -1,
        "r": 7
      }
    ]
  },
  {
    "coordinate": "SNDST-A-782816848-0-0-0",
    "cluster": "SNDST-A",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "SandstoneDefault",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 129,
            "posY": 187
          },
          {
            "id": "MassiveHeatSink",
            "posX": 205,
            "posY": 78
          },
          {
            "id": "MassiveHeatSink",
            "posX": 150,
            "posY": 279
          },
          {
            "id": "MassiveHeatSink",
            "posX": 159,
            "posY": 120
          },
          {
            "id": "GeneShuffler",
            "posX": 34,
            "posY": 129
          },
          {
            "id": "GeneShuffler",
            "posX": 129,
            "posY": 252
          },
          {
            "id": "GeneShuffler",
            "posX": 203,
            "posY": 175
          },
          {
            "id": "GeneShuffler",
            "posX": 61,
            "posY": 319
          },
          {
            "id": "GeneShuffler",
            "posX": 211,
            "posY": 258
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 140,
            "posY": 153,
            "emitRate": 7764.5317,
            "idleTime": 302.1623,
            "eruptionTime": 146.60861,
            "dormancyCycles": 47.205902,
            "activeCycles": 59.21421
          },
          {
            "id": "chlorine_gas",
            "posX": 172,
            "posY": 228,
            "emitRate": 280.3833,
            "idleTime": 235.38686,
            "eruptionTime": 382.99625,
            "dormancyCycles": 34.025265,
            "activeCycles": 51.619614
          },
          {
            "id": "steam",
            "posX": 109,
            "posY": 279,
            "emitRate": 4683.3955,
            "idleTime": 149.48625,
            "eruptionTime": 144.93095,
            "dormancyCycles": 59.65996,
            "activeCycles": 66.853516
          },
          {
            "id": "methane",
            "posX": 107,
            "posY": 164,
            "emitRate": 272.26175,
            "idleTime": 302.2409,
            "eruptionTime": 373.6515,
            "dormancyCycles": 55.372616,
            "activeCycles": 72.953674
          },
          {
            "id": "salt_water",
            "posX": 222,
            "posY": 303,
            "emitRate": 12669.86,
            "idleTime": 284.48825,
            "eruptionTime": 206.66731,
            "dormancyCycles": 43.20444,
            "activeCycles": 101.29814
          },
          {
            "id": "OilWell",
            "posX": 219,
            "posY": 44,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 149,
            "posY": 41,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 31,
            "posY": 48,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "oil_drip",
            "posX": 181,
            "posY": 40,
            "emitRate": 310.24045,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.22590972,
            "activeCycles": 0.38268635
          },
          {
            "id": "steam",
            "posX": 61,
            "posY": 164,
            "emitRate": 4061.8386,
            "idleTime": 234.28105,
            "eruptionTime": 243.38057,
            "dormancyCycles": 56.44967,
            "activeCycles": 85.165985
          },
          {
            "id": "hot_steam",
            "posX": 166,
            "posY": 82,
            "emitRate": 1993.8535,
            "idleTime": 405.58044,
            "eruptionTime": 458.05963,
            "dormancyCycles": 44.333996,
            "activeCycles": 90.26212
          },
          {
            "id": "steam",
            "posX": 101,
            "posY": 78,
            "emitRate": 4024.7668,
            "idleTime": 360.68683,
            "eruptionTime": 317.55408,
            "dormancyCycles": 59.783894,
            "activeCycles": 104.01896
          },
          {
            "id": "slush_salt_water",
            "posX": 152,
            "posY": 106,
            "emitRate": 4492.694,
            "idleTime": 369.7219,
            "eruptionTime": 412.87137,
            "dormancyCycles": 59.967983,
            "activeCycles": 85.53571
          },
          {
            "id": "oil_drip",
            "posX": 240,
            "posY": 50,
            "emitRate": 400.55392,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.1784524,
            "activeCycles": 0.3452033
          },
          {
            "id": "molten_gold",
            "posX": 82,
            "posY": 93,
            "emitRate": 9332.71,
            "idleTime": 738.5982,
            "eruptionTime": 47.769024,
            "dormancyCycles": 24.813925,
            "activeCycles": 54.803898
          },
          {
            "id": "molten_copper",
            "posX": 61,
            "posY": 133,
            "emitRate": 7675.113,
            "idleTime": 626.78394,
            "eruptionTime": 48.088486,
            "dormancyCycles": 36.336674,
            "activeCycles": 54.94121
          },
          {
            "id": "methane",
            "posX": 235,
            "posY": 135,
            "emitRate": 294.82843,
            "idleTime": 252.8992,
            "eruptionTime": 444.70956,
            "dormancyCycles": 38.491695,
            "activeCycles": 99.06599
          },
          {
            "id": "slush_salt_water",
            "posX": 123,
            "posY": 290,
            "emitRate": 3422.8352,
            "idleTime": 172.05922,
            "eruptionTime": 378.5892,
            "dormancyCycles": 64.244514,
            "activeCycles": 90.61202
          },
          {
            "id": "hot_hydrogen",
            "posX": 21,
            "posY": 71,
            "emitRate": 341.6779,
            "idleTime": 222.98453,
            "eruptionTime": 240.42068,
            "dormancyCycles": 46.27442,
            "activeCycles": 68.00126
          },
          {
            "id": "oil_drip",
            "posX": 63,
            "posY": 47,
            "emitRate": 318.79617,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.16234569,
            "activeCycles": 0.25608864
          }
        ]
      }
    ],
    "starMapEntriesVanilla": [
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "MetallicAsteroid",
        "distance": 1
      },
      {
        "id": "RockyAsteroid",
        "distance": 2
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "RockyAsteroid",
        "distance": 3
      },
      {
        "id": "RockyAsteroid",
        "distance": 3
      },
      {
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "MetallicAsteroid",
        "distance": 4
      },
      {
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "RedDwarf",
        "distance": 6
      },
      {
        "id": "DustyMoon",
        "distance": 6
      },
      {
        "id": "DustyMoon",
        "distance": 7
      },
      {
        "id": "TerraPlanet",
        "distance": 8
      },
      {
        "id": "RustPlanet",
        "distance": 8
      },
      {
        "id": "IceGiant",
        "distance": 9
      },
      {
        "id": "RustPlanet",
        "distance": 10
      },
      {
        "id": "ShinyPlanet",
        "distance": 11
      },
      {
        "id": "RockyAsteroid",
        "distance": 11
      },
      {
        "id": "OrganicDwarf",
        "distance": 12
      },
      {
        "id": "ChlorinePlanet",
        "distance": 12
      },
      {
        "id": "RockyAsteroid",
        "distance": 14
      },
      {
        "id": "OilyAsteriod",
        "distance": 15
      },
      {
        "id": "GoldAsteroid",
        "distance": 16
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "BAD-A-1246537447-0-0-0",
    "cluster": "BAD-A",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "Badlands",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [
          "FrozenCore",
          "SubsurfaceOcean"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 106,
            "posY": 213
          },
          {
            "id": "MassiveHeatSink",
            "posX": 55,
            "posY": 116
          },
          {
            "id": "MassiveHeatSink",
            "posX": 240,
            "posY": 161
          },
          {
            "id": "MassiveHeatSink",
            "posX": 173,
            "posY": 110
          },
          {
            "id": "GeneShuffler",
            "posX": 207,
            "posY": 282
          },
          {
            "id": "GeneShuffler",
            "posX": 173,
            "posY": 155
          },
          {
            "id": "GeneShuffler",
            "posX": 195,
            "posY": 59
          },
          {
            "id": "GeneShuffler",
            "posX": 119,
            "posY": 238
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 166,
            "posY": 267,
            "emitRate": 4651.8154,
            "idleTime": 261.27505,
            "eruptionTime": 279.57248,
            "dormancyCycles": 67.533066,
            "activeCycles": 75.76714
          },
          {
            "id": "chlorine_gas",
            "posX": 217,
            "posY": 212,
            "emitRate": 283.3367,
            "idleTime": 192.0788,
            "eruptionTime": 264.28162,
            "dormancyCycles": 68.89187,
            "activeCycles": 91.89226
          },
          {
            "id": "OilWell",
            "posX": 26,
            "posY": 41,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 108,
            "posY": 25,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 79,
            "posY": 33,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "oil_drip",
            "posX": 118,
            "posY": 142,
            "emitRate": 312.53485,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.13452078,
            "activeCycles": 0.45119852
          },
          {
            "id": "slimy_po2",
            "posX": 189,
            "posY": 304,
            "emitRate": 364.0063,
            "idleTime": 426.0674,
            "eruptionTime": 427.2847,
            "dormancyCycles": 57.6506,
            "activeCycles": 71.19435
          },
          {
            "id": "slush_salt_water",
            "posX": 78,
            "posY": 175,
            "emitRate": 4168.4517,
            "idleTime": 261.12714,
            "eruptionTime": 347.91406,
            "dormancyCycles": 39.23535,
            "activeCycles": 74.12981
          },
          {
            "id": "hot_water",
            "posX": 240,
            "posY": 51,
            "emitRate": 10135.185,
            "idleTime": 368.63696,
            "eruptionTime": 296.8393,
            "dormancyCycles": 29.87191,
            "activeCycles": 91.279
          },
          {
            "id": "liquid_co2",
            "posX": 210,
            "posY": 185,
            "emitRate": 1811.4991,
            "idleTime": 406.06717,
            "eruptionTime": 64.70788,
            "dormancyCycles": 41.08419,
            "activeCycles": 93.47659
          },
          {
            "id": "molten_iron",
            "posX": 239,
            "posY": 195,
            "emitRate": 10726.785,
            "idleTime": 765.992,
            "eruptionTime": 41.333454,
            "dormancyCycles": 70.282486,
            "activeCycles": 108.70043
          },
          {
            "id": "oil_drip",
            "posX": 60,
            "posY": 68,
            "emitRate": 374.7287,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.22094654,
            "activeCycles": 0.31351504
          },
          {
            "id": "hot_water",
            "posX": 168,
            "posY": 211,
            "emitRate": 7437.615,
            "idleTime": 239.71269,
            "eruptionTime": 358.84146,
            "dormancyCycles": 38.486435,
            "activeCycles": 66.050545
          },
          {
            "id": "salt_water",
            "posX": 218,
            "posY": 37,
            "emitRate": 12620.431,
            "idleTime": 256.78775,
            "eruptionTime": 158.64223,
            "dormancyCycles": 52.6108,
            "activeCycles": 91.32851
          },
          {
            "id": "chlorine_gas",
            "posX": 209,
            "posY": 152,
            "emitRate": 435.96967,
            "idleTime": 279.56177,
            "eruptionTime": 204.33194,
            "dormancyCycles": 45.32565,
            "activeCycles": 71.78462
          },
          {
            "id": "steam",
            "posX": 146,
            "posY": 28,
            "emitRate": 3961.875,
            "idleTime": 267.65485,
            "eruptionTime": 275.01038,
            "dormancyCycles": 55.677414,
            "activeCycles": 67.290855
          },
          {
            "id": "hot_water",
            "posX": 191,
            "posY": 33,
            "emitRate": 9152.816,
            "idleTime": 122.83459,
            "eruptionTime": 119.604866,
            "dormancyCycles": 34.732147,
            "activeCycles": 60.469395
          }
        ]
      }
    ],
    "starMapEntriesVanilla": [
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "MetallicAsteroid",
        "distance": 1
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "RockyAsteroid",
        "distance": 2
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 3
      },
      {
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "OrganicDwarf",
        "distance": 5
      },
      {
        "id": "OrganicDwarf",
        "distance": 5
      },
      {
        "id": "ChlorinePlanet",
        "distance": 6
      },
      {
        "id": "RedDwarf",
        "distance": 6
      },
      {
        "id": "RustPlanet",
        "distance": 8
      },
      {
        "id": "TerraPlanet",
        "distance": 8
      },
      {
        "id": "RockyAsteroid",
        "distance": 10
      },
      {
        "id": "RockyAsteroid",
        "distance": 10
      },
      {
        "id": "ChlorinePlanet",
        "distance": 12
      },
      {
        "id": "DustyMoon",
        "distance": 13
      },
      {
        "id": "HeliumGiant",
        "distance": 15
      },
      {
        "id": "ForestPlanet",
        "distance": 15
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "M-FRZ-C-957779994-0-0-0",
    "cluster": "M-FRZ-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
    {
        "id": "MiniForestFrozenStart",
        "offsetX": 212,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "RadioactiveCrust",
          "DistressSignal"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 270,
            "posY": 74
          },
          {
            "id": "WarpConduitSender",
            "posX": 292,
            "posY": 39
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 303,
            "posY": 79
          },
          {
            "id": "WarpReceiver",
            "posX": 254,
            "posY": 30
          },
          {
            "id": "WarpPortal",
            "posX": 254,
            "posY": 35
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 317,
            "posY": 81,
            "emitRate": 364.1439,
            "idleTime": 301.0734,
            "eruptionTime": 234.32254,
            "dormancyCycles": 47.24442,
            "activeCycles": 72.290535
          },
          {
            "id": "slush_water",
            "posX": 307,
            "posY": 43,
            "emitRate": 3853.837,
            "idleTime": 216.40913,
            "eruptionTime": 281.90726,
            "dormancyCycles": 33.575443,
            "activeCycles": 65.546974
          },
          {
            "id": "liquid_sulfur",
            "posX": 235,
            "posY": 50,
            "emitRate": 5063.757,
            "idleTime": 255.86224,
            "eruptionTime": 202.91687,
            "dormancyCycles": 44.096073,
            "activeCycles": 66.80519
          },
          {
            "id": "small_volcano",
            "posX": 287,
            "posY": 104,
            "emitRate": 137033.33,
            "idleTime": 8451.074,
            "eruptionTime": 62.240047,
            "dormancyCycles": 69.284065,
            "activeCycles": 96.91433
          },
          {
            "id": "methane",
            "posX": 323,
            "posY": 43,
            "emitRate": 263.9975,
            "idleTime": 289.8608,
            "eruptionTime": 550.7729,
            "dormancyCycles": 62.441746,
            "activeCycles": 68.46858
          }
        ]
      },
      {
        "id": "MiniBadlandsWarp",
        "offsetX": 82,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "SlimeSplats"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 97,
            "posY": 25
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 115,
            "posY": 90
          },
          {
            "id": "WarpPortal",
            "posX": 129,
            "posY": 65
          },
          {
            "id": "WarpReceiver",
            "posX": 151,
            "posY": 65
          },
          {
            "id": "GeneShuffler",
            "posX": 140,
            "posY": 32
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 117,
            "posY": 12,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 149,
            "posY": 20,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 186,
            "posY": 37,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 193,
            "posY": 24,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 166,
            "posY": 11,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 162,
            "posY": 39,
            "emitRate": 4499.8496,
            "idleTime": 291.16455,
            "eruptionTime": 317.27753,
            "dormancyCycles": 45.01999,
            "activeCycles": 71.16206
          },
          {
            "id": "chlorine_gas",
            "posX": 167,
            "posY": 94,
            "emitRate": 353.62933,
            "idleTime": 212.43877,
            "eruptionTime": 216.87444,
            "dormancyCycles": 37.290108,
            "activeCycles": 62.240734
          },
          {
            "id": "small_volcano",
            "posX": 109,
            "posY": 104,
            "emitRate": 112886.71,
            "idleTime": 7426.687,
            "eruptionTime": 66.62283,
            "dormancyCycles": 91.23038,
            "activeCycles": 76.695496
          },
          {
            "id": "slimy_po2",
            "posX": 137,
            "posY": 104,
            "emitRate": 309.16974,
            "idleTime": 247.92961,
            "eruptionTime": 258.62408,
            "dormancyCycles": 61.68702,
            "activeCycles": 101.034386
          },
          {
            "id": "chlorine_gas",
            "posX": 98,
            "posY": 45,
            "emitRate": 698.2796,
            "idleTime": 427.27386,
            "eruptionTime": 174.61389,
            "dormancyCycles": 81.86877,
            "activeCycles": 116.60864
          }
        ]
      },
      {
        "id": "MiniMetallicSwampy",
        "offsetX": 342,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "FrozenCore"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "methane",
            "posX": 438,
            "posY": 84,
            "emitRate": 288.8806,
            "idleTime": 203.65656,
            "eruptionTime": 476.8767,
            "dormancyCycles": 63.07472,
            "activeCycles": 95.67015
          },
          {
            "id": "molten_gold",
            "posX": 428,
            "posY": 33,
            "emitRate": 8149.931,
            "idleTime": 807.54974,
            "eruptionTime": 45.225803,
            "dormancyCycles": 42.8136,
            "activeCycles": 112.923164
          },
          {
            "id": "molten_cobalt",
            "posX": 442,
            "posY": 55,
            "emitRate": 9624.535,
            "idleTime": 711.06903,
            "eruptionTime": 43.619114,
            "dormancyCycles": 56.373905,
            "activeCycles": 71.900185
          },
          {
            "id": "molten_cobalt",
            "posX": 368,
            "posY": 29,
            "emitRate": 8516.697,
            "idleTime": 578.1765,
            "eruptionTime": 37.307796,
            "dormancyCycles": 49.080963,
            "activeCycles": 53.469265
          },
          {
            "id": "molten_copper",
            "posX": 431,
            "posY": 102,
            "emitRate": 8368.089,
            "idleTime": 857.34735,
            "eruptionTime": 57.092125,
            "dormancyCycles": 42.30107,
            "activeCycles": 62.977547
          },
          {
            "id": "molten_gold",
            "posX": 442,
            "posY": 39,
            "emitRate": 9602.326,
            "idleTime": 774.8318,
            "eruptionTime": 42.826607,
            "dormancyCycles": 51.62396,
            "activeCycles": 42.549362
          },
          {
            "id": "molten_cobalt",
            "posX": 458,
            "posY": 82,
            "emitRate": 8134.2505,
            "idleTime": 949.9371,
            "eruptionTime": 59.947662,
            "dormancyCycles": 53.665974,
            "activeCycles": 87.584404
          },
          {
            "id": "methane",
            "posX": 389,
            "posY": 62,
            "emitRate": 424.64944,
            "idleTime": 425.22632,
            "eruptionTime": 351.00793,
            "dormancyCycles": 57.286003,
            "activeCycles": 84.26408
          }
        ]
      },
      {
        "id": "MiniFlipped",
        "offsetX": 472,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MetalPoor",
          "BouldersMixed"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 534,
            "posY": 35
          },
          {
            "id": "MassiveHeatSink",
            "posX": 576,
            "posY": 25
          },
          {
            "id": "MassiveHeatSink",
            "posX": 487,
            "posY": 42
          },
          {
            "id": "GeneShuffler",
            "posX": 502,
            "posY": 23
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 511,
            "posY": 98,
            "emitRate": 4217.76,
            "idleTime": 208.8293,
            "eruptionTime": 287.25153,
            "dormancyCycles": 43.2143,
            "activeCycles": 78.7795
          },
          {
            "id": "hot_steam",
            "posX": 551,
            "posY": 47,
            "emitRate": 3829.298,
            "idleTime": 140.05357,
            "eruptionTime": 71.38811,
            "dormancyCycles": 31.201166,
            "activeCycles": 58.76112
          },
          {
            "id": "hot_co2",
            "posX": 576,
            "posY": 39,
            "emitRate": 248.19157,
            "idleTime": 320.6604,
            "eruptionTime": 785.1825,
            "dormancyCycles": 56.621418,
            "activeCycles": 85.32096
          },
          {
            "id": "hot_po2",
            "posX": 562,
            "posY": 28,
            "emitRate": 350.2575,
            "idleTime": 332.7334,
            "eruptionTime": 328.00128,
            "dormancyCycles": 52.224907,
            "activeCycles": 66.00952
          }
        ]
      },
      {
        "id": "MiniRadioactiveOcean",
        "offsetX": 602,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MetalCaves"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 628,
            "posY": 93,
            "emitRate": 18057.777,
            "idleTime": 278.97778,
            "eruptionTime": 126.429985,
            "dormancyCycles": 48.30443,
            "activeCycles": 67.185974
          },
          {
            "id": "hot_water",
            "posX": 669,
            "posY": 93,
            "emitRate": 8572.738,
            "idleTime": 189.77475,
            "eruptionTime": 241.67224,
            "dormancyCycles": 30.416208,
            "activeCycles": 60.32494
          },
          {
            "id": "slush_water",
            "posX": 714,
            "posY": 81,
            "emitRate": 4349.6343,
            "idleTime": 304.92242,
            "eruptionTime": 427.13922,
            "dormancyCycles": 34.804558,
            "activeCycles": 62.17029
          },
          {
            "id": "hot_steam",
            "posX": 697,
            "posY": 88,
            "emitRate": 2051.9724,
            "idleTime": 320.8809,
            "eruptionTime": 456.86545,
            "dormancyCycles": 27.206783,
            "activeCycles": 35.40706
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 732,
        "offsetY": 0,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "MetalPoor",
          "LushCore"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 783,
            "posY": 28,
            "emitRate": 7076.7207,
            "idleTime": 718.8352,
            "eruptionTime": 62.937393,
            "dormancyCycles": 26.786552,
            "activeCycles": 102.90619
          },
          {
            "id": "molten_iron",
            "posX": 745,
            "posY": 20,
            "emitRate": 8184.4805,
            "idleTime": 528.7394,
            "eruptionTime": 38.764744,
            "dormancyCycles": 63.056087,
            "activeCycles": 80.31256
          },
          {
            "id": "molten_iron",
            "posX": 762,
            "posY": 17,
            "emitRate": 7595.747,
            "idleTime": 639.4926,
            "eruptionTime": 41.541714,
            "dormancyCycles": 55.951626,
            "activeCycles": 86.387436
          },
          {
            "id": "molten_iron",
            "posX": 774,
            "posY": 59,
            "emitRate": 9133.637,
            "idleTime": 890.71173,
            "eruptionTime": 50.614872,
            "dormancyCycles": 33.944855,
            "activeCycles": 74.23878
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 798,
        "offsetY": 0,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 837,
            "posY": 48
          },
          {
            "id": "GeneShuffler",
            "posX": 828,
            "posY": 30
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 839,
            "posY": 24,
            "emitRate": 8281.957,
            "idleTime": 794.79584,
            "eruptionTime": 44.31763,
            "dormancyCycles": 55.09769,
            "activeCycles": 81.5904
          },
          {
            "id": "molten_tungsten",
            "posX": 808,
            "posY": 8,
            "emitRate": 8822.481,
            "idleTime": 905.5659,
            "eruptionTime": 54.904305,
            "dormancyCycles": 58.47269,
            "activeCycles": 75.88656
          },
          {
            "id": "molten_tungsten",
            "posX": 823,
            "posY": 8,
            "emitRate": 6270.658,
            "idleTime": 696.55994,
            "eruptionTime": 58.513428,
            "dormancyCycles": 78.32276,
            "activeCycles": 74.00127
          },
          {
            "id": "hot_po2",
            "posX": 808,
            "posY": 38,
            "emitRate": 337.7139,
            "idleTime": 370.03375,
            "eruptionTime": 342.40405,
            "dormancyCycles": 25.936974,
            "activeCycles": 47.373608
          },
          {
            "id": "hot_co2",
            "posX": 845,
            "posY": 38,
            "emitRate": 400.808,
            "idleTime": 363.35703,
            "eruptionTime": 286.23734,
            "dormancyCycles": 67.74013,
            "activeCycles": 101.97253
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 864,
        "offsetY": 98,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 897,
            "posY": 135,
            "emitRate": 352.19052,
            "idleTime": 282.0139,
            "eruptionTime": 264.29947,
            "dormancyCycles": 51.06118,
            "activeCycles": 91.36925
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 29,
            "posY": 87,
            "emitRate": 13883.345,
            "idleTime": 382.23618,
            "eruptionTime": 247.75882,
            "dormancyCycles": 46.35329,
            "activeCycles": 58.39397
          },
          {
            "id": "filthy_water",
            "posX": 50,
            "posY": 91,
            "emitRate": 10420.039,
            "idleTime": 376.39996,
            "eruptionTime": 439.05365,
            "dormancyCycles": 51.625507,
            "activeCycles": 77.610466
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 798,
        "offsetY": 98,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "MetalPoor"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 849,
            "posY": 131,
            "emitRate": 283473.22,
            "idleTime": 7842.081,
            "eruptionTime": 51.745373,
            "dormancyCycles": 57.648476,
            "activeCycles": 77.04446
          }
        ]
      },
      {
        "id": "RegolithMoonlet",
        "offsetX": 864,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 980,
            "posY": 44
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 968,
            "posY": 12,
            "emitRate": 3329.3977,
            "idleTime": 261.04788,
            "eruptionTime": 139.8409,
            "dormancyCycles": 57.648476,
            "activeCycles": 77.04446
          },
          {
            "id": "steam",
            "posX": 897,
            "posY": 9,
            "emitRate": 5459.304,
            "idleTime": 298.98294,
            "eruptionTime": 258.5778,
            "dormancyCycles": 50.720413,
            "activeCycles": 102.626114
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlandsWarp",
        "q": 0,
        "r": 0
      },
      {
        "id": "MiniForestFrozenStart",
        "q": 3,
        "r": -2
      },
      {
        "id": "MiniMetallicSwampy",
        "q": -3,
        "r": 1
      },
      {
        "id": "MiniFlipped",
        "q": -1,
        "r": -2
      },
      {
        "id": "MiniRadioactiveOcean",
        "q": 2,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": -9,
        "r": 4
      },
      {
        "id": "MarshyMoonlet",
        "q": -4,
        "r": 6
      },
      {
        "id": "MooMoonlet",
        "q": 9,
        "r": -3
      },
      {
        "id": "WaterMoonlet",
        "q": -9,
        "r": 9
      },
      {
        "id": "NiobiumMoonlet",
        "q": -2,
        "r": -7
      },
      {
        "id": "RegolithMoonlet",
        "q": 7,
        "r": -11
      },
      {
        "id": "TemporalTear",
        "q": -12,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -1,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 11,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -6,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -5,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -5,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -9,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 3,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -4,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -5,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -3,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 1,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 2,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 12,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 8,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -2,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -12,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -4,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -3,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 3,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 4,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -9,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": 2,
        "r": -4
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 11,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -8,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 7,
        "r": -7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 1,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 5,
        "r": 3
      }
    ]
  },
  {
    "coordinate": "SWMP-C-2007487638-0-0-0",
    "cluster": "SWMP-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "SwampMoonlet",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 274,
        "worldTraits": [
          "Geodes",
          "CrashedSatellites",
          "BouldersMedium",
          "MetalPoor"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 67,
            "posY": 123
          },
          {
            "id": "MassiveHeatSink",
            "posX": 70,
            "posY": 157
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 119,
            "posY": 148
          },
          {
            "id": "WarpConduitSender",
            "posX": 125,
            "posY": 166
          },
          {
            "id": "WarpPortal",
            "posX": 26,
            "posY": 172
          },
          {
            "id": "WarpReceiver",
            "posX": 27,
            "posY": 166
          },
          {
            "id": "GeneShuffler",
            "posX": 130,
            "posY": 76
          },
          {
            "id": "GeneShuffler",
            "posX": 122,
            "posY": 118
          },
          {
            "id": "GeneShuffler",
            "posX": 101,
            "posY": 141
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 122,
            "posY": 103,
            "emitRate": 4642.1426,
            "idleTime": 326.30722,
            "eruptionTime": 374.35123,
            "dormancyCycles": 57.244095,
            "activeCycles": 97.64835
          },
          {
            "id": "hot_hydrogen",
            "posX": 70,
            "posY": 172,
            "emitRate": 335.99915,
            "idleTime": 345.80533,
            "eruptionTime": 349.20963,
            "dormancyCycles": 51.516685,
            "activeCycles": 72.66505
          },
          {
            "id": "slush_salt_water",
            "posX": 62,
            "posY": 90,
            "emitRate": 4555.1035,
            "idleTime": 254.8543,
            "eruptionTime": 283.92603,
            "dormancyCycles": 39.573563,
            "activeCycles": 69.594574
          },
          {
            "id": "slush_water",
            "posX": 42,
            "posY": 107,
            "emitRate": 5308.76,
            "idleTime": 291.42584,
            "eruptionTime": 292.46252,
            "dormancyCycles": 55.518013,
            "activeCycles": 78.84
          },
          {
            "id": "small_volcano",
            "posX": 63,
            "posY": 44,
            "emitRate": 159977.6,
            "idleTime": 8009.7227,
            "eruptionTime": 54.590225,
            "dormancyCycles": 55.89017,
            "activeCycles": 81.06519
          },
          {
            "id": "small_volcano",
            "posX": 106,
            "posY": 36,
            "emitRate": 114611.59,
            "idleTime": 8733.164,
            "eruptionTime": 67.64456,
            "dormancyCycles": 41.800434,
            "activeCycles": 53.645317
          },
          {
            "id": "small_volcano",
            "posX": 36,
            "posY": 40,
            "emitRate": 137726.56,
            "idleTime": 7327.5557,
            "eruptionTime": 55.090775,
            "dormancyCycles": 32.05169,
            "activeCycles": 46.59115
          },
          {
            "id": "filthy_water",
            "posX": 108,
            "posY": 177,
            "emitRate": 10433.426,
            "idleTime": 264.63892,
            "eruptionTime": 283.87762,
            "dormancyCycles": 48.198944,
            "activeCycles": 88.220726
          },
          {
            "id": "liquid_co2",
            "posX": 133,
            "posY": 141,
            "emitRate": 338.30624,
            "idleTime": 160.06602,
            "eruptionTime": 272.21268,
            "dormancyCycles": 38.84341,
            "activeCycles": 73.49728
          },
          {
            "id": "big_volcano",
            "posX": 148,
            "posY": 61,
            "emitRate": 238337.98,
            "idleTime": 7588.805,
            "eruptionTime": 56.60995,
            "dormancyCycles": 48.656242,
            "activeCycles": 72.616806
          }
        ]
      },
      {
        "id": "MetalHeavyLandingSite",
        "offsetX": 244,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "SlimeSplats"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_aluminum",
            "posX": 289,
            "posY": 42,
            "emitRate": 8422.509,
            "idleTime": 812.61597,
            "eruptionTime": 56.330273,
            "dormancyCycles": 48.383385,
            "activeCycles": 75.56073
          },
          {
            "id": "molten_gold",
            "posX": 352,
            "posY": 69,
            "emitRate": 8876.646,
            "idleTime": 684.11053,
            "eruptionTime": 45.18208,
            "dormancyCycles": 61.623123,
            "activeCycles": 76.946014
          },
          {
            "id": "molten_aluminum",
            "posX": 274,
            "posY": 62,
            "emitRate": 10024.99,
            "idleTime": 706.8212,
            "eruptionTime": 36.70106,
            "dormancyCycles": 44.641506,
            "activeCycles": 83.773674
          },
          {
            "id": "molten_gold",
            "posX": 282,
            "posY": 76,
            "emitRate": 9504.161,
            "idleTime": 791.44965,
            "eruptionTime": 51.325474,
            "dormancyCycles": 38.503437,
            "activeCycles": 68.03475
          },
          {
            "id": "liquid_co2",
            "posX": 297,
            "posY": 15,
            "emitRate": 584.59625,
            "idleTime": 266.75455,
            "eruptionTime": 249.77992,
            "dormancyCycles": 29.043167,
            "activeCycles": 91.193016
          },
          {
            "id": "liquid_co2",
            "posX": 326,
            "posY": 12,
            "emitRate": 471.30615,
            "idleTime": 379.2696,
            "eruptionTime": 428.11218,
            "dormancyCycles": 68.42178,
            "activeCycles": 118.21029
          },
          {
            "id": "hot_po2",
            "posX": 258,
            "posY": 33,
            "emitRate": 350.7716,
            "idleTime": 179.14708,
            "eruptionTime": 243.61479,
            "dormancyCycles": 68.562546,
            "activeCycles": 103.5687
          },
          {
            "id": "filthy_water",
            "posX": 353,
            "posY": 31,
            "emitRate": 8701.888,
            "idleTime": 238.99179,
            "eruptionTime": 327.86807,
            "dormancyCycles": 59.022526,
            "activeCycles": 88.57626
          },
          {
            "id": "methane",
            "posX": 286,
            "posY": 58,
            "emitRate": 303.32513,
            "idleTime": 269.42615,
            "eruptionTime": 394.68677,
            "dormancyCycles": 43.86782,
            "activeCycles": 63.70274
          }
        ]
      },
      {
        "id": "OilRichWarpTarget",
        "offsetX": 374,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "RadioactiveCrust",
          "BouldersSmall"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 426,
            "posY": 45
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 486,
            "posY": 84
          },
          {
            "id": "WarpPortal",
            "posX": 441,
            "posY": 82
          },
          {
            "id": "WarpReceiver",
            "posX": 463,
            "posY": 82
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 403,
            "posY": 33,
            "emitRate": 7185.7812,
            "idleTime": 421.0761,
            "eruptionTime": 240.82036,
            "dormancyCycles": 44.423172,
            "activeCycles": 116.051315
          },
          {
            "id": "OilWell",
            "posX": 396,
            "posY": 43,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 442,
            "posY": 25,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 464,
            "posY": 17,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 491,
            "posY": 39,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 389,
            "posY": 26,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 422,
            "posY": 95,
            "emitRate": 6773.9023,
            "idleTime": 249.81656,
            "eruptionTime": 326.1097,
            "dormancyCycles": 39.512386,
            "activeCycles": 60.88776
          },
          {
            "id": "chlorine_gas",
            "posX": 478,
            "posY": 28,
            "emitRate": 559.41547,
            "idleTime": 337.6671,
            "eruptionTime": 141.47823,
            "dormancyCycles": 59.13543,
            "activeCycles": 92.88167
          },
          {
            "id": "small_volcano",
            "posX": 432,
            "posY": 28,
            "emitRate": 111831.24,
            "idleTime": 9362.257,
            "eruptionTime": 78.901955,
            "dormancyCycles": 21.297867,
            "activeCycles": 39.3486
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 162,
        "offsetY": 176,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "SlimeSplats"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 202,
            "posY": 208,
            "emitRate": 5750.6113,
            "idleTime": 572.84576,
            "eruptionTime": 47.845898,
            "dormancyCycles": 50.161407,
            "activeCycles": 64.28936
          },
          {
            "id": "molten_iron",
            "posX": 207,
            "posY": 240,
            "emitRate": 7262.346,
            "idleTime": 825.3451,
            "eruptionTime": 60.191998,
            "dormancyCycles": 32.600124,
            "activeCycles": 73.6185
          },
          {
            "id": "molten_iron",
            "posX": 200,
            "posY": 223,
            "emitRate": 16621.07,
            "idleTime": 837.4727,
            "eruptionTime": 29.298069,
            "dormancyCycles": 43.290127,
            "activeCycles": 48.92677
          },
          {
            "id": "molten_iron",
            "posX": 203,
            "posY": 195,
            "emitRate": 9145.469,
            "idleTime": 736.4548,
            "eruptionTime": 46.805927,
            "dormancyCycles": 51.165436,
            "activeCycles": 95.256805
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 228,
        "offsetY": 176,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "CrashedSatellites"
        ],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 258,
            "posY": 229
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 237,
            "posY": 202,
            "emitRate": 9587.731,
            "idleTime": 750.4665,
            "eruptionTime": 38.82249,
            "dormancyCycles": 53.896664,
            "activeCycles": 73.49055
          },
          {
            "id": "molten_tungsten",
            "posX": 277,
            "posY": 181,
            "emitRate": 7918.9526,
            "idleTime": 642.34985,
            "eruptionTime": 39.604095,
            "dormancyCycles": 42.402912,
            "activeCycles": 88.724434
          },
          {
            "id": "molten_tungsten",
            "posX": 234,
            "posY": 181,
            "emitRate": 9323.216,
            "idleTime": 736.7719,
            "eruptionTime": 44.122665,
            "dormancyCycles": 47.724655,
            "activeCycles": 71.46544
          },
          {
            "id": "hot_po2",
            "posX": 273,
            "posY": 199,
            "emitRate": 401.46042,
            "idleTime": 277.15152,
            "eruptionTime": 214.4531,
            "dormancyCycles": 57.305676,
            "activeCycles": 73.01561
          },
          {
            "id": "hot_po2",
            "posX": 267,
            "posY": 217,
            "emitRate": 342.6004,
            "idleTime": 317.6158,
            "eruptionTime": 380.8477,
            "dormancyCycles": 36.09828,
            "activeCycles": 59.008495
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 504,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 542,
            "posY": 41,
            "emitRate": 280.74274,
            "idleTime": 273.16846,
            "eruptionTime": 450.11194,
            "dormancyCycles": 45.75023,
            "activeCycles": 62.91173
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 162,
        "offsetY": 0,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "filthy_water",
            "posX": 195,
            "posY": 93,
            "emitRate": 8923.464,
            "idleTime": 226.27057,
            "eruptionTime": 270.78317,
            "dormancyCycles": 50.733425,
            "activeCycles": 60.69698
          },
          {
            "id": "salt_water",
            "posX": 223,
            "posY": 104,
            "emitRate": 7992.6025,
            "idleTime": 224.88416,
            "eruptionTime": 444.09467,
            "dormancyCycles": 48.27617,
            "activeCycles": 85.57066
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 294,
        "offsetY": 155,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 302,
            "posY": 164,
            "emitRate": 298197.78,
            "idleTime": 8879.752,
            "eruptionTime": 58.165783,
            "dormancyCycles": 44.013386,
            "activeCycles": 66.85534
          }
        ]
      },
      {
        "id": "RegolithMoonlet",
        "offsetX": 360,
        "offsetY": 155,
        "sizeX": 160,
        "sizeY": 96,
        "worldTraits": [
          "LushCore"
        ],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 394,
            "posY": 179
          }
        ],
        "geysers": []
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "SwampMoonlet",
        "q": 0,
        "r": 0
      },
      {
        "id": "MetalHeavyLandingSite",
        "q": 0,
        "r": 3
      },
      {
        "id": "OilRichWarpTarget",
        "q": 1,
        "r": -4
      },
      {
        "id": "TundraMoonlet",
        "q": 6,
        "r": -1
      },
      {
        "id": "MarshyMoonlet",
        "q": -5,
        "r": -1
      },
      {
        "id": "MooMoonlet",
        "q": 2,
        "r": 5
      },
      {
        "id": "WaterMoonlet",
        "q": -8,
        "r": 4
      },
      {
        "id": "NiobiumMoonlet",
        "q": 2,
        "r": -8
      },
      {
        "id": "RegolithMoonlet",
        "q": -4,
        "r": 10
      },
      {
        "id": "TemporalTear",
        "q": -11,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -3,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -1,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -2,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -8,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -9,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 5,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 10,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 8,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 6,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 5,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 4,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -7,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 10,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 0,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 0,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 1,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 0,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -9,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -11,
        "r": 9
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -6,
        "r": -5
      }
    ]
  },
  {
    "coordinate": "V-LUSH-C-847751391-0-0-0",
    "cluster": "V-LUSH-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaForestDefault",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "BouldersLarge",
          "Volcanoes",
          "CrashedSatellites"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 115,
            "posY": 192
          },
          {
            "id": "WarpConduitSender",
            "posX": 214,
            "posY": 236
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 78,
            "posY": 273
          },
          {
            "id": "WarpReceiver",
            "posX": 61,
            "posY": 109
          },
          {
            "id": "WarpPortal",
            "posX": 60,
            "posY": 115
          },
          {
            "id": "GeneShuffler",
            "posX": 187,
            "posY": 41
          },
          {
            "id": "GeneShuffler",
            "posX": 105,
            "posY": 49
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 22,
            "posY": 123,
            "emitRate": 6786.496,
            "idleTime": 373.46518,
            "eruptionTime": 271.97623,
            "dormancyCycles": 40.764465,
            "activeCycles": 70.53886
          },
          {
            "id": "methane",
            "posX": 140,
            "posY": 128,
            "emitRate": 390.8723,
            "idleTime": 401.12518,
            "eruptionTime": 281.06244,
            "dormancyCycles": 55.846115,
            "activeCycles": 73.01158
          },
          {
            "id": "steam",
            "posX": 176,
            "posY": 105,
            "emitRate": 6865.9688,
            "idleTime": 340.24774,
            "eruptionTime": 270.2088,
            "dormancyCycles": 52.294636,
            "activeCycles": 61.163944
          },
          {
            "id": "methane",
            "posX": 135,
            "posY": 239,
            "emitRate": 399.6412,
            "idleTime": 407.6131,
            "eruptionTime": 326.15308,
            "dormancyCycles": 46.535225,
            "activeCycles": 53.68603
          },
          {
            "id": "salt_water",
            "posX": 157,
            "posY": 167,
            "emitRate": 10746.566,
            "idleTime": 239.01271,
            "eruptionTime": 203.38783,
            "dormancyCycles": 49.436516,
            "activeCycles": 76.27332
          },
          {
            "id": "OilWell",
            "posX": 48,
            "posY": 193,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 17,
            "posY": 147,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 219,
            "posY": 206,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "big_volcano",
            "posX": 186,
            "posY": 173,
            "emitRate": 259935.19,
            "idleTime": 8759.152,
            "eruptionTime": 71.70522,
            "dormancyCycles": 79.36058,
            "activeCycles": 109.5291
          },
          {
            "id": "big_volcano",
            "posX": 98,
            "posY": 146,
            "emitRate": 280079.88,
            "idleTime": 9289.051,
            "eruptionTime": 69.15109,
            "dormancyCycles": 49.37177,
            "activeCycles": 71.30987
          },
          {
            "id": "big_volcano",
            "posX": 68,
            "posY": 75,
            "emitRate": 272518.1,
            "idleTime": 7346.2007,
            "eruptionTime": 60.537354,
            "dormancyCycles": 54.68399,
            "activeCycles": 102.84888
          },
          {
            "id": "big_volcano",
            "posX": 97,
            "posY": 240,
            "emitRate": 252929.72,
            "idleTime": 10489.416,
            "eruptionTime": 78.192604,
            "dormancyCycles": 45.093697,
            "activeCycles": 64.70038
          },
          {
            "id": "big_volcano",
            "posX": 83,
            "posY": 230,
            "emitRate": 269019.22,
            "idleTime": 10118.391,
            "eruptionTime": 79.359085,
            "dormancyCycles": 38.06011,
            "activeCycles": 59.853848
          },
          {
            "id": "big_volcano",
            "posX": 202,
            "posY": 181,
            "emitRate": 246848.72,
            "idleTime": 8847.672,
            "eruptionTime": 68.26073,
            "dormancyCycles": 40.095592,
            "activeCycles": 49.329838
          },
          {
            "id": "liquid_sulfur",
            "posX": 38,
            "posY": 65,
            "emitRate": 4946.1143,
            "idleTime": 194.3437,
            "eruptionTime": 330.0967,
            "dormancyCycles": 40.98455,
            "activeCycles": 73.00535
          },
          {
            "id": "hot_po2",
            "posX": 22,
            "posY": 239,
            "emitRate": 392.71146,
            "idleTime": 363.528,
            "eruptionTime": 296.16443,
            "dormancyCycles": 37.990177,
            "activeCycles": 42.833
          },
          {
            "id": "hot_steam",
            "posX": 62,
            "posY": 223,
            "emitRate": 3077.952,
            "idleTime": 440.68314,
            "eruptionTime": 236.35884,
            "dormancyCycles": 30.98713,
            "activeCycles": 69.62587
          },
          {
            "id": "molten_aluminum",
            "posX": 150,
            "posY": 148,
            "emitRate": 11515.3125,
            "idleTime": 745.9657,
            "eruptionTime": 37.473392,
            "dormancyCycles": 62.401913,
            "activeCycles": 115.0953
          },
          {
            "id": "hot_steam",
            "posX": 15,
            "posY": 270,
            "emitRate": 3077.952,
            "idleTime": 440.68314,
            "eruptionTime": 236.35884,
            "dormancyCycles": 30.98713,
            "activeCycles": 69.62587
          },
          {
            "id": "methane",
            "posX": 48,
            "posY": 85,
            "emitRate": 296.31677,
            "idleTime": 157.74597,
            "eruptionTime": 249.55362,
            "dormancyCycles": 60.67076,
            "activeCycles": 81.926765
          },
          {
            "id": "oil_drip",
            "posX": 23,
            "posY": 212,
            "emitRate": 309.8407,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.21025744,
            "activeCycles": 0.29290062
          },
          {
            "id": "hot_hydrogen",
            "posX": 199,
            "posY": 217,
            "emitRate": 322.45184,
            "idleTime": 199.9863,
            "eruptionTime": 238.45416,
            "dormancyCycles": 45.820923,
            "activeCycles": 50.163204
          },
          {
            "id": "small_volcano",
            "posX": 204,
            "posY": 70,
            "emitRate": 130786.945,
            "idleTime": 8884.982,
            "eruptionTime": 65.676605,
            "dormancyCycles": 42.51372,
            "activeCycles": 109.739296
          },
          {
            "id": "molten_iron",
            "posX": 17,
            "posY": 99,
            "emitRate": 6643.2563,
            "idleTime": 624.23425,
            "eruptionTime": 54.70293,
            "dormancyCycles": 34.73015,
            "activeCycles": 56.499207
          },
          {
            "id": "hot_co2",
            "posX": 158,
            "posY": 256,
            "emitRate": 402.63892,
            "idleTime": 352.26685,
            "eruptionTime": 267.09174,
            "dormancyCycles": 63.20493,
            "activeCycles": 77.49247
          },
          {
            "id": "hot_hydrogen",
            "posX": 221,
            "posY": 195,
            "emitRate": 322.45184,
            "idleTime": 199.9863,
            "eruptionTime": 238.45416,
            "dormancyCycles": 45.820923,
            "activeCycles": 50.163204
          },
          {
            "id": "OilWell",
            "posX": 231,
            "posY": 181,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 192,
            "posY": 258,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 233,
            "posY": 216,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 188,
            "posY": 130,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 219,
            "posY": 36,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 48,
            "posY": 200,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 5,
            "posY": 203,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 8,
            "posY": 228,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 85,
            "posY": 96,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 41,
            "posY": 123,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 6,
            "posY": 131,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 55,
            "posY": 35,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          }
        ]
      },
      {
        "id": "MediumSandyRadioactiveVanillaWarpPlanet",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "MagmaVents",
          "DistressSignal"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "posX": 343,
            "posY": 100
          },
          {
            "id": "WarpConduitSender",
            "posX": 374,
            "posY": 83
          },
          {
            "id": "WarpPortal",
            "posX": 316,
            "posY": 77
          },
          {
            "id": "WarpReceiver",
            "posX": 335,
            "posY": 77
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 391,
            "posY": 27,
            "emitRate": 799.95807,
            "idleTime": 470.30173,
            "eruptionTime": 217.56961,
            "dormancyCycles": 32.92511,
            "activeCycles": 97.042465
          },
          {
            "id": "liquid_co2",
            "posX": 380,
            "posY": 16,
            "emitRate": 386.5354,
            "idleTime": 230.45312,
            "eruptionTime": 281.58838,
            "dormancyCycles": 77.560394,
            "activeCycles": 80.134735
          },
          {
            "id": "steam",
            "posX": 259,
            "posY": 111,
            "emitRate": 4959.4863,
            "idleTime": 325.35342,
            "eruptionTime": 327.48782,
            "dormancyCycles": 48.122475,
            "activeCycles": 65.06834
          },
          {
            "id": "molten_gold",
            "posX": 326,
            "posY": 10,
            "emitRate": 8013.5137,
            "idleTime": 761.1709,
            "eruptionTime": 53.416233,
            "dormancyCycles": 23.904371,
            "activeCycles": 59.01388
          },
          {
            "id": "hot_water",
            "posX": 349,
            "posY": 75,
            "emitRate": 12203.376,
            "idleTime": 340.90555,
            "eruptionTime": 254.8021,
            "dormancyCycles": 57.419186,
            "activeCycles": 96.91772
          },
          {
            "id": "molten_copper",
            "posX": 360,
            "posY": 91,
            "emitRate": 11970.562,
            "idleTime": 727.7585,
            "eruptionTime": 34.201527,
            "dormancyCycles": 44.03869,
            "activeCycles": 88.934494
          },
          {
            "id": "slush_salt_water",
            "posX": 288,
            "posY": 88,
            "emitRate": 4608.613,
            "idleTime": 250.81569,
            "eruptionTime": 314.33997,
            "dormancyCycles": 68.26562,
            "activeCycles": 64.13277
          },
          {
            "id": "liquid_sulfur",
            "posX": 251,
            "posY": 8,
            "emitRate": 3780.5337,
            "idleTime": 127.71779,
            "eruptionTime": 247.53441,
            "dormancyCycles": 59.78065,
            "activeCycles": 74.53676
          },
          {
            "id": "hot_hydrogen",
            "posX": 315,
            "posY": 70,
            "emitRate": 210.05536,
            "idleTime": 66.719154,
            "eruptionTime": 262.31888,
            "dormancyCycles": 60.446316,
            "activeCycles": 66.59395
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "DistressSignal",
          "SlimeSplats"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 337,
            "posY": 187,
            "emitRate": 12319.447,
            "idleTime": 818.82355,
            "eruptionTime": 39.840282,
            "dormancyCycles": 34.997746,
            "activeCycles": 66.97766
          },
          {
            "id": "molten_iron",
            "posX": 345,
            "posY": 209,
            "emitRate": 11468.852,
            "idleTime": 770.98883,
            "eruptionTime": 36.005314,
            "dormancyCycles": 54.673912,
            "activeCycles": 77.22742
          },
          {
            "id": "molten_iron",
            "posX": 371,
            "posY": 234,
            "emitRate": 7046.766,
            "idleTime": 746.2526,
            "eruptionTime": 53.253258,
            "dormancyCycles": 51.04719,
            "activeCycles": 73.1674
          },
          {
            "id": "molten_iron",
            "posX": 355,
            "posY": 190,
            "emitRate": 8107.331,
            "idleTime": 936.42163,
            "eruptionTime": 69.63844,
            "dormancyCycles": 58.29834,
            "activeCycles": 79.3173
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 353,
            "posY": 354
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 377,
            "posY": 339,
            "emitRate": 8623.957,
            "idleTime": 662.00757,
            "eruptionTime": 37.965565,
            "dormancyCycles": 39.538044,
            "activeCycles": 60.40413
          },
          {
            "id": "molten_tungsten",
            "posX": 339,
            "posY": 314,
            "emitRate": 9031.153,
            "idleTime": 774.2508,
            "eruptionTime": 43.43518,
            "dormancyCycles": 67.55667,
            "activeCycles": 74.21273
          },
          {
            "id": "molten_tungsten",
            "posX": 380,
            "posY": 314,
            "emitRate": 6300.0356,
            "idleTime": 755.45874,
            "eruptionTime": 69.311165,
            "dormancyCycles": 47.917515,
            "activeCycles": 76.059456
          },
          {
            "id": "slimy_po2",
            "posX": 369,
            "posY": 344,
            "emitRate": 422.55124,
            "idleTime": 295.15073,
            "eruptionTime": 222.97513,
            "dormancyCycles": 57.510975,
            "activeCycles": 70.14806
          },
          {
            "id": "chlorine_gas",
            "posX": 366,
            "posY": 331,
            "emitRate": 499.8562,
            "idleTime": 421.1685,
            "eruptionTime": 211.90506,
            "dormancyCycles": 27.85113,
            "activeCycles": 64.98467
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "FrozenCore"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 447,
            "posY": 206,
            "emitRate": 266993,
            "idleTime": 9309.467,
            "eruptionTime": 67.393166,
            "dormancyCycles": 67.55667,
            "activeCycles": 74.21273
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 488,
            "posY": 42,
            "emitRate": 327.1299,
            "idleTime": 343.40952,
            "eruptionTime": 289.32736,
            "dormancyCycles": 48.533222,
            "activeCycles": 75.13553
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 286,
            "posY": 250,
            "emitRate": 9053.435,
            "idleTime": 266.9383,
            "eruptionTime": 277.9972,
            "dormancyCycles": 62.51748,
            "activeCycles": 81.631
          },
          {
            "id": "slush_water",
            "posX": 304,
            "posY": 293,
            "emitRate": 5382.307,
            "idleTime": 301.86414,
            "eruptionTime": 199.58673,
            "dormancyCycles": 51.51523,
            "activeCycles": 94.50464
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 424,
            "posY": 311
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 451,
            "posY": 290,
            "emitRate": 1967.3406,
            "idleTime": 237.08159,
            "eruptionTime": 363.5351,
            "dormancyCycles": 44.101772,
            "activeCycles": 81.9866
          },
          {
            "id": "steam",
            "posX": 419,
            "posY": 290,
            "emitRate": 5191.329,
            "idleTime": 211.91333,
            "eruptionTime": 203.75632,
            "dormancyCycles": 57.571594,
            "activeCycles": 80.3995
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaForestDefault",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumSandyRadioactiveVanillaWarpPlanet",
        "q": -3,
        "r": 0
      },
      {
        "id": "TundraMoonlet",
        "q": 0,
        "r": -5
      },
      {
        "id": "MarshyMoonlet",
        "q": 6,
        "r": -2
      },
      {
        "id": "NiobiumMoonlet",
        "q": -4,
        "r": 5
      },
      {
        "id": "MooMoonlet",
        "q": 4,
        "r": 3
      },
      {
        "id": "WaterMoonlet",
        "q": 7,
        "r": -7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -5,
        "r": -3
      },
      {
        "id": "TemporalTear",
        "q": -4,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -1,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -9,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -10,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -11,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 7,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 7,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -6,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 0,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -7,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -7,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -7,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 1,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -1,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 11,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 5,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 9,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 8,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 10,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 11,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 10,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": 3,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -11,
        "r": 5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -10,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 4,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 3,
        "r": -6
      }
    ]
  },
  {
    "coordinate": "V-SNDST-C-70190917-0-0-0",
    "cluster": "V-SNDST-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaSandstoneDefault",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 131,
            "posY": 225
          },
          {
            "id": "MassiveHeatSink",
            "posX": 135,
            "posY": 88
          },
          {
            "id": "MassiveHeatSink",
            "posX": 94,
            "posY": 145
          },
          {
            "id": "MassiveHeatSink",
            "posX": 111,
            "posY": 117
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 32,
            "posY": 162
          },
          {
            "id": "WarpConduitSender",
            "posX": 22,
            "posY": 220
          },
          {
            "id": "WarpReceiver",
            "posX": 147,
            "posY": 129
          },
          {
            "id": "WarpPortal",
            "posX": 146,
            "posY": 135
          },
          {
            "id": "GeneShuffler",
            "posX": 189,
            "posY": 217
          },
          {
            "id": "GeneShuffler",
            "posX": 140,
            "posY": 178
          },
          {
            "id": "GeneShuffler",
            "posX": 69,
            "posY": 149
          },
          {
            "id": "GeneShuffler",
            "posX": 74,
            "posY": 38
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 34,
            "posY": 38,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 202,
            "posY": 53,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 47,
            "posY": 48,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 49,
            "posY": 196,
            "emitRate": 6923.73,
            "idleTime": 204.51863,
            "eruptionTime": 428.93787,
            "dormancyCycles": 56.56423,
            "activeCycles": 59.663986
          },
          {
            "id": "steam",
            "posX": 189,
            "posY": 185,
            "emitRate": 7175.6763,
            "idleTime": 371.39038,
            "eruptionTime": 208.22522,
            "dormancyCycles": 69.19878,
            "activeCycles": 92.96103
          },
          {
            "id": "steam",
            "posX": 102,
            "posY": 91,
            "emitRate": 4125.4053,
            "idleTime": 256.338,
            "eruptionTime": 282.10864,
            "dormancyCycles": 42.157005,
            "activeCycles": 66.50498
          },
          {
            "id": "methane",
            "posX": 97,
            "posY": 197,
            "emitRate": 474.86304,
            "idleTime": 540.8366,
            "eruptionTime": 364.6459,
            "dormancyCycles": 67.731094,
            "activeCycles": 83.43912
          },
          {
            "id": "methane",
            "posX": 26,
            "posY": 247,
            "emitRate": 385.34747,
            "idleTime": 362.64532,
            "eruptionTime": 365.84235,
            "dormancyCycles": 42.438103,
            "activeCycles": 72.09032
          },
          {
            "id": "molten_copper",
            "posX": 219,
            "posY": 136,
            "emitRate": 7602.885,
            "idleTime": 813.23706,
            "eruptionTime": 60.307648,
            "dormancyCycles": 56.371635,
            "activeCycles": 97.24395
          },
          {
            "id": "slush_water",
            "posX": 59,
            "posY": 272,
            "emitRate": 7460.192,
            "idleTime": 512.9916,
            "eruptionTime": 226.38959,
            "dormancyCycles": 46.50768,
            "activeCycles": 94.708374
          },
          {
            "id": "liquid_co2",
            "posX": 39,
            "posY": 103,
            "emitRate": 361.30325,
            "idleTime": 175.74513,
            "eruptionTime": 376.68716,
            "dormancyCycles": 45.923706,
            "activeCycles": 71.3882
          },
          {
            "id": "filthy_water",
            "posX": 219,
            "posY": 179,
            "emitRate": 7227.471,
            "idleTime": 218.42499,
            "eruptionTime": 376.33783,
            "dormancyCycles": 30.732256,
            "activeCycles": 36.243435
          },
          {
            "id": "big_volcano",
            "posX": 60,
            "posY": 302,
            "emitRate": 245992,
            "idleTime": 10142.074,
            "eruptionTime": 80.63256,
            "dormancyCycles": 37.78576,
            "activeCycles": 76.4804
          },
          {
            "id": "molten_iron",
            "posX": 21,
            "posY": 181,
            "emitRate": 7424.1733,
            "idleTime": 890.083,
            "eruptionTime": 69.11475,
            "dormancyCycles": 38.389236,
            "activeCycles": 62.89638
          },
          {
            "id": "hot_hydrogen",
            "posX": 56,
            "posY": 134,
            "emitRate": 352.29596,
            "idleTime": 292.9919,
            "eruptionTime": 290.59628,
            "dormancyCycles": 58.798397,
            "activeCycles": 75.124
          },
          {
            "id": "methane",
            "posX": 70,
            "posY": 61,
            "emitRate": 426.8385,
            "idleTime": 251.64522,
            "eruptionTime": 188.21123,
            "dormancyCycles": 27.956217,
            "activeCycles": 44.304317
          },
          {
            "id": "salt_water",
            "posX": 140,
            "posY": 63,
            "emitRate": 9151.055,
            "idleTime": 244.4138,
            "eruptionTime": 266.02322,
            "dormancyCycles": 55.8933,
            "activeCycles": 62.806087
          },
          {
            "id": "filthy_water",
            "posX": 216,
            "posY": 272,
            "emitRate": 7833.949,
            "idleTime": 325.12793,
            "eruptionTime": 464.0692,
            "dormancyCycles": 37.877003,
            "activeCycles": 67.78994
          },
          {
            "id": "liquid_co2",
            "posX": 45,
            "posY": 229,
            "emitRate": 593.6806,
            "idleTime": 238.86385,
            "eruptionTime": 166.78069,
            "dormancyCycles": 58.69166,
            "activeCycles": 70.34697
          },
          {
            "id": "small_volcano",
            "posX": 103,
            "posY": 301,
            "emitRate": 147733.4,
            "idleTime": 8388.447,
            "eruptionTime": 54.624187,
            "dormancyCycles": 38.142258,
            "activeCycles": 73.45335
          }
        ]
      },
      {
        "id": "MediumRadioactiveVanillaWarpPlanet",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "Volcanoes",
          "MetalPoor"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 286,
            "posY": 119
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 290,
            "posY": 48
          },
          {
            "id": "WarpConduitSender",
            "posX": 291,
            "posY": 73
          },
          {
            "id": "WarpReceiver",
            "posX": 336,
            "posY": 73
          },
          {
            "id": "WarpPortal",
            "posX": 314,
            "posY": 73
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 295,
            "posY": 21,
            "emitRate": 465.1752,
            "idleTime": 276.57672,
            "eruptionTime": 296.3756,
            "dormancyCycles": 58.91032,
            "activeCycles": 67.76195
          },
          {
            "id": "liquid_co2",
            "posX": 385,
            "posY": 13,
            "emitRate": 361.37354,
            "idleTime": 218.42499,
            "eruptionTime": 376.33783,
            "dormancyCycles": 30.732256,
            "activeCycles": 36.243435
          },
          {
            "id": "slush_salt_water",
            "posX": 304,
            "posY": 113,
            "emitRate": 5619.531,
            "idleTime": 216.79884,
            "eruptionTime": 139.4952,
            "dormancyCycles": 31.4482,
            "activeCycles": 53.944267
          },
          {
            "id": "slush_water",
            "posX": 357,
            "posY": 130,
            "emitRate": 7451.745,
            "idleTime": 414.32062,
            "eruptionTime": 221.852,
            "dormancyCycles": 27.47365,
            "activeCycles": 37.32301
          },
          {
            "id": "salt_water",
            "posX": 265,
            "posY": 72,
            "emitRate": 11240.031,
            "idleTime": 363.14212,
            "eruptionTime": 268.28415,
            "dormancyCycles": 18.64099,
            "activeCycles": 29.646364
          },
          {
            "id": "molten_copper",
            "posX": 382,
            "posY": 107,
            "emitRate": 9053.911,
            "idleTime": 665.82495,
            "eruptionTime": 41.031536,
            "dormancyCycles": 53.57384,
            "activeCycles": 68.15286
          },
          {
            "id": "molten_copper",
            "posX": 292,
            "posY": 94,
            "emitRate": 9668.989,
            "idleTime": 886.8878,
            "eruptionTime": 54.771664,
            "dormancyCycles": 45.1274,
            "activeCycles": 77.62653
          },
          {
            "id": "molten_iron",
            "posX": 304,
            "posY": 29,
            "emitRate": 8170.294,
            "idleTime": 719.1733,
            "eruptionTime": 43.372253,
            "dormancyCycles": 34.3178,
            "activeCycles": 62.47164
          },
          {
            "id": "chlorine_gas",
            "posX": 261,
            "posY": 84,
            "emitRate": 287.23428,
            "idleTime": 328.0078,
            "eruptionTime": 507.66772,
            "dormancyCycles": 62.09774,
            "activeCycles": 78.14793
          },
          {
            "id": "methane",
            "posX": 261,
            "posY": 34,
            "emitRate": 267.0079,
            "idleTime": 185.16312,
            "eruptionTime": 322.76398,
            "dormancyCycles": 28.227488,
            "activeCycles": 45.91177
          },
          {
            "id": "big_volcano",
            "posX": 351,
            "posY": 108,
            "emitRate": 220649.88,
            "idleTime": 8698.714,
            "eruptionTime": 66.02693,
            "dormancyCycles": 28.384604,
            "activeCycles": 47.45849
          },
          {
            "id": "big_volcano",
            "posX": 332,
            "posY": 49,
            "emitRate": 193126.73,
            "idleTime": 8905.918,
            "eruptionTime": 88.64406,
            "dormancyCycles": 47.76822,
            "activeCycles": 70.437744
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "MetalRich",
          "SlimeSplats"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 341,
            "posY": 243,
            "emitRate": 6612.3604,
            "idleTime": 598.28424,
            "eruptionTime": 47.090206,
            "dormancyCycles": 65.79415,
            "activeCycles": 75.510445
          },
          {
            "id": "molten_iron",
            "posX": 362,
            "posY": 202,
            "emitRate": 7509.843,
            "idleTime": 656.0663,
            "eruptionTime": 52.84817,
            "dormancyCycles": 58.19483,
            "activeCycles": 64.08159
          },
          {
            "id": "molten_iron",
            "posX": 356,
            "posY": 214,
            "emitRate": 9312.699,
            "idleTime": 887.78436,
            "eruptionTime": 40.655323,
            "dormancyCycles": 50.393456,
            "activeCycles": 91.910225
          },
          {
            "id": "molten_iron",
            "posX": 340,
            "posY": 220,
            "emitRate": 12134.247,
            "idleTime": 563.0759,
            "eruptionTime": 26.210306,
            "dormancyCycles": 56.86175,
            "activeCycles": 75.22597
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 358,
            "posY": 361
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 364,
            "posY": 348,
            "emitRate": 8527.86,
            "idleTime": 760.29865,
            "eruptionTime": 43.80609,
            "dormancyCycles": 24.643866,
            "activeCycles": 51.567787
          },
          {
            "id": "molten_tungsten",
            "posX": 360,
            "posY": 316,
            "emitRate": 10041.309,
            "idleTime": 609.3289,
            "eruptionTime": 31.25331,
            "dormancyCycles": 43.81604,
            "activeCycles": 71.9776
          },
          {
            "id": "molten_tungsten",
            "posX": 341,
            "posY": 313,
            "emitRate": 8209.301,
            "idleTime": 745.1325,
            "eruptionTime": 55.151814,
            "dormancyCycles": 50.279987,
            "activeCycles": 86.37729
          },
          {
            "id": "hot_hydrogen",
            "posX": 380,
            "posY": 358,
            "emitRate": 369.3809,
            "idleTime": 245.2975,
            "eruptionTime": 255.32832,
            "dormancyCycles": 49.946125,
            "activeCycles": 81.646454
          },
          {
            "id": "hot_po2",
            "posX": 334,
            "posY": 348,
            "emitRate": 374.761,
            "idleTime": 387.5068,
            "eruptionTime": 345.7736,
            "dormancyCycles": 56.421635,
            "activeCycles": 78.50012
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "LushCore"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 398,
            "posY": 215,
            "emitRate": 292755.6,
            "idleTime": 9078.6,
            "eruptionTime": 62.40504,
            "dormancyCycles": 73.0061,
            "activeCycles": 91.74299
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 413,
            "posY": 31,
            "emitRate": 571.1672,
            "idleTime": 681.5339,
            "eruptionTime": 269.9025,
            "dormancyCycles": 49.413296,
            "activeCycles": 103.74678
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 281,
            "posY": 234,
            "emitRate": 8743.263,
            "idleTime": 333.41235,
            "eruptionTime": 399.3297,
            "dormancyCycles": 7.817785,
            "activeCycles": 19.270159
          },
          {
            "id": "hot_water",
            "posX": 264,
            "posY": 294,
            "emitRate": 9463.151,
            "idleTime": 251.8039,
            "eruptionTime": 323.8192,
            "dormancyCycles": 41.479942,
            "activeCycles": 58.2439
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 471,
            "posY": 306
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 403,
            "posY": 288,
            "emitRate": 4252.1567,
            "idleTime": 262.13205,
            "eruptionTime": 322.44083,
            "dormancyCycles": 52.98536,
            "activeCycles": 76.43766
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaSandstoneDefault",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumRadioactiveVanillaWarpPlanet",
        "q": 3,
        "r": -2
      },
      {
        "id": "TundraMoonlet",
        "q": -1,
        "r": -4
      },
      {
        "id": "MarshyMoonlet",
        "q": -6,
        "r": 6
      },
      {
        "id": "NiobiumMoonlet",
        "q": 4,
        "r": 1
      },
      {
        "id": "MooMoonlet",
        "q": -6,
        "r": -1
      },
      {
        "id": "WaterMoonlet",
        "q": -1,
        "r": 7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 7,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": -3,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 1,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 10,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 3,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 10,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 10,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 10,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -10,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -8,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 2,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -3,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 6,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 7,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -5,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -6,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -4,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -6,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 0,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 1,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 2,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": -3,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -11,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -4,
        "r": -4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -10,
        "r": 10
      }
    ]
  },
  {
    "coordinate": "V-SWMP-C-187559481-0-0-0",
    "cluster": "V-SWMP-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaSwampDefault",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "GeoDormant",
          "GlaciersLarge",
          "IrregularOil"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 116,
            "posY": 212
          },
          {
            "id": "MassiveHeatSink",
            "posX": 134,
            "posY": 76
          },
          {
            "id": "MassiveHeatSink",
            "posX": 121,
            "posY": 97
          },
          {
            "id": "MassiveHeatSink",
            "posX": 196,
            "posY": 85
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 153,
            "posY": 87
          },
          {
            "id": "WarpConduitSender",
            "posX": 24,
            "posY": 139
          },
          {
            "id": "WarpReceiver",
            "posX": 101,
            "posY": 80
          },
          {
            "id": "WarpPortal",
            "posX": 100,
            "posY": 86
          },
          {
            "id": "GeneShuffler",
            "posX": 130,
            "posY": 164
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 199,
            "posY": 140,
            "emitRate": 5200.067,
            "idleTime": 495.32736,
            "eruptionTime": 413.78043,
            "dormancyCycles": 56.335217,
            "activeCycles": 82.17071
          },
          {
            "id": "chlorine_gas",
            "posX": 201,
            "posY": 210,
            "emitRate": 358.00388,
            "idleTime": 182.57826,
            "eruptionTime": 218.89723,
            "dormancyCycles": 23.926329,
            "activeCycles": 56.138176
          },
          {
            "id": "steam",
            "posX": 65,
            "posY": 56,
            "emitRate": 3459.4026,
            "idleTime": 50.058098,
            "eruptionTime": 119.25187,
            "dormancyCycles": 50.743885,
            "activeCycles": 47.140457
          },
          {
            "id": "methane",
            "posX": 26,
            "posY": 95,
            "emitRate": 242.15817,
            "idleTime": 50.058098,
            "eruptionTime": 119.25187,
            "dormancyCycles": 50.743885,
            "activeCycles": 47.140457
          },
          {
            "id": "slush_water",
            "posX": 117,
            "posY": 117,
            "emitRate": 3586.6562,
            "idleTime": 142.87614,
            "eruptionTime": 310.41183,
            "dormancyCycles": 54.886257,
            "activeCycles": 54.59631
          },
          {
            "id": "slush_salt_water",
            "posX": 40,
            "posY": 269,
            "emitRate": 5513.007,
            "idleTime": 245.18234,
            "eruptionTime": 212.2239,
            "dormancyCycles": 35.875122,
            "activeCycles": 74.27392
          },
          {
            "id": "OilWell",
            "posX": 201,
            "posY": 179,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 156,
            "posY": 38,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 218,
            "posY": 38,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "slush_salt_water",
            "posX": 88,
            "posY": 124,
            "emitRate": 5508.399,
            "idleTime": 327.51794,
            "eruptionTime": 351.28552,
            "dormancyCycles": 61.297558,
            "activeCycles": 69.456474
          },
          {
            "id": "steam",
            "posX": 71,
            "posY": 274,
            "emitRate": 4820.5977,
            "idleTime": 339.18222,
            "eruptionTime": 350.54514,
            "dormancyCycles": 83.673615,
            "activeCycles": 100.11485
          },
          {
            "id": "hot_water",
            "posX": 26,
            "posY": 253,
            "emitRate": 12087.861,
            "idleTime": 290.54947,
            "eruptionTime": 260.25198,
            "dormancyCycles": 66.60828,
            "activeCycles": 92.34588
          },
          {
            "id": "hot_hydrogen",
            "posX": 66,
            "posY": 99,
            "emitRate": 303.39716,
            "idleTime": 357.38715,
            "eruptionTime": 455.55347,
            "dormancyCycles": 42.52348,
            "activeCycles": 86.07733
          },
          {
            "id": "chlorine_gas",
            "posX": 75,
            "posY": 120,
            "emitRate": 265.34534,
            "idleTime": 307.22543,
            "eruptionTime": 376.76657,
            "dormancyCycles": 71.89699,
            "activeCycles": 104.057976
          },
          {
            "id": "methane",
            "posX": 49,
            "posY": 124,
            "emitRate": 397.5441,
            "idleTime": 281.7738,
            "eruptionTime": 226.30939,
            "dormancyCycles": 43.083614,
            "activeCycles": 64.72466
          },
          {
            "id": "hot_co2",
            "posX": 17,
            "posY": 208,
            "emitRate": 339.82526,
            "idleTime": 278.4514,
            "eruptionTime": 329.20975,
            "dormancyCycles": 31.653702,
            "activeCycles": 83.853424
          },
          {
            "id": "liquid_co2",
            "posX": 17,
            "posY": 116,
            "emitRate": 565.80707,
            "idleTime": 330.63492,
            "eruptionTime": 278.99637,
            "dormancyCycles": 57.45309,
            "activeCycles": 83.51925
          },
          {
            "id": "liquid_sulfur",
            "posX": 24,
            "posY": 233,
            "emitRate": 9925.01,
            "idleTime": 606.4543,
            "eruptionTime": 200.3948,
            "dormancyCycles": 41.412655,
            "activeCycles": 59.673706
          },
          {
            "id": "molten_copper",
            "posX": 194,
            "posY": 108,
            "emitRate": 10038.166,
            "idleTime": 639.59357,
            "eruptionTime": 39.112797,
            "dormancyCycles": 53.78046,
            "activeCycles": 93.73582
          },
          {
            "id": "molten_cobalt",
            "posX": 223,
            "posY": 245,
            "emitRate": 8876.923,
            "idleTime": 805.9015,
            "eruptionTime": 50.087093,
            "dormancyCycles": 39.09751,
            "activeCycles": 65.63448
          },
          {
            "id": "molten_aluminum",
            "posX": 220,
            "posY": 159,
            "emitRate": 8723.58,
            "idleTime": 780.8452,
            "eruptionTime": 43.15261,
            "dormancyCycles": 41.9035,
            "activeCycles": 63.16326
          },
          {
            "id": "liquid_co2",
            "posX": 124,
            "posY": 43,
            "emitRate": 676.83234,
            "idleTime": 383.09894,
            "eruptionTime": 218.00934,
            "dormancyCycles": 67.05262,
            "activeCycles": 121.641914
          },
          {
            "id": "molten_iron",
            "posX": 179,
            "posY": 92,
            "emitRate": 7783.911,
            "idleTime": 547.8571,
            "eruptionTime": 40.068325,
            "dormancyCycles": 36.314266,
            "activeCycles": 63.48188
          },
          {
            "id": "hot_co2",
            "posX": 198,
            "posY": 38,
            "emitRate": 380.5608,
            "idleTime": 379.32065,
            "eruptionTime": 318.47635,
            "dormancyCycles": 42.71722,
            "activeCycles": 97.002975
          },
          {
            "id": "liquid_sulfur",
            "posX": 66,
            "posY": 37,
            "emitRate": 6538.4414,
            "idleTime": 366.29526,
            "eruptionTime": 320.1368,
            "dormancyCycles": 36.908745,
            "activeCycles": 75.64282
          },
          {
            "id": "slimy_po2",
            "posX": 45,
            "posY": 218,
            "emitRate": 429.63284,
            "idleTime": 389.17105,
            "eruptionTime": 274.7424,
            "dormancyCycles": 56.750053,
            "activeCycles": 66.35582
          },
          {
            "id": "hot_po2",
            "posX": 193,
            "posY": 225,
            "emitRate": 343.24197,
            "idleTime": 216.16695,
            "eruptionTime": 229.74437,
            "dormancyCycles": 60.06851,
            "activeCycles": 68.603546
          },
          {
            "id": "hot_co2",
            "posX": 211,
            "posY": 226,
            "emitRate": 285.8242,
            "idleTime": 268.92325,
            "eruptionTime": 418.32388,
            "dormancyCycles": 49.365616,
            "activeCycles": 83.089645
          },
          {
            "id": "oil_drip",
            "posX": 67,
            "posY": 256,
            "emitRate": 291.3949,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.19718839,
            "activeCycles": 0.25010735
          },
          {
            "id": "molten_gold",
            "posX": 93,
            "posY": 46,
            "emitRate": 9031.551,
            "idleTime": 691.17786,
            "eruptionTime": 43.66961,
            "dormancyCycles": 19.381632,
            "activeCycles": 23.048365
          },
          {
            "id": "OilWell",
            "posX": 199,
            "posY": 284,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 138,
            "posY": 140,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 193,
            "posY": 180,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 82,
            "posY": 110,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 230,
            "posY": 60,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 72,
            "posY": 111,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 229,
            "posY": 79,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 31,
            "posY": 112,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 13,
            "posY": 79,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 153,
            "posY": 263,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          }
        ]
      },
      {
        "id": "MediumForestyRadioactiveVanillaWarpPlanet",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "DistressSignal",
          "BouldersSmall"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "posX": 290,
            "posY": 41
          },
          {
            "id": "WarpConduitSender",
            "posX": 362,
            "posY": 68
          },
          {
            "id": "WarpReceiver",
            "posX": 337,
            "posY": 76
          },
          {
            "id": "WarpPortal",
            "posX": 315,
            "posY": 76
          },
          {
            "id": "GeneShuffler",
            "posX": 371,
            "posY": 56
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 336,
            "posY": 12,
            "emitRate": 563.168,
            "idleTime": 298.1301,
            "eruptionTime": 342.62405,
            "dormancyCycles": 52.857018,
            "activeCycles": 79.84817
          },
          {
            "id": "liquid_co2",
            "posX": 350,
            "posY": 23,
            "emitRate": 577.5561,
            "idleTime": 550.6058,
            "eruptionTime": 305.54358,
            "dormancyCycles": 61.39501,
            "activeCycles": 111.98125
          },
          {
            "id": "salt_water",
            "posX": 267,
            "posY": 112,
            "emitRate": 10318.511,
            "idleTime": 378.48184,
            "eruptionTime": 300.71414,
            "dormancyCycles": 41.9035,
            "activeCycles": 63.16326
          },
          {
            "id": "molten_aluminum",
            "posX": 382,
            "posY": 27,
            "emitRate": 10653.858,
            "idleTime": 741.9231,
            "eruptionTime": 40.1468,
            "dormancyCycles": 66.30889,
            "activeCycles": 67.810844
          },
          {
            "id": "hot_water",
            "posX": 295,
            "posY": 91,
            "emitRate": 13465.55,
            "idleTime": 419.72128,
            "eruptionTime": 284.25522,
            "dormancyCycles": 53.128197,
            "activeCycles": 87.932106
          },
          {
            "id": "molten_cobalt",
            "posX": 326,
            "posY": 30,
            "emitRate": 9148.364,
            "idleTime": 888.68536,
            "eruptionTime": 46.37403,
            "dormancyCycles": 52.30666,
            "activeCycles": 60.32554
          },
          {
            "id": "filthy_water",
            "posX": 272,
            "posY": 28,
            "emitRate": 16695.293,
            "idleTime": 405.05255,
            "eruptionTime": 204.90538,
            "dormancyCycles": 40.027397,
            "activeCycles": 76.067604
          },
          {
            "id": "liquid_co2",
            "posX": 254,
            "posY": 52,
            "emitRate": 472.57635,
            "idleTime": 293.7013,
            "eruptionTime": 225.42055,
            "dormancyCycles": 53.184425,
            "activeCycles": 82.04389
          },
          {
            "id": "hot_hydrogen",
            "posX": 373,
            "posY": 28,
            "emitRate": 331.3914,
            "idleTime": 205.03574,
            "eruptionTime": 248.84534,
            "dormancyCycles": 67.99966,
            "activeCycles": 98.75053
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "MetalPoor",
          "SubsurfaceOcean"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 366,
            "posY": 194,
            "emitRate": 7705.6963,
            "idleTime": 795.65735,
            "eruptionTime": 58.499146,
            "dormancyCycles": 68.518135,
            "activeCycles": 87.047165
          },
          {
            "id": "molten_iron",
            "posX": 363,
            "posY": 215,
            "emitRate": 8105.2197,
            "idleTime": 633.0871,
            "eruptionTime": 37.12552,
            "dormancyCycles": 58.58017,
            "activeCycles": 80.93877
          },
          {
            "id": "molten_iron",
            "posX": 375,
            "posY": 251,
            "emitRate": 5945.4155,
            "idleTime": 650.4332,
            "eruptionTime": 55.029804,
            "dormancyCycles": 90.00302,
            "activeCycles": 83.733635
          },
          {
            "id": "molten_iron",
            "posX": 357,
            "posY": 234,
            "emitRate": 9851.903,
            "idleTime": 844.19403,
            "eruptionTime": 51.82289,
            "dormancyCycles": 54.58546,
            "activeCycles": 69.137505
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 350,
            "posY": 359
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 341,
            "posY": 343,
            "emitRate": 8644.967,
            "idleTime": 670.05237,
            "eruptionTime": 41.255665,
            "dormancyCycles": 50.260532,
            "activeCycles": 63.07094
          },
          {
            "id": "molten_tungsten",
            "posX": 339,
            "posY": 314,
            "emitRate": 6964.5376,
            "idleTime": 627.3306,
            "eruptionTime": 46.318096,
            "dormancyCycles": 62.058826,
            "activeCycles": 78.12095
          },
          {
            "id": "molten_tungsten",
            "posX": 371,
            "posY": 313,
            "emitRate": 8644.967,
            "idleTime": 670.05237,
            "eruptionTime": 41.255665,
            "dormancyCycles": 50.260532,
            "activeCycles": 63.07094
          },
          {
            "id": "hot_po2",
            "posX": 378,
            "posY": 347,
            "emitRate": 522.0292,
            "idleTime": 303.53134,
            "eruptionTime": 188.74123,
            "dormancyCycles": 31.379137,
            "activeCycles": 53.839413
          },
          {
            "id": "hot_po2",
            "posX": 333,
            "posY": 349,
            "emitRate": 500.21912,
            "idleTime": 418.63138,
            "eruptionTime": 222.8087,
            "dormancyCycles": 69.124535,
            "activeCycles": 92.88228
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "MetalRich"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 415,
            "posY": 214,
            "emitRate": 343098.56,
            "idleTime": 7616.319,
            "eruptionTime": 47.78747,
            "dormancyCycles": 54.581806,
            "activeCycles": 76.562675
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 489,
            "posY": 37,
            "emitRate": 684.32806,
            "idleTime": 521.0171,
            "eruptionTime": 227.35202,
            "dormancyCycles": 44.29193,
            "activeCycles": 87.91423
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "hot_water",
            "posX": 308,
            "posY": 281,
            "emitRate": 16215.538,
            "idleTime": 351.66016,
            "eruptionTime": 183.2206,
            "dormancyCycles": 33.115967,
            "activeCycles": 44.829403
          },
          {
            "id": "filthy_water",
            "posX": 300,
            "posY": 250,
            "emitRate": 8320.232,
            "idleTime": 310.37305,
            "eruptionTime": 469.40106,
            "dormancyCycles": 52.314926,
            "activeCycles": 89.13241
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 464,
            "posY": 314
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 425,
            "posY": 294,
            "emitRate": 3860.014,
            "idleTime": 178.74599,
            "eruptionTime": 410.556,
            "dormancyCycles": 79.45331,
            "activeCycles": 68.64776
          },
          {
            "id": "hot_steam",
            "posX": 444,
            "posY": 288,
            "emitRate": 4382.4126,
            "idleTime": 366.96545,
            "eruptionTime": 150.55237,
            "dormancyCycles": 43.339706,
            "activeCycles": 86.75528
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaSwampDefault",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumForestyRadioactiveVanillaWarpPlanet",
        "q": 2,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": 5,
        "r": -5
      },
      {
        "id": "MarshyMoonlet",
        "q": 0,
        "r": -6
      },
      {
        "id": "NiobiumMoonlet",
        "q": -4,
        "r": 5
      },
      {
        "id": "MooMoonlet",
        "q": 1,
        "r": 6
      },
      {
        "id": "WaterMoonlet",
        "q": -7,
        "r": 2
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 8,
        "r": -1
      },
      {
        "id": "TemporalTear",
        "q": -2,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 3,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -4,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 4,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 3,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 2,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 1,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 10,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -10,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -9,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -2,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 7,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 6,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 4,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 5,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 6,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 6,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -10,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 8,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 8,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -2,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -6,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -5,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 11,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 0,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": 0,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 11,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -5,
        "r": 3
      }
    ]
  },
  {
    "coordinate": "V-OCAN-C-1748632395-0-0-0",
    "cluster": "V-OCAN-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaOceania",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "CrashedSatellites",
          "MetalPoor"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 126,
            "posY": 210
          },
          {
            "id": "MassiveHeatSink",
            "posX": 154,
            "posY": 301
          },
          {
            "id": "MassiveHeatSink",
            "posX": 193,
            "posY": 203
          },
          {
            "id": "MassiveHeatSink",
            "posX": 179,
            "posY": 75
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 58,
            "posY": 236
          },
          {
            "id": "WarpConduitSender",
            "posX": 48,
            "posY": 261
          },
          {
            "id": "WarpReceiver",
            "posX": 222,
            "posY": 147
          },
          {
            "id": "WarpPortal",
            "posX": 221,
            "posY": 153
          },
          {
            "id": "GeneShuffler",
            "posX": 216,
            "posY": 82
          },
          {
            "id": "GeneShuffler",
            "posX": 22,
            "posY": 44
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 66,
            "posY": 42,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 50,
            "posY": 41,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 155,
            "posY": 46,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 154,
            "posY": 108,
            "emitRate": 9431.119,
            "idleTime": 320.68228,
            "eruptionTime": 382.92966,
            "dormancyCycles": 75.19004,
            "activeCycles": 82.684685
          },
          {
            "id": "methane",
            "posX": 63,
            "posY": 287,
            "emitRate": 451.06116,
            "idleTime": 380.34155,
            "eruptionTime": 249.2486,
            "dormancyCycles": 47.61793,
            "activeCycles": 88.580414
          },
          {
            "id": "steam",
            "posX": 58,
            "posY": 191,
            "emitRate": 5223.471,
            "idleTime": 410.52884,
            "eruptionTime": 444.3472,
            "dormancyCycles": 39.59525,
            "activeCycles": 50.033546
          },
          {
            "id": "chlorine_gas",
            "posX": 97,
            "posY": 255,
            "emitRate": 347.84103,
            "idleTime": 220.23169,
            "eruptionTime": 237.28036,
            "dormancyCycles": 31.938099,
            "activeCycles": 54.834103
          },
          {
            "id": "steam",
            "posX": 53,
            "posY": 98,
            "emitRate": 7730.7627,
            "idleTime": 314.45212,
            "eruptionTime": 156.84149,
            "dormancyCycles": 28.28,
            "activeCycles": 72.45935
          },
          {
            "id": "slush_salt_water",
            "posX": 53,
            "posY": 126,
            "emitRate": 4361.1577,
            "idleTime": 260.79764,
            "eruptionTime": 305.6047,
            "dormancyCycles": 37.67412,
            "activeCycles": 60.380093
          },
          {
            "id": "methane",
            "posX": 136,
            "posY": 40,
            "emitRate": 356.3235,
            "idleTime": 297.07648,
            "eruptionTime": 312.61475,
            "dormancyCycles": 54.964855,
            "activeCycles": 71.60607
          },
          {
            "id": "chlorine_gas",
            "posX": 51,
            "posY": 144,
            "emitRate": 297.10443,
            "idleTime": 160.70164,
            "eruptionTime": 245.43044,
            "dormancyCycles": 44.950584,
            "activeCycles": 85.339264
          },
          {
            "id": "liquid_sulfur",
            "posX": 28,
            "posY": 116,
            "emitRate": 7453.6313,
            "idleTime": 261.82938,
            "eruptionTime": 174.36325,
            "dormancyCycles": 48.61995,
            "activeCycles": 89.91318
          },
          {
            "id": "molten_cobalt",
            "posX": 97,
            "posY": 154,
            "emitRate": 6707.713,
            "idleTime": 721.8501,
            "eruptionTime": 64.81151,
            "dormancyCycles": 59.06856,
            "activeCycles": 68.04933
          },
          {
            "id": "molten_copper",
            "posX": 226,
            "posY": 241,
            "emitRate": 6654.9854,
            "idleTime": 824.86084,
            "eruptionTime": 70.70429,
            "dormancyCycles": 51.036907,
            "activeCycles": 83.18369
          },
          {
            "id": "chlorine_gas",
            "posX": 67,
            "posY": 262,
            "emitRate": 360.82916,
            "idleTime": 286.61716,
            "eruptionTime": 284.50742,
            "dormancyCycles": 42.184948,
            "activeCycles": 57.76883
          },
          {
            "id": "molten_gold",
            "posX": 19,
            "posY": 251,
            "emitRate": 10575.677,
            "idleTime": 641.26764,
            "eruptionTime": 34.355705,
            "dormancyCycles": 48.624,
            "activeCycles": 82.226494
          },
          {
            "id": "hot_steam",
            "posX": 182,
            "posY": 144,
            "emitRate": 2230.5166,
            "idleTime": 324.335,
            "eruptionTime": 289.95944,
            "dormancyCycles": 33.853302,
            "activeCycles": 93.81269
          },
          {
            "id": "hot_steam",
            "posX": 186,
            "posY": 186,
            "emitRate": 2117.0833,
            "idleTime": 152.11945,
            "eruptionTime": 160.35864,
            "dormancyCycles": 41.86935,
            "activeCycles": 73.48174
          },
          {
            "id": "methane",
            "posX": 99,
            "posY": 77,
            "emitRate": 356.3235,
            "idleTime": 297.07648,
            "eruptionTime": 312.61475,
            "dormancyCycles": 54.964855,
            "activeCycles": 71.60607
          },
          {
            "id": "liquid_sulfur",
            "posX": 46,
            "posY": 299,
            "emitRate": 5499.217,
            "idleTime": 188.42621,
            "eruptionTime": 229.39038,
            "dormancyCycles": 51.454147,
            "activeCycles": 79.960304
          }
        ]
      },
      {
        "id": "MediumForestyWasteland",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "BouldersMixed",
          "MagmaVents"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 354,
            "posY": 107
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 375,
            "posY": 71
          },
          {
            "id": "WarpReceiver",
            "posX": 326,
            "posY": 71
          },
          {
            "id": "WarpPortal",
            "posX": 304,
            "posY": 71
          },
          {
            "id": "GeneShuffler",
            "posX": 365,
            "posY": 95
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 306,
            "posY": 23,
            "emitRate": 515.4703,
            "idleTime": 286.61716,
            "eruptionTime": 284.50742,
            "dormancyCycles": 42.184948,
            "activeCycles": 57.76883
          },
          {
            "id": "liquid_co2",
            "posX": 391,
            "posY": 23,
            "emitRate": 309.32022,
            "idleTime": 191.90912,
            "eruptionTime": 356.83417,
            "dormancyCycles": 41.64157,
            "activeCycles": 71.09758
          },
          {
            "id": "molten_copper",
            "posX": 260,
            "posY": 81,
            "emitRate": 7730.0312,
            "idleTime": 850.53265,
            "eruptionTime": 66.09322,
            "dormancyCycles": 51.616142,
            "activeCycles": 90.86449
          },
          {
            "id": "hot_steam",
            "posX": 338,
            "posY": 66,
            "emitRate": 2044.9796,
            "idleTime": 195.84973,
            "eruptionTime": 377.62085,
            "dormancyCycles": 44.948563,
            "activeCycles": 55.90531
          },
          {
            "id": "molten_gold",
            "posX": 359,
            "posY": 76,
            "emitRate": 10649.586,
            "idleTime": 736.83185,
            "eruptionTime": 47.63886,
            "dormancyCycles": 66.3096,
            "activeCycles": 82.201645
          },
          {
            "id": "slush_salt_water",
            "posX": 312,
            "posY": 36,
            "emitRate": 4343.5933,
            "idleTime": 435.54108,
            "eruptionTime": 605.1352,
            "dormancyCycles": 33.81554,
            "activeCycles": 71.712006
          },
          {
            "id": "liquid_sulfur",
            "posX": 320,
            "posY": 35,
            "emitRate": 4233.898,
            "idleTime": 153.1097,
            "eruptionTime": 184.12209,
            "dormancyCycles": 68.08543,
            "activeCycles": 73.39122
          },
          {
            "id": "hot_po2",
            "posX": 290,
            "posY": 98,
            "emitRate": 304.73865,
            "idleTime": 298.65277,
            "eruptionTime": 391.1505,
            "dormancyCycles": 40.40038,
            "activeCycles": 104.947014
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "CrashedSatellites"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 335,
            "posY": 214,
            "emitRate": 9828.663,
            "idleTime": 904.4382,
            "eruptionTime": 49.087654,
            "dormancyCycles": 35.705547,
            "activeCycles": 58.993534
          },
          {
            "id": "molten_iron",
            "posX": 375,
            "posY": 234,
            "emitRate": 11392.079,
            "idleTime": 756.3824,
            "eruptionTime": 39.122074,
            "dormancyCycles": 62.198475,
            "activeCycles": 109.3387
          },
          {
            "id": "molten_iron",
            "posX": 341,
            "posY": 200,
            "emitRate": 7651.749,
            "idleTime": 754.2375,
            "eruptionTime": 51.13449,
            "dormancyCycles": 59.409134,
            "activeCycles": 60.93942
          },
          {
            "id": "molten_iron",
            "posX": 364,
            "posY": 251,
            "emitRate": 7349.4316,
            "idleTime": 704.9905,
            "eruptionTime": 41.533226,
            "dormancyCycles": 42.303158,
            "activeCycles": 62.22426
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "DistressSignal"
        ],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 353,
            "posY": 358
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 341,
            "posY": 334,
            "emitRate": 9034.342,
            "idleTime": 868.78815,
            "eruptionTime": 49.43739,
            "dormancyCycles": 27.193172,
            "activeCycles": 42.02769
          },
          {
            "id": "molten_tungsten",
            "posX": 360,
            "posY": 313,
            "emitRate": 6184.077,
            "idleTime": 692.1564,
            "eruptionTime": 58.378017,
            "dormancyCycles": 50.09743,
            "activeCycles": 81.958206
          },
          {
            "id": "molten_tungsten",
            "posX": 377,
            "posY": 316,
            "emitRate": 7088.1494,
            "idleTime": 664.12787,
            "eruptionTime": 54.2676,
            "dormancyCycles": 58.847424,
            "activeCycles": 98.10366
          },
          {
            "id": "methane",
            "posX": 371,
            "posY": 352,
            "emitRate": 270.3398,
            "idleTime": 102.35755,
            "eruptionTime": 182.76393,
            "dormancyCycles": 48.107666,
            "activeCycles": 60.98972
          },
          {
            "id": "methane",
            "posX": 357,
            "posY": 335,
            "emitRate": 394.2535,
            "idleTime": 483.54388,
            "eruptionTime": 347.75226,
            "dormancyCycles": 59.875072,
            "activeCycles": 76.137024
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 401,
            "posY": 207,
            "emitRate": 258650.97,
            "idleTime": 8475.754,
            "eruptionTime": 64.20107,
            "dormancyCycles": 60.509747,
            "activeCycles": 81.05606
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 428,
            "posY": 29,
            "emitRate": 244.59633,
            "idleTime": 266.21338,
            "eruptionTime": 664.61096,
            "dormancyCycles": 57.89476,
            "activeCycles": 67.18001
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "hot_water",
            "posX": 291,
            "posY": 231,
            "emitRate": 10461.38,
            "idleTime": 178.77473,
            "eruptionTime": 160.11949,
            "dormancyCycles": 46.974953,
            "activeCycles": 69.54939
          },
          {
            "id": "salt_water",
            "posX": 277,
            "posY": 260,
            "emitRate": 7494.252,
            "idleTime": 213.61763,
            "eruptionTime": 368.82742,
            "dormancyCycles": 56.81427,
            "activeCycles": 73.30444
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 412,
            "posY": 304
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 446,
            "posY": 286,
            "emitRate": 2822.817,
            "idleTime": 396.22775,
            "eruptionTime": 266.27005,
            "dormancyCycles": 43.782658,
            "activeCycles": 58.05265
          },
          {
            "id": "steam",
            "posX": 409,
            "posY": 287,
            "emitRate": 9545.626,
            "idleTime": 305.33102,
            "eruptionTime": 103.39366,
            "dormancyCycles": 64.02684,
            "activeCycles": 61.901283
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaOceania",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumForestyWasteland",
        "q": 1,
        "r": -3
      },
      {
        "id": "TundraMoonlet",
        "q": 2,
        "r": 3
      },
      {
        "id": "MarshyMoonlet",
        "q": -6,
        "r": 2
      },
      {
        "id": "NiobiumMoonlet",
        "q": 6,
        "r": -5
      },
      {
        "id": "MooMoonlet",
        "q": -2,
        "r": -4
      },
      {
        "id": "WaterMoonlet",
        "q": -3,
        "r": 5
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -8,
        "r": 8
      },
      {
        "id": "TemporalTear",
        "q": 9,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -3,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 5,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 6,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 1,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 1,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 8,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -6,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -5,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -7,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -5,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 3,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 4,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -5,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -3,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -4,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -11,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 9,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 0,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 0,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 1,
        "r": -7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": 3,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -9,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": 11,
        "r": -9
      }
    ]
  },
  {
    "coordinate": "M-RAD-C-27186480-0-0-0",
    "cluster": "M-RAD-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
    {
        "id": "MiniRadioactiveOceanStart",
        "offsetX": 212,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MetalRich",
          "SlimeSplats"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 278,
            "posY": 66
          },
          {
            "id": "WarpConduitSender",
            "posX": 257,
            "posY": 51
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 295,
            "posY": 46
          },
          {
            "id": "WarpReceiver",
            "posX": 303,
            "posY": 76
          },
          {
            "id": "WarpPortal",
            "posX": 303,
            "posY": 81
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 240,
            "posY": 93,
            "emitRate": 9243.586,
            "idleTime": 364.81653,
            "eruptionTime": 382.4145,
            "dormancyCycles": 66.95169,
            "activeCycles": 74.74722
          },
          {
            "id": "slush_water",
            "posX": 240,
            "posY": 43,
            "emitRate": 4307.868,
            "idleTime": 216.8032,
            "eruptionTime": 240.08363,
            "dormancyCycles": 31.686087,
            "activeCycles": 48.21276
          },
          {
            "id": "slush_salt_water",
            "posX": 328,
            "posY": 69,
            "emitRate": 5999.1875,
            "idleTime": 361.78433,
            "eruptionTime": 281.0781,
            "dormancyCycles": 27.827448,
            "activeCycles": 89.95978
          },
          {
            "id": "slush_water",
            "posX": 260,
            "posY": 36,
            "emitRate": 5244.116,
            "idleTime": 426.6881,
            "eruptionTime": 522.5607,
            "dormancyCycles": 62.884785,
            "activeCycles": 88.96434
          }
        ]
      },
      {
        "id": "MiniBadlands",
        "offsetX": 82,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "DeepOil"
        ],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 153,
            "posY": 91
          },
          {
            "id": "GeneShuffler",
            "posX": 104,
            "posY": 38
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 108,
            "posY": 23,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 120,
            "posY": 85,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 157,
            "posY": 43,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 119,
            "posY": 55,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 140,
            "posY": 17,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 177,
            "posY": 42,
            "emitRate": 4240.802,
            "idleTime": 212.71745,
            "eruptionTime": 346.82687,
            "dormancyCycles": 45.21417,
            "activeCycles": 73.06897
          },
          {
            "id": "methane",
            "posX": 178,
            "posY": 88,
            "emitRate": 295.4363,
            "idleTime": 204.26022,
            "eruptionTime": 259.9911,
            "dormancyCycles": 41.25561,
            "activeCycles": 79.19973
          },
          {
            "id": "hot_co2",
            "posX": 143,
            "posY": 73,
            "emitRate": 274.1365,
            "idleTime": 254.9053,
            "eruptionTime": 348.20175,
            "dormancyCycles": 62.228516,
            "activeCycles": 81.84436
          },
          {
            "id": "chlorine_gas",
            "posX": 97,
            "posY": 94,
            "emitRate": 347.00464,
            "idleTime": 257.7933,
            "eruptionTime": 202.54277,
            "dormancyCycles": 30.757675,
            "activeCycles": 89.14088
          },
          {
            "id": "slimy_po2",
            "posX": 142,
            "posY": 31,
            "emitRate": 327.06488,
            "idleTime": 348.15652,
            "eruptionTime": 439.76706,
            "dormancyCycles": 44.273273,
            "activeCycles": 86.19636
          },
          {
            "id": "OilWell",
            "posX": 92,
            "posY": 37,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 85,
            "posY": 38,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 168,
            "posY": 22,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 148,
            "posY": 34,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 137,
            "posY": 30,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 137,
            "posY": 24,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 201,
            "posY": 31,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 206,
            "posY": 27,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          }
        ]
      },
      {
        "id": "MiniFlippedWarp",
        "offsetX": 342,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "DistressSignal"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 413,
            "posY": 51
          },
          {
            "id": "MassiveHeatSink",
            "posX": 436,
            "posY": 53
          },
          {
            "id": "MassiveHeatSink",
            "posX": 379,
            "posY": 28
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 384,
            "posY": 53
          },
          {
            "id": "WarpConduitSender",
            "posX": 438,
            "posY": 21
          },
          {
            "id": "WarpPortal",
            "posX": 395,
            "posY": 24
          },
          {
            "id": "WarpReceiver",
            "posX": 417,
            "posY": 24
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 410,
            "posY": 103,
            "emitRate": 5167.577,
            "idleTime": 353.17194,
            "eruptionTime": 303.82635,
            "dormancyCycles": 40.38427,
            "activeCycles": 56.22754
          },
          {
            "id": "hot_hydrogen",
            "posX": 453,
            "posY": 41,
            "emitRate": 501.00546,
            "idleTime": 251.75537,
            "eruptionTime": 129.80655,
            "dormancyCycles": 31.413624,
            "activeCycles": 56.760178
          },
          {
            "id": "big_volcano",
            "posX": 455,
            "posY": 60,
            "emitRate": 242444.94,
            "idleTime": 8362.211,
            "eruptionTime": 67.2462,
            "dormancyCycles": 56.404003,
            "activeCycles": 73.89421
          },
          {
            "id": "hot_po2",
            "posX": 435,
            "posY": 35,
            "emitRate": 429.6381,
            "idleTime": 173.14243,
            "eruptionTime": 139.15735,
            "dormancyCycles": 55.38446,
            "activeCycles": 128.6889
          }
        ]
      },
      {
        "id": "MiniMetallicSwampy",
        "offsetX": 472,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "BouldersMixed",
          "SubsurfaceOcean"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "methane",
            "posX": 500,
            "posY": 39,
            "emitRate": 383.65237,
            "idleTime": 253.4637,
            "eruptionTime": 263.295,
            "dormancyCycles": 65.46751,
            "activeCycles": 73.72041
          },
          {
            "id": "molten_cobalt",
            "posX": 527,
            "posY": 51,
            "emitRate": 6971.6636,
            "idleTime": 772.3721,
            "eruptionTime": 56.121468,
            "dormancyCycles": 24.45505,
            "activeCycles": 41.69951
          },
          {
            "id": "molten_gold",
            "posX": 507,
            "posY": 57,
            "emitRate": 20657.354,
            "idleTime": 781.3178,
            "eruptionTime": 22.686087,
            "dormancyCycles": 29.883074,
            "activeCycles": 42.23212
          },
          {
            "id": "molten_gold",
            "posX": 552,
            "posY": 26,
            "emitRate": 6971.6636,
            "idleTime": 772.3721,
            "eruptionTime": 56.121468,
            "dormancyCycles": 24.45505,
            "activeCycles": 41.69951
          },
          {
            "id": "molten_iron",
            "posX": 491,
            "posY": 68,
            "emitRate": 8200.907,
            "idleTime": 653.6234,
            "eruptionTime": 40.806973,
            "dormancyCycles": 83.94258,
            "activeCycles": 98.07906
          },
          {
            "id": "molten_aluminum",
            "posX": 495,
            "posY": 56,
            "emitRate": 6028.4946,
            "idleTime": 785.93964,
            "eruptionTime": 64.13063,
            "dormancyCycles": 42.832474,
            "activeCycles": 65.10687
          },
          {
            "id": "hot_hydrogen",
            "posX": 538,
            "posY": 67,
            "emitRate": 310.9761,
            "idleTime": 296.8648,
            "eruptionTime": 357.972,
            "dormancyCycles": 47.86326,
            "activeCycles": 98.98236
          },
          {
            "id": "slimy_po2",
            "posX": 488,
            "posY": 29,
            "emitRate": 439.4313,
            "idleTime": 452.0306,
            "eruptionTime": 288.18314,
            "dormancyCycles": 20.66025,
            "activeCycles": 25.081188
          }
        ]
      },
      {
        "id": "MiniForestFrozen",
        "offsetX": 602,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MagmaVents"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 658,
            "posY": 52,
            "emitRate": 506.68655,
            "idleTime": 396.3621,
            "eruptionTime": 188.36626,
            "dormancyCycles": 43.548756,
            "activeCycles": 58.559536
          },
          {
            "id": "slush_water",
            "posX": 691,
            "posY": 76,
            "emitRate": 2843.3164,
            "idleTime": 163.63388,
            "eruptionTime": 302.25427,
            "dormancyCycles": 58.000675,
            "activeCycles": 57.948566
          },
          {
            "id": "hot_po2",
            "posX": 626,
            "posY": 87,
            "emitRate": 482.18295,
            "idleTime": 329.15213,
            "eruptionTime": 210.56046,
            "dormancyCycles": 57.556473,
            "activeCycles": 94.98373
          },
          {
            "id": "hot_co2",
            "posX": 708,
            "posY": 46,
            "emitRate": 270.99545,
            "idleTime": 220.8466,
            "eruptionTime": 330.6906,
            "dormancyCycles": 59.185703,
            "activeCycles": 71.99121
          },
          {
            "id": "liquid_co2",
            "posX": 616,
            "posY": 79,
            "emitRate": 468.3232,
            "idleTime": 167.58632,
            "eruptionTime": 182.16585,
            "dormancyCycles": 86.502,
            "activeCycles": 132.5113
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 732,
        "offsetY": 0,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "LushCore",
          "SlimeSplats"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 741,
            "posY": 44,
            "emitRate": 8451.853,
            "idleTime": 727.998,
            "eruptionTime": 44.798504,
            "dormancyCycles": 46.53926,
            "activeCycles": 56.402115
          },
          {
            "id": "molten_iron",
            "posX": 764,
            "posY": 56,
            "emitRate": 6645.454,
            "idleTime": 765.0166,
            "eruptionTime": 65.31564,
            "dormancyCycles": 38.84642,
            "activeCycles": 98.59478
          },
          {
            "id": "molten_iron",
            "posX": 779,
            "posY": 24,
            "emitRate": 13366.424,
            "idleTime": 799.68176,
            "eruptionTime": 33.710686,
            "dormancyCycles": 32.959423,
            "activeCycles": 43.986443
          },
          {
            "id": "molten_iron",
            "posX": 785,
            "posY": 42,
            "emitRate": 6903.273,
            "idleTime": 785.9152,
            "eruptionTime": 59.141697,
            "dormancyCycles": 45.779305,
            "activeCycles": 53.37877
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 798,
        "offsetY": 0,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 835,
            "posY": 47
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 839,
            "posY": 22,
            "emitRate": 7223.316,
            "idleTime": 786.79895,
            "eruptionTime": 51.488907,
            "dormancyCycles": 48.38984,
            "activeCycles": 71.96704
          },
          {
            "id": "molten_tungsten",
            "posX": 838,
            "posY": 9,
            "emitRate": 7803.9556,
            "idleTime": 756.04834,
            "eruptionTime": 56.017227,
            "dormancyCycles": 54.99766,
            "activeCycles": 66.15473
          },
          {
            "id": "molten_tungsten",
            "posX": 852,
            "posY": 7,
            "emitRate": 8703.621,
            "idleTime": 668.9821,
            "eruptionTime": 34.670887,
            "dormancyCycles": 15.526199,
            "activeCycles": 24.378435
          },
          {
            "id": "methane",
            "posX": 836,
            "posY": 31,
            "emitRate": 276.92618,
            "idleTime": 247.4854,
            "eruptionTime": 361.18762,
            "dormancyCycles": 62.585865,
            "activeCycles": 77.34286
          },
          {
            "id": "hot_hydrogen",
            "posX": 813,
            "posY": 34,
            "emitRate": 312.86633,
            "idleTime": 261.62762,
            "eruptionTime": 396.0904,
            "dormancyCycles": 54.99766,
            "activeCycles": 66.15473
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 864,
        "offsetY": 98,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 944,
            "posY": 136,
            "emitRate": 318.5201,
            "idleTime": 120.48002,
            "eruptionTime": 148.76138,
            "dormancyCycles": 41.60732,
            "activeCycles": 57.67239
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "slush_water",
            "posX": 60,
            "posY": 61,
            "emitRate": 5440.68,
            "idleTime": 349.56943,
            "eruptionTime": 299.58408,
            "dormancyCycles": 51.46271,
            "activeCycles": 72.38838
          },
          {
            "id": "hot_water",
            "posX": 43,
            "posY": 76,
            "emitRate": 7008.897,
            "idleTime": 96.9664,
            "eruptionTime": 236.71176,
            "dormancyCycles": 31.602545,
            "activeCycles": 46.93763
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 798,
        "offsetY": 98,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "LushCore"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 854,
            "posY": 130,
            "emitRate": 254144.5,
            "idleTime": 9801.363,
            "eruptionTime": 75.4897,
            "dormancyCycles": 73.07327,
            "activeCycles": 64.72204
          }
        ]
      },
      {
        "id": "RegolithMoonlet",
        "offsetX": 864,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 940,
            "posY": 23
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 981,
            "posY": 12,
            "emitRate": 3422.753,
            "idleTime": 221.68332,
            "eruptionTime": 376.5035,
            "dormancyCycles": 63.416855,
            "activeCycles": 68.64732
          },
          {
            "id": "hot_steam",
            "posX": 965,
            "posY": 13,
            "emitRate": 2484.826,
            "idleTime": 210.55142,
            "eruptionTime": 187.28128,
            "dormancyCycles": 50.574406,
            "activeCycles": 67.928375
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlands",
        "q": 0,
        "r": 0
      },
      {
        "id": "MiniRadioactiveOceanStart",
        "q": 2,
        "r": 1
      },
      {
        "id": "MiniFlippedWarp",
        "q": 3,
        "r": -4
      },
      {
        "id": "MiniMetallicSwampy",
        "q": -2,
        "r": 3
      },
      {
        "id": "MiniForestFrozen",
        "q": -3,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": 9,
        "r": -4
      },
      {
        "id": "MarshyMoonlet",
        "q": -8,
        "r": 0
      },
      {
        "id": "MooMoonlet",
        "q": 3,
        "r": 5
      },
      {
        "id": "WaterMoonlet",
        "q": -8,
        "r": 9
      },
      {
        "id": "NiobiumMoonlet",
        "q": -3,
        "r": -7
      },
      {
        "id": "RegolithMoonlet",
        "q": 2,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": 9,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -2,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -1,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 9,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 6,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -10,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -10,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -11,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 1,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -11,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -5,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -4,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -6,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -7,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -8,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -7,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 12,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 0,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 5,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -12,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -11,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -11,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 10,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 10,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": 4,
        "r": -2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 4,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -1,
        "r": -6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 5,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -5,
        "r": 12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -10,
        "r": 12
      }
    ]
  },
  {
    "coordinate": "V-HTFST-C-294623931-0-0-0",
    "cluster": "V-HTFST-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaAridio",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "GeoActive",
          "DeepOil",
          "CrashedSatellites"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 76,
            "posY": 171
          },
          {
            "id": "WarpConduitSender",
            "posX": 217,
            "posY": 188
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 142,
            "posY": 81
          },
          {
            "id": "WarpReceiver",
            "posX": 46,
            "posY": 230
          },
          {
            "id": "WarpPortal",
            "posX": 45,
            "posY": 236
          },
          {
            "id": "GeneShuffler",
            "posX": 101,
            "posY": 226
          },
          {
            "id": "GeneShuffler",
            "posX": 31,
            "posY": 177
          },
          {
            "id": "GeneShuffler",
            "posX": 159,
            "posY": 129
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 151,
            "posY": 158,
            "emitRate": 6785.706,
            "idleTime": 241.106,
            "eruptionTime": 142.27748,
            "dormancyCycles": 45.806805,
            "activeCycles": 61.80897
          },
          {
            "id": "chlorine_gas",
            "posX": 121,
            "posY": 203,
            "emitRate": 320.73563,
            "idleTime": 279.24942,
            "eruptionTime": 314.24857,
            "dormancyCycles": 58.40424,
            "activeCycles": 64.00442
          },
          {
            "id": "steam",
            "posX": 219,
            "posY": 64,
            "emitRate": 4179.772,
            "idleTime": 178.0757,
            "eruptionTime": 404.5664,
            "dormancyCycles": 54.490467,
            "activeCycles": 85.33698
          },
          {
            "id": "methane",
            "posX": 194,
            "posY": 100,
            "emitRate": 340.16794,
            "idleTime": 308.19058,
            "eruptionTime": 358.99283,
            "dormancyCycles": 31.18983,
            "activeCycles": 47.925957
          },
          {
            "id": "salt_water",
            "posX": 219,
            "posY": 216,
            "emitRate": 11891.335,
            "idleTime": 202.52242,
            "eruptionTime": 138.97475,
            "dormancyCycles": 43.071358,
            "activeCycles": 53.650173
          },
          {
            "id": "OilWell",
            "posX": 148,
            "posY": 41,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 40,
            "posY": 45,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 96,
            "posY": 47,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "molten_cobalt",
            "posX": 124,
            "posY": 44,
            "emitRate": 9178.972,
            "idleTime": 774.5518,
            "eruptionTime": 49.61697,
            "dormancyCycles": 37.117065,
            "activeCycles": 60.92824
          },
          {
            "id": "slush_water",
            "posX": 39,
            "posY": 120,
            "emitRate": 5228.4224,
            "idleTime": 206.97162,
            "eruptionTime": 160.11908,
            "dormancyCycles": 41.145737,
            "activeCycles": 65.02471
          },
          {
            "id": "salt_water",
            "posX": 106,
            "posY": 214,
            "emitRate": 7931.2104,
            "idleTime": 212.38521,
            "eruptionTime": 315.23813,
            "dormancyCycles": 56.98556,
            "activeCycles": 75.23972
          },
          {
            "id": "liquid_sulfur",
            "posX": 171,
            "posY": 202,
            "emitRate": 4781.766,
            "idleTime": 289.47592,
            "eruptionTime": 472.113,
            "dormancyCycles": 73.29444,
            "activeCycles": 91.8847
          },
          {
            "id": "slush_water",
            "posX": 151,
            "posY": 186,
            "emitRate": 4094.418,
            "idleTime": 232.56374,
            "eruptionTime": 290.022,
            "dormancyCycles": 31.462097,
            "activeCycles": 74.05865
          },
          {
            "id": "slush_water",
            "posX": 26,
            "posY": 154,
            "emitRate": 3212.63,
            "idleTime": 147.33405,
            "eruptionTime": 344.38144,
            "dormancyCycles": 68.17313,
            "activeCycles": 72.91001
          },
          {
            "id": "hot_co2",
            "posX": 133,
            "posY": 239,
            "emitRate": 442.56894,
            "idleTime": 380.08514,
            "eruptionTime": 243.6767,
            "dormancyCycles": 50.50603,
            "activeCycles": 89.03486
          },
          {
            "id": "hot_hydrogen",
            "posX": 15,
            "posY": 271,
            "emitRate": 578.31146,
            "idleTime": 374.1572,
            "eruptionTime": 163.23555,
            "dormancyCycles": 36.043438,
            "activeCycles": 78.706955
          },
          {
            "id": "slush_salt_water",
            "posX": 29,
            "posY": 266,
            "emitRate": 5101.805,
            "idleTime": 497.5714,
            "eruptionTime": 416.45795,
            "dormancyCycles": 25.798365,
            "activeCycles": 82.81872
          },
          {
            "id": "hot_co2",
            "posX": 194,
            "posY": 44,
            "emitRate": 346.05917,
            "idleTime": 250.82831,
            "eruptionTime": 249.86539,
            "dormancyCycles": 38.949715,
            "activeCycles": 50.666183
          },
          {
            "id": "slimy_po2",
            "posX": 123,
            "posY": 100,
            "emitRate": 828.3014,
            "idleTime": 589.82086,
            "eruptionTime": 162.71677,
            "dormancyCycles": 65.00393,
            "activeCycles": 96.855804
          },
          {
            "id": "big_volcano",
            "posX": 27,
            "posY": 52,
            "emitRate": 267837.5,
            "idleTime": 9123.222,
            "eruptionTime": 66.68775,
            "dormancyCycles": 39.72919,
            "activeCycles": 58.742085
          },
          {
            "id": "molten_aluminum",
            "posX": 156,
            "posY": 56,
            "emitRate": 10326.513,
            "idleTime": 761.3448,
            "eruptionTime": 42.789818,
            "dormancyCycles": 51.108055,
            "activeCycles": 77.5825
          },
          {
            "id": "molten_gold",
            "posX": 104,
            "posY": 284,
            "emitRate": 10002.261,
            "idleTime": 688.93384,
            "eruptionTime": 39.242798,
            "dormancyCycles": 24.841623,
            "activeCycles": 67.455986
          },
          {
            "id": "chlorine_gas",
            "posX": 23,
            "posY": 135,
            "emitRate": 347.32715,
            "idleTime": 340.44962,
            "eruptionTime": 369.83493,
            "dormancyCycles": 31.291674,
            "activeCycles": 36.78388
          },
          {
            "id": "chlorine_gas",
            "posX": 24,
            "posY": 222,
            "emitRate": 519.4623,
            "idleTime": 414.96765,
            "eruptionTime": 219.55371,
            "dormancyCycles": 50.238476,
            "activeCycles": 99.028336
          },
          {
            "id": "OilWell",
            "posX": 17,
            "posY": 57,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 7,
            "posY": 46,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 63,
            "posY": 43,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 48,
            "posY": 41,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 87,
            "posY": 40,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 104,
            "posY": 38,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 108,
            "posY": 36,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 123,
            "posY": 34,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 137,
            "posY": 50,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 154,
            "posY": 36,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 186,
            "posY": 38,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 177,
            "posY": 33,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          }
        ]
      },
      {
        "id": "MediumSandySwamp",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "CrashedSatellites",
          "Volcanoes"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 294,
            "posY": 74
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 305,
            "posY": 60
          },
          {
            "id": "MassiveHeatSink",
            "posX": 343,
            "posY": 121
          },
          {
            "id": "WarpPortal",
            "posX": 323,
            "posY": 73
          },
          {
            "id": "WarpReceiver",
            "posX": 342,
            "posY": 73
          },
          {
            "id": "GeneShuffler",
            "posX": 276,
            "posY": 115
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 269,
            "posY": 11,
            "emitRate": 394.62784,
            "idleTime": 239.82062,
            "eruptionTime": 385.94434,
            "dormancyCycles": 36.332752,
            "activeCycles": 45.97493
          },
          {
            "id": "liquid_co2",
            "posX": 342,
            "posY": 35,
            "emitRate": 390.25537,
            "idleTime": 138.29297,
            "eruptionTime": 164.13266,
            "dormancyCycles": 77.221664,
            "activeCycles": 68.11872
          },
          {
            "id": "slush_salt_water",
            "posX": 305,
            "posY": 117,
            "emitRate": 7008.4165,
            "idleTime": 316.02386,
            "eruptionTime": 179.33594,
            "dormancyCycles": 49.388416,
            "activeCycles": 67.38334
          },
          {
            "id": "slush_water",
            "posX": 376,
            "posY": 125,
            "emitRate": 6018.8364,
            "idleTime": 311.71594,
            "eruptionTime": 258.25934,
            "dormancyCycles": 62.441483,
            "activeCycles": 43.50194
          },
          {
            "id": "steam",
            "posX": 368,
            "posY": 33,
            "emitRate": 5301.728,
            "idleTime": 195.24739,
            "eruptionTime": 181.45103,
            "dormancyCycles": 54.916824,
            "activeCycles": 105.64947
          },
          {
            "id": "molten_gold",
            "posX": 303,
            "posY": 95,
            "emitRate": 7549.57,
            "idleTime": 671.51764,
            "eruptionTime": 38.017124,
            "dormancyCycles": 42.952457,
            "activeCycles": 64.35386
          },
          {
            "id": "molten_cobalt",
            "posX": 359,
            "posY": 77,
            "emitRate": 7589.25,
            "idleTime": 693.3425,
            "eruptionTime": 54.71573,
            "dormancyCycles": 43.920616,
            "activeCycles": 72.014534
          },
          {
            "id": "slush_water",
            "posX": 257,
            "posY": 36,
            "emitRate": 3352.335,
            "idleTime": 177.72302,
            "eruptionTime": 380.67145,
            "dormancyCycles": 72.74121,
            "activeCycles": 80.218216
          },
          {
            "id": "liquid_co2",
            "posX": 317,
            "posY": 100,
            "emitRate": 549.18286,
            "idleTime": 331.94418,
            "eruptionTime": 376.0201,
            "dormancyCycles": 53.92779,
            "activeCycles": 57.90343
          },
          {
            "id": "hot_hydrogen",
            "posX": 287,
            "posY": 28,
            "emitRate": 404.27054,
            "idleTime": 412.20026,
            "eruptionTime": 336.6408,
            "dormancyCycles": 66.32899,
            "activeCycles": 61.332043
          },
          {
            "id": "big_volcano",
            "posX": 310,
            "posY": 47,
            "emitRate": 262554.53,
            "idleTime": 8130.1143,
            "eruptionTime": 63.952087,
            "dormancyCycles": 32.763073,
            "activeCycles": 92.544205
          },
          {
            "id": "big_volcano",
            "posX": 288,
            "posY": 100,
            "emitRate": 298079.6,
            "idleTime": 8420.414,
            "eruptionTime": 61.35296,
            "dormancyCycles": 24.841623,
            "activeCycles": 67.455986
          },
          {
            "id": "big_volcano",
            "posX": 333,
            "posY": 38,
            "emitRate": 305687.7,
            "idleTime": 8448.627,
            "eruptionTime": 63.298855,
            "dormancyCycles": 53.155575,
            "activeCycles": 71.36895
          },
          {
            "id": "big_volcano",
            "posX": 271,
            "posY": 68,
            "emitRate": 281869.38,
            "idleTime": 9936.441,
            "eruptionTime": 65.67841,
            "dormancyCycles": 46.294056,
            "activeCycles": 89.898796
          },
          {
            "id": "big_volcano",
            "posX": 369,
            "posY": 105,
            "emitRate": 284225.75,
            "idleTime": 8922.565,
            "eruptionTime": 66.78565,
            "dormancyCycles": 43.451317,
            "activeCycles": 80.0521
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "SubsurfaceOcean"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 357,
            "posY": 210,
            "emitRate": 8356.657,
            "idleTime": 795.27155,
            "eruptionTime": 48.35731,
            "dormancyCycles": 40.066315,
            "activeCycles": 73.01737
          },
          {
            "id": "molten_iron",
            "posX": 335,
            "posY": 228,
            "emitRate": 7387.4116,
            "idleTime": 751.37823,
            "eruptionTime": 50.644676,
            "dormancyCycles": 30.166042,
            "activeCycles": 93.09939
          },
          {
            "id": "molten_iron",
            "posX": 367,
            "posY": 230,
            "emitRate": 11067.496,
            "idleTime": 752.09424,
            "eruptionTime": 45.01445,
            "dormancyCycles": 59.662838,
            "activeCycles": 81.89673
          },
          {
            "id": "molten_iron",
            "posX": 375,
            "posY": 194,
            "emitRate": 6832.2446,
            "idleTime": 699.97363,
            "eruptionTime": 53.429276,
            "dormancyCycles": 53.36331,
            "activeCycles": 90.239235
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 350,
            "posY": 351
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 369,
            "posY": 351,
            "emitRate": 8419.603,
            "idleTime": 770.9475,
            "eruptionTime": 45.54235,
            "dormancyCycles": 64.26886,
            "activeCycles": 127.403854
          },
          {
            "id": "molten_tungsten",
            "posX": 333,
            "posY": 313,
            "emitRate": 8014.006,
            "idleTime": 879.5871,
            "eruptionTime": 59.79147,
            "dormancyCycles": 40.83525,
            "activeCycles": 60.12472
          },
          {
            "id": "molten_tungsten",
            "posX": 358,
            "posY": 315,
            "emitRate": 8729.923,
            "idleTime": 828.31244,
            "eruptionTime": 52.76969,
            "dormancyCycles": 65.939606,
            "activeCycles": 108.26106
          },
          {
            "id": "hot_hydrogen",
            "posX": 379,
            "posY": 342,
            "emitRate": 518.45734,
            "idleTime": 577.80756,
            "eruptionTime": 325.42212,
            "dormancyCycles": 43.155655,
            "activeCycles": 58.671947
          },
          {
            "id": "chlorine_gas",
            "posX": 347,
            "posY": 315,
            "emitRate": 325.27606,
            "idleTime": 247.46571,
            "eruptionTime": 410.85907,
            "dormancyCycles": 49.31493,
            "activeCycles": 82.73555
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "MetalRich"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 404,
            "posY": 189,
            "emitRate": 290152.53,
            "idleTime": 8753.726,
            "eruptionTime": 68.222786,
            "dormancyCycles": 62.203537,
            "activeCycles": 95.27382
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 415,
            "posY": 29,
            "emitRate": 299.2807,
            "idleTime": 338.40488,
            "eruptionTime": 334.08652,
            "dormancyCycles": 36.175594,
            "activeCycles": 47.25606
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "slush_water",
            "posX": 259,
            "posY": 248,
            "emitRate": 5897.952,
            "idleTime": 228.50844,
            "eruptionTime": 234.44533,
            "dormancyCycles": 46.81136,
            "activeCycles": 79.58729
          },
          {
            "id": "salt_water",
            "posX": 289,
            "posY": 295,
            "emitRate": 10084.961,
            "idleTime": 384.07526,
            "eruptionTime": 324.3473,
            "dormancyCycles": 70.80175,
            "activeCycles": 104.70208
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 461,
            "posY": 300
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 400,
            "posY": 291,
            "emitRate": 2899.7065,
            "idleTime": 283.31683,
            "eruptionTime": 172.7844,
            "dormancyCycles": 52.687935,
            "activeCycles": 94.70872
          },
          {
            "id": "steam",
            "posX": 410,
            "posY": 287,
            "emitRate": 5150.5806,
            "idleTime": 451.30807,
            "eruptionTime": 374.6564,
            "dormancyCycles": 33.55931,
            "activeCycles": 50.120617
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaAridio",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumSandySwamp",
        "q": 0,
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": -5,
        "r": 5
      },
      {
        "id": "MarshyMoonlet",
        "q": 1,
        "r": -6
      },
      {
        "id": "NiobiumMoonlet",
        "q": 6,
        "r": -1
      },
      {
        "id": "MooMoonlet",
        "q": 4,
        "r": 3
      },
      {
        "id": "WaterMoonlet",
        "q": -5,
        "r": -1
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 6,
        "r": -7
      },
      {
        "id": "TemporalTear",
        "q": -3,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -2,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -7,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -6,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -8,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -6,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -11,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 8,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 6,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 5,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 1,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 1,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -2,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -2,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -2,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 0,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 0,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -9,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 9,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 10,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 9,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 8,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 9,
        "r": -10
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 0,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 3,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 11,
        "r": -8
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -11,
        "r": 4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 4,
        "r": 7
      }
    ]
  },
  {
    "coordinate": "V-VOLCA-C-67065755-0-0-0",
    "cluster": "V-VOLCA-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaVolcanic",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "MetalCaves",
          "BouldersMedium",
          "CrashedSatellites",
          "DeepOil"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 122,
            "posY": 198
          },
          {
            "id": "MassiveHeatSink",
            "posX": 69,
            "posY": 297
          },
          {
            "id": "MassiveHeatSink",
            "posX": 81,
            "posY": 141
          },
          {
            "id": "MassiveHeatSink",
            "posX": 72,
            "posY": 103
          },
          {
            "id": "WarpConduitSender",
            "posX": 186,
            "posY": 248
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 168,
            "posY": 121
          },
          {
            "id": "WarpReceiver",
            "posX": 222,
            "posY": 279
          },
          {
            "id": "WarpPortal",
            "posX": 221,
            "posY": 285
          },
          {
            "id": "GeneShuffler",
            "posX": 159,
            "posY": 73
          },
          {
            "id": "GeneShuffler",
            "posX": 145,
            "posY": 177
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 173,
            "posY": 47,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 186,
            "posY": 61,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 25,
            "posY": 56,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 55,
            "posY": 272,
            "emitRate": 9405.159,
            "idleTime": 410.64575,
            "eruptionTime": 431.86774,
            "dormancyCycles": 51.309402,
            "activeCycles": 43.299637
          },
          {
            "id": "steam",
            "posX": 31,
            "posY": 112,
            "emitRate": 3447.361,
            "idleTime": 280.6577,
            "eruptionTime": 579.9436,
            "dormancyCycles": 48.31628,
            "activeCycles": 107.20693
          },
          {
            "id": "steam",
            "posX": 53,
            "posY": 223,
            "emitRate": 4061.8647,
            "idleTime": 327.22388,
            "eruptionTime": 592.62067,
            "dormancyCycles": 28.270845,
            "activeCycles": 78.672585
          },
          {
            "id": "chlorine_gas",
            "posX": 125,
            "posY": 86,
            "emitRate": 377.51706,
            "idleTime": 406.52365,
            "eruptionTime": 391.55515,
            "dormancyCycles": 44.481678,
            "activeCycles": 72.24943
          },
          {
            "id": "methane",
            "posX": 153,
            "posY": 160,
            "emitRate": 245.81204,
            "idleTime": 314.0587,
            "eruptionTime": 428.25266,
            "dormancyCycles": 35.91576,
            "activeCycles": 60.273373
          },
          {
            "id": "filthy_water",
            "posX": 89,
            "posY": 253,
            "emitRate": 16492.168,
            "idleTime": 390.48065,
            "eruptionTime": 150.20244,
            "dormancyCycles": 40.711823,
            "activeCycles": 73.20847
          },
          {
            "id": "steam",
            "posX": 189,
            "posY": 101,
            "emitRate": 3498.911,
            "idleTime": 172.92201,
            "eruptionTime": 212.5793,
            "dormancyCycles": 45.224354,
            "activeCycles": 60.666836
          },
          {
            "id": "oil_drip",
            "posX": 77,
            "posY": 165,
            "emitRate": 301.47964,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.29336175,
            "activeCycles": 0.4753533
          },
          {
            "id": "molten_aluminum",
            "posX": 177,
            "posY": 84,
            "emitRate": 9847.054,
            "idleTime": 750.2305,
            "eruptionTime": 44.451275,
            "dormancyCycles": 33.989822,
            "activeCycles": 42.69838
          },
          {
            "id": "molten_copper",
            "posX": 54,
            "posY": 44,
            "emitRate": 9081.163,
            "idleTime": 785.4112,
            "eruptionTime": 48.141487,
            "dormancyCycles": 41.26292,
            "activeCycles": 66.30316
          },
          {
            "id": "molten_gold",
            "posX": 17,
            "posY": 196,
            "emitRate": 7551.217,
            "idleTime": 722.6212,
            "eruptionTime": 55.220127,
            "dormancyCycles": 58.54804,
            "activeCycles": 89.8948
          },
          {
            "id": "hot_hydrogen",
            "posX": 111,
            "posY": 44,
            "emitRate": 387.33322,
            "idleTime": 323.99393,
            "eruptionTime": 265.56125,
            "dormancyCycles": 50.357506,
            "activeCycles": 69.63258
          },
          {
            "id": "filthy_water",
            "posX": 20,
            "posY": 77,
            "emitRate": 7865.061,
            "idleTime": 242.5882,
            "eruptionTime": 340.37982,
            "dormancyCycles": 33.970318,
            "activeCycles": 41.09374
          },
          {
            "id": "hot_co2",
            "posX": 154,
            "posY": 45,
            "emitRate": 517.385,
            "idleTime": 369.49725,
            "eruptionTime": 187.16138,
            "dormancyCycles": 66.12545,
            "activeCycles": 83.58455
          },
          {
            "id": "hot_co2",
            "posX": 25,
            "posY": 241,
            "emitRate": 267.00964,
            "idleTime": 111.37602,
            "eruptionTime": 208.54344,
            "dormancyCycles": 37.01626,
            "activeCycles": 54.634018
          },
          {
            "id": "hot_steam",
            "posX": 24,
            "posY": 157,
            "emitRate": 2149.6028,
            "idleTime": 202.51521,
            "eruptionTime": 201.4597,
            "dormancyCycles": 87.439415,
            "activeCycles": 96.80935
          },
          {
            "id": "hot_co2",
            "posX": 94,
            "posY": 126,
            "emitRate": 300.67056,
            "idleTime": 261.70206,
            "eruptionTime": 353.76993,
            "dormancyCycles": 41.19003,
            "activeCycles": 69.6746
          },
          {
            "id": "OilWell",
            "posX": 42,
            "posY": 41,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 39,
            "posY": 33,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 94,
            "posY": 34,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 96,
            "posY": 51,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 111,
            "posY": 33,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 127,
            "posY": 33,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 147,
            "posY": 31,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 136,
            "posY": 48,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 180,
            "posY": 45,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 183,
            "posY": 51,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          }
        ]
      },
      {
        "id": "MediumRadioactiveVanillaWarpPlanet",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "BouldersSmall",
          "MetalCaves"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 349,
            "posY": 135
          },
          {
            "id": "WarpConduitSender",
            "posX": 319,
            "posY": 53
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 360,
            "posY": 74
          },
          {
            "id": "WarpReceiver",
            "posX": 329,
            "posY": 72
          },
          {
            "id": "WarpPortal",
            "posX": 307,
            "posY": 72
          },
          {
            "id": "GeneShuffler",
            "posX": 387,
            "posY": 107
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 270,
            "posY": 10,
            "emitRate": 483.69455,
            "idleTime": 197.70248,
            "eruptionTime": 246.14246,
            "dormancyCycles": 31.916601,
            "activeCycles": 57.783314
          },
          {
            "id": "liquid_co2",
            "posX": 339,
            "posY": 32,
            "emitRate": 540.2006,
            "idleTime": 418.919,
            "eruptionTime": 335.49048,
            "dormancyCycles": 42.535633,
            "activeCycles": 84.37127
          },
          {
            "id": "slush_water",
            "posX": 300,
            "posY": 124,
            "emitRate": 4288.9,
            "idleTime": 305.22333,
            "eruptionTime": 258.6504,
            "dormancyCycles": 53.85226,
            "activeCycles": 98.72325
          },
          {
            "id": "slush_salt_water",
            "posX": 276,
            "posY": 136,
            "emitRate": 3733.3892,
            "idleTime": 225.26195,
            "eruptionTime": 552.0147,
            "dormancyCycles": 45.393024,
            "activeCycles": 63.945496
          },
          {
            "id": "steam",
            "posX": 373,
            "posY": 118,
            "emitRate": 4954.9897,
            "idleTime": 212.95186,
            "eruptionTime": 142.10109,
            "dormancyCycles": 46.991898,
            "activeCycles": 48.25137
          },
          {
            "id": "liquid_co2",
            "posX": 297,
            "posY": 69,
            "emitRate": 441.80258,
            "idleTime": 225.5361,
            "eruptionTime": 331.46732,
            "dormancyCycles": 47.00041,
            "activeCycles": 75.4406
          },
          {
            "id": "methane",
            "posX": 286,
            "posY": 96,
            "emitRate": 188.58182,
            "idleTime": 75.277336,
            "eruptionTime": 303.67358,
            "dormancyCycles": 54.20179,
            "activeCycles": 103.188095
          },
          {
            "id": "molten_gold",
            "posX": 393,
            "posY": 35,
            "emitRate": 9585.469,
            "idleTime": 758.21124,
            "eruptionTime": 36.6555,
            "dormancyCycles": 53.374714,
            "activeCycles": 85.27319
          },
          {
            "id": "hot_water",
            "posX": 362,
            "posY": 12,
            "emitRate": 11831.577,
            "idleTime": 362.9674,
            "eruptionTime": 325.8272,
            "dormancyCycles": 43.38783,
            "activeCycles": 55.26523
          },
          {
            "id": "molten_copper",
            "posX": 360,
            "posY": 41,
            "emitRate": 6892.128,
            "idleTime": 769.3768,
            "eruptionTime": 41.81802,
            "dormancyCycles": 69,
            "activeCycles": 99.07722
          },
          {
            "id": "filthy_water",
            "posX": 271,
            "posY": 50,
            "emitRate": 10072.341,
            "idleTime": 250.32124,
            "eruptionTime": 213.18074,
            "dormancyCycles": 66.099495,
            "activeCycles": 88.44704
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "DistressSignal",
          "CrashedSatellites"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 359,
            "posY": 192,
            "emitRate": 10857.678,
            "idleTime": 777.66656,
            "eruptionTime": 36.354645,
            "dormancyCycles": 79.29423,
            "activeCycles": 93.50007
          },
          {
            "id": "molten_iron",
            "posX": 369,
            "posY": 241,
            "emitRate": 8457.54,
            "idleTime": 908.87366,
            "eruptionTime": 52.273224,
            "dormancyCycles": 45.704445,
            "activeCycles": 82.05982
          },
          {
            "id": "molten_iron",
            "posX": 335,
            "posY": 187,
            "emitRate": 6608.7563,
            "idleTime": 647.1228,
            "eruptionTime": 48.92099,
            "dormancyCycles": 71.392334,
            "activeCycles": 72.57486
          },
          {
            "id": "molten_iron",
            "posX": 367,
            "posY": 211,
            "emitRate": 5467.877,
            "idleTime": 725.0036,
            "eruptionTime": 72.476295,
            "dormancyCycles": 59.17699,
            "activeCycles": 80.77487
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 361,
            "posY": 354
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 344,
            "posY": 330,
            "emitRate": 11975.614,
            "idleTime": 800.08044,
            "eruptionTime": 35.88913,
            "dormancyCycles": 38.391304,
            "activeCycles": 63.855366
          },
          {
            "id": "molten_tungsten",
            "posX": 363,
            "posY": 313,
            "emitRate": 8931.555,
            "idleTime": 703.9683,
            "eruptionTime": 43.47991,
            "dormancyCycles": 52.066063,
            "activeCycles": 81.6736
          },
          {
            "id": "molten_tungsten",
            "posX": 334,
            "posY": 313,
            "emitRate": 10096.148,
            "idleTime": 816.94336,
            "eruptionTime": 42.7605,
            "dormancyCycles": 48.584034,
            "activeCycles": 72.34688
          },
          {
            "id": "slimy_po2",
            "posX": 330,
            "posY": 337,
            "emitRate": 506.63174,
            "idleTime": 399.36652,
            "eruptionTime": 276.98126,
            "dormancyCycles": 55.55945,
            "activeCycles": 84.104965
          },
          {
            "id": "hot_hydrogen",
            "posX": 360,
            "posY": 340,
            "emitRate": 373.46988,
            "idleTime": 315.64053,
            "eruptionTime": 242.05148,
            "dormancyCycles": 58.952206,
            "activeCycles": 84.37536
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "FrozenCore"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 434,
            "posY": 224,
            "emitRate": 223025.06,
            "idleTime": 7582.206,
            "eruptionTime": 64.73587,
            "dormancyCycles": 59.564102,
            "activeCycles": 87.061195
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 484,
            "posY": 31,
            "emitRate": 252.08961,
            "idleTime": 120.35613,
            "eruptionTime": 285.3867,
            "dormancyCycles": 35.736603,
            "activeCycles": 72.31758
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "filthy_water",
            "posX": 277,
            "posY": 258,
            "emitRate": 5513.425,
            "idleTime": 292.22275,
            "eruptionTime": 613.5505,
            "dormancyCycles": 40.624924,
            "activeCycles": 86.59102
          },
          {
            "id": "slush_water",
            "posX": 281,
            "posY": 238,
            "emitRate": 4504.534,
            "idleTime": 218.76152,
            "eruptionTime": 294.60687,
            "dormancyCycles": 34.196697,
            "activeCycles": 57.620735
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 413,
            "posY": 314
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 424,
            "posY": 289,
            "emitRate": 7195.3716,
            "idleTime": 256.19046,
            "eruptionTime": 219.01764,
            "dormancyCycles": 54.562233,
            "activeCycles": 72.177155
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaVolcanic",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumRadioactiveVanillaWarpPlanet",
        "q": -1,
        "r": -2
      },
      {
        "id": "TundraMoonlet",
        "q": -5,
        "r": 4
      },
      {
        "id": "MarshyMoonlet",
        "q": 6,
        "r": -4
      },
      {
        "id": "NiobiumMoonlet",
        "q": 3,
        "r": 2
      },
      {
        "id": "MooMoonlet",
        "q": 0,
        "r": -7
      },
      {
        "id": "WaterMoonlet",
        "q": -2,
        "r": 7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 8,
        "r": -1
      },
      {
        "id": "TemporalTear",
        "q": -8,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 2,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -5,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -2,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -5,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -4,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -4,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -5,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 10,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 6,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 5,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 1,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -3,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 11,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 11,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 11,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -8,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -7,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -6,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -7,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -10,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 4,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": -3,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -9,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 0,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 8,
        "r": -11
      }
    ]
  },
  {
    "coordinate": "M-FLIP-C-367023765-0-0-0",
    "cluster": "M-FLIP-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
    {
        "id": "MiniFlippedStart",
        "offsetX": 212,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "DistressSignal",
          "Geodes"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 276,
            "posY": 41
          },
          {
            "id": "MassiveHeatSink",
            "posX": 239,
            "posY": 22
          },
          {
            "id": "MassiveHeatSink",
            "posX": 293,
            "posY": 23
          },
          {
            "id": "MassiveHeatSink",
            "posX": 240,
            "posY": 58
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 274,
            "posY": 24
          },
          {
            "id": "WarpConduitSender",
            "posX": 275,
            "posY": 71
          },
          {
            "id": "WarpReceiver",
            "posX": 260,
            "posY": 54
          },
          {
            "id": "WarpPortal",
            "posX": 260,
            "posY": 59
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 264,
            "posY": 101,
            "emitRate": 3979.1194,
            "idleTime": 247.03021,
            "eruptionTime": 388.64484,
            "dormancyCycles": 51.409325,
            "activeCycles": 79.99447
          },
          {
            "id": "steam",
            "posX": 295,
            "posY": 40,
            "emitRate": 4176.6084,
            "idleTime": 268.53366,
            "eruptionTime": 453.05185,
            "dormancyCycles": 53.061855,
            "activeCycles": 48.158257
          },
          {
            "id": "methane",
            "posX": 239,
            "posY": 39,
            "emitRate": 722.9454,
            "idleTime": 268.6685,
            "eruptionTime": 102.60807,
            "dormancyCycles": 28.390944,
            "activeCycles": 37.596043
          },
          {
            "id": "hot_steam",
            "posX": 310,
            "posY": 68,
            "emitRate": 1702.8184,
            "idleTime": 187.28114,
            "eruptionTime": 381.14355,
            "dormancyCycles": 47.480934,
            "activeCycles": 68.703415
          }
        ]
      },
      {
        "id": "MiniBadlandsWarp",
        "offsetX": 82,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "SlimeSplats"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "posX": 177,
            "posY": 56
          },
          {
            "id": "WarpConduitSender",
            "posX": 98,
            "posY": 87
          },
          {
            "id": "WarpPortal",
            "posX": 136,
            "posY": 65
          },
          {
            "id": "WarpReceiver",
            "posX": 158,
            "posY": 65
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 114,
            "posY": 16,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 129,
            "posY": 35,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 194,
            "posY": 56,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 176,
            "posY": 31,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 184,
            "posY": 17,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 164,
            "posY": 101,
            "emitRate": 3275.2922,
            "idleTime": 158.3369,
            "eruptionTime": 346.4228,
            "dormancyCycles": 43.943512,
            "activeCycles": 62.95028
          },
          {
            "id": "chlorine_gas",
            "posX": 192,
            "posY": 85,
            "emitRate": 377.6609,
            "idleTime": 388.8464,
            "eruptionTime": 323.0286,
            "dormancyCycles": 51.69671,
            "activeCycles": 97.561386
          },
          {
            "id": "slimy_po2",
            "posX": 124,
            "posY": 102,
            "emitRate": 338.03455,
            "idleTime": 328.24933,
            "eruptionTime": 403.17242,
            "dormancyCycles": 58.74069,
            "activeCycles": 108.05578
          },
          {
            "id": "hot_co2",
            "posX": 118,
            "posY": 80,
            "emitRate": 432.31992,
            "idleTime": 404.39053,
            "eruptionTime": 230.94595,
            "dormancyCycles": 78.57521,
            "activeCycles": 94.8666
          },
          {
            "id": "methane",
            "posX": 156,
            "posY": 16,
            "emitRate": 260.57288,
            "idleTime": 289.0603,
            "eruptionTime": 612.6901,
            "dormancyCycles": 48.457706,
            "activeCycles": 69.87952
          }
        ]
      },
      {
        "id": "MiniMetallicSwampy",
        "offsetX": 342,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "BouldersSmall",
          "Volcanoes"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "methane",
            "posX": 392,
            "posY": 41,
            "emitRate": 422.23993,
            "idleTime": 330.14615,
            "eruptionTime": 288.10367,
            "dormancyCycles": 39.186687,
            "activeCycles": 51.207077
          },
          {
            "id": "molten_gold",
            "posX": 434,
            "posY": 35,
            "emitRate": 8842.158,
            "idleTime": 638.0495,
            "eruptionTime": 40.28599,
            "dormancyCycles": 58.51711,
            "activeCycles": 88.76435
          },
          {
            "id": "molten_cobalt",
            "posX": 368,
            "posY": 41,
            "emitRate": 7937.408,
            "idleTime": 733.971,
            "eruptionTime": 47.765575,
            "dormancyCycles": 79.437675,
            "activeCycles": 114.69089
          },
          {
            "id": "molten_cobalt",
            "posX": 416,
            "posY": 46,
            "emitRate": 6766.4214,
            "idleTime": 604.00226,
            "eruptionTime": 40.242767,
            "dormancyCycles": 46.480167,
            "activeCycles": 64.42364
          },
          {
            "id": "molten_iron",
            "posX": 353,
            "posY": 79,
            "emitRate": 7679.0425,
            "idleTime": 681.2126,
            "eruptionTime": 46.112286,
            "dormancyCycles": 56.331276,
            "activeCycles": 104.2209
          },
          {
            "id": "molten_cobalt",
            "posX": 456,
            "posY": 30,
            "emitRate": 9095.738,
            "idleTime": 634.5484,
            "eruptionTime": 37.734974,
            "dormancyCycles": 53.522842,
            "activeCycles": 66.25789
          },
          {
            "id": "molten_aluminum",
            "posX": 378,
            "posY": 95,
            "emitRate": 10056.431,
            "idleTime": 695.5155,
            "eruptionTime": 39.366913,
            "dormancyCycles": 57.272636,
            "activeCycles": 77.78686
          },
          {
            "id": "small_volcano",
            "posX": 390,
            "posY": 30,
            "emitRate": 124528.484,
            "idleTime": 9442.728,
            "eruptionTime": 67.75688,
            "dormancyCycles": 47.013348,
            "activeCycles": 66.59961
          },
          {
            "id": "big_volcano",
            "posX": 374,
            "posY": 82,
            "emitRate": 306027.44,
            "idleTime": 8513.649,
            "eruptionTime": 63.634594,
            "dormancyCycles": 23.142738,
            "activeCycles": 37.865025
          },
          {
            "id": "big_volcano",
            "posX": 454,
            "posY": 77,
            "emitRate": 212186.64,
            "idleTime": 8520.976,
            "eruptionTime": 71.361465,
            "dormancyCycles": 26.53827,
            "activeCycles": 40.08021
          },
          {
            "id": "big_volcano",
            "posX": 428,
            "posY": 69,
            "emitRate": 290397.25,
            "idleTime": 8589.444,
            "eruptionTime": 57.38181,
            "dormancyCycles": 65.888756,
            "activeCycles": 79.10859
          },
          {
            "id": "big_volcano",
            "posX": 410,
            "posY": 67,
            "emitRate": 332519.9,
            "idleTime": 8862.699,
            "eruptionTime": 59.91339,
            "dormancyCycles": 57.807404,
            "activeCycles": 67.25709
          },
          {
            "id": "big_volcano",
            "posX": 371,
            "posY": 69,
            "emitRate": 286310.47,
            "idleTime": 9146.224,
            "eruptionTime": 65.24189,
            "dormancyCycles": 54.073277,
            "activeCycles": 77.898056
          }
        ]
      },
      {
        "id": "MiniForestFrozen",
        "offsetX": 472,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MetalPoor"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 503,
            "posY": 74,
            "emitRate": 579.87775,
            "idleTime": 529.07367,
            "eruptionTime": 196.56961,
            "dormancyCycles": 66.007515,
            "activeCycles": 87.07486
          },
          {
            "id": "slush_water",
            "posX": 577,
            "posY": 54,
            "emitRate": 4146.933,
            "idleTime": 273.8261,
            "eruptionTime": 380.67456,
            "dormancyCycles": 43.931313,
            "activeCycles": 72.328445
          },
          {
            "id": "salt_water",
            "posX": 568,
            "posY": 39,
            "emitRate": 6215.9663,
            "idleTime": 84.22671,
            "eruptionTime": 554.17773,
            "dormancyCycles": 37.188297,
            "activeCycles": 69.48341
          },
          {
            "id": "methane",
            "posX": 517,
            "posY": 56,
            "emitRate": 346.39532,
            "idleTime": 374.83902,
            "eruptionTime": 272.57382,
            "dormancyCycles": 80.701645,
            "activeCycles": 119.37507
          },
          {
            "id": "liquid_sulfur",
            "posX": 541,
            "posY": 69,
            "emitRate": 6909.45,
            "idleTime": 385.75473,
            "eruptionTime": 209.18132,
            "dormancyCycles": 71.74048,
            "activeCycles": 87.59363
          }
        ]
      },
      {
        "id": "MiniRadioactiveOcean",
        "offsetX": 602,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "LushCore",
          "MetalRich"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 706,
            "posY": 26,
            "emitRate": 475.7475,
            "idleTime": 276.34152,
            "eruptionTime": 240.44028,
            "dormancyCycles": 72.69435,
            "activeCycles": 94.614296
          },
          {
            "id": "liquid_co2",
            "posX": 700,
            "posY": 40,
            "emitRate": 332.52548,
            "idleTime": 184.81868,
            "eruptionTime": 462.94308,
            "dormancyCycles": 45.164673,
            "activeCycles": 89.12082
          },
          {
            "id": "salt_water",
            "posX": 656,
            "posY": 57,
            "emitRate": 13178.094,
            "idleTime": 442.64294,
            "eruptionTime": 236.61531,
            "dormancyCycles": 58.783894,
            "activeCycles": 98.14422
          },
          {
            "id": "salt_water",
            "posX": 650,
            "posY": 16,
            "emitRate": 12165.041,
            "idleTime": 469.61984,
            "eruptionTime": 344.52988,
            "dormancyCycles": 61.806973,
            "activeCycles": 90.829704
          },
          {
            "id": "slush_salt_water",
            "posX": 673,
            "posY": 57,
            "emitRate": 2904.514,
            "idleTime": 178.22346,
            "eruptionTime": 495.9564,
            "dormancyCycles": 52.477306,
            "activeCycles": 72.6576
          },
          {
            "id": "filthy_water",
            "posX": 704,
            "posY": 14,
            "emitRate": 10279.702,
            "idleTime": 220.0919,
            "eruptionTime": 241.40062,
            "dormancyCycles": 52.739494,
            "activeCycles": 117.692535
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 732,
        "offsetY": 0,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "MetalPoor"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 774,
            "posY": 22,
            "emitRate": 11544.234,
            "idleTime": 617.52246,
            "eruptionTime": 28.25532,
            "dormancyCycles": 59.707195,
            "activeCycles": 71.278015
          },
          {
            "id": "molten_iron",
            "posX": 751,
            "posY": 11,
            "emitRate": 9953.525,
            "idleTime": 627.14233,
            "eruptionTime": 35.659607,
            "dormancyCycles": 40.0326,
            "activeCycles": 73.39273
          },
          {
            "id": "molten_iron",
            "posX": 758,
            "posY": 47,
            "emitRate": 8460.286,
            "idleTime": 777.07935,
            "eruptionTime": 45.642315,
            "dormancyCycles": 55.554337,
            "activeCycles": 70.12594
          },
          {
            "id": "molten_iron",
            "posX": 783,
            "posY": 48,
            "emitRate": 9015.348,
            "idleTime": 700.1387,
            "eruptionTime": 44.952293,
            "dormancyCycles": 23.716164,
            "activeCycles": 55.991615
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 798,
        "offsetY": 0,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "MetalRich"
        ],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 828,
            "posY": 57
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 807,
            "posY": 8,
            "emitRate": 9004.669,
            "idleTime": 763.3204,
            "eruptionTime": 44.583546,
            "dormancyCycles": 49.407326,
            "activeCycles": 85.46976
          },
          {
            "id": "molten_tungsten",
            "posX": 814,
            "posY": 6,
            "emitRate": 6014.305,
            "idleTime": 624.6137,
            "eruptionTime": 48.6337,
            "dormancyCycles": 34.87714,
            "activeCycles": 105.114746
          },
          {
            "id": "molten_tungsten",
            "posX": 853,
            "posY": 17,
            "emitRate": 6669.087,
            "idleTime": 782.9937,
            "eruptionTime": 58.372314,
            "dormancyCycles": 45.834618,
            "activeCycles": 71.33213
          },
          {
            "id": "hot_co2",
            "posX": 807,
            "posY": 36,
            "emitRate": 217.47849,
            "idleTime": 221.3418,
            "eruptionTime": 535.2407,
            "dormancyCycles": 55.516823,
            "activeCycles": 77.676704
          },
          {
            "id": "hot_co2",
            "posX": 820,
            "posY": 36,
            "emitRate": 646.8659,
            "idleTime": 462.2262,
            "eruptionTime": 199.89613,
            "dormancyCycles": 51.590786,
            "activeCycles": 66.39815
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 864,
        "offsetY": 98,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 903,
            "posY": 137,
            "emitRate": 252.298,
            "idleTime": 299.8848,
            "eruptionTime": 357.85403,
            "dormancyCycles": 58.12149,
            "activeCycles": 78.569
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 65,
            "posY": 122,
            "emitRate": 10166.36,
            "idleTime": 287.4293,
            "eruptionTime": 264.83945,
            "dormancyCycles": 58.779556,
            "activeCycles": 73.11827
          },
          {
            "id": "hot_water",
            "posX": 64,
            "posY": 76,
            "emitRate": 10495.713,
            "idleTime": 302.3526,
            "eruptionTime": 326.22644,
            "dormancyCycles": 35.26743,
            "activeCycles": 94.45422
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 798,
        "offsetY": 98,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 811,
            "posY": 112,
            "emitRate": 268669.94,
            "idleTime": 8566.698,
            "eruptionTime": 71.85323,
            "dormancyCycles": 55.60448,
            "activeCycles": 83.165245
          }
        ]
      },
      {
        "id": "RegolithMoonlet",
        "offsetX": 864,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 96,
        "worldTraits": [
          "CrashedSatellites"
        ],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 875,
            "posY": 34
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 1008,
            "posY": 8,
            "emitRate": 1961.0857,
            "idleTime": 234.44835,
            "eruptionTime": 407.0461,
            "dormancyCycles": 51.53336,
            "activeCycles": 76.57433
          },
          {
            "id": "hot_steam",
            "posX": 996,
            "posY": 10,
            "emitRate": 1834.0619,
            "idleTime": 239.39148,
            "eruptionTime": 427.93213,
            "dormancyCycles": 34.388676,
            "activeCycles": 84.7322
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlandsWarp",
        "q": 0,
        "r": 1
      },
      {
        "id": "MiniFlippedStart",
        "q": -3,
        "r": 4
      },
      {
        "id": "MiniMetallicSwampy",
        "q": 2,
        "r": -3
      },
      {
        "id": "MiniForestFrozen",
        "q": 3,
        "r": 0
      },
      {
        "id": "MiniRadioactiveOcean",
        "q": -3,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": 9,
        "r": -3
      },
      {
        "id": "MarshyMoonlet",
        "q": -7,
        "r": -1
      },
      {
        "id": "MooMoonlet",
        "q": 4,
        "r": 5
      },
      {
        "id": "WaterMoonlet",
        "q": -8,
        "r": 5
      },
      {
        "id": "NiobiumMoonlet",
        "q": 1,
        "r": 9
      },
      {
        "id": "RegolithMoonlet",
        "q": -7,
        "r": 10
      },
      {
        "id": "TemporalTear",
        "q": 11,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -1,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 8,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 8,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -12,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 3,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 2,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 4,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -5,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 12,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 7,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 6,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 6,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -4,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 12,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -3,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -2,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -2,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -3,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -11,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -12,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -10,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": 1,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 5,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -6,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -6,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -2,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 9,
        "r": -12
      }
    ]
  },
  {
    "coordinate": "V-FRST-C-1220390795-0-0-0",
    "cluster": "V-FRST-C",
    "dlcs": [
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaArboria",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "CrashedSatellites",
          "BouldersMixed"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 118,
            "posY": 170
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 44,
            "posY": 160
          },
          {
            "id": "WarpConduitSender",
            "posX": 71,
            "posY": 227
          },
          {
            "id": "MassiveHeatSink",
            "posX": 97,
            "posY": 98
          },
          {
            "id": "MassiveHeatSink",
            "posX": 218,
            "posY": 275
          },
          {
            "id": "MassiveHeatSink",
            "posX": 71,
            "posY": 100
          },
          {
            "id": "WarpReceiver",
            "posX": 48,
            "posY": 197
          },
          {
            "id": "WarpPortal",
            "posX": 47,
            "posY": 203
          },
          {
            "id": "GeneShuffler",
            "posX": 40,
            "posY": 44
          },
          {
            "id": "GeneShuffler",
            "posX": 166,
            "posY": 180
          },
          {
            "id": "GeneShuffler",
            "posX": 144,
            "posY": 249
          },
          {
            "id": "GeneShuffler",
            "posX": 137,
            "posY": 129
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 69,
            "posY": 161,
            "emitRate": 3497.9197,
            "idleTime": 216.38202,
            "eruptionTime": 326.64893,
            "dormancyCycles": 75.75159,
            "activeCycles": 83.50908
          },
          {
            "id": "methane",
            "posX": 164,
            "posY": 137,
            "emitRate": 324.22473,
            "idleTime": 237.9655,
            "eruptionTime": 225.796,
            "dormancyCycles": 33.963585,
            "activeCycles": 40.175392
          },
          {
            "id": "salt_water",
            "posX": 189,
            "posY": 66,
            "emitRate": 10007.893,
            "idleTime": 372.1589,
            "eruptionTime": 295.94522,
            "dormancyCycles": 43.50165,
            "activeCycles": 60.968945
          },
          {
            "id": "OilWell",
            "posX": 92,
            "posY": 37,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 20,
            "posY": 44,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 71,
            "posY": 35,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "molten_copper",
            "posX": 196,
            "posY": 85,
            "emitRate": 9089.227,
            "idleTime": 697.7215,
            "eruptionTime": 42.58979,
            "dormancyCycles": 67.84289,
            "activeCycles": 77.54807
          },
          {
            "id": "molten_iron",
            "posX": 103,
            "posY": 270,
            "emitRate": 7938.278,
            "idleTime": 689.5308,
            "eruptionTime": 49.500954,
            "dormancyCycles": 45.09228,
            "activeCycles": 73.92548
          },
          {
            "id": "hot_water",
            "posX": 72,
            "posY": 139,
            "emitRate": 8740.75,
            "idleTime": 346.44052,
            "eruptionTime": 362.19437,
            "dormancyCycles": 60.365555,
            "activeCycles": 91.22446
          },
          {
            "id": "hot_po2",
            "posX": 44,
            "posY": 74,
            "emitRate": 346.5495,
            "idleTime": 291.31784,
            "eruptionTime": 302.657,
            "dormancyCycles": 75.45883,
            "activeCycles": 114.784195
          },
          {
            "id": "slush_water",
            "posX": 90,
            "posY": 211,
            "emitRate": 4631.782,
            "idleTime": 237.9655,
            "eruptionTime": 225.796,
            "dormancyCycles": 33.963585,
            "activeCycles": 40.175392
          },
          {
            "id": "small_volcano",
            "posX": 35,
            "posY": 140,
            "emitRate": 131356.84,
            "idleTime": 8275.201,
            "eruptionTime": 60.802383,
            "dormancyCycles": 41.8132,
            "activeCycles": 54.38261
          },
          {
            "id": "oil_drip",
            "posX": 141,
            "posY": 39,
            "emitRate": 298.11908,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.17058446,
            "activeCycles": 0.25835124
          },
          {
            "id": "methane",
            "posX": 93,
            "posY": 232,
            "emitRate": 435.76807,
            "idleTime": 283.2844,
            "eruptionTime": 203.96631,
            "dormancyCycles": 26.47783,
            "activeCycles": 71.7585
          },
          {
            "id": "small_volcano",
            "posX": 207,
            "posY": 259,
            "emitRate": 120070.12,
            "idleTime": 9113.162,
            "eruptionTime": 73.79919,
            "dormancyCycles": 41.009598,
            "activeCycles": 66.74341
          },
          {
            "id": "steam",
            "posX": 19,
            "posY": 255,
            "emitRate": 3962.0012,
            "idleTime": 241.85301,
            "eruptionTime": 262.9286,
            "dormancyCycles": 32.620327,
            "activeCycles": 76.72242
          },
          {
            "id": "big_volcano",
            "posX": 208,
            "posY": 36,
            "emitRate": 252447.17,
            "idleTime": 8839.625,
            "eruptionTime": 68.43742,
            "dormancyCycles": 64.80567,
            "activeCycles": 92.591995
          },
          {
            "id": "molten_aluminum",
            "posX": 43,
            "posY": 89,
            "emitRate": 10320.04,
            "idleTime": 755.86505,
            "eruptionTime": 42.456646,
            "dormancyCycles": 62.611874,
            "activeCycles": 119.5941
          }
        ]
      },
      {
        "id": "MediumSandyRadioactiveVanillaWarpPlanet",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "BouldersMixed",
          "SubsurfaceOcean"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 333,
            "posY": 66
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 325,
            "posY": 48
          },
          {
            "id": "WarpPortal",
            "posX": 306,
            "posY": 78
          },
          {
            "id": "WarpReceiver",
            "posX": 325,
            "posY": 78
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 319,
            "posY": 16,
            "emitRate": 678.3252,
            "idleTime": 262.52548,
            "eruptionTime": 186.02768,
            "dormancyCycles": 44.415184,
            "activeCycles": 66.53726
          },
          {
            "id": "liquid_co2",
            "posX": 348,
            "posY": 30,
            "emitRate": 557.98535,
            "idleTime": 400.63226,
            "eruptionTime": 308.4627,
            "dormancyCycles": 39.91185,
            "activeCycles": 83.6272
          },
          {
            "id": "steam",
            "posX": 269,
            "posY": 50,
            "emitRate": 9072.731,
            "idleTime": 422.6237,
            "eruptionTime": 163.13565,
            "dormancyCycles": 68.59827,
            "activeCycles": 90.080284
          },
          {
            "id": "molten_copper",
            "posX": 384,
            "posY": 53,
            "emitRate": 7850.6104,
            "idleTime": 622.85065,
            "eruptionTime": 38.837765,
            "dormancyCycles": 32.538963,
            "activeCycles": 50.16298
          },
          {
            "id": "molten_iron",
            "posX": 332,
            "posY": 101,
            "emitRate": 6809.8804,
            "idleTime": 836.5627,
            "eruptionTime": 57.92405,
            "dormancyCycles": 37.857655,
            "activeCycles": 65.92625
          },
          {
            "id": "molten_gold",
            "posX": 268,
            "posY": 101,
            "emitRate": 6098.312,
            "idleTime": 627.83594,
            "eruptionTime": 58.46563,
            "dormancyCycles": 44.189804,
            "activeCycles": 84.60806
          },
          {
            "id": "salt_water",
            "posX": 304,
            "posY": 71,
            "emitRate": 13550.594,
            "idleTime": 474.5881,
            "eruptionTime": 313.42606,
            "dormancyCycles": 59.700325,
            "activeCycles": 92.44476
          },
          {
            "id": "hot_hydrogen",
            "posX": 387,
            "posY": 11,
            "emitRate": 442.96774,
            "idleTime": 372.69293,
            "eruptionTime": 278.97473,
            "dormancyCycles": 44.136772,
            "activeCycles": 98.787125
          },
          {
            "id": "hot_co2",
            "posX": 295,
            "posY": 27,
            "emitRate": 415.46133,
            "idleTime": 338.55896,
            "eruptionTime": 202.29468,
            "dormancyCycles": 48.462784,
            "activeCycles": 78.209435
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "CrashedSatellites"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 355,
            "posY": 211,
            "emitRate": 8012.535,
            "idleTime": 853.3687,
            "eruptionTime": 57.979893,
            "dormancyCycles": 47.01628,
            "activeCycles": 85.07139
          },
          {
            "id": "molten_iron",
            "posX": 372,
            "posY": 230,
            "emitRate": 6966.2095,
            "idleTime": 724.9316,
            "eruptionTime": 54.630142,
            "dormancyCycles": 55.114433,
            "activeCycles": 54.982716
          },
          {
            "id": "molten_iron",
            "posX": 348,
            "posY": 231,
            "emitRate": 7297.157,
            "idleTime": 778.7723,
            "eruptionTime": 55.60976,
            "dormancyCycles": 44.17974,
            "activeCycles": 72.70449
          },
          {
            "id": "molten_iron",
            "posX": 363,
            "posY": 241,
            "emitRate": 9762.038,
            "idleTime": 628.7981,
            "eruptionTime": 33.464382,
            "dormancyCycles": 42.81848,
            "activeCycles": 97.51343
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "DistressSignal"
        ],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 360,
            "posY": 354
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 349,
            "posY": 343,
            "emitRate": 7416.92,
            "idleTime": 832.86694,
            "eruptionTime": 58.951336,
            "dormancyCycles": 46.88957,
            "activeCycles": 78.04881
          },
          {
            "id": "molten_tungsten",
            "posX": 378,
            "posY": 315,
            "emitRate": 10046.76,
            "idleTime": 670.2468,
            "eruptionTime": 40.55739,
            "dormancyCycles": 64.83282,
            "activeCycles": 75.20886
          },
          {
            "id": "molten_tungsten",
            "posX": 359,
            "posY": 314,
            "emitRate": 8652.192,
            "idleTime": 701.97577,
            "eruptionTime": 42.92162,
            "dormancyCycles": 57.29705,
            "activeCycles": 63.949432
          },
          {
            "id": "hot_hydrogen",
            "posX": 366,
            "posY": 342,
            "emitRate": 274.83014,
            "idleTime": 203.90494,
            "eruptionTime": 432.4653,
            "dormancyCycles": 53.59464,
            "activeCycles": 110.39991
          },
          {
            "id": "slimy_po2",
            "posX": 366,
            "posY": 332,
            "emitRate": 255.6143,
            "idleTime": 203.93523,
            "eruptionTime": 457.84015,
            "dormancyCycles": 60.59959,
            "activeCycles": 85.33458
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 421,
            "posY": 188,
            "emitRate": 212018,
            "idleTime": 9031.111,
            "eruptionTime": 72.19961,
            "dormancyCycles": 65.084015,
            "activeCycles": 81.196205
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 487,
            "posY": 31,
            "emitRate": 467.819,
            "idleTime": 472.1018,
            "eruptionTime": 283.23798,
            "dormancyCycles": 53.800056,
            "activeCycles": 61.660683
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "filthy_water",
            "posX": 267,
            "posY": 282,
            "emitRate": 8859.547,
            "idleTime": 349.0678,
            "eruptionTime": 505.849,
            "dormancyCycles": 86.73,
            "activeCycles": 98.906815
          },
          {
            "id": "hot_water",
            "posX": 309,
            "posY": 277,
            "emitRate": 7534.0723,
            "idleTime": 330.42493,
            "eruptionTime": 395.24475,
            "dormancyCycles": 54.906334,
            "activeCycles": 102.113396
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 407,
            "posY": 319
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 445,
            "posY": 291,
            "emitRate": 2430.242,
            "idleTime": 364.48727,
            "eruptionTime": 368.56833,
            "dormancyCycles": 62.922813,
            "activeCycles": 96.690674
          },
          {
            "id": "hot_steam",
            "posX": 425,
            "posY": 289,
            "emitRate": 3740.0098,
            "idleTime": 342.46365,
            "eruptionTime": 206.28897,
            "dormancyCycles": 39.08711,
            "activeCycles": 62.42248
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaArboria",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumSandyRadioactiveVanillaWarpPlanet",
        "q": 1,
        "r": -3
      },
      {
        "id": "TundraMoonlet",
        "q": -5,
        "r": 3
      },
      {
        "id": "MarshyMoonlet",
        "q": 5,
        "r": -1
      },
      {
        "id": "NiobiumMoonlet",
        "q": -1,
        "r": 5
      },
      {
        "id": "MooMoonlet",
        "q": 3,
        "r": -7
      },
      {
        "id": "WaterMoonlet",
        "q": 7,
        "r": -6
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 4,
        "r": 4
      },
      {
        "id": "TemporalTear",
        "q": -2,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -2,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 0,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -9,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -5,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -4,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 9,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 2,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 4,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -6,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 4,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 3,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 2,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 11,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -11,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -10,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -10,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -9,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -10,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -11,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 0,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 6,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -2,
        "r": -7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": -2,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 11,
        "r": -5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 7,
        "r": -9
      }
    ]
  },
  {
    "coordinate": "V-SFRZ-C-1889980104-0-0-0",
    "cluster": "V-SFRZ-C",
    "dlcs": [
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaSandstoneFrozen",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "BouldersSmall",
          "MisalignedStart",
          "MetalRich"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 41,
            "posY": 212
          },
          {
            "id": "MassiveHeatSink",
            "posX": 133,
            "posY": 89
          },
          {
            "id": "WarpConduitSender",
            "posX": 185,
            "posY": 280
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 140,
            "posY": 172
          },
          {
            "id": "WarpReceiver",
            "posX": 202,
            "posY": 175
          },
          {
            "id": "WarpPortal",
            "posX": 201,
            "posY": 181
          },
          {
            "id": "GeneShuffler",
            "posX": 145,
            "posY": 229
          },
          {
            "id": "GeneShuffler",
            "posX": 83,
            "posY": 59
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 31,
            "posY": 153,
            "emitRate": 5479.828,
            "idleTime": 294.05884,
            "eruptionTime": 207.02844,
            "dormancyCycles": 42.606655,
            "activeCycles": 80.514404
          },
          {
            "id": "chlorine_gas",
            "posX": 25,
            "posY": 247,
            "emitRate": 277.394,
            "idleTime": 161.20044,
            "eruptionTime": 208.24872,
            "dormancyCycles": 41.9256,
            "activeCycles": 65.2843
          },
          {
            "id": "steam",
            "posX": 86,
            "posY": 252,
            "emitRate": 4141.102,
            "idleTime": 220.20406,
            "eruptionTime": 356.43362,
            "dormancyCycles": 47.75339,
            "activeCycles": 66.39176
          },
          {
            "id": "methane",
            "posX": 163,
            "posY": 80,
            "emitRate": 431.0467,
            "idleTime": 318.71106,
            "eruptionTime": 303.02228,
            "dormancyCycles": 32.722122,
            "activeCycles": 48.380157
          },
          {
            "id": "salt_water",
            "posX": 172,
            "posY": 246,
            "emitRate": 8397.639,
            "idleTime": 336.21457,
            "eruptionTime": 468.3538,
            "dormancyCycles": 48.04221,
            "activeCycles": 71.42487
          },
          {
            "id": "OilWell",
            "posX": 116,
            "posY": 44,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 163,
            "posY": 41,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 36,
            "posY": 76,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 84,
            "posY": 150,
            "emitRate": 12096.57,
            "idleTime": 497.36383,
            "eruptionTime": 319.47418,
            "dormancyCycles": 39.349922,
            "activeCycles": 56.15961
          },
          {
            "id": "steam",
            "posX": 192,
            "posY": 76,
            "emitRate": 3077.3096,
            "idleTime": 263.14554,
            "eruptionTime": 528.6495,
            "dormancyCycles": 42.794483,
            "activeCycles": 75.54506
          },
          {
            "id": "small_volcano",
            "posX": 217,
            "posY": 153,
            "emitRate": 137331.92,
            "idleTime": 9699.949,
            "eruptionTime": 68.23775,
            "dormancyCycles": 34.79547,
            "activeCycles": 64.21216
          },
          {
            "id": "hot_po2",
            "posX": 26,
            "posY": 264,
            "emitRate": 395.50775,
            "idleTime": 302.2505,
            "eruptionTime": 242.7428,
            "dormancyCycles": 32.862854,
            "activeCycles": 55.265404
          },
          {
            "id": "molten_gold",
            "posX": 130,
            "posY": 262,
            "emitRate": 8847.26,
            "idleTime": 688.1362,
            "eruptionTime": 44.848938,
            "dormancyCycles": 56.88847,
            "activeCycles": 99.214615
          },
          {
            "id": "hot_steam",
            "posX": 45,
            "posY": 269,
            "emitRate": 3152.0483,
            "idleTime": 370.51065,
            "eruptionTime": 190.60141,
            "dormancyCycles": 41.182728,
            "activeCycles": 62.788307
          },
          {
            "id": "hot_po2",
            "posX": 158,
            "posY": 111,
            "emitRate": 331.86343,
            "idleTime": 218.89014,
            "eruptionTime": 251.07486,
            "dormancyCycles": 58.84563,
            "activeCycles": 73.87551
          },
          {
            "id": "hot_co2",
            "posX": 148,
            "posY": 50,
            "emitRate": 201.4048,
            "idleTime": 75.22252,
            "eruptionTime": 471.9182,
            "dormancyCycles": 55.734585,
            "activeCycles": 66.600075
          },
          {
            "id": "slush_water",
            "posX": 161,
            "posY": 67,
            "emitRate": 3115.4702,
            "idleTime": 125.44261,
            "eruptionTime": 325.8407,
            "dormancyCycles": 57.77435,
            "activeCycles": 97.6749
          },
          {
            "id": "salt_water",
            "posX": 213,
            "posY": 88,
            "emitRate": 5795.6743,
            "idleTime": 115.055176,
            "eruptionTime": 513.3549,
            "dormancyCycles": 45.85316,
            "activeCycles": 75.451965
          },
          {
            "id": "hot_hydrogen",
            "posX": 101,
            "posY": 120,
            "emitRate": 521.3553,
            "idleTime": 272.3444,
            "eruptionTime": 136.81056,
            "dormancyCycles": 45.808342,
            "activeCycles": 70.302895
          },
          {
            "id": "chlorine_gas",
            "posX": 220,
            "posY": 120,
            "emitRate": 422.2488,
            "idleTime": 153.00197,
            "eruptionTime": 114.83537,
            "dormancyCycles": 62.785522,
            "activeCycles": 82.11614
          }
        ]
      },
      {
        "id": "MediumSwampy",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "MetalRich",
          "MagmaVents"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 365,
            "posY": 62
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 314,
            "posY": 101
          },
          {
            "id": "WarpConduitSender",
            "posX": 317,
            "posY": 56
          },
          {
            "id": "WarpReceiver",
            "posX": 326,
            "posY": 70
          },
          {
            "id": "WarpPortal",
            "posX": 304,
            "posY": 70
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 277,
            "posY": 58,
            "emitRate": 3581.3652,
            "idleTime": 262.6522,
            "eruptionTime": 357.08926,
            "dormancyCycles": 75.75379,
            "activeCycles": 63.414806
          },
          {
            "id": "chlorine_gas",
            "posX": 273,
            "posY": 78,
            "emitRate": 249.7169,
            "idleTime": 158.10391,
            "eruptionTime": 343.41718,
            "dormancyCycles": 40.21768,
            "activeCycles": 51.3484
          },
          {
            "id": "methane",
            "posX": 384,
            "posY": 60,
            "emitRate": 308.29883,
            "idleTime": 188.85905,
            "eruptionTime": 424.60623,
            "dormancyCycles": 79.48661,
            "activeCycles": 100.576675
          },
          {
            "id": "slush_water",
            "posX": 370,
            "posY": 9,
            "emitRate": 3984.7625,
            "idleTime": 291.44373,
            "eruptionTime": 296.10956,
            "dormancyCycles": 29.331741,
            "activeCycles": 58.11797
          },
          {
            "id": "molten_iron",
            "posX": 255,
            "posY": 55,
            "emitRate": 11602.926,
            "idleTime": 679.68945,
            "eruptionTime": 37.263557,
            "dormancyCycles": 42.65029,
            "activeCycles": 73.20571
          },
          {
            "id": "molten_copper",
            "posX": 299,
            "posY": 52,
            "emitRate": 6297.566,
            "idleTime": 669.0228,
            "eruptionTime": 56.266693,
            "dormancyCycles": 40.21768,
            "activeCycles": 51.3484
          },
          {
            "id": "molten_gold",
            "posX": 308,
            "posY": 8,
            "emitRate": 7676.8926,
            "idleTime": 912.77905,
            "eruptionTime": 55.938274,
            "dormancyCycles": 55.212963,
            "activeCycles": 79.77199
          },
          {
            "id": "hot_co2",
            "posX": 368,
            "posY": 113,
            "emitRate": 280.5327,
            "idleTime": 226.40544,
            "eruptionTime": 335.04755,
            "dormancyCycles": 49.18006,
            "activeCycles": 106.41711
          },
          {
            "id": "small_volcano",
            "posX": 380,
            "posY": 10,
            "emitRate": 153905.38,
            "idleTime": 9339.419,
            "eruptionTime": 65.23087,
            "dormancyCycles": 41.71603,
            "activeCycles": 79.34853
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "RadioactiveCrust"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 343,
            "posY": 239,
            "emitRate": 7745.7544,
            "idleTime": 574.9226,
            "eruptionTime": 33.979736,
            "dormancyCycles": 47.474865,
            "activeCycles": 72.30814
          },
          {
            "id": "molten_iron",
            "posX": 373,
            "posY": 205,
            "emitRate": 10048.781,
            "idleTime": 814.8365,
            "eruptionTime": 53.42184,
            "dormancyCycles": 47.731785,
            "activeCycles": 81.82186
          },
          {
            "id": "molten_iron",
            "posX": 345,
            "posY": 187,
            "emitRate": 10215.659,
            "idleTime": 708.04694,
            "eruptionTime": 42.980362,
            "dormancyCycles": 43.11712,
            "activeCycles": 100.069756
          },
          {
            "id": "molten_iron",
            "posX": 335,
            "posY": 211,
            "emitRate": 9340.856,
            "idleTime": 734.13934,
            "eruptionTime": 39.127586,
            "dormancyCycles": 61.454422,
            "activeCycles": 80.70825
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "FrozenCore"
        ],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 355,
            "posY": 358
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 373,
            "posY": 342,
            "emitRate": 9246.879,
            "idleTime": 603.9081,
            "eruptionTime": 35.01422,
            "dormancyCycles": 58.099426,
            "activeCycles": 90.891396
          },
          {
            "id": "molten_tungsten",
            "posX": 330,
            "posY": 313,
            "emitRate": 15265.816,
            "idleTime": 871.7955,
            "eruptionTime": 34.33275,
            "dormancyCycles": 58.879265,
            "activeCycles": 62.256687
          },
          {
            "id": "molten_tungsten",
            "posX": 356,
            "posY": 315,
            "emitRate": 8237.406,
            "idleTime": 648.74646,
            "eruptionTime": 42.659355,
            "dormancyCycles": 44.272175,
            "activeCycles": 75.26725
          },
          {
            "id": "hot_po2",
            "posX": 339,
            "posY": 351,
            "emitRate": 271.24304,
            "idleTime": 242.63649,
            "eruptionTime": 441.2159,
            "dormancyCycles": 53.002537,
            "activeCycles": 70.25975
          },
          {
            "id": "methane",
            "posX": 363,
            "posY": 339,
            "emitRate": 424.13684,
            "idleTime": 278.11624,
            "eruptionTime": 218.54225,
            "dormancyCycles": 26.298134,
            "activeCycles": 44.58877
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 419,
            "posY": 187,
            "emitRate": 298009.5,
            "idleTime": 7679.352,
            "eruptionTime": 53.25509,
            "dormancyCycles": 53.569614,
            "activeCycles": 74.398315
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 487,
            "posY": 38,
            "emitRate": 322.0534,
            "idleTime": 253.5843,
            "eruptionTime": 272.45917,
            "dormancyCycles": 38.151295,
            "activeCycles": 69.150925
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 299,
            "posY": 274,
            "emitRate": 13225.744,
            "idleTime": 353.81686,
            "eruptionTime": 205.57394,
            "dormancyCycles": 50.622013,
            "activeCycles": 74.44471
          },
          {
            "id": "hot_water",
            "posX": 272,
            "posY": 229,
            "emitRate": 9043.649,
            "idleTime": 208.92038,
            "eruptionTime": 298.59842,
            "dormancyCycles": 28.040878,
            "activeCycles": 65.99141
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 413,
            "posY": 308
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 432,
            "posY": 286,
            "emitRate": 4539.37,
            "idleTime": 424.09467,
            "eruptionTime": 411.61377,
            "dormancyCycles": 38.336582,
            "activeCycles": 83.351006
          },
          {
            "id": "hot_steam",
            "posX": 446,
            "posY": 291,
            "emitRate": 1837.439,
            "idleTime": 257.1551,
            "eruptionTime": 346.1317,
            "dormancyCycles": 50.019333,
            "activeCycles": 75.35523
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaSandstoneFrozen",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumSwampy",
        "q": -3,
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": 2,
        "r": -5
      },
      {
        "id": "MarshyMoonlet",
        "q": 5,
        "r": 1
      },
      {
        "id": "NiobiumMoonlet",
        "q": -2,
        "r": 6
      },
      {
        "id": "MooMoonlet",
        "q": -6,
        "r": 2
      },
      {
        "id": "WaterMoonlet",
        "q": -3,
        "r": -4
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 7,
        "r": -6
      },
      {
        "id": "TemporalTear",
        "q": -7,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 2,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -5,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 8,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 9,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 10,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 0,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -8,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 4,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 0,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 1,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 5,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 0,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -9,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 7,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -11,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -11,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 11,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 10,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -2,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -1,
        "r": -10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": -3,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -4,
        "r": 10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 5,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -6,
        "r": -5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -9,
        "r": 8
      }
    ]
  },
  {
    "coordinate": "M-SWMP-C-1474648135-0-0-0",
    "cluster": "M-SWMP-C",
    "dlcs": [
      "SpacedOut"
    ],
    "asteroids": [
    {
        "id": "MiniMetallicSwampyStart",
        "offsetX": 212,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MagmaVents"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 274,
            "posY": 72
          },
          {
            "id": "WarpConduitSender",
            "posX": 227,
            "posY": 61
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 242,
            "posY": 29
          },
          {
            "id": "WarpReceiver",
            "posX": 277,
            "posY": 31
          },
          {
            "id": "WarpPortal",
            "posX": 277,
            "posY": 36
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "posX": 298,
            "posY": 94,
            "emitRate": 483.2145,
            "idleTime": 510.76254,
            "eruptionTime": 410.89297,
            "dormancyCycles": 54.91554,
            "activeCycles": 102.839645
          },
          {
            "id": "molten_cobalt",
            "posX": 259,
            "posY": 30,
            "emitRate": 8663.302,
            "idleTime": 791.25464,
            "eruptionTime": 44.13061,
            "dormancyCycles": 67.99971,
            "activeCycles": 92.26003
          },
          {
            "id": "molten_gold",
            "posX": 326,
            "posY": 76,
            "emitRate": 8855.287,
            "idleTime": 847.2059,
            "eruptionTime": 46.808865,
            "dormancyCycles": 23.676846,
            "activeCycles": 32.47699
          },
          {
            "id": "molten_cobalt",
            "posX": 327,
            "posY": 58,
            "emitRate": 8592.021,
            "idleTime": 851.072,
            "eruptionTime": 50.407856,
            "dormancyCycles": 44.188282,
            "activeCycles": 73.03703
          },
          {
            "id": "molten_gold",
            "posX": 235,
            "posY": 90,
            "emitRate": 10609.089,
            "idleTime": 698.8744,
            "eruptionTime": 42.730213,
            "dormancyCycles": 50.736618,
            "activeCycles": 79.500534
          },
          {
            "id": "molten_copper",
            "posX": 302,
            "posY": 56,
            "emitRate": 7833.3364,
            "idleTime": 997.6652,
            "eruptionTime": 63.074398,
            "dormancyCycles": 53.70788,
            "activeCycles": 79.54457
          },
          {
            "id": "methane",
            "posX": 246,
            "posY": 72,
            "emitRate": 322.0779,
            "idleTime": 242.65717,
            "eruptionTime": 264.72833,
            "dormancyCycles": 35.210846,
            "activeCycles": 50.45283
          },
          {
            "id": "chlorine_gas",
            "posX": 226,
            "posY": 106,
            "emitRate": 389.39145,
            "idleTime": 296.12036,
            "eruptionTime": 256.21002,
            "dormancyCycles": 30.350935,
            "activeCycles": 52.661514
          }
        ]
      },
      {
        "id": "MiniBadlands",
        "offsetX": 82,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "BouldersMedium",
          "Geodes"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 140,
            "posY": 39,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 171,
            "posY": 62,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 142,
            "posY": 79,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 97,
            "posY": 45,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 129,
            "posY": 76,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 174,
            "posY": 84,
            "emitRate": 5639.2197,
            "idleTime": 303.60046,
            "eruptionTime": 354.57544,
            "dormancyCycles": 46.25009,
            "activeCycles": 62.90355
          },
          {
            "id": "chlorine_gas",
            "posX": 107,
            "posY": 61,
            "emitRate": 363.8255,
            "idleTime": 217.12346,
            "eruptionTime": 284.25998,
            "dormancyCycles": 30.514023,
            "activeCycles": 51.349323
          },
          {
            "id": "hot_hydrogen",
            "posX": 184,
            "posY": 27,
            "emitRate": 293.06534,
            "idleTime": 316.2435,
            "eruptionTime": 450.53366,
            "dormancyCycles": 49.969105,
            "activeCycles": 56.458984
          },
          {
            "id": "filthy_water",
            "posX": 141,
            "posY": 26,
            "emitRate": 17528.713,
            "idleTime": 626.59265,
            "eruptionTime": 245.52567,
            "dormancyCycles": 67.50005,
            "activeCycles": 86.7482
          },
          {
            "id": "small_volcano",
            "posX": 112,
            "posY": 83,
            "emitRate": 111675.33,
            "idleTime": 8155.43,
            "eruptionTime": 63.101856,
            "dormancyCycles": 50.33699,
            "activeCycles": 100.98262
          }
        ]
      },
      {
        "id": "MiniForestFrozenWarp",
        "offsetX": 342,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "CrashedSatellites"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 396,
            "posY": 92
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 362,
            "posY": 61
          },
          {
            "id": "WarpReceiver",
            "posX": 409,
            "posY": 63
          },
          {
            "id": "WarpPortal",
            "posX": 387,
            "posY": 63
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 449,
            "posY": 46,
            "emitRate": 423.39703,
            "idleTime": 263.58252,
            "eruptionTime": 210.90927,
            "dormancyCycles": 65.84086,
            "activeCycles": 89.665115
          },
          {
            "id": "slush_water",
            "posX": 419,
            "posY": 43,
            "emitRate": 5999.0244,
            "idleTime": 349.783,
            "eruptionTime": 255.36703,
            "dormancyCycles": 61.409374,
            "activeCycles": 88.683426
          },
          {
            "id": "chlorine_gas",
            "posX": 378,
            "posY": 35,
            "emitRate": 266.27637,
            "idleTime": 100.479324,
            "eruptionTime": 335.1361,
            "dormancyCycles": 49.30908,
            "activeCycles": 66.24374
          },
          {
            "id": "liquid_sulfur",
            "posX": 455,
            "posY": 84,
            "emitRate": 8464.961,
            "idleTime": 281.28253,
            "eruptionTime": 130.13338,
            "dormancyCycles": 47.91181,
            "activeCycles": 59.333607
          },
          {
            "id": "hot_po2",
            "posX": 454,
            "posY": 30,
            "emitRate": 276.76944,
            "idleTime": 424.70053,
            "eruptionTime": 480.0281,
            "dormancyCycles": 52.74626,
            "activeCycles": 73.29758
          }
        ]
      },
      {
        "id": "MiniFlipped",
        "offsetX": 472,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MetalCaves",
          "Geodes"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 549,
            "posY": 34
          },
          {
            "id": "MassiveHeatSink",
            "posX": 497,
            "posY": 23
          },
          {
            "id": "MassiveHeatSink",
            "posX": 573,
            "posY": 18
          },
          {
            "id": "GeneShuffler",
            "posX": 548,
            "posY": 17
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 532,
            "posY": 101,
            "emitRate": 4832.6953,
            "idleTime": 283.7261,
            "eruptionTime": 387.45383,
            "dormancyCycles": 42.890003,
            "activeCycles": 69.51827
          },
          {
            "id": "liquid_co2",
            "posX": 527,
            "posY": 41,
            "emitRate": 632.6826,
            "idleTime": 351.8134,
            "eruptionTime": 290.7853,
            "dormancyCycles": 52.153347,
            "activeCycles": 69.17918
          },
          {
            "id": "methane",
            "posX": 501,
            "posY": 50,
            "emitRate": 303.46692,
            "idleTime": 332.9669,
            "eruptionTime": 314.15884,
            "dormancyCycles": 57.57961,
            "activeCycles": 92.1168
          },
          {
            "id": "steam",
            "posX": 577,
            "posY": 43,
            "emitRate": 4005.8884,
            "idleTime": 348.99387,
            "eruptionTime": 424.22964,
            "dormancyCycles": 46.138016,
            "activeCycles": 81.78623
          }
        ]
      },
      {
        "id": "MiniRadioactiveOcean",
        "offsetX": 602,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "BouldersSmall"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 660,
            "posY": 80,
            "emitRate": 10433.508,
            "idleTime": 188.49765,
            "eruptionTime": 199.70325,
            "dormancyCycles": 29.831993,
            "activeCycles": 67.38363
          },
          {
            "id": "salt_water",
            "posX": 715,
            "posY": 96,
            "emitRate": 13869.628,
            "idleTime": 488.0666,
            "eruptionTime": 326.26855,
            "dormancyCycles": 67.05479,
            "activeCycles": 44.804295
          },
          {
            "id": "filthy_water",
            "posX": 619,
            "posY": 77,
            "emitRate": 9115.899,
            "idleTime": 188.43622,
            "eruptionTime": 272.59464,
            "dormancyCycles": 69.534096,
            "activeCycles": 75.07425
          },
          {
            "id": "slimy_po2",
            "posX": 620,
            "posY": 94,
            "emitRate": 346.578,
            "idleTime": 310.96008,
            "eruptionTime": 273.18884,
            "dormancyCycles": 58.81086,
            "activeCycles": 73.43951
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 732,
        "offsetY": 0,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "CrashedSatellites",
          "RadioactiveCrust"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 754,
            "posY": 43,
            "emitRate": 9159.28,
            "idleTime": 804.65826,
            "eruptionTime": 47.22041,
            "dormancyCycles": 42.29953,
            "activeCycles": 70.46131
          },
          {
            "id": "molten_iron",
            "posX": 742,
            "posY": 62,
            "emitRate": 8940.179,
            "idleTime": 826.06036,
            "eruptionTime": 45.431446,
            "dormancyCycles": 51.719887,
            "activeCycles": 98.09345
          },
          {
            "id": "molten_iron",
            "posX": 768,
            "posY": 31,
            "emitRate": 7579.5513,
            "idleTime": 707.7314,
            "eruptionTime": 51.361027,
            "dormancyCycles": 55.71278,
            "activeCycles": 87.510056
          },
          {
            "id": "molten_iron",
            "posX": 778,
            "posY": 47,
            "emitRate": 5656.7134,
            "idleTime": 552.9558,
            "eruptionTime": 49.092308,
            "dormancyCycles": 47.133556,
            "activeCycles": 63.805073
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 798,
        "offsetY": 0,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 829,
            "posY": 50
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 820,
            "posY": 34,
            "emitRate": 9588.076,
            "idleTime": 747.2656,
            "eruptionTime": 39.605198,
            "dormancyCycles": 51.1581,
            "activeCycles": 73.15286
          },
          {
            "id": "molten_tungsten",
            "posX": 840,
            "posY": 9,
            "emitRate": 8040.7593,
            "idleTime": 607.5734,
            "eruptionTime": 42.720074,
            "dormancyCycles": 54.600548,
            "activeCycles": 65.21018
          },
          {
            "id": "molten_tungsten",
            "posX": 852,
            "posY": 6,
            "emitRate": 13805.142,
            "idleTime": 794.641,
            "eruptionTime": 29.429945,
            "dormancyCycles": 50.49369,
            "activeCycles": 63.759537
          },
          {
            "id": "hot_co2",
            "posX": 808,
            "posY": 33,
            "emitRate": 458.68323,
            "idleTime": 420.11658,
            "eruptionTime": 264.4126,
            "dormancyCycles": 55.26033,
            "activeCycles": 84.97105
          },
          {
            "id": "hot_co2",
            "posX": 848,
            "posY": 35,
            "emitRate": 348.08478,
            "idleTime": 162.60237,
            "eruptionTime": 164.24397,
            "dormancyCycles": 54.853535,
            "activeCycles": 82.6001
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 864,
        "offsetY": 98,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 946,
            "posY": 137,
            "emitRate": 477.75455,
            "idleTime": 381.01053,
            "eruptionTime": 306.7825,
            "dormancyCycles": 40.988026,
            "activeCycles": 75.048546
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 37,
            "posY": 110,
            "emitRate": 20130.592,
            "idleTime": 269.0732,
            "eruptionTime": 122.20191,
            "dormancyCycles": 57.93506,
            "activeCycles": 72.78992
          },
          {
            "id": "filthy_water",
            "posX": 48,
            "posY": 55,
            "emitRate": 8296.915,
            "idleTime": 257.52603,
            "eruptionTime": 205.19914,
            "dormancyCycles": 42.677708,
            "activeCycles": 58.743256
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 798,
        "offsetY": 98,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "MetalRich"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 809,
            "posY": 117,
            "emitRate": 309155.28,
            "idleTime": 9260.229,
            "eruptionTime": 71.01074,
            "dormancyCycles": 49.35893,
            "activeCycles": 105.31325
          }
        ]
      },
      {
        "id": "RegolithMoonlet",
        "offsetX": 864,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 987,
            "posY": 26
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 970,
            "posY": 20,
            "emitRate": 5498.5493,
            "idleTime": 321.3573,
            "eruptionTime": 256.82947,
            "dormancyCycles": 44.25291,
            "activeCycles": 81.93192
          },
          {
            "id": "hot_steam",
            "posX": 960,
            "posY": 20,
            "emitRate": 2553.2034,
            "idleTime": 332.62115,
            "eruptionTime": 269.24762,
            "dormancyCycles": 50.11803,
            "activeCycles": 67.00525
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlands",
        "q": 0,
        "r": -1
      },
      {
        "id": "MiniMetallicSwampyStart",
        "q": -2,
        "r": 2
      },
      {
        "id": "MiniForestFrozenWarp",
        "q": 0,
        "r": 3
      },
      {
        "id": "MiniFlipped",
        "q": -3,
        "r": 0
      },
      {
        "id": "MiniRadioactiveOcean",
        "q": 3,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": 8,
        "r": -4
      },
      {
        "id": "MarshyMoonlet",
        "q": -2,
        "r": -5
      },
      {
        "id": "MooMoonlet",
        "q": -1,
        "r": 8
      },
      {
        "id": "WaterMoonlet",
        "q": -9,
        "r": 1
      },
      {
        "id": "NiobiumMoonlet",
        "q": -9,
        "r": 11
      },
      {
        "id": "RegolithMoonlet",
        "q": 7,
        "r": -9
      },
      {
        "id": "TemporalTear",
        "q": 7,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 3,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -11,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -10,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -12,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -2,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -3,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -12,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 0,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -5,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -4,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 3,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 2,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 8,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 8,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 9,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -8,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -7,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -8,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -7,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -1,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -2,
        "r": -8
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 12,
        "r": -7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 3,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -12,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -3,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 12,
        "r": -12
      }
    ]
  },
  {
    "coordinate": "FRST-C-1461378121-0-0-0",
    "cluster": "FRST-C",
    "dlcs": [
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "ForestMoonlet",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 274,
        "worldTraits": [
          "MetalCaves",
          "SubsurfaceOcean",
          "GeoActive",
          "BouldersSmall"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 77,
            "posY": 110
          },
          {
            "id": "MassiveHeatSink",
            "posX": 92,
            "posY": 189
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 107,
            "posY": 135
          },
          {
            "id": "WarpConduitSender",
            "posX": 88,
            "posY": 161
          },
          {
            "id": "WarpPortal",
            "posX": 51,
            "posY": 66
          },
          {
            "id": "WarpReceiver",
            "posX": 52,
            "posY": 60
          },
          {
            "id": "GeneShuffler",
            "posX": 130,
            "posY": 190
          },
          {
            "id": "GeneShuffler",
            "posX": 54,
            "posY": 148
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 128,
            "posY": 159,
            "emitRate": 7807.809,
            "idleTime": 369.45728,
            "eruptionTime": 200.16595,
            "dormancyCycles": 47.35042,
            "activeCycles": 68.36266
          },
          {
            "id": "hot_hydrogen",
            "posX": 31,
            "posY": 135,
            "emitRate": 357.84705,
            "idleTime": 400.4976,
            "eruptionTime": 408.06503,
            "dormancyCycles": 45.09748,
            "activeCycles": 82.356285
          },
          {
            "id": "slush_water",
            "posX": 134,
            "posY": 107,
            "emitRate": 3970.7883,
            "idleTime": 258.69653,
            "eruptionTime": 557.1174,
            "dormancyCycles": 48.334694,
            "activeCycles": 79.668015
          },
          {
            "id": "slush_salt_water",
            "posX": 72,
            "posY": 185,
            "emitRate": 6166.729,
            "idleTime": 402.9487,
            "eruptionTime": 238.39932,
            "dormancyCycles": 58.818333,
            "activeCycles": 118.282005
          },
          {
            "id": "small_volcano",
            "posX": 123,
            "posY": 27,
            "emitRate": 131469.45,
            "idleTime": 8304.034,
            "eruptionTime": 60.337574,
            "dormancyCycles": 35.990536,
            "activeCycles": 56.37955
          },
          {
            "id": "small_volcano",
            "posX": 104,
            "posY": 60,
            "emitRate": 153011.47,
            "idleTime": 8580.011,
            "eruptionTime": 57.663715,
            "dormancyCycles": 29.688005,
            "activeCycles": 60.798286
          },
          {
            "id": "small_volcano",
            "posX": 86,
            "posY": 58,
            "emitRate": 133830.89,
            "idleTime": 8854.318,
            "eruptionTime": 60.16735,
            "dormancyCycles": 51.505466,
            "activeCycles": 101.06863
          },
          {
            "id": "methane",
            "posX": 147,
            "posY": 105,
            "emitRate": 331.86343,
            "idleTime": 205.57149,
            "eruptionTime": 236.9619,
            "dormancyCycles": 61.208775,
            "activeCycles": 98.82005
          },
          {
            "id": "big_volcano",
            "posX": 38,
            "posY": 193,
            "emitRate": 234322.66,
            "idleTime": 10908.102,
            "eruptionTime": 95.99388,
            "dormancyCycles": 54.499393,
            "activeCycles": 64.514046
          },
          {
            "id": "small_volcano",
            "posX": 69,
            "posY": 56,
            "emitRate": 112833.64,
            "idleTime": 9915.14,
            "eruptionTime": 82.45268,
            "dormancyCycles": 62.947845,
            "activeCycles": 83.57207
          },
          {
            "id": "molten_gold",
            "posX": 27,
            "posY": 191,
            "emitRate": 7584.5137,
            "idleTime": 651.451,
            "eruptionTime": 49.882946,
            "dormancyCycles": 57.93424,
            "activeCycles": 76.31489
          },
          {
            "id": "hot_hydrogen",
            "posX": 73,
            "posY": 198,
            "emitRate": 267.4374,
            "idleTime": 237.24684,
            "eruptionTime": 447.846,
            "dormancyCycles": 76.79157,
            "activeCycles": 95.998955
          },
          {
            "id": "slush_salt_water",
            "posX": 72,
            "posY": 210,
            "emitRate": 4445.3003,
            "idleTime": 406.29764,
            "eruptionTime": 452.60745,
            "dormancyCycles": 49.979485,
            "activeCycles": 60.684837
          },
          {
            "id": "liquid_co2",
            "posX": 47,
            "posY": 42,
            "emitRate": 441.9823,
            "idleTime": 236.9313,
            "eruptionTime": 295.2313,
            "dormancyCycles": 45.12827,
            "activeCycles": 43.940952
          }
        ]
      },
      {
        "id": "SwampyLandingSite",
        "offsetX": 244,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "BouldersMixed"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_cobalt",
            "posX": 286,
            "posY": 49,
            "emitRate": 9138.842,
            "idleTime": 731.2617,
            "eruptionTime": 48.756275,
            "dormancyCycles": 62.416386,
            "activeCycles": 69.91562
          },
          {
            "id": "molten_gold",
            "posX": 358,
            "posY": 48,
            "emitRate": 7718.15,
            "idleTime": 706.9248,
            "eruptionTime": 38.48657,
            "dormancyCycles": 65.75216,
            "activeCycles": 78.63548
          },
          {
            "id": "molten_cobalt",
            "posX": 357,
            "posY": 78,
            "emitRate": 7667.087,
            "idleTime": 811.58057,
            "eruptionTime": 51.428043,
            "dormancyCycles": 76.06528,
            "activeCycles": 98.30242
          },
          {
            "id": "molten_gold",
            "posX": 267,
            "posY": 26,
            "emitRate": 11876.173,
            "idleTime": 666.8704,
            "eruptionTime": 36.668682,
            "dormancyCycles": 62.030346,
            "activeCycles": 72.810005
          },
          {
            "id": "liquid_co2",
            "posX": 351,
            "posY": 36,
            "emitRate": 268.24182,
            "idleTime": 128.10837,
            "eruptionTime": 573.955,
            "dormancyCycles": 54.377377,
            "activeCycles": 85.2861
          },
          {
            "id": "liquid_co2",
            "posX": 327,
            "posY": 16,
            "emitRate": 522.9374,
            "idleTime": 434.49484,
            "eruptionTime": 318.63364,
            "dormancyCycles": 41.48207,
            "activeCycles": 70.74239
          },
          {
            "id": "hot_po2",
            "posX": 285,
            "posY": 62,
            "emitRate": 572.50134,
            "idleTime": 189.84128,
            "eruptionTime": 74.66032,
            "dormancyCycles": 39.24547,
            "activeCycles": 59.5303
          },
          {
            "id": "filthy_water",
            "posX": 260,
            "posY": 87,
            "emitRate": 16357.182,
            "idleTime": 189.84128,
            "eruptionTime": 74.66032,
            "dormancyCycles": 39.24547,
            "activeCycles": 59.5303
          },
          {
            "id": "hot_po2",
            "posX": 261,
            "posY": 60,
            "emitRate": 289.4648,
            "idleTime": 212.84186,
            "eruptionTime": 347.94385,
            "dormancyCycles": 47.640766,
            "activeCycles": 85.51701
          }
        ]
      },
      {
        "id": "OilRichWarpTarget",
        "offsetX": 374,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "MetalPoor",
          "FrozenCore"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "posX": 395,
            "posY": 91
          },
          {
            "id": "WarpConduitSender",
            "posX": 472,
            "posY": 56
          },
          {
            "id": "WarpPortal",
            "posX": 426,
            "posY": 69
          },
          {
            "id": "WarpReceiver",
            "posX": 448,
            "posY": 69
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 385,
            "posY": 63,
            "emitRate": 5505.294,
            "idleTime": 305.3291,
            "eruptionTime": 352.6164,
            "dormancyCycles": 65.80947,
            "activeCycles": 75.4898
          },
          {
            "id": "OilWell",
            "posX": 386,
            "posY": 28,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 384,
            "posY": 40,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 397,
            "posY": 42,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 416,
            "posY": 38,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 406,
            "posY": 29,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "chlorine_gas",
            "posX": 431,
            "posY": 11,
            "emitRate": 393.5826,
            "idleTime": 408.94293,
            "eruptionTime": 382.8896,
            "dormancyCycles": 50.037045,
            "activeCycles": 71.445465
          },
          {
            "id": "liquid_sulfur",
            "posX": 481,
            "posY": 91,
            "emitRate": 5938.8003,
            "idleTime": 177.20633,
            "eruptionTime": 142.62775,
            "dormancyCycles": 47.799686,
            "activeCycles": 53.703262
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 162,
        "offsetY": 176,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "LushCore"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 201,
            "posY": 211,
            "emitRate": 7896.0234,
            "idleTime": 629.13336,
            "eruptionTime": 38.358307,
            "dormancyCycles": 25.194675,
            "activeCycles": 49.324406
          },
          {
            "id": "molten_iron",
            "posX": 187,
            "posY": 237,
            "emitRate": 6962.0947,
            "idleTime": 746.4247,
            "eruptionTime": 56.737183,
            "dormancyCycles": 56.8686,
            "activeCycles": 75.21469
          },
          {
            "id": "molten_iron",
            "posX": 180,
            "posY": 209,
            "emitRate": 8143.938,
            "idleTime": 706.6814,
            "eruptionTime": 41.36664,
            "dormancyCycles": 37.920044,
            "activeCycles": 56.335846
          },
          {
            "id": "molten_iron",
            "posX": 196,
            "posY": 220,
            "emitRate": 9151.092,
            "idleTime": 692.3767,
            "eruptionTime": 37.422005,
            "dormancyCycles": 60.49285,
            "activeCycles": 100.34406
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 228,
        "offsetY": 176,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "FrozenCore"
        ],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 254,
            "posY": 230
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 247,
            "posY": 197,
            "emitRate": 7956.808,
            "idleTime": 722.53064,
            "eruptionTime": 54.02903,
            "dormancyCycles": 66.864235,
            "activeCycles": 90.14609
          },
          {
            "id": "molten_tungsten",
            "posX": 284,
            "posY": 184,
            "emitRate": 7974.874,
            "idleTime": 736.6736,
            "eruptionTime": 48.259205,
            "dormancyCycles": 96.42684,
            "activeCycles": 114.399025
          },
          {
            "id": "hot_po2",
            "posX": 261,
            "posY": 199,
            "emitRate": 658.13727,
            "idleTime": 347.89813,
            "eruptionTime": 115.02734,
            "dormancyCycles": 43.47945,
            "activeCycles": 66.612625
          },
          {
            "id": "chlorine_gas",
            "posX": 267,
            "posY": 218,
            "emitRate": 334.0276,
            "idleTime": 303.1427,
            "eruptionTime": 301.47327,
            "dormancyCycles": 46.537033,
            "activeCycles": 86.948166
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 504,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 516,
            "posY": 29,
            "emitRate": 374.2994,
            "idleTime": 217.69319,
            "eruptionTime": 202.89357,
            "dormancyCycles": 38.774536,
            "activeCycles": 81.67274
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 162,
        "offsetY": 0,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 192,
            "posY": 64,
            "emitRate": 10787.821,
            "idleTime": 276.72253,
            "eruptionTime": 255.81396,
            "dormancyCycles": 58.406883,
            "activeCycles": 84.51149
          },
          {
            "id": "filthy_water",
            "posX": 182,
            "posY": 113,
            "emitRate": 7401.1855,
            "idleTime": 315.62573,
            "eruptionTime": 389.12665,
            "dormancyCycles": 41.482193,
            "activeCycles": 41.204323
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 294,
        "offsetY": 155,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 323,
            "posY": 180,
            "emitRate": 323197.7,
            "idleTime": 9608.816,
            "eruptionTime": 62.62059,
            "dormancyCycles": 37.09609,
            "activeCycles": 85.72432
          }
        ]
      },
      {
        "id": "RegolithMoonlet",
        "offsetX": 360,
        "offsetY": 155,
        "sizeX": 160,
        "sizeY": 96,
        "worldTraits": [
          "MetalPoor"
        ],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 374,
            "posY": 193
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 448,
            "posY": 163,
            "emitRate": 2148.624,
            "idleTime": 286.39514,
            "eruptionTime": 307.73828,
            "dormancyCycles": 46.70835,
            "activeCycles": 79.554436
          },
          {
            "id": "steam",
            "posX": 468,
            "posY": 163,
            "emitRate": 4952.2847,
            "idleTime": 265.85507,
            "eruptionTime": 279.51065,
            "dormancyCycles": 53.551537,
            "activeCycles": 93.17727
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "ForestMoonlet",
        "q": 0,
        "r": 0
      },
      {
        "id": "SwampyLandingSite",
        "q": 0,
        "r": -3
      },
      {
        "id": "OilRichWarpTarget",
        "q": 4,
        "r": -3
      },
      {
        "id": "TundraMoonlet",
        "q": 1,
        "r": 6
      },
      {
        "id": "MarshyMoonlet",
        "q": -6,
        "r": 0
      },
      {
        "id": "MooMoonlet",
        "q": 6,
        "r": 1
      },
      {
        "id": "WaterMoonlet",
        "q": 5,
        "r": -8
      },
      {
        "id": "NiobiumMoonlet",
        "q": -9,
        "r": 7
      },
      {
        "id": "RegolithMoonlet",
        "q": 0,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": 6,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -3,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -2,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -3,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 4,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -11,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -3,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -11,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -11,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 2,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -1,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -2,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -3,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 3,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 11,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 10,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 9,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 0,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -7,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 9,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 10,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 10,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -8,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -7,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -1,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 5,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -3,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 6,
        "r": -6
      }
    ]
  },
  {
    "coordinate": "V-BAD-C-1764113742-0-0-0",
    "cluster": "V-BAD-C",
    "dlcs": [
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaBadlands",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "FrozenCore",
          "DeepOil",
          "MetalPoor"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 105,
            "posY": 168
          },
          {
            "id": "MassiveHeatSink",
            "posX": 188,
            "posY": 235
          },
          {
            "id": "MassiveHeatSink",
            "posX": 67,
            "posY": 22
          },
          {
            "id": "MassiveHeatSink",
            "posX": 216,
            "posY": 272
          },
          {
            "id": "WarpConduitSender",
            "posX": 20,
            "posY": 256
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 131,
            "posY": 93
          },
          {
            "id": "WarpReceiver",
            "posX": 153,
            "posY": 267
          },
          {
            "id": "WarpPortal",
            "posX": 152,
            "posY": 273
          },
          {
            "id": "GeneShuffler",
            "posX": 34,
            "posY": 233
          },
          {
            "id": "GeneShuffler",
            "posX": 73,
            "posY": 272
          },
          {
            "id": "GeneShuffler",
            "posX": 23,
            "posY": 46
          },
          {
            "id": "GeneShuffler",
            "posX": 53,
            "posY": 176
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 132,
            "posY": 155,
            "emitRate": 4060.2751,
            "idleTime": 257.8794,
            "eruptionTime": 353.4792,
            "dormancyCycles": 39.412983,
            "activeCycles": 70.66095
          },
          {
            "id": "methane",
            "posX": 51,
            "posY": 150,
            "emitRate": 309.67496,
            "idleTime": 239.804,
            "eruptionTime": 283.36673,
            "dormancyCycles": 50.786854,
            "activeCycles": 117.50121
          },
          {
            "id": "OilWell",
            "posX": 101,
            "posY": 67,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 207,
            "posY": 58,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 143,
            "posY": 58,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 187,
            "posY": 46,
            "emitRate": 8339.534,
            "idleTime": 504.81265,
            "eruptionTime": 165.57779,
            "dormancyCycles": 59.69058,
            "activeCycles": 84.676476
          },
          {
            "id": "slimy_po2",
            "posX": 99,
            "posY": 225,
            "emitRate": 333.0995,
            "idleTime": 260.2809,
            "eruptionTime": 298.97202,
            "dormancyCycles": 40.43933,
            "activeCycles": 60.16094
          },
          {
            "id": "methane",
            "posX": 99,
            "posY": 51,
            "emitRate": 1138.3602,
            "idleTime": 451.86935,
            "eruptionTime": 86.07394,
            "dormancyCycles": 23.973671,
            "activeCycles": 51.76776
          },
          {
            "id": "molten_aluminum",
            "posX": 153,
            "posY": 72,
            "emitRate": 9760.23,
            "idleTime": 704.8788,
            "eruptionTime": 42.068916,
            "dormancyCycles": 27.963894,
            "activeCycles": 50.471405
          },
          {
            "id": "steam",
            "posX": 216,
            "posY": 17,
            "emitRate": 8339.534,
            "idleTime": 504.81265,
            "eruptionTime": 165.57779,
            "dormancyCycles": 59.69058,
            "activeCycles": 84.676476
          },
          {
            "id": "hot_water",
            "posX": 170,
            "posY": 44,
            "emitRate": 7786.7773,
            "idleTime": 179.10286,
            "eruptionTime": 236.37318,
            "dormancyCycles": 48.79805,
            "activeCycles": 90.84741
          },
          {
            "id": "slush_salt_water",
            "posX": 189,
            "posY": 209,
            "emitRate": 5089.1216,
            "idleTime": 218.98589,
            "eruptionTime": 186.32735,
            "dormancyCycles": 62.161236,
            "activeCycles": 126.63491
          },
          {
            "id": "chlorine_gas",
            "posX": 168,
            "posY": 91,
            "emitRate": 443.46555,
            "idleTime": 315.64844,
            "eruptionTime": 215.20802,
            "dormancyCycles": 51.536808,
            "activeCycles": 60.395416
          },
          {
            "id": "slush_salt_water",
            "posX": 101,
            "posY": 253,
            "emitRate": 4465.6704,
            "idleTime": 223.11043,
            "eruptionTime": 247.69463,
            "dormancyCycles": 67.29544,
            "activeCycles": 63.712254
          },
          {
            "id": "hot_hydrogen",
            "posX": 73,
            "posY": 69,
            "emitRate": 367.1799,
            "idleTime": 507.04962,
            "eruptionTime": 461.2019,
            "dormancyCycles": 48.53364,
            "activeCycles": 65.4476
          },
          {
            "id": "hot_steam",
            "posX": 168,
            "posY": 67,
            "emitRate": 2270.0627,
            "idleTime": 267.69632,
            "eruptionTime": 245.06503,
            "dormancyCycles": 43.185753,
            "activeCycles": 57.80077
          },
          {
            "id": "molten_cobalt",
            "posX": 35,
            "posY": 35,
            "emitRate": 13235.544,
            "idleTime": 833.44165,
            "eruptionTime": 36.516415,
            "dormancyCycles": 64.37622,
            "activeCycles": 118.25772
          },
          {
            "id": "OilWell",
            "posX": 6,
            "posY": 44,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 11,
            "posY": 31,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 30,
            "posY": 32,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 41,
            "posY": 27,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 76,
            "posY": 52,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 54,
            "posY": 50,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 101,
            "posY": 40,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 87,
            "posY": 32,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 98,
            "posY": 27,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 106,
            "posY": 32,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 134,
            "posY": 31,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 157,
            "posY": 35,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 200,
            "posY": 34,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 210,
            "posY": 34,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 223,
            "posY": 28,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 218,
            "posY": 30,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          }
        ]
      },
      {
        "id": "MediumRadioactiveVanillaWarpPlanet",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "SlimeSplats",
          "Volcanoes"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 325,
            "posY": 120
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 269,
            "posY": 73
          },
          {
            "id": "WarpConduitSender",
            "posX": 360,
            "posY": 82
          },
          {
            "id": "WarpReceiver",
            "posX": 332,
            "posY": 71
          },
          {
            "id": "WarpPortal",
            "posX": 310,
            "posY": 71
          },
          {
            "id": "GeneShuffler",
            "posX": 390,
            "posY": 120
          },
          {
            "id": "GeneShuffler",
            "posX": 383,
            "posY": 71
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 384,
            "posY": 34,
            "emitRate": 574.8494,
            "idleTime": 494.0846,
            "eruptionTime": 410.42627,
            "dormancyCycles": 33.893974,
            "activeCycles": 72.900505
          },
          {
            "id": "liquid_co2",
            "posX": 326,
            "posY": 40,
            "emitRate": 326.59384,
            "idleTime": 157.30789,
            "eruptionTime": 523.5785,
            "dormancyCycles": 39.2473,
            "activeCycles": 57.18491
          },
          {
            "id": "slush_water",
            "posX": 276,
            "posY": 121,
            "emitRate": 4846.868,
            "idleTime": 333.47385,
            "eruptionTime": 394.81735,
            "dormancyCycles": 59.006844,
            "activeCycles": 85.78708
          },
          {
            "id": "slush_salt_water",
            "posX": 344,
            "posY": 112,
            "emitRate": 3935.3289,
            "idleTime": 151.5271,
            "eruptionTime": 270.25266,
            "dormancyCycles": 55.44308,
            "activeCycles": 60.073235
          },
          {
            "id": "steam",
            "posX": 378,
            "posY": 98,
            "emitRate": 4907.3926,
            "idleTime": 364.32867,
            "eruptionTime": 614.5843,
            "dormancyCycles": 62.71618,
            "activeCycles": 71.08206
          },
          {
            "id": "slush_water",
            "posX": 253,
            "posY": 9,
            "emitRate": 5215.309,
            "idleTime": 265.05945,
            "eruptionTime": 208.87654,
            "dormancyCycles": 69.87794,
            "activeCycles": 104.410034
          },
          {
            "id": "molten_iron",
            "posX": 294,
            "posY": 106,
            "emitRate": 7193.4956,
            "idleTime": 765.2911,
            "eruptionTime": 54.024914,
            "dormancyCycles": 42.12483,
            "activeCycles": 76.70053
          },
          {
            "id": "molten_copper",
            "posX": 268,
            "posY": 113,
            "emitRate": 8413.073,
            "idleTime": 638.9528,
            "eruptionTime": 38.980095,
            "dormancyCycles": 50.7919,
            "activeCycles": 64.13082
          },
          {
            "id": "molten_cobalt",
            "posX": 275,
            "posY": 10,
            "emitRate": 8475.017,
            "idleTime": 869.7576,
            "eruptionTime": 50.199333,
            "dormancyCycles": 52.030056,
            "activeCycles": 103.258415
          },
          {
            "id": "hot_hydrogen",
            "posX": 284,
            "posY": 98,
            "emitRate": 492.1217,
            "idleTime": 342.76193,
            "eruptionTime": 223.32564,
            "dormancyCycles": 48.69879,
            "activeCycles": 80.704704
          },
          {
            "id": "small_volcano",
            "posX": 270,
            "posY": 36,
            "emitRate": 146202.03,
            "idleTime": 7897.5503,
            "eruptionTime": 49.710663,
            "dormancyCycles": 47.937687,
            "activeCycles": 66.385185
          },
          {
            "id": "big_volcano",
            "posX": 288,
            "posY": 53,
            "emitRate": 263699.88,
            "idleTime": 8682.838,
            "eruptionTime": 65.76414,
            "dormancyCycles": 68.00028,
            "activeCycles": 81.524185
          },
          {
            "id": "big_volcano",
            "posX": 249,
            "posY": 94,
            "emitRate": 237068.4,
            "idleTime": 10510.274,
            "eruptionTime": 89.51924,
            "dormancyCycles": 51.82352,
            "activeCycles": 54.238144
          },
          {
            "id": "big_volcano",
            "posX": 249,
            "posY": 55,
            "emitRate": 230995.81,
            "idleTime": 8969.3125,
            "eruptionTime": 70.077835,
            "dormancyCycles": 66.852715,
            "activeCycles": 97.83438
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "RadioactiveCrust",
          "DistressSignal"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 340,
            "posY": 235,
            "emitRate": 12806.513,
            "idleTime": 593.7853,
            "eruptionTime": 25.352236,
            "dormancyCycles": 50.79768,
            "activeCycles": 93.34016
          },
          {
            "id": "molten_iron",
            "posX": 369,
            "posY": 191,
            "emitRate": 9087.704,
            "idleTime": 758.4251,
            "eruptionTime": 49.106365,
            "dormancyCycles": 65.454124,
            "activeCycles": 63.467075
          },
          {
            "id": "molten_iron",
            "posX": 338,
            "posY": 205,
            "emitRate": 9650.415,
            "idleTime": 757.945,
            "eruptionTime": 52.153385,
            "dormancyCycles": 70.24814,
            "activeCycles": 97.40321
          },
          {
            "id": "molten_iron",
            "posX": 333,
            "posY": 223,
            "emitRate": 7917.9854,
            "idleTime": 720.0812,
            "eruptionTime": 52.196712,
            "dormancyCycles": 61.36526,
            "activeCycles": 78.07931
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 355,
            "posY": 357
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 344,
            "posY": 336,
            "emitRate": 8827.046,
            "idleTime": 814.58716,
            "eruptionTime": 49.62896,
            "dormancyCycles": 43.86379,
            "activeCycles": 55.132286
          },
          {
            "id": "molten_tungsten",
            "posX": 369,
            "posY": 317,
            "emitRate": 8307.623,
            "idleTime": 750.9071,
            "eruptionTime": 50.44602,
            "dormancyCycles": 38.774124,
            "activeCycles": 83.075356
          },
          {
            "id": "molten_tungsten",
            "posX": 345,
            "posY": 316,
            "emitRate": 10699.3,
            "idleTime": 695.418,
            "eruptionTime": 35.196693,
            "dormancyCycles": 34.928955,
            "activeCycles": 56.621243
          },
          {
            "id": "hot_hydrogen",
            "posX": 355,
            "posY": 316,
            "emitRate": 483.77185,
            "idleTime": 288.06903,
            "eruptionTime": 190.4348,
            "dormancyCycles": 48.869984,
            "activeCycles": 58.01795
          },
          {
            "id": "methane",
            "posX": 330,
            "posY": 337,
            "emitRate": 399.2538,
            "idleTime": 157.67436,
            "eruptionTime": 138.50719,
            "dormancyCycles": 49.749607,
            "activeCycles": 68.3356
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "MetalPoor"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 440,
            "posY": 187,
            "emitRate": 300360.3,
            "idleTime": 8501.325,
            "eruptionTime": 63.099937,
            "dormancyCycles": 66.69465,
            "activeCycles": 88.24909
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 485,
            "posY": 36,
            "emitRate": 386.45532,
            "idleTime": 258.05896,
            "eruptionTime": 213.26944,
            "dormancyCycles": 43.1811,
            "activeCycles": 62.228634
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "slush_water",
            "posX": 267,
            "posY": 244,
            "emitRate": 5190.3926,
            "idleTime": 275.0924,
            "eruptionTime": 230.1314,
            "dormancyCycles": 28.62951,
            "activeCycles": 60.13773
          },
          {
            "id": "filthy_water",
            "posX": 307,
            "posY": 273,
            "emitRate": 9244.663,
            "idleTime": 289.60852,
            "eruptionTime": 311.58124,
            "dormancyCycles": 73.5945,
            "activeCycles": 77.37344
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 463,
            "posY": 302
          }
        ],
        "geysers": []
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaBadlands",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumRadioactiveVanillaWarpPlanet",
        "q": -2,
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": 5,
        "r": 0
      },
      {
        "id": "MarshyMoonlet",
        "q": 1,
        "r": 5
      },
      {
        "id": "NiobiumMoonlet",
        "q": -5,
        "r": 1
      },
      {
        "id": "MooMoonlet",
        "q": -7,
        "r": 6
      },
      {
        "id": "WaterMoonlet",
        "q": 5,
        "r": -6
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -4,
        "r": 8
      },
      {
        "id": "TemporalTear",
        "q": -8,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 2,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -1,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 9,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 9,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 10,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 8,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 8,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -6,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 3,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 2,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 2,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 4,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 2,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 2,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 10,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -10,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -10,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -10,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 11,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -2,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -1,
        "r": -10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": -2,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -6,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 0,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": 6,
        "r": -11
      }
    ]
  },
  {
    "coordinate": "LUSH-A-1431750483-0-0-0",
    "cluster": "LUSH-A",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "ForestLush",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [
          "DeepOil",
          "MetalRich",
          "GlaciersLarge"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 129,
            "posY": 187
          },
          {
            "id": "GeneShuffler",
            "posX": 142,
            "posY": 123
          },
          {
            "id": "GeneShuffler",
            "posX": 147,
            "posY": 226
          },
          {
            "id": "GeneShuffler",
            "posX": 217,
            "posY": 138
          },
          {
            "id": "GeneShuffler",
            "posX": 209,
            "posY": 201
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 38,
            "posY": 141,
            "emitRate": 3652.6196,
            "idleTime": 272.28986,
            "eruptionTime": 448.89655,
            "dormancyCycles": 30.069336,
            "activeCycles": 110.836525
          },
          {
            "id": "chlorine_gas",
            "posX": 36,
            "posY": 199,
            "emitRate": 883.6427,
            "idleTime": 394.84644,
            "eruptionTime": 95.29073,
            "dormancyCycles": 59.123165,
            "activeCycles": 78.06034
          },
          {
            "id": "steam",
            "posX": 123,
            "posY": 309,
            "emitRate": 4305.022,
            "idleTime": 129.65474,
            "eruptionTime": 164.2235,
            "dormancyCycles": 62.182304,
            "activeCycles": 78.811356
          },
          {
            "id": "methane",
            "posX": 204,
            "posY": 219,
            "emitRate": 377.30313,
            "idleTime": 292.19095,
            "eruptionTime": 267.4409,
            "dormancyCycles": 67.39929,
            "activeCycles": 80.87995
          },
          {
            "id": "salt_water",
            "posX": 34,
            "posY": 55,
            "emitRate": 6432.321,
            "idleTime": 167.1815,
            "eruptionTime": 391.76517,
            "dormancyCycles": 52.66137,
            "activeCycles": 73.216385
          },
          {
            "id": "OilWell",
            "posX": 207,
            "posY": 48,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 81,
            "posY": 295,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 173,
            "posY": 273,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "molten_copper",
            "posX": 190,
            "posY": 40,
            "emitRate": 9188.908,
            "idleTime": 787.98425,
            "eruptionTime": 49.126255,
            "dormancyCycles": 68.75802,
            "activeCycles": 63.567307
          },
          {
            "id": "chlorine_gas",
            "posX": 170,
            "posY": 56,
            "emitRate": 327.5611,
            "idleTime": 276.65973,
            "eruptionTime": 354.3402,
            "dormancyCycles": 63.51444,
            "activeCycles": 80.12178
          },
          {
            "id": "oil_drip",
            "posX": 91,
            "posY": 124,
            "emitRate": 326.0678,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.20893478,
            "activeCycles": 0.27026972
          },
          {
            "id": "slimy_po2",
            "posX": 25,
            "posY": 88,
            "emitRate": 322.048,
            "idleTime": 249.17209,
            "eruptionTime": 325.3654,
            "dormancyCycles": 59.83905,
            "activeCycles": 74.40321
          },
          {
            "id": "methane",
            "posX": 74,
            "posY": 200,
            "emitRate": 433.57367,
            "idleTime": 375.78156,
            "eruptionTime": 287.52698,
            "dormancyCycles": 8.642754,
            "activeCycles": 17.469318
          },
          {
            "id": "slush_salt_water",
            "posX": 37,
            "posY": 236,
            "emitRate": 4556.943,
            "idleTime": 267.13712,
            "eruptionTime": 287.64804,
            "dormancyCycles": 59.84951,
            "activeCycles": 86.76523
          },
          {
            "id": "hot_water",
            "posX": 242,
            "posY": 46,
            "emitRate": 14149.878,
            "idleTime": 489.83884,
            "eruptionTime": 222.129,
            "dormancyCycles": 86.90878,
            "activeCycles": 108.94925
          },
          {
            "id": "small_volcano",
            "posX": 125,
            "posY": 41,
            "emitRate": 121066.95,
            "idleTime": 10814.484,
            "eruptionTime": 87.41178,
            "dormancyCycles": 79.98512,
            "activeCycles": 92.7742
          },
          {
            "id": "slush_water",
            "posX": 41,
            "posY": 272,
            "emitRate": 4488.5034,
            "idleTime": 205.00325,
            "eruptionTime": 211.36104,
            "dormancyCycles": 45.168922,
            "activeCycles": 67.67344
          },
          {
            "id": "chlorine_gas",
            "posX": 83,
            "posY": 254,
            "emitRate": 412.0079,
            "idleTime": 248.89592,
            "eruptionTime": 199.74751,
            "dormancyCycles": 51.378708,
            "activeCycles": 70.09738
          },
          {
            "id": "hot_water",
            "posX": 240,
            "posY": 182,
            "emitRate": 7878.903,
            "idleTime": 175.1497,
            "eruptionTime": 224.81865,
            "dormancyCycles": 48.522297,
            "activeCycles": 82.49426
          },
          {
            "id": "oil_drip",
            "posX": 171,
            "posY": 134,
            "emitRate": 354.52194,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.17489053,
            "activeCycles": 0.3514413
          },
          {
            "id": "OilWell",
            "posX": 7,
            "posY": 33,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 5,
            "posY": 37,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 21,
            "posY": 40,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 50,
            "posY": 110,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 41,
            "posY": 258,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 69,
            "posY": 35,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 66,
            "posY": 40,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 85,
            "posY": 265,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 92,
            "posY": 295,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 123,
            "posY": 34,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 105,
            "posY": 45,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 140,
            "posY": 41,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 144,
            "posY": 34,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 123,
            "posY": 73,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 144,
            "posY": 277,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 179,
            "posY": 34,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 162,
            "posY": 266,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 175,
            "posY": 251,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 237,
            "posY": 153,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 230,
            "posY": 182,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          }
        ]
      }
    ],
    "starMapEntriesVanilla": [
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "MetallicAsteroid",
        "distance": 1
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "RockyAsteroid",
        "distance": 2
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 3
      },
      {
        "id": "SaltDwarf",
        "distance": 4
      },
      {
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "RockyAsteroid",
        "distance": 4
      },
      {
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "IcyDwarf",
        "distance": 5
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 5
      },
      {
        "id": "IcyDwarf",
        "distance": 6
      },
      {
        "id": "IcyDwarf",
        "distance": 6
      },
      {
        "id": "TerraPlanet",
        "distance": 7
      },
      {
        "id": "IceGiant",
        "distance": 8
      },
      {
        "id": "TerraPlanet",
        "distance": 8
      },
      {
        "id": "GasGiant",
        "distance": 8
      },
      {
        "id": "GasGiant",
        "distance": 9
      },
      {
        "id": "GasGiant",
        "distance": 9
      },
      {
        "id": "MetallicAsteroid",
        "distance": 10
      },
      {
        "id": "GoldAsteroid",
        "distance": 12
      },
      {
        "id": "ForestPlanet",
        "distance": 15
      },
      {
        "id": "SaltDwarf",
        "distance": 16
      },
      {
        "id": "SaltDwarf",
        "distance": 16
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "OCAN-A-201254804-0-0-0",
    "cluster": "OCAN-A",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "Oceania",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [
          "BouldersSmall",
          "MisalignedStart",
          "MetalPoor",
          "FrozenCore"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 91,
            "posY": 136
          },
          {
            "id": "MassiveHeatSink",
            "posX": 79,
            "posY": 258
          },
          {
            "id": "MassiveHeatSink",
            "posX": 128,
            "posY": 215
          },
          {
            "id": "MassiveHeatSink",
            "posX": 55,
            "posY": 76
          },
          {
            "id": "GeneShuffler",
            "posX": 228,
            "posY": 287
          },
          {
            "id": "GeneShuffler",
            "posX": 190,
            "posY": 212
          },
          {
            "id": "GeneShuffler",
            "posX": 161,
            "posY": 22
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 42,
            "posY": 211,
            "emitRate": 4128.509,
            "idleTime": 265.65176,
            "eruptionTime": 307.3799,
            "dormancyCycles": 56.29214,
            "activeCycles": 84.308365
          },
          {
            "id": "methane",
            "posX": 145,
            "posY": 83,
            "emitRate": 377.0558,
            "idleTime": 240.24438,
            "eruptionTime": 153.52896,
            "dormancyCycles": 51.98304,
            "activeCycles": 65.13218
          },
          {
            "id": "steam",
            "posX": 84,
            "posY": 206,
            "emitRate": 4944.1562,
            "idleTime": 258.6167,
            "eruptionTime": 257.64667,
            "dormancyCycles": 59.1963,
            "activeCycles": 73.69404
          },
          {
            "id": "methane",
            "posX": 164,
            "posY": 126,
            "emitRate": 346.09094,
            "idleTime": 258.6167,
            "eruptionTime": 257.64667,
            "dormancyCycles": 59.1963,
            "activeCycles": 73.69404
          },
          {
            "id": "salt_water",
            "posX": 88,
            "posY": 242,
            "emitRate": 9860.391,
            "idleTime": 129.83675,
            "eruptionTime": 123.893936,
            "dormancyCycles": 42.085857,
            "activeCycles": 54.80071
          },
          {
            "id": "OilWell",
            "posX": 237,
            "posY": 51,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 128,
            "posY": 50,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 38,
            "posY": 43,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "small_volcano",
            "posX": 213,
            "posY": 29,
            "emitRate": 111836.05,
            "idleTime": 8232.257,
            "eruptionTime": 71.98028,
            "dormancyCycles": 46.03627,
            "activeCycles": 70.24665
          },
          {
            "id": "liquid_co2",
            "posX": 124,
            "posY": 302,
            "emitRate": 483.85202,
            "idleTime": 226.88814,
            "eruptionTime": 241.58055,
            "dormancyCycles": 52.066967,
            "activeCycles": 82.833725
          },
          {
            "id": "molten_iron",
            "posX": 240,
            "posY": 137,
            "emitRate": 10580.647,
            "idleTime": 806.80707,
            "eruptionTime": 44.93469,
            "dormancyCycles": 40.48775,
            "activeCycles": 60.112297
          },
          {
            "id": "salt_water",
            "posX": 174,
            "posY": 267,
            "emitRate": 16127.056,
            "idleTime": 443.73154,
            "eruptionTime": 188.11055,
            "dormancyCycles": 63.86584,
            "activeCycles": 89.391556
          },
          {
            "id": "hot_co2",
            "posX": 203,
            "posY": 181,
            "emitRate": 432.82654,
            "idleTime": 451.93506,
            "eruptionTime": 312.42957,
            "dormancyCycles": 52.349854,
            "activeCycles": 85.17579
          },
          {
            "id": "chlorine_gas",
            "posX": 222,
            "posY": 258,
            "emitRate": 411.7626,
            "idleTime": 165.2017,
            "eruptionTime": 132.53374,
            "dormancyCycles": 26.353172,
            "activeCycles": 72.51968
          },
          {
            "id": "hot_steam",
            "posX": 30,
            "posY": 198,
            "emitRate": 2693.2559,
            "idleTime": 240.24438,
            "eruptionTime": 153.52896,
            "dormancyCycles": 51.98304,
            "activeCycles": 65.13218
          },
          {
            "id": "salt_water",
            "posX": 176,
            "posY": 154,
            "emitRate": 9860.391,
            "idleTime": 129.83675,
            "eruptionTime": 123.893936,
            "dormancyCycles": 42.085857,
            "activeCycles": 54.80071
          },
          {
            "id": "hot_co2",
            "posX": 166,
            "posY": 239,
            "emitRate": 278.27292,
            "idleTime": 102.48156,
            "eruptionTime": 175.77332,
            "dormancyCycles": 45.512566,
            "activeCycles": 52.386997
          },
          {
            "id": "hot_po2",
            "posX": 99,
            "posY": 44,
            "emitRate": 316.5103,
            "idleTime": 190.66008,
            "eruptionTime": 253.90224,
            "dormancyCycles": 36.731834,
            "activeCycles": 69.23382
          },
          {
            "id": "chlorine_gas",
            "posX": 88,
            "posY": 15,
            "emitRate": 316.53104,
            "idleTime": 235.2545,
            "eruptionTime": 333.0717,
            "dormancyCycles": 50.021748,
            "activeCycles": 89.25405
          },
          {
            "id": "chlorine_gas",
            "posX": 187,
            "posY": 182,
            "emitRate": 327.35007,
            "idleTime": 257.1146,
            "eruptionTime": 329.1871,
            "dormancyCycles": 41.68671,
            "activeCycles": 81.90357
          }
        ]
      }
    ],
    "starMapEntriesVanilla": [
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "MetallicAsteroid",
        "distance": 1
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "RockyAsteroid",
        "distance": 2
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "ForestPlanet",
        "distance": 3
      },
      {
        "id": "RockyAsteroid",
        "distance": 3
      },
      {
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "SaltDwarf",
        "distance": 4
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 5
      },
      {
        "id": "RockyAsteroid",
        "distance": 5
      },
      {
        "id": "ChlorinePlanet",
        "distance": 6
      },
      {
        "id": "DustyMoon",
        "distance": 7
      },
      {
        "id": "IceGiant",
        "distance": 8
      },
      {
        "id": "IceGiant",
        "distance": 9
      },
      {
        "id": "RustPlanet",
        "distance": 10
      },
      {
        "id": "VolcanoPlanet",
        "distance": 10
      },
      {
        "id": "VolcanoPlanet",
        "distance": 10
      },
      {
        "id": "ShinyPlanet",
        "distance": 11
      },
      {
        "id": "ForestPlanet",
        "distance": 12
      },
      {
        "id": "ChlorinePlanet",
        "distance": 12
      },
      {
        "id": "OrganicDwarf",
        "distance": 12
      },
      {
        "id": "RedDwarf",
        "distance": 14
      },
      {
        "id": "ShinyPlanet",
        "distance": 14
      },
      {
        "id": "RedDwarf",
        "distance": 14
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "FRST-A-1748791657-0-0-0",
    "cluster": "FRST-A",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "ForestDefault",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [
          "DeepOil",
          "SlimeSplats",
          "MetalRich"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 107,
            "posY": 203
          },
          {
            "id": "MassiveHeatSink",
            "posX": 167,
            "posY": 141
          },
          {
            "id": "MassiveHeatSink",
            "posX": 171,
            "posY": 262
          },
          {
            "id": "MassiveHeatSink",
            "posX": 228,
            "posY": 168
          },
          {
            "id": "GeneShuffler",
            "posX": 75,
            "posY": 327
          },
          {
            "id": "GeneShuffler",
            "posX": 135,
            "posY": 249
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 101,
            "posY": 153,
            "emitRate": 5007.2007,
            "idleTime": 379.89154,
            "eruptionTime": 341.62646,
            "dormancyCycles": 22.840681,
            "activeCycles": 43.32318
          },
          {
            "id": "chlorine_gas",
            "posX": 94,
            "posY": 106,
            "emitRate": 276.87247,
            "idleTime": 394.43118,
            "eruptionTime": 468.29886,
            "dormancyCycles": 50.679085,
            "activeCycles": 74.33447
          },
          {
            "id": "salt_water",
            "posX": 229,
            "posY": 93,
            "emitRate": 8016.858,
            "idleTime": 228.13597,
            "eruptionTime": 469.23984,
            "dormancyCycles": 50.37861,
            "activeCycles": 77.29664
          },
          {
            "id": "OilWell",
            "posX": 75,
            "posY": 40,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 91,
            "posY": 39,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 200,
            "posY": 42,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 156,
            "posY": 234,
            "emitRate": 9801.848,
            "idleTime": 344.55298,
            "eruptionTime": 331.51727,
            "dormancyCycles": 34.19659,
            "activeCycles": 43.901077
          },
          {
            "id": "big_volcano",
            "posX": 178,
            "posY": 59,
            "emitRate": 259660.67,
            "idleTime": 9638.932,
            "eruptionTime": 73.13974,
            "dormancyCycles": 53.596394,
            "activeCycles": 64.51374
          },
          {
            "id": "slimy_po2",
            "posX": 219,
            "posY": 141,
            "emitRate": 363.8767,
            "idleTime": 398.16876,
            "eruptionTime": 395.6792,
            "dormancyCycles": 50.395023,
            "activeCycles": 84.94618
          },
          {
            "id": "hot_steam",
            "posX": 206,
            "posY": 239,
            "emitRate": 1639.3201,
            "idleTime": 260.6999,
            "eruptionTime": 486.48468,
            "dormancyCycles": 71.219315,
            "activeCycles": 76.0917
          },
          {
            "id": "molten_copper",
            "posX": 134,
            "posY": 167,
            "emitRate": 10707.148,
            "idleTime": 756.7705,
            "eruptionTime": 40.5759,
            "dormancyCycles": 38.854443,
            "activeCycles": 40.32392
          },
          {
            "id": "liquid_co2",
            "posX": 130,
            "posY": 155,
            "emitRate": 754.4241,
            "idleTime": 528.1072,
            "eruptionTime": 259.7519,
            "dormancyCycles": 46.644356,
            "activeCycles": 88.100555
          },
          {
            "id": "chlorine_gas",
            "posX": 188,
            "posY": 86,
            "emitRate": 394.63834,
            "idleTime": 351.74072,
            "eruptionTime": 309.2364,
            "dormancyCycles": 37.296017,
            "activeCycles": 73.26327
          },
          {
            "id": "liquid_co2",
            "posX": 31,
            "posY": 143,
            "emitRate": 503.3754,
            "idleTime": 269.2049,
            "eruptionTime": 264.19934,
            "dormancyCycles": 63.960175,
            "activeCycles": 109.58095
          },
          {
            "id": "slimy_po2",
            "posX": 55,
            "posY": 173,
            "emitRate": 436.99692,
            "idleTime": 265.0526,
            "eruptionTime": 191.20897,
            "dormancyCycles": 58.28276,
            "activeCycles": 65.164246
          },
          {
            "id": "molten_copper",
            "posX": 219,
            "posY": 126,
            "emitRate": 19702.96,
            "idleTime": 757.8964,
            "eruptionTime": 21.450504,
            "dormancyCycles": 38.59421,
            "activeCycles": 83.03968
          },
          {
            "id": "molten_copper",
            "posX": 221,
            "posY": 191,
            "emitRate": 7771.9194,
            "idleTime": 647.52405,
            "eruptionTime": 48.616604,
            "dormancyCycles": 64.65102,
            "activeCycles": 78.55878
          },
          {
            "id": "liquid_co2",
            "posX": 170,
            "posY": 249,
            "emitRate": 438.85074,
            "idleTime": 208.23923,
            "eruptionTime": 273.13028,
            "dormancyCycles": 44.93248,
            "activeCycles": 61.352272
          },
          {
            "id": "OilWell",
            "posX": 64,
            "posY": 40,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 65,
            "posY": 38,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 105,
            "posY": 45,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 97,
            "posY": 47,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 139,
            "posY": 30,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 184,
            "posY": 39,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 184,
            "posY": 33,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 231,
            "posY": 34,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 250,
            "posY": 38,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          }
        ]
      }
    ],
    "starMapEntriesVanilla": [
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "MetallicAsteroid",
        "distance": 1
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "RockyAsteroid",
        "distance": 2
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 3
      },
      {
        "id": "ForestPlanet",
        "distance": 3
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 4
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 4
      },
      {
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 4
      },
      {
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "OrganicDwarf",
        "distance": 5
      },
      {
        "id": "RockyAsteroid",
        "distance": 5
      },
      {
        "id": "IcyDwarf",
        "distance": 6
      },
      {
        "id": "VolcanoPlanet",
        "distance": 7
      },
      {
        "id": "GasGiant",
        "distance": 8
      },
      {
        "id": "IceGiant",
        "distance": 9
      },
      {
        "id": "HeliumGiant",
        "distance": 9
      },
      {
        "id": "ShinyPlanet",
        "distance": 11
      },
      {
        "id": "ShinyPlanet",
        "distance": 11
      },
      {
        "id": "RockyAsteroid",
        "distance": 11
      },
      {
        "id": "ForestPlanet",
        "distance": 12
      },
      {
        "id": "IcyDwarf",
        "distance": 13
      },
      {
        "id": "GasGiant",
        "distance": 14
      },
      {
        "id": "TerraPlanet",
        "distance": 16
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "HTFST-A-191142137-0-0-0",
    "cluster": "HTFST-A",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "ForestHot",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [
          "Geodes",
          "BouldersLarge",
          "GlaciersLarge",
          "FrozenCore"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 121,
            "posY": 169
          },
          {
            "id": "GeneShuffler",
            "posX": 63,
            "posY": 257
          },
          {
            "id": "GeneShuffler",
            "posX": 181,
            "posY": 97
          },
          {
            "id": "GeneShuffler",
            "posX": 107,
            "posY": 315
          },
          {
            "id": "GeneShuffler",
            "posX": 213,
            "posY": 44
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 117,
            "posY": 88,
            "emitRate": 6074.195,
            "idleTime": 348.15747,
            "eruptionTime": 277.04248,
            "dormancyCycles": 33.738834,
            "activeCycles": 67.64339
          },
          {
            "id": "methane",
            "posX": 49,
            "posY": 296,
            "emitRate": 518.54565,
            "idleTime": 400.52396,
            "eruptionTime": 254.30624,
            "dormancyCycles": 39.820896,
            "activeCycles": 43.949142
          },
          {
            "id": "steam",
            "posX": 225,
            "posY": 168,
            "emitRate": 3492.2422,
            "idleTime": 304.6695,
            "eruptionTime": 385.50592,
            "dormancyCycles": 40.653557,
            "activeCycles": 71.91845
          },
          {
            "id": "methane",
            "posX": 71,
            "posY": 231,
            "emitRate": 490.73117,
            "idleTime": 192.4811,
            "eruptionTime": 105.7971,
            "dormancyCycles": 60.346092,
            "activeCycles": 100.475845
          },
          {
            "id": "salt_water",
            "posX": 201,
            "posY": 220,
            "emitRate": 11813.847,
            "idleTime": 482.86676,
            "eruptionTime": 374.9961,
            "dormancyCycles": 45.704582,
            "activeCycles": 65.037224
          },
          {
            "id": "OilWell",
            "posX": 69,
            "posY": 50,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 44,
            "posY": 37,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 201,
            "posY": 33,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "hot_hydrogen",
            "posX": 182,
            "posY": 57,
            "emitRate": 549.6471,
            "idleTime": 417.51752,
            "eruptionTime": 199.05194,
            "dormancyCycles": 53.44771,
            "activeCycles": 68.269066
          },
          {
            "id": "big_volcano",
            "posX": 149,
            "posY": 262,
            "emitRate": 275595.34,
            "idleTime": 6907.4507,
            "eruptionTime": 49.587193,
            "dormancyCycles": 32.391323,
            "activeCycles": 65.52549
          },
          {
            "id": "chlorine_gas",
            "posX": 222,
            "posY": 224,
            "emitRate": 319.44717,
            "idleTime": 220.21352,
            "eruptionTime": 296.93793,
            "dormancyCycles": 50.01801,
            "activeCycles": 84.04514
          },
          {
            "id": "small_volcano",
            "posX": 21,
            "posY": 231,
            "emitRate": 142529.84,
            "idleTime": 8655.923,
            "eruptionTime": 59.119164,
            "dormancyCycles": 49.24731,
            "activeCycles": 55.309845
          },
          {
            "id": "slush_water",
            "posX": 77,
            "posY": 301,
            "emitRate": 5491.1924,
            "idleTime": 313.0454,
            "eruptionTime": 224.0904,
            "dormancyCycles": 22.993965,
            "activeCycles": 68.974396
          },
          {
            "id": "slimy_po2",
            "posX": 158,
            "posY": 175,
            "emitRate": 313.9229,
            "idleTime": 180.17238,
            "eruptionTime": 248.19667,
            "dormancyCycles": 47.335682,
            "activeCycles": 78.61331
          },
          {
            "id": "filthy_water",
            "posX": 31,
            "posY": 37,
            "emitRate": 9150.003,
            "idleTime": 271.1159,
            "eruptionTime": 281.8239,
            "dormancyCycles": 89.14084,
            "activeCycles": 84.82478
          },
          {
            "id": "slush_salt_water",
            "posX": 137,
            "posY": 222,
            "emitRate": 3441.7822,
            "idleTime": 222.22755,
            "eruptionTime": 479.1082,
            "dormancyCycles": 33.272,
            "activeCycles": 47.55754
          },
          {
            "id": "oil_drip",
            "posX": 49,
            "posY": 185,
            "emitRate": 309.95004,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.1315628,
            "activeCycles": 0.34218797
          },
          {
            "id": "molten_copper",
            "posX": 160,
            "posY": 135,
            "emitRate": 11040.428,
            "idleTime": 916.33234,
            "eruptionTime": 47.269302,
            "dormancyCycles": 47.121334,
            "activeCycles": 71.394615
          },
          {
            "id": "hot_co2",
            "posX": 125,
            "posY": 269,
            "emitRate": 371.66794,
            "idleTime": 148.0368,
            "eruptionTime": 133.88474,
            "dormancyCycles": 56.366028,
            "activeCycles": 70.914246
          },
          {
            "id": "hot_water",
            "posX": 20,
            "posY": 88,
            "emitRate": 8948.47,
            "idleTime": 206.46227,
            "eruptionTime": 205.57585,
            "dormancyCycles": 59.196575,
            "activeCycles": 65.116234
          }
        ]
      }
    ],
    "starMapEntriesVanilla": [
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "MetallicAsteroid",
        "distance": 1
      },
      {
        "id": "RockyAsteroid",
        "distance": 2
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "RockyAsteroid",
        "distance": 3
      },
      {
        "id": "ForestPlanet",
        "distance": 3
      },
      {
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 4
      },
      {
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "MetallicAsteroid",
        "distance": 5
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 5
      },
      {
        "id": "DustyMoon",
        "distance": 6
      },
      {
        "id": "DustyMoon",
        "distance": 7
      },
      {
        "id": "DustyMoon",
        "distance": 7
      },
      {
        "id": "GasGiant",
        "distance": 8
      },
      {
        "id": "HeliumGiant",
        "distance": 9
      },
      {
        "id": "HeliumGiant",
        "distance": 9
      },
      {
        "id": "RockyAsteroid",
        "distance": 10
      },
      {
        "id": "RockyAsteroid",
        "distance": 11
      },
      {
        "id": "GoldAsteroid",
        "distance": 12
      },
      {
        "id": "ChlorinePlanet",
        "distance": 12
      },
      {
        "id": "IcyDwarf",
        "distance": 13
      },
      {
        "id": "RockyAsteroid",
        "distance": 14
      },
      {
        "id": "RockyAsteroid",
        "distance": 14
      },
      {
        "id": "HeliumGiant",
        "distance": 15
      },
      {
        "id": "HeliumGiant",
        "distance": 15
      },
      {
        "id": "SaltDwarf",
        "distance": 16
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "S-FRZ-23739300-0-0-0",
    "cluster": "S-FRZ",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "SandstoneFrozen",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [
          "Geodes",
          "GeoActive",
          "FrozenCore",
          "MetalPoor"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 113,
            "posY": 183
          },
          {
            "id": "MassiveHeatSink",
            "posX": 237,
            "posY": 17
          },
          {
            "id": "GeneShuffler",
            "posX": 120,
            "posY": 137
          },
          {
            "id": "GeneShuffler",
            "posX": 22,
            "posY": 122
          },
          {
            "id": "GeneShuffler",
            "posX": 153,
            "posY": 247
          },
          {
            "id": "GeneShuffler",
            "posX": 200,
            "posY": 72
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 229,
            "posY": 245,
            "emitRate": 4637.7495,
            "idleTime": 265.85333,
            "eruptionTime": 329.23993,
            "dormancyCycles": 47.554432,
            "activeCycles": 76.92527
          },
          {
            "id": "methane",
            "posX": 136,
            "posY": 287,
            "emitRate": 707.3532,
            "idleTime": 428.16574,
            "eruptionTime": 179.70445,
            "dormancyCycles": 50.97466,
            "activeCycles": 81.20368
          },
          {
            "id": "steam",
            "posX": 197,
            "posY": 129,
            "emitRate": 5619.9727,
            "idleTime": 205.31215,
            "eruptionTime": 151.00108,
            "dormancyCycles": 56.846523,
            "activeCycles": 104.88766
          },
          {
            "id": "methane",
            "posX": 69,
            "posY": 309,
            "emitRate": 331.60382,
            "idleTime": 253.356,
            "eruptionTime": 278.39804,
            "dormancyCycles": 14.37798,
            "activeCycles": 19.079927
          },
          {
            "id": "salt_water",
            "posX": 189,
            "posY": 271,
            "emitRate": 7354.0005,
            "idleTime": 195.22226,
            "eruptionTime": 360.3539,
            "dormancyCycles": 53.398685,
            "activeCycles": 71.86378
          },
          {
            "id": "OilWell",
            "posX": 176,
            "posY": 67,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 17,
            "posY": 52,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 208,
            "posY": 52,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "chlorine_gas",
            "posX": 32,
            "posY": 247,
            "emitRate": 394.46826,
            "idleTime": 270.8667,
            "eruptionTime": 239.98882,
            "dormancyCycles": 60.666916,
            "activeCycles": 95.86186
          },
          {
            "id": "molten_copper",
            "posX": 65,
            "posY": 17,
            "emitRate": 8514.34,
            "idleTime": 723.9498,
            "eruptionTime": 49.31497,
            "dormancyCycles": 57.067253,
            "activeCycles": 93.31084
          },
          {
            "id": "liquid_co2",
            "posX": 235,
            "posY": 76,
            "emitRate": 431.23572,
            "idleTime": 280.20874,
            "eruptionTime": 378.80054,
            "dormancyCycles": 70.10487,
            "activeCycles": 69.014046
          },
          {
            "id": "small_volcano",
            "posX": 129,
            "posY": 44,
            "emitRate": 135842.73,
            "idleTime": 8144.877,
            "eruptionTime": 58.569286,
            "dormancyCycles": 38.972683,
            "activeCycles": 67.457634
          },
          {
            "id": "slush_water",
            "posX": 163,
            "posY": 69,
            "emitRate": 4514.6685,
            "idleTime": 290.63345,
            "eruptionTime": 301.8397,
            "dormancyCycles": 63.550163,
            "activeCycles": 88.75342
          },
          {
            "id": "slimy_po2",
            "posX": 73,
            "posY": 248,
            "emitRate": 319.57745,
            "idleTime": 271.7546,
            "eruptionTime": 362.04367,
            "dormancyCycles": 59.63661,
            "activeCycles": 92.23505
          },
          {
            "id": "molten_copper",
            "posX": 57,
            "posY": 314,
            "emitRate": 8427.257,
            "idleTime": 682.4091,
            "eruptionTime": 46.674736,
            "dormancyCycles": 58.112137,
            "activeCycles": 67.38779
          },
          {
            "id": "hot_co2",
            "posX": 195,
            "posY": 164,
            "emitRate": 395.65222,
            "idleTime": 385.0358,
            "eruptionTime": 310.0215,
            "dormancyCycles": 63.686863,
            "activeCycles": 108.39702
          },
          {
            "id": "big_volcano",
            "posX": 212,
            "posY": 74,
            "emitRate": 275030.94,
            "idleTime": 8571.978,
            "eruptionTime": 61.388683,
            "dormancyCycles": 42.04793,
            "activeCycles": 73.76314
          },
          {
            "id": "hot_po2",
            "posX": 27,
            "posY": 45,
            "emitRate": 322.30215,
            "idleTime": 271.87466,
            "eruptionTime": 339.61166,
            "dormancyCycles": 63.725983,
            "activeCycles": 74.389305
          },
          {
            "id": "hot_water",
            "posX": 127,
            "posY": 103,
            "emitRate": 11914.726,
            "idleTime": 489.85828,
            "eruptionTime": 298.51428,
            "dormancyCycles": 48.121197,
            "activeCycles": 70.98598
          },
          {
            "id": "hot_co2",
            "posX": 206,
            "posY": 241,
            "emitRate": 292.6575,
            "idleTime": 249.53993,
            "eruptionTime": 373.51242,
            "dormancyCycles": 57.655285,
            "activeCycles": 83.75848
          },
          {
            "id": "hot_co2",
            "posX": 181,
            "posY": 245,
            "emitRate": 465.21384,
            "idleTime": 350.254,
            "eruptionTime": 214.26393,
            "dormancyCycles": 31.444242,
            "activeCycles": 75.08056
          },
          {
            "id": "chlorine_gas",
            "posX": 200,
            "posY": 211,
            "emitRate": 338.13196,
            "idleTime": 40.62698,
            "eruptionTime": 48.145397,
            "dormancyCycles": 33.63387,
            "activeCycles": 41.39403
          },
          {
            "id": "hot_steam",
            "posX": 104,
            "posY": 279,
            "emitRate": 3159.6912,
            "idleTime": 471.4761,
            "eruptionTime": 244.44003,
            "dormancyCycles": 32.340775,
            "activeCycles": 49.797733
          },
          {
            "id": "slush_water",
            "posX": 233,
            "posY": 131,
            "emitRate": 3815.4746,
            "idleTime": 196.21886,
            "eruptionTime": 285.4524,
            "dormancyCycles": 16.173779,
            "activeCycles": 40.006638
          }
        ]
      }
    ],
    "starMapEntriesVanilla": [
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "MetallicAsteroid",
        "distance": 1
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "RockyAsteroid",
        "distance": 2
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "RockyAsteroid",
        "distance": 3
      },
      {
        "id": "RockyAsteroid",
        "distance": 3
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "MetallicAsteroid",
        "distance": 4
      },
      {
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "IcyDwarf",
        "distance": 5
      },
      {
        "id": "IcyDwarf",
        "distance": 5
      },
      {
        "id": "IcyDwarf",
        "distance": 6
      },
      {
        "id": "ChlorinePlanet",
        "distance": 6
      },
      {
        "id": "TerraPlanet",
        "distance": 7
      },
      {
        "id": "IceGiant",
        "distance": 8
      },
      {
        "id": "RustPlanet",
        "distance": 8
      },
      {
        "id": "MetallicAsteroid",
        "distance": 10
      },
      {
        "id": "RockyAsteroid",
        "distance": 11
      },
      {
        "id": "DustyMoon",
        "distance": 13
      },
      {
        "id": "MetallicAsteroid",
        "distance": 13
      },
      {
        "id": "RockyAsteroid",
        "distance": 14
      },
      {
        "id": "RockyAsteroid",
        "distance": 14
      },
      {
        "id": "ForestPlanet",
        "distance": 15
      },
      {
        "id": "OilyAsteriod",
        "distance": 15
      },
      {
        "id": "OilyAsteriod",
        "distance": 15
      },
      {
        "id": "VolcanoPlanet",
        "distance": 16
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "OASIS-A-1754674138-0-0-0",
    "cluster": "OASIS-A",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "Oasis",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [
          "MetalPoor",
          "Geodes",
          "MisalignedStart"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 152,
            "posY": 188
          },
          {
            "id": "GeneShuffler",
            "posX": 109,
            "posY": 106
          },
          {
            "id": "GeneShuffler",
            "posX": 50,
            "posY": 150
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 25,
            "posY": 98,
            "emitRate": 5719.9614,
            "idleTime": 380.24603,
            "eruptionTime": 344.1371,
            "dormancyCycles": 20.794144,
            "activeCycles": 55.50797
          },
          {
            "id": "methane",
            "posX": 53,
            "posY": 272,
            "emitRate": 321.00885,
            "idleTime": 175.6725,
            "eruptionTime": 196.23692,
            "dormancyCycles": 44.136097,
            "activeCycles": 53.957855
          },
          {
            "id": "steam",
            "posX": 77,
            "posY": 76,
            "emitRate": 5359.397,
            "idleTime": 340.0592,
            "eruptionTime": 297.50366,
            "dormancyCycles": 48.312347,
            "activeCycles": 73.5031
          },
          {
            "id": "methane",
            "posX": 39,
            "posY": 58,
            "emitRate": 389.7145,
            "idleTime": 265.96417,
            "eruptionTime": 193.57115,
            "dormancyCycles": 54.70045,
            "activeCycles": 70.25548
          },
          {
            "id": "salt_water",
            "posX": 233,
            "posY": 290,
            "emitRate": 37242.51,
            "idleTime": 391.1678,
            "eruptionTime": 66.057335,
            "dormancyCycles": 46.814064,
            "activeCycles": 73.24266
          },
          {
            "id": "OilWell",
            "posX": 187,
            "posY": 251,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 220,
            "posY": 238,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 138,
            "posY": 96,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 171,
            "posY": 309,
            "emitRate": 6992.493,
            "idleTime": 193.01768,
            "eruptionTime": 425.40573,
            "dormancyCycles": 48.46049,
            "activeCycles": 58.160286
          },
          {
            "id": "molten_iron",
            "posX": 96,
            "posY": 140,
            "emitRate": 9953.403,
            "idleTime": 880.9827,
            "eruptionTime": 51.593716,
            "dormancyCycles": 20.911133,
            "activeCycles": 77.60798
          },
          {
            "id": "hot_water",
            "posX": 78,
            "posY": 237,
            "emitRate": 8458.54,
            "idleTime": 204.65028,
            "eruptionTime": 231.2043,
            "dormancyCycles": 25.751604,
            "activeCycles": 42.54104
          },
          {
            "id": "hot_water",
            "posX": 160,
            "posY": 109,
            "emitRate": 9002.831,
            "idleTime": 332.77582,
            "eruptionTime": 318.70685,
            "dormancyCycles": 33.87728,
            "activeCycles": 69.335106
          },
          {
            "id": "steam",
            "posX": 65,
            "posY": 200,
            "emitRate": 3530.1233,
            "idleTime": 267.4881,
            "eruptionTime": 320.40332,
            "dormancyCycles": 54.827103,
            "activeCycles": 60.471375
          },
          {
            "id": "slimy_po2",
            "posX": 22,
            "posY": 294,
            "emitRate": 405.07593,
            "idleTime": 317.66583,
            "eruptionTime": 257.31323,
            "dormancyCycles": 49.548187,
            "activeCycles": 56.6587
          },
          {
            "id": "slush_salt_water",
            "posX": 179,
            "posY": 121,
            "emitRate": 6381.967,
            "idleTime": 433.55878,
            "eruptionTime": 258.13092,
            "dormancyCycles": 49.781414,
            "activeCycles": 101.25042
          },
          {
            "id": "slush_salt_water",
            "posX": 195,
            "posY": 283,
            "emitRate": 4634.2056,
            "idleTime": 434.202,
            "eruptionTime": 456.91696,
            "dormancyCycles": 65.33329,
            "activeCycles": 84.88325
          },
          {
            "id": "big_volcano",
            "posX": 91,
            "posY": 125,
            "emitRate": 266745.62,
            "idleTime": 7790.152,
            "eruptionTime": 57.71561,
            "dormancyCycles": 46.320164,
            "activeCycles": 114.764755
          },
          {
            "id": "molten_gold",
            "posX": 184,
            "posY": 188,
            "emitRate": 9887.388,
            "idleTime": 821.15015,
            "eruptionTime": 49.718422,
            "dormancyCycles": 42.012814,
            "activeCycles": 59.635788
          },
          {
            "id": "steam",
            "posX": 25,
            "posY": 173,
            "emitRate": 3136.8171,
            "idleTime": 287.177,
            "eruptionTime": 440.82056,
            "dormancyCycles": 27.191675,
            "activeCycles": 51.73004
          },
          {
            "id": "filthy_water",
            "posX": 160,
            "posY": 249,
            "emitRate": 10427.586,
            "idleTime": 376.58844,
            "eruptionTime": 307.27747,
            "dormancyCycles": 41.17895,
            "activeCycles": 46.357838
          },
          {
            "id": "OilWell",
            "posX": 72,
            "posY": 171,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 77,
            "posY": 198,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 141,
            "posY": 83,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 150,
            "posY": 264,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 174,
            "posY": 273,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 195,
            "posY": 267,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 208,
            "posY": 170,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 213,
            "posY": 250,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 237,
            "posY": 228,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          }
        ]
      }
    ],
    "starMapEntriesVanilla": [
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "MetallicAsteroid",
        "distance": 1
      },
      {
        "id": "RockyAsteroid",
        "distance": 2
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 3
      },
      {
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "MetallicAsteroid",
        "distance": 4
      },
      {
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "MetallicAsteroid",
        "distance": 5
      },
      {
        "id": "IcyDwarf",
        "distance": 6
      },
      {
        "id": "RedDwarf",
        "distance": 6
      },
      {
        "id": "IceGiant",
        "distance": 8
      },
      {
        "id": "HeliumGiant",
        "distance": 9
      },
      {
        "id": "HeliumGiant",
        "distance": 9
      },
      {
        "id": "MetallicAsteroid",
        "distance": 10
      },
      {
        "id": "RustPlanet",
        "distance": 10
      },
      {
        "id": "MetallicAsteroid",
        "distance": 11
      },
      {
        "id": "RockyAsteroid",
        "distance": 11
      },
      {
        "id": "RockyAsteroid",
        "distance": 11
      },
      {
        "id": "ForestPlanet",
        "distance": 12
      },
      {
        "id": "OrganicDwarf",
        "distance": 12
      },
      {
        "id": "DustyMoon",
        "distance": 13
      },
      {
        "id": "DustyMoon",
        "distance": 13
      },
      {
        "id": "TerraPlanet",
        "distance": 16
      },
      {
        "id": "SaltDwarf",
        "distance": 16
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "CER-C-1518889578-0-0-0",
    "cluster": "CER-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "CeresSpacedOutAsteroid",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 274,
        "worldTraits": [
          "BouldersLarge",
          "MisalignedStart",
          "GeoActive",
          "Volcanoes"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 48,
            "posY": 127
          },
          {
            "id": "MassiveHeatSink",
            "posX": 53,
            "posY": 66
          },
          {
            "id": "WarpConduitSender",
            "posX": 123,
            "posY": 144
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 37,
            "posY": 205
          },
          {
            "id": "WarpPortal",
            "posX": 67,
            "posY": 96
          },
          {
            "id": "WarpReceiver",
            "posX": 68,
            "posY": 90
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 89,
            "posY": 76,
            "emitRate": 8507.158,
            "idleTime": 354.89578,
            "eruptionTime": 385.1802,
            "dormancyCycles": 52.381203,
            "activeCycles": 54.223663
          },
          {
            "id": "liquid_co2",
            "posX": 68,
            "posY": 155,
            "emitRate": 667.7965,
            "idleTime": 476.00626,
            "eruptionTime": 275.95792,
            "dormancyCycles": 58.451412,
            "activeCycles": 75.1946
          },
          {
            "id": "slush_salt_water",
            "posX": 84,
            "posY": 113,
            "emitRate": 3962.5984,
            "idleTime": 152.4652,
            "eruptionTime": 332.7052,
            "dormancyCycles": 33.656273,
            "activeCycles": 50.651382
          },
          {
            "id": "filthy_water",
            "posX": 38,
            "posY": 196,
            "emitRate": 7634.821,
            "idleTime": 151.81505,
            "eruptionTime": 222.65974,
            "dormancyCycles": 81.971085,
            "activeCycles": 102.77772
          },
          {
            "id": "slush_salt_water",
            "posX": 146,
            "posY": 92,
            "emitRate": 4448.1597,
            "idleTime": 236.32648,
            "eruptionTime": 263.96402,
            "dormancyCycles": 80.249504,
            "activeCycles": 70.8846
          },
          {
            "id": "filthy_water",
            "posX": 25,
            "posY": 62,
            "emitRate": 15437.931,
            "idleTime": 580.2204,
            "eruptionTime": 265.24445,
            "dormancyCycles": 45.362923,
            "activeCycles": 86.30871
          },
          {
            "id": "molten_gold",
            "posX": 139,
            "posY": 56,
            "emitRate": 8983.89,
            "idleTime": 758.39996,
            "eruptionTime": 48.076042,
            "dormancyCycles": 52.2608,
            "activeCycles": 83.08139
          },
          {
            "id": "molten_aluminum",
            "posX": 37,
            "posY": 183,
            "emitRate": 16889.484,
            "idleTime": 912.6792,
            "eruptionTime": 30.52735,
            "dormancyCycles": 64.35064,
            "activeCycles": 130.11353
          },
          {
            "id": "hot_hydrogen",
            "posX": 22,
            "posY": 182,
            "emitRate": 286.78403,
            "idleTime": 200.30869,
            "eruptionTime": 311.04782,
            "dormancyCycles": 48.948124,
            "activeCycles": 80.86617
          },
          {
            "id": "slimy_po2",
            "posX": 31,
            "posY": 43,
            "emitRate": 245.60095,
            "idleTime": 118.1134,
            "eruptionTime": 309.36673,
            "dormancyCycles": 42.635284,
            "activeCycles": 107.965256
          },
          {
            "id": "big_volcano",
            "posX": 89,
            "posY": 174,
            "emitRate": 294940.72,
            "idleTime": 9106.258,
            "eruptionTime": 59.384834,
            "dormancyCycles": 41.975677,
            "activeCycles": 56.223717
          },
          {
            "id": "big_volcano",
            "posX": 127,
            "posY": 178,
            "emitRate": 254221.11,
            "idleTime": 10046.74,
            "eruptionTime": 74.811455,
            "dormancyCycles": 40.563194,
            "activeCycles": 52.994476
          },
          {
            "id": "big_volcano",
            "posX": 129,
            "posY": 122,
            "emitRate": 211011.06,
            "idleTime": 7595.5513,
            "eruptionTime": 59.946682,
            "dormancyCycles": 43.84922,
            "activeCycles": 88.14337
          },
          {
            "id": "big_volcano",
            "posX": 112,
            "posY": 113,
            "emitRate": 263181.6,
            "idleTime": 8798.278,
            "eruptionTime": 66.719666,
            "dormancyCycles": 35.770596,
            "activeCycles": 42.331215
          },
          {
            "id": "big_volcano",
            "posX": 106,
            "posY": 186,
            "emitRate": 273748,
            "idleTime": 7808.0674,
            "eruptionTime": 56.940674,
            "dormancyCycles": 47.635147,
            "activeCycles": 67.46849
          }
        ]
      },
      {
        "id": "SwampyLandingSite",
        "offsetX": 244,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "Geodes"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_cobalt",
            "posX": 348,
            "posY": 89,
            "emitRate": 7217.7163,
            "idleTime": 756.1438,
            "eruptionTime": 51.896812,
            "dormancyCycles": 37.759384,
            "activeCycles": 73.53309
          },
          {
            "id": "molten_gold",
            "posX": 336,
            "posY": 68,
            "emitRate": 9574.968,
            "idleTime": 871.8749,
            "eruptionTime": 57.775826,
            "dormancyCycles": 31.562117,
            "activeCycles": 76.16432
          },
          {
            "id": "molten_cobalt",
            "posX": 336,
            "posY": 56,
            "emitRate": 10341.834,
            "idleTime": 727.8659,
            "eruptionTime": 38.818043,
            "dormancyCycles": 54.75172,
            "activeCycles": 84.23979
          },
          {
            "id": "molten_gold",
            "posX": 260,
            "posY": 66,
            "emitRate": 10528.606,
            "idleTime": 621.9019,
            "eruptionTime": 28.755953,
            "dormancyCycles": 48.255432,
            "activeCycles": 84.308846
          },
          {
            "id": "liquid_co2",
            "posX": 267,
            "posY": 14,
            "emitRate": 482.83298,
            "idleTime": 349.0711,
            "eruptionTime": 415.97186,
            "dormancyCycles": 19.543386,
            "activeCycles": 28.211536
          },
          {
            "id": "liquid_co2",
            "posX": 309,
            "posY": 34,
            "emitRate": 262.2267,
            "idleTime": 55.996586,
            "eruptionTime": 293.39474,
            "dormancyCycles": 43.478264,
            "activeCycles": 62.48562
          },
          {
            "id": "methane",
            "posX": 358,
            "posY": 72,
            "emitRate": 297.48358,
            "idleTime": 255.02798,
            "eruptionTime": 375.12253,
            "dormancyCycles": 55.372025,
            "activeCycles": 93.64806
          },
          {
            "id": "methane",
            "posX": 280,
            "posY": 12,
            "emitRate": 378.33456,
            "idleTime": 214.32784,
            "eruptionTime": 181.37355,
            "dormancyCycles": 47.635147,
            "activeCycles": 67.46849
          },
          {
            "id": "molten_copper",
            "posX": 274,
            "posY": 47,
            "emitRate": 8306.291,
            "idleTime": 750.96716,
            "eruptionTime": 49.36061,
            "dormancyCycles": 51.36087,
            "activeCycles": 76.62534
          }
        ]
      },
      {
        "id": "OilRichWarpTarget",
        "offsetX": 374,
        "offsetY": 0,
        "sizeX": 128,
        "sizeY": 153,
        "worldTraits": [
          "CrashedSatellites",
          "BouldersMedium"
        ],
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 392,
            "posY": 92
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 442,
            "posY": 53
          },
          {
            "id": "WarpPortal",
            "posX": 441,
            "posY": 86
          },
          {
            "id": "WarpReceiver",
            "posX": 463,
            "posY": 86
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 398,
            "posY": 54,
            "emitRate": 5193.259,
            "idleTime": 188.88548,
            "eruptionTime": 127.131935,
            "dormancyCycles": 47.85763,
            "activeCycles": 77.53508
          },
          {
            "id": "OilWell",
            "posX": 419,
            "posY": 31,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 445,
            "posY": 28,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 390,
            "posY": 38,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 430,
            "posY": 28,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 465,
            "posY": 39,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "small_volcano",
            "posX": 485,
            "posY": 74,
            "emitRate": 128120.71,
            "idleTime": 8788.564,
            "eruptionTime": 80.116234,
            "dormancyCycles": 35.13276,
            "activeCycles": 79.18853
          },
          {
            "id": "liquid_sulfur",
            "posX": 474,
            "posY": 51,
            "emitRate": 5554.7534,
            "idleTime": 343.3154,
            "eruptionTime": 241.66112,
            "dormancyCycles": 33.437485,
            "activeCycles": 52.857895
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 162,
        "offsetY": 176,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "SubsurfaceOcean"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 209,
            "posY": 189,
            "emitRate": 9613.2,
            "idleTime": 669.06287,
            "eruptionTime": 40.20624,
            "dormancyCycles": 81.8721,
            "activeCycles": 106.082985
          },
          {
            "id": "molten_iron",
            "posX": 174,
            "posY": 203,
            "emitRate": 8306.151,
            "idleTime": 572.72943,
            "eruptionTime": 40.70996,
            "dormancyCycles": 44.862114,
            "activeCycles": 79.9853
          },
          {
            "id": "molten_iron",
            "posX": 189,
            "posY": 231,
            "emitRate": 6990.5938,
            "idleTime": 754.91174,
            "eruptionTime": 55.70327,
            "dormancyCycles": 61.533497,
            "activeCycles": 75.6386
          },
          {
            "id": "molten_iron",
            "posX": 215,
            "posY": 206,
            "emitRate": 9321.188,
            "idleTime": 863.97144,
            "eruptionTime": 53.990295,
            "dormancyCycles": 60.74114,
            "activeCycles": 98.64378
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 228,
        "offsetY": 176,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "MetalPoor"
        ],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 248,
            "posY": 226
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 280,
            "posY": 181,
            "emitRate": 9189.259,
            "idleTime": 770.1825,
            "eruptionTime": 47.15712,
            "dormancyCycles": 44.70688,
            "activeCycles": 75.409645
          },
          {
            "id": "molten_tungsten",
            "posX": 263,
            "posY": 181,
            "emitRate": 9051.035,
            "idleTime": 770.0794,
            "eruptionTime": 49.997643,
            "dormancyCycles": 77.098915,
            "activeCycles": 70.68499
          },
          {
            "id": "molten_tungsten",
            "posX": 249,
            "posY": 186,
            "emitRate": 8660.978,
            "idleTime": 602.1321,
            "eruptionTime": 33.42317,
            "dormancyCycles": 46.67587,
            "activeCycles": 110.835884
          },
          {
            "id": "chlorine_gas",
            "posX": 269,
            "posY": 212,
            "emitRate": 330.5304,
            "idleTime": 315.6826,
            "eruptionTime": 301.47006,
            "dormancyCycles": 50.960373,
            "activeCycles": 87.7503
          },
          {
            "id": "hot_co2",
            "posX": 281,
            "posY": 200,
            "emitRate": 330.5304,
            "idleTime": 315.6826,
            "eruptionTime": 301.47006,
            "dormancyCycles": 50.960373,
            "activeCycles": 87.7503
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 504,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 518,
            "posY": 26,
            "emitRate": 310.94098,
            "idleTime": 151.86751,
            "eruptionTime": 150.73631,
            "dormancyCycles": 43.109867,
            "activeCycles": 52.241436
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 162,
        "offsetY": 0,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "slush_water",
            "posX": 197,
            "posY": 56,
            "emitRate": 6291.475,
            "idleTime": 428.63684,
            "eruptionTime": 226.11317,
            "dormancyCycles": 24.496798,
            "activeCycles": 44.258873
          },
          {
            "id": "filthy_water",
            "posX": 183,
            "posY": 108,
            "emitRate": 10611.618,
            "idleTime": 332.0017,
            "eruptionTime": 390.9347,
            "dormancyCycles": 29.152878,
            "activeCycles": 66.05554
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 294,
        "offsetY": 155,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 349,
            "posY": 183,
            "emitRate": 330072.4,
            "idleTime": 8964.356,
            "eruptionTime": 59.704704,
            "dormancyCycles": 47.344185,
            "activeCycles": 83.1005
          }
        ]
      },
      {
        "id": "RegolithMoonlet",
        "offsetX": 360,
        "offsetY": 155,
        "sizeX": 160,
        "sizeY": 96,
        "worldTraits": [
          "MetalRich"
        ],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 508,
            "posY": 180
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 474,
            "posY": 164,
            "emitRate": 5705.707,
            "idleTime": 380.35764,
            "eruptionTime": 261.37692,
            "dormancyCycles": 39.5364,
            "activeCycles": 63.155293
          },
          {
            "id": "hot_steam",
            "posX": 412,
            "posY": 168,
            "emitRate": 2606.9612,
            "idleTime": 290.1671,
            "eruptionTime": 344.7174,
            "dormancyCycles": 61.849377,
            "activeCycles": 88.993866
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "CeresSpacedOutAsteroid",
        "q": 0,
        "r": 0
      },
      {
        "id": "SwampyLandingSite",
        "q": -3,
        "r": 1
      },
      {
        "id": "OilRichWarpTarget",
        "q": 4,
        "r": -4
      },
      {
        "id": "TundraMoonlet",
        "q": 0,
        "r": 7
      },
      {
        "id": "MarshyMoonlet",
        "q": -5,
        "r": -2
      },
      {
        "id": "MooMoonlet",
        "q": 7,
        "r": 0
      },
      {
        "id": "WaterMoonlet",
        "q": -7,
        "r": 6
      },
      {
        "id": "NiobiumMoonlet",
        "q": 9,
        "r": -4
      },
      {
        "id": "RegolithMoonlet",
        "q": 3,
        "r": -10
      },
      {
        "id": "TemporalTear",
        "q": -7,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_DLC2CeresOreField",
        "q": 0,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -8,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 10,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 10,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 11,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 6,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 5,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -4,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 4,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 1,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 2,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 4,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 5,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -2,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -11,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -11,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -11,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -10,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -11,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -10,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": -2,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -8,
        "r": 10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -3,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -3,
        "r": -5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 8,
        "r": -6
      }
    ]
  },
  {
    "coordinate": "V-CER-C-1222168420-0-D3-0",
    "cluster": "V-CER-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "CeresClassicAsteroid",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "BouldersMedium",
          "MisalignedStart",
          "CrashedSatellites"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 65,
            "posY": 250
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 29,
            "posY": 312
          },
          {
            "id": "WarpConduitSender",
            "posX": 47,
            "posY": 162
          },
          {
            "id": "MassiveHeatSink",
            "posX": 93,
            "posY": 291
          },
          {
            "id": "WarpReceiver",
            "posX": 22,
            "posY": 202
          },
          {
            "id": "WarpPortal",
            "posX": 21,
            "posY": 208
          },
          {
            "id": "GeneShuffler",
            "posX": 215,
            "posY": 94
          },
          {
            "id": "GeneShuffler",
            "posX": 168,
            "posY": 237
          },
          {
            "id": "GeneShuffler",
            "posX": 120,
            "posY": 233
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 206,
            "posY": 59,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 175,
            "posY": 66,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 155,
            "posY": 51,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 149,
            "posY": 205,
            "emitRate": 17341.193,
            "idleTime": 46.45377,
            "eruptionTime": 16.191103,
            "dormancyCycles": 62.973972,
            "activeCycles": 90.05533
          },
          {
            "id": "molten_cobalt",
            "posX": 82,
            "posY": 82,
            "emitRate": 11180.659,
            "idleTime": 689.6727,
            "eruptionTime": 35.86759,
            "dormancyCycles": 42.11354,
            "activeCycles": 68.10245
          },
          {
            "id": "molten_aluminum",
            "posX": 195,
            "posY": 302,
            "emitRate": 6476.463,
            "idleTime": 855.99054,
            "eruptionTime": 78.73605,
            "dormancyCycles": 32.35838,
            "activeCycles": 83.61659
          },
          {
            "id": "molten_aluminum",
            "posX": 227,
            "posY": 48,
            "emitRate": 8084.7246,
            "idleTime": 797.0806,
            "eruptionTime": 58.20358,
            "dormancyCycles": 69.28994,
            "activeCycles": 120.97216
          },
          {
            "id": "slush_salt_water",
            "posX": 133,
            "posY": 181,
            "emitRate": 7221.6714,
            "idleTime": 343.55453,
            "eruptionTime": 164.40143,
            "dormancyCycles": 46.819942,
            "activeCycles": 64.69481
          },
          {
            "id": "hot_hydrogen",
            "posX": 100,
            "posY": 136,
            "emitRate": 341.11102,
            "idleTime": 271.09464,
            "eruptionTime": 283.8082,
            "dormancyCycles": 62.559494,
            "activeCycles": 73.3317
          },
          {
            "id": "methane",
            "posX": 206,
            "posY": 306,
            "emitRate": 371.3364,
            "idleTime": 279.57117,
            "eruptionTime": 269.00006,
            "dormancyCycles": 47.147774,
            "activeCycles": 82.446785
          },
          {
            "id": "liquid_sulfur",
            "posX": 218,
            "posY": 174,
            "emitRate": 5845.362,
            "idleTime": 212.38483,
            "eruptionTime": 232.70416,
            "dormancyCycles": 68.47494,
            "activeCycles": 106.83997
          },
          {
            "id": "liquid_sulfur",
            "posX": 22,
            "posY": 102,
            "emitRate": 6970.522,
            "idleTime": 345.15543,
            "eruptionTime": 259.78635,
            "dormancyCycles": 55.99884,
            "activeCycles": 87.464386
          },
          {
            "id": "chlorine_gas",
            "posX": 18,
            "posY": 69,
            "emitRate": 383.46033,
            "idleTime": 347.9778,
            "eruptionTime": 310.3284,
            "dormancyCycles": 52.181213,
            "activeCycles": 102.233696
          },
          {
            "id": "chlorine_gas",
            "posX": 64,
            "posY": 67,
            "emitRate": 468.17978,
            "idleTime": 384.065,
            "eruptionTime": 240.34296,
            "dormancyCycles": 39.055195,
            "activeCycles": 67.48492
          },
          {
            "id": "liquid_sulfur",
            "posX": 44,
            "posY": 124,
            "emitRate": 13488.7705,
            "idleTime": 447.93274,
            "eruptionTime": 124.7094,
            "dormancyCycles": 39.03012,
            "activeCycles": 56.559956
          },
          {
            "id": "slimy_po2",
            "posX": 168,
            "posY": 206,
            "emitRate": 1128.9473,
            "idleTime": 647.16614,
            "eruptionTime": 121.262985,
            "dormancyCycles": 37.117992,
            "activeCycles": 53.970993
          }
        ]
      },
      {
        "id": "MediumSwampy",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "MagmaVents",
          "MetalPoor"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 262,
            "posY": 91
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 346,
            "posY": 44
          },
          {
            "id": "WarpConduitSender",
            "posX": 310,
            "posY": 88
          },
          {
            "id": "WarpReceiver",
            "posX": 327,
            "posY": 64
          },
          {
            "id": "WarpPortal",
            "posX": 305,
            "posY": 64
          },
          {
            "id": "GeneShuffler",
            "posX": 368,
            "posY": 66
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 283,
            "posY": 103,
            "emitRate": 5819.1133,
            "idleTime": 296.28366,
            "eruptionTime": 263.4644,
            "dormancyCycles": 46.557064,
            "activeCycles": 90.55993
          },
          {
            "id": "methane",
            "posX": 381,
            "posY": 108,
            "emitRate": 386.3732,
            "idleTime": 339.86346,
            "eruptionTime": 300.78656,
            "dormancyCycles": 56.891594,
            "activeCycles": 79.07787
          },
          {
            "id": "salt_water",
            "posX": 389,
            "posY": 55,
            "emitRate": 6722.079,
            "idleTime": 185.33423,
            "eruptionTime": 381.24084,
            "dormancyCycles": 38.95702,
            "activeCycles": 39.247627
          },
          {
            "id": "molten_copper",
            "posX": 258,
            "posY": 81,
            "emitRate": 8013.2817,
            "idleTime": 752.3983,
            "eruptionTime": 47.522274,
            "dormancyCycles": 51.30236,
            "activeCycles": 83.467476
          },
          {
            "id": "molten_copper",
            "posX": 364,
            "posY": 11,
            "emitRate": 6855.1807,
            "idleTime": 653.51166,
            "eruptionTime": 44.88123,
            "dormancyCycles": 37.211235,
            "activeCycles": 75.834595
          },
          {
            "id": "molten_cobalt",
            "posX": 329,
            "posY": 106,
            "emitRate": 7927.0225,
            "idleTime": 786.8677,
            "eruptionTime": 52.331043,
            "dormancyCycles": 25.099724,
            "activeCycles": 69.0184
          },
          {
            "id": "hot_po2",
            "posX": 289,
            "posY": 8,
            "emitRate": 422.73633,
            "idleTime": 307.89957,
            "eruptionTime": 205.45132,
            "dormancyCycles": 51.535137,
            "activeCycles": 85.85283
          },
          {
            "id": "hot_hydrogen",
            "posX": 390,
            "posY": 65,
            "emitRate": 367.56497,
            "idleTime": 303.49847,
            "eruptionTime": 346.21466,
            "dormancyCycles": 63.517845,
            "activeCycles": 54.93666
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "LushCore",
          "MetalPoor"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 356,
            "posY": 240,
            "emitRate": 10593.7705,
            "idleTime": 523.03656,
            "eruptionTime": 26.267002,
            "dormancyCycles": 46.948277,
            "activeCycles": 77.92115
          },
          {
            "id": "molten_iron",
            "posX": 336,
            "posY": 200,
            "emitRate": 9215.158,
            "idleTime": 722.0116,
            "eruptionTime": 38.28649,
            "dormancyCycles": 53.784557,
            "activeCycles": 84.59045
          },
          {
            "id": "molten_iron",
            "posX": 375,
            "posY": 207,
            "emitRate": 8476.278,
            "idleTime": 839.35205,
            "eruptionTime": 49.15889,
            "dormancyCycles": 52.788795,
            "activeCycles": 72.863434
          },
          {
            "id": "molten_iron",
            "posX": 371,
            "posY": 217,
            "emitRate": 8006.4077,
            "idleTime": 763.5993,
            "eruptionTime": 49.395912,
            "dormancyCycles": 71.94835,
            "activeCycles": 75.03864
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 363,
            "posY": 356
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 363,
            "posY": 336,
            "emitRate": 10188.835,
            "idleTime": 685.54285,
            "eruptionTime": 34.27697,
            "dormancyCycles": 55.84902,
            "activeCycles": 67.99981
          },
          {
            "id": "molten_tungsten",
            "posX": 373,
            "posY": 313,
            "emitRate": 12041.367,
            "idleTime": 730.70416,
            "eruptionTime": 32.227013,
            "dormancyCycles": 59.63084,
            "activeCycles": 80.03946
          },
          {
            "id": "molten_tungsten",
            "posX": 365,
            "posY": 314,
            "emitRate": 11685.993,
            "idleTime": 715.1386,
            "eruptionTime": 36.48582,
            "dormancyCycles": 47.39156,
            "activeCycles": 56.04511
          },
          {
            "id": "hot_po2",
            "posX": 376,
            "posY": 335,
            "emitRate": 349.3528,
            "idleTime": 337.6464,
            "eruptionTime": 360.8842,
            "dormancyCycles": 28.874863,
            "activeCycles": 45.67629
          },
          {
            "id": "slimy_po2",
            "posX": 345,
            "posY": 331,
            "emitRate": 478.71072,
            "idleTime": 383.557,
            "eruptionTime": 209.5865,
            "dormancyCycles": 46.199562,
            "activeCycles": 83.709145
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "FrozenCore"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 408,
            "posY": 203,
            "emitRate": 251000.33,
            "idleTime": 8747.574,
            "eruptionTime": 68.60306,
            "dormancyCycles": 56.60894,
            "activeCycles": 82.408714
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 413,
            "posY": 39,
            "emitRate": 331.98846,
            "idleTime": 345.8093,
            "eruptionTime": 354.91708,
            "dormancyCycles": 54.553223,
            "activeCycles": 89.74528
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 263,
            "posY": 270,
            "emitRate": 13549.854,
            "idleTime": 376.09186,
            "eruptionTime": 231.79631,
            "dormancyCycles": 33.910458,
            "activeCycles": 43.154263
          },
          {
            "id": "hot_water",
            "posX": 296,
            "posY": 282,
            "emitRate": 8618.392,
            "idleTime": 325.65884,
            "eruptionTime": 361.4642,
            "dormancyCycles": 53.436234,
            "activeCycles": 82.2698
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 464,
            "posY": 315
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 413,
            "posY": 286,
            "emitRate": 6108.4185,
            "idleTime": 296.41122,
            "eruptionTime": 195.26439,
            "dormancyCycles": 55.84902,
            "activeCycles": 67.99981
          },
          {
            "id": "steam",
            "posX": 441,
            "posY": 291,
            "emitRate": 6040.393,
            "idleTime": 465.6911,
            "eruptionTime": 342.83582,
            "dormancyCycles": 61.146206,
            "activeCycles": 65.598076
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "CeresClassicAsteroid",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumSwampy",
        "q": -3,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": 4,
        "r": -5
      },
      {
        "id": "MarshyMoonlet",
        "q": 6,
        "r": 0
      },
      {
        "id": "NiobiumMoonlet",
        "q": -6,
        "r": 5
      },
      {
        "id": "MooMoonlet",
        "q": 1,
        "r": 5
      },
      {
        "id": "WaterMoonlet",
        "q": -1,
        "r": -4
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -8,
        "r": 0
      },
      {
        "id": "TemporalTear",
        "q": -3,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_DLC2CeresOreField",
        "q": -2,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 11,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 11,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 5,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 5,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -1,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -5,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -5,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -5,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -4,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -4,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 8,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 1,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -11,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 10,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -9,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -7,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -7,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -8,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -6,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": 2,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -11,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -7,
        "r": 3
      }
    ]
  },
  {
    "coordinate": "CER-A-2097990788-0-D3-0",
    "cluster": "CER-A",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "CeresBaseGameAsteroid",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [
          "GeoDormant",
          "MetalRich"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 120,
            "posY": 237
          },
          {
            "id": "MassiveHeatSink",
            "posX": 169,
            "posY": 288
          },
          {
            "id": "GeneShuffler",
            "posX": 74,
            "posY": 131
          },
          {
            "id": "GeneShuffler",
            "posX": 142,
            "posY": 205
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 155,
            "posY": 156,
            "emitRate": 15169.271,
            "idleTime": 468.85574,
            "eruptionTime": 256.2833,
            "dormancyCycles": 32.404785,
            "activeCycles": 50.24249
          },
          {
            "id": "OilWell",
            "posX": 97,
            "posY": 59,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 198,
            "posY": 61,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 219,
            "posY": 60,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 242,
            "posY": 204,
            "emitRate": 9771.366,
            "idleTime": 290.23975,
            "eruptionTime": 278.52502,
            "dormancyCycles": 63.315678,
            "activeCycles": 95.49777
          },
          {
            "id": "small_volcano",
            "posX": 76,
            "posY": 171,
            "emitRate": 132984.02,
            "idleTime": 7130.617,
            "eruptionTime": 52.192337,
            "dormancyCycles": 44.908253,
            "activeCycles": 74.0942
          },
          {
            "id": "molten_copper",
            "posX": 130,
            "posY": 137,
            "emitRate": 10001.824,
            "idleTime": 836.8292,
            "eruptionTime": 47.605385,
            "dormancyCycles": 51.24872,
            "activeCycles": 86.20124
          },
          {
            "id": "steam",
            "posX": 203,
            "posY": 141,
            "emitRate": 5136.2373,
            "idleTime": 361.25443,
            "eruptionTime": 233.35994,
            "dormancyCycles": 36.992928,
            "activeCycles": 54.227997
          },
          {
            "id": "slimy_po2",
            "posX": 140,
            "posY": 54,
            "emitRate": 404.48343,
            "idleTime": 325.16827,
            "eruptionTime": 264.85492,
            "dormancyCycles": 32.360302,
            "activeCycles": 56.03134
          },
          {
            "id": "methane",
            "posX": 45,
            "posY": 220,
            "emitRate": 270.961,
            "idleTime": 165.17003,
            "eruptionTime": 361.0725,
            "dormancyCycles": 38.09081,
            "activeCycles": 68.930626
          },
          {
            "id": "big_volcano",
            "posX": 237,
            "posY": 215,
            "emitRate": 254633.2,
            "idleTime": 8163.5444,
            "eruptionTime": 63.894825,
            "dormancyCycles": 43.47818,
            "activeCycles": 54.857773
          },
          {
            "id": "molten_iron",
            "posX": 17,
            "posY": 141,
            "emitRate": 11803.44,
            "idleTime": 852.33563,
            "eruptionTime": 41.591343,
            "dormancyCycles": 47.98291,
            "activeCycles": 71.26442
          },
          {
            "id": "methane",
            "posX": 20,
            "posY": 180,
            "emitRate": 374.51807,
            "idleTime": 245.30107,
            "eruptionTime": 247.97697,
            "dormancyCycles": 47.58168,
            "activeCycles": 69.21211
          }
        ]
      }
    ],
    "starMapEntriesVanilla": [
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "MetallicAsteroid",
        "distance": 1
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "RockyAsteroid",
        "distance": 2
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "SaltDwarf",
        "distance": 4
      },
      {
        "id": "MetallicAsteroid",
        "distance": 4
      },
      {
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "IcyDwarf",
        "distance": 5
      },
      {
        "id": "ChlorinePlanet",
        "distance": 6
      },
      {
        "id": "VolcanoPlanet",
        "distance": 7
      },
      {
        "id": "DustyMoon",
        "distance": 7
      },
      {
        "id": "TerraPlanet",
        "distance": 7
      },
      {
        "id": "GasGiant",
        "distance": 8
      },
      {
        "id": "HeliumGiant",
        "distance": 9
      },
      {
        "id": "MetallicAsteroid",
        "distance": 10
      },
      {
        "id": "ShinyPlanet",
        "distance": 11
      },
      {
        "id": "ShinyPlanet",
        "distance": 11
      },
      {
        "id": "ChlorinePlanet",
        "distance": 12
      },
      {
        "id": "ForestPlanet",
        "distance": 12
      },
      {
        "id": "IcyDwarf",
        "distance": 13
      },
      {
        "id": "DustyMoon",
        "distance": 13
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "VOLCA-776934367-0-0-0",
    "cluster": "VOLCA",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "Volcanic",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [
          "MetalRich",
          "MagmaVents",
          "GlaciersLarge"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 123,
            "posY": 193
          },
          {
            "id": "MassiveHeatSink",
            "posX": 167,
            "posY": 99
          },
          {
            "id": "MassiveHeatSink",
            "posX": 231,
            "posY": 250
          },
          {
            "id": "MassiveHeatSink",
            "posX": 225,
            "posY": 230
          },
          {
            "id": "GeneShuffler",
            "posX": 109,
            "posY": 282
          },
          {
            "id": "GeneShuffler",
            "posX": 240,
            "posY": 91
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 173,
            "posY": 171,
            "emitRate": 6110.982,
            "idleTime": 412.22238,
            "eruptionTime": 253.88765,
            "dormancyCycles": 29.037949,
            "activeCycles": 66.96037
          },
          {
            "id": "methane",
            "posX": 115,
            "posY": 250,
            "emitRate": 268.57092,
            "idleTime": 298.2479,
            "eruptionTime": 448.86368,
            "dormancyCycles": 54.730938,
            "activeCycles": 79.08336
          },
          {
            "id": "steam",
            "posX": 190,
            "posY": 225,
            "emitRate": 4126.32,
            "idleTime": 253.30591,
            "eruptionTime": 350.0617,
            "dormancyCycles": 61.7568,
            "activeCycles": 49.357758
          },
          {
            "id": "methane",
            "posX": 17,
            "posY": 236,
            "emitRate": 358.41577,
            "idleTime": 453.28937,
            "eruptionTime": 470.11768,
            "dormancyCycles": 47.698204,
            "activeCycles": 93.30345
          },
          {
            "id": "salt_water",
            "posX": 90,
            "posY": 319,
            "emitRate": 8812.631,
            "idleTime": 334.6187,
            "eruptionTime": 363.13538,
            "dormancyCycles": 27.007103,
            "activeCycles": 36.031948
          },
          {
            "id": "OilWell",
            "posX": 221,
            "posY": 77,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 33,
            "posY": 63,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 235,
            "posY": 78,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "slimy_po2",
            "posX": 142,
            "posY": 132,
            "emitRate": 438.2748,
            "idleTime": 255.73709,
            "eruptionTime": 180.26337,
            "dormancyCycles": 43.23514,
            "activeCycles": 59.481472
          },
          {
            "id": "hot_po2",
            "posX": 76,
            "posY": 219,
            "emitRate": 281.54117,
            "idleTime": 188.95067,
            "eruptionTime": 334.86063,
            "dormancyCycles": 48.066895,
            "activeCycles": 90.106636
          },
          {
            "id": "slush_salt_water",
            "posX": 173,
            "posY": 196,
            "emitRate": 4464.498,
            "idleTime": 103.349625,
            "eruptionTime": 117.29242,
            "dormancyCycles": 54.332,
            "activeCycles": 69.5817
          },
          {
            "id": "slush_water",
            "posX": 174,
            "posY": 256,
            "emitRate": 5278.758,
            "idleTime": 460.65042,
            "eruptionTime": 346.10117,
            "dormancyCycles": 44.868347,
            "activeCycles": 80.37373
          },
          {
            "id": "oil_drip",
            "posX": 66,
            "posY": 44,
            "emitRate": 335.83273,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.18132968,
            "activeCycles": 0.24282214
          },
          {
            "id": "hot_co2",
            "posX": 61,
            "posY": 96,
            "emitRate": 365.82153,
            "idleTime": 377.3837,
            "eruptionTime": 350.72543,
            "dormancyCycles": 41.80459,
            "activeCycles": 63.52817
          },
          {
            "id": "methane",
            "posX": 95,
            "posY": 162,
            "emitRate": 412.44833,
            "idleTime": 243.13785,
            "eruptionTime": 201.44693,
            "dormancyCycles": 48.98939,
            "activeCycles": 81.22858
          },
          {
            "id": "chlorine_gas",
            "posX": 51,
            "posY": 294,
            "emitRate": 303.91357,
            "idleTime": 353.14542,
            "eruptionTime": 553.0486,
            "dormancyCycles": 47.72178,
            "activeCycles": 67.81077
          },
          {
            "id": "slimy_po2",
            "posX": 108,
            "posY": 166,
            "emitRate": 438.2748,
            "idleTime": 255.73709,
            "eruptionTime": 180.26337,
            "dormancyCycles": 43.23514,
            "activeCycles": 59.481472
          },
          {
            "id": "molten_iron",
            "posX": 144,
            "posY": 117,
            "emitRate": 12237.734,
            "idleTime": 709.7323,
            "eruptionTime": 33.451492,
            "dormancyCycles": 48.530598,
            "activeCycles": 71.91672
          },
          {
            "id": "molten_gold",
            "posX": 113,
            "posY": 150,
            "emitRate": 9543.184,
            "idleTime": 841.553,
            "eruptionTime": 52.766483,
            "dormancyCycles": 64.42443,
            "activeCycles": 90.406006
          },
          {
            "id": "big_volcano",
            "posX": 37,
            "posY": 294,
            "emitRate": 311021.6,
            "idleTime": 9846.717,
            "eruptionTime": 62.777275,
            "dormancyCycles": 55.813965,
            "activeCycles": 60.56041
          }
        ]
      }
    ],
    "starMapEntriesVanilla": [
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "CarbonaceousAsteroid",
        "distance": 0
      },
      {
        "id": "MetallicAsteroid",
        "distance": 1
      },
      {
        "id": "OilyAsteriod",
        "distance": 1
      },
      {
        "id": "RockyAsteroid",
        "distance": 2
      },
      {
        "id": "Satellite",
        "distance": 2
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "SaltDwarf",
        "distance": 4
      },
      {
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "SaltDwarf",
        "distance": 4
      },
      {
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "OrganicDwarf",
        "distance": 6
      },
      {
        "id": "IcyDwarf",
        "distance": 6
      },
      {
        "id": "GasGiant",
        "distance": 8
      },
      {
        "id": "HeliumGiant",
        "distance": 9
      },
      {
        "id": "IceGiant",
        "distance": 9
      },
      {
        "id": "HeliumGiant",
        "distance": 9
      },
      {
        "id": "RustPlanet",
        "distance": 10
      },
      {
        "id": "TerraPlanet",
        "distance": 10
      },
      {
        "id": "RockyAsteroid",
        "distance": 11
      },
      {
        "id": "OrganicDwarf",
        "distance": 12
      },
      {
        "id": "ForestPlanet",
        "distance": 12
      },
      {
        "id": "ForestPlanet",
        "distance": 12
      },
      {
        "id": "VolcanoPlanet",
        "distance": 13
      },
      {
        "id": "OilyAsteriod",
        "distance": 15
      },
      {
        "id": "HeliumGiant",
        "distance": 15
      },
      {
        "id": "TerraPlanet",
        "distance": 16
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "V-OASIS-C-1250245433-0-0-0",
    "cluster": "V-OASIS-C",
    "dlcs": [
      "FrostyPlanet",
      "SpacedOut"
    ],
    "asteroids": [
      {
        "id": "VanillaOasis",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 240,
        "sizeY": 380,
        "worldTraits": [
          "Geodes",
          "MetalPoor",
          "SlimeSplats",
          "GeoActive"
        ],
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 124,
            "posY": 164
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 91,
            "posY": 86
          },
          {
            "id": "WarpConduitSender",
            "posX": 163,
            "posY": 53
          },
          {
            "id": "WarpReceiver",
            "posX": 187,
            "posY": 82
          },
          {
            "id": "WarpPortal",
            "posX": 186,
            "posY": 88
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 31,
            "posY": 103,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 158,
            "posY": 103,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 196,
            "posY": 211,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 56,
            "posY": 61,
            "emitRate": 12032.209,
            "idleTime": 412.52573,
            "eruptionTime": 311.62003,
            "dormancyCycles": 42.05321,
            "activeCycles": 59.54642
          },
          {
            "id": "steam",
            "posX": 197,
            "posY": 63,
            "emitRate": 5851.0317,
            "idleTime": 411.85364,
            "eruptionTime": 290.88385,
            "dormancyCycles": 41.68481,
            "activeCycles": 98.80363
          },
          {
            "id": "steam",
            "posX": 31,
            "posY": 87,
            "emitRate": 3247.849,
            "idleTime": 117.495926,
            "eruptionTime": 280.48053,
            "dormancyCycles": 40.79713,
            "activeCycles": 78.10688
          },
          {
            "id": "methane",
            "posX": 81,
            "posY": 50,
            "emitRate": 694.2164,
            "idleTime": 563.34,
            "eruptionTime": 240.8112,
            "dormancyCycles": 37.035057,
            "activeCycles": 63.29944
          },
          {
            "id": "methane",
            "posX": 16,
            "posY": 51,
            "emitRate": 394.62842,
            "idleTime": 237.82777,
            "eruptionTime": 192.10127,
            "dormancyCycles": 44.205837,
            "activeCycles": 82.356026
          },
          {
            "id": "methane",
            "posX": 19,
            "posY": 165,
            "emitRate": 520.5866,
            "idleTime": 381.51685,
            "eruptionTime": 203.91742,
            "dormancyCycles": 47.411446,
            "activeCycles": 77.34642
          },
          {
            "id": "hot_po2",
            "posX": 40,
            "posY": 161,
            "emitRate": 239.98178,
            "idleTime": 153.67334,
            "eruptionTime": 427.46704,
            "dormancyCycles": 39.43177,
            "activeCycles": 53.3992
          },
          {
            "id": "hot_hydrogen",
            "posX": 212,
            "posY": 232,
            "emitRate": 288.98865,
            "idleTime": 276.1696,
            "eruptionTime": 421.29025,
            "dormancyCycles": 102.20643,
            "activeCycles": 97.89859
          },
          {
            "id": "hot_po2",
            "posX": 196,
            "posY": 273,
            "emitRate": 397.82965,
            "idleTime": 214.93051,
            "eruptionTime": 172.11713,
            "dormancyCycles": 48.06385,
            "activeCycles": 65.015175
          },
          {
            "id": "methane",
            "posX": 137,
            "posY": 114,
            "emitRate": 273.2541,
            "idleTime": 141.45769,
            "eruptionTime": 279.53104,
            "dormancyCycles": 48.575954,
            "activeCycles": 99.069984
          },
          {
            "id": "liquid_co2",
            "posX": 214,
            "posY": 138,
            "emitRate": 486.23776,
            "idleTime": 346.10715,
            "eruptionTime": 353.97195,
            "dormancyCycles": 46.097336,
            "activeCycles": 68.98543
          },
          {
            "id": "molten_iron",
            "posX": 96,
            "posY": 138,
            "emitRate": 14548.473,
            "idleTime": 660.6966,
            "eruptionTime": 25.215023,
            "dormancyCycles": 43.559444,
            "activeCycles": 55.029484
          },
          {
            "id": "slush_water",
            "posX": 21,
            "posY": 185,
            "emitRate": 4600.901,
            "idleTime": 412.25333,
            "eruptionTime": 398.8533,
            "dormancyCycles": 39.42074,
            "activeCycles": 61.801334
          },
          {
            "id": "hot_po2",
            "posX": 30,
            "posY": 171,
            "emitRate": 239.98178,
            "idleTime": 153.67334,
            "eruptionTime": 427.46704,
            "dormancyCycles": 39.43177,
            "activeCycles": 53.3992
          },
          {
            "id": "molten_copper",
            "posX": 190,
            "posY": 287,
            "emitRate": 7218.437,
            "idleTime": 710.22974,
            "eruptionTime": 55.967842,
            "dormancyCycles": 22.263025,
            "activeCycles": 48.616932
          },
          {
            "id": "hot_steam",
            "posX": 202,
            "posY": 224,
            "emitRate": 2551.82,
            "idleTime": 337.62292,
            "eruptionTime": 250.44255,
            "dormancyCycles": 31.317144,
            "activeCycles": 64.93857
          },
          {
            "id": "steam",
            "posX": 41,
            "posY": 226,
            "emitRate": 5475.0557,
            "idleTime": 468.11884,
            "eruptionTime": 263.33472,
            "dormancyCycles": 48.122112,
            "activeCycles": 55.148945
          },
          {
            "id": "hot_hydrogen",
            "posX": 141,
            "posY": 215,
            "emitRate": 390.94348,
            "idleTime": 455.29666,
            "eruptionTime": 371.22104,
            "dormancyCycles": 44.02858,
            "activeCycles": 58.886864
          },
          {
            "id": "molten_gold",
            "posX": 24,
            "posY": 122,
            "emitRate": 9116.502,
            "idleTime": 696.3224,
            "eruptionTime": 43.77945,
            "dormancyCycles": 47.0678,
            "activeCycles": 70.2022
          },
          {
            "id": "hot_hydrogen",
            "posX": 197,
            "posY": 247,
            "emitRate": 288.98865,
            "idleTime": 276.1696,
            "eruptionTime": 421.29025,
            "dormancyCycles": 102.20643,
            "activeCycles": 97.89859
          },
          {
            "id": "hot_po2",
            "posX": 54,
            "posY": 170,
            "emitRate": 575.71045,
            "idleTime": 328.10065,
            "eruptionTime": 145.81886,
            "dormancyCycles": 26.114307,
            "activeCycles": 44.27029
          },
          {
            "id": "OilWell",
            "posX": 39,
            "posY": 116,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 173,
            "posY": 100,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 209,
            "posY": 210,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 228,
            "posY": 111,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 225,
            "posY": 149,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 234,
            "posY": 195,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          }
        ]
      },
      {
        "id": "MediumRadioactiveVanillaWarpPlanet",
        "offsetX": 242,
        "offsetY": 0,
        "sizeX": 160,
        "sizeY": 176,
        "worldTraits": [
          "DistressSignal",
          "Geodes"
        ],
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 260,
            "posY": 115
          },
          {
            "id": "WarpConduitSender",
            "posX": 361,
            "posY": 42
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 280,
            "posY": 55
          },
          {
            "id": "WarpReceiver",
            "posX": 333,
            "posY": 75
          },
          {
            "id": "WarpPortal",
            "posX": 311,
            "posY": 75
          },
          {
            "id": "GeneShuffler",
            "posX": 337,
            "posY": 53
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 280,
            "posY": 28,
            "emitRate": 426.30658,
            "idleTime": 316.3044,
            "eruptionTime": 434.03738,
            "dormancyCycles": 68.20043,
            "activeCycles": 110.19859
          },
          {
            "id": "liquid_co2",
            "posX": 389,
            "posY": 23,
            "emitRate": 544.97784,
            "idleTime": 279.7901,
            "eruptionTime": 268.25903,
            "dormancyCycles": 37.981434,
            "activeCycles": 59.752247
          },
          {
            "id": "slush_water",
            "posX": 289,
            "posY": 123,
            "emitRate": 5449.7783,
            "idleTime": 279.7901,
            "eruptionTime": 268.25903,
            "dormancyCycles": 37.981434,
            "activeCycles": 59.752247
          },
          {
            "id": "slush_salt_water",
            "posX": 364,
            "posY": 126,
            "emitRate": 3319.3716,
            "idleTime": 121.63782,
            "eruptionTime": 377.93597,
            "dormancyCycles": 52.731453,
            "activeCycles": 96.257744
          },
          {
            "id": "slush_salt_water",
            "posX": 268,
            "posY": 37,
            "emitRate": 5056.208,
            "idleTime": 402.59222,
            "eruptionTime": 485.30133,
            "dormancyCycles": 48.695225,
            "activeCycles": 64.03359
          },
          {
            "id": "molten_copper",
            "posX": 319,
            "posY": 40,
            "emitRate": 7755.885,
            "idleTime": 803.64844,
            "eruptionTime": 47.61516,
            "dormancyCycles": 58.12488,
            "activeCycles": 95.413864
          },
          {
            "id": "hot_water",
            "posX": 303,
            "posY": 30,
            "emitRate": 11797.493,
            "idleTime": 267.23917,
            "eruptionTime": 196.52687,
            "dormancyCycles": 35.553608,
            "activeCycles": 75.351654
          },
          {
            "id": "molten_aluminum",
            "posX": 367,
            "posY": 90,
            "emitRate": 6349.188,
            "idleTime": 733.38586,
            "eruptionTime": 59.159424,
            "dormancyCycles": 47.28156,
            "activeCycles": 97.38561
          },
          {
            "id": "hot_hydrogen",
            "posX": 351,
            "posY": 79,
            "emitRate": 541.4445,
            "idleTime": 459.08618,
            "eruptionTime": 192.58434,
            "dormancyCycles": 14.494951,
            "activeCycles": 24.675179
          },
          {
            "id": "hot_co2",
            "posX": 347,
            "posY": 94,
            "emitRate": 350.78687,
            "idleTime": 333.13004,
            "eruptionTime": 434.96292,
            "dormancyCycles": 43.094345,
            "activeCycles": 71.72875
          }
        ]
      },
      {
        "id": "TundraMoonlet",
        "offsetX": 324,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 128,
        "worldTraits": [
          "MetalPoor",
          "SubsurfaceOcean"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 377,
            "posY": 190,
            "emitRate": 7786.613,
            "idleTime": 803.18555,
            "eruptionTime": 58.6484,
            "dormancyCycles": 41.616417,
            "activeCycles": 64.73866
          },
          {
            "id": "molten_iron",
            "posX": 336,
            "posY": 196,
            "emitRate": 9229.137,
            "idleTime": 751.19495,
            "eruptionTime": 42.64563,
            "dormancyCycles": 52.53461,
            "activeCycles": 92.900116
          },
          {
            "id": "molten_iron",
            "posX": 360,
            "posY": 209,
            "emitRate": 10992.911,
            "idleTime": 727.7186,
            "eruptionTime": 37.36427,
            "dormancyCycles": 55.33056,
            "activeCycles": 81.5501
          },
          {
            "id": "molten_iron",
            "posX": 336,
            "posY": 232,
            "emitRate": 8089.1685,
            "idleTime": 646.5898,
            "eruptionTime": 40.10588,
            "dormancyCycles": 64.94267,
            "activeCycles": 57.293736
          }
        ]
      },
      {
        "id": "MarshyMoonlet",
        "offsetX": 324,
        "offsetY": 308,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "SapTree",
            "posX": 360,
            "posY": 363
          },
          {
            "id": "GeneShuffler",
            "posX": 372,
            "posY": 336
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 355,
            "posY": 342,
            "emitRate": 8194.313,
            "idleTime": 914.83276,
            "eruptionTime": 61.80957,
            "dormancyCycles": 87.77896,
            "activeCycles": 114.039375
          },
          {
            "id": "molten_tungsten",
            "posX": 370,
            "posY": 314,
            "emitRate": 9100.987,
            "idleTime": 658.3021,
            "eruptionTime": 42.548935,
            "dormancyCycles": 43.08536,
            "activeCycles": 60.743443
          },
          {
            "id": "molten_tungsten",
            "posX": 346,
            "posY": 314,
            "emitRate": 7037.697,
            "idleTime": 637.55695,
            "eruptionTime": 46.744415,
            "dormancyCycles": 34.516014,
            "activeCycles": 53.335987
          },
          {
            "id": "chlorine_gas",
            "posX": 330,
            "posY": 315,
            "emitRate": 387.325,
            "idleTime": 376.8299,
            "eruptionTime": 310.0982,
            "dormancyCycles": 57.30089,
            "activeCycles": 102.81804
          },
          {
            "id": "hot_hydrogen",
            "posX": 346,
            "posY": 336,
            "emitRate": 471.77298,
            "idleTime": 376.0073,
            "eruptionTime": 253.59439,
            "dormancyCycles": 59.083855,
            "activeCycles": 87.94712
          }
        ]
      },
      {
        "id": "NiobiumMoonlet",
        "offsetX": 390,
        "offsetY": 178,
        "sizeX": 64,
        "sizeY": 96,
        "worldTraits": [
          "MetalRich"
        ],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 433,
            "posY": 221,
            "emitRate": 239837.08,
            "idleTime": 8659.943,
            "eruptionTime": 67.15576,
            "dormancyCycles": 51.429344,
            "activeCycles": 98.06128
          }
        ]
      },
      {
        "id": "MooMoonlet",
        "offsetX": 404,
        "offsetY": 0,
        "sizeX": 96,
        "sizeY": 80,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 420,
            "posY": 28,
            "emitRate": 333.68863,
            "idleTime": 382.2797,
            "eruptionTime": 437.355,
            "dormancyCycles": 52.8946,
            "activeCycles": 100.19009
          }
        ]
      },
      {
        "id": "WaterMoonlet",
        "offsetX": 242,
        "offsetY": 178,
        "sizeX": 80,
        "sizeY": 174,
        "worldTraits": [],
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "hot_water",
            "posX": 295,
            "posY": 250,
            "emitRate": 9791.98,
            "idleTime": 289.8082,
            "eruptionTime": 267.70456,
            "dormancyCycles": 49.000656,
            "activeCycles": 79.276825
          },
          {
            "id": "salt_water",
            "posX": 274,
            "posY": 241,
            "emitRate": 10423.161,
            "idleTime": 321.96597,
            "eruptionTime": 307.3013,
            "dormancyCycles": 45.702633,
            "activeCycles": 50.08621
          }
        ]
      },
      {
        "id": "MiniRegolithMoonlet",
        "offsetX": 390,
        "offsetY": 276,
        "sizeX": 96,
        "sizeY": 96,
        "worldTraits": [],
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 453,
            "posY": 303
          }
        ],
        "geysers": []
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "VanillaOasis",
        "q": 0,
        "r": 0
      },
      {
        "id": "MediumRadioactiveVanillaWarpPlanet",
        "q": 1,
        "r": 2
      },
      {
        "id": "TundraMoonlet",
        "q": 3,
        "r": -5
      },
      {
        "id": "MarshyMoonlet",
        "q": 6,
        "r": 0
      },
      {
        "id": "NiobiumMoonlet",
        "q": -6,
        "r": 0
      },
      {
        "id": "MooMoonlet",
        "q": -1,
        "r": 6
      },
      {
        "id": "WaterMoonlet",
        "q": 0,
        "r": -7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 8,
        "r": -6
      },
      {
        "id": "TemporalTear",
        "q": -8,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -3,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -2,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -1,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -2,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 0,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -8,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -10,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 4,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 4,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 5,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 6,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -6,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 11,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 11,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 10,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 0,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 9,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 10,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -6,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -10,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -10,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 5,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 9,
        "r": 2
      }
    ]
  }
]
""".trimIndent()
