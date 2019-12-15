package dev.blachut.svelte.lang.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.javascript.psi.impl.JSParameterImpl

class SvelteJSParameter(node: ASTNode) : JSParameterImpl(node) {
//    override fun getUseScope(): SearchScope {
//        val tag = PsiTreeUtil.getParentOfType(this, SvelteOpeningTag::class.java, SvelteContinuationTag::class.java)
//        tag ?: return LocalSearchScope.EMPTY
//        return LocalSearchScope(tag.parent)
//    }
}
