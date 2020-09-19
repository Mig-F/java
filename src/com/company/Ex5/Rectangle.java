package com.company.Ex5;

public class Rectangle extends Shape{
    double Width;
    double Length;
    public Rectangle (double Width,  double Length,String Color)
    {
        super(Color);
        this.Width = Width;
        this.Length = Length;
    }
    public void setWidth(double Width)
    {
        this.Width = Width;
    }
    public void setLength(double Length)
    {
        this.Length = Length;
    }
    public double getWidth() {
        return Width;
    }
    public double getLength() {
        return Length;
    }
    @Override
    double getArea()
    {
        return Width*Length;
    }
    @Override
    public String toString() {
        return "Rectangle {" +
                "Width=" + Width +
                ", Length = " + Length +
                '}';
    }
}

