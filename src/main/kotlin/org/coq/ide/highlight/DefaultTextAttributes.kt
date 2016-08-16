package org.coq.ide.highlight

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.markup.TextAttributes
import com.intellij.psi.tree.IElementType

import java.util.Arrays
import java.util.HashSet

import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.ui.JBColor.*
import java.awt.Font.BOLD
import java.awt.Font.ITALIC

import org.coq.lang.core.psi.CoqTokenTypes.*

/**
 * Created by zjh on 16/8/17.
 */
object DefaultTextAttributes {
    var GALLINA_KEYWORD = TextAttributes(RED, null, null, null, 0)
    var VERNACULAR_KEYWORD = TextAttributes(BLUE, null, null, null, 0)
    var SPECIAL_TOKEN = TextAttributes(null, null, null, null, BOLD)
    var INTEGER = TextAttributes(CYAN, null, null, null, 0)
    var COMMENT = TextAttributes(GRAY, null, null, null, ITALIC)

    var GALLINA_KEYWORD_KEY = arrayOf(createTextAttributesKey("Gallina.Keyword", GALLINA_KEYWORD))
    var VERNACULAR_KEYWORD_KEY = arrayOf(createTextAttributesKey("Vernacular.Keyword", VERNACULAR_KEYWORD))
    var SPECIAL_TOKEN_KEY = arrayOf(createTextAttributesKey("SpecialToken", SPECIAL_TOKEN))
    var INTEGER_KEY = arrayOf(createTextAttributesKey("Integer", INTEGER))
    var COMMENT_KEY = arrayOf(createTextAttributesKey("Comment", COMMENT))

    var GALLINA_KEYWORDS_SET: Set<IElementType> = HashSet<IElementType>(Arrays.asList(
            UNDERSCORE, AS, COFIX, ELSE, END, FIX, FOR, FORALL, FUN,
            IF, IN, LET, MATCH, PROP, RETURN, SET, THEN, TYPE, WITH))

    var VERNACULAR_KEYWORDS_SET: Set<IElementType> = HashSet<IElementType>(Arrays.asList(
            ADMITTED, AXIOM, COFIXPOINT, COINDUCTIVE, CONJECTURE, COROLLARY,
            DEFINED, DEFINITION, EXAMPLE, FACT, FIXPOINT, HYPOTHESES, HYPOTHESIS,
            INDUCTIVE, LEMMA, PARAMETER, PARAMETERS, PROOF, PROPOSITION, QED,
            REMARK, THEOREM, VARIABLE, VARIABLES))

    var SPECIAL_TOKENS_SET: Set<IElementType> = HashSet<IElementType>(Arrays.asList(
            PERCENT, LEFT_PAREN, RIGHT_PAREN, COMMA, RIGHT_SIMPLE_ARROW,
            DOT, COLON, COLON_EQUAL, LESS_COLON, RIGHT_DOUBLE_ARROW,
            AT_SIGN, LEFT_BRACE, PIPE, RIGHT_BRACE))
}