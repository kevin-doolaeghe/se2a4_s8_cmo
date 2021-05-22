package fr.kevin;

public class Main {

    public void displayPoint(Point point) {
        System.out.println("x: " + point.getX() + ", y: " + point.getY());
        System.out.println("- - - - - - - - - - - - -");
    }

    public void displayRectangle(Rectangle rectangle) {
        System.out.println("x1: " + rectangle.getOrigin().getX() + ", y1: " + rectangle.getOrigin().getY());
        System.out.println("x2: " + rectangle.getCorner().getX() + ", y2: " + rectangle.getCorner().getY());
        System.out.println("width: " + rectangle.width());
        System.out.println("height: " + rectangle.height());
        System.out.println("area: " + rectangle.area());
        System.out.println("perimeter: " + rectangle.perimeter());
        System.out.println("- - - - - - - - - - - - -");
    }

    public void handlePoint() {
        Point p1 = new Point();
        Point p2 = new Point(10,20);

        displayPoint(p1);
        displayPoint(p2);
    }

    public void handleRectangle() {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(0,0,10,20);

        displayRectangle(r1);
        displayRectangle(r2);
    }

    public static void main(String[] args) {
        new Main().handlePoint();
        new Main().handleRectangle();
        new PointTest().testPoint();
        new RectangleTest().testRectangle();
    }

}
