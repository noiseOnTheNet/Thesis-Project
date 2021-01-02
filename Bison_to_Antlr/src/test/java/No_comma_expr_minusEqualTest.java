import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class No_comma_expr_minusEqualTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        No_comma_expr_minusEqual no_comma_expr_minusEqual = new No_comma_expr_minusEqual(new Primary_string("z"), new Primary_string("x"));
        no_comma_expr_minusEqual.dump(printStream, map);
        assertEquals("z -= x",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new No_comma_expr_minusEqual(new Primary_string("z"), new Primary_string("x"));
        Expression expr2 = new No_comma_expr_minusEqual(new Primary_string("z"), new Primary_string("x"));
        assertTrue(expr1.equals(expr2));
    }
}