import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_dot_idTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primary = new Primary_id("x");
        Primary_dot_id primary_dot_id = new Primary_dot_id(primary, "id");
        primary_dot_id.dump(printStream);
        assertEquals("x.id", baos.toString());
    }
}