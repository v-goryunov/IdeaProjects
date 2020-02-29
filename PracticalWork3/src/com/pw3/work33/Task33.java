package com.pw3.work33;

public class Task33 {
    public static void main(String[] args) {

        int sum = 830;
        double percDown = 13.0;
        double percUp = 7.0;
        double cost = sum - sum * (percDown / 100.0);
        cost += cost * (percUp / 100.0);

        System.out.println("cost = " + cost);
    }
}
