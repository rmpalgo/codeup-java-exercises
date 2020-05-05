import java.util.Scanner;

public class StringExercise {

    public static void main(String args[]) {
        /*
        String stringWord = "We don't need no education";
        String newStringWord = stringWord.replace("education", "thought control");
        System.out.println(stringWord);
        System.out.println(newStringWord);
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

        if(question.lastIndexOf("?") != -1) {
            System.out.println("Sure.");
        } else if (question.lastIndexOf("!") != -1) {
            System.out.println("Whoa, chill out!");
        } else if (question.equals("")) {
            System.out.println("Fine. Be that Way!");
        } else  {
            System.out.println("Whatever.");
        }


    }

}
