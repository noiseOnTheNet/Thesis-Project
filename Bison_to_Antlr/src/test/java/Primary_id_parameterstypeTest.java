import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Primary_id_parameterstypeTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Map map = new HashMap();
        Expression prarameterstype = new Primary_string("int,x");
        Primary_id_parameterstype primary_id_parameterstype = new Primary_id_parameterstype("id", prarameterstype);
        primary_id_parameterstype.dump(printStream, map);
        assertEquals("id(int,x)", baos.toString());
    }
    @Test
    void equals() {
        Expression expr1 = new Primary_id_parameterstype("id", new Primary_string("int,x"));
        Expression expr2 = new Primary_id_parameterstype("id", new Primary_string("int,x"));
        assertTrue(expr1.equals(expr2));assertTrue(expr1.equals(expr2));
    }
}