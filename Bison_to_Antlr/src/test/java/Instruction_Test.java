import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Instruction_Test {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Instruction_ instruction_ = new Instruction_();
        instruction_.dump(printStream, map);
        assertEquals(";",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Instruction_();
        Expression expr2 = new Instruction_();
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}