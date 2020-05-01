import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String args[]) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %,.2f.%n", pi);
        System.out.println("Enter a whole number.");
        Scanner scanner = new Scanner(System.in);

        int wholeNumber = scanner.nextInt();
        System.out.printf("The value of number being enter in the terminal is: %d%n", wholeNumber);

        Scanner scanThreeWords = new Scanner(System.in);
        System.out.print("Line 1: ");
        String word1 = scanThreeWords.nextLine();
        System.out.print("Line 2: ");
        String word2 = scanThreeWords.nextLine();
        System.out.print("Line 3: ");
        String word3 = scanThreeWords.nextLine();

        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);




    }

}
