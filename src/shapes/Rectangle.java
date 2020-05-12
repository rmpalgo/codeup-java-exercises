package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int aLength, int aWidth) {
        super(aLength, aWidth);
    }


    @Override
    void setLength(int aLength) {
        System.out.println("setting length from the Rectangle Class: ");

    }

    @Override
    void setWidth(int aWidth) {
        System.out.println("setting width from the Rectangle Class: ");
    }

    @Override
    public double getPerimeter() {
        System.out.println("getting Perimeter from the Rectangle Class: ");
        return (2 * super.length) + (2 * super.width);
    }

    @Override
    public double getArea() {
        System.out.println("getting Area from the Rectangle Class: ");
        return super.length * super.width;
    }


}
