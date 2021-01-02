import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespaceS_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression parameters = new Parameters_fespace("parameter");
        Primary_fespaceS_parameters primary_fespaceS_parameters = new Primary_fespaceS_parameters("fespaceS", parameters);
        primary_fespaceS_parameters.dump(printStream, map);
        assertEquals("fespaceS(parameter)", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_fespaceS_parameters("fespaceS", new Primary_string("parameter"));
        Expression expr2 = new Primary_fespaceS_parameters("fespaceS", new Primary_string("parameter"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}