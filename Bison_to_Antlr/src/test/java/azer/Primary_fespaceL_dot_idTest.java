package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespaceL_dot_idTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Primary_fespaceL_dot_id primary_fespaceL_dot_id = new Primary_fespaceL_dot_id("fespaceL", "ids");
        primary_fespaceL_dot_id.dump(printStream, map);
        assertEquals("fespaceL.ids", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_fespaceL_dot_id("fespaceL", "ids");
        Expression expr2 = new Primary_fespaceL_dot_id("fespaceL", "ids");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}