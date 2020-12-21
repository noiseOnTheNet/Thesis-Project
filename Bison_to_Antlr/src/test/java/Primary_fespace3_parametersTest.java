import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace3_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression parameters = new Parameters_fespace("w");
        Primary_fespace3_parameters primary_fespace3_parameters = new Primary_fespace3_parameters("fespace3", parameters);
        primary_fespace3_parameters.dump(printStream);
        assertEquals("fespace3(w)", baos.toString());
    }
}