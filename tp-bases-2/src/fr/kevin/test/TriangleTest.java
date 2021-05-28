package fr.kevin.test;

import fr.kevin.prog.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    private Triangle t;

    public TriangleTest() {
        setup();
    }

    @BeforeEach
    private void setup() {
        t = new Triangle(10, 20, 5, 6, 7, 8);
    }

    @Test
    public void aire() {
        int aire = (int) (Math.PI * 5 * 5);
        assertEquals(aire, t.area());
    }

    @Test
    public void perimetre() {
        int perimetre = (int) (2 * Math.PI * 5);
        assertEquals(perimetre, t.perimeter());
    }

}
