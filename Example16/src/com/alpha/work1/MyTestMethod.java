package com.alpha.work1;

public class MyTestMethod {
    public static <T extends Comparable> int
                    calcNum (T[] array, T maxValue) {
        int count = 0;
        for (T element: array) {
            if (element.compareTo(maxValue) > 0) {
                count++;
            }

        }
        return count;
    }
    
    public static <T extends Number & Comparable> double
                    calcSum(T[] array, T maxValue) {
        double sum = 0.0;
        for (T element: array) {
            if (element.compareTo(maxValue) > 0) {
                sum += element.doubleValue();
            }

        }
        return sum;
    }
}
