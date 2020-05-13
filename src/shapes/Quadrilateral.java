package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double aLength, double aWidth) {
        this.length = aLength;
        this.width = aWidth;
    }

    abstract void setLength(double aLength);

    public double getLength() {
        return this.length;
    }

    abstract void setWidth(double aWidth);

    public double getWidth() {
        return this.width;
    }



}
