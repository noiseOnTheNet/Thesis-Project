import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Parameter;

import static org.junit.jupiter.api.Assertions.*;

class Primary_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primary = (Expression) new Primary_id("x");
        Expression parameters = (Expression) new Parameters_fespace("fespace");
        Primary_parameters primary_parameters = new Primary_parameters(primary, parameters);
        primary_parameters.dump(printStream);
        assertEquals("x(fespace)", baos.toString());
    }
}