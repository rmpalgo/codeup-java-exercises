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

    public int getInt(int min, int max) {
        int input = scanner.nextInt();
        if(input >= min && input <= max) {
            return input;
        }
        System.out.println("Invalid.");
        return getInt(min, max);
    }

    public double getDouble(double min, double max) {
        double input = scanner.nextDouble();
        if(input >= min && input <= max) {
            return input;
        }
        System.out.println("Invalid");
        return getDouble(min, max);
    }

}

