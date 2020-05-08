import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] personArray = new Person[3];
        Person bruce = new Person("Bruce");
        Person jackie = new Person("Jackie");
        Person jet = new Person("Jet");
        personArray[0] = bruce;
        personArray[1] = jackie;
        personArray[2] = jet;


    }

}
