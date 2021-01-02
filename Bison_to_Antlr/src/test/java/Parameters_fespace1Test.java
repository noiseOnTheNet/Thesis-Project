import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_fespace1Test {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_fespace1 parameters_fespace1 = new Parameters_fespace1("fespace1");
        parameters_fespace1.dump(printStream, map);
        assertEquals("fespace1",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_fespace1("fespace1");
        Expression expr2 = new Parameters_fespace1("fespace1");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}