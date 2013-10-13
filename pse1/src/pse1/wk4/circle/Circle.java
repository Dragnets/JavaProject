//Week 4 Circle
package pse1.wk4.circle;

import java.text.DecimalFormat;

/**
 * This class is a representation of a circle
 * @author Peter Rosner
 * @version 1.0, October 2012
 */
public class Circle  {

    /** The current radius */
    private int radius;

    /** The current colour */
    private String colour;

    /** The stored value of the initial radius */
    private int firstRadius;

    /** The stored value of the initial colour */
    private String firstColour;

    /** The constructor
     * sets up inital values for radius and colour and also stores initial values
     * @param radius the radius that the Circle will be initialised with
     * @param colour the colour that the Circle will be initialised with
     */
    public Circle (int radius, String colour){
        this.radius = radius;
        this.colour = colour;
        this.firstRadius = radius;
        this.firstColour = colour;
    }
    
    /**
     * gets the current radius of the circle
     * @return the radius as an int
     */
    public int getRadius(){
        return radius;
    }

    /**
     * sets a new radius for the circle
     * @param radius the new radius
     */
    public void setRadius(int radius){
        this.radius = radius;
    }



    /**
     * gets the current colour of the circle
     * @return the colour as a String
     */
    public String getColour(){
        return colour;
    }

    /**
     * sets a new colour for the circle
     * @param colour the new colour
     */
    public void setColour(String colour){
        this.colour = colour;
    }


    /**
     * gets the area of the circle given its current radius
     * @return the area as a double
     */
    public double getArea() {
        return Math.PI*radius*radius;
    }

    /**
     * resets the current radius and colour to the initial versions when the circle
     * was constructed
     */
    public void reset() {
        radius = firstRadius;
        colour = firstColour;
    }

    /**
     * generates a string of showing the data for the circle
     * - the radius, the computed area and the colour
     * @return the data for the circle as a String
     */
    @Override
    public String toString(){
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        String area2D = twoDForm.format(this.getArea());
        return ("Circle(" + radius + ") " + area2D + " " + colour );
    }
}
