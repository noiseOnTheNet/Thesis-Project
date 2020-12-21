import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_incrementTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primary = new Primary_string("i");
        Primary_increment primary_increment= new Primary_increment(primary);
        primary_increment.dump(printStream);
        assertEquals("i++", baos.toString());
    }
}