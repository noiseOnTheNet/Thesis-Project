package azer;
import java.util.HashMap;
import java.util.Map;

public interface Expression {
    public void dump(java.io.PrintStream printStream, Map<String, Expression> map);
    public void collect(HashMap<String, Expression> map);
}
