import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_dnumTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Primary_dnum dnum = new Primary_dnum(4.5465);
        dnum.dump(printStream);
        assertEquals(4.5465,Double.parseDouble(baos.toString()));
    }
}