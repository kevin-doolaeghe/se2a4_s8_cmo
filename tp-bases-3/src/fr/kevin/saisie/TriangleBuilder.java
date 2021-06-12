package fr.kevin.saisie;

import fr.kevin.exception.BuildShapeException;
import fr.kevin.shape.GeometricShape;
import fr.kevin.shape.Triangle;

public class TriangleBuilder extends GeometricShapeBuilder {

    @Override
    public GeometricShape build(String[] data) throws BuildShapeException {
        try {
            int x1 = Integer.parseInt(data[1]);
            int y1 = Integer.parseInt(data[2]);
            int x2 = Integer.parseInt(data[3]);
            int y2 = Integer.parseInt(data[4]);
            int x3 = Integer.parseInt(data[5]);
            int y3 = Integer.parseInt(data[6]);
            return new Triangle(x1, y1, x2, y2, x3, y3);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new BuildShapeException("Missing data", e);
        } catch (NumberFormatException e) {
            throw new BuildShapeException("Data input must be integer", e);
        }
    }
}
