package fr.kevin.prog;

import fr.kevin.exception.InvalidIntFormatException;
import fr.kevin.exception.WrongShapeNameException;
import fr.kevin.painter.PaintApp;
import fr.kevin.saisie.CommandLineInterface;
import fr.kevin.saisie.GeoFormCreator;
import fr.kevin.shape.GeometricShape;

import java.util.ArrayList;

public class Main {

    public void promptShapesForDisplay() {
        CommandLineInterface cli = new CommandLineInterface();

        GeoFormCreator creator = new GeoFormCreator();
        ArrayList<GeometricShape> shapes = new ArrayList<>();

        try {
            System.out.println("Enter the number of shapes to draw:");
            int nb = cli.readInteger();
            for (int i = 0; i < nb; i++) {
                try {
                    System.out.println("Enter the name of the shape you want to print:");
                    String name = new CommandLineInterface().scanCommand();
                    GeometricShape shape = creator.createShape(name);
                    shapes.add(shape);
                } catch (WrongShapeNameException | InvalidIntFormatException e) {
                    e.printStackTrace();
                }
            }
            new PaintApp(shapes);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Cannot read a valid number, exiting program");
        }
    }

    public static void main(String[] args) {
        new Main().promptShapesForDisplay();
    }

}


