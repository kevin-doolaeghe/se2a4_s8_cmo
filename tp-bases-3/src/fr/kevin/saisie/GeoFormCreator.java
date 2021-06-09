package fr.kevin.saisie;

import fr.kevin.exception.InvalidIntFormatException;
import fr.kevin.exception.WrongShapeNameException;
import fr.kevin.shape.*;

public class GeoFormCreator {

    private CommandLineInterface cli;

    public GeoFormCreator() {
        cli = new CommandLineInterface();
    }

    public GeometricShape createShape(String name) throws WrongShapeNameException, InvalidIntFormatException {
        GeometricShape s;
        try {
            if (name.compareTo("Rectangle") == 0) {
                s = readRectangle();
            } else if (name.compareTo("Square") == 0) {
                s = readSquare();
            } else if (name.compareTo("Circle") == 0) {
                s = readCircle();
            } else if (name.compareTo("Triangle") == 0) {
                s = readTriangle();
            } else {
                throw new WrongShapeNameException("Could not recognize shape name.");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new InvalidIntFormatException("Invalid parameters!");
        }
        return s;
    }

    private Rectangle readRectangle() throws NumberFormatException {
        System.out.println("Enter x1:");
        int x1 = cli.readInteger();
        System.out.println("Enter y1:");
        int y1 = cli.readInteger();
        System.out.println("Enter x2:");
        int x2 = cli.readInteger();
        System.out.println("Enter y2:");
        int y2 = cli.readInteger();

        return new Rectangle(x1, y1, x2, y2);
    }

    private Square readSquare(){
        System.out.println("Enter x1:");
        int x = cli.readInteger();
        System.out.println("Enter y1:");
        int y = cli.readInteger();
        System.out.println("Enter length:");
        int l = cli.readInteger();

        return new Square(x, y, l);
    }

    private Circle readCircle() {
        System.out.println("Enter x0:");
        int x = cli.readInteger();
        System.out.println("Enter y0:");
        int y = cli.readInteger();
        System.out.println("Enter radius:");
        int r = cli.readInteger();

        return new Circle(x, y, r);
    }

    private Triangle readTriangle() {
        System.out.println("Enter x1:");
        int x1 = cli.readInteger();
        System.out.println("Enter y1:");
        int y1 = cli.readInteger();
        System.out.println("Enter x2:");
        int x2 = cli.readInteger();
        System.out.println("Enter y2:");
        int y2 = cli.readInteger();
        System.out.println("Enter x3:");
        int x3 = cli.readInteger();
        System.out.println("Enter y3:");
        int y3 = cli.readInteger();

        return new Triangle(x1, y1, x2, y2, x3, y3);
    }

}
