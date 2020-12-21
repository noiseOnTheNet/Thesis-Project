import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespaceL_dot_idTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Primary_fespaceL_dot_id primary_fespaceL_dot_id = new Primary_fespaceL_dot_id("fespaceL", "ids");
        primary_fespaceL_dot_id.dump(printStream);
        assertEquals("fespaceL.ids", baos.toString());
    }
}