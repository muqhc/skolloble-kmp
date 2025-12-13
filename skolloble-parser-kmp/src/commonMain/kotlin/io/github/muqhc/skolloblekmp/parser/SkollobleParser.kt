/*
 *    Copyright 2025 Muqhc
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package io.github.muqhc.skolloblekmp.parser

import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.antlr.v4.kotlinruntime.StringCharStream
import io.github.muqhc.skolloblekmp.parser.generated.antlr.SkollobleParser as rawParser
import io.github.muqhc.skolloblekmp.parser.generated.antlr.SkollobleLexer as rawLexer

class SkollobleParser(value: String) {
    private val parser: rawParser = rawParser(CommonTokenStream(rawLexer(StringCharStream(value))))
    val rootElement: Element = Element(parser.file().element())
}