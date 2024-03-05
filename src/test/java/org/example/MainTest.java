package org.example;
import org.junit.jupiter.api.Test;

import org.example.Main;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


public class MainTest {

    @Test
    public void testMainMethod() {
        // Simulate input
        String simulatedInput = "Hola\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Execute main method
        Main.main(new String[]{});
    }

    @Test
    public void testMainMethodWithIOException() {
        // Simulate input stream that throws IOException when read
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                throw new IOException("Simulated IOException");
            }
        };

        // Set the simulated input stream
        System.setIn(inputStream);

    }
}