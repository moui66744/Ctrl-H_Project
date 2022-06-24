package com.example.ctrlhplugin;

import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "java", "-jar",
                "C:/Users/Keelo/Desktop/ctrl-h/ctrl-h-plugin/TestEnv/Project.jar",
                "-t", "\"while(){}\"",
                "-p", "\"/Users/Keelo/Desktop/ctrl-h/ctrl-h-plugin/TestEnv/test/DummyTest.java\"",
                "-d", "\"/Users/Keelo/Desktop/ctrl-h/ctrl-h-plugin/TestEnv/out/res.json\"");
        Process start = processBuilder.start();
    }
}
