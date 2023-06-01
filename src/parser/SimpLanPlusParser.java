// Generated from SimpLanPlus.g4 by ANTLR 4.7.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import parser.SimpLanParser.ExpContext;
import parser.SimpLanParser.ValueContext;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpLanPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, INTEGER=27, ID=28, WS=29, LINECOMENTS=30, BLOCKCOMENTS=31, 
		ERR=32;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_param = 2, RULE_body = 3, RULE_type = 4, 
		RULE_stm = 5, RULE_exp = 6;
	public static final String[] ruleNames = {
		"prog", "dec", "param", "body", "type", "stm", "exp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "','", "')'", "'{'", "'}'", "'int'", "'bool'", "'void'", 
		"'='", "'if'", "'else'", "'true'", "'false'", "'!'", "'*'", "'/'", "'+'", 
		"'-'", "'>'", "'<'", "'>='", "'<='", "'=='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "INTEGER", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", 
		"ERR"
	};
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
	public String getGrammarFileName() { return "SimpLanPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpLanPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanPlusVisitor ) return ((SimpLanPlusVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__10:
			case T__12:
			case T__13:
			case T__14:
			case INTEGER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				exp(0);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(15);
					dec();
					}
					}
					setState(18); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) );
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(20);
						stm();
						}
						} 
					}
					setState(25);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(26);
					exp(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanPlusVisitor ) return ((SimpLanPlusVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				type();
				setState(32);
				match(ID);
				setState(33);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				type();
				setState(36);
				match(ID);
				setState(37);
				match(T__1);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
					{
					setState(38);
					param();
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(39);
						match(T__2);
						setState(40);
						param();
						}
						}
						setState(45);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(48);
				match(T__3);
				setState(49);
				match(T__4);
				setState(50);
				body();
				setState(51);
				match(T__5);
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

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanPlusVisitor ) return ((SimpLanPlusVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			type();
			setState(56);
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

	public static class BodyContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanPlusVisitor ) return ((SimpLanPlusVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				{
				setState(58);
				dec();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					stm();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << INTEGER) | (1L << ID))) != 0)) {
				{
				setState(70);
				exp(0);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanPlusVisitor ) return ((SimpLanPlusVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class StmContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanPlusVisitor ) return ((SimpLanPlusVisitor<? extends T>)visitor).visitStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stm);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(ID);
				setState(76);
				match(T__9);
				setState(77);
				exp(0);
				setState(78);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(ID);
				setState(81);
				match(T__1);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(82);
					exp(0);
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(83);
						match(T__2);
						setState(84);
						exp(0);
						}
						}
						setState(89);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(92);
				match(T__3);
				setState(93);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(T__10);
				setState(95);
				match(T__1);
				setState(96);
				exp(0);
				setState(97);
				match(T__3);
				setState(98);
				match(T__4);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					stm();
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__10 || _la==ID );
				setState(104);
				match(T__5);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(105);
					match(T__11);
					setState(106);
					match(T__4);
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(107);
						stm();
						}
						}
						setState(110); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__10 || _la==ID );
					setState(112);
					match(T__5);
					}
				}

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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SimpLanPlusParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		public ExpContext() {}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanPlusVisitor ) return ((SimpLanPlusVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	
	public static class VarExpContext extends ExpContext {
		public VarExpContext(ExpContext ctx) { copyFrom(ctx); }
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanPlusVisitor ) return ((SimpLanPlusVisitor<? extends T>)visitor).visitVarExp(this);
			else return visitor.visitChildren(this);
		}
	}
	
	public static class FunExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanPlusVisitor ) return ((SimpLanPlusVisitor<? extends T>)visitor).visitFunExp(this);
			else return visitor.visitChildren(this);
		}
	}
	
	public static class IntValContext extends ExpContext {
		public TerminalNode INTEGER() { return getToken(SimpLanPlusParser.INTEGER, 0); }
		public IntValContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpLanPlusVisitor ) return ((SimpLanPlusVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(119);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(120);
				match(T__12);
				}
				break;
			case 3:
				{
				setState(121);
				match(T__13);
				}
				break;
			case 4:
				{
				setState(122);
				match(ID);
				}
				break;
			case 5:
				{
				setState(123);
				match(T__14);
				setState(124);
				exp(8);
				}
				break;
			case 6:
				{
				setState(125);
				match(T__10);
				setState(126);
				match(T__1);
				setState(127);
				exp(0);
				setState(128);
				match(T__3);
				setState(129);
				match(T__4);
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(130);
						stm();
						}
						} 
					}
					setState(135);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(136);
				exp(0);
				setState(137);
				match(T__5);
				setState(138);
				match(T__11);
				setState(139);
				match(T__4);
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(140);
						stm();
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(146);
				exp(0);
				setState(147);
				match(T__5);
				}
				break;
			case 7:
				{
				setState(149);
				match(T__1);
				setState(150);
				exp(0);
				setState(151);
				match(T__3);
				}
				break;
			case 8:
				{
				setState(153);
				match(ID);
				setState(154);
				match(T__1);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(155);
					exp(0);
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(156);
						match(T__2);
						setState(157);
						exp(0);
						}
						}
						setState(162);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(165);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(168);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(169);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						exp(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(171);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(172);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						exp(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(174);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(175);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						exp(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(177);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(178);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						exp(5);
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2"+
		"\16\2\24\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\5\2\36\n\2\5\2 \n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\5\3\61\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\5\7\5>\n\5\f\5\16\5A\13\5"+
		"\3\5\7\5D\n\5\f\5\16\5G\13\5\3\5\5\5J\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\5\7]\n\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\6\7g\n\7\r\7\16\7h\3\7\3\7\3\7\3\7\6\7o\n\7\r\7\16\7"+
		"p\3\7\3\7\5\7u\n\7\5\7w\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u0086\n\b\f\b\16\b\u0089\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u0090"+
		"\n\b\f\b\16\b\u0093\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13\b\5\b\u00a6\n\b\3\b\5\b\u00a9\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b7\n\b\f\b\16\b"+
		"\u00ba\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2\7\3\2\t\13\3\2\22\23\3\2\24"+
		"\25\3\2\26\32\3\2\33\34\2\u00d4\2\37\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\b"+
		"?\3\2\2\2\nK\3\2\2\2\fv\3\2\2\2\16\u00a8\3\2\2\2\20 \5\16\b\2\21\23\5"+
		"\4\3\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\31\3"+
		"\2\2\2\26\30\5\f\7\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3"+
		"\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\34\36\5\16\b\2\35\34\3\2\2\2\35\36"+
		"\3\2\2\2\36 \3\2\2\2\37\20\3\2\2\2\37\22\3\2\2\2 \3\3\2\2\2!\"\5\n\6\2"+
		"\"#\7\36\2\2#$\7\3\2\2$8\3\2\2\2%&\5\n\6\2&\'\7\36\2\2\'\60\7\4\2\2(-"+
		"\5\6\4\2)*\7\5\2\2*,\5\6\4\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2."+
		"\61\3\2\2\2/-\3\2\2\2\60(\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7"+
		"\6\2\2\63\64\7\7\2\2\64\65\5\b\5\2\65\66\7\b\2\2\668\3\2\2\2\67!\3\2\2"+
		"\2\67%\3\2\2\28\5\3\2\2\29:\5\n\6\2:;\7\36\2\2;\7\3\2\2\2<>\5\4\3\2=<"+
		"\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\5\f\7\2C"+
		"B\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2HJ\5\16\b\2"+
		"IH\3\2\2\2IJ\3\2\2\2J\t\3\2\2\2KL\t\2\2\2L\13\3\2\2\2MN\7\36\2\2NO\7\f"+
		"\2\2OP\5\16\b\2PQ\7\3\2\2Qw\3\2\2\2RS\7\36\2\2S\\\7\4\2\2TY\5\16\b\2U"+
		"V\7\5\2\2VX\5\16\b\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2"+
		"[Y\3\2\2\2\\T\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\6\2\2_w\7\3\2\2`a\7\r\2"+
		"\2ab\7\4\2\2bc\5\16\b\2cd\7\6\2\2df\7\7\2\2eg\5\f\7\2fe\3\2\2\2gh\3\2"+
		"\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jt\7\b\2\2kl\7\16\2\2ln\7\7\2\2mo\5"+
		"\f\7\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\b\2\2su\3"+
		"\2\2\2tk\3\2\2\2tu\3\2\2\2uw\3\2\2\2vM\3\2\2\2vR\3\2\2\2v`\3\2\2\2w\r"+
		"\3\2\2\2xy\b\b\1\2y\u00a9\7\35\2\2z\u00a9\7\17\2\2{\u00a9\7\20\2\2|\u00a9"+
		"\7\36\2\2}~\7\21\2\2~\u00a9\5\16\b\n\177\u0080\7\r\2\2\u0080\u0081\7\4"+
		"\2\2\u0081\u0082\5\16\b\2\u0082\u0083\7\6\2\2\u0083\u0087\7\7\2\2\u0084"+
		"\u0086\5\f\7\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\5\16\b\2\u008b\u008c\7\b\2\2\u008c\u008d\7\16\2\2\u008d\u0091\7"+
		"\7\2\2\u008e\u0090\5\f\7\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0095\5\16\b\2\u0095\u0096\7\b\2\2\u0096\u00a9\3\2\2\2\u0097"+
		"\u0098\7\4\2\2\u0098\u0099\5\16\b\2\u0099\u009a\7\6\2\2\u009a\u00a9\3"+
		"\2\2\2\u009b\u009c\7\36\2\2\u009c\u00a5\7\4\2\2\u009d\u00a2\5\16\b\2\u009e"+
		"\u009f\7\5\2\2\u009f\u00a1\5\16\b\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a9\7\6\2\2\u00a8x\3\2\2\2\u00a8z\3\2\2\2\u00a8{\3\2\2\2"+
		"\u00a8|\3\2\2\2\u00a8}\3\2\2\2\u00a8\177\3\2\2\2\u00a8\u0097\3\2\2\2\u00a8"+
		"\u009b\3\2\2\2\u00a9\u00b8\3\2\2\2\u00aa\u00ab\f\t\2\2\u00ab\u00ac\t\3"+
		"\2\2\u00ac\u00b7\5\16\b\n\u00ad\u00ae\f\b\2\2\u00ae\u00af\t\4\2\2\u00af"+
		"\u00b7\5\16\b\t\u00b0\u00b1\f\7\2\2\u00b1\u00b2\t\5\2\2\u00b2\u00b7\5"+
		"\16\b\b\u00b3\u00b4\f\6\2\2\u00b4\u00b5\t\6\2\2\u00b5\u00b7\5\16\b\7\u00b6"+
		"\u00aa\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b3\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\17\3\2\2\2\u00ba\u00b8\3\2\2\2\31\24\31\35\37-\60\67?EIY\\hptv\u0087"+
		"\u0091\u00a2\u00a5\u00a8\u00b6\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}