package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Sub_script_expr_no_ternary_exprTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Sub_script_expr_no_ternary_expr sub_script_expr_no_ternary_expr = new Sub_script_expr_no_ternary_expr(new Primary_string("x"));
        sub_script_expr_no_ternary_expr.dump(printStream, map);
        assertEquals("x",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Sub_script_expr_no_ternary_expr(new Primary_string("x"));
        Expression expr2 = new Sub_script_expr_no_ternary_expr(new Primary_string("x"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }

}