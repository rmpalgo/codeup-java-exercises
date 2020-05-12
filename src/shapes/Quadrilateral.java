package shapes;

public abstract class Quadrilateral extends Shapes implements Measurable {

    protected int length;
    protected int width;

    public Quadrilateral(int aLength, int aWidth) {
        this.length = aLength;
        this.width = aWidth;
    }

    public void setLength(int aLength) {
        this.length = aLength;
    }

    public int getLength() {
        return this.length;
    }

    public void setWidth(int aWidth) {
        this.width = aWidth;
    }

    public int getWidth() {
        return this.width;
    }

}
