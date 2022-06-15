package com.example.ctrlhplugin;


import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadJsonResult {
    static class JsonResult {
        public Attribute attr;
    }

    static class Attribute {
        public int sr;
        public int sc;
        public int er;
        public int ec;
        public String path;
        public int sindex;
        public int eindex;
    }

    static class Result {
        public int sr;
        public int sc;
        public int er;
        public int ec;
        public int si;
        public int ei;
    }

    static class Results {
        String path;
        List<Result> result;
    }

    static class Obj {
        List<Results> results;
    }

    public static List<Results> getJsonResult(String jsonPath) throws IOException {
        File file = new File(jsonPath);
        String jsonString = new String(Files.readAllBytes(Paths.get(file.getPath())));
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        Obj obj = gson.fromJson(jsonString, Obj.class);
        return obj.results;
    }

    public static SearchResults jsonResult2SearchResults(List<Results> resultsList) {
        SearchResults searchResults = new SearchResults();
        for (Results results : resultsList) {
            for (Result result : results.result) {
                searchResults.addSearchResult(new SearchResult(results.path, result.sr, result.sc, result.si, result.ei));
            }
        }
        return searchResults;
    }

    public static SearchResults getSearchResultsByJson(String jsonPath) throws IOException {
        return jsonResult2SearchResults(getJsonResult(jsonPath));
    }

    public static void main(String[] args) throws IOException {
        List<Results> jsonResult = getJsonResult("test.json");
        SearchResults searchResultsByJson = getSearchResultsByJson("test.json");
    }
}
