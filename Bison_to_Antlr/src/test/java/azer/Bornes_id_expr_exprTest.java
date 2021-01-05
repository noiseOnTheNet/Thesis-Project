package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Bornes_id_expr_exprTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Bornes_id_expr_expr bornes_id_expr_expr = new Bornes_id_expr_expr("A", new Primary_string("x+4"), new Primary_string("z-8"));
        bornes_id_expr_expr.dump(printStream, map);
        assertEquals("(A = x+4, z-8)",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Bornes_id_expr_expr("A", new Primary_string("x+4"), new Primary_string("z-8"));
        Expression expr2 = new Bornes_id_expr_expr("A", new Primary_string("x+4"), new Primary_string("z-8"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}