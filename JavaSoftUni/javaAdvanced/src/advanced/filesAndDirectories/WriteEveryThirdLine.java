package advanced.filesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String pathIn = "D:\\JavaProjects\\JavaSoftUni\\javaAdvanced\\src\\advanced\\filesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "D:\\JavaProjects\\JavaSoftUni\\javaAdvanced\\src\\advanced\\filesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

        Scanner fileIn = new Scanner(new FileInputStream(pathIn));
        PrintWriter fileOut = new PrintWriter(new FileOutputStream(pathOut));

        int counter = 1;
        String line = fileIn.nextLine();
        while (fileIn.hasNextLine()){
            if(counter%3 ==0){
                fileOut.println(line);
            }
            counter++;
            line = fileIn.nextLine();
        }
        fileOut.close();


    }


}
