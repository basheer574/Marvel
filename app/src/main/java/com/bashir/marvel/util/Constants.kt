package com.bashir.marvel.util

import java.math.BigInteger
import java.security.MessageDigest
import java.util.*


object Constants {
    const val BASE_URL = "https://gateway.marvel.com/v1/public/"
    const val CHARACTER_TABLE_NAME = "CHARACTERS"
    const val DATABASE_VERSION = 1
    const val PUBLIC_API_KEY = "7ef86966d28d7810daec54de0f9e7691"
    const val PRIVATE_API_KEY = "56ff02b27b46eb93f351eb1f5805a936b4c3b044"
    var TS = Calendar.DAY_OF_WEEK.toString()
    var HASH_SIGNATURE = "$TS$PRIVATE_API_KEY$PUBLIC_API_KEY".md5()

    fun String.md5(): String {
        val md = MessageDigest.getInstance("MD5")
        return BigInteger(1, md.digest(toByteArray())).toString(16).padStart(32, '0')
    }
    const val HASH = "3ef3355aa1706d628e4b9af8a6d16b85"
}