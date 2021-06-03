package fr.kevin.display;

import fr.kevin.shape.Rectangle;

import java.awt.*;

public class RectangleDrawer extends GeometricShapeDrawer {

    @Override
    public void drawOn(Graphics g) {
        Rectangle r = (Rectangle) getGs();
        g.drawRect(r.getOrigin().getX(), r.getOrigin().getY(), r.width(), r.height());
    }

}
