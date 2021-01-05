package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace3_dot_idTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Primary_fespace3_dot_id primary_fespace3_dot_id = new Primary_fespace3_dot_id("fespace3", "e_");
        primary_fespace3_dot_id.dump(printStream, map);
        assertEquals("fespace3.e_", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_fespace3_dot_id("fespace3", "e_");
        Expression expr2 = new Primary_fespace3_dot_id("fespace3", "e_");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}