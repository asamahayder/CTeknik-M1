// Generated from C:/Users/asama/IdeaProjects/CTeknik-M1/src\simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simpleCalcParser}.
 */
public interface simpleCalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(simpleCalcParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCondition(simpleCalcParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCondition(simpleCalcParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicationAndDivision}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationAndDivision(simpleCalcParser.MultiplicationAndDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicationAndDivision}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationAndDivision(simpleCalcParser.MultiplicationAndDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditionAndSubtraction}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionAndSubtraction(simpleCalcParser.AdditionAndSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditionAndSubtraction}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionAndSubtraction(simpleCalcParser.AdditionAndSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(simpleCalcParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(simpleCalcParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simpleCalcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simpleCalcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(simpleCalcParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(simpleCalcParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(simpleCalcParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(simpleCalcParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simpleCalcParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(simpleCalcParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(simpleCalcParser.While_loopContext ctx);
}