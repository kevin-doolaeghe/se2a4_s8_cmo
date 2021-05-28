package fr.kevin.prog;

import fr.kevin.test.*;

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

        TriangleTest tt = new TriangleTest();
        tt.aire();
        tt.perimetre();

        CircleTest ct = new CircleTest();
        ct.creation();
        ct.aire();
        ct.perimetre();

        SquareTest st = new SquareTest();
        st.aire();
        st.perimetre();
    }

}


