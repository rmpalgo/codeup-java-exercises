import java.util.Scanner;

public class StringExercise {

    public static void main(String args[]) {

        /*
        String stringWord = "We don't need no education \nWe don't need no thought control";
        System.out.println(stringWord);
         */


        /*
        String word = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(word);
         */

        /*
        String word = "In windows, the main drive is usually C:\\";
        System.out.println(word);
         */

        /*
        String word = "I can do backlashes \\, double backlashes \\\\, \n and the amazing triple backlashes \\\\\\";
        System.out.println(word);
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Ask BOB a question: ");
        String question = scan.nextLine();

        if(question.endsWith("?")) {
            System.out.println("Sure.");
        } else if (question.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (question.equals("")) {
            System.out.println("Fine. Be that Way!");
        } else  {
            System.out.println("Whatever.");
        }



    }

}
