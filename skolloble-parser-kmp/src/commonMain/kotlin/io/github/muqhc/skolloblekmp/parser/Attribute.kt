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

import io.github.muqhc.skolloblekmp.parser.generated.antlr.SkollobleParser

class Attribute(
    val id: String,
    val namespace: String?,
    val value: String
) {
    constructor(attributeContext: SkollobleParser.AttributeContext): this(
        id = attributeContext.name().ID().text,
        namespace = attributeContext.name().forenamespace()?.ID()?.text ?: attributeContext.name().backnamespace()?.ID()?.text,
        value = attributeContext.STRING()?.text?.drop(1)?.dropLast(1) ?: attributeContext.name().ID().text
    )
}