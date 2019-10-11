import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException{

        // we expect exactly one argument: the name of the input file
        if (args.length!=1) {
            System.err.println("\n");
            System.err.println("Simple calculator\n");
            System.err.println("=================\n\n");
            System.err.println("Please give as input argument a filename\n");
            System.exit(-1);
        }
        String filename=args[0];

        // open the input file
        CharStream input = CharStreams.fromFileName(filename);
        //new ANTLRFileStream (filename); // depricated

        // create a lexer/scanner
        simpleCalcLexer lex = new simpleCalcLexer(input);

        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // create a parser
        simpleCalcParser parser = new simpleCalcParser(tokens);

        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.start();

        // Construct an interpreter and run it on the parse tree
        Interpreter interpreter = new Interpreter();
        Double result=interpreter.visit(parseTree);

        System.out.println("The result is: "+result);
    }
}

// We write an interpreter that implements interface
// "simpleCalcVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

class Interpreter extends AbstractParseTreeVisitor<Double> implements simpleCalcVisitor<Double> {
    public static HashMap<String,Double> env=new HashMap<String,Double>();

    @Override
    //TODO der skal være et for-loop her. se evt. modul 4 opgven på inside
    public Double visitStart(simpleCalcParser.StartContext ctx) {
        return visit(ctx.s);
    }

    @Override
    public Double visitAssign(simpleCalcParser.AssignContext ctx) {
        // New implementation: evaluate the expression and store it in the environment for the given
        // variable name
        String varname=ctx.x.getText();
        Double v = visit(ctx.e);
        env.put(varname,v);

        return v;
    }

    @Override
    public Double visitParenthesis(simpleCalcParser.ParenthesisContext ctx){
        return visit(ctx.e);
    };

    @Override
    public Double visitVariable(simpleCalcParser.VariableContext ctx) {
        // New implementation: look up the value of the variable in the environment env:
        String varname=ctx.x.getText();
        Double d=env.get(varname);
        if (d==null){
            System.err.println("Variable "+varname+" is not defined.\n");
            System.exit(-1);
        }
        return d;
    };

    @Override
    public Double visitConstant(simpleCalcParser.ConstantContext ctx){
        return Double.parseDouble(ctx.c.getText());
    }

    @Override
    public Double visitSignedConstant(simpleCalcParser.SignedConstantContext ctx) {
        return Double.parseDouble(ctx.getText());

    }

    @Override
    public Double visitMultiplicationAndDivision(simpleCalcParser.MultiplicationAndDivisionContext ctx) {
        if(ctx.op.getText().equals("*"))
            return visit(ctx.e1) * visit(ctx.e2);
        else
            return visit(ctx.e1) / visit(ctx.e2);
    }

    @Override
    public Double visitAdditionAndSubtraction(simpleCalcParser.AdditionAndSubtractionContext ctx) {
        if(ctx.op.getText().equals("+")){
            return visit(ctx.e1) + visit(ctx.e2);
        }else {
            return visit(ctx.e1) - visit(ctx.e2);
        }
    }

    @Override
    public Double visitConditionsNumerical(simpleCalcParser.ConditionsNumericalContext ctx) {

        String condition = ctx.c1.getText();
//TODO doe sthis work??????
        if(condition.equals("==")) {
            if (visit(ctx.e1).doubleValue() == visit(ctx.e2).doubleValue()) {
                return 1.0;
            }else{
                return 0.0;
            }
        }
        if(condition.equals("<")) {
            if (visit(ctx.e1) < visit(ctx.e2)) {
                return 1.0;
            }else{
                return 0.0;
            }
        }
        if(condition.equals(">")) {
            if (visit(ctx.e1) > visit(ctx.e2)) {
                return 1.0;
            }else{
                return 0.0;
            }
        }
        if(condition.equals("<=")) {
            if (visit(ctx.e1) <= visit(ctx.e2)) {
                return 1.0;
            }else{
                return 0.0;
            }
        }
        if(condition.equals(">=")) {
            if (visit(ctx.e1) >= visit(ctx.e2)) {
                return 1.0;
            }else{
                return 0.0;
            }
        }
        if(condition.equals("!=")) {
            if (visit(ctx.e1).doubleValue() != visit(ctx.e2).doubleValue()){
                return 1.0;
            }else {
                return 0.0;
            }
        }
        return null;
    }

    @Override
    public Double visitConditionBooleanWithParenthesis(simpleCalcParser.ConditionBooleanWithParenthesisContext ctx) {
        return visit(ctx.e);
    }

    @Override
    public Double visitConditionBooleanWithMultipleBooleans(simpleCalcParser.ConditionBooleanWithMultipleBooleansContext ctx) {
        if (ctx.c.getText().equals("&&")){
            if ((visit(ctx.e1) == 1.0) && (visit(ctx.e2) == 1.0)){
                return 1.0;
            }else{
                return 0.0;
            }
        }
        if(ctx.c.toString().equals("||")){
            if (visit(ctx.e1) == 1.0 || visit(ctx.e2) == 1.0){
                return 1.0;
            }else{
                return 0.0;
            }
        }
        return null;
    }

    @Override
    public Double visitConditionBooleanWithNumerical(simpleCalcParser.ConditionBooleanWithNumericalContext ctx) {
        if (ctx.c.getText().equals("&&")){
            if (visit(ctx.e1) == 1.0 && visit(ctx.e2) == 1.0){
                return 1.0;
            }else{
                return 0.0;
            }
        }
        else {
            if (visit(ctx.e1) == 1.0 || visit(ctx.e2) == 1.0){
                return 1.0;
            }else{
                return 0.0;
            }
        }
    }

    @Override
    public Double visitStatement(simpleCalcParser.StatementContext ctx) {
//TODO does this work?
        if (ctx.a != null) {
            return visit(ctx.a);
        }if (ctx.i != null) {
            return visit(ctx.i);
        }if (ctx.ie != null) {
            return visit(ctx.ie);
        }if (ctx.w != null){
            return visit(ctx.w);
        }
        return null;
    }

    @Override
    public Double visitSequence(simpleCalcParser.SequenceContext ctx) {
        for (simpleCalcParser.StatementContext a:ctx.as){
            visit(a);
        }
        return visit(ctx.e);
    }

    @Override
    public Double visitIfStatementNumericalCondition(simpleCalcParser.IfStatementNumericalConditionContext ctx) {
        if(visit(ctx.e1) == 1.0){
            for(simpleCalcParser.StatementContext a : ctx.s1){
                visit(a);
            }
        }
        return null;
    }

    @Override
    public Double visitIfStatementBooleanCondition(simpleCalcParser.IfStatementBooleanConditionContext ctx) {
        if(visit(ctx.e1) == 1.0){
            for(simpleCalcParser.StatementContext a : ctx.s1){
                visit(a);
            }
        }
        return null;
    }

    @Override
    public Double visitIfElseStatementNumericalCondition(simpleCalcParser.IfElseStatementNumericalConditionContext ctx) {
        if(visit(ctx.e1) == 1.0){
            for(simpleCalcParser.StatementContext a : ctx.s1){
                visit(a);
            }
        }else{
            for (simpleCalcParser.StatementContext a: ctx.s2) {
                visit(a);
            }
        }
        return null;
    }

    @Override
    public Double visitIfElseStatementBooleanCondition(simpleCalcParser.IfElseStatementBooleanConditionContext ctx) {
        if(visit(ctx.e1) == 1.0){
            for(simpleCalcParser.StatementContext a : ctx.s1){
                visit(a);
            }
        }else{
            for (simpleCalcParser.StatementContext a: ctx.s2) {
                visit(a);
            }
        }
        return null;
    }

    @Override
    public Double visitWhileNumericalCondition(simpleCalcParser.WhileNumericalConditionContext ctx) {
        while (visit(ctx.e1) == 1.0){
            for(simpleCalcParser.StatementContext a : ctx.s1){
                visit(a);
            }
        }
        return null;
    }

    @Override
    public Double visitWhileBooleanCondition(simpleCalcParser.WhileBooleanConditionContext ctx) {
        while (visit(ctx.e1) == 1.0){
            for(simpleCalcParser.StatementContext a : ctx.s1){
                visit(a);
            }
        }
        return null;
    }
}

