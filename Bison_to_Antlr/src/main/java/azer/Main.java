package azer;
import azer.freefem.*;
import azer.gui.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static javafx.application.Application.launch;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("My Application");
        Controller controller = new Controller();

        //Menu
        Menu menu = new Menu("File");
        MenuItem m1 = new MenuItem("Open");
        menu.getItems().add(m1);
        MenuBar mb = new MenuBar();
        mb.getMenus().add(menu);
        VBox root = new VBox(mb);
        root.setSpacing(10);

        Text text1 = new Text("List of Template Variables: ");
        Text text = new Text();
        HBox hBox1 = new HBox(text1);
        hBox1.getChildren().add(text);
        m1.setOnAction(e -> {
            try {
                controller.fileChooser(text);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        root.getChildren().add(hBox1);
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
        /*ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);

        Map map = new HashMap();
        HashMap map2 = new HashMap();

        map.put("y", new Primary_dnum(4.5));

        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString("1+${z:x};" +
                "1+${s:x};" +
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
        System.out.println(baos2.toString());*/
    }
}
