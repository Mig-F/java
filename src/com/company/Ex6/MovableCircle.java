package com.company.Ex6;
import com.company.Ex5.Circle;

public class MovableCircle extends Circle implements Movable {
    private Point center;
    public MovableCircle(double radius,String color, int x, int y) {
        super(radius, color);
        center = new Point(x, y);
    }

    @Override
    public void move(int right, int down) {
        center.move(right, down);
    }
}