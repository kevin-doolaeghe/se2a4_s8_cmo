package fr.kevin.prog;

public class Point {

    private int x;
    private int y;

    public Point() {
        setX(0);
        setY(0);
    }

    public Point(int i, int j) {
        setX(i);
        setY(j);
    }

    public String print() {
        return "<" + getX() + "@" + getY() + ">";
    }

    public int distance(Point p) {
        int dx = getX() - p.getX();
        int dy = getY() - p.getY();
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    public int getX() { return x; }

    public int getY() { return y; }

    public void setX(int x) { this.x = x; }

    public void setY(int y) { this.y = y; }

}
