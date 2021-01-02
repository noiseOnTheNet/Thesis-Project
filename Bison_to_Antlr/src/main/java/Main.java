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

        GrammarLexer lexer = new GrammarLexer(CharStreams.fromString("verbosity=0;\n" +
                "\n" +
                "// Parameters\n" +
                "int n = 1;\n" +
                "real nu = 0.0025; // Reynolds=200\n" +
                "real dt = 0.2;\n" +
                "real epsv = 1e-6, epsu = 1e-6, epsp = 1e-6;// Eps CG ..\n" +
                "\n" +
                "// Mesh\n" +
                "border a0(t=1, 0){x=-2; y=t; label=1;} // inlet\n" +
                "border a1(t=-2, 0){x=t; y=0; label=2;}\n" +
                "border a2(t=0, -0.5){x=0; y=t; label=2;}\n" +
                "border a3(t=0, 1){x=18*t^1.2; y=-0.5; label=2;}\n" +
                "border a4(t=-0.5, 1){x=18; y=t; label=3;} // outlet\n" +
                "border a5(t=1, 0){x=-2+20*t; y=1; label=4;}\n" +
                "\n" +
                "mesh Th = buildmesh(a0(3*n) + a1(20*n) + a2(10*n) + a3(150*n) + a4(5*n) + a5(100*n));\n" +
                "plot(Th);\n" +
                "\n" +
                "// Fespace\n" +
                "fespace Vh(Th, P1);\n" +
                "Vh w, u = 0, v = 0, p = 0, q = 0;\n" +
                "\n" +
                "// Definitions of Matrix dtMx and dtMy\n" +
                "matrix dtM1x, dtM1y;\n" +
                "\n" +
                "macro  BuildMat()\n" +
                "  { /* for memory managenemt */\n" +
                "    varf vM(unused, v) = int2d(Th)(v) ;\n" +
                "    varf vdx(u, v) = int2d(Th)(v*dx(u)*dt) ;\n" +
                "    varf vdy(u, v) = int2d(Th)(v*dy(u)*dt) ;\n" +
                "\n" +
                "    real[int] Mlump = vM(0, Vh);\n" +
                "    real[int] one(Vh.ndof); one = 1;\n" +
                "    real[int] M1 = one ./ Mlump;\n" +
                "    matrix dM1 = M1;\n" +
                "    matrix Mdx = vdx(Vh, Vh);\n" +
                "    matrix Mdy = vdy(Vh, Vh);\n" +
                "    dtM1x = dM1*Mdx;\n" +
                "    dtM1y = dM1*Mdy;\n" +
                "  }//\n" +
                "\n" +
                "BuildMat\n" +
                "\n" +
                "real err = 1, outflux = 1;\n" +
                "for(int n = 0; n < 200; n++) {\n" +
                "  Vh uold = u, vold = v, pold = p;\n" +
                "\n" +
                "  solve pb4u(u, w, init=n, solver=CG, eps=epsu)\n" +
                "    = int2d(Th)(\n" +
                "      u*w/dt + nu*(dx(u)*dx(w) + dy(u)*dy(w))\n" +
                "    )\n" +
                "    - int2d(Th)(\n" +
                "      (convect([uold, vold], -dt, uold)/dt - dx(p))*w\n" +
                "    )\n" +
                "    + on(1, u=4*y*(1-y))\n" +
                "    + on(2, 4, u=0);\n" +
                "  plot(u);\n" +
                "\n" +
                "  solve pb4v(v, w, init=n, solver=CG, eps=epsv)\n" +
                "    = int2d(Th)(\n" +
                "      v*w/dt + nu*(dx(v)*dx(w) + dy(v)*dy(w))\n" +
                "    )\n" +
                "    - int2d(Th)(\n" +
                "      (convect([uold, vold], -dt, vold)/dt - dy(p))*w\n" +
                "    )\n" +
                "    + on(1, 2, 3, 4, v=0);\n" +
                "\n" +
                "  solve pb4p(q, w, solver=CG, init=n, eps=epsp)\n" +
                "    = int2d(Th)(dx(q)*dx(w) + dy(q)*dy(w))\n" +
                "    - int2d(Th)((dx(u) + dy(v))*w/dt)\n" +
                "    + on(3, q=0);\n" +
                "\n" +
                "  // to have absolute epsilon in CG algorithm.\n" +
                "  epsv = -abs(epsv);\n" +
                "  epsu = -abs(epsu);\n" +
                "  epsp = -abs(epsp);\n" +
                "\n" +
                "  p = pold-q;\n" +
                "  u[] += dtM1x*q[];\n" +
                "  v[] += dtM1y*q[];\n" +
                "\n" +
                "  if(n%50 == 49) {\n" +
                "    Th = adaptmesh(Th, [u, v], q, err=0.06, nbvx=100000);\n" +
                "    plot(Th, wait=true);\n" +
                "    BuildMat // rebuild mat.\n" +
                "  }\n" +
                "\n" +
                "  err = sqrt(int2d(Th)(square(u - uold) + square(v - vold))/Th.area);\n" +
                "  outflux = int1d(Th)([u, v]'*[N.x, N.y]) ;\n" +
                "  cout << \" iter \" << n << \" Err L2 = \" << err << \" - Outflow = \" << outflux << endl;\n" +
                "  if (err < 1e-3) break;\n" +
                "}\n" +
                "assert(abs(outflux) < 5e-3); // verification\n" +
                "plot(p, wait=1, ps=\"NSprojP.eps\");\n" +
                "plot(u, wait=1, ps=\"NSprojU.eps\");"));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokenStream);
        parser.setBuildParseTree(true);
        GrammarParser.StartContext parseTree = parser.start();

        Listener l = new Listener();
        ParseTreeWalker.DEFAULT.walk(l,parseTree);

        if (l.stack.size() > 0)
            ((Expression)l.stack.peek()).dump(printStream, map);
        else
            System.out.println("unexpected stack size: "+l.stack.size());
        System.out.println(baos.toString());


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
            if((l2.stack.peek()).equals(l.stack.peek()) == true)
                System.out.print("equal");
            else
                System.out.print("not");
        }
            else
            System.out.println("unexpected stack size: "+l2.stack.size());
        System.out.println(baos2.toString());
    }
}
