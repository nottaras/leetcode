package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncodeAndDecodeStringsTest {
    private EncodeAndDecodeStrings codec;

    @BeforeEach
    void setUp() {
        codec = new EncodeAndDecodeStrings();
    }

    @Test
    void shouldReturnSameList_whenEncodingAndDecodingSimpleStrings() {
        // given
        List<String> input = List.of("hello", "world");

        // when
        String encoded = codec.encode(input);
        List<String> result = codec.decode(encoded);

        // then
        assertEquals(input, result);
    }

    @Test
    void shouldReturnSameList_whenEncodingAndDecodingEmptyStrings() {
        // given
        List<String> input = List.of("", "", "");

        // when
        String encoded = codec.encode(input);
        List<String> result = codec.decode(encoded);

        // then
        assertEquals(input, result);
    }

    @Test
    void shouldReturnSameList_whenStringsContainSpecialCharacters() {
        // given
        List<String> input = List.of("a#b", "c:3", "1\n2", "4|5");

        // when
        String encoded = codec.encode(input);
        List<String> result = codec.decode(encoded);

        // then
        assertEquals(input, result);
    }

    @Test
    void shouldReturnEmptyList_whenEncodingAndDecodingEmptyList() {
        // given
        List<String> input = List.of();

        // when
        String encoded = codec.encode(input);
        List<String> result = codec.decode(encoded);

        // then
        assertEquals(input, result);
    }

    @Test
    void shouldReturnConsistentEncoding_whenCalledMultipleTimes() {
        // given
        List<String> input = List.of("repeat", "encode");

        // when
        String firstEncoded = codec.encode(input);
        String secondEncoded = codec.encode(input);

        // then
        assertEquals(firstEncoded, secondEncoded);
    }

    @Test
    void shouldReturnSameList_whenInputHasSpecialCharacters() {
        // given
        List<String> input = List.of("we", "say", ":", "yes", "!@#$%^&*()");

        // when
        String encoded = codec.encode(input);
        List<String> result = codec.decode(encoded);

        // then
        assertEquals(input, result);
    }
}