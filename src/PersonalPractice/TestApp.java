package PersonalPractice;

public class TestApp {

    public static void main(String[] args) {
        Dog d1 = new Dog("Milo", "Cattle Dog", 40);
        System.out.println(d1.getName());
        System.out.println(d1.getBreed());
        System.out.println(d1.getSize());
        d1.bark();

        Dog d2 = new Dog("Mia", "Lab", 60);
        System.out.println(d2.getName());
        System.out.println(d2.getBreed());
        System.out.println(d2.getSize());
        d2.bark();

        Dog d3 = new Dog("Lucy", "Arctic Fox", 58);
        System.out.println(d3.getName());
        System.out.println(d3.getBreed());
        System.out.println(d3.getSize());
        d3.bark();

        Dog[] pets;
        pets = new Dog[7];
        int[] nums = new int[5];
        String[] words = new String[5];
        boolean[] truths = new boolean[4];

//        pets[0] = new Dog("Dog1", "Breed1", 1);
        pets[1] = new Dog("Dog2", "Breed2", 2);
        pets[2] = new Dog("Dog2", "Breed2", 3);
        pets[3] = new Dog("Dog2", "Breed2", 4);
        pets[4] = new Dog("Dog2", "Breed2", 5);
        pets[5] = new Dog("Dog2", "Breed2", 6);
        pets[6] = new Dog("Dog2", "Breed2", 7);

        System.out.println(pets[0]);
        System.out.println(nums[0]);
        System.out.println(words[0]);
        System.out.println(truths[0]);


    }

}
