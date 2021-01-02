import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class No_set_expr_no_ternary_expr_colonTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        No_set_expr_no_ternary_expr_colon no_set_expr_no_ternary_expr_colon = new No_set_expr_no_ternary_expr_colon(new Primary_string("z<10"), new Primary_string("z++"));
        no_set_expr_no_ternary_expr_colon.dump(printStream, map);
        assertEquals("z<10 : z++",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new No_set_expr_no_ternary_expr_colon(new Primary_string("z<10"), new Primary_string("z++"));
        Expression expr2 = new No_set_expr_no_ternary_expr_colon(new Primary_string("z<10"), new Primary_string("z++"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}