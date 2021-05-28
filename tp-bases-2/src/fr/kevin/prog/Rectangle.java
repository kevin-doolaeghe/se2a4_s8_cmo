package fr.kevin.prog;

public class Rectangle {

    private Point origin;
    private Point corner;

    public Rectangle() {
        this(0,0,0,0);
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        origin = new Point(x1, y1);
        corner = new Point(x2, y2);
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

    public String print() {
        return "Rectangle: (" + getOrigin().print() + " , " + getCorner().print() + ")";
    }

    public Point getOrigin() { return origin; }

    public Point getCorner() { return corner; }

    public void setOrigin(Point origin) { this.origin = origin; }

    public void setCorner(Point corner) { this.corner = corner; }
}
