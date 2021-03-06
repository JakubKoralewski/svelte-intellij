package dev.blachut.svelte.lang

import com.intellij.lang.javascript.psi.JSEmbeddedContent
import com.intellij.openapi.util.io.FileUtil
import com.intellij.openapi.util.text.StringUtil
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil

fun isSvelteComponentTag(name: String): Boolean {
    // TODO Support namespaced components
    return StringUtil.isCapitalized(name)
}

fun getRelativePath(currentFile: VirtualFile, componentFile: VirtualFile): String {
    return FileUtil.getRelativePath(currentFile.parent.path, componentFile.path, '/') ?: ""
}

fun getJsEmbeddedContent(script: PsiElement?): JSEmbeddedContent? {
    // JSEmbeddedContent is nested twice, see SvelteJSScriptContentProvider
    return PsiTreeUtil.getChildOfType(script, JSEmbeddedContent::class.java)?.firstChild as JSEmbeddedContent?
}
