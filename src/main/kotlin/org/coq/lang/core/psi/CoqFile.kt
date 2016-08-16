package org.coq.lang.core.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.coq.lang.CoqFileType
import org.coq.lang.CoqLanguage

class CoqFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CoqLanguage) {
    override fun getFileType(): FileType = CoqFileType

    override fun toString(): String = "Coq File"
}
