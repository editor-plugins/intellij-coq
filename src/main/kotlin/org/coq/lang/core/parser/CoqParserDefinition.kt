package org.coq.lang.core.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.coq.lang.CoqLanguage
import org.coq.lang.core.lexer.CoqLexer
import org.coq.lang.core.psi.CoqFile
import org.coq.lang.core.psi.CoqTokenTypes

class CoqParserDefinition : ParserDefinition {
    override fun createParser(project: Project?): PsiParser = CoqParser()

    override fun createFile(viewProvider: FileViewProvider): PsiFile = CoqFile(viewProvider)

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements? =
            ParserDefinition.SpaceRequirements.MAY

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getFileNodeType(): IFileElementType? = FILE

    override fun createLexer(project: Project?): Lexer = CoqLexer()

    override fun createElement(node: ASTNode?): PsiElement = CoqTokenTypes.Factory.createElement(node)

    companion object {
        val FILE: IFileElementType = IFileElementType(CoqLanguage)
        val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS: TokenSet = TokenSet.create(CoqTokenTypes.COMMENT)
    }
}


