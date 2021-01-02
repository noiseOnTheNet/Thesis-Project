import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_comma_fespaceLTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_comma_fespaceL parameters_comma_fespaceL = new Parameters_comma_fespaceL(new Primary_string("z"),"fespaceL");
        parameters_comma_fespaceL.dump(printStream, map);
        assertEquals("z, fespaceL",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_comma_fespaceL(new Primary_string("z"), "fespaceL");
        Expression expr2 = new Parameters_comma_fespaceL(new Primary_string("z"), "fespaceL");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}