import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_matrixTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression primary = new Primary_id("x");
        Expression expr1 = new Sub_script_expr_no_ternary_expr(new Primary_string("a"));
        Expression expr2 = new Sub_script_expr_no_ternary_expr(new Primary_string("b"));
        Primary_matrix primary_matrix = new Primary_matrix(primary,expr1,expr2);
        primary_matrix.dump(printStream, map);
        assertEquals("x[a, b]", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_matrix(new Primary_id("x"), new Primary_string("a"), new Primary_string("b"));
        Expression expr2 = new Primary_matrix(new Primary_id("x"), new Primary_string("a"), new Primary_string("b"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}