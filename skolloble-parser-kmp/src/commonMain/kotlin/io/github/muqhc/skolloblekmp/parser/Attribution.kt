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

class Attribution(val data: Map<String,Attribute>): Map<String,Attribute> {
    constructor(attributionContext: SkollobleParser.AttributionContext?): this(
        data = attributionContext?.attribute()?.associate {
            val namespace = it.name().forenamespace()?.ID()?.text ?: it.name().backnamespace()?.ID()?.text
            (if (namespace == null) "" else ("$namespace<>"))+it.name().ID().text to Attribute(it)
        } ?: emptyMap()
    )

    override val entries: Set<Map.Entry<String, Attribute>>
        get() = data.entries
    override val keys: Set<String>
        get() = data.keys
    override val size: Int
        get() = data.size
    override val values: Collection<Attribute>
        get() = data.values

    override fun containsKey(key: String): Boolean = data.containsKey(key)

    override fun containsValue(value: Attribute): Boolean = data.containsValue(value)

    override fun get(key: String): Attribute? = data[key]

    override fun isEmpty(): Boolean = data.isEmpty()
}