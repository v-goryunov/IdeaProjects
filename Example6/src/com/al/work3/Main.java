package com.al.work3;

public class Main {
    public static void main(String[] args) {
        String text = "  privet aaa fff  ";
        char symbol =  getFirstCharacterOfWord(text, 1);
        if (symbol  != '\u0000') {
            System.out.println("char -> " + symbol);
        } else {
            System.out.println("not word");
        }
    }
    public static char getFirstCharacterOfWord(String str,
                                               int numberWord) {
//        int counterWord = 0;
//        int position = 0;
        str = str.trim();
        if (str.length() == 0) {
            return '\u0000';
        } else  if (numberWord == 1) {
            return  str.charAt(0);
        } else {
            int couterWord = 1;
            int position = 0;
            while ( (position = str.indexOf(" ", position + 1)) != -1) {
                couterWord++;
                if (couterWord == numberWord) {
                    return str.charAt(position + 1);
                }
            }
            return '\u0000';
        }


//        int lastPosition = str.lastIndexOf(" ");
//        do {
//
//
//        }
    }

}
