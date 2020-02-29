package com.al.work2;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int summa = 10000;
        int m = 6;
        double pr = 12.0;
        double prof = summa * (pr / 100) * m / 12;


        System.out.println("res=" + prof);

    }
}
