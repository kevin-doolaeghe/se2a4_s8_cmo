package fr.kevin.shape;

import fr.kevin.display.CircleDrawer;
import fr.kevin.display.GeometricShapeDrawer;

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
    public GeometricShapeDrawer createDrawer() {
        CircleDrawer drawer = new CircleDrawer();
        drawer.setGs(this);
        return drawer;
    }
}
