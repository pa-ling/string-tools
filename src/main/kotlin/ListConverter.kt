package com.paling

object ListConverter {
    fun convertStringToList(input: String, delimiter: String ): List<String> {
        return input.split(delimiter).map { it.trim() }
    }

    fun convertListToString(input: List<String>, delimiter: String): String {
        return input.joinToString(delimiter)
    }
}
