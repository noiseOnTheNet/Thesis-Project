package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace1_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression parameters = new Parameters_fespace("d");
        Primary_fespace1_parameters primary_fespace1_parameters = new Primary_fespace1_parameters("fespace1", parameters);
        primary_fespace1_parameters.dump(printStream, map);
        assertEquals("fespace1(d)", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_fespace1_parameters("fespace1", new Primary_string("x+5"));
        Expression expr2 = new Primary_fespace1_parameters("fespace1", new Primary_string("x+5"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}