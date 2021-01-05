package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_comma_id_equal_no_set_exprTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_comma_id_equal_no_set_expr parameters_comma_id_equal_no_set_expr = new Parameters_comma_id_equal_no_set_expr(new Primary_string("z"), new Primary_string("x"), new Primary_string("s+4"));
        parameters_comma_id_equal_no_set_expr.dump(printStream, map);
        assertEquals("z, x = s+4",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_comma_id_equal_no_set_expr(new Primary_string("z"), new Primary_string("x"), new Primary_string("s+4"));
        Expression expr2 = new Parameters_comma_id_equal_no_set_expr(new Primary_string("z"), new Primary_string("x"), new Primary_string("s+4"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}