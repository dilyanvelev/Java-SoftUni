package advanced.filesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaProjects\\JavaSoftUni\\javaAdvanced\\src\\advanced\\filesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "D:\\JavaProjects\\JavaSoftUni\\javaAdvanced\\src\\advanced\\filesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";

        FileInputStream file = new FileInputStream(path);
        FileOutputStream fileOut = new FileOutputStream(pathOut);

        int oneByte = file.read();

        while(oneByte >=0){
            if(oneByte == 32 || oneByte == 10){
                fileOut.write(oneByte);
            }else{
                String digit = String.valueOf(oneByte);

                for (int i = 0; i < digit.length(); i++) {
                    fileOut.write(digit.charAt(i));
                }
            }

            oneByte = file.read();
        }
    }
}
