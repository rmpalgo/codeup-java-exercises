import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String args[]) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %,.2f.%n", pi);
        System.out.println("Enter a whole number.");
        Scanner scanner = new Scanner(System.in);

        int wholeNumber = scanner.nextInt();
        System.out.printf("The value of number being enter in the terminal is: %d%n", wholeNumber);





    }

}
