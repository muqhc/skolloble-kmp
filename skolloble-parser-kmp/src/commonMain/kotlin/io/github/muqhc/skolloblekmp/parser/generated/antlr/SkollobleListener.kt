// Generated from C:/Users/home/IdeaProjects/skolloble-kmp/skolloble-parser-kmp/grammar/antlr/Skolloble.g4 by ANTLR 4.13.1
package io.github.muqhc.skolloblekmp.parser.generated.antlr

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by [SkollobleParser].
 */
public interface SkollobleListener : ParseTreeListener {
    /**
     * Enter a parse tree produced by [SkollobleParser.file].
     *
     * @param ctx The parse tree
     */
    public fun enterFile(ctx: SkollobleParser.FileContext)

    /**
     * Exit a parse tree produced by [SkollobleParser.file].
     *
     * @param ctx The parse tree
     */
    public fun exitFile(ctx: SkollobleParser.FileContext)

    /**
     * Enter a parse tree produced by [SkollobleParser.element].
     *
     * @param ctx The parse tree
     */
    public fun enterElement(ctx: SkollobleParser.ElementContext)

    /**
     * Exit a parse tree produced by [SkollobleParser.element].
     *
     * @param ctx The parse tree
     */
    public fun exitElement(ctx: SkollobleParser.ElementContext)

    /**
     * Enter a parse tree produced by [SkollobleParser.attribution].
     *
     * @param ctx The parse tree
     */
    public fun enterAttribution(ctx: SkollobleParser.AttributionContext)

    /**
     * Exit a parse tree produced by [SkollobleParser.attribution].
     *
     * @param ctx The parse tree
     */
    public fun exitAttribution(ctx: SkollobleParser.AttributionContext)

    /**
     * Enter a parse tree produced by [SkollobleParser.block].
     *
     * @param ctx The parse tree
     */
    public fun enterBlock(ctx: SkollobleParser.BlockContext)

    /**
     * Exit a parse tree produced by [SkollobleParser.block].
     *
     * @param ctx The parse tree
     */
    public fun exitBlock(ctx: SkollobleParser.BlockContext)

    /**
     * Enter a parse tree produced by [SkollobleParser.attribute].
     *
     * @param ctx The parse tree
     */
    public fun enterAttribute(ctx: SkollobleParser.AttributeContext)

    /**
     * Exit a parse tree produced by [SkollobleParser.attribute].
     *
     * @param ctx The parse tree
     */
    public fun exitAttribute(ctx: SkollobleParser.AttributeContext)

    /**
     * Enter a parse tree produced by [SkollobleParser.name].
     *
     * @param ctx The parse tree
     */
    public fun enterName(ctx: SkollobleParser.NameContext)

    /**
     * Exit a parse tree produced by [SkollobleParser.name].
     *
     * @param ctx The parse tree
     */
    public fun exitName(ctx: SkollobleParser.NameContext)

    /**
     * Enter a parse tree produced by [SkollobleParser.backnamespace].
     *
     * @param ctx The parse tree
     */
    public fun enterBacknamespace(ctx: SkollobleParser.BacknamespaceContext)

    /**
     * Exit a parse tree produced by [SkollobleParser.backnamespace].
     *
     * @param ctx The parse tree
     */
    public fun exitBacknamespace(ctx: SkollobleParser.BacknamespaceContext)

    /**
     * Enter a parse tree produced by [SkollobleParser.forenamespace].
     *
     * @param ctx The parse tree
     */
    public fun enterForenamespace(ctx: SkollobleParser.ForenamespaceContext)

    /**
     * Exit a parse tree produced by [SkollobleParser.forenamespace].
     *
     * @param ctx The parse tree
     */
    public fun exitForenamespace(ctx: SkollobleParser.ForenamespaceContext)

}
