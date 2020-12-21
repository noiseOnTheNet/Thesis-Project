import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_exprTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression expr = new Primary_string("x+5");
        Primary_expr primary_expr = new Primary_expr(expr);
        primary_expr.dump(printStream);
        assertEquals("(x+5)",baos.toString());
    }
}