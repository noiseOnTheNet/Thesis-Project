import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Stack;

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

public class Listener implements GrammarListener{
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
    public void enterList_of_id_args_array(GrammarParser.List_of_id_args_arrayContext ctx) {

    }

    @Override
    public void exitList_of_id_args_array(GrammarParser.List_of_id_args_arrayContext ctx) {
        Expression list_of_id_args = (Expression) this.stack.pop();
        List_of_id_args_array node = new List_of_id_args_array(list_of_id_args);
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
    public void enterParameters_list_fespace_id(GrammarParser.Parameters_list_fespace_idContext ctx) {

    }

    @Override
    public void exitParameters_list_fespace_id(GrammarParser.Parameters_list_fespace_idContext ctx) {
        Parameters_list_fespace_id node = new Parameters_list_fespace_id(ctx.FESPACE().getText(), ctx.ID().getText());
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
    public void enterFespace(GrammarParser.FespaceContext ctx) {

    }

    @Override
    public void exitFespace(GrammarParser.FespaceContext ctx) {
        Fespace node = new Fespace(ctx.FESPACE().getText());
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
        Fespace_def node = new Fespace_def(parameters_list);
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
    public void enterDeclaration_type_of_dcl_list_of_dcls_instruction(GrammarParser.Declaration_type_of_dcl_list_of_dcls_instructionContext ctx) {

    }

    @Override
    public void exitDeclaration_type_of_dcl_list_of_dcls_instruction(GrammarParser.Declaration_type_of_dcl_list_of_dcls_instructionContext ctx) {
        Expression instruction = (Expression) this.stack.pop();
        Expression list_of_dcls = (Expression) this.stack.pop();
        Expression type_of_dcl = (Expression) this.stack.pop();
        Declaration_type_of_dcl_list_of_dcls_instruction node = new Declaration_type_of_dcl_list_of_dcls_instruction(type_of_dcl, list_of_dcls, instruction);
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
    public void enterInstruction_(GrammarParser.Instruction_Context ctx) {

    }

    @Override
    public void exitInstruction_(GrammarParser.Instruction_Context ctx) {
        Instruction_ node = new Instruction_(ctx.getText());
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
    public void enterBornes(GrammarParser.BornesContext ctx) {

    }

    @Override
    public void exitBornes(GrammarParser.BornesContext ctx) {
        Expression expr2 = (Expression) this.stack.pop();
        Expression expr1 = (Expression) this.stack.pop();
        Bornes node = new Bornes(ctx.ID().getText(), expr1, expr2);
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
    public void enterNo_set_expr_lessEqual(GrammarParser.No_set_expr_lessEqualContext ctx) {

    }

    @Override
    public void exitNo_set_expr_lessEqual(GrammarParser.No_set_expr_lessEqualContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_lessEqual node = new No_set_expr_lessEqual(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_out(GrammarParser.No_set_expr_outContext ctx) {

    }

    @Override
    public void exitNo_set_expr_out(GrammarParser.No_set_expr_outContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_out node = new No_set_expr_out(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_oror(GrammarParser.No_set_expr_ororContext ctx) {

    }

    @Override
    public void exitNo_set_expr_oror(GrammarParser.No_set_expr_ororContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_oror node = new No_set_expr_oror(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_less(GrammarParser.No_set_expr_lessContext ctx) {

    }

    @Override
    public void exitNo_set_expr_less(GrammarParser.No_set_expr_lessContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_less node = new No_set_expr_less(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_unary_expr(GrammarParser.No_set_expr_unary_exprContext ctx) {

    }

    @Override
    public void exitNo_set_expr_unary_expr(GrammarParser.No_set_expr_unary_exprContext ctx) {
        Expression unary_expr = (Expression) this.stack.pop();
        No_set_expr_unary_expr node = new No_set_expr_unary_expr(unary_expr);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_multiply(GrammarParser.No_set_expr_multiplyContext ctx) {

    }

    @Override
    public void exitNo_set_expr_multiply(GrammarParser.No_set_expr_multiplyContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_multiply node = new No_set_expr_multiply(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_andand(GrammarParser.No_set_expr_andandContext ctx) {

    }

    @Override
    public void exitNo_set_expr_andand(GrammarParser.No_set_expr_andandContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_andand node = new No_set_expr_andand(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_dotMultiply(GrammarParser.No_set_expr_dotMultiplyContext ctx) {

    }

    @Override
    public void exitNo_set_expr_dotMultiply(GrammarParser.No_set_expr_dotMultiplyContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_dotMultiply node = new No_set_expr_dotMultiply(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_divide(GrammarParser.No_set_expr_divideContext ctx) {

    }

    @Override
    public void exitNo_set_expr_divide(GrammarParser.No_set_expr_divideContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_divide node = new No_set_expr_divide(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_and(GrammarParser.No_set_expr_andContext ctx) {

    }

    @Override
    public void exitNo_set_expr_and(GrammarParser.No_set_expr_andContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_and node = new No_set_expr_and(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_greaterEqual(GrammarParser.No_set_expr_greaterEqualContext ctx) {

    }

    @Override
    public void exitNo_set_expr_greaterEqual(GrammarParser.No_set_expr_greaterEqualContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_greaterEqual node = new No_set_expr_greaterEqual(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_dotDivide(GrammarParser.No_set_expr_dotDivideContext ctx) {

    }

    @Override
    public void exitNo_set_expr_dotDivide(GrammarParser.No_set_expr_dotDivideContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_dotDivide node = new No_set_expr_dotDivide(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_equal(GrammarParser.No_set_expr_equalContext ctx) {

    }

    @Override
    public void exitNo_set_expr_equal(GrammarParser.No_set_expr_equalContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_equal node = new No_set_expr_equal(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_plus(GrammarParser.No_set_expr_plusContext ctx) {

    }

    @Override
    public void exitNo_set_expr_plus(GrammarParser.No_set_expr_plusContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_plus node = new No_set_expr_plus(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_or(GrammarParser.No_set_expr_orContext ctx) {

    }

    @Override
    public void exitNo_set_expr_or(GrammarParser.No_set_expr_orContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_or node = new No_set_expr_or(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_greater(GrammarParser.No_set_expr_greaterContext ctx) {

    }

    @Override
    public void exitNo_set_expr_greater(GrammarParser.No_set_expr_greaterContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_greater node = new No_set_expr_greater(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_notEqual(GrammarParser.No_set_expr_notEqualContext ctx) {

    }

    @Override
    public void exitNo_set_expr_notEqual(GrammarParser.No_set_expr_notEqualContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_notEqual node = new No_set_expr_notEqual(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_modulus(GrammarParser.No_set_expr_modulusContext ctx) {

    }

    @Override
    public void exitNo_set_expr_modulus(GrammarParser.No_set_expr_modulusContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_modulus node = new No_set_expr_modulus(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_minus(GrammarParser.No_set_expr_minusContext ctx) {

    }

    @Override
    public void exitNo_set_expr_minus(GrammarParser.No_set_expr_minusContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_minus node = new No_set_expr_minus(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterNo_set_expr_in(GrammarParser.No_set_expr_inContext ctx) {

    }

    @Override
    public void exitNo_set_expr_in(GrammarParser.No_set_expr_inContext ctx) {
        Expression no_set_expr2 = (Expression) this.stack.pop();
        Expression no_set_expr1 = (Expression) this.stack.pop();
        No_set_expr_in node = new No_set_expr_in(no_set_expr1, no_set_expr2);
        this.stack.add(node);
    }

    @Override
    public void enterParameters_comma_no_set_expr(GrammarParser.Parameters_comma_no_set_exprContext ctx) {

    }

    @Override
    public void exitParameters_comma_no_set_expr(GrammarParser.Parameters_comma_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Expression parameters = (Expression) this.stack.pop();
        Parameters_comma_no_set_expr node = new Parameters_comma_no_set_expr(parameters, no_set_expr);
        this.stack.add(node);
    }

    @Override
    public void enterParameters_no_set_expr(GrammarParser.Parameters_no_set_exprContext ctx) {

    }

    @Override
    public void exitParameters_no_set_expr(GrammarParser.Parameters_no_set_exprContext ctx) {
        Expression no_set_expr = (Expression) this.stack.pop();
        Parameters_no_set_expr node = new Parameters_no_set_expr(no_set_expr);
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
    public void enterPow_expr_transpose(GrammarParser.Pow_expr_transposeContext ctx) {

    }

    @Override
    public void exitPow_expr_transpose(GrammarParser.Pow_expr_transposeContext ctx) {
        Expression primary = (Expression) this.stack.pop();
        Pow_expr_transpose node = new Pow_expr_transpose(primary);
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
    public void enterPrimary_cnum(GrammarParser.Primary_cnumContext ctx) { }

    @Override
    public void exitPrimary_cnum(GrammarParser.Primary_cnumContext ctx) {
        Primary_cnum node = new Primary_cnum(ctx.getText());
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
    public void enterPrimary_empty_paranthesis(GrammarParser.Primary_empty_paranthesisContext ctx) {

    }

    @Override
    public void exitPrimary_empty_paranthesis(GrammarParser.Primary_empty_paranthesisContext ctx) {
        Expression primary = (Expression) this.stack.pop();
        Primary_empty_paranthesis node = new Primary_empty_paranthesis(primary);
        this.stack.add(node);
    }

    @Override
    public void enterPrimary_array(GrammarParser.Primary_arrayContext ctx) {

    }

    @Override
    public void exitPrimary_array(GrammarParser.Primary_arrayContext ctx) {
        Expression expr = (Expression) this.stack.pop();
        Expression primary = (Expression) this.stack.pop();
        Primary_array node = new Primary_array(primary, expr);
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
    public void enterPrimary_id_expr(GrammarParser.Primary_id_exprContext ctx) {

    }

    @Override
    public void exitPrimary_id_expr(GrammarParser.Primary_id_exprContext ctx) {
        Expression expr = (Expression) this.stack.pop();
        Primary_id_expr node = new Primary_id_expr(ctx.ID().getText(), expr);
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
    public void enterPrimary_expr(GrammarParser.Primary_exprContext ctx) {

    }

    @Override
    public void exitPrimary_expr(GrammarParser.Primary_exprContext ctx) {
        Expression expr = (Expression) this.stack.pop();
        Primary_expr node = new Primary_expr(expr);
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

    public void dump() {
        System.out.print(this.variable);
    }
}

class Primary_dnum extends Node implements Expression{
    double value;
    Primary_dnum(double value){
        this.value = value;
    }
    public void dump(){
        if(this.value < 0){
            System.out.print("( ");
            System.out.print(this.value);
            System.out.print(" )");
        } else
            System.out.print(this.value);
    }
}

class Primary_lnum extends Node implements Expression{
    long value;
    Primary_lnum(long value){
        this.value = value;
    }
    public void dump(){
        if(this.value < 0){
            System.out.print("( ");
            System.out.print(this.value);
            System.out.print(" )");
        } else
            System.out.print(this.value);
    }
}

class Primary_cnum extends Node implements Expression{
    String value;
    Primary_cnum(String value){
        this.value = value;
    }
    public void dump() {
        System.out.print(this.value);
    }
}

class Primary_string extends Node implements Expression {
    String string;

    Primary_string(String string) {
        this.string = string;
    }

    public void dump() {
        System.out.print(this.string);
    }
}

class Primary_parameters extends Node implements Expression{
    Expression primary;
    Expression parameters;
    Primary_parameters(Expression primary, Expression parameters){
        this.primary = primary;
        this.parameters = parameters;
    }
    public void dump() {
        this.primary.dump();
        System.out.print("(");
        this.parameters.dump();
        System.out.print(")");
    }
}

class Primary_array extends Node implements Expression {
    Expression primary;
    Expression expr;
    Primary_array(Expression primary, Expression expr){
        this.primary = primary;
        this.expr = expr;
    }
    public void dump() {
        this.primary.dump();
        System.out.print('[');
        this.expr.dump();
        System.out.print(']');
    }
}

class Primary_empty_array extends Node implements Expression {
    Expression primary;
    Primary_empty_array(Expression primary){
        this.primary = primary;
    }
    public void dump() {
        this.primary.dump();
        System.out.print("[]");
    }
}

class Primary_empty_paranthesis extends Node implements Expression {
    Expression primary;
    Primary_empty_paranthesis(Expression primary){
        this.primary = primary;
    }
    public void dump() {
        this.primary.dump();
        System.out.print("()");
    }
}

class Primary_dot_id extends Node implements Expression {
    Expression primary;
    String id;
    Primary_dot_id(Expression primary, String id){
        this.primary = primary;
        this.id = id;
    }
    public void dump() {
        this.primary.dump();
        System.out.print('.' + this.id);
    }
}

class Primary_increment extends Node implements Expression {
    Expression primary;
    Primary_increment(Expression primary){
        this.primary = primary;
    }

    public void dump() {
        this.primary.dump();
        System.out.print("++");
    }
}

class Primary_decrement extends Node implements Expression {
    Expression primary;
    Primary_decrement(Expression primary){
        this.primary = primary;
    }
    public void dump() {
        this.primary.dump();
        System.out.print("--");
    }
}

class Primary_id_expr extends Node implements Expression {
    String id;
    Expression expr;
    Primary_id_expr(String id, Expression expr){
        this.id = id;
        this.expr = expr;
    }
    public void dump() {
        System.out.print(this.id + '(');
        this.expr.dump();
        System.out.print(')');
    }
}

class Primary_expr extends Node implements Expression {
    Expression expr;
    Primary_expr(Expression expr){
        this.expr = expr;
    }
    public void dump() {
        System.out.print('(');
        this.expr.dump();
        System.out.print(')');
    }
}

class Primary_array_ extends Node implements Expression {
    Expression array;
    Primary_array_(Expression array){
        this.array = array;
    }
    public void dump() {
        System.out.print('[');
        this.array.dump();
        System.out.print(']');
    }
}

class Pow_expr_primary extends Node implements Expression {
    Expression primary;
    Pow_expr_primary(Expression primary){
        this.primary = primary;
    }
    public void dump() {
        this.primary.dump();
    }
}

class Pow_expr_power extends Node implements Expression {
    Expression primary;
    Expression unary_expr;
    Pow_expr_power(Expression primary, Expression unary_expr){
        this.primary = primary;
        this.unary_expr = unary_expr;
    }
    public void dump() {
        this.primary.dump();
        System.out.print('^');
        this.unary_expr.dump();
    }
}

class Pow_expr_underscore extends Node implements Expression {
    Expression primary;
    Expression unary_expr;
    Pow_expr_underscore(Expression primary, Expression unary_expr){
        this.primary = primary;
        this.unary_expr = unary_expr;
    }
    public void dump() {
        this.primary.dump();
        System.out.print('_');
        this.unary_expr.dump();
    }
}

class Pow_expr_transpose extends Node implements Expression {
    Expression primary;
    Pow_expr_transpose(Expression primary){
        this.primary = primary;
    }
    public void dump() {
        this.primary.dump();
        System.out.print('´');
    }
}

class Unary_expr_pow_expr extends Node implements Expression {
    Expression pow_expr;
    Unary_expr_pow_expr(Expression pow_expr){
        this.pow_expr = pow_expr;
    }
    public void dump() {
        this.pow_expr.dump();
    }
}

class Unary_expr_unop_pow_expr extends Node implements Expression {
    Expression unop;
    Expression pow_expr;
    Unary_expr_unop_pow_expr(Expression unop, Expression pow_expr){
        this.unop = unop;
        this.pow_expr = pow_expr;
    }
    public void dump() {
        this.unop.dump();
        System.out.print(' ');
        this.pow_expr.dump();
    }
}

class Array_no_comma_expr extends Node implements Expression {
    Expression no_comma_expr;
    Array_no_comma_expr(Expression no_comma_expr){
        this.no_comma_expr = no_comma_expr;
    }
    public void dump() {
        this.no_comma_expr.dump();
    }
}

class Array_comma_no_comma_expr extends Node implements Expression {
    Expression array;
    Expression no_comma_expr;
    Array_comma_no_comma_expr(Expression array, Expression no_comma_expr){
        this.array = array;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump() {
        this.array.dump();
        System.out.print(", ");
        this.no_comma_expr.dump();
    }
}

class Parameters_no_set_expr extends Node implements Expression {
    Expression no_set_expr;
    Parameters_no_set_expr(Expression no_set_expr){
        this.no_set_expr = no_set_expr;
    }
    public void dump() {
        this.no_set_expr.dump();
    }
}

class Parameters_fespace extends Node implements Expression {
    String fespace;
    Parameters_fespace(String fespace){
        this.fespace = fespace;
    }
    public void dump() {
        System.out.print(this.fespace);
    }
}

class Parameters_id_equal_no_set_expr extends Node implements Expression {
    Expression id;
    Expression no_set_expr;
    Parameters_id_equal_no_set_expr(Expression id, Expression no_set_expr){
        this.id = id;
        this.no_set_expr = no_set_expr;
    }
    public void dump() {
        this.id.dump();
        System.out.print("=");
        this.no_set_expr.dump();
    }
}

class Parameters_comma_fespace extends Node implements Expression {
    Expression parameters;
    String fespace;
    Parameters_comma_fespace(Expression parameters, String fespace){
        this.parameters = parameters;
        this.fespace = fespace;
    }
    public void dump() {
        this.parameters.dump();
        System.out.print(", " + this.fespace);
    }
}

class Parameters_comma_no_set_expr extends Node implements Expression {
    Expression parameters;
    Expression no_set_expr;
    Parameters_comma_no_set_expr(Expression parameters, Expression no_set_expr){
        this.parameters = parameters;
        this.no_set_expr = no_set_expr;
    }
    public void dump() {
        this.parameters.dump();
        System.out.print(", ");
        this.no_set_expr.dump();
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
    public void dump() {
        this.parameters.dump();
        System.out.print(", ");
        this.id.dump();
        System.out.print('=');
        this.no_set_expr.dump();
    }
}

class No_set_expr_unary_expr extends Node implements Expression {
    Expression unary_expr;
    No_set_expr_unary_expr(Expression unary_expr){
        this.unary_expr = unary_expr;
    }
    public void dump() {
        this.unary_expr.dump();
    }
}

class No_set_expr_multiply extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_multiply(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("*");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_dotMultiply extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_dotMultiply(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print(".*");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_dotDivide extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_dotDivide(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("./");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_divide extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_divide(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("/");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_modulus extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_modulus(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("%");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_plus extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_plus(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("+");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_minus extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_minus(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("-" );
        this.no_set_expr2.dump();
    }
}

class No_set_expr_out extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_out(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("<<" );
        this.no_set_expr2.dump();
    }
}

class No_set_expr_in extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_in(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print(">>");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_and extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_and(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("&");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_andand extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_andand(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("&&");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_or extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_or(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("|");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_oror extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_oror(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("||");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_less extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_less(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("<");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_lessEqual extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_lessEqual(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("<=");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_greater extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_greater(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print(">");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_greaterEqual extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_greaterEqual(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print(">=");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_equal extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_equal(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("==");
        this.no_set_expr2.dump();
    }
}

class No_set_expr_notEqual extends Node implements Expression {
    Expression no_set_expr1, no_set_expr2;
    No_set_expr_notEqual(Expression no_set_expr1, Expression no_set_expr2){
        this.no_set_expr1 = no_set_expr1;
        this.no_set_expr2 = no_set_expr2;
    }
    public void dump() {
        this.no_set_expr1.dump();
        System.out.print("!=");
        this.no_set_expr2.dump();
    }
}

class No_comma_expr_no_set_expr extends Node implements Expression {
    Expression no_set_expr;
    No_comma_expr_no_set_expr(Expression no_set_expr){
        this.no_set_expr = no_set_expr;
    }
    public void dump() {
        this.no_set_expr.dump();
    }
}

class No_comma_expr_equal extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_equal(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump() {
        this.no_set_expr.dump();
        System.out.print('=');
        this.no_comma_expr.dump();
    }
}

class No_comma_expr_plusEqual extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_plusEqual(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump() {
        this.no_set_expr.dump();
        System.out.print("+=");
        this.no_comma_expr.dump();
    }
}

class No_comma_expr_minusEqual extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_minusEqual(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump() {
        this.no_set_expr.dump();
        System.out.print("-=");
        this.no_comma_expr.dump();
    }
}

class No_comma_expr_multEqual extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_multEqual(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump() {
        this.no_set_expr.dump();
        System.out.print("*=");
        this.no_comma_expr.dump();
    }
}

class No_comma_expr_divideEqual extends Node implements Expression {
    Expression no_set_expr;
    Expression no_comma_expr;
    No_comma_expr_divideEqual(Expression no_set_expr, Expression no_comma_expr){
        this.no_set_expr = no_set_expr;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump() {
        this.no_set_expr.dump();
        System.out.print("/=");
        this.no_comma_expr.dump();
    }
}

class Unop_minus extends Node implements Expression {
    String op;
    Unop_minus(String op){
        this.op = op;
    }
    public void dump() {
        System.out.print(this.op);
    }
}

class Unop_plus extends Node implements Expression {
    String op;
    Unop_plus(String op){
        this.op = op;
    }
    public void dump() {
        System.out.print(this.op);
    }
}

class Unop_not extends Node implements Expression {
    String op;
    Unop_not(String op){
        this.op = op;
    }
    public void dump() {
        System.out.print(this.op);
    }
}

class Unop_increment extends Node implements Expression {
    String op;
    Unop_increment(String op){
        this.op = op;
    }
    public void dump() {
        System.out.print(this.op);
    }
}

class Unop_decrement extends Node implements Expression {
    String op;
    Unop_decrement(String op){
        this.op = op;
    }
    public void dump() {
        System.out.print(this.op);
    }
}

class Expr_no_comma_expr extends Node implements Expression {
    Expression no_comma_expr;
    Expr_no_comma_expr(Expression no_comma_expr){
        this.no_comma_expr = no_comma_expr;
    }
    public void dump() {
        this.no_comma_expr.dump();
    }
}

class Expr_comma extends Node implements Expression {
    Expression expr1, expr2;
    Expr_comma(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    public void dump() {
        this.expr1.dump();
        System.out.print(", ");
        this.expr2.dump();
    }
}

class Border_expr extends Node implements Expression {
    Expression bornes;
    Expression instruction;
    Border_expr(Expression bornes, Expression instruction){
        this.bornes = bornes;
        this.instruction = instruction;
    }

    public void dump() {
        this.bornes.dump();
        System.out.print(' ');
        this.instruction.dump();
    }
}

class Bornes extends Node implements Expression {
    String id;
    Expression expr1, expr2;
    Bornes(String id, Expression expr1, Expression expr2){
        this.id = id;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
    public void dump() {
        System.out.print('(' + this.id + '=');
        this.expr1.dump();
        System.out.print(", ");
        this.expr2.dump();
    }
}

class Instruction_ extends Node implements Expression {
    String instruction;
    Instruction_(String instruction){
        this.instruction = instruction;
    }
    public void dump() {
        System.out.print(this.instruction);
    }
}

class Instruction_include_string extends Node implements Expression {
    String string;
    Instruction_include_string(String string){
        this.string = string;
    }
    public void dump() {
        System.out.print("include" + this.string);
    }
}

class Instruction_expr extends Node implements Expression {
    Expression expr;
    Instruction_expr(Expression expr){
        this.expr = expr;
    }
    public void dump() {
        this.expr.dump();
        System.out.println(";");
    }
}

class Instruction_declaration extends Node implements Expression {
    Expression declaration;
    Instruction_declaration(Expression declaration){
        this.declaration = declaration;
    }
    public void dump() {
        this.declaration.dump();
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
    public void dump() {
        this.for_loop.dump();
        System.out.print('(');
        this.expr1.dump();
        System.out.print(';');
        this.expr2.dump();
        System.out.print(';');
        this.expr3.dump();
        System.out.print(')');
        this.instruction.dump();
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
    public void dump() {
        this.while_loop.dump();
        System.out.print('(');
        this.expr.dump();
        System.out.print(')');
        this.instruction.dump();
    }
}

class Instruction_if extends Node implements Expression {
    Expression expr;
    Expression instruction;
    Instruction_if(Expression expr, Expression instruction){
        this.expr = expr;
        this.instruction = instruction;
    }
    public void dump() {
        System.out.print("if(");
        this.expr.dump();
        System.out.print(')');
        this.instruction.dump();
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
    public void dump() {
        System.out.print("if(");
        this.expr.dump();
        System.out.print(')');
        this.instruction1.dump();
        System.out.print("else");
        this.instruction2.dump();
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
    public void dump() {
        this.begin.dump();
        this.instruction.dump();
        this.end.dump();
    }
}

class Instruction_border_id_border_expr extends Node implements Expression {
    String id;
    Expression border_expr;
    Instruction_border_id_border_expr(String id, Expression border_expr){
        this.id = id;
        this.border_expr = border_expr;
    }
    public void dump() {
        System.out.print("border " + this.id);
        this.border_expr.dump();
    }
}

class Instruction_border_id_array extends Node implements Expression {
    String id;
    Expression array;
    Instruction_border_id_array(String id, Expression array){
        this.id = id;
        this.array = array;
    }
    public void dump() {
        System.out.print("border " + this.id + '[');
        this.array.dump();
        System.out.print(']');
    }
}

class Instruction_break extends Node implements Expression {
    Instruction_break(){
    }
    public void dump() {
        System.out.print("break; ");
    }
}

class Instruction_continue extends Node implements Expression {
    Instruction_continue(){
    }
    public void dump() {
        System.out.print("continue; ");
    }
}

class Instruction_return extends Node implements Expression {
    Expression expr;
    Instruction_return(Expression expr){
        this.expr = expr;
    }
    public void dump() {
        System.out.print("return ");
        this.expr.dump();
        System.out.print(";");
    }
}

class For_loop extends Node implements Expression {
    For_loop(){
    }
    public void dump() {
        System.out.print("for");
    }
}

class While_loop extends Node implements Expression {
    While_loop(){
    }
    public void dump() {
        System.out.print("while");
    }
}

class Begin extends Node implements Expression {
    Begin(){
    }
    public void dump() {
        System.out.print("{");
    }
}

class End extends Node implements Expression {
    End(){
    }
    public void dump() {
        System.out.print("}");
    }
}

class Declaration_type_of_dcl_list_of_dcls extends Node implements Expression {
    Expression type_of_dcl;
    Expression list_of_dcls;
    Declaration_type_of_dcl_list_of_dcls(Expression type_of_dcl, Expression list_of_dcls){
        this.type_of_dcl = type_of_dcl;
        this.list_of_dcls = list_of_dcls;
    }
    public void dump() {
        this.type_of_dcl.dump();
        System.out.print(' ');
        this.list_of_dcls.dump();
        System.out.print(";");
    }
}

class Declaration_type_of_dcl_list_of_dcls_instruction extends Node implements Expression {
    Expression type_of_dcl;
    Expression list_of_dcls;
    Expression instruction;
    Declaration_type_of_dcl_list_of_dcls_instruction(Expression type_of_dcl, Expression list_of_dcls, Expression instruction){
        this.type_of_dcl = type_of_dcl;
        this.list_of_dcls = list_of_dcls;
        this.instruction = instruction;
    }
    public void dump() {
        this.type_of_dcl.dump();
        System.out.print(' ');
        this.list_of_dcls.dump();
        System.out.print("=");
        this.instruction.dump();
    }
}

class Declaration_fespace_def_list extends Node implements Expression {
    String fespace;
    Expression fespace_def_list;
    Declaration_fespace_def_list(String fespace, Expression fespace_def_list){
        this.fespace = fespace;
        this.fespace_def_list = fespace_def_list;
    }
    public void dump() {
        System.out.print(this.fespace + ' ');
        this.fespace_def_list.dump();
        System.out.print(";");
    }
}

class Declaration_spaceIDs extends Node implements Expression {
    Expression spaceIDs;
    Declaration_spaceIDs(Expression spaceIDs){
        this.spaceIDs = spaceIDs;
    }
    public void dump() {
        this.spaceIDs.dump();
        System.out.print(";");
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
    public void dump() {
        System.out.print(this.function + ' ' + this.id + '=');
        this.expr.dump();
        System.out.print(";");
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
    public void dump() {
        System.out.print(this.function + ' ');
        this.type_of_dcl.dump();
        System.out.print(' ' + this.id + '(');
        this.list_of_id_args.dump();
        System.out.print(')' + '{');
        this.instructions.dump();
        System.out.print('}');
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

    public void dump() {
        System.out.print(this.function + ' ' + this.id + '(');
        this.list_of_id_args.dump();
        System.out.print(')' + '=');
        this.no_comma_expr.dump();
        System.out.print(';');
    }
}

class Fespace_def_list_fespace_def extends Node implements Expression {
    Expression fespace_def;
    Fespace_def_list_fespace_def(Expression fespace_def) {
        this.fespace_def = fespace_def;
    }

    public void dump() {
        this.fespace_def.dump();
    }
}

class Fespace_def_list_comma_fespace_def extends Node implements Expression {
    Expression fespace_def_list, fespace_def;
    Fespace_def_list_comma_fespace_def(Expression fespace_def_list, Expression fespace_def) {
        this.fespace_def_list = fespace_def_list;
        this.fespace_def = fespace_def;
    }

    public void dump() {
        this.fespace_def_list.dump();
        System.out.print(", ");
        this.fespace_def.dump();
    }
}

class Fespace_def extends Node implements Expression {
    String id;
    Expression parameters_list;
    Fespace_def(Expression parameters_list) {
        this.parameters_list = parameters_list;
    }

    public void dump() {
        System.out.print(this.id + "(");
        this.parameters_list.dump();
        System.out.print(")");
    }
}

class SpaceIDs_fespace_spaceIDb extends Node implements Expression {
    Expression fespace, spaceIDb;
    SpaceIDs_fespace_spaceIDb(Expression fespace, Expression spaceIDb) {
        this.fespace = fespace;
        this.spaceIDb = spaceIDb;
    }

    public void dump() {
        this.fespace.dump();
        System.out.print(" ");
        this.spaceIDb.dump();
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

    public void dump() {
        this.fespace.dump();
        System.out.print(" [" + this.id + "] ");
        this.spaceIDa.dump();
    }
}

class SpaceIDb_id_space extends Node implements Expression {
    Expression id_space;
    SpaceIDb_id_space(Expression id_space) {
        this.id_space = id_space;
    }

    public void dump() {
        this.id_space.dump();
    }
}

class SpaceIDb_comma_id_space extends Node implements Expression {
    Expression spaceIDb, id_space;
    SpaceIDb_comma_id_space(Expression spaceIDb, Expression id_space) {
        this.spaceIDb = spaceIDb;
        this.id_space = id_space;
    }

    public void dump() {
        this.spaceIDb.dump();
        System.out.print(", ");
        this.id_space.dump();
    }
}

class SpaceIDa_id_array_space extends Node implements Expression {
    Expression id_array_space;
    SpaceIDa_id_array_space(Expression id_array_space) {
        this.id_array_space = id_array_space;
    }

    public void dump() {
        this.id_array_space.dump();
    }
}

class SpaceIDa_comma_id_array_space extends Node implements Expression {
    Expression spaceIDa, id_array_space;
    SpaceIDa_comma_id_array_space(Expression spaceIDa, Expression id_array_space) {
        this.spaceIDa = spaceIDa;
        this.id_array_space = id_array_space;
    }

    public void dump() {
        this.spaceIDa.dump();
        System.out.print(", ");
        this.id_array_space.dump();
    }
}

class Fespace extends Node implements Expression {
    String fespace;
    Fespace(String fespace){
        this.fespace = fespace;
    }
    public void dump() {
        System.out.print(this.fespace);
    }
}

class Id_array_space_id_no_set_expr extends Node implements Expression {
    String id;
    Expression no_set_expr;
    Id_array_space_id_no_set_expr(String id, Expression no_set_expr) {
        this.id = id;
        this.no_set_expr = no_set_expr;
    }

    public void dump() {
        System.out.print(this.id + "(");
        this.no_set_expr.dump();
        System.out.print(")");
    }
}

class Id_array_space_array_list_of_id1_no_set_expr extends Node implements Expression {
    Expression list_of_id1, no_set_expr;
    Id_array_space_array_list_of_id1_no_set_expr(Expression list_of_id1, Expression no_set_expr) {
        this.list_of_id1 = list_of_id1;
        this.no_set_expr = no_set_expr;
    }

    public void dump() {
        System.out.print("[");
        this.list_of_id1.dump();
        System.out.print("]");
        System.out.print("(");
        this.no_set_expr.dump();
        System.out.print(")");
    }
}

class Id_space_id extends Node implements Expression {
    String id;
    Id_space_id(String id) {
        this.id = id;
    }

    public void dump() {
        System.out.print(this.id);
    }
}

class Id_space_array_no_set_expr extends Node implements Expression {
    String id;
    Expression no_set_expr;
    Id_space_array_no_set_expr(String id, Expression no_set_expr) {
        this.id = id;
        this.no_set_expr = no_set_expr;
    }

    public void dump() {
        System.out.print(this.id + "[");
        this.no_set_expr.dump();
        System.out.print("]");
    }
}

class Id_space_no_set_expr extends Node implements Expression {
    String id;
    Expression no_set_expr;
    Id_space_no_set_expr(String id, Expression no_set_expr) {
        this.id = id;
        this.no_set_expr = no_set_expr;
    }

    public void dump() {
        System.out.print(this.id + "=");
        this.no_set_expr.dump();
    }
}

class Id_space_array_list_of_id1 extends Node implements Expression {
    Expression list_of_id1;
    Id_space_array_list_of_id1(Expression list_of_id1) {
        this.list_of_id1 = list_of_id1;
    }

    public void dump() {
        System.out.print("[");
        this.list_of_id1.dump();
        System.out.print("]");
    }
}

class Id_space_array_list_of_id1_array_no_set_expr extends Node implements Expression {
    Expression list_of_id1, no_set_expr;
    Id_space_array_list_of_id1_array_no_set_expr(Expression list_of_id1, Expression no_set_expr) {
        this.list_of_id1 = list_of_id1;
        this.no_set_expr = no_set_expr;
    }

    public void dump() {
        System.out.print("[");
        this.list_of_id1.dump();
        System.out.print("] ");
        System.out.print("[");
        this.no_set_expr.dump();
        System.out.print("]");
    }
}

class Id_space_array_list_of_id1_no_set_expr extends Node implements Expression {
    Expression list_of_id1, no_set_expr;
    Id_space_array_list_of_id1_no_set_expr(Expression list_of_id1, Expression no_set_expr) {
        this.list_of_id1 = list_of_id1;
        this.no_set_expr = no_set_expr;
    }

    public void dump() {
        System.out.print("[");
        this.list_of_id1.dump();
        System.out.print("]=");
        this.no_set_expr.dump();
    }
}


class Type_of_dcl_id extends Node implements Expression {
    String id;
    Type_of_dcl_id(String id) {
        this.id = id;
    }

    public void dump() {
        System.out.print(this.id);
    }
}

class Type_of_dcl_id_array extends Node implements Expression {
    String id1, id2;
    Type_of_dcl_id_array(String id1 ,String id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    public void dump() {
        System.out.print(this.id1 + '[' + this.id2 + ']');
    }
}

class Parameters_list_no_set_expr extends Node implements Expression {
    Expression no_set_expr;
    Parameters_list_no_set_expr(Expression no_set_expr) {
        this.no_set_expr = no_set_expr;
    }

    public void dump() {
        this.no_set_expr.dump();
    }
}

class Parameters_list_fespace_id extends Node implements Expression {
    String fespace, id;
    Parameters_list_fespace_id(String fespace, String id) {
        this.fespace = fespace;
        this.id = id;
    }

    public void dump() {
        System.out.print(this.fespace + ' ' + this.id);
    }
}


class Parameters_list_id_no_set_expr extends Node implements Expression {
    String id;
    Expression no_set_expr;
    Parameters_list_id_no_set_expr(String id, Expression no_set_expr) {
        this.id = id;
        this.no_set_expr = no_set_expr;
    }

    public void dump() {
        System.out.print(this.id + "=");
        this.no_set_expr.dump();
    }
}

class Parameters_list_comma_no_set_expr extends Node implements Expression {
    Expression parameters_list, no_set_expr;
    Parameters_list_comma_no_set_expr(Expression parameters_list, Expression no_set_expr) {
        this.parameters_list = parameters_list;
        this.no_set_expr = no_set_expr;
    }

    public void dump() {
        this.parameters_list.dump();
        System.out.print(", ");
        this.no_set_expr.dump();
    }
}

class Parameters_list_comma_id_no_set_expr extends Node implements Expression {
    Expression parameters_list, id, no_set_expr;
    Parameters_list_comma_id_no_set_expr(Expression parameters_list, Expression id, Expression no_set_expr) {
        this.parameters_list = parameters_list;
        this.id = id;
        this.no_set_expr = no_set_expr;
    }

    public void dump() {
        this.parameters_list.dump();
        System.out.print(", ");
        this.id.dump();
        System.out.print("=");
        this.no_set_expr.dump();
    }
}

class List_of_dcls_id extends Node implements Expression {
    String id;
    List_of_dcls_id(String id) {
        this.id = id;
    }

    public void dump() {
        System.out.print(this.id);
    }
}


class List_of_dcls_id_no_comma_expr extends Node implements Expression {
    String id;
    Expression no_comma_expr;
    List_of_dcls_id_no_comma_expr(String id, Expression no_comma_expr) {
        this.id = id;
        this.no_comma_expr = no_comma_expr;
    }

    public void dump() {
        System.out.print(this.id + "=");
        this.no_comma_expr.dump();
    }
}

class List_of_dcls_id_parameters_list extends Node implements Expression {
    String id;
    Expression parameters_list;
    List_of_dcls_id_parameters_list(String id, Expression parameters_list) {
        this.id = id;
        this.parameters_list = parameters_list;
    }

    public void dump() {
        System.out.print(this.id + " (");
        this.parameters_list.dump();
        System.out.print(")");
    }
}

class List_of_dcls_comma extends Node implements Expression {
    Expression list_of_dcls1, list_of_dcls2;
    List_of_dcls_comma(Expression list_of_dcls1, Expression list_of_dcls2) {
        this.list_of_dcls1 = list_of_dcls1;
        this.list_of_dcls2 = list_of_dcls2;
    }

    public void dump() {
        this.list_of_dcls1.dump();
        System.out.print(", ");
        this.list_of_dcls2.dump();
    }
}

class Id_id extends Node implements Expression {
    String id;
    Id_id(String id) {
        this.id = id;
    }

    public void dump() {
        System.out.print(this.id);
    }
}

class Id_fespace extends Node implements Expression {
    String fespace;
    Id_fespace(String fespace) {
        this.fespace = fespace;
    }

    public void dump() {
        System.out.print(this.fespace);
    }
}

class List_of_id1_id extends Node implements Expression {
    Expression id;
    List_of_id1_id(Expression id) {
        this.id = id;
    }

    public void dump() {
        this.id.dump();
    }
}


class List_of_id1_comma_id extends Node implements Expression {
    Expression list_of_id1, id;
    List_of_id1_comma_id(Expression list_of_id1, Expression id) {
        this.list_of_id1 = list_of_id1;
        this.id = id;
    }

    public void dump() {
        this.list_of_id1.dump();
        System.out.print(", ");
        this.id.dump();
    }
}

class List_of_id_args_id extends Node implements Expression {
    Expression id;
    List_of_id_args_id(Expression id) {
        this.id = id;
    }

    public void dump() {
        this.id.dump();
    }
}

class List_of_id_args_set_no_comma_expr_to_id extends Node implements Expression {
    Expression id, no_comma_expr;
    List_of_id_args_set_no_comma_expr_to_id(Expression id, Expression no_comma_expr) {
        this.id = id;
        this.no_comma_expr = no_comma_expr;
    }

    public void dump() {
        this.id.dump();
        System.out.print("=");
        this.no_comma_expr.dump();
    }
}

class List_of_id_args_fespace_id extends Node implements Expression {
    String fespace;
    Expression id;
    List_of_id_args_fespace_id(String fespace, Expression id) {
        this.fespace = fespace;
        this.id = id;
    }
    public void dump() {
        System.out.print(this.fespace + " ");
        this.id.dump();
    }
}

class List_of_id_args_type_of_dcl_id extends Node implements Expression {
    Expression type_of_dcl, id;
    List_of_id_args_type_of_dcl_id(Expression type_of_dcl, Expression id) {
        this.type_of_dcl = type_of_dcl;
        this.id = id;
    }
    public void dump() {
        this.type_of_dcl.dump();
        System.out.print(" ");
        this.id.dump();
    }
}

class List_of_id_args_type_of_dcl_and_id extends Node implements Expression {
    Expression type_of_dcl, id;
    List_of_id_args_type_of_dcl_and_id(Expression type_of_dcl, Expression id) {
        this.type_of_dcl = type_of_dcl;
        this.id = id;
    }
    public void dump() {
        this.type_of_dcl.dump();
        System.out.print("&");
        this.id.dump();
    }
}

class List_of_id_args_array extends Node implements Expression {
    Expression list_of_id_args;
    List_of_id_args_array(Expression list_of_id_args) {
        this.list_of_id_args = list_of_id_args;
    }
    public void dump() {
        System.out.print("[");
        this.list_of_id_args.dump();
        System.out.print("]");
    }
}

class List_of_id_args_comma_id extends Node implements Expression {
    Expression list_of_id_args, id;
    List_of_id_args_comma_id(Expression list_of_id_args, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.id = id;
    }
    public void dump() {
        this.list_of_id_args.dump();
        System.out.print(", ");
        this.id.dump();
    }
}

class List_of_id_args_comma_array extends Node implements Expression {
    Expression list_of_id_args1, list_of_id_args2;
    List_of_id_args_comma_array(Expression list_of_id_args1, Expression list_of_id_args2) {
        this.list_of_id_args1 = list_of_id_args1;
        this.list_of_id_args2 = list_of_id_args2;
    }
    public void dump() {
        this.list_of_id_args1.dump();
        System.out.print(", [");
        this.list_of_id_args2.dump();
        System.out.print("]");
    }
}

class List_of_id_args_comma_id_no_comma_expr extends Node implements Expression {
    Expression list_of_id_args, id, no_comma_expr;
    List_of_id_args_comma_id_no_comma_expr(Expression list_of_id_args, Expression id, Expression no_comma_expr) {
        this.list_of_id_args = list_of_id_args;
        this.id = id;
        this.no_comma_expr = no_comma_expr;
    }
    public void dump() {
        this.list_of_id_args.dump();
        System.out.print(", ");
        this.id.dump();
        System.out.print("=");
        this.no_comma_expr.dump();
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
    public void dump() {
        this.list_of_id_args.dump();
        System.out.print(", " + this.fespace + " ");
        this.id.dump();
    }
}

class List_of_id_args_comma_type_of_dcl_id extends Node implements Expression {
    Expression list_of_id_args, type_of_dcl, id;
    List_of_id_args_comma_type_of_dcl_id(Expression list_of_id_args, Expression type_of_dcl, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.type_of_dcl = type_of_dcl;
        this.id = id;
    }
    public void dump() {
        this.list_of_id_args.dump();
        System.out.print(", ");
        this.type_of_dcl.dump();
        System.out.print(" ");
        this.id.dump();
    }
}


class List_of_id_args_comma_type_of_dcl_and_id extends Node implements Expression {
    Expression list_of_id_args, type_of_dcl, id;
    List_of_id_args_comma_type_of_dcl_and_id(Expression list_of_id_args, Expression type_of_dcl, Expression id) {
        this.list_of_id_args = list_of_id_args;
        this.type_of_dcl = type_of_dcl;
        this.id = id;
    }
    public void dump() {
        this.list_of_id_args.dump();
        System.out.print(", ");
        this.type_of_dcl.dump();
        System.out.print("&");
        this.id.dump();
    }
}

class Instructions_ extends Node implements Expression {
    Expression instruction;
    Instructions_(Expression instruction){
        this.instruction = instruction;
    }
    public void dump() {
        this.instruction.dump();
    }
}


class Instructions_instruction extends Node implements Expression {
    Expression instructions, instruction;
    Instructions_instruction(Expression instructions, Expression instruction){
        this.instructions = instructions;
        this.instruction = instruction;
    }
    public void dump() {
        this.instructions.dump();
        System.out.print(" ");
        this.instruction.dump();
    }
}

class Input extends Node implements Expression {
    Expression instructions;
    Input(Expression instructions){
        this.instructions = instructions;
    }
    public void dump() {
        this.instructions.dump();
    }
}