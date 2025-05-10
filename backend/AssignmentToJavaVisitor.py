from CompiledFiles.projVisitor import projVisitor

class AssignmentToJavaVisitor(projVisitor):
    def visitProgram(self, ctx):
        return "\n".join(self.visit(stmt) for stmt in ctx.stmt())

    def visitStmt(self, ctx):
        if ctx.asg():
            return self.visit(ctx.asg())
        elif ctx.ifStmt():
            return self.visit(ctx.ifStmt())
        elif ctx.funcStmt():
            return self.visit(ctx.funcStmt())
        elif ctx.whileStmt():
            return self.visit(ctx.whileStmt())
        elif ctx.breakStmt():
            return self.visit(ctx.breakStmt())
        elif ctx.postfixStmt():
            return self.visit(ctx.postfixStmt())
        elif ctx.returnStmt():
            return self.visit(ctx.returnStmt())
        elif ctx.mainStmt():
            return self.visit(ctx.mainStmt())
        elif ctx.printStmt():
            return self.visit(ctx.printStmt())
        elif ctx.callStmt():
            return self.visit(ctx.callStmt())
        elif ctx.questStmt():
            return self.visit(ctx.questStmt())
        else:
            return ""

    def visitCallStmt(self, ctx):
        func_name = ctx.ID().getText()
        arg = self.visit(ctx.exp()) if ctx.exp() else ""
        return f"{func_name}({arg});"

    def visitAsg(self, ctx):
        var_name = ctx.ID().getText()
        value = self.visit(ctx.exp())
        # Check if the expression resolves to a STRING token
        if self.isStringExpression(ctx.exp()):
            return f"String {var_name} = {value};"
        else:
            return f"int {var_name} = {value};"

    def isStringExpression(self, ctx):
        # Navigate to the atom context
        addExp = ctx.addExp()
        if isinstance(addExp, list):
            addExp = addExp[0]  # Take the first addExp if it's a list
        mulExp = addExp.mulExp()
        if isinstance(mulExp, list):
            mulExp = mulExp[0]  # Take the first mulExp if it's a list
        atom = mulExp.atom()
        if isinstance(atom, list):
            atom = atom[0]  # Take the first atom if it's a list
        return atom.STRING() is not None
    
    def visitReturnStmt(self, ctx):
        var_name = ctx.RETURN().getText()
        value = self.visit(ctx.exp())
        return f"{var_name} {value};"

    def visitPostfixStmt(self, ctx):
        var = ctx.ID().getText()
        value = self.visit(ctx.postfix())
        arg = self.visit(ctx.exp()) if ctx.exp() else ""
        return f"{var}{value} {arg};"

    def visitPostfix(self, ctx):
        return ctx.op.text

    def visitExp(self, ctx):
        if ctx.op:
            left = self.visit(ctx.addExp(0))
            right = self.visit(ctx.addExp(1))
            op = ctx.op.text
            return f"({left} {op} {right})"
        else:
            return self.visit(ctx.addExp(0))

    def visitAddExp(self, ctx):
        if ctx.op:
            left = self.visit(ctx.mulExp(0))
            right = self.visit(ctx.mulExp(1))
            op = ctx.op.text
            return f"({left} {op} {right})"
        else:
            return self.visit(ctx.mulExp(0))

    def visitMulExp(self, ctx):
        if ctx.op:
            left = self.visit(ctx.atom(0))
            right = self.visit(ctx.atom(1))
            op = ctx.op.text
            return f"({left} {op} {right})"
        else:
            return self.visit(ctx.atom(0))

    def visitAtom(self, ctx):
        if ctx.getChild(0).getText() == '(':
            return f"({self.visit(ctx.exp())})"
        elif ctx.ID():
            if ctx.getChildCount() > 1 and ctx.getChild(1).getText() == '(':
                func_name = ctx.ID().getText()
                args = []
                for i in range(2, ctx.getChildCount()):
                    child = ctx.getChild(i)
                    if child.getText() == ')':
                        break
                    if child.getText() != ',':
                        args.append(self.visit(child))
                return f"{func_name}({', '.join(args)})"
            else:
                return ctx.ID().getText()
        elif ctx.NUMBER():
            return ctx.NUMBER().getText()
        elif ctx.STRING():
            return ctx.STRING().getText()
        else:
            raise Exception("Unrecognized atom")

    def visitIfStmt(self, ctx):
        condition = self.visit(ctx.exp())
        block_code = self.visit(ctx.block())
        block_lines = block_code.split("\n")
        indented_block = "\n".join("    " + line for line in block_lines if line.strip())
        elif_parts = ""
        if ctx.elifStmt():
            for elif_ctx in ctx.elifStmt():
                elif_part = self.visit(elif_ctx)
                elif_lines = elif_part.split("\n")
                indented_elif = "\n".join(line for line in elif_lines if line.strip())
                elif_parts += "\n" + indented_elif
        else_part = ""
        if ctx.elseStmt():
            else_part = self.visit(ctx.elseStmt())
            else_lines = else_part.split("\n")
            indented_else = "\n".join(line for line in else_lines if line.strip())
            else_part = "\n" + indented_else
        return f"if ({condition}) {{\n{indented_block}\n    }}{elif_parts}{else_part}"

    def visitElifStmt(self, ctx):
        condition = self.visit(ctx.exp())
        block_code = self.visit(ctx.block())
        return f"    else if ({condition}) {{\n{block_code}\n    }}"

    def visitElseStmt(self, ctx):
        block_code = self.visit(ctx.block())
        return f"    else {{\n    {block_code}\n    }}"

    def visitFuncStmt(self, ctx):
        func_name = ctx.ID().getText()
        params = self.visit(ctx.param()) if ctx.param() else ""
        block_code = self.visit(ctx.block())
        return f"public static int {func_name}({params}) {{\n{block_code}\n}}"

    def visitWhileStmt(self, ctx):
        condition = self.visit(ctx.exp())
        block_code = self.visit(ctx.block())
        return f"while ({condition}) {{\n{block_code}\n}}"
    
    def visitPrintStmt(self, ctx):
        if not ctx.printArgs():
            return "System.out.println();"
        args = []
        if ctx.printArgs():
            for exp_ctx in ctx.printArgs().exp():
                args.append(self.visit(exp_ctx))
        if len(args) == 1:
            return f"System.out.println({args[0]});"
        else:
            joined_args = " + ".join(args)
            return f"System.out.println({joined_args});"
    
    def visitMainStmt(self, ctx):
        block_code = self.visit(ctx.block())
        return f"public static void main(String[] args) {{\n{block_code}\n}}"
    
    def visitBreakStmt(self, ctx):
        return "break;"
    
    def visitBlock(self, ctx):
        indent = "    "
        return "\n".join(indent + self.visit(stmt) for stmt in ctx.stmt())

    def visitParam(self, ctx):
        return ", ".join(f"int {id.getText()}" for id in ctx.ID())

    def visitQuestStmt(self, ctx):
        verb_text = ctx.verb().getText()
        obj_text = ctx.obj().getText()  # Should be 'me'
        article_text = ctx.article().getText()  # 'the', 'an', or 'a'
        noun_text = ctx.noun().getText()  # An identifier
        
        # Return Java code for true/false based on the verb
        if verb_text == 'show':
            return "true"
        else:
            return "false"