// Generated from c:\Users\fehie\OneDrive\�rea de Trabalho\Faculdade\Compiladores\t1\t1-compila-dores\alguma-lexico\src\main\antlr4\br\u005Cufscar\dc\compiladores\alguma\lexico\AlgumaLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLexerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, COMENTARIO=51, WS=52, 
		IDENT=53, CADEIA=54, NUM_INT=55, NUM_REAL=56, OP_REL=57, SOMA=58, SUBTRACAO=59, 
		MULTIPLICACAO=60, DIVISAO=61, RESTO=62, SEPARADOR=63, DELIM=64, ABREPAR=65, 
		FECHAPAR=66, CADEIA_NAO_FECHADA=67, COMENTARIO_NAO_FECHADO=68, SIMBOLO_NAO_IDENTIFICADO=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "COMENTARIO", "WS", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", 
			"OP_REL", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "RESTO", "SEPARADOR", 
			"DELIM", "ABREPAR", "FECHAPAR", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", 
			"SIMBOLO_NAO_IDENTIFICADO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "'='", 
			"'tipo IDENT'", "'.'", "'['", "']'", "'literal'", "'inteiro'", "'real'", 
			"'logico'", "'^'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", 
			"'procedimento'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", "'var'", 
			"'leia'", "'escreva'", "'se'", "'entao'", "'senao'", "'fim_se'", "'caso'", 
			"'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", "'fim_para'", 
			"'enquanto'", "'fim_enquanto'", "'retorne'", "'..'", "'&'", "'<>'", "'>='", 
			"'<='", "'>'", "'<'", "'nao'", "'ou'", "'e'", null, null, null, null, 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "','", "':'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "COMENTARIO", "WS", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", 
			"OP_REL", "SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "RESTO", "SEPARADOR", 
			"DELIM", "ABREPAR", "FECHAPAR", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", 
			"SIMBOLO_NAO_IDENTIFICADO"
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


	public AlgumaLexerLexer(CharStream input) {
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
		case 50:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u022c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+"+
		"\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\7\64\u01cf\n\64\f\64\16\64\u01d2\13\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\7\66\u01dc\n\66\f\66\16\66\u01df"+
		"\13\66\3\67\3\67\7\67\u01e3\n\67\f\67\16\67\u01e6\13\67\3\67\3\67\38\6"+
		"8\u01eb\n8\r8\168\u01ec\39\69\u01f0\n9\r9\169\u01f1\39\39\69\u01f6\n9"+
		"\r9\169\u01f7\59\u01fa\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0205\n:\3;\3"+
		";\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\7D\u021b\nD\f"+
		"D\16D\u021e\13D\3D\3D\3E\3E\7E\u0224\nE\fE\16E\u0227\13E\3E\3E\3F\3F\2"+
		"\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\3\2"+
		"\n\5\2\f\f\17\17\177\177\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\5"+
		"\2\f\f$$^^\3\2$$\3\2\177\177\t\2##%\'BB]]_`bb\177\u0080\2\u0239\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2"+
		"\2\5\u0097\3\2\2\2\7\u00a5\3\2\2\2\t\u00ad\3\2\2\2\13\u00b7\3\2\2\2\r"+
		"\u00b9\3\2\2\2\17\u00c4\3\2\2\2\21\u00c6\3\2\2\2\23\u00c8\3\2\2\2\25\u00ca"+
		"\3\2\2\2\27\u00d2\3\2\2\2\31\u00da\3\2\2\2\33\u00df\3\2\2\2\35\u00e6\3"+
		"\2\2\2\37\u00e8\3\2\2\2!\u00f3\3\2\2\2#\u00f9\3\2\2\2%\u0102\3\2\2\2\'"+
		"\u010f\3\2\2\2)\u011c\3\2\2\2+\u012d\3\2\2\2-\u0134\3\2\2\2/\u013f\3\2"+
		"\2\2\61\u0143\3\2\2\2\63\u0148\3\2\2\2\65\u0150\3\2\2\2\67\u0153\3\2\2"+
		"\29\u0159\3\2\2\2;\u015f\3\2\2\2=\u0166\3\2\2\2?\u016b\3\2\2\2A\u0170"+
		"\3\2\2\2C\u0179\3\2\2\2E\u017e\3\2\2\2G\u0181\3\2\2\2I\u0185\3\2\2\2K"+
		"\u018a\3\2\2\2M\u0193\3\2\2\2O\u019c\3\2\2\2Q\u01a9\3\2\2\2S\u01b1\3\2"+
		"\2\2U\u01b4\3\2\2\2W\u01b6\3\2\2\2Y\u01b9\3\2\2\2[\u01bc\3\2\2\2]\u01bf"+
		"\3\2\2\2_\u01c1\3\2\2\2a\u01c3\3\2\2\2c\u01c7\3\2\2\2e\u01ca\3\2\2\2g"+
		"\u01cc\3\2\2\2i\u01d6\3\2\2\2k\u01d9\3\2\2\2m\u01e0\3\2\2\2o\u01ea\3\2"+
		"\2\2q\u01ef\3\2\2\2s\u0204\3\2\2\2u\u0206\3\2\2\2w\u0208\3\2\2\2y\u020a"+
		"\3\2\2\2{\u020c\3\2\2\2}\u020e\3\2\2\2\177\u0210\3\2\2\2\u0081\u0212\3"+
		"\2\2\2\u0083\u0214\3\2\2\2\u0085\u0216\3\2\2\2\u0087\u0218\3\2\2\2\u0089"+
		"\u0221\3\2\2\2\u008b\u022a\3\2\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2"+
		"\2\u008f\u0090\7i\2\2\u0090\u0091\7q\2\2\u0091\u0092\7t\2\2\u0092\u0093"+
		"\7k\2\2\u0093\u0094\7v\2\2\u0094\u0095\7o\2\2\u0095\u0096\7q\2\2\u0096"+
		"\4\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7k\2\2\u0099\u009a\7o\2\2\u009a"+
		"\u009b\7a\2\2\u009b\u009c\7c\2\2\u009c\u009d\7n\2\2\u009d\u009e\7i\2\2"+
		"\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2"+
		"\7v\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7q\2\2\u00a4\6\3\2\2\2\u00a5\u00a6"+
		"\7f\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\b\3\2\2\2\u00ad"+
		"\u00ae\7e\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7u\2\2"+
		"\u00b1\u00b2\7v\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\n\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8\f"+
		"\3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7r\2\2\u00bc"+
		"\u00bd\7q\2\2\u00bd\u00be\7\"\2\2\u00be\u00bf\7K\2\2\u00bf\u00c0\7F\2"+
		"\2\u00c0\u00c1\7G\2\2\u00c1\u00c2\7P\2\2\u00c2\u00c3\7V\2\2\u00c3\16\3"+
		"\2\2\2\u00c4\u00c5\7\60\2\2\u00c5\20\3\2\2\2\u00c6\u00c7\7]\2\2\u00c7"+
		"\22\3\2\2\2\u00c8\u00c9\7_\2\2\u00c9\24\3\2\2\2\u00ca\u00cb\7n\2\2\u00cb"+
		"\u00cc\7k\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7t\2\2"+
		"\u00cf\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1\26\3\2\2\2\u00d2\u00d3\7"+
		"k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7q\2\2\u00d9\30\3\2\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7n\2\2\u00de"+
		"\32\3\2\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7i\2\2\u00e2"+
		"\u00e3\7k\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7q\2\2\u00e5\34\3\2\2\2\u00e6"+
		"\u00e7\7`\2\2\u00e7\36\3\2\2\2\u00e8\u00e9\7x\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7t\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7f\2\2"+
		"\u00ee\u00ef\7g\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2"+
		"\7q\2\2\u00f2 \3\2\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6"+
		"\7n\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7q\2\2\u00f8\"\3\2\2\2\u00f9\u00fa"+
		"\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7i\2\2\u00fc\u00fd\7k\2\2\u00fd"+
		"\u00fe\7u\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7q\2\2"+
		"\u0101$\3\2\2\2\u0102\u0103\7h\2\2\u0103\u0104\7k\2\2\u0104\u0105\7o\2"+
		"\2\u0105\u0106\7a\2\2\u0106\u0107\7t\2\2\u0107\u0108\7g\2\2\u0108\u0109"+
		"\7i\2\2\u0109\u010a\7k\2\2\u010a\u010b\7u\2\2\u010b\u010c\7v\2\2\u010c"+
		"\u010d\7t\2\2\u010d\u010e\7q\2\2\u010e&\3\2\2\2\u010f\u0110\7r\2\2\u0110"+
		"\u0111\7t\2\2\u0111\u0112\7q\2\2\u0112\u0113\7e\2\2\u0113\u0114\7g\2\2"+
		"\u0114\u0115\7f\2\2\u0115\u0116\7k\2\2\u0116\u0117\7o\2\2\u0117\u0118"+
		"\7g\2\2\u0118\u0119\7p\2\2\u0119\u011a\7v\2\2\u011a\u011b\7q\2\2\u011b"+
		"(\3\2\2\2\u011c\u011d\7h\2\2\u011d\u011e\7k\2\2\u011e\u011f\7o\2\2\u011f"+
		"\u0120\7a\2\2\u0120\u0121\7r\2\2\u0121\u0122\7t\2\2\u0122\u0123\7q\2\2"+
		"\u0123\u0124\7e\2\2\u0124\u0125\7g\2\2\u0125\u0126\7f\2\2\u0126\u0127"+
		"\7k\2\2\u0127\u0128\7o\2\2\u0128\u0129\7g\2\2\u0129\u012a\7p\2\2\u012a"+
		"\u012b\7v\2\2\u012b\u012c\7q\2\2\u012c*\3\2\2\2\u012d\u012e\7h\2\2\u012e"+
		"\u012f\7w\2\2\u012f\u0130\7p\2\2\u0130\u0131\7e\2\2\u0131\u0132\7c\2\2"+
		"\u0132\u0133\7q\2\2\u0133,\3\2\2\2\u0134\u0135\7h\2\2\u0135\u0136\7k\2"+
		"\2\u0136\u0137\7o\2\2\u0137\u0138\7a\2\2\u0138\u0139\7h\2\2\u0139\u013a"+
		"\7w\2\2\u013a\u013b\7p\2\2\u013b\u013c\7e\2\2\u013c\u013d\7c\2\2\u013d"+
		"\u013e\7q\2\2\u013e.\3\2\2\2\u013f\u0140\7x\2\2\u0140\u0141\7c\2\2\u0141"+
		"\u0142\7t\2\2\u0142\60\3\2\2\2\u0143\u0144\7n\2\2\u0144\u0145\7g\2\2\u0145"+
		"\u0146\7k\2\2\u0146\u0147\7c\2\2\u0147\62\3\2\2\2\u0148\u0149\7g\2\2\u0149"+
		"\u014a\7u\2\2\u014a\u014b\7e\2\2\u014b\u014c\7t\2\2\u014c\u014d\7g\2\2"+
		"\u014d\u014e\7x\2\2\u014e\u014f\7c\2\2\u014f\64\3\2\2\2\u0150\u0151\7"+
		"u\2\2\u0151\u0152\7g\2\2\u0152\66\3\2\2\2\u0153\u0154\7g\2\2\u0154\u0155"+
		"\7p\2\2\u0155\u0156\7v\2\2\u0156\u0157\7c\2\2\u0157\u0158\7q\2\2\u0158"+
		"8\3\2\2\2\u0159\u015a\7u\2\2\u015a\u015b\7g\2\2\u015b\u015c\7p\2\2\u015c"+
		"\u015d\7c\2\2\u015d\u015e\7q\2\2\u015e:\3\2\2\2\u015f\u0160\7h\2\2\u0160"+
		"\u0161\7k\2\2\u0161\u0162\7o\2\2\u0162\u0163\7a\2\2\u0163\u0164\7u\2\2"+
		"\u0164\u0165\7g\2\2\u0165<\3\2\2\2\u0166\u0167\7e\2\2\u0167\u0168\7c\2"+
		"\2\u0168\u0169\7u\2\2\u0169\u016a\7q\2\2\u016a>\3\2\2\2\u016b\u016c\7"+
		"u\2\2\u016c\u016d\7g\2\2\u016d\u016e\7l\2\2\u016e\u016f\7c\2\2\u016f@"+
		"\3\2\2\2\u0170\u0171\7h\2\2\u0171\u0172\7k\2\2\u0172\u0173\7o\2\2\u0173"+
		"\u0174\7a\2\2\u0174\u0175\7e\2\2\u0175\u0176\7c\2\2\u0176\u0177\7u\2\2"+
		"\u0177\u0178\7q\2\2\u0178B\3\2\2\2\u0179\u017a\7r\2\2\u017a\u017b\7c\2"+
		"\2\u017b\u017c\7t\2\2\u017c\u017d\7c\2\2\u017dD\3\2\2\2\u017e\u017f\7"+
		">\2\2\u017f\u0180\7/\2\2\u0180F\3\2\2\2\u0181\u0182\7c\2\2\u0182\u0183"+
		"\7v\2\2\u0183\u0184\7g\2\2\u0184H\3\2\2\2\u0185\u0186\7h\2\2\u0186\u0187"+
		"\7c\2\2\u0187\u0188\7e\2\2\u0188\u0189\7c\2\2\u0189J\3\2\2\2\u018a\u018b"+
		"\7h\2\2\u018b\u018c\7k\2\2\u018c\u018d\7o\2\2\u018d\u018e\7a\2\2\u018e"+
		"\u018f\7r\2\2\u018f\u0190\7c\2\2\u0190\u0191\7t\2\2\u0191\u0192\7c\2\2"+
		"\u0192L\3\2\2\2\u0193\u0194\7g\2\2\u0194\u0195\7p\2\2\u0195\u0196\7s\2"+
		"\2\u0196\u0197\7w\2\2\u0197\u0198\7c\2\2\u0198\u0199\7p\2\2\u0199\u019a"+
		"\7v\2\2\u019a\u019b\7q\2\2\u019bN\3\2\2\2\u019c\u019d\7h\2\2\u019d\u019e"+
		"\7k\2\2\u019e\u019f\7o\2\2\u019f\u01a0\7a\2\2\u01a0\u01a1\7g\2\2\u01a1"+
		"\u01a2\7p\2\2\u01a2\u01a3\7s\2\2\u01a3\u01a4\7w\2\2\u01a4\u01a5\7c\2\2"+
		"\u01a5\u01a6\7p\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7q\2\2\u01a8P\3\2\2"+
		"\2\u01a9\u01aa\7t\2\2\u01aa\u01ab\7g\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad"+
		"\7q\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7p\2\2\u01af\u01b0\7g\2\2\u01b0"+
		"R\3\2\2\2\u01b1\u01b2\7\60\2\2\u01b2\u01b3\7\60\2\2\u01b3T\3\2\2\2\u01b4"+
		"\u01b5\7(\2\2\u01b5V\3\2\2\2\u01b6\u01b7\7>\2\2\u01b7\u01b8\7@\2\2\u01b8"+
		"X\3\2\2\2\u01b9\u01ba\7@\2\2\u01ba\u01bb\7?\2\2\u01bbZ\3\2\2\2\u01bc\u01bd"+
		"\7>\2\2\u01bd\u01be\7?\2\2\u01be\\\3\2\2\2\u01bf\u01c0\7@\2\2\u01c0^\3"+
		"\2\2\2\u01c1\u01c2\7>\2\2\u01c2`\3\2\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5"+
		"\7c\2\2\u01c5\u01c6\7q\2\2\u01c6b\3\2\2\2\u01c7\u01c8\7q\2\2\u01c8\u01c9"+
		"\7w\2\2\u01c9d\3\2\2\2\u01ca\u01cb\7g\2\2\u01cbf\3\2\2\2\u01cc\u01d0\7"+
		"}\2\2\u01cd\u01cf\n\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d3\u01d4\7\177\2\2\u01d4\u01d5\b\64\2\2\u01d5h\3\2\2\2\u01d6\u01d7"+
		"\t\3\2\2\u01d7\u01d8\b\65\3\2\u01d8j\3\2\2\2\u01d9\u01dd\t\4\2\2\u01da"+
		"\u01dc\t\5\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01del\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e4"+
		"\7$\2\2\u01e1\u01e3\n\6\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7\u01e8\7$\2\2\u01e8n\3\2\2\2\u01e9\u01eb\4\62;\2\u01ea\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"p\3\2\2\2\u01ee\u01f0\4\62;\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2"+
		"\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f9\3\2\2\2\u01f3\u01f5"+
		"\7\60\2\2\u01f4\u01f6\4\62;\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2"+
		"\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f3"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01far\3\2\2\2\u01fb\u0205\7@\2\2\u01fc\u01fd"+
		"\7@\2\2\u01fd\u0205\7?\2\2\u01fe\u0205\7>\2\2\u01ff\u0200\7>\2\2\u0200"+
		"\u0205\7?\2\2\u0201\u0202\7>\2\2\u0202\u0205\7@\2\2\u0203\u0205\7?\2\2"+
		"\u0204\u01fb\3\2\2\2\u0204\u01fc\3\2\2\2\u0204\u01fe\3\2\2\2\u0204\u01ff"+
		"\3\2\2\2\u0204\u0201\3\2\2\2\u0204\u0203\3\2\2\2\u0205t\3\2\2\2\u0206"+
		"\u0207\7-\2\2\u0207v\3\2\2\2\u0208\u0209\7/\2\2\u0209x\3\2\2\2\u020a\u020b"+
		"\7,\2\2\u020bz\3\2\2\2\u020c\u020d\7\61\2\2\u020d|\3\2\2\2\u020e\u020f"+
		"\7\'\2\2\u020f~\3\2\2\2\u0210\u0211\7.\2\2\u0211\u0080\3\2\2\2\u0212\u0213"+
		"\7<\2\2\u0213\u0082\3\2\2\2\u0214\u0215\7*\2\2\u0215\u0084\3\2\2\2\u0216"+
		"\u0217\7+\2\2\u0217\u0086\3\2\2\2\u0218\u021c\7$\2\2\u0219\u021b\n\7\2"+
		"\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220\7\f\2\2\u0220"+
		"\u0088\3\2\2\2\u0221\u0225\7}\2\2\u0222\u0224\n\b\2\2\u0223\u0222\3\2"+
		"\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0228\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229\7\f\2\2\u0229\u008a\3\2"+
		"\2\2\u022a\u022b\t\t\2\2\u022b\u008c\3\2\2\2\16\2\u01d0\u01db\u01dd\u01e4"+
		"\u01ec\u01f1\u01f7\u01f9\u0204\u021c\u0225\4\3\64\2\3\65\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}