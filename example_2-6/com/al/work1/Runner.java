package com.al.work1;

public class Runner {
    public int devisionInt(int x, int y) {
        return x / y;
    }

    public int devisionDouble(double x, double y) {
        if (y == 0.0) {
            throw new ArithmeticException("By zero!");
        }
        return (int)(x / y);
    }
}
