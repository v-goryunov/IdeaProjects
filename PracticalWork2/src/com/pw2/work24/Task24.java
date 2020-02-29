package com.pw2.work24;

public class Task24 {
    public static void main(String[] args) {

        int number = 123;
        int digit = number % 10;
        int dec = number / 10 % 10;
//        int dec = number % 100 - digit;
        int han = number / 100;

        int res = digit * 100 + dec * 10 + han;
//        int res = digit * 100 + dec + han;

        System.out.println("sub = " + (number - res));

    }
}
