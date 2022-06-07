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

    public static List<JsonResult> getJsonResult(String jsonPath) throws IOException {
        File file = new File(jsonPath);
        String jsonString = new String(Files.readAllBytes(Paths.get(file.getPath())));
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        return gson.fromJson(jsonString, new TypeToken<List<JsonResult>>() {
        }.getType());
    }

    public static SearchResults jsonResult2SearchResults(List<JsonResult> jsonResults) {
        SearchResults searchResults = new SearchResults();
        for (JsonResult jsonResult : jsonResults) {
            searchResults.addSearchResult(new SearchResult(jsonResult.attr.path, jsonResult.attr.sr, jsonResult.attr.sc, jsonResult.attr.sindex, jsonResult.attr.eindex));
        }
        return searchResults;
    }

    public static SearchResults getSearchResultsByJson(String jsonPath) throws IOException {
        return jsonResult2SearchResults(getJsonResult(jsonPath));
    }

    public static void main(String[] args) throws IOException {
        SearchResults searchResultsByJson = getSearchResultsByJson("test.json");
    }
}
