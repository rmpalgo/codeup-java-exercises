import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ask BOB a question: ");
        String question = scan.nextLine().trim();

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
