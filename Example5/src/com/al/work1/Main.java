package com.al.work1;

public class Main {
    public static void main(String[] args) {
        String string = "The decimal system, invented in " +
                "India around AD 600, was a revolution in quantitative reasoning: using " +
                "only 10 symbols, even very large numbers could be written down " +
                "compactly";

        System.out.println(string.substring(
                string.length() / 2));

    }
}
