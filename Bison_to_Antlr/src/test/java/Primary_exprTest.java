import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_exprTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression expr = new Primary_string("x+5");
        Primary_expr primary_expr = new Primary_expr(expr);
        primary_expr.dump(printStream, map);
        assertEquals("(x+5)",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_expr(new Primary_string("x+5"));
        Expression expr2 = new Primary_expr(new Primary_string("x+5"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}