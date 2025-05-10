// Generated from d:/University/1 - Principle of Programming Language/Project for theory class/backend/proj.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class projParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, MAIN=24, DEF=25, 
		IF=26, ELIF=27, ELSE=28, COLON=29, BREAK=30, WHILE=31, RETURN=32, PRINT=33, 
		STRING=34, ID=35, EQUAL=36, NUMBER=37, NL=38, WS=39;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_whileStmt = 2, RULE_asg = 3, RULE_ifStmt = 4, 
		RULE_elifStmt = 5, RULE_elseStmt = 6, RULE_funcStmt = 7, RULE_breakStmt = 8, 
		RULE_postfixStmt = 9, RULE_returnStmt = 10, RULE_mainStmt = 11, RULE_printStmt = 12, 
		RULE_block = 13, RULE_callStmt = 14, RULE_questStmt = 15, RULE_exp = 16, 
		RULE_addExp = 17, RULE_mulExp = 18, RULE_verb = 19, RULE_obj = 20, RULE_article = 21, 
		RULE_noun = 22, RULE_atom = 23, RULE_postfix = 24, RULE_printArgs = 25, 
		RULE_param = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "whileStmt", "asg", "ifStmt", "elifStmt", "elseStmt", 
			"funcStmt", "breakStmt", "postfixStmt", "returnStmt", "mainStmt", "printStmt", 
			"block", "callStmt", "questStmt", "exp", "addExp", "mulExp", "verb", 
			"obj", "article", "noun", "atom", "postfix", "printArgs", "param"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'>'", "'<'", "'=='", "'!='", "'<='", "'>='", "'+'", 
			"'-'", "'*'", "'/'", "'show'", "'tell'", "'me'", "'the'", "'an'", "'a'", 
			"','", "'--'", "'++'", "'+='", "'-='", null, "'def'", "'if'", "'elif'", 
			"'else'", "':'", "'break'", "'while'", "'return'", "'print'", null, null, 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"MAIN", "DEF", "IF", "ELIF", "ELSE", "COLON", "BREAK", "WHILE", "RETURN", 
			"PRINT", "STRING", "ID", "EQUAL", "NUMBER", "NL", "WS"
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
	public String getGrammarFileName() { return "proj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public projParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(projParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(projParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(projParser.NL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__13:
				case DEF:
				case IF:
				case BREAK:
				case WHILE:
				case RETURN:
				case PRINT:
				case ID:
					{
					setState(54);
					stmt();
					}
					break;
				case NL:
					{
					setState(55);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 325444460544L) != 0) );
			setState(60);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public MainStmtContext mainStmt() {
			return getRuleContext(MainStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public FuncStmtContext funcStmt() {
			return getRuleContext(FuncStmtContext.class,0);
		}
		public AsgContext asg() {
			return getRuleContext(AsgContext.class,0);
		}
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public PostfixStmtContext postfixStmt() {
			return getRuleContext(PostfixStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public QuestStmtContext questStmt() {
			return getRuleContext(QuestStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				mainStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				whileStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				funcStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				asg();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				breakStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				postfixStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				returnStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				printStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(71);
				callStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(72);
				questStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(projParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COLON() { return getToken(projParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(WHILE);
			setState(76);
			exp();
			setState(77);
			match(COLON);
			setState(78);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(projParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(projParser.EQUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NL() { return getToken(projParser.NL, 0); }
		public AsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asg; }
	}

	public final AsgContext asg() throws RecognitionException {
		AsgContext _localctx = new AsgContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
			setState(81);
			match(EQUAL);
			setState(82);
			exp();
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(83);
				match(NL);
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(projParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COLON() { return getToken(projParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElifStmtContext> elifStmt() {
			return getRuleContexts(ElifStmtContext.class);
		}
		public ElifStmtContext elifStmt(int i) {
			return getRuleContext(ElifStmtContext.class,i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IF);
			setState(87);
			exp();
			setState(88);
			match(COLON);
			setState(89);
			block();
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					elifStmt();
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(96);
				elseStmt();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifStmtContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(projParser.ELIF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode COLON() { return getToken(projParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
	}

	public final ElifStmtContext elifStmt() throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ELIF);
			setState(100);
			exp();
			setState(101);
			match(COLON);
			setState(102);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(projParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(projParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ELSE);
			setState(105);
			match(COLON);
			setState(106);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncStmtContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(projParser.DEF, 0); }
		public TerminalNode ID() { return getToken(projParser.ID, 0); }
		public TerminalNode COLON() { return getToken(projParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public FuncStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcStmt; }
	}

	public final FuncStmtContext funcStmt() throws RecognitionException {
		FuncStmtContext _localctx = new FuncStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(DEF);
			setState(109);
			match(ID);
			setState(110);
			match(T__0);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(111);
				param();
				}
			}

			setState(114);
			match(T__1);
			setState(115);
			match(COLON);
			setState(116);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(projParser.BREAK, 0); }
		public TerminalNode NL() { return getToken(projParser.NL, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(BREAK);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(119);
				match(NL);
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(projParser.ID, 0); }
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NL() { return getToken(projParser.NL, 0); }
		public PostfixStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixStmt; }
	}

	public final PostfixStmtContext postfixStmt() throws RecognitionException {
		PostfixStmtContext _localctx = new PostfixStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_postfixStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			setState(123);
			postfix();
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(124);
				exp();
				}
				break;
			}
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(127);
				match(NL);
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(projParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NL() { return getToken(projParser.NL, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(RETURN);
			setState(131);
			exp();
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(132);
				match(NL);
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(projParser.IF, 0); }
		public TerminalNode MAIN() { return getToken(projParser.MAIN, 0); }
		public TerminalNode COLON() { return getToken(projParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStmt; }
	}

	public final MainStmtContext mainStmt() throws RecognitionException {
		MainStmtContext _localctx = new MainStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mainStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IF);
			setState(136);
			match(MAIN);
			setState(137);
			match(COLON);
			setState(138);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(projParser.PRINT, 0); }
		public PrintArgsContext printArgs() {
			return getRuleContext(PrintArgsContext.class,0);
		}
		public TerminalNode NL() { return getToken(projParser.NL, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PRINT);
			setState(141);
			match(T__0);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188978561026L) != 0)) {
				{
				setState(142);
				printArgs();
				}
			}

			setState(145);
			match(T__1);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(146);
				match(NL);
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(projParser.NL, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(NL);
			setState(151); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(150);
					stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(projParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NL() { return getToken(projParser.NL, 0); }
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(T__0);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188978561026L) != 0)) {
				{
				setState(157);
				exp();
				}
			}

			setState(160);
			match(T__1);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(161);
				match(NL);
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class QuestStmtContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public QuestStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questStmt; }
	}

	public final QuestStmtContext questStmt() throws RecognitionException {
		QuestStmtContext _localctx = new QuestStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_questStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			verb();
			setState(165);
			obj();
			setState(166);
			article();
			setState(167);
			noun();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public Token op;
		public List<AddExpContext> addExp() {
			return getRuleContexts(AddExpContext.class);
		}
		public AddExpContext addExp(int i) {
			return getRuleContext(AddExpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			addExp();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0)) {
				{
				{
				setState(170);
				((ExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0)) ) {
					((ExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				addExp();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddExpContext extends ParserRuleContext {
		public Token op;
		public List<MulExpContext> mulExp() {
			return getRuleContexts(MulExpContext.class);
		}
		public MulExpContext mulExp(int i) {
			return getRuleContext(MulExpContext.class,i);
		}
		public AddExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExp; }
	}

	public final AddExpContext addExp() throws RecognitionException {
		AddExpContext _localctx = new AddExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			mulExp();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(178);
				((AddExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
					((AddExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				mulExp();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulExpContext extends ParserRuleContext {
		public Token op;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public MulExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExp; }
	}

	public final MulExpContext mulExp() throws RecognitionException {
		MulExpContext _localctx = new MulExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mulExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			atom();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				{
				setState(186);
				((MulExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((MulExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(187);
				atom();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VerbContext extends ParserRuleContext {
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjContext extends ParserRuleContext {
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArticleContext extends ParserRuleContext {
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NounContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(projParser.ID, 0); }
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_noun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(projParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(projParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode STRING() { return getToken(projParser.STRING, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atom);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(ID);
				setState(203);
				match(T__0);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 188978561026L) != 0)) {
					{
					setState(204);
					exp();
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__18) {
						{
						{
						setState(205);
						match(T__18);
						setState(206);
						exp();
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(214);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(T__0);
				setState(217);
				exp();
				setState(218);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixContext extends ParserRuleContext {
		public Token op;
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_postfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			((PostfixContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
				((PostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintArgsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PrintArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArgs; }
	}

	public final PrintArgsContext printArgs() throws RecognitionException {
		PrintArgsContext _localctx = new PrintArgsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_printArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			exp();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(226);
				match(T__18);
				setState(227);
				exp();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(projParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(projParser.ID, i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ID);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(234);
				match(T__18);
				setState(235);
				match(ID);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static final String _serializedATN =
		"\u0004\u0001\'\u00f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0004\u00009\b\u0000\u000b\u0000\f\u0000:\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001J\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\\\b"+
		"\u0004\n\u0004\f\u0004_\t\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007q\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0003\by\b\b\u0001\t\u0001\t\u0001\t\u0003\t~\b"+
		"\t\u0001\t\u0003\t\u0081\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u0086\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0090\b\f\u0001\f\u0001\f\u0003\f\u0094\b\f\u0001\r"+
		"\u0001\r\u0004\r\u0098\b\r\u000b\r\f\r\u0099\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u009f\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a3"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ad\b\u0010\n\u0010\f\u0010"+
		"\u00b0\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00b5\b"+
		"\u0011\n\u0011\f\u0011\u00b8\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00bd\b\u0012\n\u0012\f\u0012\u00c0\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u00d0\b\u0017\n\u0017\f\u0017\u00d3\t\u0017\u0003\u0017"+
		"\u00d5\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00de\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00e5\b\u0019\n\u0019"+
		"\f\u0019\u00e8\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u00ed\b\u001a\n\u001a\f\u001a\u00f0\t\u001a\u0001\u001a\u0000\u0000\u001b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.024\u0000\u0006\u0001\u0000\u0003\b\u0001\u0000\t"+
		"\n\u0001\u0000\u000b\f\u0001\u0000\r\u000e\u0001\u0000\u0010\u0012\u0001"+
		"\u0000\u0014\u0017\u00fa\u00008\u0001\u0000\u0000\u0000\u0002I\u0001\u0000"+
		"\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006P\u0001\u0000\u0000\u0000"+
		"\bV\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\fh\u0001\u0000"+
		"\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010v\u0001\u0000\u0000\u0000"+
		"\u0012z\u0001\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000\u0016"+
		"\u0087\u0001\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000\u001a"+
		"\u0095\u0001\u0000\u0000\u0000\u001c\u009b\u0001\u0000\u0000\u0000\u001e"+
		"\u00a4\u0001\u0000\u0000\u0000 \u00a9\u0001\u0000\u0000\u0000\"\u00b1"+
		"\u0001\u0000\u0000\u0000$\u00b9\u0001\u0000\u0000\u0000&\u00c1\u0001\u0000"+
		"\u0000\u0000(\u00c3\u0001\u0000\u0000\u0000*\u00c5\u0001\u0000\u0000\u0000"+
		",\u00c7\u0001\u0000\u0000\u0000.\u00dd\u0001\u0000\u0000\u00000\u00df"+
		"\u0001\u0000\u0000\u00002\u00e1\u0001\u0000\u0000\u00004\u00e9\u0001\u0000"+
		"\u0000\u000069\u0003\u0002\u0001\u000079\u0005&\u0000\u000086\u0001\u0000"+
		"\u0000\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0000\u0000\u0001=\u0001\u0001\u0000\u0000\u0000>J\u0003\u0016"+
		"\u000b\u0000?J\u0003\u0004\u0002\u0000@J\u0003\b\u0004\u0000AJ\u0003\u000e"+
		"\u0007\u0000BJ\u0003\u0006\u0003\u0000CJ\u0003\u0010\b\u0000DJ\u0003\u0012"+
		"\t\u0000EJ\u0003\u0014\n\u0000FJ\u0003\u0018\f\u0000GJ\u0003\u001c\u000e"+
		"\u0000HJ\u0003\u001e\u000f\u0000I>\u0001\u0000\u0000\u0000I?\u0001\u0000"+
		"\u0000\u0000I@\u0001\u0000\u0000\u0000IA\u0001\u0000\u0000\u0000IB\u0001"+
		"\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000"+
		"IE\u0001\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IH\u0001\u0000\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KL\u0005"+
		"\u001f\u0000\u0000LM\u0003 \u0010\u0000MN\u0005\u001d\u0000\u0000NO\u0003"+
		"\u001a\r\u0000O\u0005\u0001\u0000\u0000\u0000PQ\u0005#\u0000\u0000QR\u0005"+
		"$\u0000\u0000RT\u0003 \u0010\u0000SU\u0005&\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0007\u0001\u0000\u0000\u0000"+
		"VW\u0005\u001a\u0000\u0000WX\u0003 \u0010\u0000XY\u0005\u001d\u0000\u0000"+
		"Y]\u0003\u001a\r\u0000Z\\\u0003\n\u0005\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`b\u0003\f\u0006"+
		"\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\t\u0001\u0000"+
		"\u0000\u0000cd\u0005\u001b\u0000\u0000de\u0003 \u0010\u0000ef\u0005\u001d"+
		"\u0000\u0000fg\u0003\u001a\r\u0000g\u000b\u0001\u0000\u0000\u0000hi\u0005"+
		"\u001c\u0000\u0000ij\u0005\u001d\u0000\u0000jk\u0003\u001a\r\u0000k\r"+
		"\u0001\u0000\u0000\u0000lm\u0005\u0019\u0000\u0000mn\u0005#\u0000\u0000"+
		"np\u0005\u0001\u0000\u0000oq\u00034\u001a\u0000po\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005\u0002\u0000"+
		"\u0000st\u0005\u001d\u0000\u0000tu\u0003\u001a\r\u0000u\u000f\u0001\u0000"+
		"\u0000\u0000vx\u0005\u001e\u0000\u0000wy\u0005&\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0011\u0001\u0000\u0000\u0000"+
		"z{\u0005#\u0000\u0000{}\u00030\u0018\u0000|~\u0003 \u0010\u0000}|\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0005&\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0013\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005 \u0000\u0000\u0083\u0085\u0003 \u0010\u0000\u0084\u0086"+
		"\u0005&\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\u001a\u0000\u0000\u0088\u0089\u0005\u0018\u0000\u0000\u0089\u008a\u0005"+
		"\u001d\u0000\u0000\u008a\u008b\u0003\u001a\r\u0000\u008b\u0017\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005!\u0000\u0000\u008d\u008f\u0005\u0001\u0000"+
		"\u0000\u008e\u0090\u00032\u0019\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0093\u0005\u0002\u0000\u0000\u0092\u0094\u0005&\u0000\u0000\u0093"+
		"\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0019\u0001\u0000\u0000\u0000\u0095\u0097\u0005&\u0000\u0000\u0096\u0098"+
		"\u0003\u0002\u0001\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u001b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005#\u0000\u0000\u009c\u009e\u0005\u0001\u0000\u0000\u009d\u009f\u0003"+
		" \u0010\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005\u0002"+
		"\u0000\u0000\u00a1\u00a3\u0005&\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u001d\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0003&\u0013\u0000\u00a5\u00a6\u0003(\u0014\u0000\u00a6"+
		"\u00a7\u0003*\u0015\u0000\u00a7\u00a8\u0003,\u0016\u0000\u00a8\u001f\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ae\u0003\"\u0011\u0000\u00aa\u00ab\u0007\u0000"+
		"\u0000\u0000\u00ab\u00ad\u0003\"\u0011\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af!\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b6\u0003$\u0012\u0000\u00b2"+
		"\u00b3\u0007\u0001\u0000\u0000\u00b3\u00b5\u0003$\u0012\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7#\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00be\u0003"+
		".\u0017\u0000\u00ba\u00bb\u0007\u0002\u0000\u0000\u00bb\u00bd\u0003.\u0017"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf%\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0007\u0003\u0000\u0000\u00c2\'\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0005\u000f\u0000\u0000\u00c4)\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0007\u0004\u0000\u0000\u00c6+\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"#\u0000\u0000\u00c8-\u0001\u0000\u0000\u0000\u00c9\u00de\u0005%\u0000"+
		"\u0000\u00ca\u00cb\u0005#\u0000\u0000\u00cb\u00d4\u0005\u0001\u0000\u0000"+
		"\u00cc\u00d1\u0003 \u0010\u0000\u00cd\u00ce\u0005\u0013\u0000\u0000\u00ce"+
		"\u00d0\u0003 \u0010\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00de"+
		"\u0005\u0002\u0000\u0000\u00d7\u00de\u0005#\u0000\u0000\u00d8\u00d9\u0005"+
		"\u0001\u0000\u0000\u00d9\u00da\u0003 \u0010\u0000\u00da\u00db\u0005\u0002"+
		"\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00de\u0005\"\u0000"+
		"\u0000\u00dd\u00c9\u0001\u0000\u0000\u0000\u00dd\u00ca\u0001\u0000\u0000"+
		"\u0000\u00dd\u00d7\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000\u0000"+
		"\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de/\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0007\u0005\u0000\u0000\u00e01\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e6\u0003 \u0010\u0000\u00e2\u00e3\u0005\u0013\u0000\u0000\u00e3\u00e5"+
		"\u0003 \u0010\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e73\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ee\u0005#\u0000\u0000\u00ea\u00eb\u0005\u0013\u0000"+
		"\u0000\u00eb\u00ed\u0005#\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef5\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00188:IT]apx}\u0080\u0085\u008f\u0093"+
		"\u0099\u009e\u00a2\u00ae\u00b6\u00be\u00d1\u00d4\u00dd\u00e6\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}