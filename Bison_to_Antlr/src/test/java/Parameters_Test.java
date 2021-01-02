import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_Test {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_ parameters_ = new Parameters_();
        parameters_.dump(printStream, map);
        assertEquals("",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_();
        Expression expr2 = new Parameters_();
        assertTrue(expr1.equals(expr2));
    }
}