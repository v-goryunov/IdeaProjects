package work3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int line = 1;
        while (line <= 8) {
            int number = line;
            while (number >= 1) {
                System.out.print(number + " ");
                number--;
            }
            System.out.println();
            line++;
        }

    }
}
