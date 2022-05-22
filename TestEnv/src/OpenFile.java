import java.io.*;

class OpenFIle {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/HelloWorld.java");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = bufferedReader.readLine();
        System.out.println(s);
    }
}
