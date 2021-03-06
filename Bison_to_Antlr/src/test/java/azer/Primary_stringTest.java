package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_stringTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Primary_string string = new Primary_string("This is test String !@#$%^");
        string.dump(printStream, map);
        assertEquals("This is test String !@#$%^", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_string("x+5");
        Expression expr2 = new Primary_string("x+5");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}