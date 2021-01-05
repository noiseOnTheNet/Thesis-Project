package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class No_comma_expr_equalTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        No_comma_expr_equal no_comma_expr_equal = new No_comma_expr_equal(new Primary_string("z"), new Primary_string("x"));
        no_comma_expr_equal.dump(printStream, map);
        assertEquals("z = x",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new No_comma_expr_equal(new Primary_string("z"), new Primary_string("x"));
        Expression expr2 = new No_comma_expr_equal(new Primary_string("z"), new Primary_string("x"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}