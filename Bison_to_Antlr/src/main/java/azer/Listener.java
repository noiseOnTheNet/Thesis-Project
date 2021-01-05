package azer;
import azer.freefem.GrammarListener;
import azer.freefem.GrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.io.PrintStream;

class Node{
    Node first;
    Node second;

    public void add(Node node){
        if(this.first == null){
            this.first = node;
        }else{
            this.second = node;
        }
    }
}

public class Listener implements GrammarListener {
    Stack<Node> stack = new Stack();
    @Override
    public void enterStart(GrammarParser.StartContext ctx) {

    }

    @Override
    public void exitStart(GrammarParser.StartContext ctx) {

    }

    @Override
    public void enterInput(GrammarParser.InputContext ctx) {

    }

    @Override
    public void exitInput(GrammarParser.InputContext ctx) {
        Expression instructions = (Expression) this.stack.pop();
        Input node = new Input(instructions);
        this.stack.add(node);
    }

    @Override
    public void enterInstructions_instruction(GrammarParser.Instructions_instructionContext ctx) {

    }

    @Override
    public void exitInstructions_instruction(GrammarParser.Instructions_instructionContext ctx) {
        Expression instruction = (Expression) this.stack.pop();
        Expression instructions = (Expression) this.stack.pop();
        Instructions_instruction node = new Instructions_instruction(instructions, instruction);
        this.stack.add(node);
    }

    @Override
    public void enterInstructions_(GrammarParser.Instructions_Context ctx) {

    }

    @Override
    public void exitInstructions_(GrammarParser.Instructions_Context ctx) {
        Expression instruction = (Expression) this.stack.pop();
        Instructions_ node = new Instructions_(instruction);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_type_of_dcl_id(GrammarParser.List_of_id_args_type_of_dcl_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_type_of_dcl_id(GrammarParser.List_of_id_args_type_of_dcl_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression type_of_dcl = (Expression) this.stack.pop();
        List_of_id_args_type_of_dcl_id node = new List_of_id_args_type_of_dcl_id(type_of_dcl, id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_fespaceL_and_id(GrammarParser.List_of_id_args_comma_fespaceL_and_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_fespaceL_and_id(GrammarParser.List_of_id_args_comma_fespaceL_and_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_fespaceL_and_id node = new List_of_id_args_comma_fespaceL_and_id(list_of_id_args, ctx.FESPACEL().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_fespaceS_and_id(GrammarParser.List_of_id_args_comma_fespaceS_and_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_fespaceS_and_id(GrammarParser.List_of_id_args_comma_fespaceS_and_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_fespaceS_and_id node = new List_of_id_args_comma_fespaceS_and_id(list_of_id_args, ctx.FESPACES().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_fespace3_and_id(GrammarParser.List_of_id_args_comma_fespace3_and_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_fespace3_and_id(GrammarParser.List_of_id_args_comma_fespace3_and_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_fespace3_and_id node = new List_of_id_args_comma_fespace3_and_id(list_of_id_args, ctx.FESPACE3().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_array(GrammarParser.List_of_id_args_comma_arrayContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_array(GrammarParser.List_of_id_args_comma_arrayContext ctx) {
        Expression list_of_id_args2 = (Expression) this.stack.pop();
        Expression list_of_id_args1 = (Expression) this.stack.pop();
        List_of_id_args_comma_array node = new List_of_id_args_comma_array(list_of_id_args1, list_of_id_args2);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_fespaceL_id(GrammarParser.List_of_id_args_fespaceL_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_fespaceL_id(GrammarParser.List_of_id_args_fespaceL_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        List_of_id_args_fespaceL_id node = new List_of_id_args_fespaceL_id(ctx.FESPACEL().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_type_of_dcl_id(GrammarParser.List_of_id_args_comma_type_of_dcl_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_type_of_dcl_id(GrammarParser.List_of_id_args_comma_type_of_dcl_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression type_of_dcl = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_type_of_dcl_id node = new List_of_id_args_comma_type_of_dcl_id(list_of_id_args, type_of_dcl, id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_fespaceL_id(GrammarParser.List_of_id_args_comma_fespaceL_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_fespaceL_id(GrammarParser.List_of_id_args_comma_fespaceL_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_fespaceL_id node = new List_of_id_args_comma_fespaceL_id(list_of_id_args, ctx.FESPACEL().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_fespaceL_and_id(GrammarParser.List_of_id_args_fespaceL_and_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_fespaceL_and_id(GrammarParser.List_of_id_args_fespaceL_and_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        List_of_id_args_fespaceL_and_id node = new List_of_id_args_fespaceL_and_id(ctx.FESPACEL().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_type_of_dcl_and_id(GrammarParser.List_of_id_args_comma_type_of_dcl_and_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_type_of_dcl_and_id(GrammarParser.List_of_id_args_comma_type_of_dcl_and_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression type_of_dcl = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_type_of_dcl_and_id node = new List_of_id_args_comma_type_of_dcl_and_id(list_of_id_args, type_of_dcl, id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_fespace_id(GrammarParser.List_of_id_args_fespace_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_fespace_id(GrammarParser.List_of_id_args_fespace_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        List_of_id_args_fespace_id node = new List_of_id_args_fespace_id(ctx.FESPACE().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_fespaceS_and_id(GrammarParser.List_of_id_args_fespaceS_and_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_fespaceS_and_id(GrammarParser.List_of_id_args_fespaceS_and_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        List_of_id_args_fespaceS_and_id node = new List_of_id_args_fespaceS_and_id(ctx.FESPACES().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_type_of_dcl_and_id(GrammarParser.List_of_id_args_type_of_dcl_and_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_type_of_dcl_and_id(GrammarParser.List_of_id_args_type_of_dcl_and_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression type_of_dcl = (Expression) this.stack.pop();
        List_of_id_args_type_of_dcl_and_id node = new List_of_id_args_type_of_dcl_and_id(type_of_dcl, id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_fespace_and_id(GrammarParser.List_of_id_args_fespace_and_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_fespace_and_id(GrammarParser.List_of_id_args_fespace_and_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        List_of_id_args_fespace_and_id node = new List_of_id_args_fespace_and_id(ctx.FESPACE().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_fespace3_id(GrammarParser.List_of_id_args_comma_fespace3_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_fespace3_id(GrammarParser.List_of_id_args_comma_fespace3_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_fespace3_id node = new List_of_id_args_comma_fespace3_id(list_of_id_args, ctx.FESPACE3().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_id(GrammarParser.List_of_id_args_comma_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_id(GrammarParser.List_of_id_args_comma_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_id node = new List_of_id_args_comma_id(list_of_id_args, id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_fespace_and_id(GrammarParser.List_of_id_args_comma_fespace_and_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_fespace_and_id(GrammarParser.List_of_id_args_comma_fespace_and_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_fespace_and_id node = new List_of_id_args_comma_fespace_and_id(list_of_id_args, ctx.FESPACE().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_fespaceS_id(GrammarParser.List_of_id_args_comma_fespaceS_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_fespaceS_id(GrammarParser.List_of_id_args_comma_fespaceS_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_fespaceS_id node = new List_of_id_args_comma_fespaceS_id(list_of_id_args, ctx.FESPACES().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_array(GrammarParser.List_of_id_args_arrayContext ctx) {

    }

    @Override
    public void exitList_of_id_args_array(GrammarParser.List_of_id_args_arrayContext ctx) {
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_array node = new List_of_id_args_array(list_of_id_args);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_(GrammarParser.List_of_id_args_Context ctx) {

    }

    @Override
    public void exitList_of_id_args_(GrammarParser.List_of_id_args_Context ctx) {
        List_of_id_args_ node = new List_of_id_args_();
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_id_no_comma_expr(GrammarParser.List_of_id_args_comma_id_no_comma_exprContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_id_no_comma_expr(GrammarParser.List_of_id_args_comma_id_no_comma_exprContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_id_no_comma_expr node = new List_of_id_args_comma_id_no_comma_expr(list_of_id_args, id, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_fespaceS_id(GrammarParser.List_of_id_args_fespaceS_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_fespaceS_id(GrammarParser.List_of_id_args_fespaceS_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        List_of_id_args_fespaceS_id node = new List_of_id_args_fespaceS_id(ctx.FESPACES().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_set_no_comma_expr_to_id(GrammarParser.List_of_id_args_set_no_comma_expr_to_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_set_no_comma_expr_to_id(GrammarParser.List_of_id_args_set_no_comma_expr_to_idContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression id = (Expression) this.stack.pop();
        List_of_id_args_set_no_comma_expr_to_id node = new List_of_id_args_set_no_comma_expr_to_id(id, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_id(GrammarParser.List_of_id_args_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_id(GrammarParser.List_of_id_args_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        List_of_id_args_id node = new List_of_id_args_id(id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_fespace3_id(GrammarParser.List_of_id_args_fespace3_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_fespace3_id(GrammarParser.List_of_id_args_fespace3_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        List_of_id_args_fespace3_id node = new List_of_id_args_fespace3_id(ctx.FESPACE3().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_fespace3_and_id(GrammarParser.List_of_id_args_fespace3_and_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_fespace3_and_id(GrammarParser.List_of_id_args_fespace3_and_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        List_of_id_args_fespace3_and_id node = new List_of_id_args_fespace3_and_id(ctx.FESPACE3().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id_args_comma_fespace_id(GrammarParser.List_of_id_args_comma_fespace_idContext ctx) {

    }

    @Override
    public void exitList_of_id_args_comma_fespace_id(GrammarParser.List_of_id_args_comma_fespace_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_comma_fespace_id node = new List_of_id_args_comma_fespace_id(list_of_id_args, ctx.FESPACE().getText(), id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id1_id(GrammarParser.List_of_id1_idContext ctx) {

    }

    @Override
    public void exitList_of_id1_id(GrammarParser.List_of_id1_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        List_of_id1_id node = new List_of_id1_id(id);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_id1_comma_id(GrammarParser.List_of_id1_comma_idContext ctx) {

    }

    @Override
    public void exitList_of_id1_comma_id(GrammarParser.List_of_id1_comma_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Expression list_of_id1 = (Expression) this.stack.pop();
        List_of_id1_comma_id node = new List_of_id1_comma_id(list_of_id1, id);
        this.stack.add(node);
    }

    @Override
    public void enterId_id(GrammarParser.Id_idContext ctx) {

    }

    @Override
    public void exitId_id(GrammarParser.Id_idContext ctx) {
        Id_id node = new Id_id(ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterId_fespace(GrammarParser.Id_fespaceContext ctx) {

    }

    @Override
    public void exitId_fespace(GrammarParser.Id_fespaceContext ctx) {
        Id_fespace node = new Id_fespace(ctx.FESPACE().getText());
        this.stack.add(node);
    }

    @Override
    public void enterId_fespace3(GrammarParser.Id_fespace3Context ctx) {

    }

    @Override
    public void exitId_fespace3(GrammarParser.Id_fespace3Context ctx) {
        Id_fespace3 node = new Id_fespace3(ctx.FESPACE3().getText());
        this.stack.add(node);
    }

    @Override
    public void enterId_fespaceS(GrammarParser.Id_fespaceSContext ctx) {

    }

    @Override
    public void exitId_fespaceS(GrammarParser.Id_fespaceSContext ctx) {
        Id_fespaceS node = new Id_fespaceS(ctx.FESPACES().getText());
        this.stack.add(node);
    }

    @Override
    public void enterId_fespaceL(GrammarParser.Id_fespaceLContext ctx) {

    }

    @Override
    public void exitId_fespaceL(GrammarParser.Id_fespaceLContext ctx) {
        Id_fespaceL node = new Id_fespaceL(ctx.FESPACEL().getText());
        this.stack.add(node);
    }

    @Override
    public void enterId_fespace1(GrammarParser.Id_fespace1Context ctx) {

    }

    @Override
    public void exitId_fespace1(GrammarParser.Id_fespace1Context ctx) {
        Id_fespace1 node = new Id_fespace1(ctx.FESPACE1().getText());
        this.stack.add(node);
    }

    @Override
    public void enterId_templatevar(GrammarParser.Id_templatevarContext ctx) {

    }

    @Override
    public void exitId_templatevar(GrammarParser.Id_templatevarContext ctx) {
        Expression templatevar = (Expression) this.stack.pop();
        Templatevar_ node = new Templatevar_(templatevar);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_dcls_id_no_comma_expr(GrammarParser.List_of_dcls_id_no_comma_exprContext ctx) {

    }

    @Override
    public void exitList_of_dcls_id_no_comma_expr(GrammarParser.List_of_dcls_id_no_comma_exprContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        List_of_dcls_id_no_comma_expr node = new List_of_dcls_id_no_comma_expr(ctx.ID().getText(), no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_dcls_id_parameters_list(GrammarParser.List_of_dcls_id_parameters_listContext ctx) {

    }

    @Override
    public void exitList_of_dcls_id_parameters_list(GrammarParser.List_of_dcls_id_parameters_listContext ctx) {
        Expression parameters_list = (Expression) this.stack.pop();
        List_of_dcls_id_parameters_list node = new List_of_dcls_id_parameters_list(ctx.ID().getText(), parameters_list);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_dcls_comma(GrammarParser.List_of_dcls_commaContext ctx) {

    }

    @Override
    public void exitList_of_dcls_comma(GrammarParser.List_of_dcls_commaContext ctx) {
        Expression list_of_dcls2 = (Expression) this.stack.pop();
        Expression list_of_dcls1 = (Expression) this.stack.pop();
        List_of_dcls_comma node = new List_of_dcls_comma(list_of_dcls1, list_of_dcls2);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_dcls_templatevar(GrammarParser.List_of_dcls_templatevarContext ctx) {

    }

    @Override
    public void exitList_of_dcls_templatevar(GrammarParser.List_of_dcls_templatevarContext ctx) {
        Expression templatevar = (Expression) this.stack.pop();
        Templatevar_ node = new Templatevar_(templatevar);
        this.stack.add(node);
    }

    @Override
    public void enterList_of_dcls_id(GrammarParser.List_of_dcls_idContext ctx) {

    }

    @Override
    public void exitList_of_dcls_id(GrammarParser.List_of_dcls_idContext ctx) {
        List_of_dcls_id node = new List_of_dcls_id(ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_list_no_set_expr(GrammarParser.Parameters_list_no_set_exprContext ctx) {

    }

    @Override
    public void exitParameters_list_no_set_expr(GrammarParser.Parameters_list_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Parameters_list_no_set_expr node = new Parameters_list_no_set_expr(no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterParameters_list_fespace1_id(GrammarParser.Parameters_list_fespace1_idContext ctx) {

    }

    @Override
    public void exitParameters_list_fespace1_id(GrammarParser.Parameters_list_fespace1_idContext ctx) {
        Parameters_list_fespace1_id node = new Parameters_list_fespace1_id(ctx.FESPACE1().getText(), ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_list_fespaceS_id(GrammarParser.Parameters_list_fespaceS_idContext ctx) {

    }

    @Override
    public void exitParameters_list_fespaceS_id(GrammarParser.Parameters_list_fespaceS_idContext ctx) {
        Parameters_list_fespaceS_id node = new Parameters_list_fespaceS_id(ctx.FESPACES().getText(), ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_list_fespace_id(GrammarParser.Parameters_list_fespace_idContext ctx) {

    }

    @Override
    public void exitParameters_list_fespace_id(GrammarParser.Parameters_list_fespace_idContext ctx) {
        Parameters_list_fespace_id node = new Parameters_list_fespace_id(ctx.FESPACE().getText(), ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_list_fespace3_id(GrammarParser.Parameters_list_fespace3_idContext ctx) {

    }

    @Override
    public void exitParameters_list_fespace3_id(GrammarParser.Parameters_list_fespace3_idContext ctx) {
        Parameters_list_fespace3_id node = new Parameters_list_fespace3_id(ctx.FESPACE3().getText(), ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_list_comma_no_set_expr(GrammarParser.Parameters_list_comma_no_set_exprContext ctx) {

    }

    @Override
    public void exitParameters_list_comma_no_set_expr(GrammarParser.Parameters_list_comma_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Expression parameters_list = (Expression) this.stack.pop();
        Parameters_list_comma_no_set_expr node = new Parameters_list_comma_no_set_expr(parameters_list, no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterParameters_list_comma_id_no_set_expr(GrammarParser.Parameters_list_comma_id_no_set_exprContext ctx) {

    }

    @Override
    public void exitParameters_list_comma_id_no_set_expr(GrammarParser.Parameters_list_comma_id_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Expression id = (Expression) this.stack.pop();
        Expression parameters_list = (Expression) this.stack.pop();
        Parameters_list_comma_id_no_set_expr node = new Parameters_list_comma_id_no_set_expr(parameters_list, id, no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterParameters_list_fespaceL_id(GrammarParser.Parameters_list_fespaceL_idContext ctx) {

    }

    @Override
    public void exitParameters_list_fespaceL_id(GrammarParser.Parameters_list_fespaceL_idContext ctx) {
        Parameters_list_fespaceL_id node = new Parameters_list_fespaceL_id(ctx.FESPACEL().getText(), ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_list_id_no_set_expr(GrammarParser.Parameters_list_id_no_set_exprContext ctx) {

    }

    @Override
    public void exitParameters_list_id_no_set_expr(GrammarParser.Parameters_list_id_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Parameters_list_id_no_set_expr node = new Parameters_list_id_no_set_expr(ctx.ID().getText(), no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterType_of_dcl_id(GrammarParser.Type_of_dcl_idContext ctx) {

    }

    @Override
    public void exitType_of_dcl_id(GrammarParser.Type_of_dcl_idContext ctx) {
        Type_of_dcl_id node = new Type_of_dcl_id(ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterType_of_dcl_id_array(GrammarParser.Type_of_dcl_id_arrayContext ctx) {

    }

    @Override
    public void exitType_of_dcl_id_array(GrammarParser.Type_of_dcl_id_arrayContext ctx) {
        Type_of_dcl_id_array node = new Type_of_dcl_id_array(ctx.ID(0).getText(), ctx.ID(1).getText());
        this.stack.add(node);
    }

    @Override
    public void enterType_of_dcl_id_array_array(GrammarParser.Type_of_dcl_id_array_arrayContext ctx) {

    }

    @Override
    public void exitType_of_dcl_id_array_array(GrammarParser.Type_of_dcl_id_array_arrayContext ctx) {
        Type_of_dcl_id_array_array node = new Type_of_dcl_id_array_array(ctx.ID(0).getText(), ctx.ID(1).getText(), ctx.ID(2).getText());
        this.stack.add(node);
    }

    @Override
    public void enterType_of_dcl_id_matrix(GrammarParser.Type_of_dcl_id_matrixContext ctx) {

    }

    @Override
    public void exitType_of_dcl_id_matrix(GrammarParser.Type_of_dcl_id_matrixContext ctx) {
        Type_of_dcl_id_matrix node = new Type_of_dcl_id_matrix(ctx.ID(0).getText(), ctx.ID(1).getText(), ctx.ID(2).getText());
        this.stack.add(node);
    }

    @Override
    public void enterType_of_dcl_id_matrix_array(GrammarParser.Type_of_dcl_id_matrix_arrayContext ctx) {

    }

    @Override
    public void exitType_of_dcl_id_matrix_array(GrammarParser.Type_of_dcl_id_matrix_arrayContext ctx) {
        Type_of_dcl_id_matrix_array node = new Type_of_dcl_id_matrix_array(ctx.ID(0).getText(), ctx.ID(1).getText(), ctx.ID(2).getText(), ctx.ID(3).getText());
        this.stack.add(node);
    }

    @Override
    public void enterType_of_dcl_id_vector(GrammarParser.Type_of_dcl_id_vectorContext ctx) {

    }

    @Override
    public void exitType_of_dcl_id_vector(GrammarParser.Type_of_dcl_id_vectorContext ctx) {
        Type_of_dcl_id_vector node = new Type_of_dcl_id_vector(ctx.ID(0).getText(), ctx.ID(1).getText());
        this.stack.add(node);
    }

    @Override
    public void enterType_of_dcl_id_vector_array(GrammarParser.Type_of_dcl_id_vector_arrayContext ctx) {

    }

    @Override
    public void exitType_of_dcl_id_vector_array(GrammarParser.Type_of_dcl_id_vector_arrayContext ctx) {
        Type_of_dcl_id_vector_array node = new Type_of_dcl_id_vector_array(ctx.ID(0).getText(), ctx.ID(1).getText(), ctx.ID(2).getText());
        this.stack.add(node);
    }

    @Override
    public void enterType_of_dcl_id_vector_matrix(GrammarParser.Type_of_dcl_id_vector_matrixContext ctx) {

    }

    @Override
    public void exitType_of_dcl_id_vector_matrix(GrammarParser.Type_of_dcl_id_vector_matrixContext ctx) {
        Type_of_dcl_id_vector_matrix node = new Type_of_dcl_id_vector_matrix(ctx.ID(0).getText(), ctx.ID(1).getText(), ctx.ID(2).getText(), ctx.ID(3).getText());
        this.stack.add(node);
    }

    @Override
    public void enterType_of_dcl_templatevar(GrammarParser.Type_of_dcl_templatevarContext ctx) {

    }

    @Override
    public void exitType_of_dcl_templatevar(GrammarParser.Type_of_dcl_templatevarContext ctx) {
        Expression templatevar = (Expression) this.stack.pop();
        Templatevar_ node = new Templatevar_(templatevar);
        this.stack.add(node);
    }

    @Override
    public void enterId_space_id(GrammarParser.Id_space_idContext ctx) {

    }

    @Override
    public void exitId_space_id(GrammarParser.Id_space_idContext ctx) {
        Id_space_id node = new Id_space_id(ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterId_space_array_no_set_expr(GrammarParser.Id_space_array_no_set_exprContext ctx) {

    }

    @Override
    public void exitId_space_array_no_set_expr(GrammarParser.Id_space_array_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Id_space_array_no_set_expr node = new Id_space_array_no_set_expr(ctx.ID().getText(), no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterId_space_no_set_expr(GrammarParser.Id_space_no_set_exprContext ctx) {

    }

    @Override
    public void exitId_space_no_set_expr(GrammarParser.Id_space_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Id_space_no_set_expr node = new Id_space_no_set_expr(ctx.ID().getText(), no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterId_space_array_list_of_id1(GrammarParser.Id_space_array_list_of_id1Context ctx) {

    }

    @Override
    public void exitId_space_array_list_of_id1(GrammarParser.Id_space_array_list_of_id1Context ctx) {
        Expression list_of_id1 = (Expression) this.stack.pop();
        Id_space_array_list_of_id1 node = new Id_space_array_list_of_id1(list_of_id1);
        this.stack.add(node);
    }

    @Override
    public void enterId_space_array_list_of_id1_array_no_set_expr(GrammarParser.Id_space_array_list_of_id1_array_no_set_exprContext ctx) {

    }

    @Override
    public void exitId_space_array_list_of_id1_array_no_set_expr(GrammarParser.Id_space_array_list_of_id1_array_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Expression list_of_id1 = (Expression) this.stack.pop();
        Id_space_array_list_of_id1_array_no_set_expr node = new Id_space_array_list_of_id1_array_no_set_expr(list_of_id1, no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterId_space_array_list_of_id1_no_set_expr(GrammarParser.Id_space_array_list_of_id1_no_set_exprContext ctx) {

    }

    @Override
    public void exitId_space_array_list_of_id1_no_set_expr(GrammarParser.Id_space_array_list_of_id1_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Expression list_of_id1 = (Expression) this.stack.pop();
        Id_space_array_list_of_id1_no_set_expr node = new Id_space_array_list_of_id1_no_set_expr(list_of_id1, no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterId_space_templatevar(GrammarParser.Id_space_templatevarContext ctx) {

    }

    @Override
    public void exitId_space_templatevar(GrammarParser.Id_space_templatevarContext ctx) {
        Expression templatevar = (Expression) this.stack.pop();
        Templatevar_ node = new Templatevar_(templatevar);
        this.stack.add(node);
    }

    @Override
    public void enterId_array_space_id_no_set_expr(GrammarParser.Id_array_space_id_no_set_exprContext ctx) {

    }

    @Override
    public void exitId_array_space_id_no_set_expr(GrammarParser.Id_array_space_id_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Id_array_space_id_no_set_expr node = new Id_array_space_id_no_set_expr(ctx.ID().getText(), no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterId_array_space_array_list_of_id1_no_set_expr(GrammarParser.Id_array_space_array_list_of_id1_no_set_exprContext ctx) {

    }

    @Override
    public void exitId_array_space_array_list_of_id1_no_set_expr(GrammarParser.Id_array_space_array_list_of_id1_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Expression list_of_id1 = (Expression) this.stack.pop();
        Id_array_space_array_list_of_id1_no_set_expr node = new Id_array_space_array_list_of_id1_no_set_expr(list_of_id1, no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterId_array_space_templatevar(GrammarParser.Id_array_space_templatevarContext ctx) {

    }

    @Override
    public void exitId_array_space_templatevar(GrammarParser.Id_array_space_templatevarContext ctx) {
        Expression templatevar = (Expression) this.stack.pop();
        Templatevar_ node = new Templatevar_(templatevar);
        this.stack.add(node);
    }

    @Override
    public void enterFespace123_fespace(GrammarParser.Fespace123_fespaceContext ctx) {

    }

    @Override
    public void exitFespace123_fespace(GrammarParser.Fespace123_fespaceContext ctx) {
        Fespace123_fespace node = new Fespace123_fespace(ctx.FESPACE().getText());
        this.stack.add(node);
    }

    @Override
    public void enterFespace123_fespace1(GrammarParser.Fespace123_fespace1Context ctx) {

    }

    @Override
    public void exitFespace123_fespace1(GrammarParser.Fespace123_fespace1Context ctx) {
        Fespace123_fespace1 node = new Fespace123_fespace1(ctx.FESPACE1().getText());
        this.stack.add(node);
    }

    @Override
    public void enterFespace123_fespace3(GrammarParser.Fespace123_fespace3Context ctx) {

    }

    @Override
    public void exitFespace123_fespace3(GrammarParser.Fespace123_fespace3Context ctx) {
        Fespace123_fespace3 node = new Fespace123_fespace3(ctx.FESPACE3().getText());
        this.stack.add(node);
    }

    @Override
    public void enterFespace123_fespaceS(GrammarParser.Fespace123_fespaceSContext ctx) {

    }

    @Override
    public void exitFespace123_fespaceS(GrammarParser.Fespace123_fespaceSContext ctx) {
        Fespace123_fespaceS node = new Fespace123_fespaceS(ctx.FESPACES().getText());
        this.stack.add(node);
    }

    @Override
    public void enterFespace123_fespaceL(GrammarParser.Fespace123_fespaceLContext ctx) {

    }

    @Override
    public void exitFespace123_fespaceL(GrammarParser.Fespace123_fespaceLContext ctx) {
        Fespace123_fespaceL node = new Fespace123_fespaceL(ctx.FESPACEL().getText());
        this.stack.add(node);
    }

    @Override
    public void enterFespace123_templatevar(GrammarParser.Fespace123_templatevarContext ctx) {

    }

    @Override
    public void exitFespace123_templatevar(GrammarParser.Fespace123_templatevarContext ctx) {
        Expression templatevar = (Expression) this.stack.pop();
        Templatevar_ node = new Templatevar_(templatevar);
        this.stack.add(node);
    }

    @Override
    public void enterFespace_fespace123(GrammarParser.Fespace_fespace123Context ctx) {

    }

    @Override
    public void exitFespace_fespace123(GrammarParser.Fespace_fespace123Context ctx) {
        Expression fespace123 = (Expression) this.stack.pop();
        Fespace_fespace123 node = new Fespace_fespace123(fespace123);
        this.stack.add(node);
    }

    @Override
    public void enterFespace_fespace123_vector(GrammarParser.Fespace_fespace123_vectorContext ctx) {

    }

    @Override
    public void exitFespace_fespace123_vector(GrammarParser.Fespace_fespace123_vectorContext ctx) {
        Expression fespace123 = (Expression) this.stack.pop();
        Fespace_fespace123_vector node = new Fespace_fespace123_vector(fespace123, ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterSpaceIDa_id_array_space(GrammarParser.SpaceIDa_id_array_spaceContext ctx) {

    }

    @Override
    public void exitSpaceIDa_id_array_space(GrammarParser.SpaceIDa_id_array_spaceContext ctx) {
        Expression id_array_space = (Expression) this.stack.pop();
        SpaceIDa_id_array_space node = new SpaceIDa_id_array_space(id_array_space);
        this.stack.add(node);
    }

    @Override
    public void enterSpaceIDa_comma_id_array_space(GrammarParser.SpaceIDa_comma_id_array_spaceContext ctx) {

    }

    @Override
    public void exitSpaceIDa_comma_id_array_space(GrammarParser.SpaceIDa_comma_id_array_spaceContext ctx) {
        Expression id_array_space = (Expression) this.stack.pop();
        Expression spaceIDa = (Expression) this.stack.pop();
        SpaceIDa_comma_id_array_space node = new SpaceIDa_comma_id_array_space(spaceIDa, id_array_space);
        this.stack.add(node);
    }

    @Override
    public void enterSpaceIDb_comma_id_space(GrammarParser.SpaceIDb_comma_id_spaceContext ctx) {

    }

    @Override
    public void exitSpaceIDb_comma_id_space(GrammarParser.SpaceIDb_comma_id_spaceContext ctx) {
        Expression id_space = (Expression) this.stack.pop();
        Expression spaceIDb = (Expression) this.stack.pop();
        SpaceIDb_comma_id_space node = new SpaceIDb_comma_id_space(spaceIDb, id_space);
        this.stack.add(node);
    }

    @Override
    public void enterSpaceIDb_id_space(GrammarParser.SpaceIDb_id_spaceContext ctx) {

    }

    @Override
    public void exitSpaceIDb_id_space(GrammarParser.SpaceIDb_id_spaceContext ctx) {
        Expression id_space = (Expression) this.stack.pop();
        SpaceIDb_id_space node = new SpaceIDb_id_space(id_space);
        this.stack.add(node);
    }

    @Override
    public void enterSpaceIDs_fespace_spaceIDb(GrammarParser.SpaceIDs_fespace_spaceIDbContext ctx) {

    }

    @Override
    public void exitSpaceIDs_fespace_spaceIDb(GrammarParser.SpaceIDs_fespace_spaceIDbContext ctx) {
        Expression spaceIDb = (Expression) this.stack.pop();
        Expression fespace = (Expression) this.stack.pop();
        SpaceIDs_fespace_spaceIDb node = new SpaceIDs_fespace_spaceIDb(fespace, spaceIDb);
        this.stack.add(node);
    }

    @Override
    public void enterSpaceIDs_fespace_array_ID_spaceIDa(GrammarParser.SpaceIDs_fespace_array_ID_spaceIDaContext ctx) {

    }

    @Override
    public void exitSpaceIDs_fespace_array_ID_spaceIDa(GrammarParser.SpaceIDs_fespace_array_ID_spaceIDaContext ctx) {
        Expression spaceIDa = (Expression) this.stack.pop();
        Expression fespace = (Expression) this.stack.pop();
        SpaceIDs_fespace_array_ID_spaceIDa node = new SpaceIDs_fespace_array_ID_spaceIDa(fespace, ctx.ID().getText(), spaceIDa);
        this.stack.add(node);
    }

    @Override
    public void enterFespace_def(GrammarParser.Fespace_defContext ctx) {

    }

    @Override
    public void exitFespace_def(GrammarParser.Fespace_defContext ctx) {
        Expression parameters_list = (Expression) this.stack.pop();
        Fespace_def node = new Fespace_def(ctx.ID().getText(), parameters_list);
        this.stack.add(node);
    }

    @Override
    public void enterFespace_def_list_comma_fespace_def(GrammarParser.Fespace_def_list_comma_fespace_defContext ctx) {

    }

    @Override
    public void exitFespace_def_list_comma_fespace_def(GrammarParser.Fespace_def_list_comma_fespace_defContext ctx) {
        Expression fespace_def = (Expression) this.stack.pop();
        Expression fespace_def_list = (Expression) this.stack.pop();
        Fespace_def_list_comma_fespace_def node = new Fespace_def_list_comma_fespace_def(fespace_def_list, fespace_def);
        this.stack.add(node);
    }

    @Override
    public void enterFespace_def_list_fespace_def(GrammarParser.Fespace_def_list_fespace_defContext ctx) {

    }

    @Override
    public void exitFespace_def_list_fespace_def(GrammarParser.Fespace_def_list_fespace_defContext ctx) {
        Expression fespace_def = (Expression) this.stack.pop();
        Fespace_def_list_fespace_def node = new Fespace_def_list_fespace_def(fespace_def);
        this.stack.add(node);
    }

    @Override
    public void enterDeclaration_type_of_dcl_list_of_dcls(GrammarParser.Declaration_type_of_dcl_list_of_dclsContext ctx) {

    }

    @Override
    public void exitDeclaration_type_of_dcl_list_of_dcls(GrammarParser.Declaration_type_of_dcl_list_of_dclsContext ctx) {
        Expression list_of_dcls = (Expression) this.stack.pop();
        Expression type_of_dcl = (Expression) this.stack.pop();
        Declaration_type_of_dcl_list_of_dcls node = new Declaration_type_of_dcl_list_of_dcls(type_of_dcl, list_of_dcls);
        this.stack.add(node);
    }

    @Override
    public void enterDeclaration_fespace_def_list(GrammarParser.Declaration_fespace_def_listContext ctx) {

    }

    @Override
    public void exitDeclaration_fespace_def_list(GrammarParser.Declaration_fespace_def_listContext ctx) {
        Expression fespace_def_list = (Expression) this.stack.pop();
        Declaration_fespace_def_list node = new Declaration_fespace_def_list(ctx.FESPACE().getText(), fespace_def_list);
        this.stack.add(node);
    }

    @Override
    public void enterDeclaration_spaceIDs(GrammarParser.Declaration_spaceIDsContext ctx) {

    }

    @Override
    public void exitDeclaration_spaceIDs(GrammarParser.Declaration_spaceIDsContext ctx) {
        Expression spaceIDs = (Expression) this.stack.pop();
        Declaration_spaceIDs node = new Declaration_spaceIDs(spaceIDs);
        this.stack.add(node);
    }

    @Override
    public void enterDeclaration_function_id_expr(GrammarParser.Declaration_function_id_exprContext ctx) {

    }

    @Override
    public void exitDeclaration_function_id_expr(GrammarParser.Declaration_function_id_exprContext ctx) {
        Expression expr = (Expression) this.stack.pop();
        Declaration_function_id_expr node = new Declaration_function_id_expr(ctx.FUNCTION().getText(), ctx.ID().getText(), expr);
        this.stack.add(node);
    }

    @Override
    public void enterDeclaration_function_type_of_dcl_id(GrammarParser.Declaration_function_type_of_dcl_idContext ctx) {

    }

    @Override
    public void exitDeclaration_function_type_of_dcl_id(GrammarParser.Declaration_function_type_of_dcl_idContext ctx) {
        Expression instructions = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        Expression type_of_dcl = (Expression) this.stack.pop();
        Declaration_function_type_of_dcl_id node = new Declaration_function_type_of_dcl_id(ctx.FUNCTION().getText(), type_of_dcl, ctx.ID().getText(), list_of_id_args, instructions);
        this.stack.add(node);
    }

    @Override
    public void enterFunction_id_list_of_id_args(GrammarParser.Function_id_list_of_id_argsContext ctx) {

    }

    @Override
    public void exitFunction_id_list_of_id_args(GrammarParser.Function_id_list_of_id_argsContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression list_of_id_args = (Expression) this.stack.pop();
        Function_id_list_of_id_args node = new Function_id_list_of_id_args(ctx.FUNCTION().getText(), ctx.ID().getText(), list_of_id_args, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterDeclaration_templatevar(GrammarParser.Declaration_templatevarContext ctx) {

    }

    @Override
    public void exitDeclaration_templatevar(GrammarParser.Declaration_templatevarContext ctx) {
        Expression templatevar = (Expression) this.stack.pop();
        Templatevar_ node = new Templatevar_(templatevar);
        this.stack.add(node);
    }

    @Override
    public void enterBegin(GrammarParser.BeginContext ctx) {

    }

    @Override
    public void exitBegin(GrammarParser.BeginContext ctx) {
        Begin node = new Begin();
        this.stack.add(node);
    }

    @Override
    public void enterEnd(GrammarParser.EndContext ctx) {

    }

    @Override
    public void exitEnd(GrammarParser.EndContext ctx) {
        End node = new End();
        this.stack.add(node);
    }

    @Override
    public void enterFor_loop(GrammarParser.For_loopContext ctx) {

    }

    @Override
    public void exitFor_loop(GrammarParser.For_loopContext ctx) {
        For_loop node = new For_loop();
        this.stack.add(node);
    }

    @Override
    public void enterWhile_loop(GrammarParser.While_loopContext ctx) {

    }

    @Override
    public void exitWhile_loop(GrammarParser.While_loopContext ctx) {
        While_loop node = new While_loop();
        this.stack.add(node);
    }

    @Override
    public void enterDeclaration_for(GrammarParser.Declaration_forContext ctx) {

    }

    @Override
    public void exitDeclaration_for(GrammarParser.Declaration_forContext ctx) {
        Expression list_of_dcls = (Expression) this.stack.pop();
        Expression type_of_dcl = (Expression) this.stack.pop();
        Declaration_for node = new Declaration_for(type_of_dcl, list_of_dcls);
        this.stack.add(node);
    }

    @Override
    public void enterTry_(GrammarParser.Try_Context ctx) {

    }

    @Override
    public void exitTry_(GrammarParser.Try_Context ctx) {
        Try node = new Try();
        this.stack.add(node);
    }

    @Override
    public void enterIdfor_id(GrammarParser.Idfor_idContext ctx) {

    }

    @Override
    public void exitIdfor_id(GrammarParser.Idfor_idContext ctx) {
        Expression id = (Expression) this.stack.pop();
        Idfor_id node = new Idfor_id(id);
        this.stack.add(node);
    }

    @Override
    public void enterIdfor_comma_id(GrammarParser.Idfor_comma_idContext ctx) {

    }

    @Override
    public void exitIdfor_comma_id(GrammarParser.Idfor_comma_idContext ctx) {
        Expression id2 = (Expression) this.stack.pop();
        Expression id1 = (Expression) this.stack.pop();
        Idfor_comma_id node = new Idfor_comma_id(id1, id2);
        this.stack.add(node);
    }

    @Override
    public void enterIdfor_comma_id_comma_id(GrammarParser.Idfor_comma_id_comma_idContext ctx) {

    }

    @Override
    public void exitIdfor_comma_id_comma_id(GrammarParser.Idfor_comma_id_comma_idContext ctx) {
        Expression id3 = (Expression) this.stack.pop();
        Expression id2 = (Expression) this.stack.pop();
        Expression id1 = (Expression) this.stack.pop();
        Idfor_comma_id_comma_id node = new Idfor_comma_id_comma_id(id1, id2, id3);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_(GrammarParser.Instruction_Context ctx) {

    }

    @Override
    public void exitInstruction_(GrammarParser.Instruction_Context ctx) {
        Instruction_ node = new Instruction_();
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_include_string(GrammarParser.Instruction_include_stringContext ctx) {

    }

    @Override
    public void exitInstruction_include_string(GrammarParser.Instruction_include_stringContext ctx) {
        Instruction_include_string node = new Instruction_include_string(ctx.STRING().getText());
        this.stack.add(node);
    }

    @Override
    public void enterInstruciotn_load_string(GrammarParser.Instruciotn_load_stringContext ctx) {

    }

    @Override
    public void exitInstruciotn_load_string(GrammarParser.Instruciotn_load_stringContext ctx) {
        Instruction_load_string node = new Instruction_load_string(ctx.STRING().getText());
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_try_instructions_catchs(GrammarParser.Instruction_try_instructions_catchsContext ctx) {

    }

    @Override
    public void exitInstruction_try_instructions_catchs(GrammarParser.Instruction_try_instructions_catchsContext ctx) {
        Expression catchs = (Expression) this.stack.pop();
        Expression instructions = (Expression) this.stack.pop();
        Expression Try1 = (Expression) this.stack.pop();
        Instruction_try_instructions_catchs node = new Instruction_try_instructions_catchs(Try1, instructions, catchs);
        this.stack.add(node);
    }

    public void enterInstruction_expr(GrammarParser.Instruction_exprContext ctx) {

    }

    @Override
    public void exitInstruction_expr(GrammarParser.Instruction_exprContext ctx) {
        Expression expr = (Expression) this.stack.pop();
        Instruction_expr node = new Instruction_expr(expr);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_declaration(GrammarParser.Instruction_declarationContext ctx) {

    }

    @Override
    public void exitInstruction_declaration(GrammarParser.Instruction_declarationContext ctx) {
        Expression declaration = (Expression) this.stack.pop();
        Instruction_declaration node = new Instruction_declaration(declaration);
        this.stack.add(node);
    }

    @Override
    public void enterFor_loop_idfor_primary_instruction(GrammarParser.For_loop_idfor_primary_instructionContext ctx) {

    }

    @Override
    public void exitFor_loop_idfor_primary_instruction(GrammarParser.For_loop_idfor_primary_instructionContext ctx) {
        Expression instruction = (Expression) this.stack.pop();
        Expression primary = (Expression) this.stack.pop();
        Expression idfor = (Expression) this.stack.pop();
        Expression for_loop = (Expression) this.stack.pop();
        For_loop_idfor_primary_instruction node = new For_loop_idfor_primary_instruction(for_loop, idfor, primary, instruction);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_for_loop(GrammarParser.Instruction_for_loopContext ctx) {

    }

    @Override
    public void exitInstruction_for_loop(GrammarParser.Instruction_for_loopContext ctx) {
        Expression instruction = (Expression) this.stack.pop();
        Expression expr3 = (Expression) this.stack.pop();
        Expression expr2 = (Expression) this.stack.pop();
        Expression expr1 = (Expression) this.stack.pop();
        Expression for_loop = (Expression) this.stack.pop();
        Instruction_for_loop node = new Instruction_for_loop(for_loop, expr1, expr2, expr3, instruction);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_declaration_for_expr_expr_instruction(GrammarParser.Instruction_declaration_for_expr_expr_instructionContext ctx) {

    }

    @Override
    public void exitInstruction_declaration_for_expr_expr_instruction(GrammarParser.Instruction_declaration_for_expr_expr_instructionContext ctx) {
        Expression instruction = (Expression) this.stack.pop();
        Expression expr3 = (Expression) this.stack.pop();
        Expression expr2 = (Expression) this.stack.pop();
        Expression declaration_for = (Expression) this.stack.pop();
        Expression for_loop = (Expression) this.stack.pop();
        Instruction_declaration_for_expr_expr_instruction node = new Instruction_declaration_for_expr_expr_instruction(for_loop, declaration_for, expr2, expr3, instruction);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_while_loop(GrammarParser.Instruction_while_loopContext ctx) {

    }

    @Override
    public void exitInstruction_while_loop(GrammarParser.Instruction_while_loopContext ctx) {
        Expression instruction = (Expression) this.stack.pop();
        Expression expr = (Expression) this.stack.pop();
        Expression while_loop = (Expression) this.stack.pop();
        Instruction_while_loop node = new Instruction_while_loop(while_loop, expr, instruction);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_if(GrammarParser.Instruction_ifContext ctx) {

    }

    @Override
    public void exitInstruction_if(GrammarParser.Instruction_ifContext ctx) {
        Expression instruction = (Expression) this.stack.pop();
        Expression expr = (Expression) this.stack.pop();
        Instruction_if node = new Instruction_if(expr, instruction);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_if_else(GrammarParser.Instruction_if_elseContext ctx) {

    }

    @Override
    public void exitInstruction_if_else(GrammarParser.Instruction_if_elseContext ctx) {
        Expression instruction2 = (Expression) this.stack.pop();
        Expression instruction1 = (Expression) this.stack.pop();
        Expression expr = (Expression) this.stack.pop();
        Instruction_if_else node = new Instruction_if_else(expr, instruction1, instruction2);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_begin_end(GrammarParser.Instruction_begin_endContext ctx) {

    }

    @Override
    public void exitInstruction_begin_end(GrammarParser.Instruction_begin_endContext ctx) {
        Expression end = (Expression) this.stack.pop();
        Expression instruction = (Expression) this.stack.pop();
        Expression begin = (Expression) this.stack.pop();
        Instruction_begin_end node = new Instruction_begin_end(begin, instruction, end);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_border_id_border_expr(GrammarParser.Instruction_border_id_border_exprContext ctx) {

    }

    @Override
    public void exitInstruction_border_id_border_expr(GrammarParser.Instruction_border_id_border_exprContext ctx) {
        Expression border_expr = (Expression) this.stack.pop();
        Instruction_border_id_border_expr node = new Instruction_border_id_border_expr(ctx.ID().getText(), border_expr);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_border_id_array(GrammarParser.Instruction_border_id_arrayContext ctx) {

    }

    @Override
    public void exitInstruction_border_id_array(GrammarParser.Instruction_border_id_arrayContext ctx) {
        Expression array = (Expression) this.stack.pop();
        Instruction_border_id_array node = new Instruction_border_id_array(ctx.ID().getText(), array);
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_break(GrammarParser.Instruction_breakContext ctx) {

    }

    @Override
    public void exitInstruction_break(GrammarParser.Instruction_breakContext ctx) {
        Instruction_break node = new Instruction_break();
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_continue(GrammarParser.Instruction_continueContext ctx) {

    }

    @Override
    public void exitInstruction_continue(GrammarParser.Instruction_continueContext ctx) {
        Instruction_continue node = new Instruction_continue();
        this.stack.add(node);
    }

    @Override
    public void enterInstruction_return(GrammarParser.Instruction_returnContext ctx) {

    }

    @Override
    public void exitInstruction_return(GrammarParser.Instruction_returnContext ctx) {
        Expression expr = (Expression) this.stack.pop();
        Instruction_return node = new Instruction_return(expr);
        this.stack.add(node);
    }

    @Override
    public void enterCatchs(GrammarParser.CatchsContext ctx) {

    }

    @Override
    public void exitCatchs(GrammarParser.CatchsContext ctx) {
        Expression instruction = (Expression) this.stack.pop();
        Catchs node = new Catchs(instruction);
        this.stack.add(node);
    }

    @Override
    public void enterBornes_id_expr_expr(GrammarParser.Bornes_id_expr_exprContext ctx) {

    }

    @Override
    public void exitBornes_id_expr_expr(GrammarParser.Bornes_id_expr_exprContext ctx) {
        Expression expr2 = (Expression) this.stack.pop();
        Expression expr1 = (Expression) this.stack.pop();
        Bornes_id_expr_expr node = new Bornes_id_expr_expr(ctx.ID().getText(), expr1, expr2);
        this.stack.add(node);
    }

    @Override
    public void enterBornes_id_expr_expr_id(GrammarParser.Bornes_id_expr_expr_idContext ctx) {

    }

    @Override
    public void exitBornes_id_expr_expr_id(GrammarParser.Bornes_id_expr_expr_idContext ctx) {
        Expression expr2 = (Expression) this.stack.pop();
        Expression expr1 = (Expression) this.stack.pop();
        Bornes_id_expr_expr_id node = new Bornes_id_expr_expr_id(ctx.ID(0).getText(), expr1, expr2, ctx.ID(1).getText());
        this.stack.add(node);
    }

    @Override
    public void enterBorder_expr(GrammarParser.Border_exprContext ctx) {

    }

    @Override
    public void exitBorder_expr(GrammarParser.Border_exprContext ctx) {
        Expression instruction = (Expression) this.stack.pop();
        Expression bornes = (Expression) this.stack.pop();
        Border_expr node = new Border_expr(bornes, instruction);
        this.stack.add(node);
    }

    @Override
    public void enterExpr_comma(GrammarParser.Expr_commaContext ctx) {

    }

    @Override
    public void exitExpr_comma(GrammarParser.Expr_commaContext ctx) {
        Expression expr2 = (Expression) this.stack.pop();
        Expression expr1 = (Expression) this.stack.pop();
        Expr_comma node = new Expr_comma(expr1, expr2);
        this.stack.add(node);
    }

    @Override
    public void enterExpr_no_comma_expr(GrammarParser.Expr_no_comma_exprContext ctx) {

    }

    @Override
    public void exitExpr_no_comma_expr(GrammarParser.Expr_no_comma_exprContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expr_no_comma_expr node = new Expr_no_comma_expr(no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterUnop_minus(GrammarParser.Unop_minusContext ctx) {

    }

    @Override
    public void exitUnop_minus(GrammarParser.Unop_minusContext ctx) {
        Unop_minus node = new Unop_minus(ctx.getText());
        this.stack.add(node);
    }

    @Override
    public void enterUnop_plus(GrammarParser.Unop_plusContext ctx) {

    }

    @Override
    public void exitUnop_plus(GrammarParser.Unop_plusContext ctx) {
        Unop_plus node = new Unop_plus(ctx.getText());
        this.stack.add(node);
    }

    @Override
    public void enterUnop_not(GrammarParser.Unop_notContext ctx) {

    }

    @Override
    public void exitUnop_not(GrammarParser.Unop_notContext ctx) {
        Unop_not node = new Unop_not(ctx.getText());
        this.stack.add(node);
    }

    @Override
    public void enterUnop_increment(GrammarParser.Unop_incrementContext ctx) {

    }

    @Override
    public void exitUnop_increment(GrammarParser.Unop_incrementContext ctx) {
        Unop_increment node = new Unop_increment(ctx.getText());
        this.stack.add(node);
    }

    @Override
    public void enterUnop_decrement(GrammarParser.Unop_decrementContext ctx) {

    }

    @Override
    public void exitUnop_decrement(GrammarParser.Unop_decrementContext ctx) {
        Unop_decrement node = new Unop_decrement(ctx.getText());
        this.stack.add(node);
    }

    @Override
    public void enterNo_comma_expr_no_set_expr(GrammarParser.No_comma_expr_no_set_exprContext ctx) {

    }

    @Override
    public void exitNo_comma_expr_no_set_expr(GrammarParser.No_comma_expr_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        No_comma_expr_no_set_expr node = new No_comma_expr_no_set_expr(no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_comma_expr_equal(GrammarParser.No_comma_expr_equalContext ctx) {

    }

    @Override
    public void exitNo_comma_expr_equal(GrammarParser.No_comma_expr_equalContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression no_set_expr = (Expression) this.stack.pop();
        No_comma_expr_equal node = new No_comma_expr_equal(no_set_expr, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_comma_expr_plusEqual(GrammarParser.No_comma_expr_plusEqualContext ctx) {

    }

    @Override
    public void exitNo_comma_expr_plusEqual(GrammarParser.No_comma_expr_plusEqualContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression no_set_expr = (Expression) this.stack.pop();
        No_comma_expr_plusEqual node = new No_comma_expr_plusEqual(no_set_expr, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_comma_expr_minusEqual(GrammarParser.No_comma_expr_minusEqualContext ctx) {

    }

    @Override
    public void exitNo_comma_expr_minusEqual(GrammarParser.No_comma_expr_minusEqualContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression no_set_expr = (Expression) this.stack.pop();
        No_comma_expr_minusEqual node = new No_comma_expr_minusEqual(no_set_expr, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_comma_expr_multEqual(GrammarParser.No_comma_expr_multEqualContext ctx) {

    }

    @Override
    public void exitNo_comma_expr_multEqual(GrammarParser.No_comma_expr_multEqualContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression no_set_expr = (Expression) this.stack.pop();
        No_comma_expr_multEqual node = new No_comma_expr_multEqual(no_set_expr, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_comma_expr_divideEqual(GrammarParser.No_comma_expr_divideEqualContext ctx) {

    }

    @Override
    public void exitNo_comma_expr_divideEqual(GrammarParser.No_comma_expr_divideEqualContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression no_set_expr = (Expression) this.stack.pop();
        No_comma_expr_divideEqual node = new No_comma_expr_divideEqual(no_set_expr, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_comma_expr_dot_multEqual(GrammarParser.No_comma_expr_dot_multEqualContext ctx) {

    }

    @Override
    public void exitNo_comma_expr_dot_multEqual(GrammarParser.No_comma_expr_dot_multEqualContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression no_set_expr = (Expression) this.stack.pop();
        No_comma_expr_dot_multEqual node = new No_comma_expr_dot_multEqual(no_set_expr, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_comma_expr_dot_divideEqual(GrammarParser.No_comma_expr_dot_divideEqualContext ctx) {

    }

    @Override
    public void exitNo_comma_expr_dot_divideEqual(GrammarParser.No_comma_expr_dot_divideEqualContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression no_set_expr = (Expression) this.stack.pop();
        No_comma_expr_dot_divideEqual node = new No_comma_expr_dot_divideEqual(no_set_expr, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_no_ternary_expr(GrammarParser.No_set_expr_no_ternary_exprContext ctx) {

    }

    @Override
    public void exitNo_set_expr_no_ternary_expr(GrammarParser.No_set_expr_no_ternary_exprContext ctx) {
        Expression no_ternary_expr = (Expression) this.stack.pop();
        No_set_expr_no_ternary_expr node = new No_set_expr_no_ternary_expr(no_ternary_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_no_ternary_expr_if_no_ternary_expr(GrammarParser.No_set_expr_no_ternary_expr_if_no_ternary_exprContext ctx) {

    }

    @Override
    public void exitNo_set_expr_no_ternary_expr_if_no_ternary_expr(GrammarParser.No_set_expr_no_ternary_expr_if_no_ternary_exprContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        Expression no_ternary_expr = (Expression) this.stack.pop();
        No_set_expr_no_ternary_expr_if_no_ternary_expr node = new No_set_expr_no_ternary_expr_if_no_ternary_expr(no_ternary_expr, no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_no_ternary_expr_colon(GrammarParser.No_set_expr_no_ternary_expr_colonContext ctx) {

    }

    @Override
    public void exitNo_set_expr_no_ternary_expr_colon(GrammarParser.No_set_expr_no_ternary_expr_colonContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_set_expr_no_ternary_expr_colon node = new No_set_expr_no_ternary_expr_colon(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_no_ternary_expr_colon_no_ternary_expr(GrammarParser.No_set_expr_no_ternary_expr_colon_no_ternary_exprContext ctx) {

    }

    @Override
    public void exitNo_set_expr_no_ternary_expr_colon_no_ternary_expr(GrammarParser.No_set_expr_no_ternary_expr_colon_no_ternary_exprContext ctx) {
        Expression no_ternary_expr3 = (Expression) this.stack.pop();
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_set_expr_no_ternary_expr_colon_no_ternary_expr node = new No_set_expr_no_ternary_expr_colon_no_ternary_expr(no_ternary_expr1, no_ternary_expr2, no_ternary_expr3);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_greaterEqual(GrammarParser.No_ternary_expr_greaterEqualContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_greaterEqual(GrammarParser.No_ternary_expr_greaterEqualContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_greaterEqual node = new No_ternary_expr_greaterEqual(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_oror(GrammarParser.No_ternary_expr_ororContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_oror(GrammarParser.No_ternary_expr_ororContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_oror node = new No_ternary_expr_oror(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_lessEqual(GrammarParser.No_ternary_expr_lessEqualContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_lessEqual(GrammarParser.No_ternary_expr_lessEqualContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_lessEqual node = new No_ternary_expr_lessEqual(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_equal(GrammarParser.No_ternary_expr_equalContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_equal(GrammarParser.No_ternary_expr_equalContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_equal node = new No_ternary_expr_equal(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_unary_expr(GrammarParser.No_ternary_expr_unary_exprContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_unary_expr(GrammarParser.No_ternary_expr_unary_exprContext ctx) {
        Expression unary_expr = (Expression) this.stack.pop();
        No_ternary_expr_unary_expr node = new No_ternary_expr_unary_expr(unary_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_greater(GrammarParser.No_ternary_expr_greaterContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_greater(GrammarParser.No_ternary_expr_greaterContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_greater node = new No_ternary_expr_greater(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_notEqual(GrammarParser.No_ternary_expr_notEqualContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_notEqual(GrammarParser.No_ternary_expr_notEqualContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_notEqual node = new No_ternary_expr_notEqual(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_dotMultiply(GrammarParser.No_ternary_expr_dotMultiplyContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_dotMultiply(GrammarParser.No_ternary_expr_dotMultiplyContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_dotMultiply node = new No_ternary_expr_dotMultiply(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_less(GrammarParser.No_ternary_expr_lessContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_less(GrammarParser.No_ternary_expr_lessContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_less node = new No_ternary_expr_less(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_plus(GrammarParser.No_ternary_expr_plusContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_plus(GrammarParser.No_ternary_expr_plusContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_plus node = new No_ternary_expr_plus(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_minus(GrammarParser.No_ternary_expr_minusContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_minus(GrammarParser.No_ternary_expr_minusContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_minus node = new No_ternary_expr_minus(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);

    }

    @Override
    public void enterNo_ternary_expr_modulus(GrammarParser.No_ternary_expr_modulusContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_modulus(GrammarParser.No_ternary_expr_modulusContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_modulus node = new No_ternary_expr_modulus(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_dotDivide(GrammarParser.No_ternary_expr_dotDivideContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_dotDivide(GrammarParser.No_ternary_expr_dotDivideContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_dotDivide node = new No_ternary_expr_dotDivide(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_andand(GrammarParser.No_ternary_expr_andandContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_andand(GrammarParser.No_ternary_expr_andandContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_andand node = new No_ternary_expr_andand(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_out(GrammarParser.No_ternary_expr_outContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_out(GrammarParser.No_ternary_expr_outContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_out node = new No_ternary_expr_out(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_or(GrammarParser.No_ternary_expr_orContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_or(GrammarParser.No_ternary_expr_orContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_or node = new No_ternary_expr_or(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_in(GrammarParser.No_ternary_expr_inContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_in(GrammarParser.No_ternary_expr_inContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_in node = new No_ternary_expr_in(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_multiply(GrammarParser.No_ternary_expr_multiplyContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_multiply(GrammarParser.No_ternary_expr_multiplyContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_multiply node = new No_ternary_expr_multiply(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_and(GrammarParser.No_ternary_expr_andContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_and(GrammarParser.No_ternary_expr_andContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_and node = new No_ternary_expr_and(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_ternary_expr_divide(GrammarParser.No_ternary_expr_divideContext ctx) {

    }

    @Override
    public void exitNo_ternary_expr_divide(GrammarParser.No_ternary_expr_divideContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        No_ternary_expr_divide node = new No_ternary_expr_divide(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterSub_script_expr_no_ternary_expr(GrammarParser.Sub_script_expr_no_ternary_exprContext ctx) {

    }

    @Override
    public void exitSub_script_expr_no_ternary_expr(GrammarParser.Sub_script_expr_no_ternary_exprContext ctx) {
        Expression no_ternary_expr = (Expression) this.stack.pop();
        Sub_script_expr_no_ternary_expr node = new Sub_script_expr_no_ternary_expr(no_ternary_expr);
        this.stack.add(node);
    }

    @Override
    public void enterSub_script_expr_colon(GrammarParser.Sub_script_expr_colonContext ctx) {

    }

    @Override
    public void exitSub_script_expr_colon(GrammarParser.Sub_script_expr_colonContext ctx) {
        Sub_script_expr_colon node = new Sub_script_expr_colon();
        this.stack.add(node);
    }

    @Override
    public void enterSub_script_expr_no_ternary_expr_colon_no_ternary_expr(GrammarParser.Sub_script_expr_no_ternary_expr_colon_no_ternary_exprContext ctx) {

    }

    @Override
    public void exitSub_script_expr_no_ternary_expr_colon_no_ternary_expr(GrammarParser.Sub_script_expr_no_ternary_expr_colon_no_ternary_exprContext ctx) {
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        Sub_script_expr_no_ternary_expr_colon_no_ternary_expr node = new Sub_script_expr_no_ternary_expr_colon_no_ternary_expr(no_ternary_expr1, no_ternary_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterSub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_expr(GrammarParser.Sub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_exprContext ctx) {

    }

    @Override
    public void exitSub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_expr(GrammarParser.Sub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_exprContext ctx) {
        Expression no_ternary_expr3 = (Expression) this.stack.pop();
        Expression no_ternary_expr2 = (Expression) this.stack.pop();
        Expression no_ternary_expr1 = (Expression) this.stack.pop();
        Sub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_expr node = new Sub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_expr(no_ternary_expr1, no_ternary_expr2, no_ternary_expr3);
        this.stack.add(node);
    }

    @Override
    public void enterParameterstype(GrammarParser.ParameterstypeContext ctx) {

    }

    @Override
    public void exitParameterstype(GrammarParser.ParameterstypeContext ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Expression sub_script_expr = (Expression) this.stack.pop();
        Parameterstype node = new Parameterstype(sub_script_expr, parameters);
        this.stack.add(node);
    }

    @Override
    public void enterParameters_fespaceL(GrammarParser.Parameters_fespaceLContext ctx) {

    }

    @Override
    public void exitParameters_fespaceL(GrammarParser.Parameters_fespaceLContext ctx) {
        Parameters_fespaceL node = new Parameters_fespaceL(ctx.FESPACEL().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_fespace1(GrammarParser.Parameters_fespace1Context ctx) {

    }

    @Override
    public void exitParameters_fespace1(GrammarParser.Parameters_fespace1Context ctx) {
        Parameters_fespace1 node = new Parameters_fespace1(ctx.FESPACE1().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_fespace(GrammarParser.Parameters_fespaceContext ctx) {

    }

    @Override
    public void exitParameters_fespace(GrammarParser.Parameters_fespaceContext ctx) {
        Parameters_fespace node = new Parameters_fespace(ctx.FESPACE().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_(GrammarParser.Parameters_Context ctx) {

    }

    @Override
    public void exitParameters_(GrammarParser.Parameters_Context ctx) {
        Parameters_ node = new Parameters_();
        this.stack.add(node);
    }

    @Override
    public void enterParameters_fespace3(GrammarParser.Parameters_fespace3Context ctx) {

    }

    @Override
    public void exitParameters_fespace3(GrammarParser.Parameters_fespace3Context ctx) {
        Parameters_fespace3 node = new Parameters_fespace3(ctx.FESPACE3().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_fespaceS(GrammarParser.Parameters_fespaceSContext ctx) {

    }

    @Override
    public void exitParameters_fespaceS(GrammarParser.Parameters_fespaceSContext ctx) {
        Parameters_fespaceS node = new Parameters_fespaceS(ctx.FESPACES().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_sub_scripts_expr(GrammarParser.Parameters_sub_scripts_exprContext ctx) {

    }

    @Override
    public void exitParameters_sub_scripts_expr(GrammarParser.Parameters_sub_scripts_exprContext ctx) {
        Expression sub_script_expr = (Expression) this.stack.pop();
        Parameters_sub_scripts_expr node = new Parameters_sub_scripts_expr(sub_script_expr);
        this.stack.add(node);
    }

    @Override
    public void enterParameters_id_equal_no_set_expr(GrammarParser.Parameters_id_equal_no_set_exprContext ctx) {

    }

    @Override
    public void exitParameters_id_equal_no_set_expr(GrammarParser.Parameters_id_equal_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Expression id = (Expression) this.stack.pop();
        Parameters_id_equal_no_set_expr node = new Parameters_id_equal_no_set_expr(id,no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterParameters_comma_fespaceL(GrammarParser.Parameters_comma_fespaceLContext ctx) {

    }

    @Override
    public void exitParameters_comma_fespaceL(GrammarParser.Parameters_comma_fespaceLContext ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Parameters_comma_fespaceL node = new Parameters_comma_fespaceL(parameters, ctx.FESPACEL().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_comma_fespace3(GrammarParser.Parameters_comma_fespace3Context ctx) {

    }

    @Override
    public void exitParameters_comma_fespace3(GrammarParser.Parameters_comma_fespace3Context ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Parameters_comma_fespace3 node = new Parameters_comma_fespace3(parameters, ctx.FESPACE3().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_comma_fespaceS(GrammarParser.Parameters_comma_fespaceSContext ctx) {

    }

    @Override
    public void exitParameters_comma_fespaceS(GrammarParser.Parameters_comma_fespaceSContext ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Parameters_comma_fespaceS node = new Parameters_comma_fespaceS(parameters, ctx.FESPACES().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_comma_sub_script_expr(GrammarParser.Parameters_comma_sub_script_exprContext ctx) {

    }

    @Override
    public void exitParameters_comma_sub_script_expr(GrammarParser.Parameters_comma_sub_script_exprContext ctx) {
        Expression sub_script_expr = (Expression) this.stack.pop();
        Expression parameters = (Expression) this.stack.pop();
        Parameters_comma_sub_script_expr node = new Parameters_comma_sub_script_expr(parameters, sub_script_expr);
        this.stack.add(node);
    }

    @Override
    public void enterParameters_comma_id_equal_no_set_expr(GrammarParser.Parameters_comma_id_equal_no_set_exprContext ctx) {

    }

    @Override
    public void exitParameters_comma_id_equal_no_set_expr(GrammarParser.Parameters_comma_id_equal_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Expression id = (Expression) this.stack.pop();
        Expression parameters = (Expression) this.stack.pop();
        Parameters_comma_id_equal_no_set_expr node = new Parameters_comma_id_equal_no_set_expr(parameters, id, no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterParameters_comma_fespace(GrammarParser.Parameters_comma_fespaceContext ctx) {

    }

    @Override
    public void exitParameters_comma_fespace(GrammarParser.Parameters_comma_fespaceContext ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Parameters_comma_fespace node = new Parameters_comma_fespace(parameters, ctx.FESPACE().getText());
        this.stack.add(node);
    }

    @Override
    public void enterParameters_comma_fespace1(GrammarParser.Parameters_comma_fespace1Context ctx) {

    }

    @Override
    public void exitParameters_comma_fespace1(GrammarParser.Parameters_comma_fespace1Context ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Parameters_comma_fespace1 node = new Parameters_comma_fespace1(parameters, ctx.FESPACE1().getText());
        this.stack.add(node);
    }

    @Override
    public void enterArray_comma_no_comma_expr(GrammarParser.Array_comma_no_comma_exprContext ctx) {

    }

    @Override
    public void exitArray_comma_no_comma_expr(GrammarParser.Array_comma_no_comma_exprContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Expression array = (Expression) this.stack.pop();
        Array_comma_no_comma_expr node = new Array_comma_no_comma_expr(array, no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterArray_no_comma_expr(GrammarParser.Array_no_comma_exprContext ctx) {

    }

    @Override
    public void exitArray_no_comma_expr(GrammarParser.Array_no_comma_exprContext ctx) {
        Expression no_comma_expr = (Expression) this.stack.pop();
        Array_no_comma_expr node = new Array_no_comma_expr(no_comma_expr);
        this.stack.add(node);
    }

    @Override
    public void enterUnary_expr_pow_expr(GrammarParser.Unary_expr_pow_exprContext ctx) {

    }

    @Override
    public void exitUnary_expr_pow_expr(GrammarParser.Unary_expr_pow_exprContext ctx) {
        Expression pow_expr = (Expression) this.stack.pop();
        Unary_expr_pow_expr node = new Unary_expr_pow_expr(pow_expr);
        this.stack.add(node);
    }

    @Override
    public void enterUnary_expr_unop_pow_expr(GrammarParser.Unary_expr_unop_pow_exprContext ctx) {

    }

    @Override
    public void exitUnary_expr_unop_pow_expr(GrammarParser.Unary_expr_unop_pow_exprContext ctx) {
        Expression pow_expr = (Expression) this.stack.pop();
        Expression unop = (Expression) this.stack.pop();
        Unary_expr_unop_pow_expr node = new Unary_expr_unop_pow_expr(unop, pow_expr);
        this.stack.add(node);
    }

    @Override
    public void enterPow_expr_primary(GrammarParser.Pow_expr_primaryContext ctx) {

    }

    @Override
    public void exitPow_expr_primary(GrammarParser.Pow_expr_primaryContext ctx) {
        Expression primary = (Expression) this.stack.pop();
        Pow_expr_primary node = new Pow_expr_primary(primary);
        this.stack.add(node);
    }

    @Override
    public void enterPow_expr_power(GrammarParser.Pow_expr_powerContext ctx) {

    }

    @Override
    public void exitPow_expr_power(GrammarParser.Pow_expr_powerContext ctx) {
        Expression unary_expr = (Expression) this.stack.pop();
        Expression primary = (Expression) this.stack.pop();
        Pow_expr_power node = new Pow_expr_power(primary, unary_expr);
        this.stack.add(node);
    }

    @Override
    public void enterPow_expr_underscore(GrammarParser.Pow_expr_underscoreContext ctx) {

    }

    @Override
    public void exitPow_expr_underscore(GrammarParser.Pow_expr_underscoreContext ctx) {
        Expression unary_expr = (Expression) this.stack.pop();
        Expression primary = (Expression) this.stack.pop();
        Pow_expr_underscore node = new Pow_expr_underscore(primary, unary_expr);
        this.stack.add(node);
    }

    @Override
    public void enterPrimaryp_primary(GrammarParser.Primaryp_primaryContext ctx) {

    }

    @Override
    public void exitPrimaryp_primary(GrammarParser.Primaryp_primaryContext ctx) {
        Expression primary = (Expression) this.stack.pop();
        Primaryp_primary node = new Primaryp_primary(primary);
        this.stack.add(node);
    }

    @Override
    public void enterPrimaryp_primary_transpose(GrammarParser.Primaryp_primary_transposeContext ctx) {

    }

    @Override
    public void exitPrimaryp_primary_transpose(GrammarParser.Primaryp_primary_transposeContext ctx) {
        Expression primary = (Expression) this.stack.pop();
        Primaryp_primary_transpose node = new Primaryp_primary_transpose(primary);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_parameters(GrammarParser.Primary_parametersContext ctx) {

    }

    @Override
    public void exitPrimary_parameters(GrammarParser.Primary_parametersContext ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Expression primary = (Expression) this.stack.pop();
        Primary_parameters node = new Primary_parameters(primary, parameters);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_lnum(GrammarParser.Primary_lnumContext ctx) { }

    @Override
    public void exitPrimary_lnum(GrammarParser.Primary_lnumContext ctx) {
        Primary_lnum node = new Primary_lnum(Long.parseLong(ctx.getText()));
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_decrement(GrammarParser.Primary_decrementContext ctx) {

    }

    @Override
    public void exitPrimary_decrement(GrammarParser.Primary_decrementContext ctx) {
        Expression primary = (Expression) this.stack.pop();
        Primary_decrement node = new Primary_decrement(primary);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_fespaceS_dot_id(GrammarParser.Primary_fespaceS_dot_idContext ctx) {

    }

    @Override
    public void exitPrimary_fespaceS_dot_id(GrammarParser.Primary_fespaceS_dot_idContext ctx) {
        Primary_fespaceS_dot_id node = new Primary_fespaceS_dot_id(ctx.FESPACES().getText(), ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_fespaceL_dot_id(GrammarParser.Primary_fespaceL_dot_idContext ctx) {

    }

    @Override
    public void exitPrimary_fespaceL_dot_id(GrammarParser.Primary_fespaceL_dot_idContext ctx) {
        Primary_fespaceL_dot_id node = new Primary_fespaceL_dot_id(ctx.FESPACEL().getText(), ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_increment(GrammarParser.Primary_incrementContext ctx) { }

    @Override
    public void exitPrimary_increment(GrammarParser.Primary_incrementContext ctx) {
        Expression primary = (Expression) this.stack.pop();
        Primary_increment node = new Primary_increment(primary);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_array_(GrammarParser.Primary_array_Context ctx) {

    }

    @Override
    public void exitPrimary_array_(GrammarParser.Primary_array_Context ctx) {
        Expression array = (Expression) this.stack.pop();
        Primary_array_ node = new Primary_array_(array);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_matrix(GrammarParser.Primary_matrixContext ctx) {

    }

    @Override
    public void exitPrimary_matrix(GrammarParser.Primary_matrixContext ctx) {
        Expression sub_script_expr2 = (Expression) this.stack.pop();
        Expression sub_script_expr1 = (Expression) this.stack.pop();
        Expression primary = (Expression) this.stack.pop();
        Primary_matrix node = new Primary_matrix(primary, sub_script_expr1, sub_script_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_id_parameterstype(GrammarParser.Primary_id_parameterstypeContext ctx) {

    }

    @Override
    public void exitPrimary_id_parameterstype(GrammarParser.Primary_id_parameterstypeContext ctx) {
        Expression parameterstype = (Expression) this.stack.pop();
        Primary_id_parameterstype node = new Primary_id_parameterstype(ctx.ID().getText(), parameterstype);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_array_sub_script_expr(GrammarParser.Primary_array_sub_script_exprContext ctx) {

    }

    @Override
    public void exitPrimary_array_sub_script_expr(GrammarParser.Primary_array_sub_script_exprContext ctx) {
        Expression sub_script_expr = (Expression) this.stack.pop();
        Expression primary = (Expression) this.stack.pop();
        Primary_array_sub_script_expr node = new Primary_array_sub_script_expr(primary, sub_script_expr);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_fespace_dot_id(GrammarParser.Primary_fespace_dot_idContext ctx) {

    }

    @Override
    public void exitPrimary_fespace_dot_id(GrammarParser.Primary_fespace_dot_idContext ctx) {
        Primary_fespace_dot_id node = new Primary_fespace_dot_id(ctx.FESPACE().getText(), ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_fespace3_parameters(GrammarParser.Primary_fespace3_parametersContext ctx) {

    }

    @Override
    public void exitPrimary_fespace3_parameters(GrammarParser.Primary_fespace3_parametersContext ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Primary_fespace3_parameters node = new Primary_fespace3_parameters(ctx.FESPACE3().getText(), parameters);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_cnum(GrammarParser.Primary_cnumContext ctx) { }

    @Override
    public void exitPrimary_cnum(GrammarParser.Primary_cnumContext ctx) {
        Primary_cnum node = new Primary_cnum(ctx.getText());
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_fespace1_parameters(GrammarParser.Primary_fespace1_parametersContext ctx) {

    }

    @Override
    public void exitPrimary_fespace1_parameters(GrammarParser.Primary_fespace1_parametersContext ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Primary_fespace1_parameters node = new Primary_fespace1_parameters(ctx.FESPACE1().getText(), parameters);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_dot_id(GrammarParser.Primary_dot_idContext ctx) {

    }

    @Override
    public void exitPrimary_dot_id(GrammarParser.Primary_dot_idContext ctx) {
        Expression primary = (Expression) this.stack.pop();
        Primary_dot_id node = new Primary_dot_id(primary, ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_fespace1_dot_id(GrammarParser.Primary_fespace1_dot_idContext ctx) {

    }

    @Override
    public void exitPrimary_fespace1_dot_id(GrammarParser.Primary_fespace1_dot_idContext ctx) {
        Primary_fespace1_dot_id node = new Primary_fespace1_dot_id(ctx.FESPACE1().getText(), ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_fespace3_dot_id(GrammarParser.Primary_fespace3_dot_idContext ctx) {

    }

    @Override
    public void exitPrimary_fespace3_dot_id(GrammarParser.Primary_fespace3_dot_idContext ctx) {
        Primary_fespace3_dot_id node = new Primary_fespace3_dot_id(ctx.FESPACE3().getText(), ctx.ID().getText());
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_fespaceL_parameters(GrammarParser.Primary_fespaceL_parametersContext ctx) {

    }

    @Override
    public void exitPrimary_fespaceL_parameters(GrammarParser.Primary_fespaceL_parametersContext ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Primary_fespaceL_parameters node = new Primary_fespaceL_parameters(ctx.FESPACEL().getText(), parameters);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_dnum(GrammarParser.Primary_dnumContext ctx) { }

    @Override
    public void exitPrimary_dnum(GrammarParser.Primary_dnumContext ctx) {
        Primary_dnum node = new Primary_dnum(Double.parseDouble(ctx.getText()));
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_string(GrammarParser.Primary_stringContext ctx) { }

    @Override
    public void exitPrimary_string(GrammarParser.Primary_stringContext ctx) {
        Primary_string node = new Primary_string(ctx.getText());
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_templatevar(GrammarParser.Primary_templatevarContext ctx) {

    }

    @Override
    public void exitPrimary_templatevar(GrammarParser.Primary_templatevarContext ctx) {
        Expression templatevar = (Expression) this.stack.pop();
        Templatevar_ node = new Templatevar_(templatevar);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_empty_array(GrammarParser.Primary_empty_arrayContext ctx) {

    }

    @Override
    public void exitPrimary_empty_array(GrammarParser.Primary_empty_arrayContext ctx) {
        Expression primary = (Expression) this.stack.pop();
        Primary_empty_array node = new Primary_empty_array(primary);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_fespace_parameters(GrammarParser.Primary_fespace_parametersContext ctx) {

    }

    @Override
    public void exitPrimary_fespace_parameters(GrammarParser.Primary_fespace_parametersContext ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Primary_fespace_parameters node = new Primary_fespace_parameters(ctx.FESPACE().getText(), parameters);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_id(GrammarParser.Primary_idContext ctx) { }

    @Override
    public void exitPrimary_id(GrammarParser.Primary_idContext ctx) {
        Primary_id node = new Primary_id(ctx.getText());
        this.stack.add(node);
    }

    @Override
    public void enterTemplatevar(GrammarParser.TemplatevarContext ctx) {

    }

    @Override
    public void exitTemplatevar(GrammarParser.TemplatevarContext ctx) {
        Expression expr = (Expression) this.stack.pop();
        Templatevar node = new Templatevar(ctx.ID().getText(), expr);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_expr(GrammarParser.Primary_exprContext ctx) {

    }

    @Override
    public void exitPrimary_expr(GrammarParser.Primary_exprContext ctx) {
        Expression expr = (Expression) this.stack.pop();
        Primary_expr node = new Primary_expr(expr);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_id_sub_script_expr(GrammarParser.Primary_id_sub_script_exprContext ctx) {

    }

    @Override
    public void exitPrimary_id_sub_script_expr(GrammarParser.Primary_id_sub_script_exprContext ctx) {
        Expression sub_script_expr = (Expression) this.stack.pop();
        Primary_id_sub_script_expr node = new Primary_id_sub_script_expr(ctx.ID().getText(), sub_script_expr);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_fespaceS_parameters(GrammarParser.Primary_fespaceS_parametersContext ctx) {

    }

    @Override
    public void exitPrimary_fespaceS_parameters(GrammarParser.Primary_fespaceS_parametersContext ctx) {
        Expression parameters = (Expression) this.stack.pop();
        Primary_fespaceS_parameters node = new Primary_fespaceS_parameters(ctx.FESPACES().getText(), parameters);
        this.stack.add(node);
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) { }

    @Override
    public void visitErrorNode(ErrorNode errorNode) { }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) { }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) { }
}

class Primary_id extends Node implements Expression {
    String variable;
    Primary_id(String variable) {
        this.variable = variable;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.variable);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.variable.equals(((Primary_id) node).variable);
    }
}

class Primary_dnum extends Node implements Expression{
    double value;
    Primary_dnum(double value){
        this.value = value;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map){
        printStream.print(this.value);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {

    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.value == ((Primary_dnum) node).value;
    }
}

class Primary_lnum extends Node implements Expression{
    long value;
    Primary_lnum(long value){
        this.value = value;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map){
        printStream.print(this.value);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {

    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.value == ((Primary_lnum) node).value;
    }
}

class Primary_cnum extends Node implements Expression{
    String value;
    Primary_cnum(String value){
        this.value = value;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.value);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {

    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.value.equals(((Primary_cnum) node).value);
    }
}

class Primary_string extends Node implements Expression {
    String string;
    Primary_string(String string) {
        this.string = string;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.string);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.string.equals(((Primary_string) node).string);
    }
}

class Primary_parameters extends Node implements Expression{
    Expression primary;
    Expression parameters;
    Primary_parameters(Expression primary, Expression parameters){
        this.primary = primary;
        this.parameters = parameters;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primary.dump(printStream, map);
        printStream.print("(");
        this.parameters.dump(printStream, map);
        printStream.print(")");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primary.collect(map);
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.parameters.equals(((Primary_parameters) node).parameters) && this.primary.equals(((Primary_parameters) node).primary);
    }
}

class Primary_array_sub_script_expr extends Node implements Expression {
    Expression primary;
    Expression sub_script_expr;
    Primary_array_sub_script_expr(Expression primary, Expression sub_script_expr){
        this.primary = primary;
        this.sub_script_expr = sub_script_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primary.dump(printStream, map);
        printStream.print('[');
        this.sub_script_expr.dump(printStream, map);
        printStream.print(']');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primary.collect(map);
        this.sub_script_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primary.equals(((Primary_array_sub_script_expr) node).primary) && this.sub_script_expr.equals(((Primary_array_sub_script_expr) node).sub_script_expr);
    }
}

class Primary_matrix extends Node implements Expression {
    Expression primary;
    Expression sub_script_expr1, sub_script_expr2;
    Primary_matrix(Expression primary, Expression sub_script_expr1, Expression sub_script_expr2){
        this.primary = primary;
        this.sub_script_expr1 = sub_script_expr1;
        this.sub_script_expr2 = sub_script_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primary.dump(printStream, map);
        printStream.print('[');
        this.sub_script_expr1.dump(printStream, map);
        printStream.print(", ");
        this.sub_script_expr2.dump(printStream, map);
        printStream.print(']');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primary.collect(map);
        this.sub_script_expr1.collect(map);
        this.sub_script_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primary.equals(((Primary_matrix) node).primary) && this.sub_script_expr1.equals(((Primary_matrix) node).sub_script_expr1) && this.sub_script_expr2.equals(((Primary_matrix) node).sub_script_expr2);
    }
}

class Primary_empty_array extends Node implements Expression {
    Expression primary;
    Primary_empty_array(Expression primary){
        this.primary = primary;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primary.dump(printStream, map);
        printStream.print("[]");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primary.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primary.equals(((Primary_empty_array) node).primary);
    }
}

class Primary_dot_id extends Node implements Expression {
    Expression primary;
    String id;
    Primary_dot_id(Expression primary, String id){
        this.primary = primary;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primary.dump(printStream, map);
        printStream.print('.' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primary.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primary.equals(((Primary_dot_id) node).primary) && this.id.equals(((Primary_dot_id) node).id);
    }
}

class Primary_fespace_dot_id extends Node implements Expression {
    String fespace, id;
    Primary_fespace_dot_id(String fespace, String id){
        this.fespace = fespace;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace + '.' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((Primary_fespace_dot_id) node).fespace) && this.id.equals(((Primary_fespace_dot_id) node).id);
    }
}

class Primary_fespace_parameters extends Node implements Expression {
    String fespace;
    Expression parameters;
    Primary_fespace_parameters(String fespace, Expression parameters){
        this.fespace = fespace;
        this.parameters = parameters;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace + '(');
        this.parameters.dump(printStream, map);
        printStream.print(')');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((Primary_fespace_parameters) node).fespace) && this.parameters.equals(((Primary_fespace_parameters) node).parameters);
    }
}

class Primary_fespace1_dot_id extends Node implements Expression {
    String fespace1, id;
    Primary_fespace1_dot_id(String fespace1, String id){
        this.fespace1 = fespace1;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace1 + '.' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace1.equals(((Primary_fespace1_dot_id) node).fespace1) && this.id.equals(((Primary_fespace1_dot_id) node).id);
    }
}

class Primary_fespace1_parameters extends Node implements Expression {
    String fespace1;
    Expression parameters;
    Primary_fespace1_parameters(String fespace1, Expression parameters){
        this.fespace1 = fespace1;
        this.parameters = parameters;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace1 + '(');
        this.parameters.dump(printStream, map);
        printStream.print(')');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace1.equals(((Primary_fespace1_parameters) node).fespace1) && this.parameters.equals(((Primary_fespace1_parameters) node).parameters);
    }
}

class Primary_fespace3_dot_id extends Node implements Expression {
    String fespace3, id;
    Primary_fespace3_dot_id(String fespace3, String id){
        this.fespace3 = fespace3;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace3 + '.' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace3.equals(((Primary_fespace3_dot_id) node).fespace3) && this.id.equals(((Primary_fespace3_dot_id) node).id);
    }
}

class Primary_fespace3_parameters extends Node implements Expression {
    String fespace3;
    Expression parameters;
    Primary_fespace3_parameters(String fespace3, Expression parameters){
        this.fespace3 = fespace3;
        this.parameters = parameters;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace3 + '(');
        this.parameters.dump(printStream, map);
        printStream.print(')');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace3.equals(((Primary_fespace3_parameters) node).fespace3) && this.parameters.equals(((Primary_fespace3_parameters) node).parameters);
    }
}

class Primary_fespaceS_dot_id extends Node implements Expression {
    String fespaceS, id;
    Primary_fespaceS_dot_id(String fespaceS, String id){
        this.fespaceS = fespaceS;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceS + '.' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceS.equals(((Primary_fespaceS_dot_id) node).fespaceS) && this.id.equals(((Primary_fespaceS_dot_id) node).id);
    }
}

class Primary_fespaceS_parameters extends Node implements Expression {
    String fespaceS;
    Expression parameters;
    Primary_fespaceS_parameters(String fespaceS, Expression parameters){
        this.fespaceS = fespaceS;
        this.parameters = parameters;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceS + '(');
        this.parameters.dump(printStream, map);
        printStream.print(')');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceS.equals(((Primary_fespaceS_parameters) node).fespaceS) && this.parameters.equals(((Primary_fespaceS_parameters) node).parameters);
    }
}

class Primary_fespaceL_dot_id extends Node implements Expression {
    String fespaceL, id;
    Primary_fespaceL_dot_id(String fespaceL, String id){
        this.fespaceL = fespaceL;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceL + '.' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceL.equals(((Primary_fespaceL_dot_id) node).fespaceL) && this.id.equals(((Primary_fespaceL_dot_id) node).id);
    }
}

class Primary_fespaceL_parameters extends Node implements Expression {
    String fespaceL;
    Expression parameters;
    Primary_fespaceL_parameters(String fespaceL, Expression parameters){
        this.fespaceL = fespaceL;
        this.parameters = parameters;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceL + '(');
        this.parameters.dump(printStream, map);
        printStream.print(')');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceL.equals(((Primary_fespaceL_parameters) node).fespaceL) && this.parameters.equals(((Primary_fespaceL_parameters) node).parameters);
    }
}

class Primary_increment extends Node implements Expression {
    Expression primary;
    Primary_increment(Expression primary){
        this.primary = primary;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primary.dump(printStream, map);
        printStream.print("++");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primary.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primary.equals(((Primary_increment) node).primary);
    }
}

class Primary_decrement extends Node implements Expression {
    Expression primary;
    Primary_decrement(Expression primary){
        this.primary = primary;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primary.dump(printStream, map);
        printStream.print("--");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primary.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primary.equals(((Primary_decrement) node).primary);
    }
}

class Primary_id_sub_script_expr extends Node implements Expression {
    String id;
    Expression sub_script_expr;
    Primary_id_sub_script_expr(String id, Expression sub_script_expr){
        this.id = id;
        this.sub_script_expr = sub_script_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id + '(');
        this.sub_script_expr.dump(printStream, map);
        printStream.print(')');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.sub_script_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Primary_id_sub_script_expr) node).id) && this.sub_script_expr.equals(((Primary_id_sub_script_expr) node).sub_script_expr);
    }
}

class Primary_id_parameterstype extends Node implements Expression {
    String id;
    Expression parameterstype;
    Primary_id_parameterstype(String id, Expression parameterstype){
        this.id = id;
        this.parameterstype = parameterstype;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id + '(');
        this.parameterstype.dump(printStream, map);
        printStream.print(')');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameterstype.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Primary_id_parameterstype) node).id) && this.parameterstype.equals(((Primary_id_parameterstype) node).parameterstype);
    }
}

class Primary_expr extends Node implements Expression {
    Expression expr;
    Primary_expr(Expression expr){
        this.expr = expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print('(');
        this.expr.dump(printStream, map);
        printStream.print(')');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.expr.equals(((Primary_expr) node).expr);
    }
}

class Primary_array_ extends Node implements Expression {
    Expression array;
    Primary_array_(Expression array){
        this.array = array;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print('[');
        this.array.dump(printStream, map);
        printStream.print(']');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.array.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.array.equals(((Primary_array_) node).array);
    }
}

class Primaryp_primary extends Node implements Expression {
    Expression primary;
    Primaryp_primary(Expression primary){
        this.primary = primary;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primary.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primary.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primary.equals(((Primaryp_primary) node).primary);
    }
}

class Primaryp_primary_transpose extends Node implements Expression {
    Expression primary;
    Primaryp_primary_transpose(Expression primary){
        this.primary = primary;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primary.dump(printStream, map);
        printStream.print("'");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primary.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primary.equals(((Primaryp_primary_transpose) node).primary);
    }
}

class Pow_expr_primary extends Node implements Expression {
    Expression primaryp;
    Pow_expr_primary(Expression primaryp){
        this.primaryp = primaryp;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primaryp.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primaryp.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primaryp.equals(((Pow_expr_primary) node).primaryp);
    }
}

class Pow_expr_power extends Node implements Expression {
    Expression primaryp;
    Expression unary_expr;
    Pow_expr_power(Expression primaryp, Expression unary_expr){
        this.primaryp = primaryp;
        this.unary_expr = unary_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primaryp.dump(printStream, map);
        printStream.print('^');
        this.unary_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primaryp.collect(map);
        this.unary_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primaryp.equals(((Pow_expr_power) node).primaryp) && this.unary_expr.equals(((Pow_expr_power) node).unary_expr);
    }
}

class Pow_expr_underscore extends Node implements Expression {
    Expression primaryp;
    Expression unary_expr;
    Pow_expr_underscore(Expression primaryp, Expression unary_expr){
        this.primaryp = primaryp;
        this.unary_expr = unary_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.primaryp.dump(printStream, map);
        printStream.print('_');
        this.unary_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.primaryp.collect(map);
        this.unary_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.primaryp.equals(((Pow_expr_underscore) node).primaryp) && this.unary_expr.equals(((Pow_expr_underscore) node).unary_expr);
    }
}

class Unary_expr_pow_expr extends Node implements Expression {
    Expression pow_expr;
    Unary_expr_pow_expr(Expression pow_expr){
        this.pow_expr = pow_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.pow_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.pow_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.pow_expr.equals(((Unary_expr_pow_expr) node).pow_expr);
    }
}

class Unary_expr_unop_pow_expr extends Node implements Expression {
    Expression unop;
    Expression pow_expr;
    Unary_expr_unop_pow_expr(Expression unop, Expression pow_expr){
        this.unop = unop;
        this.pow_expr = pow_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.unop.dump(printStream, map);
        printStream.print(' ');
        this.pow_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.unop.collect(map);
        this.pow_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.unop.equals(((Unary_expr_unop_pow_expr) node).unop) && this.pow_expr.equals(((Unary_expr_unop_pow_expr) node).pow_expr);
    }
}

class Array_no_comma_expr extends Node implements Expression {
    Expression no_comma_expr;
    Array_no_comma_expr(Expression no_comma_expr){
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_comma_expr.equals(((Array_no_comma_expr) node).no_comma_expr);
    }
}

class Array_comma_no_comma_expr extends Node implements Expression {
    Expression array;
    Expression no_comma_expr;
    Array_comma_no_comma_expr(Expression array, Expression no_comma_expr){
        this.array = array;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.array.dump(printStream, map);
        printStream.print(", ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.array.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.array.equals(((Array_comma_no_comma_expr) node).array) && this.no_comma_expr.equals(((Array_comma_no_comma_expr) node).no_comma_expr);
    }
}

class Parameters_ extends Node implements Expression {
    Parameters_(){}
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class Parameters_fespace extends Node implements Expression {
    String fespace;
    Parameters_fespace(String fespace){
        this.fespace = fespace;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((Parameters_fespace) node).fespace);
    }
}

class Parameters_fespace1 extends Node implements Expression {
    String fespace1;
    Parameters_fespace1(String fespace1){
        this.fespace1 = fespace1;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace1);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace1.equals(((Parameters_fespace1) node).fespace1);
    }
}

class Parameters_fespace3 extends Node implements Expression {
    String fespace3;
    Parameters_fespace3(String fespace3){
        this.fespace3 = fespace3;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace3);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace3.equals(((Parameters_fespace3) node).fespace3);
    }
}

class Parameters_fespaceS extends Node implements Expression {
    String fespaceS;
    Parameters_fespaceS(String fespaceS){
        this.fespaceS = fespaceS;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceS);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceS.equals(((Parameters_fespaceS) node).fespaceS);
    }
}

class Parameters_fespaceL extends Node implements Expression {
    String fespaceL;
    Parameters_fespaceL(String fespaceL){
        this.fespaceL = fespaceL;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceL);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceL.equals(((Parameters_fespaceL) node).fespaceL);
    }
}

class Parameters_id_equal_no_set_expr extends Node implements Expression {
    Expression id;
    Expression no_set_expr;
    Parameters_id_equal_no_set_expr(Expression id, Expression no_set_expr){
        this.id = id;
        this.no_set_expr = no_set_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.id.dump(printStream, map);
        printStream.print(" = ");
        this.no_set_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Parameters_id_equal_no_set_expr) node).id) && this.no_set_expr.equals(((Parameters_id_equal_no_set_expr) node).no_set_expr);
    }
}

class Parameters_sub_scripts_expr extends Node implements Expression {
    Expression sub_script_expr;
    Parameters_sub_scripts_expr(Expression sub_script_expr){
        this.sub_script_expr = sub_script_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.sub_script_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.sub_script_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.sub_script_expr.equals(((Parameters_sub_scripts_expr) node).sub_script_expr);
    }
}

class Parameters_comma_fespace extends Node implements Expression {
    Expression parameters;
    String fespace;
    Parameters_comma_fespace(Expression parameters, String fespace){
        this.parameters = parameters;
        this.fespace = fespace;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.parameters.dump(printStream, map);
        printStream.print(", " + this.fespace);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.parameters.equals(((Parameters_comma_fespace) node).parameters) && this.fespace.equals(((Parameters_comma_fespace) node).fespace);
    }
}

class Parameters_comma_fespace1 extends Node implements Expression {
    Expression parameters;
    String fespace1;
    Parameters_comma_fespace1(Expression parameters, String fespace1){
        this.parameters = parameters;
        this.fespace1 = fespace1;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.parameters.dump(printStream, map);
        printStream.print(", " + this.fespace1);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.parameters.equals(((Parameters_comma_fespace1) node).parameters) && this.fespace1.equals(((Parameters_comma_fespace1) node).fespace1);
    }
}

class Parameters_comma_fespace3 extends Node implements Expression {
    Expression parameters;
    String fespace3;
    Parameters_comma_fespace3(Expression parameters, String fespace3){
        this.parameters = parameters;
        this.fespace3 = fespace3;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.parameters.dump(printStream, map);
        printStream.print(", " + this.fespace3);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.parameters.equals(((Parameters_comma_fespace3) node).parameters) && this.fespace3.equals(((Parameters_comma_fespace3) node).fespace3);
    }
}

class Parameters_comma_fespaceS extends Node implements Expression {
    Expression parameters;
    String fespaceS;
    Parameters_comma_fespaceS(Expression parameters, String fespaceS){
        this.parameters = parameters;
        this.fespaceS = fespaceS;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.parameters.dump(printStream, map);
        printStream.print(", " + this.fespaceS);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.parameters.equals(((Parameters_comma_fespaceS) node).parameters) && this.fespaceS.equals(((Parameters_comma_fespaceS) node).fespaceS);
    }
}

class Parameters_comma_fespaceL extends Node implements Expression {
    Expression parameters;
    String fespaceL;
    Parameters_comma_fespaceL(Expression parameters, String fespaceL){
        this.parameters = parameters;
        this.fespaceL = fespaceL;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.parameters.dump(printStream, map);
        printStream.print(", " + this.fespaceL);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.parameters.equals(((Parameters_comma_fespaceL) node).parameters) && this.fespaceL.equals(((Parameters_comma_fespaceL) node).fespaceL);
    }
}

class Parameters_comma_sub_script_expr extends Node implements Expression {
    Expression parameters;
    Expression sub_script_expr;
    Parameters_comma_sub_script_expr(Expression parameters, Expression sub_script_expr){
        this.parameters = parameters;
        this.sub_script_expr = sub_script_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.parameters.dump(printStream, map);
        printStream.print(", ");
        this.sub_script_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
        this.sub_script_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.parameters.equals(((Parameters_comma_sub_script_expr) node).parameters) && this.sub_script_expr.equals(((Parameters_comma_sub_script_expr) node).sub_script_expr);
    }
}

class Parameters_comma_id_equal_no_set_expr extends Node implements Expression {
    Expression parameters;
    Expression id;
    Expression no_set_expr;
    Parameters_comma_id_equal_no_set_expr(Expression parameters, Expression id, Expression no_set_expr){
        this.parameters = parameters;
        this.id = id;
        this.no_set_expr = no_set_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.parameters.dump(printStream, map);
        printStream.print(", ");
        this.id.dump(printStream, map);
        printStream.print(" = ");
        this.no_set_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters.collect(map);
        this.id.collect(map);
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.parameters.equals(((Parameters_comma_id_equal_no_set_expr) node).parameters) && this.id.equals(((Parameters_comma_id_equal_no_set_expr) node).id) && this.no_set_expr.equals(((Parameters_comma_id_equal_no_set_expr) node).no_set_expr);
    }
}

class Parameterstype extends Node implements Expression {
    Expression sub_script_expr;
    Expression parameters;
    Parameterstype(Expression sub_script_expr, Expression parameters){
        this.sub_script_expr = sub_script_expr;
        this.parameters = parameters;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.sub_script_expr.dump(printStream, map);
        printStream.print(", ");
        this.parameters.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.sub_script_expr.collect(map);
        this.parameters.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.sub_script_expr.equals(((Parameterstype) node).sub_script_expr) && this.parameters.equals(((Parameterstype) node).parameters);
    }
}

class Sub_script_expr_no_ternary_expr extends Node implements Expression {
    Expression no_ternary_expr;
    Sub_script_expr_no_ternary_expr(Expression no_ternary_expr){
        this.no_ternary_expr = no_ternary_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr.equals(((Sub_script_expr_no_ternary_expr) node).no_ternary_expr);
    }
}

class Sub_script_expr_colon extends Node implements Expression {
    Sub_script_expr_colon(){
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(" : ");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class Sub_script_expr_no_ternary_expr_colon_no_ternary_expr extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    Sub_script_expr_no_ternary_expr_colon_no_ternary_expr(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" : ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((Sub_script_expr_no_ternary_expr_colon_no_ternary_expr) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((Sub_script_expr_no_ternary_expr_colon_no_ternary_expr) node).no_ternary_expr2);
    }
}

class Sub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_expr extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2, no_ternary_expr3;
    Sub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_expr(Expression no_ternary_expr1, Expression no_ternary_expr2, Expression no_ternary_expr3){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
        this.no_ternary_expr3 = no_ternary_expr3;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" : ");
        this.no_ternary_expr2.dump(printStream, map);
        printStream.print(" : ");
        this.no_ternary_expr3.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
        this.no_ternary_expr3.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((Sub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_expr) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((Sub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_expr) node).no_ternary_expr2) && this.no_ternary_expr3.equals(((Sub_script_expr_no_ternary_expr_colon_no_ternary_expr_colon_no_ternary_expr) node).no_ternary_expr3);
    }
}

class No_ternary_expr_unary_expr extends Node implements Expression {
    Expression unary_expr;
    No_ternary_expr_unary_expr(Expression unary_expr){
        this.unary_expr = unary_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.unary_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.unary_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.unary_expr.equals(((No_ternary_expr_unary_expr) node).unary_expr);
    }
}

class No_ternary_expr_multiply extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_multiply(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" * ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_multiply) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_multiply) node).no_ternary_expr2);
    }
}

class No_ternary_expr_dotMultiply extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_dotMultiply(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" .* ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_dotMultiply) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_dotMultiply) node).no_ternary_expr2);
    }
}

class No_ternary_expr_dotDivide extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_dotDivide(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" ./ ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_dotDivide) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_dotDivide) node).no_ternary_expr2);
    }
}

class No_ternary_expr_divide extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_divide(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" / ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_divide) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_divide) node).no_ternary_expr2);
    }
}

class No_ternary_expr_modulus extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_modulus(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" % ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_modulus) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_modulus) node).no_ternary_expr2);
    }
}

class No_ternary_expr_plus extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_plus(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" + ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_plus) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_plus) node).no_ternary_expr2);
    }
}

class No_ternary_expr_minus extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_minus(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" - ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_minus) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_minus) node).no_ternary_expr2);
    }
}

class No_ternary_expr_out extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_out(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" << " );
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_out) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_out) node).no_ternary_expr2);
    }
}

class No_ternary_expr_in extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_in(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" >> ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_in) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_in) node).no_ternary_expr2);
    }
}

class No_ternary_expr_and extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_and(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" & ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_and) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_and) node).no_ternary_expr2);
    }
}

class No_ternary_expr_andand extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_andand(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" && ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_andand) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_andand) node).no_ternary_expr2);
    }
}

class No_ternary_expr_or extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_or(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" | ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_or) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_or) node).no_ternary_expr2);
    }
}

class No_ternary_expr_oror extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_oror(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" || ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_oror) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_oror) node).no_ternary_expr2);
    }
}

class No_ternary_expr_less extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_less(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" < ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_less) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_less) node).no_ternary_expr2);
    }
}

class No_ternary_expr_lessEqual extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_lessEqual(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" <= ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_lessEqual) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_lessEqual) node).no_ternary_expr2);
    }
}

class No_ternary_expr_greater extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_greater(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" > ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_greater) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_greater) node).no_ternary_expr2);
    }
}

class No_ternary_expr_greaterEqual extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_greaterEqual(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" >= ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_greaterEqual) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_greaterEqual) node).no_ternary_expr2);
    }
}

class No_ternary_expr_equal extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_equal(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" == ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_equal) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_equal) node).no_ternary_expr2);
    }
}

class No_ternary_expr_notEqual extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_ternary_expr_notEqual(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" != ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_ternary_expr_notEqual) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_ternary_expr_notEqual) node).no_ternary_expr2);
    }
}

class No_set_expr_no_ternary_expr extends Node implements Expression {
    Expression no_ternary_expr;
    No_set_expr_no_ternary_expr(Expression no_ternary_expr){
        this.no_ternary_expr = no_ternary_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr.equals(((No_set_expr_no_ternary_expr) node).no_ternary_expr);
    }
}

class No_set_expr_no_ternary_expr_if_no_ternary_expr extends Node implements Expression {
    Expression no_ternary_expr, no_ternary_expr1, no_ternary_expr2;
    No_set_expr_no_ternary_expr_if_no_ternary_expr(Expression no_ternary_expr, Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr = no_ternary_expr;
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr.dump(printStream, map);
        printStream.print(" ? ");
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" : ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr.collect(map);
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr.equals(((No_set_expr_no_ternary_expr_if_no_ternary_expr) node).no_ternary_expr) && this.no_ternary_expr1.equals(((No_set_expr_no_ternary_expr_if_no_ternary_expr) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_set_expr_no_ternary_expr_if_no_ternary_expr) node).no_ternary_expr2);
    }
}

class No_set_expr_no_ternary_expr_colon extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2;
    No_set_expr_no_ternary_expr_colon(Expression no_ternary_expr1, Expression no_ternary_expr2){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" : ");
        this.no_ternary_expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_set_expr_no_ternary_expr_colon) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_set_expr_no_ternary_expr_colon) node).no_ternary_expr2);
    }
}

class No_set_expr_no_ternary_expr_colon_no_ternary_expr extends Node implements Expression {
    Expression no_ternary_expr1, no_ternary_expr2, no_ternary_expr3;
    No_set_expr_no_ternary_expr_colon_no_ternary_expr(Expression no_ternary_expr1, Expression no_ternary_expr2, Expression no_ternary_expr3){
        this.no_ternary_expr1 = no_ternary_expr1;
        this.no_ternary_expr2 = no_ternary_expr2;
        this.no_ternary_expr3 = no_ternary_expr3;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_ternary_expr1.dump(printStream, map);
        printStream.print(" : ");
        this.no_ternary_expr2.dump(printStream, map);
        printStream.print(" : ");
        this.no_ternary_expr3.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_ternary_expr1.collect(map);
        this.no_ternary_expr2.collect(map);
        this.no_ternary_expr3.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_ternary_expr1.equals(((No_set_expr_no_ternary_expr_colon_no_ternary_expr) node).no_ternary_expr1) && this.no_ternary_expr2.equals(((No_set_expr_no_ternary_expr_colon_no_ternary_expr) node).no_ternary_expr2) && this.no_ternary_expr3.equals(((No_set_expr_no_ternary_expr_colon_no_ternary_expr) node).no_ternary_expr3);
    }
}

class No_comma_expr_no_set_expr extends Node implements Expression {
    Expression no_set_expr;
    No_comma_expr_no_set_expr(Expression no_set_expr){
        this.no_set_expr = no_set_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_set_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_set_expr.equals(((No_comma_expr_no_set_expr) node).no_set_expr);
    }
}

class No_comma_expr_equal extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_equal(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_set_expr.dump(printStream, map);
        printStream.print(" = ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_set_expr.equals(((No_comma_expr_equal) node).no_set_expr) && this.no_comma_expr.equals(((No_comma_expr_equal) node).no_comma_expr);
    }
}

class No_comma_expr_plusEqual extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_plusEqual(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_set_expr.dump(printStream, map);
        printStream.print(" += ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_set_expr.equals(((No_comma_expr_plusEqual) node).no_set_expr) && this.no_comma_expr.equals(((No_comma_expr_plusEqual) node).no_comma_expr);
    }
}

class No_comma_expr_minusEqual extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_minusEqual(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_set_expr.dump(printStream, map);
        printStream.print(" -= ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_set_expr.equals(((No_comma_expr_minusEqual) node).no_set_expr) && this.no_comma_expr.equals(((No_comma_expr_minusEqual) node).no_comma_expr);
    }
}

class No_comma_expr_multEqual extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_multEqual(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_set_expr.dump(printStream, map);
        printStream.print(" *= ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_set_expr.equals(((No_comma_expr_multEqual) node).no_set_expr) && this.no_comma_expr.equals(((No_comma_expr_multEqual) node).no_comma_expr);
    }
}

class No_comma_expr_divideEqual extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_divideEqual(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_set_expr.dump(printStream, map);
        printStream.print(" /= ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_set_expr.equals(((No_comma_expr_divideEqual) node).no_set_expr) && this.no_comma_expr.equals(((No_comma_expr_divideEqual) node).no_comma_expr);
    }
}

class No_comma_expr_dot_multEqual extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_dot_multEqual(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_set_expr.dump(printStream, map);
        printStream.print(" .*= ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_set_expr.equals(((No_comma_expr_dot_multEqual) node).no_set_expr) && this.no_comma_expr.equals(((No_comma_expr_dot_multEqual) node).no_comma_expr);
    }
}

class No_comma_expr_dot_divideEqual extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_dot_divideEqual(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_set_expr.dump(printStream, map);
        printStream.print(" ./= ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_set_expr.equals(((No_comma_expr_dot_divideEqual) node).no_set_expr) && this.no_comma_expr.equals(((No_comma_expr_dot_divideEqual) node).no_comma_expr);
    }
}

class Unop_minus extends Node implements Expression {
    String op;
    Unop_minus(String op){
        this.op = op;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.op);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.op.equals(((Unop_minus) node).op);
    }
}

class Unop_plus extends Node implements Expression {
    String op;
    Unop_plus(String op){
        this.op = op;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.op);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.op.equals(((Unop_plus) node).op);
    }
}

class Unop_not extends Node implements Expression {
    String op;
    Unop_not(String op){
        this.op = op;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.op);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.op.equals(((Unop_not) node).op);
    }
}

class Unop_increment extends Node implements Expression {
    String op;
    Unop_increment(String op){
        this.op = op;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.op);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.op.equals(((Unop_increment) node).op);
    }
}

class Unop_decrement extends Node implements Expression {
    String op;
    Unop_decrement(String op){
        this.op = op;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.op);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.op.equals(((Unop_decrement) node).op);
    }
}

class Expr_no_comma_expr extends Node implements Expression {
    Expression no_comma_expr;
    Expr_no_comma_expr(Expression no_comma_expr){
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_comma_expr.equals(((Expr_no_comma_expr) node).no_comma_expr);
    }
}

class Expr_comma extends Node implements Expression {
    Expression expr1, expr2;
    Expr_comma(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.expr1.dump(printStream, map);
        printStream.print(", ");
        this.expr2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.expr1.collect(map);
        this.expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.expr1.equals(((Expr_comma) node).expr1) && this.expr2.equals(((Expr_comma) node).expr2);
    }
}

class Border_expr extends Node implements Expression {
    Expression bornes;
    Expression instruction;
    Border_expr(Expression bornes, Expression instruction){
        this.bornes = bornes;
        this.instruction = instruction;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.bornes.dump(printStream, map);
        printStream.print(' ');
        this.instruction.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.bornes.collect(map);
        this.instruction.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.bornes.equals(((Border_expr) node).bornes) && this.instruction.equals(((Border_expr) node).instruction);
    }
}

class Bornes_id_expr_expr extends Node implements Expression {
    String id;
    Expression expr1, expr2;
    Bornes_id_expr_expr(String id, Expression expr1, Expression expr2){
        this.id = id;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print('(' + this.id + " = ");
        this.expr1.dump(printStream, map);
        printStream.print(", ");
        this.expr2.dump(printStream, map);
        printStream.print(')');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.expr1.collect(map);
        this.expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Bornes_id_expr_expr) node).id) && this.expr1.equals(((Bornes_id_expr_expr) node).expr1) && this.expr2.equals(((Bornes_id_expr_expr) node).expr2);
    }
}

class Bornes_id_expr_expr_id extends Node implements Expression {
    String id1, id2;
    Expression expr1, expr2;
    Bornes_id_expr_expr_id(String id1, Expression expr1, Expression expr2, String id2){
        this.id1 = id1;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.id2 = id2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print('(' + this.id1 + " = ");
        this.expr1.dump(printStream, map);
        printStream.print(", ");
        this.expr2.dump(printStream, map);
        printStream.print("; " + this.id2 + ')');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.expr1.collect(map);
        this.expr2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id1.equals(((Bornes_id_expr_expr_id) node).id1) && this.id2.equals(((Bornes_id_expr_expr_id) node).id2) && this.expr1.equals(((Bornes_id_expr_expr_id) node).expr1) && this.expr2.equals(((Bornes_id_expr_expr_id) node).expr2);
    }
}

class Catchs extends Node implements Expression {
    Expression instruction;
    Catchs(Expression instruction){
        this.instruction = instruction;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("catch(...) ");
        this.instruction.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.instruction.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.instruction.equals(((Catchs) node).instruction);
    }
}

class Instruction_ extends Node implements Expression {
    Instruction_(){
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.println(";");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class Instruction_include_string extends Node implements Expression {
    String string;
    Instruction_include_string(String string){
        this.string = string;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("include " + this.string);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.string.equals(((Instruction_include_string) node).string);
    }
}

class Instruction_load_string extends Node implements Expression {
    String string;
    Instruction_load_string(String string){
        this.string = string;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("load " + this.string);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.string.equals(((Instruction_load_string) node).string);
    }
}

class Instruction_try_instructions_catchs extends Node implements Expression {
    Expression Try1, instructions, catchs;
    Instruction_try_instructions_catchs(Expression Try1, Expression instructions, Expression catchs){
        this.Try1 = Try1;
        this.instructions = instructions;
        this.catchs = catchs;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.Try1.dump(printStream, map);
        printStream.println("{");
        this.instructions.dump(printStream, map);
        printStream.print("\n}");
        this.catchs.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.Try1.collect(map);
        this.instructions.collect(map);
        this.catchs.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.Try1.equals(((Instruction_try_instructions_catchs) node).Try1) && this.instructions.equals(((Instruction_try_instructions_catchs) node).instructions) && this.catchs.equals(((Instruction_try_instructions_catchs) node).catchs);
    }
}

class Instruction_expr extends Node implements Expression {
    Expression expr;
    Instruction_expr(Expression expr){
        this.expr = expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.expr.dump(printStream, map);
        //printStream.println(";");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.expr.equals(((Instruction_expr) node).expr);
    }
}

class Instruction_declaration extends Node implements Expression {
    Expression declaration;
    Instruction_declaration(Expression declaration){
        this.declaration = declaration;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.declaration.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.declaration.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.declaration.equals(((Instruction_declaration) node).declaration);
    }
}

class For_loop_idfor_primary_instruction extends Node implements Expression {
    Expression for_loop;
    Expression idfor, primary, instruction;
    For_loop_idfor_primary_instruction(Expression for_loop, Expression idfor, Expression primary, Expression instruction){
        this.for_loop = for_loop;
        this.idfor = idfor;
        this.primary = primary;
        this.instruction = instruction;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.for_loop.dump(printStream, map);
        printStream.print("[");
        this.idfor.dump(printStream, map);
        printStream.print(" : ");
        this.primary.dump(printStream, map);
        printStream.print("]");
        this.instruction.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.for_loop.collect(map);
        this.idfor.collect(map);
        this.primary.collect(map);
        this.instruction.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.for_loop.equals(((For_loop_idfor_primary_instruction) node).for_loop) && this.idfor.equals(((For_loop_idfor_primary_instruction) node).idfor) && this.primary.equals(((For_loop_idfor_primary_instruction) node).primary) && this.instruction.equals(((For_loop_idfor_primary_instruction) node).instruction);
    }
}

class Instruction_for_loop extends Node implements Expression {
    Expression for_loop;
    Expression expr1, expr2, expr3;
    Expression instruction;
    Instruction_for_loop(Expression for_loop, Expression expr1, Expression expr2, Expression expr3, Expression instruction){
        this.for_loop = for_loop;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.expr3 = expr3;
        this.instruction = instruction;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.for_loop.dump(printStream, map);
        printStream.print('(');
        this.expr1.dump(printStream, map);
        printStream.print("; ");
        this.expr2.dump(printStream, map);
        printStream.print("; ");
        this.expr3.dump(printStream, map);
        printStream.print(')');
        this.instruction.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.for_loop.collect(map);
        this.expr1.collect(map);
        this.expr2.collect(map);
        this.expr3.collect(map);
        this.instruction.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.for_loop.equals(((Instruction_for_loop) node).for_loop) && this.expr1.equals(((Instruction_for_loop) node).expr1) && this.expr2.equals(((Instruction_for_loop) node).expr2) && this.expr3.equals(((Instruction_for_loop) node).expr3) && this.instruction.equals(((Instruction_for_loop) node).instruction);
    }
}

class Instruction_declaration_for_expr_expr_instruction extends Node implements Expression {
    Expression for_loop;
    Expression declaration_for, expr2, expr3;
    Expression instruction;
    Instruction_declaration_for_expr_expr_instruction(Expression for_loop, Expression declaration_for, Expression expr2, Expression expr3, Expression instruction){
        this.for_loop = for_loop;
        this.declaration_for = declaration_for;
        this.expr2 = expr2;
        this.expr3 = expr3;
        this.instruction = instruction;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.for_loop.dump(printStream, map);
        printStream.print('(');
        this.declaration_for.dump(printStream, map);
        printStream.print("; ");
        this.expr2.dump(printStream, map);
        printStream.print("; ");
        this.expr3.dump(printStream, map);
        printStream.print(')');
        this.instruction.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.for_loop.collect(map);
        this.declaration_for.collect(map);
        this.expr2.collect(map);
        this.expr3.collect(map);
        this.instruction.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.for_loop.equals(((Instruction_declaration_for_expr_expr_instruction) node).for_loop) && this.declaration_for.equals(((Instruction_declaration_for_expr_expr_instruction) node).declaration_for) && this.expr2.equals(((Instruction_declaration_for_expr_expr_instruction) node).expr2) && this.expr3.equals(((Instruction_declaration_for_expr_expr_instruction) node).expr3) && this.instruction.equals(((Instruction_declaration_for_expr_expr_instruction) node).instruction);
    }
}

class Instruction_while_loop extends Node implements Expression {
    Expression while_loop;
    Expression expr;
    Expression instruction;
    Instruction_while_loop(Expression while_loop, Expression expr, Expression instruction){
        this.while_loop = while_loop;
        this.expr = expr;
        this.instruction = instruction;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.while_loop.dump(printStream, map);
        printStream.print('(');
        this.expr.dump(printStream, map);
        printStream.print(')');
        this.instruction.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.while_loop.collect(map);
        this.expr.collect(map);
        this.instruction.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.while_loop.equals(((Instruction_while_loop) node).while_loop) && this.expr.equals(((Instruction_while_loop) node).expr) && this.instruction.equals(((Instruction_while_loop) node).instruction);
    }
}

class Instruction_if extends Node implements Expression {
    Expression expr;
    Expression instruction;
    Instruction_if(Expression expr, Expression instruction){
        this.expr = expr;
        this.instruction = instruction;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("if(");
        this.expr.dump(printStream, map);
        printStream.print(')');
        this.instruction.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.expr.collect(map);
        this.instruction.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.expr.equals(((Instruction_if) node).expr) && this.instruction.equals(((Instruction_if) node).instruction);
    }
}

class Instruction_if_else extends Node implements Expression {
    Expression expr;
    Expression instruction1, instruction2;
    Instruction_if_else(Expression expr, Expression instruction1, Expression instruction2){
        this.expr = expr;
        this.instruction1 = instruction1;
        this.instruction2 = instruction2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("if(");
        this.expr.dump(printStream, map);
        printStream.print(')');
        this.instruction1.dump(printStream, map);
        printStream.print(" else ");
        this.instruction2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.expr.collect(map);
        this.instruction1.collect(map);
        this.instruction2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.expr.equals(((Instruction_if_else) node).expr) && this.instruction1.equals(((Instruction_if_else) node).instruction1) && this.instruction2.equals(((Instruction_if_else) node).instruction2);
    }
}

class Instruction_begin_end extends Node implements Expression {
    Expression begin, end;
    Expression instruction;
    Instruction_begin_end(Expression begin, Expression instruction, Expression end){
        this.begin = begin;
        this.instruction = instruction;
        this.end = end;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.begin.dump(printStream, map);
        printStream.println();
        this.instruction.dump(printStream, map);
        printStream.println();
        this.end.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.begin.collect(map);
        this.end.collect(map);
        this.instruction.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.begin.equals(((Instruction_begin_end) node).begin) && this.instruction.equals(((Instruction_begin_end) node).instruction) && this.end.equals(((Instruction_begin_end) node).end);
    }
}

class Instruction_border_id_border_expr extends Node implements Expression {
    String id;
    Expression border_expr;
    Instruction_border_id_border_expr(String id, Expression border_expr){
        this.id = id;
        this.border_expr = border_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("border " + this.id);
        this.border_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.border_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Instruction_border_id_border_expr) node).id) && this.border_expr.equals(((Instruction_border_id_border_expr) node).border_expr);
    }
}

class Instruction_border_id_array extends Node implements Expression {
    String id;
    Expression array;
    Instruction_border_id_array(String id, Expression array){
        this.id = id;
        this.array = array;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("border " + this.id + '[');
        this.array.dump(printStream, map);
        printStream.print(']');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.array.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Instruction_border_id_array) node).id) && this.array.equals(((Instruction_border_id_array) node).array);
    }
}

class Instruction_break extends Node implements Expression {
    Instruction_break(){
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.println("break; ");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class Instruction_continue extends Node implements Expression {
    Instruction_continue(){
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.println("continue; ");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class Instruction_return extends Node implements Expression {
    Expression expr;
    Instruction_return(Expression expr){
        this.expr = expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("return ");
        this.expr.dump(printStream, map);
        printStream.println(";");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.expr.equals(((Instruction_return) node).expr);
    }
}

class Idfor_id extends Node implements Expression {
    Expression id;
    Idfor_id(Expression id){
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Idfor_id) node).id);
    }
}

class Idfor_comma_id extends Node implements Expression {
    Expression id1, id2;
    Idfor_comma_id(Expression id1, Expression id2){
        this.id1 = id1;
        this.id2 = id2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.id1.dump(printStream, map);
        printStream.print(", ");
        this.id2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id1.collect(map);
        this.id2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id1.equals(((Idfor_comma_id) node).id1) && this.id2.equals(((Idfor_comma_id) node).id2);
    }
}

class Idfor_comma_id_comma_id extends Node implements Expression {
    Expression id1, id2, id3;
    Idfor_comma_id_comma_id(Expression id1, Expression id2, Expression id3){
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.id1.dump(printStream, map);
        printStream.print(", ");
        this.id2.dump(printStream, map);
        printStream.print(", ");
        this.id3.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id1.collect(map);
        this.id2.collect(map);
        this.id3.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id1.equals(((Idfor_comma_id_comma_id) node).id1) && this.id2.equals(((Idfor_comma_id_comma_id) node).id2) && this.id3.equals(((Idfor_comma_id_comma_id) node).id3);
    }
}

class Try extends Node implements Expression {
    Try(){
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("try");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class Declaration_for extends Node implements Expression {
    Expression type_of_dcl, list_of_dcls;
    Declaration_for(Expression type_of_dcl, Expression list_of_dcls){
        this.type_of_dcl = type_of_dcl;
        this.list_of_dcls = list_of_dcls;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.type_of_dcl.dump(printStream, map);
        printStream.print(" ");
        this.list_of_dcls.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.type_of_dcl.collect(map);
        this.list_of_dcls.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.type_of_dcl.equals(((Declaration_for) node).type_of_dcl) && this.list_of_dcls.equals(((Declaration_for) node).list_of_dcls);
    }
}

class For_loop extends Node implements Expression {
    For_loop(){
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("for");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class While_loop extends Node implements Expression {
    While_loop(){
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("while");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class Begin extends Node implements Expression {
    Begin(){
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("{");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class End extends Node implements Expression {
    End(){
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("}");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class Declaration_type_of_dcl_list_of_dcls extends Node implements Expression {
    Expression type_of_dcl;
    Expression list_of_dcls;
    Declaration_type_of_dcl_list_of_dcls(Expression type_of_dcl, Expression list_of_dcls){
        this.type_of_dcl = type_of_dcl;
        this.list_of_dcls = list_of_dcls;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.type_of_dcl.dump(printStream, map);
        printStream.print(' ');
        this.list_of_dcls.dump(printStream, map);
        printStream.println(";");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.type_of_dcl.collect(map);
        this.list_of_dcls.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.type_of_dcl.equals(((Declaration_type_of_dcl_list_of_dcls) node).type_of_dcl) && this.list_of_dcls.equals(((Declaration_type_of_dcl_list_of_dcls) node).list_of_dcls);
    }
}

class Declaration_fespace_def_list extends Node implements Expression {
    String fespace;
    Expression fespace_def_list;
    Declaration_fespace_def_list(String fespace, Expression fespace_def_list){
        this.fespace = fespace;
        this.fespace_def_list = fespace_def_list;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace + ' ');
        this.fespace_def_list.dump(printStream, map);
        printStream.println(";");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.fespace_def_list.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((Declaration_fespace_def_list) node).fespace) && this.fespace_def_list.equals(((Declaration_fespace_def_list) node).fespace_def_list);
    }
}

class Declaration_spaceIDs extends Node implements Expression {
    Expression spaceIDs;
    Declaration_spaceIDs(Expression spaceIDs){
        this.spaceIDs = spaceIDs;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.spaceIDs.dump(printStream, map);
        printStream.println(";");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.spaceIDs.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.spaceIDs.equals(((Declaration_spaceIDs) node).spaceIDs);
    }
}

class Declaration_function_id_expr extends Node implements Expression {
    String function, id;
    Expression expr;
    Declaration_function_id_expr(String function, String id, Expression expr){
        this.function = function;
        this.id = id;
        this.expr = expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.function + ' ' + this.id + " = ");
        this.expr.dump(printStream, map);
        printStream.println(";");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.function.equals(((Declaration_function_id_expr) node).function) && this.id.equals(((Declaration_function_id_expr) node).id) && this.expr.equals(((Declaration_function_id_expr) node).expr);
    }
}

class Declaration_function_type_of_dcl_id extends Node implements Expression {
    String function, id;
    Expression type_of_dcl, list_of_id_args, instructions;
    Declaration_function_type_of_dcl_id(String function, Expression type_of_dcl, String id, Expression list_of_id_args, Expression instructions){
        this.function = function;
        this.type_of_dcl= type_of_dcl;
        this.id = id;
        this.list_of_id_args = list_of_id_args;
        this.instructions = instructions;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.function + ' ');
        this.type_of_dcl.dump(printStream, map);
        printStream.print(' ' + this.id + '(');
        this.list_of_id_args.dump(printStream, map);
        printStream.println(") {");
        this.instructions.dump(printStream, map);
        printStream.println('}');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.type_of_dcl.collect(map);
        this.list_of_id_args.collect(map);
        this.instructions.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.function.equals(((Declaration_function_type_of_dcl_id) node).function) && this.type_of_dcl.equals(((Declaration_function_type_of_dcl_id) node).type_of_dcl) && this.id.equals(((Declaration_function_type_of_dcl_id) node).id) && this.list_of_id_args.equals(((Declaration_function_type_of_dcl_id) node).list_of_id_args) && this.instructions.equals(((Declaration_function_type_of_dcl_id) node).instructions);
    }
}

class Function_id_list_of_id_args extends Node implements Expression {
    String function, id;
    Expression list_of_id_args, no_comma_expr;
    Function_id_list_of_id_args(String function, String id, Expression list_of_id_args, Expression no_comma_expr) {
        this.function = function;
        this.id = id;
        this.list_of_id_args = list_of_id_args;
        this.no_comma_expr = no_comma_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.function + ' ' + this.id + '(');
        this.list_of_id_args.dump(printStream, map);
        printStream.print(") = ");
        this.no_comma_expr.dump(printStream, map);
        printStream.println(';');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.function.equals(((Function_id_list_of_id_args) node).function) && this.id.equals(((Function_id_list_of_id_args) node).id) && this.list_of_id_args.equals(((Function_id_list_of_id_args) node).list_of_id_args) && this.no_comma_expr.equals(((Function_id_list_of_id_args) node).no_comma_expr);
    }
}

class Fespace_def_list_fespace_def extends Node implements Expression {
    Expression fespace_def;
    Fespace_def_list_fespace_def(Expression fespace_def) {
        this.fespace_def = fespace_def;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.fespace_def.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.fespace_def.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace_def.equals(((Fespace_def_list_fespace_def) node).fespace_def);
    }
}

class Fespace_def_list_comma_fespace_def extends Node implements Expression {
    Expression fespace_def_list, fespace_def;
    Fespace_def_list_comma_fespace_def(Expression fespace_def_list, Expression fespace_def) {
        this.fespace_def_list = fespace_def_list;
        this.fespace_def = fespace_def;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.fespace_def_list.dump(printStream, map);
        printStream.print(", ");
        this.fespace_def.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.fespace_def_list.collect(map);
        this.fespace_def.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace_def_list.equals(((Fespace_def_list_comma_fespace_def) node).fespace_def_list) && this.fespace_def.equals(((Fespace_def_list_comma_fespace_def) node).fespace_def);
    }
}

class Fespace_def extends Node implements Expression {
    String id;
    Expression parameters_list;
    Fespace_def(String id, Expression parameters_list) {
        this.id = id;
        this.parameters_list = parameters_list;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id + "(");
        this.parameters_list.dump(printStream, map);
        printStream.print(")");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters_list.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Fespace_def) node).id) && this.parameters_list.equals(((Fespace_def) node).parameters_list);
    }
}

class SpaceIDs_fespace_spaceIDb extends Node implements Expression {
    Expression fespace, spaceIDb;
    SpaceIDs_fespace_spaceIDb(Expression fespace, Expression spaceIDb) {
        this.fespace = fespace;
        this.spaceIDb = spaceIDb;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.fespace.dump(printStream, map);
        printStream.print(" ");
        this.spaceIDb.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.fespace.collect(map);
        this.spaceIDb.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((SpaceIDs_fespace_spaceIDb) node).fespace) && this.spaceIDb.equals(((SpaceIDs_fespace_spaceIDb) node).spaceIDb);
    }
}

class SpaceIDs_fespace_array_ID_spaceIDa extends Node implements Expression {
    Expression fespace, spaceIDa;
    String id;
    SpaceIDs_fespace_array_ID_spaceIDa(Expression fespace, String id, Expression spaceIDa) {
        this.fespace = fespace;
        this.id = id;
        this.spaceIDa = spaceIDa;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.fespace.dump(printStream, map);
        printStream.print(" [" + this.id + "] ");
        this.spaceIDa.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.fespace.collect(map);
        this.spaceIDa.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((SpaceIDs_fespace_array_ID_spaceIDa) node).fespace) && this.id.equals(((SpaceIDs_fespace_array_ID_spaceIDa) node).id) && this.spaceIDa.equals(((SpaceIDs_fespace_array_ID_spaceIDa) node).spaceIDa);
    }
}

class SpaceIDb_id_space extends Node implements Expression {
    Expression id_space;
    SpaceIDb_id_space(Expression id_space) {
        this.id_space = id_space;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.id_space.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id_space.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id_space.equals(((SpaceIDb_id_space) node).id_space);
    }
}

class SpaceIDb_comma_id_space extends Node implements Expression {
    Expression spaceIDb, id_space;
    SpaceIDb_comma_id_space(Expression spaceIDb, Expression id_space) {
        this.spaceIDb = spaceIDb;
        this.id_space = id_space;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.spaceIDb.dump(printStream, map);
        printStream.print(", ");
        this.id_space.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.spaceIDb.collect(map);
        this.id_space.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.spaceIDb.equals(((SpaceIDb_comma_id_space) node).spaceIDb) && this.id_space.equals(((SpaceIDb_comma_id_space) node).id_space);
    }
}

class SpaceIDa_id_array_space extends Node implements Expression {
    Expression id_array_space;
    SpaceIDa_id_array_space(Expression id_array_space) {
        this.id_array_space = id_array_space;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.id_array_space.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id_array_space.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id_array_space.equals(((SpaceIDa_id_array_space) node).id_array_space);
    }
}

class SpaceIDa_comma_id_array_space extends Node implements Expression {
    Expression spaceIDa, id_array_space;
    SpaceIDa_comma_id_array_space(Expression spaceIDa, Expression id_array_space) {
        this.spaceIDa = spaceIDa;
        this.id_array_space = id_array_space;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.spaceIDa.dump(printStream, map);
        printStream.print(", ");
        this.id_array_space.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.spaceIDa.collect(map);
        this.id_array_space.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.spaceIDa.equals(((SpaceIDa_comma_id_array_space) node).spaceIDa) && this.id_array_space.equals(((SpaceIDa_comma_id_array_space) node).id_array_space);
    }
}

class Fespace123_fespace extends Node implements Expression {
    String fespace;
    Fespace123_fespace(String fespace){
        this.fespace = fespace;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((Fespace123_fespace) node).fespace);
    }
}

class Fespace123_fespace1 extends Node implements Expression {
    String fespace1;
    Fespace123_fespace1(String fespace1){
        this.fespace1 = fespace1;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace1);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace1.equals(((Fespace123_fespace1) node).fespace1);
    }
}

class Fespace123_fespace3 extends Node implements Expression {
    String fespace3;
    Fespace123_fespace3(String fespace3){
        this.fespace3 = fespace3;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace3);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace3.equals(((Fespace123_fespace3) node).fespace3);
    }
}

class Fespace123_fespaceS extends Node implements Expression {
    String fespaceS;
    Fespace123_fespaceS(String fespaceS){
        this.fespaceS = fespaceS;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceS);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceS.equals(((Fespace123_fespaceS) node).fespaceS);
    }
}

class Fespace123_fespaceL extends Node implements Expression {
    String fespaceL;
    Fespace123_fespaceL(String fespaceL){
        this.fespaceL = fespaceL;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceL);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceL.equals(((Fespace123_fespaceL) node).fespaceL);
    }
}

class Fespace_fespace123 extends Node implements Expression {
    Expression fespace123;
    Fespace_fespace123(Expression fespace123){
        this.fespace123 = fespace123;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.fespace123.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.fespace123.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace123.equals(((Fespace_fespace123) node).fespace123);
    }
}

class Fespace_fespace123_vector extends Node implements Expression {
    Expression fespace123;
    String id;
    Fespace_fespace123_vector(Expression fespace123, String id){
        this.fespace123 = fespace123;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.fespace123.dump(printStream, map);
        printStream.print(" <" + this.id + '>');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.fespace123.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace123.equals(((Fespace_fespace123_vector) node).fespace123) && this.id.equals(((Fespace_fespace123_vector) node).id);
    }
}

class Id_array_space_id_no_set_expr extends Node implements Expression {
    String id;
    Expression no_set_expr;
    Id_array_space_id_no_set_expr(String id, Expression no_set_expr) {
        this.id = id;
        this.no_set_expr = no_set_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id + "(");
        this.no_set_expr.dump(printStream, map);
        printStream.print(")");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Id_array_space_id_no_set_expr) node).id) && this.no_set_expr.equals(((Id_array_space_id_no_set_expr) node).no_set_expr);
    }
}

class Id_array_space_array_list_of_id1_no_set_expr extends Node implements Expression {
    Expression list_of_id1, no_set_expr;
    Id_array_space_array_list_of_id1_no_set_expr(Expression list_of_id1, Expression no_set_expr) {
        this.list_of_id1 = list_of_id1;
        this.no_set_expr = no_set_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("[");
        this.list_of_id1.dump(printStream, map);
        printStream.print("](");
        this.no_set_expr.dump(printStream, map);
        printStream.print(")");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id1.collect(map);
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return  this.list_of_id1.equals(((Id_array_space_array_list_of_id1_no_set_expr) node).list_of_id1) &&  this.no_set_expr.equals(((Id_array_space_array_list_of_id1_no_set_expr) node).no_set_expr);
    }
}

class Id_space_id extends Node implements Expression {
    String id;
    Id_space_id(String id) {
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Id_space_id) node).id);
    }
}

class Id_space_array_no_set_expr extends Node implements Expression {
    String id;
    Expression no_set_expr;
    Id_space_array_no_set_expr(String id, Expression no_set_expr) {
        this.id = id;
        this.no_set_expr = no_set_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id + "[");
        this.no_set_expr.dump(printStream, map);
        printStream.print("]");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Id_space_array_no_set_expr) node).id) && this.no_set_expr.equals(((Id_space_array_no_set_expr) node).no_set_expr);
    }
}

class Id_space_no_set_expr extends Node implements Expression {
    String id;
    Expression no_set_expr;
    Id_space_no_set_expr(String id, Expression no_set_expr) {
        this.id = id;
        this.no_set_expr = no_set_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id + " = ");
        this.no_set_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Id_space_no_set_expr) node).id) && this.no_set_expr.equals(((Id_space_no_set_expr) node).no_set_expr);
    }
}

class Id_space_array_list_of_id1 extends Node implements Expression {
    Expression list_of_id1;
    Id_space_array_list_of_id1(Expression list_of_id1) {
        this.list_of_id1 = list_of_id1;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("[");
        this.list_of_id1.dump(printStream, map);
        printStream.print("]");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id1.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id1.equals(((Id_space_array_list_of_id1) node).list_of_id1);
    }
}

class Id_space_array_list_of_id1_array_no_set_expr extends Node implements Expression {
    Expression list_of_id1, no_set_expr;
    Id_space_array_list_of_id1_array_no_set_expr(Expression list_of_id1, Expression no_set_expr) {
        this.list_of_id1 = list_of_id1;
        this.no_set_expr = no_set_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("[");
        this.list_of_id1.dump(printStream, map);
        printStream.print("] [");
        this.no_set_expr.dump(printStream, map);
        printStream.print("]");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id1.collect(map);
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id1.equals(((Id_space_array_list_of_id1_array_no_set_expr) node).list_of_id1) && this.no_set_expr.equals(((Id_space_array_list_of_id1_array_no_set_expr) node).no_set_expr);
    }
}

class Id_space_array_list_of_id1_no_set_expr extends Node implements Expression {
    Expression list_of_id1, no_set_expr;
    Id_space_array_list_of_id1_no_set_expr(Expression list_of_id1, Expression no_set_expr) {
        this.list_of_id1 = list_of_id1;
        this.no_set_expr = no_set_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("[");
        this.list_of_id1.dump(printStream, map);
        printStream.print("] = ");
        this.no_set_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id1.collect(map);
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id1.equals(((Id_space_array_list_of_id1_no_set_expr) node).list_of_id1) && this.no_set_expr.equals(((Id_space_array_list_of_id1_no_set_expr) node).no_set_expr);
    }
}


class Type_of_dcl_id extends Node implements Expression {
    String id;
    Type_of_dcl_id(String id) {
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Type_of_dcl_id) node).id);
    }
}

class Type_of_dcl_id_array extends Node implements Expression {
    String id1, id2;
    Type_of_dcl_id_array(String id1 ,String id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id1 + '[' + this.id2 + ']');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id1.equals(((Type_of_dcl_id_array) node).id1) && this.id2.equals(((Type_of_dcl_id_array) node).id2);
    }
}

class Type_of_dcl_id_array_array extends Node implements Expression {
    String id1, id2, id3;
    Type_of_dcl_id_array_array(String id1 ,String id2, String id3) {
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id1 + '[' + this.id2 + "] [" + this.id3 + ']');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id1.equals(((Type_of_dcl_id_array_array) node).id1) && this.id2.equals(((Type_of_dcl_id_array_array) node).id2) && this.id3.equals(((Type_of_dcl_id_array_array) node).id3);
    }
}

class Type_of_dcl_id_matrix extends Node implements Expression {
    String id1, id2, id3;
    Type_of_dcl_id_matrix(String id1 ,String id2, String id3) {
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id1 + '[' + this.id2 + ", " + this.id3 + ']');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id1.equals(((Type_of_dcl_id_matrix) node).id1) && this.id2.equals(((Type_of_dcl_id_matrix) node).id2) && this.id3.equals(((Type_of_dcl_id_matrix) node).id3);
    }
}

class Type_of_dcl_id_matrix_array extends Node implements Expression {
    String id1, id2, id3, id4;
    Type_of_dcl_id_matrix_array(String id1 ,String id2, String id3, String id4) {
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
        this.id4 = id4;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id1 + '[' + this.id2 + ", " + this.id3 + "] [" + this.id4 + ']');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id1.equals(((Type_of_dcl_id_matrix_array) node).id1) && this.id2.equals(((Type_of_dcl_id_matrix_array) node).id2) && this.id3.equals(((Type_of_dcl_id_matrix_array) node).id3) && this.id4.equals(((Type_of_dcl_id_matrix_array) node).id4);
    }
}

class Type_of_dcl_id_vector extends Node implements Expression {
    String id1, id2;
    Type_of_dcl_id_vector(String id1 ,String id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id1 + '<' + this.id2 + '>');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id1.equals(((Type_of_dcl_id_vector) node).id1) && this.id2.equals(((Type_of_dcl_id_vector) node).id2);
    }
}

class Type_of_dcl_id_vector_array extends Node implements Expression {
    String id1, id2, id3;
    Type_of_dcl_id_vector_array(String id1 ,String id2, String id3) {
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id1 + '<' + this.id2 + "> [" + this.id3 + ']');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id1.equals(((Type_of_dcl_id_vector_array) node).id1) && this.id2.equals(((Type_of_dcl_id_vector_array) node).id2) && this.id3.equals(((Type_of_dcl_id_vector_array) node).id3);
    }
}

class Type_of_dcl_id_vector_matrix extends Node implements Expression {
    String id1, id2, id3, id4;
    Type_of_dcl_id_vector_matrix(String id1 ,String id2, String id3, String id4) {
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
        this.id4 = id4;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id1  + '<' + this.id2 + "> [" + this.id3 + ", " + this.id4 + ']');
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id1.equals(((Type_of_dcl_id_vector_matrix) node).id1) && this.id2.equals(((Type_of_dcl_id_vector_matrix) node).id2) && this.id3.equals(((Type_of_dcl_id_vector_matrix) node).id3) && this.id4.equals(((Type_of_dcl_id_vector_matrix) node).id4);
    }
}

class Parameters_list_no_set_expr extends Node implements Expression {
    Expression no_set_expr;
    Parameters_list_no_set_expr(Expression no_set_expr) {
        this.no_set_expr = no_set_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.no_set_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.no_set_expr.equals(((Parameters_list_no_set_expr) node).no_set_expr);
    }
}

class Parameters_list_fespace_id extends Node implements Expression {
    String fespace, id;
    Parameters_list_fespace_id(String fespace, String id) {
        this.fespace = fespace;
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace + ' ' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((Parameters_list_fespace_id) node).fespace) && this.id.equals(((Parameters_list_fespace_id) node).id);
    }
}

class Parameters_list_fespace1_id extends Node implements Expression {
    String fespace1, id;
    Parameters_list_fespace1_id(String fespace1, String id) {
        this.fespace1 = fespace1;
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace1 + ' ' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace1.equals(((Parameters_list_fespace1_id) node).fespace1) && this.id.equals(((Parameters_list_fespace1_id) node).id);
    }
}

class Parameters_list_fespace3_id extends Node implements Expression {
    String fespace3, id;
    Parameters_list_fespace3_id(String fespace3, String id) {
        this.fespace3 = fespace3;
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace3 + ' ' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace3.equals(((Parameters_list_fespace3_id) node).fespace3) && this.id.equals(((Parameters_list_fespace3_id) node).id);
    }
}

class Parameters_list_fespaceS_id extends Node implements Expression {
    String fespaceS, id;
    Parameters_list_fespaceS_id(String fespaceS, String id) {
        this.fespaceS = fespaceS;
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceS + ' ' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceS.equals(((Parameters_list_fespaceS_id) node).fespaceS) && this.id.equals(((Parameters_list_fespaceS_id) node).id);
    }
}

class Parameters_list_fespaceL_id extends Node implements Expression {
    String fespaceL, id;
    Parameters_list_fespaceL_id(String fespaceL, String id) {
        this.fespaceL = fespaceL;
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceL + ' ' + this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceL.equals(((Parameters_list_fespaceL_id) node).fespaceL) && this.id.equals(((Parameters_list_fespaceL_id) node).id);
    }
}

class Parameters_list_id_no_set_expr extends Node implements Expression {
    String id;
    Expression no_set_expr;
    Parameters_list_id_no_set_expr(String id, Expression no_set_expr) {
        this.id = id;
        this.no_set_expr = no_set_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id + " = ");
        this.no_set_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Parameters_list_id_no_set_expr) node).id) && this.no_set_expr.equals(((Parameters_list_id_no_set_expr) node).no_set_expr);
    }
}

class Parameters_list_comma_no_set_expr extends Node implements Expression {
    Expression parameters_list, no_set_expr;
    Parameters_list_comma_no_set_expr(Expression parameters_list, Expression no_set_expr) {
        this.parameters_list = parameters_list;
        this.no_set_expr = no_set_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.parameters_list.dump(printStream, map);
        printStream.print(", ");
        this.no_set_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters_list.collect(map);
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.parameters_list.equals(((Parameters_list_comma_no_set_expr) node).parameters_list) && this.no_set_expr.equals(((Parameters_list_comma_no_set_expr) node).no_set_expr);
    }
}

class Parameters_list_comma_id_no_set_expr extends Node implements Expression {
    Expression parameters_list, id, no_set_expr;
    Parameters_list_comma_id_no_set_expr(Expression parameters_list, Expression id, Expression no_set_expr) {
        this.parameters_list = parameters_list;
        this.id = id;
        this.no_set_expr = no_set_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.parameters_list.dump(printStream, map);
        printStream.print(", ");
        this.id.dump(printStream, map);
        printStream.print(" = ");
        this.no_set_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters_list.collect(map);
        this.id.collect(map);
        this.no_set_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.parameters_list.equals(((Parameters_list_comma_id_no_set_expr) node).parameters_list) && this.id.equals(((Parameters_list_comma_id_no_set_expr) node).id) && this.no_set_expr.equals(((Parameters_list_comma_id_no_set_expr) node).no_set_expr);
    }
}

class List_of_dcls_id extends Node implements Expression {
    String id;
    List_of_dcls_id(String id) {
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((List_of_dcls_id) node).id);
    }
}


class List_of_dcls_id_no_comma_expr extends Node implements Expression {
    String id;
    Expression no_comma_expr;
    List_of_dcls_id_no_comma_expr(String id, Expression no_comma_expr) {
        this.id = id;
        this.no_comma_expr = no_comma_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id + " = ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((List_of_dcls_id_no_comma_expr) node).id) && this.no_comma_expr.equals(((List_of_dcls_id_no_comma_expr) node).no_comma_expr);
    }
}

class List_of_dcls_id_parameters_list extends Node implements Expression {
    String id;
    Expression parameters_list;
    List_of_dcls_id_parameters_list(String id, Expression parameters_list) {
        this.id = id;
        this.parameters_list = parameters_list;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id + "(");
        this.parameters_list.dump(printStream, map);
        printStream.print(")");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.parameters_list.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((List_of_dcls_id_parameters_list) node).id) && this.parameters_list.equals(((List_of_dcls_id_parameters_list) node).parameters_list);
    }
}

class List_of_dcls_comma extends Node implements Expression {
    Expression list_of_dcls1, list_of_dcls2;
    List_of_dcls_comma(Expression list_of_dcls1, Expression list_of_dcls2) {
        this.list_of_dcls1 = list_of_dcls1;
        this.list_of_dcls2 = list_of_dcls2;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_dcls1.dump(printStream, map);
        printStream.print(", ");
        this.list_of_dcls2.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_dcls1.collect(map);
        this.list_of_dcls2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_dcls1.equals(((List_of_dcls_comma) node).list_of_dcls1) && this.list_of_dcls2.equals(((List_of_dcls_comma) node).list_of_dcls2);
    }
}

class Id_id extends Node implements Expression {
    String id;
    Id_id(String id) {
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.id);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Id_id) node).id);
    }
}

class Id_fespace extends Node implements Expression {
    String fespace;
    Id_fespace(String fespace) {
        this.fespace = fespace;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((Id_fespace) node).fespace);
    }
}

class Id_fespace3 extends Node implements Expression {
    String fespace3;
    Id_fespace3(String fespace3) {
        this.fespace3 = fespace3;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace3);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace3.equals(((Id_fespace3) node).fespace3);
    }
}

class Id_fespaceS extends Node implements Expression {
    String fespaceS;
    Id_fespaceS(String fespaceS) {
        this.fespaceS = fespaceS;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceS);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceS.equals(((Id_fespaceS) node).fespaceS);
    }
}

class Id_fespaceL extends Node implements Expression {
    String fespaceL;
    Id_fespaceL(String fespaceL) {
        this.fespaceL = fespaceL;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceL);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceL.equals(((Id_fespaceL) node).fespaceL);
    }
}

class Id_fespace1 extends Node implements Expression {
    String fespace1;
    Id_fespace1(String fespace1) {
        this.fespace1 = fespace1;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace1);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace1.equals(((Id_fespace1) node).fespace1);
    }
}

class List_of_id1_id extends Node implements Expression {
    Expression id;
    List_of_id1_id(Expression id) {
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((List_of_id1_id) node).id);
    }
}


class List_of_id1_comma_id extends Node implements Expression {
    Expression list_of_id1, id;
    List_of_id1_comma_id(Expression list_of_id1, Expression id) {
        this.list_of_id1 = list_of_id1;
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id1.dump(printStream, map);
        printStream.print(", ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id1.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id1.equals(((List_of_id1_comma_id) node).list_of_id1) && this.id.equals(((List_of_id1_comma_id) node).id);
    }
}

class List_of_id_args_ extends Node implements Expression {
    List_of_id_args_() {}
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return true;
    }
}

class List_of_id_args_id extends Node implements Expression {
    Expression id;
    List_of_id_args_id(Expression id) {
        this.id = id;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((List_of_id_args_id) node).id);
    }
}

class List_of_id_args_set_no_comma_expr_to_id extends Node implements Expression {
    Expression id, no_comma_expr;
    List_of_id_args_set_no_comma_expr_to_id(Expression id, Expression no_comma_expr) {
        this.id = id;
        this.no_comma_expr = no_comma_expr;
    }

    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.id.dump(printStream, map);
        printStream.print(" = ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((List_of_id_args_set_no_comma_expr_to_id) node).id) && this.no_comma_expr.equals(((List_of_id_args_set_no_comma_expr_to_id) node).no_comma_expr);
    }
}

class List_of_id_args_fespace_id extends Node implements Expression {
    String fespace;
    Expression id;
    List_of_id_args_fespace_id(String fespace, Expression id) {
        this.fespace = fespace;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace + " ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((List_of_id_args_fespace_id) node).fespace) && this.id.equals(((List_of_id_args_fespace_id) node).id);
    }
}

class List_of_id_args_fespace_and_id extends Node implements Expression {
    String fespace;
    Expression id;
    List_of_id_args_fespace_and_id(String fespace, Expression id) {
        this.fespace = fespace;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace + " & ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace.equals(((List_of_id_args_fespace_and_id) node).fespace) && this.id.equals(((List_of_id_args_fespace_and_id) node).id);
    }
}

class List_of_id_args_fespace3_id extends Node implements Expression {
    String fespace3;
    Expression id;
    List_of_id_args_fespace3_id(String fespace3, Expression id) {
        this.fespace3 = fespace3;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace3 + " ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace3.equals(((List_of_id_args_fespace3_id) node).fespace3) && this.id.equals(((List_of_id_args_fespace3_id) node).id);
    }
}

class List_of_id_args_fespace3_and_id extends Node implements Expression {
    String fespace3;
    Expression id;
    List_of_id_args_fespace3_and_id(String fespace3, Expression id) {
        this.fespace3 = fespace3;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespace3 + " & ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespace3.equals(((List_of_id_args_fespace3_and_id) node).fespace3) && this.id.equals(((List_of_id_args_fespace3_and_id) node).id);
    }
}

class List_of_id_args_fespaceS_id extends Node implements Expression {
    String fespaceS;
    Expression id;
    List_of_id_args_fespaceS_id(String fespaceS, Expression id) {
        this.fespaceS = fespaceS;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceS + " ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceS.equals(((List_of_id_args_fespaceS_id) node).fespaceS) && this.id.equals(((List_of_id_args_fespaceS_id) node).id);
    }
}

class List_of_id_args_fespaceS_and_id extends Node implements Expression {
    String fespaceS;
    Expression id;
    List_of_id_args_fespaceS_and_id(String fespaceS, Expression id) {
        this.fespaceS = fespaceS;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceS + " & ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceS.equals(((List_of_id_args_fespaceS_and_id) node).fespaceS) && this.id.equals(((List_of_id_args_fespaceS_and_id) node).id);
    }
}

class List_of_id_args_fespaceL_id extends Node implements Expression {
    String fespaceL;
    Expression id;
    List_of_id_args_fespaceL_id(String fespaceL, Expression id) {
        this.fespaceL = fespaceL;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceL + " ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceL.equals(((List_of_id_args_fespaceL_id) node).fespaceL) && this.id.equals(((List_of_id_args_fespaceL_id) node).id);
    }
}

class List_of_id_args_fespaceL_and_id extends Node implements Expression {
    String fespaceL;
    Expression id;
    List_of_id_args_fespaceL_and_id(String fespaceL, Expression id) {
        this.fespaceL = fespaceL;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print(this.fespaceL + " & ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.fespaceL.equals(((List_of_id_args_fespaceL_and_id) node).fespaceL) && this.id.equals(((List_of_id_args_fespaceL_and_id) node).id);
    }
}

class List_of_id_args_type_of_dcl_id extends Node implements Expression {
    Expression type_of_dcl, id;
    List_of_id_args_type_of_dcl_id(Expression type_of_dcl, Expression id) {
        this.type_of_dcl = type_of_dcl;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.type_of_dcl.dump(printStream, map);
        printStream.print(" ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.type_of_dcl.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.type_of_dcl.equals(((List_of_id_args_type_of_dcl_id) node).type_of_dcl) && this.id.equals(((List_of_id_args_type_of_dcl_id) node).id);
    }
}

class List_of_id_args_type_of_dcl_and_id extends Node implements Expression {
    Expression type_of_dcl, id;
    List_of_id_args_type_of_dcl_and_id(Expression type_of_dcl, Expression id) {
        this.type_of_dcl = type_of_dcl;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.type_of_dcl.dump(printStream, map);
        printStream.print(" & ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.type_of_dcl.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.type_of_dcl.equals(((List_of_id_args_type_of_dcl_and_id) node).type_of_dcl) && this.id.equals(((List_of_id_args_type_of_dcl_and_id) node).id);
    }
}

class List_of_id_args_array extends Node implements Expression {
    Expression list_of_id_args;
    List_of_id_args_array(Expression list_of_id_args) {
        this.list_of_id_args = list_of_id_args;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        printStream.print("[");
        this.list_of_id_args.dump(printStream, map);
        printStream.print("]");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_array) node).list_of_id_args);
    }
}

class List_of_id_args_comma_id extends Node implements Expression {
    Expression list_of_id_args, id;
    List_of_id_args_comma_id(Expression list_of_id_args, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_id) node).list_of_id_args) && this.id.equals(((List_of_id_args_comma_id) node).id);
    }
}

class List_of_id_args_comma_array extends Node implements Expression {
    Expression list_of_id_args1, list_of_id_args2;
    List_of_id_args_comma_array(Expression list_of_id_args1, Expression list_of_id_args2) {
        this.list_of_id_args1 = list_of_id_args1;
        this.list_of_id_args2 = list_of_id_args2;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args1.dump(printStream, map);
        printStream.print(", [");
        this.list_of_id_args2.dump(printStream, map);
        printStream.print("]");
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args1.collect(map);
        this.list_of_id_args2.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args1.equals(((List_of_id_args_comma_array) node).list_of_id_args1) && this.list_of_id_args2.equals(((List_of_id_args_comma_array) node).list_of_id_args2);
    }
}

class List_of_id_args_comma_id_no_comma_expr extends Node implements Expression {
    Expression list_of_id_args, id, no_comma_expr;
    List_of_id_args_comma_id_no_comma_expr(Expression list_of_id_args, Expression id, Expression no_comma_expr) {
        this.list_of_id_args = list_of_id_args;
        this.id = id;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", ");
        this.id.dump(printStream, map);
        printStream.print(" = ");
        this.no_comma_expr.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
        this.no_comma_expr.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_id_no_comma_expr) node).list_of_id_args) && this.id.equals(((List_of_id_args_comma_id_no_comma_expr) node).id) && this.no_comma_expr.equals(((List_of_id_args_comma_id_no_comma_expr) node).no_comma_expr);
    }
}

class List_of_id_args_comma_fespace_id extends Node implements Expression {
    Expression list_of_id_args, id;
    String fespace;
    List_of_id_args_comma_fespace_id(Expression list_of_id_args, String fespace, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.fespace = fespace;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", " + this.fespace + " ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_fespace_id) node).list_of_id_args) && this.id.equals(((List_of_id_args_comma_fespace_id) node).id) && this.fespace.equals(((List_of_id_args_comma_fespace_id) node).fespace);
    }
}

class List_of_id_args_comma_fespace_and_id extends Node implements Expression {
    Expression list_of_id_args, id;
    String fespace;
    List_of_id_args_comma_fespace_and_id(Expression list_of_id_args, String fespace, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.fespace = fespace;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", " + this.fespace + " & ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_fespace_and_id) node).list_of_id_args) && this.id.equals(((List_of_id_args_comma_fespace_and_id) node).id) && this.fespace.equals(((List_of_id_args_comma_fespace_and_id) node).fespace);
    }
}

class List_of_id_args_comma_fespace3_id extends Node implements Expression {
    Expression list_of_id_args, id;
    String fespace3;
    List_of_id_args_comma_fespace3_id(Expression list_of_id_args, String fespace3, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.fespace3 = fespace3;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", " + this.fespace3 + " ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_fespace3_id) node).list_of_id_args) && this.id.equals(((List_of_id_args_comma_fespace3_id) node).id) && this.fespace3.equals(((List_of_id_args_comma_fespace3_id) node).fespace3);
    }
}

class List_of_id_args_comma_fespace3_and_id extends Node implements Expression {
    Expression list_of_id_args, id;
    String fespace3;
    List_of_id_args_comma_fespace3_and_id(Expression list_of_id_args, String fespace3, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.fespace3 = fespace3;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", " + this.fespace3 + " & ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_fespace3_and_id) node).list_of_id_args) && this.id.equals(((List_of_id_args_comma_fespace3_and_id) node).id) && this.fespace3.equals(((List_of_id_args_comma_fespace3_and_id) node).fespace3);
    }
}

class List_of_id_args_comma_fespaceS_id extends Node implements Expression {
    Expression list_of_id_args, id;
    String fespaceS;
    List_of_id_args_comma_fespaceS_id(Expression list_of_id_args, String fespaceS, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.fespaceS = fespaceS;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", " + this.fespaceS + " ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_fespaceS_id) node).list_of_id_args) && this.id.equals(((List_of_id_args_comma_fespaceS_id) node).id) && this.fespaceS.equals(((List_of_id_args_comma_fespaceS_id) node).fespaceS);
    }
}

class List_of_id_args_comma_fespaceS_and_id extends Node implements Expression {
    Expression list_of_id_args, id;
    String fespaceS;
    List_of_id_args_comma_fespaceS_and_id(Expression list_of_id_args, String fespaceS, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.fespaceS = fespaceS;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", " + this.fespaceS + " & ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_fespaceS_and_id) node).list_of_id_args) && this.id.equals(((List_of_id_args_comma_fespaceS_and_id) node).id) && this.fespaceS.equals(((List_of_id_args_comma_fespaceS_and_id) node).fespaceS);
    }
}

class List_of_id_args_comma_fespaceL_id extends Node implements Expression {
    Expression list_of_id_args, id;
    String fespaceL;
    List_of_id_args_comma_fespaceL_id(Expression list_of_id_args, String fespaceL, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.fespaceL = fespaceL;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", " + this.fespaceL + " ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_fespaceL_id) node).list_of_id_args) && this.id.equals(((List_of_id_args_comma_fespaceL_id) node).id) && this.fespaceL.equals(((List_of_id_args_comma_fespaceL_id) node).fespaceL);
    }
}

class List_of_id_args_comma_fespaceL_and_id extends Node implements Expression {
    Expression list_of_id_args, id;
    String fespaceL;
    List_of_id_args_comma_fespaceL_and_id(Expression list_of_id_args, String fespaceL, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.fespaceL = fespaceL;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", " + this.fespaceL + " & ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_fespaceL_and_id) node).list_of_id_args) && this.id.equals(((List_of_id_args_comma_fespaceL_and_id) node).id) && this.fespaceL.equals(((List_of_id_args_comma_fespaceL_and_id) node).fespaceL);
    }
}

class List_of_id_args_comma_type_of_dcl_id extends Node implements Expression {
    Expression list_of_id_args, type_of_dcl, id;
    List_of_id_args_comma_type_of_dcl_id(Expression list_of_id_args, Expression type_of_dcl, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.type_of_dcl = type_of_dcl;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", ");
        this.type_of_dcl.dump(printStream, map);
        printStream.print(" ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.type_of_dcl.collect(map);
        this.id.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_type_of_dcl_id) node).list_of_id_args) && this.type_of_dcl.equals(((List_of_id_args_comma_type_of_dcl_id) node).type_of_dcl) && this.id.equals(((List_of_id_args_comma_type_of_dcl_id) node).id);
    }
}


class List_of_id_args_comma_type_of_dcl_and_id extends Node implements Expression {
    Expression list_of_id_args, type_of_dcl, id;
    List_of_id_args_comma_type_of_dcl_and_id(Expression list_of_id_args, Expression type_of_dcl, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.type_of_dcl = type_of_dcl;
        this.id = id;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.list_of_id_args.dump(printStream, map);
        printStream.print(", ");
        this.type_of_dcl.dump(printStream, map);
        printStream.print(" & ");
        this.id.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.list_of_id_args.collect(map);
        this.id.collect(map);
        this.type_of_dcl.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.list_of_id_args.equals(((List_of_id_args_comma_type_of_dcl_and_id) node).list_of_id_args) && this.type_of_dcl.equals(((List_of_id_args_comma_type_of_dcl_and_id) node).type_of_dcl) && this.id.equals(((List_of_id_args_comma_type_of_dcl_and_id) node).id);
    }
}

class Instructions_ extends Node implements Expression {
    Expression instruction;
    Instructions_(Expression instruction){
        this.instruction = instruction;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.instruction.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.instruction.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.instruction.equals(((Instructions_) node).instruction);
    }
}


class Instructions_instruction extends Node implements Expression {
    Expression instructions, instruction;
    Instructions_instruction(Expression instructions, Expression instruction){
        this.instructions = instructions;
        this.instruction = instruction;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.instructions.dump(printStream, map);
        printStream.print(" ");
        this.instruction.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.instructions.collect(map);
        this.instruction.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.instructions.equals(((Instructions_instruction) node).instructions) && this.instruction.equals(((Instructions_instruction) node).instruction);
    }
}

class Input extends Node implements Expression {
    Expression instructions;
    Input(Expression instructions){
        this.instructions = instructions;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.instructions.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.instructions.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.instructions.equals(((Input) node).instructions);
    }
}

class Templatevar extends Node implements Expression {
    String id;
    Expression expr;
    Templatevar(String id, Expression expr){
        this.id = id;
        this.expr = expr;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        if(map.containsKey(this.id)){
            printStream.print("$ {" + this.id + ':');
            this.expr = map.get(id);
            this.expr.dump(printStream, map);
            printStream.print("}");
        } else {
            printStream.print("$ {" + this.id + ':');
            this.expr.dump(printStream, map);
            printStream.print('}');
        }
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        if(map.containsKey(id)) {
            if (!map.get(id).equals(this.expr))
                throw new IllegalArgumentException("Key already exist with different type");
        } else
            map.put(this.id, this.expr);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.id.equals(((Templatevar) node).id) && this.expr.equals(((Templatevar) node).expr);
    }
}

class Templatevar_ extends Node implements Expression {
    Expression templatevar;
    Templatevar_(Expression templatevar){
        this.templatevar = templatevar;
    }
    public void dump(PrintStream printStream, Map<String, Expression> map) {
        this.templatevar.dump(printStream, map);
    }

    @Override
    public void collect(HashMap<String, Expression> map) {
        this.templatevar.collect(map);
    }

    @Override
    public boolean equals(Object node) {
        if(this.getClass() != node.getClass())
            return false;
        else
            return this.templatevar.equals(((Templatevar_) node).templatevar);
    }
}