package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, CONST=3, INT=4, STRING=5, BOOL=6, TRUE=7, FALSE=8, READ=9, 
		PRINTLN=10, IF=11, ELSE=12, WHILE=13, FOR=14, PLUS=15, MINUS=16, MULT=17, 
		DIV=18, SQRT=19, COS=20, SIN=21, POW=22, AND=23, OR=24, NOT=25, MYQ=26, 
		MNQ=27, DIST=28, IGL=29, ASSIGN=30, LLAVE_ABRIR=31, LLAVE_CERRAR=32, PAR_ABRIR=33, 
		PAR_CERRAR=34, PUNTOCOMA=35, A=36, B=37, C=38, D=39, E=40, F=41, G=42, 
		H=43, I=44, J=45, K=46, L=47, M=48, N=49, O=50, P=51, Q=52, R=53, S=54, 
		T=55, U=56, V=57, W=58, X=59, Y=60, Z=61, MA=62, MB=63, MC=64, MD=65, 
		ME=66, MF=67, MG=68, MH=69, MI=70, MJ=71, MK=72, ML=73, MM=74, MN=75, 
		MO=76, MP=77, MQ=78, MR=79, MS=80, MT=81, MU=82, MV=83, MW=84, MX=85, 
		MY=86, MZ=87, N0=88, N1=89, N2=90, N3=91, N4=92, N5=93, N6=94, N7=95, 
		N8=96, N9=97, WS=98;
	public static final String[] tokenNames = {
		"<INVALID>", "'	Q0oQQ0Oo	'", "'	Q00oQ00Q	'", "'	Q00OQ0Oo	'", "'	Q0oQQQQo	'", 
		"'	QQ0OQQQ0	'", "'	Q00oQ0OO	'", "'	QQQ0QQ0o	'", "'	Q0QoQ00Q	'", "'	Q0O0Q0QQ	'", 
		"'	Q0QQQQ0O	'", "'	Q0oQQ0Qo	'", "'Q0QQQ0O0'", "'	Q0OQQ0QQ	'", "'	Q0QoQ0OO	'", 
		"'	QQ00Q0O0	'", "'	Q0OQQ0oQ	'", "'	Q0OQQQQQ	'", "'	Q0Q0Q0oQ	'", "'	QQ0OQQ0Q	'", 
		"'	Q00OQ0OO	'", "'	QQ0OQ0oQ	'", "'	QQ00Q0OO	'", "'	Q00QQ0Oo	'", "'	Q0OOQQ0o	'", 
		"'	Q0OoQ0OO	'", "'	Q0OQQQoQ	'", "'	Q0OQQ0Oo	'", "'	OOo0OOQ	'", "'	OO00OOQ	'", 
		"'	Q00QQQ0O	'", "'	Q0O0Q00Q	'", "'	Q0O0Q00O	'", "'	QQ00Q00Q	'", "'	QQ00Q00O	'", 
		"'	QQ00QQQQ	'", "'	Qo0Q	'", "'	Qo0o	'", "'	Qo0O	'", "'	QoQ0	'", "'	QoQQ	'", 
		"'	QoQo	'", "'	QoQO	'", "'	Qoo0	'", "'	QooQ	'", "'	Qooo	'", "'	QooO	'", 
		"'	QoO0	'", "'	QoOQ	'", "'	QoOo	'", "'	QoOO	'", "'	QO00	'", "'	QO0Q	'", 
		"'	QO0o	'", "'	QO0O	'", "'	QOQ0	'", "'	QOQQ	'", "'	QOQo	'", "'	QOQO	'", 
		"'	QOo0	'", "'	QOoQ	'", "'	QOoo	'", "'	Q00Q	'", "'	Q00o	'", "'	Q00O	'", 
		"'	Q0Q0	'", "'	Q0QQ	'", "'	Q0Qo	'", "'	Q0QO	'", "'	Q0o0	'", "'	Q0oQ	'", 
		"'	Q0oo	'", "'	Q0oO	'", "'	Q0O0	'", "'	Q0OQ	'", "'	Q0Oo	'", "'	Q0OO	'", 
		"'	QQ00	'", "'	QQ0Q	'", "'	QQ0o	'", "'	QQ0O	'", "'	QQQ0	'", "'	QQQQ	'", 
		"'	QQQo	'", "'	QQQO	'", "'	QQo0	'", "'	QQoQ	'", "'	QQoo	'", "'	O00	'", 
		"'	O0Q	'", "'	O0o	'", "'	O0O	'", "'	OQ0	'", "'	OQQ	'", "'	OQo	'", "'	OQO	'", 
		"'	Oo0	'", "'	OoQ	'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_texto = 1, RULE_numero = 2, RULE_sentencia = 3, 
		RULE_var_decl = 4, RULE_const_decl = 5, RULE_int_decl = 6, RULE_var_asignar = 7, 
		RULE_operacion = 8, RULE_sqrt = 9, RULE_pow = 10, RULE_cos = 11, RULE_sin = 12, 
		RULE_println = 13, RULE_read = 14, RULE_condicional = 15, RULE_condicion = 16, 
		RULE_r_if = 17, RULE_r_else = 18, RULE_r_while = 19, RULE_r_for = 20, 
		RULE_paso = 21;
	public static final String[] ruleNames = {
		"program", "texto", "numero", "sentencia", "var_decl", "const_decl", "int_decl", 
		"var_asignar", "operacion", "sqrt", "pow", "cos", "sin", "println", "read", 
		"condicional", "condicion", "r_if", "r_else", "r_while", "r_for", "paso"
	};

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode LLAVE_CERRAR() { return getToken(ParserTParser.LLAVE_CERRAR, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode LLAVE_ABRIR() { return getToken(ParserTParser.LLAVE_ABRIR, 0); }
		public TerminalNode PROGRAM() { return getToken(ParserTParser.PROGRAM, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(PROGRAM);
			setState(45); texto();
			setState(46); match(LLAVE_ABRIR);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << MA) | (1L << MB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MC - 64)) | (1L << (MD - 64)) | (1L << (ME - 64)) | (1L << (MF - 64)) | (1L << (MG - 64)) | (1L << (MH - 64)) | (1L << (MI - 64)) | (1L << (MJ - 64)) | (1L << (MK - 64)) | (1L << (ML - 64)) | (1L << (MM - 64)) | (1L << (MN - 64)) | (1L << (MO - 64)) | (1L << (MP - 64)) | (1L << (MQ - 64)) | (1L << (MR - 64)) | (1L << (MS - 64)) | (1L << (MT - 64)) | (1L << (MU - 64)) | (1L << (MV - 64)) | (1L << (MW - 64)) | (1L << (MX - 64)) | (1L << (MY - 64)) | (1L << (MZ - 64)))) != 0)) {
				{
				{
				setState(47); sentencia();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53); match(LLAVE_CERRAR);
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

	public static class TextoContext extends ParserRuleContext {
		public TerminalNode MJ(int i) {
			return getToken(ParserTParser.MJ, i);
		}
		public TerminalNode W(int i) {
			return getToken(ParserTParser.W, i);
		}
		public List<TerminalNode> MP() { return getTokens(ParserTParser.MP); }
		public TerminalNode MA(int i) {
			return getToken(ParserTParser.MA, i);
		}
		public TerminalNode ME(int i) {
			return getToken(ParserTParser.ME, i);
		}
		public List<TerminalNode> G() { return getTokens(ParserTParser.G); }
		public TerminalNode MQ(int i) {
			return getToken(ParserTParser.MQ, i);
		}
		public List<TerminalNode> I() { return getTokens(ParserTParser.I); }
		public List<TerminalNode> MF() { return getTokens(ParserTParser.MF); }
		public TerminalNode MU(int i) {
			return getToken(ParserTParser.MU, i);
		}
		public TerminalNode I(int i) {
			return getToken(ParserTParser.I, i);
		}
		public List<TerminalNode> ME() { return getTokens(ParserTParser.ME); }
		public List<TerminalNode> MC() { return getTokens(ParserTParser.MC); }
		public TerminalNode MV(int i) {
			return getToken(ParserTParser.MV, i);
		}
		public TerminalNode U(int i) {
			return getToken(ParserTParser.U, i);
		}
		public TerminalNode V(int i) {
			return getToken(ParserTParser.V, i);
		}
		public TerminalNode MC(int i) {
			return getToken(ParserTParser.MC, i);
		}
		public List<TerminalNode> MM() { return getTokens(ParserTParser.MM); }
		public TerminalNode MI(int i) {
			return getToken(ParserTParser.MI, i);
		}
		public TerminalNode C(int i) {
			return getToken(ParserTParser.C, i);
		}
		public TerminalNode ML(int i) {
			return getToken(ParserTParser.ML, i);
		}
		public List<TerminalNode> MB() { return getTokens(ParserTParser.MB); }
		public List<TerminalNode> MA() { return getTokens(ParserTParser.MA); }
		public List<TerminalNode> MG() { return getTokens(ParserTParser.MG); }
		public TerminalNode A(int i) {
			return getToken(ParserTParser.A, i);
		}
		public TerminalNode MX(int i) {
			return getToken(ParserTParser.MX, i);
		}
		public List<TerminalNode> MU() { return getTokens(ParserTParser.MU); }
		public TerminalNode H(int i) {
			return getToken(ParserTParser.H, i);
		}
		public List<TerminalNode> J() { return getTokens(ParserTParser.J); }
		public TerminalNode J(int i) {
			return getToken(ParserTParser.J, i);
		}
		public List<TerminalNode> MJ() { return getTokens(ParserTParser.MJ); }
		public List<TerminalNode> S() { return getTokens(ParserTParser.S); }
		public TerminalNode MT(int i) {
			return getToken(ParserTParser.MT, i);
		}
		public TerminalNode MN(int i) {
			return getToken(ParserTParser.MN, i);
		}
		public TerminalNode E(int i) {
			return getToken(ParserTParser.E, i);
		}
		public TerminalNode S(int i) {
			return getToken(ParserTParser.S, i);
		}
		public TerminalNode D(int i) {
			return getToken(ParserTParser.D, i);
		}
		public TerminalNode MS(int i) {
			return getToken(ParserTParser.MS, i);
		}
		public List<TerminalNode> W() { return getTokens(ParserTParser.W); }
		public TerminalNode G(int i) {
			return getToken(ParserTParser.G, i);
		}
		public List<TerminalNode> M() { return getTokens(ParserTParser.M); }
		public List<TerminalNode> D() { return getTokens(ParserTParser.D); }
		public List<TerminalNode> E() { return getTokens(ParserTParser.E); }
		public TerminalNode MY(int i) {
			return getToken(ParserTParser.MY, i);
		}
		public List<TerminalNode> Z() { return getTokens(ParserTParser.Z); }
		public TerminalNode MR(int i) {
			return getToken(ParserTParser.MR, i);
		}
		public List<TerminalNode> N() { return getTokens(ParserTParser.N); }
		public List<TerminalNode> MT() { return getTokens(ParserTParser.MT); }
		public TerminalNode R(int i) {
			return getToken(ParserTParser.R, i);
		}
		public TerminalNode T(int i) {
			return getToken(ParserTParser.T, i);
		}
		public List<TerminalNode> MI() { return getTokens(ParserTParser.MI); }
		public List<TerminalNode> B() { return getTokens(ParserTParser.B); }
		public List<TerminalNode> C() { return getTokens(ParserTParser.C); }
		public List<TerminalNode> MH() { return getTokens(ParserTParser.MH); }
		public List<TerminalNode> MS() { return getTokens(ParserTParser.MS); }
		public List<TerminalNode> L() { return getTokens(ParserTParser.L); }
		public List<TerminalNode> MY() { return getTokens(ParserTParser.MY); }
		public List<TerminalNode> T() { return getTokens(ParserTParser.T); }
		public TerminalNode K(int i) {
			return getToken(ParserTParser.K, i);
		}
		public List<TerminalNode> MN() { return getTokens(ParserTParser.MN); }
		public List<TerminalNode> MW() { return getTokens(ParserTParser.MW); }
		public TerminalNode MG(int i) {
			return getToken(ParserTParser.MG, i);
		}
		public List<TerminalNode> K() { return getTokens(ParserTParser.K); }
		public List<TerminalNode> MR() { return getTokens(ParserTParser.MR); }
		public TerminalNode MF(int i) {
			return getToken(ParserTParser.MF, i);
		}
		public List<TerminalNode> MZ() { return getTokens(ParserTParser.MZ); }
		public List<TerminalNode> MD() { return getTokens(ParserTParser.MD); }
		public List<TerminalNode> MO() { return getTokens(ParserTParser.MO); }
		public TerminalNode MZ(int i) {
			return getToken(ParserTParser.MZ, i);
		}
		public List<TerminalNode> P() { return getTokens(ParserTParser.P); }
		public TerminalNode MW(int i) {
			return getToken(ParserTParser.MW, i);
		}
		public TerminalNode MO(int i) {
			return getToken(ParserTParser.MO, i);
		}
		public List<TerminalNode> Y() { return getTokens(ParserTParser.Y); }
		public List<TerminalNode> H() { return getTokens(ParserTParser.H); }
		public TerminalNode M(int i) {
			return getToken(ParserTParser.M, i);
		}
		public TerminalNode MD(int i) {
			return getToken(ParserTParser.MD, i);
		}
		public List<TerminalNode> F() { return getTokens(ParserTParser.F); }
		public TerminalNode Y(int i) {
			return getToken(ParserTParser.Y, i);
		}
		public List<TerminalNode> R() { return getTokens(ParserTParser.R); }
		public TerminalNode Z(int i) {
			return getToken(ParserTParser.Z, i);
		}
		public TerminalNode Q(int i) {
			return getToken(ParserTParser.Q, i);
		}
		public TerminalNode N(int i) {
			return getToken(ParserTParser.N, i);
		}
		public List<TerminalNode> X() { return getTokens(ParserTParser.X); }
		public TerminalNode MB(int i) {
			return getToken(ParserTParser.MB, i);
		}
		public TerminalNode MM(int i) {
			return getToken(ParserTParser.MM, i);
		}
		public TerminalNode F(int i) {
			return getToken(ParserTParser.F, i);
		}
		public TerminalNode P(int i) {
			return getToken(ParserTParser.P, i);
		}
		public List<TerminalNode> U() { return getTokens(ParserTParser.U); }
		public List<TerminalNode> MQ() { return getTokens(ParserTParser.MQ); }
		public List<TerminalNode> ML() { return getTokens(ParserTParser.ML); }
		public TerminalNode MP(int i) {
			return getToken(ParserTParser.MP, i);
		}
		public List<TerminalNode> O() { return getTokens(ParserTParser.O); }
		public List<TerminalNode> MX() { return getTokens(ParserTParser.MX); }
		public List<TerminalNode> A() { return getTokens(ParserTParser.A); }
		public TerminalNode X(int i) {
			return getToken(ParserTParser.X, i);
		}
		public List<TerminalNode> V() { return getTokens(ParserTParser.V); }
		public TerminalNode MK(int i) {
			return getToken(ParserTParser.MK, i);
		}
		public TerminalNode B(int i) {
			return getToken(ParserTParser.B, i);
		}
		public List<TerminalNode> MV() { return getTokens(ParserTParser.MV); }
		public List<TerminalNode> MK() { return getTokens(ParserTParser.MK); }
		public TerminalNode O(int i) {
			return getToken(ParserTParser.O, i);
		}
		public TerminalNode MH(int i) {
			return getToken(ParserTParser.MH, i);
		}
		public TerminalNode L(int i) {
			return getToken(ParserTParser.L, i);
		}
		public List<TerminalNode> Q() { return getTokens(ParserTParser.Q); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_texto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				_la = _input.LA(1);
				if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (A - 36)) | (1L << (B - 36)) | (1L << (C - 36)) | (1L << (D - 36)) | (1L << (E - 36)) | (1L << (F - 36)) | (1L << (G - 36)) | (1L << (H - 36)) | (1L << (I - 36)) | (1L << (J - 36)) | (1L << (K - 36)) | (1L << (L - 36)) | (1L << (M - 36)) | (1L << (N - 36)) | (1L << (O - 36)) | (1L << (P - 36)) | (1L << (Q - 36)) | (1L << (R - 36)) | (1L << (S - 36)) | (1L << (T - 36)) | (1L << (U - 36)) | (1L << (V - 36)) | (1L << (W - 36)) | (1L << (X - 36)) | (1L << (Y - 36)) | (1L << (Z - 36)) | (1L << (MA - 36)) | (1L << (MB - 36)) | (1L << (MC - 36)) | (1L << (MD - 36)) | (1L << (ME - 36)) | (1L << (MF - 36)) | (1L << (MG - 36)) | (1L << (MH - 36)) | (1L << (MI - 36)) | (1L << (MJ - 36)) | (1L << (MK - 36)) | (1L << (ML - 36)) | (1L << (MM - 36)) | (1L << (MN - 36)) | (1L << (MO - 36)) | (1L << (MP - 36)) | (1L << (MQ - 36)) | (1L << (MR - 36)) | (1L << (MS - 36)) | (1L << (MT - 36)) | (1L << (MU - 36)) | (1L << (MV - 36)) | (1L << (MW - 36)) | (1L << (MX - 36)) | (1L << (MY - 36)) | (1L << (MZ - 36)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (A - 36)) | (1L << (B - 36)) | (1L << (C - 36)) | (1L << (D - 36)) | (1L << (E - 36)) | (1L << (F - 36)) | (1L << (G - 36)) | (1L << (H - 36)) | (1L << (I - 36)) | (1L << (J - 36)) | (1L << (K - 36)) | (1L << (L - 36)) | (1L << (M - 36)) | (1L << (N - 36)) | (1L << (O - 36)) | (1L << (P - 36)) | (1L << (Q - 36)) | (1L << (R - 36)) | (1L << (S - 36)) | (1L << (T - 36)) | (1L << (U - 36)) | (1L << (V - 36)) | (1L << (W - 36)) | (1L << (X - 36)) | (1L << (Y - 36)) | (1L << (Z - 36)) | (1L << (MA - 36)) | (1L << (MB - 36)) | (1L << (MC - 36)) | (1L << (MD - 36)) | (1L << (ME - 36)) | (1L << (MF - 36)) | (1L << (MG - 36)) | (1L << (MH - 36)) | (1L << (MI - 36)) | (1L << (MJ - 36)) | (1L << (MK - 36)) | (1L << (ML - 36)) | (1L << (MM - 36)) | (1L << (MN - 36)) | (1L << (MO - 36)) | (1L << (MP - 36)) | (1L << (MQ - 36)) | (1L << (MR - 36)) | (1L << (MS - 36)) | (1L << (MT - 36)) | (1L << (MU - 36)) | (1L << (MV - 36)) | (1L << (MW - 36)) | (1L << (MX - 36)) | (1L << (MY - 36)) | (1L << (MZ - 36)))) != 0) );
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode N0(int i) {
			return getToken(ParserTParser.N0, i);
		}
		public TerminalNode N4(int i) {
			return getToken(ParserTParser.N4, i);
		}
		public TerminalNode N7(int i) {
			return getToken(ParserTParser.N7, i);
		}
		public List<TerminalNode> N6() { return getTokens(ParserTParser.N6); }
		public List<TerminalNode> N1() { return getTokens(ParserTParser.N1); }
		public List<TerminalNode> N7() { return getTokens(ParserTParser.N7); }
		public List<TerminalNode> N8() { return getTokens(ParserTParser.N8); }
		public List<TerminalNode> N2() { return getTokens(ParserTParser.N2); }
		public List<TerminalNode> N3() { return getTokens(ParserTParser.N3); }
		public TerminalNode N3(int i) {
			return getToken(ParserTParser.N3, i);
		}
		public TerminalNode N2(int i) {
			return getToken(ParserTParser.N2, i);
		}
		public TerminalNode N1(int i) {
			return getToken(ParserTParser.N1, i);
		}
		public List<TerminalNode> N5() { return getTokens(ParserTParser.N5); }
		public List<TerminalNode> N0() { return getTokens(ParserTParser.N0); }
		public TerminalNode N5(int i) {
			return getToken(ParserTParser.N5, i);
		}
		public TerminalNode N6(int i) {
			return getToken(ParserTParser.N6, i);
		}
		public List<TerminalNode> N9() { return getTokens(ParserTParser.N9); }
		public TerminalNode N9(int i) {
			return getToken(ParserTParser.N9, i);
		}
		public List<TerminalNode> N4() { return getTokens(ParserTParser.N4); }
		public TerminalNode N8(int i) {
			return getToken(ParserTParser.N8, i);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				_la = _input.LA(1);
				if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (N0 - 88)) | (1L << (N1 - 88)) | (1L << (N2 - 88)) | (1L << (N3 - 88)) | (1L << (N4 - 88)) | (1L << (N5 - 88)) | (1L << (N6 - 88)) | (1L << (N7 - 88)) | (1L << (N8 - 88)) | (1L << (N9 - 88)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (N0 - 88)) | (1L << (N1 - 88)) | (1L << (N2 - 88)) | (1L << (N3 - 88)) | (1L << (N4 - 88)) | (1L << (N5 - 88)) | (1L << (N6 - 88)) | (1L << (N7 - 88)) | (1L << (N8 - 88)) | (1L << (N9 - 88)))) != 0) );
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

	public static class SentenciaContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public R_forContext r_for() {
			return getRuleContext(R_forContext.class,0);
		}
		public Var_asignarContext var_asignar() {
			return getRuleContext(Var_asignarContext.class,0);
		}
		public R_whileContext r_while() {
			return getRuleContext(R_whileContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public R_ifContext r_if() {
			return getRuleContext(R_ifContext.class,0);
		}
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentencia);
		try {
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); const_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); var_asignar();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68); println();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69); read();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70); r_if();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71); r_while();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72); r_for();
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public TerminalNode BOOL() { return getToken(ParserTParser.BOOL, 0); }
		public TerminalNode VAR() { return getToken(ParserTParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(VAR);
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(77); texto();
			setState(78); match(PUNTOCOMA);
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

	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ParserTParser.CONST, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public TerminalNode BOOL() { return getToken(ParserTParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitConst_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_const_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(CONST);
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(82); texto();
			setState(83); match(PUNTOCOMA);
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

	public static class Int_declContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public Int_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitInt_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_declContext int_decl() throws RecognitionException {
		Int_declContext _localctx = new Int_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_int_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(INT);
			setState(86); texto();
			setState(87); match(ASSIGN);
			setState(88); numero();
			setState(89); match(PUNTOCOMA);
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

	public static class Var_asignarContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public TerminalNode FALSE() { return getToken(ParserTParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(ParserTParser.TRUE, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public Var_asignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_asignar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVar_asignar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_asignarContext var_asignar() throws RecognitionException {
		Var_asignarContext _localctx = new Var_asignarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_asignar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); texto();
			setState(92); match(ASSIGN);
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(93); numero();
				}
				break;
			case 2:
				{
				setState(94); texto();
				}
				break;
			case 3:
				{
				setState(95); match(TRUE);
				}
				break;
			case 4:
				{
				setState(96); match(FALSE);
				}
				break;
			case 5:
				{
				setState(97); operacion();
				}
				break;
			}
			setState(100); match(PUNTOCOMA);
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

	public static class OperacionContext extends ParserRuleContext {
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public TerminalNode MULT() { return getToken(ParserTParser.MULT, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public SinContext sin() {
			return getRuleContext(SinContext.class,0);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ParserTParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserTParser.MINUS, 0); }
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public TerminalNode DIV() { return getToken(ParserTParser.DIV, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacion);
		int _la;
		try {
			setState(110);
			switch (_input.LA(1)) {
			case N0:
			case N1:
			case N2:
			case N3:
			case N4:
			case N5:
			case N6:
			case N7:
			case N8:
			case N9:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102); numero();
				setState(103);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(104); numero();
				}
				}
				break;
			case SQRT:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); sqrt();
				}
				break;
			case POW:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); pow();
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 4);
				{
				setState(108); cos();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(109); sin();
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

	public static class SqrtContext extends ParserRuleContext {
		public TerminalNode SQRT() { return getToken(ParserTParser.SQRT, 0); }
		public TerminalNode PAR_ABRIR() { return getToken(ParserTParser.PAR_ABRIR, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode PAR_CERRAR() { return getToken(ParserTParser.PAR_CERRAR, 0); }
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(SQRT);
			setState(113); match(PAR_ABRIR);
			setState(114); numero();
			setState(115); match(PAR_CERRAR);
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

	public static class PowContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public TerminalNode PAR_ABRIR() { return getToken(ParserTParser.PAR_ABRIR, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode PAR_CERRAR() { return getToken(ParserTParser.PAR_CERRAR, 0); }
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode POW() { return getToken(ParserTParser.POW, 0); }
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(POW);
			setState(118); match(PAR_ABRIR);
			setState(119); numero();
			setState(120); match(PUNTOCOMA);
			setState(121); numero();
			setState(122); match(PAR_CERRAR);
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

	public static class CosContext extends ParserRuleContext {
		public TerminalNode PAR_ABRIR() { return getToken(ParserTParser.PAR_ABRIR, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode PAR_CERRAR() { return getToken(ParserTParser.PAR_CERRAR, 0); }
		public TerminalNode COS() { return getToken(ParserTParser.COS, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(COS);
			setState(125); match(PAR_ABRIR);
			setState(126); numero();
			setState(127); match(PAR_CERRAR);
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

	public static class SinContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(ParserTParser.SIN, 0); }
		public TerminalNode PAR_ABRIR() { return getToken(ParserTParser.PAR_ABRIR, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode PAR_CERRAR() { return getToken(ParserTParser.PAR_CERRAR, 0); }
		public SinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinContext sin() throws RecognitionException {
		SinContext _localctx = new SinContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(SIN);
			setState(130); match(PAR_ABRIR);
			setState(131); numero();
			setState(132); match(PAR_CERRAR);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode PRINTLN() { return getToken(ParserTParser.PRINTLN, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(PRINTLN);
			setState(137);
			switch (_input.LA(1)) {
			case N0:
			case N1:
			case N2:
			case N3:
			case N4:
			case N5:
			case N6:
			case N7:
			case N8:
			case N9:
				{
				setState(135); numero();
				}
				break;
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case MA:
			case MB:
			case MC:
			case MD:
			case ME:
			case MF:
			case MG:
			case MH:
			case MI:
			case MJ:
			case MK:
			case ML:
			case MM:
			case MN:
			case MO:
			case MP:
			case MQ:
			case MR:
			case MS:
			case MT:
			case MU:
			case MV:
			case MW:
			case MX:
			case MY:
			case MZ:
				{
				setState(136); texto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(139); match(PUNTOCOMA);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ParserTParser.ASSIGN, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode READ() { return getToken(ParserTParser.READ, 0); }
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); texto();
			setState(142); match(ASSIGN);
			setState(143); match(READ);
			setState(146);
			switch (_input.LA(1)) {
			case N0:
			case N1:
			case N2:
			case N3:
			case N4:
			case N5:
			case N6:
			case N7:
			case N8:
			case N9:
				{
				setState(144); numero();
				}
				break;
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case MA:
			case MB:
			case MC:
			case MD:
			case ME:
			case MF:
			case MG:
			case MH:
			case MI:
			case MJ:
			case MK:
			case ML:
			case MM:
			case MN:
			case MO:
			case MP:
			case MQ:
			case MR:
			case MS:
			case MT:
			case MU:
			case MV:
			case MW:
			case MX:
			case MY:
			case MZ:
				{
				setState(145); texto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148); match(PUNTOCOMA);
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

	public static class CondicionalContext extends ParserRuleContext {
		public List<TerminalNode> NOT() { return getTokens(ParserTParser.NOT); }
		public TerminalNode AND(int i) {
			return getToken(ParserTParser.AND, i);
		}
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(ParserTParser.AND); }
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(ParserTParser.OR); }
		public TerminalNode NOT(int i) {
			return getToken(ParserTParser.NOT, i);
		}
		public TerminalNode OR(int i) {
			return getToken(ParserTParser.OR, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(150); match(NOT);
				}
			}

			setState(153); condicion();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(156);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(155); match(NOT);
					}
				}

				setState(158); condicion();
				}
				}
				setState(163);
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode DIST() { return getToken(ParserTParser.DIST, 0); }
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public TerminalNode FALSE() { return getToken(ParserTParser.FALSE, 0); }
		public TerminalNode IGL() { return getToken(ParserTParser.IGL, 0); }
		public TerminalNode TRUE() { return getToken(ParserTParser.TRUE, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public TerminalNode MNQ() { return getToken(ParserTParser.MNQ, 0); }
		public TerminalNode MYQ() { return getToken(ParserTParser.MYQ, 0); }
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(164); match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(165); match(FALSE);
				}
				break;
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case MA:
			case MB:
			case MC:
			case MD:
			case ME:
			case MF:
			case MG:
			case MH:
			case MI:
			case MJ:
			case MK:
			case ML:
			case MM:
			case MN:
			case MO:
			case MP:
			case MQ:
			case MR:
			case MS:
			case MT:
			case MU:
			case MV:
			case MW:
			case MX:
			case MY:
			case MZ:
			case N0:
			case N1:
			case N2:
			case N3:
			case N4:
			case N5:
			case N6:
			case N7:
			case N8:
			case N9:
				{
				setState(168);
				switch (_input.LA(1)) {
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
				case MA:
				case MB:
				case MC:
				case MD:
				case ME:
				case MF:
				case MG:
				case MH:
				case MI:
				case MJ:
				case MK:
				case ML:
				case MM:
				case MN:
				case MO:
				case MP:
				case MQ:
				case MR:
				case MS:
				case MT:
				case MU:
				case MV:
				case MW:
				case MX:
				case MY:
				case MZ:
					{
					setState(166); texto();
					}
					break;
				case N0:
				case N1:
				case N2:
				case N3:
				case N4:
				case N5:
				case N6:
				case N7:
				case N8:
				case N9:
					{
					setState(167); numero();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(170);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MYQ) | (1L << MNQ) | (1L << DIST) | (1L << IGL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(173);
				switch (_input.LA(1)) {
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
				case MA:
				case MB:
				case MC:
				case MD:
				case ME:
				case MF:
				case MG:
				case MH:
				case MI:
				case MJ:
				case MK:
				case ML:
				case MM:
				case MN:
				case MO:
				case MP:
				case MQ:
				case MR:
				case MS:
				case MT:
				case MU:
				case MV:
				case MW:
				case MX:
				case MY:
				case MZ:
					{
					setState(171); texto();
					}
					break;
				case N0:
				case N1:
				case N2:
				case N3:
				case N4:
				case N5:
				case N6:
				case N7:
				case N8:
				case N9:
					{
					setState(172); numero();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class R_ifContext extends ParserRuleContext {
		public TerminalNode LLAVE_CERRAR() { return getToken(ParserTParser.LLAVE_CERRAR, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public TerminalNode IF() { return getToken(ParserTParser.IF, 0); }
		public TerminalNode PAR_ABRIR() { return getToken(ParserTParser.PAR_ABRIR, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode PAR_CERRAR() { return getToken(ParserTParser.PAR_CERRAR, 0); }
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode LLAVE_ABRIR() { return getToken(ParserTParser.LLAVE_ABRIR, 0); }
		public R_elseContext r_else() {
			return getRuleContext(R_elseContext.class,0);
		}
		public R_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitR_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_ifContext r_if() throws RecognitionException {
		R_ifContext _localctx = new R_ifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_r_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(IF);
			setState(178); match(PAR_ABRIR);
			setState(179); condicional();
			setState(180); match(PAR_CERRAR);
			setState(181); match(LLAVE_ABRIR);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << MA) | (1L << MB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MC - 64)) | (1L << (MD - 64)) | (1L << (ME - 64)) | (1L << (MF - 64)) | (1L << (MG - 64)) | (1L << (MH - 64)) | (1L << (MI - 64)) | (1L << (MJ - 64)) | (1L << (MK - 64)) | (1L << (ML - 64)) | (1L << (MM - 64)) | (1L << (MN - 64)) | (1L << (MO - 64)) | (1L << (MP - 64)) | (1L << (MQ - 64)) | (1L << (MR - 64)) | (1L << (MS - 64)) | (1L << (MT - 64)) | (1L << (MU - 64)) | (1L << (MV - 64)) | (1L << (MW - 64)) | (1L << (MX - 64)) | (1L << (MY - 64)) | (1L << (MZ - 64)))) != 0)) {
				{
				{
				setState(182); sentencia();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188); match(LLAVE_CERRAR);
			setState(190);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(189); r_else();
				}
			}

			setState(192); match(PUNTOCOMA);
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

	public static class R_elseContext extends ParserRuleContext {
		public TerminalNode LLAVE_CERRAR() { return getToken(ParserTParser.LLAVE_CERRAR, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public TerminalNode ELSE() { return getToken(ParserTParser.ELSE, 0); }
		public R_ifContext r_if() {
			return getRuleContext(R_ifContext.class,0);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode LLAVE_ABRIR() { return getToken(ParserTParser.LLAVE_ABRIR, 0); }
		public R_elseContext r_else() {
			return getRuleContext(R_elseContext.class,0);
		}
		public R_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitR_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_elseContext r_else() throws RecognitionException {
		R_elseContext _localctx = new R_elseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_r_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(ELSE);
			setState(196);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(195); r_if();
				}
			}

			setState(198); match(LLAVE_ABRIR);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << MA) | (1L << MB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MC - 64)) | (1L << (MD - 64)) | (1L << (ME - 64)) | (1L << (MF - 64)) | (1L << (MG - 64)) | (1L << (MH - 64)) | (1L << (MI - 64)) | (1L << (MJ - 64)) | (1L << (MK - 64)) | (1L << (ML - 64)) | (1L << (MM - 64)) | (1L << (MN - 64)) | (1L << (MO - 64)) | (1L << (MP - 64)) | (1L << (MQ - 64)) | (1L << (MR - 64)) | (1L << (MS - 64)) | (1L << (MT - 64)) | (1L << (MU - 64)) | (1L << (MV - 64)) | (1L << (MW - 64)) | (1L << (MX - 64)) | (1L << (MY - 64)) | (1L << (MZ - 64)))) != 0)) {
				{
				{
				setState(199); sentencia();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205); match(LLAVE_CERRAR);
			setState(207);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(206); r_else();
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

	public static class R_whileContext extends ParserRuleContext {
		public TerminalNode LLAVE_CERRAR() { return getToken(ParserTParser.LLAVE_CERRAR, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public TerminalNode PAR_ABRIR() { return getToken(ParserTParser.PAR_ABRIR, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode PAR_CERRAR() { return getToken(ParserTParser.PAR_CERRAR, 0); }
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode LLAVE_ABRIR() { return getToken(ParserTParser.LLAVE_ABRIR, 0); }
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public R_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitR_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_whileContext r_while() throws RecognitionException {
		R_whileContext _localctx = new R_whileContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_r_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(WHILE);
			setState(210); match(PAR_ABRIR);
			setState(211); condicional();
			setState(212); match(PAR_CERRAR);
			setState(213); match(LLAVE_ABRIR);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << MA) | (1L << MB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MC - 64)) | (1L << (MD - 64)) | (1L << (ME - 64)) | (1L << (MF - 64)) | (1L << (MG - 64)) | (1L << (MH - 64)) | (1L << (MI - 64)) | (1L << (MJ - 64)) | (1L << (MK - 64)) | (1L << (ML - 64)) | (1L << (MM - 64)) | (1L << (MN - 64)) | (1L << (MO - 64)) | (1L << (MP - 64)) | (1L << (MQ - 64)) | (1L << (MR - 64)) | (1L << (MS - 64)) | (1L << (MT - 64)) | (1L << (MU - 64)) | (1L << (MV - 64)) | (1L << (MW - 64)) | (1L << (MX - 64)) | (1L << (MY - 64)) | (1L << (MZ - 64)))) != 0)) {
				{
				{
				setState(214); sentencia();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220); match(LLAVE_CERRAR);
			setState(221); match(PUNTOCOMA);
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

	public static class R_forContext extends ParserRuleContext {
		public TerminalNode LLAVE_CERRAR() { return getToken(ParserTParser.LLAVE_CERRAR, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public List<TerminalNode> PUNTOCOMA() { return getTokens(ParserTParser.PUNTOCOMA); }
		public TerminalNode PUNTOCOMA(int i) {
			return getToken(ParserTParser.PUNTOCOMA, i);
		}
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public TerminalNode PAR_ABRIR() { return getToken(ParserTParser.PAR_ABRIR, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode FOR() { return getToken(ParserTParser.FOR, 0); }
		public TerminalNode PAR_CERRAR() { return getToken(ParserTParser.PAR_CERRAR, 0); }
		public Int_declContext int_decl() {
			return getRuleContext(Int_declContext.class,0);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode LLAVE_ABRIR() { return getToken(ParserTParser.LLAVE_ABRIR, 0); }
		public R_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitR_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_forContext r_for() throws RecognitionException {
		R_forContext _localctx = new R_forContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_r_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); match(FOR);
			setState(224); match(PAR_ABRIR);
			setState(225); int_decl();
			setState(226); match(PUNTOCOMA);
			setState(227); condicional();
			setState(228); match(PUNTOCOMA);
			setState(229); paso();
			setState(230); match(PAR_CERRAR);
			setState(231); match(LLAVE_ABRIR);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONST) | (1L << PRINTLN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << MA) | (1L << MB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MC - 64)) | (1L << (MD - 64)) | (1L << (ME - 64)) | (1L << (MF - 64)) | (1L << (MG - 64)) | (1L << (MH - 64)) | (1L << (MI - 64)) | (1L << (MJ - 64)) | (1L << (MK - 64)) | (1L << (ML - 64)) | (1L << (MM - 64)) | (1L << (MN - 64)) | (1L << (MO - 64)) | (1L << (MP - 64)) | (1L << (MQ - 64)) | (1L << (MR - 64)) | (1L << (MS - 64)) | (1L << (MT - 64)) | (1L << (MU - 64)) | (1L << (MV - 64)) | (1L << (MW - 64)) | (1L << (MX - 64)) | (1L << (MY - 64)) | (1L << (MZ - 64)))) != 0)) {
				{
				{
				setState(232); sentencia();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238); match(LLAVE_CERRAR);
			setState(239); match(PUNTOCOMA);
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

	public static class PasoContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ParserTParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserTParser.MINUS, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_paso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); texto();
			setState(242);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3d\u00f7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\3\6\3;\n\3\r\3\16\3<\3\4\6\4@\n\4\r"+
		"\4\16\4A\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\te\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nq\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u008c\n\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0095\n\20\3\20\3\20\3\21\5\21\u009a\n\21\3\21\3"+
		"\21\3\21\5\21\u009f\n\21\3\21\7\21\u00a2\n\21\f\21\16\21\u00a5\13\21\3"+
		"\22\3\22\3\22\3\22\5\22\u00ab\n\22\3\22\3\22\3\22\5\22\u00b0\n\22\5\22"+
		"\u00b2\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00ba\n\23\f\23\16\23\u00bd"+
		"\13\23\3\23\3\23\5\23\u00c1\n\23\3\23\3\23\3\24\3\24\5\24\u00c7\n\24\3"+
		"\24\3\24\7\24\u00cb\n\24\f\24\16\24\u00ce\13\24\3\24\3\24\5\24\u00d2\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00da\n\25\f\25\16\25\u00dd\13"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7"+
		"\26\u00ec\n\26\f\26\16\26\u00ef\13\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\t\3\2&Y\3"+
		"\2Zc\3\2\6\b\3\2\21\24\3\2\31\32\3\2\34\37\3\2\21\22\u0102\2.\3\2\2\2"+
		"\4:\3\2\2\2\6?\3\2\2\2\bK\3\2\2\2\nM\3\2\2\2\fR\3\2\2\2\16W\3\2\2\2\20"+
		"]\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26w\3\2\2\2\30~\3\2\2\2\32\u0083\3\2"+
		"\2\2\34\u0088\3\2\2\2\36\u008f\3\2\2\2 \u0099\3\2\2\2\"\u00b1\3\2\2\2"+
		"$\u00b3\3\2\2\2&\u00c4\3\2\2\2(\u00d3\3\2\2\2*\u00e1\3\2\2\2,\u00f3\3"+
		"\2\2\2./\7\3\2\2/\60\5\4\3\2\60\64\7!\2\2\61\63\5\b\5\2\62\61\3\2\2\2"+
		"\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2"+
		"\678\7\"\2\28\3\3\2\2\29;\t\2\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2"+
		"\2\2=\5\3\2\2\2>@\t\3\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3"+
		"\2\2\2CL\5\n\6\2DL\5\f\7\2EL\5\20\t\2FL\5\34\17\2GL\5\36\20\2HL\5$\23"+
		"\2IL\5(\25\2JL\5*\26\2KC\3\2\2\2KD\3\2\2\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2"+
		"\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MN\7\4\2\2NO\t\4\2\2OP\5\4"+
		"\3\2PQ\7%\2\2Q\13\3\2\2\2RS\7\5\2\2ST\t\4\2\2TU\5\4\3\2UV\7%\2\2V\r\3"+
		"\2\2\2WX\7\6\2\2XY\5\4\3\2YZ\7 \2\2Z[\5\6\4\2[\\\7%\2\2\\\17\3\2\2\2]"+
		"^\5\4\3\2^d\7 \2\2_e\5\6\4\2`e\5\4\3\2ae\7\t\2\2be\7\n\2\2ce\5\22\n\2"+
		"d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2ef\3\2\2\2fg\7%\2\2"+
		"g\21\3\2\2\2hi\5\6\4\2ij\t\5\2\2jk\5\6\4\2kq\3\2\2\2lq\5\24\13\2mq\5\26"+
		"\f\2nq\5\30\r\2oq\5\32\16\2ph\3\2\2\2pl\3\2\2\2pm\3\2\2\2pn\3\2\2\2po"+
		"\3\2\2\2q\23\3\2\2\2rs\7\25\2\2st\7#\2\2tu\5\6\4\2uv\7$\2\2v\25\3\2\2"+
		"\2wx\7\30\2\2xy\7#\2\2yz\5\6\4\2z{\7%\2\2{|\5\6\4\2|}\7$\2\2}\27\3\2\2"+
		"\2~\177\7\26\2\2\177\u0080\7#\2\2\u0080\u0081\5\6\4\2\u0081\u0082\7$\2"+
		"\2\u0082\31\3\2\2\2\u0083\u0084\7\27\2\2\u0084\u0085\7#\2\2\u0085\u0086"+
		"\5\6\4\2\u0086\u0087\7$\2\2\u0087\33\3\2\2\2\u0088\u008b\7\f\2\2\u0089"+
		"\u008c\5\6\4\2\u008a\u008c\5\4\3\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7%\2\2\u008e\35\3\2\2\2\u008f\u0090"+
		"\5\4\3\2\u0090\u0091\7 \2\2\u0091\u0094\7\13\2\2\u0092\u0095\5\6\4\2\u0093"+
		"\u0095\5\4\3\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\7%\2\2\u0097\37\3\2\2\2\u0098\u009a\7\33\2\2\u0099\u0098"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a3\5\"\22\2"+
		"\u009c\u009e\t\6\2\2\u009d\u009f\7\33\2\2\u009e\u009d\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\5\"\22\2\u00a1\u009c\3\2\2\2"+
		"\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4!\3"+
		"\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00b2\7\t\2\2\u00a7\u00b2\7\n\2\2\u00a8"+
		"\u00ab\5\4\3\2\u00a9\u00ab\5\6\4\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\t\7\2\2\u00ad\u00b0\5\4\3\2\u00ae"+
		"\u00b0\5\6\4\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b2"+
		"#\3\2\2\2\u00b3\u00b4\7\r\2\2\u00b4\u00b5\7#\2\2\u00b5\u00b6\5 \21\2\u00b6"+
		"\u00b7\7$\2\2\u00b7\u00bb\7!\2\2\u00b8\u00ba\5\b\5\2\u00b9\u00b8\3\2\2"+
		"\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\7\"\2\2\u00bf\u00c1\5&\24\2\u00c0"+
		"\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7%"+
		"\2\2\u00c3%\3\2\2\2\u00c4\u00c6\7\16\2\2\u00c5\u00c7\5$\23\2\u00c6\u00c5"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc\7!\2\2\u00c9"+
		"\u00cb\5\b\5\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d1\7\"\2\2\u00d0\u00d2\5&\24\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\'\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6"+
		"\5 \21\2\u00d6\u00d7\7$\2\2\u00d7\u00db\7!\2\2\u00d8\u00da\5\b\5\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\"\2\2\u00df"+
		"\u00e0\7%\2\2\u00e0)\3\2\2\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3\7#\2\2\u00e3"+
		"\u00e4\5\16\b\2\u00e4\u00e5\7%\2\2\u00e5\u00e6\5 \21\2\u00e6\u00e7\7%"+
		"\2\2\u00e7\u00e8\5,\27\2\u00e8\u00e9\7$\2\2\u00e9\u00ed\7!\2\2\u00ea\u00ec"+
		"\5\b\5\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\""+
		"\2\2\u00f1\u00f2\7%\2\2\u00f2+\3\2\2\2\u00f3\u00f4\5\4\3\2\u00f4\u00f5"+
		"\t\b\2\2\u00f5-\3\2\2\2\27\64<AKdp\u008b\u0094\u0099\u009e\u00a3\u00aa"+
		"\u00af\u00b1\u00bb\u00c0\u00c6\u00cc\u00d1\u00db\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}