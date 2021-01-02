import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_empty_arrayTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression primary = new Primary_id("x");
        Primary_empty_array primary_empty_array = new Primary_empty_array(primary);
        primary_empty_array.dump(printStream, map);
        assertEquals("x[]", baos.toString());
    }

    @Test
    void equals() {
        Expression expr1 = new Primary_empty_array(new Primary_id("x"));
        Expression expr2 = new Primary_empty_array(new Primary_id("x"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}