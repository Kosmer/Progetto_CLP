// Generated from SimpLanPlus.g4 by ANTLR 4.7.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpLanPlusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpLanPlusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link SimpLanPlusParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExp(SimpLanPlusParser.SingleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decstmExp}
	 * labeled alternative in {@link SimpLanPlusParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecstmExp(SimpLanPlusParser.DecstmExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idDec}
	 * labeled alternative in {@link SimpLanPlusParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDec(SimpLanPlusParser.IdDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funDec}
	 * labeled alternative in {@link SimpLanPlusParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDec(SimpLanPlusParser.FunDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanPlusParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SimpLanPlusParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanPlusParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SimpLanPlusParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanPlusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpLanPlusParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanPlusParser#blockseqstm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockseqstm(SimpLanPlusParser.BlockseqstmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varStm}
	 * labeled alternative in {@link SimpLanPlusParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarStm(SimpLanPlusParser.VarStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funStm}
	 * labeled alternative in {@link SimpLanPlusParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunStm(SimpLanPlusParser.FunStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStm}
	 * labeled alternative in {@link SimpLanPlusParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStm(SimpLanPlusParser.IfStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanPlusParser#blockseqstmexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockseqstmexp(SimpLanPlusParser.BlockseqstmexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExp(SimpLanPlusParser.BaseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldivExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldivExp(SimpLanPlusParser.MuldivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsubExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsubExp(SimpLanPlusParser.AddsubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExp(SimpLanPlusParser.CompareExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExp(SimpLanPlusParser.VarExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExp(SimpLanPlusParser.TrueExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andorExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndorExp(SimpLanPlusParser.AndorExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(SimpLanPlusParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExp(SimpLanPlusParser.FalseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExp(SimpLanPlusParser.FunExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(SimpLanPlusParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExp(SimpLanPlusParser.IntExpContext ctx);
}