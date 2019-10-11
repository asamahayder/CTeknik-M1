// Generated from C:/Users/asama/IdeaProjects/CTeknik-M1/src\simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simpleCalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simpleCalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(simpleCalcParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(simpleCalcParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(simpleCalcParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(simpleCalcParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(simpleCalcParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(simpleCalcParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedConstant}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedConstant(simpleCalcParser.SignedConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicationAndDivision}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationAndDivision(simpleCalcParser.MultiplicationAndDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditionAndSubtraction}
	 * labeled alternative in {@link simpleCalcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionAndSubtraction(simpleCalcParser.AdditionAndSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(simpleCalcParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simpleCalcParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(simpleCalcParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(simpleCalcParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simpleCalcParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(simpleCalcParser.While_loopContext ctx);
}