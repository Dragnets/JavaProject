//Week 4 RectangleCounter
package pse1.wk4.rect;

/**
 *
 * @author Peter Rosner
 */
public class RectangleCounter {
    private int count = 0;
    private int area = 0;

    public RectangleCounter(){
    }

    public void add(Rectangle rectangle) {
        this.count++;
        this.area += rectangle.getArea();
    }

    public String displayString(){
        return ("count = " + this.count + " and total area = "
                + this.area);
    }

    public void reset() {
        this.area = 0;
        this.count = 0;
    }

}
