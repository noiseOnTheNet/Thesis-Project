package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_cnumTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Primary_cnum cnum = new Primary_cnum("-4+5i");
        cnum.dump(printStream, map);
        assertEquals("-4+5i",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_cnum("-4+5i");
        Expression expr2 = new Primary_cnum("-4+5i");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}