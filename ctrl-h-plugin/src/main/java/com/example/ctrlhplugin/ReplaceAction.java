package com.example.ctrlhplugin;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SingleReplace implements Comparable<SingleReplace> {
    int[] oldTextOffset;
    String newText;

    /**
     * @param allText 未经替换的整个文件的字符串
     * @param offSet 将用于充当替换内容的段落所在的偏移位置
     * @return 将用于充当替换内容的段落的字符串
     */
    public static String getNewTextByNewOffset(String allText, int[] offSet) {
        return allText.substring(offSet[0], offSet[1]);
    }

    /**
     * @param oldTextOffset 将被替换的内容所在的位置
     * @param newTextOffset 将用于替换的内容的来源所在位置
     * @param allText 未经替换的整个文件的字符串
     */
    public SingleReplace(int[] oldTextOffset, int[] newTextOffset, String allText) {
        this.oldTextOffset = oldTextOffset;
        this.newText = getNewTextByNewOffset(allText, newTextOffset);
    }

    /**
     * @param oldTextOffset 将被替换的内容所在的位置
     * @param newText 将用于充当替换内容的段落的字符串
     */
    public SingleReplace(int[] oldTextOffset, String newText) {
        this.oldTextOffset = oldTextOffset;
        this.newText = newText;
    }

    @Override
    public int compareTo(@NotNull SingleReplace o) {
        return this.oldTextOffset[0] - o.oldTextOffset[0];
    }
}

public class ReplaceAction {
    List<SingleReplace> replaces;

    public void sortReplaces() {
        Collections.sort(replaces);
    }

    /**
     * @param oldTextOffsets 将被替换的内容所在的位置，由于可能不止一个，因此为一个列表
     * @param newTextOffsets 将用于充当替换内容的段落所在的偏移位置，由于可能不止一个，因此为一个列表
     * @param allText 未经替换的整个文件的字符串
     */
    public ReplaceAction(List<int[]> oldTextOffsets, List<int[]> newTextOffsets, String allText) {
        assert newTextOffsets.size() == 1 || newTextOffsets.size() == oldTextOffsets.size();
        // 确保用于充当替换内容的段落仅有一个或数量与被替换内容数量相等，以便确认对应关系
        if (newTextOffsets.size() == 1) {
            replaces = new ArrayList<>();
            for (int[] oldTextOffset : oldTextOffsets) {
                int[] newTextOffset = newTextOffsets.get(0);
                replaces.add(new SingleReplace(oldTextOffset, newTextOffset, allText));
            }
        } else {
            replaces = new ArrayList<>();
            for (int i = 0; i < oldTextOffsets.size(); i++) {
                replaces.add(new SingleReplace(oldTextOffsets.get(i), newTextOffsets.get(i), allText));
            }
        }
        sortReplaces();
    }

    /**
     * @param oldTextOffsets 被替换的内容所在的位置，由于可能不止一个，因此为一个列表
     * @param newText 将用于充当替换内容的段落的字符串
     */
    public ReplaceAction(List<int[]> oldTextOffsets, String newText) {
        replaces = new ArrayList<>();
        for (int[] oldTextOffset : oldTextOffsets) {
            replaces.add(new SingleReplace(oldTextOffset, newText));
        }
    }

    /**
     * @param oldTextOffsets 被替换的内容所在的位置，由于可能不止一个，因此为一个列表
     * @param newTextOffsets1 将用于充当替换内容的第一个段落所在的偏移位置，由于可能不止一个，因此为一个列表
     * @param newMiddleText 将用于充当替换内容的段落的字符串组分
     * @param newTextOffsets2 将用于充当替换内容的第二个段落所在的偏移位置，由于可能不止一个，因此为一个列表
     * @param allText 未经替换的整个文件的字符串
     */
    public ReplaceAction(List<int[]> oldTextOffsets, List<int[]> newTextOffsets1, String newMiddleText, List<int[]> newTextOffsets2, String allText) {
        replaces = new ArrayList<>();
        assert newTextOffsets1 != null || newMiddleText != null || newTextOffsets2 != null;
        assert newTextOffsets1 == null || newTextOffsets1.size() == oldTextOffsets.size();
        assert newTextOffsets2 == null || newTextOffsets2.size() == oldTextOffsets.size();
        for (int i = 0; i < oldTextOffsets.size(); i++) {
            String newText = "";
            if (newTextOffsets1 != null)
                newText += SingleReplace.getNewTextByNewOffset(allText, newTextOffsets1.get(i));
            if (newMiddleText != null) newText += newMiddleText;
            if (newTextOffsets2 != null)
                newText += SingleReplace.getNewTextByNewOffset(allText, newTextOffsets2.get(i));
            replaces.add(new SingleReplace(oldTextOffsets.get(i), newText));
        }
    }

    /**
     * @param replaceQuery 包含了替换信息的对象
     * @param results 目前的所有可被引用的查询结果
     * @param allText 未经替换的整个文件的字符串
     * @return 一个用于执行替换操作的对象
     */
    public static ReplaceAction getReplaceActionByQuery(ReplaceQuery replaceQuery, ReadJsonResult.Results results, String allText) {
        List<int[]> oldTextOffsets = results.getOffset(replaceQuery.labelIndex.label, replaceQuery.labelIndex.index);
        if (replaceQuery.obj.type.equals(ObjType.L)) {
            // L型替换请求
            List<int[]> newTextOffsets = (results.getOffset(replaceQuery.obj.labelIndex.label, replaceQuery.obj.labelIndex.index));
            return new ReplaceAction(oldTextOffsets, newTextOffsets, allText);
        } else if (replaceQuery.obj.type.equals(ObjType.S)) {
            // S型替换星球
            return new ReplaceAction(oldTextOffsets, replaceQuery.obj.string);
        } else if (replaceQuery.obj.type.equals(ObjType.LS)) {
            // LS型替换请求
            List<int[]> newTextOffsets = (results.getOffset(replaceQuery.obj.labelIndex.label, replaceQuery.obj.labelIndex.index));
            return new ReplaceAction(oldTextOffsets, newTextOffsets, replaceQuery.obj.string, null, allText);
        } else if (replaceQuery.obj.type.equals(ObjType.SL)) {
            // SL型替换请求
            List<int[]> newTextOffsets = (results.getOffset(replaceQuery.obj.labelIndex2.label, replaceQuery.obj.labelIndex2.index));
            return new ReplaceAction(oldTextOffsets, null, replaceQuery.obj.string, newTextOffsets, allText);
        } else if (replaceQuery.obj.type.equals(ObjType.LSL)) {
            // LSL型替换请求
            List<int[]> newTextOffsets1 = (results.getOffset(replaceQuery.obj.labelIndex.label, replaceQuery.obj.labelIndex.index));
            List<int[]> newTextOffsets2 = (results.getOffset(replaceQuery.obj.labelIndex2.label, replaceQuery.obj.labelIndex2.index));
            return new ReplaceAction(oldTextOffsets, newTextOffsets1, replaceQuery.obj.string, newTextOffsets2, allText);
        }
        return null;
    }

    /**
     * 当存在多个替换对象时，可以将他们进行合并
     * @param r1 第一个替换对象
     * @param r2 第二个替换对象
     * @return 整合后的替换对象
     */
    public static ReplaceAction mergeReplaceAction(ReplaceAction r1, ReplaceAction r2) {
        if (r1 == null) return r2;
        if (r2 == null) return r1;
        r1.replaces.addAll(r2.replaces);
        r1.sortReplaces();
        return r1;
    }

    /**
     * @param oldText 未经替换的整个文件的字符串
     * @return 完成替换后的新的整个文件的字符串
     */
    public String replacedText(String oldText) {
        String newText = "";
        int p = 0;
        for (SingleReplace replace : replaces) {
            newText += oldText.substring(p, replace.oldTextOffset[0]);
            newText += replace.newText;
            p = replace.oldTextOffset[1];
        }
        if (p < oldText.length()) newText += oldText.substring(p);
        return newText;
    }
}