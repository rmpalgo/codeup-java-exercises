package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student (String aName) {
        this.name = aName;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for(Integer grade: grades) {
            total += grade;
        }
        return total/grades.size();
    }

    public static void main(String[] args) {
        Student ron = new Student("Ron");
        System.out.print(ron.getName());
        ron.addGrade(70);
        ron.addGrade(74);
        ron.addGrade(82);
        ron.addGrade(92);
        ron.addGrade(93);
        ron.addGrade(99);
        System.out.println("ron.getGradeAverage() = " + ron.getGradeAverage());
    }

}
