package com.class1;

import java.util.Scanner;

public class Rectangle extends  Shape  {
    int Length;
    int width;

    int Area;
    @Override
    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length ");
        Length=input.nextInt();
        System.out.println("Enter width ");
        width=input.nextInt();
    }

    @Override
    public double getArea() {
        int area=0;
        return this.Area=area=width*Length ;
    }

    @Override
    public void display() {
        System.out.println("Area Rectangle: " +Area);
    }
}
