package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student (String aName) {
        this.name = aName;
        this.grades = new ArrayList<>();
    }

}
