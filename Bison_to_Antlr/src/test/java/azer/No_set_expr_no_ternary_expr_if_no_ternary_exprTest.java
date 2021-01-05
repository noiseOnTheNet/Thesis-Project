package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class No_set_expr_no_ternary_expr_if_no_ternary_exprTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        No_set_expr_no_ternary_expr_if_no_ternary_expr no_set_expr_no_ternary_expr_if_no_ternary_expr = new No_set_expr_no_ternary_expr_if_no_ternary_expr(new Primary_string("z<10"), new Primary_string("z++"), new Primary_string("z--"));
        no_set_expr_no_ternary_expr_if_no_ternary_expr.dump(printStream, map);
        assertEquals("z<10 ? z++ : z--",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new No_set_expr_no_ternary_expr_if_no_ternary_expr(new Primary_string("z<10"), new Primary_string("z++"), new Primary_string("z--"));
        Expression expr2 = new No_set_expr_no_ternary_expr_if_no_ternary_expr(new Primary_string("z<10"), new Primary_string("z++"), new Primary_string("z--"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}