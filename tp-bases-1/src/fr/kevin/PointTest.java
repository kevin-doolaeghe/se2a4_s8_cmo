package fr.kevin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void testPoint() {
        Point p = new Point(10, 20);

        assertEquals(10, p.getX());
        assertEquals(20, p.getY());
        /*
        assert p.getX() == 10 : "p.x est égal à 10";
        assert p.getY() == 20 : "p.y est égal à 20";
        */
    }

}
