package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_fespaceTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_fespace parameters_fespace = new Parameters_fespace("fespace");
        parameters_fespace.dump(printStream, map);
        assertEquals("fespace",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_fespace("fespace");
        Expression expr2 = new Parameters_fespace("fespace");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}