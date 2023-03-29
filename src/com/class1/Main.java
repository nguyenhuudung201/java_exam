package com.class1;

public class Main {
    public static void main(String[] args) {
       /* Circle circle = new Circle();
        circle.inputData();
        circle.getArea();
        circle.display();
        Rectangle rectangle = new Rectangle();
        rectangle.inputData();
        rectangle.getArea();
        rectangle.display();
        Triangle triangle = new Triangle();
        triangle.inputData();
        triangle.getArea();
        triangle.display();*/
        Shape shape[]= new  Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Triangle();

        int total = 0;
        for (Shape item : shape) {
            item.inputData();
            item.getArea();
            item.display();
            total += item.getArea();
        }

        System.out.println("Total Area: " + total);
    }
}
