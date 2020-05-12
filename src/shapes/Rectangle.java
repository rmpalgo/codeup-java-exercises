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
        return 0;
    }

    @Override
    public double getArea() {
        System.out.println("getting Area from the Rectangle Class: ");
        return 0;
    }
//    protected int length;
//    protected int width;
//
//    public Rectangle(int aWidth, int aLength) {
//        this.width = aWidth;
//        this.length = aLength;
//    }
//
//    public int getArea() {
//        return this.length * this.width;
//    }
//
//    public int getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }

}
