package advanced.filesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String inPath = "D:\\JavaProjects\\JavaSoftUni\\javaAdvanced\\src\\advanced\\filesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outPath = "D:\\JavaProjects\\JavaSoftUni\\javaAdvanced\\src\\advanced\\filesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";
        FileInputStream fileIn = new FileInputStream(inPath);
        FileOutputStream fileOut = new FileOutputStream(outPath);

        List<Character> skipSymbol = new ArrayList<>(Arrays.asList(',', '.', '!', '?'));
        int oneByte = fileIn.read();

        while (oneByte >= 0) {
            if (!skipSymbol.contains((char) oneByte)) {
                fileOut.write(oneByte);
            }
            oneByte = fileIn.read();
        }

    }
}
