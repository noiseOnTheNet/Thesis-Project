import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Expr_no_comma_exprTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expr_no_comma_expr expr_no_comma_expr = new Expr_no_comma_expr(new Primary_string("x=4+5"));
        expr_no_comma_expr.dump(printStream, map);
        assertEquals("x=4+5",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Expr_no_comma_expr(new Primary_string("x=4+5"));
        Expression expr2 = new Expr_no_comma_expr(new Primary_string("x=4+5"));
        assertTrue(expr1.equals(expr2));
    }
}