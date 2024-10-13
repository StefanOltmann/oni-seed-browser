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
        "biomePaths": "Sandstone:140,176 138,190 153,204 131,214 129,222 111,224 107,218 88,215 86,205 76,197 82,180 95,180 106,161 96,149 104,135 110,134 120,144 136,144 141,154 158,158 162,169\nBoggyMarsh:30,144 23,130 0,130 0,159 22,159;31,201 22,187 29,172 52,172 55,196;58,255 54,251 32,250 26,240 0,239 0,265 25,266 31,277 52,280 53,279;111,251 105,245 111,224 107,218 88,215 79,228 86,245 80,256 87,273 96,275 108,268;161,100 143,101 134,83 143,73 165,77 168,83;183,306 164,302 158,290 166,275 158,261 164,248 156,234 137,235 129,222 131,214 153,204 162,221 182,220 189,233 183,247 190,259 184,275 190,285;193,125 185,112 169,112 161,128 144,128 136,144 141,154 158,158 162,169 165,171 186,167 191,153 184,142;212,333 192,339 182,327 186,311 210,312 216,325;222,196 211,180 197,182 187,200 189,204 215,212;240,138 240,83 219,83 211,98 218,111 210,125 217,138;217,270 211,259 217,243 240,242 240,270\nFrozenWastes:29,307 21,294 0,293 0,323 18,324;58,225 32,223 27,214 31,201 55,196 60,200;50,338 38,330 39,309 49,304 66,312 67,329;69,104 55,105 48,116 57,135 49,145 30,144 23,130 30,117 22,102 30,87 45,86 53,74 69,74 78,86;140,303 124,310 109,297 120,279 133,278 143,291;161,128 144,128 135,114 143,101 161,100 169,112;197,182 186,167 165,171 167,193 187,200;217,297 210,286 190,285 183,306 186,311 210,312;210,125 193,125 185,112 193,96 211,98 218,111;219,166 211,152 217,138 240,138 240,166\nBarren:240,83 240,56 218,55 210,67 197,68 186,54 172,55 163,47 139,54 137,53 116,56 111,64 101,66 85,53 78,55 60,41 44,56 31,54 29,50 0,48 0,75 22,75 30,87 45,86 53,74 69,74 78,86 91,86 103,99 110,100 124,83 134,83 143,73 165,77 168,83 187,85 193,96 211,98 219,83\nToxicJungle:31,201 22,187 0,188 0,215 27,214;52,280 31,277 25,266 0,265 0,293 21,294 29,307 39,309 49,304;54,251 32,250 26,240 32,223 58,225 59,226;144,128 135,114 143,101 134,83 124,83 110,100 103,99 88,118 81,118 69,135 57,135 49,145 56,168 52,172 55,196 60,200 76,197 82,180 95,180 106,161 96,149 104,135 110,134 120,144 136,144;158,290 143,291 133,278 140,263 158,261 166,275;189,204 187,200 167,193 153,204 162,221 182,220;185,112 169,112 161,100 168,83 187,85 193,96;211,259 190,259 183,247 189,233 210,232 217,243;240,195 240,166 219,166 211,152 217,138 210,125 193,125 184,142 191,153 186,167 197,182 211,180 222,196\nOcean:30,117 22,102 30,87 22,75 0,75 0,130 23,130;32,223 27,214 0,215 0,239 26,240;56,168 49,145 30,144 22,159 0,159 0,188 22,187 29,172 52,172;86,245 79,228 59,226 54,251 58,255 80,256;88,118 81,118 69,135 57,135 48,116 55,105 69,104 78,86 91,86 103,99;158,261 140,263 131,249 137,235 156,234 164,248;182,327 163,332 154,325 135,335 121,325 107,331 97,326 79,336 67,329 66,312 49,304 52,280 53,279 76,284 79,303 94,307 108,297 109,297 124,310 140,303 153,313 164,302 183,306 186,311;217,243 210,232 189,233 182,220 189,204 215,212 216,214 240,217 240,242;216,325 210,312 217,297 210,286 190,285 184,275 190,259 211,259 217,270 240,270 240,324\nWasteland:88,215 86,205 76,197 60,200 58,225 59,226 79,228;94,307 79,303 76,284 53,279 58,255 80,256 87,273 96,275 108,297;133,278 120,279 108,268 111,251 105,245 111,224 129,222 137,235 131,249 140,263;153,204 138,190 140,176 162,169 165,171 167,193\nRadioactive:39,309 29,307 18,324 26,332 38,330;109,297 108,297 96,275 108,268 120,279;153,313 140,303 143,291 158,290 164,302;240,217 240,195 222,196 215,212 216,214\nOilField:240,355 240,324 216,325 212,333 192,339 182,327 163,332 154,325 135,335 121,325 107,331 97,326 79,336 67,329 50,338 38,330 26,332 18,324 0,323 0,355 20,353 29,363 50,354 61,362 80,352 91,359 108,351 120,358 135,351 147,358 162,352 176,360 189,353 209,368 222,354\nMagmaCore:240,380 240,355 222,354 209,368 189,353 176,360 162,352 147,358 135,351 120,358 108,351 91,359 80,352 61,362 50,354 29,363 20,353 0,355 0,380",
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
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 25,
            "y": 345,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 147,
            "y": 344,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
            "dormancyCycles": 47.0,
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
            "dormancyCycles": 51.0,
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
        "biomePaths": "Swamp:107,121 108,131 100,138 82,135 81,133 63,135 55,126 44,129 34,119 35,106 46,101 48,93 69,92 70,74 78,71 92,79 102,74 116,82 116,94 120,98 120,113\nBoggyMarsh:22,49 17,44 0,43 0,68 15,67;140,49 138,39 117,35 115,37 98,39 93,52 82,55 73,48 62,48 55,62 58,69 70,74 78,71 92,79 102,74 104,62 117,56 125,59\nForest:70,74 58,69 55,62 40,59 29,77 27,78 15,67 0,68 0,90 19,92 22,99 35,106 46,101 48,93 69,92;116,82 102,74 104,62 117,56 125,59 128,72;144,109 137,96 120,98 120,113 107,121 108,131 122,138 135,128 134,121\nFrozenWastes:55,62 40,59 29,77 27,78 15,67 22,49 34,49 41,39 54,38 62,48;46,176 43,156 44,154 59,151 68,158 79,154 91,161 91,176;160,85 160,56 153,56 140,49 125,59 128,72 138,76 143,84\nRust:44,129 34,119 35,106 22,99 19,92 0,90 0,119 8,119 18,126 20,140 39,141;160,131 160,85 143,84 138,76 128,72 116,82 116,94 120,98 137,96 144,109 134,121 135,128 143,134\nRadioactive:63,135 55,126 44,129 39,141 20,140 18,126 8,119 0,119 0,176 46,176 43,156 44,154 59,151;91,176 91,161 79,154 82,135 100,138 108,131 122,138 135,128 143,134 142,153 160,156 160,176\nMagmaCore:79,154 68,158 59,151 63,135 81,133 82,135;142,153 143,134 160,131 160,156",
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
            "activeCycles": 78.0
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
            "activeCycles": 68.0
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
        "biomePaths": "FrozenWastes:64,128 64,46 52,46 46,35 36,34 29,41 20,41 15,48 0,47 0,128",
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
            "dormancyCycles": 53.0,
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
        "biomePaths": "BoggyMarsh:64,62 64,37 48,28 40,35 34,34 29,27 17,27 12,36 0,37 0,55 14,56 20,47 26,46 36,56 35,62 47,70 57,61\nToxicJungle:64,83 64,62 57,61 47,70 35,62 36,56 26,46 20,47 14,56 0,55 0,77 9,76 20,86 29,79 42,84 47,79\nMagmaCore:64,96 64,83 47,79 42,84 29,79 20,86 9,76 0,77 0,96",
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
        "biomePaths": "MagmaCore:64,80 64,34 49,34 44,42 34,41 28,35 17,35 15,33 0,34 0,73 11,73 17,55 27,56 31,61 28,76 16,77 13,96 46,96 46,80\nOilField:31,61 27,56 17,55 11,73 0,73 0,96 13,96 16,77 28,76;64,96 64,80 46,80 46,96",
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
        "biomePaths": "Moo:96,61 96,42 78,44 76,43 74,39 56,38 52,42 41,42 36,34 21,37 17,30 0,30 0,61 16,62 17,65 33,67 38,60 49,63 57,57 62,58 67,64 80,65 84,61\nFrozenWastes:96,80 96,61 84,61 80,65 67,64 62,58 57,57 49,63 38,60 33,67 17,65 16,62 0,61 0,80",
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
        "biomePaths": "Barren:80,134 80,32 67,33 61,42 52,43 46,38 37,38 30,31 19,32 14,42 0,42 0,126 12,127 18,139 28,140 34,133 46,134 50,142 62,143 68,134;80,174 80,154 67,154 62,160 48,159 45,153 32,153 29,157 17,158 9,150 0,150 0,174\nSwamp:80,154 80,134 68,134 62,143 50,142 46,134 34,133 28,140 18,139 12,127 0,126 0,150 9,150 17,158 29,157 32,153 45,153 48,159 62,160 67,154",
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
            "activeCycles": 74.0
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
        "biomePaths": "Barren:45,78 41,65 42,62 38,54 21,51 19,54 0,54 0,73 1,73 15,83 24,78 32,85;96,81 96,64 81,64 76,59 61,64 62,76 65,79 78,78 81,81\nSandstone:48,81 45,78 41,65 42,62 56,60 61,64 62,76\nFrozenWastes:96,96 96,81 81,81 78,78 65,79 62,76 48,81 45,78 32,85 24,78 15,83 1,73 0,73 0,96",
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
            "activeCycles": 69.0
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
    "coordinate": "V-CER-C-2127567822-0-0-0",
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
          "Volcanoes",
          "FrozenCore",
          "GlaciersLarge"
        ],
        "biomePaths": "IceCaves:163,147 161,134 141,133 136,122 121,122 117,112 105,109 96,125 99,130 94,150 104,157 105,172 94,182 102,198 115,197 126,207 143,197 143,196 159,190 162,179 151,169 151,157\nFrozenWastes:30,138 25,127 0,127 0,153 20,158 25,155;32,189 16,171 0,175 0,205 27,201;126,207 115,197 102,198 94,182 78,180 67,199 76,213 93,212 98,228 108,231 125,221;167,129 161,134 141,133 136,122 139,109 159,103 168,109;217,176 209,159 186,161 180,150 163,147 151,157 151,169 162,179 159,190 169,206 183,207 193,190 209,189;240,380 240,346 215,348 213,346 190,350 185,346 164,354 153,347 136,355 122,347 108,356 90,347 81,353 61,347 55,350 35,347 28,354 0,352 0,380\nOcean:34,274 27,253 0,254 0,307 32,303 29,280;76,213 67,199 49,197 38,214 38,216 59,230 73,221;131,270 131,256 108,247 99,252 102,278 111,282;174,275 158,263 154,263 142,275 145,294 166,299 172,294;219,237 210,221 219,206 240,205 240,237\nRadioactive:38,216 38,214 27,201 0,205 0,224 28,228;67,199 49,197 42,187 32,189 16,171 20,158 25,155 45,158 51,168 71,169 78,180;197,130 183,138 167,129 168,109 186,103 198,112;240,205 240,119 229,116 216,119 209,134 215,147 209,159 217,176 209,189 193,190 183,207 192,221 210,221 219,206\nMagmaCore:20,158 0,153 0,175 16,171;42,272 34,274 27,253 31,249 45,252;45,158 25,155 30,138 48,144;38,214 27,201 32,189 42,187 49,197;74,318 73,309 57,302 55,304 33,304 36,321 53,318 62,325;105,109 100,103 85,107 85,119 96,125;99,252 90,248 91,233 73,221 76,213 93,212 98,228 108,231 108,247;112,296 111,282 102,278 90,285 91,293 106,300;139,109 130,102 117,112 121,122 136,122;154,263 139,251 131,256 131,270 142,275;169,206 159,190 143,196 143,197 159,215;183,138 167,129 161,134 163,147 180,150;185,260 184,268 174,275 158,263 170,252 172,240 183,237 192,251;229,116 216,119 209,134 197,130 198,112 208,111 219,96 225,97 240,92 240,119;240,319 240,298 219,303 208,293 198,303 200,315 212,320 218,315\nCarrotQuarry:59,230 38,216 28,228 31,249 45,252 57,246;105,172 104,157 94,150 99,130 96,125 85,119 85,107 72,96 54,101 50,111 31,116 19,96 0,96 0,127 25,127 30,138 48,144 45,158 51,168 71,169 78,180 94,182;172,240 157,226 159,215 143,197 126,207 125,221 108,231 108,247 131,256 139,251 154,263 158,263 170,252;186,103 168,109 159,103 139,109 130,102 117,112 105,109 100,103 104,81 116,76 128,83 148,74 159,82 180,74 189,82;198,303 172,294 174,275 184,268 208,284 208,293;209,159 186,161 180,150 183,138 197,130 209,134 215,147;221,270 211,249 192,251 183,237 192,221 210,221 219,237 240,237 240,272\nRust:31,249 28,228 0,224 0,254 27,253;90,285 72,274 59,281 42,272 45,252 57,246 59,230 73,221 91,233 90,248 99,252 102,278;183,237 172,240 157,226 159,215 169,206 183,207 192,221\nSugarWoods:240,92 240,67 215,65 210,56 193,50 181,59 163,49 148,58 133,49 117,56 102,46 87,54 84,70 77,75 54,66 52,56 31,47 18,62 0,62 0,96 19,96 31,116 50,111 54,101 72,96 85,107 100,103 104,81 116,76 128,83 148,74 159,82 180,74 189,82 186,103 198,112 208,111 219,96 225,97\nForest:200,315 198,303 172,294 166,299 145,294 142,275 131,270 111,282 112,296 106,300 91,293 90,285 72,274 59,281 42,272 34,274 29,280 32,303 0,307 0,328 31,330 36,321 33,304 55,304 57,302 73,309 74,318 91,329 104,322 122,331 136,320 153,329 166,320 183,328;219,303 208,293 208,284 184,268 185,260 192,251 211,249 221,270 240,272 240,298\nOilField:240,346 240,319 218,315 212,320 200,315 183,328 166,320 153,329 136,320 122,331 104,322 91,329 74,318 62,325 53,318 36,321 31,330 0,328 0,352 28,354 35,347 55,350 61,347 81,353 90,347 108,356 122,347 136,355 153,347 164,354 185,346 190,350 213,346 215,348",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 127,
            "y": 163
          },
          {
            "id": "WarpConduitSender",
            "x": 62,
            "y": 128
          },
          {
            "id": "WarpConduitReceiver",
            "x": 71,
            "y": 186
          },
          {
            "id": "GravitasPedestal",
            "x": 32,
            "y": 233
          },
          {
            "id": "MassiveHeatSink",
            "x": 167,
            "y": 184
          },
          {
            "id": "WarpReceiver",
            "x": 49,
            "y": 108
          },
          {
            "id": "WarpPortal",
            "x": 48,
            "y": 102
          },
          {
            "id": "GeneShuffler",
            "x": 99,
            "y": 269
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "x": 100,
            "y": 342,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 18,
            "y": 335,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 148,
            "y": 334,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "salt_water",
            "x": 221,
            "y": 227,
            "emitRate": 9852,
            "avgEmitRate": 2896,
            "idleTime": 338,
            "eruptionTime": 371,
            "dormancyCycles": 66.1,
            "activeCycles": 84.7
          },
          {
            "id": "big_volcano",
            "x": 86,
            "y": 221,
            "emitRate": 254738,
            "avgEmitRate": 1454,
            "idleTime": 10127,
            "eruptionTime": 75,
            "dormancyCycles": 24.8,
            "activeCycles": 85.6
          },
          {
            "id": "big_volcano",
            "x": 171,
            "y": 141,
            "emitRate": 248285,
            "avgEmitRate": 1183,
            "idleTime": 8586,
            "eruptionTime": 69,
            "dormancyCycles": 50.4,
            "activeCycles": 75.3
          },
          {
            "id": "big_volcano",
            "x": 36,
            "y": 261,
            "emitRate": 248086,
            "avgEmitRate": 1084,
            "idleTime": 8955,
            "eruptionTime": 68,
            "dormancyCycles": 35.7,
            "activeCycles": 49.6
          },
          {
            "id": "big_volcano",
            "x": 180,
            "y": 249,
            "emitRate": 277783,
            "avgEmitRate": 1359,
            "idleTime": 8477,
            "eruptionTime": 65,
            "dormancyCycles": 41.5,
            "activeCycles": 75.4
          },
          {
            "id": "big_volcano",
            "x": 219,
            "y": 109,
            "emitRate": 240210,
            "avgEmitRate": 1151,
            "idleTime": 9634,
            "eruptionTime": 76,
            "dormancyCycles": 50.3,
            "activeCycles": 80.4
          },
          {
            "id": "big_volcano",
            "x": 37,
            "y": 200,
            "emitRate": 250183,
            "avgEmitRate": 1191,
            "idleTime": 9352,
            "eruptionTime": 77,
            "dormancyCycles": 47.1,
            "activeCycles": 65.1
          },
          {
            "id": "big_volcano",
            "x": 205,
            "y": 123,
            "emitRate": 311323,
            "avgEmitRate": 1461,
            "idleTime": 9123,
            "eruptionTime": 60,
            "dormancyCycles": 38.0,
            "activeCycles": 94.4
          },
          {
            "id": "big_volcano",
            "x": 99,
            "y": 240,
            "emitRate": 253380,
            "avgEmitRate": 1009,
            "idleTime": 8115,
            "eruptionTime": 57,
            "dormancyCycles": 23.5,
            "activeCycles": 31.2
          },
          {
            "id": "small_volcano",
            "x": 120,
            "y": 230,
            "emitRate": 114008,
            "avgEmitRate": 544,
            "idleTime": 8395,
            "eruptionTime": 71,
            "dormancyCycles": 57.6,
            "activeCycles": 76.2
          },
          {
            "id": "slush_water",
            "x": 221,
            "y": 71,
            "emitRate": 4196,
            "avgEmitRate": 1400,
            "idleTime": 286,
            "eruptionTime": 329,
            "dormancyCycles": 34.9,
            "activeCycles": 57.8
          },
          {
            "id": "slush_salt_water",
            "x": 68,
            "y": 92,
            "emitRate": 13296,
            "avgEmitRate": 1242,
            "idleTime": 491,
            "eruptionTime": 105,
            "dormancyCycles": 90.0,
            "activeCycles": 102.2
          },
          {
            "id": "hot_steam",
            "x": 226,
            "y": 191,
            "emitRate": 2485,
            "avgEmitRate": 673,
            "idleTime": 416,
            "eruptionTime": 308,
            "dormancyCycles": 47.4,
            "activeCycles": 82.9
          },
          {
            "id": "hot_co2",
            "x": 19,
            "y": 123,
            "emitRate": 501,
            "avgEmitRate": 131,
            "idleTime": 156,
            "eruptionTime": 82,
            "dormancyCycles": 39.7,
            "activeCycles": 123.3
          },
          {
            "id": "slush_water",
            "x": 214,
            "y": 286,
            "emitRate": 4652,
            "avgEmitRate": 1343,
            "idleTime": 290,
            "eruptionTime": 276,
            "dormancyCycles": 58.0,
            "activeCycles": 84.3
          },
          {
            "id": "liquid_sulfur",
            "x": 183,
            "y": 85,
            "emitRate": 6782,
            "avgEmitRate": 1642,
            "idleTime": 291,
            "eruptionTime": 227,
            "dormancyCycles": 29.3,
            "activeCycles": 36.2
          },
          {
            "id": "chlorine_gas",
            "x": 219,
            "y": 359,
            "emitRate": 272,
            "avgEmitRate": 114,
            "idleTime": 196,
            "eruptionTime": 387,
            "dormancyCycles": 38.2,
            "activeCycles": 66.4
          },
          {
            "id": "slush_water",
            "x": 196,
            "y": 245,
            "emitRate": 4496,
            "avgEmitRate": 1488,
            "idleTime": 220,
            "eruptionTime": 227,
            "dormancyCycles": 47.1,
            "activeCycles": 88.0
          },
          {
            "id": "molten_cobalt",
            "x": 45,
            "y": 62,
            "emitRate": 7609,
            "avgEmitRate": 316,
            "idleTime": 731,
            "eruptionTime": 58,
            "dormancyCycles": 53.5,
            "activeCycles": 70.1
          },
          {
            "id": "molten_aluminum",
            "x": 33,
            "y": 364,
            "emitRate": 9781,
            "avgEmitRate": 329,
            "idleTime": 719,
            "eruptionTime": 43,
            "dormancyCycles": 48.8,
            "activeCycles": 73.4
          },
          {
            "id": "big_volcano",
            "x": 27,
            "y": 68,
            "emitRate": 289056,
            "avgEmitRate": 1143,
            "idleTime": 8941,
            "eruptionTime": 60,
            "dormancyCycles": 47.0,
            "activeCycles": 68.2
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
          "Geodes",
          "Volcanoes"
        ],
        "biomePaths": "Swamp:135,91 119,95 119,113 113,118 94,110 86,127 69,127 65,110 63,109 50,117 39,109 41,90 44,88 44,70 59,64 66,68 68,82 81,87 92,79 108,88 110,88 120,69 121,68 136,76 139,84\nBoggyMarsh:24,87 18,78 23,68 12,51 0,51 0,103 15,103;66,68 59,64 44,70 37,65 38,46 46,41 58,47 70,40 81,46 82,60;160,85 160,59 150,59 137,47 130,48 120,39 105,46 105,59 120,69 121,68 136,76 139,84\nWasteland:46,148 44,133 24,129 22,126 0,126 0,148 19,150 20,151 38,154;160,109 160,85 139,84 135,91 119,95 119,113 133,120 143,108;140,154 135,149 119,150 117,153 98,155 90,148 77,152 67,148 68,128 69,127 86,127 92,137 113,132 114,129 133,123 140,131 160,130 160,153\nToxicJungle:37,65 23,68 12,51 23,40 38,46;120,69 105,59 92,66 82,60 66,68 68,82 81,87 92,79 108,88 110,88;160,130 160,109 143,108 133,120 133,123 140,131\nFrozenWastes:51,125 50,117 39,109 41,90 24,87 15,103 0,103 0,126 22,126 24,129 44,133\nMagmaCore:69,127 65,110 63,109 50,117 51,125 68,128;133,123 133,120 119,113 113,118 114,129;160,176 160,153 140,154 135,149 119,150 117,153 98,155 90,148 77,152 67,148 58,152 46,148 38,154 20,151 19,150 0,148 0,176\nBarren:41,90 24,87 18,78 23,68 37,65 44,70 44,88;68,128 51,125 44,133 46,148 58,152 67,148;114,129 113,118 94,110 86,127 92,137 113,132",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 18,
            "y": 121
          },
          {
            "id": "WarpConduitSender",
            "x": 81,
            "y": 125
          },
          {
            "id": "WarpConduitReceiver",
            "x": 124,
            "y": 76
          },
          {
            "id": "WarpReceiver",
            "x": 103,
            "y": 96
          },
          {
            "id": "WarpPortal",
            "x": 81,
            "y": 96
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 27,
            "y": 62,
            "emitRate": 267,
            "avgEmitRate": 96,
            "idleTime": 210,
            "eruptionTime": 358,
            "dormancyCycles": 61.2,
            "activeCycles": 81.8
          },
          {
            "id": "methane",
            "x": 49,
            "y": 62,
            "emitRate": 444,
            "avgEmitRate": 107,
            "idleTime": 438,
            "eruptionTime": 329,
            "dormancyCycles": 53.2,
            "activeCycles": 68.0
          },
          {
            "id": "molten_cobalt",
            "x": 132,
            "y": 164,
            "emitRate": 6768,
            "avgEmitRate": 350,
            "idleTime": 675,
            "eruptionTime": 61,
            "dormancyCycles": 44.5,
            "activeCycles": 73.0
          },
          {
            "id": "molten_iron",
            "x": 27,
            "y": 165,
            "emitRate": 6972,
            "avgEmitRate": 325,
            "idleTime": 657,
            "eruptionTime": 51,
            "dormancyCycles": 51.1,
            "activeCycles": 93.2
          },
          {
            "id": "molten_copper",
            "x": 109,
            "y": 168,
            "emitRate": 12409,
            "avgEmitRate": 321,
            "idleTime": 721,
            "eruptionTime": 33,
            "dormancyCycles": 54.0,
            "activeCycles": 79.5
          },
          {
            "id": "salt_water",
            "x": 79,
            "y": 166,
            "emitRate": 8991,
            "avgEmitRate": 2976,
            "idleTime": 220,
            "eruptionTime": 227,
            "dormancyCycles": 47.1,
            "activeCycles": 88.0
          },
          {
            "id": "small_volcano",
            "x": 41,
            "y": 117,
            "emitRate": 162582,
            "avgEmitRate": 730,
            "idleTime": 8697,
            "eruptionTime": 61,
            "dormancyCycles": 75.1,
            "activeCycles": 135.9
          },
          {
            "id": "hot_po2",
            "x": 15,
            "y": 167,
            "emitRate": 461,
            "avgEmitRate": 97,
            "idleTime": 249,
            "eruptionTime": 135,
            "dormancyCycles": 58.6,
            "activeCycles": 86.9
          },
          {
            "id": "big_volcano",
            "x": 121,
            "y": 122,
            "emitRate": 227279,
            "avgEmitRate": 1093,
            "idleTime": 8704,
            "eruptionTime": 68,
            "dormancyCycles": 16.4,
            "activeCycles": 26.9
          },
          {
            "id": "big_volcano",
            "x": 60,
            "y": 120,
            "emitRate": 258245,
            "avgEmitRate": 883,
            "idleTime": 7705,
            "eruptionTime": 57,
            "dormancyCycles": 63.6,
            "activeCycles": 55.5
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
          "LushCore"
        ],
        "biomePaths": "FrozenWastes:64,112 64,37 48,36 43,40 31,34 19,40 16,39 0,41 0,112 16,112 18,114 32,114 38,105 44,105 51,112\nForest:64,128 64,112 51,112 44,105 38,105 32,114 18,114 16,112 0,112 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 30,
            "y": 41
          },
          {
            "id": "GravitasPedestal",
            "x": 36,
            "y": 86
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 23,
            "y": 104,
            "emitRate": 5732,
            "avgEmitRate": 240,
            "idleTime": 630,
            "eruptionTime": 51,
            "dormancyCycles": 43.6,
            "activeCycles": 56.3
          },
          {
            "id": "molten_iron",
            "x": 41,
            "y": 103,
            "emitRate": 12759,
            "avgEmitRate": 402,
            "idleTime": 781,
            "eruptionTime": 40,
            "dormancyCycles": 36.7,
            "activeCycles": 68.7
          },
          {
            "id": "molten_iron",
            "x": 34,
            "y": 95,
            "emitRate": 6894,
            "avgEmitRate": 285,
            "idleTime": 915,
            "eruptionTime": 72,
            "dormancyCycles": 52.5,
            "activeCycles": 69.1
          },
          {
            "id": "molten_iron",
            "x": 45,
            "y": 94,
            "emitRate": 10340,
            "avgEmitRate": 336,
            "idleTime": 741,
            "eruptionTime": 40,
            "dormancyCycles": 19.2,
            "activeCycles": 32.3
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
        "biomePaths": "BoggyMarsh:64,45 64,25 48,31 42,27 34,35 21,31 16,36 0,33 0,55 7,55 17,44 29,52 36,47 46,49 51,44;64,79 64,61 49,61 46,65 35,66 30,79 31,80 46,83 50,78\nToxicJungle:64,61 64,45 51,44 46,49 36,47 29,52 17,44 7,55 0,55 0,76 15,76 30,79 35,66 46,65 49,61\nMagmaCore:64,96 64,79 50,78 46,83 31,80 30,79 15,76 0,76 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 33,
            "y": 42
          },
          {
            "id": "GravitasPedestal",
            "x": 19,
            "y": 42
          },
          {
            "id": "SapTree",
            "x": 26,
            "y": 42
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 22,
            "y": 51,
            "emitRate": 7426,
            "avgEmitRate": 352,
            "idleTime": 641,
            "eruptionTime": 45,
            "dormancyCycles": 28.9,
            "activeCycles": 72.7
          },
          {
            "id": "molten_tungsten",
            "x": 22,
            "y": 91,
            "emitRate": 7417,
            "avgEmitRate": 341,
            "idleTime": 707,
            "eruptionTime": 51,
            "dormancyCycles": 43.8,
            "activeCycles": 92.0
          },
          {
            "id": "molten_tungsten",
            "x": 9,
            "y": 91,
            "emitRate": 8184,
            "avgEmitRate": 263,
            "idleTime": 745,
            "eruptionTime": 51,
            "dormancyCycles": 79.5,
            "activeCycles": 79.0
          },
          {
            "id": "chlorine_gas",
            "x": 23,
            "y": 71,
            "emitRate": 354,
            "avgEmitRate": 102,
            "idleTime": 314,
            "eruptionTime": 306,
            "dormancyCycles": 39.4,
            "activeCycles": 55.7
          },
          {
            "id": "slimy_po2",
            "x": 31,
            "y": 73,
            "emitRate": 329,
            "avgEmitRate": 95,
            "idleTime": 240,
            "eruptionTime": 291,
            "dormancyCycles": 56.5,
            "activeCycles": 63.3
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
        "biomePaths": "MagmaCore:64,79 64,64 50,63 46,50 49,46 64,45 64,29 45,30 44,32 32,34 24,27 16,31 0,23 0,45 13,44 18,49 29,48 33,51 32,64 22,70 14,62 0,64 0,78 15,80 21,75 32,83 44,77 48,81\nOilField:33,51 29,48 18,49 13,44 0,45 0,64 14,62 22,70 32,64;50,63 46,50 49,46 64,45 64,64\nFrozenWastes:64,96 64,79 48,81 44,77 32,83 21,75 15,80 0,78 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 14,
            "y": 53
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 49,
            "y": 50,
            "emitRate": 268101,
            "avgEmitRate": 1296,
            "idleTime": 9066,
            "eruptionTime": 70,
            "dormancyCycles": 46.4,
            "activeCycles": 79.4
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
        "biomePaths": "Moo:96,62 96,45 78,45 77,32 62,29 56,39 46,40 39,34 33,35 20,24 9,35 0,35 0,59 9,58 20,67 33,59 39,60 42,59 57,61 59,64 77,65 79,62\nFrozenWastes:96,80 96,62 79,62 77,65 59,64 57,61 42,59 39,60 33,59 20,67 9,58 0,59 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 68,
            "y": 41
          },
          {
            "id": "GravitasPedestal",
            "x": 61,
            "y": 41
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 20,
            "y": 37,
            "emitRate": 310,
            "avgEmitRate": 91,
            "idleTime": 168,
            "eruptionTime": 185,
            "dormancyCycles": 60.5,
            "activeCycles": 76.8
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
        "biomePaths": "Barren:80,141 80,37 65,39 59,33 47,36 37,27 25,38 20,37 10,47 0,47 0,138 15,141 20,137 31,143 42,137 42,135 48,132 62,136 64,140;80,174 80,156 66,158 60,152 50,153 48,156 34,159 31,156 17,158 15,157 0,158 0,174\nSwamp:80,156 80,141 64,140 62,136 48,132 42,135 42,137 31,143 20,137 15,141 0,138 0,158 15,157 17,158 31,156 34,159 48,156 50,153 60,152 66,158",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 19,
            "y": 155
          },
          {
            "id": "GravitasPedestal",
            "x": 21,
            "y": 155
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "x": 41,
            "y": 91,
            "emitRate": 10360,
            "avgEmitRate": 3709,
            "idleTime": 343,
            "eruptionTime": 313,
            "dormancyCycles": 22.7,
            "activeCycles": 68.2
          },
          {
            "id": "filthy_water",
            "x": 23,
            "y": 82,
            "emitRate": 14293,
            "avgEmitRate": 3627,
            "idleTime": 132,
            "eruptionTime": 78,
            "dormancyCycles": 31.9,
            "activeCycles": 69.2
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
        "biomePaths": "Sandstone:67,78 66,62 58,58 56,54 46,51 35,59 41,73 46,74 50,79 65,79\nBarren:41,73 35,59 31,58 19,65 9,56 0,57 0,77 16,77 18,76 32,80;96,77 96,42 77,45 77,58 66,62 67,78 80,79 83,77\nFrozenWastes:96,96 96,77 83,77 80,79 67,78 65,79 50,79 46,74 41,73 32,80 18,76 16,77 0,77 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 72,
            "y": 70
          },
          {
            "id": "GravitasPedestal",
            "x": 76,
            "y": 70
          },
          {
            "id": "GeneShuffler",
            "x": 74,
            "y": 64
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 42,
            "y": 81,
            "emitRate": 5790,
            "avgEmitRate": 1908,
            "idleTime": 226,
            "eruptionTime": 234,
            "dormancyCycles": 39.6,
            "activeCycles": 72.8
          },
          {
            "id": "steam",
            "x": 57,
            "y": 84,
            "emitRate": 3526,
            "avgEmitRate": 1306,
            "idleTime": 227,
            "eruptionTime": 446,
            "dormancyCycles": 69.6,
            "activeCycles": 88.3
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
        "q": -2,
        "r": -1
      },
      {
        "id": "TundraMoonlet",
        "q": -1,
        "r": 5
      },
      {
        "id": "MarshyMoonlet",
        "q": 5,
        "r": 1
      },
      {
        "id": "NiobiumMoonlet",
        "q": 3,
        "r": -5
      },
      {
        "id": "MooMoonlet",
        "q": 1,
        "r": -7
      },
      {
        "id": "WaterMoonlet",
        "q": -6,
        "r": 4
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 8,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": 1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_DLC2CeresOreField",
        "q": 3,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -6,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 6,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 6,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 0,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 1,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 2,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -6,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -5,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 7,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 7,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 6,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -4,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -10,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 8,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -11,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -11,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 4,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 3,
        "r": 4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": -3,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 10,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 0,
        "r": -4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 11,
        "r": -2
      }
    ]
  },
  {
    "coordinate": "V-CERS-C-1043692229-0-0-0",
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
          "CrashedSatellites",
          "GlaciersLarge",
          "GeoDormant"
        ],
        "biomePaths": "IceCaves:194,145 190,131 173,127 171,104 163,99 159,100 142,87 129,92 118,84 99,91 88,74 76,74 66,90 55,91 48,102 54,118 43,131 53,148 41,162 53,178 64,178 73,194 88,194 96,208 113,207 120,218 134,218 145,201 152,201 167,187 155,169 171,155 184,157\nFrozenWastes:53,148 43,131 29,130 24,135 28,162 41,162;48,102 29,102 23,83 29,74 45,74 55,91;120,218 113,207 96,208 88,194 73,194 64,178 53,178 41,193 52,208 64,208 75,223 88,222 98,236 111,236;190,100 171,104 163,99 159,100 142,87 129,92 118,84 99,91 88,74 98,59 118,66 128,59 146,70 157,65 171,75 183,73 196,87;226,187 212,170 217,158 211,148 221,130 211,116 202,116 190,131 194,145 184,157 190,173 196,175 200,201 212,204\nCarrotQuarry:41,193 29,193 24,188 28,162 41,162 53,178;43,131 29,130 23,109 29,102 48,102 54,118;202,116 190,100 171,104 173,127 190,131;211,229 194,230 184,215 165,221 161,231 144,233 138,246 120,247 111,236 120,218 134,218 145,201 152,201 167,187 155,169 171,155 184,157 190,173 196,175 200,201 212,204 218,216;222,102 211,84 216,75 240,74 240,102;226,187 212,170 217,158 240,157 240,187\nOcean:28,162 24,135 0,135 0,162;28,223 22,215 0,214 0,242 19,242;89,251 77,252 66,238 75,223 88,222 98,236;240,131 240,102 222,102 211,116 221,130;240,217 240,187 226,187 212,204 218,216\nRadioactive:28,162 0,162 0,188 24,188;29,130 23,109 0,110 0,135 24,135;66,238 54,238 43,223 52,208 64,208 75,223;240,157 240,131 221,130 211,148 217,158;219,244 211,229 218,216 240,217 240,243\nSugarWoods:240,74 240,49 217,49 210,59 190,57 186,50 164,45 160,48 136,39 129,45 106,36 96,49 77,44 65,58 55,58 47,47 27,48 22,56 0,56 0,110 23,109 29,102 23,83 29,74 45,74 55,91 66,90 76,74 88,74 98,59 118,66 128,59 146,70 157,65 171,75 183,73 196,87 190,100 202,116 211,116 222,102 211,84 216,75\nMagmaCore:240,299 240,271 219,271 211,258 197,258 187,276 172,275 161,260 148,261 140,275 123,278 112,267 101,268 93,280 75,280 68,270 53,270 42,257 31,257 21,273 0,273 0,300 22,300 29,287 44,286 55,301 67,299 80,311 101,299 107,301 118,295 137,306 152,292 160,293 168,304 187,303 194,287 211,287 219,300\nOilField:28,380 25,354 0,354 0,380;48,316 53,326 38,347 32,347 21,327 29,314 22,300 29,287 44,286 55,301;138,318 137,306 118,295 107,301 101,299 80,311 80,322 96,331 96,350 79,356 80,380 106,380 106,356 124,349 121,328;221,328 212,314 195,316 189,329 205,348 186,362 170,352 159,356 146,349 149,325 162,322 168,304 187,303 194,287 211,287 219,300 240,299 240,329\nRust:52,208 41,193 29,193 24,188 0,188 0,214 22,215 28,223 43,223;187,244 170,245 161,231 165,221 184,215 194,230\nSandstone:29,314 22,300 0,300 0,328 21,327;96,350 96,331 80,322 68,330 71,352 79,356;157,380 159,356 170,352 186,362 187,380;214,355 208,349 205,348 189,329 195,316 212,314 221,328 240,329 240,355\nForest:80,380 79,356 71,352 68,330 80,322 80,311 67,299 55,301 48,316 53,326 38,347 32,347 21,327 0,328 0,354 25,354 28,380;168,304 160,293 152,292 137,306 138,318 121,328 124,349 106,356 106,380 157,380 159,356 146,349 149,325 162,322;240,380 240,355 214,355 208,349 205,348 186,362 187,380",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 110,
            "y": 143
          },
          {
            "id": "WarpConduitSender",
            "x": 182,
            "y": 237
          },
          {
            "id": "WarpConduitReceiver",
            "x": 153,
            "y": 91
          },
          {
            "id": "MassiveHeatSink",
            "x": 42,
            "y": 158
          },
          {
            "id": "MassiveHeatSink",
            "x": 208,
            "y": 164
          },
          {
            "id": "MassiveHeatSink",
            "x": 49,
            "y": 89
          },
          {
            "id": "GravitasPedestal",
            "x": 29,
            "y": 176
          },
          {
            "id": "WarpReceiver",
            "x": 193,
            "y": 73
          },
          {
            "id": "WarpPortal",
            "x": 192,
            "y": 67
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 124,
            "y": 50
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 205,
            "y": 112
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 59,
            "y": 65
          },
          {
            "id": "GeneShuffler",
            "x": 103,
            "y": 212
          }
        ],
        "geysers": [
          {
            "id": "slush_salt_water",
            "x": 218,
            "y": 200,
            "emitRate": 5326,
            "avgEmitRate": 1597,
            "idleTime": 299,
            "eruptionTime": 367,
            "dormancyCycles": 90.0,
            "activeCycles": 107.4
          },
          {
            "id": "OilWell",
            "x": 173,
            "y": 349,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 43,
            "y": 321,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 105,
            "y": 323,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "slush_water",
            "x": 151,
            "y": 347,
            "emitRate": 6397,
            "avgEmitRate": 1375,
            "idleTime": 503,
            "eruptionTime": 277,
            "dormancyCycles": 44.2,
            "activeCycles": 67.7
          },
          {
            "id": "small_volcano",
            "x": 218,
            "y": 117,
            "emitRate": 122129,
            "avgEmitRate": 592,
            "idleTime": 7215,
            "eruptionTime": 57,
            "dormancyCycles": 53.4,
            "activeCycles": 86.1
          },
          {
            "id": "molten_iron",
            "x": 177,
            "y": 123,
            "emitRate": 7598,
            "avgEmitRate": 313,
            "idleTime": 671,
            "eruptionTime": 51,
            "dormancyCycles": 56.5,
            "activeCycles": 80.5
          },
          {
            "id": "steam",
            "x": 78,
            "y": 347,
            "emitRate": 5994,
            "avgEmitRate": 1222,
            "idleTime": 391,
            "eruptionTime": 196,
            "dormancyCycles": 55.1,
            "activeCycles": 86.5
          },
          {
            "id": "molten_aluminum",
            "x": 178,
            "y": 365,
            "emitRate": 9963,
            "avgEmitRate": 338,
            "idleTime": 741,
            "eruptionTime": 43,
            "dormancyCycles": 40.7,
            "activeCycles": 64.6
          },
          {
            "id": "hot_po2",
            "x": 144,
            "y": 211,
            "emitRate": 408,
            "avgEmitRate": 114,
            "idleTime": 391,
            "eruptionTime": 300,
            "dormancyCycles": 54.9,
            "activeCycles": 98.4
          },
          {
            "id": "oil_drip",
            "x": 112,
            "y": 362,
            "emitRate": 310,
            "avgEmitRate": 169,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.3,
            "activeCycles": 0.3
          },
          {
            "id": "hot_co2",
            "x": 15,
            "y": 220,
            "emitRate": 291,
            "avgEmitRate": 103,
            "idleTime": 201,
            "eruptionTime": 297,
            "dormancyCycles": 47.5,
            "activeCycles": 70.2
          },
          {
            "id": "slush_salt_water",
            "x": 64,
            "y": 189,
            "emitRate": 4158,
            "avgEmitRate": 1440,
            "idleTime": 297,
            "eruptionTime": 386,
            "dormancyCycles": 47.6,
            "activeCycles": 75.2
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
          "BouldersMixed",
          "MagmaVents"
        ],
        "biomePaths": "Swamp:124,116 116,105 107,105 97,93 101,82 92,69 78,72 67,63 64,63 51,81 52,84 39,99 41,106 51,114 51,122 61,134 73,133 79,139 95,136 100,127 117,130\nBoggyMarsh:95,60 90,48 76,46 73,41 53,37 48,43 27,35 19,45 23,55 38,60 47,52 64,63 67,63 78,72 92,69;136,69 120,71 113,59 119,47 135,48 140,62;143,107 136,93 142,84 160,84 160,107\nToxicJungle:23,55 19,45 0,43 0,69 14,69;41,106 39,99 23,91 18,94 18,117 22,120;119,47 115,40 98,37 90,48 95,60 113,59;160,62 160,41 141,41 135,48 140,62\nWasteland:64,63 47,52 38,60 23,55 14,69 0,69 0,145 10,145 25,127 35,134 51,122 51,114 41,106 22,120 18,117 18,94 23,91 39,99 52,84 51,81;91,162 77,154 67,159 56,153 42,167 27,153 36,139 54,147 61,134 73,133 79,139 95,136 102,152;141,152 138,140 121,137 113,153 116,157 138,157;137,116 124,116 116,105 107,105 97,93 101,82 92,69 95,60 113,59 120,71 136,69 142,84 136,93 143,107\nFrozenWastes:142,84 136,69 140,62 160,62 160,84;160,131 160,107 143,107 137,116 124,116 117,130 121,137 138,140 144,131\nBarren:113,153 102,152 95,136 100,127 117,130 121,137\nMagmaCore:160,176 160,131 144,131 138,140 141,152 138,157 116,157 113,153 102,152 91,162 77,154 67,159 56,153 42,167 27,153 36,139 54,147 61,134 51,122 35,134 25,127 10,145 0,145 0,176",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 145,
            "y": 119
          },
          {
            "id": "WarpConduitSender",
            "x": 113,
            "y": 115
          },
          {
            "id": "WarpConduitReceiver",
            "x": 48,
            "y": 108
          },
          {
            "id": "WarpReceiver",
            "x": 85,
            "y": 97
          },
          {
            "id": "WarpPortal",
            "x": 63,
            "y": 97
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 19,
            "y": 94,
            "emitRate": 5504,
            "avgEmitRate": 1342,
            "idleTime": 353,
            "eruptionTime": 260,
            "dormancyCycles": 45.3,
            "activeCycles": 61.5
          },
          {
            "id": "methane",
            "x": 23,
            "y": 113,
            "emitRate": 297,
            "avgEmitRate": 104,
            "idleTime": 185,
            "eruptionTime": 250,
            "dormancyCycles": 30.0,
            "activeCycles": 46.2
          },
          {
            "id": "steam",
            "x": 77,
            "y": 64,
            "emitRate": 4030,
            "avgEmitRate": 1169,
            "idleTime": 234,
            "eruptionTime": 314,
            "dormancyCycles": 34.5,
            "activeCycles": 35.4
          },
          {
            "id": "slush_salt_water",
            "x": 32,
            "y": 63,
            "emitRate": 2807,
            "avgEmitRate": 1280,
            "idleTime": 101,
            "eruptionTime": 480,
            "dormancyCycles": 60.4,
            "activeCycles": 74.3
          },
          {
            "id": "molten_aluminum",
            "x": 42,
            "y": 71,
            "emitRate": 8511,
            "avgEmitRate": 247,
            "idleTime": 582,
            "eruptionTime": 34,
            "dormancyCycles": 39.0,
            "activeCycles": 43.0
          },
          {
            "id": "molten_copper",
            "x": 66,
            "y": 77,
            "emitRate": 6242,
            "avgEmitRate": 289,
            "idleTime": 680,
            "eruptionTime": 62,
            "dormancyCycles": 72.2,
            "activeCycles": 91.1
          },
          {
            "id": "molten_iron",
            "x": 107,
            "y": 135,
            "emitRate": 12561,
            "avgEmitRate": 324,
            "idleTime": 712,
            "eruptionTime": 32,
            "dormancyCycles": 43.2,
            "activeCycles": 66.3
          },
          {
            "id": "liquid_co2",
            "x": 41,
            "y": 92,
            "emitRate": 1147,
            "avgEmitRate": 145,
            "idleTime": 482,
            "eruptionTime": 146,
            "dormancyCycles": 53.0,
            "activeCycles": 63.4
          },
          {
            "id": "liquid_co2",
            "x": 142,
            "y": 69,
            "emitRate": 457,
            "avgEmitRate": 137,
            "idleTime": 396,
            "eruptionTime": 490,
            "dormancyCycles": 70.0,
            "activeCycles": 82.4
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
        "biomePaths": "FrozenWastes:64,128 64,27 49,32 41,26 31,36 21,35 18,31 0,31 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 47,
            "y": 40
          },
          {
            "id": "GravitasPedestal",
            "x": 27,
            "y": 88
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 18,
            "y": 67
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 33,
            "y": 48
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 41,
            "y": 62
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 42,
            "y": 111,
            "emitRate": 7199,
            "avgEmitRate": 282,
            "idleTime": 732,
            "eruptionTime": 48,
            "dormancyCycles": 53.2,
            "activeCycles": 92.9
          },
          {
            "id": "molten_iron",
            "x": 53,
            "y": 61,
            "emitRate": 11962,
            "avgEmitRate": 348,
            "idleTime": 721,
            "eruptionTime": 39,
            "dormancyCycles": 63.7,
            "activeCycles": 84.4
          },
          {
            "id": "molten_iron",
            "x": 37,
            "y": 90,
            "emitRate": 7310,
            "avgEmitRate": 355,
            "idleTime": 662,
            "eruptionTime": 48,
            "dormancyCycles": 29.0,
            "activeCycles": 72.6
          },
          {
            "id": "molten_iron",
            "x": 48,
            "y": 73,
            "emitRate": 8037,
            "avgEmitRate": 271,
            "idleTime": 721,
            "eruptionTime": 42,
            "dormancyCycles": 38.1,
            "activeCycles": 60.9
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
          "RadioactiveCrust"
        ],
        "biomePaths": "BoggyMarsh:64,52 64,37 48,34 44,36 33,34 25,40 19,40 15,36 0,37 0,75 16,77 24,71 34,78 46,76 49,73 43,56 45,53\nToxicJungle:49,73 43,56 45,53 64,52 64,72\nMagmaCore:64,96 64,72 49,73 46,76 34,78 24,71 16,77 0,75 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 44,
            "y": 46
          },
          {
            "id": "GravitasPedestal",
            "x": 30,
            "y": 46
          },
          {
            "id": "SapTree",
            "x": 37,
            "y": 46
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 37,
            "y": 87,
            "emitRate": 8427,
            "avgEmitRate": 285,
            "idleTime": 812,
            "eruptionTime": 48,
            "dormancyCycles": 56.0,
            "activeCycles": 87.5
          },
          {
            "id": "molten_tungsten",
            "x": 29,
            "y": 90,
            "emitRate": 7731,
            "avgEmitRate": 307,
            "idleTime": 749,
            "eruptionTime": 52,
            "dormancyCycles": 45.8,
            "activeCycles": 72.9
          },
          {
            "id": "molten_tungsten",
            "x": 14,
            "y": 87,
            "emitRate": 8745,
            "avgEmitRate": 257,
            "idleTime": 626,
            "eruptionTime": 35,
            "dormancyCycles": 68.6,
            "activeCycles": 84.3
          },
          {
            "id": "methane",
            "x": 8,
            "y": 62,
            "emitRate": 300,
            "avgEmitRate": 101,
            "idleTime": 311,
            "eruptionTime": 348,
            "dormancyCycles": 58.2,
            "activeCycles": 103.0
          },
          {
            "id": "methane",
            "x": 54,
            "y": 63,
            "emitRate": 570,
            "avgEmitRate": 94,
            "idleTime": 521,
            "eruptionTime": 243,
            "dormancyCycles": 60.1,
            "activeCycles": 65.2
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
        "biomePaths": "MagmaCore:33,62 33,51 21,45 13,56 17,64 27,66;64,77 64,35 47,31 42,36 31,31 20,39 16,37 0,39 0,96 32,96 31,81 45,77 48,79\nOilField:33,62 33,51 21,45 13,56 17,64 27,66;64,96 64,77 48,79 45,77 31,81 32,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 32,
            "y": 59
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 17,
            "y": 56,
            "emitRate": 278950,
            "avgEmitRate": 1253,
            "idleTime": 8470,
            "eruptionTime": 62,
            "dormancyCycles": 46.1,
            "activeCycles": 75.0
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
        "biomePaths": "Moo:96,61 96,45 80,44 77,39 69,37 58,44 49,41 46,34 34,30 23,42 18,40 0,43 0,58 16,61 19,60 32,66 41,60 49,64 61,59 65,61 76,58 82,63\nFrozenWastes:96,80 96,61 82,63 76,58 65,61 61,59 49,64 41,60 32,66 19,60 16,61 0,58 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 20,
            "y": 46
          },
          {
            "id": "GravitasPedestal",
            "x": 13,
            "y": 46
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 84,
            "y": 46,
            "emitRate": 401,
            "avgEmitRate": 100,
            "idleTime": 190,
            "eruptionTime": 163,
            "dormancyCycles": 56.2,
            "activeCycles": 65.9
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
        "biomePaths": "Barren:80,132 80,35 68,36 62,44 52,44 47,33 38,32 30,40 19,38 17,40 0,38 0,133 10,133 17,142 27,141 32,147 44,146 48,139 61,138 64,133;80,174 80,153 66,153 61,158 49,157 40,167 29,157 19,162 11,154 0,155 0,174\nSwamp:80,153 80,132 64,133 61,138 48,139 44,146 32,147 27,141 17,142 10,133 0,133 0,155 11,154 19,162 29,157 40,167 49,157 61,158 66,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 45,
            "y": 158
          },
          {
            "id": "GravitasPedestal",
            "x": 47,
            "y": 158
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "x": 39,
            "y": 72,
            "emitRate": 8344,
            "avgEmitRate": 2824,
            "idleTime": 281,
            "eruptionTime": 320,
            "dormancyCycles": 53.2,
            "activeCycles": 92.9
          },
          {
            "id": "slush_water",
            "x": 25,
            "y": 91,
            "emitRate": 5388,
            "avgEmitRate": 1819,
            "idleTime": 357,
            "eruptionTime": 378,
            "dormancyCycles": 48.7,
            "activeCycles": 93.3
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
        "biomePaths": "Barren:39,67 33,61 34,51 29,47 17,50 14,59 0,61 0,76 12,79 19,75 26,80 38,78;85,81 78,73 73,73 65,65 69,54 78,53 82,47 96,47 96,81\nSandstone:67,82 55,82 40,81 38,78 39,67 33,61 34,51 47,47 51,51 63,48 69,54 65,65 73,73\nFrozenWastes:96,96 96,81 85,81 78,73 73,73 67,82 55,82 40,81 38,78 26,80 19,75 12,79 0,76 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 71,
            "y": 72
          },
          {
            "id": "GravitasPedestal",
            "x": 75,
            "y": 72
          },
          {
            "id": "GeneShuffler",
            "x": 73,
            "y": 66
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "x": 32,
            "y": 84,
            "emitRate": 2524,
            "avgEmitRate": 691,
            "idleTime": 205,
            "eruptionTime": 282,
            "dormancyCycles": 68.9,
            "activeCycles": 61.7
          },
          {
            "id": "steam",
            "x": 18,
            "y": 82,
            "emitRate": 5580,
            "avgEmitRate": 1601,
            "idleTime": 360,
            "eruptionTime": 316,
            "dormancyCycles": 24.7,
            "activeCycles": 39.2
          }
        ]
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
        "q": 0,
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
        "r": 3
      },
      {
        "id": "NiobiumMoonlet",
        "q": 5,
        "r": -5
      },
      {
        "id": "MooMoonlet",
        "q": -3,
        "r": 7
      },
      {
        "id": "WaterMoonlet",
        "q": 7,
        "r": -1
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -5,
        "r": -2
      },
      {
        "id": "TemporalTear",
        "q": 7,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_DLC2CeresOreField",
        "q": -1,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 1,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 10,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 10,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 5,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 5,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 6,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -3,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -7,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -6,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 0,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 0,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 5,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -11,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -9,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 0,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 0,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -3,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -8,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 11,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 10,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": -3,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 10,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -6,
        "r": 10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 5,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -11,
        "r": 8
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -10,
        "r": 11
      }
    ]
  },
  {
    "coordinate": "V-OCAN-C-1381507755-0-0-0",
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
          "GlaciersLarge",
          "DeepOil",
          "GeoDormant",
          "Volcanoes"
        ],
        "biomePaths": "Sandstone:172,167 168,156 141,161 134,153 137,131 132,127 113,135 100,127 90,132 90,146 72,158 76,168 69,187 74,194 96,186 109,197 108,215 119,221 132,213 132,196 135,193 166,195 166,194 165,180\nMagmaCore:92,298 92,287 75,280 64,293 72,305;147,301 144,284 134,280 121,290 121,296 140,307;240,278 240,252 220,255 223,275;240,380 240,345 218,345 210,352 189,346 181,351 163,343 151,354 134,346 121,354 107,346 91,353 80,345 60,352 53,347 30,354 23,345 0,345 0,380\nFrozenWastes:34,327 26,311 0,309 0,345 23,345;37,211 34,204 0,197 0,234 25,233;176,263 167,263 150,244 155,228 165,223 178,229 185,252;240,252 240,189 206,187 200,197 204,213 212,219 212,250 220,255\nSwamp:37,291 30,278 0,277 0,309 26,311;74,194 69,187 42,186 35,169 0,178 0,197 34,204 37,211 62,220 72,214;101,103 83,93 65,108 66,119 90,132 100,127;80,334 70,324 72,305 92,298 105,308 106,327;148,93 148,76 134,64 115,75 116,95 130,102;166,195 135,193 132,196 132,213 155,228 165,223;213,311 204,294 191,292 175,311 177,320 191,330 206,325;240,189 240,157 208,159 197,137 173,140 168,156 172,167 201,170 206,187\nOcean:34,128 27,107 26,106 0,110 0,140 23,141;75,280 71,256 59,248 62,220 37,211 25,233 0,234 0,277 30,278 37,291 26,311 34,327 52,335 70,324 72,305 64,293;116,95 115,75 98,65 81,80 83,93 101,103;140,307 121,296 105,308 106,327 107,329 134,331 138,327;206,187 201,170 172,167 165,180 166,194 200,197;223,275 220,255 212,250 185,252 176,263 167,263 150,244 155,228 132,213 119,221 108,215 90,223 90,247 104,255 121,249 127,251 134,280 144,284 147,301 175,311 191,292 204,294;240,157 240,81 208,77 197,99 182,95 164,104 148,93 130,102 132,127 137,131 134,153 141,161 168,156 173,140 197,137 208,159;218,345 206,325 213,311 240,310 240,345\nToxicJungle:76,168 72,158 60,153 54,131 34,128 23,141 0,140 0,178 35,169 42,186 69,187;83,93 81,80 62,70 47,83 48,95 65,108;71,256 59,248 62,220 72,214 90,223 90,247;163,337 138,327 140,307 147,301 175,311 177,320;182,95 182,75 172,65 148,76 148,93 164,104;204,213 200,197 166,194 166,195 165,223 178,229\nRadioactive:48,95 47,83 32,78 21,90 0,88 0,110 26,106 27,107;121,296 121,290 102,281 92,287 92,298 105,308;208,77 205,73 182,75 182,95 197,99\nBarren:240,81 240,46 208,54 196,38 172,55 154,38 134,53 116,38 97,55 78,42 61,57 38,44 27,58 0,54 0,88 21,90 32,78 47,83 62,70 81,80 98,65 115,75 134,64 148,76 172,65 182,75 205,73 208,77\nOilField:218,345 206,325 191,330 177,320 163,337 138,327 134,331 107,329 106,327 80,334 70,324 52,335 34,327 23,345 30,354 53,347 60,352 80,345 91,353 107,346 121,354 134,346 151,354 163,343 181,351 189,346 210,352\nBoggyMarsh:90,146 90,132 66,119 65,108 48,95 27,107 34,128 54,131 60,153 72,158;108,215 90,223 72,214 74,194 96,186 109,197;113,135 100,127 101,103 116,95 130,102 132,127;134,280 127,251 121,249 104,255 90,247 71,256 75,280 92,287 102,281 121,290;212,250 212,219 204,213 178,229 185,252;240,310 240,278 223,275 204,294 213,311",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 118,
            "y": 176
          },
          {
            "id": "MassiveHeatSink",
            "x": 20,
            "y": 318
          },
          {
            "id": "MassiveHeatSink",
            "x": 214,
            "y": 215
          },
          {
            "id": "MassiveHeatSink",
            "x": 167,
            "y": 244
          },
          {
            "id": "WarpConduitSender",
            "x": 154,
            "y": 266
          },
          {
            "id": "WarpConduitReceiver",
            "x": 38,
            "y": 281
          },
          {
            "id": "GravitasPedestal",
            "x": 36,
            "y": 90
          },
          {
            "id": "WarpReceiver",
            "x": 176,
            "y": 112
          },
          {
            "id": "WarpPortal",
            "x": 175,
            "y": 106
          },
          {
            "id": "GeneShuffler",
            "x": 177,
            "y": 201
          },
          {
            "id": "GeneShuffler",
            "x": 80,
            "y": 123
          },
          {
            "id": "GeneShuffler",
            "x": 118,
            "y": 258
          },
          {
            "id": "GeneShuffler",
            "x": 33,
            "y": 208
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 32,
            "y": 156,
            "emitRate": 6141,
            "avgEmitRate": 1366,
            "idleTime": 423,
            "eruptionTime": 232,
            "dormancyCycles": 47.6,
            "activeCycles": 80.6
          },
          {
            "id": "chlorine_gas",
            "x": 169,
            "y": 320,
            "emitRate": 505,
            "avgEmitRate": 127,
            "idleTime": 400,
            "eruptionTime": 288,
            "dormancyCycles": 58.3,
            "activeCycles": 88.1
          },
          {
            "id": "steam",
            "x": 118,
            "y": 105,
            "emitRate": 4177,
            "avgEmitRate": 1574,
            "idleTime": 286,
            "eruptionTime": 467,
            "dormancyCycles": 57.6,
            "activeCycles": 89.2
          },
          {
            "id": "methane",
            "x": 208,
            "y": 297,
            "emitRate": 329,
            "avgEmitRate": 102,
            "idleTime": 394,
            "eruptionTime": 421,
            "dormancyCycles": 24.1,
            "activeCycles": 36.3
          },
          {
            "id": "salt_water",
            "x": 143,
            "y": 135,
            "emitRate": 8990,
            "avgEmitRate": 2382,
            "idleTime": 298,
            "eruptionTime": 258,
            "dormancyCycles": 60.3,
            "activeCycles": 80.5
          },
          {
            "id": "OilWell",
            "x": 148,
            "y": 338,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 53,
            "y": 339,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 194,
            "y": 338,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "big_volcano",
            "x": 55,
            "y": 301,
            "emitRate": 237431,
            "avgEmitRate": 1191,
            "idleTime": 9786,
            "eruptionTime": 80,
            "dormancyCycles": 48.1,
            "activeCycles": 77.4
          },
          {
            "id": "hot_water",
            "x": 97,
            "y": 265,
            "emitRate": 9607,
            "avgEmitRate": 2874,
            "idleTime": 376,
            "eruptionTime": 316,
            "dormancyCycles": 33.5,
            "activeCycles": 63.5
          },
          {
            "id": "chlorine_gas",
            "x": 189,
            "y": 88,
            "emitRate": 388,
            "avgEmitRate": 103,
            "idleTime": 354,
            "eruptionTime": 308,
            "dormancyCycles": 55.8,
            "activeCycles": 74.0
          },
          {
            "id": "slush_salt_water",
            "x": 63,
            "y": 181,
            "emitRate": 5266,
            "avgEmitRate": 1368,
            "idleTime": 317,
            "eruptionTime": 250,
            "dormancyCycles": 62.2,
            "activeCycles": 88.9
          },
          {
            "id": "hot_water",
            "x": 67,
            "y": 101,
            "emitRate": 22852,
            "avgEmitRate": 2545,
            "idleTime": 282,
            "eruptionTime": 67,
            "dormancyCycles": 60.7,
            "activeCycles": 83.1
          },
          {
            "id": "hot_hydrogen",
            "x": 69,
            "y": 330,
            "emitRate": 386,
            "avgEmitRate": 115,
            "idleTime": 317,
            "eruptionTime": 265,
            "dormancyCycles": 38.1,
            "activeCycles": 73.3
          },
          {
            "id": "small_volcano",
            "x": 168,
            "y": 303,
            "emitRate": 131028,
            "avgEmitRate": 611,
            "idleTime": 8776,
            "eruptionTime": 65,
            "dormancyCycles": 37.3,
            "activeCycles": 64.7
          },
          {
            "id": "filthy_water",
            "x": 159,
            "y": 279,
            "emitRate": 7130,
            "avgEmitRate": 2749,
            "idleTime": 264,
            "eruptionTime": 472,
            "dormancyCycles": 47.2,
            "activeCycles": 71.2
          },
          {
            "id": "hot_steam",
            "x": 184,
            "y": 264,
            "emitRate": 1741,
            "avgEmitRate": 654,
            "idleTime": 238,
            "eruptionTime": 383,
            "dormancyCycles": 66.4,
            "activeCycles": 103.5
          },
          {
            "id": "big_volcano",
            "x": 78,
            "y": 293,
            "emitRate": 269828,
            "avgEmitRate": 1244,
            "idleTime": 10345,
            "eruptionTime": 78,
            "dormancyCycles": 35.6,
            "activeCycles": 57.1
          },
          {
            "id": "big_volcano",
            "x": 134,
            "y": 294,
            "emitRate": 220361,
            "avgEmitRate": 1124,
            "idleTime": 7760,
            "eruptionTime": 67,
            "dormancyCycles": 63.2,
            "activeCycles": 92.3
          },
          {
            "id": "OilWell",
            "x": 43,
            "y": 338,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 39,
            "y": 344,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 58,
            "y": 347,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 59,
            "y": 350,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 155,
            "y": 347,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 138,
            "y": 346,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 167,
            "y": 339,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 179,
            "y": 336,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 201,
            "y": 332,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 210,
            "y": 346,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
          "MetalCaves",
          "Volcanoes"
        ],
        "biomePaths": "Forest:128,113 118,97 122,89 116,79 107,77 99,58 84,62 71,50 70,50 57,66 46,65 39,83 42,89 38,95 40,109 58,112 59,131 78,131 83,127 98,129 105,121 117,124\nWasteland:37,111 24,106 24,96 21,90 0,91 0,109 13,113 13,125 21,131 35,129;46,65 43,60 46,44 39,37 23,40 19,47 0,48 0,70 19,69 25,82 39,83;101,55 97,42 85,37 71,50 84,62 99,58;146,101 137,113 128,113 118,97 122,89 137,88 144,75 137,65 127,64 119,53 124,42 137,39 146,50 160,50 160,101\nRust:25,82 19,69 0,70 0,91 21,90;39,133 35,129 37,111 40,109 58,112 59,131;57,66 46,65 43,60 46,44 61,41 70,50;144,75 137,65 127,64 119,53 124,42 112,27 97,42 101,55 99,58 107,77 116,79 122,89 137,88;160,125 160,101 146,101 137,113 144,126\nMagmaCore:13,125 13,113 0,109 0,127;42,89 39,83 25,82 21,90 24,96 24,106 37,111 40,109 38,95;118,132 117,124 105,121 98,129 101,135\nRadioactive:160,176 160,125 144,126 137,113 128,113 117,124 118,132 101,135 98,129 83,127 78,131 59,131 39,133 35,129 21,131 13,125 0,127 0,153 16,152 21,156 20,176 44,176 44,157 60,152 66,157 67,176 88,176 88,154 98,151 110,159 120,154 123,138 138,136 148,152 136,163 137,176\nFrozenWastes:21,156 16,152 0,153 0,176 20,176;67,176 66,157 60,152 44,157 44,176;148,152 138,136 123,138 120,154 110,159 98,151 88,154 88,176 137,176 136,163",
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "x": 52,
            "y": 104
          },
          {
            "id": "WarpConduitSender",
            "x": 103,
            "y": 108
          },
          {
            "id": "WarpReceiver",
            "x": 88,
            "y": 97
          },
          {
            "id": "WarpPortal",
            "x": 66,
            "y": 97
          },
          {
            "id": "GeneShuffler",
            "x": 50,
            "y": 114
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 86,
            "y": 130,
            "emitRate": 506,
            "avgEmitRate": 191,
            "idleTime": 245,
            "eruptionTime": 267,
            "dormancyCycles": 38.9,
            "activeCycles": 102.9
          },
          {
            "id": "liquid_co2",
            "x": 84,
            "y": 167,
            "emitRate": 538,
            "avgEmitRate": 141,
            "idleTime": 408,
            "eruptionTime": 333,
            "dormancyCycles": 49.6,
            "activeCycles": 69.3
          },
          {
            "id": "molten_cobalt",
            "x": 124,
            "y": 96,
            "emitRate": 6525,
            "avgEmitRate": 289,
            "idleTime": 703,
            "eruptionTime": 56,
            "dormancyCycles": 35.8,
            "activeCycles": 53.3
          },
          {
            "id": "molten_iron",
            "x": 138,
            "y": 81,
            "emitRate": 10466,
            "avgEmitRate": 305,
            "idleTime": 850,
            "eruptionTime": 43,
            "dormancyCycles": 42.9,
            "activeCycles": 67.3
          },
          {
            "id": "steam",
            "x": 40,
            "y": 129,
            "emitRate": 6269,
            "avgEmitRate": 1448,
            "idleTime": 231,
            "eruptionTime": 136,
            "dormancyCycles": 35.3,
            "activeCycles": 58.1
          },
          {
            "id": "slush_salt_water",
            "x": 55,
            "y": 74,
            "emitRate": 8612,
            "avgEmitRate": 1521,
            "idleTime": 440,
            "eruptionTime": 199,
            "dormancyCycles": 35.7,
            "activeCycles": 46.7
          },
          {
            "id": "slimy_po2",
            "x": 26,
            "y": 166,
            "emitRate": 361,
            "avgEmitRate": 110,
            "idleTime": 206,
            "eruptionTime": 201,
            "dormancyCycles": 40.5,
            "activeCycles": 65.7
          },
          {
            "id": "liquid_co2",
            "x": 147,
            "y": 129,
            "emitRate": 339,
            "avgEmitRate": 159,
            "idleTime": 201,
            "eruptionTime": 386,
            "dormancyCycles": 51.2,
            "activeCycles": 128.9
          },
          {
            "id": "big_volcano",
            "x": 107,
            "y": 129,
            "emitRate": 212455,
            "avgEmitRate": 1262,
            "idleTime": 9404,
            "eruptionTime": 83,
            "dormancyCycles": 38.8,
            "activeCycles": 81.5
          },
          {
            "id": "big_volcano",
            "x": 31,
            "y": 90,
            "emitRate": 340375,
            "avgEmitRate": 1242,
            "idleTime": 9880,
            "eruptionTime": 65,
            "dormancyCycles": 56.5,
            "activeCycles": 70.6
          },
          {
            "id": "big_volcano",
            "x": 32,
            "y": 103,
            "emitRate": 261534,
            "avgEmitRate": 1324,
            "idleTime": 8623,
            "eruptionTime": 68,
            "dormancyCycles": 64.8,
            "activeCycles": 117.2
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
          "LushCore"
        ],
        "biomePaths": "FrozenWastes:64,112 64,42 50,41 46,34 35,33 28,41 19,40 15,35 0,35 0,110 14,111 20,104 29,105 33,110 46,110 47,112\nForest:64,128 64,112 47,112 46,110 33,110 29,105 20,104 14,111 0,110 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 32,
            "y": 55
          },
          {
            "id": "GravitasPedestal",
            "x": 24,
            "y": 113
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 21,
            "y": 89,
            "emitRate": 6570,
            "avgEmitRate": 382,
            "idleTime": 699,
            "eruptionTime": 68,
            "dormancyCycles": 52.8,
            "activeCycles": 102.4
          },
          {
            "id": "molten_iron",
            "x": 12,
            "y": 99,
            "emitRate": 6145,
            "avgEmitRate": 225,
            "idleTime": 814,
            "eruptionTime": 56,
            "dormancyCycles": 64.0,
            "activeCycles": 84.5
          },
          {
            "id": "molten_iron",
            "x": 40,
            "y": 109,
            "emitRate": 9427,
            "avgEmitRate": 289,
            "idleTime": 654,
            "eruptionTime": 36,
            "dormancyCycles": 55.7,
            "activeCycles": 79.4
          },
          {
            "id": "molten_iron",
            "x": 26,
            "y": 101,
            "emitRate": 11075,
            "avgEmitRate": 298,
            "idleTime": 723,
            "eruptionTime": 32,
            "dormancyCycles": 43.1,
            "activeCycles": 72.8
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
        "biomePaths": "BoggyMarsh:64,55 64,34 48,34 44,40 28,36 24,38 17,37 1,50 0,50 0,75 14,74 18,60 26,56 31,58 36,68 47,70 54,56\nToxicJungle:30,78 20,79 14,74 18,60 26,56 31,58 36,68;64,79 64,55 54,56 47,70 52,77\nMagmaCore:64,96 64,79 52,77 47,70 36,68 30,78 20,79 14,74 0,75 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 40,
            "y": 49
          },
          {
            "id": "GravitasPedestal",
            "x": 26,
            "y": 49
          },
          {
            "id": "SapTree",
            "x": 33,
            "y": 49
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 21,
            "y": 72,
            "emitRate": 7337,
            "avgEmitRate": 258,
            "idleTime": 665,
            "eruptionTime": 39,
            "dormancyCycles": 42.5,
            "activeCycles": 76.2
          },
          {
            "id": "molten_tungsten",
            "x": 15,
            "y": 89,
            "emitRate": 7229,
            "avgEmitRate": 222,
            "idleTime": 726,
            "eruptionTime": 40,
            "dormancyCycles": 51.7,
            "activeCycles": 73.2
          },
          {
            "id": "molten_tungsten",
            "x": 30,
            "y": 88,
            "emitRate": 8398,
            "avgEmitRate": 299,
            "idleTime": 644,
            "eruptionTime": 39,
            "dormancyCycles": 62.8,
            "activeCycles": 100.9
          },
          {
            "id": "hot_co2",
            "x": 56,
            "y": 67,
            "emitRate": 438,
            "avgEmitRate": 130,
            "idleTime": 443,
            "eruptionTime": 368,
            "dormancyCycles": 59.2,
            "activeCycles": 112.3
          },
          {
            "id": "hot_co2",
            "x": 48,
            "y": 60,
            "emitRate": 319,
            "avgEmitRate": 100,
            "idleTime": 299,
            "eruptionTime": 345,
            "dormancyCycles": 58.8,
            "activeCycles": 82.8
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
        "biomePaths": "MagmaCore:54,57 43,43 32,51 33,63 45,67;64,79 64,37 48,36 44,39 32,30 21,35 16,31 0,34 0,46 17,50 16,64 0,69 0,96 42,96 42,84 48,76\nOilField:17,50 0,46 0,69 16,64;54,57 43,43 32,51 33,63 45,67;64,96 64,79 48,76 42,84 42,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 38,
            "y": 60
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 44,
            "y": 87,
            "emitRate": 304872,
            "avgEmitRate": 1279,
            "idleTime": 9469,
            "eruptionTime": 67,
            "dormancyCycles": 48.8,
            "activeCycles": 73.1
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
        "biomePaths": "Moo:96,64 96,32 84,31 78,37 67,36 66,35 49,33 49,31 33,27 29,31 17,29 10,39 0,39 0,59 14,60 16,63 29,65 34,61 47,63 48,65 63,67 69,58 76,58 81,65\nFrozenWastes:96,80 96,64 81,65 76,58 69,58 63,67 48,65 47,63 34,61 29,65 16,63 14,60 0,59 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 39,
            "y": 38
          },
          {
            "id": "GravitasPedestal",
            "x": 32,
            "y": 38
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 82,
            "y": 42,
            "emitRate": 319,
            "avgEmitRate": 96,
            "idleTime": 269,
            "eruptionTime": 249,
            "dormancyCycles": 53.2,
            "activeCycles": 90.0
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
        "biomePaths": "Barren:80,131 80,28 64,32 57,26 43,38 36,33 21,39 18,37 0,39 0,144 16,144 19,139 32,139 35,143 49,143 52,141 63,141 70,132;80,174 80,154 70,153 61,161 51,157 41,163 32,156 21,160 19,158 0,162 0,174\nSwamp:80,154 80,131 70,132 63,141 52,141 49,143 35,143 32,139 19,139 16,144 0,144 0,162 19,158 21,160 32,156 41,163 51,157 61,161 70,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 42,
            "y": 160
          },
          {
            "id": "GravitasPedestal",
            "x": 44,
            "y": 160
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "x": 38,
            "y": 124,
            "emitRate": 12434,
            "avgEmitRate": 3155,
            "idleTime": 364,
            "eruptionTime": 269,
            "dormancyCycles": 45.8,
            "activeCycles": 67.9
          },
          {
            "id": "filthy_water",
            "x": 22,
            "y": 66,
            "emitRate": 9874,
            "avgEmitRate": 3083,
            "idleTime": 383,
            "eruptionTime": 427,
            "dormancyCycles": 45.2,
            "activeCycles": 65.7
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
        "biomePaths": "Barren:38,66 30,55 20,55 15,64 0,64 0,83 19,80 21,76 36,73;96,80 96,45 81,44 74,54 69,54 58,64 61,75 75,77 77,79\nSandstone:56,81 40,78 36,73 38,66 50,60 58,64 61,75\nFrozenWastes:96,96 96,80 77,79 75,77 61,75 56,81 40,78 36,73 21,76 19,80 0,83 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 69,
            "y": 66
          },
          {
            "id": "GravitasPedestal",
            "x": 73,
            "y": 66
          },
          {
            "id": "GeneShuffler",
            "x": 71,
            "y": 60
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "x": 30,
            "y": 80,
            "emitRate": 1964,
            "avgEmitRate": 730,
            "idleTime": 228,
            "eruptionTime": 353,
            "dormancyCycles": 61.3,
            "activeCycles": 96.2
          },
          {
            "id": "steam",
            "x": 63,
            "y": 81,
            "emitRate": 4926,
            "avgEmitRate": 982,
            "idleTime": 440,
            "eruptionTime": 306,
            "dormancyCycles": 71.7,
            "activeCycles": 67.9
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
        "q": 2,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": -5,
        "r": 5
      },
      {
        "id": "MarshyMoonlet",
        "q": -6,
        "r": 0
      },
      {
        "id": "NiobiumMoonlet",
        "q": -1,
        "r": -5
      },
      {
        "id": "MooMoonlet",
        "q": 4,
        "r": 3
      },
      {
        "id": "WaterMoonlet",
        "q": 6,
        "r": -6
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -3,
        "r": 8
      },
      {
        "id": "TemporalTear",
        "q": 0,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 2,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -10,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -4,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 2,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 1,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 11,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 5,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -1,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -6,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 7,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 10,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -7,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -3,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -2,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -2,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -11,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -11,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 10,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 6,
        "r": 5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": -2,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -9,
        "r": -1
      }
    ]
  },
  {
    "coordinate": "V-SWMP-C-636932322-0-0-0",
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
          "DeepOil",
          "MetalPoor"
        ],
        "biomePaths": "Swamp:169,164 159,153 165,137 154,128 153,114 137,110 134,104 110,110 101,99 93,101 87,121 66,120 60,134 61,136 55,156 64,165 55,187 55,188 72,192 78,207 96,207 105,221 110,221 122,208 138,211 147,200 163,198 165,195 159,179\nRadioactive:22,244 16,235 0,234 0,260 15,258;116,336 109,329 111,315 126,313 135,328 135,329;188,333 185,315 162,319 169,336;240,113 240,89 221,94 221,109\nToxicJungle:33,127 30,115 0,115 0,141 25,142;54,328 48,309 30,308 18,325 22,333 43,341;86,275 76,276 63,258 52,258 43,245 52,223 67,224 78,239 87,240 99,257;135,328 126,313 134,294 156,297 162,319;158,267 146,265 136,242 145,232 162,233 170,257;210,211 197,211 186,193 194,179 210,178 220,198;210,118 192,113 196,87 210,84 221,94 221,109;240,263 240,231 221,230 210,245 219,263;240,325 240,294 218,294 209,277 192,276 183,289 190,307 210,306 220,326\nWasteland:33,109 26,87 0,89 0,115 30,115;64,165 55,156 32,159 25,142 0,141 0,169 27,170 31,180 55,187;87,121 66,120 58,103 62,93 76,89 93,101;87,240 78,239 67,224 78,207 96,207 105,221;109,329 92,337 78,326 80,310 99,301 111,315;126,280 124,280 110,257 124,242 136,242 146,265;240,198 240,166 218,167 208,145 213,139 240,138 240,113 221,109 210,118 192,113 187,115 165,104 153,114 154,128 165,137 182,132 194,146 184,165 194,179 210,178 220,198\nBarren:240,89 240,65 215,63 212,59 197,55 184,63 169,56 156,62 143,54 129,59 116,50 94,59 92,62 83,66 61,56 57,58 32,47 21,58 0,57 0,89 26,87 30,81 50,78 62,93 76,89 93,101 101,99 108,83 126,79 135,88 155,82 165,90 185,80 196,87 210,84 221,94\nSandstone:31,180 27,170 0,169 0,234 16,235 29,213 19,200;60,134 61,136 55,156 32,159 25,142 33,127 30,115 33,109 58,103 66,120;78,207 72,192 55,188 45,215 52,223 67,224;124,280 110,257 124,242 110,221 105,221 87,240 99,257 86,275 100,293;184,165 169,164 159,153 165,137 182,132 194,146;196,87 185,80 165,90 165,104 187,115 192,113\nFrozenWastes:55,188 55,187 31,180 19,200 29,213 16,235 22,244 43,245 52,223 45,215;58,103 33,109 26,87 30,81 50,78 62,93;126,313 111,315 99,301 80,310 62,295 59,296 40,276 52,258 63,258 76,276 86,275 100,293 124,280 126,280 134,294;153,114 137,110 134,104 110,110 101,99 108,83 126,79 135,88 155,82 165,90 165,104;169,336 162,319 135,328 135,329 140,349 159,353 165,348;210,245 196,244 184,258 170,257 162,233 145,232 136,242 124,242 110,221 122,208 138,211 147,200 163,198 165,195 159,179 169,164 184,165 194,179 186,193 197,211 210,211 221,230\nBoggyMarsh:80,310 62,295 59,296 40,276 52,258 43,245 22,244 15,258 0,260 0,323 18,325 30,308 48,309 54,328 67,332 78,326;218,167 208,145 213,139 240,138 240,166;221,230 210,211 220,198 240,198 240,231;240,294 240,263 219,263 210,245 196,244 184,258 170,257 158,267 146,265 126,280 134,294 156,297 162,319 185,315 188,333 192,337 216,334 220,326 210,306 190,307 183,289 192,276 209,277 218,294\nOilField:140,349 135,329 116,336 109,329 92,337 78,326 67,332 54,328 43,341 22,333 18,325 0,323 0,349 15,347 26,356 44,347 53,353 68,346 80,352 91,346 106,354 115,348 133,354;219,347 214,352 192,349 187,355 165,348 169,336 188,333 192,337 216,334 220,326 240,325 240,347\nMagmaCore:240,380 240,347 219,347 214,352 192,349 187,355 165,348 159,353 140,349 133,354 115,348 106,354 91,346 80,352 68,346 53,353 44,347 26,356 15,347 0,349 0,380",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 109,
            "y": 160
          },
          {
            "id": "MassiveHeatSink",
            "x": 59,
            "y": 291
          },
          {
            "id": "MassiveHeatSink",
            "x": 81,
            "y": 282
          },
          {
            "id": "MassiveHeatSink",
            "x": 81,
            "y": 304
          },
          {
            "id": "WarpConduitSender",
            "x": 53,
            "y": 267
          },
          {
            "id": "WarpConduitReceiver",
            "x": 48,
            "y": 228
          },
          {
            "id": "GravitasPedestal",
            "x": 168,
            "y": 99
          },
          {
            "id": "WarpReceiver",
            "x": 194,
            "y": 236
          },
          {
            "id": "WarpPortal",
            "x": 193,
            "y": 230
          },
          {
            "id": "GeneShuffler",
            "x": 85,
            "y": 247
          },
          {
            "id": "GeneShuffler",
            "x": 35,
            "y": 331
          },
          {
            "id": "GeneShuffler",
            "x": 51,
            "y": 199
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 147,
            "y": 299,
            "emitRate": 4638,
            "avgEmitRate": 1910,
            "idleTime": 180,
            "eruptionTime": 291,
            "dormancyCycles": 30.1,
            "activeCycles": 60.3
          },
          {
            "id": "chlorine_gas",
            "x": 16,
            "y": 138,
            "emitRate": 297,
            "avgEmitRate": 106,
            "idleTime": 405,
            "eruptionTime": 613,
            "dormancyCycles": 51.5,
            "activeCycles": 74.3
          },
          {
            "id": "steam",
            "x": 33,
            "y": 297,
            "emitRate": 4740,
            "avgEmitRate": 1412,
            "idleTime": 258,
            "eruptionTime": 278,
            "dormancyCycles": 43.6,
            "activeCycles": 58.9
          },
          {
            "id": "methane",
            "x": 169,
            "y": 299,
            "emitRate": 409,
            "avgEmitRate": 112,
            "idleTime": 378,
            "eruptionTime": 275,
            "dormancyCycles": 52.1,
            "activeCycles": 96.4
          },
          {
            "id": "slush_water",
            "x": 161,
            "y": 214,
            "emitRate": 8264,
            "avgEmitRate": 1581,
            "idleTime": 341,
            "eruptionTime": 155,
            "dormancyCycles": 41.2,
            "activeCycles": 64.7
          },
          {
            "id": "slush_salt_water",
            "x": 30,
            "y": 90,
            "emitRate": 8262,
            "avgEmitRate": 1906,
            "idleTime": 285,
            "eruptionTime": 183,
            "dormancyCycles": 58.7,
            "activeCycles": 84.2
          },
          {
            "id": "OilWell",
            "x": 203,
            "y": 344,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 23,
            "y": 344,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 94,
            "y": 342,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "slush_salt_water",
            "x": 202,
            "y": 302,
            "emitRate": 5372,
            "avgEmitRate": 1277,
            "idleTime": 343,
            "eruptionTime": 238,
            "dormancyCycles": 43.1,
            "activeCycles": 59.8
          },
          {
            "id": "filthy_water",
            "x": 197,
            "y": 184,
            "emitRate": 11128,
            "avgEmitRate": 2619,
            "idleTime": 381,
            "eruptionTime": 257,
            "dormancyCycles": 47.1,
            "activeCycles": 66.0
          },
          {
            "id": "slush_salt_water",
            "x": 56,
            "y": 93,
            "emitRate": 4547,
            "avgEmitRate": 1245,
            "idleTime": 481,
            "eruptionTime": 353,
            "dormancyCycles": 47.9,
            "activeCycles": 87.8
          },
          {
            "id": "hot_co2",
            "x": 209,
            "y": 230,
            "emitRate": 355,
            "avgEmitRate": 82,
            "idleTime": 337,
            "eruptionTime": 310,
            "dormancyCycles": 42.5,
            "activeCycles": 40.0
          },
          {
            "id": "chlorine_gas",
            "x": 207,
            "y": 217,
            "emitRate": 429,
            "avgEmitRate": 119,
            "idleTime": 484,
            "eruptionTime": 275,
            "dormancyCycles": 28.4,
            "activeCycles": 91.1
          },
          {
            "id": "hot_po2",
            "x": 134,
            "y": 282,
            "emitRate": 258,
            "avgEmitRate": 88,
            "idleTime": 252,
            "eruptionTime": 298,
            "dormancyCycles": 66.6,
            "activeCycles": 111.8
          },
          {
            "id": "hot_hydrogen",
            "x": 200,
            "y": 100,
            "emitRate": 1706,
            "avgEmitRate": 111,
            "idleTime": 387,
            "eruptionTime": 45,
            "dormancyCycles": 60.8,
            "activeCycles": 99.9
          },
          {
            "id": "small_volcano",
            "x": 190,
            "y": 300,
            "emitRate": 159198,
            "avgEmitRate": 727,
            "idleTime": 8965,
            "eruptionTime": 63,
            "dormancyCycles": 28.7,
            "activeCycles": 54.8
          },
          {
            "id": "liquid_co2",
            "x": 169,
            "y": 245,
            "emitRate": 345,
            "avgEmitRate": 143,
            "idleTime": 151,
            "eruptionTime": 445,
            "dormancyCycles": 50.6,
            "activeCycles": 62.7
          },
          {
            "id": "molten_cobalt",
            "x": 30,
            "y": 250,
            "emitRate": 9199,
            "avgEmitRate": 270,
            "idleTime": 684,
            "eruptionTime": 38,
            "dormancyCycles": 59.1,
            "activeCycles": 72.3
          },
          {
            "id": "molten_cobalt",
            "x": 154,
            "y": 238,
            "emitRate": 8986,
            "avgEmitRate": 303,
            "idleTime": 653,
            "eruptionTime": 38,
            "dormancyCycles": 51.8,
            "activeCycles": 81.5
          },
          {
            "id": "molten_iron",
            "x": 226,
            "y": 103,
            "emitRate": 12388,
            "avgEmitRate": 255,
            "idleTime": 843,
            "eruptionTime": 36,
            "dormancyCycles": 74.6,
            "activeCycles": 74.0
          },
          {
            "id": "slimy_po2",
            "x": 225,
            "y": 215,
            "emitRate": 510,
            "avgEmitRate": 85,
            "idleTime": 447,
            "eruptionTime": 239,
            "dormancyCycles": 71.7,
            "activeCycles": 66.3
          },
          {
            "id": "molten_copper",
            "x": 175,
            "y": 180,
            "emitRate": 8604,
            "avgEmitRate": 298,
            "idleTime": 698,
            "eruptionTime": 46,
            "dormancyCycles": 54.1,
            "activeCycles": 70.0
          },
          {
            "id": "slimy_po2",
            "x": 179,
            "y": 169,
            "emitRate": 510,
            "avgEmitRate": 85,
            "idleTime": 447,
            "eruptionTime": 239,
            "dormancyCycles": 71.7,
            "activeCycles": 66.3
          },
          {
            "id": "hot_co2",
            "x": 223,
            "y": 330,
            "emitRate": 387,
            "avgEmitRate": 96,
            "idleTime": 311,
            "eruptionTime": 251,
            "dormancyCycles": 62.5,
            "activeCycles": 77.7
          },
          {
            "id": "molten_cobalt",
            "x": 49,
            "y": 180,
            "emitRate": 9482,
            "avgEmitRate": 327,
            "idleTime": 705,
            "eruptionTime": 44,
            "dormancyCycles": 54.9,
            "activeCycles": 76.3
          },
          {
            "id": "molten_gold",
            "x": 222,
            "y": 313,
            "emitRate": 9262,
            "avgEmitRate": 318,
            "idleTime": 626,
            "eruptionTime": 39,
            "dormancyCycles": 38.4,
            "activeCycles": 55.2
          },
          {
            "id": "oil_drip",
            "x": 118,
            "y": 226,
            "emitRate": 293,
            "avgEmitRate": 186,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.3
          },
          {
            "id": "chlorine_gas",
            "x": 58,
            "y": 335,
            "emitRate": 364,
            "avgEmitRate": 107,
            "idleTime": 305,
            "eruptionTime": 299,
            "dormancyCycles": 48.9,
            "activeCycles": 71.3
          },
          {
            "id": "molten_iron",
            "x": 126,
            "y": 85,
            "emitRate": 8029,
            "avgEmitRate": 253,
            "idleTime": 799,
            "eruptionTime": 57,
            "dormancyCycles": 58.4,
            "activeCycles": 52.9
          },
          {
            "id": "hot_water",
            "x": 222,
            "y": 299,
            "emitRate": 10160,
            "avgEmitRate": 2823,
            "idleTime": 267,
            "eruptionTime": 207,
            "dormancyCycles": 33.4,
            "activeCycles": 58.3
          },
          {
            "id": "molten_iron",
            "x": 122,
            "y": 104,
            "emitRate": 8325,
            "avgEmitRate": 328,
            "idleTime": 612,
            "eruptionTime": 42,
            "dormancyCycles": 45.0,
            "activeCycles": 72.9
          },
          {
            "id": "methane",
            "x": 82,
            "y": 334,
            "emitRate": 260,
            "avgEmitRate": 116,
            "idleTime": 224,
            "eruptionTime": 529,
            "dormancyCycles": 52.9,
            "activeCycles": 91.6
          },
          {
            "id": "OilWell",
            "x": 27,
            "y": 353,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 34,
            "y": 341,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 4,
            "y": 345,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 9,
            "y": 336,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 231,
            "y": 331,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 222,
            "y": 343,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 186,
            "y": 345,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 181,
            "y": 345,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 212,
            "y": 340,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 196,
            "y": 349,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 122,
            "y": 349,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 133,
            "y": 341,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
          "MetalRich",
          "Geodes"
        ],
        "biomePaths": "Forest:27,87 16,70 0,72 0,92 19,94;116,127 106,126 96,136 80,133 75,139 56,135 52,129 45,127 28,141 20,134 21,115 36,114 42,103 28,87 42,77 53,81 66,69 75,72 86,65 101,73 109,71 122,86 114,99 127,111\nRust:66,69 60,57 40,61 37,58 38,42 25,34 13,46 22,60 16,70 27,87 19,94 20,115 0,115 0,138 20,134 21,115 36,114 42,103 28,87 42,77 53,81;137,71 133,84 139,90 139,108 136,111 127,111 114,99 122,86 109,71 101,73 86,65 87,51 96,45 108,48 113,62 133,61 136,52 160,53 160,70\nOcean:20,115 19,94 0,92 0,115;22,60 13,46 0,45 0,72 16,70;86,65 75,72 66,69 60,57 40,61 37,58 38,42 49,36 63,48 72,44 87,51;160,53 160,36 140,34 133,43 118,39 108,48 113,62 133,61 136,52;160,129 160,70 137,71 133,84 139,90 139,108 136,111 127,111 116,127 122,136 138,136 142,130\nRadioactive:160,176 160,129 142,130 138,136 122,136 116,127 106,126 96,136 80,133 75,139 56,135 52,129 45,127 28,141 20,134 0,138 0,153 19,157 29,148 41,154 39,176 81,176 81,157 100,153 101,152 116,151 121,157 140,156 143,176\nFrozenWastes:41,154 29,148 19,157 0,153 0,176 39,176;143,176 140,156 121,157 116,151 101,152 100,153 81,157 81,176",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "x": 46,
            "y": 125
          },
          {
            "id": "WarpConduitReceiver",
            "x": 43,
            "y": 98
          },
          {
            "id": "WarpReceiver",
            "x": 82,
            "y": 107
          },
          {
            "id": "WarpPortal",
            "x": 60,
            "y": 107
          },
          {
            "id": "GeneShuffler",
            "x": 13,
            "y": 124
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 75,
            "y": 157,
            "emitRate": 528,
            "avgEmitRate": 150,
            "idleTime": 422,
            "eruptionTime": 356,
            "dormancyCycles": 37.2,
            "activeCycles": 60.6
          },
          {
            "id": "liquid_co2",
            "x": 149,
            "y": 149,
            "emitRate": 423,
            "avgEmitRate": 144,
            "idleTime": 384,
            "eruptionTime": 460,
            "dormancyCycles": 51.4,
            "activeCycles": 84.9
          },
          {
            "id": "salt_water",
            "x": 16,
            "y": 57,
            "emitRate": 31735,
            "avgEmitRate": 2906,
            "idleTime": 670,
            "eruptionTime": 136,
            "dormancyCycles": 74.6,
            "activeCycles": 89.0
          },
          {
            "id": "molten_aluminum",
            "x": 87,
            "y": 140,
            "emitRate": 8127,
            "avgEmitRate": 318,
            "idleTime": 711,
            "eruptionTime": 47,
            "dormancyCycles": 42.0,
            "activeCycles": 72.8
          },
          {
            "id": "hot_water",
            "x": 103,
            "y": 103,
            "emitRate": 8459,
            "avgEmitRate": 2871,
            "idleTime": 384,
            "eruptionTime": 460,
            "dormancyCycles": 51.4,
            "activeCycles": 84.9
          },
          {
            "id": "molten_gold",
            "x": 73,
            "y": 133,
            "emitRate": 8429,
            "avgEmitRate": 334,
            "idleTime": 697,
            "eruptionTime": 48,
            "dormancyCycles": 60.3,
            "activeCycles": 94.4
          },
          {
            "id": "slush_water",
            "x": 146,
            "y": 85,
            "emitRate": 4795,
            "avgEmitRate": 1183,
            "idleTime": 415,
            "eruptionTime": 332,
            "dormancyCycles": 61.2,
            "activeCycles": 76.5
          },
          {
            "id": "hot_po2",
            "x": 63,
            "y": 123,
            "emitRate": 340,
            "avgEmitRate": 117,
            "idleTime": 235,
            "eruptionTime": 304,
            "dormancyCycles": 60.3,
            "activeCycles": 94.4
          },
          {
            "id": "chlorine_gas",
            "x": 115,
            "y": 86,
            "emitRate": 250,
            "avgEmitRate": 108,
            "idleTime": 190,
            "eruptionTime": 392,
            "dormancyCycles": 55.8,
            "activeCycles": 98.4
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
        "biomePaths": "FrozenWastes:64,128 64,30 49,27 43,32 32,26 22,34 16,30 0,38 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 28,
            "y": 41
          },
          {
            "id": "GravitasPedestal",
            "x": 54,
            "y": 110
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 21,
            "y": 119,
            "emitRate": 9828,
            "avgEmitRate": 286,
            "idleTime": 717,
            "eruptionTime": 41,
            "dormancyCycles": 96.6,
            "activeCycles": 112.8
          },
          {
            "id": "molten_iron",
            "x": 36,
            "y": 56,
            "emitRate": 7010,
            "avgEmitRate": 290,
            "idleTime": 680,
            "eruptionTime": 52,
            "dormancyCycles": 56.7,
            "activeCycles": 78.2
          },
          {
            "id": "molten_iron",
            "x": 18,
            "y": 61,
            "emitRate": 7377,
            "avgEmitRate": 354,
            "idleTime": 732,
            "eruptionTime": 53,
            "dormancyCycles": 41.1,
            "activeCycles": 100.9
          },
          {
            "id": "molten_iron",
            "x": 52,
            "y": 78,
            "emitRate": 7651,
            "avgEmitRate": 300,
            "idleTime": 734,
            "eruptionTime": 50,
            "dormancyCycles": 44.1,
            "activeCycles": 71.7
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
        "biomePaths": "BoggyMarsh:64,82 64,24 48,32 41,28 34,34 20,30 14,40 0,39 0,59 13,59 18,47 33,49 31,65 30,79 42,86 48,79\nToxicJungle:33,49 18,47 13,59 0,59 0,80 13,78 21,84 30,79 31,65\nFrozenWastes:64,96 64,82 48,79 42,86 30,79 21,84 13,78 0,80 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 26,
            "y": 45
          },
          {
            "id": "GravitasPedestal",
            "x": 12,
            "y": 45
          },
          {
            "id": "SapTree",
            "x": 19,
            "y": 45
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 18,
            "y": 72,
            "emitRate": 9364,
            "avgEmitRate": 323,
            "idleTime": 601,
            "eruptionTime": 39,
            "dormancyCycles": 48.7,
            "activeCycles": 62.7
          },
          {
            "id": "molten_tungsten",
            "x": 55,
            "y": 91,
            "emitRate": 10005,
            "avgEmitRate": 281,
            "idleTime": 710,
            "eruptionTime": 36,
            "dormancyCycles": 40.0,
            "activeCycles": 55.9
          },
          {
            "id": "molten_tungsten",
            "x": 7,
            "y": 88,
            "emitRate": 8335,
            "avgEmitRate": 276,
            "idleTime": 642,
            "eruptionTime": 45,
            "dormancyCycles": 62.9,
            "activeCycles": 64.9
          },
          {
            "id": "chlorine_gas",
            "x": 27,
            "y": 58,
            "emitRate": 370,
            "avgEmitRate": 126,
            "idleTime": 327,
            "eruptionTime": 399,
            "dormancyCycles": 39.6,
            "activeCycles": 63.9
          },
          {
            "id": "chlorine_gas",
            "x": 52,
            "y": 57,
            "emitRate": 286,
            "avgEmitRate": 103,
            "idleTime": 221,
            "eruptionTime": 355,
            "dormancyCycles": 60.3,
            "activeCycles": 84.1
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
        "biomePaths": "MagmaCore:64,96 64,37 52,38 47,30 33,30 32,31 16,31 0,32 0,48 16,47 19,49 33,47 36,49 36,64 32,67 18,64 16,65 0,63 0,96 21,96 21,85 32,78 43,85 44,96\nOilField:36,64 36,49 33,47 19,49 16,47 0,48 0,63 16,65 18,64 32,67;44,96 43,85 32,78 21,85 21,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 23,
            "y": 51
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 13,
            "y": 63,
            "emitRate": 262153,
            "avgEmitRate": 1111,
            "idleTime": 8831,
            "eruptionTime": 69,
            "dormancyCycles": 56.9,
            "activeCycles": 68.0
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
        "biomePaths": "Moo:96,60 96,39 85,39 75,47 73,46 65,35 55,36 50,30 36,32 33,42 19,44 15,39 0,39 0,60 17,59 19,62 36,61 39,65 58,63 58,64 77,66 81,60\nFrozenWastes:96,80 96,60 81,60 77,66 58,64 58,63 39,65 36,61 19,62 17,59 0,60 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 28,
            "y": 54
          },
          {
            "id": "GravitasPedestal",
            "x": 21,
            "y": 54
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 69,
            "y": 58,
            "emitRate": 347,
            "avgEmitRate": 102,
            "idleTime": 308,
            "eruptionTime": 304,
            "dormancyCycles": 36.2,
            "activeCycles": 52.3
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
        "biomePaths": "Barren:80,136 80,49 70,49 62,42 55,41 48,35 42,35 32,47 21,43 18,36 14,32 0,34 0,147 18,146 20,132 33,132 39,141 47,143 59,133 65,138;80,174 80,157 65,155 60,158 52,155 40,163 30,154 23,154 19,161 0,160 0,174\nSwamp:80,157 80,136 65,138 59,133 47,143 39,141 33,132 20,132 18,146 0,147 0,160 19,161 23,154 30,154 40,163 52,155 60,158 65,155",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 52,
            "y": 144
          },
          {
            "id": "GravitasPedestal",
            "x": 54,
            "y": 144
          }
        ],
        "geysers": [
          {
            "id": "slush_water",
            "x": 16,
            "y": 106,
            "emitRate": 3830,
            "avgEmitRate": 1336,
            "idleTime": 192,
            "eruptionTime": 268,
            "dormancyCycles": 24.8,
            "activeCycles": 37.1
          },
          {
            "id": "salt_water",
            "x": 40,
            "y": 117,
            "emitRate": 9096,
            "avgEmitRate": 3287,
            "idleTime": 372,
            "eruptionTime": 611,
            "dormancyCycles": 61.7,
            "activeCycles": 85.7
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
        "biomePaths": "Barren:34,60 26,53 20,53 14,60 0,61 0,79 18,78 20,76 31,74;78,82 73,76 67,76 55,62 62,56 76,58 81,50 96,51 96,80\nSandstone:57,87 45,78 38,79 31,74 34,60 46,57 53,62 55,62 67,76\nFrozenWastes:96,96 96,80 78,82 73,76 67,76 57,87 45,78 38,79 31,74 20,76 18,78 0,79 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 21,
            "y": 65
          },
          {
            "id": "GravitasPedestal",
            "x": 25,
            "y": 65
          },
          {
            "id": "GeneShuffler",
            "x": 23,
            "y": 59
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 27,
            "y": 81,
            "emitRate": 5631,
            "avgEmitRate": 1604,
            "idleTime": 159,
            "eruptionTime": 138,
            "dormancyCycles": 50.0,
            "activeCycles": 79.2
          },
          {
            "id": "steam",
            "x": 71,
            "y": 86,
            "emitRate": 4019,
            "avgEmitRate": 1194,
            "idleTime": 275,
            "eruptionTime": 316,
            "dormancyCycles": 70.7,
            "activeCycles": 88.2
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
        "q": -2,
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": 3,
        "r": -5
      },
      {
        "id": "MarshyMoonlet",
        "q": -4,
        "r": -2
      },
      {
        "id": "NiobiumMoonlet",
        "q": 5,
        "r": 1
      },
      {
        "id": "MooMoonlet",
        "q": -1,
        "r": 7
      },
      {
        "id": "WaterMoonlet",
        "q": -7,
        "r": 7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 7,
        "r": -4
      },
      {
        "id": "TemporalTear",
        "q": -3,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -1,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -8,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -8,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -8,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 7,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 8,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -8,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -9,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -3,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 1,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 0,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 0,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 1,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 10,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 10,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 2,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 6,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 0,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -1,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -2,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 6,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -11,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": 1,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -5,
        "r": 10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 4,
        "r": -3
      }
    ]
  },
  {
    "coordinate": "V-SFRZ-C-1319193308-0-0-0",
    "cluster": "V-SFRZ-C",
    "dlcs": [
      "FrostyPlanet",
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
          "MetalPoor",
          "BouldersSmall"
        ],
        "biomePaths": "Sandstone:30,111 21,87 0,87 0,117 25,116;78,93 72,68 56,64 45,78 53,96 76,95;130,94 111,100 101,88 104,73 120,66 133,77;142,221 128,204 137,189 129,180 110,184 101,172 86,176 82,193 61,193 56,207 34,209 28,200 32,179 26,173 0,174 0,224 29,227 32,232 53,238 59,235 78,241 81,250 98,254 106,244 130,250 129,232;187,107 169,110 159,99 163,82 183,77 188,82;217,271 209,252 215,242 240,242 240,271\nMagmaCore:240,380 240,351 213,354 207,349 184,361 175,353 151,362 143,353 129,353 119,364 97,353 86,359 71,350 56,357 47,351 27,359 13,347 0,347 0,380\nOilField:240,351 240,330 215,327 206,339 181,328 174,333 154,327 151,322 121,325 119,328 100,333 88,323 72,330 56,321 44,328 29,323 24,315 0,312 0,347 13,347 27,359 47,351 56,357 71,350 86,359 97,353 119,364 129,353 143,353 151,362 175,353 184,361 207,349 213,354\nRust:32,297 23,285 0,286 0,312 24,315;88,323 72,330 56,321 58,305 78,298 90,310;153,310 136,294 138,281 128,270 105,277 111,301 117,304 121,325 151,322;152,221 142,221 128,204 137,189 129,180 134,161 145,156 157,163 161,179 154,188 162,209;159,99 140,103 130,94 133,77 151,70 163,82;180,302 169,300 159,274 161,270 182,266 192,282;216,155 210,140 191,137 180,144 180,147 192,168 208,168;211,108 190,110 187,107 188,82 209,79 218,94\nToxicJungle:30,266 22,256 0,255 0,286 23,285;78,298 58,305 48,296 56,270 68,270 80,284;119,328 100,333 88,323 90,310 111,301 117,304 121,325;136,124 124,128 107,116 98,120 93,143 79,147 62,128 80,111 76,95 78,93 101,88 111,100 130,94 140,103;206,339 181,328 185,310 211,311 215,327;209,283 192,282 182,266 161,270 159,274 169,300 153,310 136,294 138,281 128,270 131,251 154,252 162,239 179,239 187,226 208,226 215,242 209,252 217,271;240,125 240,92 218,94 211,108 190,110 191,137 210,140 222,124;217,185 208,168 216,155 240,156 240,185\nBoggyMarsh:56,207 34,209 28,200 32,179 51,177 61,193;81,250 78,241 59,235 53,238 32,232 29,227 0,224 0,255 22,256 30,266 50,265 56,270 68,270;129,180 110,184 101,172 86,176 72,161 79,147 93,143 107,153 118,150 134,161;154,252 131,251 128,270 105,277 111,301 90,310 78,298 80,284 104,276 98,254 106,244 130,250 129,232 142,221 152,221 162,239;163,128 148,132 136,124 140,103 159,99 169,110;208,226 187,226 180,209 162,209 154,188 161,179 183,182 188,197 209,198 215,214;211,311 185,310 181,328 174,333 154,327 151,322 153,310 169,300 180,302 192,282 209,283 217,301\nRadioactive:43,145 31,145 26,173 0,174 0,145 30,145 25,116 30,111 21,87 29,78 45,78 53,96 45,110 58,128;180,144 163,128 169,110 187,107 190,110 191,137;240,214 240,185 217,185 208,168 192,168 183,182 188,197 209,198 215,214;217,301 209,283 217,271 240,271 240,300\nOcean:30,145 25,116 0,117 0,145;56,321 44,328 29,323 24,315 32,297 23,285 30,266 50,265 56,270 48,296 58,305;62,128 79,147 72,161 58,165 43,145 58,128 45,110 53,96 76,95 80,111;104,73 86,57 72,68 78,93 101,88;118,150 107,153 93,143 98,120 107,116 124,128;192,168 180,147 157,163 161,179 183,182;240,156 240,125 222,124 210,140 216,155;215,242 208,226 215,214 240,214 240,242\nBarren:240,92 240,66 215,64 211,56 194,51 183,58 166,49 153,55 136,43 122,51 105,38 87,53 68,32 65,32 52,52 31,46 22,57 0,56 0,87 21,87 29,78 45,78 56,64 72,68 86,57 104,73 120,66 133,77 151,70 163,82 183,77 188,82 209,79 218,94\nForest:82,193 61,193 51,177 32,179 26,173 31,145 43,145 58,165 72,161 86,176;104,276 98,254 81,250 68,270 80,284;157,163 145,156 134,161 118,150 124,128 136,124 148,132 163,128 180,144 180,147;179,239 162,239 152,221 162,209 180,209 187,226;240,330 240,300 217,301 211,311 215,327",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 96,
            "y": 216
          },
          {
            "id": "WarpConduitSender",
            "x": 42,
            "y": 284
          },
          {
            "id": "WarpConduitReceiver",
            "x": 63,
            "y": 160
          },
          {
            "id": "GravitasPedestal",
            "x": 155,
            "y": 136
          },
          {
            "id": "WarpReceiver",
            "x": 101,
            "y": 141
          },
          {
            "id": "WarpPortal",
            "x": 100,
            "y": 135
          },
          {
            "id": "GeneShuffler",
            "x": 194,
            "y": 216
          },
          {
            "id": "GeneShuffler",
            "x": 164,
            "y": 262
          },
          {
            "id": "GeneShuffler",
            "x": 158,
            "y": 339
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 67,
            "y": 127,
            "emitRate": 5178,
            "avgEmitRate": 1736,
            "idleTime": 262,
            "eruptionTime": 350,
            "dormancyCycles": 26.3,
            "activeCycles": 37.3
          },
          {
            "id": "chlorine_gas",
            "x": 108,
            "y": 307,
            "emitRate": 323,
            "avgEmitRate": 105,
            "idleTime": 332,
            "eruptionTime": 365,
            "dormancyCycles": 43.8,
            "activeCycles": 71.2
          },
          {
            "id": "steam",
            "x": 76,
            "y": 246,
            "emitRate": 4037,
            "avgEmitRate": 1584,
            "idleTime": 192,
            "eruptionTime": 313,
            "dormancyCycles": 46.8,
            "activeCycles": 81.0
          },
          {
            "id": "methane",
            "x": 80,
            "y": 297,
            "emitRate": 1094,
            "avgEmitRate": 122,
            "idleTime": 479,
            "eruptionTime": 109,
            "dormancyCycles": 50.1,
            "activeCycles": 75.7
          },
          {
            "id": "salt_water",
            "x": 73,
            "y": 106,
            "emitRate": 8079,
            "avgEmitRate": 2632,
            "idleTime": 273,
            "eruptionTime": 311,
            "dormancyCycles": 56.9,
            "activeCycles": 89.6
          },
          {
            "id": "OilWell",
            "x": 102,
            "y": 343,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 49,
            "y": 345,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 20,
            "y": 323,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "filthy_water",
            "x": 215,
            "y": 288,
            "emitRate": 8405,
            "avgEmitRate": 2762,
            "idleTime": 312,
            "eruptionTime": 372,
            "dormancyCycles": 42.2,
            "activeCycles": 64.3
          },
          {
            "id": "small_volcano",
            "x": 163,
            "y": 230,
            "emitRate": 116120,
            "avgEmitRate": 537,
            "idleTime": 8884,
            "eruptionTime": 74,
            "dormancyCycles": 55.7,
            "activeCycles": 71.2
          },
          {
            "id": "molten_cobalt",
            "x": 172,
            "y": 146,
            "emitRate": 7892,
            "avgEmitRate": 313,
            "idleTime": 780,
            "eruptionTime": 59,
            "dormancyCycles": 51.5,
            "activeCycles": 65.3
          },
          {
            "id": "molten_gold",
            "x": 222,
            "y": 133,
            "emitRate": 7375,
            "avgEmitRate": 336,
            "idleTime": 673,
            "eruptionTime": 53,
            "dormancyCycles": 56.8,
            "activeCycles": 93.9
          },
          {
            "id": "chlorine_gas",
            "x": 35,
            "y": 132,
            "emitRate": 284,
            "avgEmitRate": 113,
            "idleTime": 243,
            "eruptionTime": 423,
            "dormancyCycles": 34.6,
            "activeCycles": 58.2
          },
          {
            "id": "small_volcano",
            "x": 156,
            "y": 156,
            "emitRate": 122238,
            "avgEmitRate": 572,
            "idleTime": 8027,
            "eruptionTime": 63,
            "dormancyCycles": 60.7,
            "activeCycles": 90.4
          },
          {
            "id": "slush_water",
            "x": 59,
            "y": 266,
            "emitRate": 2722,
            "avgEmitRate": 1109,
            "idleTime": 91,
            "eruptionTime": 473,
            "dormancyCycles": 69.4,
            "activeCycles": 65.6
          },
          {
            "id": "hot_po2",
            "x": 27,
            "y": 218,
            "emitRate": 441,
            "avgEmitRate": 99,
            "idleTime": 240,
            "eruptionTime": 159,
            "dormancyCycles": 34.9,
            "activeCycles": 45.2
          },
          {
            "id": "slush_water",
            "x": 126,
            "y": 333,
            "emitRate": 2722,
            "avgEmitRate": 1109,
            "idleTime": 91,
            "eruptionTime": 473,
            "dormancyCycles": 69.4,
            "activeCycles": 65.6
          },
          {
            "id": "big_volcano",
            "x": 140,
            "y": 138,
            "emitRate": 296858,
            "avgEmitRate": 1132,
            "idleTime": 9419,
            "eruptionTime": 62,
            "dormancyCycles": 44.5,
            "activeCycles": 62.8
          },
          {
            "id": "filthy_water",
            "x": 170,
            "y": 130,
            "emitRate": 8582,
            "avgEmitRate": 2809,
            "idleTime": 356,
            "eruptionTime": 418,
            "dormancyCycles": 45.7,
            "activeCycles": 70.3
          },
          {
            "id": "hot_po2",
            "x": 90,
            "y": 258,
            "emitRate": 411,
            "avgEmitRate": 109,
            "idleTime": 428,
            "eruptionTime": 322,
            "dormancyCycles": 69.3,
            "activeCycles": 112.5
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
          "RadioactiveCrust",
          "MetalCaves"
        ],
        "biomePaths": "Swamp:118,108 111,111 106,124 92,127 88,134 70,137 62,125 49,124 44,108 27,106 23,94 27,85 45,84 50,73 65,71 76,84 77,84 94,69 107,83 115,82 125,93\nBoggyMarsh:142,59 135,68 124,68 115,82 107,83 94,69 77,84 76,84 65,71 69,57 83,54 94,67 113,54 113,52 131,40 137,44 160,33 160,60;145,107 137,92 143,83 160,82 160,108\nToxicJungle:49,124 44,108 27,106 22,115 25,129 44,131;69,57 59,46 47,48 40,39 24,41 19,50 0,51 0,74 21,73 26,63 42,61 50,73 65,71;94,67 83,54 87,43 102,38 113,52 113,54\nFrozenWastes:27,106 23,94 27,85 21,73 0,74 0,135 21,135 25,129 22,115;137,92 125,93 115,82 124,68 135,68 143,83\nWasteland:45,84 27,85 21,73 26,63 42,61 50,73;160,152 160,108 145,107 137,92 125,93 118,108 111,111 106,124 92,127 88,134 70,137 62,125 49,124 44,131 25,129 21,135 24,151 37,154 46,148 57,152 66,149 77,158 95,152 112,149 115,135 135,129 136,131 138,153 139,153\nBarren:24,151 21,135 0,135 0,154 18,156;119,155 112,149 115,135 135,129 136,131 138,153;143,83 135,68 142,59 160,60 160,82\nMagmaCore:160,176 160,152 139,153 138,153 119,155 112,149 95,152 77,158 66,149 57,152 46,148 37,154 24,151 18,156 0,154 0,176",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 15,
            "y": 79
          },
          {
            "id": "WarpConduitReceiver",
            "x": 35,
            "y": 106
          },
          {
            "id": "WarpConduitSender",
            "x": 65,
            "y": 129
          },
          {
            "id": "WarpReceiver",
            "x": 88,
            "y": 96
          },
          {
            "id": "WarpPortal",
            "x": 66,
            "y": 96
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 25,
            "y": 119,
            "emitRate": 4137,
            "avgEmitRate": 1174,
            "idleTime": 331,
            "eruptionTime": 347,
            "dormancyCycles": 70.0,
            "activeCycles": 87.3
          },
          {
            "id": "steam",
            "x": 147,
            "y": 95,
            "emitRate": 4571,
            "avgEmitRate": 1284,
            "idleTime": 292,
            "eruptionTime": 324,
            "dormancyCycles": 33.7,
            "activeCycles": 38.7
          },
          {
            "id": "methane",
            "x": 126,
            "y": 67,
            "emitRate": 435,
            "avgEmitRate": 123,
            "idleTime": 320,
            "eruptionTime": 316,
            "dormancyCycles": 54.8,
            "activeCycles": 72.3
          },
          {
            "id": "filthy_water",
            "x": 57,
            "y": 168,
            "emitRate": 8405,
            "avgEmitRate": 2762,
            "idleTime": 312,
            "eruptionTime": 372,
            "dormancyCycles": 42.2,
            "activeCycles": 64.3
          },
          {
            "id": "molten_copper",
            "x": 110,
            "y": 124,
            "emitRate": 9566,
            "avgEmitRate": 315,
            "idleTime": 664,
            "eruptionTime": 40,
            "dormancyCycles": 73.8,
            "activeCycles": 100.0
          },
          {
            "id": "hot_water",
            "x": 147,
            "y": 166,
            "emitRate": 6486,
            "avgEmitRate": 2398,
            "idleTime": 190,
            "eruptionTime": 492,
            "dormancyCycles": 77.3,
            "activeCycles": 81.3
          },
          {
            "id": "molten_copper",
            "x": 55,
            "y": 108,
            "emitRate": 10182,
            "avgEmitRate": 314,
            "idleTime": 790,
            "eruptionTime": 41,
            "dormancyCycles": 49.4,
            "activeCycles": 84.2
          },
          {
            "id": "slimy_po2",
            "x": 144,
            "y": 115,
            "emitRate": 332,
            "avgEmitRate": 106,
            "idleTime": 357,
            "eruptionTime": 365,
            "dormancyCycles": 34.2,
            "activeCycles": 59.3
          },
          {
            "id": "hot_co2",
            "x": 118,
            "y": 144,
            "emitRate": 533,
            "avgEmitRate": 120,
            "idleTime": 439,
            "eruptionTime": 220,
            "dormancyCycles": 38.3,
            "activeCycles": 79.3
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
          "MetalRich"
        ],
        "biomePaths": "FrozenWastes:64,128 64,50 52,48 47,37 37,35 34,30 19,28 15,36 0,37 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 36,
            "y": 48
          },
          {
            "id": "GravitasPedestal",
            "x": 37,
            "y": 112
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 31,
            "y": 119,
            "emitRate": 7673,
            "avgEmitRate": 357,
            "idleTime": 754,
            "eruptionTime": 61,
            "dormancyCycles": 45.4,
            "activeCycles": 73.3
          },
          {
            "id": "molten_iron",
            "x": 15,
            "y": 71,
            "emitRate": 9944,
            "avgEmitRate": 268,
            "idleTime": 611,
            "eruptionTime": 34,
            "dormancyCycles": 51.0,
            "activeCycles": 54.6
          },
          {
            "id": "molten_iron",
            "x": 13,
            "y": 98,
            "emitRate": 15653,
            "avgEmitRate": 366,
            "idleTime": 765,
            "eruptionTime": 25,
            "dormancyCycles": 20.5,
            "activeCycles": 55.2
          },
          {
            "id": "molten_iron",
            "x": 33,
            "y": 78,
            "emitRate": 5809,
            "avgEmitRate": 244,
            "idleTime": 673,
            "eruptionTime": 62,
            "dormancyCycles": 65.7,
            "activeCycles": 65.0
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
          "CrashedSatellites"
        ],
        "biomePaths": "BoggyMarsh:64,67 64,35 51,35 46,41 36,41 30,35 28,36 17,29 3,41 0,41 0,62 12,62 17,78 29,76 30,59 33,57 45,60 48,67\nToxicJungle:17,78 12,62 0,62 0,80 16,79;49,82 44,76 32,78 29,76 30,59 33,57 45,60 48,67 64,67 64,81\nMagmaCore:64,96 64,81 49,82 44,76 32,78 29,76 17,78 16,79 0,80 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 35,
            "y": 50
          },
          {
            "id": "GravitasPedestal",
            "x": 21,
            "y": 50
          },
          {
            "id": "SapTree",
            "x": 28,
            "y": 50
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 31,
            "y": 78
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 45,
            "y": 51
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 24,
            "y": 37
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 13,
            "y": 74,
            "emitRate": 8967,
            "avgEmitRate": 240,
            "idleTime": 710,
            "eruptionTime": 39,
            "dormancyCycles": 42.1,
            "activeCycles": 44.1
          },
          {
            "id": "molten_tungsten",
            "x": 29,
            "y": 87,
            "emitRate": 9779,
            "avgEmitRate": 319,
            "idleTime": 680,
            "eruptionTime": 40,
            "dormancyCycles": 58.1,
            "activeCycles": 83.2
          },
          {
            "id": "molten_tungsten",
            "x": 57,
            "y": 90,
            "emitRate": 7771,
            "avgEmitRate": 348,
            "idleTime": 736,
            "eruptionTime": 57,
            "dormancyCycles": 29.9,
            "activeCycles": 50.7
          },
          {
            "id": "chlorine_gas",
            "x": 48,
            "y": 70,
            "emitRate": 349,
            "avgEmitRate": 112,
            "idleTime": 349,
            "eruptionTime": 371,
            "dormancyCycles": 44.8,
            "activeCycles": 74.2
          },
          {
            "id": "hot_hydrogen",
            "x": 36,
            "y": 63,
            "emitRate": 416,
            "avgEmitRate": 79,
            "idleTime": 363,
            "eruptionTime": 172,
            "dormancyCycles": 47.0,
            "activeCycles": 67.3
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
        "biomePaths": "MagmaCore:64,51 64,31 48,33 46,30 33,31 29,38 18,39 13,33 0,33 0,52 14,50 22,59 35,50 40,51 48,45;64,96 64,58 47,65 44,63 33,71 22,64 16,69 0,66 0,96\nOilField:64,58 64,51 48,45 40,51 35,50 22,59 14,50 0,52 0,66 16,69 22,64 33,71 44,63 47,65",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 35,
            "y": 58
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 11,
            "y": 65,
            "emitRate": 267671,
            "avgEmitRate": 1145,
            "idleTime": 9183,
            "eruptionTime": 69,
            "dormancyCycles": 70.1,
            "activeCycles": 95.3
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
        "biomePaths": "Moo:96,63 96,34 77,30 71,39 55,30 47,42 36,39 33,29 19,28 15,33 0,33 0,69 16,63 23,68 34,60 41,61 44,66 61,65 64,62 78,62 79,63\nFrozenWastes:96,80 96,63 79,63 78,62 64,62 61,65 44,66 41,61 34,60 23,68 16,63 0,69 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 78,
            "y": 37
          },
          {
            "id": "GravitasPedestal",
            "x": 71,
            "y": 37
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 15,
            "y": 46,
            "emitRate": 309,
            "avgEmitRate": 103,
            "idleTime": 273,
            "eruptionTime": 348,
            "dormancyCycles": 48.5,
            "activeCycles": 70.5
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
        "biomePaths": "Barren:80,137 80,32 65,33 60,42 49,42 44,37 36,37 27,48 21,48 14,40 0,41 0,142 17,149 24,141 38,149 46,139 60,144 66,136;80,174 80,154 66,156 61,153 51,159 39,154 34,159 18,159 0,161 0,174\nSwamp:80,154 80,137 66,136 60,144 46,139 38,149 24,141 17,149 0,142 0,161 18,159 34,159 39,154 51,159 61,153 66,156",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 49,
            "y": 156
          },
          {
            "id": "GravitasPedestal",
            "x": 51,
            "y": 156
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "x": 29,
            "y": 120,
            "emitRate": 9326,
            "avgEmitRate": 2406,
            "idleTime": 224,
            "eruptionTime": 267,
            "dormancyCycles": 44.9,
            "activeCycles": 40.4
          },
          {
            "id": "salt_water",
            "x": 65,
            "y": 80,
            "emitRate": 8078,
            "avgEmitRate": 2731,
            "idleTime": 253,
            "eruptionTime": 357,
            "dormancyCycles": 47.1,
            "activeCycles": 64.2
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
        "biomePaths": "Barren:35,77 35,66 21,59 20,57 18,56 0,58 0,75 15,76 17,78 31,80;96,78 96,48 80,47 76,61 62,58 55,65 56,75 64,79 75,76 80,80\nFrozenWastes:96,96 96,78 80,80 75,76 64,79 56,75 48,81 35,77 31,80 17,78 15,76 0,75 0,96\nSandstone:56,75 55,65 43,60 35,66 35,77 48,81",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 20,
            "y": 80
          },
          {
            "id": "GravitasPedestal",
            "x": 24,
            "y": 80
          },
          {
            "id": "GeneShuffler",
            "x": 22,
            "y": 74
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 56,
            "y": 82,
            "emitRate": 4695,
            "avgEmitRate": 1327,
            "idleTime": 313,
            "eruptionTime": 322,
            "dormancyCycles": 66.2,
            "activeCycles": 83.3
          },
          {
            "id": "hot_steam",
            "x": 36,
            "y": 83,
            "emitRate": 1955,
            "avgEmitRate": 760,
            "idleTime": 223,
            "eruptionTime": 353,
            "dormancyCycles": 41.5,
            "activeCycles": 71.9
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
        "q": 3,
        "r": -1
      },
      {
        "id": "TundraMoonlet",
        "q": -5,
        "r": 3
      },
      {
        "id": "MarshyMoonlet",
        "q": 0,
        "r": -5
      },
      {
        "id": "NiobiumMoonlet",
        "q": 5,
        "r": 1
      },
      {
        "id": "MooMoonlet",
        "q": -3,
        "r": 6
      },
      {
        "id": "WaterMoonlet",
        "q": -6,
        "r": -1
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -8,
        "r": 8
      },
      {
        "id": "TemporalTear",
        "q": 4,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -3,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 9,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 8,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -11,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -10,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -8,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -7,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 1,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 2,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 1,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 1,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 3,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -4,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 0,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -7,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 8,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 10,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -11,
        "r": 4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": -2,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": 6,
        "r": -2
      }
    ]
  },
  {
    "coordinate": "V-LUSH-C-1740050187-0-0-0",
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
          "DeepOil",
          "GeoActive",
          "IrregularOil"
        ],
        "biomePaths": "Forest:31,282 21,268 0,268 0,299 26,297;152,189 136,181 138,164 127,157 118,163 101,155 93,164 78,163 77,184 72,187 73,207 80,211 81,229 93,234 104,220 115,221 126,233 138,228 136,208 151,201\nRust:34,309 26,297 0,299 0,324 24,328 28,326;83,306 67,290 83,271 103,281 104,300;183,195 168,180 170,167 183,160 205,174 206,180;240,160 240,125 224,125 211,142 217,157;220,328 210,308 191,309 184,323 165,325 156,306 163,293 183,294 187,282 210,277 218,295 240,295 240,326\nBoggyMarsh:52,309 34,309 26,297 31,282 49,278 63,291;78,163 75,159 51,159 44,171 50,184 72,187 77,184;82,263 61,253 63,238 81,229 93,234 96,247;156,105 154,87 142,79 124,89 124,105 138,113;166,229 166,210 151,201 136,208 138,228 155,236;168,180 152,189 136,181 138,164 154,155 170,167;211,142 217,157 205,174 183,160 186,140 189,138 194,111 211,109 224,125;240,214 240,182 212,185 214,213;240,270 240,242 218,242 208,255 188,251 175,265 175,267 187,282 210,277 213,271\nOcean:29,170 20,151 0,152 0,184 19,184;32,231 19,211 0,213 0,242 27,243;53,109 47,88 30,86 19,103 26,117 48,117;79,135 53,130 45,144 51,159 75,159;104,333 83,330 78,322 83,306 104,300 106,301 113,321;155,252 155,236 138,228 126,233 115,221 104,220 93,234 96,247 117,254 121,252 142,262;240,182 240,160 217,157 205,174 206,180 212,185\nToxicJungle:53,130 48,117 26,117 18,131 24,144 45,144;114,275 103,281 83,271 67,290 63,291 49,278 53,258 61,253 82,263 96,247 117,254;138,113 124,105 109,113 109,133 128,140 137,133;163,293 161,283 143,274 128,285 128,292 139,307 156,306;214,213 212,185 206,180 183,195 183,200 200,219 208,219;218,333 195,341 184,323 191,309 210,308 220,328;224,125 211,109 194,111 185,103 186,85 208,78 219,93 240,91 240,125\nOilField:26,117 19,103 0,102 0,130 18,131;53,258 30,250 27,243 0,242 0,268 21,268 31,282 49,278;77,88 54,80 47,88 53,109 75,104;81,229 80,211 73,207 72,187 50,184 44,171 51,159 45,144 24,144 20,151 29,170 19,184 0,184 0,213 19,211 27,198 43,197 54,213 51,226 63,238;124,105 124,89 113,82 96,91 96,105 109,113;154,155 154,141 137,133 128,140 109,133 100,139 79,134 79,135 75,159 78,163 93,164 101,155 118,163 127,157 138,164;161,283 143,274 128,285 114,275 117,254 121,252 142,262 155,252 175,265 175,267;166,210 151,201 152,189 168,180 183,195 183,200;218,295 210,277 213,271 240,270 240,295;240,351 240,326 220,328 218,333 195,341 184,323 165,325 156,306 139,307 128,292 106,301 113,321 104,333 83,330 78,322 83,306 67,290 63,291 52,309 34,309 28,326 24,328 0,324 0,346 21,345 26,350 47,347 52,340 53,340 78,346 99,352 106,346 127,352 136,346 154,355 162,348 183,355 194,347 212,358 223,349\nSwamp:61,253 53,258 30,250 27,243 32,231 19,211 27,198 43,197 54,213 51,226 63,238;100,139 79,134 79,135 53,130 48,117 53,109 75,104 82,110 96,105 109,113 109,133;189,138 186,140 183,160 170,167 154,155 154,141 137,133 138,113 156,105 154,87 175,75 186,85 185,103 194,111;240,242 240,214 214,213 208,219 200,219 183,200 166,210 166,229 155,236 155,252 175,265 188,251 208,255 218,242\nBarren:240,91 240,65 211,63 210,61 186,54 175,63 156,52 141,62 127,54 111,62 99,56 85,62 71,54 54,62 42,55 29,58 22,71 0,72 0,102 19,103 30,86 47,88 54,80 77,88 83,85 96,91 113,82 124,89 142,79 154,87 175,75 186,85 208,78 219,93\nRadioactive:24,144 18,131 0,130 0,152 20,151;82,110 75,104 77,88 83,85 96,91 96,105;128,292 128,285 114,275 103,281 104,300 106,301;187,282 175,267 161,283 163,293 183,294\nMagmaCore:240,380 240,351 223,349 212,358 194,347 183,355 162,348 154,355 136,346 127,352 106,346 99,352 78,346 53,340 52,340 47,347 26,350 21,345 0,346 0,380",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 110,
            "y": 199
          },
          {
            "id": "WarpConduitSender",
            "x": 129,
            "y": 129
          },
          {
            "id": "WarpConduitReceiver",
            "x": 191,
            "y": 201
          },
          {
            "id": "GravitasPedestal",
            "x": 184,
            "y": 131
          },
          {
            "id": "WarpReceiver",
            "x": 205,
            "y": 231
          },
          {
            "id": "WarpPortal",
            "x": 204,
            "y": 225
          },
          {
            "id": "GeneShuffler",
            "x": 185,
            "y": 315
          },
          {
            "id": "GeneShuffler",
            "x": 171,
            "y": 213
          },
          {
            "id": "GeneShuffler",
            "x": 186,
            "y": 341
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 152,
            "y": 294,
            "emitRate": 4698,
            "avgEmitRate": 1534,
            "idleTime": 201,
            "eruptionTime": 214,
            "dormancyCycles": 34.4,
            "activeCycles": 59.3
          },
          {
            "id": "chlorine_gas",
            "x": 43,
            "y": 121,
            "emitRate": 426,
            "avgEmitRate": 116,
            "idleTime": 439,
            "eruptionTime": 348,
            "dormancyCycles": 56.4,
            "activeCycles": 90.7
          },
          {
            "id": "steam",
            "x": 75,
            "y": 180,
            "emitRate": 5454,
            "avgEmitRate": 1546,
            "idleTime": 469,
            "eruptionTime": 432,
            "dormancyCycles": 27.5,
            "activeCycles": 39.8
          },
          {
            "id": "methane",
            "x": 152,
            "y": 179,
            "emitRate": 252,
            "avgEmitRate": 107,
            "idleTime": 238,
            "eruptionTime": 521,
            "dormancyCycles": 52.1,
            "activeCycles": 85.1
          },
          {
            "id": "salt_water",
            "x": 85,
            "y": 314,
            "emitRate": 9890,
            "avgEmitRate": 3358,
            "idleTime": 269,
            "eruptionTime": 361,
            "dormancyCycles": 52.5,
            "activeCycles": 76.5
          },
          {
            "id": "OilWell",
            "x": 42,
            "y": 184,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 124,
            "y": 318,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 66,
            "y": 205,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "hot_co2",
            "x": 21,
            "y": 293,
            "emitRate": 313,
            "avgEmitRate": 85,
            "idleTime": 401,
            "eruptionTime": 498,
            "dormancyCycles": 59.7,
            "activeCycles": 57.4
          },
          {
            "id": "big_volcano",
            "x": 15,
            "y": 247,
            "emitRate": 248914,
            "avgEmitRate": 1014,
            "idleTime": 9358,
            "eruptionTime": 73,
            "dormancyCycles": 78.6,
            "activeCycles": 86.8
          },
          {
            "id": "steam",
            "x": 96,
            "y": 298,
            "emitRate": 3742,
            "avgEmitRate": 1234,
            "idleTime": 281,
            "eruptionTime": 321,
            "dormancyCycles": 43.0,
            "activeCycles": 69.8
          },
          {
            "id": "oil_drip",
            "x": 133,
            "y": 339,
            "emitRate": 299,
            "avgEmitRate": 195,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.3
          },
          {
            "id": "big_volcano",
            "x": 88,
            "y": 341,
            "emitRate": 216958,
            "avgEmitRate": 1197,
            "idleTime": 9003,
            "eruptionTime": 81,
            "dormancyCycles": 46.5,
            "activeCycles": 74.4
          },
          {
            "id": "hot_co2",
            "x": 24,
            "y": 185,
            "emitRate": 395,
            "avgEmitRate": 94,
            "idleTime": 345,
            "eruptionTime": 268,
            "dormancyCycles": 38.3,
            "activeCycles": 45.4
          },
          {
            "id": "hot_steam",
            "x": 34,
            "y": 257,
            "emitRate": 1536,
            "avgEmitRate": 572,
            "idleTime": 171,
            "eruptionTime": 372,
            "dormancyCycles": 69.6,
            "activeCycles": 83.1
          },
          {
            "id": "salt_water",
            "x": 62,
            "y": 231,
            "emitRate": 8533,
            "avgEmitRate": 2852,
            "idleTime": 210,
            "eruptionTime": 260,
            "dormancyCycles": 45.8,
            "activeCycles": 70.2
          },
          {
            "id": "big_volcano",
            "x": 37,
            "y": 336,
            "emitRate": 237525,
            "avgEmitRate": 1266,
            "idleTime": 7437,
            "eruptionTime": 61,
            "dormancyCycles": 45.8,
            "activeCycles": 87.3
          },
          {
            "id": "molten_aluminum",
            "x": 140,
            "y": 149,
            "emitRate": 9278,
            "avgEmitRate": 351,
            "idleTime": 648,
            "eruptionTime": 41,
            "dormancyCycles": 45.3,
            "activeCycles": 80.9
          },
          {
            "id": "steam",
            "x": 133,
            "y": 291,
            "emitRate": 4053,
            "avgEmitRate": 1136,
            "idleTime": 304,
            "eruptionTime": 266,
            "dormancyCycles": 56.1,
            "activeCycles": 84.2
          },
          {
            "id": "slush_water",
            "x": 147,
            "y": 320,
            "emitRate": 3571,
            "avgEmitRate": 1446,
            "idleTime": 87,
            "eruptionTime": 154,
            "dormancyCycles": 46.2,
            "activeCycles": 79.7
          },
          {
            "id": "liquid_sulfur",
            "x": 16,
            "y": 197,
            "emitRate": 7127,
            "avgEmitRate": 1690,
            "idleTime": 368,
            "eruptionTime": 294,
            "dormancyCycles": 69.3,
            "activeCycles": 79.3
          },
          {
            "id": "methane",
            "x": 49,
            "y": 200,
            "emitRate": 418,
            "avgEmitRate": 113,
            "idleTime": 334,
            "eruptionTime": 256,
            "dormancyCycles": 38.9,
            "activeCycles": 64.1
          },
          {
            "id": "slush_water",
            "x": 41,
            "y": 304,
            "emitRate": 2965,
            "avgEmitRate": 1193,
            "idleTime": 151,
            "eruptionTime": 489,
            "dormancyCycles": 52.7,
            "activeCycles": 58.6
          },
          {
            "id": "molten_aluminum",
            "x": 158,
            "y": 190,
            "emitRate": 9567,
            "avgEmitRate": 319,
            "idleTime": 714,
            "eruptionTime": 43,
            "dormancyCycles": 54.9,
            "activeCycles": 77.5
          },
          {
            "id": "OilWell",
            "x": 149,
            "y": 152,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 107,
            "y": 156,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 102,
            "y": 102,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 54,
            "y": 224,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 29,
            "y": 177,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 48,
            "y": 193,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 15,
            "y": 191,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 41,
            "y": 157,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 167,
            "y": 198,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 32,
            "y": 266,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 69,
            "y": 319,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 60,
            "y": 91,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 83,
            "y": 150,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 121,
            "y": 261,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 10,
            "y": 266,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 234,
            "y": 291,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 41,
            "y": 333,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 16,
            "y": 113,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 150,
            "y": 330,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 124,
            "y": 300,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 155,
            "y": 278,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
          "SlimeSplats",
          "BouldersMedium"
        ],
        "biomePaths": "Sandstone:129,128 123,130 105,120 95,136 78,133 74,125 59,124 51,106 45,105 38,89 45,79 57,77 65,83 81,75 94,86 103,81 106,65 114,60 125,63 129,79 117,88 118,101 134,109 135,113\nToxicJungle:106,65 89,56 82,59 70,53 69,38 56,30 43,42 27,34 16,49 25,63 17,75 25,89 16,100 0,100 0,127 12,126 24,140 38,132 33,115 45,105 38,89 45,79 57,77 65,83 81,75 94,86 103,81;160,95 160,66 153,66 138,82 144,94\nWasteland:25,89 17,75 25,63 16,49 0,48 0,100 16,100;59,124 51,106 45,105 33,115 38,132 49,135;140,138 129,128 135,113 134,109 118,101 117,88 129,79 125,63 114,60 106,65 89,56 95,40 113,40 116,37 137,42 139,40 160,41 160,66 153,66 138,82 144,94 160,95 160,131\nRadioactive:160,156 160,131 140,138 129,128 123,130 105,120 95,136 78,133 74,125 59,124 49,135 38,132 24,140 12,126 0,127 0,152 22,151 22,152 19,176 43,176 41,158 52,148 63,152 72,149 85,159 98,153 109,176 140,176 139,155\nFrozenWastes:22,152 22,151 0,152 0,176 19,176;109,176 98,153 85,159 72,149 63,152 52,148 41,158 43,176;160,176 160,156 139,155 140,176",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "x": 80,
            "y": 122
          },
          {
            "id": "WarpConduitReceiver",
            "x": 70,
            "y": 93
          },
          {
            "id": "WarpPortal",
            "x": 77,
            "y": 108
          },
          {
            "id": "WarpReceiver",
            "x": 96,
            "y": 108
          },
          {
            "id": "GeneShuffler",
            "x": 68,
            "y": 78
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 121,
            "y": 165,
            "emitRate": 460,
            "avgEmitRate": 132,
            "idleTime": 114,
            "eruptionTime": 131,
            "dormancyCycles": 45.1,
            "activeCycles": 52.3
          },
          {
            "id": "liquid_co2",
            "x": 79,
            "y": 143,
            "emitRate": 551,
            "avgEmitRate": 157,
            "idleTime": 205,
            "eruptionTime": 239,
            "dormancyCycles": 75.4,
            "activeCycles": 84.1
          },
          {
            "id": "steam",
            "x": 18,
            "y": 117,
            "emitRate": 6529,
            "avgEmitRate": 1490,
            "idleTime": 466,
            "eruptionTime": 310,
            "dormancyCycles": 51.3,
            "activeCycles": 68.4
          },
          {
            "id": "molten_aluminum",
            "x": 149,
            "y": 110,
            "emitRate": 8586,
            "avgEmitRate": 328,
            "idleTime": 707,
            "eruptionTime": 47,
            "dormancyCycles": 60.7,
            "activeCycles": 96.4
          },
          {
            "id": "molten_gold",
            "x": 25,
            "y": 73,
            "emitRate": 6945,
            "avgEmitRate": 276,
            "idleTime": 804,
            "eruptionTime": 60,
            "dormancyCycles": 47.3,
            "activeCycles": 64.1
          },
          {
            "id": "steam",
            "x": 97,
            "y": 119,
            "emitRate": 21567,
            "avgEmitRate": 1440,
            "idleTime": 513,
            "eruptionTime": 77,
            "dormancyCycles": 75.5,
            "activeCycles": 78.8
          },
          {
            "id": "filthy_water",
            "x": 129,
            "y": 137,
            "emitRate": 7943,
            "avgEmitRate": 2722,
            "idleTime": 260,
            "eruptionTime": 369,
            "dormancyCycles": 63.5,
            "activeCycles": 89.2
          },
          {
            "id": "liquid_co2",
            "x": 49,
            "y": 59,
            "emitRate": 487,
            "avgEmitRate": 137,
            "idleTime": 539,
            "eruptionTime": 479,
            "dormancyCycles": 48.1,
            "activeCycles": 71.3
          },
          {
            "id": "liquid_sulfur",
            "x": 149,
            "y": 77,
            "emitRate": 3539,
            "avgEmitRate": 1185,
            "idleTime": 152,
            "eruptionTime": 192,
            "dormancyCycles": 65.9,
            "activeCycles": 99.0
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
        "biomePaths": "FrozenWastes:64,128 64,35 46,36 45,32 31,26 21,35 21,36 15,41 0,39 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 28,
            "y": 37
          },
          {
            "id": "GravitasPedestal",
            "x": 41,
            "y": 91
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 20,
            "y": 61,
            "emitRate": 7155,
            "avgEmitRate": 293,
            "idleTime": 622,
            "eruptionTime": 50,
            "dormancyCycles": 34.1,
            "activeCycles": 42.3
          },
          {
            "id": "molten_iron",
            "x": 31,
            "y": 100,
            "emitRate": 8269,
            "avgEmitRate": 269,
            "idleTime": 834,
            "eruptionTime": 47,
            "dormancyCycles": 32.6,
            "activeCycles": 50.5
          },
          {
            "id": "molten_iron",
            "x": 53,
            "y": 71,
            "emitRate": 6211,
            "avgEmitRate": 325,
            "idleTime": 792,
            "eruptionTime": 74,
            "dormancyCycles": 68.6,
            "activeCycles": 107.8
          },
          {
            "id": "molten_iron",
            "x": 44,
            "y": 58,
            "emitRate": 8160,
            "avgEmitRate": 320,
            "idleTime": 559,
            "eruptionTime": 40,
            "dormancyCycles": 61.9,
            "activeCycles": 87.3
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
        "biomePaths": "BoggyMarsh:64,77 64,35 51,35 45,41 37,41 31,27 18,28 16,31 0,31 0,64 16,64 18,62 33,62 34,63 46,62 53,76\nToxicJungle:53,76 46,62 34,63 33,62 18,62 16,64 0,64 0,82 17,79 22,83 33,78 43,84\nFrozenWastes:64,96 64,77 53,76 43,84 33,78 22,83 17,79 0,82 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 30,
            "y": 54
          },
          {
            "id": "GravitasPedestal",
            "x": 16,
            "y": 54
          },
          {
            "id": "SapTree",
            "x": 23,
            "y": 54
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 5,
            "y": 77,
            "emitRate": 8081,
            "avgEmitRate": 314,
            "idleTime": 783,
            "eruptionTime": 55,
            "dormancyCycles": 46.7,
            "activeCycles": 68.0
          },
          {
            "id": "molten_tungsten",
            "x": 55,
            "y": 90,
            "emitRate": 7030,
            "avgEmitRate": 234,
            "idleTime": 755,
            "eruptionTime": 49,
            "dormancyCycles": 48.7,
            "activeCycles": 57.9
          },
          {
            "id": "molten_tungsten",
            "x": 6,
            "y": 90,
            "emitRate": 9193,
            "avgEmitRate": 242,
            "idleTime": 684,
            "eruptionTime": 39,
            "dormancyCycles": 75.4,
            "activeCycles": 71.4
          },
          {
            "id": "methane",
            "x": 12,
            "y": 71,
            "emitRate": 293,
            "avgEmitRate": 101,
            "idleTime": 249,
            "eruptionTime": 378,
            "dormancyCycles": 39.5,
            "activeCycles": 53.3
          },
          {
            "id": "chlorine_gas",
            "x": 32,
            "y": 64,
            "emitRate": 325,
            "avgEmitRate": 108,
            "idleTime": 266,
            "eruptionTime": 333,
            "dormancyCycles": 63.5,
            "activeCycles": 95.6
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
        "biomePaths": "MagmaCore:30,96 29,77 19,75 15,62 0,62 0,96;64,96 64,40 54,41 44,32 35,38 23,34 21,31 0,29 0,44 17,44 21,55 33,56 35,73 44,75 48,80 45,96\nOilField:48,80 44,75 35,73 33,56 21,55 17,44 0,44 0,62 15,62 19,75 29,77 30,96 45,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 23,
            "y": 71
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 33,
            "y": 85,
            "emitRate": 232683,
            "avgEmitRate": 1298,
            "idleTime": 9772,
            "eruptionTime": 90,
            "dormancyCycles": 68.6,
            "activeCycles": 107.8
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
        "biomePaths": "Moo:96,67 96,35 80,32 72,39 60,30 51,34 48,42 34,43 28,36 19,36 14,41 0,41 0,61 16,61 19,58 29,57 35,63 45,61 54,69 65,63 75,67 80,63\nFrozenWastes:96,80 96,67 80,63 75,67 65,63 54,69 45,61 35,63 29,57 19,58 16,61 0,61 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 24,
            "y": 48
          },
          {
            "id": "GravitasPedestal",
            "x": 17,
            "y": 48
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 84,
            "y": 46,
            "emitRate": 555,
            "avgEmitRate": 129,
            "idleTime": 386,
            "eruptionTime": 193,
            "dormancyCycles": 43.5,
            "activeCycles": 99.5
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
        "biomePaths": "Barren:80,136 80,32 67,32 62,41 53,41 47,33 35,34 31,39 18,39 15,35 0,35 0,136 13,136 19,132 25,133 32,145 44,142 47,132 57,127 59,127 66,135;80,174 80,155 63,155 60,152 52,152 42,163 28,155 22,157 15,154 0,158 0,174\nSwamp:80,155 80,136 66,135 59,127 57,127 47,132 44,142 32,145 25,133 19,132 13,136 0,136 0,158 15,154 22,157 28,155 42,163 52,152 60,152 63,155",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 22,
            "y": 154
          },
          {
            "id": "GravitasPedestal",
            "x": 24,
            "y": 154
          }
        ],
        "geysers": [
          {
            "id": "slush_water",
            "x": 52,
            "y": 64,
            "emitRate": 9697,
            "avgEmitRate": 1072,
            "idleTime": 260,
            "eruptionTime": 75,
            "dormancyCycles": 65.1,
            "activeCycles": 63.6
          },
          {
            "id": "filthy_water",
            "x": 31,
            "y": 90,
            "emitRate": 12881,
            "avgEmitRate": 3270,
            "idleTime": 308,
            "eruptionTime": 197,
            "dormancyCycles": 44.3,
            "activeCycles": 82.2
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
        "biomePaths": "Barren:34,76 32,62 21,60 17,48 0,50 0,84 17,79 21,83;80,82 74,78 62,87 52,75 53,72 71,66 72,67 80,62 82,50 96,47 96,76\nSandstone:53,72 48,59 39,57 32,62 34,76 42,80 52,75\nFrozenWastes:96,96 96,76 80,82 74,78 62,87 52,75 42,80 34,76 21,83 17,79 0,84 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 76,
            "y": 78
          },
          {
            "id": "GravitasPedestal",
            "x": 80,
            "y": 78
          },
          {
            "id": "GeneShuffler",
            "x": 78,
            "y": 72
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 48,
            "y": 84,
            "emitRate": 4377,
            "avgEmitRate": 1206,
            "idleTime": 238,
            "eruptionTime": 286,
            "dormancyCycles": 54.6,
            "activeCycles": 55.6
          },
          {
            "id": "steam",
            "x": 14,
            "y": 85,
            "emitRate": 4925,
            "avgEmitRate": 1136,
            "idleTime": 174,
            "eruptionTime": 121,
            "dormancyCycles": 65.5,
            "activeCycles": 84.6
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
        "q": -2,
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": 5,
        "r": -1
      },
      {
        "id": "MarshyMoonlet",
        "q": -1,
        "r": -5
      },
      {
        "id": "NiobiumMoonlet",
        "q": -5,
        "r": 2
      },
      {
        "id": "MooMoonlet",
        "q": -4,
        "r": 7
      },
      {
        "id": "WaterMoonlet",
        "q": 5,
        "r": -6
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 3,
        "r": 4
      },
      {
        "id": "TemporalTear",
        "q": -9,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 2,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 8,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 3,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -4,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 11,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 11,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -10,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 2,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -5,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -6,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 2,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 2,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 10,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 11,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -2,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -2,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -10,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -9,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -9,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -9,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -5,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -4,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": -2,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 10,
        "r": -7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -1,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -8,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -6,
        "r": -5
      }
    ]
  },
  {
    "coordinate": "V-FRST-C-92902282-0-0-0",
    "cluster": "V-FRST-C",
    "dlcs": [
      "FrostyPlanet",
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
          "Volcanoes",
          "BouldersSmall",
          "IrregularOil"
        ],
        "biomePaths": "Forest:153,210 160,228 151,237 130,227 121,231 115,252 98,250 92,231 72,230 71,206 69,204 71,180 91,180 92,164 106,158 119,165 134,157 146,169 145,180 163,194\nMagmaCore:106,158 101,136 100,136 79,153 75,154 67,175 71,180 91,180 92,164;146,169 134,157 138,146 149,143 164,157;240,248 240,223 217,229 217,243;240,380 240,344 216,345 211,348 193,344 182,351 162,344 151,350 136,343 119,353 101,345 89,351 72,339 70,339 58,351 29,347 28,346 0,345 0,380\nOilField:30,116 23,97 0,96 0,128 26,126;121,261 115,252 98,250 92,231 72,230 65,237 69,260 86,264 93,281 111,282;202,214 193,215 175,191 163,194 145,180 146,169 164,157 168,157 180,182 202,179 211,195;240,344 240,309 210,311 206,316 195,319 183,312 182,292 150,294 153,320 137,330 115,314 99,321 97,320 82,297 67,298 57,318 34,319 28,312 0,313 0,345 28,346 29,347 58,351 70,339 72,339 89,351 101,345 119,353 136,343 151,350 162,344 182,351 193,344 211,348 216,345\nOcean:36,263 31,248 0,246 0,313 28,312 34,288 28,279;79,153 75,154 62,142 65,116 86,114 100,136;115,314 99,321 97,320 82,297 93,281 111,282 120,295;213,278 204,254 189,253 178,263 182,292 203,292;204,152 209,163 202,179 180,182 168,157 164,157 149,143 153,119 174,115 174,87 180,83 207,89 211,96 205,113 217,130\nToxicJungle:61,113 60,88 34,82 23,97 30,116;57,318 34,319 28,312 34,288 56,285 67,298;72,230 71,206 69,204 71,180 67,175 39,174 32,189 39,206 34,218 0,218 0,246 31,248 36,263 57,269 69,260 65,237;240,165 240,130 217,130 204,152 209,163\nFrozenWastes:39,206 32,189 39,174 33,158 0,160 0,218 34,218;182,292 178,263 152,259 147,263 121,261 111,282 120,295 115,314 137,330 153,320 150,294;217,130 205,113 211,96 240,97 240,130\nRust:65,116 61,113 30,116 26,126 0,128 0,160 33,158 37,148 62,142;138,146 127,129 113,127 101,136 106,158 119,165 134,157;204,254 189,253 178,263 152,259 147,263 121,261 115,252 121,231 130,227 151,237 160,228 153,210 163,194 175,191 193,215 202,214 217,229 217,243;211,195 202,179 209,163 240,165 240,194\nBarren:174,115 174,87 152,83 146,62 131,57 115,70 99,66 83,78 72,76 65,59 35,56 30,65 0,63 0,96 23,97 34,82 60,88 61,113 65,116 86,114 95,105 105,105 121,91 139,96 144,114 153,119;211,96 207,89 180,83 181,60 204,50 216,64 240,62 240,97\nRadioactive:57,269 36,263 28,279 34,288 56,285;101,136 100,136 86,114 95,105 105,105 113,127;153,119 144,114 127,129 138,146 149,143;210,311 203,292 182,292 183,312 195,319 206,316\nSwamp:67,175 39,174 33,158 37,148 62,142 75,154;82,297 67,298 56,285 57,269 69,260 86,264 93,281;144,114 139,96 121,91 105,105 113,127 127,129;217,229 202,214 211,195 240,194 240,223;240,309 240,248 217,243 204,254 213,278 203,292 210,311",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 115,
            "y": 206
          },
          {
            "id": "WarpConduitSender",
            "x": 52,
            "y": 315
          },
          {
            "id": "WarpConduitReceiver",
            "x": 221,
            "y": 138
          },
          {
            "id": "MassiveHeatSink",
            "x": 221,
            "y": 108
          },
          {
            "id": "MassiveHeatSink",
            "x": 154,
            "y": 269
          },
          {
            "id": "MassiveHeatSink",
            "x": 30,
            "y": 185
          },
          {
            "id": "GravitasPedestal",
            "x": 130,
            "y": 100
          },
          {
            "id": "WarpReceiver",
            "x": 33,
            "y": 155
          },
          {
            "id": "WarpPortal",
            "x": 32,
            "y": 149
          },
          {
            "id": "GeneShuffler",
            "x": 220,
            "y": 321
          },
          {
            "id": "GeneShuffler",
            "x": 61,
            "y": 127
          },
          {
            "id": "GeneShuffler",
            "x": 55,
            "y": 203
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 44,
            "y": 226,
            "emitRate": 5311,
            "avgEmitRate": 1481,
            "idleTime": 216,
            "eruptionTime": 209,
            "dormancyCycles": 58.2,
            "activeCycles": 76.5
          },
          {
            "id": "chlorine_gas",
            "x": 34,
            "y": 112,
            "emitRate": 352,
            "avgEmitRate": 77,
            "idleTime": 397,
            "eruptionTime": 255,
            "dormancyCycles": 67.1,
            "activeCycles": 85.4
          },
          {
            "id": "salt_water",
            "x": 28,
            "y": 288,
            "emitRate": 8350,
            "avgEmitRate": 2923,
            "idleTime": 155,
            "eruptionTime": 341,
            "dormancyCycles": 99.9,
            "activeCycles": 103.7
          },
          {
            "id": "OilWell",
            "x": 180,
            "y": 339,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 87,
            "y": 325,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 73,
            "y": 255,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "big_volcano",
            "x": 147,
            "y": 156,
            "emitRate": 233556,
            "avgEmitRate": 998,
            "idleTime": 9938,
            "eruptionTime": 73,
            "dormancyCycles": 53.9,
            "activeCycles": 75.7
          },
          {
            "id": "big_volcano",
            "x": 94,
            "y": 152,
            "emitRate": 293983,
            "avgEmitRate": 1122,
            "idleTime": 8954,
            "eruptionTime": 61,
            "dormancyCycles": 39.3,
            "activeCycles": 51.1
          },
          {
            "id": "big_volcano",
            "x": 80,
            "y": 169,
            "emitRate": 253695,
            "avgEmitRate": 1070,
            "idleTime": 8756,
            "eruptionTime": 66,
            "dormancyCycles": 54.0,
            "activeCycles": 70.5
          },
          {
            "id": "hot_hydrogen",
            "x": 174,
            "y": 320,
            "emitRate": 326,
            "avgEmitRate": 106,
            "idleTime": 311,
            "eruptionTime": 359,
            "dormancyCycles": 44.8,
            "activeCycles": 68.2
          },
          {
            "id": "molten_cobalt",
            "x": 92,
            "y": 264,
            "emitRate": 9868,
            "avgEmitRate": 363,
            "idleTime": 606,
            "eruptionTime": 37,
            "dormancyCycles": 51.9,
            "activeCycles": 93.8
          },
          {
            "id": "liquid_co2",
            "x": 199,
            "y": 171,
            "emitRate": 570,
            "avgEmitRate": 128,
            "idleTime": 397,
            "eruptionTime": 298,
            "dormancyCycles": 58.6,
            "activeCycles": 64.1
          },
          {
            "id": "hot_po2",
            "x": 198,
            "y": 298,
            "emitRate": 301,
            "avgEmitRate": 101,
            "idleTime": 194,
            "eruptionTime": 273,
            "dormancyCycles": 41.0,
            "activeCycles": 54.6
          },
          {
            "id": "liquid_sulfur",
            "x": 54,
            "y": 335,
            "emitRate": 6826,
            "avgEmitRate": 1804,
            "idleTime": 214,
            "eruptionTime": 163,
            "dormancyCycles": 49.0,
            "activeCycles": 76.8
          },
          {
            "id": "slush_water",
            "x": 176,
            "y": 158,
            "emitRate": 5283,
            "avgEmitRate": 1392,
            "idleTime": 413,
            "eruptionTime": 315,
            "dormancyCycles": 44.2,
            "activeCycles": 69.1
          },
          {
            "id": "big_volcano",
            "x": 95,
            "y": 113,
            "emitRate": 293854,
            "avgEmitRate": 1114,
            "idleTime": 8383,
            "eruptionTime": 56,
            "dormancyCycles": 57.4,
            "activeCycles": 77.6
          },
          {
            "id": "oil_drip",
            "x": 178,
            "y": 103,
            "emitRate": 309,
            "avgEmitRate": 177,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.3
          },
          {
            "id": "small_volcano",
            "x": 21,
            "y": 108,
            "emitRate": 115543,
            "avgEmitRate": 523,
            "idleTime": 11643,
            "eruptionTime": 97,
            "dormancyCycles": 74.8,
            "activeCycles": 90.2
          },
          {
            "id": "liquid_co2",
            "x": 74,
            "y": 312,
            "emitRate": 546,
            "avgEmitRate": 185,
            "idleTime": 369,
            "eruptionTime": 303,
            "dormancyCycles": 34.3,
            "activeCycles": 103.9
          },
          {
            "id": "hot_water",
            "x": 103,
            "y": 267,
            "emitRate": 14332,
            "avgEmitRate": 2561,
            "idleTime": 393,
            "eruptionTime": 172,
            "dormancyCycles": 51.2,
            "activeCycles": 72.7
          },
          {
            "id": "hot_water",
            "x": 43,
            "y": 251,
            "emitRate": 9976,
            "avgEmitRate": 2664,
            "idleTime": 334,
            "eruptionTime": 264,
            "dormancyCycles": 34.5,
            "activeCycles": 52.8
          },
          {
            "id": "OilWell",
            "x": 10,
            "y": 125,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 92,
            "y": 249,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 113,
            "y": 271,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 159,
            "y": 315,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 161,
            "y": 166,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 180,
            "y": 191,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
          "Geodes",
          "SubsurfaceOcean"
        ],
        "biomePaths": "Sandstone:127,77 119,61 105,64 102,77 91,83 82,78 70,81 59,71 47,74 37,65 22,68 22,81 33,90 43,87 53,96 49,110 60,121 60,126 69,134 81,132 91,141 103,136 104,119 107,116 107,103 117,95 117,86\nOcean:160,68 160,43 143,44 137,51 124,53 116,40 101,41 95,54 83,56 80,54 76,38 59,36 52,47 42,49 35,42 21,43 16,39 0,40 0,64 18,64 22,68 37,65 47,74 59,71 70,81 82,78 91,83 102,77 105,64 119,61 127,77 137,78 145,68\nWasteland:44,137 34,130 36,114 27,106 33,90 43,87 53,96 49,110 60,121 60,126;133,104 134,109 122,120 125,134 113,143 103,136 104,119 107,116 107,103 117,95 117,86 127,77 137,78 143,92;141,135 143,116 160,114 160,138\nRadioactive:160,155 160,138 141,135 137,138 125,134 113,143 103,136 91,141 81,132 69,134 60,126 44,137 34,130 23,134 10,123 0,124 0,176 16,176 20,152 37,156 39,176 76,176 77,157 89,153 98,160 114,154 119,158 119,176 140,176 140,157\nToxicJungle:36,114 27,106 33,90 22,81 22,68 18,64 0,64 0,124 10,123 23,134 34,130;160,114 160,68 145,68 137,78 143,92 133,104 134,109 122,120 125,134 137,138 141,135 143,116\nFrozenWastes:16,176 20,152 37,156 39,176;76,176 77,157 89,153 98,160 114,154 119,158 119,176;160,176 160,155 140,157 140,176",
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "x": 118,
            "y": 84
          },
          {
            "id": "WarpConduitSender",
            "x": 22,
            "y": 78
          },
          {
            "id": "WarpPortal",
            "x": 73,
            "y": 92
          },
          {
            "id": "WarpReceiver",
            "x": 92,
            "y": 92
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 122,
            "y": 164,
            "emitRate": 409,
            "avgEmitRate": 161,
            "idleTime": 199,
            "eruptionTime": 347,
            "dormancyCycles": 51.1,
            "activeCycles": 83.1
          },
          {
            "id": "liquid_co2",
            "x": 51,
            "y": 154,
            "emitRate": 633,
            "avgEmitRate": 142,
            "idleTime": 335,
            "eruptionTime": 249,
            "dormancyCycles": 62.8,
            "activeCycles": 70.0
          },
          {
            "id": "steam",
            "x": 139,
            "y": 71,
            "emitRate": 3875,
            "avgEmitRate": 1291,
            "idleTime": 270,
            "eruptionTime": 376,
            "dormancyCycles": 38.9,
            "activeCycles": 52.1
          },
          {
            "id": "molten_copper",
            "x": 133,
            "y": 144,
            "emitRate": 9240,
            "avgEmitRate": 342,
            "idleTime": 724,
            "eruptionTime": 46,
            "dormancyCycles": 40.8,
            "activeCycles": 66.1
          },
          {
            "id": "molten_cobalt",
            "x": 48,
            "y": 167,
            "emitRate": 12369,
            "avgEmitRate": 329,
            "idleTime": 803,
            "eruptionTime": 33,
            "dormancyCycles": 34.2,
            "activeCycles": 67.8
          },
          {
            "id": "hot_steam",
            "x": 59,
            "y": 77,
            "emitRate": 2132,
            "avgEmitRate": 693,
            "idleTime": 256,
            "eruptionTime": 306,
            "dormancyCycles": 58.0,
            "activeCycles": 85.9
          },
          {
            "id": "slush_water",
            "x": 23,
            "y": 103,
            "emitRate": 6012,
            "avgEmitRate": 1623,
            "idleTime": 262,
            "eruptionTime": 215,
            "dormancyCycles": 50.9,
            "activeCycles": 75.7
          },
          {
            "id": "liquid_sulfur",
            "x": 89,
            "y": 103,
            "emitRate": 4882,
            "avgEmitRate": 1358,
            "idleTime": 319,
            "eruptionTime": 305,
            "dormancyCycles": 57.1,
            "activeCycles": 75.4
          },
          {
            "id": "slimy_po2",
            "x": 118,
            "y": 65,
            "emitRate": 379,
            "avgEmitRate": 101,
            "idleTime": 274,
            "eruptionTime": 216,
            "dormancyCycles": 64.8,
            "activeCycles": 98.8
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
          "LushCore"
        ],
        "biomePaths": "FrozenWastes:64,105 64,25 50,26 46,34 39,38 29,29 18,33 16,39 0,41 0,114 17,116 22,109 33,109 36,112 48,112 54,106\nForest:64,128 64,105 54,106 48,112 36,112 33,109 22,109 17,116 0,114 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 27,
            "y": 47
          },
          {
            "id": "GravitasPedestal",
            "x": 41,
            "y": 87
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 47,
            "y": 109,
            "emitRate": 14312,
            "avgEmitRate": 351,
            "idleTime": 785,
            "eruptionTime": 35,
            "dormancyCycles": 56.4,
            "activeCycles": 76.5
          },
          {
            "id": "molten_iron",
            "x": 16,
            "y": 112,
            "emitRate": 8723,
            "avgEmitRate": 334,
            "idleTime": 781,
            "eruptionTime": 44,
            "dormancyCycles": 32.5,
            "activeCycles": 82.9
          },
          {
            "id": "molten_iron",
            "x": 46,
            "y": 62,
            "emitRate": 7673,
            "avgEmitRate": 204,
            "idleTime": 671,
            "eruptionTime": 36,
            "dormancyCycles": 57.3,
            "activeCycles": 63.3
          },
          {
            "id": "molten_iron",
            "x": 27,
            "y": 70,
            "emitRate": 10293,
            "avgEmitRate": 380,
            "idleTime": 689,
            "eruptionTime": 40,
            "dormancyCycles": 44.7,
            "activeCycles": 92.2
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
        "biomePaths": "BoggyMarsh:64,76 64,30 48,29 44,35 32,31 23,40 19,40 13,31 0,31 0,48 11,49 17,62 21,63 31,51 34,51 44,63 42,68 44,76 49,80\nToxicJungle:44,76 42,68 44,63 34,51 31,51 21,63 17,62 11,49 0,48 0,76 16,81 21,77 32,84\nMagmaCore:64,96 64,76 49,80 44,76 32,84 21,77 16,81 0,76 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 41,
            "y": 43
          },
          {
            "id": "GravitasPedestal",
            "x": 27,
            "y": 43
          },
          {
            "id": "SapTree",
            "x": 34,
            "y": 43
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 27,
            "y": 63,
            "emitRate": 8002,
            "avgEmitRate": 305,
            "idleTime": 610,
            "eruptionTime": 44,
            "dormancyCycles": 36.4,
            "activeCycles": 49.0
          },
          {
            "id": "molten_tungsten",
            "x": 53,
            "y": 90,
            "emitRate": 11612,
            "avgEmitRate": 309,
            "idleTime": 809,
            "eruptionTime": 34,
            "dormancyCycles": 53.2,
            "activeCycles": 103.1
          },
          {
            "id": "molten_tungsten",
            "x": 41,
            "y": 89,
            "emitRate": 9095,
            "avgEmitRate": 334,
            "idleTime": 747,
            "eruptionTime": 43,
            "dormancyCycles": 41.8,
            "activeCycles": 84.6
          },
          {
            "id": "chlorine_gas",
            "x": 55,
            "y": 43,
            "emitRate": 425,
            "avgEmitRate": 139,
            "idleTime": 247,
            "eruptionTime": 202,
            "dormancyCycles": 30.9,
            "activeCycles": 82.2
          },
          {
            "id": "methane",
            "x": 14,
            "y": 62,
            "emitRate": 374,
            "avgEmitRate": 117,
            "idleTime": 330,
            "eruptionTime": 289,
            "dormancyCycles": 41.8,
            "activeCycles": 84.6
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
        "biomePaths": "MagmaCore:64,80 64,65 49,64 44,50 64,42 64,37 45,30 40,35 23,28 18,37 0,35 0,55 12,55 19,43 35,49 30,64 19,64 14,76 17,81 31,80 37,72 43,72 49,81\nOilField:35,49 19,43 12,55 0,55 0,76 14,76 19,64 30,64;64,65 64,42 44,50 49,64\nFrozenWastes:64,96 64,80 49,81 43,72 37,72 31,80 17,81 14,76 0,76 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 50,
            "y": 52
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 28,
            "y": 60,
            "emitRate": 241008,
            "avgEmitRate": 1096,
            "idleTime": 8862,
            "eruptionTime": 73,
            "dormancyCycles": 48.2,
            "activeCycles": 60.9
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
        "biomePaths": "Moo:96,67 96,33 81,33 78,28 65,27 59,40 53,41 50,39 44,23 28,32 24,31 17,36 0,31 0,67 19,64 22,69 41,63 41,62 51,59 60,63 66,60 78,64 78,65\nFrozenWastes:96,80 96,67 78,65 78,64 66,60 60,63 51,59 41,62 41,63 22,69 19,64 0,67 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 40,
            "y": 36
          },
          {
            "id": "GravitasPedestal",
            "x": 33,
            "y": 36
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 9,
            "y": 53,
            "emitRate": 291,
            "avgEmitRate": 94,
            "idleTime": 201,
            "eruptionTime": 230,
            "dormancyCycles": 43.7,
            "activeCycles": 66.9
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
        "biomePaths": "Barren:80,135 80,36 68,37 62,43 54,44 47,36 37,37 32,31 19,32 16,45 0,46 0,138 15,136 22,143 36,137 44,142 58,135 62,138;80,174 80,157 63,155 59,159 44,154 38,159 22,154 19,156 0,155 0,174\nSwamp:80,157 80,135 62,138 58,135 44,142 36,137 22,143 15,136 0,138 0,155 19,156 22,154 38,159 44,154 59,159 63,155",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 32,
            "y": 154
          },
          {
            "id": "GravitasPedestal",
            "x": 34,
            "y": 154
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "x": 56,
            "y": 106,
            "emitRate": 11003,
            "avgEmitRate": 2957,
            "idleTime": 360,
            "eruptionTime": 294,
            "dormancyCycles": 50.0,
            "activeCycles": 74.6
          },
          {
            "id": "filthy_water",
            "x": 63,
            "y": 75,
            "emitRate": 7555,
            "avgEmitRate": 2952,
            "idleTime": 267,
            "eruptionTime": 455,
            "dormancyCycles": 50.2,
            "activeCycles": 81.8
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
        "biomePaths": "Barren:34,78 30,66 20,64 17,58 0,57 0,78 13,77 24,88;85,61 78,57 67,62 57,56 48,60 50,78 66,76 71,81 80,78\nSandstone:50,78 48,60 40,57 30,66 34,78 48,81\nFrozenWastes:96,96 96,60 85,61 80,78 71,81 66,76 50,78 48,81 34,78 24,88 13,77 0,78 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 51,
            "y": 75
          },
          {
            "id": "GravitasPedestal",
            "x": 55,
            "y": 75
          },
          {
            "id": "GeneShuffler",
            "x": 53,
            "y": 69
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "x": 39,
            "y": 84,
            "emitRate": 3199,
            "avgEmitRate": 832,
            "idleTime": 326,
            "eruptionTime": 240,
            "dormancyCycles": 46.3,
            "activeCycles": 73.3
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
        "r": 1
      },
      {
        "id": "MooMoonlet",
        "q": -6,
        "r": 0
      },
      {
        "id": "WaterMoonlet",
        "q": 1,
        "r": 6
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -8,
        "r": 6
      },
      {
        "id": "TemporalTear",
        "q": -9,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 3,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -8,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -9,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -9,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 7,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 11,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -2,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 1,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 0,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -1,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 7,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -6,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 7,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -10,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -9,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -9,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 3,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -5,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -4,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": -3,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 0,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 2,
        "r": 2
      }
    ]
  },
  {
    "coordinate": "V-VOLCA-C-1945674763-0-0-0",
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
          "BouldersMedium",
          "GlaciersLarge"
        ],
        "biomePaths": "Sandstone:31,101 24,83 0,83 0,112 25,112;165,180 156,165 163,151 157,141 143,142 133,131 115,137 104,129 90,135 91,149 79,162 89,177 80,193 85,201 103,200 112,215 128,210 130,196 141,188 156,192;216,262 208,250 188,249 180,268 168,268 156,291 165,301 186,300 191,280 209,278\nMagmaCore:30,210 24,199 0,198 0,223 23,222;107,290 90,280 93,262 109,258 120,273;180,268 168,268 156,255 145,255 135,241 143,224 152,223 165,240 180,239 188,249;240,178 240,152 219,153 211,169 215,176;240,233 240,206 218,207 211,221 216,232;240,380 240,347 214,350 209,346 187,354 174,346 176,328 187,321 208,331 217,321 210,304 217,292 209,278 191,280 186,300 165,301 161,320 152,324 151,346 135,352 125,347 107,357 92,349 94,323 92,321 92,319 75,303 56,313 44,300 28,302 17,285 0,285 0,313 23,312 30,325 17,346 0,346 0,380\nOilField:30,325 23,312 0,313 0,346 17,346;165,301 156,291 144,290 130,308 109,297 92,319 92,321 94,323 92,349 107,357 125,347 135,352 151,346 152,324 161,320;214,350 209,346 187,354 174,346 176,328 187,321 208,331 217,321 210,304 217,292 240,292 240,347\nWasteland:32,124 25,112 0,112 0,141 25,141;32,266 23,253 0,253 0,285 17,285;92,319 75,303 77,286 90,280 107,290 109,297;116,243 107,229 84,232 77,224 85,201 80,193 89,177 79,162 63,160 54,182 32,180 24,199 30,210 51,210 59,223 49,242 52,249 64,255 80,250 93,262 109,258;168,268 156,255 145,255 133,274 144,290 156,291;183,210 162,208 152,223 143,224 128,210 130,196 141,188 156,192 165,180 156,165 163,151 184,151 192,169 186,180 192,190;208,250 188,249 180,239 188,220 211,221 216,232\nToxicJungle:59,223 51,210 30,210 23,222 0,223 0,253 23,253 32,240 49,242;79,162 63,160 54,182 32,180 26,169 32,154 57,152 60,137 79,129 90,135 91,149;211,169 192,169 184,151 163,151 157,141 143,142 133,131 137,110 157,110 166,121 182,120 192,138 209,137 219,153;218,207 208,190 215,176 240,178 240,206\nOcean:32,180 26,169 0,169 0,198 24,199;52,278 39,266 32,266 17,285 28,302 44,300;51,104 31,101 24,83 31,73 55,72 57,75;133,274 144,290 130,308 109,297 107,290 120,273 109,258 116,243 135,241 145,255;211,221 188,220 180,239 165,240 152,223 162,208 183,210 192,190 208,190 218,207;216,262 208,250 216,232 240,233 240,262\nFrozenWastes:79,129 78,108 51,104 46,122 32,124 25,141 0,141 0,169 26,169 32,154 57,152 60,137;90,280 77,286 75,303 56,313 44,300 52,278 61,276 64,255 80,250 93,262;219,153 209,137 192,138 182,120 190,107 208,106 216,92 240,92 240,152\nBarren:240,92 240,64 216,63 211,54 193,49 180,61 164,56 156,61 135,49 125,55 121,72 110,77 89,66 89,56 72,45 57,54 36,39 24,54 0,52 0,83 24,83 31,73 55,72 57,75 51,104 78,108 84,102 104,102 107,106 132,105 135,83 152,77 164,89 157,110 166,121 182,120 190,107 180,87 185,78 209,78 216,92\nRadioactive:46,122 32,124 25,112 31,101 51,104;61,276 52,278 39,266 32,266 23,253 32,240 49,242 52,249 64,255;208,190 192,190 186,180 192,169 211,169 215,176\nBoggyMarsh:143,224 128,210 112,215 103,200 85,201 77,224 84,232 107,229 116,243 135,241;164,89 152,77 135,83 132,105 107,106 104,102 84,102 78,108 79,129 90,135 104,129 115,137 133,131 137,110 157,110;208,106 190,107 180,87 185,78 209,78 216,92;217,292 209,278 216,262 240,262 240,292",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 122,
            "y": 173
          },
          {
            "id": "MassiveHeatSink",
            "x": 73,
            "y": 121
          },
          {
            "id": "MassiveHeatSink",
            "x": 205,
            "y": 131
          },
          {
            "id": "MassiveHeatSink",
            "x": 73,
            "y": 297
          },
          {
            "id": "WarpConduitSender",
            "x": 32,
            "y": 120
          },
          {
            "id": "WarpConduitReceiver",
            "x": 120,
            "y": 93
          },
          {
            "id": "GravitasPedestal",
            "x": 72,
            "y": 258
          },
          {
            "id": "WarpReceiver",
            "x": 32,
            "y": 256
          },
          {
            "id": "WarpPortal",
            "x": 31,
            "y": 250
          },
          {
            "id": "GeneShuffler",
            "x": 217,
            "y": 191
          },
          {
            "id": "GeneShuffler",
            "x": 149,
            "y": 298
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "x": 135,
            "y": 309,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 110,
            "y": 318,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 103,
            "y": 340,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "salt_water",
            "x": 44,
            "y": 285,
            "emitRate": 9542,
            "avgEmitRate": 3177,
            "idleTime": 389,
            "eruptionTime": 403,
            "dormancyCycles": 30.8,
            "activeCycles": 58.3
          },
          {
            "id": "steam",
            "x": 35,
            "y": 165,
            "emitRate": 6568,
            "avgEmitRate": 1693,
            "idleTime": 371,
            "eruptionTime": 217,
            "dormancyCycles": 44.3,
            "activeCycles": 103.0
          },
          {
            "id": "steam",
            "x": 127,
            "y": 130,
            "emitRate": 4102,
            "avgEmitRate": 1497,
            "idleTime": 248,
            "eruptionTime": 440,
            "dormancyCycles": 69.3,
            "activeCycles": 92.2
          },
          {
            "id": "methane",
            "x": 186,
            "y": 134,
            "emitRate": 380,
            "avgEmitRate": 92,
            "idleTime": 418,
            "eruptionTime": 349,
            "dormancyCycles": 62.5,
            "activeCycles": 72.1
          },
          {
            "id": "methane",
            "x": 119,
            "y": 218,
            "emitRate": 302,
            "avgEmitRate": 123,
            "idleTime": 257,
            "eruptionTime": 365,
            "dormancyCycles": 36.1,
            "activeCycles": 82.9
          },
          {
            "id": "salt_water",
            "x": 101,
            "y": 235,
            "emitRate": 10470,
            "avgEmitRate": 2562,
            "idleTime": 286,
            "eruptionTime": 235,
            "dormancyCycles": 78.0,
            "activeCycles": 92.3
          },
          {
            "id": "hot_water",
            "x": 21,
            "y": 163,
            "emitRate": 7704,
            "avgEmitRate": 2641,
            "idleTime": 369,
            "eruptionTime": 482,
            "dormancyCycles": 41.6,
            "activeCycles": 63.6
          },
          {
            "id": "slush_water",
            "x": 67,
            "y": 274,
            "emitRate": 5057,
            "avgEmitRate": 1237,
            "idleTime": 429,
            "eruptionTime": 342,
            "dormancyCycles": 51.7,
            "activeCycles": 63.7
          },
          {
            "id": "methane",
            "x": 76,
            "y": 169,
            "emitRate": 240,
            "avgEmitRate": 114,
            "idleTime": 127,
            "eruptionTime": 406,
            "dormancyCycles": 52.3,
            "activeCycles": 86.0
          },
          {
            "id": "hot_po2",
            "x": 219,
            "y": 117,
            "emitRate": 404,
            "avgEmitRate": 111,
            "idleTime": 344,
            "eruptionTime": 270,
            "dormancyCycles": 41.7,
            "activeCycles": 70.3
          },
          {
            "id": "molten_aluminum",
            "x": 85,
            "y": 149,
            "emitRate": 10725,
            "avgEmitRate": 347,
            "idleTime": 815,
            "eruptionTime": 44,
            "dormancyCycles": 57.4,
            "activeCycles": 100.7
          },
          {
            "id": "salt_water",
            "x": 136,
            "y": 337,
            "emitRate": 9483,
            "avgEmitRate": 3173,
            "idleTime": 326,
            "eruptionTime": 323,
            "dormancyCycles": 44.1,
            "activeCycles": 90.4
          },
          {
            "id": "oil_drip",
            "x": 38,
            "y": 186,
            "emitRate": 314,
            "avgEmitRate": 205,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.4
          },
          {
            "id": "oil_drip",
            "x": 109,
            "y": 303,
            "emitRate": 295,
            "avgEmitRate": 150,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.2
          },
          {
            "id": "slush_salt_water",
            "x": 55,
            "y": 258,
            "emitRate": 6638,
            "avgEmitRate": 1781,
            "idleTime": 215,
            "eruptionTime": 116,
            "dormancyCycles": 24.3,
            "activeCycles": 79.0
          },
          {
            "id": "hot_hydrogen",
            "x": 17,
            "y": 118,
            "emitRate": 373,
            "avgEmitRate": 88,
            "idleTime": 487,
            "eruptionTime": 433,
            "dormancyCycles": 95.3,
            "activeCycles": 95.8
          },
          {
            "id": "filthy_water",
            "x": 184,
            "y": 188,
            "emitRate": 11332,
            "avgEmitRate": 3008,
            "idleTime": 343,
            "eruptionTime": 234,
            "dormancyCycles": 47.6,
            "activeCycles": 90.5
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
          "MagmaVents",
          "BouldersSmall"
        ],
        "biomePaths": "Swamp:115,110 100,114 98,128 85,132 75,118 59,123 59,135 43,142 35,133 38,121 53,117 54,103 43,96 41,86 60,78 61,74 79,65 87,70 96,66 111,76 107,88 117,99\nFrozenWastes:102,176 101,153 93,152 81,162 66,154 58,160 58,176;118,73 111,76 96,66 87,70 79,65 61,74 53,60 60,49 76,51 82,43 91,42 101,51 112,49 122,60;143,64 136,57 139,43 160,43 160,63\nBoggyMarsh:60,49 56,39 41,36 35,41 22,40 14,50 0,50 0,76 14,75 21,64 36,64 39,60 53,60\nRust:39,85 36,64 21,64 14,75 0,76 0,125 13,125 24,110 16,100 22,86;54,103 43,96 28,110 38,121 53,117;85,132 75,118 59,123 59,135 67,143 84,135;137,84 143,64 160,63 160,87\nForest:60,78 41,86 43,96 28,110 24,110 16,100 22,86 39,85 36,64 39,60 53,60 61,74;142,107 138,115 145,127 141,135 125,138 119,133 106,135 98,128 100,114 115,110 117,99 107,88 111,76 118,73 122,60 136,57 143,64 137,84 160,87 160,104\nMagmaCore:38,121 28,110 24,110 13,125 22,135 35,133;122,155 103,152 101,153 93,152 84,135 85,132 98,128 106,135 119,133 125,138;149,150 141,135 145,127 138,115 142,107 160,104 160,150\nRadioactive:93,152 84,135 67,143 59,135 43,142 35,133 22,135 13,125 0,125 0,176 58,176 58,160 66,154 81,162;160,176 160,150 149,150 141,135 125,138 122,155 103,152 101,153 102,176",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 60,
            "y": 61
          },
          {
            "id": "WarpConduitSender",
            "x": 116,
            "y": 81
          },
          {
            "id": "WarpConduitReceiver",
            "x": 28,
            "y": 93
          },
          {
            "id": "WarpReceiver",
            "x": 90,
            "y": 98
          },
          {
            "id": "WarpPortal",
            "x": 68,
            "y": 98
          },
          {
            "id": "GeneShuffler",
            "x": 145,
            "y": 75
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 129,
            "y": 152,
            "emitRate": 449,
            "avgEmitRate": 130,
            "idleTime": 108,
            "eruptionTime": 105,
            "dormancyCycles": 58.6,
            "activeCycles": 84.0
          },
          {
            "id": "liquid_co2",
            "x": 144,
            "y": 161,
            "emitRate": 429,
            "avgEmitRate": 126,
            "idleTime": 322,
            "eruptionTime": 387,
            "dormancyCycles": 30.0,
            "activeCycles": 34.7
          },
          {
            "id": "slush_salt_water",
            "x": 85,
            "y": 55,
            "emitRate": 5326,
            "avgEmitRate": 1559,
            "idleTime": 308,
            "eruptionTime": 314,
            "dormancyCycles": 33.0,
            "activeCycles": 45.4
          },
          {
            "id": "slush_water",
            "x": 111,
            "y": 63,
            "emitRate": 6491,
            "avgEmitRate": 1379,
            "idleTime": 483,
            "eruptionTime": 267,
            "dormancyCycles": 64.9,
            "activeCycles": 96.0
          },
          {
            "id": "hot_hydrogen",
            "x": 116,
            "y": 93,
            "emitRate": 295,
            "avgEmitRate": 87,
            "idleTime": 281,
            "eruptionTime": 322,
            "dormancyCycles": 57.9,
            "activeCycles": 71.2
          },
          {
            "id": "chlorine_gas",
            "x": 42,
            "y": 101,
            "emitRate": 374,
            "avgEmitRate": 91,
            "idleTime": 321,
            "eruptionTime": 260,
            "dormancyCycles": 36.1,
            "activeCycles": 43.5
          },
          {
            "id": "molten_cobalt",
            "x": 124,
            "y": 101,
            "emitRate": 7278,
            "avgEmitRate": 249,
            "idleTime": 733,
            "eruptionTime": 48,
            "dormancyCycles": 57.9,
            "activeCycles": 71.2
          },
          {
            "id": "molten_aluminum",
            "x": 125,
            "y": 64,
            "emitRate": 13182,
            "avgEmitRate": 368,
            "idleTime": 773,
            "eruptionTime": 39,
            "dormancyCycles": 57.7,
            "activeCycles": 79.2
          },
          {
            "id": "molten_cobalt",
            "x": 89,
            "y": 80,
            "emitRate": 7785,
            "avgEmitRate": 360,
            "idleTime": 707,
            "eruptionTime": 53,
            "dormancyCycles": 43.9,
            "activeCycles": 86.0
          },
          {
            "id": "filthy_water",
            "x": 74,
            "y": 123,
            "emitRate": 11338,
            "avgEmitRate": 3145,
            "idleTime": 310,
            "eruptionTime": 247,
            "dormancyCycles": 38.0,
            "activeCycles": 63.4
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
          "LushCore"
        ],
        "biomePaths": "FrozenWastes:64,108 64,37 48,31 40,38 31,34 21,37 14,30 0,32 0,117 17,112 23,116 33,109 44,113 52,107\nForest:64,128 64,108 52,107 44,113 33,109 23,116 17,112 0,117 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 52,
            "y": 48
          },
          {
            "id": "GravitasPedestal",
            "x": 33,
            "y": 109
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 35,
            "y": 82,
            "emitRate": 6644,
            "avgEmitRate": 274,
            "idleTime": 652,
            "eruptionTime": 51,
            "dormancyCycles": 67.0,
            "activeCycles": 89.5
          },
          {
            "id": "molten_iron",
            "x": 46,
            "y": 105,
            "emitRate": 7280,
            "avgEmitRate": 282,
            "idleTime": 764,
            "eruptionTime": 47,
            "dormancyCycles": 37.3,
            "activeCycles": 74.4
          },
          {
            "id": "molten_iron",
            "x": 12,
            "y": 86,
            "emitRate": 16464,
            "avgEmitRate": 247,
            "idleTime": 705,
            "eruptionTime": 21,
            "dormancyCycles": 42.3,
            "activeCycles": 47.8
          },
          {
            "id": "molten_iron",
            "x": 40,
            "y": 68,
            "emitRate": 9981,
            "avgEmitRate": 313,
            "idleTime": 795,
            "eruptionTime": 39,
            "dormancyCycles": 55.8,
            "activeCycles": 110.7
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
          "SubsurfaceOcean"
        ],
        "biomePaths": "BoggyMarsh:20,69 8,57 0,58 0,77 14,79 16,77;64,65 64,49 47,49 44,38 34,37 26,49 30,56 25,67 39,76 42,76 47,64\nOcean:34,37 30,31 18,30 12,36 0,36 0,58 8,57 17,48 26,49;64,49 64,34 49,32 44,38 47,49\nToxicJungle:25,67 20,69 8,57 17,48 26,49 30,56;48,81 42,76 47,64 64,65 64,78\nMagmaCore:64,96 64,78 48,81 42,76 39,76 25,67 20,69 16,77 14,79 0,77 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 44,
            "y": 49
          },
          {
            "id": "GravitasPedestal",
            "x": 30,
            "y": 49
          },
          {
            "id": "SapTree",
            "x": 37,
            "y": 49
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 36,
            "y": 88,
            "emitRate": 7770,
            "avgEmitRate": 322,
            "idleTime": 716,
            "eruptionTime": 56,
            "dormancyCycles": 60.5,
            "activeCycles": 80.2
          },
          {
            "id": "molten_tungsten",
            "x": 22,
            "y": 85,
            "emitRate": 9338,
            "avgEmitRate": 262,
            "idleTime": 686,
            "eruptionTime": 35,
            "dormancyCycles": 49.4,
            "activeCycles": 66.9
          },
          {
            "id": "molten_tungsten",
            "x": 15,
            "y": 90,
            "emitRate": 8176,
            "avgEmitRate": 377,
            "idleTime": 769,
            "eruptionTime": 56,
            "dormancyCycles": 48.7,
            "activeCycles": 100.4
          },
          {
            "id": "hot_co2",
            "x": 54,
            "y": 72,
            "emitRate": 336,
            "avgEmitRate": 113,
            "idleTime": 264,
            "eruptionTime": 313,
            "dormancyCycles": 71.0,
            "activeCycles": 115.2
          },
          {
            "id": "methane",
            "x": 14,
            "y": 53,
            "emitRate": 248,
            "avgEmitRate": 100,
            "idleTime": 133,
            "eruptionTime": 380,
            "dormancyCycles": 56.8,
            "activeCycles": 67.9
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
        "biomePaths": "MagmaCore:64,96 64,34 51,36 40,24 29,37 21,36 17,29 0,30 0,46 15,46 21,58 30,57 41,71 33,79 20,78 17,64 0,64 0,79 19,79 19,96\nOilField:19,96 19,79 0,79 0,96;41,71 30,57 21,58 15,46 0,46 0,64 17,64 20,78 33,79",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 29,
            "y": 60
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 9,
            "y": 55,
            "emitRate": 283235,
            "avgEmitRate": 1082,
            "idleTime": 8822,
            "eruptionTime": 64,
            "dormancyCycles": 53.9,
            "activeCycles": 60.2
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
        "biomePaths": "Moo:96,55 96,31 86,31 78,23 66,31 62,30 51,39 50,39 36,46 27,41 24,41 16,33 0,36 0,65 17,65 20,61 34,63 38,59 51,61 53,64 67,66 73,61 82,63\nFrozenWastes:96,80 96,55 82,63 73,61 67,66 53,64 51,61 38,59 34,63 20,61 17,65 0,65 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 19,
            "y": 40
          },
          {
            "id": "GravitasPedestal",
            "x": 12,
            "y": 40
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 46,
            "y": 51,
            "emitRate": 552,
            "avgEmitRate": 129,
            "idleTime": 393,
            "eruptionTime": 266,
            "dormancyCycles": 57.7,
            "activeCycles": 79.2
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
        "biomePaths": "Barren:80,135 80,44 64,43 61,38 52,35 42,40 33,34 23,38 16,31 0,34 0,139 14,139 20,131 27,131 34,139 45,138 50,145 63,143 67,135;80,174 80,155 69,155 63,161 47,157 46,158 31,155 29,153 19,152 14,157 0,156 0,174\nSwamp:80,155 80,135 67,135 63,143 50,145 45,138 34,139 27,131 20,131 14,139 0,139 0,156 14,157 19,152 29,153 31,155 46,158 47,157 63,161 69,155",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 21,
            "y": 145
          },
          {
            "id": "GravitasPedestal",
            "x": 23,
            "y": 145
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "x": 22,
            "y": 63,
            "emitRate": 7897,
            "avgEmitRate": 3298,
            "idleTime": 190,
            "eruptionTime": 362,
            "dormancyCycles": 44.6,
            "activeCycles": 78.2
          },
          {
            "id": "hot_water",
            "x": 62,
            "y": 65,
            "emitRate": 10149,
            "avgEmitRate": 3388,
            "idleTime": 308,
            "eruptionTime": 300,
            "dormancyCycles": 42.1,
            "activeCycles": 88.1
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
        "biomePaths": "Sandstone:57,73 52,73 45,81 30,79 30,66 28,64 29,48 35,45 47,54 56,49 66,56 66,64\nBarren:30,79 30,66 28,64 29,48 18,45 11,50 0,49 0,72 7,72 16,81;96,80 96,59 88,59 77,48 66,56 66,64 57,73 63,82 78,81 80,78\nFrozenWastes:96,96 96,80 80,78 78,81 63,82 57,73 52,73 45,81 30,79 16,81 7,72 0,72 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 14,
            "y": 59
          },
          {
            "id": "GravitasPedestal",
            "x": 18,
            "y": 59
          },
          {
            "id": "GeneShuffler",
            "x": 16,
            "y": 53
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 42,
            "y": 86,
            "emitRate": 6442,
            "avgEmitRate": 1546,
            "idleTime": 411,
            "eruptionTime": 305,
            "dormancyCycles": 60.2,
            "activeCycles": 77.7
          },
          {
            "id": "hot_steam",
            "x": 10,
            "y": 84,
            "emitRate": 2627,
            "avgEmitRate": 721,
            "idleTime": 536,
            "eruptionTime": 415,
            "dormancyCycles": 40.6,
            "activeCycles": 68.9
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
        "q": -3,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": 5,
        "r": -2
      },
      {
        "id": "MarshyMoonlet",
        "q": -1,
        "r": -5
      },
      {
        "id": "NiobiumMoonlet",
        "q": 3,
        "r": 3
      },
      {
        "id": "MooMoonlet",
        "q": -7,
        "r": 4
      },
      {
        "id": "WaterMoonlet",
        "q": 5,
        "r": -7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -7,
        "r": -1
      },
      {
        "id": "TemporalTear",
        "q": 2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 2,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 7,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 6,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -8,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -2,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 9,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -11,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -8,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -4,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -3,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -5,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 2,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 2,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 9,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -4,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -9,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 5,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -8,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -11,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -10,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": 2,
        "r": 1
      }
    ]
  },
  {
    "coordinate": "V-BAD-C-524086935-0-0-0",
    "cluster": "V-BAD-C",
    "dlcs": [
      "FrostyPlanet",
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
          "SlimeSplats",
          "FrozenCore",
          "IrregularOil"
        ],
        "biomePaths": "Sandstone:58,227 36,226 31,216 35,208 58,207 63,216;83,183 65,185 59,175 63,162 78,160 87,169;89,264 85,250 65,249 59,258 64,270 82,273;148,177 123,181 109,164 112,141 127,130 150,133 160,159;180,208 174,196 160,196 151,210 139,213 120,192 95,199 87,216 94,236 123,243 125,257 146,261 150,258 148,239 164,225 170,225;240,320 240,282 212,274 209,275 194,294 199,320 217,327\nFrozenWastes:36,226 31,216 0,216 0,244 28,245;78,160 63,162 51,147 59,126 74,124 87,133;209,114 186,114 177,95 185,82 207,83 217,99;240,192 240,161 214,160 205,178 213,192;221,257 206,234 211,223 240,221 240,255;240,380 240,348 217,345 211,350 194,345 182,354 159,346 153,349 141,344 122,352 117,348 91,355 80,344 60,348 60,349 29,354 20,345 0,345 0,380\nOilField:31,179 24,160 30,148 21,132 0,132 0,188 28,186;51,116 33,114 25,98 32,88 54,88 60,100;175,159 160,159 150,133 155,129 177,129 184,145;240,128 240,99 217,99 209,114 216,127;240,348 240,320 217,327 199,320 194,294 170,290 172,263 150,258 146,261 147,289 139,294 119,291 112,297 87,291 82,273 64,270 51,290 33,289 25,276 0,276 0,345 20,345 29,354 60,349 60,348 80,344 91,355 117,348 122,352 141,344 153,349 159,346 182,354 194,345 211,350 217,345\nRust:65,249 58,227 36,226 28,245 0,244 0,276 25,276 34,256 59,258;120,192 95,199 83,183 87,169 78,160 87,133 98,131 112,141 109,164 123,181;125,257 123,243 94,236 85,250 89,264 82,273 87,291 112,297 119,291 116,268;194,294 170,290 172,263 181,257 209,275;216,127 209,114 186,114 177,129 184,145 175,159 185,177 205,178 214,160 206,146;240,221 240,192 213,192 204,210 211,223\nToxicJungle:59,126 51,116 33,114 25,98 0,98 0,132 21,132 30,148 51,147;64,270 59,258 34,256 25,276 33,289 51,290;95,199 83,183 65,185 59,175 31,179 28,186 0,188 0,216 31,216 35,208 58,207 63,216 58,227 65,249 85,250 94,236 87,216;98,131 87,133 74,124 75,103 89,95 101,99 108,114;147,289 146,261 125,257 116,268 119,291 139,294;204,210 211,223 206,234 184,242 181,257 172,263 150,258 148,239 164,225 170,225 180,208 174,196 160,196 151,210 139,213 120,192 123,181 148,177 160,159 175,159 185,177 205,178 213,192\nBarren:240,99 240,64 217,65 203,43 201,43 178,66 164,61 150,71 131,63 120,70 101,61 86,72 66,65 64,66 35,53 24,66 0,64 0,98 25,98 32,88 54,88 60,100 75,103 89,95 101,99 119,90 129,100 151,97 152,96 177,95 185,82 207,83 217,99\nWasteland:59,175 31,179 24,160 30,148 51,147 63,162;186,114 177,95 152,96 151,97 129,100 121,116 127,130 150,133 155,129 177,129;212,274 209,275 181,257 184,242 206,234 221,257;240,161 240,128 216,127 206,146 214,160\nRadioactive:75,103 60,100 51,116 59,126 74,124;129,100 119,90 101,99 108,114 98,131 112,141 127,130 121,116;212,274 221,257 240,255 240,282",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 115,
            "y": 220
          },
          {
            "id": "MassiveHeatSink",
            "x": 163,
            "y": 365
          },
          {
            "id": "MassiveHeatSink",
            "x": 187,
            "y": 105
          },
          {
            "id": "MassiveHeatSink",
            "x": 77,
            "y": 134
          },
          {
            "id": "WarpConduitReceiver",
            "x": 222,
            "y": 250
          },
          {
            "id": "WarpConduitSender",
            "x": 205,
            "y": 305
          },
          {
            "id": "GravitasPedestal",
            "x": 213,
            "y": 229
          },
          {
            "id": "WarpReceiver",
            "x": 217,
            "y": 189
          },
          {
            "id": "WarpPortal",
            "x": 216,
            "y": 183
          },
          {
            "id": "GeneShuffler",
            "x": 36,
            "y": 231
          },
          {
            "id": "GeneShuffler",
            "x": 22,
            "y": 332
          },
          {
            "id": "GeneShuffler",
            "x": 66,
            "y": 231
          },
          {
            "id": "GeneShuffler",
            "x": 37,
            "y": 272
          },
          {
            "id": "GeneShuffler",
            "x": 104,
            "y": 141
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 171,
            "y": 178,
            "emitRate": 4342,
            "avgEmitRate": 1639,
            "idleTime": 177,
            "eruptionTime": 339,
            "dormancyCycles": 74.3,
            "activeCycles": 100.6
          },
          {
            "id": "chlorine_gas",
            "x": 160,
            "y": 255,
            "emitRate": 430,
            "avgEmitRate": 125,
            "idleTime": 308,
            "eruptionTime": 278,
            "dormancyCycles": 38.4,
            "activeCycles": 60.6
          },
          {
            "id": "OilWell",
            "x": 165,
            "y": 134,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 211,
            "y": 339,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 156,
            "y": 327,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "methane",
            "x": 100,
            "y": 364,
            "emitRate": 417,
            "avgEmitRate": 104,
            "idleTime": 435,
            "eruptionTime": 336,
            "dormancyCycles": 38.1,
            "activeCycles": 50.5
          },
          {
            "id": "slimy_po2",
            "x": 193,
            "y": 216,
            "emitRate": 314,
            "avgEmitRate": 94,
            "idleTime": 274,
            "eruptionTime": 357,
            "dormancyCycles": 60.5,
            "activeCycles": 67.2
          },
          {
            "id": "hot_po2",
            "x": 130,
            "y": 199,
            "emitRate": 339,
            "avgEmitRate": 102,
            "idleTime": 188,
            "eruptionTime": 205,
            "dormancyCycles": 59.6,
            "activeCycles": 81.1
          },
          {
            "id": "hot_water",
            "x": 186,
            "y": 319,
            "emitRate": 7207,
            "avgEmitRate": 2602,
            "idleTime": 206,
            "eruptionTime": 323,
            "dormancyCycles": 32.7,
            "activeCycles": 47.3
          },
          {
            "id": "molten_copper",
            "x": 181,
            "y": 332,
            "emitRate": 10233,
            "avgEmitRate": 300,
            "idleTime": 577,
            "eruptionTime": 31,
            "dormancyCycles": 44.4,
            "activeCycles": 59.5
          },
          {
            "id": "molten_iron",
            "x": 100,
            "y": 115,
            "emitRate": 9961,
            "avgEmitRate": 334,
            "idleTime": 862,
            "eruptionTime": 48,
            "dormancyCycles": 39.5,
            "activeCycles": 67.1
          },
          {
            "id": "molten_aluminum",
            "x": 152,
            "y": 274,
            "emitRate": 9250,
            "avgEmitRate": 321,
            "idleTime": 741,
            "eruptionTime": 47,
            "dormancyCycles": 49.1,
            "activeCycles": 69.7
          },
          {
            "id": "molten_aluminum",
            "x": 85,
            "y": 364,
            "emitRate": 8053,
            "avgEmitRate": 327,
            "idleTime": 722,
            "eruptionTime": 52,
            "dormancyCycles": 64.0,
            "activeCycles": 96.9
          },
          {
            "id": "molten_aluminum",
            "x": 184,
            "y": 306,
            "emitRate": 9250,
            "avgEmitRate": 321,
            "idleTime": 741,
            "eruptionTime": 47,
            "dormancyCycles": 49.1,
            "activeCycles": 69.7
          },
          {
            "id": "slimy_po2",
            "x": 135,
            "y": 336,
            "emitRate": 398,
            "avgEmitRate": 113,
            "idleTime": 303,
            "eruptionTime": 245,
            "dormancyCycles": 47.0,
            "activeCycles": 81.1
          },
          {
            "id": "molten_cobalt",
            "x": 159,
            "y": 235,
            "emitRate": 8714,
            "avgEmitRate": 304,
            "idleTime": 578,
            "eruptionTime": 39,
            "dormancyCycles": 47.4,
            "activeCycles": 57.3
          },
          {
            "id": "slimy_po2",
            "x": 38,
            "y": 327,
            "emitRate": 303,
            "avgEmitRate": 74,
            "idleTime": 250,
            "eruptionTime": 363,
            "dormancyCycles": 84.3,
            "activeCycles": 60.1
          },
          {
            "id": "OilWell",
            "x": 21,
            "y": 168,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 18,
            "y": 154,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 34,
            "y": 109,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 144,
            "y": 299,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 168,
            "y": 157,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 152,
            "y": 285,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 224,
            "y": 124,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
          "BouldersMedium",
          "Volcanoes"
        ],
        "biomePaths": "Swamp:96,112 101,126 101,127 90,134 77,129 68,134 59,131 54,114 46,112 31,128 28,128 21,116 24,103 39,102 40,96 56,88 62,90 72,86 76,68 97,73 97,87 108,94 108,107\nFrozenWastes:22,176 20,155 0,155 0,176;50,43 26,34 21,41 23,56 40,58;119,154 114,149 99,154 91,150 80,155 70,151 60,157 60,176 118,176;160,73 160,50 143,50 138,41 120,41 115,47 97,48 96,47 85,48 75,68 64,64 51,72 56,88 62,90 72,86 76,68 97,73 100,70 115,70 121,61 137,61 143,74;160,176 160,152 139,153 140,176\nForest:28,128 21,116 0,119 0,134 22,136;56,88 51,72 45,70 40,58 23,56 19,61 22,79 0,84 0,96 23,101 29,87 40,96;46,140 31,128 46,112 54,114 59,131;120,81 115,70 100,70 97,73 97,87 108,94 116,91\nBoggyMarsh:23,56 21,41 0,39 0,60 19,61;64,64 59,47 50,43 40,58 45,70 51,72;143,74 137,61 121,61 115,70 120,81 141,80;144,109 138,100 143,85 160,86 160,109\nRust:22,79 19,61 0,60 0,84;24,103 23,101 0,96 0,119 21,116;137,130 134,127 132,127 117,110 122,101 116,91 120,81 141,80 143,85 138,100 144,109 160,109 160,131\nMagmaCore:40,96 29,87 23,101 24,103 39,102;122,101 116,91 108,94 108,107 96,112 101,126 113,111 117,110;143,85 141,80 143,74 160,73 160,86\nRadioactive:160,152 160,131 137,130 134,127 132,127 117,110 113,111 101,126 101,127 90,134 77,129 68,134 59,131 46,140 31,128 28,128 22,136 0,134 0,155 20,155 22,176 60,176 60,157 70,151 80,155 91,150 99,154 114,149 119,154 118,176 140,176 139,153",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 55,
            "y": 79
          },
          {
            "id": "WarpConduitSender",
            "x": 98,
            "y": 76
          },
          {
            "id": "WarpConduitReceiver",
            "x": 66,
            "y": 132
          },
          {
            "id": "WarpReceiver",
            "x": 84,
            "y": 104
          },
          {
            "id": "WarpPortal",
            "x": 62,
            "y": 104
          },
          {
            "id": "GeneShuffler",
            "x": 32,
            "y": 53
          },
          {
            "id": "GeneShuffler",
            "x": 139,
            "y": 113
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 51,
            "y": 158,
            "emitRate": 484,
            "avgEmitRate": 145,
            "idleTime": 188,
            "eruptionTime": 205,
            "dormancyCycles": 59.6,
            "activeCycles": 81.1
          },
          {
            "id": "liquid_co2",
            "x": 133,
            "y": 165,
            "emitRate": 1996,
            "avgEmitRate": 145,
            "idleTime": 347,
            "eruptionTime": 53,
            "dormancyCycles": 63.4,
            "activeCycles": 78.1
          },
          {
            "id": "slush_water",
            "x": 147,
            "y": 62,
            "emitRate": 4669,
            "avgEmitRate": 1264,
            "idleTime": 238,
            "eruptionTime": 335,
            "dormancyCycles": 74.8,
            "activeCycles": 64.4
          },
          {
            "id": "slush_salt_water",
            "x": 107,
            "y": 57,
            "emitRate": 5633,
            "avgEmitRate": 1409,
            "idleTime": 247,
            "eruptionTime": 202,
            "dormancyCycles": 46.6,
            "activeCycles": 58.5
          },
          {
            "id": "filthy_water",
            "x": 35,
            "y": 164,
            "emitRate": 10192,
            "avgEmitRate": 2437,
            "idleTime": 384,
            "eruptionTime": 265,
            "dormancyCycles": 27.2,
            "activeCycles": 38.4
          },
          {
            "id": "molten_copper",
            "x": 129,
            "y": 141,
            "emitRate": 5364,
            "avgEmitRate": 254,
            "idleTime": 861,
            "eruptionTime": 80,
            "dormancyCycles": 95.1,
            "activeCycles": 120.1
          },
          {
            "id": "molten_copper",
            "x": 151,
            "y": 167,
            "emitRate": 8981,
            "avgEmitRate": 254,
            "idleTime": 805,
            "eruptionTime": 41,
            "dormancyCycles": 39.3,
            "activeCycles": 56.2
          },
          {
            "id": "molten_copper",
            "x": 104,
            "y": 166,
            "emitRate": 11882,
            "avgEmitRate": 259,
            "idleTime": 710,
            "eruptionTime": 26,
            "dormancyCycles": 42.9,
            "activeCycles": 70.0
          },
          {
            "id": "liquid_co2",
            "x": 80,
            "y": 73,
            "emitRate": 507,
            "avgEmitRate": 141,
            "idleTime": 349,
            "eruptionTime": 265,
            "dormancyCycles": 27.6,
            "activeCycles": 50.2
          },
          {
            "id": "hot_po2",
            "x": 76,
            "y": 166,
            "emitRate": 351,
            "avgEmitRate": 74,
            "idleTime": 194,
            "eruptionTime": 186,
            "dormancyCycles": 65.4,
            "activeCycles": 49.3
          },
          {
            "id": "big_volcano",
            "x": 31,
            "y": 97,
            "emitRate": 333376,
            "avgEmitRate": 1531,
            "idleTime": 7953,
            "eruptionTime": 56,
            "dormancyCycles": 42.5,
            "activeCycles": 80.6
          },
          {
            "id": "big_volcano",
            "x": 103,
            "y": 115,
            "emitRate": 200394,
            "avgEmitRate": 1017,
            "idleTime": 10514,
            "eruptionTime": 97,
            "dormancyCycles": 95.1,
            "activeCycles": 120.1
          },
          {
            "id": "big_volcano",
            "x": 151,
            "y": 80,
            "emitRate": 207721,
            "avgEmitRate": 1262,
            "idleTime": 8536,
            "eruptionTime": 84,
            "dormancyCycles": 52.3,
            "activeCycles": 87.9
          },
          {
            "id": "big_volcano",
            "x": 114,
            "y": 102,
            "emitRate": 263061,
            "avgEmitRate": 1062,
            "idleTime": 6563,
            "eruptionTime": 53,
            "dormancyCycles": 45.5,
            "activeCycles": 46.7
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
        "biomePaths": "FrozenWastes:64,128 64,38 53,38 47,31 33,31 31,33 26,33 18,42 0,35 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 29,
            "y": 38
          },
          {
            "id": "GravitasPedestal",
            "x": 24,
            "y": 116
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 43,
            "y": 61,
            "emitRate": 6492,
            "avgEmitRate": 300,
            "idleTime": 699,
            "eruptionTime": 63,
            "dormancyCycles": 79.5,
            "activeCycles": 100.8
          },
          {
            "id": "molten_iron",
            "x": 38,
            "y": 105,
            "emitRate": 7080,
            "avgEmitRate": 243,
            "idleTime": 571,
            "eruptionTime": 40,
            "dormancyCycles": 59.2,
            "activeCycles": 66.4
          },
          {
            "id": "molten_iron",
            "x": 37,
            "y": 117,
            "emitRate": 7856,
            "avgEmitRate": 274,
            "idleTime": 671,
            "eruptionTime": 45,
            "dormancyCycles": 62.3,
            "activeCycles": 79.5
          },
          {
            "id": "molten_iron",
            "x": 25,
            "y": 82,
            "emitRate": 7590,
            "avgEmitRate": 302,
            "idleTime": 881,
            "eruptionTime": 61,
            "dormancyCycles": 51.8,
            "activeCycles": 83.0
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
        "biomePaths": "BoggyMarsh:64,61 64,26 48,29 47,31 39,35 32,32 22,39 19,39 13,30 0,30 0,46 12,46 16,58 13,63 0,64 0,82 14,80 18,73 32,72 34,81 44,86 51,79 47,66 50,62\nMagmaCore:64,96 64,80 51,79 44,86 34,81 32,72 18,73 14,80 0,82 0,96\nToxicJungle:16,58 12,46 0,46 0,64 13,63;51,79 47,66 50,62 64,61 64,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 38,
            "y": 43
          },
          {
            "id": "GravitasPedestal",
            "x": 24,
            "y": 43
          },
          {
            "id": "SapTree",
            "x": 31,
            "y": 43
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 21,
            "y": 88,
            "emitRate": 9797,
            "avgEmitRate": 282,
            "idleTime": 803,
            "eruptionTime": 42,
            "dormancyCycles": 50.5,
            "activeCycles": 69.5
          },
          {
            "id": "molten_tungsten",
            "x": 54,
            "y": 91,
            "emitRate": 8752,
            "avgEmitRate": 284,
            "idleTime": 759,
            "eruptionTime": 39,
            "dormancyCycles": 49.9,
            "activeCycles": 101.3
          },
          {
            "id": "molten_tungsten",
            "x": 20,
            "y": 82,
            "emitRate": 10063,
            "avgEmitRate": 400,
            "idleTime": 679,
            "eruptionTime": 47,
            "dormancyCycles": 48.0,
            "activeCycles": 76.5
          },
          {
            "id": "methane",
            "x": 22,
            "y": 61,
            "emitRate": 229,
            "avgEmitRate": 101,
            "idleTime": 41,
            "eruptionTime": 59,
            "dormancyCycles": 30.1,
            "activeCycles": 88.3
          },
          {
            "id": "slimy_po2",
            "x": 11,
            "y": 51,
            "emitRate": 496,
            "avgEmitRate": 106,
            "idleTime": 440,
            "eruptionTime": 239,
            "dormancyCycles": 39.8,
            "activeCycles": 61.0
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
        "biomePaths": "MagmaCore:64,56 64,37 50,37 46,29 33,28 27,36 18,36 12,43 0,43 0,96 21,96 21,80 30,77 43,85 51,77 45,64 50,56\nOilField:64,96 64,56 50,56 45,64 51,77 43,85 30,77 21,80 21,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 25,
            "y": 84
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 49,
            "y": 64,
            "emitRate": 217519,
            "avgEmitRate": 1218,
            "idleTime": 8423,
            "eruptionTime": 69,
            "dormancyCycles": 49.0,
            "activeCycles": 106.7
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
        "biomePaths": "Moo:96,67 96,36 78,33 75,42 62,45 57,41 48,43 39,36 35,37 23,23 14,33 0,31 0,66 17,64 19,65 36,60 37,61 44,58 56,64 62,60 76,64\nFrozenWastes:96,80 96,67 76,64 62,60 56,64 44,58 37,61 36,60 19,65 17,64 0,66 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 39,
            "y": 49
          },
          {
            "id": "GravitasPedestal",
            "x": 32,
            "y": 49
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 70,
            "y": 53,
            "emitRate": 401,
            "avgEmitRate": 100,
            "idleTime": 397,
            "eruptionTime": 350,
            "dormancyCycles": 51.1,
            "activeCycles": 57.9
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
        "biomePaths": "Barren:80,128 80,47 69,47 62,39 54,38 48,32 34,33 31,37 18,38 16,37 0,38 0,137 14,137 20,129 27,129 36,137 45,136 52,142 62,140 67,129;80,174 80,152 73,152 60,162 50,155 40,159 30,151 21,153 19,156 0,157 0,174\nSwamp:80,152 80,128 67,129 62,140 52,142 45,136 36,137 27,129 20,129 14,137 0,137 0,157 19,156 21,153 30,151 40,159 50,155 60,162 73,152",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 44,
            "y": 155
          },
          {
            "id": "GravitasPedestal",
            "x": 46,
            "y": 155
          }
        ],
        "geysers": [
          {
            "id": "slush_water",
            "x": 59,
            "y": 95,
            "emitRate": 6068,
            "avgEmitRate": 1668,
            "idleTime": 362,
            "eruptionTime": 261,
            "dormancyCycles": 41.6,
            "activeCycles": 79.5
          },
          {
            "id": "hot_water",
            "x": 17,
            "y": 93,
            "emitRate": 12016,
            "avgEmitRate": 3349,
            "idleTime": 419,
            "eruptionTime": 321,
            "dormancyCycles": 57.8,
            "activeCycles": 104.1
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
        "biomePaths": "Barren:46,75 46,74 36,64 38,52 37,50 19,50 18,48 0,48 0,78 18,81 22,77 37,84;96,76 96,54 80,57 77,55 74,47 58,43 53,53 57,62 65,64 69,77 77,79 84,75\nSandstone:58,84 46,75 46,74 36,64 38,52 53,53 57,62 65,64 69,77\nFrozenWastes:96,96 96,76 84,75 77,79 69,77 58,84 46,75 37,84 22,77 18,81 0,78 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 68,
            "y": 58
          },
          {
            "id": "GravitasPedestal",
            "x": 72,
            "y": 58
          },
          {
            "id": "GeneShuffler",
            "x": 70,
            "y": 52
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 47,
            "y": 82,
            "emitRate": 5984,
            "avgEmitRate": 1494,
            "idleTime": 240,
            "eruptionTime": 206,
            "dormancyCycles": 57.7,
            "activeCycles": 68.2
          }
        ]
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
        "q": 1,
        "r": -3
      },
      {
        "id": "TundraMoonlet",
        "q": -5,
        "r": 5
      },
      {
        "id": "MarshyMoonlet",
        "q": 6,
        "r": -4
      },
      {
        "id": "NiobiumMoonlet",
        "q": 0,
        "r": -6
      },
      {
        "id": "MooMoonlet",
        "q": -1,
        "r": 7
      },
      {
        "id": "WaterMoonlet",
        "q": -6,
        "r": 0
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 6,
        "r": 1
      },
      {
        "id": "TemporalTear",
        "q": 7,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -3,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 4,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -11,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 9,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -4,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 10,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 1,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 2,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 3,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 2,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -3,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -4,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -9,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 0,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -2,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -4,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -5,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 9,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 8,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 8,
        "r": -10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": 3,
        "r": -2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 4,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -8,
        "r": 10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 11,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": 0,
        "r": 11
      }
    ]
  },
  {
    "coordinate": "V-HTFST-C-174337039-0-0-0",
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
          "CrashedSatellites",
          "FrozenCore"
        ],
        "biomePaths": "Forest:153,215 154,223 139,232 128,225 110,234 100,223 86,224 79,214 92,196 79,182 86,168 106,171 108,170 114,155 130,154 137,167 157,167 161,173 154,188 163,203\nFrozenWastes:240,380 240,350 213,353 208,348 184,361 171,350 153,363 137,351 120,362 104,351 89,360 74,350 58,358 47,352 27,359 14,348 0,348 0,380\nOilField:240,350 240,327 218,325 207,340 186,328 171,341 153,328 137,339 121,328 105,337 89,325 75,333 55,322 46,329 29,324 24,315 0,313 0,348 14,348 27,359 47,352 58,358 74,350 89,360 104,351 120,362 137,351 153,363 171,350 184,361 208,348 213,353\nOcean:31,223 29,198 0,199 0,224 27,227;32,297 21,285 0,285 0,313 24,315;51,164 32,165 26,142 32,134 52,133 59,154;78,124 56,127 49,102 50,100 70,93 84,108;140,287 128,278 109,286 109,303 122,313 138,305;184,289 171,293 157,281 161,261 162,260 185,264 191,278;218,123 210,102 216,93 240,92 240,121;220,265 209,248 219,234 240,233 240,265;240,327 240,296 219,296 211,308 218,325\nBoggyMarsh:57,240 51,226 31,223 27,227 27,255 0,256 0,285 21,285 32,260 40,260;98,278 79,284 68,274 77,248 100,256;153,328 137,339 121,328 122,313 138,305 154,315;210,102 189,104 180,83 185,76 210,76 216,93;218,325 211,308 192,308 185,314 186,328 207,340;210,160 192,158 185,146 192,131 214,130 220,142;220,265 209,248 197,248 185,264 191,278 211,279\nWasteland:27,255 27,227 0,224 0,256;56,127 49,102 31,104 25,85 0,84 0,114 23,113 32,134 52,133;55,194 32,196 27,171 32,165 51,164 61,185;89,325 75,333 55,322 57,308 45,296 32,297 21,285 32,260 40,260 57,240 76,246 77,248 68,274 79,284 77,300 90,312;103,137 88,138 78,124 84,108 103,103 111,125;192,131 183,115 166,116 157,137 163,145 185,146;211,308 192,308 184,289 191,278 211,279 219,296;216,203 209,216 189,218 181,203 189,188 209,189 218,173 210,160 220,142 240,143 240,203\nToxicJungle:57,308 45,296 32,297 24,315 29,324 46,329 55,322;79,154 59,154 52,133 56,127 78,124 88,138;92,196 79,182 61,185 55,194 32,196 27,171 32,165 26,142 32,134 23,113 0,114 0,199 29,198 31,223 51,226 62,211 79,214;121,328 105,337 89,325 90,312 109,303 122,313;132,126 111,125 103,103 84,108 70,93 71,82 90,73 99,78 120,69 132,81 130,95 140,106;157,281 140,287 128,278 129,261 109,251 110,234 128,225 139,232 139,254 161,261;171,341 153,328 154,315 169,306 185,314 186,328;183,115 166,116 156,105 163,85 180,83 189,104;218,173 210,160 192,158 185,146 163,145 157,137 139,136 130,154 137,167 157,167 161,173 154,188 163,203 153,215 154,223 168,234 162,260 185,264 197,248 183,230 189,218 181,203 189,188 209,189\nBarren:240,92 240,65 217,63 212,52 194,47 181,59 165,53 155,59 136,48 121,56 107,45 88,54 78,48 58,56 51,51 28,58 26,57 0,59 0,84 25,85 30,79 47,84 60,74 71,82 90,73 99,78 120,69 132,81 152,73 163,85 180,83 185,76 210,76 216,93\nRadioactive:70,93 50,100 49,102 31,104 25,85 30,79 47,84 60,74 71,82;185,314 169,306 171,293 184,289 192,308;220,142 214,130 218,123 240,121 240,143\nRust:129,261 109,251 110,234 100,223 86,224 79,214 62,211 51,226 57,240 76,246 77,248 100,256 98,278 79,284 77,300 90,312 109,303 109,286 128,278;157,137 139,136 130,154 114,155 108,170 106,171 86,168 79,182 61,185 51,164 59,154 79,154 88,138 103,137 111,125 132,126 140,106 130,95 132,81 152,73 163,85 156,105 166,116;168,234 154,223 139,232 139,254 161,261 162,260;169,306 154,315 138,305 140,287 157,281 171,293;214,130 192,131 183,115 189,104 210,102 218,123;219,234 209,248 197,248 183,230 189,218 209,216 216,203 240,203 240,233;240,296 240,265 220,265 211,279 219,296",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 119,
            "y": 196
          },
          {
            "id": "WarpConduitReceiver",
            "x": 66,
            "y": 104
          },
          {
            "id": "WarpConduitSender",
            "x": 214,
            "y": 285
          },
          {
            "id": "GravitasPedestal",
            "x": 67,
            "y": 121
          },
          {
            "id": "WarpReceiver",
            "x": 95,
            "y": 300
          },
          {
            "id": "WarpPortal",
            "x": 94,
            "y": 294
          },
          {
            "id": "GeneShuffler",
            "x": 32,
            "y": 333
          },
          {
            "id": "GeneShuffler",
            "x": 213,
            "y": 239
          },
          {
            "id": "GeneShuffler",
            "x": 205,
            "y": 320
          },
          {
            "id": "GeneShuffler",
            "x": 48,
            "y": 250
          },
          {
            "id": "GeneShuffler",
            "x": 185,
            "y": 108
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 107,
            "y": 79
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 154,
            "y": 96
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 21,
            "y": 94
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 124,
            "y": 96,
            "emitRate": 5931,
            "avgEmitRate": 1723,
            "idleTime": 328,
            "eruptionTime": 296,
            "dormancyCycles": 52.4,
            "activeCycles": 82.9
          },
          {
            "id": "methane",
            "x": 187,
            "y": 247,
            "emitRate": 313,
            "avgEmitRate": 132,
            "idleTime": 250,
            "eruptionTime": 445,
            "dormancyCycles": 52.9,
            "activeCycles": 103.2
          },
          {
            "id": "steam",
            "x": 142,
            "y": 311,
            "emitRate": 5563,
            "avgEmitRate": 1925,
            "idleTime": 311,
            "eruptionTime": 392,
            "dormancyCycles": 50.0,
            "activeCycles": 81.9
          },
          {
            "id": "methane",
            "x": 90,
            "y": 271,
            "emitRate": 410,
            "avgEmitRate": 103,
            "idleTime": 274,
            "eruptionTime": 223,
            "dormancyCycles": 32.3,
            "activeCycles": 41.2
          },
          {
            "id": "salt_water",
            "x": 180,
            "y": 280,
            "emitRate": 6094,
            "avgEmitRate": 2658,
            "idleTime": 58,
            "eruptionTime": 119,
            "dormancyCycles": 40.0,
            "activeCycles": 73.2
          },
          {
            "id": "OilWell",
            "x": 22,
            "y": 343,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 99,
            "y": 341,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 219,
            "y": 344,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "hot_co2",
            "x": 143,
            "y": 292,
            "emitRate": 313,
            "avgEmitRate": 108,
            "idleTime": 291,
            "eruptionTime": 357,
            "dormancyCycles": 58.7,
            "activeCycles": 97.9
          },
          {
            "id": "big_volcano",
            "x": 50,
            "y": 157,
            "emitRate": 313285,
            "avgEmitRate": 1206,
            "idleTime": 10412,
            "eruptionTime": 65,
            "dormancyCycles": 57.8,
            "activeCycles": 94.1
          },
          {
            "id": "slush_salt_water",
            "x": 131,
            "y": 133,
            "emitRate": 4842,
            "avgEmitRate": 1175,
            "idleTime": 364,
            "eruptionTime": 340,
            "dormancyCycles": 53.0,
            "activeCycles": 53.6
          },
          {
            "id": "methane",
            "x": 116,
            "y": 276,
            "emitRate": 222,
            "avgEmitRate": 115,
            "idleTime": 99,
            "eruptionTime": 465,
            "dormancyCycles": 46.8,
            "activeCycles": 79.8
          },
          {
            "id": "liquid_co2",
            "x": 224,
            "y": 218,
            "emitRate": 921,
            "avgEmitRate": 153,
            "idleTime": 303,
            "eruptionTime": 110,
            "dormancyCycles": 66.1,
            "activeCycles": 108.9
          },
          {
            "id": "oil_drip",
            "x": 185,
            "y": 335,
            "emitRate": 291,
            "avgEmitRate": 163,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.3
          },
          {
            "id": "liquid_co2",
            "x": 55,
            "y": 206,
            "emitRate": 556,
            "avgEmitRate": 157,
            "idleTime": 182,
            "eruptionTime": 142,
            "dormancyCycles": 43.5,
            "activeCycles": 77.8
          },
          {
            "id": "slush_salt_water",
            "x": 161,
            "y": 341,
            "emitRate": 10146,
            "avgEmitRate": 1466,
            "idleTime": 471,
            "eruptionTime": 141,
            "dormancyCycles": 40.1,
            "activeCycles": 67.1
          },
          {
            "id": "hot_hydrogen",
            "x": 132,
            "y": 346,
            "emitRate": 408,
            "avgEmitRate": 101,
            "idleTime": 356,
            "eruptionTime": 265,
            "dormancyCycles": 90.3,
            "activeCycles": 123.2
          },
          {
            "id": "molten_gold",
            "x": 36,
            "y": 303,
            "emitRate": 10979,
            "avgEmitRate": 315,
            "idleTime": 513,
            "eruptionTime": 26,
            "dormancyCycles": 56.9,
            "activeCycles": 81.0
          },
          {
            "id": "liquid_co2",
            "x": 114,
            "y": 265,
            "emitRate": 556,
            "avgEmitRate": 157,
            "idleTime": 182,
            "eruptionTime": 142,
            "dormancyCycles": 43.5,
            "activeCycles": 77.8
          },
          {
            "id": "big_volcano",
            "x": 156,
            "y": 286,
            "emitRate": 219086,
            "avgEmitRate": 1096,
            "idleTime": 8250,
            "eruptionTime": 74,
            "dormancyCycles": 72.5,
            "activeCycles": 94.3
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
          "BouldersMixed",
          "BouldersMedium"
        ],
        "biomePaths": "Sandstone:20,120 0,112 0,137 17,135;22,64 17,55 0,54 0,77 14,77;111,53 96,41 88,43 82,52 85,64 99,67 110,59;136,141 119,135 122,120 137,117 144,131;141,109 135,97 120,96 113,111 104,112 97,129 81,126 77,113 72,110 56,117 46,103 48,97 38,83 40,78 60,71 61,72 79,72 83,87 93,92 103,85 115,87 124,72 134,71 142,86 160,86 160,108\nFrozenWastes:24,40 21,36 0,34 0,54 17,55;85,64 82,52 65,50 58,60 60,71 61,72 79,72;20,176 22,157 43,160 48,152 55,151 67,161 82,152 88,153 92,158 113,157 115,159 115,176;139,64 134,71 124,72 110,59 111,53 120,46 135,48 140,42 160,43 160,64\nSwamp:81,126 77,113 72,110 56,117 46,103 48,97 38,83 40,78 33,65 22,64 14,77 23,89 21,96 0,102 0,112 20,120 17,135 24,142 38,138 41,129 54,125 63,136 73,136;124,72 110,59 99,67 85,64 79,72 83,87 93,92 103,85 115,87;160,132 160,108 141,109 135,97 120,96 113,111 104,112 97,129 100,135 113,139 119,135 122,120 137,117 144,131\nBarren:23,89 14,77 0,77 0,102 21,96;65,50 62,40 46,37 40,44 24,40 17,55 22,64 33,65 40,78 60,71 58,60;142,86 134,71 139,64 160,64 160,86\nRadioactive:160,176 160,132 144,131 136,141 119,135 113,139 100,135 97,129 81,126 73,136 63,136 54,125 41,129 38,138 24,142 17,135 0,137 0,176 20,176 22,157 43,160 48,152 55,151 67,161 82,152 88,153 92,158 113,157 115,159 115,176",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "x": 95,
            "y": 55
          },
          {
            "id": "WarpConduitReceiver",
            "x": 83,
            "y": 116
          },
          {
            "id": "MassiveHeatSink",
            "x": 139,
            "y": 48
          },
          {
            "id": "WarpPortal",
            "x": 72,
            "y": 102
          },
          {
            "id": "WarpReceiver",
            "x": 91,
            "y": 102
          },
          {
            "id": "GeneShuffler",
            "x": 73,
            "y": 73
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 134,
            "y": 162,
            "emitRate": 416,
            "avgEmitRate": 149,
            "idleTime": 206,
            "eruptionTime": 311,
            "dormancyCycles": 60.2,
            "activeCycles": 88.7
          },
          {
            "id": "liquid_co2",
            "x": 119,
            "y": 162,
            "emitRate": 570,
            "avgEmitRate": 163,
            "idleTime": 424,
            "eruptionTime": 355,
            "dormancyCycles": 49.3,
            "activeCycles": 82.9
          },
          {
            "id": "slush_salt_water",
            "x": 136,
            "y": 62,
            "emitRate": 7292,
            "avgEmitRate": 1617,
            "idleTime": 305,
            "eruptionTime": 177,
            "dormancyCycles": 51.8,
            "activeCycles": 78.5
          },
          {
            "id": "slush_water",
            "x": 119,
            "y": 60,
            "emitRate": 5433,
            "avgEmitRate": 1854,
            "idleTime": 338,
            "eruptionTime": 392,
            "dormancyCycles": 42.5,
            "activeCycles": 74.2
          },
          {
            "id": "molten_cobalt",
            "x": 51,
            "y": 130,
            "emitRate": 11552,
            "avgEmitRate": 326,
            "idleTime": 707,
            "eruptionTime": 35,
            "dormancyCycles": 67.7,
            "activeCycles": 98.3
          },
          {
            "id": "hot_steam",
            "x": 102,
            "y": 139,
            "emitRate": 2648,
            "avgEmitRate": 790,
            "idleTime": 321,
            "eruptionTime": 332,
            "dormancyCycles": 65.7,
            "activeCycles": 93.4
          },
          {
            "id": "molten_gold",
            "x": 128,
            "y": 144,
            "emitRate": 10846,
            "avgEmitRate": 356,
            "idleTime": 808,
            "eruptionTime": 42,
            "dormancyCycles": 38.6,
            "activeCycles": 77.5
          },
          {
            "id": "slush_water",
            "x": 58,
            "y": 99,
            "emitRate": 4622,
            "avgEmitRate": 1610,
            "idleTime": 254,
            "eruptionTime": 334,
            "dormancyCycles": 27.2,
            "activeCycles": 43.1
          },
          {
            "id": "small_volcano",
            "x": 73,
            "y": 145,
            "emitRate": 156389,
            "avgEmitRate": 616,
            "idleTime": 8684,
            "eruptionTime": 56,
            "dormancyCycles": 46.1,
            "activeCycles": 73.3
          },
          {
            "id": "hot_po2",
            "x": 117,
            "y": 140,
            "emitRate": 346,
            "avgEmitRate": 98,
            "idleTime": 384,
            "eruptionTime": 314,
            "dormancyCycles": 57.9,
            "activeCycles": 99.4
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
        "biomePaths": "FrozenWastes:64,128 64,38 51,39 42,30 32,35 21,27 10,40 0,39 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 37,
            "y": 50
          },
          {
            "id": "GravitasPedestal",
            "x": 41,
            "y": 111
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 25,
            "y": 37
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 37,
            "y": 66
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 50,
            "y": 53
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 52,
            "y": 91,
            "emitRate": 9438,
            "avgEmitRate": 279,
            "idleTime": 689,
            "eruptionTime": 39,
            "dormancyCycles": 61.9,
            "activeCycles": 78.0
          },
          {
            "id": "molten_iron",
            "x": 23,
            "y": 84,
            "emitRate": 5066,
            "avgEmitRate": 223,
            "idleTime": 785,
            "eruptionTime": 66,
            "dormancyCycles": 24.9,
            "activeCycles": 32.9
          },
          {
            "id": "molten_iron",
            "x": 17,
            "y": 60,
            "emitRate": 8329,
            "avgEmitRate": 289,
            "idleTime": 624,
            "eruptionTime": 39,
            "dormancyCycles": 63.7,
            "activeCycles": 90.9
          },
          {
            "id": "molten_iron",
            "x": 52,
            "y": 113,
            "emitRate": 5066,
            "avgEmitRate": 223,
            "idleTime": 785,
            "eruptionTime": 66,
            "dormancyCycles": 24.9,
            "activeCycles": 32.9
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
        "biomePaths": "BoggyMarsh:64,58 64,38 47,40 42,34 29,37 21,29 8,39 0,39 0,79 15,79 20,74 13,60 19,53 26,51 33,56 45,53 50,59\nToxicJungle:49,78 46,75 31,74 20,74 13,60 19,53 26,51 33,56 45,53 50,59 64,58 64,78\nMagmaCore:64,96 64,78 49,78 46,75 31,74 20,74 15,79 0,79 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 44,
            "y": 47
          },
          {
            "id": "GravitasPedestal",
            "x": 30,
            "y": 47
          },
          {
            "id": "SapTree",
            "x": 37,
            "y": 47
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 45,
            "y": 88,
            "emitRate": 15416,
            "avgEmitRate": 319,
            "idleTime": 834,
            "eruptionTime": 29,
            "dormancyCycles": 55.1,
            "activeCycles": 90.4
          },
          {
            "id": "molten_tungsten",
            "x": 30,
            "y": 84,
            "emitRate": 10314,
            "avgEmitRate": 346,
            "idleTime": 760,
            "eruptionTime": 43,
            "dormancyCycles": 44.9,
            "activeCycles": 75.2
          },
          {
            "id": "molten_tungsten",
            "x": 37,
            "y": 91,
            "emitRate": 10314,
            "avgEmitRate": 346,
            "idleTime": 760,
            "eruptionTime": 43,
            "dormancyCycles": 44.9,
            "activeCycles": 75.2
          },
          {
            "id": "slimy_po2",
            "x": 38,
            "y": 69,
            "emitRate": 409,
            "avgEmitRate": 101,
            "idleTime": 288,
            "eruptionTime": 262,
            "dormancyCycles": 55.0,
            "activeCycles": 58.7
          },
          {
            "id": "slimy_po2",
            "x": 24,
            "y": 63,
            "emitRate": 306,
            "avgEmitRate": 109,
            "idleTime": 94,
            "eruptionTime": 142,
            "dormancyCycles": 54.2,
            "activeCycles": 79.5
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
        "biomePaths": "MagmaCore:10,96 17,79 28,81 31,96;64,96 64,38 52,39 44,50 33,49 31,50 16,42 6,49 0,49 0,73 12,73 18,63 27,60 37,72 42,73 47,78 45,96\nOilField:47,78 42,73 37,72 27,60 18,63 12,73 0,73 0,96 10,96 17,79 28,81 31,96 45,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 33,
            "y": 82
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 10,
            "y": 77,
            "emitRate": 274698,
            "avgEmitRate": 1411,
            "idleTime": 7064,
            "eruptionTime": 54,
            "dormancyCycles": 63.5,
            "activeCycles": 136.5
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
        "biomePaths": "Moo:96,62 96,46 77,43 77,42 68,39 57,43 49,36 38,38 34,45 20,46 16,32 0,32 0,65 19,64 20,65 38,62 40,59 55,57 59,61 74,60 77,63\nFrozenWastes:96,80 96,62 77,63 74,60 59,61 55,57 40,59 38,62 20,65 19,64 0,65 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 80,
            "y": 51
          },
          {
            "id": "GravitasPedestal",
            "x": 73,
            "y": 51
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 13,
            "y": 53,
            "emitRate": 355,
            "avgEmitRate": 121,
            "idleTime": 206,
            "eruptionTime": 222,
            "dormancyCycles": 39.0,
            "activeCycles": 74.6
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
        "biomePaths": "Barren:80,134 80,45 68,44 64,33 54,30 47,36 36,33 33,34 19,29 12,36 0,35 0,140 17,141 18,141 30,142 37,133 43,133 50,142 62,140 66,135;80,174 80,155 67,154 61,161 46,155 42,157 34,155 21,162 15,157 0,159 0,174\nSwamp:80,155 80,134 66,135 62,140 50,142 43,133 37,133 30,142 18,141 17,141 0,140 0,159 15,157 21,162 34,155 42,157 46,155 61,161 67,154",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 41,
            "y": 154
          },
          {
            "id": "GravitasPedestal",
            "x": 43,
            "y": 154
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "x": 64,
            "y": 83,
            "emitRate": 11992,
            "avgEmitRate": 3405,
            "idleTime": 388,
            "eruptionTime": 235,
            "dormancyCycles": 27.4,
            "activeCycles": 83.2
          },
          {
            "id": "slush_water",
            "x": 62,
            "y": 65,
            "emitRate": 5572,
            "avgEmitRate": 1397,
            "idleTime": 279,
            "eruptionTime": 228,
            "dormancyCycles": 61.9,
            "activeCycles": 78.0
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
        "biomePaths": "Barren:46,62 43,51 33,51 24,63 22,63 17,60 13,47 0,45 0,77 18,79 19,81 37,82 40,79 39,71;96,81 96,49 80,48 74,58 65,57 58,65 60,77 76,79 76,80\nFrozenWastes:96,96 96,81 76,80 76,79 60,77 56,82 40,79 37,82 19,81 18,79 0,77 0,96\nSandstone:60,77 58,65 46,62 39,71 40,79 56,82",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 22,
            "y": 78
          },
          {
            "id": "GravitasPedestal",
            "x": 26,
            "y": 78
          },
          {
            "id": "GeneShuffler",
            "x": 24,
            "y": 72
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "x": 84,
            "y": 84,
            "emitRate": 2231,
            "avgEmitRate": 806,
            "idleTime": 223,
            "eruptionTime": 353,
            "dormancyCycles": 42.3,
            "activeCycles": 60.7
          },
          {
            "id": "steam",
            "x": 42,
            "y": 84,
            "emitRate": 5650,
            "avgEmitRate": 1669,
            "idleTime": 208,
            "eruptionTime": 206,
            "dormancyCycles": 43.1,
            "activeCycles": 63.2
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
        "q": 1,
        "r": -3
      },
      {
        "id": "TundraMoonlet",
        "q": -4,
        "r": 5
      },
      {
        "id": "MarshyMoonlet",
        "q": 1,
        "r": 4
      },
      {
        "id": "NiobiumMoonlet",
        "q": 5,
        "r": -4
      },
      {
        "id": "MooMoonlet",
        "q": 7,
        "r": 0
      },
      {
        "id": "WaterMoonlet",
        "q": -4,
        "r": -3
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 2,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": -3,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 3,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -10,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -10,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 7,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 6,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 10,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -3,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -6,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -7,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -7,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -6,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -6,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 11,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 7,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 8,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 9,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 8,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 1,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 1,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 0,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -7,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 1,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": -1,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -8,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -11,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 5,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 10,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 4,
        "r": 3
      }
    ]
  },
  {
    "coordinate": "V-OASIS-C-908596465-0-0-0",
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
          "GlaciersLarge",
          "Volcanoes",
          "SlimeSplats"
        ],
        "biomePaths": "Forest:162,226 165,239 155,248 134,240 133,240 123,256 101,250 99,236 78,237 73,229 75,218 63,206 66,193 81,190 86,179 108,182 120,164 121,164 138,179 137,190 147,202 170,200 175,211\nMagmaCore:77,136 77,116 57,118 60,139;81,190 66,193 58,180 65,168 80,168 86,179;101,250 99,236 78,237 73,229 75,218 63,206 50,214 55,232 51,240 64,255 74,252 89,260;130,107 118,99 105,112 113,126 126,123;150,167 141,152 121,164 138,179;184,278 176,261 181,249 165,239 155,248 160,263 156,272 176,286;219,237 205,249 195,244 200,218 203,217 218,228 240,218 240,243;240,380 240,341 220,342 211,351 183,348 178,342 165,340 151,349 132,344 121,350 103,344 89,354 65,344 58,349 29,345 26,342 0,341 0,380\nBoggyMarsh:34,315 23,305 0,305 0,341 26,342;89,354 65,344 66,328 89,314 99,318 103,344;194,314 174,298 155,309 165,340 178,342;220,342 207,313 212,306 206,277 210,272 240,272 240,341\nOcean:33,277 25,268 0,268 0,305 23,305;66,328 50,314 61,287 82,290 89,314;165,340 155,309 146,306 132,314 132,344 151,349;215,135 204,117 189,116 175,138 180,150 204,154;211,351 183,348 178,342 194,314 174,298 176,286 184,278 206,277 212,306 207,313 220,342\nSandstone:66,193 58,180 33,182 26,194 31,207 15,227 0,228 0,268 25,268 33,277 55,278 64,255 51,240 55,232 50,214 63,206;160,263 155,248 134,240 133,240 123,256 101,250 89,260 92,281 111,287 127,274 143,280 156,272;211,168 204,154 180,150 175,138 161,132 163,112 151,100 130,107 126,123 113,126 105,112 85,108 77,116 77,136 89,147 80,168 86,179 108,182 120,164 121,164 141,152 150,167 138,179 137,190 147,202 170,200 175,211 162,226 165,239 181,249 195,244 200,218 203,217 210,199 203,184;215,135 204,117 213,101 240,101 240,135;240,272 240,243 219,237 205,249 210,272\nOilField:33,182 25,164 0,164 0,228 15,227 31,207 26,194;80,168 65,168 54,147 60,139 77,136 89,147;114,308 111,287 92,281 82,290 89,314 99,318;176,286 156,272 143,280 146,306 155,309 174,298;206,277 184,278 176,261 181,249 195,244 205,249 210,272;218,228 203,217 210,199 240,200 240,218\nWasteland:65,168 54,147 35,148 22,127 0,130 0,164 25,164 33,182 58,180;92,281 89,260 74,252 64,255 55,278 61,287 82,290;146,306 143,280 127,274 111,287 114,308 132,314;240,200 240,169 211,168 203,184 210,199\nRadioactive:48,111 46,95 33,91 20,106 0,105 0,130 22,127 26,117;204,117 189,116 175,138 161,132 163,112 184,110 190,93 206,91 213,101\nBarren:240,101 240,65 215,67 203,54 178,62 175,75 154,82 137,67 116,83 97,73 80,88 62,81 58,63 36,55 23,69 0,68 0,105 20,106 33,91 46,95 48,111 57,118 77,116 85,108 105,112 118,99 130,107 151,100 163,112 184,110 190,93 206,91 213,101\nToxicJungle:54,147 35,148 22,127 26,117 48,111 57,118 60,139;65,344 58,349 29,345 26,342 34,315 23,305 33,277 55,278 61,287 50,314 66,328;132,344 132,314 114,308 99,318 103,344 121,350;240,169 240,135 215,135 204,154 211,168",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 122,
            "y": 215
          },
          {
            "id": "WarpConduitReceiver",
            "x": 52,
            "y": 276
          },
          {
            "id": "WarpConduitSender",
            "x": 59,
            "y": 318
          },
          {
            "id": "GravitasPedestal",
            "x": 33,
            "y": 239
          },
          {
            "id": "WarpReceiver",
            "x": 34,
            "y": 140
          },
          {
            "id": "WarpPortal",
            "x": 33,
            "y": 134
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "x": 149,
            "y": 300,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 25,
            "y": 202,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 64,
            "y": 162,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "salt_water",
            "x": 201,
            "y": 141,
            "emitRate": 11977,
            "avgEmitRate": 3174,
            "idleTime": 345,
            "eruptionTime": 324,
            "dormancyCycles": 45.0,
            "activeCycles": 54.5
          },
          {
            "id": "steam",
            "x": 47,
            "y": 292,
            "emitRate": 5997,
            "avgEmitRate": 1525,
            "idleTime": 270,
            "eruptionTime": 201,
            "dormancyCycles": 33.9,
            "activeCycles": 50.0
          },
          {
            "id": "steam",
            "x": 222,
            "y": 289,
            "emitRate": 4675,
            "avgEmitRate": 1668,
            "idleTime": 259,
            "eruptionTime": 312,
            "dormancyCycles": 28.6,
            "activeCycles": 53.6
          },
          {
            "id": "methane",
            "x": 107,
            "y": 321,
            "emitRate": 286,
            "avgEmitRate": 112,
            "idleTime": 176,
            "eruptionTime": 342,
            "dormancyCycles": 56.1,
            "activeCycles": 82.4
          },
          {
            "id": "methane",
            "x": 172,
            "y": 309,
            "emitRate": 250,
            "avgEmitRate": 80,
            "idleTime": 335,
            "eruptionTime": 443,
            "dormancyCycles": 41.1,
            "activeCycles": 52.2
          },
          {
            "id": "chlorine_gas",
            "x": 178,
            "y": 176,
            "emitRate": 281,
            "avgEmitRate": 132,
            "idleTime": 235,
            "eruptionTime": 426,
            "dormancyCycles": 39.8,
            "activeCycles": 107.8
          },
          {
            "id": "molten_iron",
            "x": 160,
            "y": 175,
            "emitRate": 17155,
            "avgEmitRate": 305,
            "idleTime": 791,
            "eruptionTime": 25,
            "dormancyCycles": 42.1,
            "activeCycles": 56.5
          },
          {
            "id": "molten_aluminum",
            "x": 21,
            "y": 189,
            "emitRate": 13364,
            "avgEmitRate": 305,
            "idleTime": 809,
            "eruptionTime": 34,
            "dormancyCycles": 55.3,
            "activeCycles": 70.4
          },
          {
            "id": "hot_hydrogen",
            "x": 89,
            "y": 294,
            "emitRate": 425,
            "avgEmitRate": 106,
            "idleTime": 486,
            "eruptionTime": 340,
            "dormancyCycles": 52.6,
            "activeCycles": 80.1
          },
          {
            "id": "hot_steam",
            "x": 84,
            "y": 131,
            "emitRate": 1938,
            "avgEmitRate": 692,
            "idleTime": 238,
            "eruptionTime": 281,
            "dormancyCycles": 38.7,
            "activeCycles": 75.1
          },
          {
            "id": "big_volcano",
            "x": 137,
            "y": 258,
            "emitRate": 228683,
            "avgEmitRate": 1157,
            "idleTime": 9071,
            "eruptionTime": 78,
            "dormancyCycles": 52.0,
            "activeCycles": 75.9
          },
          {
            "id": "hot_co2",
            "x": 188,
            "y": 284,
            "emitRate": 366,
            "avgEmitRate": 110,
            "idleTime": 425,
            "eruptionTime": 381,
            "dormancyCycles": 57.7,
            "activeCycles": 100.1
          },
          {
            "id": "molten_gold",
            "x": 200,
            "y": 257,
            "emitRate": 8630,
            "avgEmitRate": 314,
            "idleTime": 703,
            "eruptionTime": 47,
            "dormancyCycles": 43.1,
            "activeCycles": 59.3
          },
          {
            "id": "molten_gold",
            "x": 109,
            "y": 300,
            "emitRate": 5867,
            "avgEmitRate": 356,
            "idleTime": 560,
            "eruptionTime": 57,
            "dormancyCycles": 45.3,
            "activeCycles": 86.6
          },
          {
            "id": "steam",
            "x": 176,
            "y": 202,
            "emitRate": 4373,
            "avgEmitRate": 1144,
            "idleTime": 318,
            "eruptionTime": 263,
            "dormancyCycles": 63.3,
            "activeCycles": 86.8
          },
          {
            "id": "oil_drip",
            "x": 187,
            "y": 240,
            "emitRate": 290,
            "avgEmitRate": 158,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.2
          },
          {
            "id": "hot_water",
            "x": 136,
            "y": 336,
            "emitRate": 7978,
            "avgEmitRate": 2857,
            "idleTime": 248,
            "eruptionTime": 313,
            "dormancyCycles": 49.2,
            "activeCycles": 88.4
          },
          {
            "id": "big_volcano",
            "x": 206,
            "y": 234,
            "emitRate": 280179,
            "avgEmitRate": 1420,
            "idleTime": 9824,
            "eruptionTime": 85,
            "dormancyCycles": 48.1,
            "activeCycles": 69.7
          },
          {
            "id": "big_volcano",
            "x": 118,
            "y": 114,
            "emitRate": 292554,
            "avgEmitRate": 1395,
            "idleTime": 8398,
            "eruptionTime": 60,
            "dormancyCycles": 34.7,
            "activeCycles": 69.7
          },
          {
            "id": "big_volcano",
            "x": 167,
            "y": 252,
            "emitRate": 282359,
            "avgEmitRate": 1160,
            "idleTime": 8036,
            "eruptionTime": 53,
            "dormancyCycles": 38.9,
            "activeCycles": 65.8
          },
          {
            "id": "big_volcano",
            "x": 170,
            "y": 273,
            "emitRate": 286126,
            "avgEmitRate": 1311,
            "idleTime": 9809,
            "eruptionTime": 74,
            "dormancyCycles": 45.7,
            "activeCycles": 71.5
          },
          {
            "id": "big_volcano",
            "x": 65,
            "y": 242,
            "emitRate": 223605,
            "avgEmitRate": 981,
            "idleTime": 8046,
            "eruptionTime": 65,
            "dormancyCycles": 59.4,
            "activeCycles": 71.7
          },
          {
            "id": "big_volcano",
            "x": 67,
            "y": 128,
            "emitRate": 255748,
            "avgEmitRate": 1279,
            "idleTime": 8177,
            "eruptionTime": 68,
            "dormancyCycles": 45.3,
            "activeCycles": 69.4
          },
          {
            "id": "big_volcano",
            "x": 87,
            "y": 247,
            "emitRate": 199866,
            "avgEmitRate": 1019,
            "idleTime": 7999,
            "eruptionTime": 63,
            "dormancyCycles": 35.8,
            "activeCycles": 68.1
          },
          {
            "id": "big_volcano",
            "x": 72,
            "y": 180,
            "emitRate": 321118,
            "avgEmitRate": 1054,
            "idleTime": 8725,
            "eruptionTime": 50,
            "dormancyCycles": 47.8,
            "activeCycles": 64.6
          },
          {
            "id": "OilWell",
            "x": 21,
            "y": 214,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 24,
            "y": 181,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 96,
            "y": 292,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 78,
            "y": 152,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 159,
            "y": 301,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 205,
            "y": 272,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 214,
            "y": 207,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
          "MetalCaves",
          "CrashedSatellites"
        ],
        "biomePaths": "Swamp:115,82 105,90 111,108 96,116 99,132 92,139 77,134 73,124 63,121 61,103 48,100 44,85 47,80 65,78 68,62 77,58 91,68 99,63 115,67 116,69;142,107 133,98 116,109 121,121 137,124\nBoggyMarsh:20,131 20,110 0,109 0,131;80,43 67,35 57,41 57,55 68,62 77,58;121,47 113,40 99,44 99,63 115,67;141,62 135,46 139,41 160,41 160,62\nFrozenWastes:57,55 57,41 43,34 35,41 22,39 15,46 0,46 0,70 21,67 22,65 39,60 43,62;78,176 45,176 38,155 42,150 55,147 62,151 66,150 79,159;91,68 77,58 80,43 91,39 99,44 99,63;141,62 135,46 121,47 115,67 116,69 137,69\nRust:48,100 44,85 26,84 21,67 0,70 0,109 20,110 24,106 38,109;133,98 133,93 115,82 105,90 111,108 116,109;141,84 137,69 141,62 160,62 160,85;160,129 160,106 142,107 137,124 141,129\nForest:63,121 61,103 48,100 38,109 24,106 20,110 20,131 22,133 32,133 43,123 54,126;65,78 47,80 44,85 26,84 21,67 22,65 39,60 43,62 57,55 68,62;141,129 137,124 121,121 116,109 111,108 96,116 99,132 113,134 118,144 137,139;142,107 133,98 133,93 115,82 116,69 137,69 141,84 160,85 160,106\nRadioactive:160,176 160,129 141,129 137,139 118,144 113,134 99,132 92,139 77,134 73,124 63,121 54,126 43,123 32,133 22,133 20,131 0,131 0,176 45,176 38,155 42,150 55,147 62,151 66,150 79,159 78,176",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 95,
            "y": 51
          },
          {
            "id": "WarpConduitSender",
            "x": 34,
            "y": 108
          },
          {
            "id": "WarpConduitReceiver",
            "x": 36,
            "y": 90
          },
          {
            "id": "WarpReceiver",
            "x": 91,
            "y": 92
          },
          {
            "id": "WarpPortal",
            "x": 69,
            "y": 92
          },
          {
            "id": "GeneShuffler",
            "x": 144,
            "y": 66
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 28,
            "y": 72
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 61,
            "y": 64
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 73,
            "y": 44
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 128,
            "y": 145,
            "emitRate": 636,
            "avgEmitRate": 155,
            "idleTime": 298,
            "eruptionTime": 199,
            "dormancyCycles": 60.3,
            "activeCycles": 93.6
          },
          {
            "id": "liquid_co2",
            "x": 144,
            "y": 158,
            "emitRate": 516,
            "avgEmitRate": 153,
            "idleTime": 238,
            "eruptionTime": 184,
            "dormancyCycles": 40.0,
            "activeCycles": 84.5
          },
          {
            "id": "slush_water",
            "x": 17,
            "y": 48,
            "emitRate": 4995,
            "avgEmitRate": 1324,
            "idleTime": 228,
            "eruptionTime": 204,
            "dormancyCycles": 68.2,
            "activeCycles": 87.4
          },
          {
            "id": "slush_salt_water",
            "x": 93,
            "y": 65,
            "emitRate": 4045,
            "avgEmitRate": 1444,
            "idleTime": 269,
            "eruptionTime": 311,
            "dormancyCycles": 40.9,
            "activeCycles": 81.2
          },
          {
            "id": "slush_water",
            "x": 76,
            "y": 62,
            "emitRate": 4341,
            "avgEmitRate": 1620,
            "idleTime": 208,
            "eruptionTime": 331,
            "dormancyCycles": 48.2,
            "activeCycles": 74.7
          },
          {
            "id": "molten_aluminum",
            "x": 150,
            "y": 115,
            "emitRate": 8950,
            "avgEmitRate": 262,
            "idleTime": 733,
            "eruptionTime": 46,
            "dormancyCycles": 87.8,
            "activeCycles": 85.9
          },
          {
            "id": "hot_water",
            "x": 18,
            "y": 93,
            "emitRate": 8794,
            "avgEmitRate": 2758,
            "idleTime": 225,
            "eruptionTime": 262,
            "dormancyCycles": 51.4,
            "activeCycles": 71.8
          },
          {
            "id": "molten_cobalt",
            "x": 140,
            "y": 122,
            "emitRate": 8804,
            "avgEmitRate": 320,
            "idleTime": 733,
            "eruptionTime": 49,
            "dormancyCycles": 47.2,
            "activeCycles": 65.5
          },
          {
            "id": "hot_hydrogen",
            "x": 109,
            "y": 82,
            "emitRate": 262,
            "avgEmitRate": 105,
            "idleTime": 144,
            "eruptionTime": 301,
            "dormancyCycles": 43.5,
            "activeCycles": 62.7
          },
          {
            "id": "hot_po2",
            "x": 120,
            "y": 90,
            "emitRate": 560,
            "avgEmitRate": 101,
            "idleTime": 213,
            "eruptionTime": 82,
            "dormancyCycles": 56.7,
            "activeCycles": 101.8
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
          "MetalPoor"
        ],
        "biomePaths": "FrozenWastes:64,128 64,42 51,42 45,35 35,34 27,42 21,42 14,34 0,34 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 52,
            "y": 57
          },
          {
            "id": "GravitasPedestal",
            "x": 46,
            "y": 92
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 18,
            "y": 99,
            "emitRate": 9004,
            "avgEmitRate": 326,
            "idleTime": 764,
            "eruptionTime": 51,
            "dormancyCycles": 50.4,
            "activeCycles": 70.7
          },
          {
            "id": "molten_iron",
            "x": 19,
            "y": 111,
            "emitRate": 5833,
            "avgEmitRate": 266,
            "idleTime": 708,
            "eruptionTime": 59,
            "dormancyCycles": 36.0,
            "activeCycles": 51.5
          },
          {
            "id": "molten_iron",
            "x": 46,
            "y": 68,
            "emitRate": 7353,
            "avgEmitRate": 248,
            "idleTime": 894,
            "eruptionTime": 69,
            "dormancyCycles": 37.3,
            "activeCycles": 33.4
          },
          {
            "id": "molten_iron",
            "x": 23,
            "y": 75,
            "emitRate": 5654,
            "avgEmitRate": 248,
            "idleTime": 651,
            "eruptionTime": 52,
            "dormancyCycles": 54.0,
            "activeCycles": 79.9
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
          "MetalRich"
        ],
        "biomePaths": "BoggyMarsh:64,64 64,50 45,46 43,40 35,36 22,41 15,35 0,36 0,72 16,75 19,73 29,78 41,73 43,65\nMagmaCore:64,96 64,79 47,81 41,73 29,78 19,73 16,75 0,72 0,96\nToxicJungle:47,81 41,73 43,65 64,64 64,79",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 39,
            "y": 49
          },
          {
            "id": "GravitasPedestal",
            "x": 25,
            "y": 49
          },
          {
            "id": "SapTree",
            "x": 32,
            "y": 49
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 51,
            "y": 90,
            "emitRate": 7033,
            "avgEmitRate": 250,
            "idleTime": 785,
            "eruptionTime": 48,
            "dormancyCycles": 43.8,
            "activeCycles": 69.0
          },
          {
            "id": "molten_tungsten",
            "x": 36,
            "y": 91,
            "emitRate": 9878,
            "avgEmitRate": 303,
            "idleTime": 601,
            "eruptionTime": 33,
            "dormancyCycles": 68.1,
            "activeCycles": 94.7
          },
          {
            "id": "molten_tungsten",
            "x": 28,
            "y": 89,
            "emitRate": 11453,
            "avgEmitRate": 313,
            "idleTime": 703,
            "eruptionTime": 32,
            "dormancyCycles": 50.6,
            "activeCycles": 83.1
          },
          {
            "id": "slimy_po2",
            "x": 39,
            "y": 66,
            "emitRate": 265,
            "avgEmitRate": 74,
            "idleTime": 188,
            "eruptionTime": 320,
            "dormancyCycles": 88.2,
            "activeCycles": 70.4
          },
          {
            "id": "hot_hydrogen",
            "x": 29,
            "y": 69,
            "emitRate": 298,
            "avgEmitRate": 95,
            "idleTime": 240,
            "eruptionTime": 342,
            "dormancyCycles": 41.7,
            "activeCycles": 48.8
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
        "biomePaths": "MagmaCore:64,96 64,65 49,65 47,47 64,47 64,30 48,32 46,47 36,48 31,43 30,33 20,27 13,33 0,31 0,50 16,48 20,61 16,66 0,65 0,82 19,80 20,81 20,96\nOilField:20,61 16,48 0,50 0,65 16,66;20,96 20,81 19,80 0,82 0,96;64,65 64,47 47,47 49,65",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 19,
            "y": 83
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 57,
            "y": 57,
            "emitRate": 411230,
            "avgEmitRate": 1366,
            "idleTime": 8765,
            "eruptionTime": 51,
            "dormancyCycles": 83.4,
            "activeCycles": 111.5
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
        "biomePaths": "Moo:96,66 96,32 83,32 76,41 68,40 62,29 49,29 46,34 34,35 29,42 20,43 13,33 0,33 0,65 16,66 20,61 35,62 38,59 54,69 62,60 74,62 76,66\nFrozenWastes:96,80 96,66 76,66 74,62 62,60 54,69 38,59 35,62 20,61 16,66 0,65 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 70,
            "y": 53
          },
          {
            "id": "GravitasPedestal",
            "x": 63,
            "y": 53
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 14,
            "y": 47,
            "emitRate": 489,
            "avgEmitRate": 99,
            "idleTime": 505,
            "eruptionTime": 302,
            "dormancyCycles": 58.4,
            "activeCycles": 68.2
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
        "biomePaths": "Barren:80,136 80,28 61,32 45,32 41,36 31,34 21,44 20,44 12,36 0,36 0,137 6,137 18,146 27,139 34,141 43,135 52,139 61,135 66,138;80,174 80,157 66,155 63,157 51,154 47,156 37,154 31,159 17,155 15,157 0,157 0,174\nSwamp:80,157 80,136 66,138 61,135 52,139 43,135 34,141 27,139 18,146 6,137 0,137 0,157 15,157 17,155 31,159 37,154 47,156 51,154 63,157 66,155",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 59,
            "y": 154
          },
          {
            "id": "GravitasPedestal",
            "x": 61,
            "y": 154
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "x": 56,
            "y": 119,
            "emitRate": 16338,
            "avgEmitRate": 2815,
            "idleTime": 387,
            "eruptionTime": 170,
            "dormancyCycles": 57.4,
            "activeCycles": 74.3
          },
          {
            "id": "filthy_water",
            "x": 19,
            "y": 63,
            "emitRate": 10831,
            "avgEmitRate": 3204,
            "idleTime": 481,
            "eruptionTime": 398,
            "dormancyCycles": 47.1,
            "activeCycles": 88.6
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
        "biomePaths": "Barren:48,77 44,69 29,64 26,66 17,62 0,68 0,77 20,82 24,78 42,86;96,81 96,60 83,59 77,48 68,47 60,57 67,69 75,69 81,79\nSandstone:59,78 48,77 44,69 29,64 35,50 46,49 52,56 60,57 67,69\nFrozenWastes:96,96 96,81 81,79 75,69 67,69 59,78 48,77 42,86 24,78 20,82 0,77 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 64,
            "y": 62
          },
          {
            "id": "GravitasPedestal",
            "x": 68,
            "y": 62
          },
          {
            "id": "GeneShuffler",
            "x": 66,
            "y": 56
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 64,
            "y": 79,
            "emitRate": 8771,
            "avgEmitRate": 1541,
            "idleTime": 511,
            "eruptionTime": 193,
            "dormancyCycles": 50.0,
            "activeCycles": 89.3
          }
        ]
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
        "q": 3,
        "r": 0
      },
      {
        "id": "TundraMoonlet",
        "q": -4,
        "r": -1
      },
      {
        "id": "MarshyMoonlet",
        "q": 6,
        "r": -6
      },
      {
        "id": "NiobiumMoonlet",
        "q": 1,
        "r": 4
      },
      {
        "id": "MooMoonlet",
        "q": -6,
        "r": 7
      },
      {
        "id": "WaterMoonlet",
        "q": 2,
        "r": -7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 7,
        "r": 1
      },
      {
        "id": "TemporalTear",
        "q": -1,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 3,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -8,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -9,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -9,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -4,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -4,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 6,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -9,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 7,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 7,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 7,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 6,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -3,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -10,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 2,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 3,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 2,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 10,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -6,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -7,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": -1,
        "r": -2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 5,
        "r": 4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 11,
        "r": -11
      }
    ]
  },
  {
    "coordinate": "SNDST-C-1607940615-0-0-0",
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
        "biomePaths": "Sandstone:131,168 109,168 104,175 112,194 101,206 82,198 82,186 57,176 51,152 30,155 22,139 30,126 44,126 53,111 69,113 75,128 94,130 108,145 126,138 136,155\nBoggyMarsh:29,231 18,218 27,200 46,205 46,224;85,229 73,222 72,206 53,200 54,180 57,176 82,186 82,198 101,206 103,219;160,104 160,77 140,78 131,95 139,105;137,179 131,168 136,155 126,138 108,145 94,130 102,115 108,113 129,129 132,127 160,133 160,180\nToxicJungle:30,126 21,112 0,112 0,140 22,139;57,176 51,152 30,155 26,165 0,166 0,189 23,192 27,200 46,205 53,200 54,180;132,127 139,105 160,104 160,133;160,226 160,204 133,204 129,196 137,179 131,168 109,168 104,175 112,194 101,206 103,219 111,224 130,219 138,228\nFrozenWastes:44,126 30,126 21,112 30,97 46,97 53,111;102,115 85,99 80,99 69,113 75,128 94,130;132,127 129,129 108,113 118,95 131,95 139,105\nBarren:160,77 160,50 133,50 126,59 120,60 102,46 81,61 70,49 52,51 44,65 31,66 20,53 0,53 0,83 21,83 30,97 46,97 57,82 63,82 80,99 85,99 99,81 106,81 118,95 131,95 140,78;160,254 160,226 138,228 130,219 111,224 103,219 85,229 73,222 57,231 46,224 29,231 18,218 0,219 0,246 25,247 26,246 49,253 57,246 76,254 86,246 103,252 112,246 131,251 133,250\nWasteland:27,200 23,192 0,189 0,219 18,218;30,97 21,83 0,83 0,112 21,112;30,155 22,139 0,140 0,166 26,165;73,222 72,206 53,200 46,205 46,224 57,231;80,99 63,82 57,82 46,97 53,111 69,113;108,113 102,115 85,99 99,81 106,81 118,95;160,204 160,180 137,179 129,196 133,204\nMagmaCore:160,274 160,254 133,250 131,251 112,246 103,252 86,246 76,254 57,246 49,253 26,246 25,247 0,246 0,274",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 82,
            "y": 157
          },
          {
            "id": "WarpConduitReceiver",
            "x": 126,
            "y": 192
          },
          {
            "id": "WarpConduitSender",
            "x": 61,
            "y": 188
          },
          {
            "id": "GravitasPedestal",
            "x": 40,
            "y": 112
          },
          {
            "id": "WarpPortal",
            "x": 79,
            "y": 208
          },
          {
            "id": "WarpReceiver",
            "x": 80,
            "y": 214
          },
          {
            "id": "GeneShuffler",
            "x": 114,
            "y": 131
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 105,
            "y": 214,
            "emitRate": 2923,
            "avgEmitRate": 1277,
            "idleTime": 278,
            "eruptionTime": 830,
            "dormancyCycles": 53.7,
            "activeCycles": 75.1
          },
          {
            "id": "slush_water",
            "x": 131,
            "y": 116,
            "emitRate": 5107,
            "avgEmitRate": 1608,
            "idleTime": 255,
            "eruptionTime": 302,
            "dormancyCycles": 27.1,
            "activeCycles": 37.5
          },
          {
            "id": "slush_salt_water",
            "x": 27,
            "y": 115,
            "emitRate": 3931,
            "avgEmitRate": 1408,
            "idleTime": 207,
            "eruptionTime": 246,
            "dormancyCycles": 24.8,
            "activeCycles": 47.8
          },
          {
            "id": "methane",
            "x": 37,
            "y": 213,
            "emitRate": 399,
            "avgEmitRate": 82,
            "idleTime": 333,
            "eruptionTime": 207,
            "dormancyCycles": 49.8,
            "activeCycles": 57.5
          },
          {
            "id": "small_volcano",
            "x": 47,
            "y": 237,
            "emitRate": 147217,
            "avgEmitRate": 692,
            "idleTime": 8344,
            "eruptionTime": 61,
            "dormancyCycles": 38.3,
            "activeCycles": 70.1
          },
          {
            "id": "small_volcano",
            "x": 76,
            "y": 235,
            "emitRate": 196590,
            "avgEmitRate": 772,
            "idleTime": 8591,
            "eruptionTime": 53,
            "dormancyCycles": 56.1,
            "activeCycles": 102.5
          },
          {
            "id": "small_volcano",
            "x": 105,
            "y": 238,
            "emitRate": 146007,
            "avgEmitRate": 613,
            "idleTime": 10450,
            "eruptionTime": 73,
            "dormancyCycles": 47.6,
            "activeCycles": 73.0
          },
          {
            "id": "big_volcano",
            "x": 143,
            "y": 207,
            "emitRate": 276971,
            "avgEmitRate": 1283,
            "idleTime": 8259,
            "eruptionTime": 61,
            "dormancyCycles": 36.5,
            "activeCycles": 61.3
          },
          {
            "id": "steam",
            "x": 129,
            "y": 99,
            "emitRate": 6924,
            "avgEmitRate": 1411,
            "idleTime": 444,
            "eruptionTime": 271,
            "dormancyCycles": 48.3,
            "activeCycles": 56.2
          },
          {
            "id": "hot_hydrogen",
            "x": 19,
            "y": 199,
            "emitRate": 269,
            "avgEmitRate": 71,
            "idleTime": 247,
            "eruptionTime": 209,
            "dormancyCycles": 50.3,
            "activeCycles": 68.1
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
          "MetalRich"
        ],
        "biomePaths": "Forest:128,64 128,41 108,44 106,42 87,49 85,48 71,59 61,56 58,42 43,42 37,48 23,48 18,39 0,38 0,101 20,98 23,93 37,89 36,70 43,64 53,65 63,78 74,73 79,76 94,67 103,69 111,63\nOcean:63,78 53,65 43,64 36,70 37,89 44,94 59,90;128,88 128,64 111,63 103,69 94,67 79,76 83,95 84,95 86,113 102,121 112,111 107,91 108,90\nMetallic:83,95 79,76 74,73 63,78 59,90 44,94 37,89 23,93 20,98 0,101 0,118 25,116 26,114 43,109 50,116 49,129 64,136 74,129 75,121 63,111 66,98;112,111 107,91 108,90 128,88 128,113\nRadioactive:128,153 128,113 112,111 102,121 86,113 84,95 83,95 66,98 63,111 75,121 74,129 64,136 49,129 50,116 43,109 26,114 25,116 0,118 0,153",
        "pointsOfInterest": [
          {
            "id": "PropSurfaceSatellite3",
            "x": 65,
            "y": 59
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "x": 86,
            "y": 80,
            "emitRate": 10811,
            "avgEmitRate": 3212,
            "idleTime": 405,
            "eruptionTime": 339,
            "dormancyCycles": 40.1,
            "activeCycles": 75.1
          },
          {
            "id": "liquid_co2",
            "x": 81,
            "y": 105,
            "emitRate": 573,
            "avgEmitRate": 151,
            "idleTime": 158,
            "eruptionTime": 137,
            "dormancyCycles": 75.1,
            "activeCycles": 99.2
          },
          {
            "id": "liquid_co2",
            "x": 80,
            "y": 138,
            "emitRate": 609,
            "avgEmitRate": 221,
            "idleTime": 163,
            "eruptionTime": 182,
            "dormancyCycles": 43.4,
            "activeCycles": 95.3
          },
          {
            "id": "molten_aluminum",
            "x": 59,
            "y": 118,
            "emitRate": 6741,
            "avgEmitRate": 297,
            "idleTime": 776,
            "eruptionTime": 62,
            "dormancyCycles": 49.8,
            "activeCycles": 74.0
          },
          {
            "id": "molten_gold",
            "x": 65,
            "y": 93,
            "emitRate": 8607,
            "avgEmitRate": 310,
            "idleTime": 816,
            "eruptionTime": 52,
            "dormancyCycles": 35.7,
            "activeCycles": 52.9
          },
          {
            "id": "molten_aluminum",
            "x": 39,
            "y": 96,
            "emitRate": 9556,
            "avgEmitRate": 293,
            "idleTime": 709,
            "eruptionTime": 39,
            "dormancyCycles": 67.7,
            "activeCycles": 95.3
          },
          {
            "id": "molten_gold",
            "x": 114,
            "y": 104,
            "emitRate": 11043,
            "avgEmitRate": 311,
            "idleTime": 519,
            "eruptionTime": 25,
            "dormancyCycles": 39.3,
            "activeCycles": 63.7
          },
          {
            "id": "small_volcano",
            "x": 111,
            "y": 136,
            "emitRate": 120029,
            "avgEmitRate": 611,
            "idleTime": 9437,
            "eruptionTime": 74,
            "dormancyCycles": 49.4,
            "activeCycles": 92.9
          },
          {
            "id": "filthy_water",
            "x": 27,
            "y": 107,
            "emitRate": 11966,
            "avgEmitRate": 2062,
            "idleTime": 370,
            "eruptionTime": 266,
            "dormancyCycles": 15.0,
            "activeCycles": 10.5
          },
          {
            "id": "hot_hydrogen",
            "x": 113,
            "y": 47,
            "emitRate": 429,
            "avgEmitRate": 127,
            "idleTime": 325,
            "eruptionTime": 252,
            "dormancyCycles": 31.4,
            "activeCycles": 66.5
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
          "MetalCaves",
          "MetalPoor"
        ],
        "biomePaths": "Swamp:101,97 85,94 78,104 62,105 56,95 62,82 49,70 58,56 74,60 81,48 102,56 103,68 103,69 109,85\nFrozenWastes:20,38 0,25 0,53 16,51;62,82 49,70 58,56 52,45 41,44 32,59 24,60 17,73 0,72 0,115 18,115 23,109 16,94 23,84 35,85 41,95 56,95;128,88 128,48 109,46 105,36 87,33 80,43 81,48 102,56 103,68 103,69 109,85\nRust:41,44 31,32 20,38 16,51 0,53 0,72 17,73 24,60 32,59;58,115 43,118 35,108 23,109 16,94 23,84 35,85 41,95 56,95 62,105;81,48 80,43 60,34 52,45 58,56 74,60;128,104 128,88 109,85 101,97 106,107\nOilField:128,127 128,104 106,107 101,97 85,94 78,104 62,105 58,115 43,118 35,108 23,109 18,115 0,115 0,136 23,133 40,130 47,138 66,133 67,129 84,124 90,135 107,136 112,128\nBarren:128,153 128,127 112,128 107,136 90,135 84,124 67,129 66,133 47,138 40,130 23,133 0,136 0,153",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 55,
            "y": 93
          },
          {
            "id": "WarpConduitSender",
            "x": 35,
            "y": 62
          },
          {
            "id": "WarpConduitReceiver",
            "x": 74,
            "y": 57
          },
          {
            "id": "WarpReceiver",
            "x": 88,
            "y": 80
          },
          {
            "id": "WarpPortal",
            "x": 66,
            "y": 80
          },
          {
            "id": "GeneShuffler",
            "x": 25,
            "y": 133
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "x": 87,
            "y": 125,
            "emitRate": 4971,
            "avgEmitRate": 1505,
            "idleTime": 187,
            "eruptionTime": 178,
            "dormancyCycles": 53.0,
            "activeCycles": 87.0
          },
          {
            "id": "OilWell",
            "x": 86,
            "y": 117,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 45,
            "y": 134,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 100,
            "y": 118,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 69,
            "y": 127,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 36,
            "y": 128,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "hot_co2",
            "x": 100,
            "y": 41,
            "emitRate": 335,
            "avgEmitRate": 85,
            "idleTime": 349,
            "eruptionTime": 261,
            "dormancyCycles": 48.5,
            "activeCycles": 70.9
          },
          {
            "id": "hot_co2",
            "x": 13,
            "y": 70,
            "emitRate": 436,
            "avgEmitRate": 89,
            "idleTime": 361,
            "eruptionTime": 236,
            "dormancyCycles": 65.3,
            "activeCycles": 70.4
          },
          {
            "id": "liquid_sulfur",
            "x": 70,
            "y": 44,
            "emitRate": 6678,
            "avgEmitRate": 1631,
            "idleTime": 449,
            "eruptionTime": 303,
            "dormancyCycles": 45.7,
            "activeCycles": 70.6
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
          "MetalPoor"
        ],
        "biomePaths": "FrozenWastes:64,128 64,40 44,41 43,35 29,28 20,34 15,31 0,33 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 36,
            "y": 36
          },
          {
            "id": "GravitasPedestal",
            "x": 34,
            "y": 92
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 16,
            "y": 105,
            "emitRate": 11617,
            "avgEmitRate": 287,
            "idleTime": 679,
            "eruptionTime": 34,
            "dormancyCycles": 70.8,
            "activeCycles": 77.9
          },
          {
            "id": "molten_iron",
            "x": 33,
            "y": 55,
            "emitRate": 5822,
            "avgEmitRate": 317,
            "idleTime": 789,
            "eruptionTime": 82,
            "dormancyCycles": 38.0,
            "activeCycles": 52.0
          },
          {
            "id": "molten_iron",
            "x": 51,
            "y": 109,
            "emitRate": 5992,
            "avgEmitRate": 217,
            "idleTime": 687,
            "eruptionTime": 51,
            "dormancyCycles": 57.3,
            "activeCycles": 62.6
          },
          {
            "id": "molten_iron",
            "x": 24,
            "y": 75,
            "emitRate": 8046,
            "avgEmitRate": 295,
            "idleTime": 701,
            "eruptionTime": 49,
            "dormancyCycles": 72.0,
            "activeCycles": 92.7
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
          "MetalRich"
        ],
        "biomePaths": "BoggyMarsh:64,67 64,38 50,34 44,39 31,34 28,36 18,34 9,45 0,45 0,80 20,82 22,80 42,84 45,80 41,66 43,62\nToxicJungle:45,80 41,66 43,62 64,67 64,79\nMagmaCore:64,96 64,79 45,80 42,84 22,80 20,82 0,80 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 45,
            "y": 42
          },
          {
            "id": "GravitasPedestal",
            "x": 31,
            "y": 42
          },
          {
            "id": "SapTree",
            "x": 38,
            "y": 42
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 11,
            "y": 76,
            "emitRate": 7022,
            "avgEmitRate": 257,
            "idleTime": 671,
            "eruptionTime": 46,
            "dormancyCycles": 43.5,
            "activeCycles": 57.2
          },
          {
            "id": "molten_tungsten",
            "x": 56,
            "y": 90,
            "emitRate": 8802,
            "avgEmitRate": 274,
            "idleTime": 701,
            "eruptionTime": 41,
            "dormancyCycles": 64.1,
            "activeCycles": 84.1
          },
          {
            "id": "molten_tungsten",
            "x": 13,
            "y": 91,
            "emitRate": 7844,
            "avgEmitRate": 284,
            "idleTime": 714,
            "eruptionTime": 47,
            "dormancyCycles": 49.1,
            "activeCycles": 70.0
          },
          {
            "id": "hot_hydrogen",
            "x": 34,
            "y": 59,
            "emitRate": 268,
            "avgEmitRate": 84,
            "idleTime": 399,
            "eruptionTime": 479,
            "dormancyCycles": 59.6,
            "activeCycles": 81.4
          },
          {
            "id": "slimy_po2",
            "x": 48,
            "y": 66,
            "emitRate": 356,
            "avgEmitRate": 110,
            "idleTime": 108,
            "eruptionTime": 115,
            "dormancyCycles": 41.6,
            "activeCycles": 62.3
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
        "biomePaths": "Moo:96,68 96,33 66,33 61,40 50,40 46,34 32,33 31,34 17,32 11,42 0,42 0,63 14,61 22,70 34,63 45,72 56,61 58,61 70,75 79,65\nFrozenWastes:96,80 96,68 79,65 70,75 58,61 56,61 45,72 34,63 22,70 14,61 0,63 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 57,
            "y": 51
          },
          {
            "id": "GravitasPedestal",
            "x": 50,
            "y": 51
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 14,
            "y": 52,
            "emitRate": 356,
            "avgEmitRate": 92,
            "idleTime": 402,
            "eruptionTime": 318,
            "dormancyCycles": 65.4,
            "activeCycles": 92.3
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
        "biomePaths": "Barren:80,134 80,41 68,42 60,32 51,35 40,24 32,30 19,25 12,35 0,35 0,136 13,138 16,145 28,147 35,137 39,136 42,133 49,131 61,141 72,133;80,174 80,154 67,155 60,150 49,154 47,154 35,159 31,157 18,164 10,156 0,156 0,174\nSwamp:80,154 80,134 72,133 61,141 49,131 42,133 39,136 35,137 28,147 16,145 13,138 0,136 0,156 10,156 18,164 31,157 35,159 47,154 49,154 60,150 67,155",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 25,
            "y": 158
          },
          {
            "id": "GravitasPedestal",
            "x": 27,
            "y": 158
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "x": 36,
            "y": 78,
            "emitRate": 12968,
            "avgEmitRate": 3071,
            "idleTime": 465,
            "eruptionTime": 290,
            "dormancyCycles": 33.4,
            "activeCycles": 53.6
          },
          {
            "id": "hot_water",
            "x": 58,
            "y": 73,
            "emitRate": 20273,
            "avgEmitRate": 3304,
            "idleTime": 531,
            "eruptionTime": 179,
            "dormancyCycles": 54.4,
            "activeCycles": 99.8
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
        "biomePaths": "MagmaCore:64,79 64,61 49,62 45,77 32,76 30,58 34,55 43,55 48,44 64,44 64,30 49,28 43,34 35,34 29,39 19,39 15,31 0,29 0,96 45,96 46,77\nOilField:64,61 64,44 48,44 43,55 34,55 30,58 32,76 45,77 49,62;45,96 46,77 64,79 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 45,
            "y": 71
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 49,
            "y": 48,
            "emitRate": 252067,
            "avgEmitRate": 1053,
            "idleTime": 9594,
            "eruptionTime": 69,
            "dormancyCycles": 65.4,
            "activeCycles": 92.3
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
          "DistressSignal"
        ],
        "biomePaths": "Barren:24,58 23,52 17,48 0,52 0,83 17,79 15,66;69,64 59,55 48,58 33,63 33,77 41,81 51,76 60,79 67,75;126,59 117,53 106,59 106,73 113,77 124,74;160,74 160,54 140,56 145,75\nSandstone:33,77 33,63 24,58 15,66 17,79 21,82;96,78 89,75 79,81 67,75 69,64 81,58 86,60 97,54 106,59 106,73;144,76 130,78 124,74 126,59 140,56 145,75\nFrozenWastes:160,96 160,74 145,75 144,76 130,78 124,74 113,77 106,73 96,78 89,75 79,81 67,75 60,79 51,76 41,81 33,77 21,82 17,79 0,83 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 14,
            "y": 62
          },
          {
            "id": "GravitasPedestal",
            "x": 18,
            "y": 62
          },
          {
            "id": "GeneShuffler",
            "x": 16,
            "y": 56
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 137,
            "y": 83,
            "emitRate": 4845,
            "avgEmitRate": 1274,
            "idleTime": 345,
            "eruptionTime": 335,
            "dormancyCycles": 50.9,
            "activeCycles": 58.3
          },
          {
            "id": "steam",
            "x": 122,
            "y": 82,
            "emitRate": 5708,
            "avgEmitRate": 2034,
            "idleTime": 285,
            "eruptionTime": 351,
            "dormancyCycles": 39.1,
            "activeCycles": 71.1
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
        "q": -2,
        "r": 3
      },
      {
        "id": "WarpOilySwamp",
        "q": -5,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": -4,
        "r": 8
      },
      {
        "id": "MarshyMoonlet",
        "q": 2,
        "r": 4
      },
      {
        "id": "MooMoonlet",
        "q": 7,
        "r": -1
      },
      {
        "id": "WaterMoonlet",
        "q": 4,
        "r": -8
      },
      {
        "id": "NiobiumMoonlet",
        "q": -9,
        "r": 10
      },
      {
        "id": "RegolithMoonlet",
        "q": 9,
        "r": -7
      },
      {
        "id": "TemporalTear",
        "q": 7,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 1,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -8,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -7,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 0,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -4,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -6,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 3,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 4,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 5,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -11,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 10,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 8,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 8,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 7,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 7,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -11,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -10,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 3,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": -2,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -2,
        "r": 9
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -6,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -1,
        "r": -5
      }
    ]
  },
  {
    "coordinate": "CER-C-90675436-0-0-0",
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
          "MetalCaves",
          "GlaciersLarge",
          "FrozenCore",
          "MetalPoor"
        ],
        "biomePaths": "IceCaves:118,120 105,111 96,115 89,130 60,127 60,121 44,107 31,109 25,120 29,133 49,139 44,162 52,177 39,193 50,208 69,204 71,187 91,182 104,164 105,148 113,143\nFrozenWastes:60,121 44,107 53,88 76,95 77,100;130,173 124,175 115,194 100,196 95,208 76,211 69,204 71,187 91,182 104,164 105,148 113,143 132,149 137,163;160,274 160,250 134,248 132,246 122,244 106,257 89,247 78,257 56,247 51,250 29,246 25,250 0,247 0,274\nSugarWoods:160,105 160,49 135,51 130,61 112,64 103,56 102,49 82,37 71,46 52,39 41,51 28,50 18,62 0,62 0,119 25,120 31,109 21,92 28,80 49,78 52,72 72,64 82,70 84,84 76,95 77,100 96,115 105,111 118,120 132,117 137,105\nCarrotQuarry:52,177 44,162 49,139 29,133 18,147 27,163 20,174 0,175 0,228 27,225 22,201 29,193 39,193;76,95 53,88 44,107 31,109 21,92 28,80 49,78 52,72 72,64 82,70 84,84;96,115 77,100 60,121 60,127 89,130;89,239 73,227 76,211 95,208 105,224;137,163 132,149 113,143 118,120 132,117 144,134 160,134 160,163\nOcean:29,133 25,120 0,119 0,146 18,147;76,211 69,204 50,208 39,193 29,193 22,201 27,225 28,225 45,221 58,234 73,227;130,210 129,210 115,194 124,175 130,173 146,192\nRust:27,163 18,147 0,146 0,175 20,174;111,225 105,224 95,208 100,196 115,194 129,210;144,134 132,117 137,105 160,105 160,134;142,222 130,210 146,192 130,173 137,163 160,163 160,222\nForest:89,247 89,239 73,227 58,234 45,221 28,225 27,225 0,228 0,247 25,250 29,246 51,250 56,247 78,257\nWasteland:160,250 160,222 142,222 130,210 129,210 111,225 105,224 89,239 89,247 106,257 122,244 132,246 134,248",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 74,
            "y": 158
          },
          {
            "id": "MassiveHeatSink",
            "x": 108,
            "y": 191
          },
          {
            "id": "GravitasPedestal",
            "x": 137,
            "y": 115
          },
          {
            "id": "WarpConduitSender",
            "x": 102,
            "y": 68
          },
          {
            "id": "WarpConduitReceiver",
            "x": 137,
            "y": 176
          },
          {
            "id": "WarpPortal",
            "x": 23,
            "y": 105
          },
          {
            "id": "WarpReceiver",
            "x": 24,
            "y": 111
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "x": 27,
            "y": 199,
            "emitRate": 9872,
            "avgEmitRate": 2634,
            "idleTime": 236,
            "eruptionTime": 224,
            "dormancyCycles": 68.4,
            "activeCycles": 82.7
          },
          {
            "id": "liquid_co2",
            "x": 32,
            "y": 186,
            "emitRate": 940,
            "avgEmitRate": 151,
            "idleTime": 420,
            "eruptionTime": 164,
            "dormancyCycles": 58.6,
            "activeCycles": 78.2
          },
          {
            "id": "slush_salt_water",
            "x": 38,
            "y": 159,
            "emitRate": 8484,
            "avgEmitRate": 1668,
            "idleTime": 282,
            "eruptionTime": 155,
            "dormancyCycles": 62.6,
            "activeCycles": 77.6
          },
          {
            "id": "salt_water",
            "x": 88,
            "y": 78,
            "emitRate": 8981,
            "avgEmitRate": 2836,
            "idleTime": 285,
            "eruptionTime": 343,
            "dormancyCycles": 57.9,
            "activeCycles": 79.3
          },
          {
            "id": "filthy_water",
            "x": 55,
            "y": 67,
            "emitRate": 12890,
            "avgEmitRate": 3338,
            "idleTime": 237,
            "eruptionTime": 186,
            "dormancyCycles": 77.4,
            "activeCycles": 110.3
          },
          {
            "id": "methane",
            "x": 85,
            "y": 100,
            "emitRate": 418,
            "avgEmitRate": 86,
            "idleTime": 296,
            "eruptionTime": 202,
            "dormancyCycles": 56.3,
            "activeCycles": 57.6
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
        "biomePaths": "Swamp:128,63 128,41 110,42 104,52 89,52 83,43 72,42 65,48 48,45 46,39 26,33 21,40 0,38 0,58 21,58 24,54 43,54 47,68 43,73 46,85 34,97 41,110 51,110 57,90 66,87 73,90 77,110 87,110 96,97 86,86 90,75 105,73 110,63\nMetallic:41,110 34,97 24,95 16,108 0,107 0,132 13,130 23,140 38,131 34,118;43,73 25,70 21,58 24,54 43,54 47,68;69,139 53,132 57,116 72,116 76,132;112,132 106,126 117,109 106,96 96,97 86,86 90,75 105,73 110,63 128,63 128,133\nBoggyMarsh:46,85 43,73 25,70 21,58 0,58 0,107 16,108 24,95 34,97;72,116 57,116 51,110 57,90 66,87 73,90 77,110;106,126 97,125 87,110 96,97 106,96 117,109\nRadioactive:69,153 69,139 53,132 57,116 51,110 41,110 34,118 38,131 23,140 13,130 0,132 0,153;128,153 128,133 112,132 106,126 97,125 87,110 77,110 72,116 76,132 88,134 94,153\nFrozenWastes:94,153 88,134 76,132 69,139 69,153",
        "pointsOfInterest": [
          {
            "id": "PropSurfaceSatellite3",
            "x": 50,
            "y": 72
          },
          {
            "id": "GeneShuffler",
            "x": 31,
            "y": 94
          }
        ],
        "geysers": [
          {
            "id": "molten_cobalt",
            "x": 98,
            "y": 92,
            "emitRate": 7262,
            "avgEmitRate": 262,
            "idleTime": 724,
            "eruptionTime": 55,
            "dormancyCycles": 40.7,
            "activeCycles": 43.0
          },
          {
            "id": "molten_gold",
            "x": 21,
            "y": 114,
            "emitRate": 8812,
            "avgEmitRate": 321,
            "idleTime": 721,
            "eruptionTime": 48,
            "dormancyCycles": 71.6,
            "activeCycles": 99.9
          },
          {
            "id": "molten_cobalt",
            "x": 114,
            "y": 93,
            "emitRate": 9179,
            "avgEmitRate": 322,
            "idleTime": 838,
            "eruptionTime": 47,
            "dormancyCycles": 37.7,
            "activeCycles": 71.4
          },
          {
            "id": "molten_gold",
            "x": 114,
            "y": 82,
            "emitRate": 14051,
            "avgEmitRate": 295,
            "idleTime": 660,
            "eruptionTime": 22,
            "dormancyCycles": 47.1,
            "activeCycles": 86.4
          },
          {
            "id": "liquid_co2",
            "x": 59,
            "y": 137,
            "emitRate": 697,
            "avgEmitRate": 142,
            "idleTime": 469,
            "eruptionTime": 283,
            "dormancyCycles": 44.0,
            "activeCycles": 51.8
          },
          {
            "id": "liquid_co2",
            "x": 32,
            "y": 140,
            "emitRate": 516,
            "avgEmitRate": 124,
            "idleTime": 198,
            "eruptionTime": 128,
            "dormancyCycles": 55.1,
            "activeCycles": 87.4
          },
          {
            "id": "chlorine_gas",
            "x": 95,
            "y": 63,
            "emitRate": 635,
            "avgEmitRate": 103,
            "idleTime": 317,
            "eruptionTime": 107,
            "dormancyCycles": 47.1,
            "activeCycles": 86.4
          },
          {
            "id": "slimy_po2",
            "x": 77,
            "y": 123,
            "emitRate": 344,
            "avgEmitRate": 105,
            "idleTime": 247,
            "eruptionTime": 247,
            "dormancyCycles": 71.8,
            "activeCycles": 113.4
          },
          {
            "id": "hot_hydrogen",
            "x": 115,
            "y": 121,
            "emitRate": 342,
            "avgEmitRate": 104,
            "idleTime": 465,
            "eruptionTime": 446,
            "dormancyCycles": 47.8,
            "activeCycles": 78.1
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
          "MetalRich",
          "RadioactiveCrust"
        ],
        "biomePaths": "Sandstone:40,103 26,91 18,85 17,68 0,67 0,104 15,107 20,115 33,117;113,109 105,99 95,99 88,108 76,109 71,116 57,117 49,101 52,98 48,79 52,76 54,59 48,53 55,39 66,37 73,44 71,57 75,63 88,64 94,75 105,75 113,62 128,62 128,109\nOcean:54,59 48,53 40,53 31,40 22,40 16,47 0,48 0,67 17,68 22,63 31,64 39,78 48,79 52,76;113,62 105,75 94,75 88,64 75,63 71,57 73,44 87,41 97,49 103,49 110,40 128,40 128,62\nRust:52,98 48,79 39,78 31,64 22,63 17,68 18,85 26,91 40,103 49,101\nOilField:43,150 32,135 37,124 51,126 55,134;128,153 128,109 113,109 105,99 95,99 88,108 76,109 71,116 57,117 49,101 40,103 33,117 20,115 15,107 0,104 0,129 12,129 20,137 16,153\nMagmaCore:20,137 12,129 0,129 0,153 16,153;43,150 32,135 37,124 51,126 55,134",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "x": 55,
            "y": 116
          },
          {
            "id": "WarpConduitReceiver",
            "x": 22,
            "y": 113
          },
          {
            "id": "WarpPortal",
            "x": 53,
            "y": 71
          },
          {
            "id": "WarpReceiver",
            "x": 75,
            "y": 71
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "x": 113,
            "y": 137,
            "emitRate": 4752,
            "avgEmitRate": 1514,
            "idleTime": 319,
            "eruptionTime": 426,
            "dormancyCycles": 52.9,
            "activeCycles": 66.7
          },
          {
            "id": "OilWell",
            "x": 17,
            "y": 126,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 80,
            "y": 117,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 107,
            "y": 125,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 84,
            "y": 138,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 107,
            "y": 116,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "hot_co2",
            "x": 71,
            "y": 126,
            "emitRate": 535,
            "avgEmitRate": 101,
            "idleTime": 460,
            "eruptionTime": 233,
            "dormancyCycles": 65.5,
            "activeCycles": 82.7
          },
          {
            "id": "small_volcano",
            "x": 43,
            "y": 81,
            "emitRate": 113916,
            "avgEmitRate": 673,
            "idleTime": 9403,
            "eruptionTime": 84,
            "dormancyCycles": 39.6,
            "activeCycles": 80.8
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
          "RadioactiveCrust"
        ],
        "biomePaths": "FrozenWastes:64,128 64,34 46,38 45,37 28,47 25,46 20,34 19,34 0,39 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 21,
            "y": 46
          },
          {
            "id": "GravitasPedestal",
            "x": 29,
            "y": 117
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 13,
            "y": 94,
            "emitRate": 8933,
            "avgEmitRate": 317,
            "idleTime": 678,
            "eruptionTime": 37,
            "dormancyCycles": 32.5,
            "activeCycles": 72.7
          },
          {
            "id": "molten_iron",
            "x": 49,
            "y": 106,
            "emitRate": 14258,
            "avgEmitRate": 337,
            "idleTime": 699,
            "eruptionTime": 27,
            "dormancyCycles": 41.3,
            "activeCycles": 73.8
          },
          {
            "id": "molten_iron",
            "x": 49,
            "y": 84,
            "emitRate": 8272,
            "avgEmitRate": 292,
            "idleTime": 778,
            "eruptionTime": 46,
            "dormancyCycles": 28.6,
            "activeCycles": 48.6
          },
          {
            "id": "molten_iron",
            "x": 43,
            "y": 98,
            "emitRate": 9399,
            "avgEmitRate": 333,
            "idleTime": 814,
            "eruptionTime": 49,
            "dormancyCycles": 54.8,
            "activeCycles": 91.4
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
        "biomePaths": "BoggyMarsh:64,55 64,43 49,40 46,28 30,31 27,29 16,37 0,30 0,56 2,56 16,47 25,52 24,64 32,68 46,61 46,60\nToxicJungle:64,77 64,55 46,60 46,61 32,68 24,64 25,52 16,47 2,56 0,56 0,80 13,77 22,87 33,78 44,83 52,76\nFrozenWastes:64,96 64,77 52,76 44,83 33,78 22,87 13,77 0,80 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 35,
            "y": 43
          },
          {
            "id": "GravitasPedestal",
            "x": 21,
            "y": 43
          },
          {
            "id": "SapTree",
            "x": 28,
            "y": 43
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 11,
            "y": 69,
            "emitRate": 13380,
            "avgEmitRate": 366,
            "idleTime": 873,
            "eruptionTime": 40,
            "dormancyCycles": 44.4,
            "activeCycles": 73.8
          },
          {
            "id": "molten_tungsten",
            "x": 54,
            "y": 87,
            "emitRate": 6511,
            "avgEmitRate": 279,
            "idleTime": 687,
            "eruptionTime": 44,
            "dormancyCycles": 41.7,
            "activeCycles": 100.3
          },
          {
            "id": "chlorine_gas",
            "x": 56,
            "y": 66,
            "emitRate": 264,
            "avgEmitRate": 83,
            "idleTime": 119,
            "eruptionTime": 142,
            "dormancyCycles": 56.8,
            "activeCycles": 78.1
          },
          {
            "id": "hot_hydrogen",
            "x": 25,
            "y": 72,
            "emitRate": 311,
            "avgEmitRate": 114,
            "idleTime": 186,
            "eruptionTime": 268,
            "dormancyCycles": 54.4,
            "activeCycles": 88.5
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
        "biomePaths": "Moo:96,60 96,39 87,39 77,48 67,44 59,48 50,43 49,32 38,27 31,32 19,28 10,38 0,39 0,59 16,60 31,65 39,59 48,65 59,60 65,64 80,60\nFrozenWastes:96,80 96,60 80,60 65,64 59,60 48,65 39,59 31,65 16,60 0,59 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 69,
            "y": 56
          },
          {
            "id": "GravitasPedestal",
            "x": 62,
            "y": 56
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 10,
            "y": 52,
            "emitRate": 861,
            "avgEmitRate": 105,
            "idleTime": 418,
            "eruptionTime": 97,
            "dormancyCycles": 49.8,
            "activeCycles": 92.9
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
        "biomePaths": "Barren:80,135 80,48 62,44 60,38 50,33 39,38 37,42 21,43 16,35 0,35 0,136 14,135 21,143 32,141 37,129 43,128 50,133 52,144 63,147 72,135;80,174 80,158 66,155 58,166 42,153 37,160 19,157 17,155 0,155 0,174\nSwamp:80,158 80,135 72,135 63,147 52,144 50,133 43,128 37,129 32,141 21,143 14,135 0,136 0,155 17,155 19,157 37,160 42,153 58,166 66,155",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 48,
            "y": 143
          },
          {
            "id": "GravitasPedestal",
            "x": 50,
            "y": 143
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "x": 30,
            "y": 64,
            "emitRate": 12686,
            "avgEmitRate": 3227,
            "idleTime": 436,
            "eruptionTime": 325,
            "dormancyCycles": 51.0,
            "activeCycles": 75.2
          },
          {
            "id": "hot_water",
            "x": 28,
            "y": 114,
            "emitRate": 8003,
            "avgEmitRate": 3865,
            "idleTime": 225,
            "eruptionTime": 411,
            "dormancyCycles": 30.3,
            "activeCycles": 89.3
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
          "LushCore"
        ],
        "biomePaths": "MagmaCore:64,46 64,26 47,31 46,33 34,40 23,24 22,24 12,36 0,35 0,55 16,54 20,61 11,74 16,81 29,81 33,76 28,63 39,55 44,56 54,46;64,80 64,65 49,64 44,76 48,81\nOilField:20,61 16,54 0,55 0,73 11,74;64,65 64,46 54,46 44,56 39,55 28,63 33,76 44,76 49,64\nForest:64,96 64,80 48,81 44,76 33,76 29,81 16,81 11,74 0,73 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 16,
            "y": 63
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 50,
            "y": 54,
            "emitRate": 290747,
            "avgEmitRate": 1214,
            "idleTime": 10928,
            "eruptionTime": 79,
            "dormancyCycles": 53.0,
            "activeCycles": 74.0
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
        "biomePaths": "Barren:20,76 16,60 0,60 0,79 18,78;52,78 39,81 33,75 38,60 49,60 55,73;88,60 86,54 74,50 68,54 68,71 73,74 80,74;123,72 116,57 108,56 100,64 103,76 116,77;160,71 160,54 142,53 139,56 139,60 149,73\nSandstone:33,75 20,76 16,60 20,55 34,55 38,60;68,71 68,54 56,51 49,60 55,73;103,76 100,64 88,60 80,74 86,80 101,78;149,73 139,60 139,56 125,50 116,57 123,72 125,73 133,82 145,79\nFrozenWastes:160,96 160,71 149,73 145,79 133,82 125,73 123,72 116,77 103,76 101,78 86,80 80,74 73,74 68,71 55,73 52,78 39,81 33,75 20,76 18,78 0,79 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 110,
            "y": 77
          },
          {
            "id": "GravitasPedestal",
            "x": 114,
            "y": 77
          },
          {
            "id": "GeneShuffler",
            "x": 112,
            "y": 71
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "x": 43,
            "y": 84,
            "emitRate": 2609,
            "avgEmitRate": 809,
            "idleTime": 286,
            "eruptionTime": 311,
            "dormancyCycles": 56.9,
            "activeCycles": 83.8
          },
          {
            "id": "steam",
            "x": 28,
            "y": 81,
            "emitRate": 6268,
            "avgEmitRate": 1272,
            "idleTime": 545,
            "eruptionTime": 370,
            "dormancyCycles": 48.5,
            "activeCycles": 48.9
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
        "q": -1,
        "r": -2
      },
      {
        "id": "OilRichWarpTarget",
        "q": 3,
        "r": 1
      },
      {
        "id": "TundraMoonlet",
        "q": -1,
        "r": 7
      },
      {
        "id": "MarshyMoonlet",
        "q": -7,
        "r": 0
      },
      {
        "id": "MooMoonlet",
        "q": 1,
        "r": -6
      },
      {
        "id": "WaterMoonlet",
        "q": -6,
        "r": 7
      },
      {
        "id": "NiobiumMoonlet",
        "q": 9,
        "r": -1
      },
      {
        "id": "RegolithMoonlet",
        "q": 10,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": -4,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_DLC2CeresOreField",
        "q": 3,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 7,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -9,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -10,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 8,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -6,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 11,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -5,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -5,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -3,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 4,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 5,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 6,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 4,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 5,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -2,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 0,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -9,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -8,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -9,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 6,
        "r": 5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 6,
        "r": -1
      }
    ]
  },
  {
    "coordinate": "FRST-C-858965588-0-0-0",
    "cluster": "FRST-C",
    "dlcs": [
      "FrostyPlanet",
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
          "BouldersSmall",
          "BouldersLarge",
          "SubsurfaceOcean",
          "Volcanoes"
        ],
        "biomePaths": "Forest:131,150 112,151 105,166 82,178 57,165 51,169 29,165 25,158 31,142 27,135 31,118 50,116 58,127 84,116 94,118 106,127 115,121 134,132 136,144\nWasteland:65,204 64,200 50,189 31,196 22,183 0,184 0,207 29,206 33,214 52,217;81,103 54,99 55,83 70,75 84,84 86,95;127,213 116,217 98,205 99,198 116,186 131,196;160,169 160,116 151,115 142,101 115,112 115,121 134,132 136,144 131,150 136,169\nToxicJungle:29,165 25,158 0,157 0,184 22,183;84,116 81,103 54,99 50,105 50,116 58,127;135,193 132,175 116,179 105,166 112,151 131,150 136,169 160,169 160,194\nMagmaCore:31,118 28,111 30,106 50,105 50,116;115,121 115,112 106,103 104,104 86,95 81,103 84,116 94,118 106,127;135,193 132,175 116,179 116,186 131,196;151,115 142,101 144,96 160,93 160,116;160,274 160,229 150,231 137,249 121,252 110,243 96,247 84,241 72,246 60,243 48,253 24,247 22,244 0,241 0,274\nOcean:160,93 160,62 141,61 130,78 119,78 105,63 105,62 88,48 71,53 61,46 47,50 39,72 31,74 15,56 0,55 0,89 22,88 30,106 50,105 54,99 55,83 70,75 84,84 86,95 104,104 106,103 115,112 142,101 144,96\nFrozenWastes:31,142 27,135 31,118 28,111 30,106 22,88 0,89 0,157 25,158;50,189 31,196 22,183 29,165 51,169;99,198 82,180 64,200 65,204 85,213 98,205\nBarren:160,229 160,194 135,193 131,196 127,213 116,217 98,205 85,213 65,204 52,217 33,214 29,206 0,207 0,241 22,244 24,247 48,253 60,243 72,246 84,241 96,247 110,243 121,252 137,249 150,231\nRust:99,198 82,180 64,200 50,189 51,169 57,165 82,178 105,166 116,179 116,186",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 81,
            "y": 151
          },
          {
            "id": "MassiveHeatSink",
            "x": 97,
            "y": 205
          },
          {
            "id": "WarpConduitSender",
            "x": 123,
            "y": 158
          },
          {
            "id": "WarpConduitReceiver",
            "x": 47,
            "y": 199
          },
          {
            "id": "GravitasPedestal",
            "x": 16,
            "y": 93
          },
          {
            "id": "WarpPortal",
            "x": 126,
            "y": 122
          },
          {
            "id": "WarpReceiver",
            "x": 127,
            "y": 128
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 17,
            "y": 173,
            "emitRate": 7684,
            "avgEmitRate": 1270,
            "idleTime": 303,
            "eruptionTime": 159,
            "dormancyCycles": 78.4,
            "activeCycles": 72.5
          },
          {
            "id": "hot_hydrogen",
            "x": 70,
            "y": 122,
            "emitRate": 258,
            "avgEmitRate": 109,
            "idleTime": 280,
            "eruptionTime": 393,
            "dormancyCycles": 18.0,
            "activeCycles": 47.3
          },
          {
            "id": "slush_salt_water",
            "x": 75,
            "y": 193,
            "emitRate": 4722,
            "avgEmitRate": 1404,
            "idleTime": 246,
            "eruptionTime": 289,
            "dormancyCycles": 76.3,
            "activeCycles": 93.3
          },
          {
            "id": "slush_water",
            "x": 20,
            "y": 140,
            "emitRate": 5916,
            "avgEmitRate": 1436,
            "idleTime": 397,
            "eruptionTime": 296,
            "dormancyCycles": 54.3,
            "activeCycles": 71.4
          },
          {
            "id": "small_volcano",
            "x": 95,
            "y": 238,
            "emitRate": 146965,
            "avgEmitRate": 675,
            "idleTime": 11149,
            "eruptionTime": 77,
            "dormancyCycles": 43.5,
            "activeCycles": 88.4
          },
          {
            "id": "small_volcano",
            "x": 33,
            "y": 241,
            "emitRate": 128184,
            "avgEmitRate": 616,
            "idleTime": 10118,
            "eruptionTime": 81,
            "dormancyCycles": 55.6,
            "activeCycles": 85.7
          },
          {
            "id": "liquid_co2",
            "x": 91,
            "y": 88,
            "emitRate": 645,
            "avgEmitRate": 175,
            "idleTime": 432,
            "eruptionTime": 310,
            "dormancyCycles": 50.8,
            "activeCycles": 93.6
          },
          {
            "id": "big_volcano",
            "x": 133,
            "y": 97,
            "emitRate": 233969,
            "avgEmitRate": 1051,
            "idleTime": 8961,
            "eruptionTime": 64,
            "dormancyCycles": 55.1,
            "activeCycles": 93.7
          },
          {
            "id": "methane",
            "x": 64,
            "y": 64,
            "emitRate": 439,
            "avgEmitRate": 97,
            "idleTime": 539,
            "eruptionTime": 321,
            "dormancyCycles": 37.6,
            "activeCycles": 55.1
          },
          {
            "id": "big_volcano",
            "x": 125,
            "y": 185,
            "emitRate": 323876,
            "avgEmitRate": 1300,
            "idleTime": 8621,
            "eruptionTime": 60,
            "dormancyCycles": 46.9,
            "activeCycles": 65.3
          },
          {
            "id": "big_volcano",
            "x": 106,
            "y": 116,
            "emitRate": 229602,
            "avgEmitRate": 1070,
            "idleTime": 6953,
            "eruptionTime": 47,
            "dormancyCycles": 60.9,
            "activeCycles": 136.3
          },
          {
            "id": "big_volcano",
            "x": 39,
            "y": 112,
            "emitRate": 266605,
            "avgEmitRate": 1056,
            "idleTime": 9000,
            "eruptionTime": 60,
            "dormancyCycles": 51.2,
            "activeCycles": 76.7
          },
          {
            "id": "big_volcano",
            "x": 90,
            "y": 107,
            "emitRate": 275095,
            "avgEmitRate": 1243,
            "idleTime": 10506,
            "eruptionTime": 74,
            "dormancyCycles": 44.6,
            "activeCycles": 80.1
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
          "MetalPoor"
        ],
        "biomePaths": "Swamp:128,66 128,47 109,45 103,51 87,46 83,39 66,37 61,47 46,49 41,39 23,38 21,42 0,41 0,60 22,60 24,61 26,71 42,77 44,94 42,98 44,112 51,117 67,109 71,110 85,106 84,86 83,85 84,69 104,64 107,68\nMetallic:42,137 26,129 26,121 20,112 24,100 42,98 44,112 51,117 52,130;92,129 92,110 85,106 71,110 74,129 85,133;112,112 108,108 111,89 106,83 84,86 83,85 84,69 104,64 107,68 128,66 128,111\nBoggyMarsh:44,94 42,77 26,71 24,61 22,60 0,60 0,114 20,112 24,100 42,98;111,89 106,83 84,86 85,106 92,110 108,108\nRadioactive:128,153 128,111 112,112 108,108 92,110 92,129 85,133 74,129 71,110 67,109 51,117 52,130 42,137 26,129 26,121 20,112 0,114 0,153",
        "pointsOfInterest": [
          {
            "id": "PropSurfaceSatellite3",
            "x": 51,
            "y": 70
          }
        ],
        "geysers": [
          {
            "id": "molten_cobalt",
            "x": 89,
            "y": 124,
            "emitRate": 7447,
            "avgEmitRate": 256,
            "idleTime": 788,
            "eruptionTime": 52,
            "dormancyCycles": 72.9,
            "activeCycles": 89.6
          },
          {
            "id": "molten_gold",
            "x": 103,
            "y": 79,
            "emitRate": 5692,
            "avgEmitRate": 267,
            "idleTime": 613,
            "eruptionTime": 48,
            "dormancyCycles": 43.6,
            "activeCycles": 81.4
          },
          {
            "id": "molten_gold",
            "x": 29,
            "y": 116,
            "emitRate": 7991,
            "avgEmitRate": 263,
            "idleTime": 742,
            "eruptionTime": 41,
            "dormancyCycles": 55.1,
            "activeCycles": 93.7
          },
          {
            "id": "molten_cobalt",
            "x": 35,
            "y": 103,
            "emitRate": 9882,
            "avgEmitRate": 340,
            "idleTime": 624,
            "eruptionTime": 40,
            "dormancyCycles": 66.8,
            "activeCycles": 88.6
          },
          {
            "id": "liquid_co2",
            "x": 109,
            "y": 139,
            "emitRate": 720,
            "avgEmitRate": 161,
            "idleTime": 309,
            "eruptionTime": 187,
            "dormancyCycles": 74.9,
            "activeCycles": 109.0
          },
          {
            "id": "liquid_co2",
            "x": 80,
            "y": 139,
            "emitRate": 418,
            "avgEmitRate": 151,
            "idleTime": 260,
            "eruptionTime": 428,
            "dormancyCycles": 61.5,
            "activeCycles": 84.8
          },
          {
            "id": "hot_hydrogen",
            "x": 67,
            "y": 113,
            "emitRate": 250,
            "avgEmitRate": 97,
            "idleTime": 189,
            "eruptionTime": 427,
            "dormancyCycles": 57.0,
            "activeCycles": 72.0
          },
          {
            "id": "molten_copper",
            "x": 38,
            "y": 125,
            "emitRate": 7991,
            "avgEmitRate": 263,
            "idleTime": 742,
            "eruptionTime": 41,
            "dormancyCycles": 55.1,
            "activeCycles": 93.7
          },
          {
            "id": "chlorine_gas",
            "x": 114,
            "y": 117,
            "emitRate": 1065,
            "avgEmitRate": 124,
            "idleTime": 367,
            "eruptionTime": 85,
            "dormancyCycles": 54.2,
            "activeCycles": 87.8
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
          "IrregularOil",
          "Geodes"
        ],
        "biomePaths": "Sandstone:128,65 128,45 110,45 103,55 106,65;110,106 104,93 89,95 88,110 71,114 64,107 49,111 46,118 28,123 21,112 23,103 41,98 43,90 37,80 41,67 56,66 62,76 82,72 84,74 102,72 108,85 128,83 128,104\nRust:41,98 23,103 17,93 21,81 37,80 43,90;108,85 102,72 106,65 128,65 128,83\nOcean:106,65 103,55 85,51 81,56 61,55 57,46 41,43 40,42 21,40 14,50 0,50 0,74 16,74 22,62 36,62 41,67 56,66 62,76 82,72 84,74 102,72\nOilField:128,153 128,104 110,106 104,93 89,95 88,110 71,114 64,107 49,111 46,118 28,123 21,112 23,103 17,93 21,81 37,80 41,67 36,62 22,62 16,74 0,74 0,153 20,153 20,135 28,128 42,137 51,129 63,133 63,153\nMagmaCore:63,153 63,133 51,129 42,137 28,128 20,135 20,153",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "x": 108,
            "y": 62
          },
          {
            "id": "WarpConduitReceiver",
            "x": 114,
            "y": 101
          },
          {
            "id": "WarpPortal",
            "x": 60,
            "y": 87
          },
          {
            "id": "WarpReceiver",
            "x": 82,
            "y": 87
          },
          {
            "id": "GeneShuffler",
            "x": 107,
            "y": 121
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "x": 104,
            "y": 143,
            "emitRate": 3677,
            "avgEmitRate": 1064,
            "idleTime": 306,
            "eruptionTime": 389,
            "dormancyCycles": 71.5,
            "activeCycles": 76.5
          },
          {
            "id": "OilWell",
            "x": 59,
            "y": 112,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 67,
            "y": 135,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 67,
            "y": 123,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 88,
            "y": 116,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 51,
            "y": 123,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "methane",
            "x": 78,
            "y": 129,
            "emitRate": 414,
            "avgEmitRate": 116,
            "idleTime": 267,
            "eruptionTime": 220,
            "dormancyCycles": 40.1,
            "activeCycles": 65.8
          },
          {
            "id": "liquid_sulfur",
            "x": 86,
            "y": 142,
            "emitRate": 3752,
            "avgEmitRate": 1330,
            "idleTime": 277,
            "eruptionTime": 423,
            "dormancyCycles": 40.9,
            "activeCycles": 58.1
          },
          {
            "id": "OilWell",
            "x": 95,
            "y": 102,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 17,
            "y": 83,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 28,
            "y": 79,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
          "MetalPoor"
        ],
        "biomePaths": "FrozenWastes:64,128 64,34 47,35 44,40 28,39 25,33 16,29 0,39 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 28,
            "y": 52
          },
          {
            "id": "GravitasPedestal",
            "x": 28,
            "y": 84
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 12,
            "y": 116,
            "emitRate": 7447,
            "avgEmitRate": 256,
            "idleTime": 788,
            "eruptionTime": 52,
            "dormancyCycles": 72.9,
            "activeCycles": 89.6
          },
          {
            "id": "molten_iron",
            "x": 18,
            "y": 100,
            "emitRate": 16894,
            "avgEmitRate": 280,
            "idleTime": 696,
            "eruptionTime": 22,
            "dormancyCycles": 61.5,
            "activeCycles": 70.4
          },
          {
            "id": "molten_iron",
            "x": 36,
            "y": 107,
            "emitRate": 7685,
            "avgEmitRate": 258,
            "idleTime": 721,
            "eruptionTime": 50,
            "dormancyCycles": 82.9,
            "activeCycles": 90.6
          },
          {
            "id": "molten_iron",
            "x": 45,
            "y": 68,
            "emitRate": 9864,
            "avgEmitRate": 321,
            "idleTime": 747,
            "eruptionTime": 40,
            "dormancyCycles": 36.8,
            "activeCycles": 64.8
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
        "biomePaths": "BoggyMarsh:64,73 64,33 47,32 42,38 24,29 17,39 0,36 0,58 12,57 20,47 31,51 41,42 52,53 44,66 33,62 22,70 21,74 33,82 46,76 47,74\nToxicJungle:52,53 41,42 31,51 20,47 12,57 0,58 0,77 16,78 21,74 22,70 33,62 44,66\nMagmaCore:64,96 64,73 47,74 46,76 33,82 21,74 16,78 0,77 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 28,
            "y": 44
          },
          {
            "id": "GravitasPedestal",
            "x": 14,
            "y": 44
          },
          {
            "id": "SapTree",
            "x": 21,
            "y": 44
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 50,
            "y": 47,
            "emitRate": 11383,
            "avgEmitRate": 363,
            "idleTime": 657,
            "eruptionTime": 34,
            "dormancyCycles": 12.3,
            "activeCycles": 23.5
          },
          {
            "id": "molten_tungsten",
            "x": 17,
            "y": 89,
            "emitRate": 7825,
            "avgEmitRate": 384,
            "idleTime": 642,
            "eruptionTime": 46,
            "dormancyCycles": 54.3,
            "activeCycles": 150.2
          },
          {
            "id": "molten_tungsten",
            "x": 5,
            "y": 90,
            "emitRate": 8799,
            "avgEmitRate": 299,
            "idleTime": 696,
            "eruptionTime": 47,
            "dormancyCycles": 48.6,
            "activeCycles": 55.4
          },
          {
            "id": "hot_hydrogen",
            "x": 23,
            "y": 63,
            "emitRate": 451,
            "avgEmitRate": 101,
            "idleTime": 378,
            "eruptionTime": 231,
            "dormancyCycles": 61.6,
            "activeCycles": 89.0
          },
          {
            "id": "slimy_po2",
            "x": 10,
            "y": 69,
            "emitRate": 281,
            "avgEmitRate": 115,
            "idleTime": 328,
            "eruptionTime": 534,
            "dormancyCycles": 49.5,
            "activeCycles": 95.4
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
        "biomePaths": "Moo:96,59 96,40 78,40 76,41 68,41 59,30 48,35 40,29 30,35 20,29 10,40 0,40 0,62 15,60 22,68 37,62 43,67 59,60 62,62 79,60\nFrozenWastes:96,80 96,59 79,60 62,62 59,60 43,67 37,62 22,68 15,60 0,62 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 22,
            "y": 41
          },
          {
            "id": "GravitasPedestal",
            "x": 15,
            "y": 41
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 68,
            "y": 53,
            "emitRate": 318,
            "avgEmitRate": 78,
            "idleTime": 294,
            "eruptionTime": 235,
            "dormancyCycles": 55.8,
            "activeCycles": 68.7
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
        "biomePaths": "Barren:80,140 80,31 63,30 59,36 46,34 40,39 32,37 20,45 12,39 0,41 0,140 13,138 22,150 34,138 43,140 46,144 61,145 65,140;80,174 80,159 64,157 58,164 43,156 37,160 22,152 18,157 0,156 0,174\nSwamp:80,159 80,140 65,140 61,145 46,144 43,140 34,138 22,150 13,138 0,140 0,156 18,157 22,152 37,160 43,156 58,164 64,157",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 48,
            "y": 157
          },
          {
            "id": "GravitasPedestal",
            "x": 50,
            "y": 157
          }
        ],
        "geysers": [
          {
            "id": "slush_water",
            "x": 16,
            "y": 67,
            "emitRate": 5114,
            "avgEmitRate": 1806,
            "idleTime": 186,
            "eruptionTime": 277,
            "dormancyCycles": 50.5,
            "activeCycles": 72.6
          },
          {
            "id": "hot_water",
            "x": 58,
            "y": 124,
            "emitRate": 9962,
            "avgEmitRate": 2805,
            "idleTime": 389,
            "eruptionTime": 323,
            "dormancyCycles": 41.2,
            "activeCycles": 67.3
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
          "MetalPoor"
        ],
        "biomePaths": "MagmaCore:33,62 31,48 22,42 12,55 18,64 31,64;64,96 64,33 46,32 32,28 21,39 16,35 0,38 0,75 12,75 18,81 15,96 34,96 33,79 48,78 53,96\nOilField:18,81 12,75 0,75 0,96 15,96;33,62 31,48 22,42 12,55 18,64 31,64;53,96 48,78 33,79 34,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 31,
            "y": 52
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 9,
            "y": 86,
            "emitRate": 257697,
            "avgEmitRate": 1019,
            "idleTime": 9877,
            "eruptionTime": 79,
            "dormancyCycles": 63.6,
            "activeCycles": 63.5
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
        "biomePaths": "Barren:26,56 19,46 0,54 0,80 15,78 17,66 25,61;53,79 43,72 47,60 61,57 66,75;96,76 85,79 78,73 82,58 97,59;128,78 120,81 114,76 114,63 101,56 102,49 115,42 124,49 123,58 134,66;160,79 160,43 142,47 144,61 140,65 148,79\nSandstone:43,72 36,74 33,79 19,82 15,78 17,66 25,61 26,56 40,51 47,60;78,73 66,76 66,75 61,57 63,54 78,53 82,58;101,79 96,76 97,59 101,56 114,63 114,76;139,88 128,78 134,66 123,58 124,49 137,43 142,47 144,61 140,65 148,79\nFrozenWastes:160,96 160,79 148,79 139,88 128,78 120,81 114,76 101,79 96,76 85,79 78,73 66,76 66,75 53,79 43,72 36,74 33,79 19,82 15,78 0,80 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 116,
            "y": 59
          },
          {
            "id": "GravitasPedestal",
            "x": 120,
            "y": 59
          },
          {
            "id": "GeneShuffler",
            "x": 118,
            "y": 53
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "x": 9,
            "y": 84,
            "emitRate": 2569,
            "avgEmitRate": 705,
            "idleTime": 420,
            "eruptionTime": 319,
            "dormancyCycles": 27.4,
            "activeCycles": 47.8
          },
          {
            "id": "steam",
            "x": 113,
            "y": 85,
            "emitRate": 6607,
            "avgEmitRate": 1601,
            "idleTime": 191,
            "eruptionTime": 144,
            "dormancyCycles": 30.0,
            "activeCycles": 38.7
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
        "q": -3,
        "r": 3
      },
      {
        "id": "OilRichWarpTarget",
        "q": -4,
        "r": 0
      },
      {
        "id": "TundraMoonlet",
        "q": 2,
        "r": -8
      },
      {
        "id": "MarshyMoonlet",
        "q": 5,
        "r": -1
      },
      {
        "id": "MooMoonlet",
        "q": -4,
        "r": -4
      },
      {
        "id": "WaterMoonlet",
        "q": -5,
        "r": 8
      },
      {
        "id": "NiobiumMoonlet",
        "q": 9,
        "r": -6
      },
      {
        "id": "RegolithMoonlet",
        "q": -9,
        "r": 2
      },
      {
        "id": "TemporalTear",
        "q": -3,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 1,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 2,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 3,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 8,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 7,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 6,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 9,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -8,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 10,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -7,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -1,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -1,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 6,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 6,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -11,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -10,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 9,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 10,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 1,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -2,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -3,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -3,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 4,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": 2,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -8,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -2,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 6,
        "r": 1
      }
    ]
  },
  {
    "coordinate": "SWMP-C-557407634-0-0-0",
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
          "BouldersSmall",
          "SlimeSplats"
        ],
        "biomePaths": "Swamp:85,194 84,194 58,190 52,203 30,204 24,194 29,181 20,168 29,151 46,155 58,139 51,127 58,112 78,111 83,120 79,135 98,148 105,168\nWasteland:107,169 116,183 107,202 109,205 103,222 86,226 77,216 59,218 52,203 58,190 84,194 85,194 105,168 98,148 111,136 128,142 131,153;139,187 136,184 138,159 160,156 160,188\nToxicJungle:138,159 131,153 128,142 111,136 106,120 83,120 78,111 58,112 51,127 31,127 24,141 29,151 20,168 29,181 24,194 30,204 52,203 59,218 55,226 30,228 26,221 0,221 0,86 23,86 29,74 49,73 57,84 76,83 84,94 104,93 111,82 130,83 138,98 160,98 160,156;160,216 160,188 139,187 136,184 116,183 107,202 109,205 103,222 113,233 133,228 137,217\nSandstone:160,98 160,65 141,65 132,52 116,51 105,66 84,61 84,60 61,51 56,53 32,40 20,55 0,54 0,86 23,86 29,74 49,73 57,84 76,83 84,94 104,93 111,82 130,83 138,98\nFrozenWastes:58,139 51,127 31,127 24,141 29,151 46,155;98,148 79,135 83,120 106,120 111,136;138,159 131,153 107,169 116,183 136,184\nBarren:160,246 160,216 137,217 133,228 113,233 103,222 86,226 77,216 59,218 55,226 30,228 26,221 0,221 0,246 25,248 27,246 49,253 60,244 76,248 81,244 102,253 110,248 131,258 143,245\nMagmaCore:160,274 160,246 143,245 131,258 110,248 102,253 81,244 76,248 60,244 49,253 27,246 25,248 0,246 0,274",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 72,
            "y": 166
          },
          {
            "id": "MassiveHeatSink",
            "x": 132,
            "y": 182
          },
          {
            "id": "WarpConduitSender",
            "x": 47,
            "y": 224
          },
          {
            "id": "WarpConduitReceiver",
            "x": 25,
            "y": 102
          },
          {
            "id": "GravitasPedestal",
            "x": 17,
            "y": 177
          },
          {
            "id": "WarpPortal",
            "x": 127,
            "y": 115
          },
          {
            "id": "WarpReceiver",
            "x": 128,
            "y": 121
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 16,
            "y": 134,
            "emitRate": 5677,
            "avgEmitRate": 1479,
            "idleTime": 290,
            "eruptionTime": 251,
            "dormancyCycles": 54.7,
            "activeCycles": 70.0
          },
          {
            "id": "chlorine_gas",
            "x": 132,
            "y": 141,
            "emitRate": 353,
            "avgEmitRate": 108,
            "idleTime": 259,
            "eruptionTime": 275,
            "dormancyCycles": 58.6,
            "activeCycles": 85.5
          },
          {
            "id": "slush_water",
            "x": 91,
            "y": 124,
            "emitRate": 3835,
            "avgEmitRate": 1380,
            "idleTime": 214,
            "eruptionTime": 302,
            "dormancyCycles": 51.7,
            "activeCycles": 82.7
          },
          {
            "id": "slush_salt_water",
            "x": 53,
            "y": 142,
            "emitRate": 5153,
            "avgEmitRate": 1598,
            "idleTime": 349,
            "eruptionTime": 406,
            "dormancyCycles": 58.4,
            "activeCycles": 79.5
          },
          {
            "id": "small_volcano",
            "x": 35,
            "y": 242,
            "emitRate": 137136,
            "avgEmitRate": 473,
            "idleTime": 8332,
            "eruptionTime": 57,
            "dormancyCycles": 61.6,
            "activeCycles": 63.2
          },
          {
            "id": "small_volcano",
            "x": 18,
            "y": 243,
            "emitRate": 142468,
            "avgEmitRate": 744,
            "idleTime": 10318,
            "eruptionTime": 79,
            "dormancyCycles": 42.9,
            "activeCycles": 92.9
          },
          {
            "id": "small_volcano",
            "x": 21,
            "y": 230,
            "emitRate": 115176,
            "avgEmitRate": 499,
            "idleTime": 9211,
            "eruptionTime": 74,
            "dormancyCycles": 37.8,
            "activeCycles": 44.9
          },
          {
            "id": "liquid_co2",
            "x": 147,
            "y": 177,
            "emitRate": 415,
            "avgEmitRate": 186,
            "idleTime": 167,
            "eruptionTime": 286,
            "dormancyCycles": 31.5,
            "activeCycles": 77.6
          },
          {
            "id": "big_volcano",
            "x": 138,
            "y": 201,
            "emitRate": 244556,
            "avgEmitRate": 1020,
            "idleTime": 8884,
            "eruptionTime": 73,
            "dormancyCycles": 51.2,
            "activeCycles": 54.2
          },
          {
            "id": "chlorine_gas",
            "x": 123,
            "y": 227,
            "emitRate": 374,
            "avgEmitRate": 88,
            "idleTime": 356,
            "eruptionTime": 225,
            "dormancyCycles": 48.6,
            "activeCycles": 75.3
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
          "MetalRich",
          "Geodes"
        ],
        "biomePaths": "Forest:128,68 128,45 112,46 106,35 90,34 85,42 76,43 69,56 60,57 50,43 46,42 36,49 24,48 19,40 0,39 0,60 17,60 26,72 39,71 47,93 44,97 46,114 62,117 66,114 84,119 92,110 84,95 80,94 73,78 80,68 83,68 92,54 107,54 114,67\nBoggyMarsh:47,93 39,71 26,72 17,60 0,60 0,111 21,114 22,113 26,99 44,97;108,119 101,110 108,93 101,84 98,83 83,68 92,54 107,54 114,67 128,68 128,117\nMetallic:40,120 22,113 26,99 44,97 46,114;101,110 92,110 84,95 80,94 73,78 80,68 83,68 98,83 101,84 108,93;105,134 108,119 128,117 128,139\nRadioactive:108,119 101,110 92,110 84,119 66,114 62,117 46,114 40,120 22,113 21,114 0,111 0,153 101,153 102,136 105,134\nFrozenWastes:101,153 102,136 105,134 128,139 128,153",
        "pointsOfInterest": [
          {
            "id": "PropSurfaceSatellite3",
            "x": 65,
            "y": 62
          }
        ],
        "geysers": [
          {
            "id": "molten_gold",
            "x": 28,
            "y": 111,
            "emitRate": 6923,
            "avgEmitRate": 288,
            "idleTime": 766,
            "eruptionTime": 56,
            "dormancyCycles": 40.6,
            "activeCycles": 63.3
          },
          {
            "id": "molten_aluminum",
            "x": 94,
            "y": 84,
            "emitRate": 8014,
            "avgEmitRate": 334,
            "idleTime": 925,
            "eruptionTime": 68,
            "dormancyCycles": 32.2,
            "activeCycles": 49.9
          },
          {
            "id": "molten_aluminum",
            "x": 102,
            "y": 103,
            "emitRate": 9837,
            "avgEmitRate": 271,
            "idleTime": 800,
            "eruptionTime": 38,
            "dormancyCycles": 54.5,
            "activeCycles": 86.2
          },
          {
            "id": "molten_gold",
            "x": 77,
            "y": 79,
            "emitRate": 9056,
            "avgEmitRate": 276,
            "idleTime": 730,
            "eruptionTime": 44,
            "dormancyCycles": 57.7,
            "activeCycles": 67.8
          },
          {
            "id": "liquid_co2",
            "x": 71,
            "y": 141,
            "emitRate": 332,
            "avgEmitRate": 126,
            "idleTime": 217,
            "eruptionTime": 389,
            "dormancyCycles": 82.8,
            "activeCycles": 120.2
          },
          {
            "id": "liquid_co2",
            "x": 18,
            "y": 139,
            "emitRate": 576,
            "avgEmitRate": 144,
            "idleTime": 355,
            "eruptionTime": 263,
            "dormancyCycles": 37.1,
            "activeCycles": 53.0
          },
          {
            "id": "small_volcano",
            "x": 39,
            "y": 92,
            "emitRate": 143952,
            "avgEmitRate": 615,
            "idleTime": 8934,
            "eruptionTime": 72,
            "dormancyCycles": 62.2,
            "activeCycles": 71.0
          },
          {
            "id": "small_volcano",
            "x": 36,
            "y": 124,
            "emitRate": 144432,
            "avgEmitRate": 595,
            "idleTime": 8349,
            "eruptionTime": 60,
            "dormancyCycles": 41.1,
            "activeCycles": 55.4
          },
          {
            "id": "filthy_water",
            "x": 13,
            "y": 44,
            "emitRate": 12696,
            "avgEmitRate": 2479,
            "idleTime": 537,
            "eruptionTime": 341,
            "dormancyCycles": 55.8,
            "activeCycles": 56.5
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
          "LushCore"
        ],
        "biomePaths": "Sandstone:128,118 128,38 107,42 106,53 90,59 84,55 72,63 62,60 51,71 43,72 36,85 24,86 16,74 0,75 0,118 21,116 25,109 41,106 44,97 61,91 69,105 81,105 87,115 103,114 107,119\nOcean:107,42 102,35 82,42 78,38 60,42 57,47 41,48 34,39 21,39 14,50 0,51 0,75 16,74 23,62 35,61 43,72 51,71 62,60 72,63 84,55 90,59 106,53\nOilField:128,136 128,118 107,119 103,114 87,115 81,105 69,105 62,115 47,115 41,106 25,109 21,116 0,118 0,135 22,136 26,129 42,130 45,134 63,135 68,129 82,129 86,134 105,134 106,135\nRust:36,85 24,86 16,74 23,62 35,61 43,72;62,115 47,115 41,106 44,97 61,91 69,105\nForest:128,153 128,136 106,135 105,134 86,134 82,129 68,129 63,135 45,134 42,130 26,129 22,136 0,135 0,153",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "x": 30,
            "y": 84
          },
          {
            "id": "WarpConduitReceiver",
            "x": 96,
            "y": 69
          },
          {
            "id": "WarpPortal",
            "x": 53,
            "y": 74
          },
          {
            "id": "WarpReceiver",
            "x": 75,
            "y": 74
          },
          {
            "id": "GeneShuffler",
            "x": 81,
            "y": 115
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "x": 92,
            "y": 92,
            "emitRate": 4560,
            "avgEmitRate": 1603,
            "idleTime": 212,
            "eruptionTime": 263,
            "dormancyCycles": 50.3,
            "activeCycles": 87.3
          },
          {
            "id": "OilWell",
            "x": 25,
            "y": 115,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 91,
            "y": 127,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 69,
            "y": 126,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 102,
            "y": 131,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 26,
            "y": 125,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "liquid_sulfur",
            "x": 28,
            "y": 69,
            "emitRate": 7913,
            "avgEmitRate": 1251,
            "idleTime": 328,
            "eruptionTime": 129,
            "dormancyCycles": 73.9,
            "activeCycles": 93.8
          },
          {
            "id": "methane",
            "x": 116,
            "y": 127,
            "emitRate": 1130,
            "avgEmitRate": 121,
            "idleTime": 758,
            "eruptionTime": 152,
            "dormancyCycles": 40.8,
            "activeCycles": 72.7
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
          "MetalPoor",
          "RadioactiveCrust"
        ],
        "biomePaths": "FrozenWastes:64,128 64,31 47,32 42,45 24,36 20,39 0,29 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 28,
            "y": 44
          },
          {
            "id": "GravitasPedestal",
            "x": 24,
            "y": 117
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 19,
            "y": 100,
            "emitRate": 8563,
            "avgEmitRate": 299,
            "idleTime": 742,
            "eruptionTime": 45,
            "dormancyCycles": 44.5,
            "activeCycles": 71.8
          },
          {
            "id": "molten_iron",
            "x": 35,
            "y": 93,
            "emitRate": 8284,
            "avgEmitRate": 223,
            "idleTime": 690,
            "eruptionTime": 43,
            "dormancyCycles": 59.4,
            "activeCycles": 50.2
          },
          {
            "id": "molten_iron",
            "x": 48,
            "y": 111,
            "emitRate": 16837,
            "avgEmitRate": 340,
            "idleTime": 827,
            "eruptionTime": 27,
            "dormancyCycles": 37.6,
            "activeCycles": 66.0
          },
          {
            "id": "molten_iron",
            "x": 35,
            "y": 104,
            "emitRate": 7463,
            "avgEmitRate": 257,
            "idleTime": 595,
            "eruptionTime": 44,
            "dormancyCycles": 84.3,
            "activeCycles": 84.3
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
        "biomePaths": "BoggyMarsh:64,76 64,36 48,36 46,38 36,38 29,45 20,45 15,33 0,33 0,49 16,49 18,65 17,66 0,65 0,84 16,80 23,87 35,78 31,65 36,59 46,59 51,75\nToxicJungle:18,65 16,49 0,49 0,65 17,66;51,75 46,59 36,59 31,65 35,78 44,81\nMagmaCore:64,96 64,76 51,75 44,81 35,78 23,87 16,80 0,84 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 48,
            "y": 49
          },
          {
            "id": "GravitasPedestal",
            "x": 34,
            "y": 49
          },
          {
            "id": "SapTree",
            "x": 41,
            "y": 49
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 15,
            "y": 65,
            "emitRate": 6705,
            "avgEmitRate": 344,
            "idleTime": 744,
            "eruptionTime": 57,
            "dormancyCycles": 30.1,
            "activeCycles": 76.4
          },
          {
            "id": "molten_tungsten",
            "x": 48,
            "y": 90,
            "emitRate": 8725,
            "avgEmitRate": 306,
            "idleTime": 875,
            "eruptionTime": 53,
            "dormancyCycles": 67.9,
            "activeCycles": 106.9
          },
          {
            "id": "molten_tungsten",
            "x": 54,
            "y": 90,
            "emitRate": 8203,
            "avgEmitRate": 294,
            "idleTime": 773,
            "eruptionTime": 52,
            "dormancyCycles": 45.2,
            "activeCycles": 60.2
          },
          {
            "id": "hot_po2",
            "x": 29,
            "y": 73,
            "emitRate": 534,
            "avgEmitRate": 108,
            "idleTime": 372,
            "eruptionTime": 179,
            "dormancyCycles": 47.5,
            "activeCycles": 79.3
          },
          {
            "id": "hot_co2",
            "x": 41,
            "y": 70,
            "emitRate": 324,
            "avgEmitRate": 99,
            "idleTime": 344,
            "eruptionTime": 363,
            "dormancyCycles": 57.4,
            "activeCycles": 84.0
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
        "biomePaths": "Moo:89,53 78,39 70,39 64,29 50,30 46,36 36,37 29,45 19,45 13,37 0,37 0,58 12,58 17,63 30,64 35,58 45,58 49,63 64,65 68,60 79,61\nFrozenWastes:96,80 96,53 89,53 79,61 68,60 64,65 49,63 45,58 35,58 30,64 17,63 12,58 0,58 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 41,
            "y": 49
          },
          {
            "id": "GravitasPedestal",
            "x": 34,
            "y": 49
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 9,
            "y": 50,
            "emitRate": 313,
            "avgEmitRate": 139,
            "idleTime": 292,
            "eruptionTime": 497,
            "dormancyCycles": 25.9,
            "activeCycles": 62.2
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
        "biomePaths": "Barren:80,137 80,37 69,38 62,30 51,33 47,44 36,45 33,42 19,44 14,35 0,36 0,146 15,142 23,148 35,138 39,138 50,127 56,128 62,142;80,174 80,158 68,156 61,144 47,150 46,155 38,160 23,154 18,160 0,158 0,174\nSwamp:80,158 80,137 62,142 56,128 50,127 39,138 35,138 23,148 15,142 0,146 0,158 18,160 23,154 38,160 46,155 47,150 61,144 68,156",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 36,
            "y": 158
          },
          {
            "id": "GravitasPedestal",
            "x": 38,
            "y": 158
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "x": 65,
            "y": 119,
            "emitRate": 10447,
            "avgEmitRate": 2709,
            "idleTime": 273,
            "eruptionTime": 256,
            "dormancyCycles": 54.6,
            "activeCycles": 62.9
          },
          {
            "id": "hot_water",
            "x": 64,
            "y": 96,
            "emitRate": 6963,
            "avgEmitRate": 2121,
            "idleTime": 283,
            "eruptionTime": 424,
            "dormancyCycles": 42.1,
            "activeCycles": 43.5
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
          "MetalPoor"
        ],
        "biomePaths": "MagmaCore:64,62 64,45 52,44 47,35 37,33 31,39 18,34 11,40 0,39 0,96 15,96 14,78 22,73 32,80 30,96 46,96 46,79 44,77 43,61\nOilField:32,80 22,73 14,78 15,96 30,96;64,96 64,62 43,61 44,77 46,79 46,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 49,
            "y": 64
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 50,
            "y": 82,
            "emitRate": 221416,
            "avgEmitRate": 1101,
            "idleTime": 7794,
            "eruptionTime": 66,
            "dormancyCycles": 56.9,
            "activeCycles": 81.6
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
        "biomePaths": "Barren:18,78 15,62 0,61 0,82;42,82 34,75 35,66 24,56 35,44 46,49 47,59 55,64 55,76;95,78 80,82 74,76 75,66 67,58 68,50 80,44 91,54 88,61 97,75;126,76 114,78 107,72 110,58 117,55 127,60;160,76 160,54 143,60 145,76\nSandstone:35,66 24,56 21,56 15,62 18,78 21,80 34,75;75,66 67,58 68,50 57,40 46,49 47,59 55,64 55,76 61,80 74,76;107,72 97,75 88,61 91,54 99,51 110,58;144,77 129,78 126,76 127,60 136,56 143,60 145,76\nFrozenWastes:160,96 160,76 145,76 144,77 129,78 126,76 114,78 107,72 97,75 95,78 80,82 74,76 61,80 55,76 42,82 34,75 21,80 18,78 0,82 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 44,
            "y": 71
          },
          {
            "id": "GravitasPedestal",
            "x": 48,
            "y": 71
          },
          {
            "id": "GeneShuffler",
            "x": 46,
            "y": 65
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 108,
            "y": 80,
            "emitRate": 2824,
            "avgEmitRate": 1215,
            "idleTime": 89,
            "eruptionTime": 269,
            "dormancyCycles": 55.9,
            "activeCycles": 74.9
          },
          {
            "id": "hot_steam",
            "x": 55,
            "y": 87,
            "emitRate": 4485,
            "avgEmitRate": 732,
            "idleTime": 413,
            "eruptionTime": 171,
            "dormancyCycles": 64.7,
            "activeCycles": 81.4
          }
        ]
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
        "q": -3,
        "r": 3
      },
      {
        "id": "OilRichWarpTarget",
        "q": 1,
        "r": -4
      },
      {
        "id": "TundraMoonlet",
        "q": -6,
        "r": -1
      },
      {
        "id": "MarshyMoonlet",
        "q": 5,
        "r": -2
      },
      {
        "id": "MooMoonlet",
        "q": 4,
        "r": 3
      },
      {
        "id": "WaterMoonlet",
        "q": -2,
        "r": 8
      },
      {
        "id": "NiobiumMoonlet",
        "q": 9,
        "r": -1
      },
      {
        "id": "RegolithMoonlet",
        "q": -9,
        "r": 5
      },
      {
        "id": "TemporalTear",
        "q": 1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 0,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -7,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -9,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -8,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 4,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 3,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -5,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 4,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -2,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 5,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 7,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -5,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 7,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 10,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 10,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 9,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 9,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 10,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 9,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 8,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 9,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 0,
        "r": -7
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -11,
        "r": 9
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 11,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -9,
        "r": 2
      }
    ]
  },
  {
    "coordinate": "M-SWMP-C-254563355-0-0-0",
    "cluster": "M-SWMP-C",
    "dlcs": [
      "FrostyPlanet",
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
          "RadioactiveCrust",
          "MetalPoor"
        ],
        "biomePaths": "Swamp:112,81 105,72 90,77 81,59 63,52 63,39 62,37 43,38 37,49 23,49 17,63 22,71 34,73 35,93 48,108 62,111 84,101 89,93 106,96\nBoggyMarsh:128,60 128,36 109,39 105,36 88,43 81,35 63,39 63,52 81,59 90,77 105,72 107,61 110,58;128,129 128,103 110,104 106,96 89,93 84,101 62,111 48,108 35,93 34,73 22,71 17,63 23,49 18,41 0,41 0,86 13,86 23,97 20,108 23,114 43,115 45,129 61,133 66,129 67,124 89,116 91,117 106,112 115,128\nMetallic:45,129 43,115 23,114 20,108 23,97 13,86 0,86 0,129 19,130 20,132 39,134;106,138 92,132 83,140 66,129 67,124 89,116 91,117 106,112 115,128;110,104 106,96 112,81 105,72 107,61 110,58 128,60 128,103\nMagmaCore:128,153 128,129 115,128 106,138 92,132 83,140 66,129 61,133 45,129 39,134 20,132 19,130 0,129 0,153",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 61,
            "y": 82
          },
          {
            "id": "WarpConduitReceiver",
            "x": 52,
            "y": 114
          },
          {
            "id": "WarpConduitSender",
            "x": 78,
            "y": 126
          },
          {
            "id": "GravitasPedestal",
            "x": 15,
            "y": 125
          },
          {
            "id": "WarpReceiver",
            "x": 77,
            "y": 113
          },
          {
            "id": "WarpPortal",
            "x": 77,
            "y": 108
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "x": 93,
            "y": 63,
            "emitRate": 234,
            "avgEmitRate": 88,
            "idleTime": 220,
            "eruptionTime": 330,
            "dormancyCycles": 46.7,
            "activeCycles": 79.2
          },
          {
            "id": "molten_cobalt",
            "x": 114,
            "y": 99,
            "emitRate": 8584,
            "avgEmitRate": 316,
            "idleTime": 890,
            "eruptionTime": 50,
            "dormancyCycles": 34.9,
            "activeCycles": 76.9
          },
          {
            "id": "molten_gold",
            "x": 95,
            "y": 127,
            "emitRate": 8912,
            "avgEmitRate": 325,
            "idleTime": 662,
            "eruptionTime": 41,
            "dormancyCycles": 40.4,
            "activeCycles": 68.9
          },
          {
            "id": "molten_gold",
            "x": 13,
            "y": 92,
            "emitRate": 6991,
            "avgEmitRate": 260,
            "idleTime": 709,
            "eruptionTime": 47,
            "dormancyCycles": 42.7,
            "activeCycles": 63.9
          },
          {
            "id": "molten_iron",
            "x": 114,
            "y": 54,
            "emitRate": 7761,
            "avgEmitRate": 295,
            "idleTime": 653,
            "eruptionTime": 47,
            "dormancyCycles": 71.8,
            "activeCycles": 92.8
          },
          {
            "id": "molten_copper",
            "x": 92,
            "y": 111,
            "emitRate": 8165,
            "avgEmitRate": 301,
            "idleTime": 930,
            "eruptionTime": 60,
            "dormancyCycles": 30.4,
            "activeCycles": 47.8
          },
          {
            "id": "hot_po2",
            "x": 28,
            "y": 110,
            "emitRate": 345,
            "avgEmitRate": 95,
            "idleTime": 295,
            "eruptionTime": 306,
            "dormancyCycles": 60.8,
            "activeCycles": 71.4
          },
          {
            "id": "molten_gold",
            "x": 13,
            "y": 59,
            "emitRate": 7484,
            "avgEmitRate": 281,
            "idleTime": 607,
            "eruptionTime": 42,
            "dormancyCycles": 45.7,
            "activeCycles": 64.6
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
          "MetalRich"
        ],
        "biomePaths": "ToxicJungle:128,79 128,38 107,40 105,43 91,45 86,55 70,56 64,46 57,44 46,49 37,44 24,48 16,39 0,39 0,60 22,56 28,69 45,65 53,71 67,66 81,81 93,68 103,69 109,81;128,131 128,107 118,107 105,118 106,129 87,134 87,153 108,153 107,131\nOilField:28,69 22,56 0,60 0,76 25,77;45,105 45,89 27,84 21,94 25,108 18,115 21,133 22,134 41,130 39,110;105,118 90,109 83,113 81,129 87,134 87,153 65,153 65,132 59,128 60,110 68,105 69,93 80,84 94,94 105,91 118,107\nSandstone:45,105 45,89 27,84 21,94 25,108 18,115 21,133 22,134 41,130 39,110;87,134 81,129 83,113 90,109 105,118 106,129;128,107 128,79 109,81 103,69 93,68 81,81 67,66 53,71 45,65 28,69 25,77 0,76 0,153 65,153 65,132 59,128 60,110 68,105 69,93 80,84 94,94 105,91 118,107;128,153 128,131 107,131 108,153",
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "OilWell",
            "x": 84,
            "y": 95,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 36,
            "y": 108,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 19,
            "y": 120,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 37,
            "y": 127,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 65,
            "y": 111,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "steam",
            "x": 25,
            "y": 59,
            "emitRate": 6278,
            "avgEmitRate": 1388,
            "idleTime": 339,
            "eruptionTime": 240,
            "dormancyCycles": 41.8,
            "activeCycles": 47.9
          },
          {
            "id": "methane",
            "x": 100,
            "y": 131,
            "emitRate": 366,
            "avgEmitRate": 98,
            "idleTime": 295,
            "eruptionTime": 239,
            "dormancyCycles": 57.6,
            "activeCycles": 85.2
          },
          {
            "id": "hot_co2",
            "x": 78,
            "y": 117,
            "emitRate": 265,
            "avgEmitRate": 98,
            "idleTime": 403,
            "eruptionTime": 518,
            "dormancyCycles": 24.5,
            "activeCycles": 47.7
          },
          {
            "id": "big_volcano",
            "x": 43,
            "y": 85,
            "emitRate": 259189,
            "avgEmitRate": 1201,
            "idleTime": 7821,
            "eruptionTime": 61,
            "dormancyCycles": 47.1,
            "activeCycles": 71.0
          },
          {
            "id": "slimy_po2",
            "x": 98,
            "y": 57,
            "emitRate": 357,
            "avgEmitRate": 140,
            "idleTime": 269,
            "eruptionTime": 313,
            "dormancyCycles": 24.9,
            "activeCycles": 66.2
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
          "BouldersMixed"
        ],
        "biomePaths": "Forest:88,109 82,107 78,97 59,97 48,90 42,65 33,56 37,41 44,38 52,41 66,30 77,41 75,49 90,60 93,82 97,84 103,95\nRust:20,100 14,90 0,89 0,113 15,111;128,83 128,52 120,52 109,63 94,58 99,42 89,34 77,41 75,49 90,60 93,82 97,84 103,95 88,109 82,107 78,97 59,97 48,90 42,65 33,56 37,41 22,34 13,44 20,57 14,67 22,78 27,78 39,93 35,99 40,112 25,123 24,129 41,137 49,131 61,135 71,129 84,134 86,132 93,117 107,119 114,110 107,97\nToxicJungle:40,112 35,99 39,93 27,78 22,78 14,67 20,57 13,44 0,43 0,89 14,90 20,100 15,111 0,113 0,132 20,133 24,129 25,123;109,63 94,58 99,42 108,39 120,52;111,132 105,139 86,132 93,117 107,119 114,110 107,97 128,83 128,133\nMagmaCore:128,153 128,133 111,132 105,139 86,132 84,134 71,129 61,135 49,131 41,137 24,129 20,133 0,132 0,153",
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "x": 106,
            "y": 74
          },
          {
            "id": "WarpConduitSender",
            "x": 101,
            "y": 90
          },
          {
            "id": "GravitasPedestal",
            "x": 86,
            "y": 115
          },
          {
            "id": "WarpReceiver",
            "x": 75,
            "y": 78
          },
          {
            "id": "WarpPortal",
            "x": 53,
            "y": 78
          },
          {
            "id": "PropSurfaceSatellite3",
            "x": 53,
            "y": 59
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 17,
            "y": 109,
            "emitRate": 340,
            "avgEmitRate": 93,
            "idleTime": 357,
            "eruptionTime": 324,
            "dormancyCycles": 44.3,
            "activeCycles": 59.9
          },
          {
            "id": "slush_water",
            "x": 107,
            "y": 109,
            "emitRate": 5174,
            "avgEmitRate": 1626,
            "idleTime": 232,
            "eruptionTime": 190,
            "dormancyCycles": 36.3,
            "activeCycles": 84.1
          },
          {
            "id": "methane",
            "x": 64,
            "y": 120,
            "emitRate": 258,
            "avgEmitRate": 82,
            "idleTime": 247,
            "eruptionTime": 267,
            "dormancyCycles": 63.3,
            "activeCycles": 98.9
          },
          {
            "id": "slimy_po2",
            "x": 29,
            "y": 61,
            "emitRate": 386,
            "avgEmitRate": 104,
            "idleTime": 288,
            "eruptionTime": 244,
            "dormancyCycles": 27.6,
            "activeCycles": 39.4
          },
          {
            "id": "hot_po2",
            "x": 11,
            "y": 124,
            "emitRate": 289,
            "avgEmitRate": 107,
            "idleTime": 268,
            "eruptionTime": 350,
            "dormancyCycles": 49.2,
            "activeCycles": 93.1
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
          "Geodes"
        ],
        "biomePaths": "MagmaCore:128,60 128,33 108,35 106,33 88,38 83,35 67,41 60,35 43,41 39,38 22,41 19,39 0,40 0,66 22,61 29,67 44,58 55,64 56,75 72,83 83,73 83,65 90,59 105,62 109,59\nWasteland:20,114 20,98 0,97 0,119;128,78 128,60 109,59 105,62 90,59 83,65 83,73 72,83 56,75 55,64 44,58 29,67 22,61 0,66 0,76 23,82 23,95 40,99 41,111 54,119 64,111 79,119 89,110 86,99 99,86 100,86 107,76;106,114 110,97 128,94 128,117\nFrozenWastes:128,134 128,117 106,114 110,97 128,94 128,78 107,76 100,86 99,86 86,99 89,110 79,119 64,111 54,119 41,111 40,99 23,95 23,82 0,76 0,97 20,98 20,114 0,119 0,131 19,136 28,128 40,136 54,129 61,136 80,130 83,133 103,132 105,135\nSandstone:128,153 128,134 105,135 103,132 83,133 80,130 61,136 54,129 40,136 28,128 19,136 0,131 0,153",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 43,
            "y": 121
          },
          {
            "id": "MassiveHeatSink",
            "x": 103,
            "y": 126
          },
          {
            "id": "MassiveHeatSink",
            "x": 75,
            "y": 125
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "x": 69,
            "y": 53,
            "emitRate": 4350,
            "avgEmitRate": 1616,
            "idleTime": 259,
            "eruptionTime": 358,
            "dormancyCycles": 22.4,
            "activeCycles": 39.9
          },
          {
            "id": "steam",
            "x": 47,
            "y": 77,
            "emitRate": 4715,
            "avgEmitRate": 1086,
            "idleTime": 158,
            "eruptionTime": 179,
            "dormancyCycles": 57.9,
            "activeCycles": 44.3
          },
          {
            "id": "hot_hydrogen",
            "x": 16,
            "y": 85,
            "emitRate": 341,
            "avgEmitRate": 92,
            "idleTime": 344,
            "eruptionTime": 294,
            "dormancyCycles": 65.2,
            "activeCycles": 92.3
          },
          {
            "id": "hot_po2",
            "x": 18,
            "y": 131,
            "emitRate": 300,
            "avgEmitRate": 96,
            "idleTime": 319,
            "eruptionTime": 355,
            "dormancyCycles": 49.1,
            "activeCycles": 75.0
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
          "DistressSignal",
          "MetalRich"
        ],
        "biomePaths": "Forest:47,95 37,87 37,75 25,66 22,67 1,53 0,53 0,112 21,112 22,111 41,112;128,82 128,41 104,37 98,46 100,55 86,67 87,78 81,85 82,98 100,107 104,104 105,84 110,80\nOcean:100,55 98,46 79,41 72,47 52,40 45,48 33,48 24,39 1,53 22,67 25,66 37,75 37,87 47,95 41,112 48,121 68,112 69,108 82,98 81,85 87,78 86,67\nRadioactive:128,127 128,82 110,80 105,84 104,104 100,107 82,98 69,108 68,112 48,121 41,112 22,111 21,112 0,112 0,138 22,131 30,138 47,128 58,139 78,127 80,127 84,133 105,135 110,128\nMagmaCore:128,153 128,127 110,128 105,135 84,133 80,127 78,127 58,139 47,128 30,138 22,131 0,138 0,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 72,
            "y": 98
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 25,
            "y": 116,
            "emitRate": 413,
            "avgEmitRate": 138,
            "idleTime": 202,
            "eruptionTime": 320,
            "dormancyCycles": 76.3,
            "activeCycles": 91.2
          },
          {
            "id": "salt_water",
            "x": 53,
            "y": 70,
            "emitRate": 8950,
            "avgEmitRate": 2829,
            "idleTime": 90,
            "eruptionTime": 97,
            "dormancyCycles": 55.1,
            "activeCycles": 85.9
          },
          {
            "id": "hot_steam",
            "x": 105,
            "y": 54,
            "emitRate": 3705,
            "avgEmitRate": 750,
            "idleTime": 566,
            "eruptionTime": 315,
            "dormancyCycles": 45.8,
            "activeCycles": 59.9
          },
          {
            "id": "filthy_water",
            "x": 108,
            "y": 109,
            "emitRate": 8847,
            "avgEmitRate": 3274,
            "idleTime": 288,
            "eruptionTime": 389,
            "dormancyCycles": 33.8,
            "activeCycles": 61.1
          },
          {
            "id": "slush_water",
            "x": 21,
            "y": 61,
            "emitRate": 4632,
            "avgEmitRate": 1271,
            "idleTime": 254,
            "eruptionTime": 252,
            "dormancyCycles": 67.2,
            "activeCycles": 82.3
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
          "SubsurfaceOcean"
        ],
        "biomePaths": "Ocean:64,65 64,46 50,47 43,37 32,26 24,29 16,24 1,34 0,34 0,58 11,57 16,44 21,42 29,47 31,56 35,59 46,57 53,65\nFrozenWastes:64,128 64,65 53,65 46,57 35,59 31,56 29,47 21,42 16,44 11,57 0,58 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 37,
            "y": 52
          },
          {
            "id": "GravitasPedestal",
            "x": 52,
            "y": 102
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 17,
            "y": 115,
            "emitRate": 9840,
            "avgEmitRate": 312,
            "idleTime": 600,
            "eruptionTime": 34,
            "dormancyCycles": 63.3,
            "activeCycles": 90.0
          },
          {
            "id": "molten_iron",
            "x": 48,
            "y": 116,
            "emitRate": 9277,
            "avgEmitRate": 342,
            "idleTime": 821,
            "eruptionTime": 46,
            "dormancyCycles": 32.6,
            "activeCycles": 74.2
          },
          {
            "id": "molten_iron",
            "x": 19,
            "y": 98,
            "emitRate": 8409,
            "avgEmitRate": 379,
            "idleTime": 755,
            "eruptionTime": 50,
            "dormancyCycles": 44.2,
            "activeCycles": 117.5
          },
          {
            "id": "molten_iron",
            "x": 28,
            "y": 74,
            "emitRate": 8868,
            "avgEmitRate": 378,
            "idleTime": 692,
            "eruptionTime": 47,
            "dormancyCycles": 57.5,
            "activeCycles": 114.5
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
        "biomePaths": "BoggyMarsh:64,80 64,42 52,41 47,33 35,32 33,33 17,33 16,35 0,34 0,50 15,51 17,66 31,65 34,68 46,67 52,78\nToxicJungle:52,78 46,67 34,68 31,65 17,66 15,51 0,50 0,84 17,80 22,85 32,79 43,87\nMagmaCore:64,96 64,80 52,78 43,87 32,79 22,85 17,80 0,84 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 31,
            "y": 41
          },
          {
            "id": "GravitasPedestal",
            "x": 17,
            "y": 41
          },
          {
            "id": "SapTree",
            "x": 24,
            "y": 41
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 29,
            "y": 68,
            "emitRate": 8896,
            "avgEmitRate": 282,
            "idleTime": 706,
            "eruptionTime": 40,
            "dormancyCycles": 57.6,
            "activeCycles": 81.2
          },
          {
            "id": "molten_tungsten",
            "x": 50,
            "y": 91,
            "emitRate": 6008,
            "avgEmitRate": 285,
            "idleTime": 769,
            "eruptionTime": 66,
            "dormancyCycles": 43.6,
            "activeCycles": 64.9
          },
          {
            "id": "hot_co2",
            "x": 9,
            "y": 61,
            "emitRate": 409,
            "avgEmitRate": 107,
            "idleTime": 345,
            "eruptionTime": 263,
            "dormancyCycles": 65.8,
            "activeCycles": 99.9
          },
          {
            "id": "slimy_po2",
            "x": 53,
            "y": 66,
            "emitRate": 392,
            "avgEmitRate": 107,
            "idleTime": 442,
            "eruptionTime": 455,
            "dormancyCycles": 49.3,
            "activeCycles": 57.2
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
        "biomePaths": "Moo:96,58 96,31 84,32 78,43 72,45 63,32 51,35 47,31 34,33 30,41 20,42 14,32 0,33 0,65 19,65 21,62 34,61 40,67 54,63 60,68 75,62 78,64\nFrozenWastes:96,80 96,58 78,64 75,62 60,68 54,63 40,67 34,61 21,62 19,65 0,65 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 61,
            "y": 44
          },
          {
            "id": "GravitasPedestal",
            "x": 54,
            "y": 44
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 13,
            "y": 47,
            "emitRate": 373,
            "avgEmitRate": 99,
            "idleTime": 274,
            "eruptionTime": 218,
            "dormancyCycles": 46.5,
            "activeCycles": 68.5
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
        "biomePaths": "Barren:80,131 80,46 71,46 63,38 37,38 35,36 20,34 16,39 0,37 0,137 20,139 21,141 38,145 43,133 57,133 60,137;80,174 80,153 73,153 64,161 51,156 50,155 40,152 31,161 17,157 17,156 0,154 0,174\nSwamp:80,153 80,131 60,137 57,133 43,133 38,145 21,141 20,139 0,137 0,154 17,156 17,157 31,161 40,152 50,155 51,156 64,161 73,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 63,
            "y": 159
          },
          {
            "id": "GravitasPedestal",
            "x": 65,
            "y": 159
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "x": 39,
            "y": 108,
            "emitRate": 13824,
            "avgEmitRate": 3222,
            "idleTime": 326,
            "eruptionTime": 186,
            "dormancyCycles": 47.6,
            "activeCycles": 85.1
          },
          {
            "id": "salt_water",
            "x": 15,
            "y": 62,
            "emitRate": 7814,
            "avgEmitRate": 2446,
            "idleTime": 346,
            "eruptionTime": 342,
            "dormancyCycles": 41.4,
            "activeCycles": 70.4
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
        "biomePaths": "MagmaCore:64,52 64,33 49,33 46,36 37,36 30,27 18,29 14,37 0,38 0,96 47,96 46,87 59,75 48,67 35,76 28,63 34,54 47,56 51,52\nOilField:47,96 46,87 59,75 48,67 35,76 28,63 34,54 47,56 51,52 64,52 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 42,
            "y": 69
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 55,
            "y": 62,
            "emitRate": 269672,
            "avgEmitRate": 981,
            "idleTime": 8902,
            "eruptionTime": 63,
            "dormancyCycles": 58.1,
            "activeCycles": 63.2
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
        "biomePaths": "Sandstone:31,74 21,75 14,62 20,53 35,55 36,56;109,58 105,49 90,49 86,60 74,62 68,50 57,49 50,59 53,66 49,76 53,82 69,81 73,76 87,80 95,74 95,69;145,60 141,49 127,48 123,58 116,61 116,76 124,81 137,74 137,69\nBarren:21,75 14,62 0,62 0,80 17,80;49,76 36,78 31,74 36,56 50,59 53,66;116,76 116,61 109,58 95,69 95,74 106,81;160,77 160,62 145,60 137,69 137,74 143,79\nFrozenWastes:160,96 160,77 143,79 137,74 124,81 116,76 106,81 95,74 87,80 73,76 69,81 53,82 49,76 36,78 31,74 21,75 17,80 0,80 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 109,
            "y": 79
          },
          {
            "id": "GravitasPedestal",
            "x": 113,
            "y": 79
          },
          {
            "id": "GeneShuffler",
            "x": 111,
            "y": 73
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 30,
            "y": 61
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 10,
            "y": 77
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 128,
            "y": 74
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "x": 83,
            "y": 87,
            "emitRate": 1588,
            "avgEmitRate": 825,
            "idleTime": 279,
            "eruptionTime": 635,
            "dormancyCycles": 27.1,
            "activeCycles": 80.2
          },
          {
            "id": "hot_steam",
            "x": 27,
            "y": 80,
            "emitRate": 2250,
            "avgEmitRate": 829,
            "idleTime": 282,
            "eruptionTime": 353,
            "dormancyCycles": 49.8,
            "activeCycles": 97.7
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlands",
        "q": 0,
        "r": 1
      },
      {
        "id": "MiniMetallicSwampyStart",
        "q": 3,
        "r": 0
      },
      {
        "id": "MiniForestFrozenWarp",
        "q": 2,
        "r": -3
      },
      {
        "id": "MiniFlipped",
        "q": -1,
        "r": -1
      },
      {
        "id": "MiniRadioactiveOcean",
        "q": 1,
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": -3,
        "r": -4
      },
      {
        "id": "MarshyMoonlet",
        "q": -6,
        "r": 5
      },
      {
        "id": "MooMoonlet",
        "q": 6,
        "r": -7
      },
      {
        "id": "WaterMoonlet",
        "q": 8,
        "r": -3
      },
      {
        "id": "NiobiumMoonlet",
        "q": 11,
        "r": -8
      },
      {
        "id": "RegolithMoonlet",
        "q": 4,
        "r": 5
      },
      {
        "id": "TemporalTear",
        "q": 11,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -3,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -6,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -12,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -11,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -12,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -12,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -11,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -10,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 5,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 0,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -1,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -2,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 2,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -7,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -7,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -8,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 11,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 12,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 6,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 5,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 4,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 3,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -3,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -6,
        "r": 12
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -10,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 12,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 4,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 8,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 1,
        "r": 11
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
        "biomePaths": "Sandstone:57,150 43,131 44,126 57,119 72,131;90,75 86,64 71,53 51,53 45,56 32,48 20,58 20,67 15,72 22,91 35,88 43,101 34,112 25,113 21,117 22,134 0,140 0,153 84,153 83,142 72,131 85,115 77,103 89,88;106,153 104,131 106,131 128,134 128,153\nToxicJungle:34,112 25,113 19,95 22,91 35,88 43,101;106,153 104,131 103,131 83,142 84,153;128,85 128,40 113,40 106,31 87,37 86,37 74,42 62,31 52,35 41,29 30,37 20,33 5,47 0,47 0,72 15,72 20,67 20,58 32,48 45,56 51,53 71,53 86,64 90,75 89,88 77,103 85,115 88,115 104,99 103,97 112,85\nOilField:25,113 19,95 22,91 15,72 0,72 0,140 22,134 21,117;57,150 43,131 44,126 57,119 72,131;128,134 128,85 112,85 103,97 104,99 88,115 85,115 72,131 83,142 103,131 106,131",
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
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 86,
            "y": 119,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 15,
            "y": 93,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 98,
            "y": 132,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 49,
            "y": 133,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
            "activeCycles": 88.0
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
        "biomePaths": "Forest:106,85 109,105 106,107 90,116 79,108 76,108 67,122 54,112 44,115 37,105 49,94 46,81 39,77 44,56 45,55 57,63 70,58 90,65 92,67 107,67 113,78\nOcean:128,104 128,53 116,53 106,42 94,45 86,39 70,45 63,39 49,43 40,32 22,38 20,42 0,43 0,112 20,113 27,104 37,105 49,94 46,81 39,77 44,56 45,55 57,63 70,58 90,65 92,67 107,67 113,78 106,85 109,105\nRadioactive:128,130 128,104 109,105 106,107 90,116 79,108 76,108 67,122 54,112 44,115 37,105 27,104 20,113 0,112 0,132 21,132 24,128 40,129 43,133 64,135 68,130 86,134 90,131 106,135 113,129\nMagmaCore:128,153 128,130 113,129 106,135 90,131 86,134 68,130 64,135 43,133 40,129 24,128 21,132 0,132 0,153",
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
        "biomePaths": "Swamp:128,66 128,38 110,38 102,48 103,52 94,69 90,70 72,54 61,68 47,67 42,61 43,52 56,40 40,25 28,39 23,40 17,49 23,64 19,72 0,72 0,94 17,94 24,83 40,85 43,90 61,93 67,81 84,80 89,97 103,98 109,92 107,78\nBoggyMarsh:23,64 17,49 0,49 0,72 19,72;62,96 61,93 43,90 40,85 24,83 17,94 25,108 21,114 0,115 0,133 19,135 24,129 40,132 43,131 47,116 57,113;94,69 90,70 72,54 61,68 47,67 42,61 43,52 56,40 59,40 72,52 85,42 102,48 103,52;108,135 100,125 95,125 82,113 83,103 89,97 103,98 109,92 107,78 128,66 128,133\nMetallic:25,108 17,94 0,94 0,115 21,114;84,138 68,132 61,138 43,131 47,116 57,113 62,96 61,93 67,81 84,80 89,97 83,103 82,113 95,125\nMagmaCore:128,153 128,133 108,135 100,125 95,125 84,138 68,132 61,138 43,131 40,132 24,129 19,135 0,133 0,153",
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
            "activeCycles": 114.0
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
            "activeCycles": 79.0
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
        "biomePaths": "Forest:128,56 128,37 107,36 104,41 88,42 83,36 64,40 60,37 39,41 22,43 16,51 0,51 0,76 14,76 23,66 33,66 43,58 54,62 64,56 73,61 85,57 96,66 104,65 110,57\nToxicJungle:44,134 37,130 33,114 22,111 17,101 23,91 14,76 23,66 33,66 43,58 54,62 55,81 41,86 39,89 44,105 54,108 56,128;96,66 85,57 73,61 73,80 87,85;128,104 128,80 114,80 106,90 111,104\nRust:37,130 33,114 22,111 17,101 23,91 14,76 0,76 0,127 11,127 22,137;112,128 107,134 88,132 85,129 93,112 84,102 71,106 65,103 54,108 44,105 39,89 41,86 55,81 54,62 64,56 73,61 73,80 87,85 96,66 104,65 110,57 128,56 128,80 114,80 106,90 111,104 128,104 128,128\nMagmaCore:128,153 128,128 112,128 107,134 88,132 85,129 93,112 84,102 71,106 65,103 54,108 56,128 44,134 37,130 22,137 11,127 0,127 0,153",
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
            "activeCycles": 39.0
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
            "dormancyCycles": 59.0,
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
            "activeCycles": 72.0
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
        "biomePaths": "Wasteland:128,103 128,77 115,77 105,67 92,69 86,65 69,68 63,63 48,66 40,58 24,61 22,64 0,67 0,107 12,107 22,119 34,116 37,101 48,97 59,110 68,111 72,108 90,110 93,114 107,115 116,103\nMagmaCore:128,77 128,47 112,48 103,40 86,45 78,39 65,44 54,36 44,41 27,30 17,40 0,38 0,67 22,64 24,61 40,58 48,66 63,63 69,68 86,65 92,69 105,67 115,77\nFrozenWastes:128,131 128,103 116,103 107,115 93,114 90,110 72,108 68,111 59,110 48,97 37,101 34,116 22,119 12,107 0,107 0,134 17,131 28,144 45,129 55,137 71,130 79,134 88,130 104,140 114,129\nSandstone:128,153 128,131 114,129 104,140 88,130 79,134 71,130 55,137 45,129 28,144 17,131 0,134 0,153",
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
            "dormancyCycles": 35.0,
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
            "dormancyCycles": 42.0,
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
        "biomePaths": "Ocean:64,47 64,32 48,31 43,43 33,43 27,33 18,32 10,43 0,43 0,66 11,65 18,53 26,53 33,64 42,65 46,61 47,47\nFrozenWastes:64,110 64,47 47,47 46,61 42,65 33,64 26,53 18,53 11,65 0,66 0,113 14,111 19,102 24,101 31,104 34,113 46,116 52,110\nForest:64,128 64,110 52,110 46,116 34,113 31,104 24,101 19,102 14,111 0,113 0,128",
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
        "biomePaths": "BoggyMarsh:64,80 64,36 52,38 46,48 41,49 30,38 22,40 19,38 0,43 0,51 17,59 21,58 25,60 37,57 45,69 44,75 48,80\nToxicJungle:45,69 37,57 25,60 21,58 17,59 0,51 0,74 8,74 16,80 28,77 30,78 44,75\nMagmaCore:64,96 64,80 48,80 44,75 30,78 28,77 16,80 8,74 0,74 0,96",
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
            "dormancyCycles": 20.0,
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
        "biomePaths": "Moo:96,58 96,36 80,38 77,43 66,45 56,38 56,36 41,24 30,37 19,35 17,33 0,33 0,55 13,55 20,60 27,59 38,68 49,60 59,64 64,61 77,65 84,58\nFrozenWastes:96,80 96,58 84,58 77,65 64,61 59,64 49,60 38,68 27,59 20,60 13,55 0,55 0,80",
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
        "biomePaths": "Barren:80,134 80,43 69,43 59,30 48,36 36,28 27,36 19,36 11,46 0,46 0,133 12,134 18,131 29,137 36,135 45,143 49,143 60,130 68,135;80,174 80,156 66,154 61,156 59,159 41,162 37,157 25,154 20,156 14,154 0,156 0,174\nSwamp:80,156 80,134 68,135 60,130 49,143 45,143 36,135 29,137 18,131 12,134 0,133 0,156 14,154 20,156 25,154 37,157 41,162 59,159 61,156 66,154",
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
        "biomePaths": "MagmaCore:51,77 46,66 35,66 29,77 32,81 47,82;64,57 64,35 53,37 45,30 32,38 23,34 23,33 15,27 0,31 0,79 15,79 18,76 14,62 19,56 30,56 36,48 48,49 52,56\nOilField:64,77 64,57 52,56 48,49 36,48 30,56 19,56 14,62 18,76 29,77 35,66 46,66 51,77\nFrozenWastes:64,96 64,77 51,77 47,82 32,81 29,77 18,76 15,79 0,79 0,96",
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
        "biomePaths": "Barren:19,63 12,55 0,55 0,75 15,76;50,82 38,76 38,69 29,61 34,47 47,50 50,61 57,64 58,76;95,64 86,58 87,49 73,41 66,46 67,59 76,63 76,76 86,81 92,77;120,75 114,75 105,61 109,54 124,56 127,63;160,76 160,57 147,56 140,65 144,76\nSandstone:38,76 38,69 29,61 19,63 15,76 17,78 32,81;76,76 76,63 67,59 66,46 53,43 47,50 50,61 57,64 58,76 67,81;105,83 92,77 95,64 86,58 87,49 94,43 107,48 109,54 105,61 114,75;144,76 140,65 127,63 120,75 125,81 141,80\nFrozenWastes:160,96 160,76 144,76 141,80 125,81 120,75 114,75 105,83 92,77 86,81 76,76 67,81 58,76 50,82 38,76 32,81 17,78 15,76 0,75 0,96",
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
  },
  {
    "coordinate": "M-FRZ-C-2099443363-0-0-0",
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
          "MetalPoor",
          "RadioactiveCrust"
        ],
        "biomePaths": "Forest:93,111 85,95 89,89 90,71 85,61 69,52 53,54 50,38 39,33 29,41 31,52 20,62 21,71 39,77 40,87 55,103 68,104 72,116 86,120\nToxicJungle:20,62 3,51 20,37 29,41 31,52;34,113 31,95 20,93 10,104 0,103 0,131 11,130 19,116 32,115;89,131 86,120 72,116 62,129 64,133 84,138;110,58 105,49 110,38 128,38 128,57;111,97 106,90 111,78 128,77 128,97;106,134 109,116 128,116 128,136\nRust:72,116 68,104 55,103 40,87 39,77 21,71 20,62 3,51 0,51 0,103 10,104 20,93 31,95 34,113 32,115 19,116 11,130 21,139 35,132 43,135 56,128 62,129;128,116 128,97 111,97 106,90 111,78 128,77 128,57 110,58 105,49 110,38 105,28 89,27 85,35 73,38 62,29 50,38 53,54 69,52 85,61 90,71 89,89 85,95 93,111 86,120 89,131 106,134 109,116\nMagmaCore:128,153 128,136 106,134 89,131 84,138 64,133 62,129 56,128 43,135 35,132 21,139 11,130 0,131 0,153",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 62,
            "y": 80
          },
          {
            "id": "WarpConduitReceiver",
            "x": 74,
            "y": 106
          },
          {
            "id": "WarpConduitSender",
            "x": 27,
            "y": 127
          },
          {
            "id": "GravitasPedestal",
            "x": 113,
            "y": 112
          },
          {
            "id": "PropSurfaceSatellite3",
            "x": 27,
            "y": 58
          },
          {
            "id": "WarpReceiver",
            "x": 36,
            "y": 86
          },
          {
            "id": "WarpPortal",
            "x": 36,
            "y": 81
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 15,
            "y": 107,
            "emitRate": 832,
            "avgEmitRate": 101,
            "idleTime": 353,
            "eruptionTime": 81,
            "dormancyCycles": 62.0,
            "activeCycles": 114.8
          },
          {
            "id": "slush_water",
            "x": 110,
            "y": 72,
            "emitRate": 3192,
            "avgEmitRate": 1206,
            "idleTime": 191,
            "eruptionTime": 324,
            "dormancyCycles": 55.7,
            "activeCycles": 83.9
          },
          {
            "id": "hot_co2",
            "x": 95,
            "y": 54,
            "emitRate": 244,
            "avgEmitRate": 118,
            "idleTime": 122,
            "eruptionTime": 330,
            "dormancyCycles": 38.8,
            "activeCycles": 75.7
          },
          {
            "id": "hot_hydrogen",
            "x": 54,
            "y": 110,
            "emitRate": 502,
            "avgEmitRate": 102,
            "idleTime": 408,
            "eruptionTime": 267,
            "dormancyCycles": 65.4,
            "activeCycles": 69.4
          },
          {
            "id": "hot_po2",
            "x": 61,
            "y": 39,
            "emitRate": 328,
            "avgEmitRate": 104,
            "idleTime": 282,
            "eruptionTime": 349,
            "dormancyCycles": 47.5,
            "activeCycles": 62.8
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
          "BouldersMixed"
        ],
        "biomePaths": "Sandstone:102,87 94,70 76,60 58,64 48,78 38,75 33,65 20,64 15,57 0,57 0,79 12,78 23,90 26,90 38,100 35,115 34,115 35,135 41,139 58,131 65,135 79,131 85,153 92,153 99,133 95,129 81,129 77,114 93,107;128,126 128,74 118,73 104,87 116,100 107,112 118,126\nToxicJungle:19,153 21,140 35,135 41,139 42,153;85,153 79,131 65,135 65,153;128,74 128,48 118,48 109,38 96,40 92,34 74,33 70,41 58,42 52,35 39,36 32,22 22,20 16,37 0,37 0,57 15,57 20,64 33,65 38,75 48,78 58,64 76,60 94,70 102,87 93,107 77,114 81,129 95,129 99,133 92,153 115,153 110,134 118,126 107,112 116,100 104,87 118,73\nOilField:38,100 26,90 23,90 12,78 0,79 0,153 19,153 21,140 35,135 34,115 35,115;65,153 65,135 58,131 41,139 42,153;128,153 128,126 118,126 110,134 115,153",
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "x": 64,
            "y": 124
          },
          {
            "id": "WarpConduitSender",
            "x": 102,
            "y": 92
          },
          {
            "id": "WarpPortal",
            "x": 62,
            "y": 93
          },
          {
            "id": "WarpReceiver",
            "x": 84,
            "y": 93
          },
          {
            "id": "GeneShuffler",
            "x": 40,
            "y": 49
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "x": 22,
            "y": 110,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 21,
            "y": 129,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 25,
            "y": 96,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 11,
            "y": 82,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 59,
            "y": 138,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "steam",
            "x": 36,
            "y": 66,
            "emitRate": 5163,
            "avgEmitRate": 1357,
            "idleTime": 236,
            "eruptionTime": 230,
            "dormancyCycles": 56.7,
            "activeCycles": 64.6
          },
          {
            "id": "methane",
            "x": 91,
            "y": 122,
            "emitRate": 256,
            "avgEmitRate": 93,
            "idleTime": 328,
            "eruptionTime": 458,
            "dormancyCycles": 39.7,
            "activeCycles": 65.5
          },
          {
            "id": "filthy_water",
            "x": 102,
            "y": 66,
            "emitRate": 8069,
            "avgEmitRate": 2894,
            "idleTime": 291,
            "eruptionTime": 327,
            "dormancyCycles": 41.0,
            "activeCycles": 86.2
          },
          {
            "id": "oil_drip",
            "x": 64,
            "y": 54,
            "emitRate": 207,
            "avgEmitRate": 113,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.3,
            "activeCycles": 0.4
          },
          {
            "id": "liquid_co2",
            "x": 86,
            "y": 53,
            "emitRate": 497,
            "avgEmitRate": 152,
            "idleTime": 329,
            "eruptionTime": 333,
            "dormancyCycles": 62.7,
            "activeCycles": 97.2
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
          "DistressSignal"
        ],
        "biomePaths": "Swamp:128,74 128,29 110,35 101,28 88,40 90,51 86,56 69,59 67,62 49,66 42,54 48,41 45,34 25,33 21,42 0,42 0,83 15,84 23,72 41,78 45,76 61,89 68,87 73,79 93,76 97,79 109,68\nMetallic:22,117 14,107 0,107 0,130 17,130;41,78 23,72 15,84 21,94 35,95;108,109 110,92 97,82 86,102 82,102 68,87 73,79 93,76 97,79 109,68 128,74 128,112\nBoggyMarsh:86,56 69,59 67,62 49,66 42,54 48,41 63,44 73,32 88,40 90,51;128,131 128,112 108,109 110,92 97,82 86,102 82,102 68,87 61,89 45,76 41,78 35,95 21,94 15,84 0,83 0,107 14,107 22,117 17,130 20,134 36,136 44,127 54,128 58,132 75,135 82,128 88,129 102,121 112,132\nMagmaCore:128,153 128,131 112,132 102,121 88,129 82,128 75,135 58,132 54,128 44,127 36,136 20,134 17,130 0,130 0,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 89,
            "y": 83
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "x": 39,
            "y": 101,
            "emitRate": 299,
            "avgEmitRate": 93,
            "idleTime": 149,
            "eruptionTime": 236,
            "dormancyCycles": 44.7,
            "activeCycles": 45.8
          },
          {
            "id": "molten_gold",
            "x": 113,
            "y": 106,
            "emitRate": 12897,
            "avgEmitRate": 294,
            "idleTime": 714,
            "eruptionTime": 31,
            "dormancyCycles": 67.7,
            "activeCycles": 84.5
          },
          {
            "id": "molten_cobalt",
            "x": 76,
            "y": 87,
            "emitRate": 8289,
            "avgEmitRate": 250,
            "idleTime": 594,
            "eruptionTime": 37,
            "dormancyCycles": 100.2,
            "activeCycles": 108.3
          },
          {
            "id": "molten_cobalt",
            "x": 37,
            "y": 81,
            "emitRate": 7820,
            "avgEmitRate": 242,
            "idleTime": 710,
            "eruptionTime": 42,
            "dormancyCycles": 78.3,
            "activeCycles": 95.7
          },
          {
            "id": "molten_aluminum",
            "x": 58,
            "y": 61,
            "emitRate": 11961,
            "avgEmitRate": 315,
            "idleTime": 727,
            "eruptionTime": 32,
            "dormancyCycles": 52.0,
            "activeCycles": 87.3
          },
          {
            "id": "molten_copper",
            "x": 20,
            "y": 87,
            "emitRate": 8050,
            "avgEmitRate": 281,
            "idleTime": 760,
            "eruptionTime": 43,
            "dormancyCycles": 26.3,
            "activeCycles": 47.9
          },
          {
            "id": "methane",
            "x": 12,
            "y": 113,
            "emitRate": 321,
            "avgEmitRate": 100,
            "idleTime": 311,
            "eruptionTime": 340,
            "dormancyCycles": 59.7,
            "activeCycles": 86.9
          },
          {
            "id": "small_volcano",
            "x": 62,
            "y": 118,
            "emitRate": 176019,
            "avgEmitRate": 695,
            "idleTime": 9771,
            "eruptionTime": 61,
            "dormancyCycles": 42.5,
            "activeCycles": 75.1
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
          "BouldersSmall"
        ],
        "biomePaths": "MagmaCore:128,72 128,44 114,45 103,34 86,43 81,41 66,48 58,44 47,47 37,39 22,42 18,50 0,51 0,74 18,75 25,64 42,65 46,71 65,71 68,68 85,69 92,62 104,63 111,71\nWasteland:128,93 128,72 111,71 104,63 92,62 85,69 68,68 65,71 46,71 42,65 25,64 18,75 0,74 0,100 5,101 20,112 33,107 37,109 41,115 58,119 65,111 80,112 85,106 103,108 108,92\nFrozenWastes:128,131 128,93 108,92 103,108 85,106 80,112 65,111 58,119 41,115 37,109 33,107 20,112 5,101 0,100 0,129 16,128 22,133 35,131 45,140 60,131 68,135 83,128 88,131 103,127 109,133\nSandstone:128,153 128,131 109,133 103,127 88,131 83,128 68,135 60,131 45,140 35,131 22,133 16,128 0,129 0,153",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 50,
            "y": 129
          },
          {
            "id": "MassiveHeatSink",
            "x": 72,
            "y": 134
          },
          {
            "id": "MassiveHeatSink",
            "x": 116,
            "y": 117
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "x": 29,
            "y": 56,
            "emitRate": 7025,
            "avgEmitRate": 1698,
            "idleTime": 360,
            "eruptionTime": 239,
            "dormancyCycles": 44.5,
            "activeCycles": 68.6
          },
          {
            "id": "hot_po2",
            "x": 20,
            "y": 107,
            "emitRate": 419,
            "avgEmitRate": 105,
            "idleTime": 454,
            "eruptionTime": 333,
            "dormancyCycles": 51.3,
            "activeCycles": 75.2
          },
          {
            "id": "slimy_po2",
            "x": 115,
            "y": 128,
            "emitRate": 227,
            "avgEmitRate": 108,
            "idleTime": 182,
            "eruptionTime": 455,
            "dormancyCycles": 37.8,
            "activeCycles": 74.4
          },
          {
            "id": "big_volcano",
            "x": 33,
            "y": 113,
            "emitRate": 275880,
            "avgEmitRate": 1142,
            "idleTime": 10329,
            "eruptionTime": 70,
            "dormancyCycles": 22.5,
            "activeCycles": 36.1
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
          "FrozenCore"
        ],
        "biomePaths": "Forest:24,73 17,63 24,47 18,40 0,41 0,86 17,86;105,64 111,44 128,44 128,66;110,107 106,112 92,113 85,107 90,91 104,89 107,86 128,85 128,106\nOcean:105,64 104,65 107,86 104,89 90,91 85,107 74,109 64,100 48,109 45,108 37,97 24,96 17,86 24,73 17,63 24,47 31,47 42,59 52,57 58,41 67,39 77,48 86,47 93,38 106,38 111,44\nRadioactive:107,86 104,65 105,64 128,66 128,85;128,129 128,106 110,107 106,112 92,113 85,107 74,109 64,100 48,109 45,108 37,97 24,96 17,86 0,86 0,131 16,132 26,123 29,123 38,133 51,133 57,126 68,126 73,131 88,131 91,133 108,134 112,129\nFrozenWastes:128,153 128,129 112,129 108,134 91,133 88,131 73,131 68,126 57,126 51,133 38,133 29,123 26,123 16,132 0,131 0,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 44,
            "y": 123
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 27,
            "y": 117,
            "emitRate": 1354,
            "avgEmitRate": 181,
            "idleTime": 356,
            "eruptionTime": 93,
            "dormancyCycles": 47.4,
            "activeCycles": 86.4
          },
          {
            "id": "liquid_co2",
            "x": 110,
            "y": 115,
            "emitRate": 498,
            "avgEmitRate": 131,
            "idleTime": 208,
            "eruptionTime": 192,
            "dormancyCycles": 65.5,
            "activeCycles": 79.6
          },
          {
            "id": "salt_water",
            "x": 61,
            "y": 73,
            "emitRate": 10175,
            "avgEmitRate": 2402,
            "idleTime": 159,
            "eruptionTime": 164,
            "dormancyCycles": 58.4,
            "activeCycles": 50.7
          },
          {
            "id": "slush_water",
            "x": 13,
            "y": 117,
            "emitRate": 6102,
            "avgEmitRate": 1522,
            "idleTime": 194,
            "eruptionTime": 139,
            "dormancyCycles": 54.2,
            "activeCycles": 80.4
          },
          {
            "id": "slush_water",
            "x": 22,
            "y": 61,
            "emitRate": 4646,
            "avgEmitRate": 1644,
            "idleTime": 193,
            "eruptionTime": 229,
            "dormancyCycles": 43.9,
            "activeCycles": 82.0
          },
          {
            "id": "hot_steam",
            "x": 11,
            "y": 45,
            "emitRate": 2931,
            "avgEmitRate": 590,
            "idleTime": 387,
            "eruptionTime": 244,
            "dormancyCycles": 62.6,
            "activeCycles": 67.9
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
          "DistressSignal",
          "LushCore"
        ],
        "biomePaths": "FrozenWastes:64,110 64,37 46,34 43,36 29,32 21,40 21,48 14,55 0,55 0,103 8,103 17,112 29,110 32,106 44,106 48,111\nForest:64,128 64,110 48,111 44,106 32,106 29,110 17,112 8,103 0,103 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 31,
            "y": 68
          },
          {
            "id": "GravitasPedestal",
            "x": 44,
            "y": 90
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 24,
            "y": 101,
            "emitRate": 8701,
            "avgEmitRate": 261,
            "idleTime": 793,
            "eruptionTime": 49,
            "dormancyCycles": 72.3,
            "activeCycles": 77.3
          },
          {
            "id": "molten_iron",
            "x": 52,
            "y": 59,
            "emitRate": 7922,
            "avgEmitRate": 278,
            "idleTime": 700,
            "eruptionTime": 42,
            "dormancyCycles": 54.0,
            "activeCycles": 89.8
          },
          {
            "id": "molten_iron",
            "x": 51,
            "y": 98,
            "emitRate": 8126,
            "avgEmitRate": 286,
            "idleTime": 751,
            "eruptionTime": 46,
            "dormancyCycles": 39.9,
            "activeCycles": 64.0
          },
          {
            "id": "molten_iron",
            "x": 51,
            "y": 109,
            "emitRate": 7450,
            "avgEmitRate": 309,
            "idleTime": 700,
            "eruptionTime": 50,
            "dormancyCycles": 59.3,
            "activeCycles": 97.2
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
        "biomePaths": "BoggyMarsh:64,82 64,63 52,63 47,51 49,47 64,45 64,29 44,32 32,37 21,30 20,29 0,27 0,43 14,44 19,52 15,61 18,66 31,69 34,67 47,69 49,79\nToxicJungle:49,79 47,69 34,67 31,69 18,66 15,61 19,52 14,44 0,43 0,79 12,78 20,87 31,80 42,87;52,63 47,51 49,47 64,45 64,63\nMagmaCore:64,96 64,82 49,79 42,87 31,80 20,87 12,78 0,79 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 41,
            "y": 43
          },
          {
            "id": "GravitasPedestal",
            "x": 27,
            "y": 43
          },
          {
            "id": "SapTree",
            "x": 34,
            "y": 43
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 11,
            "y": 54,
            "emitRate": 13195,
            "avgEmitRate": 276,
            "idleTime": 803,
            "eruptionTime": 27,
            "dormancyCycles": 40.6,
            "activeCycles": 72.6
          },
          {
            "id": "slimy_po2",
            "x": 35,
            "y": 69,
            "emitRate": 417,
            "avgEmitRate": 122,
            "idleTime": 305,
            "eruptionTime": 248,
            "dormancyCycles": 36.9,
            "activeCycles": 69.9
          },
          {
            "id": "hot_co2",
            "x": 9,
            "y": 67,
            "emitRate": 321,
            "avgEmitRate": 69,
            "idleTime": 263,
            "eruptionTime": 273,
            "dormancyCycles": 53.7,
            "activeCycles": 39.6
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
        "biomePaths": "Moo:96,62 96,29 81,33 74,27 61,36 52,28 37,37 37,38 19,42 16,39 0,40 0,59 14,60 20,56 32,61 34,60 46,66 55,60 63,64 75,59 80,65\nFrozenWastes:96,80 96,62 80,65 75,59 63,64 55,60 46,66 34,60 32,61 20,56 14,60 0,59 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 20,
            "y": 71
          },
          {
            "id": "GravitasPedestal",
            "x": 13,
            "y": 71
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 83,
            "y": 44,
            "emitRate": 278,
            "avgEmitRate": 101,
            "idleTime": 200,
            "eruptionTime": 285,
            "dormancyCycles": 46.0,
            "activeCycles": 73.7
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
        "biomePaths": "Barren:80,138 80,27 64,31 60,28 49,33 38,28 32,34 21,32 15,42 0,40 0,136 15,137 21,133 34,141 40,139 45,127 58,128 62,141;80,174 80,157 67,157 60,146 50,149 47,157 36,161 29,154 17,156 16,155 0,156 0,174\nSwamp:80,157 80,138 62,141 58,128 45,127 40,139 34,141 21,133 15,137 0,136 0,156 16,155 17,156 29,154 36,161 47,157 50,149 60,146 67,157",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 58,
            "y": 142
          },
          {
            "id": "GravitasPedestal",
            "x": 60,
            "y": 142
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "x": 55,
            "y": 73,
            "emitRate": 14698,
            "avgEmitRate": 4627,
            "idleTime": 423,
            "eruptionTime": 304,
            "dormancyCycles": 47.9,
            "activeCycles": 146.0
          },
          {
            "id": "slush_water",
            "x": 42,
            "y": 58,
            "emitRate": 3813,
            "avgEmitRate": 1364,
            "idleTime": 262,
            "eruptionTime": 299,
            "dormancyCycles": 39.2,
            "activeCycles": 80.0
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
        "biomePaths": "MagmaCore:38,60 31,48 18,50 18,64 30,67;64,81 64,63 48,64 45,60 51,47 64,47 64,31 49,31 45,39 36,40 30,32 17,32 16,33 0,33 0,96 44,96 44,82 48,79\nOilField:38,60 31,48 18,50 18,64 30,67;64,63 64,47 51,47 45,60 48,64;64,96 64,81 48,79 44,82 44,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 29,
            "y": 64
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 49,
            "y": 82,
            "emitRate": 265589,
            "avgEmitRate": 1208,
            "idleTime": 8773,
            "eruptionTime": 66,
            "dormancyCycles": 46.2,
            "activeCycles": 70.7
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
        "biomePaths": "Sandstone:40,85 31,78 31,69 19,63 17,55 19,53 36,49 40,53 40,62 51,69 51,78;101,54 91,48 81,53 73,47 61,53 61,62 71,69 71,77 82,85 92,78 92,70 100,64;140,74 138,64 126,57 122,59 116,73 116,74 125,80\nBarren:31,78 31,69 19,63 17,55 0,54 0,75 9,75 19,85;71,77 71,69 61,62 61,53 54,48 40,53 40,62 51,69 51,78 61,85;122,59 110,50 101,54 100,64 92,70 92,78 104,86 116,74 116,73\nFrozenWastes:160,96 160,75 143,77 140,74 125,80 116,74 104,86 92,78 82,85 71,77 61,85 51,78 40,85 31,78 19,85 9,75 0,75 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 52,
            "y": 63
          },
          {
            "id": "GravitasPedestal",
            "x": 56,
            "y": 63
          },
          {
            "id": "GeneShuffler",
            "x": 54,
            "y": 57
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 54,
            "y": 88,
            "emitRate": 4843,
            "avgEmitRate": 1454,
            "idleTime": 356,
            "eruptionTime": 336,
            "dormancyCycles": 43.4,
            "activeCycles": 70.4
          },
          {
            "id": "steam",
            "x": 92,
            "y": 84,
            "emitRate": 3886,
            "avgEmitRate": 1414,
            "idleTime": 145,
            "eruptionTime": 212,
            "dormancyCycles": 43.0,
            "activeCycles": 68.2
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlandsWarp",
        "q": -1,
        "r": 0
      },
      {
        "id": "MiniForestFrozenStart",
        "q": 1,
        "r": 1
      },
      {
        "id": "MiniMetallicSwampy",
        "q": -3,
        "r": 3
      },
      {
        "id": "MiniFlipped",
        "q": 4,
        "r": -2
      },
      {
        "id": "MiniRadioactiveOcean",
        "q": 2,
        "r": -3
      },
      {
        "id": "TundraMoonlet",
        "q": 4,
        "r": 5
      },
      {
        "id": "MarshyMoonlet",
        "q": -2,
        "r": -6
      },
      {
        "id": "MooMoonlet",
        "q": -6,
        "r": -1
      },
      {
        "id": "WaterMoonlet",
        "q": -9,
        "r": 9
      },
      {
        "id": "NiobiumMoonlet",
        "q": 11,
        "r": -5
      },
      {
        "id": "RegolithMoonlet",
        "q": 9,
        "r": 1
      },
      {
        "id": "TemporalTear",
        "q": 10,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -2,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -4,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -1,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -10,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 4,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -3,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -1,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -5,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -6,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 8,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 5,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -10,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -11,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -10,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -6,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -5,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 12,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 1,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 0,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 12,
        "r": -9
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 6,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -12,
        "r": 10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -7,
        "r": 2
      }
    ]
  },
  {
    "coordinate": "M-FLIP-C-1342297923-0-0-0",
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
          "BouldersMedium"
        ],
        "biomePaths": "Sandstone:128,153 128,138 108,134 101,140 83,130 86,119 103,114 102,102 85,99 78,109 66,110 61,116 43,115 41,117 42,132 25,140 17,131 0,133 0,153\nMagmaCore:128,54 128,38 103,32 96,41 76,30 65,42 50,38 41,46 29,44 24,36 0,36 0,62 18,64 23,74 40,76 48,69 59,70 71,61 79,63 84,81 104,82 108,77 108,60\nWasteland:128,113 128,54 108,60 108,77 104,82 84,81 79,63 71,61 59,70 48,69 40,76 23,74 18,64 0,62 0,108 18,108 23,115 41,117 43,115 42,95 43,93 60,92 66,110 78,109 85,99 102,102 103,114 107,117\nFrozenWastes:42,132 41,117 23,115 18,108 0,108 0,133 17,131 25,140;61,116 43,115 42,95 43,93 60,92 66,110;108,134 101,140 83,130 86,119 103,114 107,117 128,113 128,138",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 72,
            "y": 123
          },
          {
            "id": "MassiveHeatSink",
            "x": 48,
            "y": 111
          },
          {
            "id": "MassiveHeatSink",
            "x": 104,
            "y": 125
          },
          {
            "id": "MassiveHeatSink",
            "x": 28,
            "y": 135
          },
          {
            "id": "WarpConduitReceiver",
            "x": 48,
            "y": 91
          },
          {
            "id": "WarpConduitSender",
            "x": 64,
            "y": 95
          },
          {
            "id": "WarpReceiver",
            "x": 103,
            "y": 98
          },
          {
            "id": "WarpPortal",
            "x": 103,
            "y": 93
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "x": 91,
            "y": 73,
            "emitRate": 5235,
            "avgEmitRate": 1350,
            "idleTime": 221,
            "eruptionTime": 174,
            "dormancyCycles": 63.5,
            "activeCycles": 89.6
          },
          {
            "id": "small_volcano",
            "x": 14,
            "y": 92,
            "emitRate": 120908,
            "avgEmitRate": 419,
            "idleTime": 10159,
            "eruptionTime": 71,
            "dormancyCycles": 57.3,
            "activeCycles": 57.8
          },
          {
            "id": "hot_co2",
            "x": 13,
            "y": 127,
            "emitRate": 632,
            "avgEmitRate": 106,
            "idleTime": 406,
            "eruptionTime": 142,
            "dormancyCycles": 48.6,
            "activeCycles": 88.2
          },
          {
            "id": "slimy_po2",
            "x": 26,
            "y": 92,
            "emitRate": 322,
            "avgEmitRate": 100,
            "idleTime": 278,
            "eruptionTime": 302,
            "dormancyCycles": 66.5,
            "activeCycles": 97.9
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
          "LushCore",
          "MetalRich"
        ],
        "biomePaths": "Sandstone:21,107 13,91 0,92 0,112 20,111;39,135 25,143 17,133 23,118 40,123;107,120 91,117 86,122 69,119 62,127 43,120 45,104 38,98 30,82 20,83 10,66 18,59 34,63 39,57 54,51 73,54 75,56 85,76 89,75 100,62 109,62 110,85 107,88 105,94 115,109\nToxicJungle:51,145 39,135 40,123 23,118 20,111 21,107 13,91 20,83 30,82 38,98 45,104 43,120 62,127 62,134;128,63 128,40 112,42 106,37 95,40 83,31 73,37 60,31 53,37 39,33 32,40 19,40 16,43 0,42 0,66 10,66 18,59 34,63 39,57 54,51 73,54 75,56 85,76 89,75 100,62 109,62\nOilField:20,83 10,66 0,66 0,92 13,91;23,118 20,111 0,112 0,134 17,133;128,134 128,63 109,62 110,85 107,88 105,94 115,109 107,120 91,117 86,122 69,119 62,127 62,134 78,144 87,134 104,141 111,132\nForest:128,153 128,134 111,132 104,141 87,134 78,144 62,134 51,145 39,135 25,143 17,133 0,134 0,153",
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "x": 76,
            "y": 54
          },
          {
            "id": "WarpConduitSender",
            "x": 112,
            "y": 78
          },
          {
            "id": "WarpPortal",
            "x": 43,
            "y": 81
          },
          {
            "id": "WarpReceiver",
            "x": 65,
            "y": 81
          },
          {
            "id": "GeneShuffler",
            "x": 46,
            "y": 111
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "x": 111,
            "y": 121,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 90,
            "y": 128,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 106,
            "y": 130,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 17,
            "y": 116,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 108,
            "y": 95,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "steam",
            "x": 86,
            "y": 66,
            "emitRate": 3999,
            "avgEmitRate": 1473,
            "idleTime": 245,
            "eruptionTime": 367,
            "dormancyCycles": 48.9,
            "activeCycles": 77.7
          },
          {
            "id": "chlorine_gas",
            "x": 109,
            "y": 56,
            "emitRate": 279,
            "avgEmitRate": 107,
            "idleTime": 177,
            "eruptionTime": 308,
            "dormancyCycles": 51.8,
            "activeCycles": 77.7
          },
          {
            "id": "hot_co2",
            "x": 82,
            "y": 105,
            "emitRate": 334,
            "avgEmitRate": 106,
            "idleTime": 344,
            "eruptionTime": 470,
            "dormancyCycles": 51.4,
            "activeCycles": 63.1
          },
          {
            "id": "filthy_water",
            "x": 16,
            "y": 60,
            "emitRate": 16275,
            "avgEmitRate": 3511,
            "idleTime": 460,
            "eruptionTime": 240,
            "dormancyCycles": 57.7,
            "activeCycles": 97.9
          },
          {
            "id": "big_volcano",
            "x": 45,
            "y": 47,
            "emitRate": 294219,
            "avgEmitRate": 1358,
            "idleTime": 7727,
            "eruptionTime": 58,
            "dormancyCycles": 56.9,
            "activeCycles": 94.2
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
          "MagmaVents",
          "Volcanoes"
        ],
        "biomePaths": "Swamp:24,52 21,48 0,47 0,69 16,71;128,69 128,49 109,48 104,53 85,48 82,50 66,45 60,50 60,68 71,72 81,68 88,74 99,72 105,63 117,72\nMagmaCore:88,74 81,68 71,72 60,68 55,73 41,70 36,77 20,77 16,71 0,69 0,83 18,81 24,91 39,88 40,87 55,81 64,86 71,82 82,85;112,82 111,83 99,72 105,63 117,72 128,69 128,86;128,153 128,132 109,131 104,116 86,118 83,130 80,132 60,128 64,107 62,105 46,106 42,111 24,113 21,127 20,128 0,127 0,153\nBoggyMarsh:60,68 60,50 44,46 36,54 24,52 16,71 20,77 36,77 41,70 55,73;83,130 80,132 60,128 64,107 62,105 46,106 39,88 40,87 55,81 64,86 71,82 82,85 86,94 80,107 86,118;109,131 104,116 108,108 128,108 128,132\nMetallic:46,106 39,88 24,91 18,81 0,83 0,127 20,128 21,127 24,113 42,111;128,108 128,86 112,82 111,83 99,72 88,74 82,85 86,94 80,107 86,118 104,116 108,108",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 42,
            "y": 66
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "x": 54,
            "y": 100,
            "emitRate": 380,
            "avgEmitRate": 101,
            "idleTime": 304,
            "eruptionTime": 280,
            "dormancyCycles": 75.4,
            "activeCycles": 92.8
          },
          {
            "id": "molten_cobalt",
            "x": 90,
            "y": 102,
            "emitRate": 10217,
            "avgEmitRate": 299,
            "idleTime": 730,
            "eruptionTime": 37,
            "dormancyCycles": 39.8,
            "activeCycles": 61.1
          },
          {
            "id": "molten_gold",
            "x": 111,
            "y": 105,
            "emitRate": 8194,
            "avgEmitRate": 341,
            "idleTime": 771,
            "eruptionTime": 55,
            "dormancyCycles": 26.0,
            "activeCycles": 43.0
          },
          {
            "id": "molten_cobalt",
            "x": 110,
            "y": 115,
            "emitRate": 10511,
            "avgEmitRate": 276,
            "idleTime": 745,
            "eruptionTime": 32,
            "dormancyCycles": 51.2,
            "activeCycles": 86.5
          },
          {
            "id": "molten_copper",
            "x": 70,
            "y": 112,
            "emitRate": 10751,
            "avgEmitRate": 407,
            "idleTime": 767,
            "eruptionTime": 40,
            "dormancyCycles": 34.6,
            "activeCycles": 112.0
          },
          {
            "id": "big_volcano",
            "x": 108,
            "y": 74,
            "emitRate": 274930,
            "avgEmitRate": 1139,
            "idleTime": 10208,
            "eruptionTime": 74,
            "dormancyCycles": 20.8,
            "activeCycles": 28.0
          },
          {
            "id": "big_volcano",
            "x": 62,
            "y": 77,
            "emitRate": 337470,
            "avgEmitRate": 1219,
            "idleTime": 9046,
            "eruptionTime": 60,
            "dormancyCycles": 57.6,
            "activeCycles": 70.7
          },
          {
            "id": "big_volcano",
            "x": 28,
            "y": 84,
            "emitRate": 267895,
            "avgEmitRate": 1236,
            "idleTime": 8979,
            "eruptionTime": 67,
            "dormancyCycles": 55.5,
            "activeCycles": 92.2
          },
          {
            "id": "big_volcano",
            "x": 45,
            "y": 78,
            "emitRate": 264272,
            "avgEmitRate": 1011,
            "idleTime": 8446,
            "eruptionTime": 64,
            "dormancyCycles": 68.6,
            "activeCycles": 71.0
          },
          {
            "id": "big_volcano",
            "x": 78,
            "y": 77,
            "emitRate": 263072,
            "avgEmitRate": 1098,
            "idleTime": 8388,
            "eruptionTime": 60,
            "dormancyCycles": 73.7,
            "activeCycles": 105.1
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
          "CrashedSatellites"
        ],
        "biomePaths": "Forest:128,63 128,40 109,40 104,49 88,50 85,47 67,50 63,46 47,47 40,38 24,40 19,50 0,51 0,74 21,74 26,61 42,60 51,73 66,70 73,74 87,69 100,78 111,62\nRust:128,106 128,82 106,85 102,82 84,97 74,94 73,74 66,70 51,73 47,81 26,84 24,93 32,107 23,117 0,109 0,135 23,131 27,134 47,131 51,124 40,107 52,95 66,98 65,121 73,126 80,125 90,133 108,130 108,129 104,111 110,105\nToxicJungle:51,73 42,60 26,61 21,74 0,74 0,109 23,117 32,107 24,93 26,84 47,81;66,98 52,95 40,107 51,124 65,121;128,82 128,63 111,62 100,78 87,69 73,74 74,94 84,97 102,82 106,85;128,128 128,106 110,105 104,111 108,129\nMagmaCore:128,153 128,128 108,129 108,130 90,133 80,125 73,126 65,121 51,124 47,131 27,134 23,131 0,135 0,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 18,
            "y": 95
          },
          {
            "id": "PropSurfaceSatellite3",
            "x": 74,
            "y": 67
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 27,
            "y": 79
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 60,
            "y": 83
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 79,
            "y": 91
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 54,
            "y": 99,
            "emitRate": 195,
            "avgEmitRate": 90,
            "idleTime": 161,
            "eruptionTime": 630,
            "dormancyCycles": 67.7,
            "activeCycles": 92.4
          },
          {
            "id": "slush_water",
            "x": 82,
            "y": 106,
            "emitRate": 3980,
            "avgEmitRate": 1413,
            "idleTime": 159,
            "eruptionTime": 192,
            "dormancyCycles": 40.9,
            "activeCycles": 75.7
          },
          {
            "id": "methane",
            "x": 38,
            "y": 64,
            "emitRate": 334,
            "avgEmitRate": 98,
            "idleTime": 333,
            "eruptionTime": 256,
            "dormancyCycles": 55.8,
            "activeCycles": 117.1
          },
          {
            "id": "small_volcano",
            "x": 77,
            "y": 78,
            "emitRate": 110818,
            "avgEmitRate": 488,
            "idleTime": 9628,
            "eruptionTime": 77,
            "dormancyCycles": 49.0,
            "activeCycles": 60.8
          },
          {
            "id": "hot_co2",
            "x": 97,
            "y": 80,
            "emitRate": 387,
            "avgEmitRate": 101,
            "idleTime": 214,
            "eruptionTime": 177,
            "dormancyCycles": 39.5,
            "activeCycles": 53.6
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
          "Volcanoes",
          "Geodes"
        ],
        "biomePaths": "Forest:22,87 22,67 0,63 0,87;128,102 128,58 108,58 104,65 89,66 83,78 85,85 78,97 80,106 89,111 106,103 107,104\nOcean:108,58 102,45 93,42 80,52 68,45 55,51 46,45 28,52 28,61 22,67 22,108 23,109 44,107 46,95 39,86 46,77 44,70 54,62 64,71 56,81 57,92 62,97 78,97 85,85 83,78 70,70 81,58 89,66 104,65\nMagmaCore:80,106 78,97 62,97 57,92 56,81 64,71 54,62 44,70 46,77 39,86 46,95 44,107 46,109 61,106 68,112;83,78 70,70 81,58 89,66;128,153 128,130 112,129 106,133 91,129 84,134 67,128 61,133 46,128 40,132 23,127 20,130 0,128 0,153\nRadioactive:28,61 28,52 22,46 0,49 0,63 22,67;128,130 128,102 107,104 106,103 89,111 80,106 68,112 61,106 46,109 44,107 23,109 22,108 22,87 0,87 0,128 20,130 23,127 40,132 46,128 61,133 67,128 84,134 91,129 106,133 112,129",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 88,
            "y": 117
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "x": 114,
            "y": 114,
            "emitRate": 563,
            "avgEmitRate": 146,
            "idleTime": 275,
            "eruptionTime": 223,
            "dormancyCycles": 44.9,
            "activeCycles": 61.6
          },
          {
            "id": "salt_water",
            "x": 25,
            "y": 65,
            "emitRate": 11219,
            "avgEmitRate": 2940,
            "idleTime": 325,
            "eruptionTime": 277,
            "dormancyCycles": 60.1,
            "activeCycles": 79.5
          },
          {
            "id": "slush_salt_water",
            "x": 88,
            "y": 91,
            "emitRate": 7196,
            "avgEmitRate": 2223,
            "idleTime": 322,
            "eruptionTime": 228,
            "dormancyCycles": 33.8,
            "activeCycles": 98.3
          },
          {
            "id": "filthy_water",
            "x": 110,
            "y": 99,
            "emitRate": 31808,
            "avgEmitRate": 2723,
            "idleTime": 502,
            "eruptionTime": 88,
            "dormancyCycles": 56.0,
            "activeCycles": 75.3
          },
          {
            "id": "hot_steam",
            "x": 17,
            "y": 96,
            "emitRate": 3371,
            "avgEmitRate": 737,
            "idleTime": 234,
            "eruptionTime": 126,
            "dormancyCycles": 44.0,
            "activeCycles": 73.2
          },
          {
            "id": "big_volcano",
            "x": 70,
            "y": 104,
            "emitRate": 282095,
            "avgEmitRate": 1618,
            "idleTime": 8434,
            "eruptionTime": 64,
            "dormancyCycles": 47.8,
            "activeCycles": 148.6
          },
          {
            "id": "big_volcano",
            "x": 48,
            "y": 87,
            "emitRate": 288287,
            "avgEmitRate": 1155,
            "idleTime": 9627,
            "eruptionTime": 61,
            "dormancyCycles": 60.6,
            "activeCycles": 105.0
          },
          {
            "id": "big_volcano",
            "x": 52,
            "y": 101,
            "emitRate": 360438,
            "avgEmitRate": 1286,
            "idleTime": 9861,
            "eruptionTime": 63,
            "dormancyCycles": 64.8,
            "activeCycles": 81.9
          },
          {
            "id": "big_volcano",
            "x": 80,
            "y": 69,
            "emitRate": 357842,
            "avgEmitRate": 1089,
            "idleTime": 8894,
            "eruptionTime": 47,
            "dormancyCycles": 56.0,
            "activeCycles": 75.3
          },
          {
            "id": "big_volcano",
            "x": 53,
            "y": 72,
            "emitRate": 335055,
            "avgEmitRate": 1311,
            "idleTime": 9291,
            "eruptionTime": 57,
            "dormancyCycles": 36.5,
            "activeCycles": 64.6
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
          "MetalRich"
        ],
        "biomePaths": "FrozenWastes:64,128 64,44 46,38 38,47 22,35 17,38 0,33 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 20,
            "y": 51
          },
          {
            "id": "GravitasPedestal",
            "x": 46,
            "y": 112
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 34,
            "y": 95,
            "emitRate": 12413,
            "avgEmitRate": 280,
            "idleTime": 667,
            "eruptionTime": 28,
            "dormancyCycles": 59.7,
            "activeCycles": 74.7
          },
          {
            "id": "molten_iron",
            "x": 50,
            "y": 89,
            "emitRate": 6956,
            "avgEmitRate": 214,
            "idleTime": 756,
            "eruptionTime": 46,
            "dormancyCycles": 52.1,
            "activeCycles": 61.3
          },
          {
            "id": "molten_iron",
            "x": 20,
            "y": 106,
            "emitRate": 8138,
            "avgEmitRate": 338,
            "idleTime": 803,
            "eruptionTime": 52,
            "dormancyCycles": 35.4,
            "activeCycles": 75.7
          },
          {
            "id": "molten_iron",
            "x": 40,
            "y": 73,
            "emitRate": 7271,
            "avgEmitRate": 298,
            "idleTime": 706,
            "eruptionTime": 47,
            "dormancyCycles": 45.4,
            "activeCycles": 87.3
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
        "biomePaths": "BoggyMarsh:64,61 64,32 49,31 43,39 31,33 21,37 17,34 0,36 0,52 12,54 17,64 27,64 34,54 41,53 48,63\nToxicJungle:64,79 64,61 48,63 41,53 34,54 27,64 17,64 12,54 0,52 0,74 10,74 17,82 30,80 33,75 44,74 49,79\nMagmaCore:64,96 64,79 49,79 44,74 33,75 30,80 17,82 10,74 0,74 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 39,
            "y": 48
          },
          {
            "id": "GravitasPedestal",
            "x": 25,
            "y": 48
          },
          {
            "id": "SapTree",
            "x": 32,
            "y": 48
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 56,
            "y": 59,
            "emitRate": 9301,
            "avgEmitRate": 324,
            "idleTime": 655,
            "eruptionTime": 38,
            "dormancyCycles": 39.7,
            "activeCycles": 69.2
          },
          {
            "id": "molten_tungsten",
            "x": 39,
            "y": 90,
            "emitRate": 7267,
            "avgEmitRate": 259,
            "idleTime": 603,
            "eruptionTime": 45,
            "dormancyCycles": 32.7,
            "activeCycles": 35.0
          },
          {
            "id": "molten_tungsten",
            "x": 6,
            "y": 91,
            "emitRate": 13468,
            "avgEmitRate": 335,
            "idleTime": 638,
            "eruptionTime": 26,
            "dormancyCycles": 53.4,
            "activeCycles": 91.8
          },
          {
            "id": "hot_hydrogen",
            "x": 43,
            "y": 59,
            "emitRate": 428,
            "avgEmitRate": 125,
            "idleTime": 301,
            "eruptionTime": 237,
            "dormancyCycles": 41.9,
            "activeCycles": 83.1
          },
          {
            "id": "hot_co2",
            "x": 12,
            "y": 66,
            "emitRate": 358,
            "avgEmitRate": 128,
            "idleTime": 203,
            "eruptionTime": 264,
            "dormancyCycles": 43.3,
            "activeCycles": 74.2
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
        "biomePaths": "Moo:96,54 96,29 85,32 71,24 65,33 53,34 47,27 33,31 30,36 16,33 7,42 0,43 0,63 15,63 21,58 34,64 40,60 51,67 63,59 70,65 80,63 87,54\nFrozenWastes:96,80 96,54 87,54 80,63 70,65 63,59 51,67 40,60 34,64 21,58 15,63 0,63 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 42,
            "y": 39
          },
          {
            "id": "GravitasPedestal",
            "x": 35,
            "y": 39
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 60,
            "y": 43,
            "emitRate": 285,
            "avgEmitRate": 104,
            "idleTime": 235,
            "eruptionTime": 344,
            "dormancyCycles": 36.4,
            "activeCycles": 57.6
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
        "biomePaths": "Barren:28,174 16,157 0,160 0,174;80,139 80,37 62,33 56,39 42,29 33,38 19,34 19,33 0,32 0,138 15,139 21,146 30,146 38,135 45,135 54,128 59,128 67,139;29,174 37,157 54,155 55,156 59,154 80,161 80,174\nSwamp:80,161 80,139 67,139 59,128 54,128 45,135 38,135 30,146 21,146 15,139 0,138 0,160 16,157 28,174 29,174 37,157 54,155 55,156 59,154",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 56,
            "y": 153
          },
          {
            "id": "GravitasPedestal",
            "x": 58,
            "y": 153
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "x": 22,
            "y": 75,
            "emitRate": 12358,
            "avgEmitRate": 2533,
            "idleTime": 297,
            "eruptionTime": 188,
            "dormancyCycles": 78.3,
            "activeCycles": 87.6
          },
          {
            "id": "slush_water",
            "x": 63,
            "y": 107,
            "emitRate": 4120,
            "avgEmitRate": 1094,
            "idleTime": 391,
            "eruptionTime": 369,
            "dormancyCycles": 69.4,
            "activeCycles": 83.6
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
        "biomePaths": "MagmaCore:64,96 64,62 48,68 41,64 42,51 48,48 64,54 64,34 51,34 47,30 35,30 33,33 19,33 15,28 0,28 0,78 14,77 20,83 32,79 41,87 41,96\nOilField:41,96 41,87 32,79 20,83 14,77 0,78 0,96;48,68 41,64 42,51 48,48 64,54 64,62",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 47,
            "y": 62
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 36,
            "y": 87,
            "emitRate": 291694,
            "avgEmitRate": 1207,
            "idleTime": 9680,
            "eruptionTime": 70,
            "dormancyCycles": 73.1,
            "activeCycles": 99.0
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
        "biomePaths": "Barren:17,78 13,62 0,62 0,81;49,49 48,46 34,44 26,55 32,63 28,76 40,83 46,79 48,67 45,63;86,63 85,61 68,59 64,66 67,77 80,80 83,77;118,85 103,79 105,68 102,64 105,48 116,49 123,62 121,66 125,76;160,84 160,71 144,67 138,79 139,82\nSandstone:32,63 26,55 20,55 13,62 17,78 20,79 28,76;68,59 66,53 49,49 45,63 48,67 46,79 60,84 67,77 64,66;105,68 102,64 105,48 103,46 87,47 85,61 86,63 83,77 98,83 103,79;138,79 125,76 121,66 123,62 116,49 123,40 135,47 135,57 142,62 144,67\nFrozenWastes:160,96 160,84 139,82 138,79 125,76 118,85 103,79 98,83 83,77 80,80 67,77 60,84 46,79 40,83 28,76 20,79 17,78 0,81 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 105,
            "y": 64
          },
          {
            "id": "GravitasPedestal",
            "x": 109,
            "y": 64
          },
          {
            "id": "GeneShuffler",
            "x": 107,
            "y": 58
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 89,
            "y": 83,
            "emitRate": 4508,
            "avgEmitRate": 1640,
            "idleTime": 183,
            "eruptionTime": 265,
            "dormancyCycles": 42.2,
            "activeCycles": 67.3
          },
          {
            "id": "steam",
            "x": 71,
            "y": 82,
            "emitRate": 4233,
            "avgEmitRate": 1914,
            "idleTime": 156,
            "eruptionTime": 300,
            "dormancyCycles": 42.5,
            "activeCycles": 93.0
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlandsWarp",
        "q": 0,
        "r": -1
      },
      {
        "id": "MiniFlippedStart",
        "q": 4,
        "r": -2
      },
      {
        "id": "MiniMetallicSwampy",
        "q": -3,
        "r": 3
      },
      {
        "id": "MiniForestFrozen",
        "q": 2,
        "r": 1
      },
      {
        "id": "MiniRadioactiveOcean",
        "q": -3,
        "r": -1
      },
      {
        "id": "TundraMoonlet",
        "q": 8,
        "r": -7
      },
      {
        "id": "MarshyMoonlet",
        "q": -8,
        "r": 6
      },
      {
        "id": "MooMoonlet",
        "q": 1,
        "r": 7
      },
      {
        "id": "WaterMoonlet",
        "q": -8,
        "r": -1
      },
      {
        "id": "NiobiumMoonlet",
        "q": -1,
        "r": 11
      },
      {
        "id": "RegolithMoonlet",
        "q": 6,
        "r": 5
      },
      {
        "id": "TemporalTear",
        "q": 9,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 0,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -6,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -11,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -11,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -10,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -6,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -6,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 9,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -11,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 5,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -2,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 3,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 3,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 2,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 1,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -4,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -5,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -3,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -4,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 12,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 9,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 0,
        "r": -12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 4,
        "r": -12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": 12,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 3,
        "r": 8
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -4,
        "r": -8
      }
    ]
  },
  {
    "coordinate": "M-RAD-C-328466368-0-0-0",
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
          "LushCore",
          "Volcanoes"
        ],
        "biomePaths": "Forest:101,95 90,101 91,112 85,117 72,110 64,113 61,123 40,119 38,109 22,109 16,101 18,96 12,86 17,77 32,82 42,67 65,64 72,67 82,87 96,84 102,92;128,153 128,135 108,133 102,137 85,131 77,137 63,131 49,146 35,132 22,135 14,128 0,128 0,153\nOcean:65,64 61,46 48,42 37,57 24,54 19,49 0,48 0,71 15,73 17,77 32,82 42,67;128,77 128,53 113,54 103,43 90,48 87,60 72,67 82,87 96,84 102,72 104,72 113,80;107,113 106,112 101,95 102,92 112,86 128,92 128,110\nMagmaCore:18,96 12,86 17,77 15,73 0,71 0,102 16,101;106,112 101,95 90,101 91,112;112,86 102,92 96,84 102,72 104,72 113,80 128,77 128,92\nRadioactive:128,135 128,110 107,113 106,112 91,112 85,117 72,110 64,113 61,123 40,119 38,109 22,109 16,101 0,102 0,128 14,128 22,135 35,132 49,146 63,131 77,137 85,131 102,137 108,133",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 58,
            "y": 91
          },
          {
            "id": "WarpConduitSender",
            "x": 73,
            "y": 119
          },
          {
            "id": "WarpConduitReceiver",
            "x": 47,
            "y": 120
          },
          {
            "id": "GravitasPedestal",
            "x": 106,
            "y": 133
          },
          {
            "id": "WarpReceiver",
            "x": 31,
            "y": 101
          },
          {
            "id": "WarpPortal",
            "x": 31,
            "y": 96
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "x": 30,
            "y": 72,
            "emitRate": 15903,
            "avgEmitRate": 2893,
            "idleTime": 316,
            "eruptionTime": 129,
            "dormancyCycles": 55.9,
            "activeCycles": 94.1
          },
          {
            "id": "slush_water",
            "x": 50,
            "y": 136,
            "emitRate": 5285,
            "avgEmitRate": 1512,
            "idleTime": 279,
            "eruptionTime": 218,
            "dormancyCycles": 41.8,
            "activeCycles": 78.4
          },
          {
            "id": "hot_steam",
            "x": 82,
            "y": 128,
            "emitRate": 2600,
            "avgEmitRate": 738,
            "idleTime": 531,
            "eruptionTime": 392,
            "dormancyCycles": 59.4,
            "activeCycles": 120.0
          },
          {
            "id": "hot_water",
            "x": 110,
            "y": 107,
            "emitRate": 10521,
            "avgEmitRate": 2409,
            "idleTime": 274,
            "eruptionTime": 272,
            "dormancyCycles": 64.8,
            "activeCycles": 55.1
          },
          {
            "id": "big_volcano",
            "x": 104,
            "y": 83,
            "emitRate": 273656,
            "avgEmitRate": 955,
            "idleTime": 9214,
            "eruptionTime": 60,
            "dormancyCycles": 49.8,
            "activeCycles": 58.4
          },
          {
            "id": "big_volcano",
            "x": 97,
            "y": 106,
            "emitRate": 297986,
            "avgEmitRate": 1208,
            "idleTime": 9729,
            "eruptionTime": 65,
            "dormancyCycles": 60.2,
            "activeCycles": 95.2
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
          "MetalPoor"
        ],
        "biomePaths": "ToxicJungle:39,153 38,133 24,131 19,135 20,153;128,63 128,41 110,41 106,37 93,37 86,47 74,48 69,54 50,52 47,43 28,38 25,41 0,37 0,57 23,57 25,61 44,62 48,73 40,85 26,83 19,96 25,108 35,107 44,95 58,98 65,91 83,94 85,92 85,73 98,64 100,65 107,59\nSandstone:25,108 19,96 0,96 0,153 20,153 19,135 24,131 21,114;48,73 44,62 25,61 23,57 0,57 0,75 21,76 26,83 40,85;115,129 105,111 91,116 90,131 81,136 81,153 59,153 60,136 45,127 46,121 35,107 44,95 58,98 65,91 83,94 85,92 103,93 109,82 128,81 128,129\nOilField:26,83 21,76 0,75 0,96 19,96;60,136 45,127 46,121 35,107 25,108 21,114 24,131 38,133 39,153 59,153;128,81 128,63 107,59 100,65 98,64 85,73 85,92 103,93 109,82;128,153 128,129 115,129 105,111 91,116 90,131 81,136 81,153",
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "x": 33,
            "y": 57
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "x": 89,
            "y": 82,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 43,
            "y": 134,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 27,
            "y": 120,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 99,
            "y": 135,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 95,
            "y": 120,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "steam",
            "x": 89,
            "y": 62,
            "emitRate": 5074,
            "avgEmitRate": 1306,
            "idleTime": 264,
            "eruptionTime": 238,
            "dormancyCycles": 67.5,
            "activeCycles": 80.4
          },
          {
            "id": "chlorine_gas",
            "x": 37,
            "y": 98,
            "emitRate": 265,
            "avgEmitRate": 100,
            "idleTime": 208,
            "eruptionTime": 367,
            "dormancyCycles": 24.2,
            "activeCycles": 34.8
          },
          {
            "id": "oil_drip",
            "x": 72,
            "y": 122,
            "emitRate": 135,
            "avgEmitRate": 79,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.3
          },
          {
            "id": "big_volcano",
            "x": 65,
            "y": 70,
            "emitRate": 334922,
            "avgEmitRate": 1290,
            "idleTime": 9845,
            "eruptionTime": 61,
            "dormancyCycles": 67.2,
            "activeCycles": 114.0
          },
          {
            "id": "hot_co2",
            "x": 58,
            "y": 93,
            "emitRate": 623,
            "avgEmitRate": 110,
            "idleTime": 240,
            "eruptionTime": 114,
            "dormancyCycles": 58.8,
            "activeCycles": 70.6
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
          "BouldersMedium"
        ],
        "biomePaths": "Sandstone:83,105 70,108 64,97 69,88 82,88 86,96;128,153 128,136 107,134 107,135 86,132 85,131 76,130 67,115 53,119 43,112 32,129 25,130 21,135 0,134 0,153\nMagmaCore:128,61 128,39 108,36 101,52 90,52 83,41 71,40 68,35 48,31 41,41 28,40 24,33 0,32 0,55 20,56 24,66 42,67 48,57 62,58 67,67 82,67 87,76 106,78 110,63\nWasteland:128,82 128,61 110,63 106,78 87,76 82,67 67,67 62,58 48,57 42,67 24,66 20,56 0,55 0,94 11,94 22,80 35,87 31,104 43,112 53,119 67,115 70,108 64,97 53,97 44,84 46,78 63,76 69,88 82,88 86,96 104,94 106,80;108,117 105,113 108,99 128,98 128,116\nFrozenWastes:43,112 31,104 35,87 22,80 11,94 0,94 0,134 21,135 25,130 32,129;64,97 53,97 44,84 46,78 63,76 69,88;107,134 107,135 86,132 85,131 76,130 67,115 70,108 83,105 86,96 104,94 106,80 128,82 128,98 108,99 105,113 108,117 128,116 128,136",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "x": 112,
            "y": 131
          },
          {
            "id": "MassiveHeatSink",
            "x": 62,
            "y": 85
          },
          {
            "id": "MassiveHeatSink",
            "x": 38,
            "y": 118
          },
          {
            "id": "WarpConduitReceiver",
            "x": 101,
            "y": 93
          },
          {
            "id": "WarpConduitSender",
            "x": 91,
            "y": 112
          },
          {
            "id": "WarpPortal",
            "x": 52,
            "y": 130
          },
          {
            "id": "WarpReceiver",
            "x": 74,
            "y": 130
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "x": 14,
            "y": 47,
            "emitRate": 6636,
            "avgEmitRate": 1605,
            "idleTime": 495,
            "eruptionTime": 341,
            "dormancyCycles": 50.5,
            "activeCycles": 73.7
          },
          {
            "id": "hot_hydrogen",
            "x": 28,
            "y": 89,
            "emitRate": 301,
            "avgEmitRate": 104,
            "idleTime": 318,
            "eruptionTime": 365,
            "dormancyCycles": 44.3,
            "activeCycles": 81.5
          },
          {
            "id": "hot_co2",
            "x": 65,
            "y": 110,
            "emitRate": 296,
            "avgEmitRate": 87,
            "idleTime": 230,
            "eruptionTime": 339,
            "dormancyCycles": 84.9,
            "activeCycles": 81.8
          },
          {
            "id": "hot_po2",
            "x": 90,
            "y": 128,
            "emitRate": 290,
            "avgEmitRate": 89,
            "idleTime": 260,
            "eruptionTime": 328,
            "dormancyCycles": 53.5,
            "activeCycles": 66.2
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
          "MagmaVents",
          "MetalPoor"
        ],
        "biomePaths": "Swamp:128,97 128,47 110,47 105,59 92,64 86,61 84,44 69,41 61,48 64,61 52,71 46,71 39,60 23,61 18,69 0,69 0,91 18,91 24,83 36,84 44,97 60,95 63,89 75,86 84,90 95,84 105,87 109,96\nBoggyMarsh:64,61 61,48 45,44 44,42 24,38 18,46 0,46 0,69 18,69 23,61 39,60 46,71 52,71;86,129 83,110 66,110 60,95 44,97 36,84 24,83 18,91 0,91 0,113 18,114 24,107 38,108 43,116 61,117 64,131 78,136;110,47 106,42 90,39 84,44 86,61 92,64 105,59;128,136 128,117 106,116 101,132 103,135\nMetallic:64,131 61,117 43,116 38,108 24,107 18,114 21,131 25,134 38,130 51,142;106,116 103,109 85,108 83,110 66,110 60,95 63,89 75,86 84,90 95,84 105,87 109,96 128,97 128,117\nMagmaCore:128,153 128,136 103,135 101,132 106,116 103,109 85,108 83,110 86,129 78,136 64,131 51,142 38,130 25,134 21,131 18,114 0,113 0,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 96,
            "y": 91
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "x": 52,
            "y": 63,
            "emitRate": 336,
            "avgEmitRate": 84,
            "idleTime": 315,
            "eruptionTime": 297,
            "dormancyCycles": 80.8,
            "activeCycles": 87.0
          },
          {
            "id": "molten_cobalt",
            "x": 48,
            "y": 122,
            "emitRate": 8570,
            "avgEmitRate": 295,
            "idleTime": 598,
            "eruptionTime": 35,
            "dormancyCycles": 47.3,
            "activeCycles": 76.6
          },
          {
            "id": "molten_gold",
            "x": 115,
            "y": 115,
            "emitRate": 13069,
            "avgEmitRate": 296,
            "idleTime": 800,
            "eruptionTime": 38,
            "dormancyCycles": 54.7,
            "activeCycles": 54.5
          },
          {
            "id": "molten_gold",
            "x": 89,
            "y": 105,
            "emitRate": 6538,
            "avgEmitRate": 333,
            "idleTime": 599,
            "eruptionTime": 51,
            "dormancyCycles": 54.4,
            "activeCycles": 101.2
          },
          {
            "id": "molten_aluminum",
            "x": 30,
            "y": 87,
            "emitRate": 8819,
            "avgEmitRate": 264,
            "idleTime": 587,
            "eruptionTime": 32,
            "dormancyCycles": 38.8,
            "activeCycles": 52.1
          },
          {
            "id": "molten_cobalt",
            "x": 27,
            "y": 111,
            "emitRate": 7759,
            "avgEmitRate": 232,
            "idleTime": 641,
            "eruptionTime": 38,
            "dormancyCycles": 53.5,
            "activeCycles": 61.3
          },
          {
            "id": "small_volcano",
            "x": 48,
            "y": 102,
            "emitRate": 145420,
            "avgEmitRate": 662,
            "idleTime": 10113,
            "eruptionTime": 74,
            "dormancyCycles": 54.2,
            "activeCycles": 89.3
          },
          {
            "id": "methane",
            "x": 90,
            "y": 60,
            "emitRate": 506,
            "avgEmitRate": 111,
            "idleTime": 401,
            "eruptionTime": 222,
            "dormancyCycles": 53.4,
            "activeCycles": 84.2
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
          "CrashedSatellites"
        ],
        "biomePaths": "ToxicJungle:21,63 0,55 0,80 17,78;73,95 70,88 62,85 58,64 41,68 38,84 26,87 22,99 0,99 0,136 22,136 25,131 42,130 43,110 47,106 64,112 66,111;108,134 105,131 107,112 113,92 104,84 98,85 84,74 83,64 84,62 104,60 111,68 128,68 128,133\nRust:41,68 29,58 21,63 17,78 0,80 0,99 22,99 26,87 38,84;107,112 105,131 87,133 85,131 67,136 60,131 45,133 42,130 43,110 47,106 64,112 66,111 73,95 70,88 62,85 58,64 58,63 83,64 84,74 98,85 104,84 113,92\nForest:128,68 128,45 108,44 107,42 88,39 82,44 67,40 57,49 44,42 31,49 21,39 0,44 0,55 21,63 29,58 41,68 58,64 58,63 83,64 84,62 104,60 111,68\nMagmaCore:128,153 128,133 108,134 105,131 87,133 85,131 67,136 60,131 45,133 42,130 25,131 22,136 0,136 0,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 26,
            "y": 76
          },
          {
            "id": "PropSurfaceSatellite3",
            "x": 55,
            "y": 65
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 109,
            "y": 84
          },
          {
            "id": "PropSurfaceSatellite2",
            "x": 88,
            "y": 69
          },
          {
            "id": "PropSurfaceSatellite1",
            "x": 73,
            "y": 68
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 41,
            "y": 85,
            "emitRate": 460,
            "avgEmitRate": 130,
            "idleTime": 601,
            "eruptionTime": 446,
            "dormancyCycles": 45.2,
            "activeCycles": 89.0
          },
          {
            "id": "slush_water",
            "x": 84,
            "y": 103,
            "emitRate": 5202,
            "avgEmitRate": 1596,
            "idleTime": 235,
            "eruptionTime": 302,
            "dormancyCycles": 83.0,
            "activeCycles": 99.4
          },
          {
            "id": "liquid_sulfur",
            "x": 66,
            "y": 83,
            "emitRate": 4857,
            "avgEmitRate": 912,
            "idleTime": 515,
            "eruptionTime": 300,
            "dormancyCycles": 57.8,
            "activeCycles": 60.3
          },
          {
            "id": "hot_hydrogen",
            "x": 79,
            "y": 125,
            "emitRate": 313,
            "avgEmitRate": 137,
            "idleTime": 219,
            "eruptionTime": 348,
            "dormancyCycles": 29.6,
            "activeCycles": 73.3
          },
          {
            "id": "slimy_po2",
            "x": 86,
            "y": 81,
            "emitRate": 350,
            "avgEmitRate": 133,
            "idleTime": 277,
            "eruptionTime": 276,
            "dormancyCycles": 20.9,
            "activeCycles": 66.7
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
        "biomePaths": "Ocean:39,39 23,29 15,39 0,37 0,59 11,60 19,50 29,52;51,51 41,39 46,33 64,33 64,50\nFrozenWastes:64,109 64,50 51,51 41,39 39,39 29,52 19,50 11,60 0,59 0,104 12,104 16,110 30,112 31,111 47,115 53,108\nForest:64,128 64,109 53,108 47,115 31,111 30,112 16,110 12,104 0,104 0,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "x": 24,
            "y": 40
          },
          {
            "id": "GravitasPedestal",
            "x": 53,
            "y": 111
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "x": 53,
            "y": 75,
            "emitRate": 14980,
            "avgEmitRate": 261,
            "idleTime": 705,
            "eruptionTime": 23,
            "dormancyCycles": 63.3,
            "activeCycles": 79.3
          },
          {
            "id": "molten_iron",
            "x": 9,
            "y": 88,
            "emitRate": 10416,
            "avgEmitRate": 296,
            "idleTime": 749,
            "eruptionTime": 38,
            "dormancyCycles": 52.5,
            "activeCycles": 77.6
          },
          {
            "id": "molten_iron",
            "x": 35,
            "y": 67,
            "emitRate": 11605,
            "avgEmitRate": 249,
            "idleTime": 718,
            "eruptionTime": 25,
            "dormancyCycles": 49.3,
            "activeCycles": 83.0
          },
          {
            "id": "molten_iron",
            "x": 33,
            "y": 94,
            "emitRate": 8351,
            "avgEmitRate": 339,
            "idleTime": 798,
            "eruptionTime": 57,
            "dormancyCycles": 46.2,
            "activeCycles": 73.4
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
        "biomePaths": "BoggyMarsh:64,53 64,37 44,35 40,40 23,36 19,40 0,38 0,58 20,57 21,59 30,59 39,74 47,75 50,56\nToxicJungle:39,74 30,59 21,59 20,57 0,58 0,74 16,77 17,77 31,81;64,75 64,53 50,56 47,75\nMagmaCore:64,96 64,75 47,75 39,74 31,81 17,77 16,77 0,74 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 35,
            "y": 49
          },
          {
            "id": "GravitasPedestal",
            "x": 21,
            "y": 49
          },
          {
            "id": "SapTree",
            "x": 28,
            "y": 49
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "x": 55,
            "y": 65,
            "emitRate": 9979,
            "avgEmitRate": 343,
            "idleTime": 797,
            "eruptionTime": 40,
            "dormancyCycles": 35.6,
            "activeCycles": 93.5
          },
          {
            "id": "molten_tungsten",
            "x": 12,
            "y": 91,
            "emitRate": 6038,
            "avgEmitRate": 304,
            "idleTime": 722,
            "eruptionTime": 60,
            "dormancyCycles": 52.8,
            "activeCycles": 98.8
          },
          {
            "id": "molten_tungsten",
            "x": 50,
            "y": 87,
            "emitRate": 8710,
            "avgEmitRate": 294,
            "idleTime": 815,
            "eruptionTime": 45,
            "dormancyCycles": 52.6,
            "activeCycles": 95.1
          },
          {
            "id": "hot_po2",
            "x": 37,
            "y": 89,
            "emitRate": 282,
            "avgEmitRate": 79,
            "idleTime": 232,
            "eruptionTime": 344,
            "dormancyCycles": 69.9,
            "activeCycles": 61.6
          },
          {
            "id": "chlorine_gas",
            "x": 16,
            "y": 71,
            "emitRate": 332,
            "avgEmitRate": 116,
            "idleTime": 271,
            "eruptionTime": 348,
            "dormancyCycles": 66.2,
            "activeCycles": 109.1
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
        "biomePaths": "Moo:96,55 96,37 78,37 75,41 65,42 56,30 46,34 43,47 39,49 29,45 19,51 8,41 0,41 0,64 17,61 24,68 38,62 46,68 60,60 66,64 79,60 81,57\nFrozenWastes:96,80 96,55 81,57 79,60 66,64 60,60 46,68 38,62 24,68 17,61 0,64 0,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 54,
            "y": 43
          },
          {
            "id": "GravitasPedestal",
            "x": 47,
            "y": 43
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "x": 13,
            "y": 51,
            "emitRate": 678,
            "avgEmitRate": 113,
            "idleTime": 623,
            "eruptionTime": 275,
            "dormancyCycles": 45.2,
            "activeCycles": 54.0
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
        "biomePaths": "Barren:80,135 80,35 61,38 57,34 43,38 36,31 20,37 19,37 0,39 0,138 11,139 19,133 31,142 41,138 48,143 61,139 63,136;80,174 80,155 67,154 60,161 47,156 40,161 28,154 19,157 17,156 0,160 0,174\nSwamp:80,155 80,135 63,136 61,139 48,143 41,138 31,142 19,133 11,139 0,138 0,160 17,156 19,157 28,154 40,161 47,156 60,161 67,154",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 34,
            "y": 153
          },
          {
            "id": "GravitasPedestal",
            "x": 36,
            "y": 153
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "x": 20,
            "y": 80,
            "emitRate": 5454,
            "avgEmitRate": 2184,
            "idleTime": 226,
            "eruptionTime": 512,
            "dormancyCycles": 43.6,
            "activeCycles": 59.5
          },
          {
            "id": "slush_water",
            "x": 62,
            "y": 61,
            "emitRate": 5292,
            "avgEmitRate": 1842,
            "idleTime": 327,
            "eruptionTime": 359,
            "dormancyCycles": 35.2,
            "activeCycles": 69.7
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
        "biomePaths": "MagmaCore:64,47 64,33 47,31 40,41 34,40 21,50 12,39 0,40 0,61 21,56 24,61 42,59 44,48;47,80 44,76 46,64 64,63 64,80\nOilField:64,63 64,47 44,48 42,59 24,61 21,56 0,61 0,73 14,78 23,74 30,78 44,76 46,64\nFrozenWastes:64,96 64,80 47,80 44,76 30,78 23,74 14,78 0,73 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 48,
            "y": 53
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "x": 27,
            "y": 64,
            "emitRate": 240467,
            "avgEmitRate": 953,
            "idleTime": 9106,
            "eruptionTime": 74,
            "dormancyCycles": 71.4,
            "activeCycles": 68.9
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
        "biomePaths": "Barren:19,69 14,58 0,55 0,77 12,77;70,58 65,46 48,45 45,55 36,57 31,70 34,76 42,79 51,75 52,64 69,59;112,71 112,76 101,85 89,75 92,66 104,62 107,52 122,50 129,61;156,69 141,57 130,61 135,77 142,79\nSandstone:36,57 24,47 14,58 19,69 31,70;89,75 80,80 71,75 61,81 51,75 52,64 69,59 70,58 84,56 92,66;135,77 130,61 129,61 112,71 112,76 124,85\nFrozenWastes:160,96 160,69 156,69 142,79 135,77 124,85 112,76 101,85 89,75 80,80 71,75 61,81 51,75 42,79 34,76 31,70 19,69 12,77 0,77 0,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "x": 103,
            "y": 80
          },
          {
            "id": "GravitasPedestal",
            "x": 107,
            "y": 80
          },
          {
            "id": "GeneShuffler",
            "x": 105,
            "y": 74
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "x": 72,
            "y": 83,
            "emitRate": 2212,
            "avgEmitRate": 673,
            "idleTime": 350,
            "eruptionTime": 392,
            "dormancyCycles": 51.2,
            "activeCycles": 69.5
          },
          {
            "id": "steam",
            "x": 47,
            "y": 88,
            "emitRate": 4721,
            "avgEmitRate": 1627,
            "idleTime": 131,
            "eruptionTime": 152,
            "dormancyCycles": 24.7,
            "activeCycles": 44.3
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlands",
        "q": -1,
        "r": 0
      },
      {
        "id": "MiniRadioactiveOceanStart",
        "q": -4,
        "r": 0
      },
      {
        "id": "MiniFlippedWarp",
        "q": 2,
        "r": 1
      },
      {
        "id": "MiniMetallicSwampy",
        "q": 2,
        "r": -3
      },
      {
        "id": "MiniForestFrozen",
        "q": -2,
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": 7,
        "r": -7
      },
      {
        "id": "MarshyMoonlet",
        "q": 0,
        "r": 6
      },
      {
        "id": "MooMoonlet",
        "q": 7,
        "r": -1
      },
      {
        "id": "WaterMoonlet",
        "q": -8,
        "r": 8
      },
      {
        "id": "NiobiumMoonlet",
        "q": -8,
        "r": 1
      },
      {
        "id": "RegolithMoonlet",
        "q": -7,
        "r": -4
      },
      {
        "id": "TemporalTear",
        "q": 5,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 0,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 3,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 8,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 8,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -1,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -4,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -4,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -11,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 1,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -4,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 6,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 7,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 8,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 6,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -9,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 4,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 4,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 3,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 10,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 9,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 11,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 12,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -10,
        "r": 12
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -3,
        "r": 10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 12,
        "r": -8
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": 0,
        "r": -8
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -11,
        "r": 9
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -6,
        "r": 4
      }
    ]
  },
  {
    "coordinate": "SNDST-A-2131635252-0-0-0",
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
        "biomePaths": "Sandstone:186,202 180,189 182,175 169,167 152,175 134,161 141,141 128,129 115,141 122,161 104,175 87,167 74,175 76,189 70,202 71,206 97,213 100,224 128,226 156,224 159,213 185,206\nMagmaCore:256,384 256,347 241,347 226,361 200,350 194,353 179,348 161,360 141,349 128,355 115,349 95,360 77,348 62,353 56,350 30,361 15,347 0,347 0,384\nOilField:256,347 256,307 232,308 224,322 208,326 192,311 184,312 168,292 146,297 142,318 114,318 110,297 88,292 72,312 64,311 48,326 32,322 24,308 0,307 0,347 15,347 30,361 56,350 62,353 77,348 95,360 115,349 128,355 141,349 161,360 179,348 194,353 200,350 226,361 241,347\nToxicJungle:64,270 59,259 34,255 24,274 0,274 0,307 24,308 34,290 50,290;76,189 74,175 58,168 36,179 23,154 0,154 0,187 35,183 39,194 31,214 0,212 0,241 29,243 36,226 62,227 71,206 70,202;128,247 128,226 100,224 91,241 99,258 109,260;141,141 128,129 128,123 106,103 92,115 91,137 115,141 122,161 104,175 87,167 87,140 61,138 60,108 64,103 65,96 41,68 42,66 73,57 87,73 87,75 107,97 128,82 149,97 150,103 164,115 165,137;230,121 222,108 230,89 256,90 256,121;256,212 256,187 221,183 220,179 198,168 200,141 195,138 169,140 169,167 182,175 180,189 186,202 217,194 225,214;232,274 222,290 206,290 192,311 184,312 168,292 174,275 192,270 197,259 222,255 227,243 256,241 256,274\nFrozenWastes:34,108 26,89 0,90 0,121 26,121;34,255 29,243 0,241 0,274 24,274;39,194 35,183 0,187 0,212 31,214;174,275 157,258 147,260 136,286 120,286 110,297 114,318 142,318 146,297 168,292;221,183 220,179 198,168 200,141 222,139 230,121 256,121 256,187\nBoggyMarsh:34,139 26,121 0,121 0,154 23,154;65,96 41,68 39,69 26,89 34,108 60,108 64,103;87,167 87,140 61,138 56,141 58,168 74,175;115,141 91,137 92,115 106,103 128,123 128,129;225,214 217,194 186,202 185,206 159,213 156,224 128,226 128,247 109,260 99,258 91,241 100,224 97,213 71,206 62,227 68,240 59,259 64,270 50,290 34,290 24,308 32,322 48,326 64,311 72,312 88,292 110,297 120,286 136,286 147,260 157,258 165,241 188,240 194,227 220,226;222,139 200,141 195,138 169,140 169,167 152,175 134,161 141,141 165,137 164,115 192,103 196,108 222,108 230,121\nOcean:56,141 58,168 36,179 23,154 34,139 26,121 34,108 60,108 61,138;68,240 62,227 36,226 29,243 34,255 59,259;230,89 217,69 215,68 214,66 183,57 169,73 169,75 149,97 150,103 164,115 192,103 196,108 222,108;227,243 222,255 197,259 192,270 174,275 157,258 165,241 188,240 194,227 220,226 225,214 256,212 256,241;232,308 224,322 208,326 192,311 206,290 222,290 232,274 256,274 256,307",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 127,
            "y": 187
          },
          {
            "id": "MassiveHeatSink",
            "x": 231,
            "y": 181
          },
          {
            "id": "MassiveHeatSink",
            "x": 231,
            "y": 146
          },
          {
            "id": "MassiveHeatSink",
            "x": 24,
            "y": 103
          },
          {
            "id": "GeneShuffler",
            "x": 133,
            "y": 247
          },
          {
            "id": "GeneShuffler",
            "x": 181,
            "y": 164
          },
          {
            "id": "GeneShuffler",
            "x": 229,
            "y": 109
          },
          {
            "id": "GeneShuffler",
            "x": 93,
            "y": 345
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 58,
            "y": 173,
            "emitRate": 9841,
            "avgEmitRate": 1442,
            "idleTime": 473,
            "eruptionTime": 162,
            "dormancyCycles": 37.8,
            "activeCycles": 51.0
          },
          {
            "id": "chlorine_gas",
            "x": 236,
            "y": 210,
            "emitRate": 308,
            "avgEmitRate": 115,
            "idleTime": 430,
            "eruptionTime": 468,
            "dormancyCycles": 28.6,
            "activeCycles": 73.0
          },
          {
            "id": "steam",
            "x": 139,
            "y": 276,
            "emitRate": 3742,
            "avgEmitRate": 1179,
            "idleTime": 202,
            "eruptionTime": 236,
            "dormancyCycles": 49.3,
            "activeCycles": 69.3
          },
          {
            "id": "methane",
            "x": 195,
            "y": 222,
            "emitRate": 344,
            "avgEmitRate": 87,
            "idleTime": 280,
            "eruptionTime": 290,
            "dormancyCycles": 79.2,
            "activeCycles": 79.3
          },
          {
            "id": "salt_water",
            "x": 203,
            "y": 300,
            "emitRate": 10775,
            "avgEmitRate": 3370,
            "idleTime": 366,
            "eruptionTime": 409,
            "dormancyCycles": 69.7,
            "activeCycles": 101.2
          },
          {
            "id": "OilWell",
            "x": 116,
            "y": 335,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 209,
            "y": 334,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 55,
            "y": 335,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "molten_gold",
            "x": 201,
            "y": 275,
            "emitRate": 9057,
            "avgEmitRate": 375,
            "idleTime": 754,
            "eruptionTime": 51,
            "dormancyCycles": 53.6,
            "activeCycles": 100.3
          },
          {
            "id": "oil_drip",
            "x": 30,
            "y": 192,
            "emitRate": 324,
            "avgEmitRate": 170,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.2
          },
          {
            "id": "hot_hydrogen",
            "x": 226,
            "y": 228,
            "emitRate": 899,
            "avgEmitRate": 102,
            "idleTime": 561,
            "eruptionTime": 138,
            "dormancyCycles": 44.0,
            "activeCycles": 60.0
          },
          {
            "id": "hot_steam",
            "x": 36,
            "y": 328,
            "emitRate": 2367,
            "avgEmitRate": 617,
            "idleTime": 366,
            "eruptionTime": 293,
            "dormancyCycles": 46.5,
            "activeCycles": 66.1
          },
          {
            "id": "hot_po2",
            "x": 205,
            "y": 115,
            "emitRate": 401,
            "avgEmitRate": 119,
            "idleTime": 384,
            "eruptionTime": 312,
            "dormancyCycles": 52.1,
            "activeCycles": 102.4
          },
          {
            "id": "filthy_water",
            "x": 171,
            "y": 321,
            "emitRate": 9073,
            "avgEmitRate": 2814,
            "idleTime": 259,
            "eruptionTime": 276,
            "dormancyCycles": 53.3,
            "activeCycles": 80.5
          },
          {
            "id": "liquid_co2",
            "x": 76,
            "y": 103,
            "emitRate": 491,
            "avgEmitRate": 125,
            "idleTime": 280,
            "eruptionTime": 290,
            "dormancyCycles": 79.2,
            "activeCycles": 79.3
          },
          {
            "id": "hot_co2",
            "x": 22,
            "y": 315,
            "emitRate": 334,
            "avgEmitRate": 123,
            "idleTime": 260,
            "eruptionTime": 291,
            "dormancyCycles": 27.3,
            "activeCycles": 62.8
          },
          {
            "id": "big_volcano",
            "x": 17,
            "y": 159,
            "emitRate": 289356,
            "avgEmitRate": 1051,
            "idleTime": 9295,
            "eruptionTime": 63,
            "dormancyCycles": 52.8,
            "activeCycles": 61.0
          },
          {
            "id": "hot_hydrogen",
            "x": 77,
            "y": 257,
            "emitRate": 339,
            "avgEmitRate": 126,
            "idleTime": 290,
            "eruptionTime": 318,
            "dormancyCycles": 30.2,
            "activeCycles": 74.5
          },
          {
            "id": "small_volcano",
            "x": 184,
            "y": 83,
            "emitRate": 179804,
            "avgEmitRate": 634,
            "idleTime": 10699,
            "eruptionTime": 58,
            "dormancyCycles": 35.5,
            "activeCycles": 67.0
          },
          {
            "id": "hot_co2",
            "x": 204,
            "y": 162,
            "emitRate": 306,
            "avgEmitRate": 98,
            "idleTime": 279,
            "eruptionTime": 381,
            "dormancyCycles": 59.1,
            "activeCycles": 73.4
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
        "id": "CarbonaceousAsteroid",
        "distance": 3
      },
      {
        "id": "CarbonaceousAsteroid",
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
        "id": "SaltDwarf",
        "distance": 4
      },
      {
        "id": "Earth",
        "distance": 4
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
        "id": "VolcanoPlanet",
        "distance": 7
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
        "id": "HeliumGiant",
        "distance": 9
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
        "id": "GoldAsteroid",
        "distance": 12
      },
      {
        "id": "GoldAsteroid",
        "distance": 12
      },
      {
        "id": "ForestPlanet",
        "distance": 12
      },
      {
        "id": "IceGiant",
        "distance": 13
      },
      {
        "id": "RedDwarf",
        "distance": 14
      },
      {
        "id": "GasGiant",
        "distance": 14
      },
      {
        "id": "ForestPlanet",
        "distance": 15
      },
      {
        "id": "VolcanoPlanet",
        "distance": 16
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
    "coordinate": "CER-A-487061744-0-0-0",
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
          "GeoActive",
          "Geodes",
          "GlaciersLarge"
        ],
        "biomePaths": "IceCaves:175,145 153,140 152,138 156,118 150,113 133,120 122,112 110,118 109,127 94,137 104,152 96,166 108,176 108,190 113,193 129,187 137,192 151,183 146,170 154,159 172,160\nCarrotQuarry:30,230 26,220 0,219 0,243 23,244;78,117 60,116 53,102 57,95 77,89 90,101;133,120 122,112 124,93 107,84 90,101 110,118 109,127 94,137 86,136 75,145 56,140 52,131 30,127 27,119 31,105 25,94 31,75 47,77 60,61 79,72 91,65 106,74 121,60 137,70 136,87 150,94 150,113;172,267 156,264 153,243 133,241 129,244 106,241 104,243 81,241 79,221 60,217 56,208 31,207 26,195 30,185 51,181 60,197 80,192 86,197 86,214 107,221 115,215 132,219 140,213 156,217 159,237 177,239 182,250;203,297 182,302 172,290 177,276 199,276 205,292;210,184 200,165 179,170 172,160 154,159 146,170 151,183 160,187 164,209 180,212 191,196 202,195;232,147 225,128 212,127 200,145 205,156 226,156;228,98 224,95 207,99 195,87 177,95 165,87 166,71 180,63 197,74 206,69 225,75 230,71 256,76 256,93\nRust:30,127 27,119 0,118 0,144 23,144;77,167 75,145 56,140 46,156 55,171;78,266 76,246 56,244 51,233 60,217 56,208 31,207 26,195 30,185 22,170 0,171 0,219 26,220 30,230 23,244 0,243 0,298 21,297 29,284 21,270 29,256 48,258 53,269 71,272;78,117 60,116 53,102 57,95 77,89 90,101;129,265 129,244 106,241 104,243 103,265 97,270 97,292 104,297 123,291 122,271;177,276 172,267 156,264 148,270 150,289 156,293 172,290;207,99 195,87 177,95 177,115 181,118 202,115;212,211 202,195 191,196 180,212 186,224 177,239 182,250 201,253 209,238 203,226;231,274 226,266 206,265 199,276 205,292 226,289;233,173 226,183 210,184 200,165 205,156 226,156 232,147 256,146 256,173;256,251 256,225 234,225 227,240 232,250\nFrozenWastes:56,140 52,131 30,127 23,144 0,144 0,171 22,170 30,156 46,156;122,112 110,118 90,101 107,84 124,93;164,209 160,187 151,183 137,192 129,187 113,193 108,190 108,176 96,166 104,152 94,137 86,136 75,145 77,167 80,169 80,192 86,197 86,214 107,221 115,215 132,219 140,213 156,217;256,146 256,122 231,121 228,98 224,95 207,99 202,115 181,118 177,115 177,95 165,87 150,94 150,113 156,118 152,138 153,140 175,145 172,160 179,170 200,165 205,156 200,145 212,127 225,128 232,147;234,199 227,211 212,211 202,195 210,184 226,183 233,173 256,173 256,199\nOcean:31,105 25,94 0,94 0,118 27,119;60,197 51,181 30,185 22,170 30,156 46,156 55,171 77,167 80,169 80,192;104,243 81,241 79,221 60,217 51,233 56,244 76,246 78,266 97,270 103,265;156,264 153,243 133,241 129,244 129,265 122,271 123,291 130,296 150,289 148,270;186,224 180,212 164,209 156,217 159,237 177,239;256,122 256,93 228,98 231,121;256,298 256,251 232,250 227,240 234,225 256,225 256,199 234,199 227,211 212,211 203,226 209,238 201,253 182,250 172,267 177,276 199,276 206,265 226,266 231,274 226,289 233,299\nForest:256,324 256,298 233,299 226,289 205,292 203,297 182,302 172,290 156,293 150,289 130,296 123,291 104,297 97,292 97,270 78,266 71,272 53,269 48,258 29,256 21,270 29,284 21,297 0,298 0,323 25,324 29,312 51,307 60,326 81,320 87,324 106,317 115,322 131,315 141,321 155,315 168,322 178,318 197,330 210,317 226,320 227,322\nOilField:256,345 256,324 227,322 226,320 210,317 197,330 178,318 168,322 155,315 141,321 131,315 115,322 106,317 87,324 81,320 60,326 51,307 29,312 25,324 0,323 0,352 20,349 27,330 57,332 63,348 70,351 88,341 102,348 115,342 126,347 141,341 155,347 167,343 178,348 198,341 205,345 225,342 231,347\nSugarWoods:256,76 256,45 232,47 228,43 208,46 200,40 181,47 169,38 152,48 138,38 121,50 107,41 91,50 78,41 59,54 50,47 31,52 24,45 0,48 0,94 25,94 31,75 47,77 60,61 79,72 91,65 106,74 121,60 137,70 136,87 150,94 165,87 166,71 180,63 197,74 206,69 225,75 230,71\nMagmaCore:256,384 256,345 231,347 225,342 205,345 198,341 178,348 167,343 155,347 141,341 126,347 115,342 102,348 88,341 70,351 63,348 57,332 27,330 20,349 0,352 0,384",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 133,
            "y": 153
          },
          {
            "id": "MassiveHeatSink",
            "x": 83,
            "y": 166
          },
          {
            "id": "GeneShuffler",
            "x": 199,
            "y": 230
          },
          {
            "id": "GeneShuffler",
            "x": 165,
            "y": 133
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "x": 23,
            "y": 107,
            "emitRate": 11483,
            "avgEmitRate": 2596,
            "idleTime": 360,
            "eruptionTime": 221,
            "dormancyCycles": 53.7,
            "activeCycles": 78.5
          },
          {
            "id": "OilWell",
            "x": 200,
            "y": 330,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 130,
            "y": 322,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 170,
            "y": 339,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "filthy_water",
            "x": 79,
            "y": 291,
            "emitRate": 8504,
            "avgEmitRate": 2897,
            "idleTime": 356,
            "eruptionTime": 431,
            "dormancyCycles": 41.5,
            "activeCycles": 68.4
          },
          {
            "id": "oil_drip",
            "x": 80,
            "y": 214,
            "emitRate": 328,
            "avgEmitRate": 218,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.4
          },
          {
            "id": "slush_salt_water",
            "x": 125,
            "y": 224,
            "emitRate": 4333,
            "avgEmitRate": 1471,
            "idleTime": 153,
            "eruptionTime": 181,
            "dormancyCycles": 44.5,
            "activeCycles": 74.1
          },
          {
            "id": "steam",
            "x": 50,
            "y": 226,
            "emitRate": 3336,
            "avgEmitRate": 1375,
            "idleTime": 229,
            "eruptionTime": 354,
            "dormancyCycles": 58.3,
            "activeCycles": 123.2
          },
          {
            "id": "small_volcano",
            "x": 158,
            "y": 251,
            "emitRate": 118681,
            "avgEmitRate": 571,
            "idleTime": 9633,
            "eruptionTime": 80,
            "dormancyCycles": 57.2,
            "activeCycles": 80.7
          },
          {
            "id": "filthy_water",
            "x": 212,
            "y": 334,
            "emitRate": 8980,
            "avgEmitRate": 2675,
            "idleTime": 251,
            "eruptionTime": 273,
            "dormancyCycles": 53.5,
            "activeCycles": 71.3
          },
          {
            "id": "molten_copper",
            "x": 98,
            "y": 238,
            "emitRate": 5670,
            "avgEmitRate": 298,
            "idleTime": 528,
            "eruptionTime": 56,
            "dormancyCycles": 61.3,
            "activeCycles": 74.2
          },
          {
            "id": "filthy_water",
            "x": 148,
            "y": 71,
            "emitRate": 8412,
            "avgEmitRate": 2499,
            "idleTime": 302,
            "eruptionTime": 369,
            "dormancyCycles": 83.6,
            "activeCycles": 98.4
          },
          {
            "id": "molten_gold",
            "x": 171,
            "y": 284,
            "emitRate": 8065,
            "avgEmitRate": 335,
            "idleTime": 850,
            "eruptionTime": 65,
            "dormancyCycles": 50.0,
            "activeCycles": 69.4
          },
          {
            "id": "big_volcano",
            "x": 55,
            "y": 79,
            "emitRate": 303542,
            "avgEmitRate": 1195,
            "idleTime": 7536,
            "eruptionTime": 49,
            "dormancyCycles": 47.0,
            "activeCycles": 72.2
          },
          {
            "id": "slimy_po2",
            "x": 236,
            "y": 116,
            "emitRate": 320,
            "avgEmitRate": 110,
            "idleTime": 228,
            "eruptionTime": 299,
            "dormancyCycles": 37.7,
            "activeCycles": 58.4
          },
          {
            "id": "liquid_co2",
            "x": 51,
            "y": 318,
            "emitRate": 596,
            "avgEmitRate": 163,
            "idleTime": 407,
            "eruptionTime": 293,
            "dormancyCycles": 44.5,
            "activeCycles": 83.6
          },
          {
            "id": "chlorine_gas",
            "x": 161,
            "y": 261,
            "emitRate": 262,
            "avgEmitRate": 103,
            "idleTime": 207,
            "eruptionTime": 493,
            "dormancyCycles": 44.5,
            "activeCycles": 56.6
          },
          {
            "id": "big_volcano",
            "x": 203,
            "y": 49,
            "emitRate": 262462,
            "avgEmitRate": 1329,
            "idleTime": 8471,
            "eruptionTime": 64,
            "dormancyCycles": 38.6,
            "activeCycles": 80.1
          },
          {
            "id": "chlorine_gas",
            "x": 212,
            "y": 201,
            "emitRate": 360,
            "avgEmitRate": 107,
            "idleTime": 260,
            "eruptionTime": 273,
            "dormancyCycles": 66.8,
            "activeCycles": 91.7
          },
          {
            "id": "liquid_co2",
            "x": 68,
            "y": 268,
            "emitRate": 785,
            "avgEmitRate": 130,
            "idleTime": 388,
            "eruptionTime": 181,
            "dormancyCycles": 73.6,
            "activeCycles": 79.7
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
        "id": "IcyDwarf",
        "distance": 5
      },
      {
        "id": "DustyMoon",
        "distance": 6
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
        "id": "GasGiant",
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
        "id": "MetallicAsteroid",
        "distance": 10
      },
      {
        "id": "RustPlanet",
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
        "id": "GasGiant",
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
    "coordinate": "CERS-A-1481554262-0-0-0",
    "cluster": "CERS-A",
    "dlcs": [
      "FrostyPlanet"
    ],
    "asteroids": [
      {
        "id": "CeresBaseGameShatteredAsteroid",
        "offsetX": 0,
        "offsetY": 0,
        "sizeX": 256,
        "sizeY": 384,
        "worldTraits": [
          "BouldersSmall",
          "BouldersMedium",
          "BouldersLarge"
        ],
        "biomePaths": "IceCaves:191,148 195,158 176,173 186,193 174,206 161,205 151,214 137,213 127,224 109,222 103,208 88,203 87,181 67,176 62,160 58,157 51,137 58,127 75,126 81,117 74,97 83,87 83,74 107,63 118,80 128,81 137,73 156,76 159,98 177,101 182,115 198,120 203,130\nFrozenWastes:34,168 24,156 0,159 0,180 30,183 32,181;81,117 74,97 59,95 49,109 31,108 24,129 30,137 51,137 58,127 75,126;109,222 103,208 88,203 87,181 67,176 56,191 57,199 81,208 78,228 84,235 99,235;210,104 202,89 188,87 177,101 182,115 198,120;227,140 224,135 203,130 191,148 195,158 176,173 186,193 174,206 161,205 151,214 137,213 127,224 133,243 153,243 159,237 174,236 184,224 199,224 207,212 199,194 208,183 201,161 224,151;256,221 256,195 232,194 225,212 231,221\nRust:30,183 0,180 0,208 26,208;256,165 256,140 227,140 224,151 201,161 208,183 199,194 207,212 225,212 232,194 226,184 234,166;256,247 256,221 231,221 224,243 228,247\nCarrotQuarry:49,109 31,108 26,102 31,82 52,81 59,95;56,191 32,181 34,168 24,156 30,137 51,137 58,157 62,160 67,176;76,256 58,256 49,244 56,230 78,228 84,235;133,243 127,224 109,222 99,235 108,251 126,251;188,87 181,73 164,70 156,76 159,98 177,101;224,243 210,243 199,224 207,212 225,212 231,221;256,140 256,87 235,87 226,105 210,104 198,120 203,130 224,135 227,140\nOcean:31,108 26,102 0,102 0,159 24,156 30,137 24,129;81,208 57,199 56,191 32,181 30,183 26,208 0,208 0,235 24,235 32,245 49,244 56,230 78,228;256,195 256,165 234,166 226,184 232,194\nMagmaCore:256,297 256,274 227,273 225,275 208,274 199,258 184,258 176,268 160,268 153,275 133,275 127,283 107,283 97,267 85,266 75,285 53,282 51,278 29,276 23,267 0,266 0,295 21,296 28,304 48,305 52,311 73,310 81,296 99,298 104,308 125,310 132,302 150,304 158,296 176,298 185,290 197,291 206,304 226,303 229,298\nSugarWoods:256,87 256,58 236,57 229,47 210,45 201,55 195,55 181,41 162,50 152,44 135,53 123,48 108,56 94,41 77,49 75,67 57,70 47,54 30,52 28,50 0,50 0,102 26,102 31,82 52,81 59,95 74,97 83,87 83,74 107,63 118,80 128,81 137,73 156,76 164,70 181,73 188,87 202,89 210,104 226,105 235,87\nOilField:74,384 74,363 53,355 55,338 48,330 52,311 48,305 28,304 21,296 0,295 0,384 20,384 23,354 23,353 47,359 46,384;232,325 228,330 213,333 199,320 186,323 180,321 160,328 166,352 153,360 154,384 126,384 127,362 109,353 100,359 85,354 81,332 82,329 96,327 104,308 125,310 132,302 150,304 158,296 176,298 185,290 197,291 206,304 226,303 229,298 256,297 256,323;256,384 256,355 238,354 230,362 231,384\nForest:47,359 23,353 23,354 20,384 46,384;96,327 82,329 73,310 81,296 99,298 104,308;127,362 109,353 100,359 100,384 126,384;238,354 228,330 213,333 199,320 186,323 180,321 160,328 166,352 153,360 154,384 200,384 204,356 230,362\nSandstone:74,384 74,363 53,355 55,338 48,330 52,311 73,310 82,329 81,332 85,354 100,359 100,384;200,384 204,356 230,362 231,384;238,354 228,330 232,325 256,323 256,355",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 126,
            "y": 147
          },
          {
            "id": "MassiveHeatSink",
            "x": 28,
            "y": 171
          },
          {
            "id": "MassiveHeatSink",
            "x": 44,
            "y": 134
          },
          {
            "id": "MassiveHeatSink",
            "x": 89,
            "y": 223
          },
          {
            "id": "GeneShuffler",
            "x": 236,
            "y": 203
          },
          {
            "id": "GeneShuffler",
            "x": 195,
            "y": 175
          }
        ],
        "geysers": [
          {
            "id": "slush_salt_water",
            "x": 232,
            "y": 179,
            "emitRate": 5165,
            "avgEmitRate": 1632,
            "idleTime": 280,
            "eruptionTime": 313,
            "dormancyCycles": 45.7,
            "activeCycles": 68.0
          },
          {
            "id": "OilWell",
            "x": 123,
            "y": 328,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 204,
            "y": 317,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 218,
            "y": 321,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "oil_drip",
            "x": 231,
            "y": 149,
            "emitRate": 361,
            "avgEmitRate": 220,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.3
          },
          {
            "id": "big_volcano",
            "x": 27,
            "y": 327,
            "emitRate": 238101,
            "avgEmitRate": 1046,
            "idleTime": 10033,
            "eruptionTime": 84,
            "dormancyCycles": 92.7,
            "activeCycles": 105.3
          },
          {
            "id": "methane",
            "x": 49,
            "y": 155,
            "emitRate": 381,
            "avgEmitRate": 117,
            "idleTime": 377,
            "eruptionTime": 364,
            "dormancyCycles": 43.9,
            "activeCycles": 74.2
          },
          {
            "id": "big_volcano",
            "x": 152,
            "y": 50,
            "emitRate": 239588,
            "avgEmitRate": 1213,
            "idleTime": 9817,
            "eruptionTime": 81,
            "dormancyCycles": 56.8,
            "activeCycles": 90.6
          },
          {
            "id": "methane",
            "x": 234,
            "y": 229,
            "emitRate": 599,
            "avgEmitRate": 121,
            "idleTime": 388,
            "eruptionTime": 175,
            "dormancyCycles": 30.5,
            "activeCycles": 56.4
          },
          {
            "id": "molten_copper",
            "x": 72,
            "y": 109,
            "emitRate": 8464,
            "avgEmitRate": 357,
            "idleTime": 613,
            "eruptionTime": 42,
            "dormancyCycles": 31.8,
            "activeCycles": 61.2
          },
          {
            "id": "hot_co2",
            "x": 162,
            "y": 324,
            "emitRate": 390,
            "avgEmitRate": 103,
            "idleTime": 309,
            "eruptionTime": 254,
            "dormancyCycles": 49.9,
            "activeCycles": 71.5
          },
          {
            "id": "molten_gold",
            "x": 125,
            "y": 357,
            "emitRate": 10476,
            "avgEmitRate": 376,
            "idleTime": 821,
            "eruptionTime": 48,
            "dormancyCycles": 44.0,
            "activeCycles": 81.3
          },
          {
            "id": "big_volcano",
            "x": 72,
            "y": 194,
            "emitRate": 275883,
            "avgEmitRate": 1171,
            "idleTime": 8016,
            "eruptionTime": 57,
            "dormancyCycles": 76.7,
            "activeCycles": 113.6
          },
          {
            "id": "slimy_po2",
            "x": 68,
            "y": 224,
            "emitRate": 359,
            "avgEmitRate": 97,
            "idleTime": 223,
            "eruptionTime": 227,
            "dormancyCycles": 65.5,
            "activeCycles": 75.7
          },
          {
            "id": "small_volcano",
            "x": 188,
            "y": 312,
            "emitRate": 116422,
            "avgEmitRate": 592,
            "idleTime": 9018,
            "eruptionTime": 76,
            "dormancyCycles": 50.2,
            "activeCycles": 78.5
          },
          {
            "id": "chlorine_gas",
            "x": 199,
            "y": 62,
            "emitRate": 410,
            "avgEmitRate": 108,
            "idleTime": 236,
            "eruptionTime": 193,
            "dormancyCycles": 44.5,
            "activeCycles": 63.6
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
        "id": "Satellite",
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
        "id": "CarbonaceousAsteroid",
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
        "id": "Earth",
        "distance": 4
      },
      {
        "id": "MetallicAsteroid",
        "distance": 5
      },
      {
        "id": "TerraPlanet",
        "distance": 7
      },
      {
        "id": "VolcanoPlanet",
        "distance": 7
      },
      {
        "id": "TerraPlanet",
        "distance": 8
      },
      {
        "id": "TerraPlanet",
        "distance": 10
      },
      {
        "id": "MetallicAsteroid",
        "distance": 10
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
        "id": "ChlorinePlanet",
        "distance": 12
      },
      {
        "id": "MetallicAsteroid",
        "distance": 13
      },
      {
        "id": "ForestPlanet",
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
    "coordinate": "S-FRZ-1098424328-0-0-0",
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
          "MagmaVents",
          "GeoDormant",
          "BouldersMixed"
        ],
        "biomePaths": "Sandstone:149,122 148,98 137,91 119,106 121,122 139,129;150,184 140,174 142,154 140,152 119,157 111,150 90,163 85,161 77,140 60,137 52,145 57,169 66,173 72,188 61,202 65,213 88,213 92,216 93,227 116,236 123,228 140,228 146,215 139,203;149,295 129,283 133,261 145,256 163,276\nMagmaCore:256,384 256,314 237,316 230,328 215,333 214,352 202,359 183,351 185,330 172,322 157,334 134,325 129,332 134,353 116,365 99,353 101,336 94,327 74,337 58,325 47,332 30,328 19,351 0,351 0,384\nOilField:34,299 24,288 0,288 0,351 19,351 30,328 25,318;116,365 99,353 101,336 129,332 134,353;214,352 202,359 183,351 185,330 202,323 215,333;232,219 223,205 231,189 256,188 256,218\nBoggyMarsh:61,239 56,230 32,226 31,202 37,197 36,180 57,169 52,145 29,143 27,145 0,144 0,227 30,229 29,258 0,258 0,288 24,288 32,261 46,262;111,150 109,133 90,126 77,140 85,161 90,163;129,332 101,336 94,327 95,317 80,303 82,289 103,282 114,289 113,306 133,320 134,325;137,91 135,83 114,71 99,86 101,97 119,106;194,166 174,166 165,153 173,135 198,140 201,145;199,109 180,108 169,91 171,84 197,77 206,86;207,269 197,258 182,259 170,242 150,246 140,228 123,228 116,236 116,252 133,261 145,256 163,276 172,275 187,294 197,294;223,205 202,206 195,196 201,176 223,176 231,189;256,160 256,68 232,67 224,84 234,98 225,116 233,129 224,148 230,159\nRust:30,229 0,227 0,258 29,258;33,112 32,93 24,87 0,91 0,144 27,145 29,143 29,116;116,252 116,236 93,227 80,246 83,253 103,261;140,152 139,129 121,122 109,133 111,150 119,157;171,84 162,65 151,62 135,83 137,91 148,98 169,91;196,226 176,227 167,215 175,196 195,196 202,206;224,268 207,269 197,258 205,237 224,236 233,250;234,98 224,84 206,86 199,109 205,116 225,116\nForest:54,84 51,61 31,56 26,59 0,56 0,91 24,87 32,93;60,137 55,117 33,112 29,116 29,143 52,145;93,227 92,216 88,213 65,213 61,202 37,197 31,202 32,226 56,230 61,239 80,246;121,122 119,106 101,97 87,112 90,126 109,133;173,135 169,128 149,122 139,129 140,152 142,154 165,153;195,196 175,196 166,184 174,166 194,166 201,176;224,84 206,86 197,77 198,60 208,53 226,58 232,67;230,328 215,333 202,323 205,301 225,300 237,316\nToxicJungle:72,188 66,173 57,169 36,180 37,197 61,202;94,327 74,337 58,325 47,332 30,328 25,318 34,299 24,288 32,261 46,262 61,239 80,246 83,253 69,276 82,289 80,303 95,317;101,97 99,86 82,77 64,89 54,84 32,93 33,112 55,117 67,105 87,112;170,242 150,246 140,228 146,215 139,203 150,184 140,174 142,154 165,153 174,166 166,184 175,196 167,215 176,227;205,301 197,294 187,294 170,312 172,322 185,330 202,323;256,188 256,160 230,159 224,148 233,129 225,116 205,116 199,109 180,108 169,128 173,135 198,140 201,145 194,166 201,176 223,176 231,189;237,316 225,300 234,282 224,268 233,250 256,249 256,314\nOcean:90,126 87,112 67,105 55,117 60,137 77,140;151,62 147,55 122,49 113,59 92,51 80,60 62,53 51,61 54,84 64,89 82,77 99,86 114,71 135,83;180,108 169,91 148,98 149,122 169,128;187,294 172,275 163,276 149,295 129,283 133,261 116,252 103,261 83,253 69,276 82,289 103,282 114,289 113,306 133,320 134,325 157,334 172,322 170,312;198,60 179,51 162,65 171,84 197,77;224,236 205,237 197,258 182,259 170,242 176,227 196,226 202,206 223,205 232,219;234,282 224,268 207,269 197,294 205,301 225,300\nFrozenWastes:233,250 224,236 232,219 256,218 256,249",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 105,
            "y": 194
          },
          {
            "id": "GeneShuffler",
            "x": 56,
            "y": 147
          },
          {
            "id": "GeneShuffler",
            "x": 23,
            "y": 316
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 200,
            "y": 149,
            "emitRate": 5041,
            "avgEmitRate": 1744,
            "idleTime": 256,
            "eruptionTime": 270,
            "dormancyCycles": 9.1,
            "activeCycles": 19.0
          },
          {
            "id": "methane",
            "x": 39,
            "y": 285,
            "emitRate": 252,
            "avgEmitRate": 113,
            "idleTime": 139,
            "eruptionTime": 312,
            "dormancyCycles": 46.4,
            "activeCycles": 85.8
          },
          {
            "id": "steam",
            "x": 222,
            "y": 199,
            "emitRate": 2676,
            "avgEmitRate": 1124,
            "idleTime": 101,
            "eruptionTime": 291,
            "dormancyCycles": 28.2,
            "activeCycles": 36.7
          },
          {
            "id": "methane",
            "x": 233,
            "y": 135,
            "emitRate": 342,
            "avgEmitRate": 87,
            "idleTime": 210,
            "eruptionTime": 189,
            "dormancyCycles": 32.3,
            "activeCycles": 37.3
          },
          {
            "id": "salt_water",
            "x": 219,
            "y": 270,
            "emitRate": 11325,
            "avgEmitRate": 3189,
            "idleTime": 317,
            "eruptionTime": 237,
            "dormancyCycles": 35.8,
            "activeCycles": 69.1
          },
          {
            "id": "OilWell",
            "x": 237,
            "y": 213,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 19,
            "y": 294,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 191,
            "y": 332,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "big_volcano",
            "x": 233,
            "y": 367,
            "emitRate": 195331,
            "avgEmitRate": 800,
            "idleTime": 7084,
            "eruptionTime": 50,
            "dormancyCycles": 52.4,
            "activeCycles": 73.5
          },
          {
            "id": "big_volcano",
            "x": 184,
            "y": 369,
            "emitRate": 253091,
            "avgEmitRate": 1123,
            "idleTime": 7556,
            "eruptionTime": 58,
            "dormancyCycles": 56.1,
            "activeCycles": 77.6
          },
          {
            "id": "big_volcano",
            "x": 198,
            "y": 369,
            "emitRate": 285384,
            "avgEmitRate": 1298,
            "idleTime": 8134,
            "eruptionTime": 60,
            "dormancyCycles": 49.9,
            "activeCycles": 82.9
          },
          {
            "id": "liquid_co2",
            "x": 99,
            "y": 79,
            "emitRate": 392,
            "avgEmitRate": 167,
            "idleTime": 177,
            "eruptionTime": 303,
            "dormancyCycles": 37.9,
            "activeCycles": 79.2
          },
          {
            "id": "small_volcano",
            "x": 156,
            "y": 295,
            "emitRate": 122885,
            "avgEmitRate": 522,
            "idleTime": 9035,
            "eruptionTime": 72,
            "dormancyCycles": 56.4,
            "activeCycles": 65.0
          },
          {
            "id": "big_volcano",
            "x": 25,
            "y": 95,
            "emitRate": 220907,
            "avgEmitRate": 1120,
            "idleTime": 9602,
            "eruptionTime": 86,
            "dormancyCycles": 42.9,
            "activeCycles": 56.4
          },
          {
            "id": "slimy_po2",
            "x": 95,
            "y": 266,
            "emitRate": 391,
            "avgEmitRate": 114,
            "idleTime": 243,
            "eruptionTime": 212,
            "dormancyCycles": 49.9,
            "activeCycles": 82.9
          },
          {
            "id": "small_volcano",
            "x": 193,
            "y": 177,
            "emitRate": 148819,
            "avgEmitRate": 513,
            "idleTime": 7310,
            "eruptionTime": 48,
            "dormancyCycles": 59.8,
            "activeCycles": 67.2
          },
          {
            "id": "oil_drip",
            "x": 131,
            "y": 311,
            "emitRate": 326,
            "avgEmitRate": 201,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.3
          },
          {
            "id": "big_volcano",
            "x": 141,
            "y": 301,
            "emitRate": 307662,
            "avgEmitRate": 1216,
            "idleTime": 8726,
            "eruptionTime": 56,
            "dormancyCycles": 68.0,
            "activeCycles": 110.7
          },
          {
            "id": "big_volcano",
            "x": 177,
            "y": 293,
            "emitRate": 241058,
            "avgEmitRate": 1176,
            "idleTime": 8515,
            "eruptionTime": 70,
            "dormancyCycles": 45.9,
            "activeCycles": 69.2
          },
          {
            "id": "hot_steam",
            "x": 145,
            "y": 164,
            "emitRate": 2033,
            "avgEmitRate": 619,
            "idleTime": 330,
            "eruptionTime": 375,
            "dormancyCycles": 34.1,
            "activeCycles": 45.6
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
        "id": "CarbonaceousAsteroid",
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
        "id": "OrganicDwarf",
        "distance": 5
      },
      {
        "id": "OrganicDwarf",
        "distance": 5
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
        "id": "GasGiant",
        "distance": 9
      },
      {
        "id": "IceGiant",
        "distance": 9
      },
      {
        "id": "MetallicAsteroid",
        "distance": 10
      },
      {
        "id": "MetallicAsteroid",
        "distance": 11
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
        "id": "ShinyPlanet",
        "distance": 14
      },
      {
        "id": "ForestPlanet",
        "distance": 15
      },
      {
        "id": "GoldAsteroid",
        "distance": 16
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
    "coordinate": "LUSH-A-1847667149-0-0-0",
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
          "Geodes",
          "FrozenCore",
          "MagmaVents"
        ],
        "biomePaths": "Forest:30,330 22,319 0,319 0,353 17,352;31,275 23,259 0,258 0,290 18,291;33,161 24,145 0,146 0,175 26,175;76,351 74,329 57,323 45,334 49,354 58,359;176,208 168,195 175,178 165,169 149,179 133,170 132,153 117,149 108,166 90,166 84,178 89,187 83,208 88,212 109,206 118,214 118,232 136,236 142,215 147,212 166,220;230,210 222,194 228,182 256,182 256,209\nFrozenWastes:256,384 256,353 229,355 223,349 201,353 197,350 174,359 162,350 146,359 133,352 116,361 100,352 87,357 76,351 58,359 49,354 28,362 17,352 0,353 0,384\nOilField:31,218 26,204 0,204 0,228 26,228;49,354 45,334 30,330 17,352 28,362;50,301 43,278 31,275 18,291 0,290 0,319 22,319 27,307;55,120 45,100 33,99 23,115 32,130 50,129;80,264 80,240 62,237 53,247 58,265 73,269;110,62 93,47 78,58 82,77 99,79;114,300 101,293 85,300 87,320 105,327 107,326;111,128 109,133 86,138 77,116 81,111 99,109 108,96 124,96 131,118;202,138 196,120 183,118 173,126 174,145 193,149;211,256 197,236 181,242 183,266 202,268;222,194 203,194 194,175 198,168 222,168 228,182;256,94 256,66 233,66 227,55 209,52 201,61 182,58 175,64 159,64 150,86 156,92 177,91 181,86 201,85 206,78 228,76 237,93\nToxicJungle:45,334 30,330 22,319 27,307 50,301 53,303 57,323;62,237 56,218 31,218 26,228 0,228 0,258 23,259 32,245 53,247;81,111 73,87 57,86 48,66 34,63 23,85 33,99 45,100 55,120 77,116;132,281 124,266 111,263 101,270 101,293 114,300 121,299;161,338 140,329 142,312 153,303 171,308 174,325;226,327 223,323 206,319 193,332 197,350 201,353 223,349;256,155 256,126 232,125 224,109 210,107 196,120 202,138 223,140 229,154;256,240 256,209 230,210 222,194 203,194 193,210 201,225 224,222 233,240\nBoggyMarsh:33,190 26,175 0,175 0,204 26,204;108,166 90,166 81,147 60,150 50,129 55,120 77,116 86,138 109,133 117,149;107,240 111,263 101,270 80,264 80,240 62,237 56,218 62,208 55,190 62,178 84,178 89,187 83,208 88,212 109,206 118,214 118,232;133,352 133,334 107,326 105,327 87,320 74,329 76,351 87,357 100,352 116,361;197,236 181,242 170,237 151,249 143,247 136,236 142,215 147,212 166,220 176,208 193,210 201,225;210,107 201,85 181,86 177,91 156,92 150,86 159,64 151,54 126,55 123,60 110,62 99,79 82,77 73,87 81,111 99,109 108,96 124,96 131,118 143,122 143,144 165,152 165,169 175,178 194,175 198,168 193,149 174,145 173,126 183,118 196,120;210,288 202,268 183,266 175,273 182,298 199,300;256,182 256,155 229,154 222,168 228,182\nRust:33,99 23,85 0,85 0,146 24,145 32,130 23,115;58,265 53,247 32,245 23,259 31,275 43,278;62,208 55,190 33,190 26,204 31,218 56,218;82,77 78,58 62,52 48,66 57,86 73,87;101,293 101,270 80,264 73,269 74,295 85,300;140,329 133,334 107,326 114,300 121,299 142,312;161,272 151,249 143,247 124,266 132,281 149,284;197,350 193,332 174,325 161,338 162,350 174,359;256,126 256,94 237,93 224,109 232,125;237,272 224,254 233,240 256,240 256,272;256,353 256,299 233,297 223,323 226,327 223,349 229,355\nOcean:87,320 85,300 74,295 73,269 58,265 43,278 50,301 53,303 57,323 74,329;84,178 62,178 55,190 33,190 26,175 33,161 24,145 32,130 50,129 60,150 81,147 90,166;143,247 136,236 118,232 107,240 111,263 124,266;149,179 133,170 132,153 117,149 109,133 111,128 131,118 143,122 143,144 165,152 165,169;193,210 176,208 168,195 175,178 194,175 203,194;229,154 223,140 202,138 193,149 198,168 222,168;224,109 210,107 201,85 206,78 228,76 237,93;237,272 224,254 233,240 224,222 201,225 197,236 211,256 202,268 210,288 199,300 182,298 175,273 183,266 181,242 170,237 151,249 161,272 149,284 153,303 171,308 174,325 193,332 206,319 223,323 233,297 228,290\nMagmaCore:142,312 121,299 132,281 149,284 153,303;162,350 161,338 140,329 133,334 133,352 146,359;256,299 256,272 237,272 228,290 233,297",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 130,
            "y": 195
          },
          {
            "id": "GeneShuffler",
            "x": 93,
            "y": 328
          },
          {
            "id": "GeneShuffler",
            "x": 170,
            "y": 158
          },
          {
            "id": "GeneShuffler",
            "x": 203,
            "y": 330
          },
          {
            "id": "GeneShuffler",
            "x": 98,
            "y": 272
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 227,
            "y": 215,
            "emitRate": 6717,
            "avgEmitRate": 1513,
            "idleTime": 412,
            "eruptionTime": 239,
            "dormancyCycles": 35.0,
            "activeCycles": 55.6
          },
          {
            "id": "methane",
            "x": 226,
            "y": 122,
            "emitRate": 365,
            "avgEmitRate": 94,
            "idleTime": 337,
            "eruptionTime": 311,
            "dormancyCycles": 65.9,
            "activeCycles": 77.1
          },
          {
            "id": "steam",
            "x": 156,
            "y": 124,
            "emitRate": 7880,
            "avgEmitRate": 1721,
            "idleTime": 389,
            "eruptionTime": 213,
            "dormancyCycles": 44.7,
            "activeCycles": 72.2
          },
          {
            "id": "methane",
            "x": 18,
            "y": 200,
            "emitRate": 303,
            "avgEmitRate": 70,
            "idleTime": 338,
            "eruptionTime": 344,
            "dormancyCycles": 75.1,
            "activeCycles": 64.2
          },
          {
            "id": "salt_water",
            "x": 169,
            "y": 299,
            "emitRate": 7575,
            "avgEmitRate": 2817,
            "idleTime": 345,
            "eruptionTime": 566,
            "dormancyCycles": 59.4,
            "activeCycles": 88.7
          },
          {
            "id": "OilWell",
            "x": 124,
            "y": 108,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 155,
            "y": 85,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 184,
            "y": 133,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "hot_hydrogen",
            "x": 214,
            "y": 173,
            "emitRate": 380,
            "avgEmitRate": 112,
            "idleTime": 235,
            "eruptionTime": 208,
            "dormancyCycles": 41.4,
            "activeCycles": 69.6
          },
          {
            "id": "hot_steam",
            "x": 75,
            "y": 257,
            "emitRate": 2164,
            "avgEmitRate": 503,
            "idleTime": 338,
            "eruptionTime": 344,
            "dormancyCycles": 75.1,
            "activeCycles": 64.2
          },
          {
            "id": "molten_copper",
            "x": 31,
            "y": 292,
            "emitRate": 10352,
            "avgEmitRate": 313,
            "idleTime": 746,
            "eruptionTime": 41,
            "dormancyCycles": 64.2,
            "activeCycles": 88.3
          },
          {
            "id": "slimy_po2",
            "x": 87,
            "y": 287,
            "emitRate": 271,
            "avgEmitRate": 122,
            "idleTime": 188,
            "eruptionTime": 387,
            "dormancyCycles": 51.5,
            "activeCycles": 103.6
          },
          {
            "id": "steam",
            "x": 204,
            "y": 256,
            "emitRate": 3875,
            "avgEmitRate": 1142,
            "idleTime": 405,
            "eruptionTime": 356,
            "dormancyCycles": 45.1,
            "activeCycles": 76.5
          },
          {
            "id": "hot_hydrogen",
            "x": 240,
            "y": 88,
            "emitRate": 240,
            "avgEmitRate": 115,
            "idleTime": 176,
            "eruptionTime": 507,
            "dormancyCycles": 71.1,
            "activeCycles": 130.7
          },
          {
            "id": "hot_steam",
            "x": 52,
            "y": 167,
            "emitRate": 2386,
            "avgEmitRate": 618,
            "idleTime": 300,
            "eruptionTime": 254,
            "dormancyCycles": 17.0,
            "activeCycles": 22.2
          },
          {
            "id": "filthy_water",
            "x": 168,
            "y": 367,
            "emitRate": 8644,
            "avgEmitRate": 2675,
            "idleTime": 319,
            "eruptionTime": 368,
            "dormancyCycles": 35.2,
            "activeCycles": 48.2
          },
          {
            "id": "molten_iron",
            "x": 151,
            "y": 142,
            "emitRate": 17021,
            "avgEmitRate": 311,
            "idleTime": 809,
            "eruptionTime": 27,
            "dormancyCycles": 53.8,
            "activeCycles": 69.3
          },
          {
            "id": "big_volcano",
            "x": 24,
            "y": 347,
            "emitRate": 224295,
            "avgEmitRate": 1141,
            "idleTime": 8598,
            "eruptionTime": 76,
            "dormancyCycles": 55.5,
            "activeCycles": 76.7
          },
          {
            "id": "steam",
            "x": 193,
            "y": 222,
            "emitRate": 4044,
            "avgEmitRate": 1036,
            "idleTime": 326,
            "eruptionTime": 313,
            "dormancyCycles": 55.0,
            "activeCycles": 60.4
          },
          {
            "id": "hot_water",
            "x": 195,
            "y": 130,
            "emitRate": 11395,
            "avgEmitRate": 2701,
            "idleTime": 285,
            "eruptionTime": 184,
            "dormancyCycles": 47.5,
            "activeCycles": 72.4
          },
          {
            "id": "OilWell",
            "x": 12,
            "y": 299,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 16,
            "y": 214,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 37,
            "y": 356,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 45,
            "y": 300,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 49,
            "y": 109,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 66,
            "y": 246,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 96,
            "y": 124,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 99,
            "y": 323,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 125,
            "y": 118,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 94,
            "y": 76,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 174,
            "y": 80,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 202,
            "y": 82,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 195,
            "y": 265,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 191,
            "y": 126,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 207,
            "y": 191,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 216,
            "y": 74,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 237,
            "y": 72,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
        "id": "IcyDwarf",
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
        "id": "IcyDwarf",
        "distance": 5
      },
      {
        "id": "OrganicDwarf",
        "distance": 5
      },
      {
        "id": "IcyDwarf",
        "distance": 5
      },
      {
        "id": "OrganicDwarf",
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
        "id": "VolcanoPlanet",
        "distance": 7
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
        "id": "IceGiant",
        "distance": 9
      },
      {
        "id": "MetallicAsteroid",
        "distance": 10
      },
      {
        "id": "TerraPlanet",
        "distance": 10
      },
      {
        "id": "GoldAsteroid",
        "distance": 12
      },
      {
        "id": "OrganicDwarf",
        "distance": 12
      },
      {
        "id": "GasGiant",
        "distance": 14
      },
      {
        "id": "ForestPlanet",
        "distance": 15
      },
      {
        "id": "TerraPlanet",
        "distance": 16
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
    "coordinate": "FRST-A-615805514-0-0-0",
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
          "Geodes",
          "GlaciersLarge",
          "BouldersMixed",
          "DeepOil"
        ],
        "biomePaths": "Forest:165,186 157,176 135,183 123,171 127,151 121,145 103,151 103,170 92,178 70,171 62,182 69,196 63,213 66,218 93,216 97,219 98,248 99,249 118,242 118,222 132,213 155,226 163,218 157,201;203,341 185,320 197,302 221,305 228,325\nMagmaCore:256,384 256,351 236,348 225,356 203,345 193,352 178,348 162,360 146,348 128,358 113,346 95,357 80,347 63,357 49,348 31,357 20,348 0,351 0,384\nOilField:256,351 256,323 231,327 228,325 203,341 185,320 178,322 173,332 147,340 136,329 114,343 98,327 80,339 63,328 49,338 26,327 25,327 0,322 0,351 20,348 31,357 49,348 63,357 80,347 95,357 113,346 128,358 146,348 162,360 178,348 193,352 203,345 225,356 236,348\nToxicJungle:37,297 35,294 0,291 0,322 25,327;120,301 120,283 102,273 99,249 98,248 68,251 62,244 36,246 26,228 0,227 0,263 29,260 40,280 65,272 80,287 79,297 63,309 63,328 80,339 98,327 99,313;231,327 228,325 221,305 197,302 191,287 203,269 189,247 168,253 154,243 155,226 163,218 157,201 165,186 157,176 161,155 186,153 196,170 188,186 196,202 186,221 194,236 220,233 227,219 256,218 256,253 231,253 221,268 232,289 256,289 256,323\nFrozenWastes:38,180 31,162 0,164 0,227 26,228 36,211 29,195;63,84 59,60 36,53 25,65 0,64 0,98 29,97 33,90;80,287 65,272 40,280 29,260 0,263 0,291 35,294 37,297 25,327 26,327 49,338 63,328 63,309 79,297;93,115 69,107 57,119 36,116 26,130 35,153 65,147 66,148 89,141;169,120 158,127 136,114 139,94 127,84 129,64 150,56 162,65 161,87 171,94;185,320 178,322 157,301 160,286 134,274 135,253 154,243 168,253 165,282 191,287 197,302;219,169 196,170 186,153 194,136 220,141 226,155;227,219 219,203 196,202 186,221 194,236 220,233;220,102 206,103 192,89 198,69 219,64 228,91;232,289 221,268 231,253 256,253 256,289\nRust:160,286 134,274 135,253 154,243 155,226 132,213 118,222 118,242 99,249 102,273 120,283 120,301 136,313 157,301;194,136 191,129 169,120 158,127 136,114 123,121 101,110 105,91 92,78 66,87 63,84 33,90 29,97 36,116 57,119 69,107 93,115 89,141 66,148 65,147 35,153 26,130 0,130 0,164 31,162 38,180 29,195 36,211 26,228 36,246 62,244 68,251 98,248 97,219 93,216 66,218 63,213 69,196 62,182 70,171 92,178 103,170 103,151 121,145 127,151 123,171 135,183 157,176 161,155 186,153;231,123 220,102 228,91 256,90 256,123;227,219 219,203 196,202 188,186 196,170 219,169 228,187 256,187 256,218\nOcean:36,116 29,97 0,98 0,130 26,130;136,114 123,121 101,110 105,91 127,84 139,94;173,332 147,340 136,329 114,343 98,327 99,313 120,301 136,313 157,301 178,322;191,287 165,282 168,253 189,247 203,269;228,187 219,169 226,155 220,141 194,136 191,129 169,120 171,94 161,87 162,65 184,56 198,69 192,89 206,103 220,102 231,123 256,123 256,187",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 111,
            "y": 196
          },
          {
            "id": "MassiveHeatSink",
            "x": 206,
            "y": 88
          },
          {
            "id": "MassiveHeatSink",
            "x": 29,
            "y": 177
          },
          {
            "id": "MassiveHeatSink",
            "x": 219,
            "y": 215
          },
          {
            "id": "GeneShuffler",
            "x": 79,
            "y": 298
          },
          {
            "id": "GeneShuffler",
            "x": 153,
            "y": 94
          },
          {
            "id": "GeneShuffler",
            "x": 154,
            "y": 298
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 161,
            "y": 160,
            "emitRate": 5811,
            "avgEmitRate": 1602,
            "idleTime": 262,
            "eruptionTime": 304,
            "dormancyCycles": 54.4,
            "activeCycles": 57.5
          },
          {
            "id": "methane",
            "x": 73,
            "y": 260,
            "emitRate": 447,
            "avgEmitRate": 103,
            "idleTime": 290,
            "eruptionTime": 208,
            "dormancyCycles": 45.0,
            "activeCycles": 55.4
          },
          {
            "id": "salt_water",
            "x": 234,
            "y": 178,
            "emitRate": 15591,
            "avgEmitRate": 3541,
            "idleTime": 408,
            "eruptionTime": 208,
            "dormancyCycles": 25.3,
            "activeCycles": 52.0
          },
          {
            "id": "OilWell",
            "x": 171,
            "y": 343,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 135,
            "y": 336,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 235,
            "y": 333,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "small_volcano",
            "x": 99,
            "y": 304,
            "emitRate": 125381,
            "avgEmitRate": 496,
            "idleTime": 10497,
            "eruptionTime": 82,
            "dormancyCycles": 55.9,
            "activeCycles": 58.3
          },
          {
            "id": "salt_water",
            "x": 21,
            "y": 71,
            "emitRate": 6247,
            "avgEmitRate": 2402,
            "idleTime": 132,
            "eruptionTime": 447,
            "dormancyCycles": 60.3,
            "activeCycles": 59.8
          },
          {
            "id": "methane",
            "x": 193,
            "y": 336,
            "emitRate": 248,
            "avgEmitRate": 94,
            "idleTime": 111,
            "eruptionTime": 336,
            "dormancyCycles": 64.3,
            "activeCycles": 65.8
          },
          {
            "id": "molten_iron",
            "x": 167,
            "y": 304,
            "emitRate": 11752,
            "avgEmitRate": 357,
            "idleTime": 854,
            "eruptionTime": 43,
            "dormancyCycles": 55.9,
            "activeCycles": 98.8
          },
          {
            "id": "hot_water",
            "x": 149,
            "y": 253,
            "emitRate": 10597,
            "avgEmitRate": 2795,
            "idleTime": 366,
            "eruptionTime": 269,
            "dormancyCycles": 61.0,
            "activeCycles": 100.5
          },
          {
            "id": "big_volcano",
            "x": 179,
            "y": 292,
            "emitRate": 226405,
            "avgEmitRate": 1209,
            "idleTime": 10421,
            "eruptionTime": 92,
            "dormancyCycles": 72.7,
            "activeCycles": 115.3
          },
          {
            "id": "steam",
            "x": 201,
            "y": 131,
            "emitRate": 3310,
            "avgEmitRate": 1150,
            "idleTime": 248,
            "eruptionTime": 408,
            "dormancyCycles": 32.3,
            "activeCycles": 40.8
          },
          {
            "id": "oil_drip",
            "x": 74,
            "y": 140,
            "emitRate": 356,
            "avgEmitRate": 231,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.1,
            "activeCycles": 0.2
          },
          {
            "id": "slimy_po2",
            "x": 214,
            "y": 338,
            "emitRate": 424,
            "avgEmitRate": 113,
            "idleTime": 392,
            "eruptionTime": 297,
            "dormancyCycles": 51.2,
            "activeCycles": 82.8
          },
          {
            "id": "salt_water",
            "x": 215,
            "y": 311,
            "emitRate": 7897,
            "avgEmitRate": 2717,
            "idleTime": 335,
            "eruptionTime": 516,
            "dormancyCycles": 57.2,
            "activeCycles": 75.1
          },
          {
            "id": "salt_water",
            "x": 142,
            "y": 282,
            "emitRate": 14281,
            "avgEmitRate": 2823,
            "idleTime": 202,
            "eruptionTime": 102,
            "dormancyCycles": 42.8,
            "activeCycles": 61.0
          },
          {
            "id": "salt_water",
            "x": 73,
            "y": 236,
            "emitRate": 45018,
            "avgEmitRate": 2296,
            "idleTime": 463,
            "eruptionTime": 55,
            "dormancyCycles": 58.0,
            "activeCycles": 53.6
          },
          {
            "id": "OilWell",
            "x": 61,
            "y": 354,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 56,
            "y": 345,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 103,
            "y": 349,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 106,
            "y": 342,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 221,
            "y": 346,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 230,
            "y": 350,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 247,
            "y": 348,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
        "id": "Satellite",
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
        "id": "SaltDwarf",
        "distance": 4
      },
      {
        "id": "RockyAsteroid",
        "distance": 5
      },
      {
        "id": "MetallicAsteroid",
        "distance": 5
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
        "id": "HeliumGiant",
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
        "id": "GoldAsteroid",
        "distance": 12
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
        "id": "ShinyPlanet",
        "distance": 14
      },
      {
        "id": "ShinyPlanet",
        "distance": 14
      },
      {
        "id": "OilyAsteriod",
        "distance": 15
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
    "coordinate": "VOLCA-1234889416-0-0-0",
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
          "BouldersMixed",
          "BouldersSmall",
          "GlaciersLarge",
          "MetalRich"
        ],
        "biomePaths": "Sandstone:126,140 113,120 124,106 127,106 143,121;192,186 185,168 174,167 162,155 146,162 125,147 100,159 88,151 71,159 73,174 67,186 70,194 98,195 100,197 102,214 122,222 131,204 136,202 155,209 167,192 187,193\nMagmaCore:35,181 31,172 0,173 0,198 28,198;147,322 135,308 119,308 108,285 90,284 81,265 64,261 49,283 32,281 18,304 29,319 47,321 55,345 63,348 78,344 86,321 108,321 115,344 129,350 141,344;256,233 256,203 224,207 217,183 223,173 218,162 198,156 185,168 192,186 187,193 196,213 222,211 229,232;256,384 256,344 230,344 220,319 231,305 218,284 204,286 194,307 173,308 162,290 144,290 133,274 118,274 105,250 124,232 122,222 102,214 86,231 71,229 59,253 37,249 25,270 0,268 0,384\nFrozenWastes:71,229 62,216 37,216 29,233 0,233 0,268 25,270 37,249 59,253;113,95 94,106 76,94 84,66 96,64 116,79;256,139 256,103 228,103 219,90 200,88 188,102 191,125 192,125 220,121 232,139;228,269 218,247 196,247 187,228 196,213 222,211 229,232 256,233 256,268\nToxicJungle:37,216 28,198 0,198 0,233 29,233;88,151 88,122 66,116 58,121 37,112 36,107 18,96 0,100 0,173 31,172 37,157 56,150 71,159;151,245 124,232 105,250 118,274 133,274;185,168 174,167 162,155 146,162 125,147 126,140 143,121 151,119 166,131 191,125 192,125 198,156;218,284 204,286 185,265 196,247 218,247 228,269;224,207 217,183 223,173 256,176 256,203\nOilField:147,322 135,308 119,308 108,285 90,284 81,265 64,261 49,283 32,281 18,304 29,319 47,321 55,345 63,348 78,344 86,321 108,321 115,344 129,350 141,344;204,286 185,265 176,267 151,245 133,274 144,290 162,290 173,308 194,307;230,344 220,319 231,305 218,284 228,269 256,268 256,344\nBoggyMarsh:102,214 100,197 98,195 70,194 67,186 73,174 71,159 56,150 37,157 31,172 35,181 28,198 37,216 62,216 71,229 86,231;126,140 113,120 94,117 88,122 88,151 100,159 125,147;196,247 187,228 196,213 187,193 167,192 155,209 136,202 131,204 122,222 124,232 151,245 176,267 185,265\nOcean:84,66 75,57 50,60 46,65 25,64 18,69 18,96 36,107 53,92 67,98 76,94;166,131 151,119 155,99 169,91 188,102 191,125;228,103 219,90 200,88 191,74 193,60 207,50 230,61 232,65 256,69 256,103;256,176 256,139 232,139 220,121 192,125 198,156 218,162 223,173",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 121,
            "y": 180
          },
          {
            "id": "MassiveHeatSink",
            "x": 228,
            "y": 124
          },
          {
            "id": "MassiveHeatSink",
            "x": 98,
            "y": 81
          },
          {
            "id": "MassiveHeatSink",
            "x": 199,
            "y": 124
          },
          {
            "id": "GeneShuffler",
            "x": 63,
            "y": 167
          },
          {
            "id": "GeneShuffler",
            "x": 169,
            "y": 151
          },
          {
            "id": "GeneShuffler",
            "x": 239,
            "y": 332
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 132,
            "y": 137,
            "emitRate": 9658,
            "avgEmitRate": 1801,
            "idleTime": 387,
            "eruptionTime": 155,
            "dormancyCycles": 39.9,
            "activeCycles": 75.0
          },
          {
            "id": "chlorine_gas",
            "x": 24,
            "y": 155,
            "emitRate": 203,
            "avgEmitRate": 101,
            "idleTime": 158,
            "eruptionTime": 395,
            "dormancyCycles": 37.6,
            "activeCycles": 84.7
          },
          {
            "id": "steam",
            "x": 178,
            "y": 248,
            "emitRate": 5344,
            "avgEmitRate": 1685,
            "idleTime": 241,
            "eruptionTime": 270,
            "dormancyCycles": 49.7,
            "activeCycles": 73.9
          },
          {
            "id": "methane",
            "x": 39,
            "y": 213,
            "emitRate": 274,
            "avgEmitRate": 108,
            "idleTime": 245,
            "eruptionTime": 456,
            "dormancyCycles": 43.4,
            "activeCycles": 66.1
          },
          {
            "id": "salt_water",
            "x": 168,
            "y": 119,
            "emitRate": 7401,
            "avgEmitRate": 2406,
            "idleTime": 195,
            "eruptionTime": 274,
            "dormancyCycles": 70.0,
            "activeCycles": 87.7
          },
          {
            "id": "OilWell",
            "x": 67,
            "y": 310,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 64,
            "y": 321,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 187,
            "y": 277,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "molten_copper",
            "x": 236,
            "y": 310,
            "emitRate": 7951,
            "avgEmitRate": 339,
            "idleTime": 624,
            "eruptionTime": 46,
            "dormancyCycles": 50.1,
            "activeCycles": 83.4
          },
          {
            "id": "hot_co2",
            "x": 64,
            "y": 196,
            "emitRate": 407,
            "avgEmitRate": 105,
            "idleTime": 216,
            "eruptionTime": 164,
            "dormancyCycles": 42.7,
            "activeCycles": 63.7
          },
          {
            "id": "molten_iron",
            "x": 82,
            "y": 131,
            "emitRate": 10710,
            "avgEmitRate": 393,
            "idleTime": 727,
            "eruptionTime": 40,
            "dormancyCycles": 51.8,
            "activeCycles": 125.8
          },
          {
            "id": "hot_steam",
            "x": 83,
            "y": 302,
            "emitRate": 2198,
            "avgEmitRate": 596,
            "idleTime": 317,
            "eruptionTime": 301,
            "dormancyCycles": 60.8,
            "activeCycles": 76.4
          },
          {
            "id": "hot_hydrogen",
            "x": 21,
            "y": 239,
            "emitRate": 462,
            "avgEmitRate": 111,
            "idleTime": 461,
            "eruptionTime": 290,
            "dormancyCycles": 60.2,
            "activeCycles": 99.3
          },
          {
            "id": "hot_water",
            "x": 229,
            "y": 155,
            "emitRate": 10477,
            "avgEmitRate": 2698,
            "idleTime": 347,
            "eruptionTime": 261,
            "dormancyCycles": 41.5,
            "activeCycles": 62.1
          },
          {
            "id": "oil_drip",
            "x": 154,
            "y": 222,
            "emitRate": 313,
            "avgEmitRate": 183,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.3,
            "activeCycles": 0.4
          },
          {
            "id": "filthy_water",
            "x": 177,
            "y": 210,
            "emitRate": 9543,
            "avgEmitRate": 2583,
            "idleTime": 218,
            "eruptionTime": 210,
            "dormancyCycles": 52.3,
            "activeCycles": 64.4
          },
          {
            "id": "methane",
            "x": 164,
            "y": 263,
            "emitRate": 410,
            "avgEmitRate": 109,
            "idleTime": 385,
            "eruptionTime": 319,
            "dormancyCycles": 45.7,
            "activeCycles": 64.4
          },
          {
            "id": "slush_salt_water",
            "x": 62,
            "y": 294,
            "emitRate": 5108,
            "avgEmitRate": 1370,
            "idleTime": 371,
            "eruptionTime": 321,
            "dormancyCycles": 68.1,
            "activeCycles": 93.4
          },
          {
            "id": "big_volcano",
            "x": 39,
            "y": 85,
            "emitRate": 271100,
            "avgEmitRate": 1137,
            "idleTime": 8544,
            "eruptionTime": 63,
            "dormancyCycles": 56.0,
            "activeCycles": 75.8
          },
          {
            "id": "hot_co2",
            "x": 108,
            "y": 129,
            "emitRate": 285,
            "avgEmitRate": 108,
            "idleTime": 251,
            "eruptionTime": 403,
            "dormancyCycles": 65.4,
            "activeCycles": 104.2
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
        "id": "RockyAsteroid",
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
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "Satellite",
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
        "id": "SaltDwarf",
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
        "id": "IcyDwarf",
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
        "id": "GasGiant",
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
        "id": "RockyAsteroid",
        "distance": 11
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
        "id": "ForestPlanet",
        "distance": 12
      },
      {
        "id": "IceGiant",
        "distance": 13
      },
      {
        "id": "RedDwarf",
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
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  },
  {
    "coordinate": "BAD-A-769743522-0-0-0",
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
          "SubsurfaceOcean",
          "GeoActive"
        ],
        "biomePaths": "Sandstone:41,88 28,69 0,70 0,107 28,109;214,217 204,195 200,196 179,187 179,175 188,166 179,146 171,147 157,134 134,139 126,123 117,124 105,100 84,100 80,104 75,133 69,135 49,119 34,120 26,131 29,155 56,161 55,178 69,194 55,211 63,236 65,237 84,239 100,213 88,194 99,181 110,182 120,212 117,215 113,244 90,245 81,270 97,289 97,291 66,303 67,321 47,331 38,326 42,306 65,302 67,271 62,267 34,264 39,240 28,225 40,208 34,187 27,183 0,187 0,263 29,268 26,289 0,295 0,321 25,330 12,357 31,374 52,359 66,367 84,358 97,368 118,360 124,343 145,344 148,359 163,370 189,357 185,335 193,329 193,303 167,295 151,308 143,304 140,278 140,256 149,249 166,256 172,251 195,257 210,242 208,222\nMagmaCore:256,384 256,357 234,358 228,351 214,351 210,355 191,358 189,357 163,370 148,359 130,373 118,360 97,368 84,358 66,367 52,359 31,374 12,357 0,359 0,384\nOilField:25,330 0,321 0,359 12,357;47,331 38,326 42,306 65,302 66,303 67,321;130,373 118,360 124,343 145,344 148,359;256,357 256,304 240,303 231,291 221,290 210,302 196,301 193,303 193,329 185,335 189,357 191,358 210,355 214,351 228,351 234,358\nToxicJungle:27,183 26,157 0,157 0,187;29,268 0,263 0,295 26,289;34,120 28,109 0,107 0,130 26,131;75,133 69,135 49,119 59,101 80,104;97,291 97,289 81,270 67,271 65,302 66,303;110,94 108,77 91,71 81,79 84,100 105,100;117,215 100,213 88,194 99,181 110,182 120,212;232,182 228,187 210,188 204,195 200,196 179,187 179,175 188,166 179,146 171,147 157,134 160,119 168,113 181,117 186,138 203,139 210,158 228,158 232,155 256,155 256,182;256,304 256,239 236,239 227,248 229,258 246,270 231,291 240,303\nFrozenWastes:29,155 26,131 0,130 0,157 26,157;84,100 81,79 64,76 53,89 41,88 28,109 34,120 49,119 59,101 80,104;90,245 84,239 65,237 63,236 55,211 69,194 55,178 34,187 40,208 28,225 39,240 34,264 62,267 67,271 81,270;126,123 117,124 105,100 110,94 137,100 138,108;232,155 229,130 212,129 203,109 223,96 220,84 200,77 189,86 175,85 166,94 168,113 181,117 186,138 203,139 210,158 228,158;246,270 229,258 213,273 198,270 195,257 172,251 166,256 149,249 140,256 140,278 143,304 151,308 167,295 166,277 193,276 196,301 210,302 221,290 231,291;256,128 256,98 231,101 231,128;236,239 227,248 210,242 208,222 214,217 204,195 210,188 228,187 232,182 256,182 256,239\nOcean:256,98 256,68 235,65 229,51 211,45 198,55 182,48 164,58 153,40 126,42 123,46 95,40 89,47 65,41 56,51 37,50 32,40 0,40 0,70 28,69 41,88 53,89 64,76 81,79 91,71 108,77 110,94 137,100 145,89 144,74 163,60 175,85 189,86 200,77 220,84 223,96 231,101\nRust:56,161 29,155 26,157 27,183 34,187 55,178;117,215 100,213 84,239 90,245 113,244;175,85 163,60 144,74 145,89 137,100 138,108 126,123 134,139 157,134 160,119 168,113 166,94;196,301 193,276 166,277 167,295 193,303;229,258 227,248 210,242 195,257 198,270 213,273;256,155 256,128 231,128 231,101 223,96 203,109 212,129 229,130 232,155",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 130,
            "y": 190
          },
          {
            "id": "MassiveHeatSink",
            "x": 148,
            "y": 292
          },
          {
            "id": "MassiveHeatSink",
            "x": 218,
            "y": 242
          },
          {
            "id": "MassiveHeatSink",
            "x": 186,
            "y": 109
          },
          {
            "id": "GeneShuffler",
            "x": 75,
            "y": 130
          },
          {
            "id": "GeneShuffler",
            "x": 225,
            "y": 271
          },
          {
            "id": "GeneShuffler",
            "x": 52,
            "y": 250
          },
          {
            "id": "GeneShuffler",
            "x": 49,
            "y": 331
          },
          {
            "id": "GeneShuffler",
            "x": 165,
            "y": 107
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 188,
            "y": 167,
            "emitRate": 5196,
            "avgEmitRate": 1552,
            "idleTime": 359,
            "eruptionTime": 353,
            "dormancyCycles": 37.6,
            "activeCycles": 57.0
          },
          {
            "id": "methane",
            "x": 70,
            "y": 294,
            "emitRate": 429,
            "avgEmitRate": 122,
            "idleTime": 455,
            "eruptionTime": 330,
            "dormancyCycles": 49.9,
            "activeCycles": 103.0
          },
          {
            "id": "OilWell",
            "x": 204,
            "y": 321,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 214,
            "y": 341,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 125,
            "y": 348,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "hot_co2",
            "x": 204,
            "y": 254,
            "emitRate": 286,
            "avgEmitRate": 105,
            "idleTime": 325,
            "eruptionTime": 525,
            "dormancyCycles": 77.1,
            "activeCycles": 113.2
          },
          {
            "id": "molten_gold",
            "x": 123,
            "y": 90,
            "emitRate": 7849,
            "avgEmitRate": 386,
            "idleTime": 684,
            "eruptionTime": 53,
            "dormancyCycles": 43.4,
            "activeCycles": 95.6
          },
          {
            "id": "molten_copper",
            "x": 80,
            "y": 72,
            "emitRate": 9852,
            "avgEmitRate": 339,
            "idleTime": 886,
            "eruptionTime": 52,
            "dormancyCycles": 43.9,
            "activeCycles": 71.7
          },
          {
            "id": "slush_salt_water",
            "x": 96,
            "y": 313,
            "emitRate": 6412,
            "avgEmitRate": 1219,
            "idleTime": 533,
            "eruptionTime": 315,
            "dormancyCycles": 55.6,
            "activeCycles": 58.3
          },
          {
            "id": "methane",
            "x": 183,
            "y": 290,
            "emitRate": 826,
            "avgEmitRate": 118,
            "idleTime": 376,
            "eruptionTime": 110,
            "dormancyCycles": 55.0,
            "activeCycles": 94.7
          },
          {
            "id": "hot_water",
            "x": 160,
            "y": 339,
            "emitRate": 8190,
            "avgEmitRate": 2523,
            "idleTime": 178,
            "eruptionTime": 219,
            "dormancyCycles": 53.7,
            "activeCycles": 67.9
          },
          {
            "id": "chlorine_gas",
            "x": 197,
            "y": 239,
            "emitRate": 379,
            "avgEmitRate": 95,
            "idleTime": 267,
            "eruptionTime": 253,
            "dormancyCycles": 66.8,
            "activeCycles": 71.5
          },
          {
            "id": "salt_water",
            "x": 55,
            "y": 71,
            "emitRate": 8955,
            "avgEmitRate": 3095,
            "idleTime": 381,
            "eruptionTime": 435,
            "dormancyCycles": 37.2,
            "activeCycles": 68.7
          },
          {
            "id": "big_volcano",
            "x": 232,
            "y": 309,
            "emitRate": 215732,
            "avgEmitRate": 1119,
            "idleTime": 7068,
            "eruptionTime": 65,
            "dormancyCycles": 45.0,
            "activeCycles": 59.0
          },
          {
            "id": "liquid_co2",
            "x": 222,
            "y": 119,
            "emitRate": 420,
            "avgEmitRate": 150,
            "idleTime": 304,
            "eruptionTime": 442,
            "dormancyCycles": 53.1,
            "activeCycles": 81.4
          },
          {
            "id": "slimy_po2",
            "x": 148,
            "y": 81,
            "emitRate": 338,
            "avgEmitRate": 103,
            "idleTime": 237,
            "eruptionTime": 275,
            "dormancyCycles": 75.5,
            "activeCycles": 99.9
          },
          {
            "id": "hot_steam",
            "x": 236,
            "y": 107,
            "emitRate": 1433,
            "avgEmitRate": 601,
            "idleTime": 154,
            "eruptionTime": 433,
            "dormancyCycles": 43.6,
            "activeCycles": 57.4
          },
          {
            "id": "molten_iron",
            "x": 78,
            "y": 313,
            "emitRate": 9382,
            "avgEmitRate": 385,
            "idleTime": 765,
            "eruptionTime": 48,
            "dormancyCycles": 38.8,
            "activeCycles": 85.9
          },
          {
            "id": "hot_co2",
            "x": 136,
            "y": 119,
            "emitRate": 320,
            "avgEmitRate": 111,
            "idleTime": 285,
            "eruptionTime": 352,
            "dormancyCycles": 40.6,
            "activeCycles": 69.1
          },
          {
            "id": "chlorine_gas",
            "x": 143,
            "y": 319,
            "emitRate": 314,
            "avgEmitRate": 112,
            "idleTime": 379,
            "eruptionTime": 535,
            "dormancyCycles": 33.8,
            "activeCycles": 52.9
          },
          {
            "id": "slimy_po2",
            "x": 44,
            "y": 310,
            "emitRate": 291,
            "avgEmitRate": 127,
            "idleTime": 232,
            "eruptionTime": 392,
            "dormancyCycles": 48.7,
            "activeCycles": 109.1
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
        "id": "RockyAsteroid",
        "distance": 3
      },
      {
        "id": "ForestPlanet",
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
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "SaltDwarf",
        "distance": 4
      },
      {
        "id": "MetallicAsteroid",
        "distance": 5
      },
      {
        "id": "RockyAsteroid",
        "distance": 5
      },
      {
        "id": "RustPlanet",
        "distance": 8
      },
      {
        "id": "HeliumGiant",
        "distance": 9
      },
      {
        "id": "VolcanoPlanet",
        "distance": 10
      },
      {
        "id": "TerraPlanet",
        "distance": 10
      },
      {
        "id": "MetallicAsteroid",
        "distance": 11
      },
      {
        "id": "GoldAsteroid",
        "distance": 12
      },
      {
        "id": "GasGiant",
        "distance": 14
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
    "coordinate": "HTFST-A-2145340721-0-0-0",
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
          "BouldersSmall",
          "MetalRich",
          "FrozenCore"
        ],
        "biomePaths": "Forest:154,207 160,220 157,226 132,230 129,238 105,243 96,229 70,236 64,228 68,215 58,197 64,189 86,191 95,179 91,161 99,154 120,163 120,175 133,187 154,180 161,188;162,79 147,83 128,66 145,40 150,41 167,63\nFrozenWastes:256,384 256,349 233,349 226,357 195,354 192,349 181,348 162,362 143,351 129,358 113,350 96,357 83,349 63,357 54,352 30,360 17,348 0,349 0,384\nOilField:256,349 256,313 232,314 224,325 204,325 192,309 172,313 166,322 145,328 134,319 114,326 101,316 82,326 65,317 51,326 33,320 28,312 0,310 0,349 17,348 30,360 54,352 63,357 83,349 96,357 113,350 129,358 143,351 162,362 181,348 192,349 195,354 226,357 233,349\nToxicJungle:64,189 58,165 37,163 28,186 36,199 58,197;65,317 65,297 56,291 35,295 23,278 0,278 0,310 28,312 33,320 51,326;88,123 84,99 58,95 58,96 55,129 64,135;155,264 139,262 129,238 132,230 157,226 166,248;193,203 185,187 161,188 154,207 160,220 188,216;199,295 189,278 163,281 159,291 136,297 125,287 124,277 100,262 105,243 96,229 70,236 64,228 38,231 32,247 35,255 58,263 68,256 89,267 86,289 101,301 101,316 114,326 134,319 145,328 166,322 172,313 192,309;228,249 220,232 196,233 188,250 195,263 221,262;221,103 204,104 195,126 173,127 165,120 155,120 137,141 113,124 119,106 140,102 147,83 162,79 176,93 192,92 200,70 219,67 229,90;256,157 256,122 233,123 222,140 206,139 192,165 193,169 221,177 232,157\nRust:35,255 32,247 0,244 0,278 23,278;62,67 35,59 30,63 30,93 31,94 58,96 58,95;64,228 38,231 29,216 36,199 58,197 68,215;124,277 100,262 105,243 129,238 139,262;188,250 195,263 189,278 163,281 155,264 166,248 157,226 160,220 188,216 196,233;192,92 176,93 162,79 167,63 188,57 200,70;233,123 221,103 204,104 195,126 173,127 169,154 156,160 137,148 137,141 113,124 100,129 88,123 64,135 67,155 58,165 64,189 86,191 95,179 91,161 99,154 120,163 120,175 133,187 154,180 161,188 185,187 193,203 219,201 225,189 221,177 193,169 192,165 206,139 222,140\nOcean:38,231 29,216 0,217 0,244 32,247;67,155 64,135 55,129 58,96 31,94 28,125 37,133 32,156 0,154 0,186 28,186 37,163 58,165;86,289 65,297 56,291 35,295 23,278 35,255 58,263 68,256 89,267;107,92 93,90 84,99 58,95 62,67 70,61 85,66 105,52 124,67;163,281 155,264 139,262 124,277 125,287 136,297 159,291;227,219 220,232 196,233 188,216 193,203 219,201 225,189 256,190 256,218;232,314 222,292 229,281 221,262 228,249 256,249 256,313\nBoggyMarsh:36,199 28,186 0,186 0,217 29,216;37,133 28,125 31,94 30,93 30,63 0,60 0,154 32,156;101,316 101,301 86,289 65,297 65,317 82,326;147,83 128,66 124,67 107,92 93,90 84,99 88,123 100,129 113,124 119,106 140,102;173,127 165,120 155,120 137,141 137,148 156,160 169,154;224,325 204,325 192,309 199,295 189,278 195,263 221,262 229,281 222,292 232,314;233,123 221,103 229,90 256,89 256,122;256,190 256,157 232,157 221,177 225,189;228,249 220,232 227,219 256,218 256,249",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 111,
            "y": 201
          },
          {
            "id": "GeneShuffler",
            "x": 84,
            "y": 320
          },
          {
            "id": "GeneShuffler",
            "x": 128,
            "y": 88
          },
          {
            "id": "GeneShuffler",
            "x": 222,
            "y": 188
          },
          {
            "id": "GeneShuffler",
            "x": 237,
            "y": 345
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 179,
            "y": 302,
            "emitRate": 4356,
            "avgEmitRate": 1430,
            "idleTime": 108,
            "eruptionTime": 129,
            "dormancyCycles": 61.8,
            "activeCycles": 93.4
          },
          {
            "id": "methane",
            "x": 159,
            "y": 202,
            "emitRate": 291,
            "avgEmitRate": 94,
            "idleTime": 284,
            "eruptionTime": 311,
            "dormancyCycles": 64.7,
            "activeCycles": 104.6
          },
          {
            "id": "steam",
            "x": 111,
            "y": 120,
            "emitRate": 5961,
            "avgEmitRate": 1998,
            "idleTime": 318,
            "eruptionTime": 270,
            "dormancyCycles": 27.3,
            "activeCycles": 74.1
          },
          {
            "id": "methane",
            "x": 16,
            "y": 121,
            "emitRate": 429,
            "avgEmitRate": 113,
            "idleTime": 300,
            "eruptionTime": 223,
            "dormancyCycles": 53.1,
            "activeCycles": 86.2
          },
          {
            "id": "salt_water",
            "x": 131,
            "y": 273,
            "emitRate": 10337,
            "avgEmitRate": 3333,
            "idleTime": 307,
            "eruptionTime": 271,
            "dormancyCycles": 46.4,
            "activeCycles": 102.2
          },
          {
            "id": "OilWell",
            "x": 221,
            "y": 336,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 34,
            "y": 328,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 179,
            "y": 337,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "hot_po2",
            "x": 65,
            "y": 107,
            "emitRate": 409,
            "avgEmitRate": 93,
            "idleTime": 401,
            "eruptionTime": 313,
            "dormancyCycles": 46.1,
            "activeCycles": 50.2
          },
          {
            "id": "hot_water",
            "x": 51,
            "y": 226,
            "emitRate": 9929,
            "avgEmitRate": 2199,
            "idleTime": 386,
            "eruptionTime": 315,
            "dormancyCycles": 73.2,
            "activeCycles": 71.1
          },
          {
            "id": "salt_water",
            "x": 57,
            "y": 178,
            "emitRate": 14901,
            "avgEmitRate": 2833,
            "idleTime": 431,
            "eruptionTime": 206,
            "dormancyCycles": 45.2,
            "activeCycles": 64.8
          },
          {
            "id": "methane",
            "x": 125,
            "y": 337,
            "emitRate": 385,
            "avgEmitRate": 108,
            "idleTime": 408,
            "eruptionTime": 389,
            "dormancyCycles": 65.9,
            "activeCycles": 89.8
          },
          {
            "id": "molten_iron",
            "x": 39,
            "y": 203,
            "emitRate": 21301,
            "avgEmitRate": 234,
            "idleTime": 956,
            "eruptionTime": 25,
            "dormancyCycles": 52.2,
            "activeCycles": 38.3
          },
          {
            "id": "hot_po2",
            "x": 157,
            "y": 153,
            "emitRate": 374,
            "avgEmitRate": 119,
            "idleTime": 266,
            "eruptionTime": 249,
            "dormancyCycles": 61.9,
            "activeCycles": 119.0
          },
          {
            "id": "molten_iron",
            "x": 77,
            "y": 285,
            "emitRate": 10944,
            "avgEmitRate": 300,
            "idleTime": 622,
            "eruptionTime": 33,
            "dormancyCycles": 64.8,
            "activeCycles": 75.8
          },
          {
            "id": "hot_steam",
            "x": 75,
            "y": 162,
            "emitRate": 1815,
            "avgEmitRate": 702,
            "idleTime": 248,
            "eruptionTime": 380,
            "dormancyCycles": 46.2,
            "activeCycles": 81.9
          },
          {
            "id": "small_volcano",
            "x": 67,
            "y": 343,
            "emitRate": 122665,
            "avgEmitRate": 573,
            "idleTime": 7959,
            "eruptionTime": 63,
            "dormancyCycles": 41.9,
            "activeCycles": 60.6
          },
          {
            "id": "slush_water",
            "x": 24,
            "y": 264,
            "emitRate": 3593,
            "avgEmitRate": 1427,
            "idleTime": 245,
            "eruptionTime": 425,
            "dormancyCycles": 59.5,
            "activeCycles": 99.8
          },
          {
            "id": "small_volcano",
            "x": 182,
            "y": 146,
            "emitRate": 119628,
            "avgEmitRate": 553,
            "idleTime": 9274,
            "eruptionTime": 76,
            "dormancyCycles": 63.3,
            "activeCycles": 84.5
          },
          {
            "id": "slush_salt_water",
            "x": 78,
            "y": 335,
            "emitRate": 19309,
            "avgEmitRate": 1102,
            "idleTime": 592,
            "eruptionTime": 83,
            "dormancyCycles": 57.7,
            "activeCycles": 50.0
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
        "id": "CarbonaceousAsteroid",
        "distance": 3
      },
      {
        "id": "ForestPlanet",
        "distance": 3
      },
      {
        "id": "IcyDwarf",
        "distance": 3
      },
      {
        "id": "CarbonaceousAsteroid",
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
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "RedDwarf",
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
        "id": "RustPlanet",
        "distance": 8
      },
      {
        "id": "HeliumGiant",
        "distance": 9
      },
      {
        "id": "GasGiant",
        "distance": 9
      },
      {
        "id": "TerraPlanet",
        "distance": 10
      },
      {
        "id": "TerraPlanet",
        "distance": 10
      },
      {
        "id": "MetallicAsteroid",
        "distance": 11
      },
      {
        "id": "GoldAsteroid",
        "distance": 12
      },
      {
        "id": "IcyDwarf",
        "distance": 13
      },
      {
        "id": "ShinyPlanet",
        "distance": 14
      },
      {
        "id": "ShinyPlanet",
        "distance": 14
      },
      {
        "id": "ShinyPlanet",
        "distance": 14
      },
      {
        "id": "ForestPlanet",
        "distance": 15
      },
      {
        "id": "HeliumGiant",
        "distance": 15
      },
      {
        "id": "VolcanoPlanet",
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
    "coordinate": "OASIS-A-1126779281-0-0-0",
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
          "MetalRich",
          "BouldersMedium",
          "Geodes"
        ],
        "biomePaths": "Forest:175,180 167,173 149,181 134,169 134,158 118,150 107,166 90,164 83,176 89,187 82,205 89,212 107,205 121,216 121,227 139,235 149,218 167,220 174,208 168,198\nMagmaCore:256,384 256,354 229,356 222,349 202,352 198,350 175,358 165,351 147,361 133,353 115,364 97,351 87,354 80,351 58,358 53,355 28,363 17,353 0,353 0,384\nOcean:29,329 23,319 0,318 0,353 17,353;32,272 23,257 0,257 0,288 22,288;47,131 32,132 21,114 32,97 46,98 56,118;75,325 80,351 58,358 53,355 48,333 60,322 53,303 59,294 48,273 58,259 77,261 81,265 76,291 85,298 86,317;143,327 142,312 119,303 106,324 107,328 97,351 115,364 133,353 132,337;256,156 256,96 236,96 224,113 232,127 223,142 229,156;232,239 224,219 228,210 256,209 256,238;256,354 256,269 235,269 224,251 210,253 200,266 185,265 176,274 182,297 199,299 206,319 223,321 227,328 222,349 229,356\nBoggyMarsh:34,216 29,202 34,191 27,174 32,163 23,145 0,146 0,228 28,229;53,355 48,333 29,329 17,353 28,363;59,294 48,273 32,272 22,288 0,288 0,318 23,319 31,304 53,303;107,328 106,324 86,317 75,325 80,351 87,354 97,351;108,101 104,83 84,78 75,87 80,110 95,112;171,86 169,67 150,60 137,80 141,91 152,96;227,328 223,321 206,319 199,299 182,297 176,274 161,272 148,283 132,278 116,294 119,303 142,312 152,301 172,306 175,325 164,335 143,327 132,337 133,353 147,361 165,351 175,358 198,350 202,352 222,349;256,209 256,156 229,156 222,169 228,183 222,195 228,210\nSandstone:58,259 52,243 33,240 28,229 0,228 0,257 23,257 32,272 48,273;95,112 100,132 82,144 79,143 59,150 47,131 32,132 21,114 32,97 46,98 56,118 71,118 80,110 75,87 84,78 104,83 108,101;175,180 167,173 149,181 134,169 134,158 118,150 107,166 90,164 83,176 89,187 82,205 89,212 107,205 121,216 121,227 139,235 149,218 167,220 174,208 168,198;256,96 256,65 232,64 227,55 208,51 196,62 181,59 169,67 171,86 152,96 141,91 137,80 150,60 149,56 124,46 113,57 92,49 81,59 62,53 50,65 33,63 23,84 0,83 0,146 23,145 32,163 27,174 34,191 54,191 62,206 56,217 60,232 81,237 77,261 81,265 98,267 104,289 116,294 132,278 148,283 161,272 156,252 175,240 177,241 197,234 210,253 224,251 232,239 224,219 202,222 195,209 203,195 194,178 200,169 222,169 229,156 223,142 205,139 194,151 178,147 177,123 180,121 200,124 211,112 199,88 202,82 225,79 236,96\nToxicJungle:60,322 53,303 31,304 23,319 29,329 48,333;119,303 116,294 104,289 85,298 86,317 106,324;175,325 172,306 152,301 142,312 143,327 164,335;224,113 211,112 199,88 202,82 225,79 236,96;235,269 224,251 232,239 256,238 256,269\nOilField:77,261 58,259 52,243 33,240 28,229 34,216 29,202 34,191 54,191 62,206 56,217 60,232 81,237;82,144 79,143 59,150 47,131 56,118 71,118 80,110 95,112 100,132;85,298 76,291 81,265 98,267 104,289;210,253 197,234 177,241 175,240 156,252 161,272 176,274 185,265 200,266;224,219 202,222 195,209 203,195 194,178 200,169 222,169 228,183 222,195 228,210;232,127 224,113 211,112 200,124 180,121 177,123 178,147 194,151 205,139 223,142",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "x": 129,
            "y": 196
          },
          {
            "id": "GeneShuffler",
            "x": 36,
            "y": 280
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "x": 163,
            "y": 320,
            "emitRate": 3986,
            "avgEmitRate": 1588,
            "idleTime": 233,
            "eruptionTime": 325,
            "dormancyCycles": 49.4,
            "activeCycles": 106.9
          },
          {
            "id": "methane",
            "x": 215,
            "y": 83,
            "emitRate": 276,
            "avgEmitRate": 95,
            "idleTime": 193,
            "eruptionTime": 272,
            "dormancyCycles": 53.0,
            "activeCycles": 75.6
          },
          {
            "id": "steam",
            "x": 130,
            "y": 302,
            "emitRate": 5512,
            "avgEmitRate": 1323,
            "idleTime": 531,
            "eruptionTime": 419,
            "dormancyCycles": 62.3,
            "activeCycles": 74.3
          },
          {
            "id": "methane",
            "x": 81,
            "y": 327,
            "emitRate": 356,
            "avgEmitRate": 117,
            "idleTime": 246,
            "eruptionTime": 264,
            "dormancyCycles": 57.1,
            "activeCycles": 99.7
          },
          {
            "id": "salt_water",
            "x": 188,
            "y": 267,
            "emitRate": 13312,
            "avgEmitRate": 3190,
            "idleTime": 285,
            "eruptionTime": 226,
            "dormancyCycles": 57.9,
            "activeCycles": 68.3
          },
          {
            "id": "OilWell",
            "x": 183,
            "y": 244,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 222,
            "y": 216,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 198,
            "y": 139,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "slimy_po2",
            "x": 229,
            "y": 320,
            "emitRate": 281,
            "avgEmitRate": 116,
            "idleTime": 243,
            "eruptionTime": 455,
            "dormancyCycles": 64.6,
            "activeCycles": 111.1
          },
          {
            "id": "hot_hydrogen",
            "x": 156,
            "y": 140,
            "emitRate": 321,
            "avgEmitRate": 88,
            "idleTime": 196,
            "eruptionTime": 246,
            "dormancyCycles": 74.9,
            "activeCycles": 72.5
          },
          {
            "id": "molten_copper",
            "x": 185,
            "y": 115,
            "emitRate": 9485,
            "avgEmitRate": 317,
            "idleTime": 940,
            "eruptionTime": 57,
            "dormancyCycles": 46.3,
            "activeCycles": 66.3
          },
          {
            "id": "hot_water",
            "x": 202,
            "y": 206,
            "emitRate": 8016,
            "avgEmitRate": 1978,
            "idleTime": 225,
            "eruptionTime": 289,
            "dormancyCycles": 71.2,
            "activeCycles": 55.5
          },
          {
            "id": "salt_water",
            "x": 48,
            "y": 88,
            "emitRate": 9342,
            "avgEmitRate": 3066,
            "idleTime": 330,
            "eruptionTime": 351,
            "dormancyCycles": 55.5,
            "activeCycles": 97.2
          },
          {
            "id": "molten_iron",
            "x": 232,
            "y": 114,
            "emitRate": 5796,
            "avgEmitRate": 290,
            "idleTime": 592,
            "eruptionTime": 63,
            "dormancyCycles": 61.8,
            "activeCycles": 67.6
          },
          {
            "id": "methane",
            "x": 52,
            "y": 183,
            "emitRate": 272,
            "avgEmitRate": 117,
            "idleTime": 68,
            "eruptionTime": 154,
            "dormancyCycles": 45.1,
            "activeCycles": 74.5
          },
          {
            "id": "big_volcano",
            "x": 225,
            "y": 238,
            "emitRate": 267502,
            "avgEmitRate": 1366,
            "idleTime": 9209,
            "eruptionTime": 69,
            "dormancyCycles": 40.7,
            "activeCycles": 91.3
          },
          {
            "id": "oil_drip",
            "x": 166,
            "y": 289,
            "emitRate": 336,
            "avgEmitRate": 191,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.2,
            "activeCycles": 0.2
          },
          {
            "id": "slush_salt_water",
            "x": 147,
            "y": 101,
            "emitRate": 4314,
            "avgEmitRate": 1442,
            "idleTime": 388,
            "eruptionTime": 469,
            "dormancyCycles": 39.7,
            "activeCycles": 62.2
          },
          {
            "id": "filthy_water",
            "x": 60,
            "y": 284,
            "emitRate": 6765,
            "avgEmitRate": 2898,
            "idleTime": 216,
            "eruptionTime": 471,
            "dormancyCycles": 48.6,
            "activeCycles": 81.0
          },
          {
            "id": "small_volcano",
            "x": 106,
            "y": 211,
            "emitRate": 145448,
            "avgEmitRate": 572,
            "idleTime": 9227,
            "eruptionTime": 62,
            "dormancyCycles": 74.6,
            "activeCycles": 106.2
          },
          {
            "id": "OilWell",
            "x": 37,
            "y": 229,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 35,
            "y": 212,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 58,
            "y": 254,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 63,
            "y": 134,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 92,
            "y": 281,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 83,
            "y": 118,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 175,
            "y": 258,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 190,
            "y": 261,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 193,
            "y": 130,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 218,
            "y": 210,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 205,
            "y": 194,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
          },
          {
            "id": "OilWell",
            "x": 213,
            "y": 132,
            "emitRate": 3333,
            "avgEmitRate": 3333,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0.0,
            "activeCycles": 1.0
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
        "id": "Satellite",
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
        "id": "OrganicDwarf",
        "distance": 4
      },
      {
        "id": "RockyAsteroid",
        "distance": 5
      },
      {
        "id": "TerraPlanet",
        "distance": 7
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
        "id": "TerraPlanet",
        "distance": 8
      },
      {
        "id": "IceGiant",
        "distance": 9
      },
      {
        "id": "GasGiant",
        "distance": 9
      },
      {
        "id": "RockyAsteroid",
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
        "id": "MetallicAsteroid",
        "distance": 11
      },
      {
        "id": "GoldAsteroid",
        "distance": 12
      },
      {
        "id": "IcyDwarf",
        "distance": 13
      },
      {
        "id": "RedDwarf",
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
        "id": "TerraPlanet",
        "distance": 16
      },
      {
        "id": "Wormhole",
        "distance": 17
      }
    ],
    "starMapEntriesSpacedOut": null
  }
]
""".trimIndent()
