package com.alpha.task1;

import com.alpha.DaysOfWeek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    for (DaysOfWeek elem : DaysOfWeek.values()) {
            System.out.println(elem);
        }

        System.out.println("-------------------------");
        for (DaysOfWeek elem : DaysOfWeek.values()) {
            switch (elem) {
                case MONDAY:case WEDNESDAY:case FRIDAY:
                    System.out.println(elem);
            }
        }
        System.out.println("-------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of week -> ");
        String day = sc.next().toUpperCase();

        System.out.println("The next day of week: " +
                DaysOfWeek.valueOf(day).nextDay());

    }
}
