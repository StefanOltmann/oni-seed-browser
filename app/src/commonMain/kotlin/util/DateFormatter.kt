/*
 * ONI Seed Browser
 * Copyright (C) 2025 Stefan Oltmann
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

package util

import kotlin.math.log10
import kotlin.math.pow
import kotlin.time.ExperimentalTime
import kotlin.time.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.format
import kotlinx.datetime.format.FormatStringsInDatetimeFormats
import kotlinx.datetime.format.byUnicodePattern
import kotlinx.datetime.toLocalDateTime

private const val DATE_PATTERN = "yyyy-MM-dd HH:mm"

private val timeZone = TimeZone.currentSystemDefault()

@OptIn(FormatStringsInDatetimeFormats::class)
private val dateTimeFormat = LocalDateTime.Format {
    byUnicodePattern(DATE_PATTERN)
}

@OptIn(ExperimentalTime::class)
fun formatDate(timestamp: Long): String {

    val localDateTime = Instant
        .fromEpochMilliseconds(timestamp)
        .toLocalDateTime(timeZone)

    return localDateTime.format(dateTimeFormat)
}

fun formatFileSize(bytes: Long): String {
    if (bytes <= 0) return "0 B"

    return when {
        bytes < 1024 -> "$bytes B"
        bytes < 1024 * 1024 -> {
            val kb = bytes / 1024.0
            val rounded = if (kb >= 100) kotlin.math.round(kb).toInt() else (kotlin.math.round(kb * 10) / 10.0)
            "$rounded KB"
        }

        bytes < 1024 * 1024 * 1024 -> {
            val mb = bytes / (1024.0 * 1024)
            val rounded = if (mb >= 100) kotlin.math.round(mb).toInt() else (kotlin.math.round(mb * 10) / 10.0)
            "$rounded MB"
        }

        bytes < 1024L * 1024 * 1024 * 1024 -> {
            val gb = bytes / (1024.0 * 1024 * 1024)
            val rounded = if (gb >= 100) kotlin.math.round(gb).toInt() else (kotlin.math.round(gb * 10) / 10.0)
            "$rounded GB"
        }

        else -> {
            val tb = bytes / (1024.0 * 1024 * 1024 * 1024)
            val rounded = if (tb >= 100) kotlin.math.round(tb).toInt() else (kotlin.math.round(tb * 10) / 10.0)
            "$rounded TB"
        }
    }
}
