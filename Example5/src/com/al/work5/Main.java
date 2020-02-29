package com.al.work5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text -> ");
        String text = scanner.nextLine();

        int index = 0;
        while (index < text.length()) {
            char ch = text.charAt(index);
            if (text.indexOf(ch) == text.lastIndexOf(ch)) {
                System.out.print(ch + " ");
            }
            index++;
        }
    }
}
