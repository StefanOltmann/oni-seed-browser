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
      }
    ]
""".trimIndent()
