package shapes;

public class Square extends Quadrilateral{

    public Square(int side) {
        super(side, side);
    }

    @Override
    protected void setLength(int side) {
        System.out.println("setting Length from the Square Class: ");
        this.length = side;
    }

    @Override
    protected void setWidth(int side) {
        System.out.println("setting width from the Square Class: ");
        this.width = side;
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
