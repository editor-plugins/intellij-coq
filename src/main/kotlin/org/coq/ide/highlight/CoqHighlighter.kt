package org.coq.ide.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.coq.lang.core.lexer.CoqLexer

class CoqHighlighter : SyntaxHighlighterBase() {
    val EMPTY: Array<TextAttributesKey> = arrayOf()

    override fun getHighlightingLexer(): Lexer {
        return CoqLexer()
    }

    override fun getTokenHighlights(elementType: IElementType): Array<TextAttributesKey> {
        if (DefaultTextAttributes.VERNACULAR_KEYWORDS_SET.contains(elementType)) {
            return DefaultTextAttributes.VERNACULAR_KEYWORD_KEY
        }
        if (DefaultTextAttributes.GALLINA_KEYWORDS_SET.contains(elementType)) {
            return DefaultTextAttributes.GALLINA_KEYWORD_KEY
        }
        if (DefaultTextAttributes.SPECIAL_TOKENS_SET.contains(elementType)) {
            return DefaultTextAttributes.SPECIAL_TOKEN_KEY
        }
        if (DefaultTextAttributes.INTEGER.equals(elementType)) {
            return DefaultTextAttributes.INTEGER_KEY
        }
        if (DefaultTextAttributes.COMMENT.equals(elementType)) {
            return DefaultTextAttributes.COMMENT_KEY
        }
        return EMPTY
    }
}
