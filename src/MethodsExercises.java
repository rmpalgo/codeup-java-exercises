import java.util.Scanner;

public class MethodsExercises {

    public static void main(String args[]) {
//        System.out.println("HELLO THERE!");
//        System.out.println( 2 == add(1,1));
//        System.out.println("add(5, 5) = " + add(5, 5));
//
//        System.out.println( 4 == subtract(5, 1));
//        System.out.println("subtract(10, 5) = " + subtract(10, 5));
//
//        System.out.println( 10 == multiply(5, 2));
//        System.out.println("multiply(2, 2) = " + multiply(2, 2));
//
//        System.out.println( 10 == divide(100, 10));
//        System.out.println("divide(5, 0) = " + divide(5, 0));
//        System.out.println("divide(10, 5) = " + divide(10, 5));
//
//        System.out.println( 1 == modulus(9, 2));
//        System.out.println("modulus(10, 2) = " + modulus(10, 2));
//        validateInteger(1, 10);
//        System.out.println("multiplyLoop(10, 5) = " + multiplyLoop(10, 5));
//        countdownRecursion(5);
//        multiplyRecursion(5, 2);
//        askNumber();
          rollDice();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if(num2 == 0) {
            System.out.println("You cannot divide by zero.");
            return 0;
        }
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static double multiplyLoop(double num1, double num2) {
        long result = 0;
        for(long index = 0; index < num2; index++ ) {
            result += num1;
        }
        return result;
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
        System.out.println("Enter number: ");
        Scanner myScanner = new Scanner(System.in);
        int input = myScanner.nextInt();
        if(input >= min && input <= max) {
            System.out.println(("Valid"));
            return input;
        } else {
            System.out.println("Invalid, try again!");
            return validateInteger(min, max);
        }

    }


public static void askNumber() {
    Scanner myScanner = new Scanner(System.in);
    System.out.println(("Please enter a number between 1 and 10"));
    int input = validateInteger(1, 10);
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
   int diceResult1 = 0;
   int diceResult2 = 0;
   Scanner myScanner = new Scanner(System.in);
   System.out.println("How many sides does your dice have?");
   int sides = myScanner.nextInt();
   myScanner.nextLine();
   System.out.println("Roll the Dice? Y/N");
   String roll = myScanner.next();
   myScanner.nextLine();
   if(roll.equalsIgnoreCase("y")){
        diceResult1 = new java.util.Random().nextInt(sides) + 1;
        diceResult2 = new java.util.Random().nextInt(sides) + 1;
   }
   System.out.println("The dice with " + sides + " was rolled and the result is: " + diceResult1 + " and " + diceResult2);
   System.out.println("Would you like to play again? Y/N");
   String playAgain = myScanner.next();
   if(playAgain.equalsIgnoreCase("y")) {
       rollDice();
   }
    System.out.println(("Ok, goodbye!"));
}





}
