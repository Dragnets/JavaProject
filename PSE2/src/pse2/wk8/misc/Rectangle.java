//Week 8 Rectangle
package pse2.wk8.misc;

/**
 *
 * @author Peter Rosner
 * @Version 1.1, November 2012
 * colour is now based on Colour,
 * also border thickness added
 */
public class Rectangle extends SimpleGeometricObject implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height, Colour colour, boolean filled, int thickness)
            throws ShapeException {
        super(colour, filled, thickness);
        this.width = width;
        this.height = height;

    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public String getTypeOfShape() {
        return "Rectangle";
    }

    public String toString() {
        return "Rectangle: width: " + this.width + " ,height: " + this.height
                + " ,area: " + this.getArea() + " " + super.toString();
    }
}
