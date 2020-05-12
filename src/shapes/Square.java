package shapes;

public class Square extends Quadrilateral{

    public Square(int side) {
        super(side, side);
    }

    @Override
    protected void setLength(int side) {
        this.length = side;
    }

    @Override
    protected void setWidth(int side) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * super.width;
    }

    @Override
    public double getArea() {
        return Math.pow(super.width, 2);
    }

}
