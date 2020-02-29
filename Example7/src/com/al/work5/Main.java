package com.al.work5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] res = countOfSequenceNumbers("ghghdgh4562776ddfhf9");
        System.out.println(Arrays.toString(res));
    }

    public static int[] countOfSequenceNumbers(String numbers){
        int[] result = new int[10];
//        1-ый вариант
        String digist = "0123456789";
        for (int i = 0; i < numbers.length(); i++) {
            char symbol = numbers.charAt(i);
            int index = digist.indexOf(symbol);
            if (index != -1) {
                result[index]++;
            }
        }
        return result;
    }
}


