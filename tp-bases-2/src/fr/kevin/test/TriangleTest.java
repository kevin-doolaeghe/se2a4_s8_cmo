package fr.kevin.test;

import fr.kevin.prog.Triangle;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    private Triangle t;

    public TriangleTest() {
        setup();
    }

    @BeforeEach
    private void setup() {
        t = new Triangle(0, 0, 6, 0, 3, 4);
    }

    @Test
    public void creation() {
        assertEquals(0, t.getFirstPoint().getX());
        assertEquals(0, t.getFirstPoint().getY());
        assertEquals(6, t.getSecondPoint().getX());
        assertEquals(0, t.getSecondPoint().getY());
        assertEquals(3, t.getThirdPoint().getX());
        assertEquals(4, t.getThirdPoint().getY());
    }

    @Test
    public void taille() {
        assertEquals(6, t.getL12());
        assertEquals(5, t.getL13());
        assertEquals(5, t.getL23());
    }

    @Test
    public void aire() {
        assertEquals(12, t.area());
    }

    @Test
    public void perimetre() {
        assertEquals(16, t.perimeter());
    }

}
