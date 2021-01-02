import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace1_dot_idTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Primary_fespace1_dot_id primary_fespace1_dot_id = new Primary_fespace1_dot_id("fespace1", "id");
        primary_fespace1_dot_id.dump(printStream, map);
        assertEquals("fespace1.id", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_fespace1_dot_id("fespace1", "id");
        Expression expr2 = new Primary_fespace1_dot_id("fespace1", "id");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}