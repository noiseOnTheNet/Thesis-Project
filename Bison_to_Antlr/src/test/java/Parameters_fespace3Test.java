import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_fespace3Test {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_fespace3 parameters_fespace3 = new Parameters_fespace3("fespace3");
        parameters_fespace3.dump(printStream, map);
        assertEquals("fespace3",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_fespace3("fespace3");
        Expression expr2 = new Parameters_fespace3("fespace3");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}