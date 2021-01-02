import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Pow_expr_underscoreTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Pow_expr_underscore pow_expr_underscore = new Pow_expr_underscore(new Primary_string("A"), new Primary_string("x"));
        pow_expr_underscore.dump(printStream, map);
        assertEquals("A_x",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Pow_expr_underscore(new Primary_string("A"), new Primary_string("A"));
        Expression expr2 = new Pow_expr_underscore(new Primary_string("A"), new Primary_string("A"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}