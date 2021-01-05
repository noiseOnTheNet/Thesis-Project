package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Pow_expr_powerTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression primaryp = new Primary_lnum(45);
        Expression unary_expr = new Primary_lnum(2);
        Pow_expr_power pow_expr_power = new Pow_expr_power(primaryp, unary_expr);
        pow_expr_power.dump(printStream, map);
        assertEquals("45^2",baos.toString());
    }

    @Test
    void equals() {
        Expression expr1 = new Pow_expr_power(new Primary_dnum(45), new Primary_dnum(2));
        Expression expr2 = new Pow_expr_power(new Primary_dnum(45), new Primary_dnum(2));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}