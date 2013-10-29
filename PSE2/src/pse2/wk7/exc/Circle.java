//Week 7 Circle
package pse2.wk7.exc;

import java.text.DecimalFormat;

/**
 * This class is a representation of a circle
 * @author Peter Rosner
 * @version 1.3, November 2012
 * now throws ShapeException
 */
public class Circle extends SimpleGeometricObject implements Shape {

    /** The current radius */
    private int radius;
    /** The stored value of the inital radius */
    private int firstRadius;
    /** The stored value of the inital colour */
    private String firstColour;

    /** The constructor
     * sets up inital values for radius and colour, stores initial values
     * @param radius the radius that the Circle will be initialised with
     * @param colour the colour that the Circle will be initialised with
     * @param filled whether the circle will be filled
     * @throws ShapeException if radius less than 0
     */
    public Circle(int radius, String colour, boolean filled)
            throws ShapeException {
        super(colour, filled);
        checkRadius(radius);
        this.radius = radius;
        this.firstRadius = radius;
        this.firstColour = colour;
    }

    /**
     * sets a new radius for the circle
     * @param radius the new radius
     * @throws ShapeException if radius less than 0
     */
    public void setRadius(int radius) throws ShapeException {
        checkRadius(radius);
        this.radius = radius;
    }

    /**
     * gets the width of the rectangle
     * @return the width, which is twice the radius, as int
     */
    public int getWidth() {
        return radius * 2;
    }

    /**
     * Check if radius >= 0
     * @param radius to be checked
     * @throws ShapeException if radius < 0
     */

    private void checkRadius(int radius) throws ShapeException {
        if (radius < 0 ) {
            throw new ShapeException("radius = " + radius +
                    " - must not be less than 0");
        }
    }

    /**
     * gets the height of the rectangle
     * @return the height, which is twice the radius, as int
     */
    public int getHeight() {
        return radius * 2;
    }

    /**
     * gets the area of the circle given its current radius
     * @return the area as a double
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * gets the type of Shape
     * @return the string "Circle"
     */
    public String getTypeOfShape() {
        return "Circle";
    }

    /**
     * resets the current radius and colour to the initial versions
     * when the circle was constructed
     */
    public void reset() {
        radius = firstRadius;
        setColour(firstColour);
    }

    /**
     * generates a string showing the data for the circle
     * - the radius, the computed area and the colour
     * @return the data for the circle as a String
     */
    @Override
    public String toString() {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        String area2D = twoDForm.format(this.getArea());
        return ("Circle: radius: " + radius
                + ", area: " + area2D + super.toString());
    }
}
