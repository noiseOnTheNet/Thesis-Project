package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace_dot_idTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Primary_fespace_dot_id primary_fespace_dot_id = new Primary_fespace_dot_id("fespace", "id");
        primary_fespace_dot_id.dump(printStream, map);
        assertEquals("fespace.id", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_fespace_dot_id("fespace","id");
        Expression expr2 = new Primary_fespace_dot_id("fespace","id");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}