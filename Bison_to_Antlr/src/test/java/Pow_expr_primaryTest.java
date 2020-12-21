import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Pow_expr_primaryTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primary = new Primary_string("45");
        Pow_expr_primary pow_expr_primary = new Pow_expr_primary(primary);
        pow_expr_primary.dump(printStream);
        assertEquals("45",baos.toString());
    }
}