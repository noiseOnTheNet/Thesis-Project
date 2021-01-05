package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class No_ternary_expr_modulusTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        No_ternary_expr_modulus no_ternary_expr_modulus = new No_ternary_expr_modulus(new Primary_string("x"), new Primary_string("z"));
        no_ternary_expr_modulus.dump(printStream, map);
        assertEquals("x % z",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new No_ternary_expr_modulus(new Primary_string("x"), new Primary_string("z"));
        Expression expr2 = new No_ternary_expr_modulus(new Primary_string("x"), new Primary_string("z"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}