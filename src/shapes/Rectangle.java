package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double aLength, double aWidth) {
        super(aLength, aWidth);
    }


    @Override
    void setLength(double aLength) {
        System.out.println("setting length from the Rectangle Class: ");
        this.length = aLength;

    }

    @Override
    void setWidth(double aWidth) {
        System.out.println("setting width from the Rectangle Class: ");
        this.width = aWidth;
    }

    @Override
    public double getPerimeter() {
        //if you don't write any body here the code will fail because it's part of
        // interface and is required
        System.out.println("getting Perimeter from the Rectangle Class: ");
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        System.out.println("getting Area from the Rectangle Class: ");
        return this.length * this.width;
    }


}
