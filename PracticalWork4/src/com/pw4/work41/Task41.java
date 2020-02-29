package com.pw4.work41;

public class Task41 {
    public static void main(String[] args) {

        int a = 10;
        int b = 100;
        int c = 500;

        int maxValue = a;
        if (maxValue < b) {
            maxValue = b;
        }
        if (maxValue < c) {
            maxValue = c;
        }

        System.out.println("Max -> " + maxValue);
    }
}
