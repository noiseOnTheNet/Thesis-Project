import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_fespaceS_dot_idTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Primary_fespaceS_dot_id primary_fespaceS_dot_id = new Primary_fespaceS_dot_id("fespaceS", "id4");
        primary_fespaceS_dot_id.dump(printStream);
        assertEquals("fespaceS.id4", baos.toString());
    }
}