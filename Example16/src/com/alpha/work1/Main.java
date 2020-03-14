package com.alpha.work1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = createInt(17);
        int countInt = MyTestMethod.<Integer>calcNum(arrInt, 50);
        System.out.println(Arrays.toString(arrInt));
        System.out.println("Count > 50 = " + countInt);
        System.out.println("Sum > 50 = " + countInt);
        double sum = MyTestMethod.<Integer>calcSum(arrInt, 50);
        System.out.println("Sum > 50 = " + sum);

//        System.out.println("---------------------------");
//        Character[] arrChar = new Character[]{'a', 'g', 's',};
//        countInt = MyTestMethod.calcNum(arrChar, 'f');
//        System.out.println("Count > 'f' = " + countInt);
//        sum = MyTestMethod.calcSum(arrChar, 'f');

        System.out.println("---------------------------");
        Double[] arrDouble = createDouble(8);
        countInt = MyTestMethod.<Double>calcNum(arrDouble, 70.5);
        System.out.println(Arrays.toString(arrDouble));
        System.out.println("Count > 70.5 = " + countInt);
        double sumD = MyTestMethod.<Double>calcSum(arrDouble, 70.5);
        System.out.println("Sum > 70.5 = "+ sumD);
    }


    public static Integer[] createInt(int size) {
            Integer [] arr = new Integer[size];
            for (int i = 0; i < arr.length; i++) {
                arr [i] = (int) (Math.random() * 100);
            }
            return arr;
    }

    public static Double[] createDouble(int size) {
        Double[] arr = new Double[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
        }
        return arr;
    }
}
