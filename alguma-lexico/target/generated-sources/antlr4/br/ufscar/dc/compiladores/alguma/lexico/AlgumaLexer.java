// Generated from br/ufscar/dc/compiladores/alguma/lexico/AlgumaLexer.g4 by ANTLR 4.12.0
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, IDENT=2, CADEIA=3, COMENTARIO=4, WS=5, SEPARADOR=6, DELIM=7, 
		ABREPAR=8, FECHAPAR=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "IDENT", "CADEIA", "COMENTARIO", "WS", "SEPARADOR", 
			"DELIM", "ABREPAR", "FECHAPAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "','", "':'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "IDENT", "CADEIA", "COMENTARIO", "WS", "SEPARADOR", 
			"DELIM", "ABREPAR", "FECHAPAR"
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
		case 3:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
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
		"\u0004\u0000\tk\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000J\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0005\u0002P\b\u0002\n\u0002\f\u0002S\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003Y\b"+
		"\u0003\n\u0003\f\u0003\\\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0000\u0000\t\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0001\u0000\u0003\u0001\u0000\"\"\u0001\u0000}}\u0003\u0000"+
		"\t\n\r\r  r\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0001I\u0001\u0000\u0000\u0000\u0003"+
		"K\u0001\u0000\u0000\u0000\u0005M\u0001\u0000\u0000\u0000\u0007V\u0001"+
		"\u0000\u0000\u0000\t`\u0001\u0000\u0000\u0000\u000bc\u0001\u0000\u0000"+
		"\u0000\re\u0001\u0000\u0000\u0000\u000fg\u0001\u0000\u0000\u0000\u0011"+
		"i\u0001\u0000\u0000\u0000\u0013\u0014\u0005a\u0000\u0000\u0014\u0015\u0005"+
		"l\u0000\u0000\u0015\u0016\u0005g\u0000\u0000\u0016\u0017\u0005o\u0000"+
		"\u0000\u0017\u0018\u0005r\u0000\u0000\u0018\u0019\u0005i\u0000\u0000\u0019"+
		"\u001a\u0005t\u0000\u0000\u001a\u001b\u0005m\u0000\u0000\u001bJ\u0005"+
		"o\u0000\u0000\u001c\u001d\u0005d\u0000\u0000\u001d\u001e\u0005e\u0000"+
		"\u0000\u001e\u001f\u0005c\u0000\u0000\u001f \u0005l\u0000\u0000 !\u0005"+
		"a\u0000\u0000!\"\u0005r\u0000\u0000\"J\u0005e\u0000\u0000#$\u0005l\u0000"+
		"\u0000$%\u0005i\u0000\u0000%&\u0005t\u0000\u0000&\'\u0005e\u0000\u0000"+
		"\'(\u0005r\u0000\u0000()\u0005a\u0000\u0000)J\u0005l\u0000\u0000*+\u0005"+
		"i\u0000\u0000+,\u0005n\u0000\u0000,-\u0005t\u0000\u0000-.\u0005e\u0000"+
		"\u0000./\u0005i\u0000\u0000/0\u0005r\u0000\u00000J\u0005o\u0000\u0000"+
		"12\u0005l\u0000\u000023\u0005e\u0000\u000034\u0005i\u0000\u00004J\u0005"+
		"a\u0000\u000056\u0005e\u0000\u000067\u0005s\u0000\u000078\u0005c\u0000"+
		"\u000089\u0005r\u0000\u00009:\u0005e\u0000\u0000:;\u0005v\u0000\u0000"+
		";J\u0005a\u0000\u0000<=\u0005f\u0000\u0000=>\u0005i\u0000\u0000>?\u0005"+
		"m\u0000\u0000?@\u0005_\u0000\u0000@A\u0005a\u0000\u0000AB\u0005l\u0000"+
		"\u0000BC\u0005g\u0000\u0000CD\u0005o\u0000\u0000DE\u0005r\u0000\u0000"+
		"EF\u0005i\u0000\u0000FG\u0005t\u0000\u0000GH\u0005m\u0000\u0000HJ\u0005"+
		"o\u0000\u0000I\u0013\u0001\u0000\u0000\u0000I\u001c\u0001\u0000\u0000"+
		"\u0000I#\u0001\u0000\u0000\u0000I*\u0001\u0000\u0000\u0000I1\u0001\u0000"+
		"\u0000\u0000I5\u0001\u0000\u0000\u0000I<\u0001\u0000\u0000\u0000J\u0002"+
		"\u0001\u0000\u0000\u0000KL\u0002az\u0000L\u0004\u0001\u0000\u0000\u0000"+
		"MQ\u0005\"\u0000\u0000NP\b\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005\"\u0000"+
		"\u0000U\u0006\u0001\u0000\u0000\u0000VZ\u0005{\u0000\u0000WY\b\u0001\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000]^\u0005}\u0000\u0000^_\u0006\u0003\u0000\u0000_\b\u0001"+
		"\u0000\u0000\u0000`a\u0007\u0002\u0000\u0000ab\u0006\u0004\u0001\u0000"+
		"b\n\u0001\u0000\u0000\u0000cd\u0005,\u0000\u0000d\f\u0001\u0000\u0000"+
		"\u0000ef\u0005:\u0000\u0000f\u000e\u0001\u0000\u0000\u0000gh\u0005(\u0000"+
		"\u0000h\u0010\u0001\u0000\u0000\u0000ij\u0005)\u0000\u0000j\u0012\u0001"+
		"\u0000\u0000\u0000\u0004\u0000IQZ\u0002\u0001\u0003\u0000\u0001\u0004"+
		"\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}