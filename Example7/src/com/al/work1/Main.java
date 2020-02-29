package com.al.work1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = createArray(10);
        System.out.println(Arrays.toString(array));
    }

    public static int[] createArray(int size) {
        if (size <= 0) {
            return null;
        }
//        Создали массив
        int [] array = new int[size];
        int number = 2;
        for (int i = 0; i < array.length; i++) {
            array [i] = number;
            number += 2;
        }
        return  array;
    }

}


