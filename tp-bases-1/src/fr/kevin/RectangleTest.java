package fr.kevin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void testRectangle() {
        Rectangle r = new Rectangle(0,0,10,20);

        assertEquals(0, r.getOrigin().getX());
        assertEquals(0, r.getOrigin().getY());
        assertEquals(10, r.getCorner().getX());
        assertEquals(20, r.getCorner().getY());
        /*
        assert r.getOrigin().getX() == 0 : "r.x1 est égal à 0";
        assert r.getOrigin().getY() == 0 : "r.y1 est égal à 0";
        assert r.getCorner().getX() == 10 : "r.x2 est égal à 10";
        assert r.getCorner().getY() == 20 : "r.y2 est égal à 20";
        */
    }

}
