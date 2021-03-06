package fr.kevin.painter;

import fr.kevin.shape.GeometricShape;

import java.awt.*;
import java.util.ArrayList;

public class Painter extends Panel {

    private ArrayList<GeometricShape> shapes;

    public Painter(ArrayList<GeometricShape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);

        for (GeometricShape shape : shapes) {
            shape.createDrawer().drawOn(g);
        }
    }

}
