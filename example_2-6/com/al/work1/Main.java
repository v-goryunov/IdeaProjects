package com.al.work1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Runner runner = new Runner();
        Scanner sc = new Scanner(System.in);
//        while (true) {
//            try {
//                System.out.print("Enter int number -> ");
//                System.out.println("Result1 = "
//                        + runner.devisionInt(10, sc.nextInt()));
//                break;
//            } catch (ArithmeticException exp) {
//                System.out.println("Invalid result. "
//                        + exp.getMessage());
//            }
//        }

        while (true) {
            try {
                System.out.print("Enter float number -> ");
                System.out.println("Result2 = "
                        + runner.devisionDouble(10.0, sc.nextDouble()));
                break;
            } catch (ArithmeticException ee) {
                System.out.println("Incorrect result. "
                    + ee.getMessage());
            }
        }
    }
}
