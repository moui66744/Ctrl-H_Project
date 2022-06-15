package com.example.ctrlhplugin;


import com.intellij.openapi.command.WriteCommandAction;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.fileEditor.OpenFileDescriptor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.ui.ComboBox;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.psi.*;
import com.intellij.psi.codeStyle.CodeStyleManager;
import com.intellij.ui.EditorTextField;
import com.intellij.ui.JBColor;
import com.intellij.ui.components.*;
import com.intellij.util.ui.JBUI;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReplaceToolWindow {

//    面板设计

    /**
     * 构造函数
     *
     * @param toolWindow 系统构造面板时似乎会需要用到这一参数
     */
    public ReplaceToolWindow(ToolWindow toolWindow) {
//        initTest();
        languageComboBox.addItem("Java");
        languageComboBox.addItem("C");
    }

    SearchResults searchResults;
    //    上部
    private final JLabel templateLabel = new JBLabel("Template");
    private final JPanel languagePanel = new JBPanel<>();
    private final JLabel languageLabel = new JLabel("Language");
    private final JComboBox<String> languageComboBox = new ComboBox<>();

    {
        languagePanel.add(languageLabel);
        languagePanel.add(languageComboBox);
    }

    private final JLabel resultsLabel = new JBLabel("Results");
    //    中部
    private final JPanel textAreaPanel = new JBPanel<>(new GridLayout(1, 2));
    private final EditorTextField searchTextArea = new EditorTextField();
    private final EditorTextField replaceTextArea = new EditorTextField();
    private final JList<String> resultsList = new JBList<>();

    {
        // 修改中间区域组件的样式
        searchTextArea.setBorder(BorderFactory.createLineBorder(JBColor.LIGHT_GRAY));
        replaceTextArea.setBorder(BorderFactory.createLineBorder(JBColor.LIGHT_GRAY));
        resultsList.setBorder(BorderFactory.createLineBorder(JBColor.LIGHT_GRAY));

        textAreaPanel.add(searchTextArea);
        searchTextArea.setToolTipText("Search");
        searchTextArea.setFont(new Font("JetBrains Mono", Font.PLAIN, searchTextArea.getFont().getSize()));

        textAreaPanel.add(replaceTextArea);
        replaceTextArea.setToolTipText("Replace");
        replaceTextArea.setFont(new Font("JetBrains Mono", Font.PLAIN, replaceTextArea.getFont().getSize()));
        // 使用列表选择来触发跳转事件
        resultsList.addListSelectionListener(e -> {
            // TODO: 2022/5/21 切换列表才能触发事件，没有点击列表触发事件的方法，即第二次点击已被选中的物体不能构成跳转，可能需要靠 addComponentListener 实现
            if (!e.getValueIsAdjusting() && resultsList.getSelectedIndex() >= 0 && resultsList.getSelectedIndices().length == 1) {
                // getValueIsAdjusting 用于确保仅触发一次
                // getSelectionIndex 用于确保在 Replace 重置引起的 List 变动时不会触发一下函数
                // TODO: 2022/5/21 此处只取第一个，但实际上不知道第一个是什么，如果打开了多个工程不清楚是否会有问题
                Project project = ProjectManager.getInstance().getOpenProjects()[0];
                // 获取当前选取的需要
                int index = resultsList.getSelectedIndex();
                // 根据选取的序号返回所选的搜索结果
                SearchResult result = searchResults.results.get(index);
//                new FileChooserDescriptor(true, false, false, false, false, false);
                // 打开对应的文件
//                File file = new File(project.getBasePath() + result.file.substring(1));
                File file = new File(project.getBasePath() + "/" + result.file);
                VirtualFile virtualFile = VfsUtil.findFileByIoFile(file, true);
                assert virtualFile != null;
                OpenFileDescriptor descriptor = new OpenFileDescriptor(project, virtualFile);
                // 在文件中建立一个编辑对象
                Editor editor = FileEditorManager.getInstance(project).openTextEditor(descriptor, true);

//                定位
                assert editor != null;
                // 获取其中的插入符/光标
                CaretModel caretModel = editor.getCaretModel();
                // 将光标设置到搜索结果的对应位置
//                caretModel.moveToLogicalPosition(new LogicalPosition(result.lineStart, result.columnStart));
                caretModel.moveToOffset(result.offsetStart);
                // 确保其在视野范围内
                editor.getScrollingModel().scrollToCaret(ScrollType.CENTER_DOWN);

//                高亮/选择
                SelectionModel selectionModel = editor.getSelectionModel();
                // 将搜索结果对应的文段框选
                selectionModel.setSelection(result.offsetStart, result.offsetEnd);

            }
        });
    }

    //    下部
    private final JButton inProjectButton = new JButton("In Project");
    private final JButton directoryButton = new JButton("Directory");
    private final JPanel pathPanel = new JBPanel<>(new GridBagLayout());
    private final JPanel findPanel = new JBPanel<>(new GridBagLayout());
    private final TextFieldWithBrowseButton directoryTextField = new TextFieldWithBrowseButton();
    // TODO: 2022/5/21 为 BrowseButton 设置选择结构
    private final JCheckBox recursiveCheckBox = new JBCheckBox();
    private final JLabel recursiveLabel = new JBLabel("Recursive");
    private final JButton findButton = new JButton("Find");
    private final JButton replaceSelectedButton = new JButton("Replace Selected");
    private final JButton replaceAllButton = new JButton("Replace All");

    {

        // 修改下部组件样式
        inProjectButton.setBorder(null);
        directoryButton.setBorder(null);
        directoryButton.setFont(new Font(directoryButton.getFont().getName(), Font.BOLD, directoryButton.getFont().getSize()));
//        directoryTextField.setBorder(BorderFactory.createLineBorder(JBColor.LIGHT_GRAY));

        pathPanel.add(inProjectButton, new GridBagConstraints(GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE, 1, 1, 0, 0, GridBagConstraints.SOUTHWEST, GridBagConstraints.VERTICAL, JBUI.emptyInsets(), 0, 0));
        pathPanel.add(directoryButton, new GridBagConstraints(GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE, 1, 1, 0, 0, GridBagConstraints.SOUTHWEST, GridBagConstraints.VERTICAL, JBUI.emptyInsets(), 0, 0));
        pathPanel.add(directoryTextField, new GridBagConstraints(GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE, 1, 1, 0.7, 1, GridBagConstraints.SOUTHWEST, GridBagConstraints.HORIZONTAL, JBUI.emptyInsets(), 0, 0));

        // 给Button设置样式
        findButton.setFont(new Font(findButton.getFont().getName(), Font.BOLD, findButton.getFont().getSize()));
        replaceSelectedButton.setFont(new Font(replaceSelectedButton.getFont().getName(), Font.BOLD, replaceSelectedButton.getFont().getSize()));
        replaceAllButton.setFont(new Font(replaceAllButton.getFont().getName(), Font.BOLD, replaceAllButton.getFont().getSize()));

        // 初始情况下默认为选择 directory
        // TODO: 2022/5/21 目前仅支持 directory 模式，需要进一步讨论 in project 模式的设计和实现

        findPanel.add(recursiveCheckBox);
        findPanel.add(recursiveLabel);
        findPanel.add(findButton, new GridBagConstraints(GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE, 1, 1, 0, 0, GridBagConstraints.SOUTHEAST, GridBagConstraints.VERTICAL, JBUI.emptyInsets(), 0, 0));
        findPanel.add(replaceSelectedButton, new GridBagConstraints(GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE, 1, 1, 0, 0, GridBagConstraints.SOUTHEAST, GridBagConstraints.VERTICAL, JBUI.emptyInsets(), 0, 0));
        findPanel.add(replaceAllButton, new GridBagConstraints(GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE, 1, 1, 0, 0, GridBagConstraints.SOUTHEAST, GridBagConstraints.VERTICAL, JBUI.emptyInsets(), 0, 0));

        // in project 和 directory 两个按钮之间选择时会影响自身和对方样式
        inProjectButton.addActionListener(e -> {
            inProjectButton.setFont(new Font(inProjectButton.getFont().getName(), Font.BOLD, inProjectButton.getFont().getSize()));
            directoryButton.setFont(new Font(directoryButton.getFont().getName(), Font.PLAIN, directoryButton.getFont().getSize()));
            directoryTextField.setEnabled(false);
        });
        directoryButton.addActionListener(e -> {
            directoryButton.setFont(new Font(directoryButton.getFont().getName(), Font.BOLD, directoryButton.getFont().getSize()));
            inProjectButton.setFont(new Font(inProjectButton.getFont().getName(), Font.PLAIN, inProjectButton.getFont().getSize()));
            directoryTextField.setEnabled(true);
        });
        findButton.addActionListener(e -> {
//            searchResults = ReadResult.getSearchResultsByCsv(ProjectManager.getInstance().getOpenProjects()[0].getBasePath() + "/" + "search_result.csv");
            try {
                String basePath = ProjectManager.getInstance().getOpenProjects()[0].getBasePath();
                RunJar.run(basePath, searchTextArea.getText(), basePath + "/" + directoryTextField.getText(), basePath + "/out/res.json");
                searchResults = ReadJsonResult.getSearchResultsByJson(ProjectManager.getInstance().getOpenProjects()[0].getBasePath() + "/out/" + "res.json");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            resultsList.setListData(searchResults.getStringInfos());
//            try {
//                SearchResults query = FindAction.findAllByQuery(searchTextArea.getText(), ProjectManager.getInstance().getOpenProjects()[0].getBasePath() + "/" + directoryTextField.getText());
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }

        });

        // 给 replace selected button 添加动作
        replaceSelectedButton.addActionListener(e -> {
            // TODO: 2022/5/22 替换完成后，是否需要进行重新扫描？
            // TODO: 2022/5/22 未选择的情况下需要处理（文本框和列表都需要）
            if (resultsList.getSelectedIndices().length == 1) {
                String replaceText = replaceTextArea.getText();
                int index = resultsList.getSelectedIndex();
                SearchResult result = searchResults.results.get(index);
                // TODO: 2022/5/22 此处实际应该是调用对应的函数得到字符串
                Project project = ProjectManager.getInstance().getOpenProjects()[0];
//            new FileChooserDescriptor(true, false, false, false, false, false);
                File file = new File(project.getBasePath() + "/" + result.file);
                VirtualFile virtualFile = VfsUtil.findFileByIoFile(file, true);
                assert virtualFile != null;
                OpenFileDescriptor descriptor = new OpenFileDescriptor(project, virtualFile);
                Editor editor = FileEditorManager.getInstance(project).openTextEditor(descriptor, true);
                assert editor != null;

                Document document = editor.getDocument();
                WriteCommandAction.runWriteCommandAction(project, () -> document.replaceString(result.offsetStart, result.offsetEnd, replaceText));
                editor.getCaretModel().getPrimaryCaret().moveToOffset(result.offsetStart);
                editor.getSelectionModel().setSelection(result.offsetStart, result.offsetStart + replaceText.length());

                // TODO: 2022/5/22 暂未成功实现代码格式化
                PsiFile psiFile = PsiManager.getInstance(project).findFile(virtualFile);
                assert psiFile != null;
                PsiElement reformat = CodeStyleManager.getInstance(project).reformat(psiFile);

                searchResults.results.remove(index);
                resultsList.setListData(searchResults.getStringInfos());
            } else if (resultsList.getSelectedIndices().length > 1) {

                String replaceText = replaceTextArea.getText();
                Project project = ProjectManager.getInstance().getOpenProjects()[0];
                List<SearchResult> unselectedResults = new ArrayList<>();
                int tmpSelectedIndex = 0;
                for (var index : resultsList.getSelectedIndices()) {
                    SearchResult result = searchResults.results.get(index);
                    File file = new File(project.getBasePath() + "/" + result.file);
                    VirtualFile virtualFile = VfsUtil.findFileByIoFile(file, true);
                    assert virtualFile != null;
                    OpenFileDescriptor descriptor = new OpenFileDescriptor(project, virtualFile);
                    Editor editor = FileEditorManager.getInstance(project).openTextEditor(descriptor, true);
                    assert editor != null;

                    Document document = editor.getDocument();
                    WriteCommandAction.runWriteCommandAction(project, () -> document.replaceString(result.offsetStart, result.offsetEnd, replaceText));
                    editor.getCaretModel().getPrimaryCaret().moveToOffset(result.offsetStart);
                    editor.getCaretModel().getPrimaryCaret().removeSelection();
                    unselectedResults.addAll(searchResults.results.subList(tmpSelectedIndex, index));
                    tmpSelectedIndex = index + 1;
                }
                searchResults.results = unselectedResults;
                resultsList.setListData(searchResults.getStringInfos());
            }

        });

        replaceAllButton.addActionListener(e -> {

            // TODO: 2022/5/22 未选择的情况下需要处理（文本框和列表都需要）
            // TODO: 2022/5/22 此处实际应该是调用对应的函数得到字符串
            String replaceText = replaceTextArea.getText();

            Project project = ProjectManager.getInstance().getOpenProjects()[0];

            for (var result : searchResults.results) {
                File file = new File(project.getBasePath() + "/" + result.file);
                VirtualFile virtualFile = VfsUtil.findFileByIoFile(file, true);
                assert virtualFile != null;
                OpenFileDescriptor descriptor = new OpenFileDescriptor(project, virtualFile);
                Editor editor = FileEditorManager.getInstance(project).openTextEditor(descriptor, true);
                assert editor != null;

                Document document = editor.getDocument();
                WriteCommandAction.runWriteCommandAction(project, () -> document.replaceString(result.offsetStart, result.offsetEnd, replaceText));
                editor.getCaretModel().getPrimaryCaret().moveToOffset(result.offsetStart);
                editor.getCaretModel().getPrimaryCaret().removeSelection();
                // TODO: 2022/5/22 暂未实现代码格式化
            }
            Messages.showInfoMessage(searchResults.results.size() + " result(s) has been replaced.", "Replace Succesfully");
            searchResults.results.clear();
            resultsList.setListData(searchResults.getStringInfos());
        });


    }

    //    总面板
    private final JPanel toolWindowPanel = new JBPanel<>(new GridBagLayout());

    {
        // 总面板布局
        toolWindowPanel.add(templateLabel, new GridBagConstraints(0, 0, 1, 1, 0.02, 0.02, GridBagConstraints.WEST, GridBagConstraints.NONE, JBUI.insets(0, 2, 0, 0), 0, 0));
        toolWindowPanel.add(languagePanel, new GridBagConstraints(2, 0, 1, 1, 0.02, 0.02, GridBagConstraints.EAST, GridBagConstraints.NONE, JBUI.emptyInsets(), 0, 0));
        toolWindowPanel.add(textAreaPanel, new GridBagConstraints(0, 1, 3, 1, 0.7, 0.96, GridBagConstraints.CENTER, GridBagConstraints.BOTH, JBUI.emptyInsets(), 0, 0));
        toolWindowPanel.add(pathPanel, new GridBagConstraints(0, 2, 2, 1, 0.68, 0.02, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, JBUI.emptyInsets(), 0, 0));
        toolWindowPanel.add(findPanel, new GridBagConstraints(2, 2, 1, 1, 0.02, 0.02, GridBagConstraints.EAST, GridBagConstraints.NONE, JBUI.emptyInsets(), 0, 0));
        toolWindowPanel.add(resultsLabel, new GridBagConstraints(3, 0, 1, 1, 0.3, 0.02, GridBagConstraints.WEST, GridBagConstraints.NONE, JBUI.emptyInsets(), 0, 0));
        toolWindowPanel.add(resultsList, new GridBagConstraints(3, 1, 1, 2, 0.3, 0.98, GridBagConstraints.CENTER, GridBagConstraints.BOTH, JBUI.insets(0, 0, 0, 0), 0, 0));
    }

    private void initTest() {
//        仅供测试用的初始化部分放在这里，最终投入使用时不会使用这一部分
        searchResults = new SearchResults();
//        searchResults.addSearchResult(new SearchResult("D:/TestEnv/src/HelloWorld.java", 5, 3));
        Project project = ProjectManager.getInstance().getOpenProjects()[0];
//        Messages.showInfoMessage(project.getBasePath(), "Path");
        searchResults.addSearchResult(new SearchResult("./src/HelloWorld.java", 1, 37, 63, 67));
        searchResults.addSearchResult(new SearchResult("./src/OpenFile.java", 3, 4, 40, 46));
        searchResults.addSearchResult(new SearchResult("./src/Test.java", 2, 8, 73, 107));
        searchResults.addSearchResult(new SearchResult("./src/Test.java", 2, 27, 92, 105));
        resultsList.setListData(searchResults.getStringInfos());
        languageComboBox.addItem("Java");
        languageComboBox.addItem("C");
        replaceTextArea.setText("/*JUST FOR TEST*/");
    }


    public JPanel getContent() {
        return toolWindowPanel;
    }

}