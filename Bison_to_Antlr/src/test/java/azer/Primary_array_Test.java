package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_array_Test {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression array = new Primary_string("4 5 7 9");
        Primary_array_ primary_array_ = new Primary_array_(array);
        primary_array_.dump(printStream, map);
        assertEquals("[4 5 7 9]", baos.toString());
    }

    @Test
    void equals() {
        Expression expr1 = new Primary_array_(new Primary_string("4 5 7 9"));
        Expression expr2 = new Primary_array_(new Primary_string("4 5 7 9"));
        assertTrue(expr1.equals(expr2));
    }
}