package com.example.ctrlhplugin;

import java.io.*;

public class RunJar {
    public static void run(String jarPath, String query, String target, String destination, String language) {
        runSingle("c:/Java/jdk-16.0.2/bin/java -jar " + jarPath + "/Project.jar " +
                "-t \"" + query + "\" " +
                "-p \"" + target + "\" " +
                "-d \"" + destination + "\" " +
                "-l \"" + language + "\"");
    }

    public static void runSingle(String cmd) {
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            process.waitFor();
            InputStream inputStream = process.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, "gb2312"));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
//        String path;
//        path = "D:\\softInstall\\wamp2016_new\\bin\\apache\\apache2.4.9\\bin\\";

//        String cmd = "java -jar C:/Users/Keelo/Desktop/ctrl-h/ctrl-h-plugin/TestEnv/Project.jar -t \"while(){}\" -p \"C:/Users/Keelo/Desktop/ctrl-h/ctrl-h-plugin/TestEnv/test/DummyTest.java\" -d \"C:/Users/Keelo/Desktop/ctrl-h/ctrl-h-plugin/TestEnv/out/res.json\"";
//        String cmd = "java -jar Project.jar -t \"while(){}\" -p \"test/DummyTest.jar\" -d \"out/res.json\"";
//        String path="D:/Project_jar";
//        String cmd = "ping 127.0.0.1";
//        String cmd2="jar D:/Project_jar/Project";

//        run("./", "while(){}", "test/DummyTest.java", "out/res.json");
//        runSingle(cmd);
        RunJar.runSingle("java -jar C:/Users/Keelo/Desktop/ctrl-h/ctrl-h-plugin/TestEnv/Project.jar -t \"while(){}\" -p \"/Users/Keelo/Desktop/ctrl-h/ctrl-h-plugin/TestEnv/test/DummyTest.java\" -d \"/Users/Keelo/Desktop/ctrl-h/ctrl-h-plugin/TestEnv/out/res.json\"");
//        SearchResults searchResultsByJson = ReadJsonResult.getSearchResultsByJson("out/res.json");
        System.out.println("1");
    }
}
