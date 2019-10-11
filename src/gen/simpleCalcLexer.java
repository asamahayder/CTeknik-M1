// Generated from C:/Users/asama/IdeaProjects/CTeknik-M1/src\simpleCalc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, COND1=11, COND2=12, OP1=13, OP2=14, ID=15, FLOAT=16, ALPHA=17, 
		NUM=18, WHITESPACE=19, COMMENT=20, COMMENT2=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "COND1", "COND2", "OP1", "OP2", "ID", "FLOAT", "ALPHA", "NUM", 
			"WHITESPACE", "COMMENT", "COMMENT2"
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


	public simpleCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpleCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\fZ\n\f\3\r\3\r\3\r\3\r\5\r`\n\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\7\20i\n\20\f\20\16\20l\13\20\3\21\6\21o\n\21\r\21"+
		"\16\21p\3\21\3\21\6\21u\n\21\r\21\16\21v\5\21y\n\21\3\22\3\22\3\23\3\23"+
		"\3\24\6\24\u0080\n\24\r\24\16\24\u0081\3\24\3\24\3\25\3\25\3\25\3\25\7"+
		"\25\u008a\n\25\f\25\16\25\u008d\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\7\26\u0097\n\26\f\26\16\26\u009a\13\26\3\26\3\26\3\26\3\26\3"+
		"\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\13\4\2>>@@\4\2--//\4\2,,"+
		"\61\61\13\2C\\aac|\u00a7\u00a8\u00ba\u00ba\u00c5\u00c5\u02de\u02de\u2022"+
		"\u2022\u2028\u2028\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61"+
		"\2\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2"+
		"\5\60\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17=\3"+
		"\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25I\3\2\2\2\27Y\3\2\2\2\31_\3\2\2\2\33"+
		"a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!n\3\2\2\2#z\3\2\2\2%|\3\2\2\2\'\177"+
		"\3\2\2\2)\u0085\3\2\2\2+\u0090\3\2\2\2-.\7I\2\2./\7N\2\2/\4\3\2\2\2\60"+
		"\61\7I\2\2\61\62\7I\2\2\62\6\3\2\2\2\63\64\7?\2\2\64\b\3\2\2\2\65\66\7"+
		"*\2\2\66\n\3\2\2\2\678\7+\2\28\f\3\2\2\29:\7k\2\2:;\7h\2\2;<\7*\2\2<\16"+
		"\3\2\2\2=>\7+\2\2>?\7}\2\2?\20\3\2\2\2@A\7\177\2\2A\22\3\2\2\2BC\7\177"+
		"\2\2CD\7g\2\2DE\7n\2\2EF\7u\2\2FG\7g\2\2GH\7}\2\2H\24\3\2\2\2IJ\7y\2\2"+
		"JK\7j\2\2KL\7k\2\2LM\7n\2\2MN\7g\2\2NO\7*\2\2O\26\3\2\2\2PQ\7?\2\2QZ\7"+
		"?\2\2RS\7#\2\2SZ\7?\2\2TZ\t\2\2\2UV\7>\2\2VZ\7?\2\2WX\7@\2\2XZ\7?\2\2"+
		"YP\3\2\2\2YR\3\2\2\2YT\3\2\2\2YU\3\2\2\2YW\3\2\2\2Z\30\3\2\2\2[\\\7(\2"+
		"\2\\`\7(\2\2]^\7~\2\2^`\7~\2\2_[\3\2\2\2_]\3\2\2\2`\32\3\2\2\2ab\t\3\2"+
		"\2b\34\3\2\2\2cd\t\4\2\2d\36\3\2\2\2ej\5#\22\2fi\5#\22\2gi\5%\23\2hf\3"+
		"\2\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k \3\2\2\2lj\3\2\2\2mo\5"+
		"%\23\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qx\3\2\2\2rt\7\60\2\2su"+
		"\5%\23\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xr\3\2\2\2x"+
		"y\3\2\2\2y\"\3\2\2\2z{\t\5\2\2{$\3\2\2\2|}\t\6\2\2}&\3\2\2\2~\u0080\t"+
		"\7\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\24\2\2\u0084(\3\2\2\2\u0085"+
		"\u0086\7\61\2\2\u0086\u0087\7\61\2\2\u0087\u008b\3\2\2\2\u0088\u008a\n"+
		"\b\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\b\25"+
		"\2\2\u008f*\3\2\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7,\2\2\u0092\u0098"+
		"\3\2\2\2\u0093\u0097\n\t\2\2\u0094\u0095\7,\2\2\u0095\u0097\n\n\2\2\u0096"+
		"\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\7,\2\2\u009c\u009d\7\61\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\26"+
		"\2\2\u009f,\3\2\2\2\16\2Y_hjpvx\u0081\u008b\u0096\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}