package org.coq.ide

import com.intellij.lang.Commenter

class CoqCommenter : Commenter {
    override fun getLineCommentPrefix(): String? = null

    override fun getBlockCommentPrefix(): String? = "(*"
    override fun getBlockCommentSuffix(): String? = "*)"

    override fun getCommentedBlockCommentPrefix(): String? = "(*"
    override fun getCommentedBlockCommentSuffix(): String? = "*)"
}
