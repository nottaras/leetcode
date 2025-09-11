package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void shouldEvaluateSimpleAddition_whenGivenTwoOperandsAndPlus() {
        // given
        String[] tokens = {"2", "3", "+"};

        // when
        int result = EvaluateReversePolishNotation.evalRPN(tokens);

        // then
        assertEquals(5, result);
    }

    @Test
    void shouldEvaluateExpressionWithAllOperators() {
        // given
        String[] tokens = {"4", "13", "5", "/", "+"};

        // when
        int result = EvaluateReversePolishNotation.evalRPN(tokens);

        // then
        assertEquals(6, result); // 13 / 5 = 2, 4 + 2 = 6
    }

    @Test
    void shouldEvaluateExpressionWithNegativeResult() {
        // given
        String[] tokens = {"10", "6", "9", "3", "/", "-", "+"};

        // when
        int result = EvaluateReversePolishNotation.evalRPN(tokens);

        // then
        assertEquals(13, result); // 9 / 3 = 3, 6 - 3 = 3, 10 + 3 = 13
    }

    @Test
    void shouldEvaluateSingleNumber() {
        // given
        String[] tokens = {"42"};

        // when
        int result = EvaluateReversePolishNotation.evalRPN(tokens);

        // then
        assertEquals(42, result);
    }
}