// Generated from C:/Users/home/IdeaProjects/skolloble-kmp/skolloble-parser-kmp/grammar/antlr/Skolloble.g4 by ANTLR 4.13.1
package io.github.muqhc.skolloblekmp.parser.generated.antlr

import com.strumenta.antlrkotlin.runtime.JsName
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.misc.*
import org.antlr.v4.kotlinruntime.tree.*
import kotlin.jvm.JvmField

@Suppress(
    // This is required as we are using a custom JsName alias that is not recognized by the IDE.
    // No name clashes will happen tho.
    "JS_NAME_CLASH",
    "UNUSED_VARIABLE",
    "ClassName",
    "FunctionName",
    "LocalVariableName",
    "ConstPropertyName",
    "ConvertSecondaryConstructorToPrimary",
    "CanBeVal",
)
public open class SkollobleParser(input: TokenStream) : Parser(input) {
    private companion object {
        init {
            RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.runtimeVersion)
        }

        private const val SERIALIZED_ATN: String =
            "\u0004\u0001\u000d\u0047\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0015\u0008\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\u0008\u0001\u0001\u0002\u0001\u0002\u0004\u0002\u001e\u0008\u0002\u000b\u0002\u000c\u0002\u001f\u0001\u0003\u0001\u0003\u0005\u0003\u0024\u0008\u0003\u000a\u0003\u000c\u0003\u0027\u0009\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u002c\u0008\u0003\u000b\u0003\u000c\u0003\u002d\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0033\u0008\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u0037\u0008\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u003f\u0008\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\u0008\u0000\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0000\u0000\u0049\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006\u0032\u0001\u0000\u0000\u0000\u0008\u0034\u0001\u0000\u0000\u0000\u000a\u003e\u0001\u0000\u0000\u0000\u000c\u0040\u0001\u0000\u0000\u0000\u000e\u0043\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0014\u0003\u000a\u0005\u0000\u0013\u0015\u0003\u0004\u0002\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0006\u0003\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u001a\u0005\u000c\u0000\u0000\u0019\u0012\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b\u001d\u0005\u0003\u0000\u0000\u001c\u001e\u0003\u0008\u0004\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u0020\u0001\u0000\u0000\u0000\u0020\u0005\u0001\u0000\u0000\u0000\u0021\u0025\u0005\u000b\u0000\u0000\u0022\u0024\u0003\u0002\u0001\u0000\u0023\u0022\u0001\u0000\u0000\u0000\u0024\u0027\u0001\u0000\u0000\u0000\u0025\u0023\u0001\u0000\u0000\u0000\u0025\u0026\u0001\u0000\u0000\u0000\u0026\u0028\u0001\u0000\u0000\u0000\u0027\u0025\u0001\u0000\u0000\u0000\u0028\u0033\u0005\u000a\u0000\u0000\u0029\u002b\u0005\u0007\u0000\u0000\u002a\u002c\u0003\u0002\u0001\u0000\u002b\u002a\u0001\u0000\u0000\u0000\u002c\u002d\u0001\u0000\u0000\u0000\u002d\u002b\u0001\u0000\u0000\u0000\u002d\u002e\u0001\u0000\u0000\u0000\u002e\u0033\u0001\u0000\u0000\u0000\u002f\u0030\u0005\u0008\u0000\u0000\u0030\u0033\u0003\u0002\u0001\u0000\u0031\u0033\u0005\u0009\u0000\u0000\u0032\u0021\u0001\u0000\u0000\u0000\u0032\u0029\u0001\u0000\u0000\u0000\u0032\u002f\u0001\u0000\u0000\u0000\u0032\u0031\u0001\u0000\u0000\u0000\u0033\u0007\u0001\u0000\u0000\u0000\u0034\u0036\u0003\u000a\u0005\u0000\u0035\u0037\u0005\u000c\u0000\u0000\u0036\u0035\u0001\u0000\u0000\u0000\u0036\u0037\u0001\u0000\u0000\u0000\u0037\u0009\u0001\u0000\u0000\u0000\u0038\u003f\u0005\u0006\u0000\u0000\u0039\u003a\u0005\u0006\u0000\u0000\u003a\u003f\u0003\u000c\u0006\u0000\u003b\u003c\u0003\u000e\u0007\u0000\u003c\u003d\u0005\u0006\u0000\u0000\u003d\u003f\u0001\u0000\u0000\u0000\u003e\u0038\u0001\u0000\u0000\u0000\u003e\u0039\u0001\u0000\u0000\u0000\u003e\u003b\u0001\u0000\u0000\u0000\u003f\u000b\u0001\u0000\u0000\u0000\u0040\u0041\u0005\u0004\u0000\u0000\u0041\u0042\u0005\u0006\u0000\u0000\u0042\u000d\u0001\u0000\u0000\u0000\u0043\u0044\u0005\u0006\u0000\u0000\u0044\u0045\u0005\u0005\u0000\u0000\u0045\u000f\u0001\u0000\u0000\u0000\u0008\u0014\u0019\u001f\u0025\u002d\u0032\u0036\u003e"

        private val ATN = ATNDeserializer().deserialize(SERIALIZED_ATN.toCharArray())

        private val DECISION_TO_DFA = Array(ATN.numberOfDecisions) {
            DFA(ATN.getDecisionState(it)!!, it)
        }

        private val SHARED_CONTEXT_CACHE = PredictionContextCache()
        private val RULE_NAMES: Array<String> = arrayOf(
            "file", "element", "attribution", "block", "attribute", "name", 
            "backnamespace", "forenamespace"
        )

        private val LITERAL_NAMES: Array<String?> = arrayOf(
            null, null, null, "':'", "'@'", "'<>'", null, "'/'", "'-'", 
            "';'", "'}'", "'{'"
        )

        private val SYMBOLIC_NAMES: Array<String?> = arrayOf(
            null, "NEWLINE", "Space", "INTOATTR", "BackNamespaceSign", "ForeNamespaceSign", 
            "ID", "WholeWrap", "SingleBlock", "NoBlock", "GoOutBLOCK", "INTOBLOCK", 
            "STRING", "Comment"
        )

        private val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)

        private val TOKEN_NAMES: Array<String> = Array(SYMBOLIC_NAMES.size) {
            VOCABULARY.getLiteralName(it)
                ?: VOCABULARY.getSymbolicName(it)
                ?: "<INVALID>"
        }
    }

    public object Tokens {
        public const val EOF: Int = -1
        public const val NEWLINE: Int = 1
        public const val Space: Int = 2
        public const val INTOATTR: Int = 3
        public const val BackNamespaceSign: Int = 4
        public const val ForeNamespaceSign: Int = 5
        public const val ID: Int = 6
        public const val WholeWrap: Int = 7
        public const val SingleBlock: Int = 8
        public const val NoBlock: Int = 9
        public const val GoOutBLOCK: Int = 10
        public const val INTOBLOCK: Int = 11
        public const val STRING: Int = 12
        public const val Comment: Int = 13
    }

    public object Rules {
        public const val File: Int = 0
        public const val Element: Int = 1
        public const val Attribution: Int = 2
        public const val Block: Int = 3
        public const val Attribute: Int = 4
        public const val Name: Int = 5
        public const val Backnamespace: Int = 6
        public const val Forenamespace: Int = 7
    }

    override var interpreter: ParserATNSimulator =
        @Suppress("LeakingThis")
        ParserATNSimulator(this, ATN, DECISION_TO_DFA, SHARED_CONTEXT_CACHE)

    override val grammarFileName: String =
        "Skolloble.g4"

    @Deprecated("Use vocabulary instead", replaceWith = ReplaceWith("vocabulary"))
    override val tokenNames: Array<String> =
        TOKEN_NAMES

    override val ruleNames: Array<String> =
        RULE_NAMES

    override val atn: ATN =
        ATN

    override val vocabulary: Vocabulary =
        VOCABULARY

    override val serializedATN: String =
        SERIALIZED_ATN

    /* Named actions */

    /* Funcs */
    public open class FileContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.File

        public fun element(): ElementContext = getRuleContext(ElementContext::class, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.enterFile(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.exitFile(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is SkollobleVisitor) {
                visitor.visitFile(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun file(): FileContext {
        var _localctx = FileContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 0, Rules.File)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 16
            element()

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class ElementContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Element

        public fun name(): NameContext? = getRuleContext(NameContext::class, 0)
        public fun block(): BlockContext? = getRuleContext(BlockContext::class, 0)
        public fun attribution(): AttributionContext? = getRuleContext(AttributionContext::class, 0)
        public fun STRING(): TerminalNode? = getToken(Tokens.STRING, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.enterElement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.exitElement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is SkollobleVisitor) {
                visitor.visitElement(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun element(): ElementContext {
        var _localctx = ElementContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 2, Rules.Element)
        var _la: Int

        try {
            this.state = 25
            errorHandler.sync(this)

            when (_input.LA(1)) {
                Tokens.ID -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    this.state = 18
                    name()

                    this.state = 20
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    if (_la == Tokens.INTOATTR) {
                        this.state = 19
                        attribution()

                    }
                    this.state = 22
                    block()

                }Tokens.STRING -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    this.state = 24
                    match(Tokens.STRING)

                }
                else -> throw NoViableAltException(this)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class AttributionContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Attribution

        public fun INTOATTR(): TerminalNode = getToken(Tokens.INTOATTR, 0)!!
        public fun attribute(): List<AttributeContext> = getRuleContexts(AttributeContext::class)
        public fun attribute(i: Int): AttributeContext? = getRuleContext(AttributeContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.enterAttribution(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.exitAttribution(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is SkollobleVisitor) {
                visitor.visitAttribution(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun attribution(): AttributionContext {
        var _localctx = AttributionContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 4, Rules.Attribution)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 27
            match(Tokens.INTOATTR)

            this.state = 29 
            errorHandler.sync(this)
            _la = _input.LA(1)

            do {
                this.state = 28
                attribute()

                this.state = 31 
                errorHandler.sync(this)
                _la = _input.LA(1)
            } while (_la == Tokens.ID)
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class BlockContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Block

        public fun INTOBLOCK(): TerminalNode? = getToken(Tokens.INTOBLOCK, 0)
        public fun GoOutBLOCK(): TerminalNode? = getToken(Tokens.GoOutBLOCK, 0)
        public fun element(): List<ElementContext> = getRuleContexts(ElementContext::class)
        public fun element(i: Int): ElementContext? = getRuleContext(ElementContext::class, i)
        public fun WholeWrap(): TerminalNode? = getToken(Tokens.WholeWrap, 0)
        public fun SingleBlock(): TerminalNode? = getToken(Tokens.SingleBlock, 0)
        public fun NoBlock(): TerminalNode? = getToken(Tokens.NoBlock, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.enterBlock(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.exitBlock(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is SkollobleVisitor) {
                visitor.visitBlock(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun block(): BlockContext {
        var _localctx = BlockContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 6, Rules.Block)
        var _la: Int

        try {
            var _alt: Int
            this.state = 50
            errorHandler.sync(this)

            when (_input.LA(1)) {
                Tokens.INTOBLOCK -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    this.state = 33
                    match(Tokens.INTOBLOCK)

                    this.state = 37
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.ID || _la == Tokens.STRING) {
                        this.state = 34
                        element()

                        this.state = 39
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 40
                    match(Tokens.GoOutBLOCK)

                }Tokens.WholeWrap -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    this.state = 41
                    match(Tokens.WholeWrap)

                    this.state = 43 
                    errorHandler.sync(this)
                    _alt = 1

                    do {
                        when (_alt) {
                            1 -> {
                                this.state = 42
                                element()

                            }
                            else -> throw NoViableAltException(this)
                        }

                        this.state = 45 
                        errorHandler.sync(this)
                        _alt = interpreter.adaptivePredict(_input, 4, context)
                    } while (_alt != 2 && _alt != INVALID_ALT_NUMBER)
                }Tokens.SingleBlock -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 3)
                    this.state = 47
                    match(Tokens.SingleBlock)

                    this.state = 48
                    element()

                }Tokens.NoBlock -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 4)
                    this.state = 49
                    match(Tokens.NoBlock)

                }
                else -> throw NoViableAltException(this)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class AttributeContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Attribute

        public fun name(): NameContext = getRuleContext(NameContext::class, 0)!!
        public fun STRING(): TerminalNode? = getToken(Tokens.STRING, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.enterAttribute(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.exitAttribute(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is SkollobleVisitor) {
                visitor.visitAttribute(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun attribute(): AttributeContext {
        var _localctx = AttributeContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 8, Rules.Attribute)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 52
            name()

            this.state = 54
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.STRING) {
                this.state = 53
                match(Tokens.STRING)

            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class NameContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Name

        public fun ID(): TerminalNode = getToken(Tokens.ID, 0)!!
        public fun backnamespace(): BacknamespaceContext? = getRuleContext(BacknamespaceContext::class, 0)
        public fun forenamespace(): ForenamespaceContext? = getRuleContext(ForenamespaceContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.enterName(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.exitName(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is SkollobleVisitor) {
                visitor.visitName(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun name(): NameContext {
        var _localctx = NameContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 10, Rules.Name)

        try {
            this.state = 62
            errorHandler.sync(this)

            when (interpreter.adaptivePredict(_input, 7, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    this.state = 56
                    match(Tokens.ID)

                }2 -> {
                    enterOuterAlt(_localctx, 2)
                    this.state = 57
                    match(Tokens.ID)

                    this.state = 58
                    backnamespace()

                }3 -> {
                    enterOuterAlt(_localctx, 3)
                    this.state = 59
                    forenamespace()

                    this.state = 60
                    match(Tokens.ID)

                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class BacknamespaceContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Backnamespace

        public fun BackNamespaceSign(): TerminalNode = getToken(Tokens.BackNamespaceSign, 0)!!
        public fun ID(): TerminalNode = getToken(Tokens.ID, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.enterBacknamespace(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.exitBacknamespace(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is SkollobleVisitor) {
                visitor.visitBacknamespace(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun backnamespace(): BacknamespaceContext {
        var _localctx = BacknamespaceContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 12, Rules.Backnamespace)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 64
            match(Tokens.BackNamespaceSign)

            this.state = 65
            match(Tokens.ID)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class ForenamespaceContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Forenamespace

        public fun ID(): TerminalNode = getToken(Tokens.ID, 0)!!
        public fun ForeNamespaceSign(): TerminalNode = getToken(Tokens.ForeNamespaceSign, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.enterForenamespace(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is SkollobleListener) {
                listener.exitForenamespace(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            return if (visitor is SkollobleVisitor) {
                visitor.visitForenamespace(this)
            } else {
                visitor.visitChildren(this)
            }
        }
    }


    public fun forenamespace(): ForenamespaceContext {
        var _localctx = ForenamespaceContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 14, Rules.Forenamespace)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 67
            match(Tokens.ID)

            this.state = 68
            match(Tokens.ForeNamespaceSign)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }
}
