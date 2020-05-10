import java.util.Scanner;

public class ServerNameGenerator {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Server Name: ");
        System.out.println(randomWord());


    }

    private static String[] stringAdj = {"cool", "bellicose", "calamitous", "sagacious", "tenacious", "omnipotent", "factotum", "ubiquitous", "obtuse", "spasmodic"};
    private static String[] stringNoun = {"deny", "profound", "scan", "round", "employ", "measure", "chauvinist", "lodge", "restaurant", "preach"};

    public static String randomWord() {
        int randomIndex1 = new java.util.Random().nextInt(stringAdj.length);
        int randomIndex2 = new java.util.Random().nextInt(stringNoun.length);
        return stringNoun[randomIndex1] + "-" + stringAdj[randomIndex2];
    }

}
