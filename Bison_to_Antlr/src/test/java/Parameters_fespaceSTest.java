import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_fespaceSTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_fespaceS parameters_fespaceS = new Parameters_fespaceS("fespaceS");
        parameters_fespaceS.dump(printStream, map);
        assertEquals("fespaceS",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_fespaceS("fespaceS");
        Expression expr2 = new Parameters_fespaceS("fespaceS");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}