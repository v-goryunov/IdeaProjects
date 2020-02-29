package com.al.work1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
            double w = scanner.nextDouble();
            double gr = w * 453.6;
            int k = (int) (gr / 1000);
            int g = (int) (gr - k * 1000);
            System.out.println("k=" + k+ "\ng=" +g);
        }

    }

