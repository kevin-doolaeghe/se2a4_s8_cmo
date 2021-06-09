package fr.kevin.shape;

public class Square extends Rectangle {

    public Square() {
        this(0, 0, 0);
    }

    public Square(int x, int y, int l) {
        super(x, y, x + l, y + l);
    }

}
