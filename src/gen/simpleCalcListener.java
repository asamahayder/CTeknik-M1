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
	 * Enter a parse tree produced by {@link simpleCalcParser#conditionsNumerical}.
	 * @param ctx the parse tree
	 */
	void enterConditionsNumerical(simpleCalcParser.ConditionsNumericalContext ctx);
	/**
	 * Exit a parse tree produced by {@link simpleCalcParser#conditionsNumerical}.
	 * @param ctx the parse tree
	 */
	void exitConditionsNumerical(simpleCalcParser.ConditionsNumericalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionBooleanWithParenthesis}
	 * labeled alternative in {@link simpleCalcParser#conditionsBoolean}.
	 * @param ctx the parse tree
	 */
	void enterConditionBooleanWithParenthesis(simpleCalcParser.ConditionBooleanWithParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionBooleanWithParenthesis}
	 * labeled alternative in {@link simpleCalcParser#conditionsBoolean}.
	 * @param ctx the parse tree
	 */
	void exitConditionBooleanWithParenthesis(simpleCalcParser.ConditionBooleanWithParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionBooleanWithMultipleBooleans}
	 * labeled alternative in {@link simpleCalcParser#conditionsBoolean}.
	 * @param ctx the parse tree
	 */
	void enterConditionBooleanWithMultipleBooleans(simpleCalcParser.ConditionBooleanWithMultipleBooleansContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionBooleanWithMultipleBooleans}
	 * labeled alternative in {@link simpleCalcParser#conditionsBoolean}.
	 * @param ctx the parse tree
	 */
	void exitConditionBooleanWithMultipleBooleans(simpleCalcParser.ConditionBooleanWithMultipleBooleansContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionBooleanWithNumerical}
	 * labeled alternative in {@link simpleCalcParser#conditionsBoolean}.
	 * @param ctx the parse tree
	 */
	void enterConditionBooleanWithNumerical(simpleCalcParser.ConditionBooleanWithNumericalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionBooleanWithNumerical}
	 * labeled alternative in {@link simpleCalcParser#conditionsBoolean}.
	 * @param ctx the parse tree
	 */
	void exitConditionBooleanWithNumerical(simpleCalcParser.ConditionBooleanWithNumericalContext ctx);
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
	 * Enter a parse tree produced by the {@code IfStatementNumericalCondition}
	 * labeled alternative in {@link simpleCalcParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementNumericalCondition(simpleCalcParser.IfStatementNumericalConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatementNumericalCondition}
	 * labeled alternative in {@link simpleCalcParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementNumericalCondition(simpleCalcParser.IfStatementNumericalConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatementBooleanCondition}
	 * labeled alternative in {@link simpleCalcParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementBooleanCondition(simpleCalcParser.IfStatementBooleanConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatementBooleanCondition}
	 * labeled alternative in {@link simpleCalcParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementBooleanCondition(simpleCalcParser.IfStatementBooleanConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseStatementNumericalCondition}
	 * labeled alternative in {@link simpleCalcParser#if_else_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatementNumericalCondition(simpleCalcParser.IfElseStatementNumericalConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseStatementNumericalCondition}
	 * labeled alternative in {@link simpleCalcParser#if_else_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatementNumericalCondition(simpleCalcParser.IfElseStatementNumericalConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseStatementBooleanCondition}
	 * labeled alternative in {@link simpleCalcParser#if_else_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatementBooleanCondition(simpleCalcParser.IfElseStatementBooleanConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseStatementBooleanCondition}
	 * labeled alternative in {@link simpleCalcParser#if_else_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatementBooleanCondition(simpleCalcParser.IfElseStatementBooleanConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileNumericalCondition}
	 * labeled alternative in {@link simpleCalcParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhileNumericalCondition(simpleCalcParser.WhileNumericalConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileNumericalCondition}
	 * labeled alternative in {@link simpleCalcParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhileNumericalCondition(simpleCalcParser.WhileNumericalConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileBooleanCondition}
	 * labeled alternative in {@link simpleCalcParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhileBooleanCondition(simpleCalcParser.WhileBooleanConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileBooleanCondition}
	 * labeled alternative in {@link simpleCalcParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhileBooleanCondition(simpleCalcParser.WhileBooleanConditionContext ctx);
}