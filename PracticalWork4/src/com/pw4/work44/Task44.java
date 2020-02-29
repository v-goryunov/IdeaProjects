package com.pw4.work44;

public class Task44 {
    public static void main(String[] args) {

        int number = 1;
        int counter = 0;
        while (number <= 300) {
            if (number % 3 == 0 || number % 4 == 0) {
                counter++;
                System.out.println(counter + ") " + number);
            }
            if (counter >= 10) {
                break;
            }
            number++;
        }
    }
}
