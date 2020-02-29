package com.pw4.work45;

public class Task45 {
    public static void main(String[] args) {

        System.out.println("* | 1 2 3 4 5 6 7 8 9");
        System.out.println("---------------------------");

        int n1 = 1;
        int n2 = 1;

        while (n1 <= 10) {
            System.out.print(n1 + " | ");

            while (n2 <= 10) {
                System.out.print(n1*n2 + " ");
                n2++;
            }
            n1++;
            n2 = 1;

            System.out.println();
        }
    }
}
