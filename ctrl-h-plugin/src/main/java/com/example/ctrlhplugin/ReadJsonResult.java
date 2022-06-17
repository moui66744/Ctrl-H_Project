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
         * @return int[0]=offsetStart int[1]=offsetEnd
         */
        public List<int[]> getOffset(int label, int index) {
            PathRes resByLabel = getResByLabel(label);
            if (index == 0) {
                List<int[]> offSetByLabel = new ArrayList<>();
                for (LabelRes label_res : resByLabel.label_res) {
                    int[] offSet = {label_res.position.si - label_res.position.sr + 1, label_res.position.ei - label_res.position.er + 2};
                    offSetByLabel.add(offSet);
                }
                return offSetByLabel;
            } else {
                index -= 1;
                List<int[]> offsetByLabelIndex = new ArrayList<>();
                for (LabelRes label_res : resByLabel.label_res) {
                    assert index < label_res.subNode.size();
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

    public static JsonObj getJsonResult(String jsonPath) throws IOException {
        File file = new File(jsonPath);
        String jsonString = new String(Files.readAllBytes(Paths.get(file.getPath())));
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        JsonObj jsonObj = gson.fromJson(jsonString, JsonObj.class);
        return jsonObj;
    }

    public static SearchResults jsonResult2SearchResults(JsonObj jsonObj) {
        SearchResults searchResults = new SearchResults();
        for (Results results : jsonObj.results) {
            for (PathRes path_res : results.path_res) {
                for (LabelRes label_res : path_res.label_res) {
                    searchResults.addSearchResult(new SearchResult(results.path, label_res.position.sr, label_res.position.sc, label_res.position.si - label_res.position.sr + 1, label_res.position.ei - label_res.position.er + 2, path_res.label));
                    // TODO: 2022/6/16 不知为什么这里需要+1和+2
                }
            }
        }
        return searchResults;
    }

    public static SearchResults getSearchResultsByJson(String jsonPath) throws IOException {
        return jsonResult2SearchResults(getJsonResult(jsonPath));
    }

    public static void main(String[] args) throws IOException {
        SearchResults searchResultsByJson = getSearchResultsByJson("out/res.json");
        JsonObj jsonResult = getJsonResult("out/res.json");
        List<int[]> offset = jsonResult.results.get(0).getOffset(0, 0);
    }
}
