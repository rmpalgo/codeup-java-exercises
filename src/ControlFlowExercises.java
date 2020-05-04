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
        int counter = 0;
        do {
            System.out.printf("Counting %s%n", counter);
            counter +=2;
        } while(counter <= 100);

    }

}
