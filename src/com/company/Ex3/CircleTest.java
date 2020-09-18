package com.company.Ex3;

public class CircleTest {
    public static void main(String[] args)
    {
        Circle Circle = new Circle(12);
        double radius = Circle.getRadius();
        System.out.println(radius);
        Circle.setRadius(15);
        System.out.println(Circle.getRadius());
        System.out.println(Circle);

    }
}