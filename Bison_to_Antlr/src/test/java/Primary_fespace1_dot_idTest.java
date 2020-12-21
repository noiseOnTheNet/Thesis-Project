import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespace1_dot_idTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Primary_fespace1_dot_id primary_fespace1_dot_id = new Primary_fespace1_dot_id("fespace1", "id");
        primary_fespace1_dot_id.dump(printStream);
        assertEquals("fespace1.id", baos.toString());
    }
}