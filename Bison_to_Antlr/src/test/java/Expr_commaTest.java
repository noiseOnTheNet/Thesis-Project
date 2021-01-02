import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Expr_commaTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expr_comma expr_comma = new Expr_comma(new Primary_string("x"), new Primary_string("z"));
        expr_comma.dump(printStream, map);
        assertEquals("x, z",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Expr_comma(new Primary_string("x"), new Primary_string("z"));
        Expression expr2 = new Expr_comma(new Primary_string("x"), new Primary_string("z"));
        assertTrue(expr1.equals(expr2));
    }
}