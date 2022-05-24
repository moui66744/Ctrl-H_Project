package com.example.ctrlhplugin;

public class SearchResult {
    String file;
    int lineStart;
    int columnStart;
    int offsetStart;
    int offsetEnd;

    /**
     * @param file        文件位置
     * @param lineStart   实际仅用于展示
     * @param columnStart 实际仅用于展示
     * @param offsetStart 流式偏移量
     * @param offsetEnd   流式偏移量
     */
    public SearchResult(String file, int lineStart, int columnStart, int offsetStart, int offsetEnd) {
        // TODO: 2022/5/21 不检查 lineStart & columnStart 是否能和 offsetStart 对应
        this.file = file;
        this.lineStart = lineStart;
        this.columnStart = columnStart;
        this.offsetStart = offsetStart;
        this.offsetEnd = offsetEnd;
    }

    /**
     * @return 字符串形式显示，用于放在列表栏中
     */
    public String getStringInfo() {
        // TODO: 2022/5/21 此处暂定不打印终末位置
        return "File: " + file + " \t" +
                "Line: " + lineStart + " \t" +
                "Offset: " + columnStart;
    }
}
