package work1;

//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner (System.in);

        int a = 10;
        int b = 100;
        int c = 500;

        int maxValue = a;
        if (maxValue < b) {
            maxValue = b;
        }
        if (maxValue < c) {
            maxValue = c;
        }

        System.out.println("Max -> " + maxValue);
    }
}
