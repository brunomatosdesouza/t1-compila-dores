// Generated from c:\Users\fehie\OneDrive\Área de Trabalho\Faculdade\Compiladores\t1\t1-compila-dores\alguma-lexico\src\main\antlr4\br\u005Cufscar\dc\compiladores\alguma\lexico\AlgumaLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO=1, WS=2, PALAVRA_CHAVE=3, TIPOS=4, IDENT=5, CADEIA=6, NUM_INT=7, 
		NUM_REAL=8, OP_REL=9, SOMA=10, SUBTRACAO=11, MULTIPLICACAO=12, DIVISAO=13, 
		RESTO=14, SEPARADOR=15, DELIM=16, ABREPAR=17, FECHAPAR=18, CADEIA_NAO_FECHADA=19, 
		COMENTARIO_NAO_FECHADO=20, SIMBOLO_NAO_IDENTIFICADO=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMENTARIO", "WS", "PALAVRA_CHAVE", "TIPOS", "IDENT", "CADEIA", "NUM_INT", 
			"NUM_REAL", "OP_REL", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", 
			"RESTO", "SEPARADOR", "DELIM", "ABREPAR", "FECHAPAR", "CADEIA_NAO_FECHADA", 
			"COMENTARIO_NAO_FECHADO", "SIMBOLO_NAO_IDENTIFICADO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "','", "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIO", "WS", "PALAVRA_CHAVE", "TIPOS", "IDENT", "CADEIA", 
			"NUM_INT", "NUM_REAL", "OP_REL", "SOMA", "SUBTRACAO", "MULTIPLICACAO", 
			"DIVISAO", "RESTO", "SEPARADOR", "DELIM", "ABREPAR", "FECHAPAR", "CADEIA_NAO_FECHADA", 
			"COMENTARIO_NAO_FECHADO", "SIMBOLO_NAO_IDENTIFICADO"
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


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgumaLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u018c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0114"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0138\n\5\3\6\3\6\7\6\u013c\n\6\f\6\16\6\u013f\13\6\3\7\3\7\7\7\u0143"+
		"\n\7\f\7\16\7\u0146\13\7\3\7\3\7\3\b\6\b\u014b\n\b\r\b\16\b\u014c\3\t"+
		"\6\t\u0150\n\t\r\t\16\t\u0151\3\t\3\t\6\t\u0156\n\t\r\t\16\t\u0157\5\t"+
		"\u015a\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0165\n\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\7\24\u017b\n\24\f\24\16\24\u017e\13\24\3\24\3\24\3\25"+
		"\3\25\7\25\u0184\n\25\f\25\16\25\u0187\13\25\3\25\3\25\3\26\3\26\2\2\27"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27\3\2\13\5\2\f\f\17\17\177\177\5\2\13\f"+
		"\17\17\"\"\5\2((]]_`\4\2C\\c|\6\2\62;C\\aac|\5\2\f\f$$^^\3\2$$\3\2\177"+
		"\177\t\2##%\'BB]]_`bb\177\u0080\2\u01c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\67\3\2\2\2\7\u0113\3\2\2\2\t\u0137\3"+
		"\2\2\2\13\u0139\3\2\2\2\r\u0140\3\2\2\2\17\u014a\3\2\2\2\21\u014f\3\2"+
		"\2\2\23\u0164\3\2\2\2\25\u0166\3\2\2\2\27\u0168\3\2\2\2\31\u016a\3\2\2"+
		"\2\33\u016c\3\2\2\2\35\u016e\3\2\2\2\37\u0170\3\2\2\2!\u0172\3\2\2\2#"+
		"\u0174\3\2\2\2%\u0176\3\2\2\2\'\u0178\3\2\2\2)\u0181\3\2\2\2+\u018a\3"+
		"\2\2\2-\61\7}\2\2.\60\n\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\177\2\2\65\66\b\2\2\2\66"+
		"\4\3\2\2\2\678\t\3\2\289\b\3\3\29\6\3\2\2\2:;\7c\2\2;<\7n\2\2<=\7i\2\2"+
		"=>\7q\2\2>?\7t\2\2?@\7k\2\2@A\7v\2\2AB\7o\2\2B\u0114\7q\2\2CD\7f\2\2D"+
		"E\7g\2\2EF\7e\2\2FG\7n\2\2GH\7c\2\2HI\7t\2\2I\u0114\7g\2\2JK\7t\2\2KL"+
		"\7g\2\2LM\7i\2\2MN\7k\2\2NO\7u\2\2OP\7v\2\2PQ\7t\2\2Q\u0114\7q\2\2R\u0114"+
		"\7\60\2\2ST\7u\2\2T\u0114\7g\2\2UV\7e\2\2VW\7c\2\2WX\7u\2\2X\u0114\7q"+
		"\2\2YZ\7g\2\2Z[\7p\2\2[\\\7v\2\2\\]\7c\2\2]\u0114\7q\2\2^_\7u\2\2_`\7"+
		"g\2\2`a\7p\2\2ab\7c\2\2b\u0114\7q\2\2cd\7r\2\2de\7c\2\2ef\7t\2\2f\u0114"+
		"\7c\2\2gh\7c\2\2hi\7v\2\2i\u0114\7g\2\2jk\7\60\2\2k\u0114\7\60\2\2lm\7"+
		"h\2\2mn\7c\2\2no\7e\2\2o\u0114\7c\2\2pq\7g\2\2qr\7p\2\2rs\7s\2\2st\7w"+
		"\2\2tu\7c\2\2uv\7p\2\2vw\7v\2\2w\u0114\7q\2\2xy\7n\2\2yz\7g\2\2z{\7k\2"+
		"\2{\u0114\7c\2\2|}\7g\2\2}~\7u\2\2~\177\7e\2\2\177\u0080\7t\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7x\2\2\u0082\u0114\7c\2\2\u0083\u0114\t\4\2"+
		"\2\u0084\u0085\7r\2\2\u0085\u0086\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7e\2\2\u0088\u0089\7g\2\2\u0089\u008a\7f\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7o\2\2\u008c\u008d\7g\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2"+
		"\u008f\u0114\7q\2\2\u0090\u0091\7h\2\2\u0091\u0092\7w\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7e\2\2\u0094\u0095\7c\2\2\u0095\u0114\7q\2\2\u0096"+
		"\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7v\2\2\u0099\u009a\7q\2\2"+
		"\u009a\u009b\7t\2\2\u009b\u009c\7p\2\2\u009c\u0114\7g\2\2\u009d\u009e"+
		"\7>\2\2\u009e\u0114\7/\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7q\2\2\u00a1"+
		"\u00a2\7i\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7e\2\2\u00a4\u0114\7q\2\2"+
		"\u00a5\u00a6\7p\2\2\u00a6\u00a7\7c\2\2\u00a7\u0114\7q\2\2\u00a8\u0114"+
		"\7g\2\2\u00a9\u00aa\7q\2\2\u00aa\u0114\7w\2\2\u00ab\u00ac\7u\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00ae\7l\2\2\u00ae\u0114\7c\2\2\u00af\u00b0\7h\2\2"+
		"\u00b0\u00b1\7c\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7u\2\2\u00b3\u0114"+
		"\7q\2\2\u00b4\u00b5\7x\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7t\2\2\u00b7"+
		"\u00b8\7f\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7g\2\2"+
		"\u00bb\u00bc\7k\2\2\u00bc\u00bd\7t\2\2\u00bd\u0114\7q\2\2\u00be\u00bf"+
		"\7h\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7a\2\2\u00c2"+
		"\u00c3\7u\2\2\u00c3\u0114\7g\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7k\2\2"+
		"\u00c6\u00c7\7o\2\2\u00c7\u00c8\7a\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca"+
		"\7c\2\2\u00ca\u00cb\7u\2\2\u00cb\u0114\7q\2\2\u00cc\u00cd\7h\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7a\2\2\u00d0\u00d1\7r\2\2"+
		"\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3\u0114\7c\2\2\u00d4\u00d5"+
		"\7h\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7a\2\2\u00d8"+
		"\u00d9\7g\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7s\2\2\u00db\u00dc\7w\2\2"+
		"\u00dc\u00dd\7c\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\u0114"+
		"\7q\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7o\2\2\u00e3"+
		"\u00e4\7a\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7i\2\2"+
		"\u00e7\u00e8\7k\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb"+
		"\7t\2\2\u00eb\u0114\7q\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7o\2\2\u00ef\u00f0\7a\2\2\u00f0\u00f1\7h\2\2\u00f1\u00f2\7w\2\2"+
		"\u00f2\u00f3\7p\2\2\u00f3\u00f4\7e\2\2\u00f4\u00f5\7c\2\2\u00f5\u0114"+
		"\7q\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7o\2\2\u00f9"+
		"\u00fa\7a\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7q\2\2"+
		"\u00fd\u00fe\7e\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7f\2\2\u0100\u0101"+
		"\7k\2\2\u0101\u0102\7o\2\2\u0102\u0103\7g\2\2\u0103\u0104\7p\2\2\u0104"+
		"\u0105\7v\2\2\u0105\u0114\7q\2\2\u0106\u0107\7h\2\2\u0107\u0108\7k\2\2"+
		"\u0108\u0109\7o\2\2\u0109\u010a\7a\2\2\u010a\u010b\7c\2\2\u010b\u010c"+
		"\7n\2\2\u010c\u010d\7i\2\2\u010d\u010e\7q\2\2\u010e\u010f\7t\2\2\u010f"+
		"\u0110\7k\2\2\u0110\u0111\7v\2\2\u0111\u0112\7o\2\2\u0112\u0114\7q\2\2"+
		"\u0113:\3\2\2\2\u0113C\3\2\2\2\u0113J\3\2\2\2\u0113R\3\2\2\2\u0113S\3"+
		"\2\2\2\u0113U\3\2\2\2\u0113Y\3\2\2\2\u0113^\3\2\2\2\u0113c\3\2\2\2\u0113"+
		"g\3\2\2\2\u0113j\3\2\2\2\u0113l\3\2\2\2\u0113p\3\2\2\2\u0113x\3\2\2\2"+
		"\u0113|\3\2\2\2\u0113\u0083\3\2\2\2\u0113\u0084\3\2\2\2\u0113\u0090\3"+
		"\2\2\2\u0113\u0096\3\2\2\2\u0113\u009d\3\2\2\2\u0113\u009f\3\2\2\2\u0113"+
		"\u00a5\3\2\2\2\u0113\u00a8\3\2\2\2\u0113\u00a9\3\2\2\2\u0113\u00ab\3\2"+
		"\2\2\u0113\u00af\3\2\2\2\u0113\u00b4\3\2\2\2\u0113\u00be\3\2\2\2\u0113"+
		"\u00c4\3\2\2\2\u0113\u00cc\3\2\2\2\u0113\u00d4\3\2\2\2\u0113\u00e0\3\2"+
		"\2\2\u0113\u00ec\3\2\2\2\u0113\u00f6\3\2\2\2\u0113\u0106\3\2\2\2\u0114"+
		"\b\3\2\2\2\u0115\u0116\7n\2\2\u0116\u0117\7k\2\2\u0117\u0118\7v\2\2\u0118"+
		"\u0119\7g\2\2\u0119\u011a\7t\2\2\u011a\u011b\7c\2\2\u011b\u0138\7n\2\2"+
		"\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2\u011e\u011f\7v\2\2\u011f\u0120"+
		"\7g\2\2\u0120\u0121\7k\2\2\u0121\u0122\7t\2\2\u0122\u0138\7q\2\2\u0123"+
		"\u0124\7t\2\2\u0124\u0125\7g\2\2\u0125\u0126\7c\2\2\u0126\u0138\7n\2\2"+
		"\u0127\u0128\7e\2\2\u0128\u0129\7q\2\2\u0129\u012a\7p\2\2\u012a\u012b"+
		"\7u\2\2\u012b\u012c\7v\2\2\u012c\u012d\7c\2\2\u012d\u012e\7p\2\2\u012e"+
		"\u012f\7v\2\2\u012f\u0138\7g\2\2\u0130\u0131\7v\2\2\u0131\u0132\7k\2\2"+
		"\u0132\u0133\7r\2\2\u0133\u0138\7q\2\2\u0134\u0135\7x\2\2\u0135\u0136"+
		"\7c\2\2\u0136\u0138\7t\2\2\u0137\u0115\3\2\2\2\u0137\u011c\3\2\2\2\u0137"+
		"\u0123\3\2\2\2\u0137\u0127\3\2\2\2\u0137\u0130\3\2\2\2\u0137\u0134\3\2"+
		"\2\2\u0138\n\3\2\2\2\u0139\u013d\t\5\2\2\u013a\u013c\t\6\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\f\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0144\7$\2\2\u0141\u0143\n\7\2\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7$\2\2\u0148"+
		"\16\3\2\2\2\u0149\u014b\4\62;\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2"+
		"\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\20\3\2\2\2\u014e\u0150"+
		"\4\62;\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0159\3\2\2\2\u0153\u0155\7\60\2\2\u0154\u0156\4"+
		"\62;\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\22\3\2\2\2\u015b\u0165\7@\2\2\u015c\u015d\7@\2\2\u015d\u0165"+
		"\7?\2\2\u015e\u0165\7>\2\2\u015f\u0160\7>\2\2\u0160\u0165\7?\2\2\u0161"+
		"\u0162\7>\2\2\u0162\u0165\7@\2\2\u0163\u0165\7?\2\2\u0164\u015b\3\2\2"+
		"\2\u0164\u015c\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u015f\3\2\2\2\u0164\u0161"+
		"\3\2\2\2\u0164\u0163\3\2\2\2\u0165\24\3\2\2\2\u0166\u0167\7-\2\2\u0167"+
		"\26\3\2\2\2\u0168\u0169\7/\2\2\u0169\30\3\2\2\2\u016a\u016b\7,\2\2\u016b"+
		"\32\3\2\2\2\u016c\u016d\7\61\2\2\u016d\34\3\2\2\2\u016e\u016f\7\'\2\2"+
		"\u016f\36\3\2\2\2\u0170\u0171\7.\2\2\u0171 \3\2\2\2\u0172\u0173\7<\2\2"+
		"\u0173\"\3\2\2\2\u0174\u0175\7*\2\2\u0175$\3\2\2\2\u0176\u0177\7+\2\2"+
		"\u0177&\3\2\2\2\u0178\u017c\7$\2\2\u0179\u017b\n\b\2\2\u017a\u0179\3\2"+
		"\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\f\2\2\u0180(\3\2\2\2"+
		"\u0181\u0185\7}\2\2\u0182\u0184\n\t\2\2\u0183\u0182\3\2\2\2\u0184\u0187"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0188\u0189\7\f\2\2\u0189*\3\2\2\2\u018a\u018b\t\n\2\2"+
		"\u018b,\3\2\2\2\20\2\61\u0113\u0137\u013b\u013d\u0144\u014c\u0151\u0157"+
		"\u0159\u0164\u017c\u0185\4\3\2\2\3\3\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}