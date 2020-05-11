public class Employee extends Person{

    private double salary;

    public Employee(String fn, String ln, boolean isAlive) {
        //super reference the constructor from Person
        super(fn, ln, isAlive);
    }

    public void doWork() {
        System.out.println("Work, work...");
    }

    @Override
    public String sayHello() {
        return "How can I help you?";
    }
}
