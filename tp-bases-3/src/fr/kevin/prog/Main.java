package fr.kevin.prog;

import fr.kevin.painter.PaintApp;
import fr.kevin.test.*;

public class Main {

    public static void main(String[] args) {
        PointTest pt = new PointTest();
        pt.creation();
        pt.distance();
        pt.print();

        RectangleTest rt = new RectangleTest();
        rt.creation();
        rt.height();
        rt.aire();
        rt.perimetre();
        rt.print();
        rt.dessin();

        TriangleTest tt = new TriangleTest();
        tt.creation();
        tt.taille();
        tt.aire();
        tt.perimetre();

        CircleTest ct = new CircleTest();
        ct.creation();
        ct.aire();
        ct.perimetre();

        SquareTest st = new SquareTest();
        st.aire();
        st.perimetre();

        PaintApp app = new PaintApp();
    }

}


