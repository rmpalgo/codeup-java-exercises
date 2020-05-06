import java.util.Scanner;

public class MethodsExercises {

    public static void main(String args[]) {
//        System.out.println("HELLO THERE!");
//        System.out.println("add(5, 5) = " + add(5, 5));
//        System.out.println("subtract(10, 5) = " + subtract(10, 5));
//        System.out.println("multiply(2, 2) = " + multiply(2, 2));
//        System.out.println("divide(10, 5) = " + divide(10, 5));
//        System.out.println("modulus(10, 2) = " + modulus(10, 2));
//        System.out.println("multiplyLoop(10, 5) = " + multiplyLoop(10, 5));
//        countdownRecursion(5);
//        multiplyRecursion(5, 2);
//        askNumber();
          rollDice();
    }

    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    public static long subtract(long num1, long num2) {
        return num1 - num2;
    }

    public static long multiply(long num1, long num2) {
        return num1 * num2;
    }

    public static long divide(long num1, long num2) {
        return num1 / num2;
    }

    public static long modulus(long num1, long num2) {
        return num1 % num2;
    }

    public static long multiplyLoop(long num1, long num2) {
        long result = 0;
        for(long index = 0; index < num2; index++ ) {
            result += num1;
        }
        return result;
    }

    public static void countdownRecursion(int n){
        System.out.println("recursion = " + n);
        // how to stop
        if(n < 1){
            return;
        }
        // how to proceed
        n = n - 1;
        // how to try again with new data
        countdownRecursion(n);
    }


    public static void multiplyRecursion(long num1, long num2) {

        long result = 0;
        if(num2 == 0) {
            System.out.println("Recursion multiplication: " + num1);
            return;
        }
            result += num1;
            num2 = num2 - 1;
            multiplyRecursion(result, num2);


    }




    public static int validateInteger(int min, int max) {
        Scanner myScanner = new Scanner(System.in).useDelimiter(" ");
        int input = myScanner.nextInt();
        if(input >= min && input <= max) {
            System.out.println(("Valid"));
            return input;
        }
        System.out.println("Invalid, try again!");
        return validateInteger(1, 10);
    }


public static void askNumber() {
    Scanner myScanner = new Scanner(System.in);
    System.out.println(("Please enter a number between 1 and 10"));
    int input = myScanner.nextInt();
    myScanner.nextLine();
    long fact = input;

    for(int i = 1; i < input; i++) {
        fact = fact * i;
    }
    System.out.println(input + "! = " + fact);
    System.out.println("Do you want to continue? Y/N");
    String userContinue = myScanner.next();
    if(userContinue.equalsIgnoreCase("y")) {
        askNumber();
    } else {
        System.out.println("Ok, goodbye!");
    }
}

public static void rollDice() {
   int diceResult = 0;
   Scanner myScanner = new Scanner(System.in);
   System.out.println("How many sides does your dice have?");
   int sides = myScanner.nextInt();
   myScanner.nextLine();
   System.out.println("Roll the Dice? Y/N");
   String roll = myScanner.next();
   myScanner.nextLine();
   if(roll.equalsIgnoreCase("y")){
        diceResult = new java.util.Random().nextInt(sides) + 1;
   }
   System.out.println("The dice with " + sides + " was rolled and the result is: " + diceResult);
   System.out.println("Would you like to play again? Y/N");
   String playAgain = myScanner.next();
   if(playAgain.equalsIgnoreCase("y")) {
       rollDice();
   }
    System.out.println(("Ok, goodbye!"));
}





}
