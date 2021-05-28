package fr.kevin.test;

import fr.kevin.prog.Circle;
import fr.kevin.prog.GeometricShape;
import fr.kevin.prog.Rectangle;
import fr.kevin.prog.Triangle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PaintApp {

    public ArrayList<GeometricShape> shapes;
    public Painter<Component> painter;

    public PaintApp(ArrayList<GeometricShape> shapes) {
        this.shapes = shapes;
        painter = (graphics2D, component, i, i1) -> {
            for (GeometricShape shape : shapes) {
                if (shape instanceof Rectangle)
                    paintRectangle((Rectangle) shape, graphics2D);
                else if (shape instanceof Circle)
                    paintCircle((Circle) shape, graphics2D);
                else if (shape instanceof Triangle)
                    paintTriangle((Triangle) shape, graphics2D);
            }
        };
    }

    public void paintRectangle(Rectangle r, Graphics g) {
        g.drawRect(r.getOrigin().getX(), r.getOrigin().getY(), r.width(), r.height());
    }

    public void paintCircle(Circle c, Graphics g) {
        g.drawOval(c.getCenter().getX(), c.getCenter().getY(), c.getRadius(), c.getRadius());
    }

    public void paintTriangle(Triangle t, Graphics g) {
        g.drawLine(t.getFirstPoint().getX(), t.getFirstPoint().getY(), t.getSecondPoint().getX(),
                t.getSecondPoint().getY());
        g.drawLine(t.getFirstPoint().getX(), t.getFirstPoint().getY(), t.getThirdPoint().getX(),
                t.getThirdPoint().getY());
        g.drawLine(t.getSecondPoint().getX(), t.getSecondPoint().getY(), t.getThirdPoint().getX(),
                t.getThirdPoint().getY());
    }
}
