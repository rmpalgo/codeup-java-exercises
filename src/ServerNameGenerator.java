import java.util.Scanner;

public class ServerNameGenerator {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a server name: ");
        String userInput = input.nextLine();
        System.out.println("randomWord(userInput) = " + randomWord(userInput));

    }



    private static String[] stringArr = {"cool", "bellicose", "calamitous", "sagacious", "tenacious", "omnipotent", "factotum", "ubiquitous", "obtuse", "spasmodic"};

    public static String randomWord(String input) {
        int randomIndex = new java.util.Random().nextInt(stringArr.length);
        return input + "-" + stringArr[randomIndex];
    }

}
