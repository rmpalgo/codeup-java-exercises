public class MethodsLec {

    public static void main(String[] args) {
        System.out.println("shout('hello milo') = " + shout("hello milo"));
        System.out.println("division(2, 2) = " + division(2, 2));
        System.out.println("sum(5, 3) = " + sum(5, 3));
        System.out.println("sayHello() = " + sayHello("RON"));

    }

    /*
    public static String sayHello() {
        return "Hello Ron";
    }
     */

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




}
