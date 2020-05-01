import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String args[]) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %,.2f.%n", pi);
//        System.out.println("Enter a whole number.");
//        Scanner scanner = new Scanner(System.in);
//
//        int wholeNumber = scanner.nextInt();
//        System.out.printf("The value of number being enter in the terminal is: %d%n", wholeNumber);

        Scanner newScan = new Scanner(System.in);
//        System.out.printf("Line 1: %n");
//        String word1 = newScan.next();
//        System.out.printf("Line 2: %n");
//        String word2 = newScan.nextLine();
//        System.out.printf("Line 3: %n");
//        String word3 = newScan.nextLine();
//
//        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);
//        System.out.printf("==============%n");
//
//        System.out.printf("Enter a sentence: %n");
//        String sentence = newScan.nextLine();
//        System.out.printf("Sentence: %s%n", sentence);

        // Calculate the perimeter and area of Codeup's classrooms

        System.out.print("Width: \n");
        float width = Float.parseFloat(newScan.nextLine());
        System.out.print("Length: \n");
        float length = Float.parseFloat(newScan.nextLine());
        float area = width * length;
        float perimeter = (width * 2) + (length * 2);
        System.out.printf("Area: %f%n", area);
        System.out.printf("Perimeter: %f%n", perimeter);













    }

}
