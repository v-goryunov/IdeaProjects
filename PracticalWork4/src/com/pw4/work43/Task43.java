package com.pw4.work43;

public class Task43 {
    public static void main(String[] args) {

        int line = 1;
        while (line <= 8) {
            int number = line;
            while (number >= 1) {
                System.out.print(number + " ");
                number--;
            }
            System.out.println();
            line++;
        }

    }
}
