package org.coq.ide.highlight

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import org.coq.ide.CoqIcons
import javax.swing.Icon

/**
 * Created by zjh on 16/8/17.
 */
class CoqColorSettingsPage : ColorSettingsPage {
    private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Gallina keyword", DefaultTextAttributes.GALLINA_KEYWORD_KEY[0]),
            AttributesDescriptor("Vernacular keyword", DefaultTextAttributes.VERNACULAR_KEYWORD_KEY[0]),
            AttributesDescriptor("Special token", DefaultTextAttributes.SPECIAL_TOKEN_KEY[0]),
            AttributesDescriptor("Integer", DefaultTextAttributes.INTEGER_KEY[0]),
            AttributesDescriptor("Comment", DefaultTextAttributes.COMMENT_KEY[0]))

    override fun getIcon(): Icon {
        return CoqIcons.COQ
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return CoqHighlighter()
    }

    override fun getDemoText(): String {
        return "Variables P Q R : Prop."
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): String {
        return "Coq"
    }
}