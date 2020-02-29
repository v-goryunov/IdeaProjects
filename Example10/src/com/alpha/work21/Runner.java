package com.alpha.work21;

public class Runner {
    public void run() {
        Shape[] shapes = createShapes();
        printShapes(shapes);
        //format vyvoda - 2 znaka posle ","
        System.out.printf("Total area shapes = %.2f%n", calculateAreaShapes(shapes));
        System.out.printf("Area triangles -> %.2f%n", calculateAreaShapes(shapes, Triangle.class));

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

    //otobrazhenie f igur:
    public void printShapes(Shape[] shapes) {
        for (Shape ss : shapes) {
            System.out.println(ss + " -> area=" + ss.calcArea());
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
