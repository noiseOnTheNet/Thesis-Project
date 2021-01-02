import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_id_sub_script_exprTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression sub_script_expr = new Primary_string("y=x+4");
        Primary_id_sub_script_expr primary_id_sub_script_expr= new Primary_id_sub_script_expr("value", sub_script_expr);
        primary_id_sub_script_expr.dump(printStream, map);
        assertEquals("value(y=x+4)", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_id_sub_script_expr("value", new Primary_string("y=x+4"));
        Expression expr2 = new Primary_id_sub_script_expr("value", new Primary_string("y=x+4"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}