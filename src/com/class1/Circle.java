package com.class1;
import java.util.Scanner;
public class Circle extends Shape {
    int r;
    double area;
    @Override
    public void inputData() {
        System.out.print("Enter R : ");
        Scanner input = new Scanner(System.in);
        r=input.nextInt();
    }

    @Override
    public double getArea() {
        double area=0;
        return this.area = area= Math.pow(r, 2)*3.14;
    }

    @Override
    public void display() {
        System.out.println("Area Circle: "+area);
    }


}
