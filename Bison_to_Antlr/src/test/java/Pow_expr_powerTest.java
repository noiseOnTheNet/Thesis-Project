import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Pow_expr_powerTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression primaryp = new Primary_string("45");
        Expression unary_expr = new Primary_string("2");
        Pow_expr_power pow_expr_power = new Pow_expr_power(primaryp, unary_expr);
        pow_expr_power.dump(printStream);
        assertEquals("45^2",baos.toString());
    }
}