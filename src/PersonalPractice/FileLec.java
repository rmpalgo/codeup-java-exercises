package PersonalPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileLec {

    public static void main(String[] args) {

        //directory name and location
        String directory = "src/PersonalPractice/data";

        //file names
        String filename = "info.txt";
        String secondName = "grocery-list.csv";

        //data to write into the files
        List<String> groceryList = new ArrayList<>();
        List<String> numberList = Arrays.asList("1", "2", "3", "4", "5", "8", "90", "101");

        //adding the data to the ArrayList grocery
        groceryList.add("coffee");
        groceryList.add("milk");
        groceryList.add("sugar");
        groceryList.add("cheese");
        groceryList.add("eggs");
        groceryList.add("tomatoes");

        //where the directory will be and where the file and in which directory
        Path dataDirectory = Paths.get(directory);
        Path numbersFilePath = Paths.get(directory, filename);
        Path groceryFilePath = Paths.get(directory, secondName);

        //methods of creating a directory
        createDir(dataDirectory);

        //using methods that check if file exists, then create the file
        createAndCheckFile(numbersFilePath);
        createAndCheckFile(groceryFilePath);

        //write data on the file itself, two param: path to the file and the list of data
        writeFile(numbersFilePath, numberList);
        writeFile(groceryFilePath, groceryList);

        //read files pass filePath as first param, and boolean to print system output lines instead of just return lines
        readFile(numbersFilePath, false);
        readFile(groceryFilePath, true);

        //replace item by creating a copyArrayList and then using writeFile method to overwrite the file
        List<String> modifiedGrocery = replaceItem(groceryFilePath, "milk", "cream");
        writeFile(groceryFilePath, modifiedGrocery);
        readFile(groceryFilePath, true);

        //fileContains method takes in a String needle string to find and second param
        //Path aFile and use readFile method with false print, then iterate through lines
        //to find the String needle, and return true otherwise false
        System.out.println("fileContains(\"cheese\", groceryFilePath) = " + fileContains("cheese", groceryFilePath));
        System.out.println("fileContains(\"grapes\", groceryFilePath) = " + fileContains("grapes", groceryFilePath));

    }

    private static boolean fileContains(String needle, Path aFile) {
        List<String> lines = readFile(aFile, false);
        for(String line: lines) {
            if(line.equals(needle)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> replaceItem(Path aFile, String find, String replacement) {
        List<String> tempList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(aFile);
            for(String line: lines) {
                if(line.equals(find)) {
                    tempList.add(replacement);
                    continue;
                }
                tempList.add(line);
            }
        } catch (IOException e) {
            System.out.println("There is an error.");
            e.printStackTrace();
        }
        System.out.println("Overwritten the file.");
        return tempList;
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

    public static void createAndCheckFile(Path aFile) {
        if(Files.notExists(aFile)) {
            try {
                System.out.println("File created.");
                Files.createFile(aFile);
            } catch(IOException e) {
                System.out.println("Problems creating a file.");
                e.printStackTrace();
            }
        }
    }

    public static void writeFile (Path aFile, List<String> aList ) {
        try{
            System.out.println("Data written.");
            Files.write(aFile, aList);
            //This will append to the file instead of rewriting it
            //Files.write(aFile, aList, StandardOpenOption.APPEND);
        } catch(IOException e) {
            System.out.println("Problems writing in file");
            e.printStackTrace();
        }
    }

    public static List<String> readFile(Path aFile, boolean print) {
        List<String> lines;
        try {
            lines = Files.readAllLines(aFile);
            if(print == true) {
                for (String line : lines) {
                    System.out.println("line = " + line);
                }
                return null;
            }
            return lines;
        } catch(IOException e) {
            System.out.println("Problems reading the file");
            e.printStackTrace();
            return null;
        }
    }

}
