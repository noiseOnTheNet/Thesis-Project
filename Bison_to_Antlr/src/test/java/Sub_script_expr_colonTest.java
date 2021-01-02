import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Sub_script_expr_colonTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Sub_script_expr_colon sub_script_expr_colon = new Sub_script_expr_colon();
        sub_script_expr_colon.dump(printStream, map);
        assertEquals(" : ",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Sub_script_expr_colon();
        Expression expr2 = new Sub_script_expr_colon();
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }

}