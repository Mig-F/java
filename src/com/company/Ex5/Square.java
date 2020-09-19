package com.company.Ex5;

public class Square extends Shape{
    double Side;
    boolean Filled;
    public Square(double Side,boolean Filled,String Color)
    {
        super(Color);
        this.Filled = Filled;
        this.Side = Side;
    }
    public void setSide(double Side)
    {
        this.Side = Side;
    }
    public void setFilled(boolean Filled)
    {
        this.Filled = Filled;
    }
    public double getSide() {
        return Side;
    }
    public boolean getFilled() {
        return Filled;
    }
    @Override
    double getArea()
    {
        return Math.pow(Side,2);
    }
    @Override
    public String toString() {
        return "Square {" +
                "Side=" + Side +
                ",Filled = " + Filled +
                '}';
    }
}
