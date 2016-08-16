package org.coq

import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase

abstract class CoqTestCaseBase : LightCodeInsightFixtureTestCase() {

    final protected val fileName: String get() = "${camelToSnake(getTestName(true))}.v"

    companion object {
        @JvmStatic
        fun camelToSnake(camelCaseName: String): String =
            camelCaseName.split("(?=[A-Z])".toRegex())
                .map { it.toLowerCase() }
                .joinToString("_")
    }
}
