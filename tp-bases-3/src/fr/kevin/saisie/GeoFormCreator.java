package fr.kevin.saisie;

import fr.kevin.exception.BuildShapeException;
import fr.kevin.shape.*;

import java.util.HashMap;
import java.util.Map;

public class GeoFormCreator {

    private CommandLineInterface cli;
    private Map<String, GeometricShapeBuilder> builderMap;

    public GeoFormCreator() {
        cli = new CommandLineInterface();

        builderMap = new HashMap<>();
        builderMap.put("rectangle", new RectangleBuilder());
        builderMap.put("circle", new CircleBuilder());
        builderMap.put("triangle", new TriangleBuilder());
        builderMap.put("square", new SquareBuilder());
    }

    public GeometricShape promptShape() {
        System.out.print("Enter the shape to draw (name data): ");
        String[] data = cli.scanCommand().split(" ");
        GeometricShapeBuilder builder;

        try {
            builder = builderMap.get(data[0]);
            return builder.build(data);
        } catch (NullPointerException e) {
            System.out.println("Could not recognize shape: " + data[0]);
            return promptShape();
        } catch (BuildShapeException e) {
            System.out.println(e.getMessage());
            return promptShape();
        }
    }

}
