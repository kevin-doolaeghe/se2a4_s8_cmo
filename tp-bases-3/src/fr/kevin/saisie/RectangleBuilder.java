package fr.kevin.saisie;

import fr.kevin.exception.BuildShapeException;
import fr.kevin.shape.GeometricShape;
import fr.kevin.shape.Rectangle;

public class RectangleBuilder extends GeometricShapeBuilder {

    @Override
    public GeometricShape build(String[] shape) throws BuildShapeException {
        try {
            return new Rectangle(Integer.parseInt(shape[1]), Integer.parseInt(shape[2]), Integer.parseInt(shape[3]),
                    Integer.parseInt(shape[4]));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new BuildShapeException("Missing data", e);
        } catch (NumberFormatException e) {
            throw new BuildShapeException("Data input must be integer", e);
        }
    }

}
