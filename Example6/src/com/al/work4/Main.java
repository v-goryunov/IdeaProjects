
//        ЗАДАНИЕ:
//        1. Откройте проект PracticalWork6 и добавьте в него пакет work64, в
//        котором создайте класс Task64.
//        2. Добавьте в класс Task64 метод public static String
//        convertDecimalToBinary(int number), который получает некоторое целое
//        положительное число number, преобразует его в двоичное число и
//        возвращает в виде строки символов.
//        3. Добавьте в класс Task64 метод public static void main(String[] args),
//        который вводит целое число и выводит результат его обработки методом
//        convertDecimalToBinary().
//        4. Запустите приложение на исполнение.
//        ТРЕБОВАНИЯ
//        1. Приложение должно быть написано на языке Java.
//        2. Используйте класс Scanner для ввода данных набором на клавиатуре.
//        3. Используйте арифметические операции, операторы управления потоком
//        исполнения и класс String для получения результата.
//        4. Используйте оператор System.out.println(...) для вывода результата.

package com.al.work4;

import java.util.Scanner;

public class Main {
    public static String convertDecimalToBinary(int number) {
//        long obnum =0, bon=0;
        String obn = " ";
        while (number > 0) {
            obn = (number % 2) + obn;
            number = number/2;
        }
        return obn;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int binar = scanner.nextInt();
        String number = convertDecimalToBinary(binar);
        System.out.println(number);

        System.out.println();
    }
}
