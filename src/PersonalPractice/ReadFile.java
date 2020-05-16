package PersonalPractice;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

    private Scanner x;

    public void openFile() {
        try {
            x = new Scanner(new File("src/PersonalPractice/data/grocery-list.csv"));
        } catch (Exception e) {
            System.out.println("Error in finding file.");
            e.printStackTrace();
        }
    }

    public void readFile() {
        while(x.hasNext()) {
            String a = x.next();
            System.out.printf("%s%n", a);
        }
    }

    public void closeFile() {
        x.close();
    }

}
