package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class No_comma_expr_multEqualTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        No_comma_expr_multEqual no_comma_expr_multEqual = new No_comma_expr_multEqual(new Primary_string("z"), new Primary_string("x"));
        no_comma_expr_multEqual.dump(printStream, map);
        assertEquals("z *= x",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new No_comma_expr_multEqual(new Primary_string("z"), new Primary_string("x"));
        Expression expr2 = new No_comma_expr_multEqual(new Primary_string("z"), new Primary_string("x"));
        assertTrue(expr1.equals(expr2));
    }
}