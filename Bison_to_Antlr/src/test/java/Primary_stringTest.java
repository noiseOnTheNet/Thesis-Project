import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_stringTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Primary_string string = new Primary_string("This is test String !@#$%^");
        string.dump(printStream);
        assertEquals("This is test String !@#$%^", baos.toString());
    }
}