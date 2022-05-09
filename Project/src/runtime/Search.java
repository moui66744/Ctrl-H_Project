package runtime;

import AstGenerator.AstInfo;
import Visitor.ExpVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Search {
    /*
    或许可以将execSearch分成多个函数, 例如stmt/decl/expr分别查询
    返回值类型待定
    可能要同时记录所属文件, 可以使用/完善utils/SourcePosition类
     */

    private static List<AstInfo> readFile(String path) throws IOException {
        File file = new File(path);
        List<AstInfo> result = new ArrayList<>();
        if (!file.isDirectory()){
            if (file.getName().contains(".java"))
                result.add(new AstInfo(path));
        } else if (file.isDirectory()){
            String [] s = file.list();
            if (s == null)
                throw new IOException("Empty Directory");
            for (var f : s){
                var fileItem = new File(path + f);
                if (fileItem.isDirectory()){
                    readFile(fileItem.getAbsolutePath());
                } else {
                    if (fileItem.getName().contains(".java"))
                        result.add(new AstInfo(fileItem));
                }
            }
        }
        if (result.size() == 0) {
            throw new IOException("Invalid file name/path");
        }
        return result;
    }
    public static ArrayList<ParserRuleContext> execSearch(CLIParseInfo cliInfo) {
        ArrayList<ParserRuleContext> results = new ArrayList<>();

        // TODO: 打开 路径下所有文件 / 文件
        List<AstInfo> astList;
        try {
            astList = readFile(cliInfo.path);
            // TODO: 对每个文件分别查询
        }catch (IOException e){
            System.err.println(e.getLocalizedMessage());
            return null;// a bit ugly
        }
        switch (cliInfo.target) {
            // TODO: 语句查询
            case "if" -> {

            }
            case "switch" -> {

            }
            case "for" -> {

            }
            case "while" -> {

            }
            case "do-while" -> {// 也许可以换个名字?

            }
            case "try" -> {

            }
            case "throw" -> {

            }
//            case "assert" -> {
//
//            }
            // TODO: 声明查询

            // TODO: 表达式查询
            case "expr" -> {
                var exprVisitor = new ExpVisitor();
                exprVisitor.patternPreCompile(cliInfo.expr);
                List<ParserRuleContext> result = new ArrayList<>();
                for (var ast : astList) {
                    var res = exprVisitor.visitCompilationUnit(ast.getRoot());
                    res = exprVisitor.filter(res, ast.getTokenStream());
                    result.addAll(res);
                }
            }
        }
        return results;
    }

    public static void printSearchResults() {
        // TODO: 输出序号/文件名/行号/列号
        // 推荐使用utils/SourcePosition类
    }
}
