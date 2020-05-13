package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student scooby = new Student("Scooby");
        scooby.addGrade(100);
        scooby.addGrade(100);
        scooby.addGrade(101);

        Student  shaggy = new Student("Shaggy");
        shaggy.addGrade(60);
        shaggy.addGrade(67);
        shaggy.addGrade(75);

        Student fred = new Student("Fred");
        fred.addGrade(79);
        fred.addGrade(85);
        fred.addGrade(87);

        Student velma = new Student("Velma");
        velma.addGrade(96);
        velma.addGrade(99);
        velma.addGrade(100);

        students.put("scoobyMachineCode", scooby);
        students.put("shaggyCSS", shaggy);
        students.put("fredJS", fred);
        students.put("velmaJava", velma);

        String output = "Welcome!\n\n Here are the Github usernames of our students: \n\n" +
                "|scoobyMachineCode| |shaggyCSS| |fredJS| |velmaJava|\n\n What student would you like to see more information on?";

        while(true) {
            System.out.println(output);
            if(yesOrNo.equalsIgnoreCase("yes")) {
                System.out.println("What student would you like to see more information on?");
                String  input = scanner.nextLine();
                System.out.println(students.get(input));
            }
                System.out.println("Goodbye, and have a wonderful day!");


        }
    }

}
