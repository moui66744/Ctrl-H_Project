package com.example.ctrlhplugin;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SingleReplace implements Comparable<SingleReplace> {
    int[] oldTextOffset;
    String newText;

    public static String getNewTextByNewOffset(String allText, int[] offSet) {
        return allText.substring(offSet[0], offSet[1]);
    }

    public SingleReplace(int[] oldTextOffset, int[] newTextOffset, String allText) {
        this.oldTextOffset = oldTextOffset;
        this.newText = getNewTextByNewOffset(allText, newTextOffset);
    }

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

    public ReplaceAction(List<int[]> oldTextOffsets, List<int[]> newTextOffsets, String allText) {
        assert newTextOffsets.size() == 1 || newTextOffsets.size() == oldTextOffsets.size();
        if (newTextOffsets.size() == 1) {
            replaces = new ArrayList<>();
            for (int[] oldTextOffset : oldTextOffsets) {
                int[] newTextOffset = newTextOffsets.get(0);
                assert newTextOffset[0] > oldTextOffset[1] || newTextOffset[1] < oldTextOffset[0];
                replaces.add(new SingleReplace(oldTextOffset, newTextOffset, allText));
            }
        } else {
            replaces = new ArrayList<>();
            for (int i = 0; i < oldTextOffsets.size(); i++) {
                assert newTextOffsets.get(i)[0] > oldTextOffsets.get(i)[1] || newTextOffsets.get(i)[1] < oldTextOffsets.get(i)[0];
                replaces.add(new SingleReplace(oldTextOffsets.get(i), newTextOffsets.get(i), allText));
            }
        }
        sortReplaces();
    }

    public ReplaceAction(List<int[]> oldTextOffsets, String newText) {
        replaces = new ArrayList<>();
        for (int[] oldTextOffset : oldTextOffsets) {
            replaces.add(new SingleReplace(oldTextOffset, newText));
        }
    }

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

    public static ReplaceAction getReplaceActionByQuery(ReplaceQuery replaceQuery, ReadJsonResult.Results results, String allText) {
        List<int[]> oldTextOffsets = results.getOffset(replaceQuery.labelIndex.label, replaceQuery.labelIndex.index);
        if (replaceQuery.obj.type.equals(ObjType.L)) {
            List<int[]> newTextOffsets = (results.getOffset(replaceQuery.obj.labelIndex.label, replaceQuery.obj.labelIndex.index));
            return new ReplaceAction(oldTextOffsets, newTextOffsets, allText);
        } else if (replaceQuery.obj.type.equals(ObjType.S)) {
            return new ReplaceAction(oldTextOffsets, replaceQuery.obj.string);
        } else if (replaceQuery.obj.type.equals(ObjType.LS)) {
            List<int[]> newTextOffsets = (results.getOffset(replaceQuery.obj.labelIndex.label, replaceQuery.obj.labelIndex.index));
            return new ReplaceAction(oldTextOffsets, newTextOffsets, replaceQuery.obj.string, null, allText);
        } else if (replaceQuery.obj.type.equals(ObjType.SL)) {
            List<int[]> newTextOffsets = (results.getOffset(replaceQuery.obj.labelIndex2.label, replaceQuery.obj.labelIndex2.index));
            return new ReplaceAction(oldTextOffsets, null, replaceQuery.obj.string, newTextOffsets, allText);
        } else if (replaceQuery.obj.type.equals(ObjType.LSL)) {
            List<int[]> newTextOffsets1 = (results.getOffset(replaceQuery.obj.labelIndex.label, replaceQuery.obj.labelIndex.index));
            List<int[]> newTextOffsets2 = (results.getOffset(replaceQuery.obj.labelIndex2.label, replaceQuery.obj.labelIndex2.index));
            return new ReplaceAction(oldTextOffsets, newTextOffsets1, replaceQuery.obj.string, newTextOffsets2, allText);
        }
        return null;
    }

    public static ReplaceAction mergeReplaceAction(ReplaceAction r1, ReplaceAction r2) {
        if (r1 == null) return r2;
        if (r2 == null) return r1;
        r1.replaces.addAll(r2.replaces);
        r1.sortReplaces();
        return r1;
    }

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