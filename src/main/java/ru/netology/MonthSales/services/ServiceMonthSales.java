package ru.netology.MonthSales.services;
public class ServiceMonthSales {

    public int getSalesAmount (int[] sales) {
        int salesAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            salesAmount += sales [i];
        }
        return salesAmount;

    }

    public int getAverageAmount (int[] sales){
        int salesAmount = getSalesAmount(sales);

        return salesAmount / sales.length;
    }

    public int getMaxMonth (int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth (int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMinSales (int[] sales) {
        int numberMonth = 0;
        int middle = getAverageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middle) {
                numberMonth++;
            }
        }
        return numberMonth;
    }

    public int getMaxSales (int[] sales) {
        int numberMonth = 0;
        int middle = getAverageAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middle) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
}
