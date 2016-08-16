package org.coq.lang

import com.intellij.lang.Language

object CoqLanguage : Language("Coq", "text/coq") {
    override fun isCaseSensitive() = true

    override fun getDisplayName() = "Coq"
}
