package com.zadziarnouski.leetcode;

import org.junit.jupiter.api.Test;

import static com.zadziarnouski.leetcode.BestTimeToBuyAndSellStock.maxProfit;
import static org.junit.jupiter.api.Assertions.assertEquals;


class BestTimeToBuyAndSellStockTest {

    @Test
    void shouldReturnOneAsMaxProfitForPrices() {
        //Given
        int[] prices = {1, 2};

        //When & Then
        assertEquals(1, maxProfit(prices));
    }

    @Test
    void shouldReturnZeroAsMaxProfitForPrices() {
        //Given
        int[] prices = {7, 6, 4, 3, 1};

        //When & Then
        assertEquals(0, maxProfit(prices));
    }

    @Test
    void shouldReturnFiveAsMaxProfitForPrices() {
        //Given
        int[] prices = {7, 1, 5, 3, 6, 4};

        //When & Then
        assertEquals(5, maxProfit(prices));
    }
}