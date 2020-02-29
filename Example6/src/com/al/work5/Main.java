package com.al.work5;

//        ЗАДАНИЕ:
//        1. Откройте проект PracticalWork6 и добавьте в него пакет work65, в
//        котором создайте класс Task65.
//        2. Добавьте в класс Task65 метод public static void printPyramid(int height),
//        который создает и выводит на консоль пирамиду высотой height (значение в
//        диапазоне от 1 по 9). Например, для height = 4:
//                      1
//                     121
//                    12321
//                   1234321
//        3. Добавьте в класс Task65 метод public static void main(String[] args),
//        который вводит высоту пирамиды и выводит пирамиду с использованием
//        метода printPyramid().
//        4. Запустите приложение на исполнение.
//        ТРЕБОВАНИЯ
//        1. Приложение должно быть написано на языке Java.
//        2. Используйте операторы управления потоком исполнения для получения
//        результата.
//        3. Используйте оператор System.out.println(...) для вывода результата.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pyramid height: ");
        printPyramid(scanner.nextInt());

    }
    public static void printPyramid(int height){
        if (height < 1 || height > 9) {
            System.out.print("Wrong height");
            return;
        }
        for (int row = 1; row <= height; row++) {
            // spaces
            for (int i = 0; i < height - row; i++) {
                System.out.print(" ");
            }
//            System.out.print(" ");

            // digit asc
            for (int i = 1; i <= row; i++) {
                System.out.print(i);
            }
            // digit desc
            for (int i = row - 1; i > 0; i--) {
                System.out.print(i);
            }

        }
    }
}
