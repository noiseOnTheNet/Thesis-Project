import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class No_comma_expr_no_set_exprTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        No_comma_expr_no_set_expr no_comma_expr_no_set_expr = new No_comma_expr_no_set_expr(new Primary_string("z<10"));
        no_comma_expr_no_set_expr.dump(printStream, map);
        assertEquals("z<10",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new No_comma_expr_no_set_expr(new Primary_string("z<10"));
        Expression expr2 = new No_comma_expr_no_set_expr(new Primary_string("z<10"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}