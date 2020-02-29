package work6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter x -> ");
        int x = scanner.nextInt();

        while (x != 0) {
            int num1 = x / 100;
            int num2 = x % 100 / 10;
            int num3 = x % 10;

            int summa = (num1*num1) + (num2*num2) + (num3*num3);
            System.out.println("Summa = " + summa);
            break;
        }






    }
}
