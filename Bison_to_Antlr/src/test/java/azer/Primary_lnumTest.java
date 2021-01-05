package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_lnumTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Primary_lnum lnum = new Primary_lnum(456);
        lnum.dump(printStream, map);
        assertEquals(456,Long.parseLong(baos.toString()));
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_lnum(465);
        Expression expr2 = new Primary_lnum(465);
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}