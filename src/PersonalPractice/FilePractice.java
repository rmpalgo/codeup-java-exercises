package PersonalPractice;

import java.io.File;

public class FilePractice {

    public static void main(String[] args) {

        File x = new File("src/PersonalPractice/TestFile.txt");

        if(x.exists()) {
            System.out.println(x.getName() + " exists!");
        } else {
            System.out.println("This doesn't exist!");
        }


    }

}
