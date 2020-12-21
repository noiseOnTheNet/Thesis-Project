import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_array_sub_script_exprTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primary = new Primary_id("x");
        Expression expr = new Sub_script_expr_no_ternary_expr(new Primary_string("a"));
        Primary_array_sub_script_expr primary_array_sub_script_expr = new Primary_array_sub_script_expr(primary,expr);
        primary_array_sub_script_expr.dump(printStream);
        assertEquals("x[a]", baos.toString());
    }
}