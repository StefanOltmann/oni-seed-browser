package util

import kotlinx.datetime.Instant
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

fun formatDate(timestamp: Long): String {

    val localDateTime = Instant
        .fromEpochMilliseconds(timestamp)
        .toLocalDateTime(timeZone)

    return localDateTime.format(dateTimeFormat)
}

