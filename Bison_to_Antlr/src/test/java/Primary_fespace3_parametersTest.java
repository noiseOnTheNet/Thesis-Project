import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace3_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression parameters = new Parameters_fespace("w");
        Primary_fespace3_parameters primary_fespace3_parameters = new Primary_fespace3_parameters("fespace3", parameters);
        primary_fespace3_parameters.dump(printStream, map);
        assertEquals("fespace3(w)", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_fespace3_parameters("fespace3", new Primary_string("w"));
        Expression expr2 = new Primary_fespace3_parameters("fespace3", new Primary_string("w"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}