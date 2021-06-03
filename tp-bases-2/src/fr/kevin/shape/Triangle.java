package fr.kevin.shape;

import fr.kevin.display.GeometricShapeDrawer;
import fr.kevin.display.TriangleDrawer;

import java.awt.*;

public class Triangle extends GeometricShape {

    protected Point[] points;

    public Triangle() {
        this(0, 0, 0, 0, 0, 0);
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        points = new Point[]{new Point(x1, y1), new Point(x2, y2), new Point(x3, y3)};
    }

    public Point getFirstPoint() {
        return points[0];
    }

    public Point getSecondPoint() {
        return points[1];
    }

    public Point getThirdPoint() {
        return points[2];
    }

    public int getL12() {
        return points[0].distance(points[1]);
    }

    public int getL13() {
        return points[0].distance(points[2]);
    }

    public int getL23() {
        return points[1].distance(points[2]);
    }

    @Override
    public int area() {
        int half_p = perimeter() / 2;
        int h = (int) (2 / (double) getL12() * Math.sqrt(half_p * (half_p - getL12()) * (half_p - getL13())
                * (half_p - getL23())));
        return getL12() * h / 2;
    }

    @Override
    public int perimeter() {
        return getL12() + getL13() + getL23();
    }

    @Override
    public GeometricShapeDrawer createDrawer() {
        TriangleDrawer drawer = new TriangleDrawer();
        drawer.setGs(this);
        return drawer;
    }

}
