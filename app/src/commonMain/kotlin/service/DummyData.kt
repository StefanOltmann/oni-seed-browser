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
},
  {
    "coordinate": "V-SNDST-C-101520169-0-0-0",
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
        "biomePaths": "Sandstone:124,202 138,190 140,176 134,166 115,158 106,161 95,180 100,195 111,202;141,154 136,144 120,144 115,158 134,166;115,158 120,144 110,134 104,135 96,149 106,161;162,169 158,158 141,154 134,166 140,176;100,195 95,180 82,180 76,197 86,205;153,204 138,190 124,202 131,214;111,202 100,195 86,205 88,215 107,218;129,222 131,214 124,202 111,202 107,218 111,224\nBoggyMarsh:240,83 219,83 211,98 218,111 240,111;240,138 240,111 218,111 210,125 217,138;193,125 185,112 169,112 161,128 169,141 184,142;169,141 161,128 144,128 136,144 141,154 158,158;161,100 168,83 165,77 143,73 134,83 143,101;186,167 191,153 184,142 169,141 158,158 162,169 165,171;222,196 211,180 197,182 187,200 189,204 215,212;55,196 52,172 29,172 22,187 31,201;240,242 217,243 211,259 217,270 240,270;53,279 58,255 54,251 32,250 25,266 31,277 52,280;183,247 189,233 182,220 162,221 156,234 164,248;32,250 26,240 0,239 0,265 25,266;108,268 111,251 105,245 86,245 80,256 87,273 96,275;105,245 111,224 107,218 88,215 79,228 86,245;184,275 190,259 183,247 164,248 158,261 166,275;156,234 162,221 153,204 153,204 131,214 129,222 137,235;190,285 184,275 166,275 158,290 164,302 183,306;30,144 23,130 0,130 0,159 22,159;212,333 216,325 210,312 186,311 182,327 192,339\nFrozenWastes:218,111 211,98 193,96 185,112 193,125 210,125;161,128 169,112 161,100 143,101 135,114 144,128;197,182 186,167 165,171 167,193 187,200;240,166 240,138 217,138 211,152 219,166;48,116 55,105 45,86 30,87 22,102 30,117;60,200 55,196 31,201 27,214 32,223 58,225;217,297 210,286 190,285 183,306 186,311 210,312;69,104 78,86 69,74 53,74 45,86 55,105;57,135 48,116 30,117 23,130 30,144 49,145;29,307 21,294 0,293 0,323 18,324;140,303 143,291 133,278 120,279 109,297 124,310;67,329 66,312 49,304 39,309 38,330 50,338\nBarren:240,83 240,56 218,55 210,67 219,83;219,83 210,67 197,68 187,85 193,96 211,98;197,68 186,54 172,55 165,77 168,83 187,85;172,55 163,47 139,54 143,73 165,77;143,73 139,54 137,53 116,56 111,64 124,83 134,83;124,83 111,64 101,66 91,86 103,99 110,100;91,86 101,66 85,53 78,55 69,74 78,86;69,74 78,55 60,41 44,56 53,74;45,86 53,74 44,56 31,54 22,75 30,87;31,54 29,50 0,48 0,75 22,75\nToxicJungle:193,96 187,85 168,83 161,100 169,112 185,112;135,114 143,101 134,83 124,83 110,100 122,115;136,144 144,128 135,114 122,115 110,134 120,144;110,134 122,115 110,100 103,99 88,118 104,135;106,161 96,149 80,151 72,167 82,180 95,180;96,149 104,135 88,118 81,118 69,135 80,151;211,152 217,138 210,125 193,125 184,142 191,153;211,180 219,166 211,152 191,153 186,167 197,182;72,167 80,151 69,135 57,135 49,145 56,168;240,195 240,166 219,166 211,180 222,196;182,220 189,204 187,200 167,193 153,204 162,221;211,259 217,243 210,232 189,233 183,247 190,259;27,214 31,201 22,187 0,188 0,215;76,197 82,180 72,167 56,168 52,172 55,196 60,200;59,226 58,225 32,223 26,240 32,250 54,251;49,304 52,280 31,277 21,294 29,307 39,309;31,277 25,266 0,265 0,293 21,294;158,290 166,275 158,261 140,263 133,278 143,291\nOcean:88,118 103,99 91,86 78,86 69,104 81,118;69,135 81,118 69,104 55,105 48,116 57,135;30,117 22,102 0,103 0,130 23,130;22,102 30,87 22,75 0,75 0,103;210,232 216,214 215,212 189,204 182,220 189,233;240,242 240,217 216,214 210,232 217,243;52,172 56,168 49,145 30,144 22,159 29,172;22,187 29,172 22,159 0,159 0,188;32,223 27,214 0,215 0,239 26,240;217,270 211,259 190,259 184,275 190,285 210,286;240,270 217,270 210,286 217,297 240,298;86,245 79,228 59,226 54,251 58,255 80,256;79,303 76,284 53,279 52,280 49,304 66,312;158,261 164,248 156,234 137,235 131,249 140,263;97,326 94,307 79,303 66,312 67,329 79,336;240,324 240,298 217,297 210,312 216,325;121,325 124,310 109,297 108,297 94,307 97,326 107,331;154,325 153,313 140,303 124,310 121,325 135,335;182,327 186,311 183,306 164,302 153,313 154,325 163,332\nWasteland:167,193 165,171 162,169 140,176 138,190 153,204 153,204;88,215 86,205 76,197 60,200 58,225 59,226 79,228;87,273 80,256 58,255 53,279 76,284;108,297 96,275 87,273 76,284 79,303 94,307;131,249 137,235 129,222 111,224 105,245 111,251;133,278 140,263 131,249 111,251 108,268 120,279\nRadioactive:240,195 222,196 215,212 216,214 240,217;109,297 120,279 108,268 96,275 108,297;38,330 39,309 29,307 18,324 26,332;164,302 158,290 143,291 140,303 153,313\nOilField:108,351 107,331 97,326 79,336 80,352 91,359;50,354 50,338 38,330 26,332 20,353 29,363;20,353 26,332 18,324 0,323 0,355;135,351 135,335 121,325 107,331 108,351 120,358;189,353 192,339 182,327 163,332 162,352 176,360;80,352 79,336 67,329 50,338 50,354 61,362;222,354 212,333 192,339 189,353 209,368;240,324 216,325 212,333 222,354 240,355;162,352 163,332 154,325 135,335 135,351 147,358\nMagmaCore:29,363 20,353 0,355 0,380 28,380;147,358 135,351 120,358 120,380 147,380;120,358 108,351 91,359 92,380 120,380;176,360 162,352 147,358 147,380 175,380;61,362 50,354 29,363 28,380 61,380;240,355 222,354 209,368 209,380 240,380;209,368 189,353 176,360 175,380 209,380;91,359 80,352 61,362 61,380 92,380",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 120,
            "y": 179
          },
          {
            "id": "MassiveHeatSink",
            "x": 202,
            "y": 107
          },
          {
            "id": "MassiveHeatSink",
            "x": 117,
            "y": 295
          },
          {
            "id": "MassiveHeatSink",
            "x": 42,
            "y": 115
          },
          {
            "id": "WarpConduitSender",
            "x": 57,
            "y": 132
          },
          {
            "id": "WarpConduitReceiver",
            "x": 202,
            "y": 180
          },
          {
            "id": "GravitasPedestal",
            "x": 88,
            "y": 147
          },
          {
            "id": "WarpReceiver",
            "x": 185,
            "y": 239
          },
          {
            "id": "WarpPortal",
            "x": 184,
            "y": 233
          },
          {
            "id": "GeneShuffler",
            "x": 173,
            "y": 138
          },
          {
            "id": "GeneShuffler",
            "x": 138,
            "y": 124
          },
          {
            "id": "GeneShuffler",
            "x": 41,
            "y": 221
          },
          {
            "id": "GeneShuffler",
            "x": 220,
            "y": 344
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "x": 62,
            "y": 348,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "x": 25,
            "y": 345,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "x": 147,
            "y": 344,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "x": 167,
            "y": 319,
            "emitRate": 7481,
            "avgEmitRate": 3519,
            "idleTime": 173,
            "eruptionTime": 397,
            "dormancyCycles": 28.9,
            "activeCycles": 60.2
          },
          {
            "id": "steam",
            "x": 56,
            "y": 187,
            "emitRate": 4831,
            "avgEmitRate": 1514,
            "idleTime": 292,
            "eruptionTime": 336,
            "dormancyCycles": 54.2,
            "activeCycles": 76.4
          },
          {
            "id": "steam",
            "x": 173,
            "y": 166,
            "emitRate": 7603,
            "avgEmitRate": 1662,
            "idleTime": 241,
            "eruptionTime": 129,
            "dormancyCycles": 27.2,
            "activeCycles": 45.7
          },
          {
            "id": "chlorine_gas",
            "x": 154,
            "y": 283,
            "emitRate": 674,
            "avgEmitRate": 104,
            "idleTime": 331,
            "eruptionTime": 124,
            "dormancyCycles": 23.1,
            "activeCycles": 30.7
          },
          {
            "id": "methane",
            "x": 171,
            "y": 282,
            "emitRate": 291,
            "avgEmitRate": 91,
            "idleTime": 273,
            "eruptionTime": 308,
            "dormancyCycles": 63.3,
            "activeCycles": 90.8
          },
          {
            "id": "molten_iron",
            "x": 164,
            "y": 201,
            "emitRate": 9921,
            "avgEmitRate": 347,
            "idleTime": 660,
            "eruptionTime": 37,
            "dormancyCycles": 47,
            "activeCycles": 88.1
          },
          {
            "id": "molten_cobalt",
            "x": 60,
            "y": 158,
            "emitRate": 8712,
            "avgEmitRate": 318,
            "idleTime": 682,
            "eruptionTime": 47,
            "dormancyCycles": 57.5,
            "activeCycles": 76.2
          },
          {
            "id": "hot_steam",
            "x": 81,
            "y": 328,
            "emitRate": 2050,
            "avgEmitRate": 492,
            "idleTime": 299,
            "eruptionTime": 315,
            "dormancyCycles": 80.2,
            "activeCycles": 70.5
          },
          {
            "id": "slush_water",
            "x": 186,
            "y": 339,
            "emitRate": 5302,
            "avgEmitRate": 1350,
            "idleTime": 243,
            "eruptionTime": 182,
            "dormancyCycles": 64.7,
            "activeCycles": 94.6
          },
          {
            "id": "liquid_sulfur",
            "x": 110,
            "y": 338,
            "emitRate": 4984,
            "avgEmitRate": 1846,
            "idleTime": 166,
            "eruptionTime": 253,
            "dormancyCycles": 61.2,
            "activeCycles": 96.8
          },
          {
            "id": "hot_water",
            "x": 148,
            "y": 303,
            "emitRate": 7187,
            "avgEmitRate": 2695,
            "idleTime": 234,
            "eruptionTime": 379,
            "dormancyCycles": 48.1,
            "activeCycles": 74.3
          },
          {
            "id": "molten_cobalt",
            "x": 15,
            "y": 291,
            "emitRate": 10842,
            "avgEmitRate": 382,
            "idleTime": 582,
            "eruptionTime": 32,
            "dormancyCycles": 42.7,
            "activeCycles": 91.5
          },
          {
            "id": "slimy_po2",
            "x": 205,
            "y": 227,
            "emitRate": 298,
            "avgEmitRate": 110,
            "idleTime": 248,
            "eruptionTime": 374,
            "dormancyCycles": 59.4,
            "activeCycles": 94.3
          },
          {
            "id": "hot_po2",
            "x": 129,
            "y": 109,
            "emitRate": 443,
            "avgEmitRate": 107,
            "idleTime": 470,
            "eruptionTime": 312,
            "dormancyCycles": 58.5,
            "activeCycles": 90.9
          },
          {
            "id": "hot_water",
            "x": 64,
            "y": 219,
            "emitRate": 7187,
            "avgEmitRate": 2695,
            "idleTime": 234,
            "eruptionTime": 379,
            "dormancyCycles": 48.1,
            "activeCycles": 74.3
          },
          {
            "id": "salt_water",
            "x": 197,
            "y": 256,
            "emitRate": 6695,
            "avgEmitRate": 3168,
            "idleTime": 200,
            "eruptionTime": 478,
            "dormancyCycles": 57.3,
            "activeCycles": 116.8
          },
          {
            "id": "filthy_water",
            "x": 92,
            "y": 222,
            "emitRate": 10095,
            "avgEmitRate": 2995,
            "idleTime": 422,
            "eruptionTime": 349,
            "dormancyCycles": 51,
            "activeCycles": 96.7
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
          "MagmaVents"
        ],
        "biomePaths": "Swamp:96,113 97,100 91,93 74,97 72,110 82,120;116,94 116,82 102,74 92,79 91,93 97,100;120,113 120,98 116,94 97,100 96,113 107,121;72,110 74,97 69,92 48,93 46,101 59,115;91,93 92,79 78,71 70,74 69,92 74,97;81,133 82,120 72,110 59,115 55,126 63,135;55,126 59,115 46,101 35,106 34,119 44,129;108,131 107,121 96,113 82,120 81,133 82,135 100,138\nBoggyMarsh:102,74 104,62 93,52 82,55 78,71 92,79;117,56 115,37 98,39 93,52 104,62;78,71 82,55 73,48 62,48 55,62 58,69 70,74;140,49 138,39 117,35 115,37 117,56 125,59;15,67 22,49 17,44 0,43 0,68\nForest:128,72 125,59 117,56 104,62 102,74 116,82;69,92 70,74 58,69 45,85 48,93;58,69 55,62 40,59 29,77 45,85;46,101 48,93 45,85 29,77 27,78 19,92 22,99 35,106;27,78 15,67 0,68 0,90 19,92;144,109 137,96 120,98 120,113 134,121;135,128 134,121 120,113 107,121 108,131 122,138\nFrozenWastes:62,48 54,38 41,39 34,49 40,59 55,62;153,56 140,49 125,59 128,72 138,76;29,77 40,59 34,49 22,49 15,67 27,78;160,56 153,56 138,76 143,84 160,85;68,158 59,151 44,154 43,156 46,176 66,176;91,161 79,154 68,158 66,176 91,176\nRust:137,96 143,84 138,76 128,72 116,82 116,94 120,98;160,85 143,84 137,96 144,109 160,110;160,131 160,110 144,109 134,121 135,128 143,134;34,119 35,106 22,99 8,119 18,126;44,129 34,119 18,126 20,140 39,141;8,119 22,99 19,92 0,90 0,119\nRadioactive:59,151 63,135 55,126 44,129 39,141 44,154;43,156 44,154 39,141 20,140 14,148 22,161;22,161 14,148 0,149 0,176 19,176;43,156 22,161 19,176 46,176;14,148 20,140 18,126 8,119 0,119 0,149;114,159 102,154 91,161 91,176 115,176;102,154 100,138 82,135 79,154 91,161;142,153 143,134 135,128 122,138 123,152 137,157;123,152 122,138 108,131 100,138 102,154 114,159;160,156 142,153 137,157 137,176 160,176;137,157 123,152 114,159 115,176 137,176\nMagmaCore:79,154 82,135 81,133 63,135 59,151 68,158;160,131 143,134 142,153 160,156",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 59,
            "y": 57
          },
          {
            "id": "WarpConduitReceiver",
            "x": 30,
            "y": 86
          },
          {
            "id": "WarpConduitSender",
            "x": 56,
            "y": 125
          },
          {
            "id": "WarpReceiver",
            "x": 94,
            "y": 108
          },
          {
            "id": "WarpPortal",
            "x": 72,
            "y": 108
          },
          {
            "id": "GeneShuffler",
            "x": 146,
            "y": 88
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 26,
            "y": 163,
            "emitRate": 278,
            "avgEmitRate": 159,
            "idleTime": 113,
            "eruptionTime": 785,
            "dormancyCycles": 41.3,
            "activeCycles": 78
          },
          {
            "id": "liquid_co2",
            "x": 12,
            "y": 152,
            "emitRate": 417,
            "avgEmitRate": 161,
            "idleTime": 138,
            "eruptionTime": 253,
            "dormancyCycles": 58.5,
            "activeCycles": 86.9
          },
          {
            "id": "slush_salt_water",
            "x": 131,
            "y": 70,
            "emitRate": 5715,
            "avgEmitRate": 1513,
            "idleTime": 191,
            "eruptionTime": 171,
            "dormancyCycles": 60.4,
            "activeCycles": 76.8
          },
          {
            "id": "slush_water",
            "x": 33,
            "y": 57,
            "emitRate": 3191,
            "avgEmitRate": 1611,
            "idleTime": 99,
            "eruptionTime": 326,
            "dormancyCycles": 43.5,
            "activeCycles": 83.8
          },
          {
            "id": "steam",
            "x": 99,
            "y": 74,
            "emitRate": 4269,
            "avgEmitRate": 1298,
            "idleTime": 347,
            "eruptionTime": 253,
            "dormancyCycles": 56.2,
            "activeCycles": 145.3
          },
          {
            "id": "filthy_water",
            "x": 73,
            "y": 82,
            "emitRate": 9524,
            "avgEmitRate": 2891,
            "idleTime": 309,
            "eruptionTime": 300,
            "dormancyCycles": 54.3,
            "activeCycles": 87.6
          },
          {
            "id": "molten_cobalt",
            "x": 115,
            "y": 146,
            "emitRate": 12454,
            "avgEmitRate": 332,
            "idleTime": 624,
            "eruptionTime": 28,
            "dormancyCycles": 27.2,
            "activeCycles": 45.7
          },
          {
            "id": "molten_iron",
            "x": 149,
            "y": 100,
            "emitRate": 17853,
            "avgEmitRate": 327,
            "idleTime": 766,
            "eruptionTime": 22,
            "dormancyCycles": 32.1,
            "activeCycles": 59.2
          },
          {
            "id": "molten_gold",
            "x": 119,
            "y": 88,
            "emitRate": 7979,
            "avgEmitRate": 281,
            "idleTime": 687,
            "eruptionTime": 41,
            "dormancyCycles": 40.7,
            "activeCycles": 68.1
          },
          {
            "id": "chlorine_gas",
            "x": 24,
            "y": 104,
            "emitRate": 259,
            "avgEmitRate": 96,
            "idleTime": 262,
            "eruptionTime": 410,
            "dormancyCycles": 50.9,
            "activeCycles": 79.5
          },
          {
            "id": "liquid_co2",
            "x": 119,
            "y": 120,
            "emitRate": 766,
            "avgEmitRate": 138,
            "idleTime": 524,
            "eruptionTime": 247,
            "dormancyCycles": 53.1,
            "activeCycles": 68
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
          "DistressSignal"
        ],
        "biomePaths": "FrozenWastes:45,74 51,67 45,55 35,54 28,63 36,75;64,67 51,67 45,74 51,87 64,89;19,63 15,48 0,47 0,64 18,64;51,87 45,74 36,75 27,87 42,97;64,67 64,46 52,46 45,55 51,67;52,46 46,35 36,34 29,41 35,54 45,55;35,54 29,41 20,41 15,48 19,63 28,63;27,87 36,75 28,63 19,63 18,64 16,80 24,88;64,107 64,89 51,87 42,97 42,103 50,108;42,103 42,97 27,87 24,88 19,97 22,107 32,110;32,110 22,107 17,112 18,128 35,128;24,88 16,80 0,83 0,96 19,97;17,112 0,111 0,128 18,128;22,107 19,97 0,96 0,111 17,112;50,108 42,103 32,110 35,128 48,128;16,80 18,64 0,64 0,83;64,107 50,108 48,128 64,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 31,
            "y": 54
          },
          {
            "id": "GravitasPedestal",
            "x": 23,
            "y": 109
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 34,
            "y": 105,
            "emitRate": 9648,
            "avgEmitRate": 297,
            "idleTime": 746,
            "eruptionTime": 42,
            "dormancyCycles": 60.3,
            "activeCycles": 83.1
          },
          {
            "id": "molten_iron",
            "x": 12,
            "y": 78,
            "emitRate": 6789,
            "avgEmitRate": 285,
            "idleTime": 498,
            "eruptionTime": 37,
            "dormancyCycles": 57.8,
            "activeCycles": 92.1
          },
          {
            "id": "molten_iron",
            "x": 22,
            "y": 67,
            "emitRate": 7914,
            "avgEmitRate": 240,
            "idleTime": 659,
            "eruptionTime": 41,
            "dormancyCycles": 53,
            "activeCycles": 58.1
          },
          {
            "id": "molten_iron",
            "x": 14,
            "y": 95,
            "emitRate": 9118,
            "avgEmitRate": 318,
            "idleTime": 758,
            "eruptionTime": 43,
            "dormancyCycles": 46.1,
            "activeCycles": 86.9
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
        "biomePaths": "BoggyMarsh:47,49 40,35 34,34 26,46 36,56;64,38 64,37 48,28 40,35 47,49 47,49;26,46 34,34 29,27 17,27 12,36 20,47;64,38 47,49 57,61 64,62;57,61 47,49 47,49 36,56 35,62 47,70;20,47 12,36 0,37 0,55 14,56\nToxicJungle:47,79 47,70 35,62 28,67 29,79 42,84;35,62 36,56 26,46 20,47 14,56 18,64 28,67;64,62 57,61 47,70 47,79 64,83;29,79 28,67 18,64 9,76 20,86;9,76 18,64 14,56 0,55 0,77\nMagmaCore:42,84 29,79 20,86 20,96 42,96;20,86 9,76 0,77 0,96 20,96;64,83 47,79 42,84 42,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 42,
            "y": 46
          },
          {
            "id": "GravitasPedestal",
            "x": 28,
            "y": 46
          },
          {
            "id": "SapTree",
            "x": 35,
            "y": 46
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 52,
            "y": 68,
            "emitRate": 9843,
            "avgEmitRate": 297,
            "idleTime": 727,
            "eruptionTime": 39,
            "dormancyCycles": 48.7,
            "activeCycles": 70.1
          },
          {
            "id": "molten_tungsten",
            "x": 50,
            "y": 90,
            "emitRate": 11237,
            "avgEmitRate": 399,
            "idleTime": 714,
            "eruptionTime": 44,
            "dormancyCycles": 42.6,
            "activeCycles": 67.2
          },
          {
            "id": "slimy_po2",
            "x": 38,
            "y": 60,
            "emitRate": 521,
            "avgEmitRate": 108,
            "idleTime": 446,
            "eruptionTime": 218,
            "dormancyCycles": 34.4,
            "activeCycles": 58.8
          },
          {
            "id": "methane",
            "x": 44,
            "y": 73,
            "emitRate": 466,
            "avgEmitRate": 113,
            "idleTime": 387,
            "eruptionTime": 256,
            "dormancyCycles": 52.6,
            "activeCycles": 81.5
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
        "biomePaths": "MagmaCore:64,51 48,51 44,61 47,66 64,66;64,51 64,34 49,34 44,42 48,51;48,51 44,42 34,41 27,56 31,61 44,61;34,41 28,35 17,35 14,52 17,55 27,56;45,78 47,66 44,61 31,61 28,76 31,79;64,80 64,66 47,66 45,78 46,80;46,80 45,78 31,79 30,96 46,96;31,79 28,76 16,77 13,96 30,96;17,35 15,33 0,34 0,52 14,52;17,55 14,52 0,52 0,73 11,73\nOilField:16,77 11,73 0,73 0,96 13,96;28,76 31,61 27,56 17,55 11,73 16,77;64,80 46,80 46,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 22,
            "y": 57
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 11,
            "y": 87,
            "emitRate": 277821,
            "avgEmitRate": 1258,
            "idleTime": 7461,
            "eruptionTime": 57,
            "dormancyCycles": 69.6,
            "activeCycles": 101.1
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
        "biomePaths": "Moo:84,61 78,44 76,43 62,58 67,64 80,65;76,43 74,39 56,38 52,42 57,57 62,58;96,61 96,42 78,44 84,61;38,60 36,52 20,49 16,62 17,65 33,67;41,42 36,34 21,37 18,46 20,49 36,52;20,49 18,46 0,45 0,61 16,62;57,57 52,42 41,42 36,52 38,60 49,63;21,37 17,30 0,30 0,45 18,46\nFrozenWastes:49,63 38,60 33,67 34,80 51,80;80,65 67,64 63,80 82,80;96,61 84,61 80,65 82,80 96,80;67,64 62,58 57,57 49,63 51,80 63,80;33,67 17,65 15,80 34,80;17,65 16,62 0,61 0,80 15,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 17,
            "y": 52
          },
          {
            "id": "GravitasPedestal",
            "x": 10,
            "y": 52
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 81,
            "y": 49,
            "emitRate": 366,
            "avgEmitRate": 108,
            "idleTime": 466,
            "eruptionTime": 353,
            "dormancyCycles": 40.6,
            "activeCycles": 89.4
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
        "biomePaths": "Barren:52,43 46,38 37,38 31,50 35,57 48,59;37,38 30,31 19,32 14,42 19,49 31,50;69,53 61,42 52,43 48,59 50,62 61,63;46,76 50,62 48,59 35,57 29,68 35,77;61,82 67,73 61,63 50,62 46,76 52,83;80,53 69,53 61,63 67,73 80,73;31,86 35,77 29,68 18,68 14,84 17,87;33,103 37,96 31,86 17,87 17,104;47,95 52,83 46,76 35,77 31,86 37,96;35,57 31,50 19,49 13,63 18,68 29,68;80,32 67,33 61,42 69,53 80,53;14,84 18,68 13,63 0,63 0,85;19,49 14,42 0,42 0,63 13,63;80,93 80,73 67,73 61,82 69,93;55,104 47,95 37,96 33,103 38,114 47,115;80,113 80,93 69,93 61,104 69,114;19,119 16,105 0,106 0,126 12,127;38,114 33,103 17,104 16,105 19,119 31,122;61,104 69,93 61,82 52,83 47,95 55,104;69,114 61,104 55,104 47,115 52,124 62,125;34,133 31,122 19,119 12,127 18,139 28,140;80,113 69,114 62,125 68,134 80,134;17,158 9,150 0,150 0,174 12,174;29,157 17,158 12,174 33,174;16,105 17,104 17,87 14,84 0,85 0,106;48,159 45,153 32,153 29,157 33,174 44,174;52,124 47,115 38,114 31,122 34,133 46,134;68,134 62,125 52,124 46,134 50,142 62,143;80,154 67,154 62,160 65,174 80,174;62,160 48,159 44,174 65,174\nSwamp:18,139 12,127 0,126 0,150 9,150;29,157 32,153 28,140 18,139 9,150 17,158;50,142 46,134 34,133 28,140 32,153 45,153;80,134 68,134 62,143 67,154 80,154;67,154 62,143 50,142 45,153 48,159 62,160",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 28,
            "y": 153
          },
          {
            "id": "GravitasPedestal",
            "x": 30,
            "y": 153
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "x": 59,
            "y": 91,
            "emitRate": 9575,
            "avgEmitRate": 2871,
            "idleTime": 298,
            "eruptionTime": 272,
            "dormancyCycles": 43.7,
            "activeCycles": 74
          },
          {
            "id": "salt_water",
            "x": 20,
            "y": 112,
            "emitRate": 11008,
            "avgEmitRate": 3343,
            "idleTime": 370,
            "eruptionTime": 361,
            "dormancyCycles": 50.3,
            "activeCycles": 80.5
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
        "biomePaths": "Barren:24,78 25,70 19,63 1,73 15,83;19,63 19,54 0,54 0,73 1,73;45,78 41,65 25,70 24,78 32,85;41,65 42,62 38,54 21,51 19,54 19,63 25,70;78,78 81,64 76,59 61,64 62,76 65,79;96,81 96,64 81,64 78,78 81,81\nSandstone:62,76 61,64 56,60 42,62 41,65 45,78 48,81\nFrozenWastes:32,85 24,78 15,83 13,96 32,96;15,83 1,73 0,73 0,96 13,96;48,81 45,78 32,85 32,96 50,96;81,81 78,78 65,79 65,96 80,96;65,79 62,76 48,81 50,96 65,96;96,81 81,81 80,96 96,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 32,
            "y": 66
          },
          {
            "id": "GravitasPedestal",
            "x": 36,
            "y": 66
          },
          {
            "id": "GeneShuffler",
            "x": 34,
            "y": 60
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 44,
            "y": 84,
            "emitRate": 6213,
            "avgEmitRate": 1838,
            "idleTime": 315,
            "eruptionTime": 236,
            "dormancyCycles": 39.5,
            "activeCycles": 88.4
          },
          {
            "id": "hot_steam",
            "x": 22,
            "y": 84,
            "emitRate": 1878,
            "avgEmitRate": 531,
            "idleTime": 299,
            "eruptionTime": 506,
            "dormancyCycles": 84.3,
            "activeCycles": 69
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
        "q": 2,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": 1,
        "r": -5
      },
      {
        "id": "MarshyMoonlet",
        "q": -4,
        "r": -2
      },
      {
        "id": "NiobiumMoonlet",
        "q": 6,
        "r": -1
      },
      {
        "id": "MooMoonlet",
        "q": -5,
        "r": 7
      },
      {
        "id": "WaterMoonlet",
        "q": 0,
        "r": 7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 8,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": -8,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -3,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -2,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -3,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -4,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 0,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -1,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 7,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -10,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 6,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 3,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 4,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -1,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -2,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 9,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 10,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -11,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -5,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -4,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 2,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -11,
        "r": 8
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": -1,
        "r": -2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 10,
        "r": -6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 5,
        "r": -7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 6,
        "r": 5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -7,
        "r": -1
      }
    ]
  },
  {
    "coordinate": "M-BAD-C-834286562-0-0-0",
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
          "MetalRich"
        ],
        "biomePaths": "Sandstone:77,103 89,88 90,75 86,64 71,53 51,53 45,56 35,72 35,88 43,101 59,108;45,56 32,48 20,58 20,67 35,72;128,134 106,131 104,131 106,153 128,153;35,88 35,72 20,67 15,72 22,91;43,131 44,126 34,112 25,113 21,117 22,134 28,139;57,119 59,108 43,101 34,112 44,126;57,150 43,131 28,139 28,153 57,153;28,139 22,134 0,140 0,153 28,153;72,131 85,115 77,103 59,108 57,119 72,131;83,142 72,131 72,131 57,150 57,153 84,153\nToxicJungle:113,40 106,31 87,37 94,53 106,53;71,53 74,42 62,31 52,35 51,53;51,53 52,35 41,29 30,37 32,48 45,56;94,53 87,37 86,37 74,42 71,53 86,64;106,74 112,63 106,53 94,53 86,64 90,75;112,85 106,74 90,75 89,88 103,97;32,48 30,37 20,33 5,47 20,58;15,72 20,67 20,58 5,47 0,47 0,72;128,63 112,63 106,74 112,85 128,85;128,63 128,40 113,40 106,53 112,63;34,112 43,101 35,88 22,91 19,95 25,113;104,131 103,131 83,142 84,153 106,153;104,99 103,97 89,88 77,103 85,115 88,115\nOilField:128,108 128,85 112,85 103,97 104,99 115,109;106,131 115,109 104,99 88,115 103,131 104,131;128,108 115,109 106,131 128,134;19,95 22,91 15,72 0,72 0,96;25,113 19,95 0,96 0,116 21,117;22,134 21,117 0,116 0,140;72,131 57,119 44,126 43,131 57,150;103,131 88,115 85,115 72,131 83,142",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 60,
            "y": 82
          },
          {
            "id": "WarpConduitReceiver",
            "x": 39,
            "y": 47
          },
          {
            "id": "WarpConduitSender",
            "x": 72,
            "y": 55
          },
          {
            "id": "WarpReceiver",
            "x": 18,
            "y": 68
          },
          {
            "id": "WarpPortal",
            "x": 18,
            "y": 63
          },
          {
            "id": "GeneShuffler",
            "x": 35,
            "y": 111
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "x": 79,
            "y": 136,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "x": 86,
            "y": 119,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "x": 15,
            "y": 93,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "x": 98,
            "y": 132,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "x": 49,
            "y": 133,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "x": 96,
            "y": 77,
            "emitRate": 4943,
            "avgEmitRate": 1344,
            "idleTime": 393,
            "eruptionTime": 531,
            "dormancyCycles": 71.2,
            "activeCycles": 63.9
          },
          {
            "id": "chlorine_gas",
            "x": 95,
            "y": 55,
            "emitRate": 405,
            "avgEmitRate": 117,
            "idleTime": 226,
            "eruptionTime": 210,
            "dormancyCycles": 37.5,
            "activeCycles": 56.2
          },
          {
            "id": "big_volcano",
            "x": 88,
            "y": 108,
            "emitRate": 269828,
            "avgEmitRate": 1189,
            "idleTime": 8997,
            "eruptionTime": 68,
            "dormancyCycles": 46.5,
            "activeCycles": 66.4
          },
          {
            "id": "slimy_po2",
            "x": 111,
            "y": 57,
            "emitRate": 389,
            "avgEmitRate": 105,
            "idleTime": 292,
            "eruptionTime": 208,
            "dormancyCycles": 32.1,
            "activeCycles": 59.8
          },
          {
            "id": "methane",
            "x": 115,
            "y": 119,
            "emitRate": 358,
            "avgEmitRate": 122,
            "idleTime": 221,
            "eruptionTime": 270,
            "dormancyCycles": 54.3,
            "activeCycles": 88
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
          "MetalCaves",
          "RadioactiveCrust"
        ],
        "biomePaths": "Forest:79,108 92,97 97,84 92,67 90,65 70,58 57,63 46,81 49,94 57,104 76,108;113,78 107,67 92,67 97,84 106,85;109,105 106,85 97,84 92,97 106,107 106,107;106,107 92,97 79,108 90,116;76,108 57,104 54,112 67,122;54,112 57,104 49,94 37,105 44,115;57,63 45,55 44,56 39,77 46,81\nOcean:116,53 106,42 94,45 90,65 92,67 107,67;94,45 86,39 70,45 70,58 90,65;128,53 116,53 107,67 113,78 128,79;39,77 44,56 23,51 16,64 26,79;45,55 49,43 40,32 22,38 20,42 23,51 44,56;49,94 46,81 39,77 26,79 20,90 27,104 37,105;128,104 128,79 113,78 106,85 109,105;27,104 20,90 0,91 0,112 20,113;20,90 26,79 16,64 0,65 0,91;16,64 23,51 20,42 0,43 0,65;70,58 70,45 63,39 49,43 45,55 57,63\nRadioactive:113,129 106,107 106,107 90,116 90,131 106,135;68,130 67,122 54,112 44,115 40,129 43,133 64,135;44,115 37,105 27,104 20,113 24,128 40,129;24,128 20,113 0,112 0,132 21,132;128,104 109,105 106,107 113,129 128,130;90,131 90,116 79,108 76,108 67,122 68,130 86,134\nMagmaCore:128,130 113,129 106,135 107,153 128,153;106,135 90,131 86,134 86,153 107,153;43,133 40,129 24,128 21,132 23,153 40,153;21,132 0,132 0,153 23,153;64,135 43,133 40,153 65,153;86,134 68,130 64,135 65,153 86,153",
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "x": 97,
            "y": 71
          },
          {
            "id": "WarpConduitSender",
            "x": 43,
            "y": 70
          },
          {
            "id": "GravitasPedestal",
            "x": 19,
            "y": 118
          },
          {
            "id": "WarpReceiver",
            "x": 80,
            "y": 89
          },
          {
            "id": "WarpPortal",
            "x": 58,
            "y": 89
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "x": 28,
            "y": 82,
            "emitRate": 9948,
            "avgEmitRate": 3336,
            "idleTime": 320,
            "eruptionTime": 356,
            "dormancyCycles": 54.3,
            "activeCycles": 95.2
          },
          {
            "id": "filthy_water",
            "x": 112,
            "y": 87,
            "emitRate": 9961,
            "avgEmitRate": 3520,
            "idleTime": 312,
            "eruptionTime": 467,
            "dormancyCycles": 56.3,
            "activeCycles": 80.9
          },
          {
            "id": "slush_salt_water",
            "x": 24,
            "y": 60,
            "emitRate": 5520,
            "avgEmitRate": 1469,
            "idleTime": 570,
            "eruptionTime": 379,
            "dormancyCycles": 45.3,
            "activeCycles": 90.4
          },
          {
            "id": "steam",
            "x": 73,
            "y": 55,
            "emitRate": 3596,
            "avgEmitRate": 1353,
            "idleTime": 247,
            "eruptionTime": 492,
            "dormancyCycles": 43.5,
            "activeCycles": 56.7
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
          "BouldersMixed"
        ],
        "biomePaths": "Swamp:84,80 90,70 72,54 61,68 67,81;56,40 40,25 28,39 43,52;47,67 42,61 23,64 19,72 24,83 40,85;42,61 43,52 28,39 23,40 17,49 23,64;67,81 61,68 47,67 40,85 43,90 61,93;17,94 24,83 19,72 0,72 0,94;128,38 110,38 102,48 103,52 128,64;128,66 128,64 103,52 94,69 107,78;109,92 107,78 94,69 90,70 84,80 89,97 103,98\nBoggyMarsh:94,69 103,52 102,48 85,42 72,52 72,54 90,70;72,54 72,52 59,40 56,40 43,52 42,61 47,67 61,68;19,72 23,64 17,49 0,49 0,72;37,107 43,90 40,85 24,83 17,94 25,108;57,113 62,96 61,93 43,90 37,107 47,116;43,131 47,116 37,107 25,108 21,114 24,129 40,132;24,129 21,114 0,115 0,133 19,135;128,66 107,78 109,92 128,94;100,125 108,113 103,98 89,97 83,103 82,113 95,125;128,94 109,92 103,98 108,113 128,114;128,133 128,114 108,113 100,125 108,135\nMetallic:21,114 25,108 17,94 0,94 0,115;89,97 84,80 67,81 61,93 62,96 83,103;68,132 68,121 57,113 47,116 43,131 61,138;82,113 83,103 62,96 57,113 68,121;95,125 82,113 68,121 68,132 84,138\nMagmaCore:40,132 24,129 19,135 21,153 38,153;19,135 0,133 0,153 21,153;61,138 43,131 40,132 38,153 61,153;108,135 100,125 95,125 84,138 86,153 105,153;84,138 68,132 61,138 61,153 86,153;128,133 108,135 105,153 128,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 61,
            "y": 126
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "x": 37,
            "y": 119,
            "emitRate": 338,
            "avgEmitRate": 140,
            "idleTime": 232,
            "eruptionTime": 415,
            "dormancyCycles": 46.2,
            "activeCycles": 84.6
          },
          {
            "id": "molten_cobalt",
            "x": 68,
            "y": 93,
            "emitRate": 8142,
            "avgEmitRate": 323,
            "idleTime": 701,
            "eruptionTime": 49,
            "dormancyCycles": 56.6,
            "activeCycles": 86.8
          },
          {
            "id": "molten_gold",
            "x": 17,
            "y": 103,
            "emitRate": 12985,
            "avgEmitRate": 445,
            "idleTime": 738,
            "eruptionTime": 33,
            "dormancyCycles": 29.2,
            "activeCycles": 112.5
          },
          {
            "id": "molten_cobalt",
            "x": 85,
            "y": 97,
            "emitRate": 7343,
            "avgEmitRate": 298,
            "idleTime": 653,
            "eruptionTime": 48,
            "dormancyCycles": 52.3,
            "activeCycles": 74.5
          },
          {
            "id": "molten_aluminum",
            "x": 16,
            "y": 68,
            "emitRate": 7294,
            "avgEmitRate": 300,
            "idleTime": 712,
            "eruptionTime": 54,
            "dormancyCycles": 82.8,
            "activeCycles": 114
          },
          {
            "id": "molten_copper",
            "x": 112,
            "y": 88,
            "emitRate": 5545,
            "avgEmitRate": 302,
            "idleTime": 757,
            "eruptionTime": 73,
            "dormancyCycles": 38.9,
            "activeCycles": 64.2
          },
          {
            "id": "chlorine_gas",
            "x": 112,
            "y": 119,
            "emitRate": 355,
            "avgEmitRate": 100,
            "idleTime": 358,
            "eruptionTime": 292,
            "dormancyCycles": 49.5,
            "activeCycles": 81.8
          },
          {
            "id": "molten_cobalt",
            "x": 87,
            "y": 109,
            "emitRate": 6924,
            "avgEmitRate": 323,
            "idleTime": 671,
            "eruptionTime": 50,
            "dormancyCycles": 38.8,
            "activeCycles": 79
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
          "MagmaVents",
          "Geodes"
        ],
        "biomePaths": "Forest:104,65 110,57 104,41 88,42 85,57 96,66;85,57 88,42 83,36 64,40 64,56 73,61;128,56 128,37 107,36 104,41 110,57;64,56 64,40 60,37 39,41 39,41 43,58 54,62;43,58 39,41 22,43 16,51 23,66 33,66;23,66 16,51 0,51 0,76 14,76\nToxicJungle:96,66 85,57 73,61 73,80 87,85;128,80 114,80 106,90 111,104 128,104;55,81 54,62 43,58 33,66 41,86;39,89 41,86 33,66 23,66 14,76 23,91;44,105 39,89 23,91 17,101 22,111 33,114;56,128 54,108 44,105 33,114 37,130 44,134\nRust:114,80 104,65 96,66 87,85 89,88 106,90;73,80 73,61 64,56 54,62 55,81 63,85;84,102 89,88 87,85 73,80 63,85 65,103 71,106;105,112 111,104 106,90 89,88 84,102 93,112;65,103 63,85 55,81 41,86 39,89 44,105 54,108;112,128 105,112 93,112 85,129 88,132 107,134;128,128 128,104 111,104 105,112 112,128;128,80 128,56 110,57 104,65 114,80;23,91 14,76 0,76 0,101 17,101;11,127 22,111 17,101 0,101 0,127;37,130 33,114 22,111 11,127 22,137\nMagmaCore:107,134 88,132 84,153 110,153;74,126 71,106 65,103 54,108 56,128 65,131;128,128 112,128 107,134 110,153 128,153;88,132 85,129 74,126 65,131 67,153 84,153;65,131 56,128 44,134 45,153 67,153;44,134 37,130 22,137 20,153 45,153;22,137 11,127 0,127 0,153 20,153;93,112 84,102 71,106 74,126 85,129",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 83,
            "y": 98
          },
          {
            "id": "PropSurfaceSatellite3",
            "x": 71,
            "y": 58
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 38,
            "y": 112,
            "emitRate": 330,
            "avgEmitRate": 81,
            "idleTime": 228,
            "eruptionTime": 195,
            "dormancyCycles": 34.4,
            "activeCycles": 39
          },
          {
            "id": "slush_water",
            "x": 51,
            "y": 96,
            "emitRate": 4374,
            "avgEmitRate": 1296,
            "idleTime": 302,
            "eruptionTime": 346,
            "dormancyCycles": 46.8,
            "activeCycles": 58.3
          },
          {
            "id": "liquid_co2",
            "x": 23,
            "y": 99,
            "emitRate": 293,
            "avgEmitRate": 115,
            "idleTime": 182,
            "eruptionTime": 431,
            "dormancyCycles": 59,
            "activeCycles": 73.7
          },
          {
            "id": "chlorine_gas",
            "x": 29,
            "y": 72,
            "emitRate": 641,
            "avgEmitRate": 88,
            "idleTime": 360,
            "eruptionTime": 126,
            "dormancyCycles": 63.9,
            "activeCycles": 72
          },
          {
            "id": "small_volcano",
            "x": 105,
            "y": 104,
            "emitRate": 117645,
            "avgEmitRate": 675,
            "idleTime": 7982,
            "eruptionTime": 65,
            "dormancyCycles": 21.8,
            "activeCycles": 54.7
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
          "SlimeSplats"
        ],
        "biomePaths": "Wasteland:106,91 115,77 105,67 92,69 90,86 95,92;90,86 92,69 86,65 69,68 68,85 72,88;116,103 106,91 95,92 90,110 93,114 107,115;95,92 90,86 72,88 72,108 90,110;128,103 128,77 115,77 106,91 116,103;68,85 69,68 63,63 48,66 45,78 51,88;72,108 72,88 68,85 51,88 48,97 59,110 68,111;48,97 51,88 45,78 26,80 23,86 24,92 37,101;26,80 22,64 0,67 0,83 23,86;34,116 37,101 24,92 12,107 22,119;24,92 23,86 0,83 0,107 12,107;45,78 48,66 40,58 24,61 22,64 26,80\nMagmaCore:128,77 128,47 112,48 105,67 115,77;105,67 112,48 103,40 86,45 86,65 92,69;86,65 86,45 78,39 65,44 63,63 69,68;63,63 65,44 54,36 44,41 40,58 48,66;40,58 44,41 27,30 17,40 24,61;22,64 24,61 17,40 0,38 0,67\nFrozenWastes:128,103 116,103 107,115 114,129 128,131;88,130 93,114 90,110 72,108 68,111 71,130 79,134;114,129 107,115 93,114 88,130 104,140;71,130 68,111 59,110 45,125 45,129 55,137;59,110 48,97 37,101 34,116 45,125;17,131 22,119 12,107 0,107 0,134;45,129 45,125 34,116 22,119 17,131 28,144\nSandstone:79,134 71,130 55,137 56,153 79,153;128,131 114,129 104,140 104,153 128,153;55,137 45,129 28,144 28,153 56,153;28,144 17,131 0,134 0,153 28,153;104,140 88,130 79,134 79,153 104,153",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 48,
            "y": 105
          },
          {
            "id": "MassiveHeatSink",
            "x": 107,
            "y": 139
          },
          {
            "id": "MassiveHeatSink",
            "x": 76,
            "y": 130
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "x": 112,
            "y": 58,
            "emitRate": 4981,
            "avgEmitRate": 1691,
            "idleTime": 329,
            "eruptionTime": 409,
            "dormancyCycles": 35,
            "activeCycles": 55.4
          },
          {
            "id": "slimy_po2",
            "x": 48,
            "y": 116,
            "emitRate": 328,
            "avgEmitRate": 94,
            "idleTime": 147,
            "eruptionTime": 135,
            "dormancyCycles": 32.8,
            "activeCycles": 49.5
          },
          {
            "id": "hot_hydrogen",
            "x": 45,
            "y": 88,
            "emitRate": 252,
            "avgEmitRate": 104,
            "idleTime": 198,
            "eruptionTime": 351,
            "dormancyCycles": 42,
            "activeCycles": 76.6
          },
          {
            "id": "steam",
            "x": 115,
            "y": 97,
            "emitRate": 4187,
            "avgEmitRate": 1230,
            "idleTime": 249,
            "eruptionTime": 257,
            "dormancyCycles": 50.6,
            "activeCycles": 69.4
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
          "SubsurfaceOcean",
          "LushCore"
        ],
        "biomePaths": "Ocean:64,47 64,32 48,31 43,43 47,47;46,61 47,47 43,43 33,43 26,53 33,64 42,65;26,53 33,43 27,33 18,32 10,43 18,53;11,65 18,53 10,43 0,43 0,66\nFrozenWastes:64,47 47,47 46,61 64,63;64,63 46,61 42,65 45,77 64,77;45,77 42,65 33,64 21,76 21,79 26,84 42,84;64,91 64,77 45,77 42,84 46,94;24,101 26,84 21,79 0,90 19,102;33,64 26,53 18,53 11,65 21,76;21,79 21,76 11,65 0,66 0,90 0,90;14,111 19,102 0,90 0,90 0,113;46,95 46,94 42,84 26,84 24,101 31,104;52,110 46,95 31,104 34,113 46,116;64,91 46,94 46,95 52,110 64,110\nForest:34,113 31,104 24,101 19,102 14,111 23,128 25,128;14,111 0,113 0,128 23,128;46,116 34,113 25,128 48,128;64,110 52,110 46,116 48,128 64,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 42,
            "y": 62
          },
          {
            "id": "GravitasPedestal",
            "x": 31,
            "y": 108
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 51,
            "y": 103,
            "emitRate": 5226,
            "avgEmitRate": 261,
            "idleTime": 713,
            "eruptionTime": 73,
            "dormancyCycles": 73.7,
            "activeCycles": 86.8
          },
          {
            "id": "molten_iron",
            "x": 22,
            "y": 87,
            "emitRate": 6832,
            "avgEmitRate": 287,
            "idleTime": 765,
            "eruptionTime": 61,
            "dormancyCycles": 39.9,
            "activeCycles": 52.4
          },
          {
            "id": "molten_iron",
            "x": 39,
            "y": 74,
            "emitRate": 6485,
            "avgEmitRate": 303,
            "idleTime": 727,
            "eruptionTime": 56,
            "dormancyCycles": 44.4,
            "activeCycles": 82.3
          },
          {
            "id": "molten_iron",
            "x": 47,
            "y": 90,
            "emitRate": 8050,
            "avgEmitRate": 232,
            "idleTime": 665,
            "eruptionTime": 36,
            "dormancyCycles": 66.6,
            "activeCycles": 83.1
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
        "biomePaths": "BoggyMarsh:37,57 41,49 30,38 22,40 21,58 25,60;61,60 46,48 41,49 37,57 45,69;64,36 52,38 46,48 61,60 64,60;21,58 22,40 19,38 0,43 0,51 17,59;64,60 61,60 45,69 44,75 48,80 64,80\nToxicJungle:8,74 17,59 0,51 0,74;28,77 25,60 21,58 17,59 8,74 16,80;44,75 45,69 37,57 25,60 28,77 30,78\nMagmaCore:16,80 8,74 0,74 0,96 14,96;48,80 44,75 30,78 32,96 46,96;30,78 28,77 16,80 14,96 32,96;64,80 48,80 46,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 34,
            "y": 51
          },
          {
            "id": "GravitasPedestal",
            "x": 20,
            "y": 51
          },
          {
            "id": "SapTree",
            "x": 27,
            "y": 51
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 12,
            "y": 59,
            "emitRate": 10329,
            "avgEmitRate": 335,
            "idleTime": 906,
            "eruptionTime": 49,
            "dormancyCycles": 37.8,
            "activeCycles": 66.2
          },
          {
            "id": "molten_tungsten",
            "x": 10,
            "y": 91,
            "emitRate": 10093,
            "avgEmitRate": 344,
            "idleTime": 979,
            "eruptionTime": 60,
            "dormancyCycles": 73.7,
            "activeCycles": 104.6
          },
          {
            "id": "molten_tungsten",
            "x": 52,
            "y": 91,
            "emitRate": 7992,
            "avgEmitRate": 326,
            "idleTime": 691,
            "eruptionTime": 52,
            "dormancyCycles": 69.9,
            "activeCycles": 97.1
          },
          {
            "id": "slimy_po2",
            "x": 24,
            "y": 72,
            "emitRate": 314,
            "avgEmitRate": 92,
            "idleTime": 324,
            "eruptionTime": 344,
            "dormancyCycles": 20,
            "activeCycles": 26.8
          },
          {
            "id": "methane",
            "x": 41,
            "y": 69,
            "emitRate": 355,
            "avgEmitRate": 104,
            "idleTime": 303,
            "eruptionTime": 315,
            "dormancyCycles": 46.2,
            "activeCycles": 62.8
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
        "biomePaths": "Moo:96,36 80,38 77,43 84,58 96,58;64,61 66,45 56,38 46,48 49,60 59,64;84,58 77,43 66,45 64,61 77,65;56,38 56,36 41,24 30,37 35,45 46,48;27,59 35,45 30,37 19,35 13,55 20,60;13,55 19,35 17,33 0,33 0,55;49,60 46,48 35,45 27,59 38,68\nFrozenWastes:77,65 64,61 59,64 59,80 79,80;59,64 49,60 38,68 38,80 59,80;20,60 13,55 0,55 0,80 15,80;96,58 84,58 77,65 79,80 96,80;38,68 27,59 20,60 15,80 38,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 17,
            "y": 38
          },
          {
            "id": "GravitasPedestal",
            "x": 10,
            "y": 38
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 84,
            "y": 50,
            "emitRate": 375,
            "avgEmitRate": 91,
            "idleTime": 250,
            "eruptionTime": 206,
            "dormancyCycles": 40.7,
            "activeCycles": 47.8
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
        "biomePaths": "Barren:80,68 80,43 69,43 60,54 60,58 77,69;60,58 60,54 47,46 35,53 40,66 51,68;77,69 60,58 51,68 56,81 61,83;80,68 77,69 61,83 67,93 80,94;69,43 59,30 48,36 47,46 60,54;40,66 35,53 34,53 20,58 16,67 20,73 32,76;47,46 48,36 36,28 27,36 34,53 35,53;56,81 51,68 40,66 32,76 35,84 46,88;59,105 67,93 61,83 56,81 46,88 47,101 54,106;80,114 80,94 67,93 59,105 69,115;47,101 46,88 35,84 25,97 34,106;32,116 34,106 25,97 20,96 11,111 20,120;60,130 69,115 59,105 54,106 48,121 60,130;80,134 80,114 69,115 60,130 68,135;48,121 54,106 47,101 34,106 32,116 40,123;20,73 16,67 0,67 0,88 12,88;34,53 27,36 19,36 11,46 20,58;16,67 20,58 11,46 0,46 0,67;35,84 32,76 20,73 12,88 20,96 25,97;36,135 40,123 32,116 20,120 18,131 29,137;11,111 20,96 12,88 0,88 0,111;18,131 20,120 11,111 0,111 0,133 12,134;80,156 66,154 61,156 59,159 62,174 80,174;49,143 60,130 48,121 40,123 36,135 45,143;59,159 41,162 39,174 62,174;41,162 37,157 25,154 20,156 19,174 39,174;20,156 14,154 0,156 0,174 19,174\nSwamp:66,154 68,135 60,130 60,130 49,143 61,156;45,143 36,135 29,137 25,154 37,157;80,134 68,135 66,154 80,156;25,154 29,137 18,131 12,134 14,154 20,156;14,154 12,134 0,133 0,156;59,159 61,156 49,143 45,143 37,157 41,162",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 61,
            "y": 136
          },
          {
            "id": "GravitasPedestal",
            "x": 63,
            "y": 136
          }
        ],
        "geysers": [
          {
            "id": "slush_water",
            "x": 15,
            "y": 88,
            "emitRate": 5255,
            "avgEmitRate": 2167,
            "idleTime": 156,
            "eruptionTime": 230,
            "dormancyCycles": 61.8,
            "activeCycles": 138.5
          },
          {
            "id": "filthy_water",
            "x": 39,
            "y": 60,
            "emitRate": 11661,
            "avgEmitRate": 2674,
            "idleTime": 330,
            "eruptionTime": 211,
            "dormancyCycles": 35.7,
            "activeCycles": 51.2
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
          "FrozenCore"
        ],
        "biomePaths": "MagmaCore:36,48 32,38 23,34 15,46 19,56 30,56;23,34 23,33 15,27 0,31 0,44 15,46;18,76 14,62 0,62 0,79 15,79;53,37 45,30 32,38 36,48 48,49;19,56 15,46 0,44 0,62 14,62;51,77 46,66 35,66 29,77 32,81 47,82;64,35 53,37 48,49 52,56 64,57\nOilField:52,56 48,49 36,48 30,56 35,66 46,66;35,66 30,56 19,56 14,62 18,76 29,77;64,57 52,56 46,66 51,77 64,77\nFrozenWastes:15,79 0,79 0,96 17,96;32,81 29,77 18,76 15,79 17,96 29,96;64,77 51,77 47,82 49,96 64,96;47,82 32,81 29,96 49,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 39,
            "y": 51
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 30,
            "y": 65,
            "emitRate": 271829,
            "avgEmitRate": 1082,
            "idleTime": 8395,
            "eruptionTime": 57,
            "dormancyCycles": 57.2,
            "activeCycles": 81.8
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
        "biomePaths": "Barren:127,63 124,56 109,54 105,61 114,75 120,75;86,58 87,49 73,41 66,46 67,59 76,63;92,77 95,64 86,58 76,63 76,76 86,81;160,76 160,57 147,56 140,65 144,76;58,76 57,64 50,61 38,69 38,76 50,82;50,61 47,50 34,47 29,61 38,69;19,63 12,55 0,55 0,75 15,76\nSandstone:105,61 109,54 107,48 94,43 87,49 86,58 95,64;141,80 144,76 140,65 127,63 120,75 125,81;114,75 105,61 95,64 92,77 105,83;67,59 66,46 53,43 47,50 50,61 57,64;76,76 76,63 67,59 57,64 58,76 67,81;38,76 38,69 29,61 19,63 15,76 17,78 32,81\nFrozenWastes:160,76 144,76 141,80 143,96 160,96;141,80 125,81 123,96 143,96;125,81 120,75 114,75 105,83 106,96 123,96;105,83 92,77 86,81 85,96 106,96;50,82 38,76 32,81 33,96 49,96;67,81 58,76 50,82 49,96 68,96;86,81 76,76 67,81 68,96 85,96;32,81 17,78 14,96 33,96;17,78 15,76 0,75 0,96 14,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 110,
            "y": 65
          },
          {
            "id": "GravitasPedestal",
            "x": 114,
            "y": 65
          },
          {
            "id": "GeneShuffler",
            "x": 112,
            "y": 59
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 43,
            "y": 85,
            "emitRate": 4264,
            "avgEmitRate": 1749,
            "idleTime": 266,
            "eruptionTime": 461,
            "dormancyCycles": 41.1,
            "activeCycles": 75.4
          },
          {
            "id": "hot_steam",
            "x": 97,
            "y": 86,
            "emitRate": 1866,
            "avgEmitRate": 793,
            "idleTime": 180,
            "eruptionTime": 367,
            "dormancyCycles": 50.6,
            "activeCycles": 87.5
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlandsStart",
        "q": 0,
        "r": 0
      },
      {
        "id": "MiniRadioactiveOceanWarp",
        "q": -4,
        "r": 3
      },
      {
        "id": "MiniMetallicSwampy",
        "q": 1,
        "r": 2
      },
      {
        "id": "MiniForestFrozen",
        "q": 3,
        "r": -2
      },
      {
        "id": "MiniFlipped",
        "q": -1,
        "r": -3
      },
      {
        "id": "TundraMoonlet",
        "q": -1,
        "r": 8
      },
      {
        "id": "MarshyMoonlet",
        "q": 8,
        "r": -7
      },
      {
        "id": "MooMoonlet",
        "q": 4,
        "r": 3
      },
      {
        "id": "WaterMoonlet",
        "q": 9,
        "r": 0
      },
      {
        "id": "NiobiumMoonlet",
        "q": -11,
        "r": 10
      },
      {
        "id": "RegolithMoonlet",
        "q": 1,
        "r": -10
      },
      {
        "id": "TemporalTear",
        "q": -4,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -2,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -4,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 8,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 0,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -9,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 8,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 5,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -2,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 1,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 2,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 2,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 6,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 6,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 11,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -11,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 4,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 5,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 4,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -9,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 12,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 12,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -7,
        "r": -4
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 12,
        "r": -12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -6,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -7,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -12,
        "r": 4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 4,
        "r": -5
      }
    ]
  }
]
""".trimIndent()
