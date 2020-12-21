import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace1_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression parameters = new Parameters_fespace("d");
        Primary_fespace1_parameters primary_fespace1_parameters = new Primary_fespace1_parameters("fespace1", parameters);
        primary_fespace1_parameters.dump(printStream);
        assertEquals("fespace1(d)", baos.toString());
    }
}