import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primaryp_primaryTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primary = new Primary_string("45");
        Primaryp_primary primaryp_primary = new Primaryp_primary(primary);
        primaryp_primary.dump(printStream);
        assertEquals("45",baos.toString());
    }
}