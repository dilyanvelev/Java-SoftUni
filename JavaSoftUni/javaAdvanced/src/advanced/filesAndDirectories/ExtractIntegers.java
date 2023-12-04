package advanced.filesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String pathIn = "D:\\JavaProjects\\JavaSoftUni\\javaAdvanced\\src\\advanced\\filesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "D:\\JavaProjects\\JavaSoftUni\\javaAdvanced\\src\\advanced\\filesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";

        Scanner scanner = new Scanner(new FileInputStream(pathIn));
        PrintWriter fileOut = new PrintWriter(new FileOutputStream(pathOut));

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                fileOut.println(scanner.nextInt());
            }
            scanner.next();
        }
        fileOut.close();
    }
}
