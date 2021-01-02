import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_comma_sub_script_exprTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_comma_sub_script_expr parameters_comma_sub_script_expr = new Parameters_comma_sub_script_expr(new Primary_string("z"),new Primary_string("x+5"));
        parameters_comma_sub_script_expr.dump(printStream, map);
        assertEquals("z, x+5",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_comma_sub_script_expr(new Primary_string("z"), new Primary_string("x+5"));
        Expression expr2 = new Parameters_comma_sub_script_expr(new Primary_string("z"), new Primary_string("x+5"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}