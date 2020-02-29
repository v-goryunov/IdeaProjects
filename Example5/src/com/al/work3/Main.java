package com.al.work3;

public class Main {
    public static void main(String[] args) {

        String text = "An information system is designed " +
                "to collect, process,store and distribute " +
                "information";

        int position1 = text.indexOf(" ");
        int position2 = text.lastIndexOf(" ");
        String result = text.substring(position2 + 1) +
                text.substring(position1, position2 + 1) +
                text.substring(0, position1);
        System.out.println(result);
    }
}
