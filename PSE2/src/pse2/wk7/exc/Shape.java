// Week 7 Shape
package pse2.wk7.exc;

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
     * @return the area of the Shape
     */
    public double getArea();
    /**
     *
     * @return the width of the Shape
     */
    public int getWidth();
    /**
     *
     * @return the height of the Shape
     */
    public int getHeight();

    /**
     *
     * @return String giving type of shape e.g. Rectangle, Circle, Square
     */
    public String getTypeOfShape();

}
