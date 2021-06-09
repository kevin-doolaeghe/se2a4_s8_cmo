package fr.kevin.test;

import fr.kevin.shape.Square;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    private Square s;

    public SquareTest() {
        setup();
    }

    @BeforeEach
    private void setup() {
        s = new Square(10, 20, 5);
    }

    @Test
    public void aire() {
        assertEquals(25, s.area());
    }

    @Test
    public void perimetre() {
        assertEquals(20, s.perimeter());
    }

}
