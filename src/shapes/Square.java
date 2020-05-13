package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    @Override
    protected void setLength(double aLength) {
        System.out.println("setting Length from the Square Class: ");
        this.length = aLength;
        this.width = aLength;
    }

    @Override
    protected void setWidth(double aWidth) {
        System.out.println("setting width from the Square Class: ");
        setLength(aWidth);
    }

    @Override
    public double getPerimeter() {
        System.out.println("getting Perimeter from the Square Class: ");
        return 4 * super.width;
    }

    @Override
    public double getArea() {
        System.out.println("getting Area from the Square Class: ");
        return Math.pow(super.width, 2);
    }

}
