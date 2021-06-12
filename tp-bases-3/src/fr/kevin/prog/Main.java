package fr.kevin.prog;

import fr.kevin.painter.PaintApp;
import fr.kevin.saisie.CommandLineInterface;
import fr.kevin.saisie.GeoFormCreator;
import fr.kevin.shape.GeometricShape;
import fr.kevin.test.BooleanTest;

import java.util.ArrayList;

public class Main {

    public void testLogic() {
        BooleanTest booleanTest = new BooleanTest();
        booleanTest.run();
    }

    public void promptShapesForDisplay() {
        CommandLineInterface cli = new CommandLineInterface();

        ArrayList<GeometricShape> shapes = new ArrayList<>();
        GeoFormCreator creator = new GeoFormCreator();

        try {
            System.out.print("Enter the number of shapes to draw: ");
            int nb = Integer.parseInt(cli.scanCommand());
            for (int i = 0; i < nb; i++) {
                shapes.add(creator.promptShape());
            }
            new PaintApp(shapes);
        } catch (NumberFormatException e) {
            System.out.println("Cannot read a valid number");
            promptShapesForDisplay();
        }
    }

    public static void main(String[] args) {
        new Main().promptShapesForDisplay();
        new Main().testLogic();
    }

}


