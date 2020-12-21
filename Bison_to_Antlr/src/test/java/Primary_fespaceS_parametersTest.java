import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespaceS_parametersTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression parameters = new Parameters_fespace("parameter");
        Primary_fespaceS_parameters primary_fespaceS_parameters = new Primary_fespaceS_parameters("fespaceS", parameters);
        primary_fespaceS_parameters.dump(printStream);
        assertEquals("fespaceS(parameter)", baos.toString());
    }
}