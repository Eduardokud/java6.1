package ru.netology.stats.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    public void SumTest() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int actual = service.sumAmount(arr);
        int expected = 180;
        assertEquals(expected, actual);

    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        double[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double actual = service.averageSalesAmount(arr);
        double expected = 15;
        assertEquals(expected, actual);

    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long actual = service.maxSaleMonth(arr);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();
        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        long actual = service.minSaleMonth(arr);
        long expected = 9;
        assertEquals(expected, actual);

    }

    @Test
    public void amountMonthBelowAveregeTest() {
        StatsService service = new StatsService();
        double[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double actual = service.amountMonthBelowAverege(arr);
        double expected = 5;
        assertEquals(expected, actual);

    }

    @Test
    public void amountMonthMoreAveregeTest() {
        StatsService service = new StatsService();
        double[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double actual = service.amountMonthMoreAverege(arr);
        double expected = 5;
        assertEquals(expected, actual);
    }
}
