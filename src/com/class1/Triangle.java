package com.class1;

import java.util.Scanner;

public class Triangle extends Shape{
    double side1;
    double side2;
    double side3;
    double Area;
    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Side1: ");
        side1=input.nextInt();
        System.out.println("Enter Side2: ");
        side2=input.nextInt();
        System.out.println("Enter Side3: ");
        side3 = input.nextInt();
    }

    @Override
    public double getArea() {
        double area;
        double p =(side1+side2+side3)/2;
        return this.Area=area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public void display() {
        System.out.println("Area Triangle: "+Area);
    }
}
