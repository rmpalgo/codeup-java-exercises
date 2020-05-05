import java.util.Scanner;

public class MethodsLec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        lookForMoney(input);
//        System.out.println("shout('hello milo') = " + shout("hello milo"));
//        System.out.println("division(2, 2) = " + division(2, 2));
//        System.out.println("sum(5, 3) = " + sum(5, 3));
//        System.out.println("sayHello() = " + sayHello("RON"));

    }

    /*

    public static String sayHello() {
        return "Hello Ron";
    }
     */

    /*
    public static String sayHello(String name) {
        return "Hello " + name;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static String shout(String word ) {
        return word.toUpperCase();
    }

     */

    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }
    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name +  "!");
    }

    // that only loos for $
    public static void lookForMoney(Scanner scan) {
        System.out.println("Give me an amount:");
        String amount = scan.nextLine();
    }

}
