package com.datarankings.plugins.rle;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.editor.Editor;

import java.util.Collections;

public class RefactorLowEnergyActionGroup extends DefaultActionGroup {

    private Collections a;

    @Override
    public void update(AnActionEvent event) {
        Editor editor = event.getData(CommonDataKeys.EDITOR);

        event.getPresentation().setVisible(true);
        event.getPresentation().setEnabled(editor != null);
        event.getPresentation().setIcon(AllIcons.General.Error);
    }

}
