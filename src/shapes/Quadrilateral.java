package shapes;

public abstract class Quadrilateral extends Shapes implements Measurable {

    protected int length;
    protected int width;

    public Quadrilateral(int aLength, int aWidth) {
        this.length = aLength;
        this.width = aWidth;
    }

    abstract void setLength(int aLength);

    public int getLength() {
        return this.length;
    }

    abstract void setWidth(int aWidth);

    public int getWidth() {
        return this.width;
    }



}
