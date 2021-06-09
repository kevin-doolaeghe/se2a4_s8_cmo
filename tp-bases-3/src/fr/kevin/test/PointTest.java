package fr.kevin.test;

import fr.kevin.shape.Point;
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
    }

    @Test
    public void distance() {
        Point p2 = new Point(20, 20);
        assertEquals(10, p.distance(p2));
    }

    @Test
    public void print() {
        assertEquals("<10@20>", p.print());
    }

}
