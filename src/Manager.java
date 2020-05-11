public class Manager extends Employee {

    public Manager(String fn, String ln, boolean isAlive) {
        super(fn, ln, isAlive);
    }

    @Override
    public void doWork() {
        System.out.println("Managing employees");
    }
}
