import java.util.Scanner;

public class HighLow {

    public static void main(String args[]) {
        int guesses = 10;
        int randomNumber = new java.util.Random().nextInt(100) + 1;
        System.out.println("randomNumber = " + randomNumber);
        highLow(randomNumber, guesses);
    }

    public static void highLow(int randomNumber, int guesses) {
        System.out.println("You have " + guesses + " guesses left");
        guesses = guesses - 1;
        if(guesses < 1) {
            System.out.println("Game over.");
            return;
        }
        Scanner myScanner = new Scanner(System.in);
        int input;
        System.out.println("Guess a number between 1 and 100.");
        input = myScanner.nextInt();
        myScanner.nextLine();
        if(input > randomNumber) {
            System.out.println("LOWER");
            highLow(randomNumber, guesses);
        } else if(input < randomNumber) {
            System.out.println("HIGHER");
            highLow(randomNumber, guesses);
        } else {
            System.out.println("GOOD GUESS");
        }
    }

}
