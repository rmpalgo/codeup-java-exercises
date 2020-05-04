import java.math.BigInteger;

public class ControlFlowExercises {

    public static void main(String args[]) {
        //While
        /*
        int i = 5;
        while( i <= 15 ) {
            System.out.printf("While loop iteration index: %s%n", i);
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

        for (int i = 1; i <= 100; i++ ) {
            if ( i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FizzBuzz");
            } else if ( i % 3 == 0) {
                System.out.println("Fizz");
            } else if ( i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.printf("%s%n", i);
            }
        }


    }

}
