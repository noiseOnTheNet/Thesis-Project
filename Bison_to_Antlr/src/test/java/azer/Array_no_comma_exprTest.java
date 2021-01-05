package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Array_no_comma_exprTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Array_no_comma_expr array_no_comma_expr = new Array_no_comma_expr(new Primary_string("x+2"));
        array_no_comma_expr.dump(printStream, map);
        assertEquals("x+2",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Array_no_comma_expr(new Primary_string("x+2"));
        Expression expr2 = new Array_no_comma_expr(new Primary_string("x+2"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}