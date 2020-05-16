package PersonalPractice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;

public class FilePractice {

    public static void main(String[] args) {

    String directory = "src/PersonalPractice/data";
    String filename = "info.txt";

    Path dataDirectory = Paths.get(directory);
    System.out.println("dataDirectory = " + dataDirectory);
    createDir(dataDirectory);

    }

    public static void createDir(Path aDir) {
        if(Files.notExists(aDir)) {
            try {
                Files.createDirectory(aDir);
                System.out.println("You just created a file.");
            } catch (IOException e) {
                System.out.println("There was an error.");
                e.printStackTrace();
            }
        }
    }

}
