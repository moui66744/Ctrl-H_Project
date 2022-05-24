package com.example.ctrlhplugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class SSRToolWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();

        SearchToolWindow searchToolWindow = new SearchToolWindow(toolWindow);
        Content search = contentFactory.createContent(searchToolWindow.getContent(), "Search", false);
        toolWindow.getContentManager().addContent(search);

        ReplaceToolWindow replaceToolWindow = new ReplaceToolWindow(toolWindow);
        Content replace = contentFactory.createContent(replaceToolWindow.getContent(), "Replace", false);
        toolWindow.getContentManager().addContent(replace);
//        Messages.showInfoMessage("Make sure the folder \"TestEnv\" is placed here:\nD:\\\n(absolute path)\n This tip is shown only in the test version.","Test Tips");
    }
}
