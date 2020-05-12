package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape;
        Measurable myShape2;

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        //cannot use getLength and getWidth because it is only for Quadrilateral and
        // we are type Measurable
        /*
        myShape.getLength();
        myShape.getWidth();
         */

        myShape2 = new Rectangle(3, 2);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());

    }

}
