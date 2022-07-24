package ru.netology.stats.service;

public class StatsService {
    public int sumAmount(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        return sum;
    }

    public double averageSalesAmount(double[] arr) {
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average = average + arr[i];
        }
        double result = average / arr.length;

        return result;

    }

    public long maxSaleMonth(long[] arr) {
        long max = arr[0];
        long month = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max >= arr[i]) {
                max = arr[i];
                month = i;
            }
        }
        return month;
    }

    public long minSaleMonth(long[] arr) {
        long min = arr[0];
        long month = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                month = i+1;
            }
        }
        return month;
    }
    public double amountMonthBelowAverege(double[] arr){
        double amountMonthSale = averageSalesAmount(arr);
        double result = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]<amountMonthSale){
                result++;
            }
        }
        return result;

    }
    public double amountMonthMoreAverege(double[] arr){
        double amountMonthSale = averageSalesAmount(arr);
        double result = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>amountMonthSale){
                result++;
            }
        }
        return result;

    }
}


