import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_fespaceLTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_fespaceL parameters_fespaceL = new Parameters_fespaceL("fespaceL");
        parameters_fespaceL.dump(printStream, map);
        assertEquals("fespaceL",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_fespaceL("fespaceL");
        Expression expr2 = new Parameters_fespaceL("fespaceL");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}