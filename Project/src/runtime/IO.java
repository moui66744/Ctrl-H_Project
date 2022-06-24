package runtime;

import AstGenerator.AstInfo;
import AstGenerator.CppAstInfo;
import AstGenerator.JavaAstInfo;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IO {
    private static List<AstInfo> astList;

    public static void readJavaFile(String path) throws IOException {
        astList = new ArrayList<>();
        try(Stream<Path> walk = Files.walk(Paths.get(path))){
            for (String fileName : walk.map(Path::toString).filter(f -> f.endsWith(".java")).toList()) {
                astList.add(new JavaAstInfo(fileName));
            }
        }
    }
    public static void readCppFile(String path) throws IOException {
        astList = new ArrayList<>();
        try(Stream<Path> walk = Files.walk(Paths.get(path))){
            for (String fileName : walk.map(Path::toString).filter(f -> f.matches(".*.(cpp|c|cxx|cc)")).toList()) {
                astList.add(new CppAstInfo(fileName));
            }
        }
    }
    public static void writeFile() throws IOException {
        int idx = 0;
        for (AstInfo ast : IO.getAstList()) {
            String path = ast.getPath();
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(ast.getTokenStreamRewriter().getText());
            fileWriter.close();
        }
    }

    public static List<AstInfo> getAstList() {
        return astList;
    }
}