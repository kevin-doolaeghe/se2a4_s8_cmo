package fr.kevin.prog;

import fr.kevin.test.PointTest;
import fr.kevin.test.RectangleTest;

public class Main {

    public static void main(String[] args) {
        PointTest pt = new PointTest();
        pt.creation();
        pt.print();

        RectangleTest rt = new RectangleTest();
        rt.creation();
        rt.height();
        rt.aire();
        rt.perimetre();
        rt.print();
    }

}


