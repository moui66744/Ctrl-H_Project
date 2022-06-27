package com.example.ctrlhplugin;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadJsonResult {
    // 以下几个类均对于json中的几个对象
    class JsonObj {
        List<Results> results;
    }

    class Results {
        String path;
        List<PathRes> path_res;

        public PathRes getResByLabel(int label) {
            for (PathRes path_res : path_res) {
                if (label == path_res.label) return path_res;
            }
            return null;
        }


        /**
         * @param label 该结果对应的label
         * @param index 该结果对应的index
         * @return int[0]=offsetStart int[1]=offsetEnd
         */
        public List<int[]> getOffset(int label, int index) {
            PathRes resByLabel = getResByLabel(label);
            if (index == 0) {
                // 如果index为0，则表示查找整个部分
                List<int[]> offSetByLabel = new ArrayList<>();
                for (LabelRes label_res : resByLabel.label_res) {
                    int[] offSet = {label_res.position.si - label_res.position.sr + 1, label_res.position.ei - label_res.position.er + 2}; // 计算所在偏移位置，后端结果与编辑器中对于偏移的计算方式存在一定差异，需要进行换算
                    offSetByLabel.add(offSet);
                }
                return offSetByLabel;
            } else {
                index -= 1;
                List<int[]> offsetByLabelIndex = new ArrayList<>();
                for (LabelRes label_res : resByLabel.label_res) {
                    assert index < label_res.subNode.size(); // 保证引用的语句块真实存在
                    int[] offSet = {label_res.subNode.get(index).si - label_res.subNode.get(index).sr + 1, label_res.subNode.get(index).ei - label_res.subNode.get(index).er+1};
                    offsetByLabelIndex.add(offSet);
                }
                return offsetByLabelIndex;
            }
        }
    }

    class PathRes {
        int label;
        List<LabelRes> label_res;
    }

    class LabelRes {
        Position position;
        List<Position> subNode;
    }


    class Position {
        int sc;
        int sr;
        int ec;
        int er;
        int si;
        int ei;
    }

    /**
     * 根据json文件的路径获取查询结果类的一个对象
     * @param jsonPath json文件所在路径
     * @return 由以上类组成的对象
     * @throws IOException 可能存在的IO异常
     */
    public static JsonObj getJsonResult(String jsonPath) throws IOException {
        File file = new File(jsonPath);
        String jsonString = new String(Files.readAllBytes(Paths.get(file.getPath())));
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        return gson.fromJson(jsonString, JsonObj.class);
    }

    /**
     * 将某个查询结棍对象组织成可显示在列表中的存储类型
     * @param jsonObj 查询结果类对象
     * @return 用于显示在列表中的数据存储类型SearchResults
     */
    public static SearchResults jsonResult2SearchResults(JsonObj jsonObj) {
        SearchResults searchResults = new SearchResults();
        for (Results results : jsonObj.results) {
            for (PathRes path_res : results.path_res) {
                for (LabelRes label_res : path_res.label_res) {
                    searchResults.addSearchResult(new SearchResult(results.path, label_res.position.sr, label_res.position.sc, label_res.position.si - label_res.position.sr + 1, label_res.position.ei - label_res.position.er + 2, path_res.label));
                    // 将其逐个遍历，组合成为线性结构
                    // 计算所在偏移位置，后端结果与编辑器中对于偏移的计算方式存在一定差异，需要进行换算
                }
            }
        }
        return searchResults;
    }

    /**
     * @param jsonPath json文件所在路径
     * @return 用于显示在列表中的数据存储类型SearchResults
     * @throws IOException 可能存在的IO异常
     */
    public static SearchResults getSearchResultsByJson(String jsonPath) throws IOException {
        return jsonResult2SearchResults(getJsonResult(jsonPath));
    }

    public static void main(String[] args) throws IOException {
        SearchResults searchResultsByJson = getSearchResultsByJson("out/res.json");
        JsonObj jsonResult = getJsonResult("out/res.json");
        List<int[]> offset = jsonResult.results.get(0).getOffset(0, 0);
    }
}
