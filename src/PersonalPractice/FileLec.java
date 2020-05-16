package PersonalPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileLec {

    public static void main(String[] args) {
        String directory = "src/PersonalPractice/data";
        String filename = "info.txt";
        String secondName = "grocery-list.csv";
        List<String> groceryList = new ArrayList<>();
        List<String> numberList = Arrays.asList("1", "2", "3", "4", "5", "8", "90");

        groceryList.add("coffee");
        groceryList.add("milk");
        groceryList.add("sugar");
        groceryList.add("cheese");
        groceryList.add("eggs");
        groceryList.add("tomatoes");

        //where the folder is gonna live
        Path dataDirectory = Paths.get(directory);
        Path numbersFilePath = Paths.get(directory, filename);
        Path groceryFilePath = Paths.get(directory, secondName);

        createDir(dataDirectory);



    }

    public static void createDir(Path aDir) {
        if(Files.notExists(aDir)) {
            try{
                System.out.println("Directory created");
                Files.createDirectory(aDir);
            } catch(IOException e) {
                System.out.println("Problems creating the directory");
                e.printStackTrace();
            }
        }

    }

}
