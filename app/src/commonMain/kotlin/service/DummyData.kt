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
  "coordinate": "V-CERS-C-61390805-0-0-0",
  "cluster": "V-CERS-C",
  "dlcs": [
    "FrostyPlanet",
    "SpacedOut"
  ],
  "asteroids": [
    {
      "id": "CeresClassicShatteredAsteroid",
      "offsetX": 0,
      "offsetY": 0,
      "sizeX": 240,
      "sizeY": 380,
      "worldTraits": [
        "Volcanoes",
        "BouldersMixed"
      ],
      "pointsOfInterest": [
        {
          "id": "Headquarters",
          "x": 121,
          "y": 146
        },
        {
          "id": "WarpConduitReceiver",
          "x": 65,
          "y": 84
        },
        {
          "id": "WarpConduitSender",
          "x": 34,
          "y": 181
        },
        {
          "id": "MassiveHeatSink",
          "x": 75,
          "y": 206
        },
        {
          "id": "MassiveHeatSink",
          "x": 52,
          "y": 203
        },
        {
          "id": "MassiveHeatSink",
          "x": 178,
          "y": 195
        },
        {
          "id": "GravitasPedestal",
          "x": 201,
          "y": 226
        },
        {
          "id": "WarpReceiver",
          "x": 188,
          "y": 93
        },
        {
          "id": "WarpPortal",
          "x": 187,
          "y": 87
        }
      ],
      "geysers": [
        {
          "emitRate": 4953,
          "avgEmitRate": 1570,
          "idleTime": 206,
          "eruptionTime": 202,
          "dormancyCycles": 48.5,
          "activeCycles": 86.3,
          "id": "slush_salt_water",
          "x": 24,
          "y": 206
        },
        {
          "emitRate": 3333,
          "avgEmitRate": 3333,
          "idleTime": 0,
          "eruptionTime": 1,
          "dormancyCycles": 0,
          "activeCycles": 1,
          "id": "OilWell",
          "x": 32,
          "y": 314
        },
        {
          "emitRate": 3333,
          "avgEmitRate": 3333,
          "idleTime": 0,
          "eruptionTime": 1,
          "dormancyCycles": 0,
          "activeCycles": 1,
          "id": "OilWell",
          "x": 211,
          "y": 336
        },
        {
          "emitRate": 3333,
          "avgEmitRate": 3333,
          "idleTime": 0,
          "eruptionTime": 1,
          "dormancyCycles": 0,
          "activeCycles": 1,
          "id": "OilWell",
          "x": 45,
          "y": 353
        },
        {
          "emitRate": 4145,
          "avgEmitRate": 1310,
          "idleTime": 313,
          "eruptionTime": 304,
          "dormancyCycles": 47.6,
          "activeCycles": 85.1,
          "id": "steam",
          "x": 191,
          "y": 167
        },
        {
          "emitRate": 4983,
          "avgEmitRate": 1358,
          "idleTime": 362,
          "eruptionTime": 303,
          "dormancyCycles": 55.6,
          "activeCycles": 82.8,
          "id": "slush_water",
          "x": 107,
          "y": 345
        },
        {
          "emitRate": 8027,
          "avgEmitRate": 309,
          "idleTime": 708,
          "eruptionTime": 50,
          "dormancyCycles": 64.4,
          "activeCycles": 89.3,
          "id": "molten_iron",
          "x": 85,
          "y": 341
        },
        {
          "emitRate": 9662,
          "avgEmitRate": 312,
          "idleTime": 804,
          "eruptionTime": 46,
          "dormancyCycles": 48.6,
          "activeCycles": 71.2,
          "id": "molten_copper",
          "x": 94,
          "y": 352
        },
        {
          "emitRate": 4914,
          "avgEmitRate": 1597,
          "idleTime": 320,
          "eruptionTime": 270,
          "dormancyCycles": 33.8,
          "activeCycles": 82.8,
          "id": "slush_water",
          "x": 132,
          "y": 81
        },
        {
          "emitRate": 1956,
          "avgEmitRate": 527,
          "idleTime": 183,
          "eruptionTime": 212,
          "dormancyCycles": 66.6,
          "activeCycles": 67.1,
          "id": "hot_steam",
          "x": 18,
          "y": 350
        },
        {
          "emitRate": 2939,
          "avgEmitRate": 1174,
          "idleTime": 262,
          "eruptionTime": 475,
          "dormancyCycles": 56.4,
          "activeCycles": 91.8,
          "id": "steam",
          "x": 23,
          "y": 223
        },
        {
          "emitRate": 120687,
          "avgEmitRate": 558,
          "idleTime": 9298,
          "eruptionTime": 75,
          "dormancyCycles": 58.5,
          "activeCycles": 80.5,
          "id": "small_volcano",
          "x": 23,
          "y": 186
        },
        {
          "emitRate": 3751,
          "avgEmitRate": 1278,
          "idleTime": 257,
          "eruptionTime": 398,
          "dormancyCycles": 57.6,
          "activeCycles": 73.7,
          "id": "slush_water",
          "x": 49,
          "y": 86
        },
        {
          "emitRate": 479,
          "avgEmitRate": 116,
          "idleTime": 341,
          "eruptionTime": 207,
          "dormancyCycles": 41.7,
          "activeCycles": 75.1,
          "id": "chlorine_gas",
          "x": 177,
          "y": 215
        },
        {
          "emitRate": 2619,
          "avgEmitRate": 592,
          "idleTime": 432,
          "eruptionTime": 301,
          "dormancyCycles": 54.4,
          "activeCycles": 66.5,
          "id": "hot_steam",
          "x": 16,
          "y": 124
        },
        {
          "emitRate": 243,
          "avgEmitRate": 105,
          "idleTime": 142,
          "eruptionTime": 354,
          "dormancyCycles": 53.9,
          "activeCycles": 82.5,
          "id": "hot_co2",
          "x": 221,
          "y": 89
        },
        {
          "emitRate": 308955,
          "avgEmitRate": 1110,
          "idleTime": 9202,
          "eruptionTime": 66,
          "dormancyCycles": 51.4,
          "activeCycles": 52.1,
          "id": "big_volcano",
          "x": 100,
          "y": 195
        },
        {
          "emitRate": 234705,
          "avgEmitRate": 1000,
          "idleTime": 10049,
          "eruptionTime": 75,
          "dormancyCycles": 32.3,
          "activeCycles": 43.5,
          "id": "big_volcano",
          "x": 170,
          "y": 322
        },
        {
          "emitRate": 337790,
          "avgEmitRate": 1289,
          "idleTime": 8835,
          "eruptionTime": 59,
          "dormancyCycles": 57,
          "activeCycles": 77,
          "id": "big_volcano",
          "x": 196,
          "y": 111
        },
        {
          "emitRate": 261152,
          "avgEmitRate": 1363,
          "idleTime": 7283,
          "eruptionTime": 59,
          "dormancyCycles": 41.7,
          "activeCycles": 77.7,
          "id": "big_volcano",
          "x": 41,
          "y": 121
        },
        {
          "emitRate": 326648,
          "avgEmitRate": 1237,
          "idleTime": 7207,
          "eruptionTime": 47,
          "dormancyCycles": 32.4,
          "activeCycles": 44.9,
          "id": "big_volcano",
          "x": 173,
          "y": 161
        },
        {
          "emitRate": 295621,
          "avgEmitRate": 1133,
          "idleTime": 9762,
          "eruptionTime": 67,
          "dormancyCycles": 66.4,
          "activeCycles": 84.4,
          "id": "big_volcano",
          "x": 129,
          "y": 104
        },
        {
          "emitRate": 264577,
          "avgEmitRate": 1384,
          "idleTime": 8211,
          "eruptionTime": 66,
          "dormancyCycles": 43.9,
          "activeCycles": 83.4,
          "id": "big_volcano",
          "x": 145,
          "y": 112
        },
        {
          "emitRate": 251883,
          "avgEmitRate": 1053,
          "idleTime": 8799,
          "eruptionTime": 67,
          "dormancyCycles": 81.6,
          "activeCycles": 101.1,
          "id": "big_volcano",
          "x": 86,
          "y": 318
        }
      ],
      "biomePaths": "IceCaves:139,162 143,157 144,140 131,123 111,125 98,144 105,161 119,169;162,156 166,151 165,143 153,135 144,140 143,157;183,134 185,118 185,117 158,111 152,120 153,135 165,143;153,135 152,120 133,118 131,123 144,140;173,174 162,156 143,157 139,162 141,182 159,188;111,125 106,117 88,124 94,143 98,144;105,161 98,144 94,143 82,152 85,165 95,169;94,143 88,124 83,119 60,129 62,145 82,152;131,123 133,118 133,117 119,106 106,114 106,117 111,125;85,165 82,152 62,145 52,155 57,177 64,181;100,183 95,169 85,165 64,181 68,193 89,198;141,182 139,162 119,169 119,177 133,187;83,119 83,111 70,96 56,100 50,113 54,125 60,129;119,177 119,169 105,161 95,169 100,183 109,186\nOcean:240,174 240,150 206,153 206,155 210,174;240,197 212,199 209,202 214,225 240,225;32,191 34,186 24,166 0,166 0,194;36,203 32,191 0,194 0,215 28,217\nRadioactive:240,150 240,130 206,131 203,136 206,153;240,130 240,111 207,106 202,121 206,131;240,197 240,174 210,174 206,181 212,199;62,219 59,209 36,203 28,217 34,236 50,237\nFrozenWastes:206,181 210,174 206,155 186,153 184,154 177,173 191,185;191,200 191,185 177,173 173,174 159,188 163,204 183,207;57,177 52,155 33,151 24,166 34,186;62,145 60,129 54,125 34,128 29,142 33,151 52,155;68,193 64,181 57,177 34,186 32,191 36,203 59,209;95,212 95,208 89,198 68,193 59,209 62,219 82,224\nMagmaCore:186,153 187,138 183,134 165,143 166,151 184,154;212,199 206,181 191,185 191,200 209,202;177,173 184,154 166,151 162,156 173,174;206,153 203,136 187,138 186,153 206,155;203,136 206,131 202,121 185,118 183,134 187,138;158,111 156,106 140,103 133,117 133,118 152,120;207,106 205,102 192,101 185,117 185,118 202,121;140,103 133,94 122,94 119,106 133,117;106,117 106,114 91,105 83,111 83,119 88,124;54,125 50,113 30,116 34,128;112,194 109,186 100,183 89,198 95,208;105,225 95,212 82,224 89,239 94,239;91,105 90,89 75,90 70,96 83,111;133,187 119,177 109,186 112,194 128,200;106,295 99,277 81,275 70,289 83,307 94,308;152,266 144,246 130,244 114,261 134,280;133,286 134,280 114,261 113,261 99,277 106,295 120,297;194,299 189,289 168,285 158,300 163,312 184,317;168,285 161,269 152,266 134,280 133,286 141,297 158,300;240,282 240,252 214,253 207,263 225,283;225,283 207,263 203,264 189,289 194,299 211,302;141,297 133,286 120,297 129,311;70,289 81,275 73,256 60,255 46,270 59,289;185,324 184,317 163,312 158,325 164,331;97,322 94,308 83,307 75,322 82,329;31,270 0,270 0,297 27,297;49,303 59,289 46,270 31,270 31,270 27,297 31,303\nCarrotQuarry:240,83 213,83 205,102 207,106 240,111;186,231 183,207 163,204 154,214 158,231 181,237;132,209 128,200 112,194 95,208 95,212 105,225 121,226;163,204 159,188 141,182 133,187 128,200 132,209 154,214\nSugarWoods:240,83 240,56 210,56 204,65 213,83;192,101 180,84 167,84 156,106 158,111 185,117;213,83 204,65 191,66 180,84 192,101 205,102;167,84 153,69 146,68 133,94 140,103 156,106;133,94 146,68 136,59 122,60 109,79 122,94;119,106 122,94 109,79 99,79 90,89 91,105 106,114;50,113 56,100 41,83 30,83 25,89 29,116 30,116;70,96 75,90 64,62 55,63 41,83 56,100;29,116 25,89 0,90 0,119;25,89 30,83 19,60 0,58 0,90;90,89 99,79 88,58 70,57 64,62 75,90\nRust:214,225 209,202 191,200 183,207 186,231 208,231;34,128 30,116 29,116 0,119 0,140 29,142;34,236 28,217 0,215 0,242 28,243;24,166 33,151 29,142 0,140 0,166\nSandstone:128,318 129,311 120,297 106,295 94,308 97,322 108,328;133,349 138,328 128,318 108,328 111,348 121,354;65,356 57,351 33,365 33,380 67,380;191,352 193,331 185,324 164,331 164,350 180,359;93,356 81,349 65,356 67,380 94,380\nOilField:240,317 240,282 225,283 211,302 219,317;158,325 163,312 158,300 141,297 129,311 128,318 138,328;111,348 108,328 97,322 82,329 81,349 93,356;81,349 82,329 75,322 59,323 52,333 57,351 65,356;212,328 219,317 211,302 194,299 184,317 185,324 193,331;59,323 49,303 31,303 25,326 29,332 52,333;164,350 164,331 158,325 138,328 133,349 149,359;224,350 212,328 193,331 191,352 212,362;180,359 164,350 149,359 148,380 179,380;23,354 29,332 25,326 0,324 0,356;57,351 52,333 29,332 23,354 33,365;33,365 23,354 0,356 0,380 33,380\nForest:75,322 83,307 70,289 59,289 49,303 59,323;240,351 224,350 212,362 213,380 240,380;31,303 27,297 0,297 0,324 25,326;121,354 111,348 93,356 94,380 120,380;240,317 219,317 212,328 224,350 240,351;149,359 133,349 121,354 120,380 148,380;212,362 191,352 180,359 179,380 213,380"
    },
    {
      "id": "MediumSwampy",
      "offsetX": 242,
      "offsetY": 0,
      "sizeX": 160,
      "sizeY": 176,
      "worldTraits": [
        "Geodes",
        "RadioactiveCrust"
      ],
      "pointsOfInterest": [
        {
          "id": "MassiveHeatSink",
          "x": 125,
          "y": 121
        },
        {
          "id": "WarpConduitSender",
          "x": 47,
          "y": 138
        },
        {
          "id": "WarpConduitReceiver",
          "x": 31,
          "y": 100
        },
        {
          "id": "WarpReceiver",
          "x": 79,
          "y": 113
        },
        {
          "id": "WarpPortal",
          "x": 57,
          "y": 113
        }
      ],
      "geysers": [
        {
          "emitRate": 4056,
          "avgEmitRate": 1539,
          "idleTime": 221,
          "eruptionTime": 312,
          "dormancyCycles": 38.1,
          "activeCycles": 70.1,
          "id": "steam",
          "x": 33,
          "y": 58
        },
        {
          "emitRate": 10563,
          "avgEmitRate": 1699,
          "idleTime": 482,
          "eruptionTime": 142,
          "dormancyCycles": 59.5,
          "activeCycles": 143.3,
          "id": "steam",
          "x": 115,
          "y": 71
        },
        {
          "emitRate": 7435,
          "avgEmitRate": 2827,
          "idleTime": 285,
          "eruptionTime": 366,
          "dormancyCycles": 33.7,
          "activeCycles": 70.6,
          "id": "filthy_water",
          "x": 15,
          "y": 73
        },
        {
          "emitRate": 14845,
          "avgEmitRate": 3155,
          "idleTime": 327,
          "eruptionTime": 193,
          "dormancyCycles": 53.9,
          "activeCycles": 72,
          "id": "hot_water",
          "x": 78,
          "y": 144
        },
        {
          "emitRate": 13583,
          "avgEmitRate": 3476,
          "idleTime": 187,
          "eruptionTime": 130,
          "dormancyCycles": 44.9,
          "activeCycles": 75,
          "id": "hot_water",
          "x": 42,
          "y": 85
        },
        {
          "emitRate": 10639,
          "avgEmitRate": 278,
          "idleTime": 729,
          "eruptionTime": 35,
          "dormancyCycles": 46.1,
          "activeCycles": 60.3,
          "id": "molten_aluminum",
          "x": 63,
          "y": 149
        },
        {
          "emitRate": 432,
          "avgEmitRate": 120,
          "idleTime": 296,
          "eruptionTime": 326,
          "dormancyCycles": 90.7,
          "activeCycles": 101.4,
          "id": "liquid_co2",
          "x": 136,
          "y": 167
        },
        {
          "emitRate": 6838,
          "avgEmitRate": 1659,
          "idleTime": 341,
          "eruptionTime": 207,
          "dormancyCycles": 41.7,
          "activeCycles": 75.1,
          "id": "liquid_sulfur",
          "x": 38,
          "y": 114
        }
      ],
      "biomePaths": "Swamp:84,115 84,102 68,94 61,99 64,120 68,122;68,94 70,80 57,71 49,72 44,80 49,97 61,99;110,111 109,102 94,94 84,102 84,115 94,122;94,94 94,85 80,76 70,80 68,94 84,102;95,131 94,122 84,115 68,122 70,136 83,142;64,120 61,99 49,97 42,103 42,121 45,124;70,136 68,122 64,120 45,124 45,136 59,146;49,97 44,80 25,81 22,88 25,99 42,103;42,121 42,103 25,99 19,109 24,121\nBoggyMarsh:98,60 103,49 99,41 82,39 74,51 84,63;124,64 119,50 103,49 98,60 106,74 113,75;147,55 138,42 125,42 119,50 124,64 136,68;57,71 66,52 56,43 47,44 40,58 49,72;80,76 84,63 74,51 66,52 57,71 70,80\nToxicJungle:160,55 147,55 136,68 140,77 160,82;40,58 47,44 37,35 22,39 19,45 25,59;25,59 19,45 0,47 0,67 20,67;44,80 49,72 40,58 25,59 20,67 25,81\nWasteland:160,95 160,82 140,77 131,91 137,100;106,74 98,60 84,63 80,76 94,85;121,90 113,75 106,74 94,85 94,94 109,102;120,131 119,117 110,111 94,122 95,131 108,139;108,151 108,139 95,131 83,142 85,153 96,159;160,116 160,95 137,100 135,111 142,118;160,153 160,140 140,135 134,139 133,151 140,158;133,151 134,139 120,131 108,139 108,151 119,158;45,136 45,124 42,121 24,121 19,131 22,138 34,144;85,153 83,142 70,136 59,146 59,153 72,163;11,153 22,138 19,131 0,129 0,154;135,111 137,100 131,91 121,90 109,102 110,111 119,117\nBarren:140,77 136,68 124,64 113,75 121,90 131,91;59,153 59,146 45,136 34,144 35,156 47,162;35,156 34,144 22,138 11,153 23,164\nFrozenWastes:140,135 142,118 135,111 119,117 120,131 134,139;22,88 25,81 20,67 0,67 0,88;25,99 22,88 0,88 0,108 19,109;24,121 19,109 0,108 0,129 19,131;160,116 142,118 140,135 160,140\nMagmaCore:72,163 59,153 47,162 47,176 72,176;119,158 108,151 96,159 97,176 119,176;140,158 133,151 119,158 119,176 139,176;96,159 85,153 72,163 72,176 97,176;160,153 140,158 139,176 160,176;23,164 11,153 0,154 0,176 22,176;47,162 35,156 23,164 22,176 47,176"
    },
    {
      "id": "TundraMoonlet",
      "offsetX": 324,
      "offsetY": 178,
      "sizeX": 64,
      "sizeY": 128,
      "worldTraits": [
        "DistressSignal"
      ],
      "pointsOfInterest": [
        {
          "id": "TemporalTearOpener",
          "x": 38,
          "y": 35
        },
        {
          "id": "GravitasPedestal",
          "x": 39,
          "y": 74
        }
      ],
      "geysers": [
        {
          "emitRate": 8543,
          "avgEmitRate": 335,
          "idleTime": 763,
          "eruptionTime": 43,
          "dormancyCycles": 33.1,
          "activeCycles": 91.6,
          "id": "molten_iron",
          "x": 15,
          "y": 101
        },
        {
          "emitRate": 7756,
          "avgEmitRate": 301,
          "idleTime": 622,
          "eruptionTime": 46,
          "dormancyCycles": 56.5,
          "activeCycles": 72.6,
          "id": "molten_iron",
          "x": 29,
          "y": 110
        },
        {
          "emitRate": 9681,
          "avgEmitRate": 260,
          "idleTime": 751,
          "eruptionTime": 39,
          "dormancyCycles": 48.5,
          "activeCycles": 59,
          "id": "molten_iron",
          "x": 45,
          "y": 104
        },
        {
          "emitRate": 9629,
          "avgEmitRate": 259,
          "idleTime": 810,
          "eruptionTime": 43,
          "dormancyCycles": 65.7,
          "activeCycles": 75,
          "id": "molten_iron",
          "x": 17,
          "y": 116
        }
      ],
      "biomePaths": "FrozenWastes:52,50 45,43 31,48 30,49 36,61 46,62;64,49 64,32 49,31 46,33 45,43 52,50;45,43 46,33 32,28 26,33 31,48;50,67 46,62 36,61 29,71 34,79 45,81;64,49 52,50 46,62 50,67 64,68;64,68 50,67 45,81 47,84 64,84;36,61 30,49 17,53 15,57 20,70 29,71;45,97 47,84 45,81 34,79 25,93 43,100;25,93 34,79 29,71 20,70 13,76 18,91 23,94;15,57 17,53 11,39 0,39 0,59;64,111 64,100 45,97 43,100 42,108 48,114;30,49 31,48 26,33 17,32 11,39 17,53;20,70 15,57 0,59 0,75 13,76;48,114 42,108 31,114 30,128 47,128;64,111 48,114 47,128 64,128;42,108 43,100 25,93 23,94 21,108 31,114;21,108 23,94 18,91 0,95 0,107 15,111;31,114 21,108 15,111 14,128 30,128;18,91 13,76 0,75 0,95;15,111 0,107 0,128 14,128;64,84 47,84 45,97 64,100"
    },
    {
      "id": "MarshyMoonlet",
      "offsetX": 324,
      "offsetY": 308,
      "sizeX": 64,
      "sizeY": 96,
      "worldTraits": [
        "RadioactiveCrust"
      ],
      "pointsOfInterest": [
        {
          "id": "GravitasPedestal",
          "x": 45,
          "y": 41
        },
        {
          "id": "GravitasPedestal",
          "x": 31,
          "y": 41
        },
        {
          "id": "SapTree",
          "x": 38,
          "y": 41
        }
      ],
      "geysers": [
        {
          "emitRate": 6998,
          "avgEmitRate": 272,
          "idleTime": 704,
          "eruptionTime": 52,
          "dormancyCycles": 52.4,
          "activeCycles": 66.7,
          "id": "molten_tungsten",
          "x": 5,
          "y": 91
        },
        {
          "emitRate": 7545,
          "avgEmitRate": 246,
          "idleTime": 755,
          "eruptionTime": 47,
          "dormancyCycles": 64.4,
          "activeCycles": 79.8,
          "id": "molten_tungsten",
          "x": 13,
          "y": 88
        },
        {
          "emitRate": 9549,
          "avgEmitRate": 310,
          "idleTime": 768,
          "eruptionTime": 46,
          "dormancyCycles": 45,
          "activeCycles": 62.2,
          "id": "molten_tungsten",
          "x": 20,
          "y": 88
        },
        {
          "emitRate": 610,
          "avgEmitRate": 121,
          "idleTime": 463,
          "eruptionTime": 240,
          "dormancyCycles": 65.8,
          "activeCycles": 90.8,
          "id": "methane",
          "x": 27,
          "y": 64
        },
        {
          "emitRate": 349,
          "avgEmitRate": 132,
          "idleTime": 346,
          "eruptionTime": 472,
          "dormancyCycles": 39.8,
          "activeCycles": 75.2,
          "id": "chlorine_gas",
          "x": 35,
          "y": 51
        }
      ],
      "biomePaths": "BoggyMarsh:45,48 49,37 41,28 27,38 34,49;64,55 64,36 49,37 45,48 51,56;29,59 34,49 27,38 21,36 16,40 15,57 19,60;16,77 19,60 15,57 0,58 0,76 16,77;15,57 16,40 0,37 0,58\nToxicJungle:33,79 36,67 29,59 19,60 16,77 32,80;54,76 47,64 36,67 33,79 47,83;64,55 51,56 47,64 54,76 64,76;47,64 51,56 45,48 34,49 29,59 36,67\nMagmaCore:64,76 54,76 47,83 49,96 64,96;16,77 0,76 0,96 14,96;32,80 16,77 16,77 14,96 30,96;47,83 33,79 32,80 30,96 49,96"
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
          "x": 51,
          "y": 56
        }
      ],
      "geysers": [
        {
          "emitRate": 262135,
          "avgEmitRate": 1134,
          "idleTime": 7316,
          "eruptionTime": 52,
          "dormancyCycles": 53.5,
          "activeCycles": 85.9,
          "id": "molten_niobium",
          "x": 54,
          "y": 84
        }
      ],
      "biomePaths": "MagmaCore:50,33 42,22 41,22 30,34 34,43 46,44;34,43 30,34 20,30 13,37 18,50 28,51;12,57 18,50 13,37 0,36 0,57;49,49 46,44 34,43 28,51 33,61 44,62;33,61 28,51 18,50 12,57 20,72 25,72;64,32 50,33 46,44 49,49 64,50;32,79 25,72 20,72 13,78 18,96 27,96;46,80 45,79 32,79 27,96 46,96;45,79 47,66 44,62 33,61 25,72 32,79;13,78 0,77 0,96 18,96;64,80 64,66 47,66 45,79 46,80\nOilField:20,72 12,57 0,57 0,77 13,78;64,50 49,49 44,62 47,66 64,66;64,80 46,80 46,96 64,96"
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
          "x": 45,
          "y": 56
        },
        {
          "id": "GravitasPedestal",
          "x": 38,
          "y": 56
        }
      ],
      "geysers": [
        {
          "emitRate": 243,
          "avgEmitRate": 105,
          "idleTime": 142,
          "eruptionTime": 354,
          "dormancyCycles": 53.9,
          "activeCycles": 82.5,
          "id": "chlorine_gas",
          "x": 75,
          "y": 47
        }
      ],
      "biomePaths": "Moo:48,44 47,32 41,27 30,33 30,45 35,49;65,44 68,38 61,27 47,32 48,44 53,48;84,40 78,36 68,38 65,44 73,58 79,59;30,45 30,33 20,27 10,39 18,49;36,61 35,49 30,45 18,49 15,60 16,62 31,65;18,49 10,39 0,39 0,60 15,60;53,61 53,48 48,44 35,49 36,61 48,65;73,58 65,44 53,48 53,61 64,64;96,40 84,40 79,59 81,60 96,61\nFrozenWastes:64,64 53,61 48,65 48,80 66,80;48,65 36,61 31,65 32,80 48,80;31,65 16,62 14,80 32,80;81,60 79,59 73,58 64,64 66,80 80,80;96,61 81,60 80,80 96,80;16,62 15,60 0,60 0,80 14,80"
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
          "x": 34,
          "y": 146
        },
        {
          "id": "GravitasPedestal",
          "x": 36,
          "y": 146
        }
      ],
      "geysers": [
        {
          "emitRate": 9991,
          "avgEmitRate": 2799,
          "idleTime": 264,
          "eruptionTime": 269,
          "dormancyCycles": 72.5,
          "activeCycles": 90.7,
          "id": "hot_water",
          "x": 54,
          "y": 88
        },
        {
          "emitRate": 8216,
          "avgEmitRate": 3106,
          "idleTime": 210,
          "eruptionTime": 273,
          "dormancyCycles": 55,
          "activeCycles": 110.8,
          "id": "salt_water",
          "x": 14,
          "y": 62
        }
      ],
      "biomePaths": "Barren:80,58 63,57 59,64 64,76 80,77;60,93 57,86 41,81 37,94 43,104 45,104;49,65 39,54 36,54 27,67 30,75 41,79;80,93 80,77 64,76 57,86 60,93 64,96;80,38 64,39 59,45 63,57 80,58;59,64 63,57 59,45 45,44 39,54 49,65;80,93 64,96 66,111 80,113;64,76 59,64 49,65 41,79 41,81 57,86;37,94 41,81 41,79 30,75 19,85 19,93 21,95;36,54 22,45 13,54 17,64 27,67;39,54 45,44 41,35 32,31 21,38 22,45 36,54;30,75 27,67 17,64 8,75 19,85;43,104 37,94 21,95 21,108 33,114;57,118 45,104 43,104 33,114 34,121 44,127;66,111 64,96 60,93 45,104 57,118 58,118;45,137 44,127 34,121 22,131 24,138 39,142;80,129 80,113 66,111 58,118 65,130;24,138 22,131 16,127 0,132 0,143 19,145;34,121 33,114 21,108 15,113 16,127 22,131;16,127 15,113 0,110 0,132;8,75 17,64 13,54 0,52 0,75;19,93 19,85 8,75 0,75 0,96;39,157 21,157 19,159 20,174 39,174;60,162 56,156 40,157 39,157 39,174 59,174;22,45 21,38 15,34 0,37 0,52 13,54;21,108 21,95 19,93 0,96 0,110 15,113;80,129 65,130 60,142 60,143 80,149;80,158 60,162 59,174 80,174;19,159 0,159 0,174 20,174;65,130 58,118 57,118 44,127 45,137 60,142\nSwamp:56,156 60,143 60,142 45,137 39,142 40,157;40,157 39,142 24,138 19,145 21,157 39,157;21,157 19,145 0,143 0,159 19,159;80,158 80,149 60,143 56,156 60,162"
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
          "x": 60,
          "y": 73
        },
        {
          "id": "GravitasPedestal",
          "x": 64,
          "y": 73
        },
        {
          "id": "GeneShuffler",
          "x": 62,
          "y": 67
        }
      ],
      "geysers": [
        {
          "emitRate": 2135,
          "avgEmitRate": 807,
          "idleTime": 143,
          "eruptionTime": 201,
          "dormancyCycles": 30.3,
          "activeCycles": 55.5,
          "id": "hot_steam",
          "x": 9,
          "y": 79
        },
        {
          "emitRate": 4588,
          "avgEmitRate": 1279,
          "idleTime": 142,
          "eruptionTime": 149,
          "dormancyCycles": 52.1,
          "activeCycles": 62.1,
          "id": "steam",
          "x": 42,
          "y": 78
        }
      ],
      "biomePaths": "Sandstone:56,73 59,58 55,53 39,54 36,60 39,71 51,75\nBarren:39,71 36,60 20,60 14,72 19,78 31,79;76,75 78,61 75,57 59,58 56,73 64,78;96,78 96,60 78,61 76,75 80,79\nFrozenWastes:31,79 19,78 15,96 37,96;19,78 14,72 0,72 0,96 15,96;51,75 39,71 31,79 37,96 46,96;64,78 56,73 51,75 46,96 64,96;80,79 76,75 64,78 64,96 79,96;96,78 80,79 79,96 96,96"
    }
  ],
  "starMapEntriesVanilla": null,
  "starMapEntriesSpacedOut": [
    {
      "id": "CeresClassicShatteredAsteroid",
      "q": 0,
      "r": 0
    },
    {
      "id": "MediumSwampy",
      "q": -2,
      "r": -1
    },
    {
      "id": "TundraMoonlet",
      "q": -3,
      "r": 5
    },
    {
      "id": "MarshyMoonlet",
      "q": 3,
      "r": -6
    },
    {
      "id": "NiobiumMoonlet",
      "q": 5,
      "r": -1
    },
    {
      "id": "MooMoonlet",
      "q": -7,
      "r": 2
    },
    {
      "id": "WaterMoonlet",
      "q": 0,
      "r": 7
    },
    {
      "id": "MiniRegolithMoonlet",
      "q": -3,
      "r": -5
    },
    {
      "id": "TemporalTear",
      "q": -8,
      "r": 0
    },
    {
      "id": "HarvestableSpacePOI_DLC2CeresOreField",
      "q": 3,
      "r": -2
    },
    {
      "id": "HarvestableSpacePOI_OrganicMassField",
      "q": -7,
      "r": 7
    },
    {
      "id": "HarvestableSpacePOI_OilyAsteroidField",
      "q": 10,
      "r": -4
    },
    {
      "id": "HarvestableSpacePOI_HeliumCloud",
      "q": 9,
      "r": -4
    },
    {
      "id": "HarvestableSpacePOI_GildedAsteroidField",
      "q": -4,
      "r": 10
    },
    {
      "id": "HarvestableSpacePOI_FrozenOreField",
      "q": -4,
      "r": 9
    },
    {
      "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
      "q": 0,
      "r": -11
    },
    {
      "id": "HarvestableSpacePOI_RadioactiveGasCloud",
      "q": 11,
      "r": 0
    },
    {
      "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
      "q": 11,
      "r": -9
    },
    {
      "id": "HarvestableSpacePOI_SandyOreField",
      "q": -5,
      "r": 3
    },
    {
      "id": "HarvestableSpacePOI_InterstellarOcean",
      "q": 3,
      "r": 4
    },
    {
      "id": "HarvestableSpacePOI_OrganicMassField",
      "q": -4,
      "r": -2
    },
    {
      "id": "HarvestableSpacePOI_InterstellarIceField",
      "q": -5,
      "r": -2
    },
    {
      "id": "HarvestableSpacePOI_InterstellarOcean",
      "q": -5,
      "r": -1
    },
    {
      "id": "HarvestableSpacePOI_MetallicAsteroidField",
      "q": 2,
      "r": 8
    },
    {
      "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
      "q": 3,
      "r": 7
    },
    {
      "id": "HarvestableSpacePOI_SatelliteField",
      "q": -9,
      "r": 5
    },
    {
      "id": "HarvestableSpacePOI_MetallicAsteroidField",
      "q": -8,
      "r": 5
    },
    {
      "id": "HarvestableSpacePOI_OilyAsteroidField",
      "q": -9,
      "r": 6
    },
    {
      "id": "HarvestableSpacePOI_FrozenOreField",
      "q": 7,
      "r": -11
    },
    {
      "id": "HarvestableSpacePOI_SaltyAsteroidField",
      "q": 6,
      "r": -11
    },
    {
      "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
      "q": 6,
      "r": -10
    },
    {
      "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
      "q": 8,
      "r": -11
    },
    {
      "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
      "q": -4,
      "r": -7
    },
    {
      "id": "ArtifactSpacePOI_GravitasSpaceStation4",
      "q": 0,
      "r": 3
    },
    {
      "id": "ArtifactSpacePOI_RussellsTeapot",
      "q": -9,
      "r": 11
    },
    {
      "id": "ArtifactSpacePOI_GravitasSpaceStation3",
      "q": 6,
      "r": -6
    },
    {
      "id": "ArtifactSpacePOI_GravitasSpaceStation8",
      "q": 7,
      "r": 4
    },
    {
      "id": "ArtifactSpacePOI_GravitasSpaceStation5",
      "q": 2,
      "r": -8
    },
    {
      "id": "ArtifactSpacePOI_GravitasSpaceStation7",
      "q": 7,
      "r": 0
    }
  ]
}
]
""".trimIndent()
