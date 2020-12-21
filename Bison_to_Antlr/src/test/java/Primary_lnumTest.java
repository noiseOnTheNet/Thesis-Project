import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_lnumTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Primary_lnum lnum = new Primary_lnum(456);
        lnum.dump(printStream);
        assertEquals(456,Long.parseLong(baos.toString()));
    }
}