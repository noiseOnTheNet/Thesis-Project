import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_matrixTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primary = new Primary_id("x");
        Expression expr1 = new Sub_script_expr_no_ternary_expr(new Primary_string("a"));
        Expression expr2 = new Sub_script_expr_no_ternary_expr(new Primary_string("b"));
        Primary_matrix primary_matrix = new Primary_matrix(primary,expr1,expr2);
        primary_matrix.dump(printStream);
        assertEquals("x[a, b]", baos.toString());
    }
}