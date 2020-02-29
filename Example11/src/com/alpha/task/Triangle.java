package com.alpha.task;

public class Triangle extends Shape {
    private int a, b, c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                ": a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    @Override
    public double calcArea() {
        double p = (a+b+c) / 2.0; // poluperimetr dlja vychislenija ploshadi
        return Math.sqrt(p * (p-a) * (p-b) * (p-c)); // vuchisljaem poshad
    }
}
