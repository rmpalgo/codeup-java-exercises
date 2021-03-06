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
        System.out.println(output);
        System.out.println("What student would you like to see more information on?");
        String input = scanner.nextLine();
        String yesOrNo = "y";
        String choice;

        while(yesOrNo.equalsIgnoreCase("y")) {
            if(!students.containsKey(input)) {
                System.out.println("Sorry, no student found with the GitHub username of " + input);
            }
            System.out.println(students.get(input).getName());
            System.out.println("Would you like to see another student?");
            choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("y")) {
                System.out.println("What student would you like to see more information on?");
                yesOrNo = "y";
                input = scanner.nextLine();
            } else if(choice.equalsIgnoreCase("n")) {
                System.out.println("Goodbye, and have a wonderful day!");
                yesOrNo = "n";
            }
        }

    }

}
