package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeWaysTest {

    @Test
    void givenEmptyString_whenDecode_thenReturnZero() {
        // given
        String input = "";

        // when
        int result = DecodeWays.numDecodings(input);

        // then
        assertEquals(0, result);
    }

    @Test
    void givenSingleValidDigit_whenDecode_thenReturnOne() {
        // given
        String input = "2";

        // when
        int result = DecodeWays.numDecodings(input);

        // then
        assertEquals(1, result);
    }

    @Test
    void givenStringWithZeroAtStart_whenDecode_thenReturnZero() {
        // given
        String input = "06";

        // when
        int result = DecodeWays.numDecodings(input);

        // then
        assertEquals(0, result);
    }

    @Test
    void givenTwoValidSingleDigits_whenDecode_thenReturnTwo() {
        // given
        String input = "12";

        // when
        int result = DecodeWays.numDecodings(input);

        // then
        assertEquals(2, result);
    }

    @Test
    void givenMultipleDigitsWithMultipleDecodings_whenDecode_thenReturnExpectedCount() {
        // given
        String input = "226";

        // when
        int result = DecodeWays.numDecodings(input);

        // then
        assertEquals(3, result);
    }

    @Test
    void givenOnlyZeroes_whenDecode_thenReturnZero() {
        // given
        String input = "0";

        // when
        int result = DecodeWays.numDecodings(input);

        // then
        assertEquals(0, result);
    }

    @Test
    void givenLongerInput_whenDecode_thenReturnExpectedCount() {
        // given
        String input = "11106";

        // when
        int result = DecodeWays.numDecodings(input);

        // then
        assertEquals(2, result);
    }
}