package work2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter x -> ");
        int x = scanner.nextInt();

//        if (x == 0) {
//            System.out.println("Zero");
//        } else  if (x == 1) {
//            System.out.println("One");
//        } else  if (x == 2) {
//            System.out.println("Two");
//        } else {
//            System.out.println("Invalid value");
//        }

        switch (x) {
            default:
                System.out.println("Invalid value");
            case 0:
                System.out.println("Zero"); break;
            case 1:
                System.out.println("One"); break;
            case 2:
                System.out.println("Two"); break;
        }
    }
}
