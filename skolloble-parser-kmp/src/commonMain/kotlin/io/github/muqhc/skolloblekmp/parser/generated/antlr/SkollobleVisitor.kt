// Generated from C:/Users/home/IdeaProjects/skolloble-kmp/skolloble-parser-kmp/grammar/antlr/Skolloble.g4 by ANTLR 4.13.1
package io.github.muqhc.skolloblekmp.parser.generated.antlr

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced by [SkollobleParser].
 *
 * @param T The return type of the visit operation.
 *   Use [Unit] for operations with no return type
 */
public interface SkollobleVisitor<T> : ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by [SkollobleParser.file].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitFile(ctx: SkollobleParser.FileContext): T

    /**
     * Visit a parse tree produced by [SkollobleParser.element].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitElement(ctx: SkollobleParser.ElementContext): T

    /**
     * Visit a parse tree produced by [SkollobleParser.attribution].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAttribution(ctx: SkollobleParser.AttributionContext): T

    /**
     * Visit a parse tree produced by [SkollobleParser.block].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitBlock(ctx: SkollobleParser.BlockContext): T

    /**
     * Visit a parse tree produced by [SkollobleParser.attribute].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAttribute(ctx: SkollobleParser.AttributeContext): T

    /**
     * Visit a parse tree produced by [SkollobleParser.name].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitName(ctx: SkollobleParser.NameContext): T

    /**
     * Visit a parse tree produced by [SkollobleParser.backnamespace].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitBacknamespace(ctx: SkollobleParser.BacknamespaceContext): T

    /**
     * Visit a parse tree produced by [SkollobleParser.forenamespace].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitForenamespace(ctx: SkollobleParser.ForenamespaceContext): T

}
