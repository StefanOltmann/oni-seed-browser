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
  },
  {
    "coordinate": "M-FRZ-C-1129087505-0-0-0",
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
          "Volcanoes",
          "SlimeSplats"
        ],
        "biomePaths": "Forest:87,100 91,94 94,78 86,62 66,55 49,62 41,79 44,95 62,108 64,109;117,84 112,75 94,78 91,94 109,97;112,75 114,71 107,57 90,58 86,62 94,78;44,95 41,79 30,76 22,81 19,91 23,98 37,101\nMagmaCore:128,70 114,71 112,75 117,84 128,85;110,130 109,129 93,136 92,153 112,153;93,136 81,127 76,128 73,131 75,153 92,153;73,131 56,133 52,153 75,153;128,128 110,130 112,153 128,153;30,76 23,61 13,71 22,81;56,133 48,124 36,132 40,153 52,153;35,110 37,101 23,98 20,112 22,114;20,132 0,131 0,153 20,153;36,132 23,130 20,132 20,153 40,153\nRust:128,85 117,84 109,97 114,108 128,109;107,57 113,47 108,38 94,36 89,41 90,58;128,70 128,48 113,47 107,57 114,71;81,127 92,113 87,100 64,109 76,128;109,129 106,117 92,113 81,127 93,136;49,62 40,52 23,61 23,61 30,76 41,79;66,55 66,43 55,37 41,45 40,52 49,62;62,108 44,95 37,101 35,110 48,124;128,128 128,109 114,108 106,117 109,129 110,130;90,58 89,41 74,37 66,43 66,55 86,62;114,108 109,97 91,94 87,100 92,113 106,117;19,91 22,81 13,71 0,71 0,93\nToxicJungle:73,131 76,128 64,109 62,108 48,124 48,124 56,133;40,52 41,45 33,37 19,39 14,47 23,61;13,71 23,61 23,61 14,47 0,48 0,71;48,124 48,124 35,110 22,114 23,130 36,132;20,112 23,98 19,91 0,93 0,113;23,130 22,114 20,112 0,113 0,131 20,132",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 66,
            "posY": 84
          },
          {
            "id": "WarpConduitSender",
            "posX": 92,
            "posY": 74
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 80,
            "posY": 123
          },
          {
            "id": "GravitasPedestal",
            "posX": 115,
            "posY": 120
          },
          {
            "id": "PropSurfaceSatellite3",
            "posX": 43,
            "posY": 61
          },
          {
            "id": "WarpReceiver",
            "posX": 61,
            "posY": 51
          },
          {
            "id": "WarpPortal",
            "posX": 61,
            "posY": 46
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 17,
            "posY": 49,
            "emitRate": 309.66782,
            "idleTime": 233.0668,
            "eruptionTime": 297.48984,
            "dormancyCycles": 55.99882,
            "activeCycles": 84.95684
          },
          {
            "id": "slush_water",
            "posX": 104,
            "posY": 55,
            "emitRate": 5897.3096,
            "idleTime": 210.43211,
            "eruptionTime": 174.7683,
            "dormancyCycles": 26.291563,
            "activeCycles": 28.945925
          },
          {
            "id": "salt_water",
            "posX": 36,
            "posY": 74,
            "emitRate": 9506.896,
            "idleTime": 306.50272,
            "eruptionTime": 313.1732,
            "dormancyCycles": 42.622726,
            "activeCycles": 78.58223
          },
          {
            "id": "small_volcano",
            "posX": 79,
            "posY": 109,
            "emitRate": 150786.6,
            "idleTime": 10031.883,
            "eruptionTime": 67.118034,
            "dormancyCycles": 39.54241,
            "activeCycles": 56.84749
          },
          {
            "id": "slimy_po2",
            "posX": 92,
            "posY": 123,
            "emitRate": 452.13522,
            "idleTime": 334.65158,
            "eruptionTime": 304.8892,
            "dormancyCycles": 48.20869,
            "activeCycles": 121.22077
          },
          {
            "id": "big_volcano",
            "posX": 28,
            "posY": 106,
            "emitRate": 259205.66,
            "idleTime": 9671.964,
            "eruptionTime": 74.08212,
            "dormancyCycles": 58.93002,
            "activeCycles": 103.31369
          },
          {
            "id": "big_volcano",
            "posX": 21,
            "posY": 72,
            "emitRate": 272995.25,
            "idleTime": 9450.247,
            "eruptionTime": 70.34713,
            "dormancyCycles": 42.108585,
            "activeCycles": 94.50244
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
          "CrashedSatellites"
        ],
        "biomePaths": "Sandstone:78,106 90,96 95,81 89,63 74,55 58,56 45,66 41,85 44,94 59,107;128,67 113,67 107,80 115,89 128,89;115,89 107,80 95,81 90,96 103,106 105,106;45,66 38,61 20,70 19,73 23,83 41,85;81,116 78,106 59,107 57,114 70,127;94,131 90,119 81,116 70,127 70,131 84,139;57,114 59,107 44,94 35,103 36,115 45,121;61,139 45,132 39,138 39,153 61,153;44,94 41,85 23,83 18,92 21,98 35,103;20,132 0,132 0,153 19,153\nToxicJungle:114,44 107,38 94,42 94,59 108,61;128,43 114,44 108,61 113,67 128,67;94,59 94,42 86,38 77,42 74,55 89,63;74,55 77,42 65,34 53,43 58,56;107,80 113,67 108,61 94,59 89,63 95,81;45,40 43,35 23,33 20,37 21,47 36,53;58,56 53,43 45,40 36,53 38,61 45,66;23,83 19,73 0,75 0,90 18,92;19,73 20,70 15,55 0,53 0,75;103,106 90,96 78,106 81,116 90,119;21,47 20,37 0,35 0,53 15,55;36,115 35,103 21,98 14,111 23,121;14,111 21,98 18,92 0,90 0,112;39,138 21,132 20,132 19,153 39,153;38,61 36,53 21,47 15,55 20,70;128,135 108,133 108,134 107,153 128,153\nOilField:128,111 128,89 115,89 105,106 112,112;128,111 112,112 108,133 128,135;108,133 112,112 105,106 103,106 90,119 94,131 108,134;108,134 94,131 84,139 85,153 107,153;70,131 70,127 57,114 45,121 45,132 61,139;45,132 45,121 36,115 23,121 21,132 39,138;84,139 70,131 61,139 61,153 85,153;21,132 23,121 14,111 0,112 0,132 20,132",
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "posX": 99,
            "posY": 66
          },
          {
            "id": "WarpConduitSender",
            "posX": 27,
            "posY": 49
          },
          {
            "id": "WarpPortal",
            "posX": 54,
            "posY": 83
          },
          {
            "id": "WarpReceiver",
            "posX": 76,
            "posY": 83
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 77,
            "posY": 57
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 108,
            "posY": 50
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 94,
            "posY": 79
          },
          {
            "id": "GeneShuffler",
            "posX": 43,
            "posY": 128
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 58,
            "posY": 129,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 25,
            "posY": 124,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 112,
            "posY": 131,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 73,
            "posY": 137,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 96,
            "posY": 129,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 18,
            "posY": 101,
            "emitRate": 6905.0664,
            "idleTime": 284.3593,
            "eruptionTime": 195.2555,
            "dormancyCycles": 30.761189,
            "activeCycles": 56.190567
          },
          {
            "id": "chlorine_gas",
            "posX": 79,
            "posY": 112,
            "emitRate": 367.59012,
            "idleTime": 478.06635,
            "eruptionTime": 297.49078,
            "dormancyCycles": 60.162247,
            "activeCycles": 84.174706
          },
          {
            "id": "hot_co2",
            "posX": 88,
            "posY": 141,
            "emitRate": 452.33527,
            "idleTime": 120.456215,
            "eruptionTime": 78.20391,
            "dormancyCycles": 52.463253,
            "activeCycles": 72.12627
          },
          {
            "id": "hot_hydrogen",
            "posX": 15,
            "posY": 45,
            "emitRate": 420.48553,
            "idleTime": 403.645,
            "eruptionTime": 298.3112,
            "dormancyCycles": 43.481644,
            "activeCycles": 75.0019
          },
          {
            "id": "big_volcano",
            "posX": 57,
            "posY": 51,
            "emitRate": 266313.16,
            "idleTime": 8563.414,
            "eruptionTime": 63.359276,
            "dormancyCycles": 23.091719,
            "activeCycles": 63.140724
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
          "Geodes"
        ],
        "biomePaths": "BoggyMarsh:90,64 85,46 68,48 64,59 70,70 85,70;64,59 68,48 61,39 46,39 41,47 47,60;128,46 110,46 105,64 109,69 128,69;85,110 85,93 67,90 60,104 68,114;26,48 20,39 0,40 0,58 21,58;42,115 48,105 40,93 24,93 22,95 23,114 23,115;86,132 91,115 85,110 68,114 65,127 74,135;110,46 105,41 87,43 85,46 90,64 105,64;22,95 24,93 21,77 0,76 0,95;22,133 23,115 23,114 0,114 0,134;22,95 0,95 0,114 23,114;128,111 128,91 106,90 107,111;128,111 107,111 104,114 111,132 128,134\nSwamp:90,89 85,70 70,70 63,82 67,90 85,93;70,70 64,59 47,60 42,71 47,80 63,82;109,69 105,64 90,64 85,70 90,89 105,90;47,60 41,47 26,48 21,58 25,70 42,71;40,93 47,80 42,71 25,70 21,77 24,93;25,70 21,58 0,58 0,76 21,77;128,69 109,69 105,90 106,90 128,91\nMetallic:60,104 67,90 63,82 47,80 40,93 48,105;65,127 68,114 60,104 48,105 42,115 49,131 49,131;104,114 107,111 106,90 105,90 90,89 85,93 85,110 91,115;49,131 42,115 23,115 22,133 26,137\nMagmaCore:26,137 22,133 0,134 0,153 25,153;74,135 65,127 49,131 52,153 72,153;100,143 86,132 74,135 72,153 101,153;111,132 104,114 91,115 86,132 100,143;49,131 49,131 26,137 25,153 52,153;128,134 111,132 100,143 101,153 128,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 16,
            "posY": 85
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "posX": 13,
            "posY": 111,
            "emitRate": 403.1551,
            "idleTime": 204.46002,
            "eruptionTime": 193.73761,
            "dormancyCycles": 48.191532,
            "activeCycles": 68.97512
          },
          {
            "id": "molten_cobalt",
            "posX": 50,
            "posY": 116,
            "emitRate": 7475.9863,
            "idleTime": 723.3743,
            "eruptionTime": 53.322495,
            "dormancyCycles": 35.0916,
            "activeCycles": 68.38642
          },
          {
            "id": "molten_gold",
            "posX": 54,
            "posY": 93,
            "emitRate": 8245.991,
            "idleTime": 712.4197,
            "eruptionTime": 48.590767,
            "dormancyCycles": 91.94597,
            "activeCycles": 93.987885
          },
          {
            "id": "molten_cobalt",
            "posX": 93,
            "posY": 95,
            "emitRate": 7042.4634,
            "idleTime": 685.0184,
            "eruptionTime": 43.55685,
            "dormancyCycles": 56.886314,
            "activeCycles": 100.19952
          },
          {
            "id": "molten_copper",
            "posX": 72,
            "posY": 102,
            "emitRate": 5800.243,
            "idleTime": 577.8958,
            "eruptionTime": 53.519577,
            "dormancyCycles": 75.13498,
            "activeCycles": 85.79205
          },
          {
            "id": "molten_gold",
            "posX": 62,
            "posY": 120,
            "emitRate": 9638.885,
            "idleTime": 811.0499,
            "eruptionTime": 47.920795,
            "dormancyCycles": 66.80248,
            "activeCycles": 98.82966
          },
          {
            "id": "hot_po2",
            "posX": 94,
            "posY": 60,
            "emitRate": 343.01544,
            "idleTime": 324.11612,
            "eruptionTime": 414.60574,
            "dormancyCycles": 69.805305,
            "activeCycles": 59.093716
          },
          {
            "id": "molten_iron",
            "posX": 51,
            "posY": 56,
            "emitRate": 8729.351,
            "idleTime": 712.89124,
            "eruptionTime": 43.167118,
            "dormancyCycles": 43.514217,
            "activeCycles": 61.86517
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
          "BouldersMedium"
        ],
        "biomePaths": "MagmaCore:115,79 103,62 94,63 87,79 96,91 105,91;103,62 111,51 107,41 94,36 85,42 84,55 94,63;128,79 128,52 111,51 103,62 115,79;84,55 85,42 71,34 59,42 61,58 70,62;61,58 59,42 46,36 39,41 38,58 49,66;24,64 11,49 0,50 0,75 21,75;38,58 39,41 22,35 11,49 24,64\nWasteland:128,104 128,79 115,79 105,91 113,104;96,91 87,79 74,79 70,84 79,103 85,104;87,79 94,63 84,55 70,62 74,79;113,104 105,91 96,91 85,104 92,114 106,114;70,84 74,79 70,62 61,58 49,66 48,70 63,85;79,103 70,84 63,85 55,96 59,109 66,112;59,109 55,96 41,94 32,105 45,118;32,105 41,94 37,83 23,79 17,95 25,106;17,95 23,79 21,75 0,75 0,96;48,70 49,66 38,58 24,64 21,75 23,79 37,83;25,106 17,95 0,96 0,116 20,116\nFrozenWastes:112,129 106,114 92,114 85,130 86,132 106,136;128,104 113,104 106,114 112,129 128,129;92,114 85,104 79,103 66,112 70,127 85,130;70,127 66,112 59,109 45,118 43,130 44,131 63,134;63,85 48,70 37,83 41,94 55,96;43,130 45,118 32,105 25,106 20,116 24,130;21,135 24,130 20,116 0,116 0,135\nSandstone:86,132 85,130 70,127 63,134 65,153 83,153;128,129 112,129 106,136 108,153 128,153;44,131 43,130 24,130 21,135 24,153 42,153;63,134 44,131 42,153 65,153;106,136 86,132 83,153 108,153;21,135 0,135 0,153 24,153",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 18,
            "posY": 125
          },
          {
            "id": "MassiveHeatSink",
            "posX": 73,
            "posY": 114
          },
          {
            "id": "MassiveHeatSink",
            "posX": 50,
            "posY": 128
          },
          {
            "id": "GeneShuffler",
            "posX": 92,
            "posY": 130
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 16,
            "posY": 58,
            "emitRate": 4385.435,
            "idleTime": 338.5155,
            "eruptionTime": 324.82874,
            "dormancyCycles": 35.53274,
            "activeCycles": 50.177982
          },
          {
            "id": "steam",
            "posX": 15,
            "posY": 100,
            "emitRate": 5396.138,
            "idleTime": 180.91035,
            "eruptionTime": 163.29167,
            "dormancyCycles": 44.988487,
            "activeCycles": 117.45777
          },
          {
            "id": "hot_steam",
            "posX": 112,
            "posY": 117,
            "emitRate": 2709.076,
            "idleTime": 334.4919,
            "eruptionTime": 274.96097,
            "dormancyCycles": 89.70438,
            "activeCycles": 99.684074
          },
          {
            "id": "small_volcano",
            "posX": 59,
            "posY": 76,
            "emitRate": 104171.336,
            "idleTime": 6519.687,
            "eruptionTime": 56.57131,
            "dormancyCycles": 44.898777,
            "activeCycles": 74.78283
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
        "biomePaths": "Forest:128,56 128,37 104,39 103,41 109,57;128,77 128,56 109,57 104,66 111,78;111,78 104,66 92,67 86,83 90,90 105,90;104,113 110,99 105,90 90,90 85,105 92,114;43,80 47,74 44,59 40,57 23,62 20,70 26,80;48,96 43,80 26,80 21,93 23,99 42,103;43,117 42,103 23,99 17,114 24,124;128,77 111,78 105,90 110,99 128,100;128,120 128,100 110,99 104,113 110,121;26,80 20,70 0,72 0,91 21,93;20,70 23,62 15,48 0,47 0,72\nOcean:104,66 109,57 103,41 87,45 83,58 92,67;83,58 87,45 77,34 62,43 62,50 71,60;71,60 62,50 44,59 47,74 66,75;92,67 83,58 71,60 66,75 70,82 86,83;62,50 62,43 49,32 37,41 40,57 44,59;85,105 90,90 86,83 70,82 63,98 68,107;70,82 66,75 47,74 43,80 48,96 63,98;65,117 68,107 63,98 48,96 42,103 43,117 50,123;40,57 37,41 24,37 15,48 23,62\nRadioactive:84,130 92,114 85,105 68,107 65,117 77,130;49,132 50,123 43,117 24,124 23,133 32,146;77,130 65,117 50,123 49,132 65,147;107,134 110,121 104,113 92,114 84,130 95,140;128,120 110,121 107,134 128,149;17,114 23,99 21,93 0,91 0,115;23,133 24,124 17,114 0,115 0,139\nMagmaCore:65,147 49,132 32,146 32,153 66,153;95,140 84,130 77,130 65,147 66,153 94,153;128,149 107,134 95,140 94,153 128,153;32,146 23,133 0,139 0,153 32,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 84,
            "posY": 86
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 50,
            "posY": 76,
            "emitRate": 9577.8545,
            "idleTime": 299.45844,
            "eruptionTime": 303.76355,
            "dormancyCycles": 45.462017,
            "activeCycles": 61.08045
          },
          {
            "id": "slush_salt_water",
            "posX": 111,
            "posY": 86,
            "emitRate": 7913.998,
            "idleTime": 359.47595,
            "eruptionTime": 230.96599,
            "dormancyCycles": 39.730064,
            "activeCycles": 54.241093
          },
          {
            "id": "hot_steam",
            "posX": 103,
            "posY": 58,
            "emitRate": 3236.67,
            "idleTime": 335.16153,
            "eruptionTime": 206.14214,
            "dormancyCycles": 49.538254,
            "activeCycles": 68.84488
          },
          {
            "id": "steam",
            "posX": 91,
            "posY": 54,
            "emitRate": 4586.933,
            "idleTime": 502.80695,
            "eruptionTime": 530.13434,
            "dormancyCycles": 50.324986,
            "activeCycles": 88.24792
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
          "MetalRich",
          "DistressSignal"
        ],
        "biomePaths": "FrozenWastes:43,62 46,59 46,49 39,41 23,52 32,63;26,74 32,63 23,52 23,52 12,60 17,75;39,41 39,38 28,29 18,33 15,40 23,52 23,52;64,74 64,62 46,59 43,62 47,77;23,52 15,40 0,42 0,58 12,60;64,43 46,49 46,59 64,62;64,43 64,36 47,31 39,38 39,41 46,49;12,80 17,75 12,60 0,58 0,80;46,79 47,77 43,62 32,63 26,74 33,81;50,92 46,79 33,81 30,94 32,97 46,97;64,74 47,77 46,79 50,92 64,92;18,94 12,80 0,80 0,102 10,102;33,81 26,74 17,75 12,80 18,94 30,94;30,111 32,97 30,94 18,94 10,102 16,111 27,114;16,111 10,102 0,102 0,128 6,128;64,92 50,92 46,97 50,110 64,110;27,114 16,111 6,128 28,128;45,114 30,111 27,114 28,128 46,128;64,110 50,110 45,114 46,128 64,128;50,110 46,97 32,97 30,111 45,114",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 44,
            "posY": 43
          },
          {
            "id": "GravitasPedestal",
            "posX": 37,
            "posY": 118
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 33,
            "posY": 94,
            "emitRate": 9962.518,
            "idleTime": 597.39844,
            "eruptionTime": 35.935318,
            "dormancyCycles": 32.51123,
            "activeCycles": 68.28326
          },
          {
            "id": "molten_iron",
            "posX": 19,
            "posY": 98,
            "emitRate": 7071.423,
            "idleTime": 779.6561,
            "eruptionTime": 59.4815,
            "dormancyCycles": 40.847958,
            "activeCycles": 73.60632
          },
          {
            "id": "molten_iron",
            "posX": 25,
            "posY": 61,
            "emitRate": 8013.1606,
            "idleTime": 699.8163,
            "eruptionTime": 56.62469,
            "dormancyCycles": 56.45356,
            "activeCycles": 70.151306
          },
          {
            "id": "molten_iron",
            "posX": 41,
            "posY": 75,
            "emitRate": 7468.271,
            "idleTime": 900.53937,
            "eruptionTime": 50.376625,
            "dormancyCycles": 81.87653,
            "activeCycles": 91.79114
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
        "biomePaths": "BoggyMarsh:34,56 35,40 23,34 21,35 16,47 22,60;64,73 64,49 57,49 43,60 47,74;57,49 44,37 35,40 34,56 43,60;16,47 21,35 0,29 0,48;24,74 22,61 0,65 0,76 16,81\nToxicJungle:22,61 22,60 16,47 0,48 0,65;47,74 47,74 43,60 34,56 22,60 22,61 24,74 33,79\nMagmaCore:64,73 47,74 47,74 51,96 64,96;33,79 24,74 16,81 17,96 33,96;16,81 0,76 0,96 17,96;47,74 33,79 33,96 51,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 37,
            "posY": 44
          },
          {
            "id": "GravitasPedestal",
            "posX": 23,
            "posY": 44
          },
          {
            "id": "SapTree",
            "posX": 30,
            "posY": 44
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 24,
            "posY": 64,
            "emitRate": 7129.096,
            "idleTime": 655.55707,
            "eruptionTime": 51.248047,
            "dormancyCycles": 60.863796,
            "activeCycles": 106.091736
          },
          {
            "id": "molten_tungsten",
            "posX": 53,
            "posY": 82,
            "emitRate": 8077.1455,
            "idleTime": 716.5983,
            "eruptionTime": 46.10132,
            "dormancyCycles": 40.335835,
            "activeCycles": 68.6281
          },
          {
            "id": "molten_tungsten",
            "posX": 7,
            "posY": 91,
            "emitRate": 11438.407,
            "idleTime": 698.848,
            "eruptionTime": 33.18479,
            "dormancyCycles": 42.602554,
            "activeCycles": 84.78787
          },
          {
            "id": "chlorine_gas",
            "posX": 10,
            "posY": 50,
            "emitRate": 284.4328,
            "idleTime": 170.413,
            "eruptionTime": 297.8362,
            "dormancyCycles": 60.863796,
            "activeCycles": 106.091736
          },
          {
            "id": "slimy_po2",
            "posX": 31,
            "posY": 60,
            "emitRate": 328.43988,
            "idleTime": 272.89822,
            "eruptionTime": 295.9612,
            "dormancyCycles": 40.335835,
            "activeCycles": 68.6281
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
        "biomePaths": "Moo:66,49 64,36 51,33 48,48 54,54;48,48 51,33 49,30 31,33 35,49;81,48 82,36 72,29 64,36 66,49 74,53;35,49 31,33 30,32 18,35 13,44 18,51 32,53;75,62 74,53 66,49 54,54 54,62 62,69;34,62 32,53 18,51 13,63 21,71;13,63 18,51 13,44 0,44 0,64;54,62 54,54 48,48 35,49 32,53 34,62 42,68;96,62 96,52 81,48 74,53 75,62 80,66;96,31 82,36 81,48 96,52\nFrozenWastes:42,68 34,62 21,71 21,80 42,80;21,71 13,63 0,64 0,80 21,80;62,69 54,62 42,68 42,80 61,80;96,62 80,66 80,80 96,80;80,66 75,62 62,69 61,80 80,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 79,
            "posY": 54
          },
          {
            "id": "GravitasPedestal",
            "posX": 72,
            "posY": 54
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 85,
            "posY": 37,
            "emitRate": 328.30756,
            "idleTime": 222.42886,
            "eruptionTime": 353.4684,
            "dormancyCycles": 47.583267,
            "activeCycles": 63.37301
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
        "biomePaths": "Barren:56,73 56,66 41,55 33,65 40,79;37,84 40,79 33,65 22,64 17,72 22,87;64,57 62,49 52,43 41,52 41,55 56,66;40,104 44,95 37,84 22,87 21,89 22,103 33,107;80,73 80,62 64,57 56,66 56,73 60,77;52,43 51,33 46,29 35,32 31,43 41,52;59,93 61,91 60,77 56,73 40,79 37,84 44,95;22,103 21,89 0,91 0,104 17,107;60,113 63,109 59,93 44,95 40,104 52,115;31,126 33,107 22,103 17,107 16,123 20,127;47,125 52,115 40,104 33,107 31,126 33,127;21,89 22,87 17,72 0,72 0,91;16,123 17,107 0,104 0,124;16,140 20,127 16,123 0,124 0,142;80,73 60,77 61,91 80,91;80,107 80,91 61,91 59,93 63,109;22,64 17,54 0,55 0,72 17,72;73,38 63,28 51,33 52,43 62,49;41,55 41,52 31,43 21,45 17,54 22,64 33,65;80,128 80,107 63,109 60,113 69,129;80,38 73,38 62,49 64,57 80,62;17,54 21,45 14,35 0,36 0,55;61,137 69,129 60,113 52,115 47,125 55,137;55,137 47,125 33,127 36,142 48,145;40,164 25,152 24,152 19,158 19,174 39,174;60,160 50,155 40,164 39,174 62,174;19,158 0,157 0,174 19,174;80,152 70,151 60,160 62,174 80,174\nSwamp:24,152 16,140 0,142 0,157 19,158;25,152 36,142 33,127 31,126 20,127 16,140 24,152;50,155 48,145 36,142 25,152 40,164;80,128 69,129 61,137 70,151 80,152;70,151 61,137 55,137 48,145 50,155 60,160",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 39,
            "posY": 159
          },
          {
            "id": "GravitasPedestal",
            "posX": 41,
            "posY": 159
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "posX": 27,
            "posY": 103,
            "emitRate": 10728.576,
            "idleTime": 281.61487,
            "eruptionTime": 267.58875,
            "dormancyCycles": 53.084476,
            "activeCycles": 76.22517
          },
          {
            "id": "slush_water",
            "posX": 60,
            "posY": 52,
            "emitRate": 6461.932,
            "idleTime": 120.456215,
            "eruptionTime": 78.20391,
            "dormancyCycles": 52.463253,
            "activeCycles": 72.12627
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
        "biomePaths": "MagmaCore:47,47 51,33 41,26 31,36 35,47;64,52 52,52 47,64 55,75 64,75;64,52 64,31 51,33 47,47 52,52;19,54 15,39 0,39 0,58 15,59;31,53 35,47 31,36 20,33 15,39 19,54;55,75 47,64 36,65 31,73 33,78 45,84;64,75 55,75 45,84 47,96 64,96;11,78 18,70 15,59 0,58 0,78;47,64 52,52 47,47 35,47 31,53 36,65;21,96 11,78 0,78 0,96 21,96\nOilField:36,65 31,53 19,54 15,59 18,70 31,73;45,84 33,78 21,96 21,96 47,96;33,78 31,73 18,70 11,78 21,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 22,
            "posY": 65
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 38,
            "posY": 86,
            "emitRate": 257539.86,
            "idleTime": 9115.197,
            "eruptionTime": 74.09499,
            "dormancyCycles": 39.40823,
            "activeCycles": 55.21468
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
        "biomePaths": "Barren:160,59 160,51 141,47 136,59 140,66;160,78 160,59 140,66 140,73 147,79;117,75 124,59 118,52 104,54 101,61 111,74 117,75;90,79 89,66 83,62 72,69 72,80 77,85;54,69 60,62 59,58 49,50 39,54 36,63 40,69;58,83 54,69 40,69 38,80 55,87;21,65 16,56 0,57 0,75 17,76\nSandstone:111,74 101,61 89,66 90,79 98,83;140,73 140,66 136,59 124,59 117,75 131,79;101,61 104,54 99,47 87,45 81,53 83,62 89,66;83,62 81,53 69,49 59,58 60,62 72,69;38,80 40,69 36,63 21,65 17,76 18,77 34,83;36,63 39,54 30,45 19,48 16,56 21,65;72,80 72,69 60,62 54,69 58,83\nFrozenWastes:117,75 111,74 98,83 100,96 116,96;147,79 140,73 131,79 133,96 144,96;98,83 90,79 77,85 78,96 100,96;18,77 17,76 0,75 0,96 14,96;34,83 18,77 14,96 33,96;55,87 38,80 34,83 33,96 55,96;131,79 117,75 117,75 116,96 133,96;160,78 147,79 144,96 160,96;77,85 72,80 58,83 55,87 55,96 78,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 79,
            "posY": 75
          },
          {
            "id": "GravitasPedestal",
            "posX": 83,
            "posY": 75
          },
          {
            "id": "GeneShuffler",
            "posX": 81,
            "posY": 69
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 123,
            "posY": 82,
            "emitRate": 2296.5527,
            "idleTime": 246.0058,
            "eruptionTime": 286.05267,
            "dormancyCycles": 52.06593,
            "activeCycles": 59.17155
          },
          {
            "id": "hot_steam",
            "posX": 92,
            "posY": 88,
            "emitRate": 1906.1111,
            "idleTime": 245.05606,
            "eruptionTime": 341.43832,
            "dormancyCycles": 48.946575,
            "activeCycles": 69.7561
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
        "q": 3,
        "r": -1
      },
      {
        "id": "MiniMetallicSwampy",
        "q": 0,
        "r": -3
      },
      {
        "id": "MiniFlipped",
        "q": -4,
        "r": 4
      },
      {
        "id": "MiniRadioactiveOcean",
        "q": 1,
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": 9,
        "r": 0
      },
      {
        "id": "MarshyMoonlet",
        "q": 6,
        "r": -8
      },
      {
        "id": "MooMoonlet",
        "q": 7,
        "r": -4
      },
      {
        "id": "WaterMoonlet",
        "q": -8,
        "r": 9
      },
      {
        "id": "NiobiumMoonlet",
        "q": 1,
        "r": 7
      },
      {
        "id": "RegolithMoonlet",
        "q": -5,
        "r": -6
      },
      {
        "id": "TemporalTear",
        "q": 3,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 3,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -8,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -9,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -9,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -9,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -4,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -5,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -12,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 4,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 0,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 1,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 6,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -3,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -3,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 1,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 2,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 10,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -1,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 0,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 8,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 12,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 11,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 11,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": -3,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -9,
        "r": 12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -11,
        "r": 10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -7,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 9,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -3,
        "r": -9
      }
    ]
  },
  {
    "coordinate": "V-LUSH-C-1967343937-0-0-0",
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
          "BouldersMixed",
          "IrregularOil"
        ],
        "biomePaths": "Forest:138,221 138,198 121,187 102,191 92,213 104,231 122,234;140,197 146,176 141,171 123,174 121,187 138,198;121,187 123,174 113,165 101,169 97,185 102,191;92,213 102,191 97,185 80,188 77,199 88,213;104,231 92,213 88,213 78,226 83,237 98,239;125,241 122,234 104,231 98,239 107,256 110,257;150,237 146,224 138,221 122,234 125,241 141,246;162,210 162,206 140,197 138,198 138,221 146,224\nBarren:240,64 223,64 208,78 216,96 240,96;208,108 216,96 208,78 196,76 181,89 182,98 193,109;196,76 189,57 175,53 165,61 165,79 181,89;165,79 165,61 146,54 135,62 137,84 150,89;137,84 135,62 118,56 109,62 107,82 124,91;107,82 109,62 90,54 80,60 79,80 94,89;79,80 80,60 61,52 52,57 50,78 62,87;50,78 52,57 31,48 19,61 30,84;26,91 30,84 19,61 0,60 0,92\nOcean:209,141 218,127 208,108 193,109 184,128 193,141;209,174 219,158 209,141 193,141 183,157 197,174;240,189 240,158 219,158 209,174 221,190;123,110 124,91 107,82 94,89 92,107 110,117;78,131 80,114 60,103 51,110 51,136 56,140;31,104 26,91 0,92 0,122 19,123;83,237 78,226 56,221 50,227 52,250 71,254;26,152 30,139 19,123 0,122 0,154;84,317 82,301 61,294 50,306 53,321 69,328;145,267 141,246 125,241 110,257 120,272 137,274;217,297 211,276 194,275 181,290 184,299 208,307;60,103 62,87 50,78 30,84 26,91 31,104 51,110\nRust:240,127 240,96 216,96 208,108 218,127;161,143 169,128 159,112 155,110 138,119 137,140 143,145;240,158 240,127 218,127 209,141 219,158;88,159 91,142 78,131 56,140 55,146 71,166;219,235 222,218 212,207 198,209 189,223 205,243 208,244;111,318 114,300 109,292 93,290 82,301 84,317 99,324;160,299 168,288 160,269 145,267 137,274 139,296 145,301;240,267 240,240 219,235 208,244 218,267;29,300 31,286 19,271 0,272 0,301 27,301\nOilField:193,109 182,98 159,112 169,128 184,128;182,98 181,89 165,79 150,89 155,110 159,112;183,157 193,141 184,128 169,128 161,143 173,158;172,191 162,175 146,176 140,197 162,206;240,216 240,189 221,190 212,207 222,218;97,185 101,169 88,159 71,166 69,173 80,188;88,213 77,199 55,204 56,221 78,226;77,199 80,188 69,173 52,181 50,199 55,204;25,208 27,205 19,182 0,180 0,210;178,225 162,210 146,224 150,237 168,241;139,296 137,274 120,272 109,292 114,300;56,221 55,204 50,199 27,205 25,208 31,224 50,227;113,165 116,144 107,137 91,142 88,159 101,169;218,267 208,244 205,243 187,258 194,275 211,276;75,267 71,254 52,250 45,256 49,278 58,282;129,346 129,329 111,318 99,324 98,347 112,354;98,347 99,324 84,317 69,328 71,347 83,353;49,278 45,256 29,255 19,271 31,286;61,294 58,282 49,278 31,286 29,300 50,306;53,321 50,306 29,300 27,301 26,328 38,332;161,346 157,323 146,318 129,329 129,346 139,353;186,343 189,329 175,313 168,313 157,323 161,346 163,347;19,349 19,332 0,328 0,352;209,319 208,307 184,299 175,313 189,329;240,323 220,328 220,345 240,347;220,345 220,328 209,319 189,329 186,343 192,349 214,350;71,347 69,328 53,321 38,332 39,348 55,356;39,348 38,332 26,328 19,332 19,349 27,354\nSwamp:155,110 150,89 137,84 124,91 123,110 138,119;186,191 197,174 183,157 173,158 162,175 172,191;107,137 110,117 92,107 80,114 78,131 91,142;189,223 198,209 186,191 172,191 162,206 162,210 178,225;31,224 25,208 0,210 0,238 20,239;205,243 189,223 178,225 168,241 174,255 187,258;52,250 50,227 31,224 20,239 29,255 45,256;146,318 145,301 139,296 114,300 111,318 129,329;33,168 33,160 26,152 0,154 0,180 19,182\nBoggyMarsh:141,171 143,145 137,140 116,144 113,165 123,174;162,175 173,158 161,143 143,145 141,171 146,176;212,207 221,190 209,174 197,174 186,191 198,209;92,107 94,89 79,80 62,87 60,103 80,114;107,256 98,239 83,237 71,254 75,267 87,271;120,272 110,257 107,256 87,271 93,290 109,292;174,255 168,241 150,237 141,246 145,267 160,269;240,267 218,267 211,276 217,297 240,299;19,271 29,255 20,239 0,238 0,272\nToxicJungle:137,140 138,119 123,110 110,117 107,137 116,144;51,136 51,110 31,104 19,123 30,139;69,173 71,166 55,146 33,160 33,168 52,181;50,199 52,181 33,168 19,182 27,205;93,290 87,271 75,267 58,282 61,294 82,301;194,275 187,258 174,255 160,269 168,288 181,290;26,328 27,301 0,301 0,328 19,332;240,323 240,299 217,297 208,307 209,319 220,328\nRadioactive:55,146 56,140 51,136 30,139 26,152 33,160;240,216 222,218 219,235 240,240;184,299 181,290 168,288 160,299 168,313 175,313;168,313 160,299 145,301 146,318 157,323\nMagmaCore:112,354 98,347 83,353 84,380 112,380;83,353 71,347 55,356 55,380 84,380;163,347 161,346 139,353 139,380 168,380;240,347 220,345 214,350 217,380 240,380;55,356 39,348 27,354 26,380 55,380;192,349 186,343 163,347 168,380 186,380;139,353 129,346 112,354 112,380 139,380;214,350 192,349 186,380 217,380;27,354 19,349 0,352 0,380 26,380",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 110,
            "posY": 208
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 49,
            "posY": 250
          },
          {
            "id": "WarpConduitSender",
            "posX": 61,
            "posY": 153
          },
          {
            "id": "GravitasPedestal",
            "posX": 167,
            "posY": 234
          },
          {
            "id": "WarpReceiver",
            "posX": 177,
            "posY": 178
          },
          {
            "id": "WarpPortal",
            "posX": 176,
            "posY": 172
          },
          {
            "id": "GeneShuffler",
            "posX": 145,
            "posY": 146
          },
          {
            "id": "GeneShuffler",
            "posX": 207,
            "posY": 204
          },
          {
            "id": "GeneShuffler",
            "posX": 76,
            "posY": 274
          },
          {
            "id": "GeneShuffler",
            "posX": 220,
            "posY": 132
          },
          {
            "id": "GeneShuffler",
            "posX": 65,
            "posY": 336
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 166,
            "posY": 191,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 42,
            "posY": 319,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 196,
            "posY": 270,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 166,
            "posY": 273,
            "emitRate": 4682.895,
            "idleTime": 248.54887,
            "eruptionTime": 272.73206,
            "dormancyCycles": 57.812916,
            "activeCycles": 81.62387
          },
          {
            "id": "methane",
            "posX": 90,
            "posY": 247,
            "emitRate": 309.51596,
            "idleTime": 298.28766,
            "eruptionTime": 346.43243,
            "dormancyCycles": 24.4542,
            "activeCycles": 45.331783
          },
          {
            "id": "steam",
            "posX": 117,
            "posY": 276,
            "emitRate": 5537.8037,
            "idleTime": 177.99748,
            "eruptionTime": 130.66298,
            "dormancyCycles": 42.54108,
            "activeCycles": 89.59346
          },
          {
            "id": "methane",
            "posX": 22,
            "posY": 314,
            "emitRate": 427.81284,
            "idleTime": 119.70083,
            "eruptionTime": 92.28481,
            "dormancyCycles": 35.113403,
            "activeCycles": 68.73594
          },
          {
            "id": "salt_water",
            "posX": 46,
            "posY": 99,
            "emitRate": 11325.124,
            "idleTime": 238.4286,
            "eruptionTime": 197.94102,
            "dormancyCycles": 37.787174,
            "activeCycles": 67.28239
          },
          {
            "id": "chlorine_gas",
            "posX": 150,
            "posY": 180,
            "emitRate": 379.52243,
            "idleTime": 410.85318,
            "eruptionTime": 372.44046,
            "dormancyCycles": 43.306763,
            "activeCycles": 51.693783
          },
          {
            "id": "chlorine_gas",
            "posX": 43,
            "posY": 274,
            "emitRate": 275.34775,
            "idleTime": 278.4518,
            "eruptionTime": 526.88086,
            "dormancyCycles": 43.606415,
            "activeCycles": 62.122036
          },
          {
            "id": "steam",
            "posX": 39,
            "posY": 208,
            "emitRate": 4630.768,
            "idleTime": 232.36382,
            "eruptionTime": 173.1205,
            "dormancyCycles": 50.90808,
            "activeCycles": 72.199814
          },
          {
            "id": "molten_cobalt",
            "posX": 16,
            "posY": 191,
            "emitRate": 14295.292,
            "idleTime": 718.1081,
            "eruptionTime": 29.080019,
            "dormancyCycles": 37.746254,
            "activeCycles": 63.34332
          },
          {
            "id": "chlorine_gas",
            "posX": 123,
            "posY": 331,
            "emitRate": 230.23282,
            "idleTime": 141.39032,
            "eruptionTime": 517.18634,
            "dormancyCycles": 34.143517,
            "activeCycles": 61.8125
          },
          {
            "id": "molten_cobalt",
            "posX": 163,
            "posY": 338,
            "emitRate": 14295.292,
            "idleTime": 718.1081,
            "eruptionTime": 29.080019,
            "dormancyCycles": 37.746254,
            "activeCycles": 63.34332
          },
          {
            "id": "hot_steam",
            "posX": 57,
            "posY": 314,
            "emitRate": 1835.9038,
            "idleTime": 222.39055,
            "eruptionTime": 293.30185,
            "dormancyCycles": 52.042713,
            "activeCycles": 86.10581
          },
          {
            "id": "hot_hydrogen",
            "posX": 192,
            "posY": 161,
            "emitRate": 579.2497,
            "idleTime": 499.30624,
            "eruptionTime": 216.51566,
            "dormancyCycles": 36.34437,
            "activeCycles": 61.237606
          },
          {
            "id": "steam",
            "posX": 30,
            "posY": 333,
            "emitRate": 3714.9895,
            "idleTime": 341.17194,
            "eruptionTime": 373.6925,
            "dormancyCycles": 51.210907,
            "activeCycles": 105.22619
          },
          {
            "id": "big_volcano",
            "posX": 81,
            "posY": 213,
            "emitRate": 290697.78,
            "idleTime": 10463.788,
            "eruptionTime": 69.99327,
            "dormancyCycles": 54.67546,
            "activeCycles": 61.421688
          },
          {
            "id": "molten_copper",
            "posX": 217,
            "posY": 176,
            "emitRate": 14613.205,
            "idleTime": 796.92255,
            "eruptionTime": 29.838968,
            "dormancyCycles": 49.026794,
            "activeCycles": 61.496037
          },
          {
            "id": "big_volcano",
            "posX": 119,
            "posY": 117,
            "emitRate": 241297.38,
            "idleTime": 8452.019,
            "eruptionTime": 68.29034,
            "dormancyCycles": 70.181015,
            "activeCycles": 111.60278
          },
          {
            "id": "OilWell",
            "posX": 175,
            "posY": 111,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 167,
            "posY": 90,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 167,
            "posY": 134,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 144,
            "posY": 186,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 227,
            "posY": 195,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 90,
            "posY": 176,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 76,
            "posY": 222,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 63,
            "posY": 184,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 4,
            "posY": 186,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 167,
            "posY": 227,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 116,
            "posY": 296,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 33,
            "posY": 210,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 110,
            "posY": 154,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 210,
            "posY": 267,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 64,
            "posY": 266,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 28,
            "posY": 264,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 36,
            "posY": 301,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 45,
            "posY": 313,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 184,
            "posY": 306,
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
          "MetalRich",
          "CrashedSatellites"
        ],
        "biomePaths": "Sandstone:90,110 91,108 85,93 65,96 64,110 69,116;81,74 84,65 76,55 59,60 56,69 62,78;93,129 90,110 69,116 69,127 80,135;109,106 113,93 105,83 88,86 85,93 91,108;64,110 65,96 60,89 42,92 39,104 45,114;110,129 115,115 109,106 91,108 90,110 93,129 100,132;85,93 88,86 81,74 62,78 60,89 65,96;51,134 44,122 23,128 24,135 37,147;39,104 42,92 35,82 22,84 15,96 23,106;44,122 45,114 39,104 23,106 18,122 23,128;69,127 69,116 64,110 45,114 44,122 51,134 56,136;123,91 133,72 133,68 108,71 105,83 113,93\nToxicJungle:102,60 104,52 97,41 79,41 78,41 76,55 84,65;133,68 133,67 133,66 119,48 104,52 102,60 108,71;76,55 78,41 56,36 50,45 59,60;41,46 28,32 14,44 22,59 33,60;56,69 59,60 50,45 41,46 33,60 40,71;35,82 40,71 33,60 22,59 13,70 22,84;160,88 148,89 137,102 137,108 160,115;160,126 160,115 137,108 132,115 136,131 139,133;15,96 22,84 13,70 0,70 0,97;160,46 144,45 133,66 133,67 160,67;160,88 160,67 133,67 133,68 133,72 148,89;18,122 23,106 15,96 0,97 0,122;13,70 22,59 14,44 0,42 0,70\nWasteland:105,83 108,71 102,60 84,65 81,74 88,86;60,89 62,78 56,69 40,71 35,82 42,92;132,115 137,108 137,102 123,91 113,93 109,106 115,115;136,131 132,115 115,115 110,129 121,138;144,45 138,37 123,39 119,48 133,66;148,89 133,72 123,91 137,102\nRadioactive:79,150 80,135 69,127 56,136 63,154;99,152 100,132 93,129 80,135 79,150 85,155;120,152 121,138 110,129 100,132 99,152 104,156;63,155 63,154 56,136 51,134 37,147 37,153 44,160;85,155 79,150 63,154 63,155 67,176 84,176;141,155 144,152 139,133 136,131 121,138 120,152 124,156;160,152 160,126 139,133 144,152;24,135 23,128 18,122 0,122 0,148 9,149;37,153 37,147 24,135 9,149 22,161;44,160 37,153 22,161 20,176 43,176;160,152 144,152 141,155 144,176 160,176;63,155 44,160 43,176 67,176;141,155 124,156 123,176 144,176\nFrozenWastes:104,156 99,152 85,155 84,176 104,176;124,156 120,152 104,156 104,176 123,176;22,161 9,149 0,148 0,176 20,176",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 62,
            "posY": 85
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 75,
            "posY": 130
          },
          {
            "id": "WarpPortal",
            "posX": 66,
            "posY": 108
          },
          {
            "id": "WarpReceiver",
            "posX": 85,
            "posY": 108
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 117,
            "posY": 62
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 54,
            "posY": 64
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 58,
            "posY": 44
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 54,
            "posY": 163,
            "emitRate": 405.64154,
            "idleTime": 324.37656,
            "eruptionTime": 435.00632,
            "dormancyCycles": 44.675518,
            "activeCycles": 72.83175
          },
          {
            "id": "liquid_co2",
            "posX": 126,
            "posY": 160,
            "emitRate": 615.57855,
            "idleTime": 460.7343,
            "eruptionTime": 303.344,
            "dormancyCycles": 47.129948,
            "activeCycles": 70.94849
          },
          {
            "id": "steam",
            "posX": 29,
            "posY": 75,
            "emitRate": 3818.9724,
            "idleTime": 223.929,
            "eruptionTime": 317.3714,
            "dormancyCycles": 72.443924,
            "activeCycles": 79.4793
          },
          {
            "id": "molten_gold",
            "posX": 125,
            "posY": 143,
            "emitRate": 9790.583,
            "idleTime": 748.5024,
            "eruptionTime": 42.976692,
            "dormancyCycles": 54.770718,
            "activeCycles": 94.46961
          },
          {
            "id": "molten_aluminum",
            "posX": 116,
            "posY": 144,
            "emitRate": 9227.05,
            "idleTime": 761.0808,
            "eruptionTime": 43.95613,
            "dormancyCycles": 60.81041,
            "activeCycles": 76.516624
          },
          {
            "id": "hot_water",
            "posX": 74,
            "posY": 144,
            "emitRate": 24108.574,
            "idleTime": 413.09286,
            "eruptionTime": 110.92917,
            "dormancyCycles": 61.06464,
            "activeCycles": 79.031624
          },
          {
            "id": "slush_water",
            "posX": 92,
            "posY": 81,
            "emitRate": 5264.8506,
            "idleTime": 169.94104,
            "eruptionTime": 195.46063,
            "dormancyCycles": 12.259657,
            "activeCycles": 22.862045
          },
          {
            "id": "slimy_po2",
            "posX": 144,
            "posY": 82,
            "emitRate": 405.67197,
            "idleTime": 167.19836,
            "eruptionTime": 129.47717,
            "dormancyCycles": 54.56016,
            "activeCycles": 104.57213
          },
          {
            "id": "chlorine_gas",
            "posX": 150,
            "posY": 138,
            "emitRate": 380.9743,
            "idleTime": 300.3827,
            "eruptionTime": 248.0998,
            "dormancyCycles": 44.77351,
            "activeCycles": 58.831043
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
        "biomePaths": "FrozenWastes:64,62 64,45 46,49 45,62 46,63;40,43 41,34 31,28 19,34 17,40 23,51;49,78 46,63 45,62 34,65 29,73 37,85 42,86;45,62 46,49 40,43 23,51 23,51 34,65;44,107 48,96 42,86 37,85 27,94 31,108;37,85 29,73 18,75 13,82 18,92 27,94;64,62 46,63 49,78 64,80;64,45 64,35 48,30 41,34 40,43 46,49;64,95 64,80 49,78 42,86 48,96;29,73 34,65 23,51 12,61 18,75;23,51 23,51 17,40 0,42 0,60 12,61;18,75 12,61 0,60 0,81 13,82;64,112 64,95 48,96 44,107 48,112;30,109 31,108 27,94 18,92 8,104 16,112;18,92 13,82 0,81 0,104 8,104\nForest:48,112 44,107 31,108 30,109 32,128 46,128;30,109 16,112 14,128 32,128;16,112 8,104 0,104 0,128 14,128;64,112 48,112 46,128 64,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 25,
            "posY": 47
          },
          {
            "id": "GravitasPedestal",
            "posX": 38,
            "posY": 104
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 40,
            "posY": 54,
            "emitRate": 9519.06,
            "idleTime": 863.22534,
            "eruptionTime": 49.018456,
            "dormancyCycles": 71.69186,
            "activeCycles": 92.6652
          },
          {
            "id": "molten_iron",
            "posX": 29,
            "posY": 82,
            "emitRate": 11246.385,
            "idleTime": 746.23157,
            "eruptionTime": 32.280437,
            "dormancyCycles": 49.895622,
            "activeCycles": 81.25093
          },
          {
            "id": "molten_iron",
            "posX": 49,
            "posY": 69,
            "emitRate": 10760.519,
            "idleTime": 670.69977,
            "eruptionTime": 32.440536,
            "dormancyCycles": 52.92506,
            "activeCycles": 81.272705
          },
          {
            "id": "molten_iron",
            "posX": 39,
            "posY": 90,
            "emitRate": 8197.106,
            "idleTime": 620.8421,
            "eruptionTime": 38.01163,
            "dormancyCycles": 23.975847,
            "activeCycles": 36.899113
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
        "biomePaths": "BoggyMarsh:41,50 44,40 43,39 30,33 20,38 18,45 21,51 30,55;47,68 49,60 41,50 30,55 32,72;64,57 64,42 44,40 41,50 49,60;31,74 32,72 30,55 21,51 13,63 22,76;64,57 49,60 47,68 54,78 64,79;13,63 21,51 18,45 0,45 0,64\nFrozenWastes:42,90 31,74 22,76 19,80 21,96 41,96;19,80 0,82 0,96 21,96;64,79 54,78 42,90 41,96 64,96\nToxicJungle:19,80 22,76 13,63 0,64 0,82;54,78 47,68 32,72 31,74 42,90",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 36,
            "posY": 46
          },
          {
            "id": "GravitasPedestal",
            "posX": 22,
            "posY": 46
          },
          {
            "id": "SapTree",
            "posX": 29,
            "posY": 46
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 16,
            "posY": 90,
            "emitRate": 6733.0884,
            "idleTime": 614.2266,
            "eruptionTime": 48.737137,
            "dormancyCycles": 27.433525,
            "activeCycles": 39.088623
          },
          {
            "id": "molten_tungsten",
            "posX": 5,
            "posY": 90,
            "emitRate": 10642.748,
            "idleTime": 826.4404,
            "eruptionTime": 42.837265,
            "dormancyCycles": 56.03843,
            "activeCycles": 81.36916
          },
          {
            "id": "molten_tungsten",
            "posX": 56,
            "posY": 89,
            "emitRate": 9225.084,
            "idleTime": 638.58795,
            "eruptionTime": 40.750134,
            "dormancyCycles": 46.66519,
            "activeCycles": 99.09238
          },
          {
            "id": "hot_hydrogen",
            "posX": 9,
            "posY": 73,
            "emitRate": 285.3551,
            "idleTime": 93.885185,
            "eruptionTime": 165.93152,
            "dormancyCycles": 31.11236,
            "activeCycles": 66.5991
          },
          {
            "id": "hot_hydrogen",
            "posX": 28,
            "posY": 67,
            "emitRate": 399.3835,
            "idleTime": 293.34042,
            "eruptionTime": 253.35909,
            "dormancyCycles": 55.41232,
            "activeCycles": 69.40384
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
        "biomePaths": "MagmaCore:31,61 37,53 30,42 19,44 15,56 19,61;64,40 52,40 46,53 52,60 64,61;46,53 52,40 46,33 34,34 30,42 37,53;52,60 46,53 37,53 31,61 37,73 45,74;15,56 19,44 13,37 0,37 0,57;37,73 31,61 19,61 15,75 17,77 31,79;19,61 15,56 0,57 0,75 15,75;64,79 49,79 46,96 64,96;64,61 52,60 45,74 49,79 64,79\nOilField:31,79 17,77 15,96 34,96;17,77 15,75 0,75 0,96 15,96;49,79 45,74 37,73 31,79 34,96 46,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 15,
            "posY": 81
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 35,
            "posY": 86,
            "emitRate": 233283.98,
            "idleTime": 7550.8643,
            "eruptionTime": 53.44465,
            "dormancyCycles": 35.818512,
            "activeCycles": 73.164635
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
        "biomePaths": "Moo:80,50 82,35 76,29 64,35 64,47 79,50;64,47 64,35 56,30 44,36 44,48 46,50 60,51;63,63 60,51 46,50 44,65 52,73;44,48 44,36 36,30 22,37 23,44 30,50;44,65 46,50 44,48 30,50 29,67;29,67 30,50 23,44 13,51 15,64 27,69;96,52 80,50 79,50 77,65 96,67;23,44 22,37 16,31 0,35 0,48 13,51;96,33 82,35 80,50 96,52;15,64 13,51 0,48 0,73;77,65 79,50 64,47 60,51 63,63 75,67\nFrozenWastes:75,67 63,63 52,73 53,80 75,80;52,73 44,65 29,67 27,69 27,80 53,80;27,69 15,64 0,73 0,80 27,80;96,67 77,65 75,67 75,80 96,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 20,
            "posY": 41
          },
          {
            "id": "GravitasPedestal",
            "posX": 13,
            "posY": 41
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 11,
            "posY": 56,
            "emitRate": 294.97757,
            "idleTime": 39.275272,
            "eruptionTime": 44.657284,
            "dormancyCycles": 39.906837,
            "activeCycles": 54.600906
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
        "biomePaths": "Barren:80,91 80,71 66,71 60,81 68,91;80,91 68,91 61,102 67,112 80,112;68,91 60,81 51,82 47,98 51,102 61,102;51,102 47,98 35,98 30,110 35,117 46,117;67,112 61,102 51,102 46,117 51,123 61,123;80,132 80,112 67,112 61,123 68,133;30,91 34,81 27,71 20,71 13,83 19,91;30,110 35,98 30,91 19,91 13,102 19,110;29,130 35,117 30,110 19,110 13,121 20,131;62,142 68,133 61,123 51,123 45,137 51,143;45,137 51,123 46,117 35,117 29,130 36,137;60,81 66,71 60,60 52,60 47,64 47,79 51,82;80,71 80,52 67,52 60,60 66,71;47,79 47,64 34,62 27,71 34,81;20,71 15,66 0,66 0,83 13,83;13,102 19,91 13,83 0,83 0,102;67,52 61,39 53,39 47,46 52,60 60,60;52,60 47,46 36,45 31,52 34,62 47,64;34,62 31,52 18,51 15,66 20,71 27,71;51,82 47,79 34,81 30,91 35,98 47,98;18,34 16,32 0,33 0,48 17,49;53,39 47,28 34,29 31,33 36,45 47,46;59,164 48,156 39,159 37,174 60,174;80,155 69,154 59,164 60,174 80,174;39,159 29,152 22,153 18,157 20,174 37,174;80,34 66,34 61,39 67,52 80,52;14,139 20,131 13,121 0,121 0,140;18,157 0,157 0,174 20,174;15,66 18,51 17,49 0,48 0,66;36,45 31,33 18,34 17,49 18,51 31,52;13,121 19,110 13,102 0,102 0,121\nSwamp:80,132 68,133 62,142 69,154 80,155;48,156 51,143 45,137 36,137 29,152 39,159;69,154 62,142 51,143 48,156 59,164;29,152 36,137 29,130 20,131 14,139 22,153;18,157 22,153 14,139 0,140 0,157",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 48,
            "posY": 147
          },
          {
            "id": "GravitasPedestal",
            "posX": 50,
            "posY": 147
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 15,
            "posY": 71,
            "emitRate": 9147.582,
            "idleTime": 135.18579,
            "eruptionTime": 202.48264,
            "dormancyCycles": 55.025326,
            "activeCycles": 53.27029
          },
          {
            "id": "filthy_water",
            "posX": 45,
            "posY": 107,
            "emitRate": 9853.887,
            "idleTime": 242.13841,
            "eruptionTime": 277.15936,
            "dormancyCycles": 82.24044,
            "activeCycles": 111.71101
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
        "biomePaths": "Sandstone:49,65 51,57 43,50 34,52 29,61 37,70;63,76 70,62 61,54 51,57 49,65 59,77;57,81 59,77 49,65 37,70 35,78 39,83\nBarren:85,76 77,61 70,62 63,76 77,83;96,55 82,55 77,61 85,76 96,76;18,80 17,64 0,65 0,82;17,64 18,63 14,48 0,47 0,65;35,78 37,70 29,61 18,63 17,64 18,80 20,81\nFrozenWastes:96,76 85,76 77,83 77,96 96,96;77,83 63,76 59,77 57,81 59,96 77,96;39,83 35,78 20,81 20,96 38,96;20,81 18,80 0,82 0,96 20,96;57,81 39,83 38,96 59,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 22,
            "posY": 72
          },
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 72
          },
          {
            "id": "GeneShuffler",
            "posX": 24,
            "posY": 66
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 32,
            "posY": 84,
            "emitRate": 4392.3994,
            "idleTime": 425.1042,
            "eruptionTime": 181.05957,
            "dormancyCycles": 70.040565,
            "activeCycles": 117.56082
          },
          {
            "id": "hot_steam",
            "posX": 63,
            "posY": 82,
            "emitRate": 4005.422,
            "idleTime": 303.4875,
            "eruptionTime": 172.58617,
            "dormancyCycles": 24.938377,
            "activeCycles": 39.34423
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
        "r": 2
      },
      {
        "id": "TundraMoonlet",
        "q": 0,
        "r": -5
      },
      {
        "id": "MarshyMoonlet",
        "q": 5,
        "r": -6
      },
      {
        "id": "NiobiumMoonlet",
        "q": -5,
        "r": -1
      },
      {
        "id": "MooMoonlet",
        "q": -3,
        "r": 6
      },
      {
        "id": "WaterMoonlet",
        "q": 4,
        "r": 2
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 0,
        "r": 8
      },
      {
        "id": "TemporalTear",
        "q": -4,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 2,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 7,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 8,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 5,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 9,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 8,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -10,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -1,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -5,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -6,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 0,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -7,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -3,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 5,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -10,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -10,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -11,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -10,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -6,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 0,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 3,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": -2,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 11,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 2,
        "r": -4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -8,
        "r": 11
      }
    ]
  },
  {
    "coordinate": "V-CERS-C-339958631-0-0-0",
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
          "Geodes",
          "BouldersMedium",
          "BouldersLarge"
        ],
        "biomePaths": "IceCaves:131,158 144,141 136,120 117,115 105,124 101,147 116,158;116,158 101,147 97,149 94,169 109,176;94,169 97,149 76,142 72,145 68,165 81,176;161,180 154,164 135,164 128,180 135,192 146,194;135,164 131,158 116,158 109,176 110,177 128,180;76,142 79,123 63,112 49,125 52,138 72,145;68,165 72,145 52,138 40,152 53,169;187,132 191,112 180,101 171,103 161,123 162,126 182,135;162,126 161,123 140,117 136,120 144,141 148,142;186,171 187,162 179,152 158,157 154,164 161,180 170,183;101,147 105,124 93,117 79,123 76,142 97,149;93,117 95,102 76,93 62,104 63,112 79,123;156,91 156,79 135,71 126,79 128,97 139,102;140,117 139,102 128,97 116,106 117,115 136,120;128,97 126,79 107,73 104,76 100,99 116,106;158,157 148,142 144,141 131,158 135,164 154,164;179,152 182,135 162,126 148,142 158,157;117,115 116,106 100,99 95,102 93,117 105,124;103,198 110,177 109,176 94,169 81,176 79,188 92,202;135,192 128,180 110,177 103,198 121,210;100,99 104,76 81,70 76,75 76,93 95,102;171,103 156,91 139,102 140,117 161,123\nFrozenWastes:52,138 49,125 31,119 28,121 23,145 31,152 40,152;79,188 81,176 68,165 53,169 48,182 59,197;48,182 53,169 40,152 31,152 21,170 30,185;211,187 219,175 210,154 187,162 186,171 204,188;204,188 186,171 170,183 178,203 191,205;240,174 240,148 212,149 210,154 219,175;117,226 122,219 121,210 103,198 92,202 88,214 99,229;147,242 143,224 122,219 117,226 125,249 138,251;180,101 187,85 183,76 163,72 156,79 156,91 171,103;88,214 92,202 79,188 59,197 57,205 72,219;178,203 170,183 161,180 146,194 155,213 166,215;210,107 213,99 209,87 187,85 180,101 191,112\nOcean:57,205 59,197 48,182 30,185 25,197 28,205 46,211;199,219 191,205 178,203 166,215 174,233 188,235;240,204 224,204 212,220 222,235 240,235;44,236 46,211 28,205 16,225 28,238;222,235 212,220 199,219 188,235 195,248 212,249;67,236 72,219 57,205 46,211 44,236 50,240\nCarrotQuarry:31,119 32,101 26,95 0,100 0,116 28,121;63,112 62,104 50,95 32,101 31,119 49,125;210,154 212,149 209,139 187,132 182,135 179,152 187,162;219,124 210,107 191,112 187,132 209,139;26,95 25,71 0,71 0,100;76,93 76,75 53,71 52,72 50,95 62,104;155,213 146,194 135,192 121,210 122,219 143,224\nRust:23,145 28,121 0,116 0,145;21,170 31,152 23,145 0,145 0,170;93,243 99,229 88,214 72,219 67,236 79,247;28,205 25,197 0,195 0,225 16,225\nRadioactive:240,148 240,124 219,124 209,139 212,149;240,98 213,99 210,107 219,124 240,124;240,204 240,174 219,175 211,187 224,204;30,185 21,170 0,170 0,195 25,197;224,204 211,187 204,188 191,205 199,219 212,220;174,233 166,215 155,213 143,224 147,242 163,245\nSugarWoods:240,98 240,76 215,75 209,87 213,99;53,71 55,51 33,42 27,49 27,70 52,72;50,95 52,72 27,70 25,71 26,95 32,101;215,75 210,62 192,59 183,76 187,85 209,87;240,50 219,50 210,62 215,75 240,76;27,70 27,49 0,44 0,71 25,71;192,59 188,50 171,46 162,53 163,72 183,76;135,71 135,55 117,48 109,53 107,73 126,79;163,72 162,53 144,48 135,55 135,71 156,79;81,70 81,53 63,45 55,51 53,71 76,75;107,73 109,53 91,46 81,53 81,70 104,76\nMagmaCore:119,281 109,268 87,279 88,294 109,302;88,294 87,279 73,270 62,273 56,288 59,297 79,302;62,273 48,261 29,268 28,284 56,288;28,284 29,268 20,259 0,261 0,287 25,287;240,294 240,265 221,265 211,280 218,294;212,306 218,294 211,280 192,279 184,294 191,306;168,294 161,273 144,272 136,281 142,301 160,303;192,279 185,264 170,263 161,273 168,294 184,294;142,301 136,281 119,281 109,302 110,304 134,310\nOilField:102,325 110,304 109,302 88,294 79,302 81,320 99,327;81,320 79,302 59,297 51,311 55,325 69,329;28,308 25,287 0,287 0,315 21,316;46,352 43,337 26,331 11,348 27,363;219,323 212,306 191,306 184,326 210,335;240,350 240,324 219,323 210,335 212,349 215,352;124,350 124,336 102,325 99,327 93,350 109,359;240,350 215,352 217,380 240,380;83,354 73,350 55,358 57,380 82,380;109,359 93,350 83,354 82,380 109,380\nForest:136,326 134,310 110,304 102,325 124,336;11,348 26,331 21,316 0,315 0,349;27,363 11,348 0,349 0,380 26,380;59,297 56,288 28,284 25,287 28,308 51,311;212,349 210,335 184,326 183,327 179,349 190,357;55,325 51,311 28,308 21,316 26,331 43,337;137,358 124,350 109,359 109,380 138,380;154,349 152,332 136,326 124,336 124,350 137,358;179,349 183,327 165,322 152,332 154,349 164,355;165,322 160,303 142,301 134,310 136,326 152,332;215,352 212,349 190,357 190,380 217,380;164,355 154,349 137,358 138,380 164,380;73,350 69,329 55,325 43,337 46,352 55,358\nSandstone:93,350 99,327 81,320 69,329 73,350 83,354;240,294 218,294 212,306 219,323 240,324;184,326 191,306 184,294 168,294 160,303 165,322 183,327;190,357 179,349 164,355 164,380 190,380;55,358 46,352 27,363 26,380 57,380",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 122,
            "posY": 139
          },
          {
            "id": "WarpConduitSender",
            "posX": 214,
            "posY": 187
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 101,
            "posY": 223
          },
          {
            "id": "MassiveHeatSink",
            "posX": 207,
            "posY": 102
          },
          {
            "id": "MassiveHeatSink",
            "posX": 165,
            "posY": 82
          },
          {
            "id": "MassiveHeatSink",
            "posX": 125,
            "posY": 225
          },
          {
            "id": "GravitasPedestal",
            "posX": 52,
            "posY": 228
          },
          {
            "id": "WarpReceiver",
            "posX": 40,
            "posY": 121
          },
          {
            "id": "WarpPortal",
            "posX": 39,
            "posY": 115
          },
          {
            "id": "GeneShuffler",
            "posX": 165,
            "posY": 212
          },
          {
            "id": "GeneShuffler",
            "posX": 80,
            "posY": 193
          }
        ],
        "geysers": [
          {
            "id": "slush_salt_water",
            "posX": 48,
            "posY": 189,
            "emitRate": 9055.074,
            "idleTime": 429.2423,
            "eruptionTime": 186.6084,
            "dormancyCycles": 55.200424,
            "activeCycles": 72.6977
          },
          {
            "id": "OilWell",
            "posX": 25,
            "posY": 351,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 69,
            "posY": 325,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 109,
            "posY": 356,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "molten_copper",
            "posX": 187,
            "posY": 334,
            "emitRate": 7465.3833,
            "idleTime": 784.4638,
            "eruptionTime": 59.46883,
            "dormancyCycles": 42.16944,
            "activeCycles": 65.75052
          },
          {
            "id": "slush_water",
            "posX": 19,
            "posY": 79,
            "emitRate": 4183.184,
            "idleTime": 240.31982,
            "eruptionTime": 288.49982,
            "dormancyCycles": 51.972656,
            "activeCycles": 99.55049
          },
          {
            "id": "slush_water",
            "posX": 221,
            "posY": 103,
            "emitRate": 6620.8755,
            "idleTime": 403.2503,
            "eruptionTime": 210.94897,
            "dormancyCycles": 66.79887,
            "activeCycles": 83.89346
          },
          {
            "id": "hot_hydrogen",
            "posX": 213,
            "posY": 125,
            "emitRate": 477.67575,
            "idleTime": 439.17896,
            "eruptionTime": 253.01575,
            "dormancyCycles": 45.12909,
            "activeCycles": 74.65509
          },
          {
            "id": "methane",
            "posX": 200,
            "posY": 215,
            "emitRate": 495.07635,
            "idleTime": 382.45004,
            "eruptionTime": 222.88191,
            "dormancyCycles": 54.800293,
            "activeCycles": 66.024475
          },
          {
            "id": "oil_drip",
            "posX": 222,
            "posY": 70,
            "emitRate": 295.00162,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.1439134,
            "activeCycles": 0.22365738
          },
          {
            "id": "small_volcano",
            "posX": 91,
            "posY": 233,
            "emitRate": 132777.58,
            "idleTime": 8394.654,
            "eruptionTime": 61.223003,
            "dormancyCycles": 39.45076,
            "activeCycles": 73.81962
          },
          {
            "id": "filthy_water",
            "posX": 60,
            "posY": 97,
            "emitRate": 8059.137,
            "idleTime": 152.76006,
            "eruptionTime": 202.50954,
            "dormancyCycles": 62.619087,
            "activeCycles": 79.85254
          },
          {
            "id": "slush_salt_water",
            "posX": 49,
            "posY": 218,
            "emitRate": 4722.074,
            "idleTime": 271.4535,
            "eruptionTime": 264.50916,
            "dormancyCycles": 49.385902,
            "activeCycles": 80.09719
          },
          {
            "id": "steam",
            "posX": 41,
            "posY": 331,
            "emitRate": 2986.8286,
            "idleTime": 263.14368,
            "eruptionTime": 475.26434,
            "dormancyCycles": 79.12216,
            "activeCycles": 63.258007
          },
          {
            "id": "molten_aluminum",
            "posX": 184,
            "posY": 57,
            "emitRate": 10048.557,
            "idleTime": 666.176,
            "eruptionTime": 38.649204,
            "dormancyCycles": 61.707123,
            "activeCycles": 81.167305
          },
          {
            "id": "molten_copper",
            "posX": 53,
            "posY": 334,
            "emitRate": 10880.613,
            "idleTime": 735.7977,
            "eruptionTime": 37.331158,
            "dormancyCycles": 66.02076,
            "activeCycles": 70.091286
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
          "CrashedSatellites",
          "MetalCaves"
        ],
        "biomePaths": "Swamp:98,105 98,94 85,86 72,94 73,107 86,114;111,85 110,73 97,66 85,73 85,86 98,94;61,88 60,76 43,68 38,72 38,91 47,96;85,86 85,73 72,65 60,76 61,88 72,94;107,130 112,114 98,105 86,114 86,126 97,133;118,112 124,93 111,85 98,94 98,105 112,114;86,126 86,114 73,107 61,115 64,131 73,135;133,135 135,121 118,112 112,114 107,130 118,140;73,107 72,94 61,88 47,96 48,110 61,115;48,110 47,96 38,91 24,96 21,102 25,113 40,117\nBoggyMarsh:81,45 71,32 55,38 55,50 71,59;144,54 137,44 118,45 118,46 120,66 135,70;55,50 55,38 50,33 32,37 28,44 44,58;43,68 44,58 28,44 25,45 17,56 23,70 38,72;15,80 23,70 17,56 0,56 0,80\nToxicJungle:97,66 97,49 93,45 81,45 71,59 72,65 85,73;120,66 118,46 97,49 97,66 110,73;132,91 138,76 135,70 120,66 110,73 111,85 124,93;160,54 144,54 135,70 138,76 160,79;160,95 160,79 138,76 132,91 142,99;140,117 142,99 132,91 124,93 118,112 135,121\nWasteland:72,65 71,59 55,50 44,58 43,68 60,76;38,91 38,72 23,70 15,80 24,96;160,137 160,122 140,117 135,121 133,135 140,141;139,156 140,141 133,135 118,140 116,153 129,165;116,153 118,140 107,130 97,133 93,152 101,159;64,131 61,115 48,110 40,117 41,133 52,138;77,153 73,135 64,131 52,138 52,154 74,157;93,152 97,133 86,126 73,135 77,153;52,154 52,138 41,133 26,140 29,154 49,158;160,137 140,141 139,156 160,164\nFrozenWastes:160,95 142,99 140,117 160,122;21,102 24,96 15,80 0,80 0,103;25,113 21,102 0,103 0,122 17,123;41,133 40,117 25,113 17,123 23,139 26,140;23,139 17,123 0,122 0,146\nMagmaCore:129,165 116,153 101,159 99,176 128,176;101,159 93,152 77,153 74,157 75,176 99,176;74,157 52,154 49,158 49,176 75,176;160,164 139,156 129,165 128,176 160,176;49,158 29,154 24,161 25,176 49,176;24,161 0,156 0,176 25,176\nBarren:29,154 26,140 23,139 0,146 0,156 24,161",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 35,
            "posY": 122
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 44,
            "posY": 101
          },
          {
            "id": "WarpConduitSender",
            "posX": 72,
            "posY": 122
          },
          {
            "id": "WarpReceiver",
            "posX": 93,
            "posY": 104
          },
          {
            "id": "WarpPortal",
            "posX": 71,
            "posY": 104
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 94,
            "posY": 57
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 35,
            "posY": 68
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 136,
            "posY": 53
          },
          {
            "id": "GeneShuffler",
            "posX": 17,
            "posY": 117
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 120,
            "posY": 108,
            "emitRate": 5011.983,
            "idleTime": 306.67825,
            "eruptionTime": 324.83743,
            "dormancyCycles": 44.5537,
            "activeCycles": 67.27521
          },
          {
            "id": "methane",
            "posX": 115,
            "posY": 79,
            "emitRate": 353.43088,
            "idleTime": 354.1186,
            "eruptionTime": 293.20178,
            "dormancyCycles": 50.749897,
            "activeCycles": 69.83347
          },
          {
            "id": "methane",
            "posX": 8,
            "posY": 75,
            "emitRate": 373.5817,
            "idleTime": 309.08154,
            "eruptionTime": 257.2229,
            "dormancyCycles": 41.83635,
            "activeCycles": 79.78127
          },
          {
            "id": "molten_aluminum",
            "posX": 18,
            "posY": 138,
            "emitRate": 9996.481,
            "idleTime": 823.1322,
            "eruptionTime": 45.213413,
            "dormancyCycles": 30.374668,
            "activeCycles": 64.16298
          },
          {
            "id": "molten_gold",
            "posX": 145,
            "posY": 114,
            "emitRate": 7296.301,
            "idleTime": 649.9167,
            "eruptionTime": 48.54135,
            "dormancyCycles": 55.20951,
            "activeCycles": 60.723522
          },
          {
            "id": "molten_iron",
            "posX": 58,
            "posY": 125,
            "emitRate": 9051.183,
            "idleTime": 720.5032,
            "eruptionTime": 40.777115,
            "dormancyCycles": 41.83635,
            "activeCycles": 79.78127
          },
          {
            "id": "filthy_water",
            "posX": 57,
            "posY": 104,
            "emitRate": 12069.321,
            "idleTime": 283.3688,
            "eruptionTime": 230.06233,
            "dormancyCycles": 47.190804,
            "activeCycles": 93.30027
          },
          {
            "id": "liquid_co2",
            "posX": 104,
            "posY": 107,
            "emitRate": 818.6777,
            "idleTime": 314.06024,
            "eruptionTime": 153.88962,
            "dormancyCycles": 33.0322,
            "activeCycles": 57.37006
          },
          {
            "id": "hot_hydrogen",
            "posX": 138,
            "posY": 88,
            "emitRate": 477.67575,
            "idleTime": 439.17896,
            "eruptionTime": 253.01575,
            "dormancyCycles": 45.12909,
            "activeCycles": 74.65509
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
        "biomePaths": "Ocean:64,57 64,40 50,39 44,56 47,58;44,56 50,39 46,34 35,34 29,44 39,56;39,56 29,44 20,46 15,61 17,63 30,65;20,46 13,39 0,39 0,60 15,61\nFrozenWastes:49,74 47,58 44,56 39,56 30,65 34,77 45,78;64,57 47,58 49,74 64,75;48,91 45,78 34,77 27,84 30,95 41,99;64,108 64,93 48,91 41,99 43,107 49,111;34,77 30,65 17,63 14,82 27,84;43,107 41,99 30,95 17,106 18,108 32,115;49,111 43,107 32,115 33,128 49,128;64,108 49,111 49,128 64,128;64,75 49,74 45,78 48,91 64,93;14,104 13,83 0,82 0,105;32,115 18,108 12,128 33,128;30,95 27,84 14,82 13,83 14,104 17,106;18,108 17,106 14,104 0,105 0,128 12,128;14,82 17,63 15,61 0,60 0,82 13,83",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 43,
            "posY": 53
          },
          {
            "id": "GravitasPedestal",
            "posX": 41,
            "posY": 120
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 34,
            "posY": 109,
            "emitRate": 7593.867,
            "idleTime": 673.8618,
            "eruptionTime": 55.280632,
            "dormancyCycles": 61.025097,
            "activeCycles": 139.1295
          },
          {
            "id": "molten_iron",
            "posX": 16,
            "posY": 103,
            "emitRate": 8745.863,
            "idleTime": 783.3713,
            "eruptionTime": 49.497967,
            "dormancyCycles": 47.659058,
            "activeCycles": 72.68246
          },
          {
            "id": "molten_iron",
            "posX": 49,
            "posY": 82,
            "emitRate": 10687.287,
            "idleTime": 756.2303,
            "eruptionTime": 41.465015,
            "dormancyCycles": 56.798927,
            "activeCycles": 118.69365
          },
          {
            "id": "molten_iron",
            "posX": 51,
            "posY": 107,
            "emitRate": 11229.791,
            "idleTime": 819.7144,
            "eruptionTime": 42.343777,
            "dormancyCycles": 29.99682,
            "activeCycles": 45.64645
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
          "MetalPoor"
        ],
        "biomePaths": "BoggyMarsh:35,57 32,44 20,42 15,49 19,62 21,64;40,36 31,25 19,28 17,32 20,42 32,44;64,41 51,41 47,58 64,62;47,58 51,41 44,36 40,36 32,44 35,57 43,61;20,42 17,32 0,33 0,48 15,49;22,74 21,64 19,62 0,66 0,78 16,81\nToxicJungle:42,74 43,61 35,57 21,64 22,74 32,78;19,62 15,49 0,48 0,66;64,76 64,62 47,58 43,61 42,74 48,79\nMagmaCore:32,78 22,74 16,81 17,96 32,96;48,79 42,74 32,78 32,96 48,96;64,76 48,79 48,96 64,96;16,81 0,78 0,96 17,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 32,
            "posY": 54
          },
          {
            "id": "GravitasPedestal",
            "posX": 18,
            "posY": 54
          },
          {
            "id": "SapTree",
            "posX": 25,
            "posY": 54
          },
          {
            "id": "GeneShuffler",
            "posX": 27,
            "posY": 68
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 56,
            "posY": 90,
            "emitRate": 12009.709,
            "idleTime": 607.9116,
            "eruptionTime": 26.763037,
            "dormancyCycles": 50.491016,
            "activeCycles": 85.51338
          },
          {
            "id": "molten_tungsten",
            "posX": 34,
            "posY": 90,
            "emitRate": 6616.928,
            "idleTime": 747.48724,
            "eruptionTime": 51.52435,
            "dormancyCycles": 64.344154,
            "activeCycles": 114.54525
          },
          {
            "id": "molten_tungsten",
            "posX": 45,
            "posY": 90,
            "emitRate": 9738.446,
            "idleTime": 808.4738,
            "eruptionTime": 47.481976,
            "dormancyCycles": 40.926174,
            "activeCycles": 70.98465
          },
          {
            "id": "methane",
            "posX": 44,
            "posY": 62,
            "emitRate": 456.05164,
            "idleTime": 393.5087,
            "eruptionTime": 302.082,
            "dormancyCycles": 26.42669,
            "activeCycles": 57.24628
          },
          {
            "id": "hot_hydrogen",
            "posX": 52,
            "posY": 55,
            "emitRate": 323.23758,
            "idleTime": 187.96497,
            "eruptionTime": 254.0261,
            "dormancyCycles": 40.566795,
            "activeCycles": 68.52199
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
        "biomePaths": "MagmaCore:43,54 48,45 43,32 42,32 26,40 34,54;64,27 43,32 48,45 64,45;34,54 26,40 22,39 13,53 19,62 28,62;22,39 19,35 0,34 0,52 13,53;16,80 12,74 0,74 0,96 12,96;34,76 28,62 19,62 12,74 16,80 30,80;48,80 45,75 34,76 30,80 33,96 46,96;30,80 16,80 12,96 33,96;64,79 48,80 46,96 64,96;64,79 64,62 49,63 45,75 48,80\nOilField:64,62 64,45 48,45 43,54 49,63;45,75 49,63 43,54 34,54 28,62 34,76;19,62 13,53 0,52 0,74 12,74",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 16,
            "posY": 62
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 50,
            "posY": 60,
            "emitRate": 309294.56,
            "idleTime": 8551.042,
            "eruptionTime": 57.719254,
            "dormancyCycles": 35.154312,
            "activeCycles": 57.30106
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
        "biomePaths": "Moo:83,45 78,37 64,35 61,47 73,58;96,63 96,46 83,45 73,58 73,60 77,64;61,47 64,35 63,34 49,30 42,37 41,43 51,52;73,60 73,58 61,47 51,52 49,61 57,69;41,43 42,37 29,28 18,38 19,43 30,50;30,61 30,50 19,43 7,55 17,64;49,61 51,52 41,43 30,50 30,61 36,66\nFrozenWastes:96,63 77,64 77,80 96,80;77,64 73,60 57,69 57,80 77,80;57,69 49,61 36,66 35,80 57,80;17,64 7,55 0,55 0,80 14,80;36,66 30,61 17,64 14,80 35,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 40,
            "posY": 57
          },
          {
            "id": "GravitasPedestal",
            "posX": 33,
            "posY": 57
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 71,
            "posY": 46,
            "emitRate": 339.0201,
            "idleTime": 295.68695,
            "eruptionTime": 410.96027,
            "dormancyCycles": 44.64228,
            "activeCycles": 54.48967
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
        "biomePaths": "Barren:52,78 47,62 41,60 31,70 36,82 46,83;21,68 18,62 0,61 0,79 14,80;68,69 60,56 47,62 52,78 61,78;36,82 31,70 21,68 14,80 19,89 28,90;67,88 61,78 52,78 46,83 50,98 60,99;80,68 80,50 61,51 60,56 68,69;60,56 61,51 58,43 43,40 37,51 41,60 47,62;41,60 37,51 22,50 18,62 21,68 31,70;22,50 19,46 0,46 0,61 18,62;43,40 42,37 31,31 21,35 19,46 22,50 37,51;19,89 14,80 0,79 0,99 11,99;80,68 68,69 61,78 67,88 80,89;26,111 33,102 28,90 19,89 11,99 19,111;50,98 46,83 36,82 28,90 33,102 45,103;19,46 21,35 15,29 0,32 0,46;48,120 45,103 33,102 26,111 34,122;80,130 80,108 66,109 61,118 69,130;80,50 80,33 64,33 58,43 61,51;69,130 61,118 48,120 51,138 62,138;80,108 80,89 67,88 60,99 66,109;61,118 66,109 60,99 50,98 45,103 48,120 48,120;51,138 48,120 48,120 34,122 29,132 35,140 47,141;80,153 68,152 60,159 62,174 80,174;13,120 19,111 11,99 0,99 0,120;29,132 34,122 26,111 19,111 13,120 19,133;60,159 49,155 40,162 39,174 62,174;40,162 29,153 21,155 19,157 20,174 39,174;14,139 19,133 13,120 0,120 0,140;19,157 0,158 0,174 20,174\nSwamp:80,130 69,130 62,138 68,152 80,153;68,152 62,138 51,138 47,141 49,155 60,159;49,155 47,141 35,140 29,153 40,162;29,153 35,140 29,132 19,133 14,139 21,155;19,157 21,155 14,139 0,140 0,158",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 37,
            "posY": 149
          },
          {
            "id": "GravitasPedestal",
            "posX": 39,
            "posY": 149
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "posX": 20,
            "posY": 72,
            "emitRate": 7409.9204,
            "idleTime": 226.97264,
            "eruptionTime": 355.0481,
            "dormancyCycles": 49.914104,
            "activeCycles": 53.814808
          },
          {
            "id": "hot_water",
            "posX": 27,
            "posY": 106,
            "emitRate": 5755.5254,
            "idleTime": 169.31935,
            "eruptionTime": 440.60367,
            "dormancyCycles": 40.423218,
            "activeCycles": 81.50514
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
        "biomePaths": "Barren:28,65 30,52 20,45 17,46 11,61 18,67;35,78 35,71 28,65 18,67 15,78 22,86;79,76 75,64 62,62 55,67 56,77 64,82;15,78 18,67 11,61 0,61 0,80;96,74 96,57 81,55 75,64 79,76 79,76;11,61 17,46 0,41 0,61\nSandstone:47,64 43,49 30,52 28,65 35,71;56,77 55,67 47,64 35,71 35,78 44,85\nFrozenWastes:64,82 56,77 44,85 44,96 64,96;44,85 35,78 22,86 21,96 44,96;22,86 15,78 0,80 0,96 21,96;79,76 79,76 64,82 64,96 83,96;96,74 79,76 83,96 96,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 78,
            "posY": 73
          },
          {
            "id": "GravitasPedestal",
            "posX": 82,
            "posY": 73
          },
          {
            "id": "GeneShuffler",
            "posX": 80,
            "posY": 67
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 13,
            "posY": 84,
            "emitRate": 3938.2805,
            "idleTime": 95.77259,
            "eruptionTime": 362.1477,
            "dormancyCycles": 26.024487,
            "activeCycles": 35.856014
          },
          {
            "id": "hot_steam",
            "posX": 75,
            "posY": 83,
            "emitRate": 5305.638,
            "idleTime": 483.39133,
            "eruptionTime": 173.89192,
            "dormancyCycles": 43.64458,
            "activeCycles": 79.14233
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
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": -5,
        "r": 2
      },
      {
        "id": "MarshyMoonlet",
        "q": 5,
        "r": -1
      },
      {
        "id": "NiobiumMoonlet",
        "q": 1,
        "r": -5
      },
      {
        "id": "MooMoonlet",
        "q": 0,
        "r": 7
      },
      {
        "id": "WaterMoonlet",
        "q": -5,
        "r": 7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 6,
        "r": -7
      },
      {
        "id": "TemporalTear",
        "q": 4,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_DLC2CeresOreField",
        "q": 3,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -5,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -5,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 10,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 11,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -9,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 2,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 3,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 4,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 0,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -6,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -4,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -3,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -11,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 7,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 8,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 8,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 0,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 11,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 0,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": -1,
        "r": -2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 8,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 4,
        "r": 7
      }
    ]
  },
  {
    "coordinate": "FRST-C-1329463490-0-0-0",
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
          "BouldersLarge"
        ],
        "biomePaths": "Forest:102,167 108,148 102,131 78,119 55,129 50,137 50,161 57,171 79,179;111,120 106,103 94,100 79,112 78,119 102,131;78,119 79,112 63,97 53,99 46,110 55,129;50,161 50,137 28,137 21,153 28,163\nFrozenWastes:160,108 138,106 130,123 135,133 160,134;160,158 160,134 135,133 129,148 135,158;21,125 29,111 19,95 0,95 0,125;23,181 28,163 21,153 0,153 0,182\nRust:129,148 135,133 130,123 111,120 102,131 108,148;129,174 135,158 129,148 108,148 102,167 110,175;106,198 110,175 102,167 79,179 80,188 104,200;49,187 57,171 50,161 28,163 23,181 31,190\nSandstone:160,78 143,78 132,94 138,106 160,108;143,78 128,60 112,76 118,92 132,94;118,92 112,76 97,72 87,80 94,100 106,103;128,60 128,59 111,45 94,53 97,72 112,76;94,100 87,80 74,78 63,97 79,112;63,97 74,78 67,69 49,69 41,81 53,99;19,95 28,82 17,64 0,64 0,95;41,81 49,69 41,53 28,51 17,64 28,82\nToxicJungle:138,106 132,94 118,92 106,103 111,120 130,123;55,129 46,110 29,111 21,125 28,137 50,137;80,188 79,179 57,171 49,187 63,206;136,184 129,174 110,175 106,198 131,199\nWasteland:46,110 53,99 41,81 28,82 19,95 29,111;160,183 160,158 135,158 129,174 136,184;160,209 160,183 136,184 131,199 136,209;21,153 28,137 21,125 0,125 0,153;129,222 136,209 131,199 106,198 104,200 102,213 111,224;63,207 63,206 49,187 31,190 27,210 27,211 52,216;31,190 23,181 0,182 0,208 27,210\nBarren:79,241 81,222 63,207 52,216 53,243 65,247;53,243 52,216 27,211 23,244 44,248;102,213 104,200 80,188 63,206 63,207 81,222;105,246 111,224 102,213 81,222 79,241 90,249;23,244 27,211 27,210 0,208 0,243 22,244;136,253 142,244 129,222 111,224 105,246 112,255;160,243 160,209 136,209 129,222 142,244\nMagmaCore:112,255 105,246 90,249 86,274 110,274;90,249 79,241 65,247 67,274 86,274;44,248 23,244 22,244 21,274 44,274;22,244 0,243 0,274 21,274;65,247 53,243 44,248 44,274 67,274;136,253 112,255 110,274 141,274;160,243 142,244 136,253 141,274 160,274",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 78,
            "posY": 151
          },
          {
            "id": "MassiveHeatSink",
            "posX": 139,
            "posY": 135
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 22,
            "posY": 206
          },
          {
            "id": "WarpConduitSender",
            "posX": 124,
            "posY": 195
          },
          {
            "id": "GravitasPedestal",
            "posX": 116,
            "posY": 117
          },
          {
            "id": "WarpPortal",
            "posX": 56,
            "posY": 183
          },
          {
            "id": "WarpReceiver",
            "posX": 57,
            "posY": 189
          },
          {
            "id": "GeneShuffler",
            "posX": 110,
            "posY": 161
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 72,
            "posY": 180,
            "emitRate": 3979.967,
            "idleTime": 224.52658,
            "eruptionTime": 274.51505,
            "dormancyCycles": 45.658207,
            "activeCycles": 44.68555
          },
          {
            "id": "chlorine_gas",
            "posX": 28,
            "posY": 116,
            "emitRate": 324.7468,
            "idleTime": 189.72705,
            "eruptionTime": 226.35571,
            "dormancyCycles": 56.75168,
            "activeCycles": 59.993385
          },
          {
            "id": "slush_water",
            "posX": 136,
            "posY": 155,
            "emitRate": 3995.9663,
            "idleTime": 198.22134,
            "eruptionTime": 349.7524,
            "dormancyCycles": 39.64521,
            "activeCycles": 50.088955
          },
          {
            "id": "slush_salt_water",
            "posX": 20,
            "posY": 158,
            "emitRate": 4389.6387,
            "idleTime": 255.03639,
            "eruptionTime": 324.044,
            "dormancyCycles": 55.91929,
            "activeCycles": 83.59138
          },
          {
            "id": "small_volcano",
            "posX": 73,
            "posY": 231,
            "emitRate": 150973.69,
            "idleTime": 9074.919,
            "eruptionTime": 72.39194,
            "dormancyCycles": 48.897335,
            "activeCycles": 71.90392
          },
          {
            "id": "small_volcano",
            "posX": 31,
            "posY": 233,
            "emitRate": 136641.9,
            "idleTime": 9252.713,
            "eruptionTime": 83.98861,
            "dormancyCycles": 29.057709,
            "activeCycles": 46.07867
          },
          {
            "id": "small_volcano",
            "posX": 62,
            "posY": 238,
            "emitRate": 149771.92,
            "idleTime": 8501.497,
            "eruptionTime": 58.035145,
            "dormancyCycles": 55.494667,
            "activeCycles": 75.8886
          },
          {
            "id": "big_volcano",
            "posX": 137,
            "posY": 222,
            "emitRate": 222081.95,
            "idleTime": 11239.092,
            "eruptionTime": 90.303696,
            "dormancyCycles": 24.936026,
            "activeCycles": 35.830063
          },
          {
            "id": "hot_po2",
            "posX": 16,
            "posY": 99,
            "emitRate": 409.06445,
            "idleTime": 384.97217,
            "eruptionTime": 243.88957,
            "dormancyCycles": 51.47306,
            "activeCycles": 69.881065
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
          "MetalPoor",
          "CrashedSatellites"
        ],
        "biomePaths": "Swamp:77,56 72,44 60,41 53,53 58,64 69,65;96,43 83,34 72,44 77,56 91,58;75,78 69,65 58,64 51,74 54,84 63,88;60,41 58,37 38,35 33,42 38,53 53,53;58,64 53,53 38,53 32,66 35,70 51,74;9,78 21,64 13,51 0,51 0,78;38,53 33,42 21,42 13,51 21,64 32,66;115,49 105,40 96,43 91,58 94,63 107,66;94,63 91,58 77,56 69,65 75,78 82,80;88,90 82,80 75,78 63,88 66,99 77,104;128,48 115,49 107,66 111,71 128,72;66,99 63,88 54,84 41,95 43,105 55,108\nBoggyMarsh:111,71 107,66 94,63 82,80 88,90 103,93;101,113 105,96 103,93 88,90 77,104 80,112 90,117;128,72 111,71 103,93 105,96 128,97;128,118 128,97 105,96 101,113 110,121\nMetallic:30,88 35,70 32,66 21,64 9,78 22,90;54,84 51,74 35,70 30,88 41,95;43,105 41,95 30,88 22,90 16,103 22,111 36,112;16,103 22,90 9,78 0,78 0,103;128,118 110,121 107,135 128,141;60,128 61,127 55,108 43,105 36,112 40,130\nRadioactive:107,135 110,121 101,113 90,117 89,132 103,139;89,132 90,117 80,112 64,127 79,138;64,127 80,112 77,104 66,99 55,108 61,127;22,111 16,103 0,103 0,127 15,128;128,141 107,135 103,139 102,153 128,153;20,134 15,128 0,127 0,153 17,153;39,132 40,130 36,112 22,111 15,128 20,134;60,128 40,130 39,132 42,153 58,153;79,138 64,127 61,127 60,128 58,153 78,153;103,139 89,132 79,138 78,153 102,153\nFrozenWastes:39,132 20,134 17,153 42,153",
        "pointsOfInterest": [
          {
            "id": "PropSurfaceSatellite3",
            "posX": 59,
            "posY": 69
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 113,
            "posY": 81
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 37,
            "posY": 90
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 94,
            "posY": 76
          }
        ],
        "geysers": [
          {
            "id": "molten_gold",
            "posX": 25,
            "posY": 96,
            "emitRate": 8856.576,
            "idleTime": 666.7577,
            "eruptionTime": 41.68689,
            "dormancyCycles": 46.5099,
            "activeCycles": 61.164585
          },
          {
            "id": "molten_cobalt",
            "posX": 23,
            "posY": 72,
            "emitRate": 6252.4883,
            "idleTime": 750.7902,
            "eruptionTime": 59.259632,
            "dormancyCycles": 77.88214,
            "activeCycles": 97.47933
          },
          {
            "id": "molten_cobalt",
            "posX": 114,
            "posY": 124,
            "emitRate": 10818.582,
            "idleTime": 634.40344,
            "eruptionTime": 31.101955,
            "dormancyCycles": 38.33336,
            "activeCycles": 71.021416
          },
          {
            "id": "molten_gold",
            "posX": 40,
            "posY": 117,
            "emitRate": 9486.155,
            "idleTime": 725.3456,
            "eruptionTime": 40.8127,
            "dormancyCycles": 73.32007,
            "activeCycles": 114.18216
          },
          {
            "id": "liquid_co2",
            "posX": 14,
            "posY": 132,
            "emitRate": 409.78384,
            "idleTime": 256.17447,
            "eruptionTime": 307.7894,
            "dormancyCycles": 51.640602,
            "activeCycles": 53.18134
          },
          {
            "id": "liquid_co2",
            "posX": 64,
            "posY": 131,
            "emitRate": 595.25037,
            "idleTime": 303.68384,
            "eruptionTime": 246.76855,
            "dormancyCycles": 43.696198,
            "activeCycles": 47.412968
          },
          {
            "id": "hot_hydrogen",
            "posX": 13,
            "posY": 87,
            "emitRate": 324.36038,
            "idleTime": 275.54367,
            "eruptionTime": 253.31834,
            "dormancyCycles": 42.431446,
            "activeCycles": 90.66639
          },
          {
            "id": "small_volcano",
            "posX": 84,
            "posY": 119,
            "emitRate": 127652.516,
            "idleTime": 9483.202,
            "eruptionTime": 74.70619,
            "dormancyCycles": 67.88679,
            "activeCycles": 103.5128
          },
          {
            "id": "filthy_water",
            "posX": 21,
            "posY": 120,
            "emitRate": 6124.134,
            "idleTime": 287.2649,
            "eruptionTime": 636.4687,
            "dormancyCycles": 41.853855,
            "activeCycles": 67.79349
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
          "IrregularOil"
        ],
        "biomePaths": "Sandstone:89,78 89,58 82,53 67,60 66,73 82,82;104,101 109,91 105,81 89,78 82,82 81,91 93,104;66,73 67,60 57,53 42,60 38,69 56,80;114,68 104,54 89,58 89,78 105,81;81,91 82,82 66,73 56,80 55,91 66,100;82,53 81,40 63,34 57,39 57,53 67,60;88,115 93,104 81,91 66,100 65,108 78,119;110,127 115,113 104,101 93,104 88,115 96,127 107,129;23,93 10,80 0,81 0,107 16,108\nOcean:104,54 108,44 105,39 88,34 81,40 82,53 89,58;57,53 57,39 39,33 30,44 42,60;38,69 42,60 30,44 23,44 15,52 21,68 36,71;10,80 21,68 15,52 0,52 0,81;128,68 128,44 108,44 104,54 114,68\nRust:55,91 56,80 38,69 36,71 31,91 41,99;128,68 114,68 105,81 109,91 128,91\nOilField:31,91 36,71 21,68 10,80 23,93;65,108 66,100 55,91 41,99 41,107 53,115;128,111 115,113 110,127 128,130;128,111 128,91 109,91 104,101 115,113;128,130 110,127 107,129 108,153 128,153;87,134 76,129 65,135 65,153 88,153;96,127 88,115 78,119 76,129 87,134;53,129 53,115 41,107 29,115 30,128 42,135;76,129 78,119 65,108 53,115 53,129 65,135;30,128 29,115 18,111 11,127 20,133;65,135 53,129 42,135 42,153 65,153;42,135 30,128 20,133 19,153 42,153;41,107 41,99 31,91 23,93 16,108 18,111 29,115;20,133 11,127 0,128 0,153 19,153;11,127 18,111 16,108 0,107 0,128\nMagmaCore:107,129 96,127 87,134 88,153 108,153",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 73,
            "posY": 54
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 95,
            "posY": 102
          },
          {
            "id": "WarpPortal",
            "posX": 66,
            "posY": 71
          },
          {
            "id": "WarpReceiver",
            "posX": 88,
            "posY": 71
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 111,
            "posY": 142,
            "emitRate": 5453.565,
            "idleTime": 202.46375,
            "eruptionTime": 171.01111,
            "dormancyCycles": 65.89809,
            "activeCycles": 62.118645
          },
          {
            "id": "OilWell",
            "posX": 61,
            "posY": 114,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 50,
            "posY": 136,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 40,
            "posY": 122,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 20,
            "posY": 122,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 116,
            "posY": 123,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 35,
            "posY": 60,
            "emitRate": 10076.651,
            "idleTime": 363.83936,
            "eruptionTime": 379.78192,
            "dormancyCycles": 55.14654,
            "activeCycles": 95.62729
          },
          {
            "id": "liquid_co2",
            "posX": 50,
            "posY": 109,
            "emitRate": 474.04395,
            "idleTime": 317.708,
            "eruptionTime": 442.04248,
            "dormancyCycles": 53.81707,
            "activeCycles": 75.7859
          },
          {
            "id": "methane",
            "posX": 15,
            "posY": 136,
            "emitRate": 360.20062,
            "idleTime": 341.69882,
            "eruptionTime": 319.63638,
            "dormancyCycles": 47.076077,
            "activeCycles": 66.59363
          },
          {
            "id": "OilWell",
            "posX": 24,
            "posY": 74,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 61,
            "posY": 103,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 123,
            "posY": 108,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 32,
            "posY": 109,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
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
          "SlimeSplats"
        ],
        "biomePaths": "FrozenWastes:44,66 46,55 41,48 24,53 23,62 33,70;64,53 64,38 48,35 42,39 41,48 46,55;41,48 42,39 31,32 21,36 19,47 24,53;31,80 33,70 23,62 15,66 15,82 18,85;23,62 24,53 19,47 0,49 0,62 15,66;64,74 64,53 46,55 44,66 52,74;44,89 52,74 44,66 33,70 31,80 42,89;33,109 31,100 20,94 11,104 15,112 27,114;64,92 64,74 52,74 44,89 49,93;49,110 49,93 44,89 42,89 31,100 33,109 46,112;20,94 18,85 15,82 0,84 0,102 11,104;15,82 15,66 0,62 0,84;19,47 21,36 15,31 0,33 0,49;15,112 11,104 0,102 0,128 7,128;64,92 49,93 49,110 64,112;46,112 33,109 27,114 29,128 46,128;64,112 49,110 46,112 46,128 64,128;27,114 15,112 7,128 29,128;42,89 31,80 18,85 20,94 31,100",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 25,
            "posY": 47
          },
          {
            "id": "GravitasPedestal",
            "posX": 25,
            "posY": 102
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 39,
            "posY": 114,
            "emitRate": 6543.851,
            "idleTime": 671.4666,
            "eruptionTime": 57.469627,
            "dormancyCycles": 36.09092,
            "activeCycles": 58.044804
          },
          {
            "id": "molten_iron",
            "posX": 35,
            "posY": 106,
            "emitRate": 8008.0107,
            "idleTime": 716.9049,
            "eruptionTime": 50.548645,
            "dormancyCycles": 79.850075,
            "activeCycles": 115.12566
          },
          {
            "id": "molten_iron",
            "posX": 28,
            "posY": 86,
            "emitRate": 7224.9473,
            "idleTime": 675.3837,
            "eruptionTime": 50.470387,
            "dormancyCycles": 61.8248,
            "activeCycles": 82.48506
          },
          {
            "id": "molten_iron",
            "posX": 33,
            "posY": 57,
            "emitRate": 7756.812,
            "idleTime": 675.387,
            "eruptionTime": 44.000984,
            "dormancyCycles": 23.394056,
            "activeCycles": 38.21731
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
        "biomePaths": "BoggyMarsh:44,50 49,45 46,31 42,28 32,32 29,43 36,51;64,26 46,31 49,45 64,45;64,45 49,45 44,50 50,62 64,62;14,57 18,44 11,37 0,37 0,57;30,62 36,51 29,43 18,44 14,57 19,62\nToxicJungle:43,73 50,62 44,50 36,51 30,62 37,73;64,79 64,62 50,62 43,73 49,79;37,73 30,62 19,62 15,76 17,79 31,80;19,62 14,57 0,57 0,76 15,76\nMagmaCore:49,79 43,73 37,73 31,80 35,96 45,96;31,80 17,79 15,96 35,96;64,79 49,79 45,96 64,96;17,79 15,76 0,76 0,96 15,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 47,
            "posY": 34
          },
          {
            "id": "GravitasPedestal",
            "posX": 33,
            "posY": 34
          },
          {
            "id": "SapTree",
            "posX": 40,
            "posY": 34
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 34,
            "posY": 88,
            "emitRate": 8760.296,
            "idleTime": 718.0206,
            "eruptionTime": 42.147522,
            "dormancyCycles": 63.706074,
            "activeCycles": 93.17789
          },
          {
            "id": "molten_tungsten",
            "posX": 25,
            "posY": 90,
            "emitRate": 7980.0264,
            "idleTime": 657.40106,
            "eruptionTime": 45.29082,
            "dormancyCycles": 50.87414,
            "activeCycles": 75.80782
          },
          {
            "id": "molten_tungsten",
            "posX": 10,
            "posY": 89,
            "emitRate": 6350.5186,
            "idleTime": 600.4513,
            "eruptionTime": 48.90467,
            "dormancyCycles": 57.75851,
            "activeCycles": 69.709236
          },
          {
            "id": "slimy_po2",
            "posX": 56,
            "posY": 66,
            "emitRate": 438.39404,
            "idleTime": 324.67984,
            "eruptionTime": 204.56113,
            "dormancyCycles": 45.933357,
            "activeCycles": 62.137657
          },
          {
            "id": "slimy_po2",
            "posX": 42,
            "posY": 60,
            "emitRate": 310.8012,
            "idleTime": 431.51767,
            "eruptionTime": 460.31613,
            "dormancyCycles": 47.744686,
            "activeCycles": 81.06302
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
        "biomePaths": "Moo:75,60 78,48 78,47 66,42 57,47 59,61 63,63;84,32 77,25 66,30 66,42 78,47;51,44 48,33 36,30 29,41 39,51;96,64 96,51 78,48 75,60 80,65;59,61 57,47 51,44 39,51 38,59 47,65;66,42 66,30 57,24 48,33 51,44 57,47;96,32 84,32 78,47 78,48 96,51;38,59 39,51 29,41 20,42 17,59 30,63;17,59 20,42 16,38 0,39 0,58 16,60\nFrozenWastes:80,65 75,60 63,63 63,80 78,80;96,64 80,65 78,80 96,80;47,65 38,59 30,63 30,80 46,80;63,63 59,61 47,65 46,80 63,80;30,63 17,59 16,60 14,80 30,80;16,60 0,58 0,80 14,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 28,
            "posY": 54
          },
          {
            "id": "GravitasPedestal",
            "posX": 21,
            "posY": 54
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 81,
            "posY": 52,
            "emitRate": 481.49957,
            "idleTime": 353.9385,
            "eruptionTime": 210.70268,
            "dormancyCycles": 43.16075,
            "activeCycles": 83.04544
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
        "biomePaths": "Barren:80,69 64,70 60,81 66,89 80,89;60,81 64,70 60,63 44,64 42,77 46,82;80,109 80,89 66,89 60,99 65,109;80,69 80,50 62,52 60,63 64,70;60,63 62,52 56,43 40,50 39,59 44,64;80,50 80,35 64,32 57,38 56,43 62,52;66,89 60,81 46,82 44,98 60,99;60,116 65,109 60,99 44,98 42,100 41,107 52,119;80,130 80,109 65,109 60,116 70,130;70,130 60,116 52,119 48,127 54,138 61,139;41,107 42,100 23,92 21,94 18,107 23,116 29,116;44,98 46,82 42,77 25,80 23,92 42,100;23,116 18,107 0,109 0,123 15,126;18,107 21,94 0,89 0,109;23,92 25,80 21,74 0,77 0,89 21,94;54,138 48,127 37,129 32,137 43,149;48,127 52,119 41,107 29,116 37,129;42,77 44,64 39,59 22,63 21,74 25,80;32,137 37,129 29,116 23,116 15,126 19,138 21,140;19,138 15,126 0,123 0,143;21,74 22,63 17,57 0,58 0,77;39,59 40,50 33,42 20,44 17,57 22,63;56,43 57,38 45,29 36,32 33,42 40,50;80,152 67,152 63,158 66,174 80,174;49,158 43,152 31,158 32,174 46,174;17,57 20,44 15,38 0,38 0,58;15,158 0,153 0,174 15,174;63,158 49,158 46,174 66,174;31,158 22,154 15,158 15,174 32,174\nSwamp:63,158 67,152 61,139 54,138 43,149 43,152 49,158;80,130 70,130 61,139 67,152 80,152;22,154 21,140 19,138 0,143 0,153 15,158;43,152 43,149 32,137 21,140 22,154 31,158",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 59,
            "posY": 144
          },
          {
            "id": "GravitasPedestal",
            "posX": 61,
            "posY": 144
          }
        ],
        "geysers": [
          {
            "id": "slush_water",
            "posX": 15,
            "posY": 103,
            "emitRate": 3360.622,
            "idleTime": 78.09075,
            "eruptionTime": 448.0879,
            "dormancyCycles": 64.981674,
            "activeCycles": 67.54038
          },
          {
            "id": "filthy_water",
            "posX": 50,
            "posY": 60,
            "emitRate": 10321.947,
            "idleTime": 233.29538,
            "eruptionTime": 237.90488,
            "dormancyCycles": 46.5099,
            "activeCycles": 61.164585
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
          "FrozenCore"
        ],
        "biomePaths": "MagmaCore:32,42 34,31 27,24 16,31 16,39 26,46;52,39 46,28 34,31 32,42 45,48;64,58 64,39 52,39 45,48 46,57 50,59;64,58 50,59 50,77 64,78;24,57 26,46 16,39 0,48 0,50 17,60;13,74 17,60 0,50 0,74\nOilField:33,76 33,63 24,57 17,60 13,74 17,78 31,78;46,57 45,48 32,42 26,46 24,57 33,63;50,77 50,59 46,57 33,63 33,76 48,78\nFrozenWastes:48,78 33,76 31,78 32,96 47,96;17,78 13,74 0,74 0,96 14,96;64,78 50,77 48,78 47,96 64,96;31,78 17,78 14,96 32,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 31,
            "posY": 64
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 42,
            "posY": 53,
            "emitRate": 228588.97,
            "idleTime": 8307.558,
            "eruptionTime": 70.74317,
            "dormancyCycles": 60.94431,
            "activeCycles": 74.770874
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
        "biomePaths": "Sandstone:144,78 149,72 141,59 130,61 128,76 132,79;110,73 112,59 103,52 91,59 97,76;66,59 70,47 63,40 48,46 54,62;74,74 74,67 66,59 54,62 52,65 55,77 63,81;33,77 36,66 30,59 18,61 15,65 19,79 22,82\nBarren:160,71 160,51 145,52 141,59 149,72;89,58 81,45 70,47 66,59 74,67;97,76 97,76 91,59 89,58 74,67 74,74 82,81;128,76 130,61 123,55 112,59 110,73 116,77;55,77 52,65 36,66 33,77 43,85;52,65 54,62 48,46 47,46 34,51 30,59 36,66;19,79 15,65 0,65 0,84\nFrozenWastes:97,76 82,81 81,96 101,96;144,78 132,79 130,96 150,96;116,77 110,73 97,76 97,76 101,96 114,96;82,81 74,74 63,81 64,96 81,96;132,79 128,76 116,77 114,96 130,96;63,81 55,77 43,85 43,96 64,96;43,85 33,77 22,82 22,96 43,96;160,71 149,72 144,78 150,96 160,96;22,82 19,79 0,84 0,96 22,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 78,
            "posY": 78
          },
          {
            "id": "GravitasPedestal",
            "posX": 82,
            "posY": 78
          },
          {
            "id": "GeneShuffler",
            "posX": 80,
            "posY": 72
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 107,
            "posY": 80,
            "emitRate": 4934.54,
            "idleTime": 327.18918,
            "eruptionTime": 365.4717,
            "dormancyCycles": 70.968445,
            "activeCycles": 83.270164
          },
          {
            "id": "hot_steam",
            "posX": 95,
            "posY": 84,
            "emitRate": 2504.9482,
            "idleTime": 170.20021,
            "eruptionTime": 156.03029,
            "dormancyCycles": 38.859684,
            "activeCycles": 82.08456
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
        "q": -1,
        "r": -7
      },
      {
        "id": "MarshyMoonlet",
        "q": 6,
        "r": -3
      },
      {
        "id": "MooMoonlet",
        "q": -8,
        "r": 4
      },
      {
        "id": "WaterMoonlet",
        "q": 6,
        "r": 2
      },
      {
        "id": "NiobiumMoonlet",
        "q": 0,
        "r": 9
      },
      {
        "id": "RegolithMoonlet",
        "q": 4,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": -9,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 3,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -5,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -11,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 4,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -8,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -7,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 10,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 7,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 3,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 5,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -3,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 1,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 0,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 9,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 9,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 9,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 8,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 5,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 4,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -3,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -4,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -10,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 11,
        "r": -5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": 0,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -1,
        "r": 4
      }
    ]
  },
  {
    "coordinate": "V-BAD-C-902069948-0-0-0",
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
          "MetalCaves",
          "Volcanoes",
          "SlimeSplats",
          "IrregularOil"
        ],
        "biomePaths": "Sandstone:133,201 139,174 125,159 98,161 88,180 96,202 106,208;42,209 46,201 45,172 44,170 22,164 0,174 0,206 32,214;48,113 43,89 30,82 0,88 0,126 25,133;60,262 76,234 70,220 42,209 32,214 24,244 33,257 59,263;76,208 67,194 46,201 42,209 70,220;96,202 88,180 69,186 67,194 76,208;88,180 98,161 84,138 66,135 45,153 44,170 45,172 69,186;125,159 137,137 126,116 110,111 94,117 84,138 98,161;120,238 106,228 93,238 101,255 112,256;156,237 157,218 141,212 133,235 145,242;190,257 183,246 168,248 164,258 172,271 181,271;177,210 184,191 181,179 159,167 139,174 133,201 141,212 157,218;187,171 181,153 164,153 159,167 181,179;199,137 199,118 178,102 158,108 149,136 164,153 181,153\nMagmaCore:28,352 19,344 0,344 0,380 26,380;22,164 21,151 0,148 0,174;67,194 69,186 45,172 46,201;45,153 27,143 21,151 22,164 44,170;57,352 46,346 28,352 26,380 57,380;88,355 73,345 57,352 57,380 87,380;101,90 91,81 76,87 79,104 85,106;121,358 104,348 88,355 87,380 121,380;120,290 119,288 90,288 103,314;110,111 105,91 101,90 85,106 94,117;152,351 140,346 121,358 121,380 154,380;164,258 168,248 156,237 145,242 149,260;183,351 165,344 152,351 154,380 181,380;212,356 192,346 183,351 181,380 214,380;187,287 181,271 172,271 161,285 179,296;205,191 210,181 207,175 187,171 181,179 184,191;221,128 207,115 199,118 199,137 215,141;240,340 234,340 212,356 214,380 240,380\nOilField:33,324 23,309 0,309 0,344 19,344;23,309 30,293 21,280 0,279 0,309;46,346 41,326 33,324 19,344 28,352;62,313 62,303 52,292 30,293 23,309 33,324 41,326;73,345 75,324 62,313 41,326 46,346 57,352;94,117 85,106 79,104 59,118 66,135 84,138;103,317 103,314 90,288 90,288 62,303 62,313 75,324;104,348 107,322 103,317 75,324 73,345 88,355;140,346 134,325 107,322 104,348 121,358;146,310 145,305 120,290 103,314 103,317 107,322 134,325;165,344 166,319 146,310 134,325 140,346 152,351;149,136 158,108 145,99 126,116 137,137;179,312 179,296 161,285 159,285 145,305 146,310 166,319;192,346 197,322 179,312 166,319 165,344 183,351;234,340 208,317 197,322 192,346 212,356;208,317 215,301 208,289 187,287 179,296 179,312 197,322;240,340 240,300 215,301 208,317 234,340;240,300 240,269 218,267 208,289 215,301\nFrozenWastes:33,257 24,244 0,245 0,279 21,280;52,292 59,263 33,257 21,280 30,293;90,288 86,273 60,262 59,263 52,292 62,303;159,285 144,267 125,272 119,288 120,290 145,305;221,247 207,224 192,226 183,246 190,257 214,259;240,245 240,211 214,213 207,224 221,247;240,126 240,92 216,93 207,115 221,128\nRust:24,244 32,214 0,206 0,245;66,135 59,118 48,113 25,133 27,143 45,153;101,255 93,238 76,234 60,262 86,273;240,150 219,148 207,175 210,181 240,183\nRadioactive:27,143 25,133 0,126 0,148 21,151;161,285 172,271 164,258 149,260 144,267 159,285;240,245 221,247 214,259 218,267 240,269;240,126 221,128 215,141 219,148 240,150\nBarren:30,82 30,57 0,50 0,88;60,79 60,60 39,49 30,57 30,82 43,89;91,81 93,61 75,49 60,60 60,79 76,87;124,79 124,63 110,53 93,61 91,81 101,90 105,91;164,69 143,52 124,63 124,79 144,91;178,102 181,88 166,69 164,69 144,91 145,99 158,108;205,80 209,63 207,60 178,55 166,69 181,88;240,92 240,63 209,63 205,80 216,93\nWasteland:79,104 76,87 60,79 43,89 48,113 59,118;145,99 144,91 124,79 105,91 110,111 126,116;219,148 215,141 199,137 181,153 187,171 207,175;240,211 240,183 210,181 205,191 214,213\nToxicJungle:125,272 112,256 101,255 86,273 90,288 90,288 119,288;106,228 106,208 96,202 76,208 70,220 76,234 93,238;144,267 149,260 145,242 133,235 120,238 112,256 125,272;133,235 141,212 133,201 106,208 106,228 120,238;159,167 164,153 149,136 137,137 125,159 139,174;183,246 192,226 177,210 157,218 156,237 168,248;218,267 214,259 190,257 181,271 187,287 208,289;207,224 214,213 205,191 184,191 177,210 192,226;207,115 216,93 205,80 181,88 178,102 199,118",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 113,
            "posY": 183
          },
          {
            "id": "MassiveHeatSink",
            "posX": 66,
            "posY": 273
          },
          {
            "id": "MassiveHeatSink",
            "posX": 218,
            "posY": 102
          },
          {
            "id": "MassiveHeatSink",
            "posX": 18,
            "posY": 252
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 44,
            "posY": 135
          },
          {
            "id": "WarpConduitSender",
            "posX": 217,
            "posY": 238
          },
          {
            "id": "GravitasPedestal",
            "posX": 220,
            "posY": 260
          },
          {
            "id": "WarpReceiver",
            "posX": 130,
            "posY": 114
          },
          {
            "id": "WarpPortal",
            "posX": 129,
            "posY": 108
          },
          {
            "id": "GeneShuffler",
            "posX": 49,
            "posY": 117
          },
          {
            "id": "GeneShuffler",
            "posX": 63,
            "posY": 341
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 89,
            "posY": 226,
            "emitRate": 4232.7617,
            "idleTime": 223.10474,
            "eruptionTime": 294.00195,
            "dormancyCycles": 34.839077,
            "activeCycles": 68.526726
          },
          {
            "id": "chlorine_gas",
            "posX": 206,
            "posY": 213,
            "emitRate": 311.19888,
            "idleTime": 270.60843,
            "eruptionTime": 303.45657,
            "dormancyCycles": 69.407265,
            "activeCycles": 107.86923
          },
          {
            "id": "OilWell",
            "posX": 209,
            "posY": 326,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 206,
            "posY": 308,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 45,
            "posY": 340,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "big_volcano",
            "posX": 33,
            "posY": 158,
            "emitRate": 305688.94,
            "idleTime": 9638.19,
            "eruptionTime": 64.996956,
            "dormancyCycles": 62.526855,
            "activeCycles": 82.89837
          },
          {
            "id": "big_volcano",
            "posX": 175,
            "posY": 284,
            "emitRate": 329419.75,
            "idleTime": 8934.306,
            "eruptionTime": 64.497345,
            "dormancyCycles": 40.215874,
            "activeCycles": 60.72664
          },
          {
            "id": "big_volcano",
            "posX": 98,
            "posY": 105,
            "emitRate": 244833.8,
            "idleTime": 8787.914,
            "eruptionTime": 68.00293,
            "dormancyCycles": 69.407265,
            "activeCycles": 107.86923
          },
          {
            "id": "big_volcano",
            "posX": 194,
            "posY": 182,
            "emitRate": 219331.08,
            "idleTime": 6348.5664,
            "eruptionTime": 53.4601,
            "dormancyCycles": 27.010427,
            "activeCycles": 31.767914
          },
          {
            "id": "big_volcano",
            "posX": 86,
            "posY": 93,
            "emitRate": 244833.8,
            "idleTime": 8787.914,
            "eruptionTime": 68.00293,
            "dormancyCycles": 69.407265,
            "activeCycles": 107.86923
          },
          {
            "id": "big_volcano",
            "posX": 104,
            "posY": 297,
            "emitRate": 226352.56,
            "idleTime": 9793.651,
            "eruptionTime": 75.58342,
            "dormancyCycles": 41.81816,
            "activeCycles": 65.874886
          },
          {
            "id": "big_volcano",
            "posX": 155,
            "posY": 249,
            "emitRate": 267266.75,
            "idleTime": 10010.082,
            "eruptionTime": 81.32751,
            "dormancyCycles": 50.664467,
            "activeCycles": 66.99643
          },
          {
            "id": "big_volcano",
            "posX": 208,
            "posY": 129,
            "emitRate": 232380.77,
            "idleTime": 9260.894,
            "eruptionTime": 73.645454,
            "dormancyCycles": 46.546986,
            "activeCycles": 65.71006
          },
          {
            "id": "molten_gold",
            "posX": 46,
            "posY": 318,
            "emitRate": 9855.376,
            "idleTime": 771.0171,
            "eruptionTime": 44.689236,
            "dormancyCycles": 37.7611,
            "activeCycles": 80.39649
          },
          {
            "id": "slimy_po2",
            "posX": 83,
            "posY": 164,
            "emitRate": 282.50537,
            "idleTime": 250.88821,
            "eruptionTime": 431.47653,
            "dormancyCycles": 44.859,
            "activeCycles": 53.420486
          },
          {
            "id": "molten_cobalt",
            "posX": 151,
            "posY": 331,
            "emitRate": 8698.182,
            "idleTime": 762.69,
            "eruptionTime": 51.784203,
            "dormancyCycles": 28.742884,
            "activeCycles": 42.090744
          },
          {
            "id": "hot_co2",
            "posX": 56,
            "posY": 321,
            "emitRate": 401.01538,
            "idleTime": 389.54883,
            "eruptionTime": 297.68628,
            "dormancyCycles": 76.821045,
            "activeCycles": 83.099434
          },
          {
            "id": "hot_steam",
            "posX": 185,
            "posY": 311,
            "emitRate": 2259.9927,
            "idleTime": 313.86624,
            "eruptionTime": 290.17575,
            "dormancyCycles": 44.64608,
            "activeCycles": 84.416916
          },
          {
            "id": "molten_iron",
            "posX": 73,
            "posY": 146,
            "emitRate": 9268.027,
            "idleTime": 609.16565,
            "eruptionTime": 37.222946,
            "dormancyCycles": 56.616,
            "activeCycles": 100.29995
          },
          {
            "id": "molten_cobalt",
            "posX": 206,
            "posY": 296,
            "emitRate": 9166.628,
            "idleTime": 615.54047,
            "eruptionTime": 39.885006,
            "dormancyCycles": 50.642212,
            "activeCycles": 55.70389
          },
          {
            "id": "big_volcano",
            "posX": 91,
            "posY": 339,
            "emitRate": 284605.53,
            "idleTime": 9391.231,
            "eruptionTime": 64.13739,
            "dormancyCycles": 45.83076,
            "activeCycles": 80.55706
          },
          {
            "id": "molten_iron",
            "posX": 161,
            "posY": 324,
            "emitRate": 8831.949,
            "idleTime": 763.0366,
            "eruptionTime": 48.80287,
            "dormancyCycles": 62.994225,
            "activeCycles": 73.26527
          },
          {
            "id": "hot_steam",
            "posX": 190,
            "posY": 339,
            "emitRate": 2332.5527,
            "idleTime": 381.14307,
            "eruptionTime": 323.26776,
            "dormancyCycles": 55.010483,
            "activeCycles": 80.38077
          },
          {
            "id": "slush_salt_water",
            "posX": 32,
            "posY": 330,
            "emitRate": 5705.388,
            "idleTime": 192.93327,
            "eruptionTime": 133.23277,
            "dormancyCycles": 69.07378,
            "activeCycles": 84.452095
          },
          {
            "id": "hot_co2",
            "posX": 122,
            "posY": 232,
            "emitRate": 326.1039,
            "idleTime": 225.39938,
            "eruptionTime": 253.95877,
            "dormancyCycles": 90.76446,
            "activeCycles": 94.41424
          },
          {
            "id": "OilWell",
            "posX": 6,
            "posY": 305,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 70,
            "posY": 120,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 148,
            "posY": 109,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 177,
            "posY": 311,
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
          "DistressSignal"
        ],
        "biomePaths": "Swamp:94,93 91,84 77,79 67,91 69,100 85,104;101,70 99,62 77,61 74,67 77,79 91,84;133,95 119,84 106,97 111,109 123,111;111,109 106,97 94,93 85,104 89,116 103,118;77,79 74,67 53,68 52,85 67,91;89,116 85,104 69,100 63,109 67,122 81,125;108,132 103,118 89,116 81,125 84,135 98,141;69,100 67,91 52,85 43,91 43,108 63,109;84,135 81,125 67,122 59,131 65,147 71,149;119,84 118,79 101,70 91,84 94,93 106,97\nBoggyMarsh:103,55 99,44 87,39 75,48 77,61 99,62;128,66 120,54 103,55 99,62 101,70 118,79;160,107 149,107 137,123 144,132 160,132;160,80 160,53 147,53 136,67 146,80\nFrozenWastes:74,67 77,61 75,48 66,43 50,50 50,64 53,68;50,64 50,50 43,43 25,47 24,63 28,68;24,63 25,47 22,44 0,45 0,67;147,53 138,40 125,42 120,54 128,66 136,67;52,155 42,152 35,156 36,176 56,176;122,153 109,157 107,176 130,176;35,156 19,153 15,176 36,176\nForest:52,85 53,68 50,64 28,68 27,84 43,91;27,84 28,68 24,63 0,67 0,81 23,87;136,94 146,80 136,67 128,66 118,79 119,84 133,95;42,110 43,108 43,91 27,84 23,87 19,104 24,111;24,111 19,104 0,106 0,127 20,127;45,130 42,110 24,111 20,127 23,132 40,134\nRust:130,122 123,111 111,109 103,118 108,132 119,134;160,107 160,80 146,80 136,94 149,107;67,122 63,109 43,108 42,110 45,130 59,131;19,104 23,87 0,81 0,106;149,107 136,94 133,95 123,111 130,122 137,123\nRadioactive:138,148 144,132 137,123 130,122 119,134 125,149;122,153 125,149 119,134 108,132 98,141 99,151 109,157;160,155 160,132 144,132 138,148 144,155;144,155 138,148 125,149 122,153 130,176 138,176;160,155 144,155 138,176 160,176;23,132 20,127 0,127 0,150 17,151;19,153 17,151 0,150 0,176 15,176;42,152 40,134 23,132 17,151 19,153 35,156;99,151 98,141 84,135 71,149 74,154 89,159;109,157 99,151 89,159 91,176 107,176;65,147 59,131 45,130 40,134 42,152 52,155;74,154 71,149 65,147 52,155 56,176 67,176;89,159 74,154 67,176 91,176",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 141,
            "posY": 64
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 32,
            "posY": 83
          },
          {
            "id": "WarpConduitSender",
            "posX": 76,
            "posY": 133
          },
          {
            "id": "WarpReceiver",
            "posX": 89,
            "posY": 96
          },
          {
            "id": "WarpPortal",
            "posX": 67,
            "posY": 96
          },
          {
            "id": "GeneShuffler",
            "posX": 74,
            "posY": 52
          },
          {
            "id": "GeneShuffler",
            "posX": 120,
            "posY": 129
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 104,
            "posY": 159,
            "emitRate": 379.95123,
            "idleTime": 280.11746,
            "eruptionTime": 317.7012,
            "dormancyCycles": 75.02049,
            "activeCycles": 75.778114
          },
          {
            "id": "liquid_co2",
            "posX": 147,
            "posY": 151,
            "emitRate": 601.20703,
            "idleTime": 332.11966,
            "eruptionTime": 252.89389,
            "dormancyCycles": 67.61077,
            "activeCycles": 72.37449
          },
          {
            "id": "slush_salt_water",
            "posX": 37,
            "posY": 48,
            "emitRate": 4166.082,
            "idleTime": 302.31955,
            "eruptionTime": 262.9863,
            "dormancyCycles": 33.433796,
            "activeCycles": 70.38527
          },
          {
            "id": "slush_water",
            "posX": 44,
            "posY": 63,
            "emitRate": 4665.9023,
            "idleTime": 146.1008,
            "eruptionTime": 204.93127,
            "dormancyCycles": 53.756115,
            "activeCycles": 71.91872
          },
          {
            "id": "steam",
            "posX": 146,
            "posY": 123,
            "emitRate": 7060.313,
            "idleTime": 345.77887,
            "eruptionTime": 210.60228,
            "dormancyCycles": 53.507492,
            "activeCycles": 69.8177
          },
          {
            "id": "slush_water",
            "posX": 97,
            "posY": 113,
            "emitRate": 3883.4973,
            "idleTime": 311.06113,
            "eruptionTime": 529.0041,
            "dormancyCycles": 36.47959,
            "activeCycles": 59.89992
          },
          {
            "id": "molten_gold",
            "posX": 12,
            "posY": 93,
            "emitRate": 8704.479,
            "idleTime": 822.63116,
            "eruptionTime": 49.48438,
            "dormancyCycles": 46.52285,
            "activeCycles": 62.554955
          },
          {
            "id": "molten_copper",
            "posX": 7,
            "posY": 124,
            "emitRate": 9958.028,
            "idleTime": 700.1015,
            "eruptionTime": 38.23074,
            "dormancyCycles": 64.62012,
            "activeCycles": 66.60495
          },
          {
            "id": "molten_gold",
            "posX": 48,
            "posY": 74,
            "emitRate": 6314.8765,
            "idleTime": 482.48364,
            "eruptionTime": 37.718998,
            "dormancyCycles": 27.010427,
            "activeCycles": 31.767914
          },
          {
            "id": "hot_hydrogen",
            "posX": 85,
            "posY": 79,
            "emitRate": 456.47238,
            "idleTime": 320.36462,
            "eruptionTime": 240.50256,
            "dormancyCycles": 59.446674,
            "activeCycles": 93.75908
          },
          {
            "id": "methane",
            "posX": 48,
            "posY": 139,
            "emitRate": 334.03412,
            "idleTime": 425.96735,
            "eruptionTime": 405.06653,
            "dormancyCycles": 33.838135,
            "activeCycles": 61.46092
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
        "biomePaths": "FrozenWastes:53,54 44,44 32,51 35,65 46,67;50,73 46,67 35,65 29,70 33,85 42,88;64,75 50,73 42,88 45,92 64,92;35,65 32,51 22,47 15,58 19,69 29,70;44,44 45,36 40,30 23,34 21,42 22,47 32,51;33,85 29,70 19,69 12,77 19,92 21,93;22,47 21,42 0,41 0,57 15,58;42,104 45,92 42,88 33,85 21,93 25,105 32,108;64,53 53,54 46,67 50,73 64,75;19,69 15,58 0,57 0,76 12,77;64,53 64,32 45,36 44,44 53,54;25,105 21,93 19,92 0,98 0,108 16,112;32,108 25,105 16,112 18,128 34,128;64,108 64,92 45,92 42,104 49,110;49,110 42,104 32,108 34,128 46,128;23,34 18,25 0,28 0,41 21,42;19,92 12,77 0,76 0,98;16,112 0,108 0,128 18,128;64,108 49,110 46,128 64,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 49,
            "posY": 44
          },
          {
            "id": "GravitasPedestal",
            "posX": 33,
            "posY": 113
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 14,
            "posY": 98,
            "emitRate": 8699.019,
            "idleTime": 665.9407,
            "eruptionTime": 41.90034,
            "dormancyCycles": 59.81775,
            "activeCycles": 99.090546
          },
          {
            "id": "molten_iron",
            "posX": 52,
            "posY": 119,
            "emitRate": 8965.71,
            "idleTime": 664.5505,
            "eruptionTime": 39.370438,
            "dormancyCycles": 53.05515,
            "activeCycles": 72.92771
          },
          {
            "id": "molten_iron",
            "posX": 29,
            "posY": 67,
            "emitRate": 8145.683,
            "idleTime": 766.8792,
            "eruptionTime": 52.160385,
            "dormancyCycles": 56.899536,
            "activeCycles": 82.512375
          },
          {
            "id": "molten_iron",
            "posX": 25,
            "posY": 99,
            "emitRate": 9321.298,
            "idleTime": 642.72626,
            "eruptionTime": 40.2361,
            "dormancyCycles": 28.096098,
            "activeCycles": 34.48111
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
        "biomePaths": "BoggyMarsh:45,53 47,48 42,36 33,34 27,51 31,55;64,45 64,34 49,30 42,36 47,48;33,34 31,32 18,31 11,42 18,50 27,51;11,64 18,50 11,42 0,42 0,64;30,66 31,55 27,51 18,50 11,64 19,72;18,79 19,72 11,64 0,64 0,86;64,45 47,48 45,53 50,63 64,65\nToxicJungle:50,63 45,53 31,55 30,66 42,75;42,76 42,75 30,66 19,72 18,79 26,88;64,80 64,65 50,63 42,75 42,76 47,81\nMagmaCore:26,88 18,79 0,86 0,96 26,96;47,81 42,76 26,88 26,96 47,96;64,80 47,81 47,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 45,
            "posY": 47
          },
          {
            "id": "GravitasPedestal",
            "posX": 31,
            "posY": 47
          },
          {
            "id": "SapTree",
            "posX": 38,
            "posY": 47
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 12,
            "posY": 53,
            "emitRate": 11246.4795,
            "idleTime": 758.7906,
            "eruptionTime": 33.51897,
            "dormancyCycles": 80.17125,
            "activeCycles": 109.150795
          },
          {
            "id": "molten_tungsten",
            "posX": 45,
            "posY": 90,
            "emitRate": 8853.829,
            "idleTime": 717.7465,
            "eruptionTime": 39.5562,
            "dormancyCycles": 37.01616,
            "activeCycles": 56.272205
          },
          {
            "id": "molten_tungsten",
            "posX": 54,
            "posY": 90,
            "emitRate": 9269.719,
            "idleTime": 570.96106,
            "eruptionTime": 36.870506,
            "dormancyCycles": 29.638699,
            "activeCycles": 46.69697
          },
          {
            "id": "slimy_po2",
            "posX": 34,
            "posY": 66,
            "emitRate": 478.338,
            "idleTime": 254.26376,
            "eruptionTime": 223.08267,
            "dormancyCycles": 67.02388,
            "activeCycles": 94.732185
          },
          {
            "id": "chlorine_gas",
            "posX": 52,
            "posY": 65,
            "emitRate": 365.26224,
            "idleTime": 324.55945,
            "eruptionTime": 387.21088,
            "dormancyCycles": 50.20732,
            "activeCycles": 126.05142
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
        "biomePaths": "MagmaCore:30,48 32,37 24,30 16,34 13,47 17,50;47,52 50,48 45,33 32,37 30,48 36,54;16,63 17,50 13,47 0,48 0,68;64,47 64,31 45,33 45,33 50,48;64,47 50,48 47,52 52,64 64,65;64,80 64,65 52,64 44,74 44,76 49,81;44,76 44,74 33,64 23,68 22,78 32,83\nOilField:33,64 36,54 30,48 17,50 16,63 23,68;52,64 47,52 36,54 33,64 44,74;22,78 23,68 16,63 0,68 0,76 16,82\nFrozenWastes:64,80 49,81 48,96 64,96;49,81 44,76 32,83 33,96 48,96;16,82 0,76 0,96 15,96;32,83 22,78 16,82 15,96 33,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 44,
            "posY": 62
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 10,
            "posY": 71,
            "emitRate": 269005.72,
            "idleTime": 10097.108,
            "eruptionTime": 74.102196,
            "dormancyCycles": 31.99363,
            "activeCycles": 45.52592
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
        "biomePaths": "Moo:71,40 67,31 50,31 48,33 51,46 62,50;64,60 62,50 51,46 40,55 40,61 58,66;39,63 40,61 40,55 29,44 20,47 17,60 20,64;51,46 48,33 34,34 29,44 40,55;85,56 78,41 71,40 62,50 64,60 77,63;17,60 20,47 13,39 0,40 0,60\nFrozenWastes:58,66 40,61 39,63 39,80 59,80;77,63 64,60 58,66 59,80 79,80;96,57 85,56 77,63 79,80 96,80;20,64 17,60 0,60 0,80 18,80;39,63 20,64 18,80 39,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 60,
            "posY": 41
          },
          {
            "id": "GravitasPedestal",
            "posX": 53,
            "posY": 41
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 40,
            "posY": 43,
            "emitRate": 516.1284,
            "idleTime": 271.86707,
            "eruptionTime": 148.13075,
            "dormancyCycles": 23.402893,
            "activeCycles": 31.743525
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
        "biomePaths": "Barren:80,85 80,70 63,69 57,80 65,88;57,80 63,69 59,59 49,57 40,67 41,72 54,80;63,100 65,88 57,80 54,80 44,94 50,102;80,53 65,52 59,59 63,69 80,70;80,128 80,107 69,107 61,122 61,123 67,129;49,57 45,48 33,46 28,52 30,62 40,67;65,52 62,39 52,38 45,48 49,57 59,59;80,35 66,35 62,39 65,52 80,53;52,38 47,31 34,30 30,34 33,46 45,48;80,85 65,88 63,100 69,107 80,107;69,107 63,100 50,102 48,111 61,122;33,46 30,34 18,33 12,41 17,50 28,52;41,72 40,67 30,62 19,70 19,79 32,82;30,62 28,52 17,50 9,62 19,70;80,152 71,152 61,163 62,174 80,174;64,143 67,129 61,123 48,132 49,144 49,145;61,123 61,122 48,111 38,116 39,126 48,132;49,144 48,132 39,126 28,134 34,145;39,126 38,116 32,112 18,118 17,121 22,133 28,134;36,93 32,82 19,79 14,84 18,98 29,99;19,157 18,156 0,158 0,174 19,174;22,133 17,121 0,124 0,139 14,141;61,163 50,157 39,164 39,174 62,174;9,62 17,50 12,41 0,41 0,63;39,164 29,154 19,157 19,174 39,174;32,112 29,99 18,98 12,104 18,118;19,79 19,70 9,62 0,63 0,84 14,84;18,98 14,84 0,84 0,104 12,104;54,80 41,72 32,82 36,93 44,94;17,121 18,118 12,104 0,104 0,124;48,111 50,102 44,94 36,93 29,99 32,112 38,116\nSwamp:80,128 67,129 64,143 71,152 80,152;71,152 64,143 49,145 50,157 61,163;29,154 34,145 28,134 22,133 14,141 18,156 19,157;50,157 49,145 49,144 34,145 29,154 39,164;18,156 14,141 0,139 0,158",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 36,
            "posY": 150
          },
          {
            "id": "GravitasPedestal",
            "posX": 38,
            "posY": 150
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "posX": 25,
            "posY": 61,
            "emitRate": 8495.185,
            "idleTime": 231.27968,
            "eruptionTime": 449.08652,
            "dormancyCycles": 57.952232,
            "activeCycles": 63.55885
          },
          {
            "id": "slush_water",
            "posX": 58,
            "posY": 83,
            "emitRate": 4884.31,
            "idleTime": 396.24954,
            "eruptionTime": 445.16556,
            "dormancyCycles": 72.79184,
            "activeCycles": 74.6958
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
        "biomePaths": "Barren:44,55 35,45 21,49 19,53 21,60 35,66;76,76 77,61 74,57 57,63 56,74 62,79;37,74 35,66 21,60 13,73 16,78 26,82;96,78 96,62 77,61 76,76 79,80;21,60 19,53 0,53 0,71 13,73\nSandstone:56,74 57,63 49,55 44,55 35,66 37,74 44,79\nFrozenWastes:79,80 76,76 62,79 61,96 78,96;62,79 56,74 44,79 44,96 61,96;16,78 13,73 0,71 0,96 6,96;26,82 16,78 6,96 29,96;96,78 79,80 78,96 96,96;44,79 37,74 26,82 29,96 44,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 60,
            "posY": 76
          },
          {
            "id": "GravitasPedestal",
            "posX": 64,
            "posY": 76
          },
          {
            "id": "GeneShuffler",
            "posX": 62,
            "posY": 70
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 20,
            "posY": 85,
            "emitRate": 3718.2363,
            "idleTime": 396.46854,
            "eruptionTime": 202.00157,
            "dormancyCycles": 31.46289,
            "activeCycles": 60.022038
          },
          {
            "id": "hot_steam",
            "posX": 37,
            "posY": 82,
            "emitRate": 4667.6245,
            "idleTime": 375.7794,
            "eruptionTime": 174.29721,
            "dormancyCycles": 39.36726,
            "activeCycles": 77.868065
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
        "q": -1,
        "r": -2
      },
      {
        "id": "TundraMoonlet",
        "q": 4,
        "r": -5
      },
      {
        "id": "MarshyMoonlet",
        "q": 3,
        "r": 3
      },
      {
        "id": "NiobiumMoonlet",
        "q": -5,
        "r": -1
      },
      {
        "id": "MooMoonlet",
        "q": -6,
        "r": 7
      },
      {
        "id": "WaterMoonlet",
        "q": 0,
        "r": -7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 8,
        "r": 0
      },
      {
        "id": "TemporalTear",
        "q": -4,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 0,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -2,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -11,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -10,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -10,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 1,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -10,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 11,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 2,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 3,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -6,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -6,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 7,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 7,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 8,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -4,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -4,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 8,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -7,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 3,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 2,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -8,
        "r": -2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": 3,
        "r": -2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 10,
        "r": -5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 5,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -2,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 4,
        "r": 5
      }
    ]
  },
  {
    "coordinate": "M-FLIP-C-48360734-0-0-0",
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
          "MetalRich"
        ],
        "biomePaths": "Sandstone:64,132 65,120 52,114 41,123 41,132 53,140;70,116 70,101 64,96 51,104 52,114 65,120;103,136 89,131 79,141 79,153 103,153;128,138 106,134 103,136 103,153 128,153;79,141 64,132 53,140 53,153 79,153;53,140 41,132 27,141 28,153 53,153;27,141 21,134 0,140 0,153 28,153;41,132 41,123 28,117 21,123 21,134 27,141\nMagmaCore:101,63 114,45 107,33 101,31 86,39 85,53 98,63;98,63 85,53 66,61 71,79 88,84;85,53 86,39 77,31 61,33 57,38 66,61 66,61;66,61 57,38 46,38 33,57 47,69;30,58 14,41 0,43 0,69 22,69;33,57 46,38 37,25 20,28 14,41 30,58;128,74 128,47 114,45 101,63 112,75\nWasteland:128,74 112,75 107,89 110,95 128,97;86,96 89,87 88,84 71,79 63,86 64,96 70,101;128,116 128,97 110,95 104,110 109,116;112,75 101,63 98,63 88,84 89,87 107,89;71,79 66,61 66,61 47,69 46,78 63,86;95,110 86,96 70,101 70,116 86,120;46,78 47,69 33,57 30,58 22,69 25,80 41,83;52,114 51,104 41,98 27,105 28,117 41,123;25,80 22,69 0,69 0,85 19,88;41,98 41,83 25,80 19,88 22,100 27,105;22,100 19,88 0,85 0,110;28,117 27,105 22,100 0,110 0,114 21,123\nFrozenWastes:104,110 110,95 107,89 89,87 86,96 95,110;64,96 63,86 46,78 41,83 41,98 51,104;106,134 109,116 104,110 95,110 86,120 89,131 103,136;89,131 86,120 70,116 65,120 64,132 79,141;128,116 109,116 106,134 128,138;21,134 21,123 0,114 0,140",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 53,
            "posY": 129
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 47,
            "posY": 112
          },
          {
            "id": "WarpConduitSender",
            "posX": 66,
            "posY": 109
          },
          {
            "id": "MassiveHeatSink",
            "posX": 83,
            "posY": 127
          },
          {
            "id": "MassiveHeatSink",
            "posX": 44,
            "posY": 91
          },
          {
            "id": "MassiveHeatSink",
            "posX": 14,
            "posY": 134
          },
          {
            "id": "WarpReceiver",
            "posX": 86,
            "posY": 106
          },
          {
            "id": "WarpPortal",
            "posX": 86,
            "posY": 101
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 26,
            "posY": 44,
            "emitRate": 5327.54,
            "idleTime": 247.00389,
            "eruptionTime": 270.10962,
            "dormancyCycles": 58.550266,
            "activeCycles": 69.61089
          },
          {
            "id": "methane",
            "posX": 58,
            "posY": 92,
            "emitRate": 372.2441,
            "idleTime": 333.18082,
            "eruptionTime": 299.03854,
            "dormancyCycles": 29.655268,
            "activeCycles": 64.27863
          },
          {
            "id": "small_volcano",
            "posX": 104,
            "posY": 83,
            "emitRate": 114971.516,
            "idleTime": 9409.176,
            "eruptionTime": 77.773384,
            "dormancyCycles": 56.68746,
            "activeCycles": 99.98727
          },
          {
            "id": "slimy_po2",
            "posX": 23,
            "posY": 116,
            "emitRate": 470.32526,
            "idleTime": 313.73907,
            "eruptionTime": 200.54265,
            "dormancyCycles": 54.81965,
            "activeCycles": 72.79211
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
          "MetalRich"
        ],
        "biomePaths": "Sandstone:88,113 97,90 87,68 68,60 57,62 41,75 38,82 39,98 48,113 66,120;104,90 115,76 107,64 91,64 87,68 97,90;114,103 104,90 97,90 88,113 88,113 106,114;57,62 45,46 32,59 41,75;38,82 41,75 32,59 22,57 12,73 21,83;39,98 38,82 21,83 16,100 21,105;89,132 88,113 88,113 66,120 66,130 79,139;79,139 66,130 52,141 52,153 79,153;25,144 12,127 0,128 0,153 24,153;66,130 66,120 48,113 40,122 41,133 52,141\nToxicJungle:68,60 71,45 60,37 45,45 45,46 57,62;107,64 114,50 105,40 90,45 91,64;91,64 90,45 83,41 71,45 68,60 87,68;45,46 45,45 37,36 22,39 17,48 22,57 32,59;22,57 17,48 0,48 0,73 12,73;128,49 114,50 107,64 115,76 128,76;48,113 39,98 21,105 23,115 40,122;113,129 106,114 88,113 89,132 104,138;104,138 89,132 79,139 79,153 105,153;128,130 113,129 104,138 105,153 128,153;52,141 41,133 25,144 24,153 52,153\nOilField:128,103 128,76 115,76 104,90 114,103;16,100 21,83 12,73 0,73 0,101;41,133 40,122 23,115 12,127 25,144;128,103 114,103 106,114 113,129 128,130;12,127 23,115 21,105 16,100 0,101 0,128",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 22,
            "posY": 114
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 71,
            "posY": 61
          },
          {
            "id": "WarpPortal",
            "posX": 55,
            "posY": 94
          },
          {
            "id": "WarpReceiver",
            "posX": 77,
            "posY": 94
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 112,
            "posY": 97,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 22,
            "posY": 125,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 109,
            "posY": 116,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 23,
            "posY": 141,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 16,
            "posY": 87,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 38,
            "posY": 107,
            "emitRate": 7358.205,
            "idleTime": 310.8681,
            "eruptionTime": 150.5288,
            "dormancyCycles": 67.07723,
            "activeCycles": 96.95503
          },
          {
            "id": "chlorine_gas",
            "posX": 91,
            "posY": 63,
            "emitRate": 198.29283,
            "idleTime": 243.9751,
            "eruptionTime": 406.19196,
            "dormancyCycles": 58.591602,
            "activeCycles": 74.406395
          },
          {
            "id": "slimy_po2",
            "posX": 42,
            "posY": 53,
            "emitRate": 340.34476,
            "idleTime": 222.38327,
            "eruptionTime": 249.85007,
            "dormancyCycles": 42.410873,
            "activeCycles": 68.072655
          },
          {
            "id": "filthy_water",
            "posX": 25,
            "posY": 64,
            "emitRate": 11759.217,
            "idleTime": 664.5847,
            "eruptionTime": 265.57974,
            "dormancyCycles": 31.162848,
            "activeCycles": 81.16155
          },
          {
            "id": "liquid_co2",
            "posX": 47,
            "posY": 128,
            "emitRate": 385.59027,
            "idleTime": 295.89767,
            "eruptionTime": 361.0599,
            "dormancyCycles": 61.37696,
            "activeCycles": 53.579903
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
        "biomePaths": "BoggyMarsh:80,53 79,44 61,40 51,47 50,56 53,61 70,65;106,53 105,39 103,37 82,39 79,44 80,53 99,62;50,56 51,47 38,36 23,42 22,46 28,59;88,92 85,80 73,75 61,88 63,97 80,102;63,97 61,88 46,82 36,100 43,109 55,110;46,82 46,81 25,73 18,90 25,100 36,100;105,112 105,97 88,92 80,102 82,113 101,116;109,93 108,76 99,69 85,80 88,92 105,97;128,71 108,76 109,93 128,95;17,112 25,100 18,90 0,90 0,112;102,129 101,116 82,113 77,120 80,132 90,137;128,129 128,115 105,112 101,116 102,129 110,134;20,133 25,127 17,112 0,112 0,134;128,35 105,39 106,53 128,59\nSwamp:53,61 50,56 28,59 24,70 25,73 46,81;99,69 99,62 80,53 70,65 73,75 85,80;73,75 70,65 53,61 46,81 46,82 61,88;28,59 22,46 0,50 0,67 24,70;128,71 128,59 106,53 99,62 99,69 108,76;25,73 24,70 0,67 0,90 18,90\nMetallic:82,113 80,102 63,97 55,110 60,119 77,120;34,126 43,109 36,100 25,100 17,112 25,127;56,132 60,119 55,110 43,109 34,126 45,135;80,132 77,120 60,119 56,132 67,142;128,95 109,93 105,97 105,112 128,115\nMagmaCore:67,142 56,132 45,135 42,153 67,153;90,137 80,132 67,142 67,153 91,153;128,129 110,134 111,153 128,153;45,135 34,126 25,127 20,133 23,153 42,153;20,133 0,134 0,153 23,153;110,134 102,129 90,137 91,153 111,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 100,
            "posY": 79
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "posX": 39,
            "posY": 101,
            "emitRate": 341.09094,
            "idleTime": 269.79962,
            "eruptionTime": 336.5412,
            "dormancyCycles": 44.42842,
            "activeCycles": 117.49167
          },
          {
            "id": "molten_cobalt",
            "posX": 79,
            "posY": 109,
            "emitRate": 12606.323,
            "idleTime": 857.0826,
            "eruptionTime": 35.664585,
            "dormancyCycles": 58.096138,
            "activeCycles": 83.703156
          },
          {
            "id": "molten_gold",
            "posX": 24,
            "posY": 111,
            "emitRate": 10690.82,
            "idleTime": 670.4211,
            "eruptionTime": 35.038193,
            "dormancyCycles": 48.314186,
            "activeCycles": 81.192764
          },
          {
            "id": "molten_cobalt",
            "posX": 76,
            "posY": 124,
            "emitRate": 7734.8354,
            "idleTime": 758.9341,
            "eruptionTime": 46.592934,
            "dormancyCycles": 68.40274,
            "activeCycles": 91.420166
          },
          {
            "id": "molten_cobalt",
            "posX": 94,
            "posY": 56,
            "emitRate": 6942.086,
            "idleTime": 816.7899,
            "eruptionTime": 53.057545,
            "dormancyCycles": 49.39415,
            "activeCycles": 57.21933
          },
          {
            "id": "molten_iron",
            "posX": 101,
            "posY": 110,
            "emitRate": 7621.8125,
            "idleTime": 608.66907,
            "eruptionTime": 42.768803,
            "dormancyCycles": 33.61354,
            "activeCycles": 70.04645
          },
          {
            "id": "hot_co2",
            "posX": 53,
            "posY": 121,
            "emitRate": 364.14465,
            "idleTime": 350.41013,
            "eruptionTime": 351.32455,
            "dormancyCycles": 57.704582,
            "activeCycles": 75.62008
          },
          {
            "id": "slimy_po2",
            "posX": 115,
            "posY": 118,
            "emitRate": 266.51205,
            "idleTime": 239.27698,
            "eruptionTime": 502.01007,
            "dormancyCycles": 47.932053,
            "activeCycles": 76.85139
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
          "MetalPoor",
          "BouldersMixed"
        ],
        "biomePaths": "Forest:93,79 103,60 98,53 88,52 75,66 76,71 90,80;88,52 78,38 68,40 62,55 75,66;128,50 128,43 105,35 98,53 103,60 108,61;62,55 68,40 54,28 52,28 43,44 52,57;52,57 43,44 27,45 25,62 46,70;25,62 27,45 24,42 0,43 0,62 21,65\nToxicJungle:84,97 90,80 76,71 63,82 63,89 78,98;108,98 108,87 93,79 90,80 84,97 97,106;76,71 75,66 62,55 52,57 46,70 46,71 63,82;128,50 108,61 120,79 128,79;127,109 108,98 97,106 97,115 106,123;63,89 63,82 46,71 37,88 41,96 54,98;46,71 46,70 25,62 21,65 20,86 20,86 37,88;59,113 54,98 41,96 35,110 49,123;128,109 127,109 106,123 107,132 128,137;21,65 0,62 0,85 20,86;97,115 97,106 84,97 78,98 72,114 79,124;18,107 20,86 20,86 0,85 0,109\nRust:78,98 63,89 54,98 59,113 72,114;35,110 41,96 37,88 20,86 18,107 24,113;107,132 106,123 97,115 79,124 78,131 79,133 102,138;128,79 120,79 108,87 108,98 127,109 128,109;78,131 79,124 72,114 59,113 49,123 49,127 58,136;120,79 108,61 103,60 93,79 108,87;22,129 24,113 18,107 0,109 0,129 18,132;49,127 49,123 35,110 24,113 22,129 37,135\nMagmaCore:128,137 107,132 102,138 102,153 128,153;102,138 79,133 78,153 102,153;37,135 22,129 18,132 17,153 37,153;79,133 78,131 58,136 57,153 78,153;58,136 49,127 37,135 37,153 57,153;18,132 0,129 0,153 17,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 66,
            "posY": 112
          },
          {
            "id": "PropSurfaceSatellite3",
            "posX": 36,
            "posY": 63
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 103,
            "posY": 92,
            "emitRate": 368.2376,
            "idleTime": 182.94841,
            "eruptionTime": 201.72102,
            "dormancyCycles": 40.210182,
            "activeCycles": 65.01061
          },
          {
            "id": "slush_water",
            "posX": 21,
            "posY": 104,
            "emitRate": 4183.57,
            "idleTime": 218.74309,
            "eruptionTime": 381.3726,
            "dormancyCycles": 44.15149,
            "activeCycles": 54.482677
          },
          {
            "id": "chlorine_gas",
            "posX": 115,
            "posY": 121,
            "emitRate": 384.5644,
            "idleTime": 175.49167,
            "eruptionTime": 222.23447,
            "dormancyCycles": 39.469135,
            "activeCycles": 92.530174
          },
          {
            "id": "hot_po2",
            "posX": 62,
            "posY": 67,
            "emitRate": 369.0618,
            "idleTime": 293.33353,
            "eruptionTime": 265.4744,
            "dormancyCycles": 61.78052,
            "activeCycles": 88.02869
          },
          {
            "id": "liquid_co2",
            "posX": 28,
            "posY": 78,
            "emitRate": 474.10025,
            "idleTime": 141.34918,
            "eruptionTime": 325.01926,
            "dormancyCycles": 49.17466,
            "activeCycles": 54.134457
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
          "DistressSignal"
        ],
        "biomePaths": "Forest:128,72 128,50 112,49 107,55 107,68 113,73;107,68 107,55 90,50 83,61 90,72;102,109 107,94 106,92 87,84 84,86 81,105 84,109;113,73 107,68 90,72 87,84 106,92;128,72 113,73 106,92 107,94 128,97;38,104 38,94 22,89 13,103 22,114 25,114;21,59 24,51 15,39 0,40 0,61;45,87 42,71 26,69 19,81 22,89 38,94;26,69 21,59 0,61 0,79 19,81\nOcean:112,49 108,36 95,33 87,41 90,50 107,55;70,61 65,45 56,42 45,49 47,64 65,67;83,61 90,50 87,41 75,38 65,45 70,61;87,84 90,72 83,61 70,61 65,67 67,81 84,86;84,86 67,81 59,89 63,105 81,105;58,112 63,105 59,89 45,87 38,94 38,104 50,113;67,81 65,67 47,64 42,71 45,87 59,89;47,64 45,49 38,46 24,51 21,59 26,69 42,71\nRadioactive:103,129 106,115 102,109 84,109 81,126 88,132;128,115 128,97 107,94 102,109 106,115;81,126 84,109 81,105 63,105 58,112 68,129;128,133 128,115 106,115 103,129 108,135;66,133 68,129 58,112 50,113 41,131 47,137;50,113 38,104 25,114 36,130 41,131;36,130 25,114 22,114 8,129 23,141;8,129 22,114 13,103 0,102 0,129;22,89 19,81 0,79 0,102 13,103\nMagmaCore:88,132 81,126 68,129 66,133 70,153 86,153;66,133 47,137 46,153 70,153;47,137 41,131 36,130 23,141 22,153 46,153;108,135 103,129 88,132 86,153 106,153;23,141 8,129 0,129 0,153 22,153;128,133 108,135 106,153 128,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 20,
            "posY": 99
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 15,
            "posY": 111,
            "emitRate": 508.6167,
            "idleTime": 336.60986,
            "eruptionTime": 405.24945,
            "dormancyCycles": 50.78616,
            "activeCycles": 44.43537
          },
          {
            "id": "liquid_co2",
            "posX": 77,
            "posY": 121,
            "emitRate": 906.08997,
            "idleTime": 301.26447,
            "eruptionTime": 90.625175,
            "dormancyCycles": 42.48972,
            "activeCycles": 63.482956
          },
          {
            "id": "salt_water",
            "posX": 48,
            "posY": 71,
            "emitRate": 7132.8223,
            "idleTime": 223.62244,
            "eruptionTime": 278.02835,
            "dormancyCycles": 39.752464,
            "activeCycles": 101.14895
          },
          {
            "id": "slush_salt_water",
            "posX": 18,
            "posY": 56,
            "emitRate": 5571.1323,
            "idleTime": 443.4246,
            "eruptionTime": 310.4899,
            "dormancyCycles": 56.325317,
            "activeCycles": 70.09481
          },
          {
            "id": "slush_water",
            "posX": 115,
            "posY": 79,
            "emitRate": 4050.612,
            "idleTime": 202.54156,
            "eruptionTime": 419.62128,
            "dormancyCycles": 43.193993,
            "activeCycles": 69.01901
          },
          {
            "id": "salt_water",
            "posX": 105,
            "posY": 75,
            "emitRate": 9212.967,
            "idleTime": 311.99622,
            "eruptionTime": 412.52197,
            "dormancyCycles": 23.197405,
            "activeCycles": 47.85917
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
          "DistressSignal"
        ],
        "biomePaths": "FrozenWastes:42,52 46,44 43,36 28,36 21,44 21,45 31,56;64,62 64,46 46,44 42,52 50,63;21,45 21,44 10,35 0,36 0,57 9,57;28,66 31,56 21,45 9,57 19,69;32,86 37,75 28,66 19,69 15,76 21,87;15,76 19,69 9,57 0,57 0,78;64,83 64,62 50,63 45,73 55,84;55,84 45,73 37,75 32,86 39,94 46,94;39,94 32,86 21,87 17,95 20,105 32,107;64,26 44,34 43,36 46,44 64,46;45,73 50,63 42,52 31,56 28,66 37,75;20,105 17,95 0,94 0,111 14,112;55,106 46,94 39,94 32,107 33,111 46,115;33,111 32,107 20,105 14,112 19,128 27,128;64,83 55,84 46,94 55,106 64,107;64,107 55,106 46,115 49,128 64,128;46,115 33,111 27,128 49,128;14,112 0,111 0,128 19,128;21,87 15,76 0,78 0,94 17,95",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 48,
            "posY": 42
          },
          {
            "id": "GravitasPedestal",
            "posX": 34,
            "posY": 96
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 19,
            "posY": 65,
            "emitRate": 19367.799,
            "idleTime": 719.2428,
            "eruptionTime": 21.014114,
            "dormancyCycles": 24.335215,
            "activeCycles": 80.215775
          },
          {
            "id": "molten_iron",
            "posX": 48,
            "posY": 106,
            "emitRate": 8253.032,
            "idleTime": 793.30804,
            "eruptionTime": 52.257782,
            "dormancyCycles": 53.095455,
            "activeCycles": 83.20012
          },
          {
            "id": "molten_iron",
            "posX": 36,
            "posY": 108,
            "emitRate": 6799.6333,
            "idleTime": 760.8508,
            "eruptionTime": 56.93112,
            "dormancyCycles": 59.691673,
            "activeCycles": 77.48777
          },
          {
            "id": "molten_iron",
            "posX": 23,
            "posY": 117,
            "emitRate": 9358.113,
            "idleTime": 677.73627,
            "eruptionTime": 41.124775,
            "dormancyCycles": 79.78031,
            "activeCycles": 108.248505
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
        "biomePaths": "BoggyMarsh:34,65 40,59 37,46 28,43 20,57 31,65;64,52 64,32 48,35 46,39 57,52;46,39 48,35 44,28 30,28 25,37 28,43 37,46;64,52 57,52 49,59 54,74 64,74;43,78 34,65 31,65 23,78 32,86;20,57 28,43 25,37 16,36 5,48 18,57;9,72 18,57 5,48 0,48 0,72\nToxicJungle:57,52 46,39 37,46 40,59 49,59;23,78 31,65 20,57 18,57 9,72 17,79;54,74 49,59 40,59 34,65 43,78 47,79\nMagmaCore:64,74 54,74 47,79 51,96 64,96;47,79 43,78 32,86 32,96 51,96;32,86 23,78 17,79 12,96 32,96;17,79 9,72 0,72 0,96 12,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 37,
            "posY": 55
          },
          {
            "id": "GravitasPedestal",
            "posX": 23,
            "posY": 55
          },
          {
            "id": "SapTree",
            "posX": 30,
            "posY": 55
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 50,
            "posY": 69,
            "emitRate": 8421.845,
            "idleTime": 669.13196,
            "eruptionTime": 44.670883,
            "dormancyCycles": 42.039654,
            "activeCycles": 64.34986
          },
          {
            "id": "molten_tungsten",
            "posX": 56,
            "posY": 91,
            "emitRate": 8455.033,
            "idleTime": 737.88165,
            "eruptionTime": 44.910156,
            "dormancyCycles": 64.45612,
            "activeCycles": 86.812935
          },
          {
            "id": "molten_tungsten",
            "posX": 11,
            "posY": 87,
            "emitRate": 8503.217,
            "idleTime": 723.8178,
            "eruptionTime": 52.969276,
            "dormancyCycles": 29.913223,
            "activeCycles": 54.65362
          },
          {
            "id": "slimy_po2",
            "posX": 19,
            "posY": 69,
            "emitRate": 233.98366,
            "idleTime": 102.68441,
            "eruptionTime": 313.35593,
            "dormancyCycles": 52.77215,
            "activeCycles": 80.95607
          },
          {
            "id": "hot_hydrogen",
            "posX": 33,
            "posY": 70,
            "emitRate": 513.38165,
            "idleTime": 556.0611,
            "eruptionTime": 270.1436,
            "dormancyCycles": 48.83902,
            "activeCycles": 69.67244
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
        "biomePaths": "Moo:44,40 44,35 33,27 20,37 22,44 37,49;77,58 81,41 73,34 68,35 59,47 60,54 69,59;96,60 96,40 81,41 77,58 81,61;60,54 59,47 44,40 37,49 39,60 50,62;39,60 37,49 22,44 16,58 19,63 34,65;22,44 20,37 17,36 0,39 0,57 16,58;68,35 55,24 44,35 44,40 59,47\nFrozenWastes:34,65 19,63 15,80 35,80;50,62 39,60 34,65 35,80 55,80;19,63 16,58 0,57 0,80 15,80;69,59 60,54 50,62 55,80 62,80;81,61 77,58 69,59 62,80 81,80;96,60 81,61 81,80 96,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 33,
            "posY": 40
          },
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 40
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 70,
            "posY": 48,
            "emitRate": 301.70935,
            "idleTime": 280.67346,
            "eruptionTime": 380.64246,
            "dormancyCycles": 44.1923,
            "activeCycles": 86.57566
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
        "biomePaths": "Barren:80,75 80,57 63,55 60,66 67,76;67,37 60,31 49,36 49,49 62,54;80,97 80,75 67,76 61,87 69,97;60,66 63,55 62,54 49,49 42,53 40,62 48,70;80,97 69,97 61,108 67,118 80,118;61,87 67,76 60,66 48,70 46,79 53,88;69,97 61,87 53,88 47,98 51,107 61,108;53,88 46,79 32,83 33,97 47,98;40,62 42,53 31,46 19,53 19,58 29,67;46,79 48,70 40,62 29,67 27,79 32,83;19,58 19,53 9,43 0,43 0,67 6,67;49,49 49,36 40,30 31,36 31,46 42,53;31,46 31,36 20,30 9,43 19,53;51,107 47,98 33,97 29,102 33,114 45,115;33,97 32,83 27,79 18,81 12,91 19,101 29,102;11,113 19,101 12,91 0,91 0,113;27,123 33,114 29,102 19,101 11,113 19,123;12,91 18,81 6,67 0,67 0,91;27,79 29,67 19,58 6,67 18,81;80,118 67,118 59,129 62,137 80,138;67,118 61,108 51,107 45,115 49,126 59,129;62,137 59,129 49,126 37,137 37,138 40,143 58,144;13,135 19,123 11,113 0,113 0,135;37,138 37,137 27,123 19,123 13,135 20,144;42,161 39,157 21,159 20,174 42,174;49,126 45,115 33,114 27,123 37,137;21,159 18,155 0,156 0,174 20,174;80,36 67,37 62,54 63,55 80,57;61,157 42,161 42,174 63,174;80,154 62,156 61,157 63,174 80,174\nSwamp:80,154 80,138 62,137 58,144 62,156;61,157 62,156 58,144 40,143 39,157 42,161;18,155 20,144 13,135 0,135 0,156;39,157 40,143 37,138 20,144 18,155 21,159",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 30,
            "posY": 155
          },
          {
            "id": "GravitasPedestal",
            "posX": 32,
            "posY": 155
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 13,
            "posY": 105,
            "emitRate": 10747.482,
            "idleTime": 329.733,
            "eruptionTime": 280.22086,
            "dormancyCycles": 76.732216,
            "activeCycles": 115.62867
          },
          {
            "id": "filthy_water",
            "posX": 19,
            "posY": 64,
            "emitRate": 15824.691,
            "idleTime": 313.8924,
            "eruptionTime": 217.99158,
            "dormancyCycles": 21.881634,
            "activeCycles": 37.684647
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
        "biomePaths": "MagmaCore:47,47 51,39 47,33 34,30 29,43 35,50;29,43 34,30 33,29 18,26 13,33 19,45;64,40 51,39 47,47 53,59 64,59;15,50 19,45 13,33 0,33 0,50;64,78 64,59 53,59 46,67 48,77 50,79;29,78 30,63 18,61 13,67 17,81 18,81;50,79 48,77 35,81 35,96 50,96;18,61 15,50 0,50 0,66 13,67;17,81 13,67 0,66 0,84;48,77 46,67 33,62 30,63 29,78 35,81;18,81 17,81 0,84 0,96 19,96;64,78 50,79 50,96 64,96\nOilField:33,62 35,50 29,43 19,45 15,50 18,61 30,63;53,59 47,47 35,50 33,62 46,67;35,81 29,78 18,81 19,96 35,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 28,
            "posY": 53
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 29,
            "posY": 89,
            "emitRate": 267485.9,
            "idleTime": 10227.371,
            "eruptionTime": 77.136665,
            "dormancyCycles": 51.53157,
            "activeCycles": 67.5443
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
        "biomePaths": "Barren:121,62 121,53 109,48 99,57 101,63 111,69;129,79 130,69 121,62 111,69 112,79 120,85;83,76 81,61 70,56 63,65 66,77 79,79;45,78 50,63 46,58 34,57 28,65 33,77 41,80;160,59 143,60 142,64 149,77 160,78;12,76 18,65 12,56 0,55 0,77\nSandstone:112,79 111,69 101,63 92,76 99,85;101,63 99,57 92,55 81,61 83,76 92,76;70,56 70,54 59,45 51,47 46,58 50,63 63,65;149,77 142,64 130,69 129,79 140,86;142,64 143,60 140,52 126,49 121,53 121,62 130,69;66,77 63,65 50,63 45,78 60,83;33,77 28,65 18,65 12,76 21,85\nFrozenWastes:120,85 112,79 99,85 98,96 120,96;140,86 129,79 120,85 120,96 141,96;160,78 149,77 140,86 141,96 160,96;60,83 45,78 41,80 41,96 60,96;41,80 33,77 21,85 20,96 41,96;99,85 92,76 83,76 79,79 79,96 98,96;21,85 12,76 0,77 0,96 20,96;79,79 66,77 60,83 60,96 79,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 41,
            "posY": 69
          },
          {
            "id": "GravitasPedestal",
            "posX": 45,
            "posY": 69
          },
          {
            "id": "GeneShuffler",
            "posX": 43,
            "posY": 63
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 59,
            "posY": 54
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 126,
            "posY": 61
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 24,
            "posY": 71
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 85,
            "posY": 82,
            "emitRate": 3353.0327,
            "idleTime": 178.53342,
            "eruptionTime": 114.283966,
            "dormancyCycles": 29.236654,
            "activeCycles": 38.218227
          },
          {
            "id": "hot_steam",
            "posX": 35,
            "posY": 87,
            "emitRate": 2636.879,
            "idleTime": 345.6924,
            "eruptionTime": 442.10776,
            "dormancyCycles": 44.97876,
            "activeCycles": 65.101265
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlandsWarp",
        "q": -1,
        "r": 1
      },
      {
        "id": "MiniFlippedStart",
        "q": -4,
        "r": 4
      },
      {
        "id": "MiniMetallicSwampy",
        "q": 2,
        "r": 0
      },
      {
        "id": "MiniForestFrozen",
        "q": 0,
        "r": 3
      },
      {
        "id": "MiniRadioactiveOcean",
        "q": -3,
        "r": -1
      },
      {
        "id": "TundraMoonlet",
        "q": -1,
        "r": -8
      },
      {
        "id": "MarshyMoonlet",
        "q": 5,
        "r": 3
      },
      {
        "id": "MooMoonlet",
        "q": -1,
        "r": 8
      },
      {
        "id": "WaterMoonlet",
        "q": 6,
        "r": -8
      },
      {
        "id": "NiobiumMoonlet",
        "q": -8,
        "r": 2
      },
      {
        "id": "RegolithMoonlet",
        "q": -7,
        "r": 10
      },
      {
        "id": "TemporalTear",
        "q": -1,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 0,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 7,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -9,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -10,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 6,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 6,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 5,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -12,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 12,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -6,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -8,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 7,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 8,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 9,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 11,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 5,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 10,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -5,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 11,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -10,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -6,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -5,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 1,
        "r": -11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": 3,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -3,
        "r": -9
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": 1,
        "r": 5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -12,
        "r": 9
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -5,
        "r": 2
      }
    ]
  },
  {
    "coordinate": "V-HTFST-C-2033151263-0-0-0",
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
          "SlimeSplats",
          "Geodes"
        ],
        "biomePaths": "Forest:138,209 142,189 131,174 108,173 93,195 94,198 107,215 128,217;31,299 20,283 0,283 0,312 23,314;103,223 107,215 94,198 79,217 85,226;108,173 106,169 88,168 83,185 93,195;135,166 128,154 113,154 106,169 108,173 131,174;130,229 128,217 107,215 103,223 113,237;184,328 182,316 158,310 152,315 150,329 169,343;154,227 152,214 138,209 128,217 130,229 139,234;162,202 153,187 142,189 138,209 152,214;153,187 159,173 155,166 135,166 131,174 142,189\nMagmaCore:28,359 13,347 0,347 0,380 26,380;57,358 46,352 28,359 26,380 58,380;87,359 72,350 57,358 58,380 87,380;118,362 102,351 87,359 87,380 118,380;151,364 134,351 118,362 118,380 152,380;183,361 169,349 151,364 152,380 184,380;213,353 207,348 183,361 184,380 214,380;240,350 213,353 214,380 240,380\nOilField:13,347 29,324 23,314 0,312 0,347;46,352 45,329 29,324 13,347 28,359;72,350 74,333 55,322 45,329 46,352 57,358;102,351 103,336 87,325 74,333 72,350 87,359;134,351 135,339 119,327 103,336 102,351 118,362;169,349 169,343 150,329 135,339 134,351 151,364;207,348 206,339 184,328 169,343 169,349 183,361;240,350 240,328 216,326 206,339 207,348 213,353\nOcean:33,261 20,251 0,255 0,283 20,283;31,224 28,203 0,203 0,229 20,233;25,144 29,139 24,114 0,113 0,145;106,302 108,287 94,276 78,282 76,300 89,310;136,305 139,291 126,279 108,287 106,302 120,313;191,129 181,113 166,114 157,137 162,144 182,145;218,297 211,280 190,279 185,286 189,307 210,308;219,267 209,248 197,248 185,262 190,279 211,280;240,235 240,204 215,205 209,215 219,235\nRadioactive:20,251 20,233 0,229 0,255;44,81 37,64 29,63 19,84 30,92;158,310 158,287 158,287 139,291 136,305 152,315;208,99 213,90 209,79 185,80 184,81 190,99\nRust:32,198 27,174 0,175 0,203 28,203;27,174 31,170 25,144 0,145 0,175;94,276 98,257 79,245 71,248 66,273 78,282;82,129 85,107 65,98 52,112 56,130;96,101 93,78 70,77 62,86 65,98 85,107;109,252 113,237 103,223 85,226 79,245 98,257;126,279 128,265 109,252 98,257 94,276 108,287;138,135 132,124 113,123 103,136 113,154 128,154;127,90 128,82 121,74 96,74 93,78 96,101 105,104;166,114 157,104 140,106 132,124 138,135 157,137;189,307 185,286 158,287 158,310 182,316;184,226 187,219 179,203 162,202 152,214 154,227 165,233;219,235 209,215 187,219 184,226 197,248 209,248;216,147 208,129 191,129 182,145 189,159 208,160;240,298 218,297 210,308 216,326 240,328\nToxicJungle:31,107 30,92 19,84 0,85 0,113 24,114;55,322 57,307 46,297 31,299 23,314 29,324 45,329;46,297 53,276 35,261 33,261 20,283 31,299;94,198 93,195 83,185 62,187 56,198 62,214 79,217;76,300 78,282 66,273 53,276 46,297 57,307;79,245 85,226 79,217 62,214 50,230 53,240 71,248;83,185 88,168 80,157 59,158 53,168 62,187;80,157 88,136 82,129 56,130 51,138 59,158;113,154 103,136 88,136 80,157 88,168 106,169;103,136 113,123 105,104 96,101 85,107 82,129 88,136;140,258 139,234 130,229 113,237 109,252 128,265;158,287 156,264 140,258 128,265 126,279 139,291;157,104 162,85 152,73 128,82 127,90 140,106;166,257 165,233 154,227 139,234 140,258 156,264;155,166 162,144 157,137 138,135 128,154 135,166;216,326 210,308 189,307 182,316 184,328 206,339;197,248 184,226 165,233 166,257 185,262;189,159 182,145 162,144 155,166 159,173 181,174;188,188 181,174 159,173 153,187 162,202 179,203;216,176 208,160 189,159 181,174 188,188 208,189;240,267 219,267 211,280 218,297 240,298\nBarren:19,84 29,63 22,55 0,54 0,85;70,77 65,55 53,52 37,64 44,81 62,86;96,74 93,52 78,46 65,55 70,77 93,78;121,74 125,53 108,42 93,52 96,74;152,73 154,59 137,48 125,53 121,74 128,82;184,81 185,80 182,59 166,53 154,59 152,73 162,85;209,79 216,62 211,54 194,49 182,59 185,80;240,90 240,65 216,62 209,79 213,90\nBoggyMarsh:35,261 53,240 50,230 31,224 20,233 20,251 33,261;66,273 71,248 53,240 35,261 53,276;65,98 62,86 44,81 30,92 31,107 52,112;150,329 152,315 136,305 120,313 119,327 135,339;140,106 127,90 105,104 113,123 132,124;209,215 215,205 208,189 188,188 179,203 187,219;240,267 240,235 219,235 209,248 219,267;240,204 240,176 216,176 208,189 215,205;240,118 240,90 213,90 208,99 216,118\nWasteland:62,214 56,198 32,198 28,203 31,224 50,230;56,198 62,187 53,168 31,170 27,174 32,198;53,168 59,158 51,138 29,139 25,144 31,170;51,138 56,130 52,112 31,107 24,114 29,139;87,325 89,310 76,300 57,307 55,322 74,333;119,327 120,313 106,302 89,310 87,325 103,336;181,113 190,99 184,81 162,85 157,104 166,114;185,286 190,279 185,262 166,257 156,264 158,287 158,287;208,129 216,118 208,99 190,99 181,113 191,129;240,147 216,147 208,160 216,176 240,176;240,147 240,118 216,118 208,129 216,147",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 118,
            "posY": 196
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 189,
            "posY": 230
          },
          {
            "id": "WarpConduitSender",
            "posX": 203,
            "posY": 257
          },
          {
            "id": "GravitasPedestal",
            "posX": 87,
            "posY": 276
          },
          {
            "id": "WarpReceiver",
            "posX": 125,
            "posY": 293
          },
          {
            "id": "WarpPortal",
            "posX": 124,
            "posY": 287
          },
          {
            "id": "GeneShuffler",
            "posX": 49,
            "posY": 340
          },
          {
            "id": "GeneShuffler",
            "posX": 155,
            "posY": 313
          },
          {
            "id": "GeneShuffler",
            "posX": 191,
            "posY": 140
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 63,
            "posY": 285,
            "emitRate": 4120.4775,
            "idleTime": 194.38498,
            "eruptionTime": 265.4125,
            "dormancyCycles": 50.27052,
            "activeCycles": 86.8048
          },
          {
            "id": "methane",
            "posX": 61,
            "posY": 162,
            "emitRate": 384.34756,
            "idleTime": 362.21805,
            "eruptionTime": 303.61258,
            "dormancyCycles": 52.38611,
            "activeCycles": 72.68414
          },
          {
            "id": "steam",
            "posX": 61,
            "posY": 268,
            "emitRate": 5250.3965,
            "idleTime": 359.52008,
            "eruptionTime": 267.04346,
            "dormancyCycles": 62.841896,
            "activeCycles": 94.475685
          },
          {
            "id": "methane",
            "posX": 33,
            "posY": 232,
            "emitRate": 274.4555,
            "idleTime": 319.79236,
            "eruptionTime": 498.66736,
            "dormancyCycles": 61.003075,
            "activeCycles": 69.59826
          },
          {
            "id": "salt_water",
            "posX": 192,
            "posY": 283,
            "emitRate": 11647.322,
            "idleTime": 350.15857,
            "eruptionTime": 289.96167,
            "dormancyCycles": 44.998398,
            "activeCycles": 89.217316
          },
          {
            "id": "OilWell",
            "posX": 29,
            "posY": 330,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 201,
            "posY": 342,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 184,
            "posY": 336,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "methane",
            "posX": 124,
            "posY": 150,
            "emitRate": 316.13025,
            "idleTime": 282.19547,
            "eruptionTime": 386.2604,
            "dormancyCycles": 55.439987,
            "activeCycles": 70.1756
          },
          {
            "id": "hot_po2",
            "posX": 97,
            "posY": 240,
            "emitRate": 233.71309,
            "idleTime": 131.15826,
            "eruptionTime": 414.36865,
            "dormancyCycles": 52.697163,
            "activeCycles": 74.72546
          },
          {
            "id": "molten_aluminum",
            "posX": 214,
            "posY": 232,
            "emitRate": 10175.444,
            "idleTime": 576.566,
            "eruptionTime": 33.063908,
            "dormancyCycles": 35.930565,
            "activeCycles": 67.80185
          },
          {
            "id": "oil_drip",
            "posX": 204,
            "posY": 107,
            "emitRate": 307.31262,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.20466948,
            "activeCycles": 0.3598138
          },
          {
            "id": "hot_hydrogen",
            "posX": 117,
            "posY": 262,
            "emitRate": 336.33002,
            "idleTime": 336.9606,
            "eruptionTime": 368.89627,
            "dormancyCycles": 36.208958,
            "activeCycles": 54.19932
          },
          {
            "id": "oil_drip",
            "posX": 222,
            "posY": 303,
            "emitRate": 313.20218,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.23497902,
            "activeCycles": 0.33170575
          },
          {
            "id": "big_volcano",
            "posX": 149,
            "posY": 346,
            "emitRate": 275577.8,
            "idleTime": 8952.285,
            "eruptionTime": 63.252872,
            "dormancyCycles": 27.846376,
            "activeCycles": 24.937008
          },
          {
            "id": "small_volcano",
            "posX": 221,
            "posY": 152,
            "emitRate": 140115.56,
            "idleTime": 9051.925,
            "eruptionTime": 62.322266,
            "dormancyCycles": 68.55156,
            "activeCycles": 78.0267
          },
          {
            "id": "molten_gold",
            "posX": 126,
            "posY": 236,
            "emitRate": 14161.663,
            "idleTime": 594.25793,
            "eruptionTime": 23.51694,
            "dormancyCycles": 55.841385,
            "activeCycles": 74.51604
          },
          {
            "id": "small_volcano",
            "posX": 85,
            "posY": 127,
            "emitRate": 125857.05,
            "idleTime": 11017.132,
            "eruptionTime": 84.75364,
            "dormancyCycles": 18.32734,
            "activeCycles": 69.33608
          },
          {
            "id": "molten_cobalt",
            "posX": 218,
            "posY": 213,
            "emitRate": 9844.83,
            "idleTime": 794.8481,
            "eruptionTime": 47.562775,
            "dormancyCycles": 41.115356,
            "activeCycles": 51.88425
          },
          {
            "id": "salt_water",
            "posX": 82,
            "posY": 103,
            "emitRate": 11077.537,
            "idleTime": 253.36066,
            "eruptionTime": 191.38141,
            "dormancyCycles": 52.383698,
            "activeCycles": 77.73039
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
          "BouldersMedium",
          "DistressSignal"
        ],
        "biomePaths": "Sandstone:76,124 82,105 74,98 59,103 58,113 73,125;160,70 160,49 141,50 139,71;98,59 98,44 93,40 74,45 74,58 84,65;104,83 107,65 98,59 84,65 83,78 98,86;114,107 121,94 119,90 104,83 98,86 94,103 99,108;144,92 139,72 129,73 119,90 121,94 138,98;83,78 84,65 74,58 58,66 60,78 74,84;58,113 59,103 48,92 44,91 33,109 45,121;16,76 22,57 0,52 0,76;97,127 99,108 94,103 82,105 76,124 93,130;94,103 98,86 83,78 74,84 74,98 82,105;120,117 114,107 99,108 97,127 113,131;24,109 16,99 0,100 0,124 16,124\nFrozenWastes:139,72 139,71 141,50 136,46 123,47 118,63 129,73;118,63 123,47 115,40 98,44 98,59 107,65;24,56 28,42 20,32 0,37 0,52 22,57;50,62 51,43 44,38 28,42 24,56 41,65;108,154 90,150 89,176 106,176;90,150 90,150 75,150 69,158 73,176 89,176\nBarren:74,58 74,45 69,40 51,43 50,62 58,66;16,99 23,84 16,76 0,76 0,100;160,114 140,113 136,117 139,134 160,134;140,113 138,98 121,94 114,107 120,117 136,117;129,73 118,63 107,65 104,83 119,90\nSwamp:74,98 74,84 60,78 48,92 59,103;160,70 139,71 139,72 144,92 160,93;35,83 41,65 24,56 22,57 16,76 23,84;67,136 73,125 58,113 45,121 44,127 55,138;160,93 144,92 138,98 140,113 160,114;60,78 58,66 50,62 41,65 35,83 44,91 48,92;44,127 45,121 33,109 24,109 16,124 23,134 30,136;33,109 44,91 35,83 23,84 16,99 24,109;139,134 136,117 120,117 113,131 115,136 136,138\nRadioactive:90,150 93,130 76,124 73,125 67,136 75,150;75,150 67,136 55,138 48,155 49,157 69,158;55,138 44,127 30,136 37,153 48,155;111,151 115,136 113,131 97,127 93,130 90,150 90,150 108,154;137,152 136,138 115,136 111,151 125,158;125,158 111,151 108,154 106,176 125,176;37,153 30,136 23,134 10,151 24,162;69,158 49,157 48,176 73,176;49,157 48,155 37,153 24,162 24,176 48,176;10,151 23,134 16,124 0,124 0,151;24,162 10,151 0,151 0,176 24,176;160,153 160,134 139,134 136,138 137,152 143,156;143,156 137,152 125,158 125,176 143,176;160,153 143,156 143,176 160,176",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 92,
            "posY": 72
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 49,
            "posY": 125
          },
          {
            "id": "MassiveHeatSink",
            "posX": 136,
            "posY": 54
          },
          {
            "id": "WarpPortal",
            "posX": 62,
            "posY": 113
          },
          {
            "id": "WarpReceiver",
            "posX": 81,
            "posY": 113
          },
          {
            "id": "GeneShuffler",
            "posX": 27,
            "posY": 45
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 62,
            "posY": 160,
            "emitRate": 328.31296,
            "idleTime": 90.13118,
            "eruptionTime": 588.33856,
            "dormancyCycles": 35.99784,
            "activeCycles": 70.99673
          },
          {
            "id": "liquid_co2",
            "posX": 14,
            "posY": 159,
            "emitRate": 633.5898,
            "idleTime": 500.90265,
            "eruptionTime": 311.15753,
            "dormancyCycles": 39.454735,
            "activeCycles": 64.6236
          },
          {
            "id": "slush_water",
            "posX": 135,
            "posY": 70,
            "emitRate": 3216.4807,
            "idleTime": 199.6198,
            "eruptionTime": 412.3596,
            "dormancyCycles": 30.086084,
            "activeCycles": 44.256214
          },
          {
            "id": "slush_salt_water",
            "posX": 106,
            "posY": 54,
            "emitRate": 3876.404,
            "idleTime": 264.7182,
            "eruptionTime": 419.33344,
            "dormancyCycles": 41.97439,
            "activeCycles": 66.43188
          },
          {
            "id": "molten_iron",
            "posX": 109,
            "posY": 167,
            "emitRate": 6809.131,
            "idleTime": 707.36224,
            "eruptionTime": 61.22532,
            "dormancyCycles": 46.120693,
            "activeCycles": 100.81133
          },
          {
            "id": "hot_steam",
            "posX": 28,
            "posY": 145,
            "emitRate": 1485.5758,
            "idleTime": 188.97983,
            "eruptionTime": 242.31955,
            "dormancyCycles": 43.636627,
            "activeCycles": 58.0811
          },
          {
            "id": "molten_copper",
            "posX": 13,
            "posY": 61,
            "emitRate": 5347.6484,
            "idleTime": 696.0166,
            "eruptionTime": 59.016502,
            "dormancyCycles": 67.66871,
            "activeCycles": 98.557175
          },
          {
            "id": "filthy_water",
            "posX": 31,
            "posY": 98,
            "emitRate": 8157.875,
            "idleTime": 329.15146,
            "eruptionTime": 395.97574,
            "dormancyCycles": 52.753082,
            "activeCycles": 103.50986
          },
          {
            "id": "hot_co2",
            "posX": 126,
            "posY": 90,
            "emitRate": 367.09225,
            "idleTime": 125.64284,
            "eruptionTime": 150.3846,
            "dormancyCycles": 64.345924,
            "activeCycles": 89.80362
          },
          {
            "id": "slimy_po2",
            "posX": 122,
            "posY": 121,
            "emitRate": 443.78378,
            "idleTime": 415.06134,
            "eruptionTime": 285.42493,
            "dormancyCycles": 45.751526,
            "activeCycles": 71.34688
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
        "biomePaths": "FrozenWastes:41,50 42,47 40,42 23,35 19,37 17,52 23,58;64,31 46,31 40,42 42,47 64,47;46,64 41,50 23,58 23,69 41,73;23,69 23,58 17,52 0,55 0,70 20,72;64,94 64,81 43,79 40,89 49,97;40,89 43,79 41,73 23,69 20,72 20,87 32,92;64,63 64,47 42,47 41,50 46,64;20,87 20,72 0,70 0,89 15,91;17,52 19,37 0,32 0,55;46,110 49,97 40,89 32,92 30,108 42,113;64,115 46,110 42,113 41,128 64,128;64,63 46,64 41,73 43,79 64,81;16,108 15,91 0,89 0,111;30,108 32,92 20,87 15,91 16,108 21,111;42,113 30,108 21,111 20,128 41,128;64,94 49,97 46,110 64,115;21,111 16,108 0,111 0,128 20,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 23,
            "posY": 53
          },
          {
            "id": "GravitasPedestal",
            "posX": 40,
            "posY": 108
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 22,
            "posY": 91,
            "emitRate": 9528.971,
            "idleTime": 720.35046,
            "eruptionTime": 43.601063,
            "dormancyCycles": 51.89541,
            "activeCycles": 86.51915
          },
          {
            "id": "molten_iron",
            "posX": 9,
            "posY": 88,
            "emitRate": 8925.899,
            "idleTime": 732.60974,
            "eruptionTime": 44.575153,
            "dormancyCycles": 58.424244,
            "activeCycles": 70.40933
          },
          {
            "id": "molten_iron",
            "posX": 49,
            "posY": 69,
            "emitRate": 7648.2905,
            "idleTime": 793.52686,
            "eruptionTime": 54.573326,
            "dormancyCycles": 34.068573,
            "activeCycles": 62.332623
          },
          {
            "id": "molten_iron",
            "posX": 51,
            "posY": 103,
            "emitRate": 9781.803,
            "idleTime": 720.6454,
            "eruptionTime": 40.869907,
            "dormancyCycles": 47.232452,
            "activeCycles": 65.31048
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
        "biomePaths": "BoggyMarsh:45,43 45,37 43,35 29,33 22,39 32,54;32,56 32,54 22,39 20,39 10,52 17,61 24,62;48,64 52,51 45,43 32,54 32,56 45,66;20,39 12,32 0,33 0,51 10,52;64,50 64,33 45,37 45,43 52,51\nToxicJungle:27,77 24,62 17,61 6,74 17,81;6,74 17,61 10,52 0,51 0,74;42,75 45,66 32,56 24,62 27,77 32,79;64,79 64,69 48,64 45,66 42,75 49,82;64,50 52,51 48,64 64,69\nMagmaCore:17,81 6,74 0,74 0,96 15,96;32,79 27,77 17,81 15,96 33,96;49,82 42,75 32,79 33,96 48,96;64,79 49,82 48,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 40,
            "posY": 43
          },
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 43
          },
          {
            "id": "SapTree",
            "posX": 33,
            "posY": 43
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 30,
            "posY": 91,
            "emitRate": 7763.73,
            "idleTime": 737.6762,
            "eruptionTime": 46.788128,
            "dormancyCycles": 44.340363,
            "activeCycles": 67.929596
          },
          {
            "id": "molten_tungsten",
            "posX": 13,
            "posY": 91,
            "emitRate": 7612.571,
            "idleTime": 737.22473,
            "eruptionTime": 49.612217,
            "dormancyCycles": 46.85862,
            "activeCycles": 91.2788
          },
          {
            "id": "molten_tungsten",
            "posX": 50,
            "posY": 91,
            "emitRate": 8765.332,
            "idleTime": 713.1356,
            "eruptionTime": 44.77816,
            "dormancyCycles": 51.116093,
            "activeCycles": 79.63018
          },
          {
            "id": "slimy_po2",
            "posX": 51,
            "posY": 46,
            "emitRate": 331.99353,
            "idleTime": 353.00278,
            "eruptionTime": 431.65756,
            "dormancyCycles": 50.10113,
            "activeCycles": 68.46158
          },
          {
            "id": "methane",
            "posX": 51,
            "posY": 74,
            "emitRate": 411.49323,
            "idleTime": 424.43393,
            "eruptionTime": 239.90298,
            "dormancyCycles": 44.797974,
            "activeCycles": 75.37555
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
        "biomePaths": "MagmaCore:64,30 49,31 45,46 46,47 64,49;44,62 46,47 45,46 33,44 24,56 31,64;49,31 41,22 28,34 33,44 45,46;64,63 47,65 47,79 64,84;47,79 47,65 44,62 31,64 28,76 40,85;33,44 28,34 20,31 9,44 19,55 24,56;64,63 64,49 46,47 44,62 47,65;5,70 19,55 9,44 0,43 0,71;19,80 5,70 0,71 0,96 16,96\nOilField:64,84 47,79 40,85 40,96 64,96;28,76 31,64 24,56 19,55 5,70 19,80;40,85 28,76 19,80 16,96 40,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 80
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 21,
            "posY": 60,
            "emitRate": 273619.94,
            "idleTime": 8250.55,
            "eruptionTime": 57.318703,
            "dormancyCycles": 44.800217,
            "activeCycles": 70.10496
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
        "biomePaths": "Moo:96,31 79,32 77,34 79,46 96,49;79,46 77,34 63,33 58,40 60,47 74,52;38,46 44,36 42,32 29,26 20,36 29,46;29,46 20,36 19,36 7,46 20,61 21,61;96,62 96,49 79,46 74,52 74,61 79,65;51,58 60,47 58,40 44,36 38,46 46,59;74,61 74,52 60,47 51,58 61,67;46,59 38,46 29,46 21,61 22,63 41,65;20,61 7,46 0,46 0,69\nFrozenWastes:22,63 21,61 20,61 0,69 0,80 22,80;61,67 51,58 46,59 41,65 42,80 59,80;41,65 22,63 22,80 42,80;79,65 74,61 61,67 59,80 79,80;96,62 79,65 79,80 96,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 79,
            "posY": 55
          },
          {
            "id": "GravitasPedestal",
            "posX": 72,
            "posY": 55
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 32,
            "posY": 37,
            "emitRate": 578.5315,
            "idleTime": 340.764,
            "eruptionTime": 207.61385,
            "dormancyCycles": 38.183025,
            "activeCycles": 62.7776
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
        "biomePaths": "Barren:70,70 62,58 58,57 49,66 52,78 61,80;52,78 49,66 39,63 33,68 33,78 43,86;80,70 70,70 61,80 66,90 80,92;58,57 51,47 37,49 39,63 49,66;80,48 72,48 62,58 70,70 80,70;51,47 56,36 53,32 38,30 34,35 37,48 37,49;72,48 64,36 56,36 51,47 58,57 62,58;39,63 37,49 37,48 21,52 19,62 33,68;66,90 61,80 52,78 43,86 43,90 56,101 57,101;43,90 43,86 33,78 21,84 21,93 33,99;33,78 33,68 19,62 16,64 15,79 21,84;56,101 43,90 33,99 34,109 42,114;16,46 19,33 18,31 0,30 0,47;34,109 33,99 21,93 15,98 17,115 19,116;62,121 65,111 57,101 56,101 42,114 43,120 51,125;80,109 80,92 66,90 57,101 65,111;43,120 42,114 34,109 19,116 22,127 32,131;21,93 21,84 15,79 0,82 0,96 15,98;19,62 21,52 16,46 0,47 0,62 16,64;52,139 51,125 43,120 32,131 35,139 47,143;22,127 19,116 17,115 0,117 0,134 13,135;15,79 16,64 0,62 0,82;17,115 15,98 0,96 0,117;32,158 26,150 20,150 13,155 17,174 27,174;46,158 32,158 27,174 47,174;63,158 47,157 46,158 47,174 65,174;80,153 67,153 63,158 65,174 80,174;37,48 34,35 19,33 16,46 21,52;71,131 62,121 51,125 52,139 63,141;80,131 80,109 65,111 62,121 71,131;13,155 0,154 0,174 17,174\nSwamp:35,139 32,131 22,127 13,135 20,150 26,150;46,158 47,157 47,143 35,139 26,150 32,158;20,150 13,135 0,134 0,154 13,155;67,153 63,141 52,139 47,143 47,157 63,158;80,131 71,131 63,141 67,153 80,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 133
          },
          {
            "id": "GravitasPedestal",
            "posX": 28,
            "posY": 133
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "posX": 24,
            "posY": 86,
            "emitRate": 12978.087,
            "idleTime": 483.1159,
            "eruptionTime": 323.87897,
            "dormancyCycles": 48.589245,
            "activeCycles": 76.55141
          },
          {
            "id": "slush_water",
            "posX": 26,
            "posY": 109,
            "emitRate": 5232.22,
            "idleTime": 347.9805,
            "eruptionTime": 349.88058,
            "dormancyCycles": 29.115751,
            "activeCycles": 32.792274
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
        "biomePaths": "Barren:96,78 96,63 77,63 76,76 80,80;76,76 77,63 76,62 59,60 56,75 64,80;38,73 39,57 38,56 22,55 18,64 22,74 31,76;22,74 18,64 0,63 0,79 15,80;22,55 19,48 0,48 0,63 18,64\nFrozenWastes:48,78 38,73 31,76 32,96 46,96;64,80 56,75 48,78 46,96 63,96;80,80 76,76 64,80 63,96 79,96;31,76 22,74 15,80 18,96 32,96;96,78 80,80 79,96 96,96;15,80 0,79 0,96 18,96\nSandstone:56,75 59,60 57,57 39,57 38,73 48,78",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 13,
            "posY": 76
          },
          {
            "id": "GravitasPedestal",
            "posX": 17,
            "posY": 76
          },
          {
            "id": "GeneShuffler",
            "posX": 15,
            "posY": 70
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 39,
            "posY": 81,
            "emitRate": 5325.4443,
            "idleTime": 177.98564,
            "eruptionTime": 196.82796,
            "dormancyCycles": 54.102947,
            "activeCycles": 79.67812
          },
          {
            "id": "steam",
            "posX": 72,
            "posY": 83,
            "emitRate": 5062.993,
            "idleTime": 260.43378,
            "eruptionTime": 197.63295,
            "dormancyCycles": 43.1082,
            "activeCycles": 63.347664
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
        "q": 2,
        "r": -3
      },
      {
        "id": "TundraMoonlet",
        "q": -2,
        "r": 5
      },
      {
        "id": "MarshyMoonlet",
        "q": -6,
        "r": 2
      },
      {
        "id": "NiobiumMoonlet",
        "q": 0,
        "r": -5
      },
      {
        "id": "MooMoonlet",
        "q": 4,
        "r": -7
      },
      {
        "id": "WaterMoonlet",
        "q": -7,
        "r": 7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 3,
        "r": 5
      },
      {
        "id": "TemporalTear",
        "q": -9,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -3,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 4,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 11,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 10,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 10,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 10,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 11,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 2,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -10,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -1,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 0,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 0,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -4,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -4,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -5,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -5,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -6,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 1,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 6,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -11,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -11,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 6,
        "r": -10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -5,
        "r": 8
      }
    ]
  },
  {
    "coordinate": "V-SWMP-C-771155177-0-0-0",
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
          "CrashedSatellites",
          "FrozenCore",
          "GlaciersLarge"
        ],
        "biomePaths": "Swamp:130,204 149,187 154,172 154,160 140,138 118,130 102,132 83,148 78,168 80,183 87,194 111,206;162,155 161,137 146,132 140,138 154,160;179,175 178,161 162,155 154,160 154,172 177,178;175,188 177,178 154,172 149,187 157,195;146,132 143,118 124,116 118,130 140,138;102,132 92,120 77,130 78,144 83,148;155,207 157,195 149,187 130,204 133,210;83,148 78,144 59,153 60,164 78,168;131,221 133,210 130,204 111,206 108,214 112,228 112,228;111,206 87,194 82,210 108,214;80,183 78,168 60,164 55,172 60,187\nWasteland:176,125 174,111 152,106 143,118 146,132 161,137;182,101 179,84 159,81 149,92 152,106 174,111;180,219 186,202 175,188 157,195 155,207 164,220;156,238 164,220 155,207 133,210 131,221 147,239;123,255 112,228 112,228 93,240 94,256 113,264;135,255 147,239 131,221 112,228 123,255;138,286 146,272 135,255 123,255 113,264 114,272 134,287;85,284 80,267 70,263 55,272 53,288 56,293 71,296;92,318 103,302 98,288 85,284 71,296 80,319;48,145 51,121 29,117 20,133 30,150;82,210 87,194 80,183 60,187 55,198 59,209 78,214;59,209 55,198 31,196 25,210 30,221 48,224\nFrozenWastes:152,106 149,92 133,87 118,102 124,116 143,118;212,163 209,156 190,150 178,161 179,175 206,179;240,111 240,91 213,88 206,106 209,114;206,199 209,187 206,179 179,175 177,178 175,188 186,202;56,118 58,109 43,90 33,91 24,106 29,117 51,121;92,120 93,109 76,98 58,109 56,118 77,130;78,144 77,130 56,118 51,121 48,145 59,153;181,249 188,227 180,219 164,220 156,238 167,249;240,283 240,257 213,258 211,283 211,283;188,255 181,249 167,249 157,272 163,279 184,279;112,228 108,214 82,210 78,214 79,233 93,240;204,323 204,312 179,300 169,322 186,334;179,357 154,350 153,351 150,380 179,380;208,358 186,352 179,357 179,380 208,380;213,258 209,254 188,255 184,279 185,281 211,283;102,349 79,348 74,353 77,380 99,380;60,187 55,172 32,172 27,185 31,196 55,198;240,359 213,355 208,358 208,380 240,380;153,351 137,347 126,356 127,380 150,380;79,233 78,214 59,209 48,224 54,238 65,242;54,238 48,224 30,221 21,237 29,251 38,253;30,221 25,210 0,209 0,236 21,237;24,352 0,352 0,380 29,380;74,353 52,352 47,380 77,380;126,356 103,348 102,349 99,380 127,380;52,352 46,346 31,346 24,352 29,380 47,380;20,265 29,251 21,237 0,236 0,266\nToxicJungle:208,120 209,114 206,106 182,101 174,111 176,125 187,131;240,139 218,139 209,156 212,163 240,166;240,166 212,163 206,179 209,187 240,187;107,99 102,80 82,75 77,80 76,98 93,109;209,254 212,233 208,227 188,227 181,249 188,255;240,233 240,208 212,210 208,227 212,233;33,91 23,79 0,79 0,104 24,106;114,272 113,264 94,256 80,267 85,284 98,288;134,287 114,272 98,288 103,302 122,305;149,316 150,294 138,286 134,287 122,305 130,323 130,323;167,249 156,238 147,239 135,255 146,272 157,272;56,293 53,288 31,281 22,293 30,313 46,313;31,281 31,277 20,265 0,266 0,293 22,293;31,196 27,185 0,184 0,209 25,210;26,160 30,150 20,133 0,133 0,162\nSandstone:190,150 187,131 176,125 161,137 162,155 178,161;218,139 208,120 187,131 190,150 209,156;240,208 240,187 209,187 206,199 212,210;208,227 212,210 206,199 186,202 180,219 188,227;118,130 124,116 118,102 107,99 93,109 92,120 102,132;94,256 93,240 79,233 65,242 70,263 80,267;32,172 26,160 0,162 0,184 27,185;55,172 60,164 59,153 48,145 30,150 26,160 32,172\nBoggyMarsh:213,88 209,80 187,76 179,84 182,101 206,106;240,139 240,111 209,114 208,120 218,139;240,257 240,233 212,233 209,254 213,258;20,133 29,117 24,106 0,104 0,133;70,263 65,242 54,238 38,253 43,266 55,272;211,305 211,283 211,283 185,281 179,299 179,300 204,312;169,322 179,300 179,299 160,289 150,294 149,316 163,324;240,326 240,311 211,305 204,312 204,323 214,332;240,283 211,283 211,305 240,311;75,324 80,319 71,296 56,293 46,313 54,324;22,322 30,313 22,293 0,293 0,323\nBarren:240,64 217,62 209,80 213,88 240,91;187,76 184,58 164,53 155,61 159,81 179,84;159,81 155,61 142,58 127,70 133,87 149,92;133,87 127,70 115,66 102,80 107,99 118,102;115,66 110,54 90,48 82,55 82,75 102,80;82,75 82,55 61,49 50,60 55,75 77,80;76,98 77,80 55,75 43,90 58,109;23,79 31,56 29,53 0,51 0,79;43,90 55,75 50,60 31,56 23,79 33,91;217,62 212,53 192,49 184,58 187,76 209,80\nRadioactive:160,289 163,279 157,272 146,272 138,286 150,294;55,272 43,266 31,277 31,281 53,288;185,281 184,279 163,279 160,289 179,299;43,266 38,253 29,251 20,265 31,277\nOilField:130,323 122,305 103,302 92,318 105,334;137,347 130,323 130,323 105,334 103,348 126,356;154,350 163,324 149,316 130,323 137,347 153,351;213,355 214,332 204,323 186,334 186,352 208,358;186,352 186,334 169,322 163,324 154,350 179,357;54,324 46,313 30,313 22,322 31,346 46,346;79,348 75,324 54,324 46,346 52,352 74,353;31,346 22,322 0,323 0,352 24,352;240,326 214,332 213,355 240,359;103,348 105,334 92,318 80,319 75,324 79,348 102,349",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 115,
            "posY": 168
          },
          {
            "id": "MassiveHeatSink",
            "posX": 176,
            "posY": 275
          },
          {
            "id": "MassiveHeatSink",
            "posX": 207,
            "posY": 279
          },
          {
            "id": "MassiveHeatSink",
            "posX": 44,
            "posY": 241
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 216,
            "posY": 128
          },
          {
            "id": "WarpConduitSender",
            "posX": 37,
            "posY": 119
          },
          {
            "id": "GravitasPedestal",
            "posX": 205,
            "posY": 167
          },
          {
            "id": "WarpReceiver",
            "posX": 73,
            "posY": 232
          },
          {
            "id": "WarpPortal",
            "posX": 72,
            "posY": 226
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 170,
            "posY": 106
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 207,
            "posY": 88
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 111,
            "posY": 111
          },
          {
            "id": "GeneShuffler",
            "posX": 77,
            "posY": 149
          },
          {
            "id": "GeneShuffler",
            "posX": 20,
            "posY": 341
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 104,
            "posY": 295,
            "emitRate": 6037.1113,
            "idleTime": 296.0489,
            "eruptionTime": 232.39069,
            "dormancyCycles": 48.51882,
            "activeCycles": 63.06342
          },
          {
            "id": "chlorine_gas",
            "posX": 140,
            "posY": 251,
            "emitRate": 430.60178,
            "idleTime": 421.34268,
            "eruptionTime": 293.73544,
            "dormancyCycles": 48.785522,
            "activeCycles": 68.33804
          },
          {
            "id": "steam",
            "posX": 169,
            "posY": 298,
            "emitRate": 4225.339,
            "idleTime": 280.09924,
            "eruptionTime": 320.6482,
            "dormancyCycles": 55.726986,
            "activeCycles": 72.02929
          },
          {
            "id": "methane",
            "posX": 214,
            "posY": 240,
            "emitRate": 383.27667,
            "idleTime": 320.8497,
            "eruptionTime": 365.53842,
            "dormancyCycles": 45.98536,
            "activeCycles": 80.74606
          },
          {
            "id": "slush_water",
            "posX": 45,
            "posY": 189,
            "emitRate": 6288.565,
            "idleTime": 251.17628,
            "eruptionTime": 153.82118,
            "dormancyCycles": 45.915718,
            "activeCycles": 68.074165
          },
          {
            "id": "slush_salt_water",
            "posX": 181,
            "posY": 239,
            "emitRate": 5462.1797,
            "idleTime": 307.97043,
            "eruptionTime": 230.57301,
            "dormancyCycles": 59.240417,
            "activeCycles": 79.481094
          },
          {
            "id": "OilWell",
            "posX": 72,
            "posY": 330,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 121,
            "posY": 323,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 53,
            "posY": 336,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "slush_water",
            "posX": 31,
            "posY": 272,
            "emitRate": 5655.3784,
            "idleTime": 354.6517,
            "eruptionTime": 296.55075,
            "dormancyCycles": 50.244453,
            "activeCycles": 83.996925
          },
          {
            "id": "slush_salt_water",
            "posX": 166,
            "posY": 229,
            "emitRate": 4466.054,
            "idleTime": 325.9107,
            "eruptionTime": 441.95343,
            "dormancyCycles": 66.4843,
            "activeCycles": 67.246864
          },
          {
            "id": "salt_water",
            "posX": 55,
            "posY": 221,
            "emitRate": 9372.967,
            "idleTime": 276.44925,
            "eruptionTime": 377.2446,
            "dormancyCycles": 53.104523,
            "activeCycles": 81.72801
          },
          {
            "id": "hot_hydrogen",
            "posX": 159,
            "posY": 260,
            "emitRate": 459.4487,
            "idleTime": 405.60336,
            "eruptionTime": 277.94388,
            "dormancyCycles": 41.64496,
            "activeCycles": 84.54013
          },
          {
            "id": "hot_co2",
            "posX": 22,
            "posY": 155,
            "emitRate": 244.53589,
            "idleTime": 212.08934,
            "eruptionTime": 323.87286,
            "dormancyCycles": 56.241,
            "activeCycles": 81.84222
          },
          {
            "id": "hot_hydrogen",
            "posX": 154,
            "posY": 277,
            "emitRate": 276.53702,
            "idleTime": 203.20241,
            "eruptionTime": 304.4168,
            "dormancyCycles": 44.487625,
            "activeCycles": 105.84358
          },
          {
            "id": "methane",
            "posX": 205,
            "posY": 299,
            "emitRate": 496.87292,
            "idleTime": 463.1642,
            "eruptionTime": 245.78438,
            "dormancyCycles": 26.969604,
            "activeCycles": 27.56278
          },
          {
            "id": "small_volcano",
            "posX": 34,
            "posY": 96,
            "emitRate": 121593.31,
            "idleTime": 8120.4946,
            "eruptionTime": 60.771,
            "dormancyCycles": 61.0625,
            "activeCycles": 91.629196
          },
          {
            "id": "liquid_co2",
            "posX": 32,
            "posY": 257,
            "emitRate": 619.175,
            "idleTime": 265.98947,
            "eruptionTime": 272.18857,
            "dormancyCycles": 24.96973,
            "activeCycles": 52.031384
          },
          {
            "id": "molten_copper",
            "posX": 199,
            "posY": 99,
            "emitRate": 8365.387,
            "idleTime": 768.4424,
            "eruptionTime": 52.49868,
            "dormancyCycles": 45.549404,
            "activeCycles": 74.09036
          },
          {
            "id": "molten_gold",
            "posX": 87,
            "posY": 253,
            "emitRate": 8150.6357,
            "idleTime": 756.0862,
            "eruptionTime": 53.74376,
            "dormancyCycles": 53.104523,
            "activeCycles": 81.72801
          },
          {
            "id": "molten_aluminum",
            "posX": 213,
            "posY": 180,
            "emitRate": 7542.7427,
            "idleTime": 574.8505,
            "eruptionTime": 43.847843,
            "dormancyCycles": 38.126457,
            "activeCycles": 53.838196
          },
          {
            "id": "methane",
            "posX": 161,
            "posY": 132,
            "emitRate": 563.37274,
            "idleTime": 516.11115,
            "eruptionTime": 247.59195,
            "dormancyCycles": 42.009033,
            "activeCycles": 66.12511
          },
          {
            "id": "small_volcano",
            "posX": 106,
            "posY": 227,
            "emitRate": 137699.7,
            "idleTime": 9789.679,
            "eruptionTime": 68.68706,
            "dormancyCycles": 36.19045,
            "activeCycles": 70.52066
          },
          {
            "id": "molten_cobalt",
            "posX": 201,
            "posY": 342,
            "emitRate": 11019.596,
            "idleTime": 922.5267,
            "eruptionTime": 48.81136,
            "dormancyCycles": 65.20954,
            "activeCycles": 122.850876
          },
          {
            "id": "oil_drip",
            "posX": 76,
            "posY": 125,
            "emitRate": 302.3104,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.21981955,
            "activeCycles": 0.30650946
          },
          {
            "id": "slush_salt_water",
            "posX": 173,
            "posY": 365,
            "emitRate": 4458.415,
            "idleTime": 116.95079,
            "eruptionTime": 128.57634,
            "dormancyCycles": 30.927086,
            "activeCycles": 56.804634
          },
          {
            "id": "liquid_sulfur",
            "posX": 35,
            "posY": 327,
            "emitRate": 5609.886,
            "idleTime": 297.48938,
            "eruptionTime": 367.8753,
            "dormancyCycles": 54.161026,
            "activeCycles": 89.062164
          },
          {
            "id": "molten_aluminum",
            "posX": 21,
            "posY": 118,
            "emitRate": 6113.9263,
            "idleTime": 804.67365,
            "eruptionTime": 79.63215,
            "dormancyCycles": 43.274166,
            "activeCycles": 73.017204
          },
          {
            "id": "salt_water",
            "posX": 33,
            "posY": 179,
            "emitRate": 8275.218,
            "idleTime": 260.20023,
            "eruptionTime": 344.80545,
            "dormancyCycles": 63.834923,
            "activeCycles": 99.90621
          },
          {
            "id": "liquid_co2",
            "posX": 142,
            "posY": 102,
            "emitRate": 429.17706,
            "idleTime": 167.74078,
            "eruptionTime": 226.05869,
            "dormancyCycles": 52.136448,
            "activeCycles": 80.51166
          },
          {
            "id": "big_volcano",
            "posX": 188,
            "posY": 173,
            "emitRate": 273430.6,
            "idleTime": 9489.714,
            "eruptionTime": 67.91916,
            "dormancyCycles": 47.335636,
            "activeCycles": 61.785744
          },
          {
            "id": "slush_salt_water",
            "posX": 100,
            "posY": 336,
            "emitRate": 3867.656,
            "idleTime": 161.51157,
            "eruptionTime": 248.69366,
            "dormancyCycles": 42.939632,
            "activeCycles": 96.345604
          },
          {
            "id": "methane",
            "posX": 174,
            "posY": 346,
            "emitRate": 351.83487,
            "idleTime": 376.82104,
            "eruptionTime": 405.24097,
            "dormancyCycles": 40.011486,
            "activeCycles": 75.693855
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
          "BouldersMixed",
          "Volcanoes"
        ],
        "biomePaths": "Forest:89,100 88,94 74,81 57,85 51,96 56,115 57,116 77,117;104,81 92,65 77,70 74,81 88,94;74,81 77,70 67,59 52,63 49,72 57,85;111,109 116,97 106,81 104,81 88,94 89,100 107,111;57,85 49,72 30,76 31,95 51,96;56,115 51,96 31,95 27,98 26,103 35,117;82,132 83,128 77,117 57,116 57,134 66,140;104,121 107,111 89,100 77,117 83,128\nRust:140,78 141,55 137,51 118,63 118,71 136,81;134,93 136,81 118,71 106,81 116,97;92,65 95,56 83,44 70,46 67,59 77,70;67,59 70,46 64,39 44,43 41,49 52,63;136,115 138,99 134,93 116,97 111,109 121,118;49,72 52,63 41,49 30,52 24,70 26,74 30,76;26,103 27,98 17,87 0,87 0,108 11,111;30,130 35,117 26,103 11,111 12,126 23,132;110,140 113,130 104,121 83,128 82,132 92,147;57,134 57,116 56,115 35,117 30,130 42,141\nOcean:160,97 160,81 140,78 136,81 134,93 138,99;160,55 141,55 140,78 160,81;118,71 118,63 106,52 95,56 92,65 104,81 106,81;160,97 138,99 136,115 138,119 160,120;30,52 21,44 0,52 0,62 24,70;17,87 26,74 24,70 0,62 0,87;160,120 138,119 134,131 137,138 160,141;137,51 136,48 124,37 109,43 106,52 118,63\nMagmaCore:31,95 30,76 26,74 17,87 27,98;119,127 121,118 111,109 107,111 104,121 113,130;138,119 136,115 121,118 119,127 134,131;12,126 11,111 0,108 0,128\nRadioactive:90,153 92,147 82,132 66,140 66,153 77,161;66,153 66,140 57,134 42,141 41,154 50,162;106,170 90,153 77,161 77,176 107,176;120,153 110,140 92,147 90,153 106,170;137,138 134,131 119,127 113,130 110,140 120,153 130,154;160,157 160,141 137,138 130,154 133,158;41,154 42,141 30,130 23,132 17,153 25,159;50,162 41,154 25,159 24,176 50,176;25,159 17,153 0,154 0,176 24,176;17,153 23,132 12,126 0,128 0,154\nFrozenWastes:77,161 66,153 50,162 50,176 77,176;133,158 130,154 120,153 106,170 107,176 133,176;160,157 133,158 133,176 160,176",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 85,
            "posY": 64
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 40,
            "posY": 114
          },
          {
            "id": "WarpReceiver",
            "posX": 78,
            "posY": 103
          },
          {
            "id": "WarpPortal",
            "posX": 56,
            "posY": 103
          },
          {
            "id": "GeneShuffler",
            "posX": 40,
            "posY": 64
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 107,
            "posY": 162,
            "emitRate": 396.2033,
            "idleTime": 190.68417,
            "eruptionTime": 359.72855,
            "dormancyCycles": 42.55928,
            "activeCycles": 78.915985
          },
          {
            "id": "liquid_co2",
            "posX": 136,
            "posY": 154,
            "emitRate": 527.955,
            "idleTime": 204.06866,
            "eruptionTime": 283.50302,
            "dormancyCycles": 45.390587,
            "activeCycles": 68.94086
          },
          {
            "id": "salt_water",
            "posX": 145,
            "posY": 72,
            "emitRate": 10747.323,
            "idleTime": 436.44547,
            "eruptionTime": 383.93613,
            "dormancyCycles": 55.819546,
            "activeCycles": 88.98522
          },
          {
            "id": "molten_cobalt",
            "posX": 17,
            "posY": 126,
            "emitRate": 10465.367,
            "idleTime": 747.0495,
            "eruptionTime": 37.00584,
            "dormancyCycles": 67.58112,
            "activeCycles": 97.913475
          },
          {
            "id": "molten_gold",
            "posX": 56,
            "posY": 67,
            "emitRate": 8179.1094,
            "idleTime": 685.7073,
            "eruptionTime": 46.198685,
            "dormancyCycles": 57.028404,
            "activeCycles": 95.2246
          },
          {
            "id": "molten_iron",
            "posX": 93,
            "posY": 134,
            "emitRate": 9280.214,
            "idleTime": 724.94684,
            "eruptionTime": 49.64122,
            "dormancyCycles": 55.570164,
            "activeCycles": 65.11148
          },
          {
            "id": "salt_water",
            "posX": 68,
            "posY": 68,
            "emitRate": 10587.581,
            "idleTime": 324.24646,
            "eruptionTime": 276.82666,
            "dormancyCycles": 38.19065,
            "activeCycles": 62.422337
          },
          {
            "id": "slimy_po2",
            "posX": 122,
            "posY": 142,
            "emitRate": 432.30206,
            "idleTime": 346.57574,
            "eruptionTime": 302.85522,
            "dormancyCycles": 63.2211,
            "activeCycles": 101.49109
          },
          {
            "id": "liquid_co2",
            "posX": 36,
            "posY": 168,
            "emitRate": 709.8185,
            "idleTime": 463.1642,
            "eruptionTime": 245.78438,
            "dormancyCycles": 26.969604,
            "activeCycles": 27.56278
          },
          {
            "id": "big_volcano",
            "posX": 112,
            "posY": 120,
            "emitRate": 232168.77,
            "idleTime": 8095.789,
            "eruptionTime": 65.17026,
            "dormancyCycles": 62.56764,
            "activeCycles": 61.030567
          },
          {
            "id": "big_volcano",
            "posX": 129,
            "posY": 123,
            "emitRate": 265194.1,
            "idleTime": 8424.732,
            "eruptionTime": 64.366844,
            "dormancyCycles": 51.50043,
            "activeCycles": 71.31275
          },
          {
            "id": "big_volcano",
            "posX": 25,
            "posY": 87,
            "emitRate": 448692.47,
            "idleTime": 8553.851,
            "eruptionTime": 50.699852,
            "dormancyCycles": 65.97085,
            "activeCycles": 108.35851
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
        "biomePaths": "FrozenWastes:50,36 42,28 30,37 32,46 46,51;23,55 32,46 30,37 20,31 17,32 11,48 19,55;44,63 47,53 46,51 32,46 23,55 32,67;64,74 64,54 47,53 44,63 52,74;52,74 44,63 32,67 29,75 37,85 44,85;11,68 19,55 11,48 0,49 0,69;29,75 32,67 23,55 19,55 11,68 18,77;37,85 29,75 18,77 15,88 18,93 29,95;18,77 11,68 0,69 0,88 15,88;64,34 50,36 46,51 47,53 64,54;11,48 17,32 0,28 0,49;64,74 52,74 44,85 51,94 64,95;51,94 44,85 37,85 29,95 34,106 44,107;18,93 15,88 0,88 0,106 12,107;64,95 51,94 44,107 47,112 64,113;47,112 44,107 34,106 27,113 31,128 44,128;34,106 29,95 18,93 12,107 16,111 27,113;16,111 12,107 0,106 0,128 11,128;27,113 16,111 11,128 31,128;64,113 47,112 44,128 64,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 39,
            "posY": 47
          },
          {
            "id": "GravitasPedestal",
            "posX": 55,
            "posY": 119
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 31,
            "posY": 63
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 16,
            "posY": 68
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 15,
            "posY": 47
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 32,
            "posY": 113,
            "emitRate": 7207.104,
            "idleTime": 847.3217,
            "eruptionTime": 69.07466,
            "dormancyCycles": 34.10709,
            "activeCycles": 61.877018
          },
          {
            "id": "molten_iron",
            "posX": 50,
            "posY": 101,
            "emitRate": 6859.211,
            "idleTime": 772.15356,
            "eruptionTime": 60.71546,
            "dormancyCycles": 54.203083,
            "activeCycles": 74.17412
          },
          {
            "id": "molten_iron",
            "posX": 45,
            "posY": 73,
            "emitRate": 6134.9326,
            "idleTime": 714.7457,
            "eruptionTime": 63.666344,
            "dormancyCycles": 45.051563,
            "activeCycles": 77.28425
          },
          {
            "id": "molten_iron",
            "posX": 18,
            "posY": 99,
            "emitRate": 7207.104,
            "idleTime": 847.3217,
            "eruptionTime": 69.07466,
            "dormancyCycles": 34.10709,
            "activeCycles": 61.877018
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
        "biomePaths": "BoggyMarsh:45,47 47,40 46,38 35,32 22,41 22,43 32,53;64,41 47,40 45,47 52,59 64,59;31,61 32,53 22,43 11,54 17,65 24,67;22,43 22,41 16,34 0,35 0,53 11,54;27,79 24,67 17,65 6,76 18,86\nToxicJungle:52,59 45,47 32,53 31,61 44,68;45,74 44,68 31,61 24,67 27,79 34,81;6,76 17,65 11,54 0,53 0,76;64,77 64,59 52,59 44,68 45,74 51,79\nMagmaCore:51,79 45,74 34,81 37,96 49,96;18,86 6,76 0,76 0,96 17,96;34,81 27,79 18,86 17,96 37,96;64,77 51,79 49,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 42,
            "posY": 44
          },
          {
            "id": "GravitasPedestal",
            "posX": 28,
            "posY": 44
          },
          {
            "id": "SapTree",
            "posX": 35,
            "posY": 44
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 42,
            "posY": 89,
            "emitRate": 11099.875,
            "idleTime": 776.2884,
            "eruptionTime": 39.401783,
            "dormancyCycles": 46.731037,
            "activeCycles": 65.919754
          },
          {
            "id": "molten_tungsten",
            "posX": 48,
            "posY": 89,
            "emitRate": 10316.305,
            "idleTime": 724.3116,
            "eruptionTime": 42.194492,
            "dormancyCycles": 62.37628,
            "activeCycles": 69.52505
          },
          {
            "id": "molten_tungsten",
            "posX": 56,
            "posY": 88,
            "emitRate": 8112.908,
            "idleTime": 613.24927,
            "eruptionTime": 41.481266,
            "dormancyCycles": 57.49766,
            "activeCycles": 69.06634
          },
          {
            "id": "hot_po2",
            "posX": 39,
            "posY": 61,
            "emitRate": 351.44574,
            "idleTime": 84.76457,
            "eruptionTime": 101.60953,
            "dormancyCycles": 51.00284,
            "activeCycles": 84.845055
          },
          {
            "id": "methane",
            "posX": 9,
            "posY": 57,
            "emitRate": 331.99716,
            "idleTime": 279.24915,
            "eruptionTime": 276.41388,
            "dormancyCycles": 28.002731,
            "activeCycles": 62.221016
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
        "biomePaths": "MagmaCore:64,52 64,36 51,35 45,46 50,53;51,35 47,29 34,28 31,31 33,46 45,46;46,64 50,53 45,46 33,46 31,48 31,61 41,66;40,76 41,66 31,61 20,67 19,75 31,81;64,77 64,72 46,64 41,66 40,76 48,83;33,46 31,31 18,31 13,39 17,47 31,48;15,78 0,77 0,96 15,96;31,81 19,75 15,78 15,96 30,96;64,77 48,83 47,96 64,96;64,52 50,53 46,64 64,72;12,58 17,47 13,39 0,39 0,59\nOilField:31,61 31,48 17,47 12,58 20,67;48,83 40,76 31,81 30,96 47,96;19,75 20,67 12,58 0,59 0,77 15,78",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 13,
            "posY": 73
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 33,
            "posY": 88,
            "emitRate": 221296.06,
            "idleTime": 9016.627,
            "eruptionTime": 75.0786,
            "dormancyCycles": 58.21641,
            "activeCycles": 116.49256
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
        "biomePaths": "Moo:81,43 76,31 64,32 59,44 74,51;53,60 55,46 44,41 35,45 33,57 44,64;96,27 80,26 76,31 81,43 96,44;75,59 74,51 59,44 55,46 53,60 63,67;96,59 96,44 81,43 74,51 75,59 80,62;19,37 17,36 0,37 0,54 15,54;33,57 35,45 24,37 19,37 15,54 22,62 22,62\nFrozenWastes:80,62 75,59 63,67 63,80 82,80;96,59 80,62 82,80 96,80;63,67 53,60 44,64 42,80 63,80;44,64 33,57 22,62 26,80 42,80;22,62 15,54 0,54 0,75;22,62 22,62 0,75 0,80 26,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 16,
            "posY": 43
          },
          {
            "id": "GravitasPedestal",
            "posX": 9,
            "posY": 43
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 81,
            "posY": 46,
            "emitRate": 227.30692,
            "idleTime": 131.95148,
            "eruptionTime": 304.72095,
            "dormancyCycles": 62.286655,
            "activeCycles": 80.402916
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
        "biomePaths": "Barren:71,64 59,54 51,57 50,73 60,78;62,85 60,78 50,73 39,77 38,80 42,94 56,95;59,54 63,42 58,36 43,36 38,42 41,53 51,57;80,103 80,88 62,85 56,95 62,106;80,64 80,41 63,42 59,54 71,64;50,73 51,57 41,53 32,62 39,77;69,126 60,110 47,117 52,133 61,133;60,110 62,106 56,95 42,94 38,100 41,115 47,117;80,126 80,103 62,106 60,110 69,126;41,115 38,100 22,99 18,107 21,116 34,120;42,94 38,80 21,82 18,89 22,99 38,100;80,64 71,64 60,78 62,85 80,88;34,120 21,116 14,125 19,137 33,137;38,80 39,77 32,62 22,61 16,71 21,82;52,133 47,117 41,115 34,120 33,137 33,138 47,138;41,53 38,42 22,40 17,52 22,61 32,62;22,61 17,52 0,52 0,71 16,71;22,40 19,35 0,34 0,52 17,52;22,99 18,89 0,89 0,106 18,107;21,116 18,107 0,106 0,124 14,125;18,89 21,82 16,71 0,71 0,89;61,156 51,154 43,160 44,174 65,174;80,150 69,149 61,156 65,174 80,174;43,160 31,155 22,159 24,174 44,174;19,137 14,125 0,124 0,143 14,143;22,159 19,157 0,163 0,174 24,174\nSwamp:80,126 69,126 61,133 69,149 80,150;69,149 61,133 52,133 47,138 51,154 61,156;51,154 47,138 33,138 31,155 43,160;31,155 33,138 33,137 19,137 14,143 19,157 22,159;19,157 14,143 0,143 0,163",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 46,
            "posY": 155
          },
          {
            "id": "GravitasPedestal",
            "posX": 48,
            "posY": 155
          }
        ],
        "geysers": [
          {
            "id": "slush_water",
            "posX": 17,
            "posY": 93,
            "emitRate": 6006.108,
            "idleTime": 429.2439,
            "eruptionTime": 322.12445,
            "dormancyCycles": 45.0409,
            "activeCycles": 81.99935
          },
          {
            "id": "salt_water",
            "posX": 36,
            "posY": 115,
            "emitRate": 10975.589,
            "idleTime": 544.7685,
            "eruptionTime": 346.81155,
            "dormancyCycles": 65.03761,
            "activeCycles": 94.547195
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
        "biomePaths": "Barren:96,56 83,57 77,66 80,76 96,78;83,57 75,46 61,52 60,64 77,66;80,76 77,66 60,64 59,65 59,78 74,84;23,58 20,46 0,48 0,60 19,63;38,77 41,63 39,60 23,58 19,63 20,75 34,79;20,75 19,63 0,60 0,78 16,79\nFrozenWastes:96,78 80,76 74,84 75,96 96,96;74,84 59,78 53,83 52,96 75,96;53,83 38,77 34,79 33,96 52,96;34,79 20,75 16,79 17,96 33,96;16,79 0,78 0,96 17,96\nSandstone:59,78 59,65 41,63 38,77 53,83",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 74,
            "posY": 64
          },
          {
            "id": "GravitasPedestal",
            "posX": 78,
            "posY": 64
          },
          {
            "id": "GeneShuffler",
            "posX": 76,
            "posY": 58
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 20,
            "posY": 82,
            "emitRate": 5337.0054,
            "idleTime": 254.12067,
            "eruptionTime": 246.18484,
            "dormancyCycles": 33.666946,
            "activeCycles": 83.027855
          },
          {
            "id": "hot_steam",
            "posX": 38,
            "posY": 83,
            "emitRate": 2776.339,
            "idleTime": 267.1322,
            "eruptionTime": 227.37704,
            "dormancyCycles": 17.22881,
            "activeCycles": 28.060658
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
        "q": 0,
        "r": 6
      },
      {
        "id": "NiobiumMoonlet",
        "q": 5,
        "r": -6
      },
      {
        "id": "MooMoonlet",
        "q": -4,
        "r": -2
      },
      {
        "id": "WaterMoonlet",
        "q": 7,
        "r": -2
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -1,
        "r": -7
      },
      {
        "id": "TemporalTear",
        "q": 2,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 2,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -3,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 9,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 8,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 8,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 7,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -10,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -7,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -7,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 6,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 4,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 5,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 11,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -11,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -5,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 0,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -6,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -5,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -3,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -2,
        "r": -9
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": -3,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -11,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 3,
        "r": -8
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 9,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -1,
        "r": -4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 4,
        "r": -3
      }
    ]
  },
  {
    "coordinate": "M-SWMP-C-1540662169-0-0-0",
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
          "SubsurfaceOcean",
          "Volcanoes"
        ],
        "biomePaths": "Swamp:85,107 93,95 94,79 86,65 70,57 56,59 43,69 38,79 40,100 40,101 57,112 70,114;106,76 111,65 101,52 99,52 86,65 94,79;33,118 40,101 40,100 21,98 13,111 20,120;49,130 57,112 40,101 33,118 44,131\nOcean:70,57 75,40 64,30 48,41 56,59;101,52 111,41 106,25 90,24 90,24 85,37 99,52;99,52 85,37 75,40 70,57 86,65;128,63 128,42 111,41 101,52 111,65;43,39 37,23 21,25 17,42 26,51;56,59 48,41 43,39 26,51 26,55 43,69;26,55 26,51 17,42 0,44 0,65 16,67\nBoggyMarsh:128,85 128,63 111,65 106,76 116,87;114,97 116,87 106,76 94,79 93,95 111,100;38,79 43,69 26,55 16,67 21,79;38,79 21,79 16,88 21,98 40,100;21,79 16,67 0,65 0,88 16,88;87,133 92,116 85,107 70,114 74,131 86,134;108,115 112,110 111,100 93,95 85,107 92,116;74,131 70,114 57,112 49,130 64,137\nMetallic:42,134 44,131 33,118 20,120 16,133 20,139;13,111 21,98 16,88 0,88 0,111;112,132 108,115 92,116 87,133 107,137;86,134 74,131 64,137 64,153 84,153;128,110 112,110 108,115 112,132 128,132;16,133 20,120 13,111 0,111 0,134\nMagmaCore:128,85 116,87 114,97 128,100;64,137 49,130 44,131 42,134 44,153 64,153;42,134 20,139 20,153 44,153;107,137 87,133 86,134 84,153 108,153;128,132 112,132 107,137 108,153 128,153;128,100 114,97 111,100 112,110 128,110;20,139 16,133 0,134 0,153 20,153",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 64,
            "posY": 86
          },
          {
            "id": "WarpConduitSender",
            "posX": 108,
            "posY": 59
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 60,
            "posY": 120
          },
          {
            "id": "GravitasPedestal",
            "posX": 71,
            "posY": 137
          },
          {
            "id": "WarpReceiver",
            "posX": 22,
            "posY": 72
          },
          {
            "id": "WarpPortal",
            "posX": 22,
            "posY": 67
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "posX": 25,
            "posY": 94,
            "emitRate": 419.53827,
            "idleTime": 341.40714,
            "eruptionTime": 224.03816,
            "dormancyCycles": 43.816097,
            "activeCycles": 64.29671
          },
          {
            "id": "molten_cobalt",
            "posX": 24,
            "posY": 125,
            "emitRate": 7455.575,
            "idleTime": 539.7544,
            "eruptionTime": 39.448017,
            "dormancyCycles": 65.05841,
            "activeCycles": 55.60625
          },
          {
            "id": "molten_gold",
            "posX": 93,
            "posY": 128,
            "emitRate": 5451.028,
            "idleTime": 697.6812,
            "eruptionTime": 58.165215,
            "dormancyCycles": 44.497993,
            "activeCycles": 81.97872
          },
          {
            "id": "molten_gold",
            "posX": 14,
            "posY": 98,
            "emitRate": 7753.969,
            "idleTime": 490.1097,
            "eruptionTime": 33.391132,
            "dormancyCycles": 30.185225,
            "activeCycles": 50.57008
          },
          {
            "id": "molten_cobalt",
            "posX": 79,
            "posY": 57,
            "emitRate": 8100.1787,
            "idleTime": 629.0688,
            "eruptionTime": 45.234093,
            "dormancyCycles": 54.422447,
            "activeCycles": 83.72326
          },
          {
            "id": "molten_copper",
            "posX": 36,
            "posY": 72,
            "emitRate": 9992.403,
            "idleTime": 630.6184,
            "eruptionTime": 33.43039,
            "dormancyCycles": 46.79924,
            "activeCycles": 64.84586
          },
          {
            "id": "hot_hydrogen",
            "posX": 105,
            "posY": 82,
            "emitRate": 341.8236,
            "idleTime": 284.78436,
            "eruptionTime": 278.6175,
            "dormancyCycles": 36.63875,
            "activeCycles": 124.97214
          },
          {
            "id": "liquid_co2",
            "posX": 79,
            "posY": 113,
            "emitRate": 472.77756,
            "idleTime": 307.7602,
            "eruptionTime": 357.4029,
            "dormancyCycles": 61.649662,
            "activeCycles": 80.31194
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
          "SlimeSplats"
        ],
        "biomePaths": "ToxicJungle:110,65 102,50 99,50 85,60 84,69 90,76 104,76;128,134 128,114 111,112 100,126 101,128 105,134;128,65 128,44 111,42 102,50 110,65;40,87 44,78 37,64 23,64 21,65 23,87;70,48 71,41 64,33 45,36 42,41 46,53 61,56;46,53 42,41 22,42 21,44 23,64 37,64;84,69 85,60 70,48 61,56 65,73;23,64 21,44 0,44 0,65 21,65;53,142 45,131 26,137 26,153 52,153\nSandstone:84,94 90,76 84,69 65,73 63,76 68,94;128,87 128,65 110,65 104,76 110,87;104,98 110,87 104,76 90,76 84,94 89,99;63,76 65,73 61,56 46,53 37,64 44,78;86,113 89,99 84,94 68,94 65,98 68,115 72,119;68,94 63,76 44,78 40,87 46,98 65,98;68,115 65,98 46,98 39,111 47,122;101,128 100,126 86,113 72,119 73,133 79,138;111,112 104,98 89,99 86,113 100,126;79,138 73,133 53,142 52,153 80,153;45,131 47,122 39,111 23,111 22,132 26,137;128,134 105,134 105,153 128,153;26,137 22,132 0,134 0,153 26,153\nOilField:105,134 101,128 79,138 80,153 105,153;39,111 46,98 40,87 23,87 21,88 22,110 23,111;128,87 110,87 104,98 111,112 128,114;21,88 0,88 0,110 22,110;73,133 72,119 68,115 47,122 45,131 53,142;21,88 23,87 21,65 0,65 0,88;22,132 23,111 22,110 0,110 0,134",
        "pointsOfInterest": [
          {
            "id": "GeneShuffler",
            "posX": 92,
            "posY": 140
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 57,
            "posY": 125,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 18,
            "posY": 77,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 113,
            "posY": 92,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 53,
            "posY": 139,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 31,
            "posY": 97,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 33,
            "posY": 77,
            "emitRate": 4221.5063,
            "idleTime": 264.45035,
            "eruptionTime": 370.27383,
            "dormancyCycles": 76.13512,
            "activeCycles": 78.02852
          },
          {
            "id": "methane",
            "posX": 30,
            "posY": 55,
            "emitRate": 531.7566,
            "idleTime": 312.63104,
            "eruptionTime": 146.14244,
            "dormancyCycles": 62.254936,
            "activeCycles": 100.71824
          },
          {
            "id": "filthy_water",
            "posX": 109,
            "posY": 121,
            "emitRate": 11797.852,
            "idleTime": 594.3165,
            "eruptionTime": 369.49747,
            "dormancyCycles": 55.082325,
            "activeCycles": 82.70654
          },
          {
            "id": "small_volcano",
            "posX": 95,
            "posY": 75,
            "emitRate": 146719.17,
            "idleTime": 8679.144,
            "eruptionTime": 65.789856,
            "dormancyCycles": 38.258705,
            "activeCycles": 87.67201
          },
          {
            "id": "chlorine_gas",
            "posX": 107,
            "posY": 133,
            "emitRate": 412.89136,
            "idleTime": 417.20966,
            "eruptionTime": 358.26837,
            "dormancyCycles": 62.41059,
            "activeCycles": 76.291245
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
          "FrozenCore"
        ],
        "biomePaths": "Forest:78,92 87,72 85,61 69,47 55,47 36,59 35,82 47,96 69,98;111,67 105,57 92,55 85,61 87,72 103,80;92,55 89,35 73,38 69,47 85,61;55,47 49,35 34,36 34,58 36,59\nRust:103,81 103,80 87,72 78,92 90,97;94,107 90,97 78,92 69,98 69,110 82,118;128,44 113,44 105,57 111,67 128,67;113,90 103,81 90,97 94,107 106,110;128,131 128,113 106,110 105,129 108,133;84,129 82,118 69,110 59,117 58,130 65,135;105,129 106,110 106,110 94,107 82,118 84,129 87,132;42,107 47,96 35,82 26,84 21,94 24,104 42,107;128,89 113,90 106,110 106,110 128,113;69,110 69,98 47,96 42,107 59,117;35,82 36,59 34,58 22,59 17,74 26,84;26,84 17,74 0,76 0,93 21,94;34,58 34,36 28,32 19,37 17,54 22,59;17,74 22,59 17,54 0,55 0,76;17,54 19,37 0,30 0,55\nToxicJungle:113,44 106,34 89,34 89,35 92,55 105,57;128,89 128,67 111,67 103,80 103,81 113,90;36,128 42,107 24,104 17,114 24,130;58,130 59,117 42,107 42,107 36,128 44,134;24,104 21,94 0,93 0,113 17,114;21,133 24,130 17,114 0,113 0,134\nFrozenWastes:128,131 108,133 107,153 128,153;108,133 105,129 87,132 88,153 107,153;65,135 58,130 44,134 43,153 66,153;87,132 84,129 65,135 66,153 88,153;44,134 36,128 24,130 21,133 24,153 43,153;21,133 0,134 0,153 24,153",
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "posX": 31,
            "posY": 45
          },
          {
            "id": "WarpConduitSender",
            "posX": 28,
            "posY": 103
          },
          {
            "id": "GravitasPedestal",
            "posX": 34,
            "posY": 73
          },
          {
            "id": "WarpReceiver",
            "posX": 68,
            "posY": 77
          },
          {
            "id": "WarpPortal",
            "posX": 46,
            "posY": 77
          },
          {
            "id": "PropSurfaceSatellite3",
            "posX": 98,
            "posY": 54
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 110,
            "posY": 71,
            "emitRate": 353.9117,
            "idleTime": 243.86874,
            "eruptionTime": 252.20764,
            "dormancyCycles": 26.104982,
            "activeCycles": 54.934975
          },
          {
            "id": "slush_water",
            "posX": 99,
            "posY": 125,
            "emitRate": 7352.601,
            "idleTime": 294.9122,
            "eruptionTime": 160.95625,
            "dormancyCycles": 39.526096,
            "activeCycles": 61.55957
          },
          {
            "id": "slimy_po2",
            "posX": 33,
            "posY": 88,
            "emitRate": 291.07956,
            "idleTime": 261.00766,
            "eruptionTime": 397.17282,
            "dormancyCycles": 12.305233,
            "activeCycles": 18.19683
          },
          {
            "id": "hot_po2",
            "posX": 81,
            "posY": 111,
            "emitRate": 400.685,
            "idleTime": 563.33234,
            "eruptionTime": 450.3793,
            "dormancyCycles": 41.140545,
            "activeCycles": 72.644455
          },
          {
            "id": "hot_hydrogen",
            "posX": 55,
            "posY": 111,
            "emitRate": 594.4179,
            "idleTime": 344.74554,
            "eruptionTime": 205.12468,
            "dormancyCycles": 76.57185,
            "activeCycles": 70.12144
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
          "Geodes"
        ],
        "biomePaths": "MagmaCore:110,45 103,39 83,44 81,52 92,67 104,67;128,44 110,45 104,67 108,71 128,71;92,67 81,52 65,62 68,79 83,82;55,58 54,38 36,35 29,42 34,60 47,63;34,60 29,42 19,40 0,56 0,56 24,70;25,75 24,70 0,56 0,87 15,87;81,52 83,44 78,37 58,34 54,38 55,58 65,62\nWasteland:108,71 104,67 92,67 83,82 86,88 105,90;128,111 128,92 106,91 104,110 107,113;80,102 86,88 83,82 68,79 61,85 63,103 65,105;128,71 108,71 105,90 106,91 128,92;68,79 65,62 55,58 47,63 48,81 61,85;48,81 47,63 34,60 24,70 25,75 41,85;38,95 41,85 25,75 15,87 22,99;43,115 46,107 38,95 22,99 19,109 24,117;19,109 22,99 15,87 0,87 0,110\nFrozenWastes:104,110 106,91 105,90 86,88 80,102 89,112;89,112 80,102 65,105 67,126 83,129;63,103 61,85 48,81 41,85 38,95 46,107;67,126 65,105 63,103 46,107 43,115 49,128 61,130;107,132 107,113 104,110 89,112 83,129 84,130 104,134;49,128 43,115 24,117 21,131 41,137;128,111 107,113 107,132 128,134;21,131 24,117 19,109 0,110 0,130 21,131\nSandstone:84,130 83,129 67,126 61,130 63,153 81,153;104,134 84,130 81,153 104,153;61,130 49,128 41,137 42,153 63,153;41,137 21,131 21,131 19,153 42,153;21,131 0,130 0,153 19,153;128,134 107,132 104,134 104,153 128,153",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 89,
            "posY": 111
          },
          {
            "id": "MassiveHeatSink",
            "posX": 62,
            "posY": 117
          },
          {
            "id": "MassiveHeatSink",
            "posX": 39,
            "posY": 123
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 73,
            "posY": 54,
            "emitRate": 4563.8184,
            "idleTime": 315.48203,
            "eruptionTime": 289.67215,
            "dormancyCycles": 49.830273,
            "activeCycles": 78.051025
          },
          {
            "id": "hot_steam",
            "posX": 102,
            "posY": 79,
            "emitRate": 2763.393,
            "idleTime": 392.6143,
            "eruptionTime": 278.19144,
            "dormancyCycles": 49.09323,
            "activeCycles": 68.982666
          },
          {
            "id": "slimy_po2",
            "posX": 13,
            "posY": 106,
            "emitRate": 473.16913,
            "idleTime": 409.0639,
            "eruptionTime": 246.94649,
            "dormancyCycles": 73.0302,
            "activeCycles": 61.34526
          },
          {
            "id": "methane",
            "posX": 67,
            "posY": 100,
            "emitRate": 598.9648,
            "idleTime": 336.95084,
            "eruptionTime": 167.88937,
            "dormancyCycles": 57.308575,
            "activeCycles": 63.980812
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
          "MetalCaves",
          "BouldersMixed"
        ],
        "biomePaths": "Forest:128,55 114,55 105,66 111,79 128,81;111,79 105,66 92,64 86,71 89,87 102,90;128,101 128,81 111,79 102,90 106,102;104,107 106,102 102,90 89,87 79,95 81,110 84,111;26,50 21,45 0,46 0,66 22,67;35,114 36,96 21,91 14,110 22,117\nOcean:92,64 88,47 70,48 67,53 72,69 86,71;114,55 106,42 93,42 88,47 92,64 105,66;67,53 70,48 67,39 47,35 41,49 48,58;72,69 67,53 48,58 46,72 65,77;89,87 86,71 72,69 65,77 66,90 79,95;66,90 65,77 46,72 44,74 43,92 56,98;46,72 48,58 41,49 26,50 22,67 25,71 44,74;81,110 79,95 66,90 56,98 57,112 65,117;43,92 44,74 25,71 19,89 21,91 36,96;57,112 56,98 43,92 36,96 35,114 42,119\nRadioactive:128,101 106,102 104,107 108,119 128,122;108,119 104,107 84,111 88,130 101,132;88,130 84,111 81,110 65,117 66,131 79,137;128,135 128,122 108,119 101,132 105,139;66,131 65,117 57,112 42,119 43,131 54,139;43,131 42,119 35,114 22,117 19,132 27,140;25,71 22,67 0,66 0,87 19,89;19,132 22,117 14,110 0,111 0,135;14,110 21,91 19,89 0,87 0,111\nMagmaCore:79,137 66,131 54,139 54,153 80,153;105,139 101,132 88,130 79,137 80,153 103,153;54,139 43,131 27,140 27,153 54,153;128,135 105,139 103,153 128,153;27,140 19,132 0,135 0,153 27,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 30,
            "posY": 81
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 95,
            "posY": 121,
            "emitRate": 411.6762,
            "idleTime": 229.46495,
            "eruptionTime": 354.3599,
            "dormancyCycles": 41.507786,
            "activeCycles": 96.44396
          },
          {
            "id": "liquid_co2",
            "posX": 50,
            "posY": 126,
            "emitRate": 382.8766,
            "idleTime": 261.272,
            "eruptionTime": 454.02402,
            "dormancyCycles": 23.562052,
            "activeCycles": 33.03249
          },
          {
            "id": "salt_water",
            "posX": 76,
            "posY": 60,
            "emitRate": 12187.151,
            "idleTime": 424.07056,
            "eruptionTime": 288.3626,
            "dormancyCycles": 43.465485,
            "activeCycles": 91.83967
          },
          {
            "id": "hot_steam",
            "posX": 108,
            "posY": 95,
            "emitRate": 3936.6116,
            "idleTime": 515.2856,
            "eruptionTime": 278.8466,
            "dormancyCycles": 20.532417,
            "activeCycles": 31.87383
          },
          {
            "id": "hot_water",
            "posX": 92,
            "posY": 81,
            "emitRate": 9784.675,
            "idleTime": 235.30537,
            "eruptionTime": 293.68658,
            "dormancyCycles": 49.38835,
            "activeCycles": 81.19335
          },
          {
            "id": "slush_water",
            "posX": 112,
            "posY": 72,
            "emitRate": 4173.449,
            "idleTime": 204.94835,
            "eruptionTime": 530.92065,
            "dormancyCycles": 52.793346,
            "activeCycles": 92.52052
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
        "biomePaths": "FrozenWastes:64,52 64,33 49,35 44,45 51,53;29,56 35,46 27,36 19,36 12,45 19,56;51,53 44,45 35,46 29,56 35,65 45,65;50,72 45,65 35,65 29,75 33,83 46,83;64,90 64,72 50,72 46,83 50,91;64,52 51,53 45,65 50,72 64,72;64,90 50,91 46,99 51,109 64,109;46,99 50,91 46,83 33,83 28,94 32,100;35,65 29,56 19,56 13,66 18,75 29,75;64,109 51,109 46,115 48,128 64,128;46,115 30,113 29,128 48,128;51,109 46,99 32,100 29,112 30,113 46,115;18,75 13,66 0,66 0,85 12,86;18,94 12,86 0,85 0,106 12,106;33,83 29,75 18,75 12,86 18,94 28,94;19,56 12,45 0,45 0,66 13,66;32,100 28,94 18,94 12,106 16,111 29,112;30,113 29,112 16,111 12,128 29,128;16,111 12,106 0,106 0,128 12,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 52,
            "posY": 49
          },
          {
            "id": "GravitasPedestal",
            "posX": 50,
            "posY": 97
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 43,
            "posY": 119,
            "emitRate": 9017.892,
            "idleTime": 757.376,
            "eruptionTime": 41.34593,
            "dormancyCycles": 42.849304,
            "activeCycles": 77.16081
          },
          {
            "id": "molten_iron",
            "posX": 21,
            "posY": 71,
            "emitRate": 9484.887,
            "idleTime": 676.744,
            "eruptionTime": 40.91474,
            "dormancyCycles": 73.18599,
            "activeCycles": 111.24499
          },
          {
            "id": "molten_iron",
            "posX": 27,
            "posY": 86,
            "emitRate": 9432.379,
            "idleTime": 758.87683,
            "eruptionTime": 37.40689,
            "dormancyCycles": 31.585882,
            "activeCycles": 46.35748
          },
          {
            "id": "molten_iron",
            "posX": 48,
            "posY": 83,
            "emitRate": 6729.954,
            "idleTime": 743.1561,
            "eruptionTime": 61.86215,
            "dormancyCycles": 42.65893,
            "activeCycles": 56.8528
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
        "biomePaths": "BoggyMarsh:38,37 36,36 18,36 18,51 32,51;47,60 50,46 41,37 38,37 32,51 37,60 46,61;64,43 64,31 49,29 41,37 50,46;18,51 18,36 17,35 0,35 0,51 17,51;14,81 14,68 0,66 0,83;31,79 29,68 18,65 14,68 14,81 18,84;64,43 50,46 47,60 64,62\nToxicJungle:37,60 32,51 18,51 17,51 18,65 29,68;64,77 64,62 47,60 46,61 48,78 49,79;48,78 46,61 37,60 29,68 31,79 35,81;18,65 17,51 0,51 0,66 14,68\nMagmaCore:49,79 48,78 35,81 35,96 51,96;64,77 49,79 51,96 64,96;35,81 31,79 18,84 19,96 35,96;18,84 14,81 0,83 0,96 19,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 33,
            "posY": 46
          },
          {
            "id": "GravitasPedestal",
            "posX": 19,
            "posY": 46
          },
          {
            "id": "SapTree",
            "posX": 26,
            "posY": 46
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 42,
            "posY": 70,
            "emitRate": 7032.0586,
            "idleTime": 762.0051,
            "eruptionTime": 49.510284,
            "dormancyCycles": 58.88588,
            "activeCycles": 108.11657
          },
          {
            "id": "molten_tungsten",
            "posX": 44,
            "posY": 89,
            "emitRate": 7115.8516,
            "idleTime": 761.54114,
            "eruptionTime": 52.603527,
            "dormancyCycles": 51.261795,
            "activeCycles": 59.626144
          },
          {
            "id": "molten_tungsten",
            "posX": 54,
            "posY": 89,
            "emitRate": 7627.9116,
            "idleTime": 748.62085,
            "eruptionTime": 51.422432,
            "dormancyCycles": 45.8088,
            "activeCycles": 74.757576
          },
          {
            "id": "slimy_po2",
            "posX": 35,
            "posY": 70,
            "emitRate": 308.05603,
            "idleTime": 281.75977,
            "eruptionTime": 354.31818,
            "dormancyCycles": 45.8088,
            "activeCycles": 74.757576
          },
          {
            "id": "hot_co2",
            "posX": 45,
            "posY": 48,
            "emitRate": 474.8597,
            "idleTime": 660.1283,
            "eruptionTime": 325.2018,
            "dormancyCycles": 51.25537,
            "activeCycles": 56.733612
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
        "biomePaths": "Moo:96,61 96,44 82,43 75,55 76,59 81,63;61,48 62,37 59,33 42,36 40,42 44,50 55,53;82,43 77,35 62,37 61,48 75,55;76,59 75,55 61,48 55,53 56,64 64,68;56,64 55,53 44,50 37,62 47,70;26,60 28,45 18,38 16,39 10,58 15,61;40,42 42,36 37,26 21,29 18,38 28,45;37,62 44,50 40,42 28,45 26,60 30,63;10,58 16,39 0,36 0,58\nFrozenWastes:81,63 76,59 64,68 66,80 81,80;47,70 37,62 30,63 28,80 46,80;30,63 26,60 15,61 13,80 28,80;64,68 56,64 47,70 46,80 66,80;96,61 81,63 81,80 96,80;15,61 10,58 0,58 0,80 13,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 52,
            "posY": 44
          },
          {
            "id": "GravitasPedestal",
            "posX": 45,
            "posY": 44
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 11,
            "posY": 47,
            "emitRate": 332.49292,
            "idleTime": 353.38635,
            "eruptionTime": 336.4848,
            "dormancyCycles": 79.572754,
            "activeCycles": 69.392975
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
        "biomePaths": "Barren:80,41 63,41 62,56 80,59;80,72 80,59 62,56 56,61 56,66 64,75;62,56 63,41 58,36 42,42 43,54 56,61;43,54 42,42 41,42 23,44 21,56 33,62;21,56 23,44 18,37 0,41 0,54 18,58;80,72 64,75 60,89 61,91 80,92;35,73 33,62 21,56 18,58 14,75 21,80;14,75 18,58 0,54 0,77;59,101 61,91 60,89 44,85 38,95 41,105 42,105;22,92 21,80 14,75 0,77 0,95 18,96;80,108 80,92 61,91 59,101 64,109;44,85 42,77 35,73 21,80 22,92 38,95;56,66 56,61 43,54 33,62 35,73 42,77;80,125 80,108 64,109 60,121 64,126;64,75 56,66 42,77 44,85 60,89;80,125 64,126 62,140 80,145;60,121 64,109 59,101 42,105 50,122;50,122 42,105 41,105 29,113 32,126 44,129;41,105 38,95 22,92 18,96 20,110 29,113;41,160 35,153 20,159 20,174 41,174;46,139 44,129 32,126 22,135 35,148;80,156 61,159 61,174 80,174;61,159 57,155 41,160 41,174 61,174;62,140 64,126 60,121 50,122 44,129 46,139 58,144;22,135 32,126 29,113 20,110 13,116 18,135;20,110 18,96 0,95 0,115 13,116;17,136 18,135 13,116 0,115 0,136;20,159 15,154 0,156 0,174 20,174\nSwamp:80,156 80,145 62,140 58,144 57,155 61,159;57,155 58,144 46,139 35,148 35,153 41,160;35,153 35,148 22,135 18,135 17,136 15,154 20,159;15,154 17,136 0,136 0,156",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 27,
            "posY": 153
          },
          {
            "id": "GravitasPedestal",
            "posX": 29,
            "posY": 153
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "posX": 17,
            "posY": 70,
            "emitRate": 8961.744,
            "idleTime": 134.97998,
            "eruptionTime": 215.18964,
            "dormancyCycles": 66.55944,
            "activeCycles": 97.13038
          },
          {
            "id": "filthy_water",
            "posX": 56,
            "posY": 118,
            "emitRate": 8814.969,
            "idleTime": 275.8418,
            "eruptionTime": 293.66467,
            "dormancyCycles": 83.20972,
            "activeCycles": 117.166794
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
        "biomePaths": "MagmaCore:50,45 46,35 30,36 32,51 45,52;64,28 49,29 46,35 50,45 64,45;32,51 30,36 30,36 18,37 12,44 19,57 26,57;29,77 33,68 26,57 19,57 13,63 17,78;19,57 12,44 0,44 0,63 13,63;64,77 64,61 48,61 46,67 50,78;48,81 50,78 46,67 33,68 29,77 34,83;34,83 29,77 17,78 16,80 17,96 32,96;16,80 0,80 0,96 17,96;48,81 34,83 32,96 50,96;16,80 17,78 13,63 0,63 0,80\nOilField:64,61 64,45 50,45 45,52 48,61;46,67 48,61 45,52 32,51 26,57 33,68;64,77 50,78 48,81 50,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 51,
            "posY": 58
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 51,
            "posY": 81,
            "emitRate": 237259.92,
            "idleTime": 9681.305,
            "eruptionTime": 76.58101,
            "dormancyCycles": 54.673218,
            "activeCycles": 64.850235
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
        "biomePaths": "Barren:93,61 90,46 75,47 72,62 72,62 90,65;128,62 124,55 112,53 106,61 111,74 121,76;160,55 146,55 140,63 144,76 160,76;91,77 90,65 72,62 71,77 82,83;53,77 54,61 38,59 35,76 41,81;17,66 21,57 17,50 0,50 0,66;20,81 22,77 17,66 0,66 0,81\nSandstone:144,76 140,63 128,62 121,76 124,80 141,80;111,74 106,61 93,61 90,65 91,77 103,82;71,77 72,62 72,62 55,60 54,61 53,77 61,82;35,76 38,59 36,57 21,57 17,66 22,77\nFrozenWastes:141,80 124,80 122,96 143,96;41,81 35,76 22,77 20,81 21,96 40,96;61,82 53,77 41,81 40,96 61,96;124,80 121,76 111,74 103,82 104,96 122,96;103,82 91,77 82,83 82,96 104,96;20,81 0,81 0,96 21,96;82,83 71,77 61,82 61,96 82,96;160,76 144,76 141,80 143,96 160,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 84,
            "posY": 77
          },
          {
            "id": "GravitasPedestal",
            "posX": 88,
            "posY": 77
          },
          {
            "id": "GeneShuffler",
            "posX": 86,
            "posY": 71
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 44,
            "posY": 66
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 84,
            "posY": 53
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 102,
            "posY": 79
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 117,
            "posY": 83,
            "emitRate": 8834.588,
            "idleTime": 325.0013,
            "eruptionTime": 157.0144,
            "dormancyCycles": 41.266815,
            "activeCycles": 65.3871
          },
          {
            "id": "hot_steam",
            "posX": 150,
            "posY": 81,
            "emitRate": 2292.153,
            "idleTime": 291.67987,
            "eruptionTime": 301.35004,
            "dormancyCycles": 58.126114,
            "activeCycles": 82.431206
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
        "id": "MiniMetallicSwampyStart",
        "q": 3,
        "r": -2
      },
      {
        "id": "MiniForestFrozenWarp",
        "q": 0,
        "r": 3
      },
      {
        "id": "MiniFlipped",
        "q": -3,
        "r": -1
      },
      {
        "id": "MiniRadioactiveOcean",
        "q": -4,
        "r": 2
      },
      {
        "id": "TundraMoonlet",
        "q": 4,
        "r": -9
      },
      {
        "id": "MarshyMoonlet",
        "q": -4,
        "r": 8
      },
      {
        "id": "MooMoonlet",
        "q": -9,
        "r": 5
      },
      {
        "id": "WaterMoonlet",
        "q": -7,
        "r": -2
      },
      {
        "id": "NiobiumMoonlet",
        "q": 1,
        "r": 8
      },
      {
        "id": "RegolithMoonlet",
        "q": -9,
        "r": 10
      },
      {
        "id": "TemporalTear",
        "q": 9,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 2,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 8,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 9,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 10,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 12,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -4,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 5,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 4,
        "r": -12
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -12,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 7,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -6,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 0,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -1,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -2,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -8,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -1,
        "r": 12
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -1,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 0,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 12,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 12,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 10,
        "r": -12
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -10,
        "r": 8
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -3,
        "r": -9
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -8,
        "r": 12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": -7,
        "r": -5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -12,
        "r": 6
      }
    ]
  },
  {
    "coordinate": "SWMP-C-434222580-0-0-0",
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
          "Volcanoes",
          "Geodes",
          "MetalPoor"
        ],
        "biomePaths": "Swamp:97,190 106,178 109,162 99,138 65,135 62,136 49,154 49,176 62,193 68,195;129,134 133,122 128,112 118,108 99,124 99,138;99,138 99,124 83,108 74,109 65,135 99,138;62,136 42,123 31,129 26,146 28,149 49,154\nMagmaCore:135,97 127,88 116,97 118,108 128,112;42,123 41,111 29,107 22,118 31,129;69,212 68,195 62,193 49,207 51,215 63,217;17,214 20,203 0,197 0,216;145,207 132,196 124,207 131,221 131,221;32,262 15,246 0,247 0,274 32,274;48,247 40,228 27,227 15,246 32,262;115,248 114,234 96,225 82,245 97,261;97,261 82,245 70,246 65,250 66,274 96,274;65,250 48,247 32,262 32,274 66,274;160,243 149,242 132,258 134,274 160,274;132,258 115,248 97,261 96,274 134,274\nSandstone:160,64 146,63 128,76 127,88 135,97 160,97;127,88 128,76 105,59 90,75 95,90 116,97;83,108 95,90 90,75 76,70 58,85 59,98 74,109;146,63 132,34 123,34 105,58 105,59 128,76;76,70 71,53 53,47 35,64 36,71 58,85;59,98 58,85 36,71 22,90 29,107 41,111;36,71 35,64 23,55 0,58 0,88 22,90\nWasteland:160,121 160,97 135,97 128,112 133,122;160,146 160,121 133,122 129,134 136,148;22,118 29,107 22,90 0,88 0,119;62,193 49,176 29,182 27,197 49,207;132,196 131,189 106,178 97,190 102,205 124,207\nToxicJungle:118,108 116,97 95,90 83,108 99,124;65,135 74,109 59,98 41,111 42,123 62,136;31,129 22,118 0,119 0,143 26,146;160,146 136,148 132,157 141,177 160,177;20,173 28,149 26,146 0,143 0,174;27,197 29,182 20,173 0,174 0,197 20,203;160,207 160,177 141,177 131,189 132,196 145,207\nFrozenWastes:132,157 136,148 129,134 99,138 99,138 109,162;141,177 132,157 109,162 106,178 131,189;49,176 49,154 28,149 20,173 29,182;102,205 97,190 68,195 69,212 95,220\nBarren:51,215 49,207 27,197 20,203 17,214 27,227 40,228;70,246 63,217 51,215 40,228 48,247 65,250;160,207 145,207 131,221 149,242 160,243;149,242 131,221 131,221 114,234 115,248 132,258;131,221 124,207 102,205 95,220 96,225 114,234;15,246 27,227 17,214 0,216 0,247;82,245 96,225 95,220 69,212 63,217 70,246",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 77,
            "posY": 166
          },
          {
            "id": "MassiveHeatSink",
            "posX": 91,
            "posY": 216
          },
          {
            "id": "WarpConduitSender",
            "posX": 18,
            "posY": 143
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 104,
            "posY": 195
          },
          {
            "id": "GravitasPedestal",
            "posX": 134,
            "posY": 159
          },
          {
            "id": "WarpPortal",
            "posX": 145,
            "posY": 143
          },
          {
            "id": "WarpReceiver",
            "posX": 146,
            "posY": 149
          },
          {
            "id": "GeneShuffler",
            "posX": 117,
            "posY": 138
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 56,
            "posY": 126,
            "emitRate": 4553.652,
            "idleTime": 221.50826,
            "eruptionTime": 238.11467,
            "dormancyCycles": 55.971466,
            "activeCycles": 92.99084
          },
          {
            "id": "hot_hydrogen",
            "posX": 26,
            "posY": 188,
            "emitRate": 375.26785,
            "idleTime": 263.4756,
            "eruptionTime": 199.52974,
            "dormancyCycles": 45.62875,
            "activeCycles": 53.47058
          },
          {
            "id": "slush_water",
            "posX": 117,
            "posY": 180,
            "emitRate": 5799.2974,
            "idleTime": 250.08347,
            "eruptionTime": 239.8147,
            "dormancyCycles": 38.51626,
            "activeCycles": 72.733986
          },
          {
            "id": "slush_salt_water",
            "posX": 44,
            "posY": 158,
            "emitRate": 3967.4124,
            "idleTime": 204.41785,
            "eruptionTime": 302.75998,
            "dormancyCycles": 42.076305,
            "activeCycles": 77.44498
          },
          {
            "id": "small_volcano",
            "posX": 148,
            "posY": 231,
            "emitRate": 133112.95,
            "idleTime": 8643.638,
            "eruptionTime": 65.03798,
            "dormancyCycles": 24.970995,
            "activeCycles": 45.792923
          },
          {
            "id": "small_volcano",
            "posX": 127,
            "posY": 248,
            "emitRate": 120834.81,
            "idleTime": 8264.129,
            "eruptionTime": 70.86477,
            "dormancyCycles": 63.06493,
            "activeCycles": 103.08718
          },
          {
            "id": "small_volcano",
            "posX": 35,
            "posY": 221,
            "emitRate": 138797.2,
            "idleTime": 8020.661,
            "eruptionTime": 60.407745,
            "dormancyCycles": 32.832764,
            "activeCycles": 43.943512
          },
          {
            "id": "hot_po2",
            "posX": 142,
            "posY": 172,
            "emitRate": 313.74304,
            "idleTime": 396.5633,
            "eruptionTime": 408.18585,
            "dormancyCycles": 41.953014,
            "activeCycles": 72.59085
          },
          {
            "id": "filthy_water",
            "posX": 14,
            "posY": 168,
            "emitRate": 7897.891,
            "idleTime": 233.74908,
            "eruptionTime": 375.177,
            "dormancyCycles": 57.430767,
            "activeCycles": 100.54841
          },
          {
            "id": "big_volcano",
            "posX": 145,
            "posY": 115,
            "emitRate": 269104.8,
            "idleTime": 8960.511,
            "eruptionTime": 67.20507,
            "dormancyCycles": 33.78576,
            "activeCycles": 63.030346
          },
          {
            "id": "big_volcano",
            "posX": 60,
            "posY": 207,
            "emitRate": 207442.95,
            "idleTime": 9085.418,
            "eruptionTime": 72.76501,
            "dormancyCycles": 37.673824,
            "activeCycles": 78.823105
          },
          {
            "id": "big_volcano",
            "posX": 32,
            "posY": 118,
            "emitRate": 307962.2,
            "idleTime": 8889.516,
            "eruptionTime": 65.405365,
            "dormancyCycles": 47.922264,
            "activeCycles": 69.97692
          },
          {
            "id": "big_volcano",
            "posX": 124,
            "posY": 101,
            "emitRate": 287509.53,
            "idleTime": 8852.216,
            "eruptionTime": 67.99754,
            "dormancyCycles": 51.335464,
            "activeCycles": 84.64802
          },
          {
            "id": "big_volcano",
            "posX": 133,
            "posY": 209,
            "emitRate": 245803.44,
            "idleTime": 8757.844,
            "eruptionTime": 64.278206,
            "dormancyCycles": 36.86654,
            "activeCycles": 90.0579
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
          "BouldersSmall"
        ],
        "biomePaths": "Forest:128,37 108,39 105,45 111,58 128,59;111,58 105,45 90,47 88,64 103,70;75,82 78,69 67,60 58,61 52,69 54,81 66,86;88,64 90,47 83,41 74,43 67,60 78,69;58,61 49,43 43,42 35,47 37,64 52,69;82,108 86,91 75,82 66,86 64,107 66,109;66,86 54,81 44,91 50,107 64,107;37,64 35,47 22,45 15,51 20,70 24,72;20,70 15,51 0,50 0,74\nMetallic:128,59 111,58 103,70 105,77 128,79;101,112 106,95 101,89 86,91 82,108 88,114;65,128 66,109 64,107 50,107 43,116 47,130 51,133;128,95 128,79 105,77 101,89 106,95\nBoggyMarsh:101,89 105,77 103,70 88,64 78,69 75,82 86,91;54,81 52,69 37,64 24,72 28,89 44,91;50,107 44,91 28,89 23,95 26,114 43,116;28,89 24,72 20,70 0,74 0,94 23,95;128,118 128,95 106,95 101,112 109,120;26,114 23,95 0,94 0,118 21,119\nRadioactive:84,130 88,114 82,108 66,109 65,128 75,134;47,130 43,116 26,114 21,119 23,135 27,138;75,134 65,128 51,133 53,153 74,153;106,134 109,120 101,112 88,114 84,130 99,139;51,133 47,130 27,138 27,153 53,153;27,138 23,135 0,139 0,153 27,153;99,139 84,130 75,134 74,153 98,153;128,118 109,120 106,134 128,142;128,142 106,134 99,139 98,153 128,153;23,135 21,119 0,118 0,139",
        "pointsOfInterest": [
          {
            "id": "PropSurfaceSatellite3",
            "posX": 57,
            "posY": 60
          }
        ],
        "geysers": [
          {
            "id": "molten_aluminum",
            "posX": 91,
            "posY": 97,
            "emitRate": 11315.036,
            "idleTime": 593.2272,
            "eruptionTime": 32.380157,
            "dormancyCycles": 66.44309,
            "activeCycles": 74.493416
          },
          {
            "id": "molten_gold",
            "posX": 60,
            "posY": 124,
            "emitRate": 7915.117,
            "idleTime": 558.56085,
            "eruptionTime": 39.11899,
            "dormancyCycles": 36.671722,
            "activeCycles": 77.60994
          },
          {
            "id": "molten_aluminum",
            "posX": 108,
            "posY": 86,
            "emitRate": 7250.6055,
            "idleTime": 676.13153,
            "eruptionTime": 51.118366,
            "dormancyCycles": 50.683426,
            "activeCycles": 88.34919
          },
          {
            "id": "molten_gold",
            "posX": 53,
            "posY": 113,
            "emitRate": 8944.779,
            "idleTime": 668.05817,
            "eruptionTime": 42.074467,
            "dormancyCycles": 37.48507,
            "activeCycles": 64.309944
          },
          {
            "id": "liquid_co2",
            "posX": 63,
            "posY": 141,
            "emitRate": 346.87527,
            "idleTime": 247.59682,
            "eruptionTime": 564.14685,
            "dormancyCycles": 44.57128,
            "activeCycles": 70.5701
          },
          {
            "id": "liquid_co2",
            "posX": 79,
            "posY": 136,
            "emitRate": 446.94812,
            "idleTime": 176.1485,
            "eruptionTime": 202.91586,
            "dormancyCycles": 73.30357,
            "activeCycles": 78.867165
          },
          {
            "id": "filthy_water",
            "posX": 21,
            "posY": 112,
            "emitRate": 8125.4585,
            "idleTime": 152.8721,
            "eruptionTime": 252.07983,
            "dormancyCycles": 47.936245,
            "activeCycles": 82.47168
          },
          {
            "id": "chlorine_gas",
            "posX": 95,
            "posY": 117,
            "emitRate": 509.7453,
            "idleTime": 352.58746,
            "eruptionTime": 190.67004,
            "dormancyCycles": 37.324368,
            "activeCycles": 74.28762
          },
          {
            "id": "hot_po2",
            "posX": 115,
            "posY": 73,
            "emitRate": 237.01276,
            "idleTime": 168.61723,
            "eruptionTime": 258.1197,
            "dormancyCycles": 65.003876,
            "activeCycles": 115.98349
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
          "SlimeSplats",
          "IrregularOil"
        ],
        "biomePaths": "Sandstone:83,86 84,76 69,66 59,73 58,84 71,92;128,63 128,39 108,41 105,47 115,63;106,90 110,83 107,75 93,71 84,76 83,86 93,94;69,66 70,59 57,45 51,47 43,64 59,73;115,107 106,90 93,94 90,110 105,117;90,110 93,94 83,86 71,92 70,107 83,113;70,107 71,92 58,84 48,91 51,107 60,112;43,64 51,47 41,39 23,45 24,54 41,65;40,88 34,76 19,76 13,86 19,97 30,99;58,84 59,73 43,64 41,65 34,76 40,88 48,91\nOcean:115,63 105,47 92,51 93,71 107,75;93,71 92,51 86,48 70,59 69,66 84,76;86,48 84,38 64,33 57,45 70,59;24,54 23,45 20,42 0,44 0,63 15,65\nOilField:128,63 115,63 107,75 110,83 128,83;128,129 128,107 115,107 105,117 107,128 109,130;107,128 105,117 90,110 83,113 81,128 90,134;90,134 81,128 72,132 71,153 90,153;51,107 48,91 40,88 30,99 35,112 36,113;81,128 83,113 70,107 60,112 60,127 72,132;109,130 107,128 90,134 90,153 110,153;72,132 60,127 52,132 53,153 71,153;38,128 36,113 35,112 18,121 17,126 35,131;17,126 17,126 18,121 10,109 0,109 0,127;35,131 17,126 17,126 16,153 33,153;60,127 60,112 51,107 36,113 38,128 52,132;41,65 24,54 15,65 19,76 34,76;19,76 15,65 0,63 0,85 13,86;35,112 30,99 19,97 10,109 18,121;10,109 19,97 13,86 0,85 0,109;52,132 38,128 35,131 33,153 53,153\nRust:128,83 110,83 106,90 115,107 128,107\nMagmaCore:17,126 0,127 0,153 16,153;128,129 109,130 110,153 128,153",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 44,
            "posY": 65
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 96,
            "posY": 101
          },
          {
            "id": "WarpPortal",
            "posX": 58,
            "posY": 82
          },
          {
            "id": "WarpReceiver",
            "posX": 80,
            "posY": 82
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 34,
            "posY": 120,
            "emitRate": 5163.4165,
            "idleTime": 395.64084,
            "eruptionTime": 285.47946,
            "dormancyCycles": 44.28956,
            "activeCycles": 73.68324
          },
          {
            "id": "OilWell",
            "posX": 11,
            "posY": 119,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 71,
            "posY": 130,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 93,
            "posY": 124,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 57,
            "posY": 143,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 66,
            "posY": 117,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 108,
            "posY": 64,
            "emitRate": 18055.873,
            "idleTime": 492.0833,
            "eruptionTime": 267.55908,
            "dormancyCycles": 39.846596,
            "activeCycles": 55.574623
          },
          {
            "id": "small_volcano",
            "posX": 30,
            "posY": 134,
            "emitRate": 134288.84,
            "idleTime": 8792.61,
            "eruptionTime": 68.66942,
            "dormancyCycles": 50.563496,
            "activeCycles": 78.00825
          },
          {
            "id": "chlorine_gas",
            "posX": 52,
            "posY": 120,
            "emitRate": 292.62503,
            "idleTime": 415.04102,
            "eruptionTime": 611.87256,
            "dormancyCycles": 37.33473,
            "activeCycles": 68.35149
          },
          {
            "id": "OilWell",
            "posX": 122,
            "posY": 72,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 43,
            "posY": 100,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 35,
            "posY": 74,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 9,
            "posY": 76,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 17,
            "posY": 104,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 4,
            "posY": 108,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
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
        "biomePaths": "FrozenWastes:64,39 53,39 45,49 51,59 64,60;51,59 45,49 36,48 29,59 38,70 44,70;64,79 64,60 51,59 44,70 51,79;51,79 44,70 38,70 30,80 36,92 44,92;64,97 64,79 51,79 44,92 49,98;29,59 36,48 31,39 19,37 17,39 16,55 20,59;46,111 49,98 44,92 36,92 29,99 32,110 42,114;64,116 46,111 42,114 42,128 64,128;64,97 49,98 46,111 64,116;36,92 30,80 20,79 14,91 18,97 29,99;38,70 29,59 20,59 16,72 20,79 30,80;42,114 32,110 21,119 20,128 42,128;20,79 16,72 0,72 0,90 14,91;32,110 29,99 18,97 11,109 21,119;20,59 16,55 0,56 0,72 16,72;11,109 18,97 14,91 0,90 0,110;16,55 17,39 0,39 0,56;21,119 11,109 0,110 0,128 20,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 52,
            "posY": 51
          },
          {
            "id": "GravitasPedestal",
            "posX": 25,
            "posY": 89
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 35,
            "posY": 107,
            "emitRate": 9173.44,
            "idleTime": 852.35596,
            "eruptionTime": 49.43207,
            "dormancyCycles": 46.947834,
            "activeCycles": 68.78496
          },
          {
            "id": "molten_iron",
            "posX": 11,
            "posY": 102,
            "emitRate": 11940.3545,
            "idleTime": 716.43414,
            "eruptionTime": 32.042233,
            "dormancyCycles": 37.324368,
            "activeCycles": 74.28762
          },
          {
            "id": "molten_iron",
            "posX": 48,
            "posY": 94,
            "emitRate": 7406.5933,
            "idleTime": 742.91754,
            "eruptionTime": 47.16315,
            "dormancyCycles": 73.18036,
            "activeCycles": 90.6392
          },
          {
            "id": "molten_iron",
            "posX": 10,
            "posY": 77,
            "emitRate": 6291.708,
            "idleTime": 703.3592,
            "eruptionTime": 54.115887,
            "dormancyCycles": 44.489426,
            "activeCycles": 75.904686
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
        "biomePaths": "BoggyMarsh:37,50 37,50 30,34 19,36 17,49 18,51;64,53 64,32 49,32 47,44 62,53;47,44 49,32 48,31 33,30 30,34 37,50;19,36 15,31 0,33 0,47 17,49;24,75 23,68 17,61 0,67 0,75 15,80;17,61 18,51 17,49 0,47 0,67;38,79 45,65 38,59 23,68 24,75 32,80;64,53 62,53 47,65 58,77 64,77\nToxicJungle:62,53 47,44 37,50 37,50 38,59 45,65 47,65;38,59 37,50 18,51 17,61 23,68;58,77 47,65 45,65 38,79 47,86\nFrozenWastes:15,80 0,75 0,96 15,96;32,80 24,75 15,80 15,96 29,96;47,86 38,79 32,80 29,96 48,96;64,77 58,77 47,86 48,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 34,
            "posY": 47
          },
          {
            "id": "GravitasPedestal",
            "posX": 20,
            "posY": 47
          },
          {
            "id": "SapTree",
            "posX": 27,
            "posY": 47
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 5,
            "posY": 55,
            "emitRate": 9093.898,
            "idleTime": 705.7434,
            "eruptionTime": 44.13071,
            "dormancyCycles": 40.994923,
            "activeCycles": 71.25059
          },
          {
            "id": "molten_tungsten",
            "posX": 18,
            "posY": 89,
            "emitRate": 7742.3877,
            "idleTime": 658.97864,
            "eruptionTime": 49.41815,
            "dormancyCycles": 65.96984,
            "activeCycles": 85.77127
          },
          {
            "id": "molten_tungsten",
            "posX": 8,
            "posY": 91,
            "emitRate": 8851.774,
            "idleTime": 768.7953,
            "eruptionTime": 46.47497,
            "dormancyCycles": 37.49668,
            "activeCycles": 71.27153
          },
          {
            "id": "slimy_po2",
            "posX": 43,
            "posY": 71,
            "emitRate": 257.78397,
            "idleTime": 260.4773,
            "eruptionTime": 468.12183,
            "dormancyCycles": 20.671652,
            "activeCycles": 34.30362
          },
          {
            "id": "hot_po2",
            "posX": 50,
            "posY": 61,
            "emitRate": 271.9922,
            "idleTime": 300.6453,
            "eruptionTime": 421.28043,
            "dormancyCycles": 56.63096,
            "activeCycles": 77.97104
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
        "biomePaths": "Moo:67,47 69,32 56,30 48,42 58,50;84,48 81,34 73,30 69,32 67,47 77,53;76,64 77,53 67,47 58,50 56,63 74,66;56,63 58,50 48,42 48,42 37,54 38,60 54,65;48,42 35,32 29,34 26,47 37,54;38,60 37,54 26,47 18,50 14,59 17,64 33,66;96,28 81,34 84,48 96,50;26,47 29,34 18,29 8,38 18,50;96,50 84,48 77,53 76,64 96,66;14,59 18,50 8,38 0,38 0,60\nFrozenWastes:54,65 38,60 33,66 35,80 53,80;74,66 56,63 54,65 53,80 74,80;96,66 76,64 74,66 74,80 96,80;33,66 17,64 14,80 35,80;17,64 14,59 0,60 0,80 14,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 60,
            "posY": 41
          },
          {
            "id": "GravitasPedestal",
            "posX": 53,
            "posY": 41
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 48,
            "posY": 55,
            "emitRate": 355.42722,
            "idleTime": 359.5001,
            "eruptionTime": 283.2726,
            "dormancyCycles": 57.648438,
            "activeCycles": 62.26069
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
        "biomePaths": "Barren:80,77 80,57 64,57 59,67 66,78;80,77 66,78 61,88 69,99 80,99;59,67 64,57 57,46 52,45 41,53 40,61 48,69;61,88 66,78 59,67 48,69 44,84 50,89;80,57 80,37 66,37 57,46 64,57;40,61 41,53 29,43 19,46 19,58 31,65;44,84 48,69 40,61 31,65 27,79 35,85;52,45 44,31 33,33 29,43 41,53;69,99 61,88 50,89 48,104 60,110;30,100 35,85 27,79 18,80 12,89 21,102;48,104 50,89 44,84 35,85 30,100 41,108;38,122 41,108 30,100 21,102 17,110 21,121 38,122;17,110 21,102 12,89 0,91 0,110;12,89 18,80 8,66 0,66 0,91;27,79 31,65 19,58 8,66 18,80;19,58 19,46 13,43 0,44 0,66 8,66;80,99 69,99 60,110 62,119 80,121;62,119 60,110 48,104 41,108 38,122 57,125;59,136 57,125 38,122 38,122 37,137 46,143;80,136 80,121 62,119 57,125 59,136 63,140;21,121 17,110 0,110 0,128 15,130;37,137 38,122 21,121 15,130 19,138 28,142;58,160 47,155 37,160 37,174 59,174;37,160 29,155 18,160 16,174 37,174;80,158 65,155 58,160 59,174 80,174;18,160 7,151 0,151 0,174 16,174\nSwamp:29,155 28,142 19,138 7,151 18,160;7,151 19,138 15,130 0,128 0,151;47,155 46,143 37,137 28,142 29,155 37,160;65,155 63,140 59,136 46,143 47,155 58,160;80,136 63,140 65,155 80,158",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 53,
            "posY": 145
          },
          {
            "id": "GravitasPedestal",
            "posX": 55,
            "posY": 145
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "posX": 51,
            "posY": 122,
            "emitRate": 10918.405,
            "idleTime": 218.59792,
            "eruptionTime": 152.2954,
            "dormancyCycles": 66.93904,
            "activeCycles": 84.25574
          },
          {
            "id": "slush_water",
            "posX": 43,
            "posY": 76,
            "emitRate": 5284.8022,
            "idleTime": 205.00298,
            "eruptionTime": 282.0736,
            "dormancyCycles": 71.09811,
            "activeCycles": 99.26709
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
        "biomePaths": "MagmaCore:48,48 47,35 42,32 30,38 32,53 40,56;32,53 30,38 21,35 14,39 16,57 20,59;64,31 47,35 48,48 64,52;16,57 14,39 0,37 0,59;47,80 42,72 30,76 32,96 43,96;64,79 64,64 43,67 42,72 47,80;21,73 20,59 16,57 0,59 0,75 15,77;30,76 21,73 15,77 16,96 32,96;15,77 0,75 0,96 16,96\nOilField:64,64 64,52 48,48 40,56 43,67;42,72 43,67 40,56 32,53 20,59 21,73 30,76;64,79 47,80 43,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 50,
            "posY": 51
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 48,
            "posY": 87,
            "emitRate": 211590.1,
            "idleTime": 9566.844,
            "eruptionTime": 75.000786,
            "dormancyCycles": 56.456726,
            "activeCycles": 52.011944
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
        "biomePaths": "Sandstone:80,64 80,53 63,49 59,59 71,71;117,58 105,46 97,52 98,65 110,67;113,77 110,67 98,65 92,70 92,78 104,86;70,76 71,71 59,59 51,63 49,77 64,81;39,55 39,49 22,40 15,50 19,60 30,63;30,79 32,76 30,63 19,60 9,72 16,80;145,79 144,62 142,61 130,63 127,78 142,81\nBarren:98,65 97,52 85,48 80,53 80,64 92,70;92,78 92,70 80,64 71,71 70,76 84,85;127,78 130,63 123,57 117,58 110,67 113,77 124,80;49,77 51,63 39,55 30,63 32,76 47,77;19,60 15,50 0,49 0,71 9,72;160,62 160,44 143,48 142,61 144,62;160,62 144,62 145,79 160,79\nFrozenWastes:104,86 92,78 84,85 83,96 105,96;84,85 70,76 64,81 64,96 83,96;64,81 49,77 47,77 46,96 64,96;30,79 16,80 12,96 32,96;16,80 9,72 0,71 0,96 12,96;142,81 127,78 124,80 124,96 142,96;124,80 113,77 104,86 105,96 124,96;47,77 32,76 30,79 32,96 46,96;160,79 145,79 142,81 142,96 160,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 41,
            "posY": 69
          },
          {
            "id": "GravitasPedestal",
            "posX": 45,
            "posY": 69
          },
          {
            "id": "GeneShuffler",
            "posX": 43,
            "posY": 63
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 7,
            "posY": 79,
            "emitRate": 4187.3057,
            "idleTime": 255.6207,
            "eruptionTime": 332.64835,
            "dormancyCycles": 35.631657,
            "activeCycles": 76.3391
          },
          {
            "id": "steam",
            "posX": 117,
            "posY": 84,
            "emitRate": 6058.941,
            "idleTime": 323.7993,
            "eruptionTime": 190.017,
            "dormancyCycles": 59.74425,
            "activeCycles": 81.280136
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
        "q": -2,
        "r": -1
      },
      {
        "id": "OilRichWarpTarget",
        "q": 1,
        "r": 3
      },
      {
        "id": "TundraMoonlet",
        "q": -8,
        "r": 3
      },
      {
        "id": "MarshyMoonlet",
        "q": 0,
        "r": -7
      },
      {
        "id": "MooMoonlet",
        "q": 8,
        "r": -3
      },
      {
        "id": "WaterMoonlet",
        "q": 6,
        "r": -6
      },
      {
        "id": "NiobiumMoonlet",
        "q": -5,
        "r": 8
      },
      {
        "id": "RegolithMoonlet",
        "q": 9,
        "r": 1
      },
      {
        "id": "TemporalTear",
        "q": 6,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 3,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -10,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -11,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -11,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 0,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -6,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -5,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 2,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 0,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -5,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -3,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -6,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -7,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": -7,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -8,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 11,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 10,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 11,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 9,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 11,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 5,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -2,
        "r": -9
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 2,
        "r": -11
      }
    ]
  },
  {
    "coordinate": "V-OCAN-C-226896390-0-0-0",
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
          "MetalCaves",
          "GeoDormant",
          "Volcanoes"
        ],
        "biomePaths": "Sandstone:131,199 140,172 134,163 111,155 94,164 89,176 90,191 102,206 111,207;90,191 89,176 62,173 66,195;94,164 87,156 62,164 60,170 62,173 89,176;111,155 110,144 90,136 87,156 94,164;140,221 140,206 131,199 111,207 123,225;137,146 124,135 110,144 111,155 134,163;158,194 147,174 140,172 131,199 140,206;176,176 168,167 147,174 158,194 168,196;240,296 240,271 215,265 206,273 206,293 209,297\nMagmaCore:30,351 0,346 0,380 31,380;45,258 25,250 19,261 37,278;62,216 60,205 36,203 32,210 36,220 54,224;40,104 37,87 32,86 18,98 25,112;60,351 39,343 30,351 31,380 60,380;90,352 73,344 60,351 60,380 90,380;121,354 106,345 90,352 90,380 121,380;151,351 140,345 121,354 121,380 153,380;148,291 135,281 123,289 138,313;181,351 170,344 151,351 153,380 180,380;210,352 202,344 181,351 180,380 208,380;184,288 187,272 178,263 171,265 166,287 174,293;206,273 187,272 184,288 206,293;240,347 210,352 208,380 240,380\nToxicJungle:33,320 29,294 0,292 0,327;38,285 37,278 19,261 0,265 0,292 29,294;36,220 32,210 0,208 0,238 21,242;102,206 90,191 66,195 60,205 62,216 86,224;108,105 111,84 92,72 74,85 74,97 95,111;137,316 138,315 138,313 123,289 112,288 98,301 98,314 107,323;166,287 171,265 149,253 137,259 135,281 148,291;215,265 216,252 203,237 186,241 178,263 187,272 206,273\nRadioactive:19,261 25,250 21,242 0,238 0,265;23,115 25,112 18,98 0,96 0,118;112,288 102,274 84,277 81,286 98,301;240,246 216,252 215,265 240,271\nFrozenWastes:36,203 31,180 0,182 0,208 32,210;25,149 33,139 23,115 0,118 0,149;89,239 86,224 62,216 54,224 58,251 73,254;74,97 74,85 57,74 37,87 40,104 57,112;135,281 137,259 114,248 102,274 112,288 123,289;240,191 240,163 205,165 200,175 207,191\nOcean:31,180 34,175 25,149 0,149 0,182;58,251 54,224 36,220 21,242 25,250 45,258;66,195 62,173 60,170 34,175 31,180 36,203 60,205;60,170 62,164 51,139 33,139 25,149 34,175;51,139 60,128 57,112 40,104 25,112 23,115 33,139;81,286 84,277 73,254 58,251 45,258 37,278 38,285 63,297;87,156 90,136 89,134 60,128 51,139 62,164;124,135 126,116 108,105 95,111 89,134 90,136 110,144;172,226 177,208 168,196 158,194 140,206 140,221 152,232;168,167 172,144 163,136 137,146 134,163 140,172 147,174;203,237 210,220 202,205 177,208 172,226 186,241;202,205 207,191 200,175 176,176 168,196 177,208;195,141 202,128 192,108 181,107 163,125 163,136 172,144;208,89 204,67 178,60 168,66 163,83 181,107 192,108;240,296 209,297 204,322 204,322 240,326;240,163 240,127 202,128 195,141 205,165;240,127 240,93 208,89 192,108 202,128\nBarren:32,86 21,63 0,61 0,96 18,98;57,74 57,59 35,47 21,63 32,86 37,87;92,72 93,59 73,45 57,59 57,74 74,85;128,76 131,60 110,46 93,59 92,72 111,84;163,83 168,66 146,51 131,60 128,76 144,90;211,60 207,30 203,26 180,33 178,60 204,67;240,61 211,60 204,67 208,89 240,93\nOilField:39,343 38,325 33,320 0,327 0,346 30,351;73,344 73,324 63,315 38,325 39,343 60,351;106,345 107,323 98,314 73,324 73,344 90,352;140,345 137,316 107,323 106,345 121,354;170,344 170,321 138,315 137,316 140,345 151,351;202,344 204,322 204,322 174,317 170,321 170,344 181,351;240,347 240,326 204,322 202,344 210,352\nSwamp:63,315 63,297 38,285 29,294 33,320 38,325;123,225 111,207 102,206 86,224 89,239 113,248;95,111 74,97 57,112 60,128 89,134;163,136 163,125 140,108 126,116 124,135 137,146;174,317 174,293 166,287 148,291 138,313 138,315 170,321;240,246 240,219 210,220 203,237 216,252\nBoggyMarsh:98,314 98,301 81,286 63,297 63,315 73,324;102,274 114,248 113,248 89,239 73,254 84,277;149,253 152,232 140,221 123,225 113,248 114,248 137,259;140,108 144,90 128,76 111,84 108,105 126,116;181,107 163,83 144,90 140,108 163,125;178,263 186,241 172,226 152,232 149,253 171,265;209,297 206,293 184,288 174,293 174,317 204,322;200,175 205,165 195,141 172,144 168,167 176,176;240,219 240,191 207,191 202,205 210,220",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 112,
            "posY": 184
          },
          {
            "id": "MassiveHeatSink",
            "posX": 21,
            "posY": 190
          },
          {
            "id": "MassiveHeatSink",
            "posX": 63,
            "posY": 248
          },
          {
            "id": "MassiveHeatSink",
            "posX": 209,
            "posY": 185
          },
          {
            "id": "WarpConduitSender",
            "posX": 89,
            "posY": 285
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 85,
            "posY": 103
          },
          {
            "id": "GravitasPedestal",
            "posX": 153,
            "posY": 245
          },
          {
            "id": "WarpReceiver",
            "posX": 211,
            "posY": 129
          },
          {
            "id": "WarpPortal",
            "posX": 210,
            "posY": 123
          },
          {
            "id": "GeneShuffler",
            "posX": 102,
            "posY": 336
          },
          {
            "id": "GeneShuffler",
            "posX": 159,
            "posY": 119
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 82,
            "posY": 210,
            "emitRate": 5524.0586,
            "idleTime": 399.53198,
            "eruptionTime": 398.95142,
            "dormancyCycles": 41.190422,
            "activeCycles": 66.54282
          },
          {
            "id": "methane",
            "posX": 195,
            "posY": 243,
            "emitRate": 379.7944,
            "idleTime": 289.5916,
            "eruptionTime": 265.1338,
            "dormancyCycles": 41.369522,
            "activeCycles": 72.351006
          },
          {
            "id": "steam",
            "posX": 193,
            "posY": 313,
            "emitRate": 6013.3784,
            "idleTime": 327.23495,
            "eruptionTime": 174.51636,
            "dormancyCycles": 79.14327,
            "activeCycles": 101.61955
          },
          {
            "id": "methane",
            "posX": 85,
            "posY": 250,
            "emitRate": 328.66678,
            "idleTime": 153.73976,
            "eruptionTime": 178.33357,
            "dormancyCycles": 36.69972,
            "activeCycles": 79.001396
          },
          {
            "id": "salt_water",
            "posX": 181,
            "posY": 180,
            "emitRate": 8626.081,
            "idleTime": 317.55984,
            "eruptionTime": 382.5045,
            "dormancyCycles": 49.632645,
            "activeCycles": 97.79492
          },
          {
            "id": "OilWell",
            "posX": 173,
            "posY": 338,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 161,
            "posY": 334,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 210,
            "posY": 327,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "liquid_sulfur",
            "posX": 82,
            "posY": 139,
            "emitRate": 7882.5474,
            "idleTime": 433.9356,
            "eruptionTime": 257.54462,
            "dormancyCycles": 44.644077,
            "activeCycles": 74.675285
          },
          {
            "id": "chlorine_gas",
            "posX": 123,
            "posY": 261,
            "emitRate": 359.81796,
            "idleTime": 448.81332,
            "eruptionTime": 453.0015,
            "dormancyCycles": 43.481842,
            "activeCycles": 49.56228
          },
          {
            "id": "liquid_sulfur",
            "posX": 122,
            "posY": 334,
            "emitRate": 5226.268,
            "idleTime": 209.17706,
            "eruptionTime": 295.16745,
            "dormancyCycles": 42.0705,
            "activeCycles": 71.3044
          },
          {
            "id": "molten_iron",
            "posX": 64,
            "posY": 286,
            "emitRate": 7864.8174,
            "idleTime": 692.5904,
            "eruptionTime": 50.23835,
            "dormancyCycles": 45.57422,
            "activeCycles": 56.17474
          },
          {
            "id": "hot_water",
            "posX": 224,
            "posY": 319,
            "emitRate": 8543.853,
            "idleTime": 304.48773,
            "eruptionTime": 326.45447,
            "dormancyCycles": 44.088856,
            "activeCycles": 67.20983
          },
          {
            "id": "big_volcano",
            "posX": 173,
            "posY": 78,
            "emitRate": 266434.25,
            "idleTime": 8596.088,
            "eruptionTime": 63.078823,
            "dormancyCycles": 65.995285,
            "activeCycles": 88.81246
          },
          {
            "id": "molten_copper",
            "posX": 57,
            "posY": 325,
            "emitRate": 8461.948,
            "idleTime": 803.2877,
            "eruptionTime": 53.385654,
            "dormancyCycles": 47.934284,
            "activeCycles": 68.85901
          },
          {
            "id": "steam",
            "posX": 27,
            "posY": 170,
            "emitRate": 9001.829,
            "idleTime": 464.62,
            "eruptionTime": 135.89699,
            "dormancyCycles": 27.08034,
            "activeCycles": 52.43375
          },
          {
            "id": "salt_water",
            "posX": 34,
            "posY": 232,
            "emitRate": 9187.711,
            "idleTime": 264.70584,
            "eruptionTime": 285.1069,
            "dormancyCycles": 58.233665,
            "activeCycles": 54.251293
          },
          {
            "id": "big_volcano",
            "posX": 47,
            "posY": 213,
            "emitRate": 181213.73,
            "idleTime": 9471.229,
            "eruptionTime": 82.2592,
            "dormancyCycles": 38.858356,
            "activeCycles": 57.444817
          },
          {
            "id": "big_volcano",
            "posX": 135,
            "posY": 295,
            "emitRate": 269347.4,
            "idleTime": 8965.885,
            "eruptionTime": 60.642895,
            "dormancyCycles": 54.11832,
            "activeCycles": 66.24589
          },
          {
            "id": "big_volcano",
            "posX": 32,
            "posY": 263,
            "emitRate": 225995.83,
            "idleTime": 9305.857,
            "eruptionTime": 70.36626,
            "dormancyCycles": 50.5552,
            "activeCycles": 58.47355
          },
          {
            "id": "big_volcano",
            "posX": 196,
            "posY": 282,
            "emitRate": 262260.56,
            "idleTime": 8320.1045,
            "eruptionTime": 69.103485,
            "dormancyCycles": 40.521854,
            "activeCycles": 64.02746
          },
          {
            "id": "big_volcano",
            "posX": 176,
            "posY": 279,
            "emitRate": 254659.5,
            "idleTime": 8346.755,
            "eruptionTime": 75.486595,
            "dormancyCycles": 42.174973,
            "activeCycles": 89.3285
          },
          {
            "id": "big_volcano",
            "posX": 29,
            "posY": 99,
            "emitRate": 294309.72,
            "idleTime": 10150.565,
            "eruptionTime": 63.31754,
            "dormancyCycles": 47.18523,
            "activeCycles": 87.384926
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
          "BouldersSmall",
          "MagmaVents"
        ],
        "biomePaths": "Forest:88,113 92,95 75,85 63,89 58,99 64,116 75,120;114,112 112,103 95,94 92,95 88,113 99,120;75,85 79,71 69,62 57,66 54,78 63,89;95,94 100,81 91,67 79,71 75,85 92,95;64,116 58,99 41,102 39,114 53,124;58,99 63,89 54,78 40,82 36,96 41,102;52,133 53,124 39,114 26,122 25,125 40,140;77,133 75,120 64,116 53,124 52,133 63,142;99,132 99,120 88,113 75,120 77,133 87,139\nRust:115,78 119,68 113,59 94,61 91,67 100,81;135,67 139,60 135,47 119,43 117,45 113,59 119,68;31,72 36,59 22,46 8,56 21,73;135,113 138,99 134,92 122,91 112,103 114,112 120,116;160,99 160,80 140,79 134,92 138,99;160,60 139,60 135,67 140,79 160,80;36,96 40,82 31,72 21,73 13,84 22,97;39,114 41,102 36,96 22,97 16,109 26,122;25,125 26,122 16,109 0,110 0,131 16,133;160,40 143,39 135,47 139,60 160,60;46,56 50,43 37,34 23,42 22,46 36,59\nWasteland:91,67 94,61 89,46 81,43 72,48 69,62 79,71;113,59 117,45 102,37 89,46 94,61;140,79 135,67 119,68 115,78 122,91 134,92;122,91 115,78 100,81 95,94 112,103;69,62 72,48 58,40 50,43 46,56 57,66;54,78 57,66 46,56 36,59 31,72 40,82;13,84 21,73 8,56 0,56 0,84;160,117 160,99 138,99 135,113 141,119;139,136 141,119 135,113 120,116 120,133 135,139;160,117 141,119 139,136 160,141;16,109 22,97 13,84 0,84 0,110\nMagmaCore:120,133 120,116 114,112 99,120 99,132 111,138;18,153 19,152 16,133 0,131 0,154\nRadioactive:160,154 160,141 139,136 135,139 134,152 140,158;37,151 40,140 25,125 16,133 19,152;88,152 87,139 77,133 63,142 63,152 78,158;57,157 39,154 35,176 58,176;134,152 135,139 120,133 111,138 110,152 120,158;140,158 134,152 120,158 120,176 139,176;110,152 111,138 99,132 87,139 88,152 99,158;18,153 0,154 0,176 21,176;63,152 63,142 52,133 40,140 37,151 39,154 57,157;120,158 110,152 99,158 99,176 120,176\nFrozenWastes:160,154 140,158 139,176 160,176;99,158 88,152 78,158 78,176 99,176;78,158 63,152 57,157 58,176 78,176;39,154 37,151 19,152 18,153 21,176 35,176",
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "posX": 92,
            "posY": 91
          },
          {
            "id": "WarpConduitSender",
            "posX": 59,
            "posY": 137
          },
          {
            "id": "WarpReceiver",
            "posX": 81,
            "posY": 107
          },
          {
            "id": "WarpPortal",
            "posX": 59,
            "posY": 107
          },
          {
            "id": "GeneShuffler",
            "posX": 16,
            "posY": 57
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 115,
            "posY": 150,
            "emitRate": 732.9187,
            "idleTime": 364.69604,
            "eruptionTime": 176.14832,
            "dormancyCycles": 37.4198,
            "activeCycles": 66.78902
          },
          {
            "id": "liquid_co2",
            "posX": 13,
            "posY": 156,
            "emitRate": 534.45013,
            "idleTime": 314.76053,
            "eruptionTime": 341.1913,
            "dormancyCycles": 52.923832,
            "activeCycles": 45.83242
          },
          {
            "id": "molten_gold",
            "posX": 138,
            "posY": 145,
            "emitRate": 9201.834,
            "idleTime": 742.0009,
            "eruptionTime": 49.247154,
            "dormancyCycles": 41.885056,
            "activeCycles": 59.974277
          },
          {
            "id": "hot_steam",
            "posX": 62,
            "posY": 71,
            "emitRate": 3289.8408,
            "idleTime": 521.32495,
            "eruptionTime": 383.01703,
            "dormancyCycles": 57.795696,
            "activeCycles": 87.33688
          },
          {
            "id": "molten_aluminum",
            "posX": 145,
            "posY": 134,
            "emitRate": 9709.622,
            "idleTime": 818.779,
            "eruptionTime": 42.712772,
            "dormancyCycles": 28.801449,
            "activeCycles": 44.248447
          },
          {
            "id": "filthy_water",
            "posX": 17,
            "posY": 98,
            "emitRate": 7227.405,
            "idleTime": 259.08096,
            "eruptionTime": 491.2402,
            "dormancyCycles": 66.053246,
            "activeCycles": 52.456993
          },
          {
            "id": "slimy_po2",
            "posX": 49,
            "posY": 117,
            "emitRate": 168.71866,
            "idleTime": 74.60401,
            "eruptionTime": 583.87854,
            "dormancyCycles": 33.44735,
            "activeCycles": 66.2505
          },
          {
            "id": "liquid_sulfur",
            "posX": 122,
            "posY": 86,
            "emitRate": 4407.056,
            "idleTime": 205.16736,
            "eruptionTime": 255.21579,
            "dormancyCycles": 40.521473,
            "activeCycles": 76.09424
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
          "CrashedSatellites",
          "SubsurfaceOcean"
        ],
        "biomePaths": "Ocean:64,37 51,37 45,43 48,54 64,58;48,54 45,43 34,40 29,45 30,58 40,63;30,58 29,45 16,43 11,47 17,65 18,65;17,65 11,47 0,47 0,68\nFrozenWastes:64,69 64,58 48,54 40,63 42,71 46,74;49,86 46,74 42,71 29,79 33,92 43,93;42,71 40,63 30,58 18,65 21,76 29,79;64,69 46,74 49,86 64,88;64,101 64,88 49,86 43,93 47,102;33,92 29,79 21,76 13,85 16,95 26,98;21,76 18,65 17,65 0,68 0,82 13,85;16,95 13,85 0,82 0,105 5,105;47,102 43,93 33,92 26,98 28,110 44,111;27,111 28,110 26,98 16,95 5,105 14,114;46,114 44,111 28,110 27,111 29,128 43,128;64,101 47,102 44,111 46,114 64,117;14,114 5,105 0,105 0,128 11,128;27,111 14,114 11,128 29,128;64,117 46,114 43,128 64,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 43,
            "posY": 58
          },
          {
            "id": "GravitasPedestal",
            "posX": 35,
            "posY": 103
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 38,
            "posY": 66
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 22,
            "posY": 67
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 20,
            "posY": 51
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 23,
            "posY": 117,
            "emitRate": 16354.314,
            "idleTime": 700.344,
            "eruptionTime": 20.62123,
            "dormancyCycles": 53.944267,
            "activeCycles": 103.741776
          },
          {
            "id": "molten_iron",
            "posX": 50,
            "posY": 106,
            "emitRate": 7227.4663,
            "idleTime": 710.7348,
            "eruptionTime": 45.654743,
            "dormancyCycles": 108.42716,
            "activeCycles": 88.65966
          },
          {
            "id": "molten_iron",
            "posX": 22,
            "posY": 91,
            "emitRate": 8220.434,
            "idleTime": 747.8363,
            "eruptionTime": 45.99796,
            "dormancyCycles": 47.64218,
            "activeCycles": 55.87381
          },
          {
            "id": "molten_iron",
            "posX": 11,
            "posY": 93,
            "emitRate": 9020.944,
            "idleTime": 789.44116,
            "eruptionTime": 46.39323,
            "dormancyCycles": 52.386673,
            "activeCycles": 68.60365
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
        "biomePaths": "BoggyMarsh:40,50 40,44 27,35 19,38 15,50 23,59;64,56 64,38 48,36 40,44 40,50 47,57;23,61 23,59 15,50 0,52 0,74 12,74;37,75 23,61 12,74 22,87\nToxicJungle:64,56 47,57 43,75 43,76 64,76;47,57 40,50 23,59 23,61 37,75 43,75\nMagmaCore:22,87 12,74 0,74 0,96 21,96;64,76 43,76 45,96 64,96;43,76 43,75 37,75 22,87 21,96 45,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 34,
            "posY": 48
          },
          {
            "id": "GravitasPedestal",
            "posX": 20,
            "posY": 48
          },
          {
            "id": "SapTree",
            "posX": 27,
            "posY": 48
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 53,
            "posY": 59,
            "emitRate": 14846.001,
            "idleTime": 823.73315,
            "eruptionTime": 28.10155,
            "dormancyCycles": 45.324276,
            "activeCycles": 84.954445
          },
          {
            "id": "molten_tungsten",
            "posX": 46,
            "posY": 88,
            "emitRate": 7221.789,
            "idleTime": 673.1488,
            "eruptionTime": 51.293697,
            "dormancyCycles": 62.540443,
            "activeCycles": 97.82516
          },
          {
            "id": "molten_tungsten",
            "posX": 8,
            "posY": 91,
            "emitRate": 9393.391,
            "idleTime": 681.07806,
            "eruptionTime": 34.948948,
            "dormancyCycles": 46.62936,
            "activeCycles": 48.874554
          },
          {
            "id": "chlorine_gas",
            "posX": 32,
            "posY": 62,
            "emitRate": 453.6103,
            "idleTime": 405.52652,
            "eruptionTime": 301.25284,
            "dormancyCycles": 30.009668,
            "activeCycles": 92.08309
          },
          {
            "id": "hot_po2",
            "posX": 42,
            "posY": 61,
            "emitRate": 265.4415,
            "idleTime": 336.5171,
            "eruptionTime": 704.1665,
            "dormancyCycles": 44.029816,
            "activeCycles": 104.352875
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
        "biomePaths": "MagmaCore:30,62 33,46 28,42 19,42 12,57 18,63;45,64 50,55 44,46 33,46 30,62 34,66;64,54 64,36 49,36 44,46 50,55;19,42 13,37 0,36 0,57 12,57;14,77 18,63 12,57 0,57 0,78\nOilField:64,54 50,55 45,64 54,76 64,77;54,76 45,64 34,66 33,79 44,87;33,79 34,66 30,62 18,63 14,77 21,85\nFrozenWastes:64,77 54,76 44,87 44,96 64,96;44,87 33,79 21,85 20,96 44,96;21,85 14,77 0,78 0,96 20,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 51,
            "posY": 74
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 37,
            "posY": 70,
            "emitRate": 299987.5,
            "idleTime": 7897.6963,
            "eruptionTime": 58.540394,
            "dormancyCycles": 35.394413,
            "activeCycles": 61.632847
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
        "biomePaths": "Moo:46,45 49,41 46,30 37,25 24,38 33,47;49,63 51,60 46,45 33,47 30,60 34,64;20,38 17,35 0,35 0,56 12,57;62,59 67,47 63,41 49,41 46,45 51,60;84,38 78,28 67,29 63,41 67,47 78,47;30,60 33,47 24,38 20,38 12,57 18,61;80,64 84,58 78,47 67,47 62,59 67,65;96,58 96,37 84,38 78,47 84,58\nFrozenWastes:18,61 12,57 0,56 0,80 14,80;34,64 30,60 18,61 14,80 33,80;67,65 62,59 51,60 49,63 51,80 64,80;49,63 34,64 33,80 51,80;96,58 84,58 80,64 84,80 96,80;80,64 67,65 64,80 84,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 38,
            "posY": 39
          },
          {
            "id": "GravitasPedestal",
            "posX": 31,
            "posY": 39
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 40,
            "posY": 56,
            "emitRate": 371.47543,
            "idleTime": 260.72977,
            "eruptionTime": 255.26009,
            "dormancyCycles": 52.922596,
            "activeCycles": 62.8545
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
        "biomePaths": "Barren:80,61 80,59 63,49 55,52 53,55 55,67 61,70;80,35 67,36 63,49 80,59;64,81 61,70 55,67 43,75 44,85 56,91;53,55 55,52 47,36 36,37 33,42 37,55;63,49 67,36 62,29 51,30 47,36 55,52;80,61 61,70 64,81 80,84;55,67 53,55 37,55 32,62 34,69 43,75;37,55 33,42 19,43 16,58 32,62;16,58 19,43 15,39 0,39 0,57 16,59;57,95 56,91 44,85 36,91 36,105 37,107 46,108;80,96 65,100 66,116 80,116;80,96 80,84 64,81 56,91 57,95 65,100;34,69 32,62 16,58 16,59 14,76 21,81;14,76 16,59 0,57 0,78;44,85 43,75 34,69 21,81 22,85 36,91;22,85 21,81 14,76 0,78 0,94 15,95;36,105 36,91 22,85 15,95 20,105;66,116 65,100 57,95 46,108 53,117 64,117;32,124 37,107 36,105 20,105 16,112 22,125;66,134 64,117 53,117 46,128 60,139;16,112 20,105 15,95 0,94 0,113;59,141 60,139 46,128 40,130 37,143 47,150;80,116 66,116 64,117 66,134 80,135;37,143 40,130 32,124 22,125 18,130 19,140 27,147;46,128 53,117 46,108 37,107 32,124 40,130;22,125 16,112 0,113 0,128 18,130;60,164 48,157 38,166 38,174 62,174;38,166 26,155 18,161 16,174 38,174;19,140 18,130 0,128 0,150;18,161 0,151 0,174 16,174;80,154 69,154 60,164 62,174 80,174\nSwamp:69,154 59,141 47,150 48,157 60,164;48,157 47,150 37,143 27,147 26,155 38,166;80,135 66,134 60,139 59,141 69,154 80,154;26,155 27,147 19,140 0,150 0,151 18,161",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 41,
            "posY": 161
          },
          {
            "id": "GravitasPedestal",
            "posX": 43,
            "posY": 161
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "posX": 29,
            "posY": 91,
            "emitRate": 10901.552,
            "idleTime": 208.31168,
            "eruptionTime": 147.36539,
            "dormancyCycles": 32.619106,
            "activeCycles": 32.70751
          },
          {
            "id": "slush_water",
            "posX": 49,
            "posY": 116,
            "emitRate": 4477.6924,
            "idleTime": 277.08487,
            "eruptionTime": 356.55942,
            "dormancyCycles": 62.73349,
            "activeCycles": 113.293526
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
        "biomePaths": "Barren:85,75 79,59 76,58 62,71 66,78 78,81;96,54 79,59 85,75 96,76;21,72 14,59 0,59 0,78 14,79\nFrozenWastes:66,78 62,71 53,68 51,69 45,80 54,96 57,96;78,81 66,78 57,96 80,96;96,76 85,75 78,81 80,96 96,96;33,82 26,72 21,72 14,79 18,96 29,96;45,80 33,82 29,96 54,96;14,79 0,78 0,96 18,96\nSandstone:45,80 51,69 35,63 26,72 33,82",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 73,
            "posY": 80
          },
          {
            "id": "GravitasPedestal",
            "posX": 77,
            "posY": 80
          },
          {
            "id": "GeneShuffler",
            "posX": 75,
            "posY": 74
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 19,
            "posY": 80,
            "emitRate": 2695.6777,
            "idleTime": 355.22675,
            "eruptionTime": 299.28314,
            "dormancyCycles": 37.09296,
            "activeCycles": 51.02743
          },
          {
            "id": "hot_steam",
            "posX": 56,
            "posY": 76,
            "emitRate": 9167.762,
            "idleTime": 566.7339,
            "eruptionTime": 99.85363,
            "dormancyCycles": 52.231457,
            "activeCycles": 101.168304
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
        "q": -1,
        "r": -2
      },
      {
        "id": "TundraMoonlet",
        "q": 1,
        "r": 4
      },
      {
        "id": "MarshyMoonlet",
        "q": 4,
        "r": -6
      },
      {
        "id": "NiobiumMoonlet",
        "q": -6,
        "r": 6
      },
      {
        "id": "MooMoonlet",
        "q": 6,
        "r": 0
      },
      {
        "id": "WaterMoonlet",
        "q": -6,
        "r": 0
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 1,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": -9,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -3,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 7,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 8,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 8,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 9,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 10,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -2,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -7,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 7,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -7,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -2,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 5,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 5,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 6,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 7,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -11,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 3,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 4,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 5,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 4,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 5,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -7,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 0,
        "r": -10
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -11,
        "r": 0
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 11,
        "r": 0
      }
    ]
  },
  {
    "coordinate": "V-OASIS-C-1414687611-0-0-0",
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
          "Volcanoes",
          "BouldersMixed",
          "BouldersMedium"
        ],
        "biomePaths": "Forest:143,230 149,209 148,201 139,192 115,187 97,200 95,209 98,225 109,238 117,240;98,225 95,209 72,211 69,223 79,235;95,209 97,200 85,187 65,196 72,211;115,187 114,182 99,170 86,176 85,187 97,200;142,257 145,232 143,230 117,240 129,259;140,170 127,164 114,182 115,187 139,192;170,231 174,218 149,209 143,230 145,232;177,216 180,209 175,191 148,201 149,209 174,218\nMagmaCore:30,349 23,341 0,341 0,380 27,380;19,148 14,129 0,128 0,155;25,115 24,110 0,107 0,128 14,129;79,241 79,235 69,223 51,233 62,247;63,194 60,183 36,178 33,181 38,199;51,117 46,98 34,96 24,110 25,115 49,120;60,346 30,349 27,380 65,380;85,187 86,176 72,168 60,183 63,194 65,196;92,349 75,338 64,340 60,346 65,380 88,380;109,238 98,225 79,235 79,241 92,252;124,352 107,344 92,349 88,380 124,380;127,164 125,160 103,159 99,170 114,182;104,125 102,117 85,112 80,118 87,139 92,140;131,120 118,105 102,117 104,125 126,128;154,347 141,343 124,352 124,380 158,380;151,275 152,267 142,257 129,259 124,274 138,282;150,162 148,145 134,145 125,160 127,164 140,170;184,343 170,339 154,347 158,380 181,380;175,158 166,143 149,145 148,145 150,162 170,166;212,348 191,341 184,343 181,380 212,380;200,232 177,216 174,218 170,231 179,244;202,232 207,223 201,206 180,209 177,216 200,232;201,206 206,192 204,189 176,189 175,191 180,209;240,344 225,341 212,348 212,380 240,380\nOcean:35,307 33,306 0,303 0,341 23,341;69,294 69,282 55,269 34,271 34,271 33,306 35,307 46,309;50,145 49,120 25,115 14,129 19,148 34,155;170,339 164,308 139,308 136,311 141,343 154,347\nToxicJungle:34,271 0,273 0,303 33,306;107,344 111,312 104,306 87,309 75,338 92,349;225,341 224,316 208,308 199,311 191,341 212,348;203,155 206,134 184,120 173,125 166,143 175,158;240,313 240,278 213,278 208,308 224,316\nSandstone:34,271 34,271 31,240 0,237 0,273;33,181 36,178 34,155 19,148 0,155 0,181;69,223 72,211 65,196 63,194 38,199 33,209 40,231 51,233;72,168 69,153 50,145 34,155 36,178 60,183;75,338 87,309 69,294 46,309 64,340;93,269 92,252 79,241 62,247 55,269 69,282;87,139 80,118 51,117 49,120 50,145 69,153;104,306 109,279 93,269 69,282 69,294 87,309;124,274 129,259 117,240 109,238 92,252 93,269 109,279;176,257 179,244 170,231 145,232 142,257 152,267;175,191 176,189 170,166 150,162 140,170 139,192 148,201;215,249 202,232 200,232 179,244 176,257 189,272 208,272;219,127 223,106 206,92 190,97 184,120 206,134;240,221 240,194 206,192 201,206 207,223;240,161 209,162 204,189 206,192 240,194\nWasteland:40,231 33,209 0,211 0,237 31,240;33,209 38,199 33,181 0,181 0,211;141,343 136,311 111,312 107,344 124,352;136,311 139,308 138,282 124,274 109,279 104,306 111,312;134,145 126,128 104,125 92,140 103,159 125,160;209,162 203,155 175,158 170,166 176,189 204,189\nBarren:34,96 23,72 0,71 0,107 24,110;63,81 59,65 36,57 23,72 34,96 46,98;85,112 82,88 63,81 46,98 51,117 80,118;118,105 119,90 99,76 82,88 85,112 102,117;147,119 152,115 155,92 138,79 119,90 118,105 131,120;184,120 190,97 174,84 155,92 152,115 173,125;206,92 213,69 201,56 176,65 174,84 190,97;240,103 240,65 213,69 206,92 223,106\nBoggyMarsh:60,346 64,340 46,309 35,307 23,341 30,349;191,341 199,311 174,299 164,308 170,339 184,343;208,308 213,278 208,272 189,272 174,295 174,299 199,311;240,161 240,133 219,127 206,134 203,155 209,162\nOilField:55,269 62,247 51,233 40,231 31,240 34,271;99,170 103,159 92,140 87,139 69,153 72,168 86,176;174,299 174,295 151,275 138,282 139,308 164,308;189,272 176,257 152,267 151,275 174,295;240,246 215,249 208,272 213,278 240,278;240,246 240,221 207,223 202,232 215,249\nRadioactive:149,145 147,119 131,120 126,128 134,145 148,145;166,143 173,125 152,115 147,119 149,145;240,313 224,316 225,341 240,344;240,103 223,106 219,127 240,133",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 122,
            "posY": 210
          },
          {
            "id": "WarpConduitSender",
            "posX": 60,
            "posY": 146
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 211,
            "posY": 179
          },
          {
            "id": "GravitasPedestal",
            "posX": 202,
            "posY": 128
          },
          {
            "id": "WarpReceiver",
            "posX": 125,
            "posY": 312
          },
          {
            "id": "WarpPortal",
            "posX": 124,
            "posY": 306
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 48,
            "posY": 264,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 165,
            "posY": 281,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 145,
            "posY": 302,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 47,
            "posY": 285,
            "emitRate": 10617.335,
            "idleTime": 374.2881,
            "eruptionTime": 292.4054,
            "dormancyCycles": 80.00988,
            "activeCycles": 84.35258
          },
          {
            "id": "steam",
            "posX": 87,
            "posY": 311,
            "emitRate": 7657.823,
            "idleTime": 480.50977,
            "eruptionTime": 235.80461,
            "dormancyCycles": 67.26547,
            "activeCycles": 94.75184
          },
          {
            "id": "steam",
            "posX": 205,
            "posY": 305,
            "emitRate": 4196.4087,
            "idleTime": 196.72609,
            "eruptionTime": 261.52432,
            "dormancyCycles": 48.522034,
            "activeCycles": 67.727875
          },
          {
            "id": "methane",
            "posX": 200,
            "posY": 327,
            "emitRate": 259.20667,
            "idleTime": 186.99408,
            "eruptionTime": 313.56284,
            "dormancyCycles": 59.503365,
            "activeCycles": 72.780464
          },
          {
            "id": "methane",
            "posX": 186,
            "posY": 282,
            "emitRate": 335.6795,
            "idleTime": 265.25766,
            "eruptionTime": 276.77365,
            "dormancyCycles": 47.097645,
            "activeCycles": 57.401966
          },
          {
            "id": "molten_gold",
            "posX": 158,
            "posY": 192,
            "emitRate": 7485.913,
            "idleTime": 730.5112,
            "eruptionTime": 56.56581,
            "dormancyCycles": 55.307846,
            "activeCycles": 66.91807
          },
          {
            "id": "molten_copper",
            "posX": 147,
            "posY": 185,
            "emitRate": 12585.638,
            "idleTime": 720.4414,
            "eruptionTime": 31.334341,
            "dormancyCycles": 55.259132,
            "activeCycles": 76.77614
          },
          {
            "id": "molten_copper",
            "posX": 39,
            "posY": 144,
            "emitRate": 10336.993,
            "idleTime": 781.06085,
            "eruptionTime": 41.727848,
            "dormancyCycles": 52.024937,
            "activeCycles": 59.23268
          },
          {
            "id": "molten_gold",
            "posX": 169,
            "posY": 180,
            "emitRate": 6842.603,
            "idleTime": 676.04535,
            "eruptionTime": 58.01345,
            "dormancyCycles": 45.563488,
            "activeCycles": 70.431755
          },
          {
            "id": "hot_co2",
            "posX": 223,
            "posY": 227,
            "emitRate": 283.6081,
            "idleTime": 208.8521,
            "eruptionTime": 330.99423,
            "dormancyCycles": 57.372025,
            "activeCycles": 97.85212
          },
          {
            "id": "liquid_sulfur",
            "posX": 147,
            "posY": 196,
            "emitRate": 6244.0093,
            "idleTime": 229.38757,
            "eruptionTime": 204.23376,
            "dormancyCycles": 44.431828,
            "activeCycles": 62.94755
          },
          {
            "id": "hot_hydrogen",
            "posX": 182,
            "posY": 184,
            "emitRate": 412.88577,
            "idleTime": 473.0941,
            "eruptionTime": 350.1923,
            "dormancyCycles": 42.268436,
            "activeCycles": 67.76785
          },
          {
            "id": "hot_po2",
            "posX": 139,
            "posY": 139,
            "emitRate": 329.098,
            "idleTime": 278.56036,
            "eruptionTime": 325.64398,
            "dormancyCycles": 55.72897,
            "activeCycles": 84.5415
          },
          {
            "id": "small_volcano",
            "posX": 29,
            "posY": 284,
            "emitRate": 131449.08,
            "idleTime": 9328.917,
            "eruptionTime": 68.91806,
            "dormancyCycles": 45.58828,
            "activeCycles": 64.362335
          },
          {
            "id": "hot_water",
            "posX": 87,
            "posY": 331,
            "emitRate": 12562.884,
            "idleTime": 531.7105,
            "eruptionTime": 282.76544,
            "dormancyCycles": 56.281837,
            "activeCycles": 77.91776
          },
          {
            "id": "hot_water",
            "posX": 167,
            "posY": 298,
            "emitRate": 13318.785,
            "idleTime": 249.55424,
            "eruptionTime": 125.631454,
            "dormancyCycles": 59.850548,
            "activeCycles": 83.732445
          },
          {
            "id": "small_volcano",
            "posX": 145,
            "posY": 312,
            "emitRate": 113120.945,
            "idleTime": 8945.199,
            "eruptionTime": 76.34778,
            "dormancyCycles": 38.38125,
            "activeCycles": 44.135265
          },
          {
            "id": "big_volcano",
            "posX": 112,
            "posY": 169,
            "emitRate": 265201.38,
            "idleTime": 9570.956,
            "eruptionTime": 77.91474,
            "dormancyCycles": 45.788303,
            "activeCycles": 82.478645
          },
          {
            "id": "big_volcano",
            "posX": 193,
            "posY": 218,
            "emitRate": 292482.72,
            "idleTime": 8178.2656,
            "eruptionTime": 56.312565,
            "dormancyCycles": 51.338856,
            "activeCycles": 65.49221
          },
          {
            "id": "big_volcano",
            "posX": 190,
            "posY": 198,
            "emitRate": 309003.84,
            "idleTime": 8141.4272,
            "eruptionTime": 51.61363,
            "dormancyCycles": 15.823966,
            "activeCycles": 32.971027
          },
          {
            "id": "big_volcano",
            "posX": 93,
            "posY": 238,
            "emitRate": 302959.3,
            "idleTime": 10564.074,
            "eruptionTime": 75.84233,
            "dormancyCycles": 71.37896,
            "activeCycles": 73.27373
          },
          {
            "id": "big_volcano",
            "posX": 116,
            "posY": 119,
            "emitRate": 333387.6,
            "idleTime": 9197.671,
            "eruptionTime": 70.21557,
            "dormancyCycles": 37.920166,
            "activeCycles": 45.708714
          },
          {
            "id": "big_volcano",
            "posX": 138,
            "posY": 270,
            "emitRate": 280523.7,
            "idleTime": 9559.976,
            "eruptionTime": 70.21076,
            "dormancyCycles": 40.563324,
            "activeCycles": 87.15394
          },
          {
            "id": "big_volcano",
            "posX": 66,
            "posY": 236,
            "emitRate": 261375,
            "idleTime": 9190.77,
            "eruptionTime": 75.175674,
            "dormancyCycles": 43.364616,
            "activeCycles": 76.96408
          },
          {
            "id": "big_volcano",
            "posX": 160,
            "posY": 155,
            "emitRate": 271063,
            "idleTime": 10789.378,
            "eruptionTime": 73.23567,
            "dormancyCycles": 52.415504,
            "activeCycles": 93.79135
          },
          {
            "id": "OilWell",
            "posX": 53,
            "posY": 243,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 92,
            "posY": 169,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 154,
            "posY": 286,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 167,
            "posY": 267,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 221,
            "posY": 257,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 208,
            "posY": 238,
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
          "Geodes",
          "RadioactiveCrust"
        ],
        "biomePaths": "Swamp:87,99 79,83 70,83 60,99 65,105 82,106;99,98 105,91 100,77 87,74 79,83 87,99;87,74 85,62 73,57 61,66 61,72 70,83 79,83;86,120 82,106 65,105 61,118 75,130;106,114 99,98 87,99 82,106 86,120 99,122;70,83 61,72 45,81 49,96 60,99;40,115 40,105 24,96 14,106 23,123;61,118 65,105 60,99 49,96 40,105 40,115 50,123;75,134 75,130 61,118 50,123 48,135 67,143\nRust:112,65 112,62 96,52 85,62 87,74 100,77;125,77 112,65 100,77 105,91 119,91;124,99 119,91 105,91 99,98 106,114 118,114;138,120 144,109 137,99 124,99 118,114 123,121;160,109 160,86 144,87 137,99 144,109;145,133 138,120 123,121 119,139 138,142;49,96 45,81 39,79 23,88 24,96 40,105;39,79 34,63 22,60 15,81 23,88;21,129 23,123 14,106 0,106 0,130\nForest:136,74 141,64 137,56 121,52 112,62 112,65 125,77;119,139 123,121 118,114 106,114 99,122 102,135 118,140;61,72 61,66 47,53 34,63 39,79 45,81;144,87 136,74 125,77 119,91 124,99 137,99;102,135 99,122 86,120 75,130 75,134 92,145;24,96 23,88 15,81 0,82 0,106 14,106;48,135 50,123 40,115 23,123 21,129 24,134 43,140\nFrozenWastes:121,52 119,40 106,34 96,42 96,52 112,62;96,52 96,42 82,35 71,43 73,57 85,62;160,41 145,42 137,56 141,64 160,65;47,53 47,47 36,37 24,39 21,59 22,60 34,63;24,39 20,35 0,38 0,57 21,59;107,162 92,152 83,161 83,176 107,176;134,164 116,155 107,162 107,176 134,176;83,161 66,154 60,159 60,176 83,176\nBoggyMarsh:145,42 134,28 119,40 121,52 137,56;73,57 71,43 61,39 47,47 47,53 61,66;160,86 160,65 141,64 136,74 144,87;160,109 144,109 138,120 145,133 160,133;15,81 22,60 21,59 0,57 0,82\nRadioactive:116,155 118,140 102,135 92,145 92,152 107,162;142,155 138,142 119,139 118,140 116,155 134,164;160,157 142,155 134,164 134,176 160,176;160,133 145,133 138,142 142,155 160,157;24,134 21,129 0,130 0,151 18,152;66,154 67,143 48,135 43,140 43,154 60,159;92,152 92,145 75,134 67,143 66,154 83,161;19,154 18,152 0,151 0,176 16,176;38,158 19,154 16,176 38,176;43,154 43,140 24,134 18,152 19,154 38,158;60,159 43,154 38,158 38,176 60,176",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 36,
            "posY": 46
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 72,
            "posY": 135
          },
          {
            "id": "WarpConduitSender",
            "posX": 19,
            "posY": 104
          },
          {
            "id": "WarpReceiver",
            "posX": 84,
            "posY": 99
          },
          {
            "id": "WarpPortal",
            "posX": 62,
            "posY": 99
          },
          {
            "id": "GeneShuffler",
            "posX": 78,
            "posY": 44
          },
          {
            "id": "GeneShuffler",
            "posX": 109,
            "posY": 108
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 27,
            "posY": 160,
            "emitRate": 674.79675,
            "idleTime": 375.08905,
            "eruptionTime": 275.2472,
            "dormancyCycles": 46.233368,
            "activeCycles": 74.65015
          },
          {
            "id": "liquid_co2",
            "posX": 137,
            "posY": 151,
            "emitRate": 459.37128,
            "idleTime": 323.18146,
            "eruptionTime": 296.1582,
            "dormancyCycles": 63.86355,
            "activeCycles": 88.3186
          },
          {
            "id": "slush_salt_water",
            "posX": 35,
            "posY": 60,
            "emitRate": 4270.035,
            "idleTime": 232.31871,
            "eruptionTime": 302.7355,
            "dormancyCycles": 51.587234,
            "activeCycles": 72.75567
          },
          {
            "id": "slush_water",
            "posX": 99,
            "posY": 44,
            "emitRate": 4174.8604,
            "idleTime": 332.44104,
            "eruptionTime": 391.3075,
            "dormancyCycles": 51.6022,
            "activeCycles": 77.769775
          },
          {
            "id": "steam",
            "posX": 148,
            "posY": 121,
            "emitRate": 7463.0474,
            "idleTime": 418.32596,
            "eruptionTime": 212.02925,
            "dormancyCycles": 44.27626,
            "activeCycles": 86.69945
          },
          {
            "id": "liquid_co2",
            "posX": 12,
            "posY": 147,
            "emitRate": 455.8956,
            "idleTime": 132.28728,
            "eruptionTime": 207.07607,
            "dormancyCycles": 19.793053,
            "activeCycles": 34.041443
          },
          {
            "id": "slimy_po2",
            "posX": 125,
            "posY": 71,
            "emitRate": 259.66785,
            "idleTime": 184.99258,
            "eruptionTime": 417.2455,
            "dormancyCycles": 56.54451,
            "activeCycles": 58.344303
          },
          {
            "id": "molten_cobalt",
            "posX": 26,
            "posY": 139,
            "emitRate": 9816.114,
            "idleTime": 742.3627,
            "eruptionTime": 38.69975,
            "dormancyCycles": 52.794872,
            "activeCycles": 86.81325
          },
          {
            "id": "hot_water",
            "posX": 142,
            "posY": 101,
            "emitRate": 8755.267,
            "idleTime": 254.42227,
            "eruptionTime": 417.94925,
            "dormancyCycles": 58.380222,
            "activeCycles": 71.79065
          },
          {
            "id": "molten_iron",
            "posX": 39,
            "posY": 121,
            "emitRate": 7007.509,
            "idleTime": 742.3848,
            "eruptionTime": 58.05818,
            "dormancyCycles": 42.72132,
            "activeCycles": 70.07594
          },
          {
            "id": "salt_water",
            "posX": 70,
            "posY": 145,
            "emitRate": 7994.7246,
            "idleTime": 273.55948,
            "eruptionTime": 383.93094,
            "dormancyCycles": 52.577602,
            "activeCycles": 97.28894
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
          "DistressSignal"
        ],
        "biomePaths": "FrozenWastes:56,42 45,34 35,47 37,53 47,55;37,53 35,47 23,41 21,41 15,54 20,62 30,63;52,64 47,55 37,53 30,63 36,73 45,73;45,34 45,32 32,26 23,41 35,47;64,106 64,84 51,84 46,92 53,106;64,84 64,65 52,64 45,73 51,84;46,92 51,84 45,73 36,73 30,82 36,93;30,82 36,73 30,63 20,62 14,72 20,82;20,62 15,54 0,54 0,72 14,72;64,42 56,42 47,55 52,64 64,65;14,91 20,82 14,72 0,72 0,91;21,41 14,35 0,37 0,54 15,54;32,100 36,93 30,82 20,82 14,91 19,101;19,101 14,91 0,91 0,108 15,109;64,106 53,106 47,112 51,128 64,128;53,106 46,92 36,93 32,100 37,111 47,112;47,112 37,111 31,118 32,128 51,128;37,111 32,100 19,101 15,109 16,112 31,118;16,112 15,109 0,108 0,128 11,128;31,118 16,112 11,128 32,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 24,
            "posY": 49
          },
          {
            "id": "GravitasPedestal",
            "posX": 43,
            "posY": 100
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 37,
            "posY": 116,
            "emitRate": 11799.214,
            "idleTime": 780.12537,
            "eruptionTime": 38.808937,
            "dormancyCycles": 38.07158,
            "activeCycles": 65.39295
          },
          {
            "id": "molten_iron",
            "posX": 19,
            "posY": 95,
            "emitRate": 9657.147,
            "idleTime": 752.5894,
            "eruptionTime": 40.737896,
            "dormancyCycles": 74.1952,
            "activeCycles": 80.06445
          },
          {
            "id": "molten_iron",
            "posX": 52,
            "posY": 113,
            "emitRate": 7222.8286,
            "idleTime": 884.191,
            "eruptionTime": 62.45302,
            "dormancyCycles": 26.912394,
            "activeCycles": 51.70347
          },
          {
            "id": "molten_iron",
            "posX": 29,
            "posY": 72,
            "emitRate": 9782.533,
            "idleTime": 686.404,
            "eruptionTime": 38.832695,
            "dormancyCycles": 44.589386,
            "activeCycles": 116.31314
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
        "biomePaths": "BoggyMarsh:49,49 45,36 34,36 29,51 35,54;64,47 64,31 49,31 45,36 49,49 50,49;29,51 34,36 28,30 24,30 16,42 17,49 21,52;64,79 64,68 52,64 40,71 48,82;38,71 35,54 29,51 21,52 19,65 35,72;24,30 15,24 0,33 16,42;19,65 21,52 17,49 0,54 0,64 16,68;14,81 16,68 0,64 0,82;17,49 16,42 0,33 0,33 0,54\nToxicJungle:52,64 50,49 49,49 35,54 38,71 40,71;64,47 50,49 52,64 64,68;30,82 35,72 19,65 16,68 14,81 17,83\nMagmaCore:48,82 40,71 38,71 35,72 30,82 35,96 45,96;64,79 48,82 45,96 64,96;30,82 17,83 16,96 35,96;17,83 14,81 0,82 0,96 16,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 45,
            "posY": 49
          },
          {
            "id": "GravitasPedestal",
            "posX": 31,
            "posY": 49
          },
          {
            "id": "SapTree",
            "posX": 38,
            "posY": 49
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 23,
            "posY": 91,
            "emitRate": 10042.602,
            "idleTime": 770.6954,
            "eruptionTime": 44.287514,
            "dormancyCycles": 38.517677,
            "activeCycles": 85.11224
          },
          {
            "id": "molten_tungsten",
            "posX": 37,
            "posY": 90,
            "emitRate": 7435.9126,
            "idleTime": 606.7856,
            "eruptionTime": 45.65906,
            "dormancyCycles": 50.97519,
            "activeCycles": 86.595894
          },
          {
            "id": "molten_tungsten",
            "posX": 51,
            "posY": 91,
            "emitRate": 6516.286,
            "idleTime": 813.82825,
            "eruptionTime": 67.11645,
            "dormancyCycles": 47.550083,
            "activeCycles": 74.50758
          },
          {
            "id": "methane",
            "posX": 41,
            "posY": 63,
            "emitRate": 384.30157,
            "idleTime": 226.4004,
            "eruptionTime": 229.51784,
            "dormancyCycles": 41.116997,
            "activeCycles": 69.66073
          },
          {
            "id": "hot_co2",
            "posX": 8,
            "posY": 47,
            "emitRate": 406.99036,
            "idleTime": 215.30084,
            "eruptionTime": 248.03229,
            "dormancyCycles": 70.23728,
            "activeCycles": 66.44284
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
        "biomePaths": "MagmaCore:48,48 49,33 44,30 33,32 30,45 41,53;30,45 33,32 23,24 13,36 20,48;12,76 20,63 16,56 0,56 0,77;41,60 41,53 30,45 20,48 16,56 20,63 31,66;20,48 13,36 0,35 0,56 16,56;48,79 49,67 41,60 31,66 32,78 42,84;32,78 31,66 20,63 12,76 21,85;21,85 12,76 0,77 0,96 20,96;64,63 49,67 48,79 64,84;64,32 49,33 48,48 64,51\nOilField:64,63 64,51 48,48 41,53 41,60 49,67;42,84 32,78 21,85 20,96 42,96;64,84 48,79 42,84 42,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 53,
            "posY": 58
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 50,
            "posY": 89,
            "emitRate": 241483.1,
            "idleTime": 8723.089,
            "eruptionTime": 73.749504,
            "dormancyCycles": 23.28697,
            "activeCycles": 27.163641
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
        "biomePaths": "Moo:78,51 81,47 77,37 66,34 58,44 63,55;45,42 43,35 34,29 22,34 21,44 23,48 40,49;83,64 78,51 63,55 61,59 74,73;61,59 63,55 58,44 45,42 40,49 43,61 54,64;96,46 81,47 78,51 83,64 96,65;21,61 23,48 21,44 0,46 0,59 18,63;43,61 40,49 23,48 21,61 35,67;21,44 22,34 15,27 0,30 0,46\nFrozenWastes:74,73 61,59 54,64 54,80 74,80;96,65 83,64 74,73 74,80 96,80;35,67 21,61 18,63 16,80 35,80;18,63 0,59 0,80 16,80;54,64 43,61 35,67 35,80 54,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 20,
            "posY": 36
          },
          {
            "id": "GravitasPedestal",
            "posX": 13,
            "posY": 36
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 51,
            "posY": 53,
            "emitRate": 281.6065,
            "idleTime": 184.8962,
            "eruptionTime": 393.66513,
            "dormancyCycles": 48.449898,
            "activeCycles": 75.65545
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
        "biomePaths": "Barren:80,82 80,65 64,63 58,71 59,83;58,85 59,83 58,71 42,66 37,71 36,77 49,88;64,63 61,53 45,51 43,54 42,66 58,71;80,101 80,82 59,83 58,85 65,102;60,108 65,102 58,85 49,88 42,100 45,108;80,44 67,43 61,53 64,63 80,65;45,51 45,38 33,34 23,42 23,50 43,54;42,66 43,54 23,50 21,52 21,63 37,71;67,43 62,36 49,34 45,38 45,51 61,53;43,113 45,108 42,100 31,96 20,104 24,117;80,121 80,101 65,102 60,108 66,121;47,127 43,113 24,117 23,119 26,131 44,132;31,96 29,83 18,81 12,87 18,102 20,104;36,77 37,71 21,63 14,69 18,81 29,83;23,50 23,42 14,33 0,36 0,50 21,52;21,63 21,52 0,50 0,68 14,69;80,121 66,121 61,128 65,141 80,142;66,121 60,108 45,108 43,113 47,127 61,128;18,81 14,69 0,68 0,87 12,87;22,138 26,131 23,119 0,122 0,132 18,139;23,119 24,117 20,104 18,102 0,107 0,122;61,157 59,149 45,145 37,153 50,174;23,163 12,154 0,156 0,174 22,174;50,174 37,153 36,153 23,163 22,174 50,174;18,102 12,87 0,87 0,107;80,163 61,157 50,174 50,174 80,174;49,88 36,77 29,83 31,96 42,100\nSwamp:65,141 61,128 47,127 44,132 45,145 59,149;45,145 44,132 26,131 22,138 36,153 37,153;36,153 22,138 18,139 12,154 23,163;80,142 65,141 59,149 61,157 80,163;12,154 18,139 0,132 0,156",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 37,
            "posY": 149
          },
          {
            "id": "GravitasPedestal",
            "posX": 39,
            "posY": 149
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "posX": 52,
            "posY": 72,
            "emitRate": 13243.14,
            "idleTime": 330.97928,
            "eruptionTime": 245.58572,
            "dormancyCycles": 43.470898,
            "activeCycles": 49.116974
          },
          {
            "id": "salt_water",
            "posX": 13,
            "posY": 77,
            "emitRate": 11432.082,
            "idleTime": 305.85135,
            "eruptionTime": 302.9418,
            "dormancyCycles": 61.97836,
            "activeCycles": 79.6521
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
        "biomePaths": "Sandstone:49,77 57,67 55,58 41,54 36,59 36,73 46,77\nBarren:36,73 36,59 21,56 16,61 19,75 28,77;78,60 75,53 61,51 55,58 57,67 73,72;96,76 96,61 78,60 73,72 74,75 80,79;19,75 16,61 0,60 0,78 14,79\nFrozenWastes:74,75 73,72 57,67 49,77 62,87;46,77 36,73 28,77 31,96 41,96;80,79 74,75 62,87 62,96 81,96;62,87 49,77 46,77 41,96 62,96;14,79 0,78 0,96 15,96;96,76 80,79 81,96 96,96;28,77 19,75 14,79 15,96 31,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 22,
            "posY": 77
          },
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 77
          },
          {
            "id": "GeneShuffler",
            "posX": 24,
            "posY": 71
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 57,
            "posY": 79,
            "emitRate": 2948.0564,
            "idleTime": 247.61417,
            "eruptionTime": 192.11447,
            "dormancyCycles": 63.458485,
            "activeCycles": 65.19081
          },
          {
            "id": "steam",
            "posX": 37,
            "posY": 80,
            "emitRate": 4923.124,
            "idleTime": 446.03778,
            "eruptionTime": 496.59668,
            "dormancyCycles": 32.39175,
            "activeCycles": 50.641464
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
        "q": -2,
        "r": -1
      },
      {
        "id": "TundraMoonlet",
        "q": -4,
        "r": 5
      },
      {
        "id": "MarshyMoonlet",
        "q": 4,
        "r": 1
      },
      {
        "id": "NiobiumMoonlet",
        "q": 3,
        "r": -6
      },
      {
        "id": "MooMoonlet",
        "q": -5,
        "r": -2
      },
      {
        "id": "WaterMoonlet",
        "q": 0,
        "r": 6
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 8,
        "r": -7
      },
      {
        "id": "TemporalTear",
        "q": -6,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 3,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 7,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 11,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 10,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 10,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 4,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 5,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -11,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -10,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -6,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -6,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 0,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 1,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 9,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -5,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 0,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 9,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 9,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 8,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 5,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -8,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -8,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -2,
        "r": -9
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation1",
        "q": 0,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 11,
        "r": -8
      }
    ]
  },
  {
    "coordinate": "SNDST-C-2089056124-0-0-0",
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
        "biomePaths": "Sandstone:102,173 106,158 102,147 79,132 55,144 50,155 54,173 69,186 85,186;95,116 88,99 74,98 63,113 79,130;130,182 135,172 129,159 106,158 102,173 114,185;54,173 50,155 29,155 23,168 28,178 42,182;60,206 69,186 54,173 42,182 46,200 60,206\nFrozenWastes:160,88 145,88 132,106 140,118 160,119;145,88 131,73 124,73 113,91 120,104 132,106;97,89 92,73 78,68 65,81 74,98 88,99\nWasteland:160,119 140,118 131,135 136,146 160,147;120,104 113,91 97,89 88,99 95,116 107,119;29,155 23,140 0,141 0,167 23,168;21,113 30,99 20,84 0,85 0,113;124,73 108,59 92,73 97,89 113,91;28,220 30,210 17,196 0,196 0,222 22,224;110,226 114,211 107,203 92,202 84,213 86,225 98,232;141,224 133,209 114,211 110,226 129,240\nBarren:160,88 160,54 142,55 131,73 145,88;131,73 142,55 128,37 108,52 108,59 124,73;78,68 74,52 64,47 52,52 46,70 54,80 65,81;108,59 108,52 93,39 74,52 78,68 92,73;46,70 52,52 32,37 18,54 28,71;20,84 28,71 18,54 0,52 0,85;98,248 98,232 86,225 71,236 71,248 83,256;129,244 129,240 110,226 98,232 98,248 111,256;43,248 46,230 28,220 22,224 22,249 27,253;160,248 160,225 141,224 129,240 129,244 136,250;22,249 22,224 0,222 0,251;71,248 71,236 56,226 46,230 43,248 55,257\nToxicJungle:140,118 132,106 120,104 107,119 113,132 131,135;46,128 55,113 43,99 30,99 21,113 30,128;43,99 54,80 46,70 28,71 20,84 30,99;79,132 79,130 63,113 55,113 46,128 55,144;160,197 138,198 133,209 141,224 160,225;160,197 160,172 135,172 130,182 138,198;133,209 138,198 130,182 114,185 107,203 114,211;46,200 42,182 28,178 17,196 30,210;92,202 85,186 69,186 60,206 84,213;86,225 84,213 60,206 60,206 56,226 71,236\nBoggyMarsh:136,146 131,135 113,132 102,147 106,158 129,159;160,172 160,147 136,146 129,159 135,172;113,132 107,119 95,116 79,130 79,132 102,147;63,113 74,98 65,81 54,80 43,99 55,113;50,155 55,144 46,128 30,128 23,140 29,155;23,140 30,128 21,113 0,113 0,141;17,196 28,178 23,168 0,167 0,196;114,185 102,173 85,186 92,202 107,203;56,226 60,206 46,200 30,210 28,220 46,230\nMagmaCore:111,256 98,248 83,256 83,274 112,274;83,256 71,248 55,257 55,274 83,274;160,248 136,250 136,274 160,274;55,257 43,248 27,253 27,274 55,274;27,253 22,249 0,251 0,274 27,274;136,250 129,244 111,256 112,274 136,274",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 75,
            "posY": 160
          },
          {
            "id": "WarpConduitSender",
            "posX": 71,
            "posY": 208
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 35,
            "posY": 151
          },
          {
            "id": "GravitasPedestal",
            "posX": 67,
            "posY": 86
          },
          {
            "id": "WarpPortal",
            "posX": 60,
            "posY": 107
          },
          {
            "id": "WarpReceiver",
            "posX": 61,
            "posY": 113
          },
          {
            "id": "GeneShuffler",
            "posX": 86,
            "posY": 136
          },
          {
            "id": "GeneShuffler",
            "posX": 115,
            "posY": 204
          },
          {
            "id": "GeneShuffler",
            "posX": 135,
            "posY": 81
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 37,
            "posY": 195,
            "emitRate": 4806.9336,
            "idleTime": 223.81796,
            "eruptionTime": 236.61444,
            "dormancyCycles": 40.106792,
            "activeCycles": 69.982994
          },
          {
            "id": "slush_water",
            "posX": 86,
            "posY": 85,
            "emitRate": 4529.207,
            "idleTime": 330.33835,
            "eruptionTime": 409.40628,
            "dormancyCycles": 41.41761,
            "activeCycles": 63.24507
          },
          {
            "id": "slush_salt_water",
            "posX": 125,
            "posY": 102,
            "emitRate": 5560.286,
            "idleTime": 346.67126,
            "eruptionTime": 169.75513,
            "dormancyCycles": 67.07417,
            "activeCycles": 98.676544
          },
          {
            "id": "methane",
            "posX": 15,
            "posY": 136,
            "emitRate": 391.93198,
            "idleTime": 153.53693,
            "eruptionTime": 140.11948,
            "dormancyCycles": 40.905987,
            "activeCycles": 59.7157
          },
          {
            "id": "small_volcano",
            "posX": 147,
            "posY": 245,
            "emitRate": 143440.39,
            "idleTime": 9552.383,
            "eruptionTime": 72.0469,
            "dormancyCycles": 30.458702,
            "activeCycles": 57.48889
          },
          {
            "id": "small_volcano",
            "posX": 16,
            "posY": 232,
            "emitRate": 158188.02,
            "idleTime": 8112.29,
            "eruptionTime": 46.54994,
            "dormancyCycles": 63.916283,
            "activeCycles": 99.12223
          },
          {
            "id": "small_volcano",
            "posX": 39,
            "posY": 238,
            "emitRate": 96145.92,
            "idleTime": 8044.6973,
            "eruptionTime": 67.97233,
            "dormancyCycles": 55.99453,
            "activeCycles": 71.52815
          },
          {
            "id": "hot_po2",
            "posX": 145,
            "posY": 94,
            "emitRate": 334.88388,
            "idleTime": 276.63483,
            "eruptionTime": 322.5963,
            "dormancyCycles": 75.717804,
            "activeCycles": 85.303314
          },
          {
            "id": "steam",
            "posX": 19,
            "posY": 105,
            "emitRate": 3367.3306,
            "idleTime": 193.22029,
            "eruptionTime": 330.7347,
            "dormancyCycles": 59.183002,
            "activeCycles": 76.59269
          },
          {
            "id": "chlorine_gas",
            "posX": 60,
            "posY": 222,
            "emitRate": 294.42136,
            "idleTime": 479.94522,
            "eruptionTime": 649.38226,
            "dormancyCycles": 37.35801,
            "activeCycles": 83.329025
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
          "BouldersMedium"
        ],
        "biomePaths": "Forest:89,76 85,66 73,61 68,63 63,75 70,86 81,86;110,66 103,52 98,52 85,66 89,76 102,78;98,52 84,39 77,42 73,61 85,66;44,68 47,53 40,48 22,60 22,68 22,68;22,68 22,60 11,48 0,48 0,70;128,46 109,45 103,52 110,66 128,67\nMetallic:104,98 108,91 102,78 89,76 81,86 89,101;70,86 63,75 50,76 44,93 45,95 61,98;128,90 108,91 104,98 111,112 128,112;20,112 18,94 0,92 0,115;111,112 104,98 89,101 86,109 98,126 101,126;24,130 25,116 20,112 0,115 0,131 20,134\nRadioactive:65,111 61,98 45,95 40,112 49,121;98,126 86,109 72,114 73,131 85,135;128,132 128,112 111,112 101,126 108,133;108,133 101,126 98,126 85,135 87,153 105,153;49,129 49,121 40,112 25,116 24,130 42,135;85,135 73,131 64,138 63,153 87,153;128,132 108,133 105,153 128,153;73,131 72,114 65,111 49,121 49,129 64,138;42,135 24,130 20,134 20,153 42,153;20,134 0,131 0,153 20,153;64,138 49,129 42,135 42,153 63,153\nOcean:86,109 89,101 81,86 70,86 61,98 65,111 72,114;40,112 45,95 44,93 24,89 18,94 20,112 25,116;50,76 44,68 22,68 24,89 44,93;24,89 22,68 22,68 0,70 0,92 18,94;128,90 128,67 110,66 102,78 108,91",
        "pointsOfInterest": [
          {
            "id": "PropSurfaceSatellite3",
            "posX": 52,
            "posY": 82
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 38,
            "posY": 95,
            "emitRate": 13361.813,
            "idleTime": 499.47214,
            "eruptionTime": 295.47232,
            "dormancyCycles": 29.70986,
            "activeCycles": 59.092995
          },
          {
            "id": "liquid_co2",
            "posX": 67,
            "posY": 140,
            "emitRate": 324.1662,
            "idleTime": 151.7631,
            "eruptionTime": 326.75134,
            "dormancyCycles": 52.227448,
            "activeCycles": 85.66823
          },
          {
            "id": "liquid_co2",
            "posX": 69,
            "posY": 120,
            "emitRate": 568.7464,
            "idleTime": 362.68356,
            "eruptionTime": 296.5541,
            "dormancyCycles": 45.406628,
            "activeCycles": 71.54582
          },
          {
            "id": "molten_aluminum",
            "posX": 90,
            "posY": 83,
            "emitRate": 7928.2417,
            "idleTime": 759.1026,
            "eruptionTime": 57.908497,
            "dormancyCycles": 51.788418,
            "activeCycles": 92.36731
          },
          {
            "id": "molten_gold",
            "posX": 103,
            "posY": 108,
            "emitRate": 8950.563,
            "idleTime": 656.455,
            "eruptionTime": 40.110035,
            "dormancyCycles": 42.797836,
            "activeCycles": 59.185825
          },
          {
            "id": "molten_aluminum",
            "posX": 16,
            "posY": 99,
            "emitRate": 7070.8984,
            "idleTime": 673.1067,
            "eruptionTime": 57.512928,
            "dormancyCycles": 59.054146,
            "activeCycles": 69.328415
          },
          {
            "id": "molten_gold",
            "posX": 96,
            "posY": 96,
            "emitRate": 5761.2495,
            "idleTime": 739.598,
            "eruptionTime": 65.598145,
            "dormancyCycles": 41.634842,
            "activeCycles": 66.595985
          },
          {
            "id": "methane",
            "posX": 54,
            "posY": 102,
            "emitRate": 334.58423,
            "idleTime": 320.92004,
            "eruptionTime": 293.40326,
            "dormancyCycles": 19.429752,
            "activeCycles": 43.588646
          },
          {
            "id": "small_volcano",
            "posX": 70,
            "posY": 105,
            "emitRate": 156908.89,
            "idleTime": 8636.262,
            "eruptionTime": 65.308334,
            "dormancyCycles": 51.891346,
            "activeCycles": 95.65795
          },
          {
            "id": "molten_copper",
            "posX": 109,
            "posY": 57,
            "emitRate": 9257.449,
            "idleTime": 832.96826,
            "eruptionTime": 46.59374,
            "dormancyCycles": 55.15399,
            "activeCycles": 60.70894
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
          "MetalPoor",
          "FrozenCore"
        ],
        "biomePaths": "Swamp:67,76 67,68 55,59 43,64 41,74 55,85;93,70 82,56 67,68 67,76 82,85;55,59 57,44 43,38 30,51 43,64;82,56 82,51 62,42 57,44 55,59 67,68;41,74 43,64 30,51 27,51 18,62 22,77 28,81;82,87 82,85 67,76 55,85 54,95 73,102;54,95 55,85 41,74 28,81 29,94 49,99\nRust:104,69 107,66 106,45 106,45 85,47 82,51 82,56 93,70;128,66 107,66 104,69 109,87 128,89;128,46 106,45 107,66 128,66;109,87 104,69 93,70 82,85 82,87 101,97;29,94 28,81 22,77 0,86 0,93 24,101;22,77 18,62 0,60 0,86\nFrozenWastes:27,51 18,40 0,41 0,60 18,62;48,112 49,99 29,94 24,101 24,111 39,118;128,107 128,89 109,87 101,97 101,103 109,110;101,103 101,97 82,87 73,102 75,109 86,114;49,138 38,131 25,138 26,153 50,153;25,138 19,134 0,139 0,153 26,153;72,135 63,128 49,138 50,153 71,153;128,130 110,131 109,153 128,153;90,131 90,130 72,135 71,153 93,153;110,131 108,129 90,131 93,153 109,153;24,111 24,101 0,93 0,115 17,117\nOilField:38,131 39,118 24,111 17,117 19,134 25,138;75,109 73,102 54,95 49,99 48,112 63,122;108,129 109,110 101,103 86,114 90,130 90,131;128,130 128,107 109,110 108,129 110,131;19,134 17,117 0,115 0,139;90,130 86,114 75,109 63,122 63,128 72,135;63,128 63,122 48,112 39,118 38,131 49,138",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 87,
            "posY": 98
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 89,
            "posY": 72
          },
          {
            "id": "WarpConduitSender",
            "posX": 24,
            "posY": 79
          },
          {
            "id": "WarpReceiver",
            "posX": 65,
            "posY": 75
          },
          {
            "id": "WarpPortal",
            "posX": 43,
            "posY": 75
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 113,
            "posY": 138,
            "emitRate": 4762.662,
            "idleTime": 309.63513,
            "eruptionTime": 266.20172,
            "dormancyCycles": 72.35067,
            "activeCycles": 64.99873
          },
          {
            "id": "OilWell",
            "posX": 110,
            "posY": 122,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 91,
            "posY": 126,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 12,
            "posY": 125,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 57,
            "posY": 101,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 61,
            "posY": 117,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "liquid_sulfur",
            "posX": 103,
            "posY": 81,
            "emitRate": 6257.6387,
            "idleTime": 286.4585,
            "eruptionTime": 202.22806,
            "dormancyCycles": 61.29093,
            "activeCycles": 78.54053
          },
          {
            "id": "hot_hydrogen",
            "posX": 117,
            "posY": 56,
            "emitRate": 288.51984,
            "idleTime": 335.56403,
            "eruptionTime": 326.59973,
            "dormancyCycles": 24.184204,
            "activeCycles": 46.25336
          },
          {
            "id": "hot_co2",
            "posX": 116,
            "posY": 70,
            "emitRate": 204.15324,
            "idleTime": 106.86106,
            "eruptionTime": 402.1698,
            "dormancyCycles": 73.156746,
            "activeCycles": 78.375824
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
        "biomePaths": "FrozenWastes:64,42 64,28 42,29 41,35 47,45;45,54 47,45 41,35 25,41 32,57;64,62 64,42 47,45 45,54 51,63;45,74 51,63 45,54 32,57 28,63 35,74;28,63 32,57 25,41 22,40 9,53 19,64;64,62 51,63 45,74 51,82 64,83;28,86 35,74 28,63 19,64 13,74 23,87;64,83 51,82 43,96 43,97 64,102;51,82 45,74 35,74 28,86 43,96;19,94 23,87 13,74 0,76 0,94;22,40 18,33 0,32 0,53 9,53;20,111 22,108 19,94 0,94 0,112;39,107 43,97 43,96 28,86 23,87 19,94 22,108;13,74 19,64 9,53 0,53 0,76;64,114 64,102 43,97 39,107 43,115\nForest:20,111 0,112 0,128 22,128;43,115 39,107 22,108 20,111 22,128 40,128;64,114 43,115 40,128 64,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 51,
            "posY": 44
          },
          {
            "id": "GravitasPedestal",
            "posX": 23,
            "posY": 118
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 17,
            "posY": 88,
            "emitRate": 7669.289,
            "idleTime": 582.97723,
            "eruptionTime": 37.39349,
            "dormancyCycles": 56.422623,
            "activeCycles": 95.96944
          },
          {
            "id": "molten_iron",
            "posX": 52,
            "posY": 111,
            "emitRate": 6241.351,
            "idleTime": 728.60297,
            "eruptionTime": 63.0277,
            "dormancyCycles": 54.832813,
            "activeCycles": 63.513424
          },
          {
            "id": "molten_iron",
            "posX": 48,
            "posY": 74,
            "emitRate": 15745.159,
            "idleTime": 698.87946,
            "eruptionTime": 24.108353,
            "dormancyCycles": 62.62794,
            "activeCycles": 58.683712
          },
          {
            "id": "molten_iron",
            "posX": 9,
            "posY": 62,
            "emitRate": 11018.063,
            "idleTime": 707.72784,
            "eruptionTime": 34.489037,
            "dormancyCycles": 47.592163,
            "activeCycles": 90.02957
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
          "SubsurfaceOcean"
        ],
        "biomePaths": "BoggyMarsh:45,49 49,41 45,34 32,32 26,44 33,51;64,79 64,62 52,61 41,73 42,77 44,79;17,78 19,67 11,59 0,60 0,80\nOcean:64,40 49,41 45,49 52,61 64,62;30,64 33,51 26,44 19,45 11,59 19,67;52,61 45,49 33,51 30,64 41,73;11,59 19,45 11,37 0,36 0,60\nToxicJungle:42,77 41,73 30,64 19,67 17,78 23,84\nMagmaCore:23,84 17,78 0,80 0,96 22,96;64,79 44,79 44,96 64,96;44,79 42,77 23,84 22,96 44,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 44,
            "posY": 43
          },
          {
            "id": "GravitasPedestal",
            "posX": 30,
            "posY": 43
          },
          {
            "id": "SapTree",
            "posX": 37,
            "posY": 43
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 5,
            "posY": 56,
            "emitRate": 9257.449,
            "idleTime": 832.96826,
            "eruptionTime": 46.59374,
            "dormancyCycles": 55.15399,
            "activeCycles": 60.70894
          },
          {
            "id": "molten_tungsten",
            "posX": 46,
            "posY": 91,
            "emitRate": 8626.584,
            "idleTime": 761.7075,
            "eruptionTime": 47.40179,
            "dormancyCycles": 47.811207,
            "activeCycles": 87.18078
          },
          {
            "id": "molten_tungsten",
            "posX": 55,
            "posY": 89,
            "emitRate": 9776.883,
            "idleTime": 831.63257,
            "eruptionTime": 42.558514,
            "dormancyCycles": 73.845726,
            "activeCycles": 130.86983
          },
          {
            "id": "methane",
            "posX": 42,
            "posY": 66,
            "emitRate": 436.04034,
            "idleTime": 433.49695,
            "eruptionTime": 292.71722,
            "dormancyCycles": 40.26143,
            "activeCycles": 53.115955
          },
          {
            "id": "slimy_po2",
            "posX": 52,
            "posY": 67,
            "emitRate": 329.4154,
            "idleTime": 293.35233,
            "eruptionTime": 286.80557,
            "dormancyCycles": 32.252975,
            "activeCycles": 44.289017
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
        "biomePaths": "Moo:84,41 79,32 68,31 63,35 65,48 78,49;65,48 63,35 51,33 43,40 49,50 62,51;43,61 49,50 43,40 37,39 29,46 32,60 36,62;37,39 31,27 18,28 16,32 19,44 29,46;19,44 16,32 0,32 0,48 14,49;96,41 84,41 78,49 83,61 96,62;83,61 78,49 65,48 62,51 63,63 76,68;32,60 29,46 19,44 14,49 17,64 18,64;63,63 62,51 49,50 43,61 55,70;17,64 14,49 0,48 0,66\nFrozenWastes:96,62 83,61 76,68 77,80 96,80;76,68 63,63 55,70 54,80 77,80;36,62 32,60 18,64 19,80 35,80;55,70 43,61 36,62 35,80 54,80;18,64 17,64 0,66 0,80 19,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 55,
            "posY": 44
          },
          {
            "id": "GravitasPedestal",
            "posX": 48,
            "posY": 44
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 84,
            "posY": 54,
            "emitRate": 332.07983,
            "idleTime": 240.02177,
            "eruptionTime": 282.36462,
            "dormancyCycles": 50.73948,
            "activeCycles": 79.864845
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
        "biomePaths": "Barren:60,99 67,85 58,73 46,83 46,90 60,99;60,99 46,90 36,98 35,105 38,108 55,108;80,115 80,106 60,99 60,99 55,108 58,119 62,121;64,65 61,51 46,53 42,61 58,73;46,90 46,83 34,75 29,78 27,90 36,98;80,48 64,48 61,51 64,65 80,66;37,121 38,108 35,105 19,109 18,120 22,125;27,90 29,78 18,73 8,84 17,93;34,75 37,63 21,55 21,55 15,65 18,73 29,78;35,105 36,98 27,90 17,93 14,103 19,109;58,119 55,108 38,108 37,121 43,127;64,136 62,121 58,119 43,127 43,135 49,139;58,73 58,73 42,61 37,63 34,75 46,83;21,134 22,125 18,120 0,122 0,136 15,139;14,103 17,93 8,84 0,84 0,104;21,55 29,41 28,37 17,32 4,42 21,55;42,61 46,53 41,43 29,41 21,55 37,63;18,73 15,65 0,64 0,84 8,84;21,55 4,42 0,43 0,64 15,65;18,120 19,109 14,103 0,104 0,122;80,48 80,31 66,30 60,35 64,48;80,84 80,66 64,65 58,73 58,73 67,85;80,84 67,85 60,99 80,106;80,136 80,115 62,121 64,136 65,137;43,135 43,127 37,121 22,125 21,134 32,141;33,156 32,155 16,156 17,174 32,174;61,51 64,48 60,35 49,33 41,43 46,53;47,156 33,156 32,174 49,174;65,155 50,154 47,156 49,174 63,174;16,156 16,155 0,156 0,174 17,174;80,156 65,155 65,155 63,174 80,174\nSwamp:32,155 32,141 21,134 15,139 16,155 16,156;50,154 49,139 43,135 32,141 32,155 33,156 47,156;16,155 15,139 0,136 0,156;65,155 65,137 64,136 49,139 50,154 65,155;80,136 65,137 65,155 80,156",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 62,
            "posY": 152
          },
          {
            "id": "GravitasPedestal",
            "posX": 64,
            "posY": 152
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 25,
            "posY": 66,
            "emitRate": 10726.948,
            "idleTime": 305.0685,
            "eruptionTime": 368.7709,
            "dormancyCycles": 48.848755,
            "activeCycles": 75.84612
          },
          {
            "id": "slush_water",
            "posX": 55,
            "posY": 90,
            "emitRate": 3516.951,
            "idleTime": 220.34332,
            "eruptionTime": 363.7848,
            "dormancyCycles": 63.012325,
            "activeCycles": 82.57106
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
        "biomePaths": "MagmaCore:64,36 52,38 46,49 52,58 64,58;52,38 42,27 31,38 36,49 46,49;64,77 64,58 52,58 43,71 51,78;30,57 36,49 31,38 21,35 18,37 16,50 22,58;16,50 18,37 0,34 0,52;43,71 52,58 46,49 36,49 30,57 40,71;40,71 30,57 22,58 18,67 21,77 32,78;64,77 51,78 47,96 64,96;32,78 21,77 19,81 19,96 37,96;21,77 18,67 0,67 0,79 19,81\nOilField:51,78 43,71 40,71 32,78 37,96 47,96;18,67 22,58 16,50 0,52 0,67;19,81 0,79 0,96 19,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 15,
            "posY": 64
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 10,
            "posY": 83,
            "emitRate": 269034.16,
            "idleTime": 9197.758,
            "eruptionTime": 67.80435,
            "dormancyCycles": 43.931274,
            "activeCycles": 64.9883
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
          "FrozenCore"
        ],
        "biomePaths": "Barren:120,65 121,65 113,50 103,50 97,58 104,71;160,59 145,57 140,60 143,77 160,78;10,77 18,65 13,57 0,56 0,77;48,75 46,60 35,59 28,67 32,78 38,81;86,59 81,48 68,48 63,57 66,64 82,65;84,76 82,65 66,64 62,76 75,83\nSandstone:102,76 104,71 97,58 86,59 82,65 84,76 94,81;35,59 30,49 19,47 13,57 18,65 28,67;143,77 140,60 134,58 121,65 120,65 125,78 139,81;62,76 66,64 63,57 51,56 46,60 48,75 57,78;32,78 28,67 18,65 10,77 19,86\nFrozenWastes:160,78 143,77 139,81 140,96 160,96;139,81 125,78 116,89 116,96 140,96;125,78 120,65 104,71 102,76 116,89;94,81 84,76 75,83 75,96 93,96;116,89 102,76 94,81 93,96 116,96;75,83 62,76 57,78 56,96 75,96;57,78 48,75 38,81 40,96 56,96;38,81 32,78 19,86 19,96 40,96;19,86 10,77 0,77 0,96 19,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 68,
            "posY": 57
          },
          {
            "id": "GravitasPedestal",
            "posX": 72,
            "posY": 57
          },
          {
            "id": "GeneShuffler",
            "posX": 70,
            "posY": 51
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 109,
            "posY": 80,
            "emitRate": 1918.0837,
            "idleTime": 328.2174,
            "eruptionTime": 494.8438,
            "dormancyCycles": 39.90477,
            "activeCycles": 54.1413
          },
          {
            "id": "steam",
            "posX": 147,
            "posY": 87,
            "emitRate": 4903.9253,
            "idleTime": 132.08804,
            "eruptionTime": 130.76486,
            "dormancyCycles": 60.84494,
            "activeCycles": 82.35049
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
        "q": 1,
        "r": -3
      },
      {
        "id": "WarpOilySwamp",
        "q": 5,
        "r": -1
      },
      {
        "id": "TundraMoonlet",
        "q": 8,
        "r": -8
      },
      {
        "id": "MarshyMoonlet",
        "q": -3,
        "r": 7
      },
      {
        "id": "MooMoonlet",
        "q": -7,
        "r": 6
      },
      {
        "id": "WaterMoonlet",
        "q": -4,
        "r": -4
      },
      {
        "id": "NiobiumMoonlet",
        "q": 3,
        "r": -9
      },
      {
        "id": "RegolithMoonlet",
        "q": -10,
        "r": 4
      },
      {
        "id": "TemporalTear",
        "q": -2,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 2,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -5,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -9,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 6,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 5,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 6,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 11,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -1,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -5,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": 6,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 0,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 3,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -11,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": -10,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 7,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -5,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -6,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": 1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_MetallicAsteroidField",
        "q": -6,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -11,
        "r": 7
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -2,
        "r": 4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 8,
        "r": -2
      }
    ]
  },
  {
    "coordinate": "V-VOLCA-C-136398145-0-0-0",
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
          "Volcanoes",
          "BouldersLarge",
          "Geodes"
        ],
        "biomePaths": "Sandstone:134,196 143,186 144,168 138,155 118,147 98,157 94,166 95,185 106,197;38,290 25,273 0,274 0,303 29,304;95,185 94,166 69,166 71,189;94,166 98,157 91,146 70,147 68,165 69,166;118,147 118,135 99,130 91,146 98,157;136,209 134,196 106,197 105,210 119,219;148,140 127,129 118,135 118,147 138,155;167,164 144,168 143,186 170,188;167,164 169,160 149,140 148,140 138,155 144,168\nMagmaCore:29,349 0,346 0,380 31,380;33,324 35,321 29,304 0,303 0,328;36,342 33,324 0,328 0,346 29,349;50,316 52,299 40,290 38,290 29,304 35,321;40,290 48,264 34,260 25,273 38,290;71,189 69,166 68,165 38,170 35,175 40,190 67,195;58,347 36,342 29,349 31,380 58,380;67,340 67,330 50,316 35,321 33,324 36,342 58,347;87,242 86,221 70,214 55,227 66,250;87,351 67,340 58,347 58,380 85,380;119,357 101,345 87,351 85,380 119,380;101,101 88,88 83,89 75,110 93,115;137,345 133,329 106,328 101,345 119,357;150,351 137,345 119,357 119,380 152,380;165,342 164,329 141,317 133,329 137,345 150,351;180,351 165,342 150,351 152,380 179,380;178,314 176,305 155,296 141,312 141,317 164,329;210,352 200,343 180,351 179,380 209,380;189,287 172,269 154,281 155,296 176,305;203,212 207,202 199,187 173,191 173,211 182,218;207,144 188,143 181,154 203,167;240,345 210,352 209,380 240,380;240,297 213,301 209,319 240,329\nOcean:25,273 34,260 27,239 0,238 0,274;40,190 35,175 0,177 0,204 30,207;172,269 174,254 151,242 135,251 136,271 154,281;206,110 216,89 206,76 178,79 184,111;240,297 240,269 211,268 201,285 213,301;240,234 240,197 207,202 203,212 218,234;240,146 213,140 207,144 203,167 205,171 240,173\nFrozenWastes:38,225 30,207 0,204 0,238 27,239;35,175 38,170 31,144 0,144 0,177;77,290 80,282 62,259 48,264 40,290 52,299;155,296 154,281 136,271 117,284 117,295 141,312;149,99 153,85 137,68 115,82 115,96 128,107;177,118 184,111 178,79 176,78 153,85 149,99 166,118;240,197 240,173 205,171 199,187 207,202\nBoggyMarsh:31,144 36,137 29,110 28,109 0,114 0,144;70,214 67,195 40,190 30,207 38,225 55,227;105,210 106,197 95,185 71,189 67,195 70,214 86,221;117,295 117,284 101,273 80,282 77,290 90,312 98,314;120,242 119,219 105,210 86,221 87,242 102,251;149,140 166,118 149,99 128,107 127,129 148,140;201,285 211,268 204,253 183,249 174,254 172,269 189,287;213,140 217,125 206,110 184,111 177,118 188,143 207,144\nRadioactive:28,109 22,92 0,90 0,114;75,110 83,89 62,81 59,103 70,112;115,96 115,82 100,74 88,88 101,101;240,122 217,125 213,140 240,146\nBarren:33,75 27,59 0,56 0,90 22,92;66,59 41,39 27,59 33,75 61,79;88,88 100,74 97,60 82,51 66,59 61,79 62,81 83,89;137,68 138,60 119,43 97,60 100,74 115,82;176,78 174,58 157,46 138,60 137,68 153,85;206,76 212,59 199,40 174,58 176,78 178,79;240,89 240,55 212,59 206,76 216,89\nToxicJungle:62,259 66,250 55,227 38,225 27,239 34,260 48,264;91,146 99,130 93,115 75,110 70,112 62,136 70,147;101,273 102,251 87,242 66,250 62,259 80,282;151,242 153,220 136,209 119,219 120,242 135,251;183,249 182,218 173,211 153,220 151,242 174,254;181,154 188,143 177,118 166,118 149,140 169,160;240,122 240,89 216,89 206,110 217,125\nWasteland:68,165 70,147 62,136 36,137 31,144 38,170;62,136 70,112 59,103 29,110 36,137;59,103 62,81 61,79 33,75 22,92 28,109 29,110;136,271 135,251 120,242 102,251 101,273 117,284;127,129 128,107 115,96 101,101 93,115 99,130 118,135;173,211 173,191 170,188 143,186 134,196 136,209 153,220;218,234 203,212 182,218 183,249 204,253;199,187 205,171 203,167 181,154 169,160 167,164 170,188 173,191;240,234 218,234 204,253 211,268 240,269\nOilField:90,312 77,290 52,299 50,316 67,330;101,345 106,328 98,314 90,312 67,330 67,340 87,351;141,317 141,312 117,295 98,314 106,328 133,329;200,343 201,324 178,314 164,329 165,342 180,351;240,345 240,329 209,319 201,324 200,343 210,352;209,319 213,301 201,285 189,287 176,305 178,314 201,324",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 118,
            "posY": 172
          },
          {
            "id": "MassiveHeatSink",
            "posX": 119,
            "posY": 93
          },
          {
            "id": "MassiveHeatSink",
            "posX": 223,
            "posY": 183
          },
          {
            "id": "MassiveHeatSink",
            "posX": 18,
            "posY": 234
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 189,
            "posY": 105
          },
          {
            "id": "WarpConduitSender",
            "posX": 20,
            "posY": 151
          },
          {
            "id": "GravitasPedestal",
            "posX": 146,
            "posY": 123
          },
          {
            "id": "WarpReceiver",
            "posX": 108,
            "posY": 273
          },
          {
            "id": "WarpPortal",
            "posX": 107,
            "posY": 267
          },
          {
            "id": "GeneShuffler",
            "posX": 135,
            "posY": 226
          },
          {
            "id": "GeneShuffler",
            "posX": 105,
            "posY": 298
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 214,
            "posY": 340,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 114,
            "posY": 316,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 76,
            "posY": 318,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "salt_water",
            "posX": 154,
            "posY": 246,
            "emitRate": 11982.333,
            "idleTime": 348.97214,
            "eruptionTime": 259.47592,
            "dormancyCycles": 39.988472,
            "activeCycles": 72.444
          },
          {
            "id": "steam",
            "posX": 176,
            "posY": 240,
            "emitRate": 3882.389,
            "idleTime": 277.1742,
            "eruptionTime": 416.0782,
            "dormancyCycles": 45.21426,
            "activeCycles": 65.38203
          },
          {
            "id": "steam",
            "posX": 205,
            "posY": 127,
            "emitRate": 7306.715,
            "idleTime": 375.85608,
            "eruptionTime": 189.59875,
            "dormancyCycles": 52.021652,
            "activeCycles": 80.00225
          },
          {
            "id": "methane",
            "posX": 156,
            "posY": 225,
            "emitRate": 397.60202,
            "idleTime": 280.8683,
            "eruptionTime": 231.12624,
            "dormancyCycles": 47.272957,
            "activeCycles": 57.548553
          },
          {
            "id": "methane",
            "posX": 91,
            "posY": 210,
            "emitRate": 374.77948,
            "idleTime": 339.9222,
            "eruptionTime": 296.85574,
            "dormancyCycles": 49.72469,
            "activeCycles": 79.01139
          },
          {
            "id": "big_volcano",
            "posX": 40,
            "posY": 306,
            "emitRate": 271285.88,
            "idleTime": 8868.772,
            "eruptionTime": 68.909164,
            "dormancyCycles": 43.890015,
            "activeCycles": 56.01274
          },
          {
            "id": "big_volcano",
            "posX": 36,
            "posY": 274,
            "emitRate": 277479.34,
            "idleTime": 9320.138,
            "eruptionTime": 64.89692,
            "dormancyCycles": 32.593277,
            "activeCycles": 64.52978
          },
          {
            "id": "big_volcano",
            "posX": 87,
            "posY": 103,
            "emitRate": 262002.2,
            "idleTime": 9693.139,
            "eruptionTime": 71.0948,
            "dormancyCycles": 60.10768,
            "activeCycles": 67.59862
          },
          {
            "id": "big_volcano",
            "posX": 195,
            "posY": 153,
            "emitRate": 241724.81,
            "idleTime": 9745.802,
            "eruptionTime": 83.20545,
            "dormancyCycles": 71.00153,
            "activeCycles": 94.32695
          },
          {
            "id": "hot_hydrogen",
            "posX": 75,
            "posY": 328,
            "emitRate": 311.8573,
            "idleTime": 227.62263,
            "eruptionTime": 289.2604,
            "dormancyCycles": 82.481514,
            "activeCycles": 92.48514
          },
          {
            "id": "methane",
            "posX": 194,
            "posY": 305,
            "emitRate": 252.42621,
            "idleTime": 239.6965,
            "eruptionTime": 618.69305,
            "dormancyCycles": 47.84339,
            "activeCycles": 60.13693
          },
          {
            "id": "liquid_sulfur",
            "posX": 20,
            "posY": 184,
            "emitRate": 4607.9795,
            "idleTime": 190.40631,
            "eruptionTime": 372.326,
            "dormancyCycles": 74.76642,
            "activeCycles": 98.933174
          },
          {
            "id": "hot_po2",
            "posX": 178,
            "posY": 339,
            "emitRate": 734.54004,
            "idleTime": 390.50623,
            "eruptionTime": 123.94725,
            "dormancyCycles": 49.95723,
            "activeCycles": 81.17983
          },
          {
            "id": "steam",
            "posX": 55,
            "posY": 129,
            "emitRate": 2881.654,
            "idleTime": 287.23697,
            "eruptionTime": 439.56406,
            "dormancyCycles": 31.256708,
            "activeCycles": 66.437904
          },
          {
            "id": "hot_co2",
            "posX": 193,
            "posY": 291,
            "emitRate": 556.5437,
            "idleTime": 484.8374,
            "eruptionTime": 219.77113,
            "dormancyCycles": 34.64336,
            "activeCycles": 37.677322
          },
          {
            "id": "liquid_sulfur",
            "posX": 45,
            "posY": 253,
            "emitRate": 8192.42,
            "idleTime": 361.46985,
            "eruptionTime": 233.87459,
            "dormancyCycles": 52.97242,
            "activeCycles": 76.00428
          },
          {
            "id": "molten_gold",
            "posX": 20,
            "posY": 102,
            "emitRate": 10782.197,
            "idleTime": 732.76733,
            "eruptionTime": 38.805,
            "dormancyCycles": 52.049366,
            "activeCycles": 69.85535
          },
          {
            "id": "slimy_po2",
            "posX": 214,
            "posY": 218,
            "emitRate": 308.68387,
            "idleTime": 229.98834,
            "eruptionTime": 312.38275,
            "dormancyCycles": 35.369827,
            "activeCycles": 53.735928
          },
          {
            "id": "hot_water",
            "posX": 221,
            "posY": 134,
            "emitRate": 9554.079,
            "idleTime": 177.29482,
            "eruptionTime": 153.34138,
            "dormancyCycles": 48.824593,
            "activeCycles": 77.85707
          },
          {
            "id": "molten_aluminum",
            "posX": 143,
            "posY": 269,
            "emitRate": 9419.215,
            "idleTime": 743.7829,
            "eruptionTime": 45.664913,
            "dormancyCycles": 32.75525,
            "activeCycles": 47.574417
          },
          {
            "id": "steam",
            "posX": 172,
            "posY": 89,
            "emitRate": 3836.5664,
            "idleTime": 370.9548,
            "eruptionTime": 400.11984,
            "dormancyCycles": 48.39577,
            "activeCycles": 88.46077
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
          "Geodes",
          "DistressSignal"
        ],
        "biomePaths": "Swamp:75,100 65,85 50,95 55,111 69,113;119,121 114,109 96,112 92,121 96,129 115,131;89,98 93,92 89,79 79,75 65,85 65,85 75,100;96,112 89,98 75,100 69,113 73,121 92,121;55,111 50,95 43,93 27,107 27,110 46,121;69,134 73,121 69,113 55,111 46,121 46,127 60,136;65,85 65,85 53,68 45,68 37,81 43,93 50,95\nRust:136,98 137,96 135,83 117,77 116,78 111,91 117,102;141,76 138,59 136,57 122,61 117,77 135,83;140,135 137,120 119,121 115,131 117,138 134,143;79,75 76,60 64,56 53,68 65,85;111,91 116,78 99,70 89,79 93,92;137,120 140,115 136,98 117,102 114,109 119,121;45,68 39,59 22,60 17,70 23,80 37,81;46,127 46,121 27,110 20,117 23,136 35,137\nForest:99,70 98,59 87,52 76,60 79,75 89,79;114,109 117,102 111,91 93,92 89,98 96,112;117,77 122,61 111,51 98,59 99,70 116,78;43,93 37,81 23,80 16,94 27,107;92,140 96,129 92,121 73,121 69,134 78,143;16,94 23,80 17,70 0,70 0,95;27,110 27,107 16,94 0,95 0,116 20,117;23,136 20,117 0,116 0,137 20,139\nBoggyMarsh:160,115 160,95 137,96 136,98 140,115;136,57 135,42 119,36 112,42 111,51 122,61;87,52 86,41 73,35 61,45 64,56 76,60;160,55 138,59 141,76 160,78;160,115 140,115 137,120 140,135 160,137;17,70 22,60 16,46 0,45 0,70;39,59 42,44 25,36 16,46 22,60;160,95 160,78 141,76 135,83 137,96\nFrozenWastes:111,51 112,42 97,33 86,41 87,52 98,59;64,56 61,45 49,40 42,44 39,59 45,68 53,68;160,55 160,40 141,37 135,42 136,57 138,59;60,162 53,154 42,154 31,165 31,176 59,176;138,157 136,155 115,161 115,176 139,176\nRadioactive:136,155 134,143 117,138 109,154 115,161;160,155 160,137 140,135 134,143 136,155 138,157;117,138 115,131 96,129 92,140 101,153 109,154;160,155 138,157 139,176 160,176;115,161 109,154 101,153 88,167 89,176 115,176;101,153 92,140 78,143 76,156 88,167;76,156 78,143 69,134 60,136 53,154 60,162;60,136 46,127 35,137 42,154 53,154;19,156 20,139 0,137 0,163;42,154 35,137 23,136 20,139 19,156 31,165;88,167 76,156 60,162 59,176 89,176;31,165 19,156 0,163 0,176 31,176",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 145,
            "posY": 51
          },
          {
            "id": "WarpConduitSender",
            "posX": 51,
            "posY": 124
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 24,
            "posY": 91
          },
          {
            "id": "WarpReceiver",
            "posX": 71,
            "posY": 103
          },
          {
            "id": "WarpPortal",
            "posX": 49,
            "posY": 103
          },
          {
            "id": "GeneShuffler",
            "posX": 72,
            "posY": 68
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 32,
            "posY": 143,
            "emitRate": 495.139,
            "idleTime": 198.30948,
            "eruptionTime": 204.4444,
            "dormancyCycles": 48.64418,
            "activeCycles": 67.8478
          },
          {
            "id": "liquid_co2",
            "posX": 100,
            "posY": 159,
            "emitRate": 414.90845,
            "idleTime": 202.82513,
            "eruptionTime": 344.21753,
            "dormancyCycles": 42.29602,
            "activeCycles": 80.94391
          },
          {
            "id": "slush_salt_water",
            "posX": 42,
            "posY": 58,
            "emitRate": 3367.591,
            "idleTime": 299.61435,
            "eruptionTime": 616.2121,
            "dormancyCycles": 58.803635,
            "activeCycles": 76.57151
          },
          {
            "id": "slush_water",
            "posX": 100,
            "posY": 49,
            "emitRate": 3924.0178,
            "idleTime": 273.62274,
            "eruptionTime": 374.92657,
            "dormancyCycles": 69.36774,
            "activeCycles": 104.69866
          },
          {
            "id": "steam",
            "posX": 147,
            "posY": 102,
            "emitRate": 3836.5664,
            "idleTime": 370.9548,
            "eruptionTime": 400.11984,
            "dormancyCycles": 48.39577,
            "activeCycles": 88.46077
          },
          {
            "id": "slush_salt_water",
            "posX": 149,
            "posY": 62,
            "emitRate": 4411.097,
            "idleTime": 156.90158,
            "eruptionTime": 316.585,
            "dormancyCycles": 48.463333,
            "activeCycles": 85.80047
          },
          {
            "id": "molten_gold",
            "posX": 120,
            "posY": 135,
            "emitRate": 8386.9375,
            "idleTime": 684.44165,
            "eruptionTime": 45.2832,
            "dormancyCycles": 57.579643,
            "activeCycles": 98.11912
          },
          {
            "id": "molten_aluminum",
            "posX": 121,
            "posY": 118,
            "emitRate": 8781.83,
            "idleTime": 750.67914,
            "eruptionTime": 38.95124,
            "dormancyCycles": 48.183723,
            "activeCycles": 91.411285
          },
          {
            "id": "hot_water",
            "posX": 31,
            "posY": 108,
            "emitRate": 10742.411,
            "idleTime": 209.95718,
            "eruptionTime": 166.31586,
            "dormancyCycles": 49.35789,
            "activeCycles": 84.574554
          },
          {
            "id": "liquid_sulfur",
            "posX": 55,
            "posY": 138,
            "emitRate": 6371.508,
            "idleTime": 341.83386,
            "eruptionTime": 188.31657,
            "dormancyCycles": 62.056835,
            "activeCycles": 52.7429
          },
          {
            "id": "hot_po2",
            "posX": 104,
            "posY": 96,
            "emitRate": 327.25046,
            "idleTime": 105.314545,
            "eruptionTime": 133.38152,
            "dormancyCycles": 68.848564,
            "activeCycles": 76.55581
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
        "biomePaths": "FrozenWastes:56,44 46,35 37,37 31,47 39,58 43,59;64,45 56,44 43,59 48,66 64,67;39,58 31,47 20,47 14,60 21,69 26,70;43,83 48,66 43,59 39,58 26,70 35,83 42,84;11,83 21,69 14,60 0,60 0,83;35,83 26,70 21,69 11,83 22,95;20,47 14,38 0,38 0,60 14,60;64,67 48,66 43,83 64,84;40,107 45,98 42,84 35,83 22,95 22,97 34,107;34,107 22,97 11,107 22,125;64,84 43,83 42,84 45,98 64,100;64,112 64,100 45,98 40,107 45,115;45,115 40,107 34,107 22,125 22,128 44,128;22,97 22,95 11,83 0,83 0,107 11,107;22,125 11,107 0,107 0,128 22,128;64,112 45,115 44,128 64,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 24,
            "posY": 56
          },
          {
            "id": "GravitasPedestal",
            "posX": 51,
            "posY": 106
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 14,
            "posY": 75
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 42,
            "posY": 54
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 48,
            "posY": 81
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 26,
            "posY": 109,
            "emitRate": 10813.306,
            "idleTime": 743.01715,
            "eruptionTime": 40.76346,
            "dormancyCycles": 48.43094,
            "activeCycles": 83.34522
          },
          {
            "id": "molten_iron",
            "posX": 11,
            "posY": 113,
            "emitRate": 24829.12,
            "idleTime": 896.8242,
            "eruptionTime": 22.406279,
            "dormancyCycles": 58.588425,
            "activeCycles": 69.42801
          },
          {
            "id": "molten_iron",
            "posX": 17,
            "posY": 88,
            "emitRate": 7220.102,
            "idleTime": 584.47235,
            "eruptionTime": 39.523254,
            "dormancyCycles": 44.871304,
            "activeCycles": 52.95219
          },
          {
            "id": "molten_iron",
            "posX": 40,
            "posY": 115,
            "emitRate": 6049.632,
            "idleTime": 809.9256,
            "eruptionTime": 62.744225,
            "dormancyCycles": 47.113956,
            "activeCycles": 64.49261
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
        "biomePaths": "BoggyMarsh:42,51 40,37 31,35 24,48 33,55;59,44 47,32 40,37 42,51 48,53;14,54 18,49 11,35 0,35 0,54;52,63 48,53 42,51 33,55 32,65 47,69;24,48 31,35 27,30 17,29 11,35 18,49;48,80 47,69 32,65 30,67 29,81 46,83;64,44 64,23 48,28 47,32 59,44;17,65 14,54 0,54 0,73 10,74;29,81 30,67 17,65 10,74 15,81 28,82\nToxicJungle:64,64 52,63 47,69 48,80 64,81;32,65 33,55 24,48 18,49 14,54 17,65 30,67;64,44 59,44 48,53 52,63 64,64\nMagmaCore:28,82 15,81 9,96 29,96;46,83 29,81 28,82 29,96 46,96;15,81 10,74 0,73 0,96 9,96;64,81 48,80 46,83 46,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 40,
            "posY": 47
          },
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 47
          },
          {
            "id": "SapTree",
            "posX": 33,
            "posY": 47
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 35,
            "posY": 62,
            "emitRate": 6363.874,
            "idleTime": 760.79114,
            "eruptionTime": 62.635185,
            "dormancyCycles": 53.581924,
            "activeCycles": 69.49048
          },
          {
            "id": "molten_tungsten",
            "posX": 26,
            "posY": 91,
            "emitRate": 9171.481,
            "idleTime": 747.8988,
            "eruptionTime": 43.20116,
            "dormancyCycles": 54.58523,
            "activeCycles": 60.885715
          },
          {
            "id": "molten_tungsten",
            "posX": 39,
            "posY": 91,
            "emitRate": 8345.805,
            "idleTime": 710.5039,
            "eruptionTime": 43.02089,
            "dormancyCycles": 27.153559,
            "activeCycles": 67.13117
          },
          {
            "id": "methane",
            "posX": 28,
            "posY": 66,
            "emitRate": 423.2288,
            "idleTime": 341.01993,
            "eruptionTime": 251.0405,
            "dormancyCycles": 39.77895,
            "activeCycles": 52.784058
          },
          {
            "id": "methane",
            "posX": 52,
            "posY": 53,
            "emitRate": 564.57306,
            "idleTime": 345.8616,
            "eruptionTime": 192.4933,
            "dormancyCycles": 14.915975,
            "activeCycles": 47.49819
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
        "biomePaths": "MagmaCore:61,52 45,37 45,37 36,45 37,53 47,59;37,53 36,45 21,39 16,49 23,61 26,61;64,75 64,52 61,52 47,59 47,73 51,76;16,49 21,39 19,34 0,34 0,50;33,79 35,76 26,61 23,61 16,67 16,79 18,82;16,79 16,67 0,62 0,81;45,37 36,24 20,31 19,34 21,39 36,45\nOilField:47,73 47,59 37,53 26,61 35,76;23,61 16,49 0,50 0,62 16,67\nFrozenWastes:51,76 47,73 35,76 33,79 38,96 48,96;18,82 16,79 0,81 0,96 17,96;64,75 51,76 48,96 64,96;33,79 18,82 17,96 38,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 39,
            "posY": 61
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 13,
            "posY": 53,
            "emitRate": 270592.56,
            "idleTime": 7922.5684,
            "eruptionTime": 52.861324,
            "dormancyCycles": 28.567383,
            "activeCycles": 42.650158
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
        "biomePaths": "Moo:54,36 54,35 36,28 30,35 34,48 45,48;76,47 78,34 75,29 56,33 54,35 54,36 66,48;34,48 30,35 19,34 12,42 19,54 30,54;60,60 66,48 54,36 45,48 52,61;96,50 96,34 78,34 76,47 80,52;79,64 80,52 76,47 66,48 60,60 71,70;52,61 45,48 34,48 30,54 34,64 48,67;96,50 80,52 79,64 96,71;13,62 19,54 12,42 0,42 0,63\nFrozenWastes:71,70 60,60 52,61 48,67 49,80 70,80;96,71 79,64 71,70 70,80 96,80;48,67 34,64 23,79 23,80 49,80;23,79 13,62 0,63 0,80 23,80;34,64 30,54 19,54 13,62 23,79",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 42,
            "posY": 40
          },
          {
            "id": "GravitasPedestal",
            "posX": 35,
            "posY": 40
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 82,
            "posY": 56,
            "emitRate": 371.21506,
            "idleTime": 343.74658,
            "eruptionTime": 316.6308,
            "dormancyCycles": 72.83573,
            "activeCycles": 66.47435
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
        "biomePaths": "Barren:80,87 80,69 61,68 58,80 68,88;68,88 58,80 53,82 48,97 51,101 63,102;80,87 68,88 63,102 68,109 80,109;58,80 61,68 61,67 42,62 38,69 39,77 53,82;80,51 64,50 63,51 61,67 61,68 80,69;53,82 39,77 32,87 35,95 48,97;80,131 80,109 68,109 62,121 71,131;62,121 68,109 63,102 51,101 46,113 53,122;64,50 65,34 61,30 47,36 50,48 63,51;39,77 38,69 22,67 17,77 20,84 32,87;50,48 47,36 43,33 32,37 31,49 42,56;42,62 42,56 31,49 20,54 18,60 22,67 38,69;31,49 32,37 25,32 17,34 12,42 20,54;63,51 50,48 42,56 42,62 61,67;15,94 20,84 17,77 0,76 0,94;29,105 35,95 32,87 20,84 15,94 20,105;22,67 18,60 0,61 0,76 17,77;20,105 15,94 0,94 0,111 16,111;31,125 36,115 29,105 20,105 16,111 19,125;19,125 16,111 0,111 0,127 17,127;71,131 62,121 53,122 49,132 56,142 62,142;49,132 53,122 46,113 36,115 31,125 37,133;80,31 65,34 64,50 80,51;34,142 37,133 31,125 19,125 17,127 17,141 22,146;46,113 51,101 48,97 35,95 29,105 36,115;17,141 17,127 0,127 0,145;18,60 20,54 12,42 0,44 0,61;80,155 69,154 59,164 59,174 80,174;37,162 22,156 18,160 17,174 37,174;18,160 0,156 0,174 17,174;59,164 46,154 45,154 37,162 37,174 59,174\nSwamp:46,154 56,142 49,132 37,133 34,142 45,154;22,156 22,146 17,141 0,145 0,156 18,160;69,154 62,142 56,142 46,154 59,164;80,131 71,131 62,142 69,154 80,155;45,154 34,142 22,146 22,156 37,162",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 59,
            "posY": 148
          },
          {
            "id": "GravitasPedestal",
            "posX": 61,
            "posY": 148
          }
        ],
        "geysers": [
          {
            "id": "hot_water",
            "posX": 30,
            "posY": 112,
            "emitRate": 8548.497,
            "idleTime": 200.09975,
            "eruptionTime": 301.30145,
            "dormancyCycles": 29.698252,
            "activeCycles": 63.92488
          },
          {
            "id": "slush_water",
            "posX": 59,
            "posY": 83,
            "emitRate": 6137.995,
            "idleTime": 274.0488,
            "eruptionTime": 235.87062,
            "dormancyCycles": 58.88683,
            "activeCycles": 66.77335
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
        "biomePaths": "Barren:38,64 40,54 36,48 21,49 18,59 22,67;45,75 45,74 38,64 22,67 20,76 35,84;20,76 22,67 18,59 0,60 0,76 17,78;87,76 78,65 66,70 66,79 77,87;96,55 81,57 78,65 87,76 96,77;78,65 81,57 76,50 58,53 60,64 66,70\nSandstone:60,64 58,53 58,53 40,54 38,64 45,74;66,79 66,70 60,64 45,74 45,75 56,86\nFrozenWastes:56,86 45,75 35,84 35,96 55,96;35,84 20,76 17,78 16,96 35,96;17,78 0,76 0,96 16,96;96,77 87,76 77,87 78,96 96,96;77,87 66,79 56,86 55,96 78,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 22,
            "posY": 64
          },
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 64
          },
          {
            "id": "GeneShuffler",
            "posX": 24,
            "posY": 58
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 11,
            "posY": 83,
            "emitRate": 3023.0627,
            "idleTime": 341.01993,
            "eruptionTime": 251.0405,
            "dormancyCycles": 39.77895,
            "activeCycles": 52.784058
          },
          {
            "id": "steam",
            "posX": 22,
            "posY": 83,
            "emitRate": 3611.2346,
            "idleTime": 223.63339,
            "eruptionTime": 454.53403,
            "dormancyCycles": 53.581924,
            "activeCycles": 69.49048
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
        "q": -2,
        "r": -1
      },
      {
        "id": "TundraMoonlet",
        "q": -5,
        "r": 4
      },
      {
        "id": "MarshyMoonlet",
        "q": 4,
        "r": -5
      },
      {
        "id": "NiobiumMoonlet",
        "q": 2,
        "r": 4
      },
      {
        "id": "MooMoonlet",
        "q": -7,
        "r": 0
      },
      {
        "id": "WaterMoonlet",
        "q": 0,
        "r": -6
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": 7,
        "r": -1
      },
      {
        "id": "TemporalTear",
        "q": -2,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": 3,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 7,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 8,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 9,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -7,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -7,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -6,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -11,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 9,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -2,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -4,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -4,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -3,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": 5,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_IceAsteroidField",
        "q": 6,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 5,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 4,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 2,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": 1,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -8,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -7,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 2,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": -1,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -5,
        "r": 11
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation6",
        "q": 1,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -10,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 11,
        "r": -4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -7,
        "r": 3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -11,
        "r": 10
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation2",
        "q": 11,
        "r": -9
      }
    ]
  },
  {
    "coordinate": "M-BAD-C-1646564003-0-0-0",
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
          "Geodes"
        ],
        "biomePaths": "Sandstone:76,102 89,91 92,82 89,65 83,57 64,50 43,59 37,77 38,84 53,102 56,104;68,136 46,132 45,133 45,153 68,153;53,102 38,84 24,97 36,113;72,132 71,123 58,117 46,128 46,132 68,136;38,84 37,77 20,71 11,85 21,97 24,97;58,117 56,104 53,102 36,113 35,115 46,128;45,133 23,136 22,153 45,153;35,115 36,113 24,97 21,97 11,109 22,122;11,109 21,97 11,85 0,85 0,110;19,132 22,122 11,109 0,110 0,134\nToxicJungle:128,84 128,62 110,63 109,80 113,84;109,80 110,63 108,61 89,65 92,82;108,103 113,84 109,80 92,82 89,91 100,103;100,103 89,91 76,102 80,112 91,115;89,43 75,35 63,43 64,50 83,57;64,50 63,43 55,36 41,40 40,56 43,59;80,112 76,102 56,104 58,117 71,123;40,56 41,40 35,36 20,39 18,43 22,57;128,62 128,42 113,41 106,47 108,61 110,63;128,108 113,108 109,129 110,130 128,131;43,59 40,56 22,57 18,64 20,71 37,77;20,71 18,64 0,63 0,85 11,85;22,57 18,43 0,44 0,63 18,64;128,108 128,84 113,84 108,103 113,108;108,61 106,47 91,42 89,43 83,57 89,65;45,133 46,132 46,128 35,115 22,122 19,132 23,136\nOilField:113,108 108,103 100,103 91,115 96,128 109,129;96,128 91,115 80,112 71,123 72,132 89,135;110,130 109,129 96,128 89,135 91,153 109,153;89,135 72,132 68,136 68,153 91,153;128,131 110,130 109,153 128,153;23,136 19,132 0,134 0,153 22,153",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 65,
            "posY": 78
          },
          {
            "id": "WarpConduitSender",
            "posX": 97,
            "posY": 77
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 26,
            "posY": 128
          },
          {
            "id": "WarpReceiver",
            "posX": 114,
            "posY": 94
          },
          {
            "id": "WarpPortal",
            "posX": 114,
            "posY": 89
          }
        ],
        "geysers": [
          {
            "id": "OilWell",
            "posX": 98,
            "posY": 114,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 91,
            "posY": 128,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 17,
            "posY": 138,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 102,
            "posY": 140,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 76,
            "posY": 142,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "steam",
            "posX": 33,
            "posY": 60,
            "emitRate": 3929.964,
            "idleTime": 217.40251,
            "eruptionTime": 313.64172,
            "dormancyCycles": 42.51146,
            "activeCycles": 67.289505
          },
          {
            "id": "chlorine_gas",
            "posX": 56,
            "posY": 107,
            "emitRate": 721.992,
            "idleTime": 383.5603,
            "eruptionTime": 129.40483,
            "dormancyCycles": 35.43225,
            "activeCycles": 62.49196
          },
          {
            "id": "chlorine_gas",
            "posX": 94,
            "posY": 57,
            "emitRate": 355.8572,
            "idleTime": 196.27216,
            "eruptionTime": 203.13443,
            "dormancyCycles": 69.00607,
            "activeCycles": 102.97434
          },
          {
            "id": "methane",
            "posX": 17,
            "posY": 70,
            "emitRate": 337.84717,
            "idleTime": 312.87207,
            "eruptionTime": 357.7072,
            "dormancyCycles": 48.39248,
            "activeCycles": 93.59778
          },
          {
            "id": "liquid_co2",
            "posX": 115,
            "posY": 127,
            "emitRate": 479.5528,
            "idleTime": 384.10522,
            "eruptionTime": 299.3849,
            "dormancyCycles": 51.889435,
            "activeCycles": 72.260345
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
          "DistressSignal",
          "BouldersMixed"
        ],
        "biomePaths": "Forest:86,97 91,85 84,65 74,59 56,61 44,73 43,90 55,103 71,106;103,100 106,92 103,86 91,85 86,97 90,101;86,113 90,101 86,97 71,106 72,114 75,116;89,60 87,44 84,42 77,45 74,59 84,65;43,90 44,73 37,70 25,79 25,81 37,91;72,114 71,106 55,103 52,116 53,117;37,70 32,61 22,60 17,68 25,79\nOcean:112,48 105,40 87,44 89,60 106,62;110,69 106,62 89,60 84,65 91,85 103,86;128,47 112,48 106,62 110,69 128,70;128,92 128,70 110,69 103,86 106,92;128,92 106,92 103,100 111,114 128,114;56,61 51,48 42,46 32,61 37,70 44,73;74,59 77,45 61,38 51,48 56,61;42,46 36,39 23,38 16,47 22,60 32,61;52,116 55,103 43,90 37,91 28,111 33,116;37,91 25,81 7,96 20,110 28,111;17,68 22,60 16,47 0,47 0,69;25,81 25,79 17,68 0,69 0,95 7,96\nRadioactive:111,114 103,100 90,101 86,113 101,128 102,128;101,128 86,113 75,116 75,132 87,138;128,133 128,114 111,114 102,128 107,134;75,132 75,116 72,114 53,117 54,132 65,138;54,132 53,117 52,116 33,116 31,131 41,139;31,131 33,116 28,111 20,110 7,126 19,136;7,126 20,110 7,96 0,95 0,127\nMagmaCore:87,138 75,132 65,138 64,153 88,153;19,136 7,126 0,127 0,153 17,153;107,134 102,128 101,128 87,138 88,153 106,153;41,139 31,131 19,136 17,153 41,153;65,138 54,132 41,139 41,153 64,153;128,133 107,134 106,153 128,153",
        "pointsOfInterest": [
          {
            "id": "WarpConduitReceiver",
            "posX": 28,
            "posY": 65
          },
          {
            "id": "WarpConduitSender",
            "posX": 73,
            "posY": 109
          },
          {
            "id": "GravitasPedestal",
            "posX": 85,
            "posY": 124
          },
          {
            "id": "WarpReceiver",
            "posX": 76,
            "posY": 87
          },
          {
            "id": "WarpPortal",
            "posX": 54,
            "posY": 87
          }
        ],
        "geysers": [
          {
            "id": "salt_water",
            "posX": 48,
            "posY": 103,
            "emitRate": 14275.712,
            "idleTime": 324.38443,
            "eruptionTime": 174.984,
            "dormancyCycles": 29.942457,
            "activeCycles": 48.87468
          },
          {
            "id": "slush_salt_water",
            "posX": 16,
            "posY": 95,
            "emitRate": 6557.6885,
            "idleTime": 263.02274,
            "eruptionTime": 214.73193,
            "dormancyCycles": 59.300606,
            "activeCycles": 109.315094
          },
          {
            "id": "filthy_water",
            "posX": 17,
            "posY": 80,
            "emitRate": 9580.411,
            "idleTime": 396.38983,
            "eruptionTime": 397.21942,
            "dormancyCycles": 58.27612,
            "activeCycles": 56.40095
          },
          {
            "id": "salt_water",
            "posX": 111,
            "posY": 120,
            "emitRate": 11817.746,
            "idleTime": 398.57187,
            "eruptionTime": 296.10684,
            "dormancyCycles": 64.64656,
            "activeCycles": 92.518814
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
          "Volcanoes"
        ],
        "biomePaths": "BoggyMarsh:128,42 107,42 102,51 107,62 128,63;102,73 107,62 102,51 85,50 84,72 87,74;84,72 85,50 83,49 69,49 62,64 70,75;56,103 58,88 42,79 40,80 32,91 39,108;78,106 81,91 68,83 58,88 56,103 63,109;25,57 19,48 0,50 0,69 21,70;128,79 128,63 107,62 102,73 110,86;38,109 39,108 32,91 22,88 14,93 12,105 22,114;45,130 45,130 38,109 22,114 18,130 23,135;104,127 106,111 99,102 83,109 85,128 86,129;18,130 22,114 12,105 0,107 0,131\nMagmaCore:128,79 110,86 110,87 128,98;40,80 24,75 22,88 32,91;83,90 87,74 84,72 70,75 68,83 81,91;12,105 14,93 0,89 0,107;99,102 99,100 83,90 81,91 78,106 83,109;45,130 23,135 22,153 48,153;67,131 61,126 45,130 45,130 48,153 65,153;107,130 104,127 86,129 87,153 106,153;23,135 18,130 0,131 0,153 22,153;128,130 107,130 106,153 128,153;86,129 85,128 67,131 65,153 87,153\nSwamp:62,64 69,49 62,41 46,43 42,57 48,65;68,83 70,75 62,64 48,65 42,79 58,88;42,79 48,65 42,57 25,57 21,70 24,75 40,80;22,88 24,75 21,70 0,69 0,89 14,93;110,87 110,86 102,73 87,74 83,90 99,100\nMetallic:128,107 128,98 110,87 99,100 99,102 106,111;85,128 83,109 78,106 63,109 61,126 67,131;61,126 63,109 56,103 39,108 38,109 45,130;128,130 128,107 106,111 104,127 107,130",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 105,
            "posY": 75
          }
        ],
        "geysers": [
          {
            "id": "methane",
            "posX": 36,
            "posY": 103,
            "emitRate": 304.17285,
            "idleTime": 368.93832,
            "eruptionTime": 399.52853,
            "dormancyCycles": 33.811184,
            "activeCycles": 72.36421
          },
          {
            "id": "molten_cobalt",
            "posX": 67,
            "posY": 118,
            "emitRate": 7562.051,
            "idleTime": 740.1511,
            "eruptionTime": 52.491863,
            "dormancyCycles": 62.27094,
            "activeCycles": 73.58321
          },
          {
            "id": "molten_gold",
            "posX": 46,
            "posY": 123,
            "emitRate": 9368.31,
            "idleTime": 855.7255,
            "eruptionTime": 55.29292,
            "dormancyCycles": 37.2149,
            "activeCycles": 53.023224
          },
          {
            "id": "molten_cobalt",
            "posX": 115,
            "posY": 115,
            "emitRate": 8118.167,
            "idleTime": 741.7172,
            "eruptionTime": 43.769554,
            "dormancyCycles": 57.81484,
            "activeCycles": 70.08897
          },
          {
            "id": "molten_iron",
            "posX": 91,
            "posY": 61,
            "emitRate": 9891.905,
            "idleTime": 703.95667,
            "eruptionTime": 40.846714,
            "dormancyCycles": 63.630085,
            "activeCycles": 108.684525
          },
          {
            "id": "molten_aluminum",
            "posX": 68,
            "posY": 67,
            "emitRate": 11914.574,
            "idleTime": 818.26544,
            "eruptionTime": 37.340073,
            "dormancyCycles": 55.128567,
            "activeCycles": 88.70438
          },
          {
            "id": "liquid_co2",
            "posX": 21,
            "posY": 108,
            "emitRate": 498.0489,
            "idleTime": 30.53648,
            "eruptionTime": 33.8093,
            "dormancyCycles": 60.725723,
            "activeCycles": 123.26139
          },
          {
            "id": "molten_gold",
            "posX": 100,
            "posY": 122,
            "emitRate": 15021.367,
            "idleTime": 631.43243,
            "eruptionTime": 22.55283,
            "dormancyCycles": 67.2466,
            "activeCycles": 86.17154
          },
          {
            "id": "big_volcano",
            "posX": 29,
            "posY": 84,
            "emitRate": 222466.33,
            "idleTime": 8699.031,
            "eruptionTime": 77.4478,
            "dormancyCycles": 62.617695,
            "activeCycles": 85.78012
          },
          {
            "id": "big_volcano",
            "posX": 86,
            "posY": 100,
            "emitRate": 282998.38,
            "idleTime": 8770.678,
            "eruptionTime": 68.09721,
            "dormancyCycles": 44.056435,
            "activeCycles": 84.63781
          },
          {
            "id": "big_volcano",
            "posX": 77,
            "posY": 81,
            "emitRate": 221239.5,
            "idleTime": 8633.661,
            "eruptionTime": 66.877975,
            "dormancyCycles": 57.82024,
            "activeCycles": 80.433525
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
          "FrozenCore",
          "SlimeSplats"
        ],
        "biomePaths": "Forest:89,58 87,41 69,38 65,44 69,61 85,61;69,61 65,44 48,45 44,63 63,67;112,47 107,37 93,35 87,41 89,58 105,59;128,48 112,47 105,59 110,70 128,71;44,63 48,45 43,38 24,42 21,47 25,59 43,63;25,59 21,47 0,48 0,69 17,71\nToxicJungle:87,81 85,61 69,61 63,67 65,80 83,85;81,102 83,85 65,80 58,88 58,96 70,106;102,106 107,92 102,83 87,81 83,85 81,102 90,108;128,71 110,70 102,83 107,92 128,92;87,127 90,108 81,102 70,106 66,119 72,131 75,132;65,80 63,67 44,63 43,63 40,81 58,88;106,131 110,114 102,106 90,108 87,127 102,135;128,112 110,114 106,131 128,137;36,104 36,84 22,81 14,93 24,108;24,135 27,131 20,115 0,117 0,135;58,96 58,88 40,81 36,84 36,104 43,108\nRust:110,70 105,59 89,58 85,61 87,81 102,83;40,81 43,63 25,59 17,71 22,81 36,84;128,112 128,92 107,92 102,106 110,114;70,106 58,96 43,108 47,119 66,119;72,131 66,119 47,119 42,129 51,141;14,93 22,81 17,71 0,69 0,94;42,129 47,119 43,108 36,104 24,108 20,115 27,131;20,115 24,108 14,93 0,94 0,117\nFrozenWastes:128,137 106,131 102,135 100,153 128,153;102,135 87,127 75,132 78,153 100,153;75,132 72,131 51,141 50,153 78,153;51,141 42,129 27,131 24,135 26,153 50,153;24,135 0,135 0,153 26,153",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 58,
            "posY": 86
          },
          {
            "id": "PropSurfaceSatellite3",
            "posX": 31,
            "posY": 60
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 85,
            "posY": 86,
            "emitRate": 339.56882,
            "idleTime": 266.50003,
            "eruptionTime": 289.11374,
            "dormancyCycles": 34.683224,
            "activeCycles": 49.585854
          },
          {
            "id": "slush_water",
            "posX": 32,
            "posY": 111,
            "emitRate": 8577.064,
            "idleTime": 410.06754,
            "eruptionTime": 187.02768,
            "dormancyCycles": 53.68781,
            "activeCycles": 66.58764
          },
          {
            "id": "chlorine_gas",
            "posX": 25,
            "posY": 86,
            "emitRate": 300.61008,
            "idleTime": 328.466,
            "eruptionTime": 381.33972,
            "dormancyCycles": 46.089565,
            "activeCycles": 62.532127
          },
          {
            "id": "slimy_po2",
            "posX": 75,
            "posY": 102,
            "emitRate": 433.72574,
            "idleTime": 367.37012,
            "eruptionTime": 330.75073,
            "dormancyCycles": 47.67731,
            "activeCycles": 79.20102
          },
          {
            "id": "methane",
            "posX": 108,
            "posY": 106,
            "emitRate": 282.82922,
            "idleTime": 228.70912,
            "eruptionTime": 277.15027,
            "dormancyCycles": 50.626194,
            "activeCycles": 89.871826
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
          "MetalPoor"
        ],
        "biomePaths": "Wasteland:101,64 102,61 99,55 79,50 72,59 73,69 84,74;85,93 87,90 84,74 73,69 62,78 63,92 68,96;128,77 128,58 102,61 101,64 109,79;110,98 105,89 87,90 85,93 91,111 104,112;128,117 128,98 110,98 104,112 108,118;91,111 85,93 68,96 68,113 84,119;73,69 72,59 51,53 47,57 47,72 62,78;68,113 68,96 63,92 45,98 46,112 60,118;47,72 47,57 26,54 21,64 24,74 40,77;41,95 40,77 24,74 17,85 24,98;24,74 21,64 0,63 0,85 17,85;24,98 17,85 0,85 0,107 19,108\nMagmaCore:79,50 77,38 60,32 51,40 51,53 72,59;106,37 105,34 86,27 77,38 79,50 99,55;128,58 128,42 106,37 99,55 102,61;51,53 51,40 30,29 23,42 26,54 47,57;26,54 23,42 0,39 0,63 21,64\nFrozenWastes:105,89 109,79 101,64 84,74 87,90;63,92 62,78 47,72 40,77 41,95 45,98;105,134 108,118 104,112 91,111 84,119 85,130 101,137;85,130 84,119 68,113 60,118 60,131 74,139;46,112 45,98 41,95 24,98 19,108 22,114 37,119;128,117 108,118 105,134 128,140;128,77 109,79 105,89 110,98 128,98;60,131 60,118 46,112 37,119 38,132 49,139;14,130 22,114 19,108 0,107 0,131;38,132 37,119 22,114 14,130 24,140\nSandstone:101,137 85,130 74,139 75,153 100,153;74,139 60,131 49,139 49,153 75,153;49,139 38,132 24,140 23,153 49,153;24,140 14,130 0,131 0,153 23,153;128,140 105,134 101,137 100,153 128,153",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 94,
            "posY": 118
          },
          {
            "id": "MassiveHeatSink",
            "posX": 38,
            "posY": 106
          },
          {
            "id": "MassiveHeatSink",
            "posX": 42,
            "posY": 126
          },
          {
            "id": "GeneShuffler",
            "posX": 24,
            "posY": 134
          }
        ],
        "geysers": [
          {
            "id": "liquid_sulfur",
            "posX": 113,
            "posY": 53,
            "emitRate": 7029.1,
            "idleTime": 376.44595,
            "eruptionTime": 195.20163,
            "dormancyCycles": 58.155506,
            "activeCycles": 94.94392
          },
          {
            "id": "steam",
            "posX": 66,
            "posY": 84,
            "emitRate": 4924.4663,
            "idleTime": 296.16534,
            "eruptionTime": 316.3379,
            "dormancyCycles": 41.61946,
            "activeCycles": 60.10337
          },
          {
            "id": "big_volcano",
            "posX": 101,
            "posY": 73,
            "emitRate": 259993.02,
            "idleTime": 7275.131,
            "eruptionTime": 57.79421,
            "dormancyCycles": 25.859121,
            "activeCycles": 32.12946
          },
          {
            "id": "hot_steam",
            "posX": 104,
            "posY": 101,
            "emitRate": 2981.3337,
            "idleTime": 388.59174,
            "eruptionTime": 285.81537,
            "dormancyCycles": 44.33661,
            "activeCycles": 93.09378
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
        "biomePaths": "Ocean:64,30 47,34 49,52 64,54;49,52 47,34 42,31 30,38 34,54 43,58;34,54 30,38 22,36 13,49 20,61;22,36 19,31 0,29 0,48 13,49\nFrozenWastes:64,71 64,54 49,52 43,58 44,67 51,72;44,67 43,58 34,54 20,61 20,64 23,73 31,75;20,64 20,61 13,49 0,48 0,68;51,72 44,67 31,75 36,89 47,90;64,71 51,72 47,90 49,92 64,92;36,89 31,75 23,73 16,82 19,94 31,95;47,110 49,92 47,90 36,89 31,95 34,109 44,112;64,92 49,92 47,110 64,112;23,73 20,64 0,68 0,79 16,82;44,112 34,109 23,116 24,128 44,128;64,112 47,110 44,112 44,128 64,128;34,109 31,95 19,94 16,97 17,112 23,116;23,116 17,112 0,117 0,128 24,128;17,112 16,97 0,97 0,117;19,94 16,82 0,79 0,97 16,97",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 24,
            "posY": 56
          },
          {
            "id": "GravitasPedestal",
            "posX": 25,
            "posY": 107
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 31,
            "posY": 116,
            "emitRate": 10979.309,
            "idleTime": 781.8777,
            "eruptionTime": 36.696457,
            "dormancyCycles": 43.307938,
            "activeCycles": 68.25024
          },
          {
            "id": "molten_iron",
            "posX": 49,
            "posY": 116,
            "emitRate": 8460.071,
            "idleTime": 883.5849,
            "eruptionTime": 60.7713,
            "dormancyCycles": 35.578163,
            "activeCycles": 60.692696
          },
          {
            "id": "molten_iron",
            "posX": 41,
            "posY": 94,
            "emitRate": 7776.1724,
            "idleTime": 617.22363,
            "eruptionTime": 38.060135,
            "dormancyCycles": 48.096558,
            "activeCycles": 46.59988
          },
          {
            "id": "molten_iron",
            "posX": 12,
            "posY": 119,
            "emitRate": 8726.138,
            "idleTime": 672.50116,
            "eruptionTime": 47.332275,
            "dormancyCycles": 50.19812,
            "activeCycles": 82.354225
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
        "biomePaths": "BoggyMarsh:34,53 38,38 35,35 21,35 17,45 24,56;55,45 47,38 38,38 34,53 45,59;64,79 64,66 46,62 41,73 48,81;17,45 21,35 18,30 0,30 0,47;23,59 24,56 17,45 0,47 0,58 16,63;64,46 55,45 45,59 46,62 64,66;29,80 33,75 23,59 16,63 12,77 16,81\nToxicJungle:41,73 46,62 45,59 34,53 24,56 23,59 33,75;12,77 16,63 0,58 0,78\nMagmaCore:48,81 41,73 33,75 29,80 33,96 45,96;64,79 48,81 45,96 64,96;29,80 16,81 14,96 33,96;16,81 12,77 0,78 0,96 14,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 29,
            "posY": 46
          },
          {
            "id": "GravitasPedestal",
            "posX": 15,
            "posY": 46
          },
          {
            "id": "SapTree",
            "posX": 22,
            "posY": 46
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 38,
            "posY": 61,
            "emitRate": 10216.606,
            "idleTime": 823.97675,
            "eruptionTime": 43.224346,
            "dormancyCycles": 46.48141,
            "activeCycles": 101.284966
          },
          {
            "id": "molten_tungsten",
            "posX": 23,
            "posY": 90,
            "emitRate": 8879.252,
            "idleTime": 865.0769,
            "eruptionTime": 52.79759,
            "dormancyCycles": 57.897,
            "activeCycles": 60.84223
          },
          {
            "id": "molten_tungsten",
            "posX": 41,
            "posY": 89,
            "emitRate": 7616.301,
            "idleTime": 731.7936,
            "eruptionTime": 51.685944,
            "dormancyCycles": 46.5957,
            "activeCycles": 75.88747
          },
          {
            "id": "hot_hydrogen",
            "posX": 25,
            "posY": 59,
            "emitRate": 374.03253,
            "idleTime": 316.53427,
            "eruptionTime": 329.33176,
            "dormancyCycles": 35.575592,
            "activeCycles": 86.11885
          },
          {
            "id": "chlorine_gas",
            "posX": 17,
            "posY": 72,
            "emitRate": 311.54456,
            "idleTime": 223.47772,
            "eruptionTime": 363.44104,
            "dormancyCycles": 72.66136,
            "activeCycles": 107.975555
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
        "biomePaths": "Moo:81,41 77,33 67,32 59,40 63,49 76,50;96,59 96,42 81,41 76,50 81,61;57,59 63,49 59,40 49,37 46,39 42,50 50,60;32,33 31,28 18,25 12,31 17,43 25,43;42,50 46,39 32,33 25,43 31,52;28,61 31,52 25,43 17,43 12,48 17,62;47,65 50,60 42,50 31,52 28,61 33,67;17,43 12,31 0,31 0,48 12,48;15,64 17,62 12,48 0,48 0,65;79,63 81,61 76,50 63,49 57,59 65,67\nFrozenWastes:15,64 0,65 0,80 17,80;65,67 57,59 50,60 47,65 50,80 63,80;47,65 33,67 31,80 50,80;79,63 65,67 63,80 83,80;96,59 81,61 79,63 83,80 96,80;33,67 28,61 17,62 15,64 17,80 31,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 22,
            "posY": 54
          },
          {
            "id": "GravitasPedestal",
            "posX": 15,
            "posY": 54
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 83,
            "posY": 48,
            "emitRate": 389.52557,
            "idleTime": 305.799,
            "eruptionTime": 217.16315,
            "dormancyCycles": 45.084442,
            "activeCycles": 99.691635
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
        "biomePaths": "Barren:80,80 63,79 61,82 65,96 80,96;80,61 63,66 63,79 80,80;65,96 61,82 52,82 45,91 49,101 61,101;80,112 80,96 65,96 61,101 65,112;52,82 43,70 31,78 33,90 45,91;61,82 63,79 63,66 57,60 43,69 43,70 52,82;49,101 45,91 33,90 29,94 32,107 44,108;61,119 65,112 61,101 49,101 44,108 48,119;45,125 48,119 44,108 32,107 28,112 32,126;32,107 29,94 18,93 12,100 18,112 28,112;33,90 31,78 20,73 13,80 18,93 29,94;20,73 19,63 15,59 0,61 0,78 13,80;29,131 32,126 28,112 18,112 11,120 18,131;65,128 61,119 48,119 45,125 49,137 61,137;13,139 18,131 11,120 0,120 0,139;57,60 57,53 44,45 35,52 34,57 43,69;34,57 35,52 21,39 16,42 15,59 19,63;80,61 80,51 64,47 57,53 57,60 63,66;15,59 16,42 0,40 0,61;80,31 63,34 64,47 80,51;18,93 13,80 0,78 0,100 12,100;11,120 18,112 12,100 0,100 0,120;80,112 65,112 61,119 65,128 80,128;80,128 65,128 61,137 65,144 80,145;44,45 45,36 37,29 22,37 21,39 35,52;43,70 43,69 34,57 19,63 20,73 31,78;31,158 27,151 19,150 13,157 19,174 24,174;63,159 60,156 48,155 44,160 46,174 61,174;64,47 63,34 58,30 45,36 44,45 57,53;80,160 63,159 61,174 80,174;44,160 31,158 24,174 46,174;49,137 45,125 32,126 29,131 33,142 45,143;13,157 0,157 0,174 19,174\nSwamp:48,155 45,143 33,142 27,151 31,158 44,160;13,157 19,150 13,139 0,139 0,157;65,144 61,137 49,137 45,143 48,155 60,156;33,142 29,131 18,131 13,139 19,150 27,151;80,145 65,144 60,156 63,159 80,160",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 52,
            "posY": 142
          },
          {
            "id": "GravitasPedestal",
            "posX": 54,
            "posY": 142
          }
        ],
        "geysers": [
          {
            "id": "slush_water",
            "posX": 31,
            "posY": 97,
            "emitRate": 4632.2173,
            "idleTime": 327.65408,
            "eruptionTime": 592.222,
            "dormancyCycles": 69.43885,
            "activeCycles": 101.14633
          },
          {
            "id": "filthy_water",
            "posX": 55,
            "posY": 89,
            "emitRate": 12065.726,
            "idleTime": 312.02243,
            "eruptionTime": 237.98904,
            "dormancyCycles": 47.8153,
            "activeCycles": 97.33081
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
        "biomePaths": "MagmaCore:64,40 55,40 46,53 51,60 64,61;55,40 47,33 34,36 33,38 38,52 46,53;38,52 33,38 19,41 17,45 21,58 29,59;49,79 44,74 36,74 30,79 34,96 46,96;36,74 29,59 21,58 16,63 16,78 30,79;21,58 17,45 0,47 0,60 16,63;16,78 0,78 0,96 16,96;17,45 19,41 14,30 0,30 0,47;16,78 16,78 16,63 0,60 0,78;64,79 64,61 51,60 44,74 49,79\nOilField:51,60 46,53 38,52 29,59 36,74 44,74;30,79 16,78 16,78 16,96 34,96;64,79 49,79 46,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 53,
            "posY": 82
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 29,
            "posY": 87,
            "emitRate": 282532.2,
            "idleTime": 8605.093,
            "eruptionTime": 61.28729,
            "dormancyCycles": 44.360268,
            "activeCycles": 62.0053
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
        "biomePaths": "Barren:91,74 88,62 80,58 69,67 68,74 73,79 86,79;124,78 117,60 114,59 110,60 103,77 105,79 121,81;53,78 47,65 36,66 31,77 38,84;47,65 53,57 40,44 29,57 36,66;18,81 20,78 16,67 0,65 0,81;23,56 18,50 0,52 0,65 16,67;160,51 148,52 143,64 160,72;160,78 160,72 143,64 139,66 135,76 141,84\nSandstone:110,60 98,55 88,62 91,74 103,77;80,58 78,49 64,45 57,56 69,67;68,74 69,67 57,56 53,57 47,65 53,78 54,79;135,76 139,66 127,56 117,60 124,78;31,77 36,66 29,57 23,56 16,67 20,78;143,64 148,52 142,45 132,47 127,56 139,66\nFrozenWastes:105,79 103,77 91,74 86,79 89,96 102,96;73,79 68,74 54,79 58,96 70,96;121,81 105,79 102,96 122,96;54,79 53,78 38,84 37,96 58,96;141,84 135,76 124,78 121,81 122,96 140,96;38,84 31,77 20,78 18,81 19,96 37,96;18,81 0,81 0,96 19,96;86,79 73,79 70,96 89,96;160,78 141,84 140,96 160,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 38,
            "posY": 68
          },
          {
            "id": "GravitasPedestal",
            "posX": 42,
            "posY": 68
          },
          {
            "id": "GeneShuffler",
            "posX": 40,
            "posY": 62
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 93,
            "posY": 81,
            "emitRate": 2003.7351,
            "idleTime": 237.035,
            "eruptionTime": 358.74545,
            "dormancyCycles": 45.598392,
            "activeCycles": 69.569626
          },
          {
            "id": "steam",
            "posX": 28,
            "posY": 84,
            "emitRate": 6141.7373,
            "idleTime": 342.2523,
            "eruptionTime": 270.57822,
            "dormancyCycles": 53.065357,
            "activeCycles": 99.588066
          }
        ]
      }
    ],
    "starMapEntriesVanilla": null,
    "starMapEntriesSpacedOut": [
      {
        "id": "MiniBadlandsStart",
        "q": -1,
        "r": 1
      },
      {
        "id": "MiniRadioactiveOceanWarp",
        "q": 1,
        "r": -3
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
        "q": -4,
        "r": 0
      },
      {
        "id": "TundraMoonlet",
        "q": 8,
        "r": -1
      },
      {
        "id": "MarshyMoonlet",
        "q": -8,
        "r": 8
      },
      {
        "id": "MooMoonlet",
        "q": -7,
        "r": -2
      },
      {
        "id": "WaterMoonlet",
        "q": 2,
        "r": -8
      },
      {
        "id": "NiobiumMoonlet",
        "q": -4,
        "r": 11
      },
      {
        "id": "RegolithMoonlet",
        "q": 10,
        "r": -8
      },
      {
        "id": "TemporalTear",
        "q": -5,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 4,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": -12,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 6,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 6,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 8,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 7,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": -12,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": 7,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 1,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -6,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_RockyAsteroidField",
        "q": -7,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -8,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": 12,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 12,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 12,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -1,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": 0,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 5,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -10,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -11,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": -10,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -9,
        "r": 2
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": -9,
        "r": 12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": -4,
        "r": -4
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation3",
        "q": -9,
        "r": -3
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": 12,
        "r": -12
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": 0,
        "r": -5
      }
    ]
  },
  {
    "coordinate": "V-FRST-C-480762227-0-0-0",
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
          "IrregularOil",
          "MetalRich"
        ],
        "biomePaths": "Forest:133,203 144,180 127,161 107,160 94,180 101,201 107,205;101,201 94,180 84,178 79,182 83,207;107,160 106,158 83,155 84,178 94,180;109,219 107,205 101,201 83,207 83,208 90,227 97,228;135,206 133,203 107,205 109,219 125,223;131,154 123,138 114,138 106,158 107,160 127,161;158,205 155,185 145,180 144,180 133,203 135,206 154,209;145,180 150,155 131,154 127,161 144,180\nMagmaCore:26,354 15,345 0,345 0,380 23,380;52,354 41,349 26,354 23,380 54,380;80,352 69,346 52,354 54,380 78,380;108,360 91,348 80,352 78,380 108,380;137,355 127,349 108,360 108,380 139,380;163,351 157,347 137,355 139,380 166,380;189,349 180,344 163,351 166,380 188,380;214,352 207,346 189,349 188,380 212,380;240,350 214,352 212,380 240,380\nOilField:30,327 20,311 0,310 0,345 15,345;41,349 37,329 30,327 15,345 26,354;49,97 40,78 29,77 18,89 29,107 42,107;69,346 67,327 53,319 37,329 41,349 52,354;91,348 98,326 95,319 80,316 67,327 69,346 80,352;105,252 97,228 90,227 75,240 81,259 85,261;127,349 125,331 98,326 91,348 108,360;157,347 156,328 131,323 125,331 127,349 137,355;155,92 139,78 128,81 123,104 135,112;180,344 178,330 160,325 156,328 157,347 163,351;164,266 163,237 157,234 137,242 147,266 163,267;207,346 211,324 207,319 191,316 178,330 180,344 189,349;186,142 184,135 163,127 157,130 155,152 176,157;240,350 240,326 211,324 207,346 214,352;208,216 214,205 207,190 190,190 182,208 188,217;240,177 240,158 211,155 207,170 211,178\nOcean:31,294 22,279 0,280 0,310 20,311;29,107 18,89 0,89 0,123 16,124;53,319 55,309 45,295 31,294 20,311 30,327 37,329;58,213 47,198 32,198 22,213 30,228 52,231;91,284 85,261 81,259 56,271 57,282 73,295;107,300 103,288 91,284 73,295 72,302 80,316 95,319;131,323 129,307 107,300 95,319 98,326 125,331;160,325 160,300 139,296 129,307 131,323 156,328;191,316 183,298 165,296 160,300 160,325 178,330;196,250 182,232 163,237 164,266 185,266;197,113 186,100 168,101 163,127 184,135;221,93 210,80 194,81 186,100 197,113 209,113;240,298 217,297 207,319 211,324 240,326\nSwamp:22,279 31,263 19,247 0,247 0,280;32,198 21,180 0,180 0,213 22,213;75,122 77,99 71,95 49,97 42,107 52,126;71,95 72,71 54,63 40,78 49,97;147,266 137,242 133,241 112,254 118,274 134,278;196,284 185,266 164,266 163,267 165,296 183,298;220,266 208,249 196,250 185,266 196,284 208,285;220,125 209,113 197,113 184,135 186,142 208,148;240,126 220,125 208,148 211,155 240,158\nRust:19,247 30,228 22,213 0,213 0,247;57,282 56,271 46,261 31,263 22,279 31,294 45,295;84,178 83,155 80,152 57,153 50,166 57,181 79,182;49,135 52,126 42,107 29,107 16,124 24,139;90,227 83,208 58,213 52,231 54,234 75,240;80,152 83,129 75,122 52,126 49,135 57,153;114,138 103,125 83,129 80,152 83,155 106,158;118,274 112,254 105,252 85,261 91,284 103,288;138,122 135,112 123,104 108,108 103,125 114,138 123,138;165,296 163,267 147,266 134,278 139,296 160,300;163,127 168,101 158,92 155,92 135,112 138,122 157,130;217,297 208,285 196,284 183,298 191,316 207,319;240,266 220,266 208,285 217,297 240,298;240,234 240,204 214,205 208,216 217,235;240,93 221,93 209,113 220,125 240,126\nToxicJungle:47,198 57,181 50,166 30,166 21,180 32,198;21,180 30,166 20,145 0,147 0,180;83,208 83,207 79,182 57,181 47,198 58,213;50,166 57,153 49,135 24,139 20,145 30,166;103,125 108,108 96,96 77,99 75,122 83,129;123,104 128,81 114,71 102,75 96,96 108,108;139,296 134,278 118,274 103,288 107,300 129,307;133,241 125,223 109,219 97,228 105,252 112,254;157,234 154,209 135,206 125,223 133,241 137,242;155,152 157,130 138,122 123,138 131,154 150,155;182,232 188,217 182,208 158,205 154,209 157,234 163,237;190,190 183,175 181,174 155,185 158,205 182,208;181,174 176,157 155,152 150,155 145,180 155,185;208,249 217,235 208,216 188,217 182,232 196,250;207,170 211,155 208,148 186,142 176,157 181,174 183,175;240,266 240,234 217,235 208,249 220,266\nRadioactive:20,145 24,139 16,124 0,123 0,147;72,302 73,295 57,282 45,295 55,309;80,316 72,302 55,309 53,319 67,327;207,190 211,178 207,170 183,175 190,190\nBarren:29,77 20,57 0,56 0,89 18,89;54,63 52,53 31,44 20,57 29,77 40,78;85,63 86,50 68,35 52,53 54,63 72,71;114,71 118,51 104,40 86,50 85,63 102,75;139,78 147,57 134,46 118,51 114,71 128,81;173,67 159,55 147,57 139,78 155,92 158,92;186,100 194,81 182,67 173,67 158,92 168,101;210,80 218,61 211,51 191,51 182,67 194,81;240,93 240,61 218,61 210,80 221,93\nFrozenWastes:46,261 54,234 52,231 30,228 19,247 31,263;81,259 75,240 54,234 46,261 56,271;96,96 102,75 85,63 72,71 71,95 77,99;240,204 240,177 211,178 207,190 214,205",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 118,
            "posY": 185
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 194,
            "posY": 152
          },
          {
            "id": "WarpConduitSender",
            "posX": 113,
            "posY": 283
          },
          {
            "id": "MassiveHeatSink",
            "posX": 77,
            "posY": 82
          },
          {
            "id": "MassiveHeatSink",
            "posX": 58,
            "posY": 255
          },
          {
            "id": "GravitasPedestal",
            "posX": 77,
            "posY": 175
          },
          {
            "id": "WarpReceiver",
            "posX": 171,
            "posY": 248
          },
          {
            "id": "WarpPortal",
            "posX": 170,
            "posY": 242
          },
          {
            "id": "GeneShuffler",
            "posX": 93,
            "posY": 328
          },
          {
            "id": "GeneShuffler",
            "posX": 102,
            "posY": 130
          },
          {
            "id": "GeneShuffler",
            "posX": 155,
            "posY": 179
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 204,
            "posY": 227,
            "emitRate": 6331.045,
            "idleTime": 405.4634,
            "eruptionTime": 252.94518,
            "dormancyCycles": 69.99585,
            "activeCycles": 90.73442
          },
          {
            "id": "methane",
            "posX": 177,
            "posY": 199,
            "emitRate": 320.2911,
            "idleTime": 333.7163,
            "eruptionTime": 528.9406,
            "dormancyCycles": 33.58513,
            "activeCycles": 56.977615
          },
          {
            "id": "salt_water",
            "posX": 126,
            "posY": 317,
            "emitRate": 9122.823,
            "idleTime": 240.82741,
            "eruptionTime": 308.9133,
            "dormancyCycles": 29.889189,
            "activeCycles": 42.53917
          },
          {
            "id": "OilWell",
            "posX": 165,
            "posY": 339,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 141,
            "posY": 339,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 216,
            "posY": 163,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "slush_salt_water",
            "posX": 46,
            "posY": 142,
            "emitRate": 6341.741,
            "idleTime": 312.69745,
            "eruptionTime": 183.2143,
            "dormancyCycles": 48.07943,
            "activeCycles": 64.09889
          },
          {
            "id": "hot_co2",
            "posX": 84,
            "posY": 281,
            "emitRate": 343.89728,
            "idleTime": 314.59982,
            "eruptionTime": 322.72275,
            "dormancyCycles": 53.597332,
            "activeCycles": 90.31453
          },
          {
            "id": "hot_co2",
            "posX": 167,
            "posY": 142,
            "emitRate": 311.7142,
            "idleTime": 308.31848,
            "eruptionTime": 386.0337,
            "dormancyCycles": 30.16644,
            "activeCycles": 65.1371
          },
          {
            "id": "molten_copper",
            "posX": 155,
            "posY": 319,
            "emitRate": 8638.573,
            "idleTime": 689.7018,
            "eruptionTime": 44.69955,
            "dormancyCycles": 57.341934,
            "activeCycles": 90.774254
          },
          {
            "id": "hot_hydrogen",
            "posX": 135,
            "posY": 219,
            "emitRate": 349.1312,
            "idleTime": 349.5181,
            "eruptionTime": 353.1135,
            "dormancyCycles": 58.19324,
            "activeCycles": 99.264465
          },
          {
            "id": "slush_salt_water",
            "posX": 58,
            "posY": 221,
            "emitRate": 5314.447,
            "idleTime": 351.64914,
            "eruptionTime": 276.8701,
            "dormancyCycles": 28.820562,
            "activeCycles": 28.990484
          },
          {
            "id": "slush_salt_water",
            "posX": 163,
            "posY": 104,
            "emitRate": 4736.8535,
            "idleTime": 348.16388,
            "eruptionTime": 335.4184,
            "dormancyCycles": 51.051666,
            "activeCycles": 67.18162
          },
          {
            "id": "molten_cobalt",
            "posX": 61,
            "posY": 129,
            "emitRate": 8637.026,
            "idleTime": 721.45776,
            "eruptionTime": 49.306408,
            "dormancyCycles": 34.25406,
            "activeCycles": 76.07697
          },
          {
            "id": "slush_salt_water",
            "posX": 97,
            "posY": 283,
            "emitRate": 5633.764,
            "idleTime": 435.19778,
            "eruptionTime": 306.67722,
            "dormancyCycles": 33.896008,
            "activeCycles": 55.881226
          },
          {
            "id": "liquid_sulfur",
            "posX": 170,
            "posY": 121,
            "emitRate": 6423.3203,
            "idleTime": 362.2994,
            "eruptionTime": 352.82047,
            "dormancyCycles": 39.065907,
            "activeCycles": 69.0263
          },
          {
            "id": "hot_po2",
            "posX": 211,
            "posY": 339,
            "emitRate": 306.4247,
            "idleTime": 320.96347,
            "eruptionTime": 432.96823,
            "dormancyCycles": 42.525055,
            "activeCycles": 81.51581
          },
          {
            "id": "chlorine_gas",
            "posX": 33,
            "posY": 224,
            "emitRate": 319.29883,
            "idleTime": 240.82741,
            "eruptionTime": 308.9133,
            "dormancyCycles": 29.889189,
            "activeCycles": 42.53917
          },
          {
            "id": "OilWell",
            "posX": 35,
            "posY": 94,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 93,
            "posY": 233,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 139,
            "posY": 86,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 144,
            "posY": 248,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 176,
            "posY": 141,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 202,
            "posY": 205,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 217,
            "posY": 176,
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
          "BouldersSmall",
          "MetalRich"
        ],
        "biomePaths": "Sandstone:81,88 62,90 61,91 64,108 85,109;123,89 120,76 106,73 97,83 107,100;106,103 107,100 97,83 85,83 81,88 85,109 86,109;81,88 85,83 80,69 65,66 59,74 62,90;65,66 62,56 45,53 39,61 42,72 59,74;64,108 61,91 43,94 38,104 44,113 60,114;87,120 86,109 85,109 64,108 60,114 64,129 71,131;113,123 114,115 106,103 86,109 87,120 98,131;38,104 43,94 36,82 23,82 17,93 23,105;137,132 141,122 134,110 114,115 113,123 124,135;44,113 38,104 23,105 17,115 23,126 37,127;64,129 60,114 44,113 37,127 41,133 53,137\nToxicJungle:129,66 123,55 107,53 102,59 106,73 120,76;107,53 105,38 100,34 87,37 82,45 88,58 102,59;144,76 137,67 129,66 120,76 123,89 136,95;160,77 144,76 136,95 137,97 160,100;160,119 160,100 137,97 134,110 141,122;17,93 23,82 16,70 0,70 0,93;16,137 23,126 17,115 0,115 0,137\nWasteland:106,73 102,59 88,58 80,69 85,83 97,83;160,51 149,51 137,67 144,76 160,77;149,51 139,41 130,41 123,55 129,66 137,67;88,58 82,45 69,46 62,56 65,66 80,69;134,110 137,97 136,95 123,89 107,100 106,103 114,115;69,46 62,35 43,38 45,53 62,56;45,53 43,38 42,37 23,40 19,47 24,58 39,61;61,91 62,90 59,74 42,72 36,82 43,94;24,58 19,47 0,47 0,70 16,70;130,41 121,32 105,38 107,53 123,55;36,82 42,72 39,61 24,58 16,70 23,82;23,105 17,93 0,93 0,115 17,115\nRadioactive:104,157 108,151 97,136 79,148 79,149 86,159;97,136 98,131 87,120 71,131 79,148;119,149 124,135 113,123 98,131 97,136 108,151;79,149 79,148 71,131 64,129 53,137 56,153 64,156;64,156 56,153 43,159 42,176 66,176;140,155 127,157 123,176 149,176;104,157 86,159 83,176 108,176;32,151 41,133 37,127 23,126 16,137 24,152;56,153 53,137 41,133 32,151 43,159;160,146 160,119 141,122 137,132 147,147;140,155 147,147 137,132 124,135 119,149 127,157;86,159 79,149 64,156 66,176 83,176;20,157 24,152 16,137 0,137 0,157\nFrozenWastes:127,157 119,149 108,151 104,157 108,176 123,176;160,146 147,147 140,155 149,176 160,176;43,159 32,151 24,152 20,157 23,176 42,176;20,157 0,157 0,176 23,176",
        "pointsOfInterest": [
          {
            "id": "WarpConduitSender",
            "posX": 62,
            "posY": 88
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 73,
            "posY": 118
          },
          {
            "id": "WarpPortal",
            "posX": 60,
            "posY": 103
          },
          {
            "id": "WarpReceiver",
            "posX": 79,
            "posY": 103
          }
        ],
        "geysers": [
          {
            "id": "liquid_co2",
            "posX": 140,
            "posY": 164,
            "emitRate": 1244.755,
            "idleTime": 477.52185,
            "eruptionTime": 127.512276,
            "dormancyCycles": 43.600174,
            "activeCycles": 103.78342
          },
          {
            "id": "liquid_co2",
            "posX": 149,
            "posY": 132,
            "emitRate": 409.2133,
            "idleTime": 279.20804,
            "eruptionTime": 336.67093,
            "dormancyCycles": 51.704662,
            "activeCycles": 76.328766
          },
          {
            "id": "steam",
            "posX": 120,
            "posY": 73,
            "emitRate": 5007.3633,
            "idleTime": 251.13936,
            "eruptionTime": 292.168,
            "dormancyCycles": 92.20542,
            "activeCycles": 80.73533
          },
          {
            "id": "molten_cobalt",
            "posX": 107,
            "posY": 133,
            "emitRate": 8438.019,
            "idleTime": 849.9909,
            "eruptionTime": 55.69624,
            "dormancyCycles": 57.08052,
            "activeCycles": 58.92113
          },
          {
            "id": "molten_copper",
            "posX": 87,
            "posY": 79,
            "emitRate": 8960.551,
            "idleTime": 841.7788,
            "eruptionTime": 48.893307,
            "dormancyCycles": 55.029213,
            "activeCycles": 78.41341
          },
          {
            "id": "hot_water",
            "posX": 107,
            "posY": 117,
            "emitRate": 6762.557,
            "idleTime": 264.08472,
            "eruptionTime": 380.47437,
            "dormancyCycles": 63.039276,
            "activeCycles": 83.17631
          },
          {
            "id": "salt_water",
            "posX": 22,
            "posY": 93,
            "emitRate": 11645.296,
            "idleTime": 418.94235,
            "eruptionTime": 267.07504,
            "dormancyCycles": 52.72138,
            "activeCycles": 91.61125
          },
          {
            "id": "hot_hydrogen",
            "posX": 130,
            "posY": 99,
            "emitRate": 354.0797,
            "idleTime": 336.0098,
            "eruptionTime": 320.22696,
            "dormancyCycles": 45.26665,
            "activeCycles": 81.97911
          },
          {
            "id": "liquid_co2",
            "posX": 118,
            "posY": 142,
            "emitRate": 1244.755,
            "idleTime": 477.52185,
            "eruptionTime": 127.512276,
            "dormancyCycles": 43.600174,
            "activeCycles": 103.78342
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
        "biomePaths": "FrozenWastes:46,69 51,57 45,49 33,52 30,64 34,69;45,49 46,42 36,32 30,34 25,44 33,52;64,75 64,56 51,57 46,69 51,76;30,83 34,69 30,64 19,65 13,74 20,84;64,75 51,76 47,85 55,95 64,95;47,85 51,76 46,69 34,69 30,83 36,88;35,98 36,88 30,83 20,84 15,92 21,104 26,105;21,104 15,92 0,93 0,110 13,111;30,64 33,52 25,44 18,46 12,54 19,65;15,92 20,84 13,74 0,74 0,93;13,74 19,65 12,54 0,55 0,74;64,95 55,95 47,104 48,112 64,114;25,44 30,34 19,24 9,34 18,46;48,112 47,104 35,98 26,105 31,114 45,115;31,114 26,105 21,104 13,111 17,128 26,128;13,111 0,110 0,128 17,128;55,95 47,85 36,88 35,98 47,104;64,114 48,112 45,115 46,128 64,128;64,56 64,36 56,36 46,42 45,49 51,57;12,54 18,46 9,34 0,34 0,55;45,115 31,114 26,128 46,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 31,
            "posY": 45
          },
          {
            "id": "GravitasPedestal",
            "posX": 30,
            "posY": 97
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 23,
            "posY": 32
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 17,
            "posY": 58
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 51,
            "posY": 51
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 9,
            "posY": 109,
            "emitRate": 13006.74,
            "idleTime": 732.5122,
            "eruptionTime": 31.222303,
            "dormancyCycles": 62.97869,
            "activeCycles": 87.41649
          },
          {
            "id": "molten_iron",
            "posX": 34,
            "posY": 57,
            "emitRate": 8402.667,
            "idleTime": 527.88385,
            "eruptionTime": 41.609684,
            "dormancyCycles": 49.849686,
            "activeCycles": 57.629337
          },
          {
            "id": "molten_iron",
            "posX": 51,
            "posY": 110,
            "emitRate": 7018.7666,
            "idleTime": 719.6142,
            "eruptionTime": 50.230267,
            "dormancyCycles": 43.689346,
            "activeCycles": 86.24471
          },
          {
            "id": "molten_iron",
            "posX": 37,
            "posY": 113,
            "emitRate": 6783.8555,
            "idleTime": 718.01245,
            "eruptionTime": 54.21617,
            "dormancyCycles": 76.68031,
            "activeCycles": 95.120186
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
        "biomePaths": "BoggyMarsh:44,49 48,38 47,35 34,31 29,34 27,47 32,51;64,56 64,40 48,38 44,49 50,57;47,66 50,57 44,49 32,51 30,64 35,69;27,47 29,34 18,29 9,38 17,48;15,78 18,66 12,59 0,59 0,80;34,79 35,69 30,64 18,66 15,78 22,85;12,59 17,48 9,38 0,38 0,59\nToxicJungle:64,56 50,57 47,66 54,77 64,77;30,64 32,51 27,47 17,48 12,59 18,66;54,77 47,66 35,69 34,79 44,87\nMagmaCore:44,87 34,79 22,85 21,96 45,96;64,77 54,77 44,87 45,96 64,96;22,85 15,78 0,80 0,96 21,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 44,
            "posY": 43
          },
          {
            "id": "GravitasPedestal",
            "posX": 30,
            "posY": 43
          },
          {
            "id": "SapTree",
            "posX": 37,
            "posY": 43
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 41,
            "posY": 69,
            "emitRate": 6911.262,
            "idleTime": 683.6688,
            "eruptionTime": 54.236233,
            "dormancyCycles": 42.136654,
            "activeCycles": 48.00351
          },
          {
            "id": "molten_tungsten",
            "posX": 57,
            "posY": 88,
            "emitRate": 5315.6367,
            "idleTime": 711.9266,
            "eruptionTime": 51.99366,
            "dormancyCycles": 44.44062,
            "activeCycles": 78.41037
          },
          {
            "id": "methane",
            "posX": 18,
            "posY": 59,
            "emitRate": 313.2552,
            "idleTime": 239.31398,
            "eruptionTime": 355.56372,
            "dormancyCycles": 49.62216,
            "activeCycles": 63.878723
          },
          {
            "id": "chlorine_gas",
            "posX": 33,
            "posY": 64,
            "emitRate": 213.395,
            "idleTime": 232.19624,
            "eruptionTime": 338.8601,
            "dormancyCycles": 44.44062,
            "activeCycles": 78.41037
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
        "biomePaths": "MagmaCore:14,58 18,54 14,39 0,37 0,58;46,60 51,54 44,38 35,40 29,53 35,60;29,53 35,40 22,31 14,39 18,54;64,53 64,34 45,36 44,38 51,54;19,74 14,58 0,58 0,77 14,78;35,60 29,53 18,54 14,58 19,74 29,74;64,74 64,53 51,54 46,60 52,74;14,78 0,77 0,96 17,96;64,74 52,74 49,78 52,96 64,96\nOilField:49,78 52,74 46,60 35,60 29,74 33,78;33,78 29,74 19,74 14,78 17,96 30,96;49,78 33,78 30,96 52,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 27,
            "posY": 76
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 40,
            "posY": 70,
            "emitRate": 218615.67,
            "idleTime": 10229.391,
            "eruptionTime": 82.4401,
            "dormancyCycles": 26.63593,
            "activeCycles": 35.965843
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
        "biomePaths": "Moo:68,35 64,27 51,27 48,33 57,46;57,50 57,46 48,33 38,36 35,48 38,52;96,32 83,31 76,37 79,47 96,48;38,36 32,30 19,34 19,47 35,48;79,47 76,37 68,35 57,46 57,50 57,50 76,53;96,62 96,48 79,47 76,53 78,63 79,64;57,63 57,50 57,50 38,52 37,62 42,68;18,63 18,48 0,47 0,65;19,47 19,34 15,30 0,32 0,47 18,48;37,62 38,52 35,48 19,47 18,48 18,63 21,66;78,63 76,53 57,50 57,63 62,68\nFrozenWastes:42,68 37,62 21,66 21,80 42,80;21,66 18,63 0,65 0,80 21,80;62,68 57,63 42,68 42,80 62,80;79,64 78,63 62,68 62,80 80,80;96,62 79,64 80,80 96,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 80,
            "posY": 54
          },
          {
            "id": "GravitasPedestal",
            "posX": 73,
            "posY": 54
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 14,
            "posY": 51,
            "emitRate": 542.17694,
            "idleTime": 248.86758,
            "eruptionTime": 114.65296,
            "dormancyCycles": 29.804739,
            "activeCycles": 60.15473
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
        "biomePaths": "Barren:70,57 63,47 50,50 48,55 57,68 60,69;62,89 68,79 60,69 57,68 47,76 49,89 52,91;80,78 80,57 70,57 60,69 68,79;57,68 48,55 35,62 38,72 47,76;63,47 66,38 60,30 49,33 45,43 50,50;80,36 66,38 63,47 70,57 80,57;49,33 40,23 31,31 32,42 45,43;49,89 47,76 38,72 27,82 36,93;71,100 62,89 52,91 52,107 61,110;52,107 52,91 49,89 36,93 33,102 43,112;31,59 29,45 17,44 11,52 18,64;61,126 65,121 61,110 52,107 43,112 42,117 52,129;80,78 68,79 62,89 71,100 80,100;32,42 31,31 20,26 13,34 17,44 29,45;48,55 50,50 45,43 32,42 29,45 31,59 35,62;33,102 36,93 27,82 24,81 17,87 17,99 22,105;42,117 43,112 33,102 22,105 19,117 20,120 31,124;80,100 71,100 61,110 65,121 80,121;38,72 35,62 31,59 18,64 17,69 24,81 27,82;24,81 17,69 0,73 0,83 17,87;11,52 17,44 13,34 0,32 0,53;17,69 18,64 11,52 0,53 0,73;22,105 17,99 0,103 0,115 19,117;80,121 65,121 61,126 68,139 80,140;20,120 19,117 0,115 0,132 13,133;17,99 17,87 0,83 0,103;68,139 61,126 52,129 47,137 59,149;33,137 31,124 20,120 13,133 17,140 24,142;47,137 52,129 42,117 31,124 33,137 40,140;65,158 59,152 47,158 49,174 62,174;80,157 65,158 62,174 80,174;47,158 40,155 32,159 32,174 49,174;16,160 7,153 0,153 0,174 14,174;32,159 26,156 16,160 14,174 32,174\nSwamp:80,157 80,140 68,139 59,149 59,152 65,158;59,152 59,149 47,137 40,140 40,155 47,158;26,156 24,142 17,140 7,153 16,160;7,153 17,140 13,133 0,132 0,153;40,155 40,140 33,137 24,142 26,156 32,159",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 51,
            "posY": 154
          },
          {
            "id": "GravitasPedestal",
            "posX": 53,
            "posY": 154
          }
        ],
        "geysers": [
          {
            "id": "filthy_water",
            "posX": 62,
            "posY": 95,
            "emitRate": 10234.32,
            "idleTime": 260.41205,
            "eruptionTime": 344.94806,
            "dormancyCycles": 50.721577,
            "activeCycles": 70.23948
          },
          {
            "id": "slush_water",
            "posX": 16,
            "posY": 55,
            "emitRate": 5284.5635,
            "idleTime": 341.34595,
            "eruptionTime": 359.06628,
            "dormancyCycles": 36.97593,
            "activeCycles": 60.44155
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
        "biomePaths": "FrozenWastes:85,74 77,70 67,77 72,96 80,96;36,80 34,76 19,75 17,76 18,96 33,96;17,76 0,76 0,96 18,96;52,82 36,80 33,96 54,96;67,77 58,75 52,82 54,96 72,96;96,73 85,74 80,96 96,96\nBarren:77,70 75,60 63,54 58,55 54,65 58,75 67,77;38,65 33,54 18,58 19,75 34,76;19,75 18,58 15,56 0,58 0,76 17,76\nSandstone:54,65 58,55 47,46 33,53 33,54 38,65;58,75 54,65 38,65 34,76 36,80 52,82",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 67
          },
          {
            "id": "GravitasPedestal",
            "posX": 30,
            "posY": 67
          },
          {
            "id": "GeneShuffler",
            "posX": 28,
            "posY": 61
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 76,
            "posY": 78,
            "emitRate": 4641.7017,
            "idleTime": 312.61157,
            "eruptionTime": 488.4464,
            "dormancyCycles": 73.02854,
            "activeCycles": 91.04811
          },
          {
            "id": "steam",
            "posX": 29,
            "posY": 82,
            "emitRate": 5843.9097,
            "idleTime": 503.39716,
            "eruptionTime": 342.23993,
            "dormancyCycles": 30.546083,
            "activeCycles": 37.245003
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
        "q": 0,
        "r": -3
      },
      {
        "id": "TundraMoonlet",
        "q": 5,
        "r": 0
      },
      {
        "id": "MarshyMoonlet",
        "q": -4,
        "r": 5
      },
      {
        "id": "NiobiumMoonlet",
        "q": -4,
        "r": -2
      },
      {
        "id": "MooMoonlet",
        "q": 4,
        "r": -6
      },
      {
        "id": "WaterMoonlet",
        "q": 0,
        "r": 7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -8,
        "r": 3
      },
      {
        "id": "TemporalTear",
        "q": -9,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 2,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": -1,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": -2,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 5,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": 9,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 9,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 11,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -2,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 6,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_InterstellarIceField",
        "q": -5,
        "r": 2
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 3,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_InterstellarOcean",
        "q": -2,
        "r": 6
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_GasGiantCloud",
        "q": -3,
        "r": 8
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 7,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -11,
        "r": 4
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": -2
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 11,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": -7,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -7,
        "r": 0
      },
      {
        "id": "HarvestableSpacePOI_CarbonAsteroidField",
        "q": 7,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 8,
        "r": -10
      }
    ]
  },
  {
    "coordinate": "V-SFRZ-C-694764050-0-0-0",
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
          "MetalCaves",
          "IrregularOil",
          "Geodes",
          "DeepOil"
        ],
        "biomePaths": "Sandstone:149,191 151,175 146,164 127,154 109,159 99,176 101,195 103,198 132,206;61,262 64,257 54,231 36,227 23,247 33,264;60,167 68,150 60,138 36,137 28,153 38,172;99,176 85,171 73,180 73,192 101,195;85,171 83,153 68,150 60,167 73,180;101,276 102,256 88,247 64,257 61,262 64,274 88,285;109,159 95,146 83,153 85,171 99,176;127,154 132,137 120,123 98,127 95,146 109,159;132,334 139,323 140,317 119,301 100,313 100,327 107,335;132,215 132,206 103,198 101,215 120,225;154,152 145,136 132,137 127,154 146,164;175,196 172,173 151,175 149,191 171,200;172,173 176,167 172,155 154,152 146,164 151,175;208,220 210,217 203,198 175,196 171,200 170,220 185,230;212,154 205,138 183,137 172,155 176,167 205,168;213,122 205,106 184,105 174,119 183,137 205,138\nMagmaCore:28,352 17,343 0,345 0,380 27,380;58,352 45,345 28,352 27,380 59,380;89,353 77,342 75,342 58,352 59,380 87,380;120,357 106,346 89,353 87,380 121,380;152,351 134,347 120,357 121,380 154,380;183,352 168,342 160,343 152,351 154,380 181,380;212,352 196,345 183,352 181,380 214,380;240,344 224,343 212,352 214,380 240,380\nOilField:17,343 25,323 23,319 0,315 0,345;45,345 45,333 25,323 17,343 28,352;75,342 61,323 45,333 45,345 58,352;101,215 103,198 101,195 73,192 67,201 70,215 88,223;106,346 107,335 100,327 77,342 89,353;119,301 119,286 101,276 88,285 88,304 100,313;134,347 132,334 107,335 106,346 120,357;160,343 139,323 132,334 134,347 152,351;196,345 196,331 181,322 168,342 183,352;224,343 215,323 196,331 196,345 212,352;213,90 207,79 181,78 177,83 184,105 205,106;240,313 218,317 215,323 224,343 240,344;240,213 210,217 208,220 220,246 240,246\nBoggyMarsh:35,296 25,283 0,283 0,315 23,319;28,153 36,137 28,122 0,123 0,154;64,274 61,262 33,264 25,283 35,296 50,297;73,192 73,180 60,167 38,172 33,183 38,196 67,201;95,146 98,127 89,118 68,120 60,138 68,150 83,153;119,247 120,225 101,215 88,223 88,247 102,256;152,247 154,229 132,215 120,225 119,247 137,256;170,220 171,200 149,191 132,206 132,215 154,229;192,294 174,273 153,285 154,304 178,314;183,137 174,119 158,118 145,136 154,152 172,155;240,246 220,246 207,260 213,282 240,282;240,213 240,186 211,184 203,198 210,217;240,123 213,122 205,138 212,154 240,154\nOcean:25,283 33,264 23,247 0,246 0,283;36,227 29,214 0,212 0,246 23,247;33,183 38,172 28,153 0,154 0,184;28,122 36,106 27,91 0,92 0,123;88,304 88,285 64,274 50,297 63,314;184,105 177,83 155,86 147,101 158,118 174,119;215,323 218,317 204,293 192,294 178,314 181,322 196,331;240,154 212,154 205,168 211,184 240,186\nForest:38,196 33,183 0,184 0,212 29,214;120,123 126,103 117,91 94,94 89,118 98,127;174,273 176,261 152,247 137,256 137,276 153,285;220,246 208,220 185,230 184,256 207,260\nBarren:27,91 35,73 25,60 0,60 0,92;54,72 61,56 47,35 36,33 25,60 35,73;85,85 91,60 83,52 61,56 54,72 65,87;117,91 122,73 107,58 91,60 85,85 94,94;147,101 155,86 143,67 122,73 117,91 126,103;177,83 181,78 178,58 164,50 146,59 143,67 155,86;215,59 202,42 178,58 181,78 207,79;240,57 215,59 207,79 213,90 240,91\nFrozenWastes:61,323 63,314 50,297 35,296 23,319 25,323 45,333\nToxicJungle:70,215 67,201 38,196 29,214 36,227 54,231;68,120 58,105 36,106 28,122 36,137 60,138;58,105 65,87 54,72 35,73 27,91 36,106;88,247 88,223 70,215 54,231 64,257;100,327 100,313 88,304 63,314 61,323 75,342 77,342;89,118 94,94 85,85 65,87 58,105 68,120;145,136 158,118 147,101 126,103 120,123 132,137;184,256 185,230 170,220 154,229 152,247 176,261;240,313 240,282 213,282 204,293 218,317\nRust:137,276 137,256 119,247 102,256 101,276 119,286;211,184 205,168 176,167 172,173 175,196 203,198\nRadioactive:154,304 153,285 137,276 119,286 119,301 140,317;168,342 181,322 178,314 154,304 140,317 139,323 160,343;204,293 213,282 207,260 184,256 176,261 174,273 192,294;240,91 213,90 205,106 213,122 240,123",
        "pointsOfInterest": [
          {
            "id": "Headquarters",
            "posX": 122,
            "posY": 182
          },
          {
            "id": "MassiveHeatSink",
            "posX": 43,
            "posY": 306
          },
          {
            "id": "GravitasPedestal",
            "posX": 79,
            "posY": 147
          },
          {
            "id": "WarpConduitSender",
            "posX": 38,
            "posY": 103
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 28,
            "posY": 166
          },
          {
            "id": "WarpReceiver",
            "posX": 217,
            "posY": 169
          },
          {
            "id": "WarpPortal",
            "posX": 216,
            "posY": 163
          },
          {
            "id": "GeneShuffler",
            "posX": 145,
            "posY": 220
          },
          {
            "id": "GeneShuffler",
            "posX": 183,
            "posY": 298
          },
          {
            "id": "GeneShuffler",
            "posX": 139,
            "posY": 131
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 36,
            "posY": 221,
            "emitRate": 6481.9917,
            "idleTime": 294.5909,
            "eruptionTime": 175.89287,
            "dormancyCycles": 52.19337,
            "activeCycles": 77.55139
          },
          {
            "id": "methane",
            "posX": 73,
            "posY": 104,
            "emitRate": 326.0357,
            "idleTime": 232.33221,
            "eruptionTime": 322.55054,
            "dormancyCycles": 65.588585,
            "activeCycles": 55.4967
          },
          {
            "id": "steam",
            "posX": 214,
            "posY": 198,
            "emitRate": 4545.61,
            "idleTime": 212.74263,
            "eruptionTime": 243.87614,
            "dormancyCycles": 54.182747,
            "activeCycles": 69.02943
          },
          {
            "id": "methane",
            "posX": 211,
            "posY": 132,
            "emitRate": 305.02457,
            "idleTime": 298.9749,
            "eruptionTime": 357.4981,
            "dormancyCycles": 62.088722,
            "activeCycles": 103.147736
          },
          {
            "id": "salt_water",
            "posX": 68,
            "posY": 303,
            "emitRate": 11731.56,
            "idleTime": 364.4275,
            "eruptionTime": 242.46313,
            "dormancyCycles": 52.22582,
            "activeCycles": 108.8331
          },
          {
            "id": "OilWell",
            "posX": 224,
            "posY": 338,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 101,
            "posY": 294,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 16,
            "posY": 335,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "slush_water",
            "posX": 158,
            "posY": 108,
            "emitRate": 4766.824,
            "idleTime": 233.16554,
            "eruptionTime": 207.35551,
            "dormancyCycles": 55.043873,
            "activeCycles": 86.44843
          },
          {
            "id": "hot_hydrogen",
            "posX": 141,
            "posY": 297,
            "emitRate": 371.16757,
            "idleTime": 355.9693,
            "eruptionTime": 319.56506,
            "dormancyCycles": 56.20636,
            "activeCycles": 87.968506
          },
          {
            "id": "big_volcano",
            "posX": 206,
            "posY": 280,
            "emitRate": 245216.64,
            "idleTime": 9496.328,
            "eruptionTime": 75.47171,
            "dormancyCycles": 41.759773,
            "activeCycles": 66.18499
          },
          {
            "id": "molten_cobalt",
            "posX": 126,
            "posY": 243,
            "emitRate": 8858.599,
            "idleTime": 647.5515,
            "eruptionTime": 43.483913,
            "dormancyCycles": 38.581837,
            "activeCycles": 47.28314
          },
          {
            "id": "slush_salt_water",
            "posX": 42,
            "posY": 166,
            "emitRate": 4032.6309,
            "idleTime": 165.23315,
            "eruptionTime": 227.33572,
            "dormancyCycles": 68.30791,
            "activeCycles": 62.800533
          },
          {
            "id": "small_volcano",
            "posX": 58,
            "posY": 88,
            "emitRate": 129259.78,
            "idleTime": 9282.577,
            "eruptionTime": 69.712135,
            "dormancyCycles": 54.90706,
            "activeCycles": 80.699326
          },
          {
            "id": "molten_copper",
            "posX": 79,
            "posY": 204,
            "emitRate": 12979.08,
            "idleTime": 813.1417,
            "eruptionTime": 34.261818,
            "dormancyCycles": 45.563694,
            "activeCycles": 71.151634
          },
          {
            "id": "slimy_po2",
            "posX": 23,
            "posY": 221,
            "emitRate": 601.5034,
            "idleTime": 390.57077,
            "eruptionTime": 163.96524,
            "dormancyCycles": 56.76655,
            "activeCycles": 90.80421
          },
          {
            "id": "oil_drip",
            "posX": 41,
            "posY": 179,
            "emitRate": 292.08194,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.1943165,
            "activeCycles": 0.32875502
          },
          {
            "id": "oil_drip",
            "posX": 17,
            "posY": 289,
            "emitRate": 289.89227,
            "idleTime": 0,
            "eruptionTime": 600,
            "dormancyCycles": 0.085980795,
            "activeCycles": 0.10716165
          },
          {
            "id": "hot_water",
            "posX": 150,
            "posY": 257,
            "emitRate": 8196.625,
            "idleTime": 173.8419,
            "eruptionTime": 204.99605,
            "dormancyCycles": 38.700077,
            "activeCycles": 65.30064
          },
          {
            "id": "steam",
            "posX": 167,
            "posY": 234,
            "emitRate": 3591.6802,
            "idleTime": 344.1827,
            "eruptionTime": 387.49466,
            "dormancyCycles": 52.095005,
            "activeCycles": 91.75644
          },
          {
            "id": "big_volcano",
            "posX": 179,
            "posY": 363,
            "emitRate": 273233.62,
            "idleTime": 8894.215,
            "eruptionTime": 73.08808,
            "dormancyCycles": 45.76966,
            "activeCycles": 100.62565
          },
          {
            "id": "big_volcano",
            "posX": 16,
            "posY": 363,
            "emitRate": 252013.23,
            "idleTime": 9243.722,
            "eruptionTime": 78.08057,
            "dormancyCycles": 85.635284,
            "activeCycles": 117.44832
          },
          {
            "id": "big_volcano",
            "posX": 157,
            "posY": 360,
            "emitRate": 310029.3,
            "idleTime": 10059.592,
            "eruptionTime": 76.821945,
            "dormancyCycles": 59.338646,
            "activeCycles": 82.06466
          },
          {
            "id": "big_volcano",
            "posX": 167,
            "posY": 360,
            "emitRate": 242877.55,
            "idleTime": 9758.908,
            "eruptionTime": 74.35823,
            "dormancyCycles": 52.384155,
            "activeCycles": 103.10792
          },
          {
            "id": "OilWell",
            "posX": 17,
            "posY": 324,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 17,
            "posY": 327,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 27,
            "posY": 331,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 28,
            "posY": 350,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 74,
            "posY": 341,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 61,
            "posY": 333,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 73,
            "posY": 204,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 93,
            "posY": 350,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 97,
            "posY": 334,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 115,
            "posY": 290,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 192,
            "posY": 102,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 227,
            "posY": 320,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 232,
            "posY": 320,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
          },
          {
            "id": "OilWell",
            "posX": 230,
            "posY": 241,
            "emitRate": 3333.33,
            "idleTime": 0,
            "eruptionTime": 1,
            "dormancyCycles": 0,
            "activeCycles": 1
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
          "BouldersSmall",
          "CrashedSatellites"
        ],
        "biomePaths": "Swamp:94,118 95,98 88,91 72,97 71,111 92,119;125,71 117,56 101,59 100,74 113,81;114,93 113,81 100,74 89,79 88,91 95,98;117,111 117,96 114,93 95,98 94,118 100,120;88,91 89,79 77,70 66,75 65,91 72,97;71,111 72,97 65,91 49,95 46,104 48,111 65,116;85,134 92,119 71,111 65,116 65,130 74,137\nBoggyMarsh:142,62 137,48 121,48 117,56 125,71 134,73;117,56 121,48 117,39 102,35 95,41 94,53 101,59;94,53 95,41 80,34 67,46 67,46 79,59;77,70 79,59 67,46 56,57 57,69 66,75;67,46 67,46 56,34 38,39 41,51 56,57\nToxicJungle:160,40 142,41 137,48 142,62 160,64;65,91 66,75 57,69 41,77 40,80 49,95;65,130 65,116 48,111 39,124 42,133 50,137;122,134 126,118 117,111 100,120 111,137;15,134 23,119 20,113 0,111 0,135;41,51 38,39 37,38 21,40 15,47 23,62 32,62;16,70 23,62 15,47 0,48 0,70\nWasteland:160,84 160,64 142,62 134,73 140,85;136,94 140,85 134,73 125,71 113,81 114,93 117,96;100,74 101,59 94,53 79,59 77,70 89,79;137,116 142,108 136,94 117,96 117,111 126,118;49,95 40,80 23,87 21,91 25,102 46,104;104,148 111,137 100,120 94,118 92,119 85,134 99,149;52,153 50,137 42,133 26,146 26,151 44,159;99,149 85,134 74,137 72,154 89,159;135,153 134,144 122,134 111,137 104,148 114,159;48,111 46,104 25,102 20,113 23,119 39,124;147,131 137,116 126,118 122,134 134,144;42,133 39,124 23,119 15,134 26,146;160,132 147,131 134,144 135,153 137,155 160,155\nBarren:72,154 74,137 65,130 50,137 52,153 67,157;26,151 26,146 15,134 0,135 0,155 21,156;21,91 23,87 16,70 0,70 0,93\nFrozenWastes:57,69 56,57 41,51 32,62 41,77;40,80 41,77 32,62 23,62 16,70 23,87;160,106 160,84 140,85 136,94 142,108;160,106 142,108 137,116 147,131 160,132;25,102 21,91 0,93 0,111 20,113\nMagmaCore:114,159 104,148 99,149 89,159 92,176 112,176;44,159 26,151 21,156 22,176 44,176;67,157 52,153 44,159 44,176 66,176;89,159 72,154 67,157 66,176 92,176;160,155 137,155 137,176 160,176;21,156 0,155 0,176 22,176;137,155 135,153 114,159 112,176 137,176",
        "pointsOfInterest": [
          {
            "id": "MassiveHeatSink",
            "posX": 29,
            "posY": 80
          },
          {
            "id": "WarpConduitReceiver",
            "posX": 104,
            "posY": 72
          },
          {
            "id": "WarpConduitSender",
            "posX": 75,
            "posY": 89
          },
          {
            "id": "WarpReceiver",
            "posX": 96,
            "posY": 108
          },
          {
            "id": "WarpPortal",
            "posX": 74,
            "posY": 108
          },
          {
            "id": "PropSurfaceSatellite2",
            "posX": 52,
            "posY": 41
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 147,
            "posY": 68
          },
          {
            "id": "PropSurfaceSatellite1",
            "posX": 30,
            "posY": 66
          }
        ],
        "geysers": [
          {
            "id": "steam",
            "posX": 41,
            "posY": 118,
            "emitRate": 6442.938,
            "idleTime": 175.11852,
            "eruptionTime": 116.86733,
            "dormancyCycles": 58.628983,
            "activeCycles": 83.16502
          },
          {
            "id": "methane",
            "posX": 107,
            "posY": 120,
            "emitRate": 229.05817,
            "idleTime": 249.10123,
            "eruptionTime": 479.39224,
            "dormancyCycles": 50.55277,
            "activeCycles": 67.31259
          },
          {
            "id": "steam",
            "posX": 132,
            "posY": 68,
            "emitRate": 4189.792,
            "idleTime": 243.22855,
            "eruptionTime": 320.94986,
            "dormancyCycles": 74.191055,
            "activeCycles": 76.94707
          },
          {
            "id": "methane",
            "posX": 56,
            "posY": 63,
            "emitRate": 447.47632,
            "idleTime": 398.38443,
            "eruptionTime": 226.33607,
            "dormancyCycles": 78.02687,
            "activeCycles": 59.067677
          },
          {
            "id": "molten_gold",
            "posX": 30,
            "posY": 119,
            "emitRate": 7175.9917,
            "idleTime": 728.78577,
            "eruptionTime": 52.856647,
            "dormancyCycles": 26.843966,
            "activeCycles": 72.19923
          },
          {
            "id": "molten_iron",
            "posX": 20,
            "posY": 133,
            "emitRate": 17332.791,
            "idleTime": 748.9941,
            "eruptionTime": 24.270205,
            "dormancyCycles": 35.114826,
            "activeCycles": 41.498272
          },
          {
            "id": "hot_water",
            "posX": 43,
            "posY": 95,
            "emitRate": 9640.668,
            "idleTime": 251.58646,
            "eruptionTime": 298.73715,
            "dormancyCycles": 30.803541,
            "activeCycles": 51.56907
          },
          {
            "id": "slush_water",
            "posX": 27,
            "posY": 108,
            "emitRate": 5387.844,
            "idleTime": 402.90448,
            "eruptionTime": 355.9511,
            "dormancyCycles": 61.17267,
            "activeCycles": 96.730934
          },
          {
            "id": "slimy_po2",
            "posX": 76,
            "posY": 149,
            "emitRate": 247.95941,
            "idleTime": 122.1759,
            "eruptionTime": 355.52298,
            "dormancyCycles": 58.199863,
            "activeCycles": 72.66341
          },
          {
            "id": "small_volcano",
            "posX": 80,
            "posY": 139,
            "emitRate": 103941.36,
            "idleTime": 8535.315,
            "eruptionTime": 68.69977,
            "dormancyCycles": 51.56597,
            "activeCycles": 78.493355
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
        "biomePaths": "FrozenWastes:46,64 50,50 44,44 36,45 30,57 37,65;30,57 36,45 26,35 23,35 16,44 19,58;64,68 51,69 47,84 48,87 64,88;37,65 30,57 19,58 18,58 18,73 31,77;51,69 46,64 37,65 31,77 32,79 47,84;64,50 64,31 49,33 44,44 50,50;18,73 18,58 0,60 0,73 15,76;23,35 16,26 0,30 0,41 16,44;64,106 64,88 48,87 46,95 53,107;27,93 32,79 31,77 18,73 15,76 14,93 17,94;46,95 48,87 47,84 32,79 27,93 33,99;18,58 19,58 16,44 0,41 0,60;49,112 53,107 46,95 33,99 32,111 34,113;64,106 53,107 49,112 52,128 64,128;32,111 33,99 27,93 17,94 15,110 17,112;15,110 17,94 14,93 0,93 0,111;14,93 15,76 0,73 0,93;34,113 32,111 17,112 17,128 33,128;64,68 64,50 50,50 46,64 51,69;17,112 15,110 0,111 0,128 17,128;49,112 34,113 33,128 52,128",
        "pointsOfInterest": [
          {
            "id": "TemporalTearOpener",
            "posX": 52,
            "posY": 47
          },
          {
            "id": "GravitasPedestal",
            "posX": 51,
            "posY": 119
          }
        ],
        "geysers": [
          {
            "id": "molten_iron",
            "posX": 16,
            "posY": 85,
            "emitRate": 6367.044,
            "idleTime": 732.79376,
            "eruptionTime": 63.543873,
            "dormancyCycles": 50.85854,
            "activeCycles": 87.4934
          },
          {
            "id": "molten_iron",
            "posX": 50,
            "posY": 94,
            "emitRate": 9118.869,
            "idleTime": 847.9094,
            "eruptionTime": 50.759987,
            "dormancyCycles": 35.87676,
            "activeCycles": 30.940176
          },
          {
            "id": "molten_iron",
            "posX": 46,
            "posY": 73,
            "emitRate": 9462.205,
            "idleTime": 844.26434,
            "eruptionTime": 47.258133,
            "dormancyCycles": 50.695232,
            "activeCycles": 84.98898
          },
          {
            "id": "molten_iron",
            "posX": 20,
            "posY": 118,
            "emitRate": 7700.983,
            "idleTime": 612.1934,
            "eruptionTime": 41.718666,
            "dormancyCycles": 47.76421,
            "activeCycles": 77.32292
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
        "biomePaths": "BoggyMarsh:36,52 30,37 20,38 16,51 20,58 30,58;49,48 48,32 47,32 33,33 30,37 36,52 45,53;20,38 15,34 0,36 0,51 16,51;20,77 15,66 0,66 0,81 16,82;64,49 49,48 45,53 50,65 64,65;64,32 48,32 49,48 64,49;64,81 64,65 50,65 43,74 49,81\nToxicJungle:35,74 30,58 20,58 15,66 20,77 31,78;50,65 45,53 36,52 30,58 35,74 43,74;20,58 16,51 0,51 0,66 15,66\nMagmaCore:49,81 43,74 35,74 31,78 34,96 45,96;31,78 20,77 16,82 17,96 34,96;16,82 0,81 0,96 17,96;64,81 49,81 45,96 64,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 32,
            "posY": 49
          },
          {
            "id": "GravitasPedestal",
            "posX": 18,
            "posY": 49
          },
          {
            "id": "SapTree",
            "posX": 25,
            "posY": 49
          }
        ],
        "geysers": [
          {
            "id": "molten_tungsten",
            "posX": 34,
            "posY": 90,
            "emitRate": 8501.182,
            "idleTime": 652.87604,
            "eruptionTime": 41.392635,
            "dormancyCycles": 40.37732,
            "activeCycles": 76.73895
          },
          {
            "id": "molten_tungsten",
            "posX": 27,
            "posY": 88,
            "emitRate": 15105.792,
            "idleTime": 786.90894,
            "eruptionTime": 31.432884,
            "dormancyCycles": 43.619213,
            "activeCycles": 68.589005
          },
          {
            "id": "molten_tungsten",
            "posX": 18,
            "posY": 90,
            "emitRate": 8490.988,
            "idleTime": 729.26447,
            "eruptionTime": 41.984646,
            "dormancyCycles": 69.41861,
            "activeCycles": 111.32166
          },
          {
            "id": "hot_co2",
            "posX": 19,
            "posY": 63,
            "emitRate": 282.13922,
            "idleTime": 216.066,
            "eruptionTime": 448.08267,
            "dormancyCycles": 74.60379,
            "activeCycles": 96.99035
          },
          {
            "id": "methane",
            "posX": 48,
            "posY": 53,
            "emitRate": 398.79428,
            "idleTime": 248.3788,
            "eruptionTime": 169.79631,
            "dormancyCycles": 36.64238,
            "activeCycles": 71.785324
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
        "biomePaths": "MagmaCore:46,42 48,39 46,30 33,26 26,32 29,44;28,46 29,44 26,32 17,29 7,39 16,48;51,77 50,58 50,58 34,63 38,77 48,79;12,60 16,48 7,39 0,39 0,62;64,57 64,39 48,39 46,42 50,58 50,58;64,57 50,58 51,77 64,78;38,77 34,63 33,62 19,67 18,78 32,82\nOilField:50,58 46,42 29,44 28,46 33,62 34,63;33,62 28,46 16,48 12,60 19,67;18,78 19,67 12,60 0,62 0,79 16,80\nFrozenWastes:48,79 38,77 32,82 33,96 48,96;32,82 18,78 16,80 16,96 33,96;64,78 51,77 48,79 48,96 64,96;16,80 0,79 0,96 16,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 39,
            "posY": 46
          }
        ],
        "geysers": [
          {
            "id": "molten_niobium",
            "posX": 22,
            "posY": 56,
            "emitRate": 297803.9,
            "idleTime": 9710.073,
            "eruptionTime": 67.43666,
            "dormancyCycles": 39.98589,
            "activeCycles": 79.57452
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
        "biomePaths": "Moo:86,39 77,28 66,33 65,45 78,49;81,60 78,49 65,45 62,48 60,62 76,66;60,62 62,48 48,44 42,48 42,61 57,65;48,44 48,31 35,26 29,32 32,45 42,48;42,61 42,48 32,45 21,52 20,61 37,66;32,45 29,32 18,31 11,42 21,52;96,39 86,39 78,49 81,60 96,61;20,61 21,52 11,42 0,43 0,62 19,62;65,45 66,33 56,26 48,31 48,44 62,48\nFrozenWastes:76,66 60,62 57,65 57,80 77,80;57,65 42,61 37,66 37,80 57,80;96,61 81,60 76,66 77,80 96,80;37,66 20,61 19,62 18,80 37,80;19,62 0,62 0,80 18,80",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 33,
            "posY": 57
          },
          {
            "id": "GravitasPedestal",
            "posX": 26,
            "posY": 57
          }
        ],
        "geysers": [
          {
            "id": "chlorine_gas",
            "posX": 56,
            "posY": 38,
            "emitRate": 330.15268,
            "idleTime": 223.70035,
            "eruptionTime": 287.154,
            "dormancyCycles": 42.13329,
            "activeCycles": 46.248817
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
        "biomePaths": "Barren:72,85 62,73 53,74 50,88 59,96 60,96;62,73 69,62 62,53 50,53 48,69 53,74;71,108 60,96 59,96 47,112 60,120;47,112 59,96 50,88 38,90 36,101 46,112;48,69 50,53 48,50 35,51 29,61 36,70;80,85 72,85 60,96 71,108 80,109;50,88 53,74 48,69 36,70 31,82 38,90;80,62 80,39 69,40 62,53 69,62;31,82 36,70 29,61 20,61 14,68 20,83;36,101 38,90 31,82 20,83 16,88 19,104 21,106;69,40 60,31 49,36 48,50 50,53 62,53;48,50 49,36 38,29 28,39 35,51;29,61 35,51 28,39 21,39 13,48 20,61;14,68 20,61 13,48 0,48 0,69;20,83 14,68 0,69 0,88 16,88;61,131 62,129 60,120 47,112 46,112 38,122 40,133 43,135;80,129 80,109 71,108 60,120 62,129;80,62 69,62 62,73 72,85 80,85;19,104 16,88 0,88 0,107;40,133 38,122 23,118 18,124 20,138 29,140;23,118 21,106 19,104 0,107 0,122 18,124;46,112 36,101 21,106 23,118 38,122;20,138 18,124 0,122 0,140 14,142;42,157 32,154 22,161 22,174 43,174;62,162 55,153 48,153 42,157 43,174 61,174;22,161 15,157 0,161 0,174 22,174;80,155 62,162 61,174 80,174\nSwamp:80,129 62,129 61,131 63,143 80,149;63,143 61,131 43,135 48,153 55,153;48,153 43,135 40,133 29,140 32,154 42,157;32,154 29,140 20,138 14,142 15,157 22,161;15,157 14,142 0,140 0,161;80,155 80,149 63,143 55,153 62,162",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 61,
            "posY": 153
          },
          {
            "id": "GravitasPedestal",
            "posX": 63,
            "posY": 153
          }
        ],
        "geysers": [
          {
            "id": "slush_water",
            "posX": 30,
            "posY": 90,
            "emitRate": 7209.3887,
            "idleTime": 432.15884,
            "eruptionTime": 226.84944,
            "dormancyCycles": 66.042404,
            "activeCycles": 101.09102
          },
          {
            "id": "filthy_water",
            "posX": 62,
            "posY": 89,
            "emitRate": 13561.006,
            "idleTime": 332.05484,
            "eruptionTime": 209.31552,
            "dormancyCycles": 74.627235,
            "activeCycles": 108.01409
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
        "biomePaths": "Barren:96,54 84,54 77,62 84,75 96,76;15,63 19,53 13,46 0,47 0,65;28,74 36,62 29,52 19,53 15,63 23,75;84,75 77,62 67,62 61,77 77,83;23,75 15,63 0,65 0,80 18,81\nSandstone:61,77 67,62 61,54 51,55 46,62 51,76 58,78;51,76 46,62 36,62 28,74 39,82\nFrozenWastes:96,76 84,75 77,83 78,96 96,96;58,78 51,76 39,82 38,96 57,96;39,82 28,74 23,75 18,81 20,96 38,96;18,81 0,80 0,96 20,96;77,83 61,77 58,78 57,96 78,96",
        "pointsOfInterest": [
          {
            "id": "GravitasPedestal",
            "posX": 67,
            "posY": 81
          },
          {
            "id": "GravitasPedestal",
            "posX": 71,
            "posY": 81
          },
          {
            "id": "GeneShuffler",
            "posX": 69,
            "posY": 75
          }
        ],
        "geysers": [
          {
            "id": "hot_steam",
            "posX": 50,
            "posY": 82,
            "emitRate": 3982.7275,
            "idleTime": 299.5781,
            "eruptionTime": 158.19557,
            "dormancyCycles": 74.467224,
            "activeCycles": 69.90103
          },
          {
            "id": "steam",
            "posX": 28,
            "posY": 81,
            "emitRate": 5865.5107,
            "idleTime": 96.629524,
            "eruptionTime": 87.630775,
            "dormancyCycles": 43.0858,
            "activeCycles": 66.32143
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
        "q": -1,
        "r": -2
      },
      {
        "id": "TundraMoonlet",
        "q": 5,
        "r": -5
      },
      {
        "id": "MarshyMoonlet",
        "q": -6,
        "r": 2
      },
      {
        "id": "NiobiumMoonlet",
        "q": 3,
        "r": 2
      },
      {
        "id": "MooMoonlet",
        "q": -5,
        "r": 6
      },
      {
        "id": "WaterMoonlet",
        "q": 1,
        "r": -7
      },
      {
        "id": "MiniRegolithMoonlet",
        "q": -5,
        "r": -3
      },
      {
        "id": "TemporalTear",
        "q": 9,
        "r": -4
      },
      {
        "id": "HarvestableSpacePOI_SandyOreField",
        "q": -1,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_OrganicMassField",
        "q": 1,
        "r": 5
      },
      {
        "id": "HarvestableSpacePOI_HeliumCloud",
        "q": 1,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
        "q": 0,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_FrozenOreField",
        "q": 0,
        "r": -9
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": 1,
        "r": -10
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -9,
        "r": 1
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveGasCloud",
        "q": 7,
        "r": -11
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": 8,
        "r": 3
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 3,
        "r": -6
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": 4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": 2,
        "r": -5
      },
      {
        "id": "HarvestableSpacePOI_SwampyOreField",
        "q": -4,
        "r": -1
      },
      {
        "id": "HarvestableSpacePOI_ForestyOreField",
        "q": -3,
        "r": 7
      },
      {
        "id": "HarvestableSpacePOI_OxidizedAsteroidField",
        "q": 1,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_ChlorineCloud",
        "q": 2,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -4,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_SatelliteField",
        "q": -8,
        "r": 11
      },
      {
        "id": "HarvestableSpacePOI_OxygenRichAsteroidField",
        "q": -10,
        "r": 9
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": -10,
        "r": 10
      },
      {
        "id": "HarvestableSpacePOI_SaltyAsteroidField",
        "q": 9,
        "r": -8
      },
      {
        "id": "HarvestableSpacePOI_OilyAsteroidField",
        "q": -4,
        "r": -7
      },
      {
        "id": "HarvestableSpacePOI_GildedAsteroidField",
        "q": -8,
        "r": -3
      },
      {
        "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
        "q": -8,
        "r": -2
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation4",
        "q": 3,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_RussellsTeapot",
        "q": 11,
        "r": -1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation8",
        "q": 6,
        "r": 1
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation5",
        "q": -10,
        "r": 5
      },
      {
        "id": "ArtifactSpacePOI_GravitasSpaceStation7",
        "q": -2,
        "r": -5
      }
    ]
  }
]
""".trimIndent()
