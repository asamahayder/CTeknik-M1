// Generated from C:/Users/asama/IdeaProjects/CTeknik-M1/src\simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, COND1=11, COND2=12, OP1=13, OP2=14, ID=15, FLOAT=16, ALPHA=17, 
		NUM=18, WHITESPACE=19, COMMENT=20, COMMENT2=21;
	public static final int
		RULE_start = 0, RULE_assign = 1, RULE_expr = 2, RULE_conditionsNumerical = 3, 
		RULE_conditionsBoolean = 4, RULE_statement = 5, RULE_sequence = 6, RULE_if_statement = 7, 
		RULE_if_else_statement = 8, RULE_while_loop = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "assign", "expr", "conditionsNumerical", "conditionsBoolean", 
			"statement", "sequence", "if_statement", "if_else_statement", "while_loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'GL'", "'GG'", "'='", "'('", "')'", "'if('", "'){'", "'}'", "'}else{'", 
			"'while('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "COND1", 
			"COND2", "OP1", "OP2", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", 
			"COMMENT2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public SequenceContext s;
		public TerminalNode EOF() { return getToken(simpleCalcParser.EOF, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			((StartContext)_localctx).s = sequence();
			setState(22);
			match(T__1);
			setState(23);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public Token x;
		public ExprContext e;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			((AssignContext)_localctx).x = match(ID);
			setState(26);
			match(T__2);
			setState(27);
			((AssignContext)_localctx).e = expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public Token x;
		public TerminalNode ID() { return getToken(simpleCalcParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExprContext {
		public Token c;
		public TerminalNode FLOAT() { return getToken(simpleCalcParser.FLOAT, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignedConstantContext extends ExprContext {
		public Token op;
		public Token f;
		public TerminalNode OP1() { return getToken(simpleCalcParser.OP1, 0); }
		public TerminalNode FLOAT() { return getToken(simpleCalcParser.FLOAT, 0); }
		public SignedConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterSignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitSignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitSignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationAndDivisionContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP2() { return getToken(simpleCalcParser.OP2, 0); }
		public MultiplicationAndDivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterMultiplicationAndDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitMultiplicationAndDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitMultiplicationAndDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionAndSubtractionContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP1() { return getToken(simpleCalcParser.OP1, 0); }
		public AdditionAndSubtractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterAdditionAndSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitAdditionAndSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitAdditionAndSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(30);
				match(T__3);
				setState(31);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(32);
				match(T__4);
				}
				break;
			case FLOAT:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				((ConstantContext)_localctx).c = match(FLOAT);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case OP1:
				{
				_localctx = new SignedConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				((SignedConstantContext)_localctx).op = match(OP1);
				setState(37);
				((SignedConstantContext)_localctx).f = match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationAndDivisionContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationAndDivisionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(40);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(41);
						((MultiplicationAndDivisionContext)_localctx).op = match(OP2);
						setState(42);
						((MultiplicationAndDivisionContext)_localctx).e2 = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AdditionAndSubtractionContext(new ExprContext(_parentctx, _parentState));
						((AdditionAndSubtractionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(43);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(44);
						((AdditionAndSubtractionContext)_localctx).op = match(OP1);
						setState(45);
						((AdditionAndSubtractionContext)_localctx).e2 = expr(5);
						}
						break;
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionsNumericalContext extends ParserRuleContext {
		public ExprContext e1;
		public Token c1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COND1() { return getToken(simpleCalcParser.COND1, 0); }
		public ConditionsNumericalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionsNumerical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterConditionsNumerical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitConditionsNumerical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitConditionsNumerical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsNumericalContext conditionsNumerical() throws RecognitionException {
		ConditionsNumericalContext _localctx = new ConditionsNumericalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_conditionsNumerical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			((ConditionsNumericalContext)_localctx).e1 = expr(0);
			setState(52);
			((ConditionsNumericalContext)_localctx).c1 = match(COND1);
			setState(53);
			((ConditionsNumericalContext)_localctx).e2 = expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionsBooleanContext extends ParserRuleContext {
		public ConditionsBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionsBoolean; }
	 
		public ConditionsBooleanContext() { }
		public void copyFrom(ConditionsBooleanContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionBooleanWithParenthesisContext extends ConditionsBooleanContext {
		public ConditionsBooleanContext e;
		public ConditionsBooleanContext conditionsBoolean() {
			return getRuleContext(ConditionsBooleanContext.class,0);
		}
		public ConditionBooleanWithParenthesisContext(ConditionsBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterConditionBooleanWithParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitConditionBooleanWithParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitConditionBooleanWithParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionBooleanWithMultipleBooleansContext extends ConditionsBooleanContext {
		public ConditionsBooleanContext e1;
		public Token c;
		public ConditionsBooleanContext e2;
		public List<ConditionsBooleanContext> conditionsBoolean() {
			return getRuleContexts(ConditionsBooleanContext.class);
		}
		public ConditionsBooleanContext conditionsBoolean(int i) {
			return getRuleContext(ConditionsBooleanContext.class,i);
		}
		public TerminalNode COND2() { return getToken(simpleCalcParser.COND2, 0); }
		public ConditionBooleanWithMultipleBooleansContext(ConditionsBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterConditionBooleanWithMultipleBooleans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitConditionBooleanWithMultipleBooleans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitConditionBooleanWithMultipleBooleans(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionBooleanWithNumericalContext extends ConditionsBooleanContext {
		public ConditionsNumericalContext e1;
		public Token c;
		public ConditionsNumericalContext e2;
		public List<ConditionsNumericalContext> conditionsNumerical() {
			return getRuleContexts(ConditionsNumericalContext.class);
		}
		public ConditionsNumericalContext conditionsNumerical(int i) {
			return getRuleContext(ConditionsNumericalContext.class,i);
		}
		public TerminalNode COND2() { return getToken(simpleCalcParser.COND2, 0); }
		public ConditionBooleanWithNumericalContext(ConditionsBooleanContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterConditionBooleanWithNumerical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitConditionBooleanWithNumerical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitConditionBooleanWithNumerical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsBooleanContext conditionsBoolean() throws RecognitionException {
		return conditionsBoolean(0);
	}

	private ConditionsBooleanContext conditionsBoolean(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionsBooleanContext _localctx = new ConditionsBooleanContext(_ctx, _parentState);
		ConditionsBooleanContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_conditionsBoolean, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new ConditionBooleanWithNumericalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(56);
				((ConditionBooleanWithNumericalContext)_localctx).e1 = conditionsNumerical();
				setState(57);
				((ConditionBooleanWithNumericalContext)_localctx).c = match(COND2);
				setState(58);
				((ConditionBooleanWithNumericalContext)_localctx).e2 = conditionsNumerical();
				}
				break;
			case 2:
				{
				_localctx = new ConditionBooleanWithParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(T__3);
				setState(61);
				((ConditionBooleanWithParenthesisContext)_localctx).e = conditionsBoolean(0);
				setState(62);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionBooleanWithMultipleBooleansContext(new ConditionsBooleanContext(_parentctx, _parentState));
					((ConditionBooleanWithMultipleBooleansContext)_localctx).e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_conditionsBoolean);
					setState(66);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(67);
					((ConditionBooleanWithMultipleBooleansContext)_localctx).c = match(COND2);
					setState(68);
					((ConditionBooleanWithMultipleBooleansContext)_localctx).e2 = conditionsBoolean(3);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignContext a;
		public If_statementContext i;
		public If_else_statementContext ie;
		public While_loopContext w;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public If_else_statementContext if_else_statement() {
			return getRuleContext(If_else_statementContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((StatementContext)_localctx).a = assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				((StatementContext)_localctx).i = if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				((StatementContext)_localctx).ie = if_else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				((StatementContext)_localctx).w = while_loop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> as = new ArrayList<StatementContext>();
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					((SequenceContext)_localctx).statement = statement();
					((SequenceContext)_localctx).as.add(((SequenceContext)_localctx).statement);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(86);
			((SequenceContext)_localctx).e = expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementNumericalConditionContext extends If_statementContext {
		public ConditionsNumericalContext e1;
		public StatementContext statement;
		public List<StatementContext> s1 = new ArrayList<StatementContext>();
		public ConditionsNumericalContext conditionsNumerical() {
			return getRuleContext(ConditionsNumericalContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementNumericalConditionContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterIfStatementNumericalCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitIfStatementNumericalCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitIfStatementNumericalCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementBooleanConditionContext extends If_statementContext {
		public ConditionsBooleanContext e1;
		public StatementContext statement;
		public List<StatementContext> s1 = new ArrayList<StatementContext>();
		public ConditionsBooleanContext conditionsBoolean() {
			return getRuleContext(ConditionsBooleanContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementBooleanConditionContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterIfStatementBooleanCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitIfStatementBooleanCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitIfStatementBooleanCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IfStatementNumericalConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__5);
				setState(89);
				((IfStatementNumericalConditionContext)_localctx).e1 = conditionsNumerical();
				setState(90);
				match(T__6);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << ID))) != 0)) {
					{
					{
					setState(91);
					((IfStatementNumericalConditionContext)_localctx).statement = statement();
					((IfStatementNumericalConditionContext)_localctx).s1.add(((IfStatementNumericalConditionContext)_localctx).statement);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new IfStatementBooleanConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__5);
				setState(100);
				((IfStatementBooleanConditionContext)_localctx).e1 = conditionsBoolean(0);
				setState(101);
				match(T__6);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << ID))) != 0)) {
					{
					{
					setState(102);
					((IfStatementBooleanConditionContext)_localctx).statement = statement();
					((IfStatementBooleanConditionContext)_localctx).s1.add(((IfStatementBooleanConditionContext)_localctx).statement);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_else_statementContext extends ParserRuleContext {
		public If_else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_statement; }
	 
		public If_else_statementContext() { }
		public void copyFrom(If_else_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseStatementBooleanConditionContext extends If_else_statementContext {
		public ConditionsBooleanContext e1;
		public StatementContext statement;
		public List<StatementContext> s1 = new ArrayList<StatementContext>();
		public List<StatementContext> s2 = new ArrayList<StatementContext>();
		public ConditionsBooleanContext conditionsBoolean() {
			return getRuleContext(ConditionsBooleanContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseStatementBooleanConditionContext(If_else_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterIfElseStatementBooleanCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitIfElseStatementBooleanCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitIfElseStatementBooleanCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStatementNumericalConditionContext extends If_else_statementContext {
		public ConditionsNumericalContext e1;
		public StatementContext statement;
		public List<StatementContext> s1 = new ArrayList<StatementContext>();
		public List<StatementContext> s2 = new ArrayList<StatementContext>();
		public ConditionsNumericalContext conditionsNumerical() {
			return getRuleContext(ConditionsNumericalContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseStatementNumericalConditionContext(If_else_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterIfElseStatementNumericalCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitIfElseStatementNumericalCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitIfElseStatementNumericalCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_statementContext if_else_statement() throws RecognitionException {
		If_else_statementContext _localctx = new If_else_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_else_statement);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new IfElseStatementNumericalConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__5);
				setState(113);
				((IfElseStatementNumericalConditionContext)_localctx).e1 = conditionsNumerical();
				setState(114);
				match(T__6);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << ID))) != 0)) {
					{
					{
					setState(115);
					((IfElseStatementNumericalConditionContext)_localctx).statement = statement();
					((IfElseStatementNumericalConditionContext)_localctx).s1.add(((IfElseStatementNumericalConditionContext)_localctx).statement);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(T__8);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << ID))) != 0)) {
					{
					{
					setState(122);
					((IfElseStatementNumericalConditionContext)_localctx).statement = statement();
					((IfElseStatementNumericalConditionContext)_localctx).s2.add(((IfElseStatementNumericalConditionContext)_localctx).statement);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new IfElseStatementBooleanConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__5);
				setState(131);
				((IfElseStatementBooleanConditionContext)_localctx).e1 = conditionsBoolean(0);
				setState(132);
				match(T__6);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << ID))) != 0)) {
					{
					{
					setState(133);
					((IfElseStatementBooleanConditionContext)_localctx).statement = statement();
					((IfElseStatementBooleanConditionContext)_localctx).s1.add(((IfElseStatementBooleanConditionContext)_localctx).statement);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(T__8);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << ID))) != 0)) {
					{
					{
					setState(140);
					((IfElseStatementBooleanConditionContext)_localctx).statement = statement();
					((IfElseStatementBooleanConditionContext)_localctx).s2.add(((IfElseStatementBooleanConditionContext)_localctx).statement);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	 
		public While_loopContext() { }
		public void copyFrom(While_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileBooleanConditionContext extends While_loopContext {
		public ConditionsBooleanContext e1;
		public StatementContext statement;
		public List<StatementContext> s1 = new ArrayList<StatementContext>();
		public ConditionsBooleanContext conditionsBoolean() {
			return getRuleContext(ConditionsBooleanContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileBooleanConditionContext(While_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterWhileBooleanCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitWhileBooleanCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitWhileBooleanCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileNumericalConditionContext extends While_loopContext {
		public ConditionsNumericalContext e1;
		public StatementContext statement;
		public List<StatementContext> s1 = new ArrayList<StatementContext>();
		public ConditionsNumericalContext conditionsNumerical() {
			return getRuleContext(ConditionsNumericalContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileNumericalConditionContext(While_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).enterWhileNumericalCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleCalcListener ) ((simpleCalcListener)listener).exitWhileNumericalCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleCalcVisitor ) return ((simpleCalcVisitor<? extends T>)visitor).visitWhileNumericalCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_loop);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new WhileNumericalConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(T__9);
				setState(151);
				((WhileNumericalConditionContext)_localctx).e1 = conditionsNumerical();
				setState(152);
				match(T__6);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << ID))) != 0)) {
					{
					{
					setState(153);
					((WhileNumericalConditionContext)_localctx).statement = statement();
					((WhileNumericalConditionContext)_localctx).s1.add(((WhileNumericalConditionContext)_localctx).statement);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new WhileBooleanConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__9);
				setState(162);
				((WhileBooleanConditionContext)_localctx).e1 = conditionsBoolean(0);
				setState(163);
				match(T__6);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << ID))) != 0)) {
					{
					{
					setState(164);
					((WhileBooleanConditionContext)_localctx).statement = statement();
					((WhileBooleanConditionContext)_localctx).s1.add(((WhileBooleanConditionContext)_localctx).statement);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 4:
			return conditionsBoolean_sempred((ConditionsBooleanContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean conditionsBoolean_sempred(ConditionsBooleanContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64\13\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6C\n\6\3\6\3\6"+
		"\3\6\7\6H\n\6\f\6\16\6K\13\6\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\7\bT\n\b\f\b"+
		"\16\bW\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\tj\n\t\f\t\16\tm\13\t\3\t\3\t\5\tq\n\t\3\n\3\n\3\n\3"+
		"\n\7\nw\n\n\f\n\16\nz\13\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3\n\3\n\7\n\u0090"+
		"\n\n\f\n\16\n\u0093\13\n\3\n\3\n\5\n\u0097\n\n\3\13\3\13\3\13\3\13\7\13"+
		"\u009d\n\13\f\13\16\13\u00a0\13\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00a8\n\13\f\13\16\13\u00ab\13\13\3\13\3\13\5\13\u00af\n\13\3\13\2\4"+
		"\6\n\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u00bc\2\26\3\2\2\2\4\33\3\2\2\2\6"+
		"(\3\2\2\2\b\65\3\2\2\2\nB\3\2\2\2\fP\3\2\2\2\16U\3\2\2\2\20p\3\2\2\2\22"+
		"\u0096\3\2\2\2\24\u00ae\3\2\2\2\26\27\7\3\2\2\27\30\5\16\b\2\30\31\7\4"+
		"\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\7\21\2\2\34\35\7\5\2\2\35\36\5\6"+
		"\4\2\36\5\3\2\2\2\37 \b\4\1\2 !\7\6\2\2!\"\5\6\4\2\"#\7\7\2\2#)\3\2\2"+
		"\2$)\7\22\2\2%)\7\21\2\2&\'\7\17\2\2\')\7\22\2\2(\37\3\2\2\2($\3\2\2\2"+
		"(%\3\2\2\2(&\3\2\2\2)\62\3\2\2\2*+\f\7\2\2+,\7\20\2\2,\61\5\6\4\b-.\f"+
		"\6\2\2./\7\17\2\2/\61\5\6\4\7\60*\3\2\2\2\60-\3\2\2\2\61\64\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2\64\62\3\2\2\2\65\66\5\6\4\2\66"+
		"\67\7\r\2\2\678\5\6\4\28\t\3\2\2\29:\b\6\1\2:;\5\b\5\2;<\7\16\2\2<=\5"+
		"\b\5\2=C\3\2\2\2>?\7\6\2\2?@\5\n\6\2@A\7\7\2\2AC\3\2\2\2B9\3\2\2\2B>\3"+
		"\2\2\2CI\3\2\2\2DE\f\4\2\2EF\7\16\2\2FH\5\n\6\5GD\3\2\2\2HK\3\2\2\2IG"+
		"\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2\2LQ\5\4\3\2MQ\5\20\t\2NQ\5\22\n"+
		"\2OQ\5\24\13\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\r\3\2\2\2RT\5"+
		"\f\7\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\5"+
		"\6\4\2Y\17\3\2\2\2Z[\7\b\2\2[\\\5\b\5\2\\`\7\t\2\2]_\5\f\7\2^]\3\2\2\2"+
		"_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\n\2\2dq\3\2\2\2"+
		"ef\7\b\2\2fg\5\n\6\2gk\7\t\2\2hj\5\f\7\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\n\2\2oq\3\2\2\2pZ\3\2\2\2pe\3\2\2\2"+
		"q\21\3\2\2\2rs\7\b\2\2st\5\b\5\2tx\7\t\2\2uw\5\f\7\2vu\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{\177\7\13\2\2|~\5\f\7\2}|\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0082\u0083\7\n\2\2\u0083\u0097\3\2\2\2\u0084\u0085"+
		"\7\b\2\2\u0085\u0086\5\n\6\2\u0086\u008a\7\t\2\2\u0087\u0089\5\f\7\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0091\7\13\2\2\u008e"+
		"\u0090\5\f\7\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7\n\2\2\u0095\u0097\3\2\2\2\u0096r\3\2\2\2\u0096\u0084\3\2\2\2"+
		"\u0097\23\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009a\5\b\5\2\u009a\u009e"+
		"\7\t\2\2\u009b\u009d\5\f\7\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\7\n\2\2\u00a2\u00af\3\2\2\2\u00a3\u00a4\7\f\2\2\u00a4"+
		"\u00a5\5\n\6\2\u00a5\u00a9\7\t\2\2\u00a6\u00a8\5\f\7\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\n\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u0098\3\2\2\2\u00ae\u00a3\3\2\2\2\u00af\25\3\2\2\2\24(\60\62"+
		"BIPU`kpx\177\u008a\u0091\u0096\u009e\u00a9\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}