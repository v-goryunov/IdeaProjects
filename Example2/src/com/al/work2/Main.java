package com.al.work2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers week - > ");
        int weeks = scanner.nextInt();
        int sec = weeks * 7 * 24 * 60 * 60;
        System.out.println(sec);


    }
}
