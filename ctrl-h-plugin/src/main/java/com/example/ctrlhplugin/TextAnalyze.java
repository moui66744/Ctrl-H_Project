package com.example.ctrlhplugin;

import java.io.IOException;
import java.util.List;

class LabelIndex {
    int label;
    int index;

    /**
     * @param text 待解析的一个[index.label]型对象
     */
    public LabelIndex(String text) {
        String[] split = text.split("\\.");
        label = Integer.parseInt(split[0]);
        index = 0;
        if (split.length == 2) {
            index = Integer.parseInt(split[1]);
        }
    }
}

enum ObjType {L, S, LS, SL, LSL} // 五种可能出现的替换类型

class Obj {
    ObjType type;
    LabelIndex labelIndex;
    String string;
    LabelIndex labelIndex2;

    /**
     * @param text 待解析的一个替换语句右侧用于进行替换的内容（形如[index.label]##"""text"""）
     */
    public Obj(String text) {
        String[] split = text.split("##");
        if (split.length == 1) {
            if (split[0].startsWith("\"")) {
                type = ObjType.S; // S类型
                string = split[0].substring(3, split[0].length() - 3);
            } else if (split[0].startsWith("[")) {
                type = ObjType.L; // L类型
                labelIndex = new LabelIndex(split[0].substring(1, split[0].length() - 1));
            }
        }
        if (split.length == 2) {
            if (split[0].startsWith("\"")) {
                type = ObjType.SL; // SL类型
                string = split[0].substring(3, split[0].length() - 3);
                labelIndex2 = new LabelIndex(split[1].substring(1, split[1].length() - 1));
            } else if (split[0].startsWith("[")) {
                type = ObjType.LS; // LS类型
                labelIndex = new LabelIndex(split[0].substring(1, split[0].length() - 1));
                string = split[1].substring(3, split[1].length() - 3);
            }
        }
        if (split.length == 3) {
            type = ObjType.LSL; // LSL类型
            labelIndex = new LabelIndex(split[0].substring(1, split[0].length() - 1));
            string = split[1].substring(3, split[1].length() - 3);
            labelIndex2 = new LabelIndex(split[2].substring(1, split[2].length() - 1));
        }
    }
}

class ReplaceQuery {
    LabelIndex labelIndex;
    Obj obj;

    /**
     * @param text 待解析的
     */
    public ReplaceQuery(String text) {
        String[] split = text.split("=>");
        labelIndex = new LabelIndex(split[0].substring(1, split[0].length() - 1));
        obj = new Obj(split[1]);
    }

}

public class TextAnalyze {


    public static void main(String[] args) throws IOException {
//        ReplaceQuery replaceQuery = new ReplaceQuery("[1.2]->\"this is code\"");
        ReplaceQuery replaceQuery = new ReplaceQuery("[1.2]->[3.4]");
        ReadJsonResult.JsonObj jsonResult = ReadJsonResult.getJsonResult("out/res.json");
        List<int[]> offset = jsonResult.results.get(0).getOffset(replaceQuery.labelIndex.label, replaceQuery.labelIndex.index);
    }
}
