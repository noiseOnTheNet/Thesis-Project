import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Unop_decrementTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Unop_decrement unop_decrement = new Unop_decrement("--");
        unop_decrement.dump(printStream, map);
        assertEquals("--",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Unop_decrement("--");
        Expression expr2 = new Unop_decrement("--");
        assertTrue(expr1.equals(expr2));
    }
}