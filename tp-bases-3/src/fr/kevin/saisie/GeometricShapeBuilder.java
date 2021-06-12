package fr.kevin.saisie;

import fr.kevin.exception.BuildShapeException;
import fr.kevin.shape.GeometricShape;

public abstract class GeometricShapeBuilder {

    public abstract GeometricShape build(String[] shape) throws BuildShapeException;

}
