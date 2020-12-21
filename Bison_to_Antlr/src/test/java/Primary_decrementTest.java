import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_decrementTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primary = new Primary_string("i");
        Primary_decrement primary_decrement= new Primary_decrement(primary);
        primary_decrement.dump(printStream);
        assertEquals("i--", baos.toString());
    }
}