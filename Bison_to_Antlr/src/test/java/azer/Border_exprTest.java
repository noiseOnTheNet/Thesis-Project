package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Border_exprTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Border_expr border_expr = new Border_expr(new Primary_string("(x = 5, 6)"), new Primary_string("z++"));
        border_expr.dump(printStream, map);
        assertEquals("(x = 5, 6) z++",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Border_expr(new Primary_string("(x = 5, 6)"), new Primary_string("z++"));
        Expression expr2 = new Border_expr(new Primary_string("(x = 5, 6)"), new Primary_string("z++"));
        assertTrue(expr1.equals(expr2));
    }
}