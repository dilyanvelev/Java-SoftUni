package advanced.filesAndDirectories;

import java.io.*;

public class SerializationExample{
    public static void main(String[] args) throws IOException {
        Cube cube = new Cube("blue",1,1,1);
        String path = "D:\\JavaProjects\\JavaSoftUni\\javaAdvanced\\src\\advanced\\filesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\myCube.ser";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(cube);
        objectOutputStream.close();

    }
}
