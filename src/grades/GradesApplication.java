package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student  shaggy = new Student("Shaggy");
        shaggy.addGrade(60);
        shaggy.addGrade(67);
        shaggy.addGrade(75);

        Student fred = new Student("Fred");
        fred.addGrade(79);
        fred.addGrade(85);
        fred.addGrade(87);

        Student velma = new Student("Velma");
        velma.addGrade(96);
        velma.addGrade(99);
        velma.addGrade(100);
    }

}
