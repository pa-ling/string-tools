package com.paling

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ListConverterUnitTest {
    @Test
    fun testConvertStringToList() {
        val input = "apple, banana, cherry"
        val expected = listOf("apple", "banana", "cherry")
        val result = ListConverter.convertStringToList(input, ",")
        assertEquals(expected, result)
    }

    @Test
    fun testConvertListToString() {
        val input = listOf("apple", "banana", "cherry")
        val expected = "apple, banana, cherry"
        val result = ListConverter.convertListToString(input, ", ")
        assertEquals(expected, result)
    }
}

