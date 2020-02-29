package com.alpha.task;

public abstract class Shape implements Drawable, Comparable, Cloneable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "class=" + getClass().getSimpleName() +
                ": color=" + color;
    }

    public abstract double calcArea ();


/// practicalwork24  (ranee sdelali abstraktnym..)
    @Override
    public void draw() {
        System.out.println(this + " -> area=" + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
//        return (int) (this.calcArea() - ((Shape)o).calcArea());
        return Double.compare(this.calcArea(), ((Shape)o).calcArea()); //vyvod dlja ne celyh chisel
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape shape = (Shape) super.clone();
        shape.color = new String(this.color);
        return shape;
    }
}
