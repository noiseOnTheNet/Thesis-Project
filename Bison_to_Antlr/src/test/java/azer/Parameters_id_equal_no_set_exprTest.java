package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_id_equal_no_set_exprTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_id_equal_no_set_expr parameters_id_equal_no_set_expr = new Parameters_id_equal_no_set_expr(new Primary_id("x"), new Primary_string("z+5"));
        parameters_id_equal_no_set_expr.dump(printStream, map);
        assertEquals("x = z+5",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_id_equal_no_set_expr(new Primary_id("x"), new Primary_string("z+5"));
        Expression expr2 = new Parameters_id_equal_no_set_expr(new Primary_id("x"), new Primary_string("z+5"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}