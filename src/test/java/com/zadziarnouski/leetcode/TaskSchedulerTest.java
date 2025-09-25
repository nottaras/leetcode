package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskSchedulerTest {

    @Test
    void testExample1() {
        // given
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;

        // when
        int result = TaskScheduler.leastInterval(tasks, n);

        // then
        assertEquals(8, result);
    }

    @Test
    void testExample2() {
        // given
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 0;

        // when
        int result = TaskScheduler.leastInterval(tasks, n);

        // then
        assertEquals(6, result);
    }

    @Test
    void testAllSameTasks() {
        // given
        char[] tasks = {'A', 'A', 'A', 'A'};
        int n = 3;

        // when
        int result = TaskScheduler.leastInterval(tasks, n);

        // then
        assertEquals(13, result);
    }

    @Test
    void testSingleTask() {
        // given
        char[] tasks = {'A'};
        int n = 100;

        // when
        int result = TaskScheduler.leastInterval(tasks, n);

        // then
        assertEquals(1, result);
    }

    @Test
    void testEmptyInput() {
        // given
        char[] tasks = {};
        int n = 2;

        // when
        int result = TaskScheduler.leastInterval(tasks, n);

        // then
        assertEquals(0, result);
    }
}