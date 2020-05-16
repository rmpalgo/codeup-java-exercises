package PersonalPractice;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;

        do {
            try {
                System.out.println("Enter first num: ");
                int n1 = Integer.parseInt(input.nextLine());
                System.out.println("Enter second num: ");
                int n2 = Integer.parseInt(input.nextLine());
                int sum = n1 / n2;
                System.out.println(sum);
                x = 2;
            } catch (Exception e) {
                System.out.println("Input invalid");
            }
        } while (x == 1);

    }
}
