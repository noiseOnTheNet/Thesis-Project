import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression parameters = new Parameters_fespace("fespace");
        Primary_fespace_parameters primary_fespace_parameters = new Primary_fespace_parameters("fespace", parameters);
        primary_fespace_parameters.dump(printStream);
        assertEquals("fespace(fespace)", baos.toString());
    }
}