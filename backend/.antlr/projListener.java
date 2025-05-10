// Generated from d:/University/1 - Principle of Programming Language/Project for theory class/backend/proj.g4 by ANTLR 4.13.1

package antlrsource;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link projParser}.
 */
public interface projListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link projParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(projParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(projParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(projParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(projParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(projParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(projParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#asg}.
	 * @param ctx the parse tree
	 */
	void enterAsg(projParser.AsgContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#asg}.
	 * @param ctx the parse tree
	 */
	void exitAsg(projParser.AsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(projParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(projParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void enterElifStmt(projParser.ElifStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void exitElifStmt(projParser.ElifStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(projParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#elseStmt}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(projParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#funcStmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncStmt(projParser.FuncStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#funcStmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncStmt(projParser.FuncStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(projParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(projParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#postfixStmt}.
	 * @param ctx the parse tree
	 */
	void enterPostfixStmt(projParser.PostfixStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#postfixStmt}.
	 * @param ctx the parse tree
	 */
	void exitPostfixStmt(projParser.PostfixStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(projParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(projParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#mainStmt}.
	 * @param ctx the parse tree
	 */
	void enterMainStmt(projParser.MainStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#mainStmt}.
	 * @param ctx the parse tree
	 */
	void exitMainStmt(projParser.MainStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(projParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(projParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(projParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(projParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#expStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpStmt(projParser.ExpStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#expStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpStmt(projParser.ExpStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(projParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(projParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(projParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(projParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#printArgs}.
	 * @param ctx the parse tree
	 */
	void enterPrintArgs(projParser.PrintArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#printArgs}.
	 * @param ctx the parse tree
	 */
	void exitPrintArgs(projParser.PrintArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link projParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(projParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link projParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(projParser.ParamContext ctx);
}