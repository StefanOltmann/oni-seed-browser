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
  }
]
""".trimIndent()
