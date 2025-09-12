package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarFleetTest {

    @Test
    void givenSimpleCase_whenCallCarFleet_thenReturnCorrectCount() {
        // given
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};

        // when
        int result = CarFleet.carFleet(target, position, speed);

        // then
        assertEquals(3, result);
    }

    @Test
    void givenSingleCar_whenCallCarFleet_thenReturn1() {
        // given
        int target = 10;
        int[] position = {3};
        int[] speed = {3};

        // when
        int result = CarFleet.carFleet(target, position, speed);

        // then
        assertEquals(1, result);
    }

    @Test
    void givenAllSameSpeed_whenCallCarFleet_thenAllSeparate() {
        // given
        int target = 100;
        int[] position = {0, 2, 4};
        int[] speed = {2, 2, 2};

        // when
        int result = CarFleet.carFleet(target, position, speed);

        // then
        assertEquals(3, result);
    }

    @Test
    void givenCarsCatchEachOther_whenCallCarFleet_thenFewerFleets() {
        // given
        int target = 10;
        int[] position = {6, 8};
        int[] speed = {3, 2};

        // when
        int result = CarFleet.carFleet(target, position, speed);

        // then
        assertEquals(2, result);
    }

    @Test
    void givenEmptyInput_whenCallCarFleet_thenReturn0() {
        // given
        int target = 10;
        int[] position = {};
        int[] speed = {};

        // when
        int result = CarFleet.carFleet(target, position, speed);

        // then
        assertEquals(0, result);
    }
}
