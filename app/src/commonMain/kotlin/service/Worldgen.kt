package service/*
 * ONI Seed Browser
 * Copyright (C) 2026 Stefan Oltmann
 * https://stefan-oltmann.de
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

expect val worldgenSupported: Boolean

/**
 * Initialize the WASM worldgen module.
 */
expect suspend fun worldgenInit()

/**
 * Get the version of the WASM worldgen module.
 */
expect suspend fun worldgenVersion(): String

/**
 * Generate a map for the given coordinate. Output is a JSON string.
 */
expect suspend fun worldgenGenerate(coordinate: String): String
