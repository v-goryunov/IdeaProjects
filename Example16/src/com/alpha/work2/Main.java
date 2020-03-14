package com.alpha.work2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        MyMixer<Integer> myMixer = new MyMixer<>(arrInt);
        myMixer.shuffle();
        arrInt = myMixer.getArray();
        System.out.println(Arrays.toString(arrInt));

        String[] arrStr = {"1a", "2a", "3a", "4", "5", "6", "7", "8", "9"};
        MyMixer<String> myMixer1 = new MyMixer<>(arrStr);
        myMixer1.shuffle();
        arrStr = myMixer1.getArray();
        System.out.println(Arrays.toString(arrStr));
    }
}
