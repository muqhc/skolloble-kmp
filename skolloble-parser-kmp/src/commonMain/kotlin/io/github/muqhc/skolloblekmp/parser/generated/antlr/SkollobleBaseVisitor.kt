// Generated from C:/Users/home/IdeaProjects/skolloble-kmp/skolloble-parser-kmp/grammar/antlr/Skolloble.g4 by ANTLR 4.13.1
package io.github.muqhc.skolloblekmp.parser.generated.antlr

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of [SkollobleVisitor],
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param T The return type of the visit operation.
 *   Use [Unit] for operations with no return type
 */
public abstract class SkollobleBaseVisitor<T> : AbstractParseTreeVisitor<T>(), SkollobleVisitor<T> {
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitFile(ctx: SkollobleParser.FileContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitElement(ctx: SkollobleParser.ElementContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitAttribution(ctx: SkollobleParser.AttributionContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitBlock(ctx: SkollobleParser.BlockContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitAttribute(ctx: SkollobleParser.AttributeContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitName(ctx: SkollobleParser.NameContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitBacknamespace(ctx: SkollobleParser.BacknamespaceContext): T {
        return this.visitChildren(ctx)
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitForenamespace(ctx: SkollobleParser.ForenamespaceContext): T {
        return this.visitChildren(ctx)
    }
}
