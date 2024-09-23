package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.FreedomTrail.findRotateSteps;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FreedomTrailTest {

    @Test
    void shouldReturnCorrectStepsForRingGoddingAndKeyGd() {
        //Given
        var ring = "godding";
        var key = "gd";

        //When
        var actual = findRotateSteps(ring, key);

        //Then
        assertEquals(4, actual);
    }

    @Test
    void shouldReturnCorrectStepsForRingGoddingAndKeyGodding() {
        //Given
        var ring = "godding";
        var key = "godding";

        //When
        var actual = findRotateSteps(ring, key);

        //Then
        assertEquals(7, actual);
    }
}