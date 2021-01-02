import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_dnumTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Primary_dnum dnum = new Primary_dnum(4.5465);
        dnum.dump(printStream, map);
        assertEquals(4.5465,Double.parseDouble(baos.toString()));
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_dnum(4.5465);
        Expression expr2 = new Primary_dnum(4.5465);
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}