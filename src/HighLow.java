import java.util.Scanner;

public class HighLow {

    public static void main(String args[]) {
        int randomNumber = new java.util.Random().nextInt(100) + 1;
        System.out.println("randomNumber = " + randomNumber);
        highLow(randomNumber);
    }

    public static void highLow(int randomNumber) {
        Scanner myScanner = new Scanner(System.in);
        int input;
        System.out.println("Guess a number between 1 and 100.");
        input = myScanner.nextInt();
        myScanner.nextLine();
        if(input > randomNumber) {
            System.out.println("LOWER");
            highLow(randomNumber);
        } else if(input < randomNumber) {
            System.out.println("HIGHER");
            highLow(randomNumber);
        } else if(input == randomNumber) {
            System.out.println("GOOD GUESS");
        }
    }

}
