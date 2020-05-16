package PersonalPractice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;

public class FilePractice {

    private Formatter x;

    public void openFile() {
        try{
            x = new Formatter("src/PersonalPractice/cool.txt");
        } catch (Exception e) {
            System.out.println("you have an error");
        }
    }

    public void addRecords() {
        x.format("%s %s%s", "20", "Mr.", "Wanderer");
    }

    public void closeFile() {
        x.close();
    }
}
