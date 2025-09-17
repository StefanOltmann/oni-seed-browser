# ONI Seed Browser

![Kotlin](https://img.shields.io/badge/kotlin-2.2.20-blue.svg?logo=kotlin)
[![License: AGPL-3.0](https://img.shields.io/badge/license-AGPL--3.0-blue.svg)](https://www.gnu.org/licenses/agpl-3.0)
![JVM](https://img.shields.io/badge/-JVM-gray.svg?style=flat)
![WASM](https://img.shields.io/badge/-WASM-gray.svg?style=flat)
[![GitHub Sponsors](https://img.shields.io/badge/Sponsor-gray?&logo=GitHub-Sponsors&logoColor=EA4AAA)](https://github.com/sponsors/StefanOltmann)

This is a game map seed browser for the game [Oxygen Not Included](https://www.klei.com/games/oxygen-not-included).

It's part of the [MapsNotIncluded.org](https://mapsnotincluded.org) initiative.

Try it on https://stefanoltmann.de/oni-seed-browser

The backend project is located here:
https://github.com/stefanoltmann/oni-seed-browser-backend

## Run the project

To run the project, you'll need the following installed:

- [IntelliJ IDEA Community Edition 2024.3 or later](https://www.jetbrains.com/idea/download)
- [Java 17 SDK](https://adoptium.net/de/temurin/releases/?version=17&package=jdk)

1. In IDEA, you use `File` -> `New` -> `Project from Version Control...`
2. Enter the following URL: `https://github.com/StefanOltmann/oni-seed-browser.git`
3. Click on `Clone` and wait until the project is set up
4. In the top right you find launch configurations for `Desktop` and `Browser`
5. Choose one and hit the `Run` button

If you want to run from command line instead you need to execute
`./gradlew run` to run the Desktop version or `./gradlew wasmJsBrowserRun`
to run the Browser version.

## Contributions

Contributions to this project are welcome! If you encounter any issues,
have suggestions for improvements, or would like to contribute new features,
please feel free to submit a pull request.

## License & Copyrights

ONI Seed Browser is licensed under the GNU Affero General Public License (AGPL),
ensuring the community's freedom to use, modify, and distribute the software.

The images are sourced from the game and are the property of Klei Entertainment,
used in compliance with [Klei's Player Creation Guidelines](https://support.klei.com/hc/en-us/articles/360029880791-Player-Creation-Guidelines).

Steam and the Steam logo are trademarks and/or registered trademarks
of Valve Corporation in the U.S. and/or other countries.
The icon was created by [FontAwesome.com](https://fontawesome.com/icons/steam?f=brands&s=solid).
