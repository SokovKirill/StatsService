package ru.netology;

public class StatsService {
    public long maxSales(long[] sales) {
        long maxMonth = 0;
        long month = sales[0];
        for (long sale : sales) {
            if (month >= sale) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return (maxMonth + 1);
    }

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long minSales(long[] sales) {
        long minMonth = 0;
        long month = sales[0];
        for (long sale : sales) {
            if (month <= sales [(int) minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return (minMonth + 1);
    }
    public long calculateMiddleSum(long[] sales) {
        long sum = 0;
        long month = sales[0];
        for (long sale : sales) {
            sum += sale;

        }
        return sum/12;
    }

}