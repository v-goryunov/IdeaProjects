package com.al.work3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int sum = 1000;
        double percDown = 10.0;
        double percUp = 7.0;
        double cost = sum - sum * (percDown / 100.0);
        cost += cost * (percUp / 100.0);

        System.out.println("cost = " + cost);
    }
}
