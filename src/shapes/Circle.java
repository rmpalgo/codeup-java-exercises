package shapes;

public class Circle {

    private double radius;
    static private int count = 0;


    public Circle(double rad) {
        this.radius = rad;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public double getArea() {
        return Math.PI * ( Math.pow(this.radius, 2) );
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

}
