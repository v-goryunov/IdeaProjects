package com.alpha.task4;

public class Runner {
    public void run () {
        // создаем обьекты Integer:
        Integer intObjmin1 = new Integer(12);
        Integer intObjmax1 = 100;
        Integer intObjmin2 = new Integer(155);
        Integer intObjmax2 = 155;

        // сравнение через оператор == :
        System.out.println("Значения меньше 128:");
        System.out.println(intObjmin1==intObjmax1);
        // сравнение через метод equals() :
        System.out.println(intObjmin1.equals(intObjmax1));

        // сравнение через оператор == :
        System.out.println("Значения больше 128:");
        System.out.println(intObjmin2==intObjmax2);
        // сравнение через метод equals() :
        System.out.println(intObjmin2.equals(intObjmax2));

    }


}
