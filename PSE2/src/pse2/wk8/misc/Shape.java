// Week 7 Shape
package pse2.wk8.misc;

/**
 *
 * @author Peter Rosner
 * @version 1.0
 * Provides a contract for
 * concrete classes such as Rectangle, Circle, Square
 */
public interface Shape {
    /**
     *
     * @return the area of the Shape as double
     */
    public double getArea();
    /**
     *
     * @return the width of the Shape as int
     */
    public int getWidth();
    /**
     *
     * @return the height of the Shape as int
     */
    public int getHeight();

    /**
     *
     * @return String giving type of shape e.g. Rectangle, Circle, Square
     */
    public String getTypeOfShape();

}
