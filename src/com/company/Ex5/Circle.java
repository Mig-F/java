package com.company.Ex5;

public class Circle extends Shape{
    double pi = Math.PI;
    double radius;
    public Circle(double radius, String Color)
    {
        super(Color);
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double getArea()
    {
        return pi*Math.pow(radius,2);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
