package com.example.things

object CryptUtils {

    fun encrypt(value: String): String {
        var result = value
        if (value.contains("decrypt")) {
            result = value.replace("decrypt", "")
        }
        return "encrypt ${result.trim()}"
    }

    fun decrypt(value: String): String {
        var result = value
        if (value.contains("encrypt")) {
            result = value.replace("encrypt", "")
        }
        return "decrypt ${result.trim()}"
    }

}
