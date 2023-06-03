// Generated from SimpLanPlus.g4 by ANTLR 4.4
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpLanPlusParser}.
 */
public interface SimpLanPlusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code muldivExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMuldivExp(@NotNull SimpLanPlusParser.MuldivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code muldivExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMuldivExp(@NotNull SimpLanPlusParser.MuldivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varStm}
	 * labeled alternative in {@link SimpLanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterVarStm(@NotNull SimpLanPlusParser.VarStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varStm}
	 * labeled alternative in {@link SimpLanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitVarStm(@NotNull SimpLanPlusParser.VarStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpLanPlusParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull SimpLanPlusParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpLanPlusParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull SimpLanPlusParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpLanPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull SimpLanPlusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpLanPlusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull SimpLanPlusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunExp(@NotNull SimpLanPlusParser.FunExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunExp(@NotNull SimpLanPlusParser.FunExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(@NotNull SimpLanPlusParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(@NotNull SimpLanPlusParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsubExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddsubExp(@NotNull SimpLanPlusParser.AddsubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsubExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddsubExp(@NotNull SimpLanPlusParser.AddsubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCompareExp(@NotNull SimpLanPlusParser.CompareExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCompareExp(@NotNull SimpLanPlusParser.CompareExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDec}
	 * labeled alternative in {@link SimpLanPlusParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterFunDec(@NotNull SimpLanPlusParser.FunDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDec}
	 * labeled alternative in {@link SimpLanPlusParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitFunDec(@NotNull SimpLanPlusParser.FunDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(@NotNull SimpLanPlusParser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(@NotNull SimpLanPlusParser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTrueExp(@NotNull SimpLanPlusParser.TrueExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTrueExp(@NotNull SimpLanPlusParser.TrueExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpLanPlusParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(@NotNull SimpLanPlusParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpLanPlusParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(@NotNull SimpLanPlusParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParExp(@NotNull SimpLanPlusParser.ParExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParExp(@NotNull SimpLanPlusParser.ParExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andorExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAndorExp(@NotNull SimpLanPlusParser.AndorExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andorExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAndorExp(@NotNull SimpLanPlusParser.AndorExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(@NotNull SimpLanPlusParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(@NotNull SimpLanPlusParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStm}
	 * labeled alternative in {@link SimpLanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterIfStm(@NotNull SimpLanPlusParser.IfStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStm}
	 * labeled alternative in {@link SimpLanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitIfStm(@NotNull SimpLanPlusParser.IfStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFalseExp(@NotNull SimpLanPlusParser.FalseExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFalseExp(@NotNull SimpLanPlusParser.FalseExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idInit}
	 * labeled alternative in {@link SimpLanPlusParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterIdInit(@NotNull SimpLanPlusParser.IdInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idInit}
	 * labeled alternative in {@link SimpLanPlusParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitIdInit(@NotNull SimpLanPlusParser.IdInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decstmExp}
	 * labeled alternative in {@link SimpLanPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterDecstmExp(@NotNull SimpLanPlusParser.DecstmExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decstmExp}
	 * labeled alternative in {@link SimpLanPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitDecstmExp(@NotNull SimpLanPlusParser.DecstmExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIntExp(@NotNull SimpLanPlusParser.IntExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intExp}
	 * labeled alternative in {@link SimpLanPlusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIntExp(@NotNull SimpLanPlusParser.IntExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link SimpLanPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterSingleExp(@NotNull SimpLanPlusParser.SingleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link SimpLanPlusParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitSingleExp(@NotNull SimpLanPlusParser.SingleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funStm}
	 * labeled alternative in {@link SimpLanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterFunStm(@NotNull SimpLanPlusParser.FunStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funStm}
	 * labeled alternative in {@link SimpLanPlusParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitFunStm(@NotNull SimpLanPlusParser.FunStmContext ctx);
}