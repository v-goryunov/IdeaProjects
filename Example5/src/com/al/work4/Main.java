package com.al.work4;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        int size = myStr1.length();
        int index = 0;
        while (index < size) {
            char symbol = myStr1.charAt(index);
            if (myStr2.indexOf(symbol) == -1) {
                System.out.print(symbol + " ");
            }
            index++;
        }

    }
}
