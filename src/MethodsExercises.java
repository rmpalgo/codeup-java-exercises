public class MethodsExercises {

    public static void main(String args[]) {
        System.out.println("HELLO THERE!");
        System.out.println("add(5, 5) = " + add(5, 5));
        System.out.println("subtract(10, 5) = " + subtract(10, 5));
        System.out.println("multiply(2, 2) = " + multiply(2, 2));
        System.out.println("divide(10, 5) = " + divide(10, 5));

    }

    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    public static long subtract(long num1, long num2) {
        return num1 - num2;
    }

    public static long multiply(long num1, long num2) {
        return num1 * num2;
    }

    public static long divide(long num1, long num2) {
        return num1 / num2;
    }

    public static long modulus(long num1, long num2) {
        return num1 % num2;
    }




}
