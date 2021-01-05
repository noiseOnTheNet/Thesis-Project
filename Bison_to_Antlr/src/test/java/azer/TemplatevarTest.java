package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TemplatevarTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Templatevar templatevar = new Templatevar("x", new Primary_string("y"));
        templatevar.dump(printStream, map);
        assertEquals("$ {x:y}",baos.toString());
    }

    @Test
    void testEquals() {
        Expression expr1 = new Templatevar("x", new Primary_string("y"));
        Expression expr2 = new Templatevar("x", new Primary_string("y"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}