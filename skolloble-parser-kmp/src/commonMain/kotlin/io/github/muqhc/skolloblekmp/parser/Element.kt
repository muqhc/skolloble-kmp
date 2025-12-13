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

class Element(
    val name: String,
    val namespace: String?,
    val children: List<Element>,
    val strings: List<String>,
    val attribution: Attribution
) {
    constructor(elementContext: SkollobleParser.ElementContext): this(
        name = elementContext.name()!!.ID().text,
        namespace = elementContext.name()?.forenamespace()?.ID()?.text ?: elementContext.name()?.backnamespace()?.ID()?.text,
        children = elementContext.block()?.element()?.filter { it.name() != null } ?.map { Element(it) } ?: emptyList(),
        strings = elementContext.block()?.element()?.filter { it.STRING() != null } ?.map { it.STRING()!!.text.drop(1).dropLast(1) } ?: emptyList(),
        attribution = Attribution(elementContext.attribution())
    )
}