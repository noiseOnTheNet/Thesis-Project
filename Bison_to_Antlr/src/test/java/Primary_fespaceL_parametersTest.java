import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespaceL_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression parameters = new Parameters_fespace("parameter");
        Primary_fespaceL_parameters primary_fespaceL_parameters = new Primary_fespaceL_parameters("fespaceL", parameters);
        primary_fespaceL_parameters.dump(printStream);
        assertEquals("fespaceL(parameter)", baos.toString());
    }
}