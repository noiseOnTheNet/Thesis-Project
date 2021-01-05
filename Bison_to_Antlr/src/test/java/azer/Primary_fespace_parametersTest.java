package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression parameters = new Parameters_fespace("fespace");
        Primary_fespace_parameters primary_fespace_parameters = new Primary_fespace_parameters("fespace", parameters);
        primary_fespace_parameters.dump(printStream, map);
        assertEquals("fespace(fespace)", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_fespace_parameters("fespace", new Primary_string("fespace"));
        Expression expr2 = new Primary_fespace_parameters("fespace", new Primary_string("fespace"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}