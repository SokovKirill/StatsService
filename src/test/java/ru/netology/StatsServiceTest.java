package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class StatsServiceTest {
        @Test
        void maxSales() {
            StatsService service = new StatsService();

            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 20;
            long actual = service.maxSales(sales);
            assertEquals(expected, actual);
        }

        @Test
        void calculateSum() {
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 180;
            long actual = service.calculateSum(sales);
            assertEquals(expected, actual);
        }

        @Test
        void minSales() {
            StatsService service = new StatsService();

            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 9;
            long actual = service.minSales(sales);
            assertEquals(expected, actual);

        }
        @Test
        void calculateMiddleSum() {
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 15;
            long actual = service.calculateMiddleSum(sales);
            assertEquals(expected, actual);
        }
    }
