package ru.netology;

public class StatsService {

    public int Sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int Avg(int[] sales) {
        return Sum(sales) / sales.length;
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

    public int AboveMidSum(int[] sales) {
        int MonthsAboveMidSum = 0;
        for (int sale : sales) {
            if (sale > Avg(sales)) {
                MonthsAboveMidSum++;
            }
        }
        return MonthsAboveMidSum;
    }
    public int BelowMidSum(int[] sales) {
        int MonthsBelowMidSum = 0;
        for (int sale : sales) {
            if (sale > Avg(sales)) {
                MonthsBelowMidSum++;
            }
        }
        return MonthsBelowMidSum;
    }
}