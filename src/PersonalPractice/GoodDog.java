package PersonalPractice;

public class GoodDog {

    private int size;

    public GoodDog(int aSize) {
        this.size = aSize;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int num) {
        this.size = num;
    }

    void bark() {
        if(size > 60) {
            System.out.println("WOOF! WOOF");
        } else if(size > 14) {
            System.out.println("Ruff! Ruff!");
         } else {
            System.out.println("Yip! Yip!");
        }
    }

    public static void main(String[] args) {
        GoodDog dog1 = new GoodDog(40);
        System.out.print("Dog 1 says: ");
        dog1.bark();

        GoodDog dog2 = new GoodDog(12);
        System.out.print("Dog 2 says: ");
        dog2.bark();

        GoodDog dog3 = new GoodDog(65);
        System.out.print("Dog 3 says: ");
        dog3.bark();

    }

}
