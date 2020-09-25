package com.company.Ex6;
import com.company.Ex5.Rectangle;
class MovableRectangle extends Rectangle implements Movable {
    private Point center;
    public MovableRectangle(double Width,  double Length,String Color)
    {
        super( Width, Length, Color);
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void move(int right, int down) {
        center.move(right, down);
    }
}
