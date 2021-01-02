
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Pow_expr_primaryTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression primary = new Primary_string("45");
        Pow_expr_primary pow_expr_primary = new Pow_expr_primary(primary);
        pow_expr_primary.dump(printStream, map);
        assertEquals("45",baos.toString());
    }

    @Test
    void equals() {
        Expression expr1 = new Pow_expr_primary(new Primary_dnum(45));
        Expression expr2 = new Pow_expr_primary(new Primary_dnum(45));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}