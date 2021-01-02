import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Unop_incrementTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Unop_increment unop_increment = new Unop_increment("++");
        unop_increment.dump(printStream, map);
        assertEquals("++",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Unop_increment("++");
        Expression expr2 = new Unop_increment("++");
        assertTrue(expr1.equals(expr2));
    }
}