import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primaryp_primary_transposeTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primary = new Primary_string("A");
        Primaryp_primary_transpose primaryp_primary_transpose = new Primaryp_primary_transpose(primary);
        primaryp_primary_transpose.dump(printStream);
        assertEquals("A'",baos.toString());
    }
}