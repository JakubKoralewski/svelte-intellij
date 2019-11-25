package dev.blachut.svelte.lang.psi

import com.intellij.psi.impl.source.tree.LazyParseablePsiElement
import com.intellij.psi.tree.IElementType

/**
 * Implementing JSEmbeddedContent is crucial for detecting custom JS dialect and associating JavaScript extensions
 *
 * @see com.intellij.lang.javascript.DialectDetector.calculateJSLanguage
  */
class SvelteJSLazyPsiElement(type: IElementType, text: CharSequence) : LazyParseablePsiElement(type, text) {
    override fun toString(): String {
        return "SvelteJS: $elementType"
    }
}
