package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParameterstypeTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameterstype parameterstype = new Parameterstype(new Primary_string("z=4+8"), new Primary_string("x"));
        parameterstype.dump(printStream, map);
        assertEquals("z=4+8, x",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameterstype(new Primary_string("z=4+8"), new Primary_string("x"));
        Expression expr2 = new Parameterstype(new Primary_string("z=4+8"), new Primary_string("x"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}