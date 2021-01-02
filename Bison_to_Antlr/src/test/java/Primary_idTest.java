import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_idTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Primary_id primary_id = new Primary_id("var");
        primary_id.dump(printStream, map);
        assertEquals("var", baos.toString());
    }

    @Test
    void equals() {
        Expression expr1 = new Primary_id("var");
        Expression expr2 = new Primary_id("var");
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}