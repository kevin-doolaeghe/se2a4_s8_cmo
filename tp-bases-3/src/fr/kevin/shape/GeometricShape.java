package fr.kevin.shape;

import fr.kevin.display.GeometricShapeDrawer;

public abstract class GeometricShape {

    public abstract int area();

    public abstract int perimeter();

    public abstract GeometricShapeDrawer createDrawer();

}
