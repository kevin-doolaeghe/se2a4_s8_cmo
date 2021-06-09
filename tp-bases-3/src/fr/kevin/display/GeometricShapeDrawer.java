package fr.kevin.display;

import fr.kevin.shape.GeometricShape;

import java.awt.*;

public abstract class GeometricShapeDrawer {

    protected GeometricShape gs;

    public abstract void drawOn(Graphics g);

    public GeometricShape getGs() {
        return gs;
    }

    public void setGs(GeometricShape gs) {
        this.gs = gs;
    }

}
