package com.jessecorbett.diskord.internal

internal expect fun epochSecondNow(): Long
internal expect fun epochMillisNow(): Long
internal expect fun parseRfc1123Seconds(timestamp: String): Long
