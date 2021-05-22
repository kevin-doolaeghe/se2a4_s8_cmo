package fr.kevin;

public class Rectangle {

    private Point origin;
    private Point corner;

    public Rectangle() {
        this(0,0,0,0);
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        origin = new Point();
        corner = new Point();
        setOrigin(x1, y1);
        setCorner(x2, y2);
    }

    public int width() {
        int x1 = origin.getX();
        int x2 = corner.getX();
        return Math.abs(x1-x2);
    }

    public int height() {
        int y1 = origin.getY();
        int y2 = corner.getY();
        return Math.abs(y1-y2);
    }

    public int area() {
        return width() * height();
    }

    public int perimeter() {
        return 2 * width() + 2 * height();
    }

    public Point getOrigin() { return origin; }

    public Point getCorner() { return corner; }

    public void setOrigin(int x, int y) {
        origin.setX(x);
        origin.setY(y);
    }
    public void setCorner(int x, int y) {
        corner.setX(x);
        corner.setY(y);
    }

}
