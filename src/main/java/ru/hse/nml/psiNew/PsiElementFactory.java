package ru.hse.nml.psiNew;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
/**
 * This interface supports constructing a {@link PsiElement} from an {@link ASTNode}.
 */
public interface PsiElementFactory {
    PsiElement createElement(ASTNode node);
}
