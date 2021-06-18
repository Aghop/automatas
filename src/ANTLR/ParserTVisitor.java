package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull ParserTParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(@NotNull ParserTParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#r_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_while(@NotNull ParserTParser.R_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(@NotNull ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(@NotNull ParserTParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(@NotNull ParserTParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(@NotNull ParserTParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#var_asignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_asignar(@NotNull ParserTParser.Var_asignarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#r_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_for(@NotNull ParserTParser.R_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(@NotNull ParserTParser.TextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(@NotNull ParserTParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#r_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_else(@NotNull ParserTParser.R_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(@NotNull ParserTParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(@NotNull ParserTParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(@NotNull ParserTParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(@NotNull ParserTParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#paso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso(@NotNull ParserTParser.PasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl(@NotNull ParserTParser.Const_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(@NotNull ParserTParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#int_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_decl(@NotNull ParserTParser.Int_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#r_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_if(@NotNull ParserTParser.R_ifContext ctx);
}