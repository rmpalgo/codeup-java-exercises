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

        for(int i = 0; i < people.length; i++){
            people[i].sayHello();
        }

        personArray = addPerson(people, "Mia");

        for(Person person : personArray) {
            System.out.println(person.getName());
        }

//        System.out.println("addPerson(people, \"Mia\") = " + Arrays.toString(addPerson(people, "Mia")));

    }
    private static Person person1 = new Person("ron");
    private static Person person2 = new Person("jackie");
    private static Person person3 = new Person("milo");

   private static Person[] people = {person1, person2, person3};




    public static Person[] addPerson( Person [] people, String person ) {
//        Person[] newPeopleArray = new Person[people.length + 1];
        Person[] addedArray = Arrays.copyOf(people, people.length + 1);
        addedArray[addedArray.length - 1] = new Person (person);
        return addedArray;
    }


}
