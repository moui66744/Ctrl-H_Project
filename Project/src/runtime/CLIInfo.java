package runtime;

public class CLIInfo {
    public String path;
    public String queryInput;
    public String outputDir;
    public boolean cmd;

    public enum LanguageType{
        JAVA,
        CPP
    }
    public LanguageType langType;
}
