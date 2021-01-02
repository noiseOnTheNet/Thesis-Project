import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primaryp_primary_transposeTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression primary = new Primary_string("A");
        Primaryp_primary_transpose primaryp_primary_transpose = new Primaryp_primary_transpose(primary);
        primaryp_primary_transpose.dump(printStream, map);
        assertEquals("A'",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primaryp_primary_transpose(new Primary_string("A"));
        Expression expr2 = new Primaryp_primary_transpose(new Primary_string("A"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}