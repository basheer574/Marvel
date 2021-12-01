package com.bashir.marvel.util

import java.math.BigInteger
import java.security.MessageDigest
import java.util.*

object Constants {
    const val CHARACTER_TABLE_NAME = "CHARACTERS"
    const val DATABASE_VERSION = 1

    fun String.md5(): String {
        val md = MessageDigest.getInstance("MD5")
        return BigInteger(1, md.digest(toByteArray())).toString(16).padStart(32, '0')
    }
}