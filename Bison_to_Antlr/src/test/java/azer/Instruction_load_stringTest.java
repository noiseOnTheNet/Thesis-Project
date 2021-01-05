package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Instruction_load_stringTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Instruction_load_string instruction_load_string = new Instruction_load_string("null");
        instruction_load_string.dump(printStream, map);
        assertEquals("load null",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Instruction_load_string("null");
        Expression expr2 = new Instruction_load_string("null");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}