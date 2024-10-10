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
    "coordinate": "V-SNDST-C-1242839481-0-0-0",
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
        "biomePaths": "Sandstone:135,180 141,162 136,153 119,143 101,150 92,164 101,183 122,189;162,146 157,139 146,138 136,153 141,162 153,163;160,176 153,163 141,162 135,180 148,189;146,138 135,127 119,135 119,143 136,153;119,143 119,135 106,125 92,137 101,150;149,195 148,189 135,180 122,189 123,201 129,205;92,164 101,150 92,137 84,136 76,147 86,164;96,190 101,183 92,164 86,164 76,177 83,191;123,201 122,189 101,183 96,190 106,206\nBoggyMarsh:191,132 180,115 168,116 157,139 162,146 181,149;215,143 208,132 191,132 181,149 187,161 208,163;187,161 181,149 162,146 153,163 160,176 178,179;180,115 189,102 183,86 173,82 160,88 157,105 168,116;240,115 216,114 208,132 215,143 240,143;158,223 161,208 149,195 129,205 133,229 138,231;76,147 84,136 74,118 54,121 49,131 57,148;86,164 76,147 57,148 50,160 57,175 76,177;240,277 240,251 212,250 206,255 216,277;215,304 207,290 192,289 181,304 188,320 207,321;83,191 76,177 57,175 48,190 54,203 72,206;123,298 113,279 99,277 91,283 92,304 106,311\nWasteland:208,132 216,114 210,105 189,102 180,115 191,132;168,116 157,105 137,110 135,127 146,138 157,139;240,222 240,196 213,196 208,219 212,223;182,237 192,221 179,203 161,208 158,223 174,238;49,131 54,121 45,105 30,104 19,121 25,134;74,118 79,108 67,88 58,86 45,105 54,121;133,229 129,205 123,201 106,206 99,224 120,234;30,188 22,172 0,172 0,203 19,203;99,224 106,206 96,190 83,191 72,206 77,218 97,225;146,286 137,264 123,264 113,279 123,298 130,299;116,256 120,234 99,224 97,225 89,251 99,260;55,237 42,220 30,220 19,235 30,254 41,254\nToxicJungle:218,86 206,70 183,86 189,102 210,105;135,127 137,110 128,102 105,109 106,125 119,135;179,203 184,190 178,179 160,176 148,189 149,195 161,208;128,102 129,85 113,75 99,82 99,104 105,109;106,125 105,109 99,104 79,108 74,118 84,136 92,137;174,238 158,223 138,231 146,255 163,256;240,222 212,223 212,250 240,251;208,219 213,196 207,189 184,190 179,203 192,221;240,304 215,304 207,321 213,330 240,330;89,251 97,225 77,218 62,238 76,253;99,277 99,260 89,251 76,253 66,272 69,278 91,283;22,297 30,287 20,266 0,266 0,298;44,286 54,272 41,254 30,254 20,266 30,287;76,253 62,238 55,237 41,254 54,272 66,272;27,325 32,320 22,297 0,298 0,326\nOcean:240,143 215,143 208,163 212,170 240,171;207,189 212,170 208,163 187,161 178,179 184,190;157,105 160,88 143,77 129,85 128,102 137,110;206,255 212,250 212,223 208,219 192,221 182,237 199,255;172,271 163,256 146,255 137,264 146,286 157,288;146,255 138,231 133,229 120,234 116,256 123,264 137,264;77,218 72,206 54,203 42,220 55,237 62,238;188,320 181,304 164,302 152,321 157,329 182,330;92,304 91,283 69,278 58,298 78,312;76,325 78,312 58,298 56,299 43,319 58,334;30,104 23,91 0,90 0,120 19,121;50,160 57,148 49,131 25,134 21,141 30,160\nFrozenWastes:240,84 218,86 210,105 216,114 240,115;240,171 212,170 207,189 213,196 240,196;216,277 206,255 199,255 182,273 192,289 207,290;192,289 182,273 172,271 157,288 164,302 181,304;99,104 99,82 83,74 67,88 79,108;240,277 216,277 207,290 215,304 240,304;199,255 182,237 174,238 163,256 172,271 182,273;57,175 50,160 30,160 22,172 30,188 48,190;54,203 48,190 30,188 19,203 30,220 42,220;164,302 157,288 146,286 130,299 140,319 152,321;20,266 30,254 19,235 0,235 0,266;19,235 30,220 19,203 0,203 0,235;140,319 130,299 123,298 106,311 109,325 125,333;43,319 56,299 44,286 30,287 22,297 32,320;30,160 21,141 0,142 0,172 22,172\nBarren:240,84 240,60 214,58 206,65 206,70 218,86;206,70 206,65 185,52 171,60 173,82 183,86;173,82 171,60 157,54 145,61 143,77 160,88;143,77 145,61 129,51 114,59 113,75 129,85;113,75 114,59 101,50 81,59 83,74 99,82;83,74 81,59 74,55 56,58 51,76 58,86 67,88;58,86 51,76 30,76 23,91 30,104 45,105;30,76 22,61 0,62 0,90 23,91\nOilField:240,355 240,330 213,330 207,350 211,355;152,349 157,329 152,321 140,319 125,333 128,349 130,351;207,350 213,330 207,321 188,320 182,330 187,350;184,355 187,350 182,330 157,329 152,349 157,355;109,325 106,311 92,304 78,312 76,325 92,339;56,347 58,334 43,319 32,320 27,325 29,347 50,351;128,349 125,333 109,325 92,339 92,347 103,357;92,347 92,339 76,325 58,334 56,347 76,358;29,347 27,325 0,326 0,350 24,352\nRadioactive:123,264 116,256 99,260 99,277 113,279;58,298 69,278 66,272 54,272 44,286 56,299;21,141 25,134 19,121 0,120 0,142\nMagmaCore:184,355 157,355 154,380 187,380;211,355 207,350 187,350 184,355 187,380 209,380;157,355 152,349 130,351 132,380 154,380;103,357 92,347 76,358 75,380 102,380;130,351 128,349 103,357 102,380 132,380;76,358 56,347 50,351 48,380 75,380;24,352 0,350 0,380 25,380;240,355 211,355 209,380 240,380;50,351 29,347 24,352 25,380 48,380",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 116,
            "posY": 168
          },
          {
            "id": "MassiveHeatSink",
            "posX": 97,
            "posY": 95
          },
          {
            "id": "MassiveHeatSink",
            "posX": 180,
            "posY": 269
          },
          {
            "id": "MassiveHeatSink",
            "posX": 124,
            "posY": 307
          },
          {
            "id": "WarpConduitSender",
            "posX": 201,
            "posY": 173
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 110,
            "posY": 254
          },
          {
            "id": "GravitasPedestal",
            "posX": 121,
            "posY": 290
          },
          {
            "id": "WarpReceiver",
            "posX": 210,
            "posY": 119
          },
          {
            "id": "WarpPortal",
            "posX": 209,
            "posY": 113
          },
          {
            "id": "GeneShuffler",
            "posX": 146,
            "posY": 207
          },
          {
            "id": "GeneShuffler",
            "posX": 174,
            "posY": 147
          },
          {
            "id": "GeneShuffler",
            "posX": 159,
            "posY": 187
          },
          {
            "id": "GeneShuffler",
            "posX": 51,
            "posY": 210
          },
          {
            "id": "GeneShuffler",
            "posX": 95,
            "posY": 313
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 204,
            "posY": 326,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 198,
            "posY": 339,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 79,
            "posY": 326,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 161,
            "posY": 319,
            "emitRate": 13680.83,
            "idleTime": 350.1478,
            "eruptionTime": 217.83653,
            "dormancyCycles": 60.049362,
            "activeCycles": 65.516304
          },
          {
            "id": "steam",
            "posX": 56,
            "posY": 240,
            "emitRate": 3047.0486,
            "idleTime": 190.63908,
            "eruptionTime": 523.9406,
            "dormancyCycles": 74.3539,
            "activeCycles": 102.25119
          },
          {
            "id": "steam",
            "posX": 176,
            "posY": 122,
            "emitRate": 5466.482,
            "idleTime": 350.97632,
            "eruptionTime": 291.4546,
            "dormancyCycles": 50.96612,
            "activeCycles": 92.985794
          },
          {
            "id": "methane",
            "posX": 77,
            "posY": 262,
            "emitRate": 411.3219,
            "idleTime": 336.581,
            "eruptionTime": 259.56885,
            "dormancyCycles": 47.01486,
            "activeCycles": 95.79707
          },
          {
            "id": "methane",
            "posX": 59,
            "posY": 170,
            "emitRate": 187.73042,
            "idleTime": 57.59839,
            "eruptionTime": 419.7042,
            "dormancyCycles": 54.557003,
            "activeCycles": 73.12507
          },
          {
            "id": "molten_gold",
            "posX": 95,
            "posY": 293,
            "emitRate": 11212.386,
            "idleTime": 776.9549,
            "eruptionTime": 39.34965,
            "dormancyCycles": 94.32479,
            "activeCycles": 87.76069
          },
          {
            "id": "liquid_co2",
            "posX": 173,
            "posY": 299,
            "emitRate": 488.20853,
            "idleTime": 359.4868,
            "eruptionTime": 364.97836,
            "dormancyCycles": 45.066658,
            "activeCycles": 68.84112
          },
          {
            "id": "chlorine_gas",
            "posX": 77,
            "posY": 306,
            "emitRate": 355.76965,
            "idleTime": 311.1483,
            "eruptionTime": 317.32693,
            "dormancyCycles": 59.074745,
            "activeCycles": 55.95847
          },
          {
            "id": "slush_water",
            "posX": 115,
            "posY": 343,
            "emitRate": 5418.818,
            "idleTime": 451.1273,
            "eruptionTime": 320.28732,
            "dormancyCycles": 52.124737,
            "activeCycles": 77.38165
          },
          {
            "id": "liquid_co2",
            "posX": 153,
            "posY": 235,
            "emitRate": 564.9898,
            "idleTime": 385.2966,
            "eruptionTime": 295.43045,
            "dormancyCycles": 58.53711,
            "activeCycles": 82.95974
          },
          {
            "id": "hot_po2",
            "posX": 108,
            "posY": 117,
            "emitRate": 399.9448,
            "idleTime": 240.32172,
            "eruptionTime": 190.7651,
            "dormancyCycles": 46.930527,
            "activeCycles": 64.92502
          },
          {
            "id": "liquid_sulfur",
            "posX": 206,
            "posY": 241,
            "emitRate": 8016.5225,
            "idleTime": 378.64505,
            "eruptionTime": 222.08792,
            "dormancyCycles": 55.40875,
            "activeCycles": 88.86761
          },
          {
            "id": "molten_iron",
            "posX": 179,
            "posY": 245,
            "emitRate": 9357.369,
            "idleTime": 717.6675,
            "eruptionTime": 43.416824,
            "dormancyCycles": 36.699562,
            "activeCycles": 58.998978
          },
          {
            "id": "slush_salt_water",
            "posX": 212,
            "posY": 258,
            "emitRate": 4824.5796,
            "idleTime": 265.63336,
            "eruptionTime": 247.37177,
            "dormancyCycles": 45.222416,
            "activeCycles": 74.025085
          },
          {
            "id": "liquid_co2",
            "posX": 47,
            "posY": 330,
            "emitRate": 421.12415,
            "idleTime": 289.3318,
            "eruptionTime": 401.5915,
            "dormancyCycles": 57.318737,
            "activeCycles": 93.70261
          },
          {
            "id": "big_volcano",
            "posX": 185,
            "posY": 202,
            "emitRate": 247103.88,
            "idleTime": 9563.451,
            "eruptionTime": 75.753876,
            "dormancyCycles": 48.115993,
            "activeCycles": 83.882744
          },
          {
            "id": "chlorine_gas",
            "posX": 45,
            "posY": 184,
            "emitRate": 375.3338,
            "idleTime": 504.489,
            "eruptionTime": 466.82098,
            "dormancyCycles": 48.79635,
            "activeCycles": 80.46848
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
          "MetalRich",
          "MetalCaves"
        ],
        "biomePaths": "Swamp:98,92 91,78 75,80 71,96 90,102;112,92 117,83 110,67 96,68 91,78 98,92;118,103 112,92 98,92 90,102 93,115 111,117;137,123 140,116 134,104 118,103 111,117 117,127;89,120 93,115 90,102 71,96 66,100 64,107 72,120;71,96 75,80 69,72 51,76 47,85 66,100;91,78 96,68 87,54 71,60 69,72 75,80\nRust:160,92 160,70 139,68 134,81 141,92;160,115 160,92 141,92 134,104 140,116;141,92 134,81 117,83 112,92 118,103 134,104;160,115 140,116 137,123 142,137 160,140;91,137 89,120 72,120 65,134 71,143;72,120 64,107 49,113 50,131 65,134;50,131 49,113 39,108 29,112 29,132 43,137;29,132 29,112 22,109 0,121 0,125 22,136\nForest:134,81 139,68 137,64 116,58 110,67 117,83;142,137 137,123 117,127 115,134 127,150 130,151;115,134 117,127 111,117 93,115 89,120 91,137 97,142;64,107 66,100 47,85 41,89 39,108 49,113;39,108 41,89 26,84 17,95 22,109 29,112;47,85 51,76 45,64 30,60 22,74 26,84 41,89;69,72 71,60 59,48 45,64 51,76;26,84 22,74 0,70 0,93 17,95\nBoggyMarsh:160,44 142,47 137,64 139,68 160,70;59,48 59,48 47,36 38,39 29,56 30,60 45,64;30,60 29,56 17,50 0,55 0,70 22,74;22,109 17,95 0,93 0,121\nFrozenWastes:142,47 132,37 115,49 116,58 137,64;110,67 116,58 115,49 103,40 90,47 87,54 96,68;136,159 130,151 127,150 109,162 110,176 135,176;109,162 98,152 82,163 82,176 110,176;87,54 90,47 76,31 59,48 59,48 71,60;54,159 44,152 27,160 27,176 54,176;27,160 18,152 0,155 0,176 27,176\nRadioactive:160,156 160,140 142,137 130,151 136,159;127,150 115,134 97,142 98,152 109,162;98,152 97,142 91,137 71,143 69,151 82,163;160,156 136,159 135,176 160,176;82,163 69,151 54,159 54,176 82,176;44,152 43,137 29,132 22,136 18,152 27,160;69,151 71,143 65,134 50,131 43,137 44,152 54,159;18,152 22,136 0,125 0,155",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 130,
            "posY": 60
          },
          {
            "id": "WarpConduitSender",
            "posX": 100,
            "posY": 110
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 82,
            "posY": 125
          },
          {
            "id": "WarpReceiver",
            "posX": 94,
            "posY": 95
          },
          {
            "id": "WarpPortal",
            "posX": 72,
            "posY": 95
          },
          {
            "id": "GeneShuffler",
            "posX": 102,
            "posY": 51
          },
          {
            "id": "GeneShuffler",
            "posX": 74,
            "posY": 138
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 16,
            "posY": 136,
            "emitRate": 564.9898,
            "idleTime": 385.2966,
            "eruptionTime": 295.43045,
            "dormancyCycles": 58.53711,
            "activeCycles": 82.95974
          },
          {
            "id": "liquid_co2",
            "posX": 140,
            "posY": 162,
            "emitRate": 441.6612,
            "idleTime": 246.77968,
            "eruptionTime": 341.1646,
            "dormancyCycles": 51.384388,
            "activeCycles": 83.70381
          },
          {
            "id": "slush_water",
            "posX": 108,
            "posY": 63,
            "emitRate": 4859.698,
            "idleTime": 201.56747,
            "eruptionTime": 225.17465,
            "dormancyCycles": 56.975742,
            "activeCycles": 115.7634
          },
          {
            "id": "slush_salt_water",
            "posX": 71,
            "posY": 48,
            "emitRate": 5326.3525,
            "idleTime": 386.09702,
            "eruptionTime": 277.39206,
            "dormancyCycles": 31.620863,
            "activeCycles": 75.40078
          },
          {
            "id": "methane",
            "posX": 11,
            "posY": 127,
            "emitRate": 538.37555,
            "idleTime": 527.6168,
            "eruptionTime": 254.41008,
            "dormancyCycles": 58.134663,
            "activeCycles": 72.48776
          },
          {
            "id": "liquid_sulfur",
            "posX": 52,
            "posY": 137,
            "emitRate": 4611.2017,
            "idleTime": 408.49026,
            "eruptionTime": 535.745,
            "dormancyCycles": 45.531925,
            "activeCycles": 56.58847
          },
          {
            "id": "molten_aluminum",
            "posX": 66,
            "posY": 61,
            "emitRate": 8424.001,
            "idleTime": 710.2056,
            "eruptionTime": 47.270805,
            "dormancyCycles": 41.24788,
            "activeCycles": 77.75473
          },
          {
            "id": "hot_water",
            "posX": 57,
            "posY": 114,
            "emitRate": 10770.278,
            "idleTime": 262.86932,
            "eruptionTime": 211.37303,
            "dormancyCycles": 34.325375,
            "activeCycles": 65.253876
          },
          {
            "id": "molten_cobalt",
            "posX": 28,
            "posY": 136,
            "emitRate": 8294.273,
            "idleTime": 675.34283,
            "eruptionTime": 45.285427,
            "dormancyCycles": 38.67526,
            "activeCycles": 71.60635
          },
          {
            "id": "slush_water",
            "posX": 124,
            "posY": 140,
            "emitRate": 3700.6677,
            "idleTime": 139.35973,
            "eruptionTime": 351.00458,
            "dormancyCycles": 70.22404,
            "activeCycles": 96.92252
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
        "biomePaths": "FrozenWastes:64,61 64,39 52,38 43,47 43,50 55,61;43,50 43,47 30,37 22,39 20,42 22,58 32,60;55,61 43,50 32,60 37,72 46,73;16,75 19,60 0,56 0,75;37,72 32,60 22,58 19,60 16,75 20,80 29,81;52,84 46,73 37,72 29,81 35,92 44,93;64,61 55,61 46,73 52,84 64,85;64,106 64,85 52,84 44,93 50,106;47,110 50,106 44,93 35,92 25,104 34,112;25,104 35,92 29,81 20,80 14,93 23,104;23,104 14,93 0,93 0,110 15,111;14,93 20,80 16,75 0,75 0,93;34,112 25,104 23,104 15,111 18,128 31,128;64,106 50,106 47,110 51,128 64,128;20,42 22,39 15,27 0,28 0,45;22,58 20,42 0,45 0,56 19,60;47,110 34,112 31,128 51,128;15,111 0,110 0,128 18,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 50,
            "posY": 53
          },
          {
            "id": "GravitasPedestal",
            "posX": 28,
            "posY": 112
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 43,
            "posY": 69,
            "emitRate": 10091.866,
            "idleTime": 742.9313,
            "eruptionTime": 36.564808,
            "dormancyCycles": 29.260138,
            "activeCycles": 45.19935
          },
          {
            "id": "molten_iron",
            "posX": 49,
            "posY": 97,
            "emitRate": 7971.757,
            "idleTime": 584.5998,
            "eruptionTime": 42.08902,
            "dormancyCycles": 43.97359,
            "activeCycles": 70.61619
          },
          {
            "id": "molten_iron",
            "posX": 37,
            "posY": 109,
            "emitRate": 18217.537,
            "idleTime": 471.63925,
            "eruptionTime": 12.459416,
            "dormancyCycles": 37.346737,
            "activeCycles": 67.20347
          },
          {
            "id": "molten_iron",
            "posX": 29,
            "posY": 65,
            "emitRate": 8870.197,
            "idleTime": 755.0797,
            "eruptionTime": 37.581318,
            "dormancyCycles": 82.44014,
            "activeCycles": 80.57279
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
        "biomePaths": "BoggyMarsh:29,56 35,42 30,36 19,36 15,49 20,56;45,62 50,50 44,42 35,42 29,56 35,62;15,49 19,36 15,32 0,33 0,49;64,50 64,33 50,33 44,42 50,50;64,66 64,50 50,50 45,62 49,67;20,81 22,78 15,66 0,66 0,82\nToxicJungle:30,76 35,62 29,56 20,56 15,66 22,78;47,80 49,67 45,62 35,62 30,76 41,84;64,66 49,67 47,80 64,86;15,66 20,56 15,49 0,49 0,66\nFrozenWastes:41,84 30,76 22,78 20,81 21,96 40,96;64,86 47,80 41,84 40,96 64,96;20,81 0,82 0,96 21,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 31,
            "posY": 48
          },
          {
            "id": "GravitasPedestal",
            "posX": 17,
            "posY": 48
          },
          {
            "id": "SapTree",
            "posX": 24,
            "posY": 48
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 49,
            "posY": 73,
            "emitRate": 12757.652,
            "idleTime": 828.1177,
            "eruptionTime": 33.92529,
            "dormancyCycles": 43.653587,
            "activeCycles": 73.79114
          },
          {
            "id": "molten_tungsten",
            "posX": 14,
            "posY": 90,
            "emitRate": 7483.918,
            "idleTime": 744.9572,
            "eruptionTime": 51.419323,
            "dormancyCycles": 48.55946,
            "activeCycles": 61.51989
          },
          {
            "id": "molten_tungsten",
            "posX": 26,
            "posY": 89,
            "emitRate": 6648.1543,
            "idleTime": 707.52094,
            "eruptionTime": 51.479385,
            "dormancyCycles": 38.3814,
            "activeCycles": 42.428345
          },
          {
            "id": "hot_po2",
            "posX": 24,
            "posY": 58,
            "emitRate": 506.7016,
            "idleTime": 537.6681,
            "eruptionTime": 263.26706,
            "dormancyCycles": 48.067764,
            "activeCycles": 59.04671
          },
          {
            "id": "hot_hydrogen",
            "posX": 13,
            "posY": 70,
            "emitRate": 205.9068,
            "idleTime": 87.54949,
            "eruptionTime": 362.0086,
            "dormancyCycles": 40.4275,
            "activeCycles": 73.9003
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
        "biomePaths": "MagmaCore:47,49 48,47 45,35 35,32 31,35 30,48 35,52;64,45 64,32 50,30 45,35 48,47;30,48 31,35 17,31 16,33 14,47 19,52;14,47 16,33 0,30 0,49;34,67 35,52 30,48 19,52 17,64 31,69;30,80 31,69 17,64 16,65 13,79 20,86;13,79 16,65 0,62 0,81;64,64 53,64 47,70 49,80 64,83;64,83 49,80 42,87 42,96 64,96;20,86 13,79 0,81 0,96 20,96;42,87 30,80 20,86 20,96 42,96;49,80 47,70 34,67 31,69 30,80 42,87\nOilField:53,64 47,49 35,52 34,67 47,70;17,64 19,52 14,47 0,49 0,62 16,65;64,45 48,47 47,49 53,64 64,64",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 44,
            "posY": 65
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 40,
            "posY": 54,
            "emitRate": 266252.5,
            "idleTime": 11345.966,
            "eruptionTime": 81.99843,
            "dormancyCycles": 65.9726,
            "activeCycles": 89.32516
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
        "biomePaths": "Moo:96,48 96,36 78,32 74,43 77,50;74,43 78,32 77,31 63,24 56,32 58,43;75,59 77,50 74,43 58,43 56,46 58,59 64,62;96,63 96,48 77,50 75,59 81,65;56,46 58,43 56,32 44,27 37,34 38,46;17,37 19,33 4,20 0,20 0,41;39,61 38,47 21,48 19,53 20,62 32,66;58,59 56,46 38,46 38,47 39,61 48,65;38,47 38,46 37,34 24,29 19,33 17,37 21,48;21,48 17,37 0,41 0,52 19,53;20,62 19,53 0,52 0,65 16,67\nFrozenWastes:96,63 81,65 79,80 96,80;81,65 75,59 64,62 65,80 79,80;64,62 58,59 48,65 49,80 65,80;32,66 20,62 16,67 17,80 33,80;48,65 39,61 32,66 33,80 49,80;16,67 0,65 0,80 17,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 48,
            "posY": 56
          },
          {
            "id": "GravitasPedestal",
            "posX": 41,
            "posY": 56
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 13,
            "posY": 34,
            "emitRate": 340.17883,
            "idleTime": 201.56747,
            "eruptionTime": 225.17465,
            "dormancyCycles": 56.975742,
            "activeCycles": 115.7634
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
        "biomePaths": "Barren:80,64 70,64 62,73 66,85 80,87;80,104 80,87 66,85 56,95 56,98 61,105;66,85 62,73 52,72 44,82 56,95;70,64 62,53 54,53 47,62 52,72 62,73;56,98 56,95 44,82 38,82 32,91 38,105;44,82 52,72 47,62 36,61 30,70 38,82;59,135 60,122 58,120 41,119 36,129 39,136 47,140;80,122 80,104 61,105 58,120 60,122;61,105 56,98 38,105 37,108 41,119 58,120;41,119 37,108 21,111 17,119 21,127 36,129;80,41 70,41 62,53 70,64 80,64;62,53 70,41 61,32 49,36 47,42 54,53;54,53 47,42 33,45 31,50 36,61 47,62;21,111 15,99 0,100 0,119 17,119;37,108 38,105 32,91 20,91 15,99 21,111;15,137 21,127 17,119 0,119 0,138;80,138 80,122 60,122 59,135 65,141;32,91 38,82 30,70 21,71 15,80 20,91;30,70 36,61 31,50 18,52 14,60 21,71;31,50 33,45 28,33 18,32 11,40 18,52;58,159 48,154 38,159 37,174 58,174;38,159 26,150 23,150 18,157 19,174 37,174;80,160 63,156 58,159 58,174 80,174;21,71 14,60 0,61 0,80 15,80;18,157 0,156 0,174 19,174;15,99 20,91 15,80 0,80 0,100;14,60 18,52 11,40 0,40 0,61\nSwamp:48,154 47,140 39,136 26,150 38,159;80,138 65,141 63,156 80,160;26,150 39,136 36,129 21,127 15,137 23,150;23,150 15,137 0,138 0,156 18,157;63,156 65,141 59,135 47,140 48,154 58,159",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 33,
            "posY": 151
          },
          {
            "id": "GravitasPedestal",
            "posX": 35,
            "posY": 151
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "posX": 63,
            "posY": 108,
            "emitRate": 8993.822,
            "idleTime": 240.5752,
            "eruptionTime": 307.6964,
            "dormancyCycles": 41.015774,
            "activeCycles": 70.28365
          },
          {
            "id": "filthy_water",
            "posX": 65,
            "posY": 78,
            "emitRate": 13779.674,
            "idleTime": 459.15244,
            "eruptionTime": 238.57877,
            "dormancyCycles": 42.66791,
            "activeCycles": 51.565754
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
        "biomePaths": "Sandstone:58,62 58,52 46,45 38,52 39,62 50,68;50,77 50,68 39,62 31,69 31,78 40,84\nBarren:25,47 22,40 0,46 0,54 17,60;96,75 96,66 79,60 71,69 72,75 79,81;79,60 78,53 66,47 58,52 58,62 71,69;39,62 38,52 25,47 17,60 18,63 31,69;10,76 18,63 17,60 0,54 0,77;31,78 31,69 18,63 10,76 19,85;72,75 71,69 58,62 50,68 50,77 60,83\nFrozenWastes:60,83 50,77 40,84 40,96 60,96;96,75 79,81 79,96 96,96;79,81 72,75 60,83 60,96 79,96;40,84 31,78 19,85 18,96 40,96;19,85 10,76 0,77 0,96 18,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 22,
            "posY": 81
          },
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 81
          },
          {
            "id": "GeneShuffler",
            "posX": 24,
            "posY": 75
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 71,
            "posY": 82,
            "emitRate": 3290.301,
            "idleTime": 224.3109,
            "eruptionTime": 423.34238,
            "dormancyCycles": 38.16152,
            "activeCycles": 81.47486
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
        "q": -3,
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": 0,
        "r": 5
      },
      {
        "id": "MarshyMoonlet",
        "q": 6,
        "r": -4
      },
      {
        "id": "NiobiumMoonlet",
        "q": 1,
        "r": -6
      },
      {
        "id": "MooMoonlet",
        "q": -6,
        "r": 1
      },
      {
        "id": "WaterMoonlet",
        "q": 5,
        "r": 2
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -8,
        "r": 7
      },
      {
        "id": "TemporalTear",
        "q": 8,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 0,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 7,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -4,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -10,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -11,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -10,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 7,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -4,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -6,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 4,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 3,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 5,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 5,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -11,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -11,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -3,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 3,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 4,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 5,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 4,
        "r": -10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": 3,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -1,
        "r": -10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 11,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 0,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": 3,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -5,
        "r": 7
      }
    ]
  },
  {
    "coordinate": "M-RAD-C-2126291643-0-0-0",
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
          "CrashedSatellites",
          "BouldersSmall"
        ],
        "biomePaths": "Forest:70,107 86,99 91,91 92,75 85,65 66,58 56,61 47,70 44,83 46,94 61,107;109,89 104,75 92,75 91,91 104,93;92,109 86,99 70,107 81,120;104,93 91,91 86,99 92,109 104,110;47,70 33,66 24,77 44,83;61,107 46,94 38,104 42,112 56,113\nOcean:104,75 110,66 104,51 93,51 85,65 92,75;93,51 83,39 71,42 66,58 85,65;128,66 110,66 104,75 109,89 128,90;56,61 41,42 29,50 33,66 47,70;128,45 109,45 104,51 110,66 128,66;128,112 128,90 109,89 104,93 104,110 105,112;24,77 33,66 29,50 22,49 7,60 23,77;46,94 44,83 24,77 23,77 18,85 24,102 38,104;17,111 24,102 18,85 0,86 0,111;18,85 23,77 7,60 0,60 0,86\nRadioactive:105,130 105,112 104,110 92,109 81,120 81,127 87,132;128,131 128,112 105,112 105,130 107,132;59,130 56,113 42,112 33,128 43,136;81,127 81,120 70,107 61,107 56,113 59,130 65,134;33,128 42,112 38,104 24,102 17,111 25,128;21,132 25,128 17,111 0,111 0,132\nMagmaCore:87,132 81,127 65,134 66,153 86,153;107,132 105,130 87,132 86,153 107,153;128,131 107,132 107,153 128,153;65,134 59,130 43,136 42,153 66,153;21,132 0,132 0,153 23,153;43,136 33,128 25,128 21,132 23,153 42,153",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 68,
            "posY": 81
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 23,
            "posY": 72
          },
          {
            "id": "WarpConduitSender",
            "posX": 50,
            "posY": 110
          },
          {
            "id": "GravitasPedestal",
            "posX": 64,
            "posY": 114
          },
          {
            "id": "WarpReceiver",
            "posX": 92,
            "posY": 108
          },
          {
            "id": "WarpPortal",
            "posX": 92,
            "posY": 103
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 83,
            "posY": 46
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 38,
            "posY": 50
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 18,
            "posY": 58
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 45,
            "posY": 124,
            "emitRate": 417.2237,
            "idleTime": 237.8023,
            "eruptionTime": 208.40338,
            "dormancyCycles": 48.513897,
            "activeCycles": 62.32687
          },
          {
            "id": "salt_water",
            "posX": 96,
            "posY": 61,
            "emitRate": 15760.786,
            "idleTime": 431.51074,
            "eruptionTime": 205.28668,
            "dormancyCycles": 49.539013,
            "activeCycles": 84.35817
          },
          {
            "id": "slush_water",
            "posX": 110,
            "posY": 80,
            "emitRate": 5664.493,
            "idleTime": 208.93759,
            "eruptionTime": 224.6838,
            "dormancyCycles": 52.48123,
            "activeCycles": 76.77468
          },
          {
            "id": "slush_salt_water",
            "posX": 93,
            "posY": 117,
            "emitRate": 4407.351,
            "idleTime": 207.06555,
            "eruptionTime": 312.6371,
            "dormancyCycles": 34.828007,
            "activeCycles": 37.28091
          },
          {
            "id": "hot_steam",
            "posX": 26,
            "posY": 92,
            "emitRate": 2748.8474,
            "idleTime": 455.8819,
            "eruptionTime": 439.30322,
            "dormancyCycles": 38.978085,
            "activeCycles": 44.245647
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
          "FrozenCore"
        ],
        "biomePaths": "ToxicJungle:89,47 83,39 67,39 64,58 83,62;64,58 67,39 64,36 46,37 42,43 46,57 63,59;109,55 104,47 89,47 83,62 86,68 104,69;128,55 109,55 104,69 108,75 128,76;46,57 42,43 25,43 20,55 24,64 39,65;25,43 20,35 0,35 0,54 20,55;63,59 46,57 39,65 45,81 62,81\nSandstone:81,80 86,68 83,62 64,58 63,59 62,81 63,82;108,75 104,69 86,68 81,80 89,93 103,93;19,95 23,88 18,75 0,74 0,95;44,106 39,88 23,88 19,95 25,112;104,114 106,97 103,93 89,93 80,105 81,109 99,118;128,130 128,121 104,114 99,118 98,129 105,137;89,93 81,80 63,82 64,97 80,105;42,130 51,114 49,108 44,106 25,112 24,115 29,131;98,129 99,118 81,109 70,124 71,130 81,138;128,96 106,97 104,114 128,121;24,64 20,55 0,54 0,74 18,75\nOilField:128,96 128,76 108,75 103,93 106,97;45,81 39,65 24,64 18,75 23,88 39,88;64,97 63,82 62,81 45,81 39,88 44,106 49,108;81,109 80,105 64,97 49,108 51,114 70,124;29,131 24,115 0,118 0,135 25,136;24,115 25,112 19,95 0,95 0,118;71,130 70,124 51,114 42,130 53,144\nFrozenWastes:128,130 105,137 105,153 128,153;105,137 98,129 81,138 81,153 105,153;53,144 42,130 29,131 25,136 26,153 53,153;25,136 0,135 0,153 26,153;81,138 71,130 53,144 53,153 81,153",
        "pointsOfInterest": [],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 59,
            "posY": 86,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 37,
            "posY": 71,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 45,
            "posY": 100,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 47,
            "posY": 125,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 13,
            "posY": 98,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 58,
            "posY": 61,
            "emitRate": 5028.0435,
            "idleTime": 244.51,
            "eruptionTime": 282.6119,
            "dormancyCycles": 49.28388,
            "activeCycles": 95.97381
          },
          {
            "id": "methane",
            "posX": 108,
            "posY": 69,
            "emitRate": 233.51228,
            "idleTime": 133.305,
            "eruptionTime": 514.5652,
            "dormancyCycles": 49.54719,
            "activeCycles": 92.54442
          },
          {
            "id": "liquid_co2",
            "posX": 16,
            "posY": 122,
            "emitRate": 592.99524,
            "idleTime": 179.66344,
            "eruptionTime": 208.67491,
            "dormancyCycles": 61.505825,
            "activeCycles": 85.2333
          },
          {
            "id": "filthy_water",
            "posX": 96,
            "posY": 111,
            "emitRate": 11845.834,
            "idleTime": 411.55023,
            "eruptionTime": 304.76422,
            "dormancyCycles": 42.03629,
            "activeCycles": 61.154037
          },
          {
            "id": "hot_po2",
            "posX": 15,
            "posY": 83,
            "emitRate": 469.85178,
            "idleTime": 292.79572,
            "eruptionTime": 201.5226,
            "dormancyCycles": 64.07691,
            "activeCycles": 96.96801
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
        "biomePaths": "Sandstone:67,130 68,118 51,108 50,109 45,115 46,130 60,135;75,112 75,100 63,96 51,108 68,118;82,135 67,130 60,135 61,153 82,153;88,131 87,118 75,112 68,118 67,130 82,135;128,136 107,133 105,135 104,153 128,153;39,136 21,130 20,131 18,153 39,153;60,135 46,130 39,136 39,153 61,153;105,135 88,131 82,135 82,153 104,153;20,131 0,129 0,153 18,153\nMagmaCore:101,53 102,35 84,27 71,44 77,54 94,57;95,78 94,57 77,54 67,75 84,86;128,55 128,35 107,31 102,35 101,53 111,59;67,75 77,54 71,44 65,43 46,58 46,61 61,77;65,43 59,31 41,29 32,43 46,58;46,61 46,58 32,43 27,44 15,65 22,74 33,76;27,44 18,36 0,37 0,64 15,65\nWasteland:110,79 111,59 101,53 94,57 95,78 106,81;107,96 106,81 95,78 84,86 83,93 100,104;83,93 84,86 67,75 61,77 59,82 63,96 75,100;128,55 111,59 110,79 128,81;59,82 61,77 46,61 33,76 40,87;51,108 63,96 59,82 40,87 38,94 50,109;128,81 110,79 106,81 107,96 128,100;38,94 40,87 33,76 22,74 15,88 24,100;15,88 22,74 15,65 0,64 0,89\nFrozenWastes:128,112 128,100 107,96 100,104 100,108 109,116;21,110 24,100 15,88 0,89 0,111;46,130 45,115 24,114 21,130 39,136;50,109 38,94 24,100 21,110 24,114 45,115;107,133 109,116 100,108 87,118 88,131 105,135;21,130 24,114 21,110 0,111 0,129 20,131;100,108 100,104 83,93 75,100 75,112 87,118;128,112 109,116 107,133 128,136",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 20,
            "posY": 103
          },
          {
            "id": "MassiveHeatSink",
            "posX": 94,
            "posY": 118
          },
          {
            "id": "MassiveHeatSink",
            "posX": 27,
            "posY": 129
          },
          {
            "id": "WarpConduitSender",
            "posX": 44,
            "posY": 91
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 52,
            "posY": 104
          },
          {
            "id": "WarpPortal",
            "posX": 43,
            "posY": 125
          },
          {
            "id": "WarpReceiver",
            "posX": 65,
            "posY": 125
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 79,
            "posY": 73,
            "emitRate": 4422.7666,
            "idleTime": 225.72014,
            "eruptionTime": 269.49866,
            "dormancyCycles": 42.987427,
            "activeCycles": 57.87814
          },
          {
            "id": "big_volcano",
            "posX": 113,
            "posY": 129,
            "emitRate": 307293.38,
            "idleTime": 9564.282,
            "eruptionTime": 68.53606,
            "dormancyCycles": 51.845062,
            "activeCycles": 72.6916
          },
          {
            "id": "slimy_po2",
            "posX": 101,
            "posY": 84,
            "emitRate": 331.40845,
            "idleTime": 317.74927,
            "eruptionTime": 269.40497,
            "dormancyCycles": 54.993412,
            "activeCycles": 72.441
          },
          {
            "id": "hot_co2",
            "posX": 114,
            "posY": 76,
            "emitRate": 547.7685,
            "idleTime": 471.7916,
            "eruptionTime": 174.32431,
            "dormancyCycles": 22.152468,
            "activeCycles": 39.065964
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
          "BouldersSmall",
          "CrashedSatellites"
        ],
        "biomePaths": "Swamp:106,66 106,56 94,44 88,44 81,54 87,71;69,77 60,67 45,70 44,89 64,91;44,89 45,70 37,63 24,65 21,86 23,90 40,92;37,63 44,45 31,32 19,43 22,63 24,65;91,89 85,74 69,77 64,91 68,98 84,99;24,65 22,63 0,64 0,85 21,86;128,72 112,72 106,91 110,96 128,96;128,72 128,45 125,45 106,56 106,66 112,72;112,72 106,66 87,71 85,74 91,89 106,91\nBoggyMarsh:60,67 65,54 58,44 44,45 37,63 45,70;85,74 87,71 81,54 65,54 60,67 69,77;90,112 84,99 68,98 63,111 81,125;22,63 19,43 0,40 0,64;43,107 40,92 23,90 17,108 27,119;125,45 106,31 94,44 106,56;106,133 110,119 105,112 90,112 81,125 81,126 99,138;110,96 106,91 91,89 84,99 90,112 105,112;128,118 110,119 106,133 128,144;128,118 128,96 110,96 105,112 110,119\nMetallic:63,111 68,98 64,91 44,89 40,92 43,107 55,114;17,108 23,90 21,86 0,85 0,109;81,126 81,125 63,111 55,114 52,131 55,134 74,135;52,131 55,114 43,107 27,119 27,122 38,132;27,122 27,119 17,108 0,109 0,131 16,132\nMagmaCore:99,138 81,126 74,135 76,153 97,153;38,132 27,122 16,132 22,153 32,153;128,144 106,133 99,138 97,153 128,153;55,134 52,131 38,132 32,153 54,153;74,135 55,134 54,153 76,153;16,132 0,131 0,153 22,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 76,
            "posY": 119
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 108,
            "posY": 52
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 45,
            "posY": 63
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 64,
            "posY": 68
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "posX": 77,
            "posY": 72,
            "emitRate": 305.17,
            "idleTime": 154.58224,
            "eruptionTime": 236.79105,
            "dormancyCycles": 55.34538,
            "activeCycles": 85.544426
          },
          {
            "id": "molten_gold",
            "posX": 16,
            "posY": 94,
            "emitRate": 7080.813,
            "idleTime": 773.5153,
            "eruptionTime": 56.901855,
            "dormancyCycles": 22.897686,
            "activeCycles": 24.781412
          },
          {
            "id": "molten_cobalt",
            "posX": 61,
            "posY": 118,
            "emitRate": 8285.179,
            "idleTime": 834.91205,
            "eruptionTime": 51.5362,
            "dormancyCycles": 48.696346,
            "activeCycles": 75.602806
          },
          {
            "id": "molten_gold",
            "posX": 48,
            "posY": 107,
            "emitRate": 11111.154,
            "idleTime": 708.23956,
            "eruptionTime": 31.696384,
            "dormancyCycles": 30.43875,
            "activeCycles": 50.04668
          },
          {
            "id": "molten_iron",
            "posX": 92,
            "posY": 94,
            "emitRate": 5600.347,
            "idleTime": 568.2691,
            "eruptionTime": 47.31395,
            "dormancyCycles": 43.45515,
            "activeCycles": 61.4194
          },
          {
            "id": "molten_gold",
            "posX": 62,
            "posY": 97,
            "emitRate": 7617.9097,
            "idleTime": 695.8431,
            "eruptionTime": 53.554127,
            "dormancyCycles": 40.265347,
            "activeCycles": 60.2122
          },
          {
            "id": "small_volcano",
            "posX": 105,
            "posY": 123,
            "emitRate": 131955.61,
            "idleTime": 8598.812,
            "eruptionTime": 69.019104,
            "dormancyCycles": 67.6109,
            "activeCycles": 81.79082
          },
          {
            "id": "hot_co2",
            "posX": 113,
            "posY": 103,
            "emitRate": 373.5735,
            "idleTime": 339.8425,
            "eruptionTime": 279.8267,
            "dormancyCycles": 51.685383,
            "activeCycles": 95.26423
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
          "MetalRich"
        ],
        "biomePaths": "Forest:105,60 107,46 105,43 91,41 80,53 86,66 88,67;128,68 128,46 107,46 105,60 114,69;70,50 65,39 52,36 44,43 46,58 58,61;46,58 44,43 27,39 23,43 23,61 38,65;23,61 23,43 0,41 0,61 21,63;86,66 80,53 70,50 58,61 63,75 70,77\nRust:95,82 88,67 86,66 70,77 76,91 87,92;92,102 87,92 76,91 66,102 70,112 85,116;21,63 0,61 0,82 18,82;81,133 85,118 85,116 70,112 59,127 66,135;106,133 104,124 85,118 81,133 88,141;51,126 45,109 37,107 26,112 23,120 27,130 43,133;111,114 106,104 92,102 85,116 85,118 104,124;16,102 21,86 18,82 0,82 0,104\nToxicJungle:114,69 105,60 88,67 95,82 107,83;128,68 114,69 107,83 113,92 128,93;128,93 113,92 106,104 111,114 128,115;113,92 107,83 95,82 87,92 92,102 106,104;70,112 66,102 57,100 45,109 51,126 59,127;63,75 58,61 46,58 38,65 41,82 51,84;41,82 38,65 23,61 21,63 18,82 21,86 34,87;128,133 128,115 111,114 104,124 106,133 108,135;37,107 34,87 21,86 16,102 26,112;27,130 23,120 0,121 0,135 21,138;23,120 26,112 16,102 0,104 0,121;76,91 70,77 63,75 51,84 57,100 66,102;57,100 51,84 41,82 34,87 37,107 45,109\nMagmaCore:88,141 81,133 66,135 63,153 87,153;66,135 59,127 51,126 43,133 45,153 63,153;128,133 108,135 110,153 128,153;43,133 27,130 21,138 23,153 45,153;108,135 106,133 88,141 87,153 110,153;21,138 0,135 0,153 23,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 83,
            "posY": 127
          },
          {
            "id": "PropSurfaceSatellite3",
            "posX": 61,
            "posY": 58
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 20,
            "posY": 114,
            "emitRate": 398.69263,
            "idleTime": 233.46135,
            "eruptionTime": 233.167,
            "dormancyCycles": 44.83332,
            "activeCycles": 69.14313
          },
          {
            "id": "slush_water",
            "posX": 75,
            "posY": 98,
            "emitRate": 5263.494,
            "idleTime": 152.78902,
            "eruptionTime": 90.72327,
            "dormancyCycles": 48.074097,
            "activeCycles": 76.53299
          },
          {
            "id": "hot_co2",
            "posX": 41,
            "posY": 104,
            "emitRate": 395.76376,
            "idleTime": 312.336,
            "eruptionTime": 202.94891,
            "dormancyCycles": 69.15534,
            "activeCycles": 106.41759
          },
          {
            "id": "salt_water",
            "posX": 23,
            "posY": 93,
            "emitRate": 11386.832,
            "idleTime": 276.39853,
            "eruptionTime": 213.31079,
            "dormancyCycles": 50.889515,
            "activeCycles": 71.602165
          },
          {
            "id": "hot_hydrogen",
            "posX": 113,
            "posY": 124,
            "emitRate": 329.80548,
            "idleTime": 304.28473,
            "eruptionTime": 309.1087,
            "dormancyCycles": 40.880016,
            "activeCycles": 37.535454
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
          "RadioactiveCrust",
          "SubsurfaceOcean"
        ],
        "biomePaths": "Ocean:54,36 44,22 41,22 32,35 36,43 46,45;36,43 32,35 20,32 15,45 21,54 28,54;64,35 54,36 46,45 50,56 64,56;15,45 20,32 19,30 0,27 0,46\nFrozenWastes:64,56 50,56 46,62 50,75 64,76;30,74 34,62 28,54 21,54 15,62 18,75 22,77;46,62 50,56 46,45 36,43 28,54 34,62;50,75 46,62 34,62 30,74 43,82;21,54 15,45 0,46 0,60 15,62;43,90 43,82 30,74 22,77 21,91 32,96;64,91 64,76 50,75 43,82 43,90 48,94;18,75 15,62 0,60 0,80;15,110 16,94 0,90 0,112;49,110 48,94 43,90 32,96 32,109 42,115;64,113 49,110 42,115 43,128 64,128;21,91 22,77 18,75 0,80 0,90 16,94;32,109 32,96 21,91 16,94 15,110 21,114;21,114 15,110 0,112 0,128 21,128;64,91 48,94 49,110 64,113;42,115 32,109 21,114 21,128 43,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 25,
            "posY": 50
          },
          {
            "id": "GravitasPedestal",
            "posX": 25,
            "posY": 110
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 45,
            "posY": 108,
            "emitRate": 9989.566,
            "idleTime": 624.74744,
            "eruptionTime": 39.900654,
            "dormancyCycles": 35.043358,
            "activeCycles": 80.98054
          },
          {
            "id": "molten_iron",
            "posX": 35,
            "posY": 60,
            "emitRate": 12128.189,
            "idleTime": 689.93195,
            "eruptionTime": 32.35396,
            "dormancyCycles": 58.031895,
            "activeCycles": 65.55422
          },
          {
            "id": "molten_iron",
            "posX": 46,
            "posY": 84,
            "emitRate": 11427.527,
            "idleTime": 737.2783,
            "eruptionTime": 27.474247,
            "dormancyCycles": 61.086056,
            "activeCycles": 78.268974
          },
          {
            "id": "molten_iron",
            "posX": 20,
            "posY": 74,
            "emitRate": 7393.5303,
            "idleTime": 770.8829,
            "eruptionTime": 58.377537,
            "dormancyCycles": 58.754543,
            "activeCycles": 51.31415
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
          "FrozenCore"
        ],
        "biomePaths": "BoggyMarsh:38,47 34,35 26,34 17,45 18,48 28,54;52,47 50,31 42,27 34,35 38,47 46,50;26,34 19,24 3,34 17,45;64,26 50,31 52,47 64,48;26,68 29,65 28,54 18,48 8,58 17,69;18,48 17,45 3,34 0,34 0,58 8,58;45,81 46,66 29,65 26,68 30,80 44,83;64,66 47,66 46,66 45,81 64,82\nToxicJungle:47,66 46,50 38,47 28,54 29,65 46,66;64,48 52,47 46,50 47,66 64,66;10,78 17,69 8,58 0,58 0,79\nFrozenWastes:30,80 26,68 17,69 10,78 21,91;21,91 10,78 0,79 0,96 21,96;44,83 30,80 21,91 21,96 44,96;64,82 45,81 44,83 44,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 31,
            "posY": 44
          },
          {
            "id": "GravitasPedestal",
            "posX": 17,
            "posY": 44
          },
          {
            "id": "SapTree",
            "posX": 24,
            "posY": 44
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 20,
            "posY": 66,
            "emitRate": 10441.033,
            "idleTime": 606.5053,
            "eruptionTime": 31.36694,
            "dormancyCycles": 29.705378,
            "activeCycles": 77.39754
          },
          {
            "id": "molten_tungsten",
            "posX": 25,
            "posY": 90,
            "emitRate": 6879.6387,
            "idleTime": 716.6934,
            "eruptionTime": 58.90612,
            "dormancyCycles": 42.114956,
            "activeCycles": 59.731632
          },
          {
            "id": "molten_tungsten",
            "posX": 11,
            "posY": 90,
            "emitRate": 10574.151,
            "idleTime": 718.8763,
            "eruptionTime": 34.65969,
            "dormancyCycles": 49.57028,
            "activeCycles": 53.47547
          },
          {
            "id": "hot_hydrogen",
            "posX": 36,
            "posY": 75,
            "emitRate": 464.4287,
            "idleTime": 264.1578,
            "eruptionTime": 146.50305,
            "dormancyCycles": 65.84893,
            "activeCycles": 77.136925
          },
          {
            "id": "hot_co2",
            "posX": 31,
            "posY": 63,
            "emitRate": 241.37178,
            "idleTime": 76.981064,
            "eruptionTime": 375.3724,
            "dormancyCycles": 45.4254,
            "activeCycles": 60.63041
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
        "biomePaths": "Moo:62,47 66,40 64,35 53,29 46,33 45,46 46,48;82,50 77,42 66,40 62,47 65,60 76,63;96,33 84,32 77,42 82,50 96,50;31,46 27,34 18,32 11,40 16,50 27,52;46,61 46,48 45,46 31,46 27,52 29,62 38,66;65,60 62,47 46,48 46,61 56,66;29,62 27,52 16,50 8,61 19,70;45,46 46,33 34,27 27,34 31,46;96,50 82,50 76,63 76,64 96,67;8,61 16,50 11,40 0,40 0,62\nFrozenWastes:56,66 46,61 38,66 38,80 57,80;38,66 29,62 19,70 18,80 38,80;19,70 8,61 0,62 0,80 18,80;96,67 76,64 75,80 96,80;76,64 76,63 65,60 56,66 57,80 75,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 55,
            "posY": 41
          },
          {
            "id": "GravitasPedestal",
            "posX": 48,
            "posY": 41
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 84,
            "posY": 39,
            "emitRate": 401.98386,
            "idleTime": 263.19437,
            "eruptionTime": 201.23924,
            "dormancyCycles": 36.064503,
            "activeCycles": 72.14416
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
        "biomePaths": "Barren:80,99 80,85 62,81 58,92 65,101;58,92 62,81 61,80 52,74 41,76 38,86 45,95;61,111 65,101 58,92 45,95 42,103 51,113;80,64 80,45 65,46 60,56 70,65;52,74 54,57 48,55 34,63 33,65 41,76;80,120 80,99 65,101 61,111 68,120;80,64 70,65 61,80 62,81 80,85;46,124 51,113 42,103 33,107 30,121 34,125;42,103 45,95 38,86 25,87 21,100 33,107;62,132 68,120 61,111 51,113 46,124 52,132;80,120 68,120 62,132 68,140 80,140;38,86 41,76 33,65 19,73 19,78 25,87;30,121 33,107 21,100 20,100 12,114 19,122;47,142 52,132 46,124 34,125 32,140 34,143;32,140 34,125 30,121 19,122 13,134 18,140;19,122 12,114 0,114 0,134 13,134;18,158 14,154 0,154 0,174 16,174;35,159 33,157 18,158 16,174 34,174;12,114 20,100 0,92 0,114;21,100 25,87 19,78 0,85 0,92 20,100;67,158 61,152 54,153 49,159 52,174 63,174;49,159 35,159 34,174 52,174;19,78 19,73 11,63 0,63 0,85;33,65 34,63 27,52 18,51 11,63 19,73;60,56 65,46 60,35 51,35 44,42 48,55 54,57;48,55 44,42 35,41 27,52 34,63;80,45 80,29 66,27 60,35 65,46;35,41 30,33 19,32 14,45 18,51 27,52;11,63 18,51 14,45 0,44 0,63;80,157 67,158 63,174 80,174;19,32 16,28 0,28 0,44 14,45;70,65 60,56 54,57 52,74 61,80\nSwamp:33,157 34,143 32,140 18,140 14,154 18,158;49,159 54,153 47,142 34,143 33,157 35,159;80,157 80,140 68,140 61,152 67,158;61,152 68,140 62,132 52,132 47,142 54,153;14,154 18,140 13,134 0,134 0,154",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 41,
            "posY": 154
          },
          {
            "id": "GravitasPedestal",
            "posX": 43,
            "posY": 154
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "posX": 33,
            "posY": 121,
            "emitRate": 9651.749,
            "idleTime": 281.52316,
            "eruptionTime": 306.9514,
            "dormancyCycles": 40.546535,
            "activeCycles": 91.86667
          },
          {
            "id": "salt_water",
            "posX": 62,
            "posY": 92,
            "emitRate": 14720.661,
            "idleTime": 375.1155,
            "eruptionTime": 219.92172,
            "dormancyCycles": 91.27968,
            "activeCycles": 106.16081
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
        "biomePaths": "MagmaCore:51,38 46,34 30,40 30,40 36,53 47,54;36,53 30,40 17,46 15,57 18,61 29,62;64,76 49,77 47,96 64,96;49,77 46,74 35,74 31,79 35,96 47,96;64,36 51,38 47,54 49,57 64,57;31,79 35,74 29,62 18,61 14,77 17,80;15,57 17,46 7,38 0,38 0,58;30,40 30,40 25,30 15,28 7,38 17,46;17,80 14,77 0,76 0,96 15,96;18,61 15,57 0,58 0,76 14,77\nOilField:64,76 64,57 49,57 46,74 49,77;46,74 49,57 47,54 36,53 29,62 35,74;31,79 17,80 15,96 35,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 21,
            "posY": 84
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 43,
            "posY": 67,
            "emitRate": 292450.22,
            "idleTime": 8432.549,
            "eruptionTime": 55.48462,
            "dormancyCycles": 71.0783,
            "activeCycles": 84.85015
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
          "MetalPoor"
        ],
        "biomePaths": "Sandstone:82,58 80,52 69,47 57,57 61,65 76,67;97,75 96,62 82,58 76,67 79,77 89,80;146,58 140,43 127,48 126,59 138,67;138,74 138,67 126,59 117,64 115,74 125,81;79,77 76,67 61,65 58,77 69,85;39,74 40,65 32,56 19,58 19,59 20,75 33,78\nBarren:115,74 117,64 105,54 96,62 97,75 107,78;126,59 127,48 118,40 105,53 105,54 117,64;160,76 160,59 146,58 138,67 138,74 143,78;58,77 61,65 57,57 56,57 40,65 39,74 51,80;20,75 19,59 0,60 0,77 16,78\nFrozenWastes:107,78 97,75 89,80 90,96 107,96;89,80 79,77 69,85 70,96 90,96;69,85 58,77 51,80 49,96 70,96;143,78 138,74 125,81 126,96 143,96;125,81 115,74 107,78 107,96 126,96;160,76 143,78 143,96 160,96;51,80 39,74 33,78 33,96 49,96;33,78 20,75 16,78 17,96 33,96;16,78 0,77 0,96 17,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 45,
            "posY": 77
          },
          {
            "id": "GravitasPedestal",
            "posX": 49,
            "posY": 77
          },
          {
            "id": "GeneShuffler",
            "posX": 47,
            "posY": 71
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 7,
            "posY": 83,
            "emitRate": 5281.5786,
            "idleTime": 343.24393,
            "eruptionTime": 299.04446,
            "dormancyCycles": 74.54636,
            "activeCycles": 94.95545
          },
          {
            "id": "hot_steam",
            "posX": 27,
            "posY": 82,
            "emitRate": 3949.128,
            "idleTime": 491.82178,
            "eruptionTime": 220.182,
            "dormancyCycles": 44.253727,
            "activeCycles": 75.37364
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlands",
        "q": -1,
        "r": 1
      },
      {
        "id": "MiniRadioactiveOceanStart",
        "q": 3,
        "r": -3
      },
      {
        "id": "MiniFlippedWarp",
        "q": -4,
        "r": 3
      },
      {
        "id": "MiniMetallicSwampy",
        "q": 0,
        "r": -2
      },
      {
        "id": "MiniForestFrozen",
        "q": 1,
        "r": 2
      },
      {
        "id": "TundraMoonlet",
        "q": 6,
        "r": 3
      },
      {
        "id": "MarshyMoonlet",
        "q": 1,
        "r": 7
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
        "q": 10,
        "r": -9
      },
      {
        "id": "RegolithMoonlet",
        "q": -10,
        "r": -1
      },
      {
        "id": "TemporalTear",
        "q": -9,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 4,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 1,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 9,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 9,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 4,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 0,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 6,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -7,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -2,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -8,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 7,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 3,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 12,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 11,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 11,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -6,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 9,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 9,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -11,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 0,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 1,
        "r": -12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": -2,
        "r": 4
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -12,
        "r": 6
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -2,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -8,
        "r": -4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 3,
        "r": 3
      }
    ]
  }
]
""".trimIndent()
