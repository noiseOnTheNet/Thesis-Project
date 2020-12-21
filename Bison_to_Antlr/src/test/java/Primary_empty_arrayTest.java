import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_empty_arrayTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primary = new Primary_id("x");
        Primary_empty_array primary_empty_array = new Primary_empty_array(primary);
        primary_empty_array.dump(printStream);
        assertEquals("x[]", baos.toString());
    }
}