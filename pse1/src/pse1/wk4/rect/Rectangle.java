//Week 4 Rectangle
package pse1.wk4.rect;

/**
 *
 * @author Peter Rosner
 */
public class Rectangle {
    private int width;
    private int height;
    private String colour;

    public Rectangle(int width, int height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public String getColour() {
        return this.colour;
    }

    public int getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString(){
        return (this.width + ", " + this.height + ", " + this.getArea() + ", "
                + this.getColour());
    }

}
