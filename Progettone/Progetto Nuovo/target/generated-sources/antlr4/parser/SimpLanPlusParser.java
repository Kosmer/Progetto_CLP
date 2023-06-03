// Generated from SimpLanPlus.g4 by ANTLR 4.4
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpLanPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, INTEGER=27, ID=28, WS=29, LINECOMENTS=30, BLOCKCOMENTS=31, 
		ERR=32;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'true'", "'||'", "'void'", "'{'", "';'", "'&&'", 
		"'='", "'}'", "'if'", "'<='", "'int'", "'('", "'*'", "','", "'false'", 
		"'>='", "'=='", "'<'", "'>'", "'bool'", "'!'", "'else'", "')'", "'+'", 
		"'-'", "INTEGER", "ID", "WS", "LINECOMENTS", "BLOCKCOMENTS", "ERR"
	};
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_param = 2, RULE_body = 3, RULE_type = 4, 
		RULE_blockseqstm = 5, RULE_stm = 6, RULE_blockseqstmexp = 7, RULE_exp = 8;
	public static final String[] ruleNames = {
		"prog", "dec", "param", "body", "type", "blockseqstm", "stm", "blockseqstmexp", 
		"exp"
	};

	@Override
	public String getGrammarFileName() { return "SimpLanPlus.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecstmExpContext extends ProgContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public DecstmExpContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterDecstmExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitDecstmExp(this);
		}
	}
	public static class SingleExpContext extends ProgContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SingleExpContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterSingleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitSingleExp(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			setState(33);
			switch (_input.LA(1)) {
			case T__24:
			case T__16:
			case T__13:
			case T__10:
			case T__4:
			case INTEGER:
			case ID:
				_localctx = new SingleExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18); exp(0);
				}
				break;
			case T__22:
			case T__14:
			case T__5:
				_localctx = new DecstmExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(19); dec();
					}
					}
					setState(22); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__14) | (1L << T__5))) != 0) );
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(24); stm();
						}
						} 
					}
					setState(29);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(31);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__16) | (1L << T__13) | (1L << T__10) | (1L << T__4) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(30); exp(0);
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
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdDecContext extends DecContext {
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdDecContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterIdDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitIdDec(this);
		}
	}
	public static class FunDecContext extends DecContext {
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public FunDecContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterFunDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitFunDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		int _la;
		try {
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IdDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35); type();
				setState(36); match(ID);
				setState(37); match(T__20);
				}
				break;
			case 2:
				_localctx = new FunDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39); type();
				setState(40); match(ID);
				setState(41); match(T__13);
				setState(50);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__14) | (1L << T__5))) != 0)) {
					{
					setState(42); param();
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(43); match(T__11);
						setState(44); param();
						}
						}
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(52); match(T__2);
				setState(53); match(T__21);
				setState(54); body();
				setState(55); match(T__17);
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
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); type();
			setState(60); match(ID);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitBody(this);
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__14) | (1L << T__5))) != 0)) {
				{
				{
				setState(62); dec();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68); stm();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(75);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__16) | (1L << T__13) | (1L << T__10) | (1L << T__4) | (1L << INTEGER) | (1L << ID))) != 0)) {
				{
				setState(74); exp(0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__14) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class BlockseqstmContext extends ParserRuleContext {
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public BlockseqstmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockseqstm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterBlockseqstm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitBlockseqstm(this);
		}
	}

	public final BlockseqstmContext blockseqstm() throws RecognitionException {
		BlockseqstmContext _localctx = new BlockseqstmContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blockseqstm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79); stm();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 || _la==ID );
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
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
	 
		public StmContext() { }
		public void copyFrom(StmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarStmContext extends StmContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public VarStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterVarStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitVarStm(this);
		}
	}
	public static class IfStmContext extends StmContext {
		public ExpContext cond;
		public BlockseqstmContext thenBranch;
		public BlockseqstmContext elseBranch;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlockseqstmContext blockseqstm(int i) {
			return getRuleContext(BlockseqstmContext.class,i);
		}
		public List<BlockseqstmContext> blockseqstm() {
			return getRuleContexts(BlockseqstmContext.class);
		}
		public IfStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterIfStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitIfStm(this);
		}
	}
	public static class FunStmContext extends StmContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterFunStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitFunStm(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stm);
		int _la;
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VarStmContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(ID);
				setState(85); match(T__18);
				setState(86); exp(0);
				setState(87); match(T__20);
				}
				break;
			case 2:
				_localctx = new FunStmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89); match(ID);
				setState(90); match(T__13);
				setState(99);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__16) | (1L << T__13) | (1L << T__10) | (1L << T__4) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(91); exp(0);
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(92); match(T__11);
						setState(93); exp(0);
						}
						}
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(101); match(T__2);
				setState(102); match(T__20);
				}
				break;
			case 3:
				_localctx = new IfStmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103); match(T__16);
				setState(104); match(T__13);
				setState(105); ((IfStmContext)_localctx).cond = exp(0);
				setState(106); match(T__2);
				setState(107); match(T__21);
				setState(108); ((IfStmContext)_localctx).thenBranch = blockseqstm();
				setState(109); match(T__17);
				setState(115);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(110); match(T__3);
					setState(111); match(T__21);
					setState(112); ((IfStmContext)_localctx).elseBranch = blockseqstm();
					setState(113); match(T__17);
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

	public static class BlockseqstmexpContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public BlockseqstmexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockseqstmexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterBlockseqstmexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitBlockseqstmexp(this);
		}
	}

	public final BlockseqstmexpContext blockseqstmexp() throws RecognitionException {
		BlockseqstmexpContext _localctx = new BlockseqstmexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockseqstmexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119); stm();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(125); exp(0);
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BaseExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterBaseExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitBaseExp(this);
		}
	}
	public static class MuldivExpContext extends ExpContext {
		public ExpContext left;
		public Token mul;
		public Token div;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MuldivExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterMuldivExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitMuldivExp(this);
		}
	}
	public static class AddsubExpContext extends ExpContext {
		public ExpContext left;
		public Token plus;
		public Token sub;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AddsubExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterAddsubExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitAddsubExp(this);
		}
	}
	public static class CompareExpContext extends ExpContext {
		public ExpContext left;
		public Token greater;
		public Token lesser;
		public Token greater_equals;
		public Token lesser_equals;
		public Token equals;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CompareExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterCompareExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitCompareExp(this);
		}
	}
	public static class VarExpContext extends ExpContext {
		public TerminalNode ID() { return getToken(SimpLanPlusParser.ID, 0); }
		public VarExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterVarExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitVarExp(this);
		}
	}
	public static class TrueExpContext extends ExpContext {
		public TrueExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterTrueExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitTrueExp(this);
		}
	}
	public static class AndorExpContext extends ExpContext {
		public ExpContext left;
		public Token and;
		public Token or;
		public ExpContext right;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AndorExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterAndorExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitAndorExp(this);
		}
	}
	public static class IfExpContext extends ExpContext {
		public ExpContext cond;
		public BlockseqstmexpContext thenBranch;
		public BlockseqstmexpContext elseBranch;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<BlockseqstmexpContext> blockseqstmexp() {
			return getRuleContexts(BlockseqstmexpContext.class);
		}
		public BlockseqstmexpContext blockseqstmexp(int i) {
			return getRuleContext(BlockseqstmexpContext.class,i);
		}
		public IfExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterIfExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitIfExp(this);
		}
	}
	public static class FalseExpContext extends ExpContext {
		public FalseExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterFalseExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitFalseExp(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterFunExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitFunExp(this);
		}
	}
	public static class NotExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitNotExp(this);
		}
	}
	public static class IntExpContext extends ExpContext {
		public TerminalNode INTEGER() { return getToken(SimpLanPlusParser.INTEGER, 0); }
		public IntExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).enterIntExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpLanPlusListener ) ((SimpLanPlusListener)listener).exitIntExp(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(128); match(T__4);
				setState(129); exp(8);
				}
				break;
			case 2:
				{
				_localctx = new IntExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130); match(INTEGER);
				}
				break;
			case 3:
				{
				_localctx = new TrueExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131); match(T__24);
				}
				break;
			case 4:
				{
				_localctx = new FalseExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132); match(T__10);
				}
				break;
			case 5:
				{
				_localctx = new VarExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133); match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IfExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134); match(T__16);
				setState(135); match(T__13);
				setState(136); ((IfExpContext)_localctx).cond = exp(0);
				setState(137); match(T__2);
				setState(138); match(T__21);
				setState(139); ((IfExpContext)_localctx).thenBranch = blockseqstmexp();
				setState(140); match(T__17);
				setState(141); match(T__3);
				setState(142); match(T__21);
				setState(143); ((IfExpContext)_localctx).elseBranch = blockseqstmexp();
				setState(144); match(T__17);
				}
				break;
			case 7:
				{
				_localctx = new BaseExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146); match(T__13);
				setState(147); exp(0);
				setState(148); match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new FunExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150); match(ID);
				setState(151); match(T__13);
				setState(160);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__16) | (1L << T__13) | (1L << T__10) | (1L << T__4) | (1L << INTEGER) | (1L << ID))) != 0)) {
					{
					setState(152); exp(0);
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__11) {
						{
						{
						setState(153); match(T__11);
						setState(154); exp(0);
						}
						}
						setState(159);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(162); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MuldivExpContext(new ExpContext(_parentctx, _parentState));
						((MuldivExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(165);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(168);
						switch (_input.LA(1)) {
						case T__12:
							{
							setState(166); ((MuldivExpContext)_localctx).mul = match(T__12);
							}
							break;
						case T__25:
							{
							setState(167); ((MuldivExpContext)_localctx).div = match(T__25);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(170); ((MuldivExpContext)_localctx).right = exp(8);
						}
						break;
					case 2:
						{
						_localctx = new AddsubExpContext(new ExpContext(_parentctx, _parentState));
						((AddsubExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(171);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(174);
						switch (_input.LA(1)) {
						case T__1:
							{
							setState(172); ((AddsubExpContext)_localctx).plus = match(T__1);
							}
							break;
						case T__0:
							{
							setState(173); ((AddsubExpContext)_localctx).sub = match(T__0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(176); ((AddsubExpContext)_localctx).right = exp(7);
						}
						break;
					case 3:
						{
						_localctx = new CompareExpContext(new ExpContext(_parentctx, _parentState));
						((CompareExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(177);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(183);
						switch (_input.LA(1)) {
						case T__6:
							{
							setState(178); ((CompareExpContext)_localctx).greater = match(T__6);
							}
							break;
						case T__7:
							{
							setState(179); ((CompareExpContext)_localctx).lesser = match(T__7);
							}
							break;
						case T__9:
							{
							setState(180); ((CompareExpContext)_localctx).greater_equals = match(T__9);
							}
							break;
						case T__15:
							{
							setState(181); ((CompareExpContext)_localctx).lesser_equals = match(T__15);
							}
							break;
						case T__8:
							{
							setState(182); ((CompareExpContext)_localctx).equals = match(T__8);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(185); ((CompareExpContext)_localctx).right = exp(6);
						}
						break;
					case 4:
						{
						_localctx = new AndorExpContext(new ExpContext(_parentctx, _parentState));
						((AndorExpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(186);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(189);
						switch (_input.LA(1)) {
						case T__19:
							{
							setState(187); ((AndorExpContext)_localctx).and = match(T__19);
							}
							break;
						case T__23:
							{
							setState(188); ((AndorExpContext)_localctx).or = match(T__23);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(191); ((AndorExpContext)_localctx).right = exp(5);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		case 8: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\6\2\27\n\2\r\2\16\2\30\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\5\2\"\n\2"+
		"\5\2$\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3"+
		"\63\13\3\5\3\65\n\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\5\7\5B"+
		"\n\5\f\5\16\5E\13\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\5\5N\n\5\3\6\3\6\3"+
		"\7\6\7S\n\7\r\7\16\7T\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\ba\n\b"+
		"\f\b\16\bd\13\b\5\bf\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bv\n\b\5\bx\n\b\3\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009e\n\n\f\n\16\n\u00a1\13\n"+
		"\5\n\u00a3\n\n\3\n\5\n\u00a6\n\n\3\n\3\n\3\n\5\n\u00ab\n\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00b1\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ba\n\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00c0\n\n\3\n\7\n\u00c3\n\n\f\n\16\n\u00c6\13\n\3\n\2\3\22"+
		"\13\2\4\6\b\n\f\16\20\22\2\3\5\2\6\6\16\16\27\27\u00e3\2#\3\2\2\2\4;\3"+
		"\2\2\2\6=\3\2\2\2\bC\3\2\2\2\nO\3\2\2\2\fR\3\2\2\2\16w\3\2\2\2\20|\3\2"+
		"\2\2\22\u00a5\3\2\2\2\24$\5\22\n\2\25\27\5\4\3\2\26\25\3\2\2\2\27\30\3"+
		"\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\35\3\2\2\2\32\34\5\16\b\2\33\32"+
		"\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36!\3\2\2\2\37\35\3"+
		"\2\2\2 \"\5\22\n\2! \3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#\24\3\2\2\2#\26\3\2"+
		"\2\2$\3\3\2\2\2%&\5\n\6\2&\'\7\36\2\2\'(\7\b\2\2(<\3\2\2\2)*\5\n\6\2*"+
		"+\7\36\2\2+\64\7\17\2\2,\61\5\6\4\2-.\7\21\2\2.\60\5\6\4\2/-\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\64,"+
		"\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\32\2\2\678\7\7\2\289\5\b"+
		"\5\29:\7\13\2\2:<\3\2\2\2;%\3\2\2\2;)\3\2\2\2<\5\3\2\2\2=>\5\n\6\2>?\7"+
		"\36\2\2?\7\3\2\2\2@B\5\4\3\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D"+
		"I\3\2\2\2EC\3\2\2\2FH\5\16\b\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"JM\3\2\2\2KI\3\2\2\2LN\5\22\n\2ML\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OP\t\2\2"+
		"\2P\13\3\2\2\2QS\5\16\b\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\r\3"+
		"\2\2\2VW\7\36\2\2WX\7\n\2\2XY\5\22\n\2YZ\7\b\2\2Zx\3\2\2\2[\\\7\36\2\2"+
		"\\e\7\17\2\2]b\5\22\n\2^_\7\21\2\2_a\5\22\n\2`^\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2e]\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7"+
		"\32\2\2hx\7\b\2\2ij\7\f\2\2jk\7\17\2\2kl\5\22\n\2lm\7\32\2\2mn\7\7\2\2"+
		"no\5\f\7\2ou\7\13\2\2pq\7\31\2\2qr\7\7\2\2rs\5\f\7\2st\7\13\2\2tv\3\2"+
		"\2\2up\3\2\2\2uv\3\2\2\2vx\3\2\2\2wV\3\2\2\2w[\3\2\2\2wi\3\2\2\2x\17\3"+
		"\2\2\2y{\5\16\b\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2"+
		"~|\3\2\2\2\177\u0080\5\22\n\2\u0080\21\3\2\2\2\u0081\u0082\b\n\1\2\u0082"+
		"\u0083\7\30\2\2\u0083\u00a6\5\22\n\n\u0084\u00a6\7\35\2\2\u0085\u00a6"+
		"\7\4\2\2\u0086\u00a6\7\22\2\2\u0087\u00a6\7\36\2\2\u0088\u0089\7\f\2\2"+
		"\u0089\u008a\7\17\2\2\u008a\u008b\5\22\n\2\u008b\u008c\7\32\2\2\u008c"+
		"\u008d\7\7\2\2\u008d\u008e\5\20\t\2\u008e\u008f\7\13\2\2\u008f\u0090\7"+
		"\31\2\2\u0090\u0091\7\7\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\13\2\2"+
		"\u0093\u00a6\3\2\2\2\u0094\u0095\7\17\2\2\u0095\u0096\5\22\n\2\u0096\u0097"+
		"\7\32\2\2\u0097\u00a6\3\2\2\2\u0098\u0099\7\36\2\2\u0099\u00a2\7\17\2"+
		"\2\u009a\u009f\5\22\n\2\u009b\u009c\7\21\2\2\u009c\u009e\5\22\n\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\32\2\2\u00a5\u0081\3"+
		"\2\2\2\u00a5\u0084\3\2\2\2\u00a5\u0085\3\2\2\2\u00a5\u0086\3\2\2\2\u00a5"+
		"\u0087\3\2\2\2\u00a5\u0088\3\2\2\2\u00a5\u0094\3\2\2\2\u00a5\u0098\3\2"+
		"\2\2\u00a6\u00c4\3\2\2\2\u00a7\u00aa\f\t\2\2\u00a8\u00ab\7\20\2\2\u00a9"+
		"\u00ab\7\3\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00c3\5\22\n\n\u00ad\u00b0\f\b\2\2\u00ae\u00b1\7\33\2\2\u00af"+
		"\u00b1\7\34\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b2\u00c3\5\22\n\t\u00b3\u00b9\f\7\2\2\u00b4\u00ba\7\26\2\2\u00b5"+
		"\u00ba\7\25\2\2\u00b6\u00ba\7\23\2\2\u00b7\u00ba\7\r\2\2\u00b8\u00ba\7"+
		"\24\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c3\5\22"+
		"\n\b\u00bc\u00bf\f\6\2\2\u00bd\u00c0\7\t\2\2\u00be\u00c0\7\5\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\5\22"+
		"\n\7\u00c2\u00a7\3\2\2\2\u00c2\u00ad\3\2\2\2\u00c2\u00b3\3\2\2\2\u00c2"+
		"\u00bc\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\23\3\2\2\2\u00c6\u00c4\3\2\2\2\33\30\35!#\61\64;CIMTbeuw|\u009f"+
		"\u00a2\u00a5\u00aa\u00b0\u00b9\u00bf\u00c2\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}