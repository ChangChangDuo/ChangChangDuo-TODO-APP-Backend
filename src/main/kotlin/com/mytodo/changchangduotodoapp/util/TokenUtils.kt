package com.mytodo.changchangduotodoapp.util

import org.apache.commons.lang3.RandomStringUtils

class TokenUtils {

    companion object {
        private const val MAX_LENGTH = 32

        private fun generateToken(length: Int): String {
            return RandomStringUtils.randomAlphabetic(length)
        }

        fun generateTokenWithPrefix(prefix: String): String {
            return prefix + generateToken(MAX_LENGTH - prefix.length)
        }
    }
}