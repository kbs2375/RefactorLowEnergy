package com.datarankings.plugins.rle;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;

public class IntroduceForeignMethod extends AnAction {

    // If you register the action from Java code, this constructor is used to set the menu item name
    // (optionally, you can specify the menu description and an icon to display next to the menu item).
    // You can omit this constructor when registering the action in the plugin.xml file.
    /*public RefactorAction() {
        super("RefactorTest");
        // Set the menu item name, description and icon.
        // super("Text _Boxes","Item description",IconLoader.getIcon("/Mypackage/icon.png"));
    }*/

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        Project project = anActionEvent.getProject();
        //Project project = anActionEvent.getData(PlatformDataKeys.PROJECT);
        Navigatable navigatable = anActionEvent.getData(CommonDataKeys.NAVIGATABLE);

        if (project != null && navigatable != null) Messages.showMessageDialog(project, "Refactor Test1", "Refactor", Messages.getInformationIcon());
        else Messages.showMessageDialog(project, "Error", "Refactor", Messages.getErrorIcon());
    }

    @Override
    public void update(AnActionEvent anActionEvent) {
        Project project = anActionEvent.getProject();
        Navigatable navigatable = anActionEvent.getData(CommonDataKeys.NAVIGATABLE);
        anActionEvent.getPresentation().setEnabledAndVisible(project != null && navigatable != null);
    }
}