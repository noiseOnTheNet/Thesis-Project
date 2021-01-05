package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_array_sub_script_exprTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression primary = new Primary_id("x");
        Expression expr = new Sub_script_expr_no_ternary_expr(new Primary_string("a"));
        Primary_array_sub_script_expr primary_array_sub_script_expr = new Primary_array_sub_script_expr(primary,expr);
        primary_array_sub_script_expr.dump(printStream, map);
        assertEquals("x[a]", baos.toString());
    }

    @Test
    void equals() {
        Expression expr1 = new Primary_array_sub_script_expr(new Primary_id("x"), new Primary_id("2"));
        Expression expr2 = new Primary_array_sub_script_expr(new Primary_id("x"), new Primary_id("2"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}