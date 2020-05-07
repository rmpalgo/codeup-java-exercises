public class Person {

    private String name;

    public static void main(String[] args){
        Person ron = new Person("Ron");
        System.out.println("ron.getName() = " + ron.getName());
        ron.setName("RonPalencia");
        ron.sayHello();
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    };


    public void setName(String name) {
        this.name = name;
    };

    public void sayHello() {
        System.out.println("My name is :" + name);
    }

}
