package fr.kevin.saisie;

import fr.kevin.exception.BuildShapeException;
import fr.kevin.shape.GeometricShape;
import fr.kevin.shape.Square;

public class SquareBuilder extends GeometricShapeBuilder {

    @Override
    public GeometricShape build(String[] shape) throws BuildShapeException {
        try {
            return new Square(Integer.parseInt(shape[1]), Integer.parseInt(shape[2]), Integer.parseInt(shape[3]));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new BuildShapeException("Missing data", e);
        } catch (NumberFormatException e) {
            throw new BuildShapeException("Data input must be integer", e);
        }
    }

}
