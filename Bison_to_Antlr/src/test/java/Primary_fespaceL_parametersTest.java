import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespaceL_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression parameters = new Parameters_fespace("parameter");
        Primary_fespaceL_parameters primary_fespaceL_parameters = new Primary_fespaceL_parameters("fespaceL", parameters);
        primary_fespaceL_parameters.dump(printStream, map);
        assertEquals("fespaceL(parameter)", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_fespaceL_parameters("fespaceL", new Primary_string("parameter"));
        Expression expr2 = new Primary_fespaceL_parameters("fespaceL", new Primary_string("parameter"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}