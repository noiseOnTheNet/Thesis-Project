package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Unop_plusTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Unop_plus unop_plus = new Unop_plus("+");
        unop_plus.dump(printStream, map);
        assertEquals("+",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Unop_plus("+");
        Expression expr2 = new Unop_plus("+");
        assertTrue(expr1.equals(expr2));
    }
}