package advanced.filesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String inPath = "D:\\JavaProjects\\JavaSoftUni\\javaAdvanced\\src\\advanced\\filesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream in = new FileInputStream(inPath);
        int oneByte = in.read();

        while(oneByte >= 0){
            System.out.printf("%s ",Integer.toBinaryString(oneByte));
            oneByte = in.read();
        }

    }
}
