package fr.kevin.test;

import fr.kevin.shape.Circle;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private Circle c;

    public CircleTest() {
        setup();
    }

    @BeforeEach
    private void setup() {
        c = new Circle(10, 20, 5);
    }

    @Test
    public void creation() {
        assertEquals(10, c.getCenter().getX());
        assertEquals(20, c.getCenter().getY());
    }

    @Test
    public void aire() {
        int aire = (int) (Math.PI * 5 * 5);
        assertEquals(aire, c.area());
    }

    @Test
    public void perimetre() {
        int perimetre = (int) (2 * Math.PI * 5);
        assertEquals(perimetre, c.perimeter());
    }

}
