package com.example.ctrlhplugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class SearchResults {
    List<SearchResult> results;

    /**
     * 构造函数
     */
    public SearchResults() {
        results = new ArrayList<>();
    }

    /**
     * @param searchResult 需要新增的 SearchResult 对象
     */
    public void addSearchResult(SearchResult searchResult) {
        results.add(searchResult);
    }

    /**
     * @return 将其中包含的所有列表信息用字符串向量的形式返回，以便用于显示在列表中
     */
    public Vector<String> getStringInfos() {
        Vector<String> strings = new Vector<>();
        for (var result : results) {
            strings.add(result.getStringInfo());
        }
        return strings;
    }
}