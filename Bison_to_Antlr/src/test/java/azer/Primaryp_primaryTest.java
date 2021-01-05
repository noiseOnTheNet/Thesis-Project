package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primaryp_primaryTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression primary = new Primary_string("45");
        Primaryp_primary primaryp_primary = new Primaryp_primary(primary);
        primaryp_primary.dump(printStream, map);
        assertEquals("45",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primaryp_primary(new Primary_string("x+5"));
        Expression expr2 = new Primaryp_primary(new Primary_string("x+5"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}