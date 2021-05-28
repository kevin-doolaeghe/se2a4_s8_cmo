package fr.kevin.test;

import fr.kevin.prog.Point;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class PointTest {

    private Point p;

    public PointTest() {
        setup();
    }

    @BeforeEach
    private void setup() {
        p = new Point(10, 20);
    }

    @Test
    public void creation() {
        assertEquals(10, p.getX());
        assertEquals(20, p.getY());
        /*
        assert p.getX() == 10 : "p.x est égal à 10";
        assert p.getY() == 20 : "p.y est égal à 20";
        */
    }

    @Test
    public void print() {
        assertEquals("<10@20>", p.print());
    }

}
