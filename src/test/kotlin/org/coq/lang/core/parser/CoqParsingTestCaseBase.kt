package org.coq.lang.core.parser

import com.intellij.testFramework.ParsingTestCase
import org.jetbrains.annotations.NonNls

abstract class CoqParsingTestCaseBase(@NonNls dataPath: String)
: ParsingTestCase("org/coq/lang/core/parser/fixtures/" + dataPath, "v", true /*lowerCaseFirstLetter*/, CoqParserDefinition()) {
    override fun getTestDataPath() = "src/test/resources"
}
