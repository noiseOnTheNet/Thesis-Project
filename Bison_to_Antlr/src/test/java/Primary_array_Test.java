import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_array_Test {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression array = new Primary_string("4 5 7 9");
        Primary_array_ primary_array_ = new Primary_array_(array);
        primary_array_.dump(printStream);
        assertEquals("[4 5 7 9]", baos.toString());
    }
}