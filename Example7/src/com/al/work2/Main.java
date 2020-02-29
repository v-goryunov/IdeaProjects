package com.al.work2;

public class Main {
    public static void main(String[] args) {
        int [] array = {13, -7, 23, 12, 76, -54};
        int sum = sumOddElementsArray(array);
        System.out.println("Sum = " + sum);
    }

    public static int sumOddElementsArray(int[] array){
        if (array == null || array.length <= 1) {
            return -1;
        }
        int sum = 0;
        for (int number : array) {
            if (number > 0 && number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }
}
