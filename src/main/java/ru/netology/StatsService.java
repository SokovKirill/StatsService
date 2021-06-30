package ru.netology;

public class StatsService {

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avg(int[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int aboveMidSum(int[] sales) {
        int monthsAboveMidSum = 0;
        for (int sale : sales) {
            if (sale > avg(sales)) {
                monthsAboveMidSum++;
            }
        }
        return monthsAboveMidSum;
    }
    public int belowMidSum(int[] sales) {
        int monthsBelowMidSum = 0;
        for (int sale : sales) {
            if (sale > avg(sales)) {
                monthsBelowMidSum++;
            }
        }
        return monthsBelowMidSum;
    }
}