import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_idTest {

    @org.junit.jupiter.api.Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Primary_id primary_id = new Primary_id("var");
        primary_id.dump(printStream);
        assertEquals("var", baos.toString());
    }
}