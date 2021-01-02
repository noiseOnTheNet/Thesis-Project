import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CatchsTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Catchs catchs = new Catchs(new Primary_string("{}"));
        catchs.dump(printStream,map);
        assertEquals("catch(...) {}",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Catchs(new Primary_string("{}"));
        Expression expr2 = new Catchs(new Primary_string("{}"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}