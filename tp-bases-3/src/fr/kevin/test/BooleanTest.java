package fr.kevin.test;

import fr.kevin.logic.False;
import fr.kevin.logic.True;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanTest {

    @Test
    public void run() {
        True t = new True();
        False f = new False();

        assertTrue(t.value());
        assertFalse(f.value());
        assertFalse(t.not());
        assertTrue(f.not());
        assertTrue(t.or(f));
        assertTrue(f.or(t));
        assertFalse(t.and(f));
        assertFalse(f.and(t));
        assertTrue(t.xor(f));
        assertTrue(f.xor(t));
        assertEquals("True", t.toString());
        assertEquals("False", f.toString());
    }

}
