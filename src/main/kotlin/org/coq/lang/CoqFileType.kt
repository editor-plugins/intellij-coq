package org.coq.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import org.coq.ide.CoqIcons
import javax.swing.Icon

object CoqFileType : LanguageFileType(CoqLanguage) {
    object DEFAULTS {
        val EXTENSION: String = "v"
    }

    override fun getName(): String = "Coq"
    override fun getDescription(): String = "Coq Files"

    override fun getIcon(): Icon = CoqIcons.COQ

    override fun getDefaultExtension(): String = DEFAULTS.EXTENSION
    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"
}
