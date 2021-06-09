package fr.kevin.test;

import fr.kevin.saisie.CommandLineInterface;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class CommandLineInterfaceTest {

    private CommandLineInterface cli;

    public CommandLineInterfaceTest() {
        setup();
    }

    @BeforeEach
    private void setup() {
        cli = new CommandLineInterface();
    }

    @Test
    public void stCode() {
        assertEquals("Hello world", cli.scanCommand());
    }

}
