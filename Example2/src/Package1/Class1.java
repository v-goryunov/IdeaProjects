package Package1;


public class Class1 {
    public static void main(String[] args) {

        int weeks = 3;
//        int sec = weeks * 7 * 24 * 60 * 60;
//        System.out.println(sec);

        int day = weeks * 7;
        int hour = day * 24;
        int min = hour * 60;

        System.out.println("Sec = " + (min * 60));


    }
}
