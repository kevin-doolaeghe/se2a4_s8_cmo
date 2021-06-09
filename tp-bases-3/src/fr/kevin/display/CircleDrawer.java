package fr.kevin.display;

import fr.kevin.shape.Circle;

import java.awt.*;

public class CircleDrawer extends GeometricShapeDrawer {

    @Override
    public void drawOn(Graphics g) {
        Circle c = (Circle) getGs();
        g.drawOval(c.getCenter().getX(), c.getCenter().getY(), c.getRadius(), c.getRadius());
    }

}
