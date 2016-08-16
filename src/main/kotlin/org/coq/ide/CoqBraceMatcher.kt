package org.coq.ide

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import org.coq.lang.core.psi.CoqTokenTypes

public class CoqBraceMatcher() : PairedBraceMatcher {

    public override fun getPairs() = PAIRS

    public override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean {
        return true
    }

    public override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int {
        return openingBraceOffset
    }

    companion object {
        val PAIRS: Array<BracePair> = arrayOf(
            BracePair(CoqTokenTypes.LEFT_BRACE, CoqTokenTypes.RIGHT_BRACE, false),
            BracePair(CoqTokenTypes.LEFT_PAREN, CoqTokenTypes.RIGHT_PAREN, false)
        )
    }
}

