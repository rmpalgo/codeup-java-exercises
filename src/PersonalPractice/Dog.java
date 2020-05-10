package PersonalPractice;

public class Dog {

    int size;
    String breed;
    String name;

    public Dog(String name, String breed, int size) {
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    public int getSize () {
        return this.size;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getName() {
        return this.name;
    }

    void bark() {
        if(getSize() >= 60) {
            System.out.println(getName() + " Bark! Bark!");
        } else if(getSize() > 14) {
            System.out.println(getName() + " Woof Woof");
        } else {
            System.out.println(getName() + " Yip Yip!");
        }

    }

}
