// Generated from C:/Users/Azer/Desktop/Java Projects/Main Projects/Bison_to_Antlr/src/main/antlr4\Grammar.g4 by ANTLR 4.8
package azer.freefem;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, FESPACE=57, FESPACE1=58, FESPACE3=59, 
		FESPACES=60, FESPACEL=61, FUNCTION=62, STRING=63, ID=64, LNUM=65, DNUM=66, 
		CNUM=67, WS=68, COMMENT=69, LINE_COMMENT=70;
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
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "FESPACE", 
			"FESPACE1", "FESPACE3", "FESPACES", "FESPACEL", "FUNCTION", "STRING", 
			"ID", "LNUM", "DNUM", "CNUM", "WS", "COMMENT", "LINE_COMMENT", "ExponentPart", 
			"EscapeSequence", "HexDigit", "Digits", "LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'&'", "'['", "']'", "','", "'('", "')'", "'<'", "'>'", 
			"';'", "'{'", "'}'", "'for'", "'while'", "'try'", "'include'", "'load'", 
			"':'", "'if'", "'else'", "'border'", "'break'", "'continue'", "'return'", 
			"'catch'", "'.'", "'-'", "'+'", "'!'", "'++'", "'--'", "'+='", "'-='", 
			"'*='", "'/='", "'.*='", "'./='", "'?'", "'*'", "'.*'", "'./'", "'/'", 
			"'%'", "'<<'", "'>>'", "'&&'", "'|'", "'||'", "'<='", "'>='", "'=='", 
			"'!='", "'^'", "'_'", "'''", "'$'", "'fespace'", "'fespace1'", "'fespace3'", 
			"'fespaces'", "'fespacel'", "'func'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "FESPACE", "FESPACE1", 
			"FESPACE3", "FESPACES", "FESPACEL", "FUNCTION", "STRING", "ID", "LNUM", 
			"DNUM", "CNUM", "WS", "COMMENT", "LINE_COMMENT"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u0218\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3(\3(\3)"+
		"\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\7@\u0182\n@\f@\16@\u0185"+
		"\13@\3@\3@\3A\3A\7A\u018b\nA\fA\16A\u018e\13A\3B\3B\3B\5B\u0193\nB\3B"+
		"\6B\u0196\nB\rB\16B\u0197\3B\5B\u019b\nB\5B\u019d\nB\3B\5B\u01a0\nB\3"+
		"C\3C\3C\5C\u01a5\nC\3C\3C\5C\u01a9\nC\3C\5C\u01ac\nC\3C\5C\u01af\nC\3"+
		"C\3C\3C\5C\u01b4\nC\3C\5C\u01b7\nC\5C\u01b9\nC\3D\5D\u01bc\nD\3D\5D\u01bf"+
		"\nD\3D\5D\u01c2\nD\3D\5D\u01c5\nD\3D\3D\3E\3E\3E\3E\3F\3F\3F\3F\7F\u01d1"+
		"\nF\fF\16F\u01d4\13F\3F\3F\3F\3F\3F\3G\3G\3G\3G\7G\u01df\nG\fG\16G\u01e2"+
		"\13G\3G\3G\3H\3H\5H\u01e8\nH\3H\3H\3I\3I\3I\3I\5I\u01f0\nI\3I\5I\u01f3"+
		"\nI\3I\3I\3I\6I\u01f8\nI\rI\16I\u01f9\3I\3I\3I\3I\3I\5I\u0201\nI\3J\3"+
		"J\3K\3K\7K\u0207\nK\fK\16K\u020a\13K\3K\5K\u020d\nK\3L\3L\5L\u0211\nL"+
		"\3M\3M\3M\3M\5M\u0217\nM\3\u01d2\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f\2\u0091\2\u0093\2\u0095\2\u0097"+
		"\2\u0099\2\3\2\26\6\2\f\f\17\17$$^^\3\2\63;\4\2NNnn\6\2FFHHffhh\3\2//"+
		"\4\2--//\3\2kk\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2GGgg\n\2$$))^^ddhh"+
		"ppttvv\3\2\62\65\3\2\629\5\2\62;CHch\3\2\62;\4\2\62;aa\5\2C\\aac|\4\2"+
		"\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\2\u0231\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u009b"+
		"\3\2\2\2\5\u009d\3\2\2\2\7\u009f\3\2\2\2\t\u00a1\3\2\2\2\13\u00a3\3\2"+
		"\2\2\r\u00a5\3\2\2\2\17\u00a7\3\2\2\2\21\u00a9\3\2\2\2\23\u00ab\3\2\2"+
		"\2\25\u00ad\3\2\2\2\27\u00af\3\2\2\2\31\u00b1\3\2\2\2\33\u00b3\3\2\2\2"+
		"\35\u00b7\3\2\2\2\37\u00bd\3\2\2\2!\u00c1\3\2\2\2#\u00c9\3\2\2\2%\u00ce"+
		"\3\2\2\2\'\u00d0\3\2\2\2)\u00d3\3\2\2\2+\u00d8\3\2\2\2-\u00df\3\2\2\2"+
		"/\u00e5\3\2\2\2\61\u00ee\3\2\2\2\63\u00f5\3\2\2\2\65\u00fb\3\2\2\2\67"+
		"\u00fd\3\2\2\29\u00ff\3\2\2\2;\u0101\3\2\2\2=\u0103\3\2\2\2?\u0106\3\2"+
		"\2\2A\u0109\3\2\2\2C\u010c\3\2\2\2E\u010f\3\2\2\2G\u0112\3\2\2\2I\u0115"+
		"\3\2\2\2K\u0119\3\2\2\2M\u011d\3\2\2\2O\u011f\3\2\2\2Q\u0121\3\2\2\2S"+
		"\u0124\3\2\2\2U\u0127\3\2\2\2W\u0129\3\2\2\2Y\u012b\3\2\2\2[\u012e\3\2"+
		"\2\2]\u0131\3\2\2\2_\u0134\3\2\2\2a\u0136\3\2\2\2c\u0139\3\2\2\2e\u013c"+
		"\3\2\2\2g\u013f\3\2\2\2i\u0142\3\2\2\2k\u0145\3\2\2\2m\u0147\3\2\2\2o"+
		"\u0149\3\2\2\2q\u014b\3\2\2\2s\u014d\3\2\2\2u\u0155\3\2\2\2w\u015e\3\2"+
		"\2\2y\u0167\3\2\2\2{\u0170\3\2\2\2}\u0179\3\2\2\2\177\u017e\3\2\2\2\u0081"+
		"\u0188\3\2\2\2\u0083\u019c\3\2\2\2\u0085\u01b8\3\2\2\2\u0087\u01bb\3\2"+
		"\2\2\u0089\u01c8\3\2\2\2\u008b\u01cc\3\2\2\2\u008d\u01da\3\2\2\2\u008f"+
		"\u01e5\3\2\2\2\u0091\u0200\3\2\2\2\u0093\u0202\3\2\2\2\u0095\u0204\3\2"+
		"\2\2\u0097\u0210\3\2\2\2\u0099\u0216\3\2\2\2\u009b\u009c\7?\2\2\u009c"+
		"\4\3\2\2\2\u009d\u009e\7(\2\2\u009e\6\3\2\2\2\u009f\u00a0\7]\2\2\u00a0"+
		"\b\3\2\2\2\u00a1\u00a2\7_\2\2\u00a2\n\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4"+
		"\f\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6\16\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8"+
		"\20\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\22\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac"+
		"\24\3\2\2\2\u00ad\u00ae\7=\2\2\u00ae\26\3\2\2\2\u00af\u00b0\7}\2\2\u00b0"+
		"\30\3\2\2\2\u00b1\u00b2\7\177\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7h\2\2"+
		"\u00b4\u00b5\7q\2\2\u00b5\u00b6\7t\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7"+
		"y\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc"+
		"\7g\2\2\u00bc\36\3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0"+
		"\7{\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4"+
		"\7e\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7f\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7f\2\2\u00cd$\3\2\2\2\u00ce\u00cf\7<\2\2\u00cf"+
		"&\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7h\2\2\u00d2(\3\2\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"*\3\2\2\2\u00d8\u00d9\7d\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7t\2\2\u00db"+
		"\u00dc\7f\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de,\3\2\2\2\u00df"+
		"\u00e0\7d\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2"+
		"\u00e3\u00e4\7m\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7e\2\2\u00e6\u00e7\7q\2"+
		"\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb"+
		"\7p\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7g\2\2\u00ed\60\3\2\2\2\u00ee\u00ef"+
		"\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7w\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3\u00f4\7p\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7e\2\2\u00f6"+
		"\u00f7\7c\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7j\2\2"+
		"\u00fa\64\3\2\2\2\u00fb\u00fc\7\60\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7"+
		"/\2\2\u00fe8\3\2\2\2\u00ff\u0100\7-\2\2\u0100:\3\2\2\2\u0101\u0102\7#"+
		"\2\2\u0102<\3\2\2\2\u0103\u0104\7-\2\2\u0104\u0105\7-\2\2\u0105>\3\2\2"+
		"\2\u0106\u0107\7/\2\2\u0107\u0108\7/\2\2\u0108@\3\2\2\2\u0109\u010a\7"+
		"-\2\2\u010a\u010b\7?\2\2\u010bB\3\2\2\2\u010c\u010d\7/\2\2\u010d\u010e"+
		"\7?\2\2\u010eD\3\2\2\2\u010f\u0110\7,\2\2\u0110\u0111\7?\2\2\u0111F\3"+
		"\2\2\2\u0112\u0113\7\61\2\2\u0113\u0114\7?\2\2\u0114H\3\2\2\2\u0115\u0116"+
		"\7\60\2\2\u0116\u0117\7,\2\2\u0117\u0118\7?\2\2\u0118J\3\2\2\2\u0119\u011a"+
		"\7\60\2\2\u011a\u011b\7\61\2\2\u011b\u011c\7?\2\2\u011cL\3\2\2\2\u011d"+
		"\u011e\7A\2\2\u011eN\3\2\2\2\u011f\u0120\7,\2\2\u0120P\3\2\2\2\u0121\u0122"+
		"\7\60\2\2\u0122\u0123\7,\2\2\u0123R\3\2\2\2\u0124\u0125\7\60\2\2\u0125"+
		"\u0126\7\61\2\2\u0126T\3\2\2\2\u0127\u0128\7\61\2\2\u0128V\3\2\2\2\u0129"+
		"\u012a\7\'\2\2\u012aX\3\2\2\2\u012b\u012c\7>\2\2\u012c\u012d\7>\2\2\u012d"+
		"Z\3\2\2\2\u012e\u012f\7@\2\2\u012f\u0130\7@\2\2\u0130\\\3\2\2\2\u0131"+
		"\u0132\7(\2\2\u0132\u0133\7(\2\2\u0133^\3\2\2\2\u0134\u0135\7~\2\2\u0135"+
		"`\3\2\2\2\u0136\u0137\7~\2\2\u0137\u0138\7~\2\2\u0138b\3\2\2\2\u0139\u013a"+
		"\7>\2\2\u013a\u013b\7?\2\2\u013bd\3\2\2\2\u013c\u013d\7@\2\2\u013d\u013e"+
		"\7?\2\2\u013ef\3\2\2\2\u013f\u0140\7?\2\2\u0140\u0141\7?\2\2\u0141h\3"+
		"\2\2\2\u0142\u0143\7#\2\2\u0143\u0144\7?\2\2\u0144j\3\2\2\2\u0145\u0146"+
		"\7`\2\2\u0146l\3\2\2\2\u0147\u0148\7a\2\2\u0148n\3\2\2\2\u0149\u014a\7"+
		")\2\2\u014ap\3\2\2\2\u014b\u014c\7&\2\2\u014cr\3\2\2\2\u014d\u014e\7h"+
		"\2\2\u014e\u014f\7g\2\2\u014f\u0150\7u\2\2\u0150\u0151\7r\2\2\u0151\u0152"+
		"\7c\2\2\u0152\u0153\7e\2\2\u0153\u0154\7g\2\2\u0154t\3\2\2\2\u0155\u0156"+
		"\7h\2\2\u0156\u0157\7g\2\2\u0157\u0158\7u\2\2\u0158\u0159\7r\2\2\u0159"+
		"\u015a\7c\2\2\u015a\u015b\7e\2\2\u015b\u015c\7g\2\2\u015c\u015d\7\63\2"+
		"\2\u015dv\3\2\2\2\u015e\u015f\7h\2\2\u015f\u0160\7g\2\2\u0160\u0161\7"+
		"u\2\2\u0161\u0162\7r\2\2\u0162\u0163\7c\2\2\u0163\u0164\7e\2\2\u0164\u0165"+
		"\7g\2\2\u0165\u0166\7\65\2\2\u0166x\3\2\2\2\u0167\u0168\7h\2\2\u0168\u0169"+
		"\7g\2\2\u0169\u016a\7u\2\2\u016a\u016b\7r\2\2\u016b\u016c\7c\2\2\u016c"+
		"\u016d\7e\2\2\u016d\u016e\7g\2\2\u016e\u016f\7u\2\2\u016fz\3\2\2\2\u0170"+
		"\u0171\7h\2\2\u0171\u0172\7g\2\2\u0172\u0173\7u\2\2\u0173\u0174\7r\2\2"+
		"\u0174\u0175\7c\2\2\u0175\u0176\7e\2\2\u0176\u0177\7g\2\2\u0177\u0178"+
		"\7n\2\2\u0178|\3\2\2\2\u0179\u017a\7h\2\2\u017a\u017b\7w\2\2\u017b\u017c"+
		"\7p\2\2\u017c\u017d\7e\2\2\u017d~\3\2\2\2\u017e\u0183\7$\2\2\u017f\u0182"+
		"\n\2\2\2\u0180\u0182\5\u0091I\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2"+
		"\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7$\2\2\u0187\u0080\3\2\2\2\u0188"+
		"\u018c\5\u0099M\2\u0189\u018b\5\u0097L\2\u018a\u0189\3\2\2\2\u018b\u018e"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0082\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018f\u019d\7\62\2\2\u0190\u019a\t\3\2\2\u0191\u0193\5"+
		"\u0095K\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u019b\3\2\2\2"+
		"\u0194\u0196\7a\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\5\u0095K"+
		"\2\u019a\u0192\3\2\2\2\u019a\u0195\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u018f"+
		"\3\2\2\2\u019c\u0190\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\t\4\2\2\u019f"+
		"\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u0084\3\2\2\2\u01a1\u01a2\5\u0095"+
		"K\2\u01a2\u01a4\7\60\2\2\u01a3\u01a5\5\u0095K\2\u01a4\u01a3\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01a7\7\60\2\2\u01a7\u01a9\5"+
		"\u0095K\2\u01a8\u01a1\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab\3\2\2\2"+
		"\u01aa\u01ac\5\u008fH\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ae\3\2\2\2\u01ad\u01af\t\5\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u01b9\3\2\2\2\u01b0\u01b6\5\u0095K\2\u01b1\u01b3\5\u008fH\2"+
		"\u01b2\u01b4\t\5\2\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b7"+
		"\3\2\2\2\u01b5\u01b7\t\5\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01a8\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b9\u0086\3\2"+
		"\2\2\u01ba\u01bc\t\6\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01bf\5\u0085C\2\u01be\u01bd\3\2\2\2\u01be\u01bf"+
		"\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01c2\t\7\2\2\u01c1\u01c0\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5\5\u0085C\2\u01c4\u01c3"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\t\b\2\2\u01c7"+
		"\u0088\3\2\2\2\u01c8\u01c9\t\t\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\bE"+
		"\2\2\u01cb\u008a\3\2\2\2\u01cc\u01cd\7\61\2\2\u01cd\u01ce\7,\2\2\u01ce"+
		"\u01d2\3\2\2\2\u01cf\u01d1\13\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3"+
		"\2\2\2\u01d2\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01d2\3\2\2\2\u01d5\u01d6\7,\2\2\u01d6\u01d7\7\61\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d9\bF\3\2\u01d9\u008c\3\2\2\2\u01da\u01db\7\61\2\2\u01db"+
		"\u01dc\7\61\2\2\u01dc\u01e0\3\2\2\2\u01dd\u01df\n\n\2\2\u01de\u01dd\3"+
		"\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\bG\3\2\u01e4\u008e\3\2"+
		"\2\2\u01e5\u01e7\t\13\2\2\u01e6\u01e8\t\7\2\2\u01e7\u01e6\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\5\u0095K\2\u01ea\u0090"+
		"\3\2\2\2\u01eb\u01ec\7^\2\2\u01ec\u0201\t\f\2\2\u01ed\u01f2\7^\2\2\u01ee"+
		"\u01f0\t\r\2\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01f3\t\16\2\2\u01f2\u01ef\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u0201\t\16\2\2\u01f5\u01f7\7^\2\2\u01f6\u01f8\7w"+
		"\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\5\u0093J\2\u01fc\u01fd"+
		"\5\u0093J\2\u01fd\u01fe\5\u0093J\2\u01fe\u01ff\5\u0093J\2\u01ff\u0201"+
		"\3\2\2\2\u0200\u01eb\3\2\2\2\u0200\u01ed\3\2\2\2\u0200\u01f5\3\2\2\2\u0201"+
		"\u0092\3\2\2\2\u0202\u0203\t\17\2\2\u0203\u0094\3\2\2\2\u0204\u020c\t"+
		"\20\2\2\u0205\u0207\t\21\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020b\u020d\t\20\2\2\u020c\u0208\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u0096\3\2\2\2\u020e\u0211\5\u0099M\2\u020f\u0211\t\20\2\2\u0210\u020e"+
		"\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0098\3\2\2\2\u0212\u0217\t\22\2\2"+
		"\u0213\u0217\n\23\2\2\u0214\u0215\t\24\2\2\u0215\u0217\t\25\2\2\u0216"+
		"\u0212\3\2\2\2\u0216\u0213\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u009a\3\2"+
		"\2\2!\2\u0181\u0183\u018c\u0192\u0197\u019a\u019c\u019f\u01a4\u01a8\u01ab"+
		"\u01ae\u01b3\u01b6\u01b8\u01bb\u01be\u01c1\u01c4\u01d2\u01e0\u01e7\u01ef"+
		"\u01f2\u01f9\u0200\u0208\u020c\u0210\u0216\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}