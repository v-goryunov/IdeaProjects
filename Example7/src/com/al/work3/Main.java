package com.al.work3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] arrTwo = createMatrix(6);
        printMatrix(arrTwo);


    }

    public static int[][] createMatrix(int size){
        if (size <= 1) {
            return  null;
        }
//        int value = 1; Некорректно
        int [][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            int value = i + 1;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
                value += size;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
    for (int [] row : matrix) {
//            System.out.println(Arrays.toString(row));
//            Для форматированого вывода
        System.out.print("[");
        for (int elem: row) {
            System.out.print(String.format("%-3d", elem));
//                "-" знак минус выравнивает по правому краю, "+" - выравнивает по левому
        }
        System.out.println("]");
    }
}
}
