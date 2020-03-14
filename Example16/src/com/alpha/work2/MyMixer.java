package com.alpha.work2;

public class MyMixer <T> {
    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void shuffle() {
        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            T temp = array[i];
            array[i] = array[index];
            array[index] = temp;

        }
    }
}
