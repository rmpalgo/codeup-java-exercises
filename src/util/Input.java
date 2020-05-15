package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.getString("Type something: ");
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println(" Select Y/N?");
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("y") ? true: false;
    }

    public int getInt(int min, int max) {
        System.out.println("Give me a number between: " + min + " and\t" + max);
        int input;
        try {
            input = Integer.parseInt(this.getString());
        } catch(NumberFormatException e) {
            System.out.println("This string input is invalid.");
            return getInt(min, max);
        }
        if(input >= min && input <= max) {
            return input;
        }
        System.out.println("Invalid. Out of range.");
        return getInt(min, max);
    }

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
        String input = getString();
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getInt();
        }
    }

    public int getInt(String x) {
        System.out.println("input: " + x);
        try {
            return Integer.valueOf(x);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        System.out.println("Give me a number between: " + min + " and\t" + max);
        String input;
        try {
            input = getString();
            if(Double.parseDouble(input) >= min && Double.parseDouble(input) <= max) {
                return Double.valueOf(input);
            }
        } catch(NumberFormatException e) {
            System.out.println("Invalid input.");
            return getDouble(min, max);
        }
        return Double.valueOf(input);
    }

    public double getDouble() {
        System.out.println("Input: ");
        String input = getString();
        try{
            return Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getDouble();
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        String input = getString();
        try{
            return Double.valueOf(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getDouble();
        }
    }

}

