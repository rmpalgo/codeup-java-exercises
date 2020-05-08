package shapes;

public class Circle {

    private double radius;

    public Circle(double rad) {
        this.radius = rad;
    }

    public double getArea() {
        return Math.PI * ( Math.pow(this.radius, 2) );
    }

}
