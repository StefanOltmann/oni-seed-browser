package service

import io.ktor.http.Headers
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant

/* parse RFC 1123 date to epoch millis */
private fun parseHttpDateToMillis(date: String): Long {

    val parts = date.split(" ")

    val day = parts[1].toInt()

    val month = when (parts[2]) {
        "Jan" -> 1; "Feb" -> 2; "Mar" -> 3; "Apr" -> 4
        "May" -> 5; "Jun" -> 6; "Jul" -> 7; "Aug" -> 8
        "Sep" -> 9; "Oct" -> 10; "Nov" -> 11; "Dec" -> 12
        else -> error("Unknown month: ${parts[2]}")
    }

    val year = parts[3].toInt()

    val (hour, minute, second) = parts[4].split(":").map { it.toInt() }

    val instant = LocalDateTime(year, month, day, hour, minute, second)
        .toInstant(TimeZone.UTC)

    return instant.toEpochMilliseconds()
}

fun Headers.lastModifiedMillis(): Long? {
    val header = this["last-modified"] ?: return null
    return parseHttpDateToMillis(header)
}
