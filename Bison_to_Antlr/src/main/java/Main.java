import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString("mesh Th = square(10,10);\n" +
                "fespace Vh(Th,P2);\n" +
                "func f= x*y;\n" +
                "func g= sin(5*pi*(x-0.5)*(y-0.5));\n" +
                "Vh u,v;\n" +
                "solve Poisson(u,v) =\n" +
                "int2d(Th)(dx(u)*dx(v) + dy(u)*dy(v))\n" +
                "- int2d(Th)(f*v)\n" +
                "+ on(1,2,3,4,u=g) ;\n" +
                "plot(u);"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokenStream);
        parser.setBuildParseTree(true);
        GrammarParser.StartContext parseTree = parser.start();

        Listener l = new Listener();
        ParseTreeWalker.DEFAULT.walk(l,parseTree);

        if (l.stack.size() > 0)
            ((Expression)l.stack.peek()).dump();
        else
            System.out.println("unexpected stack size: "+l.stack.size());
        System.out.println();
    }
}
