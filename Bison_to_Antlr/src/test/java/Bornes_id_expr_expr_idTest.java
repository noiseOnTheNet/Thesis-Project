import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Bornes_id_expr_expr_idTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Bornes_id_expr_expr_id bornes_id_expr_expr_id = new Bornes_id_expr_expr_id("A", new Primary_string("x+4"), new Primary_string("z-8"), "B");
        bornes_id_expr_expr_id.dump(printStream, map);
        assertEquals("(A = x+4, z-8; B)",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Bornes_id_expr_expr_id("A", new Primary_string("x+4"), new Primary_string("z-8"), "B");
        Expression expr2 = new Bornes_id_expr_expr_id("A", new Primary_string("x+4"), new Primary_string("z-8"), "B");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}