import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Primary_id_parameterstypeTest {

    @Test
    void dump() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        Expression prarameterstype = new Primary_string("int,x");
        Primary_id_parameterstype primary_id_parameterstype = new Primary_id_parameterstype("id", prarameterstype);
        primary_id_parameterstype.dump(printStream);
        assertEquals("id(int,x)", baos.toString());
    }
}