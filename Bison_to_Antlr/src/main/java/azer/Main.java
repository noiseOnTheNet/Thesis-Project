package azer;
import azer.freefem.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);

        Map map = new HashMap();
        HashMap map2 = new HashMap();

        map.put("y", new Primary_dnum(4.5));

        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString("1+${z:x};" +
                "1+${z:x};" +
                "1+${y:x};"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokenStream);
        parser.setBuildParseTree(true);
        GrammarParser.StartContext parseTree = parser.start();

        Listener l = new Listener();
        ParseTreeWalker.DEFAULT.walk(l,parseTree);

        if (l.stack.size() > 0) {
            ((Expression) l.stack.peek()).dump(printStream, map);
            ((Expression) l.stack.peek()).collect(map2);
        }
        else
            System.out.println("unexpected stack size: "+l.stack.size());
        System.out.println(baos.toString());
        System.out.println(map2.keySet());


        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        PrintStream printStream2 = new PrintStream(baos2);

        GrammarLexer lexer2 = new GrammarLexer(CharStreams.fromString(baos.toString()));
        CommonTokenStream tokenStream2 = new CommonTokenStream(lexer2);
        GrammarParser parser2 = new GrammarParser(tokenStream2);
        parser2.setBuildParseTree(true);
        GrammarParser.StartContext parseTree2 = parser2.start();

        Listener l2 = new Listener();
        ParseTreeWalker.DEFAULT.walk(l2,parseTree2);

        if (l2.stack.size() > 0) {
            ((Expression) l2.stack.peek()).dump(printStream2, map);
            if((l2.stack.peek()).equals(l.stack.peek()))
                System.out.println("equal");
            else
                System.out.print("not");
        }
            else
            System.out.println("unexpected stack size: "+ l2.stack.size());
        System.out.println(baos2.toString());
    }
}
