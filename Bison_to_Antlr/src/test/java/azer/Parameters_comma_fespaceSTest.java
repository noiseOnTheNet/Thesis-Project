package azer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Parameters_comma_fespaceSTest {
    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Parameters_comma_fespaceS parameters_comma_fespaceS = new Parameters_comma_fespaceS(new Primary_string("z"),"fespaceS");
        parameters_comma_fespaceS.dump(printStream, map);
        assertEquals("z, fespaceS",baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Parameters_comma_fespaceS(new Primary_string("z"), "fespaceS");
        Expression expr2 = new Parameters_comma_fespaceS(new Primary_string("z"), "fespaceS");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}