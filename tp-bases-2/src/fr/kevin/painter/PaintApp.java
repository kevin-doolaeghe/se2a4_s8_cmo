package fr.kevin.painter;

import fr.kevin.shape.*;
import fr.kevin.shape.Rectangle;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class PaintApp extends Frame {

    private ArrayList<GeometricShape> shapes;
    private Painter painter;

    public PaintApp() {
        Rectangle r = new Rectangle(100, 100, 220, 180);
        Circle c = new Circle(400, 300, 130);
        Triangle t = new Triangle(30, 220, 300, 260, 100, 400);
        Square s = new Square(300, 20, 100);

        shapes = new ArrayList<>();
        shapes.add(r);
        shapes.add(c);
        shapes.add(t);
        shapes.add(s);

        painter = new Painter(shapes);
        this.add(painter);
        this.setTitle("PaintApp");
        this.setSize(600, 600);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        painter.paint(g);
    }

}
