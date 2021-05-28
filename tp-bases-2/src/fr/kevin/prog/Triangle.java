package fr.kevin.prog;

public class Triangle extends GeometricShape {

    protected Point[] points;

    public Triangle() {
        this(0, 0, 0, 0, 0, 0);
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        points = new Point[]{new Point(x1, y1), new Point(x2, y2), new Point(x3, y3)};
    }

    @Override
    public int area() {
        return (int) 1;
    }

    @Override
    public int perimeter() {
        return (int) 1;
    }
}
