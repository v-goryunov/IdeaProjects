package com.alpha.work3;

import java.util.Random;


public class ID {

    private int id;
    private static int nextId;


    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public ID(int id) {
        this.id = id;
    }

    static  {
        Random random = new Random();
//        static private int a = 1;
//        static private int b = 100;
//        static private int x = a + random.nextInt(b - a + 1);
        nextId = random.nextInt(100) + 1;
    }

//    static {
//        nextId = random.nextInt(x);
//        nextId++;
//    }

    public ID() {
        id = nextId;
        nextId++;
    }

}
