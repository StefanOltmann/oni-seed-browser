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

val fakeJsonSearchResponse: String = """
    {
      "page": 0,
      "pageSize": 10,
      "totalPages": 100,
      "totalResults": 1000,
      "worlds": [
        {
          "coordinate": "SNDST-C-800782353-0-0-0",
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
                  "posX": 85,
                  "posY": 115
                },
                {
                  "id": "WarpConduitReceiver",
                  "posX": 119,
                  "posY": 99
                },
                {
                  "id": "WarpConduitSender",
                  "posX": 40,
                  "posY": 77
                },
                {
                  "id": "WarpPortal",
                  "posX": 106,
                  "posY": 163
                },
                {
                  "id": "WarpReceiver",
                  "posX": 107,
                  "posY": 157
                }
              ],
              "geysers": [
                {
                  "emitRate": 5730.30664,
                  "idleTime": 335.652161,
                  "eruptionTime": 267.509155,
                  "dormancyCycles": 47.57262,
                  "activeCycles": 72.9005051,
                  "id": "steam",
                  "posX": 131,
                  "posY": 61
                },
                {
                  "emitRate": 5610.22852,
                  "idleTime": 435.2997,
                  "eruptionTime": 409.334259,
                  "dormancyCycles": 40.9644127,
                  "activeCycles": 76.2679,
                  "id": "slush_salt_water",
                  "posX": 80,
                  "posY": 168
                },
                {
                  "emitRate": 5564.505,
                  "idleTime": 350.7011,
                  "eruptionTime": 315.5453,
                  "dormancyCycles": 55.3622665,
                  "activeCycles": 110.48143,
                  "id": "slush_water",
                  "posX": 139,
                  "posY": 149
                },
                {
                  "emitRate": 348.255371,
                  "idleTime": 268.904449,
                  "eruptionTime": 269.776031,
                  "dormancyCycles": 47.74834,
                  "activeCycles": 82.49559,
                  "id": "methane",
                  "posX": 104,
                  "posY": 84
                },
                {
                  "emitRate": 155172.813,
                  "idleTime": 8992.125,
                  "eruptionTime": 60.05321,
                  "dormancyCycles": 41.721386,
                  "activeCycles": 56.678894,
                  "id": "small_volcano",
                  "posX": 34,
                  "posY": 49
                },
                {
                  "emitRate": 104084.188,
                  "idleTime": 8541.996,
                  "eruptionTime": 75.99681,
                  "dormancyCycles": 40.137516,
                  "activeCycles": 61.7788353,
                  "id": "small_volcano",
                  "posX": 83,
                  "posY": 47
                },
                {
                  "emitRate": 137712.766,
                  "idleTime": 9195.643,
                  "eruptionTime": 77.75638,
                  "dormancyCycles": 36.8322525,
                  "activeCycles": 60.1309242,
                  "id": "small_volcano",
                  "posX": 63,
                  "posY": 34
                },
                {
                  "emitRate": 474.628326,
                  "idleTime": 285.599762,
                  "eruptionTime": 171.383423,
                  "dormancyCycles": 50.5250473,
                  "activeCycles": 91.1961,
                  "id": "hot_hydrogen",
                  "posX": 76,
                  "posY": 183
                },
                {
                  "emitRate": 1163.9989,
                  "idleTime": 539.1427,
                  "eruptionTime": 89.80678,
                  "dormancyCycles": 54.6634254,
                  "activeCycles": 81.406395,
                  "id": "hot_hydrogen",
                  "posX": 25,
                  "posY": 65
                },
                {
                  "emitRate": 214228.25,
                  "idleTime": 9197.481,
                  "eruptionTime": 64.19695,
                  "dormancyCycles": 66.10125,
                  "activeCycles": 81.02145,
                  "id": "big_volcano",
                  "posX": 18,
                  "posY": 171
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
                "BouldersMixed",
                "BouldersSmall"
              ],
              "pointsOfInterest": [],
              "geysers": [
                {
                  "emitRate": 8842.708,
                  "idleTime": 357.45932,
                  "eruptionTime": 355.40683,
                  "dormancyCycles": 46.8560028,
                  "activeCycles": 81.31434,
                  "id": "salt_water",
                  "posX": 322,
                  "posY": 72
                },
                {
                  "emitRate": 374.6345,
                  "idleTime": 258.112274,
                  "eruptionTime": 384.807526,
                  "dormancyCycles": 35.3464,
                  "activeCycles": 45.8901253,
                  "id": "liquid_co2",
                  "posX": 358,
                  "posY": 15
                },
                {
                  "emitRate": 476.175232,
                  "idleTime": 310.497559,
                  "eruptionTime": 310.106262,
                  "dormancyCycles": 56.7191,
                  "activeCycles": 72.4839859,
                  "id": "liquid_co2",
                  "posX": 268,
                  "posY": 23
                },
                {
                  "emitRate": 7997.88135,
                  "idleTime": 694.113342,
                  "eruptionTime": 39.45594,
                  "dormancyCycles": 40.5027847,
                  "activeCycles": 100.917252,
                  "id": "molten_aluminum",
                  "posX": 297,
                  "posY": 51
                },
                {
                  "emitRate": 6039.78027,
                  "idleTime": 749.957764,
                  "eruptionTime": 51.3985977,
                  "dormancyCycles": 43.4394951,
                  "activeCycles": 95.12373,
                  "id": "molten_gold",
                  "posX": 359,
                  "posY": 31
                },
                {
                  "emitRate": 11318.3076,
                  "idleTime": 557.6114,
                  "eruptionTime": 30.8986816,
                  "dormancyCycles": 55.60663,
                  "activeCycles": 52.65892,
                  "id": "molten_gold",
                  "posX": 337,
                  "posY": 51
                },
                {
                  "emitRate": 6152.31836,
                  "idleTime": 744.762,
                  "eruptionTime": 61.59952,
                  "dormancyCycles": 46.98588,
                  "activeCycles": 73.80041,
                  "id": "molten_aluminum",
                  "posX": 280,
                  "posY": 76
                },
                {
                  "emitRate": 340.782837,
                  "idleTime": 239.791122,
                  "eruptionTime": 257.140961,
                  "dormancyCycles": 61.0039444,
                  "activeCycles": 71.1795959,
                  "id": "hot_po2",
                  "posX": 280,
                  "posY": 44
                },
                {
                  "emitRate": 154238.547,
                  "idleTime": 9230.651,
                  "eruptionTime": 58.4679375,
                  "dormancyCycles": 48.3519363,
                  "activeCycles": 100.466515,
                  "id": "small_volcano",
                  "posX": 301,
                  "posY": 38
                },
                {
                  "emitRate": 8278.502,
                  "idleTime": 726.7366,
                  "eruptionTime": 40.94889,
                  "dormancyCycles": 39.7135429,
                  "activeCycles": 113.756325,
                  "id": "molten_copper",
                  "posX": 356,
                  "posY": 105
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
                "MetalPoor"
              ],
              "pointsOfInterest": [
                {
                  "id": "MassiveHeatSink",
                  "posX": 487,
                  "posY": 94
                },
                {
                  "id": "WarpConduitSender",
                  "posX": 453,
                  "posY": 92
                },
                {
                  "id": "WarpConduitReceiver",
                  "posX": 434,
                  "posY": 52
                },
                {
                  "id": "WarpReceiver",
                  "posX": 439,
                  "posY": 82
                },
                {
                  "id": "WarpPortal",
                  "posX": 417,
                  "posY": 82
                },
                {
                  "id": "GeneShuffler",
                  "posX": 407,
                  "posY": 65
                }
              ],
              "geysers": [
                {
                  "emitRate": 4313.582,
                  "idleTime": 304.609833,
                  "eruptionTime": 369.6119,
                  "dormancyCycles": 69.76982,
                  "activeCycles": 102.674057,
                  "id": "liquid_sulfur",
                  "posX": 475,
                  "posY": 38
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 448,
                  "posY": 23
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 477,
                  "posY": 25
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 463,
                  "posY": 22
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 491,
                  "posY": 22
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 391,
                  "posY": 25
                },
                {
                  "emitRate": 290.7918,
                  "idleTime": 236.190247,
                  "eruptionTime": 277.799438,
                  "dormancyCycles": 46.24978,
                  "activeCycles": 69.64249,
                  "id": "hot_co2",
                  "posX": 424,
                  "posY": 16
                },
                {
                  "emitRate": 5097.579,
                  "idleTime": 410.874847,
                  "eruptionTime": 349.7078,
                  "dormancyCycles": 36.7617531,
                  "activeCycles": 83.54114,
                  "id": "liquid_sulfur",
                  "posX": 473,
                  "posY": 61
                },
                {
                  "emitRate": 121511.023,
                  "idleTime": 8209.771,
                  "eruptionTime": 60.6881332,
                  "dormancyCycles": 60.03907,
                  "activeCycles": 83.8303452,
                  "id": "small_volcano",
                  "posX": 385,
                  "posY": 99
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
                "LushCore",
                "DistressSignal"
              ],
              "pointsOfInterest": [],
              "geysers": [
                {
                  "emitRate": 8814.981,
                  "idleTime": 842.4836,
                  "eruptionTime": 52.57859,
                  "dormancyCycles": 40.4765663,
                  "activeCycles": 68.77276,
                  "id": "molten_iron",
                  "posX": 174,
                  "posY": 200
                },
                {
                  "emitRate": 11258.2666,
                  "idleTime": 655.4837,
                  "eruptionTime": 28.8375149,
                  "dormancyCycles": 45.095192,
                  "activeCycles": 62.1589,
                  "id": "molten_iron",
                  "posX": 203,
                  "posY": 199
                },
                {
                  "emitRate": 6823.41943,
                  "idleTime": 645.459351,
                  "eruptionTime": 59.479538,
                  "dormancyCycles": 57.0480537,
                  "activeCycles": 86.09007,
                  "id": "molten_iron",
                  "posX": 180,
                  "posY": 229
                },
                {
                  "emitRate": 8076.829,
                  "idleTime": 777.6268,
                  "eruptionTime": 50.6777763,
                  "dormancyCycles": 30.3227482,
                  "activeCycles": 47.5203323,
                  "id": "molten_iron",
                  "posX": 183,
                  "posY": 204
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
                  "posX": 267,
                  "posY": 226
                }
              ],
              "geysers": [
                {
                  "emitRate": 17942.4316,
                  "idleTime": 789.433838,
                  "eruptionTime": 24.8974552,
                  "dormancyCycles": 30.51959,
                  "activeCycles": 71.13475,
                  "id": "molten_tungsten",
                  "posX": 268,
                  "posY": 204
                },
                {
                  "emitRate": 7074.23,
                  "idleTime": 686.2494,
                  "eruptionTime": 48.8770523,
                  "dormancyCycles": 49.332428,
                  "activeCycles": 92.78291,
                  "id": "molten_tungsten",
                  "posX": 238,
                  "posY": 185
                },
                {
                  "emitRate": 7968.897,
                  "idleTime": 650.775757,
                  "eruptionTime": 45.78785,
                  "dormancyCycles": 15.7060528,
                  "activeCycles": 30.5438862,
                  "id": "molten_tungsten",
                  "posX": 262,
                  "posY": 181
                },
                {
                  "emitRate": 341.878754,
                  "idleTime": 316.61203,
                  "eruptionTime": 261.221832,
                  "dormancyCycles": 39.7135429,
                  "activeCycles": 113.756325,
                  "id": "hot_hydrogen",
                  "posX": 239,
                  "posY": 222
                },
                {
                  "emitRate": 454.769775,
                  "idleTime": 447.2085,
                  "eruptionTime": 282.137634,
                  "dormancyCycles": 48.38964,
                  "activeCycles": 62.47309,
                  "id": "hot_co2",
                  "posX": 251,
                  "posY": 184
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
                  "emitRate": 437.554,
                  "idleTime": 351.025879,
                  "eruptionTime": 231.4467,
                  "dormancyCycles": 57.6215935,
                  "activeCycles": 98.04666,
                  "id": "chlorine_gas",
                  "posX": 588,
                  "posY": 23
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
                  "emitRate": 4613.907,
                  "idleTime": 292.87326,
                  "eruptionTime": 332.056122,
                  "dormancyCycles": 66.13168,
                  "activeCycles": 102.590347,
                  "id": "slush_water",
                  "posX": 190,
                  "posY": 84
                },
                {
                  "emitRate": 14130.9453,
                  "idleTime": 461.999084,
                  "eruptionTime": 216.909225,
                  "dormancyCycles": 56.8054543,
                  "activeCycles": 80.22411,
                  "id": "salt_water",
                  "posX": 213,
                  "posY": 116
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
              "pointsOfInterest": [],
              "geysers": [
                {
                  "emitRate": 249859.7,
                  "idleTime": 8706.993,
                  "eruptionTime": 72.3710251,
                  "dormancyCycles": 43.20163,
                  "activeCycles": 72.4345,
                  "id": "molten_niobium",
                  "posX": 348,
                  "posY": 181
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
                  "posX": 432,
                  "posY": 192
                }
              ],
              "geysers": [
                {
                  "emitRate": 3125.342,
                  "idleTime": 183.824326,
                  "eruptionTime": 114.913704,
                  "dormancyCycles": 39.811264,
                  "activeCycles": 69.81801,
                  "id": "hot_steam",
                  "posX": 371,
                  "posY": 167
                },
                {
                  "emitRate": 5018.763,
                  "idleTime": 470.875732,
                  "eruptionTime": 273.480957,
                  "dormancyCycles": 59.14207,
                  "activeCycles": 78.86677,
                  "id": "steam",
                  "posX": 399,
                  "posY": 169
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
              "q": -1,
              "r": 5
            },
            {
              "id": "TundraMoonlet",
              "q": 8,
              "r": -2
            },
            {
              "id": "MarshyMoonlet",
              "q": -6,
              "r": 2
            },
            {
              "id": "MooMoonlet",
              "q": -2,
              "r": -5
            },
            {
              "id": "WaterMoonlet",
              "q": -7,
              "r": 8
            },
            {
              "id": "NiobiumMoonlet",
              "q": -9,
              "r": -1
            },
            {
              "id": "RegolithMoonlet",
              "q": 8,
              "r": -9
            },
            {
              "id": "TemporalTear",
              "q": -5,
              "r": -6
            },
            {
              "id": "HarvestableSpacePOI_SandyOreField",
              "q": -3,
              "r": 1
            },
            {
              "id": "HarvestableSpacePOI_OrganicMassField",
              "q": 5,
              "r": -2
            },
            {
              "id": "HarvestableSpacePOI_GildedAsteroidField",
              "q": 1,
              "r": -8
            },
            {
              "id": "HarvestableSpacePOI_HeliumCloud",
              "q": 9,
              "r": 2
            },
            {
              "id": "HarvestableSpacePOI_OilyAsteroidField",
              "q": -2,
              "r": 8
            },
            {
              "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
              "q": 0,
              "r": 10
            },
            {
              "id": "HarvestableSpacePOI_FrozenOreField",
              "q": 9,
              "r": -5
            },
            {
              "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
              "q": -11,
              "r": 6
            },
            {
              "id": "HarvestableSpacePOI_RadioactiveGasCloud",
              "q": -11,
              "r": 11
            },
            {
              "id": "HarvestableSpacePOI_RockyAsteroidField",
              "q": -6,
              "r": 5
            },
            {
              "id": "HarvestableSpacePOI_ForestyOreField",
              "q": 3,
              "r": 2
            },
            {
              "id": "HarvestableSpacePOI_ForestyOreField",
              "q": 2,
              "r": 3
            },
            {
              "id": "HarvestableSpacePOI_RockyAsteroidField",
              "q": 5,
              "r": -6
            },
            {
              "id": "HarvestableSpacePOI_InterstellarOcean",
              "q": -7,
              "r": 0
            },
            {
              "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
              "q": 6,
              "r": -10
            },
            {
              "id": "HarvestableSpacePOI_SatelliteField",
              "q": 5,
              "r": -9
            },
            {
              "id": "HarvestableSpacePOI_GildedAsteroidField",
              "q": 11,
              "r": -11
            },
            {
              "id": "HarvestableSpacePOI_HeliumCloud",
              "q": 11,
              "r": -10
            },
            {
              "id": "HarvestableSpacePOI_HeliumCloud",
              "q": -6,
              "r": 10
            },
            {
              "id": "HarvestableSpacePOI_OilyAsteroidField",
              "q": 4,
              "r": 6
            },
            {
              "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
              "q": 3,
              "r": 6
            },
            {
              "id": "HarvestableSpacePOI_OilyAsteroidField",
              "q": -11,
              "r": 2
            },
            {
              "id": "HarvestableSpacePOI_CarbonAsteroidField",
              "q": 11,
              "r": -3
            },
            {
              "id": "HarvestableSpacePOI_IceAsteroidField",
              "q": 11,
              "r": -2
            },
            {
              "id": "ArtifactSpacePOI_RussellsTeapot",
              "q": -1,
              "r": -10
            }
          ]
        },
        {
          "coordinate": "SNDST-C-1092712414-0-0-0",
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
                  "posX": 71,
                  "posY": 122
                },
                {
                  "id": "WarpConduitReceiver",
                  "posX": 110,
                  "posY": 111
                },
                {
                  "id": "WarpConduitSender",
                  "posX": 51,
                  "posY": 88
                },
                {
                  "id": "WarpPortal",
                  "posX": 68,
                  "posY": 156
                },
                {
                  "id": "WarpReceiver",
                  "posX": 69,
                  "posY": 150
                },
                {
                  "id": "GeneShuffler",
                  "posX": 96,
                  "posY": 84
                }
              ],
              "geysers": [
                {
                  "emitRate": 4729.97949,
                  "idleTime": 154.240738,
                  "eruptionTime": 205.916275,
                  "dormancyCycles": 40.86342,
                  "activeCycles": 99.73037,
                  "id": "steam",
                  "posX": 78,
                  "posY": 65
                },
                {
                  "emitRate": 8889.553,
                  "idleTime": 242.078247,
                  "eruptionTime": 109.667656,
                  "dormancyCycles": 46.02836,
                  "activeCycles": 69.1475143,
                  "id": "slush_salt_water",
                  "posX": 58,
                  "posY": 177
                },
                {
                  "emitRate": 21080.9238,
                  "idleTime": 580.729065,
                  "eruptionTime": 107.525352,
                  "dormancyCycles": 32.45741,
                  "activeCycles": 34.908287,
                  "id": "slush_water",
                  "posX": 110,
                  "posY": 175
                },
                {
                  "emitRate": 832.7637,
                  "idleTime": 485.833,
                  "eruptionTime": 116.402344,
                  "dormancyCycles": 29.0250225,
                  "activeCycles": 45.3771858,
                  "id": "methane",
                  "posX": 21,
                  "posY": 161
                },
                {
                  "emitRate": 142687.141,
                  "idleTime": 8975.585,
                  "eruptionTime": 60.4979248,
                  "dormancyCycles": 39.1260757,
                  "activeCycles": 80.18359,
                  "id": "small_volcano",
                  "posX": 123,
                  "posY": 42
                },
                {
                  "emitRate": 129912.594,
                  "idleTime": 8641.378,
                  "eruptionTime": 64.51098,
                  "dormancyCycles": 69.1641541,
                  "activeCycles": 99.10234,
                  "id": "small_volcano",
                  "posX": 101,
                  "posY": 43
                },
                {
                  "emitRate": 170538.656,
                  "idleTime": 9267.508,
                  "eruptionTime": 66.00069,
                  "dormancyCycles": 56.4240379,
                  "activeCycles": 69.7476959,
                  "id": "small_volcano",
                  "posX": 84,
                  "posY": 44
                },
                {
                  "emitRate": 3962.962,
                  "idleTime": 235.772522,
                  "eruptionTime": 215.373291,
                  "dormancyCycles": 33.454628,
                  "activeCycles": 80.25537,
                  "id": "steam",
                  "posX": 120,
                  "posY": 54
                },
                {
                  "emitRate": 5778.935,
                  "idleTime": 453.6509,
                  "eruptionTime": 299.308258,
                  "dormancyCycles": 60.49862,
                  "activeCycles": 82.08148,
                  "id": "steam",
                  "posX": 15,
                  "posY": 100
                },
                {
                  "emitRate": 253975.828,
                  "idleTime": 7295.948,
                  "eruptionTime": 59.77159,
                  "dormancyCycles": 45.3319321,
                  "activeCycles": 87.30213,
                  "id": "big_volcano",
                  "posX": 94,
                  "posY": 175
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
              "pointsOfInterest": [],
              "geysers": [
                {
                  "emitRate": 13166.0225,
                  "idleTime": 247.653412,
                  "eruptionTime": 150.51709,
                  "dormancyCycles": 30.6693363,
                  "activeCycles": 60.6982155,
                  "id": "salt_water",
                  "posX": 305,
                  "posY": 46
                },
                {
                  "emitRate": 605.7656,
                  "idleTime": 394.691254,
                  "eruptionTime": 323.07077,
                  "dormancyCycles": 60.0745049,
                  "activeCycles": 66.95237,
                  "id": "liquid_co2",
                  "posX": 350,
                  "posY": 17
                },
                {
                  "emitRate": 286.140137,
                  "idleTime": 219.382233,
                  "eruptionTime": 339.5878,
                  "dormancyCycles": 47.9857521,
                  "activeCycles": 65.1899643,
                  "id": "liquid_co2",
                  "posX": 336,
                  "posY": 16
                },
                {
                  "emitRate": 7354.501,
                  "idleTime": 610.1167,
                  "eruptionTime": 37.37591,
                  "dormancyCycles": 48.4460526,
                  "activeCycles": 67.32089,
                  "id": "molten_gold",
                  "posX": 278,
                  "posY": 32
                },
                {
                  "emitRate": 6364.743,
                  "idleTime": 604.420654,
                  "eruptionTime": 48.0183525,
                  "dormancyCycles": 51.2940521,
                  "activeCycles": 65.05836,
                  "id": "molten_aluminum",
                  "posX": 347,
                  "posY": 38
                },
                {
                  "emitRate": 8760.886,
                  "idleTime": 684.7762,
                  "eruptionTime": 37.25907,
                  "dormancyCycles": 46.9864044,
                  "activeCycles": 56.8642921,
                  "id": "molten_gold",
                  "posX": 266,
                  "posY": 48
                },
                {
                  "emitRate": 7630.441,
                  "idleTime": 716.677063,
                  "eruptionTime": 53.98587,
                  "dormancyCycles": 35.6797638,
                  "activeCycles": 65.7906647,
                  "id": "molten_aluminum",
                  "posX": 286,
                  "posY": 56
                },
                {
                  "emitRate": 351.569824,
                  "idleTime": 195.756851,
                  "eruptionTime": 208.827316,
                  "dormancyCycles": 33.902317,
                  "activeCycles": 58.743515,
                  "id": "methane",
                  "posX": 342,
                  "posY": 84
                },
                {
                  "emitRate": 566.6629,
                  "idleTime": 449.032776,
                  "eruptionTime": 226.419174,
                  "dormancyCycles": 48.43676,
                  "activeCycles": 117.2506,
                  "id": "hot_po2",
                  "posX": 348,
                  "posY": 63
                },
                {
                  "emitRate": 875.9633,
                  "idleTime": 193.913055,
                  "eruptionTime": 49.5614853,
                  "dormancyCycles": 76.87705,
                  "activeCycles": 80.78725,
                  "id": "hot_hydrogen",
                  "posX": 327,
                  "posY": 51
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
                "Geodes",
                "CrashedSatellites"
              ],
              "pointsOfInterest": [
                {
                  "id": "MassiveHeatSink",
                  "posX": 458,
                  "posY": 53
                },
                {
                  "id": "WarpConduitSender",
                  "posX": 463,
                  "posY": 81
                },
                {
                  "id": "WarpConduitReceiver",
                  "posX": 419,
                  "posY": 46
                },
                {
                  "id": "WarpReceiver",
                  "posX": 443,
                  "posY": 77
                },
                {
                  "id": "WarpPortal",
                  "posX": 421,
                  "posY": 77
                },
                {
                  "id": "GeneShuffler",
                  "posX": 392,
                  "posY": 73
                }
              ],
              "geysers": [
                {
                  "emitRate": 4125.6123,
                  "idleTime": 309.219177,
                  "eruptionTime": 532.8636,
                  "dormancyCycles": 58.6299362,
                  "activeCycles": 76.00643,
                  "id": "liquid_sulfur",
                  "posX": 391,
                  "posY": 14
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 477,
                  "posY": 26
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 395,
                  "posY": 23
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 489,
                  "posY": 19
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 439,
                  "posY": 20
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 464,
                  "posY": 26
                },
                {
                  "emitRate": 8250.107,
                  "idleTime": 271.082855,
                  "eruptionTime": 150.064682,
                  "dormancyCycles": 39.8596077,
                  "activeCycles": 85.36193,
                  "id": "liquid_sulfur",
                  "posX": 389,
                  "posY": 95
                },
                {
                  "emitRate": 266.100861,
                  "idleTime": 218.729019,
                  "eruptionTime": 258.863037,
                  "dormancyCycles": 55.4250374,
                  "activeCycles": 87.65227,
                  "id": "chlorine_gas",
                  "posX": 465,
                  "posY": 67
                },
                {
                  "emitRate": 238.970047,
                  "idleTime": 245.740479,
                  "eruptionTime": 369.956482,
                  "dormancyCycles": 51.2060623,
                  "activeCycles": 70.3269043,
                  "id": "methane",
                  "posX": 405,
                  "posY": 60
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
                  "emitRate": 7211.2627,
                  "idleTime": 677.07074,
                  "eruptionTime": 49.8442841,
                  "dormancyCycles": 55.2071533,
                  "activeCycles": 76.3596954,
                  "id": "molten_iron",
                  "posX": 176,
                  "posY": 196
                },
                {
                  "emitRate": 6408.42725,
                  "idleTime": 718.9269,
                  "eruptionTime": 59.0385628,
                  "dormancyCycles": 78.46217,
                  "activeCycles": 96.17429,
                  "id": "molten_iron",
                  "posX": 210,
                  "posY": 248
                },
                {
                  "emitRate": 8133.931,
                  "idleTime": 812.876953,
                  "eruptionTime": 57.5187149,
                  "dormancyCycles": 48.29116,
                  "activeCycles": 70.28241,
                  "id": "molten_iron",
                  "posX": 210,
                  "posY": 222
                },
                {
                  "emitRate": 13183.0908,
                  "idleTime": 788.0811,
                  "eruptionTime": 33.836586,
                  "dormancyCycles": 48.43676,
                  "activeCycles": 117.2506,
                  "id": "molten_iron",
                  "posX": 211,
                  "posY": 200
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
                  "posX": 264,
                  "posY": 237
                }
              ],
              "geysers": [
                {
                  "emitRate": 8739.246,
                  "idleTime": 651.993042,
                  "eruptionTime": 34.00002,
                  "dormancyCycles": 68.63961,
                  "activeCycles": 88.48293,
                  "id": "molten_tungsten",
                  "posX": 254,
                  "posY": 213
                },
                {
                  "emitRate": 7422.05127,
                  "idleTime": 909.3592,
                  "eruptionTime": 60.9754524,
                  "dormancyCycles": 68.74922,
                  "activeCycles": 75.70726,
                  "id": "molten_tungsten",
                  "posX": 247,
                  "posY": 182
                },
                {
                  "emitRate": 7298.216,
                  "idleTime": 741.687439,
                  "eruptionTime": 62.96102,
                  "dormancyCycles": 62.9065437,
                  "activeCycles": 74.9675751,
                  "id": "molten_tungsten",
                  "posX": 256,
                  "posY": 182
                },
                {
                  "emitRate": 431.980072,
                  "idleTime": 655.876343,
                  "eruptionTime": 451.499176,
                  "dormancyCycles": 41.2276421,
                  "activeCycles": 54.25735,
                  "id": "hot_co2",
                  "posX": 273,
                  "posY": 214
                },
                {
                  "emitRate": 312.284821,
                  "idleTime": 252.419479,
                  "eruptionTime": 387.4532,
                  "dormancyCycles": 38.9361153,
                  "activeCycles": 73.07139,
                  "id": "hot_hydrogen",
                  "posX": 252,
                  "posY": 203
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
                  "emitRate": 280.118561,
                  "idleTime": 234.907761,
                  "eruptionTime": 317.8028,
                  "dormancyCycles": 32.9553337,
                  "activeCycles": 72.87092,
                  "id": "chlorine_gas",
                  "posX": 589,
                  "posY": 39
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
                  "emitRate": 9250.602,
                  "idleTime": 363.823029,
                  "eruptionTime": 536.115662,
                  "dormancyCycles": 59.75541,
                  "activeCycles": 83.2288,
                  "id": "filthy_water",
                  "posX": 219,
                  "posY": 60
                },
                {
                  "emitRate": 4031.178,
                  "idleTime": 255.524445,
                  "eruptionTime": 458.8539,
                  "dormancyCycles": 55.48106,
                  "activeCycles": 70.9990158,
                  "id": "slush_water",
                  "posX": 217,
                  "posY": 75
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
              "pointsOfInterest": [],
              "geysers": [
                {
                  "emitRate": 275986.344,
                  "idleTime": 8407.329,
                  "eruptionTime": 64.1876,
                  "dormancyCycles": 38.51284,
                  "activeCycles": 67.63683,
                  "id": "molten_niobium",
                  "posX": 338,
                  "posY": 201
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
                  "posX": 479,
                  "posY": 180
                }
              ],
              "geysers": [
                {
                  "emitRate": 1717.58765,
                  "idleTime": 132.341965,
                  "eruptionTime": 403.81662,
                  "dormancyCycles": 43.21996,
                  "activeCycles": 48.31691,
                  "id": "hot_steam",
                  "posX": 438,
                  "posY": 166
                },
                {
                  "emitRate": 5003.17529,
                  "idleTime": 213.212738,
                  "eruptionTime": 239.73288,
                  "dormancyCycles": 49.49122,
                  "activeCycles": 59.10652,
                  "id": "steam",
                  "posX": 508,
                  "posY": 167
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
              "q": 2,
              "r": -3
            },
            {
              "id": "WarpOilySwamp",
              "q": -5,
              "r": 3
            },
            {
              "id": "TundraMoonlet",
              "q": -4,
              "r": -3
            },
            {
              "id": "MarshyMoonlet",
              "q": 7,
              "r": 0
            },
            {
              "id": "MooMoonlet",
              "q": 2,
              "r": -7
            },
            {
              "id": "WaterMoonlet",
              "q": -7,
              "r": 8
            },
            {
              "id": "NiobiumMoonlet",
              "q": -9,
              "r": 1
            },
            {
              "id": "RegolithMoonlet",
              "q": 2,
              "r": 6
            },
            {
              "id": "TemporalTear",
              "q": -2,
              "r": -9
            },
            {
              "id": "HarvestableSpacePOI_SandyOreField",
              "q": 3,
              "r": 0
            },
            {
              "id": "HarvestableSpacePOI_OrganicMassField",
              "q": 0,
              "r": 5
            },
            {
              "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
              "q": 8,
              "r": -7
            },
            {
              "id": "HarvestableSpacePOI_GildedAsteroidField",
              "q": 11,
              "r": -3
            },
            {
              "id": "HarvestableSpacePOI_FrozenOreField",
              "q": 11,
              "r": -2
            },
            {
              "id": "HarvestableSpacePOI_OilyAsteroidField",
              "q": 10,
              "r": -1
            },
            {
              "id": "HarvestableSpacePOI_HeliumCloud",
              "q": 11,
              "r": -4
            },
            {
              "id": "HarvestableSpacePOI_RadioactiveAsteroidField",
              "q": 3,
              "r": -10
            },
            {
              "id": "HarvestableSpacePOI_RadioactiveGasCloud",
              "q": 9,
              "r": -11
            },
            {
              "id": "HarvestableSpacePOI_OrganicMassField",
              "q": -4,
              "r": 6
            },
            {
              "id": "HarvestableSpacePOI_SwampyOreField",
              "q": -3,
              "r": 6
            },
            {
              "id": "HarvestableSpacePOI_InterstellarIceField",
              "q": -3,
              "r": 7
            },
            {
              "id": "HarvestableSpacePOI_ForestyOreField",
              "q": 4,
              "r": 3
            },
            {
              "id": "HarvestableSpacePOI_InterstellarIceField",
              "q": -5,
              "r": 0
            },
            {
              "id": "HarvestableSpacePOI_RadioactiveGasCloud",
              "q": -8,
              "r": 5
            },
            {
              "id": "HarvestableSpacePOI_GasGiantCloud",
              "q": -8,
              "r": 4
            },
            {
              "id": "HarvestableSpacePOI_MetallicAsteroidField",
              "q": -10,
              "r": 11
            },
            {
              "id": "HarvestableSpacePOI_CarbonAsteroidField",
              "q": -7,
              "r": -4
            },
            {
              "id": "HarvestableSpacePOI_ChlorineCloud",
              "q": -6,
              "r": -4
            },
            {
              "id": "HarvestableSpacePOI_GasGiantCloud",
              "q": -2,
              "r": 10
            },
            {
              "id": "HarvestableSpacePOI_GlimmeringAsteroidField",
              "q": -1,
              "r": 9
            },
            {
              "id": "HarvestableSpacePOI_SatelliteField",
              "q": -3,
              "r": 10
            },
            {
              "id": "HarvestableSpacePOI_GildedAsteroidField",
              "q": -1,
              "r": 8
            },
            {
              "id": "HarvestableSpacePOI_SaltyAsteroidField",
              "q": 7,
              "r": -3
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
            },
            {
              "id": "ArtifactSpacePOI_GravitasSpaceStation7",
              "q": 4,
              "r": -6
            },
            {
              "id": "ArtifactSpacePOI_GravitasSpaceStation5",
              "q": -11,
              "r": 0
            },
            {
              "id": "ArtifactSpacePOI_GravitasSpaceStation3",
              "q": -1,
              "r": -6
            }
          ]
        },
        {
          "coordinate": "BAD-A-233578862-0-0",
          "cluster": "BAD-A",
          "dlcs": [
            "SpacedOut",
            "FrostyPlanet"
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
                  "posX": 81,
                  "posY": 118
                },
                {
                  "id": "WarpConduitSender",
                  "posX": 27,
                  "posY": 125
                },
                {
                  "id": "WarpConduitReceiver",
                  "posX": 36,
                  "posY": 92
                },
                {
                  "id": "WarpPortal",
                  "posX": 125,
                  "posY": 117
                },
                {
                  "id": "WarpReceiver",
                  "posX": 126,
                  "posY": 111
                }
              ],
              "geysers": [
                {
                  "emitRate": 9709.374,
                  "idleTime": 296.35672,
                  "eruptionTime": 114.018379,
                  "dormancyCycles": 56.0820961,
                  "activeCycles": 97.62378,
                  "id": "steam",
                  "posX": 135,
                  "posY": 89
                },
                {
                  "emitRate": 5108.88672,
                  "idleTime": 252.654419,
                  "eruptionTime": 246.426147,
                  "dormancyCycles": 51.0973663,
                  "activeCycles": 79.90547,
                  "id": "slush_water",
                  "posX": 90,
                  "posY": 189
                },
                {
                  "emitRate": 8482.265,
                  "idleTime": 368.7467,
                  "eruptionTime": 183.49939,
                  "dormancyCycles": 41.9170837,
                  "activeCycles": 70.0096741,
                  "id": "slush_salt_water",
                  "posX": 19,
                  "posY": 165
                },
                {
                  "emitRate": 239.567261,
                  "idleTime": 189.446213,
                  "eruptionTime": 464.319366,
                  "dormancyCycles": 61.91021,
                  "activeCycles": 85.14461,
                  "id": "methane",
                  "posX": 114,
                  "posY": 180
                },
                {
                  "emitRate": 133791.469,
                  "idleTime": 7711.32666,
                  "eruptionTime": 56.5961151,
                  "dormancyCycles": 38.9392052,
                  "activeCycles": 49.6222,
                  "id": "small_volcano",
                  "posX": 143,
                  "posY": 40
                },
                {
                  "emitRate": 117155.016,
                  "idleTime": 10810.6924,
                  "eruptionTime": 85.65657,
                  "dormancyCycles": 54.3534279,
                  "activeCycles": 69.47008,
                  "id": "small_volcano",
                  "posX": 109,
                  "posY": 43
                },
                {
                  "emitRate": 126437.773,
                  "idleTime": 8093.62354,
                  "eruptionTime": 61.1742249,
                  "dormancyCycles": 57.1550179,
                  "activeCycles": 56.5559425,
                  "id": "small_volcano",
                  "posX": 121,
                  "posY": 35
                },
                {
                  "emitRate": 295.495483,
                  "idleTime": 332.62735,
                  "eruptionTime": 492.573639,
                  "dormancyCycles": 94.40097,
                  "activeCycles": 101.218811,
                  "id": "hot_po2",
                  "posX": 75,
                  "posY": 70
                },
                {
                  "emitRate": 315.491028,
                  "idleTime": 165.527557,
                  "eruptionTime": 259.92218,
                  "dormancyCycles": 51.7394867,
                  "activeCycles": 78.9459457,
                  "id": "hot_po2",
                  "posX": 79,
                  "posY": 36
                },
                {
                  "emitRate": 449.487946,
                  "idleTime": 166.98497,
                  "eruptionTime": 204.213516,
                  "dormancyCycles": 51.14357,
                  "activeCycles": 90.82344,
                  "id": "liquid_co2",
                  "posX": 97,
                  "posY": 178
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
                "Geodes"
              ],
              "pointsOfInterest": [],
              "geysers": [
                {
                  "emitRate": 9561.395,
                  "idleTime": 232.215363,
                  "eruptionTime": 344.899384,
                  "dormancyCycles": 58.8353043,
                  "activeCycles": 91.5944443,
                  "id": "salt_water",
                  "posX": 279,
                  "posY": 62
                },
                {
                  "emitRate": 486.786346,
                  "idleTime": 254.833435,
                  "eruptionTime": 317.941223,
                  "dormancyCycles": 53.3194122,
                  "activeCycles": 68.4542542,
                  "id": "liquid_co2",
                  "posX": 325,
                  "posY": 33
                },
                {
                  "emitRate": 636.3901,
                  "idleTime": 229.180222,
                  "eruptionTime": 163.837234,
                  "dormancyCycles": 27.4197979,
                  "activeCycles": 63.94983,
                  "id": "liquid_co2",
                  "posX": 312,
                  "posY": 21
                },
                {
                  "emitRate": 7193.40527,
                  "idleTime": 689.0346,
                  "eruptionTime": 49.97238,
                  "dormancyCycles": 33.75622,
                  "activeCycles": 53.454567,
                  "id": "molten_aluminum",
                  "posX": 311,
                  "posY": 50
                },
                {
                  "emitRate": 14701.6807,
                  "idleTime": 754.341736,
                  "eruptionTime": 30.8445663,
                  "dormancyCycles": 44.76565,
                  "activeCycles": 75.6616,
                  "id": "molten_gold",
                  "posX": 267,
                  "posY": 30
                },
                {
                  "emitRate": 7935.261,
                  "idleTime": 780.5782,
                  "eruptionTime": 54.99107,
                  "dormancyCycles": 54.98772,
                  "activeCycles": 90.91191,
                  "id": "molten_gold",
                  "posX": 260,
                  "posY": 48
                },
                {
                  "emitRate": 7911.90137,
                  "idleTime": 797.5543,
                  "eruptionTime": 49.97524,
                  "dormancyCycles": 64.5803146,
                  "activeCycles": 97.04227,
                  "id": "molten_aluminum",
                  "posX": 293,
                  "posY": 39
                },
                {
                  "emitRate": 285.5173,
                  "idleTime": 313.289551,
                  "eruptionTime": 399.02417,
                  "dormancyCycles": 36.374588,
                  "activeCycles": 62.07093,
                  "id": "methane",
                  "posX": 343,
                  "posY": 98
                },
                {
                  "emitRate": 141670.984,
                  "idleTime": 9719.76,
                  "eruptionTime": 75.20136,
                  "dormancyCycles": 45.66538,
                  "activeCycles": 90.43273,
                  "id": "small_volcano",
                  "posX": 355,
                  "posY": 93
                },
                {
                  "emitRate": 7224.45654,
                  "idleTime": 155.223923,
                  "eruptionTime": 266.436157,
                  "dormancyCycles": 63.083683,
                  "activeCycles": 92.84392,
                  "id": "filthy_water",
                  "posX": 328,
                  "posY": 46
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
                "CrashedSatellites",
                "DeepOil"
              ],
              "pointsOfInterest": [
                {
                  "id": "MassiveHeatSink",
                  "posX": 391,
                  "posY": 74
                },
                {
                  "id": "WarpConduitReceiver",
                  "posX": 414,
                  "posY": 89
                },
                {
                  "id": "WarpConduitSender",
                  "posX": 467,
                  "posY": 50
                },
                {
                  "id": "WarpReceiver",
                  "posX": 453,
                  "posY": 68
                },
                {
                  "id": "WarpPortal",
                  "posX": 431,
                  "posY": 68
                }
              ],
              "geysers": [
                {
                  "emitRate": 3919.38843,
                  "idleTime": 211.078827,
                  "eruptionTime": 379.2455,
                  "dormancyCycles": 40.4794769,
                  "activeCycles": 90.03418,
                  "id": "liquid_sulfur",
                  "posX": 433,
                  "posY": 24
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 384,
                  "posY": 24
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 475,
                  "posY": 25
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 406,
                  "posY": 25
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 444,
                  "posY": 22
                },
                {
                  "emitRate": 6427.75049,
                  "idleTime": 314.479675,
                  "eruptionTime": 254.258911,
                  "dormancyCycles": 60.0544,
                  "activeCycles": 81.01063,
                  "id": "liquid_sulfur",
                  "posX": 434,
                  "posY": 108
                },
                {
                  "emitRate": 134446.813,
                  "idleTime": 7413.67432,
                  "eruptionTime": 55.82335,
                  "dormancyCycles": 53.80948,
                  "activeCycles": 55.0878372,
                  "id": "small_volcano",
                  "posX": 470,
                  "posY": 98
                },
                {
                  "emitRate": 5957.275,
                  "idleTime": 308.463257,
                  "eruptionTime": 202.5788,
                  "dormancyCycles": 70.05971,
                  "activeCycles": 63.22675,
                  "id": "liquid_sulfur",
                  "posX": 492,
                  "posY": 87
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 415,
                  "posY": 33
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 404,
                  "posY": 28
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 406,
                  "posY": 34
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 493,
                  "posY": 28
                },
                {
                  "emitRate": 3333.33,
                  "idleTime": 0,
                  "eruptionTime": 1,
                  "dormancyCycles": 0,
                  "activeCycles": 1,
                  "id": "OilWell",
                  "posX": 489,
                  "posY": 34
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
                  "emitRate": 6709.23145,
                  "idleTime": 767.1997,
                  "eruptionTime": 63.83361,
                  "dormancyCycles": 25.0097618,
                  "activeCycles": 49.79544,
                  "id": "molten_iron",
                  "posX": 212,
                  "posY": 205
                },
                {
                  "emitRate": 13010.5674,
                  "idleTime": 775.070557,
                  "eruptionTime": 28.5491886,
                  "dormancyCycles": 60.5676765,
                  "activeCycles": 77.30743,
                  "id": "molten_iron",
                  "posX": 200,
                  "posY": 220
                },
                {
                  "emitRate": 24355.0547,
                  "idleTime": 746.3921,
                  "eruptionTime": 17.36359,
                  "dormancyCycles": 30.9986725,
                  "activeCycles": 55.502037,
                  "id": "molten_iron",
                  "posX": 208,
                  "posY": 242
                },
                {
                  "emitRate": 8122.66357,
                  "idleTime": 673.0133,
                  "eruptionTime": 42.7235641,
                  "dormancyCycles": 50.1889763,
                  "activeCycles": 73.70502,
                  "id": "molten_iron",
                  "posX": 176,
                  "posY": 229
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
                  "posX": 250,
                  "posY": 230
                },
                {
                  "id": "GeneShuffler",
                  "posX": 244,
                  "posY": 214
                }
              ],
              "geysers": [
                {
                  "emitRate": 9360.264,
                  "idleTime": 617.0439,
                  "eruptionTime": 36.5092049,
                  "dormancyCycles": 53.0014572,
                  "activeCycles": 63.932148,
                  "id": "molten_tungsten",
                  "posX": 261,
                  "posY": 181
                },
                {
                  "emitRate": 13010.5674,
                  "idleTime": 775.070557,
                  "eruptionTime": 28.5491886,
                  "dormancyCycles": 60.5676765,
                  "activeCycles": 77.30743,
                  "id": "molten_tungsten",
                  "posX": 236,
                  "posY": 184
                },
                {
                  "emitRate": 7332.756,
                  "idleTime": 706.153259,
                  "eruptionTime": 55.16449,
                  "dormancyCycles": 57.01898,
                  "activeCycles": 83.37011,
                  "id": "molten_tungsten",
                  "posX": 284,
                  "posY": 183
                },
                {
                  "emitRate": 362.932831,
                  "idleTime": 411.3658,
                  "eruptionTime": 361.681,
                  "dormancyCycles": 54.1676064,
                  "activeCycles": 92.18097,
                  "id": "hot_co2",
                  "posX": 260,
                  "posY": 212
                },
                {
                  "emitRate": 349.205841,
                  "idleTime": 259.956665,
                  "eruptionTime": 211.289932,
                  "dormancyCycles": 50.0450134,
                  "activeCycles": 92.31896,
                  "id": "slimy_po2",
                  "posX": 240,
                  "posY": 199
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
                  "emitRate": 467.163879,
                  "idleTime": 393.691,
                  "eruptionTime": 214.000641,
                  "dormancyCycles": 53.4466858,
                  "activeCycles": 86.65175,
                  "id": "chlorine_gas",
                  "posX": 527,
                  "posY": 29
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
                  "emitRate": 6359.828,
                  "idleTime": 310.1322,
                  "eruptionTime": 235.3752,
                  "dormancyCycles": 42.8569221,
                  "activeCycles": 87.34086,
                  "id": "slush_water",
                  "posX": 226,
                  "posY": 67
                },
                {
                  "emitRate": 7537.59033,
                  "idleTime": 173.176453,
                  "eruptionTime": 538.668152,
                  "dormancyCycles": 53.8103447,
                  "activeCycles": 72.67059,
                  "id": "filthy_water",
                  "posX": 183,
                  "posY": 91
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
                  "emitRate": 244736,
                  "idleTime": 8829.435,
                  "eruptionTime": 69.2183456,
                  "dormancyCycles": 65.47927,
                  "activeCycles": 86.8800659,
                  "id": "molten_niobium",
                  "posX": 316,
                  "posY": 175
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
                  "posX": 395,
                  "posY": 178
                }
              ],
              "geysers": [
                {
                  "emitRate": 1777.29749,
                  "idleTime": 295.769928,
                  "eruptionTime": 518.311768,
                  "dormancyCycles": 39.37839,
                  "activeCycles": 89.0573654,
                  "id": "hot_steam",
                  "posX": 495,
                  "posY": 168
                },
                {
                  "emitRate": 3599.13965,
                  "idleTime": 346.813446,
                  "eruptionTime": 158.768127,
                  "dormancyCycles": 39.8272629,
                  "activeCycles": 67.0544357,
                  "id": "hot_steam",
                  "posX": 427,
                  "posY": 169
                }
              ]
            }
          ],
          "starMapEntriesVanilla": null,
          "starMapEntriesSpacedOut": [
            {
              "q": 0,
              "r": 0,
              "id": "TerraMoonlet"
            },
            {
              "q": -3,
              "r": 0,
              "id": "IdealLandingSite"
            },
            {
              "q": 2,
              "r": -5,
              "id": "WarpOilySwamp"
            },
            {
              "q": 0,
              "r": 7,
              "id": "TundraMoonlet"
            },
            {
              "q": 7,
              "r": -7,
              "id": "MarshyMoonlet"
            },
            {
              "q": 8,
              "r": 0,
              "id": "MooMoonlet"
            },
            {
              "q": -4,
              "r": 6,
              "id": "WaterMoonlet"
            },
            {
              "q": -2,
              "r": -8,
              "id": "NiobiumMoonlet"
            },
            {
              "q": -8,
              "r": 0,
              "id": "RegolithMoonlet"
            },
            {
              "q": 8,
              "r": -5,
              "id": "TemporalTear"
            },
            {
              "q": -2,
              "r": 3,
              "id": "HarvestableSpacePOI_SandyOreField"
            },
            {
              "q": -7,
              "r": 4,
              "id": "HarvestableSpacePOI_OrganicMassField"
            },
            {
              "q": -3,
              "r": 11,
              "id": "HarvestableSpacePOI_HeliumCloud"
            },
            {
              "q": -2,
              "r": 11,
              "id": "HarvestableSpacePOI_FrozenOreField"
            },
            {
              "q": -1,
              "r": 10,
              "id": "HarvestableSpacePOI_GildedAsteroidField"
            },
            {
              "q": -5,
              "r": -3,
              "id": "HarvestableSpacePOI_GlimmeringAsteroidField"
            },
            {
              "q": -7,
              "r": 9,
              "id": "HarvestableSpacePOI_OilyAsteroidField"
            },
            {
              "q": 5,
              "r": -11,
              "id": "HarvestableSpacePOI_RadioactiveAsteroidField"
            },
            {
              "q": 3,
              "r": 8,
              "id": "HarvestableSpacePOI_RadioactiveGasCloud"
            },
            {
              "q": 1,
              "r": -7,
              "id": "HarvestableSpacePOI_InterstellarOcean"
            },
            {
              "q": 3,
              "r": 2,
              "id": "HarvestableSpacePOI_RockyAsteroidField"
            },
            {
              "q": 3,
              "r": 3,
              "id": "HarvestableSpacePOI_RockyAsteroidField"
            },
            {
              "q": -11,
              "r": 1,
              "id": "HarvestableSpacePOI_FrozenOreField"
            },
            {
              "q": -11,
              "r": 0,
              "id": "HarvestableSpacePOI_OxygenRichAsteroidField"
            },
            {
              "q": -11,
              "r": 2,
              "id": "HarvestableSpacePOI_MetallicAsteroidField"
            },
            {
              "q": 11,
              "r": -9,
              "id": "HarvestableSpacePOI_SaltyAsteroidField"
            },
            {
              "q": 6,
              "r": 4,
              "id": "HarvestableSpacePOI_FrozenOreField"
            },
            {
              "q": 10,
              "r": 1,
              "id": "HarvestableSpacePOI_OxidizedAsteroidField"
            },
            {
              "q": 11,
              "r": 0,
              "id": "HarvestableSpacePOI_CarbonAsteroidField"
            },
            {
              "q": 11,
              "r": -1,
              "id": "HarvestableSpacePOI_HeliumCloud"
            },
            {
              "q": 8,
              "r": -10,
              "id": "HarvestableSpacePOI_SatelliteField"
            },
            {
              "q": 1,
              "r": -11,
              "id": "HarvestableSpacePOI_RadioactiveGasCloud"
            },
            {
              "q": 3,
              "r": -3,
              "id": "ArtifactSpacePOI_GravitasSpaceStation6"
            },
            {
              "q": -11,
              "r": 9,
              "id": "ArtifactSpacePOI_RussellsTeapot"
            },
            {
              "q": -1,
              "r": -3,
              "id": "ArtifactSpacePOI_GravitasSpaceStation8"
            }
          ]
        }
      ]
    }
""".trimIndent()
