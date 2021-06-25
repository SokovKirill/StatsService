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
//    public int calculateBelowMidSum(int[] sales) {
//        int Avg = Avg(sales);
//        int monthCount = 0;
//     for (int sale : sales);
//     if (sale < Avg) {
//         monthCount++;
//     }
//      return monthCount;
//    }
//    public int calculateAboveMidSum(int[] sales) {
//        int Avg = Avg(sales);
//        int monthCount = 0;
//        for (int sale : sales);
//    if (sale > Avg) {
//            monthCount++;
//        }
//        return monthCount;
    }