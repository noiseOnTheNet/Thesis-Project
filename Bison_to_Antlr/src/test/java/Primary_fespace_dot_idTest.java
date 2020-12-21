import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace_dot_idTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Primary_fespace_dot_id primary_fespace_dot_id = new Primary_fespace_dot_id("fespace", "id");
        primary_fespace_dot_id.dump(printStream);
        assertEquals("fespace.id", baos.toString());
    }
}