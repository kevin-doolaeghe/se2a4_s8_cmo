package fr.kevin.display;

import fr.kevin.shape.Triangle;

import java.awt.*;

public class TriangleDrawer extends GeometricShapeDrawer {

    @Override
    public void drawOn(Graphics g) {
        Triangle t = (Triangle) getGs();
        g.drawLine(t.getFirstPoint().getX(), t.getFirstPoint().getY(), t.getSecondPoint().getX(),
                t.getSecondPoint().getY());
        g.drawLine(t.getFirstPoint().getX(), t.getFirstPoint().getY(), t.getThirdPoint().getX(),
                t.getThirdPoint().getY());
        g.drawLine(t.getSecondPoint().getX(), t.getSecondPoint().getY(), t.getThirdPoint().getX(),
                t.getThirdPoint().getY());
    }

}
