package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.next();
        return input.contains("yes");
    }

//    public int getInt(int min, int max) {
//        int input = scanner.nextInt();
//        if(input >= min && input <= max) {
//            return input;
//        }
//        System.out.println("Invalid.");
//        return getInt(min, max);
//    }

    public int getInt(int min, int max, String prompt) {
        System.out.println("String " + prompt);
        System.out.println("Parsed " + Integer.parseInt(prompt));
        if(Integer.parseInt(prompt) >= min && Integer.parseInt(prompt) <= max ) {
            return Integer.parseInt(prompt);
        }
        System.out.println("Invalid.");
        return getInt(min, max, prompt);
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(String x) {
        System.out.println(x);
        return Integer.parseInt(x);
    }

    public double getDouble(double min, double max) {
        double input = scanner.nextDouble();
        if(input >= min && input <= max) {
            return input;
        }
        System.out.println("Invalid");
        return getDouble(min, max);
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

}

