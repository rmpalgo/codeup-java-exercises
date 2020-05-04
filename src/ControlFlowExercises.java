import java.math.BigInteger;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String args[]) {
        //While
        /*
        int i = 5;
        while( i <= 15 ) {
            System.out.printf("%s ", i);
            i++;
        }
         */


        //Do While
        /*
        int counter = 100;
        do {
            System.out.printf("Counting %s%n", counter);
            counter -= 5;
        } while(counter >= -10);
         */
        /*
        long counter = 2;
        do {
            System.out.printf("%s%n", counter);
            counter = counter * counter;
        } while (counter < 1000000);
        */

        /*
        for (int i = 5; i <= 15; i++) {
            System.out.printf("%s%n", i);
        }
         */

        /*
        for (int i = 0; i <= 100; i+=2) {
            System.out.printf("%s%n", i);
        }
         */

        /*
        for (int i = 100; i >= -10; i-=5) {
            System.out.printf("%s%n", i);
        }
         */

        /*
        for( long i = 2; i < 1000000; i *= i) {
            System.out.printf("%s%n", i);
        }
         */

        /*
        for (int i = 1; i <= 100; i++ ) {
            if ( i % 15 == 0 ) {
                System.out.println("FizzBuzz");
            } else if ( i % 3 == 0) {
                System.out.println("Fizz");
            } else if ( i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.printf("%s%n", i);
            }
        }
         */


        Scanner scan = new Scanner(System.in);

        boolean userContinues = true;

        do {
            System.out.println("What number would you like to go up to? ");
            int numberInput = scan.nextInt();
            System.out.println();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println(" number | squared | cubed");
            System.out.println(" ------ | ------- | ------");
            for (int num = 1; num <= numberInput; num++) {
                System.out.printf(" %-6s", num);
                System.out.print(" | ");
                System.out.printf(" %-6s", num*num);
                System.out.print(" | ");
                System.out.print(num*num*num);
                System.out.println();
                }
            System.out.print("Would you like to continue: y/n?");
            String userResponse = scan.next();
            if(!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while(userContinues);



//        Scanner scan = new Scanner(System.in);
//        String answer = "";
//        do {
//            System.out.println("Enter a grade:");
//            int grade = scan.nextInt();
//
//            if( grade > 0 && grade < 59 ) {
//                System.out.println("F");
//            } else if (grade > 59 && grade < 67 ){
//                if (grade >= 66) {
//                    System.out.println("D+");
//                } else {
//                    System.out.println("D");
//                }
//            } else if (grade > 66 && grade < 80 ){
//                if (grade >= 79) {
//                    System.out.println("C+");
//                } else {
//                    System.out.println("C");
//                }
//            } else if (grade > 79 && grade < 88 ){
//                if(grade >= 87) {
//                    System.out.println("B+")  ;
//                } else {
//                    System.out.println("B");
//                }
//            } else if (grade > 87 && grade < 101 ){
//                if( grade >= 98) {
//                    System.out.println("A+");
//                } else {
//                    System.out.println("A");
//                }
//            }
//            System.out.println("Would you like to enter a grade Y/N?");
//            answer = scan.next();
//        } while ( answer.equals("y") );
//



    }

}
