package ru.hse.nml.structureViewNew;

import com.intellij.ide.structureView.StructureViewBuilder;
import com.intellij.ide.structureView.TreeBasedStructureViewBuilder;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NmlStructureViewFactoryNew implements PsiStructureViewFactory {
    @Nullable
    @Override
    public StructureViewBuilder getStructureViewBuilder(@NotNull PsiFile psiFile) {
        return new TreeBasedStructureViewBuilder() {
            @NotNull
            @Override
            public NmlStructureViewModelNew createStructureViewModel(@Nullable Editor editor) {
                return new NmlStructureViewModelNew(psiFile);
            }
        };
    }
}
