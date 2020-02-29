package com.alpha.task;

import java.util.Arrays;

public class Runner {
    public void run() throws CloneNotSupportedException{
        Shape[] shapes = createShapes();
        printShapes(shapes);
        //format vyvoda - 2 znaka posle ","
        System.out.printf("Total area shapes = %.2f%n", calculateAreaShapes(shapes));
        System.out.printf("Area triangles -> %.2f%n", calculateAreaShapes(shapes, Triangle.class));
        System.out.println("+++++++++++++++++++++++++++++++");
        Arrays.sort(shapes);
        printShapes(shapes);

        System.out.println("+++++++++++++++++++++++++++++++");
        Arrays.sort(shapes,new MyComparatorColor());
        printShapes(shapes);

        System.out.println("\nClone:\n" + shapes[0].clone());

    }

    //sozdaem novye figury
    public Shape[] createShapes() {
        return new Shape[]{
                new Circle("Red", 7.01),
                new Rectangle("Green", 3, 7),
                new Triangle("Brown", 3, 4, 5),
                new Rectangle("Red", 5, 1),
                new Circle("Black", 1.15),
                new Rectangle("Yellow", 10, 10),
                new Circle("Blue", 10.0),
                new Triangle("White", 8, 10, 6),
                new Rectangle("Blue", 5, 12)
        };
    }

    //otobrazhenie figur:
    public void printShapes(Shape[] shapes) {
        for (Shape ss : shapes) {
            ss.draw();
        }
    }

    // obshaja ploshad
    public double calculateAreaShapes(Shape[] shapes) {
        double sumArea = 0.0;
        for (Shape elem : shapes) {
            sumArea += elem.calcArea();
        }
        return sumArea;
    }

    // ploshad otdelnoi figury
    public double calculateAreaShapes(Shape[] shapes, Class type) {

        double sumArea = 0.0;
        for (Shape elem : shapes) {
            if (elem.getClass() == type) {
                sumArea += elem.calcArea();
            }
        }
        return sumArea;
    }

}
