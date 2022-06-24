package com.example.ctrlhplugin;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadResult {
    public static List<String> getLinesByCsv(String csvPath) {
        File file = new File(csvPath);
        List<String> dataList = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                dataList.add(line);
            }
        } catch (Exception ignored) {
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return dataList;
    }

    public static SearchResults getSearchResultsByLine(List<String> lines) {
        SearchResults searchResults = new SearchResults();
        for (String line : lines) {
            String[] split = line.split(",");
            List<String> collect = Arrays.stream(split).collect(Collectors.toList());
            searchResults.addSearchResult(new SearchResult(collect.get(0), Integer.parseInt(collect.get(1)), Integer.parseInt(collect.get(2)), Integer.parseInt(collect.get(3)), Integer.parseInt(collect.get(4))));
        }
        return searchResults;
    }

    public static SearchResults getSearchResultsByCsv(String path){
        List<String> lines = getLinesByCsv(path);
        SearchResults searchResultsByLine = getSearchResultsByLine(lines);
        return searchResultsByLine;
    }

    public static void main(String[] args) {
        List<String> lines = getLinesByCsv("search_result.csv");
        SearchResults searchResults = getSearchResultsByLine(lines);
        System.out.println();
    }
}
