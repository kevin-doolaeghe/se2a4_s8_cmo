package fr.kevin.prog;

import java.awt.*;

public class Circle extends GeometricShape {

    protected Point center;
    protected int radius;

    public Circle() {
        this(0, 0, 0);
    }

    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int perimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public void drawOn(Graphics g) {
        g.drawOval(getCenter().getX(), getCenter().getY(), getRadius(), getRadius());
    }


}
