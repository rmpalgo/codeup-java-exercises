public class Person {

    private String name;

    public static void main(String[] args){
//        Person ron = new Person("Ron");
//        System.out.println("ron.getName() = " + ron.getName());
//        ron.setName("RonPalencia");
//        ron.sayHello();

/*
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person1 == person2);
 */


        /*
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
         */

         /*
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        */

    }

    public Person(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("My name is :" + this.getName());
    }


}
