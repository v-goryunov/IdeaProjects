package com.alpha.work1;

public class MyCalculate {

    public static double calcPi(int n) {

        double pi = 0.0;
        int value = 1;
        for (int i=0; i<n; i++) {
            if (i % 2 == 0) {
                pi += 4.0/value;
            } else {
                pi -= 4.0 / value;
            }
            value +=2;
        }
        return pi;
    }
}
