package azer.gui;

import azer.*;
import azer.freefem.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.net.URL;
import java.util.*;


public class Controller {
    @FXML
    public void fileChooser(Text text) throws FileNotFoundException {
        FileChooser fc = new FileChooser();
        File file = fc.showOpenDialog(null);
        InputStream inputStream = new FileInputStream(file);
        Scanner s = new Scanner(inputStream).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);

        Map map = new HashMap();
        HashMap map2 = new HashMap();

        //map.put("y", new Primary_dnum(4.5));

        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString(String.valueOf(result)));
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
        //System.out.println(baos.toString());


        //System.out.print(file);
        text.setText("Selected file: " + map2.keySet() + "\n" + baos.toString());
    }

    @FXML
    public void addExpression(Text text, TextField textField){
        text.setText(textField.getText());
        //System.out.print(input.getText());
    }
}
