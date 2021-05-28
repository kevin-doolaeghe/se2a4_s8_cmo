package fr.kevin.test;

import fr.kevin.prog.Rectangle;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    private Rectangle r;

    public RectangleTest() {
        setup();
    }

    @BeforeEach
    private void setup() {
        r = new Rectangle(4, 2, 3, 1);
    }

    @Test
    public void creation() {
        assertEquals(4, r.getOrigin().getX());
        assertEquals(2, r.getOrigin().getY());
        assertEquals(3, r.getCorner().getX());
        assertEquals(1, r.getCorner().getY());
    }

    @Test
    public void width() {
        assertEquals(1, r.width());
    }

    @Test
    public void height() {
        assertEquals(1, r.height());
    }

    @Test
    public void aire() {
        assertEquals(1, r.area());
    }

    @Test
    public void perimetre() {
        assertEquals(4, r.perimeter());
    }

    @Test
    public void print() {
        Rectangle r = new Rectangle(4, 2, 3, 5);
        assertEquals("Rectangle: (<4@2> , <3@5>)", r.print());
        // System.out.println(r.print());
    }

}
