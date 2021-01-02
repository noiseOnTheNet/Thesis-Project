import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_incrementTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression primary = new Primary_string("i");
        Primary_increment primary_increment= new Primary_increment(primary);
        primary_increment.dump(printStream, map);
        assertEquals("i++", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_increment(new Primary_string("i"));
        Expression expr2 = new Primary_increment(new Primary_string("i"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}