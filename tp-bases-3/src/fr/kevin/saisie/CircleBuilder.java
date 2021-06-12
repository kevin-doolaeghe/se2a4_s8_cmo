package fr.kevin.saisie;

import fr.kevin.exception.BuildShapeException;
import fr.kevin.shape.Circle;
import fr.kevin.shape.GeometricShape;

public class CircleBuilder extends GeometricShapeBuilder{

    @Override
    public GeometricShape build(String[] data) throws BuildShapeException {
        try {
            int x = Integer.parseInt(data[1]);
            int y = Integer.parseInt(data[2]);
            int radius = Integer.parseInt(data[3]);
            return new Circle(x, y, radius);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new BuildShapeException("Missing data", e);
        } catch (NumberFormatException e) {
            throw new BuildShapeException("Data input must be integer", e);
        }
    }

}
