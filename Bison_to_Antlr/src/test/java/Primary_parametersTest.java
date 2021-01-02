import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression primary = (Expression) new Primary_id("x");
        Expression parameters = (Expression) new Parameters_fespace("fespace");
        Primary_parameters primary_parameters = new Primary_parameters(primary, parameters);
        primary_parameters.dump(printStream, map);
        assertEquals("x(fespace)", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_parameters(new Primary_string("x"), new Parameters_fespace("fespace"));
        Expression expr2 = new Primary_parameters(new Primary_string("x"), new Parameters_fespace("fespace"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}