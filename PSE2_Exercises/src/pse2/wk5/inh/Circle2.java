//Week 5 Circle2
package pse2.wk5.inh;

import java.text.DecimalFormat;

/**
 * This class is a representation of a circle
 * @author Peter Rosner
 * @version 1.0, October 2012
 */
public class Circle2 extends SimpleGeometricObject {

    /** The current radius */
    private int radius;

 
    /** The stored value of the inital radius */
    private int firstRadius;

    /** The stored value of the inital colour */
    private String firstColour;

    /** The constructor
     * sets up inital values for radius and colour and also stores initial values
     * @param radius the radius that the Circle2 will be initialised with
     * @param colour the colour that the Circle2 will be initialised with
     * @param filled whether the circle will be filled
     */
    public Circle2 (int radius, String colour, boolean filled){
        super(colour,filled);
        this.radius = radius;
        this.firstRadius = radius;
        this.firstColour = colour;
    }
   

    /**
     * sets a new radius for the circle
     * @param radius the new radius
     */
    public void setRadius(int radius){
        this.radius = radius;
    }


 /**
     * gets the width of the rectangle
     * @return the width, which is twice the radius, as int
     */
    public int getWidth(){
        return radius*2;
    }

    /**
     * gets the height of the rectangle
     * @return the height, which is twice the radius, as int
     */
    public int getHeight(){
        return radius*2;
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
        setColour(firstColour);
    }

    /**
     * generates a string showing the data for the circle
     * - the radius, the computed area and the colour
     * @return the data for the circle as a String
     */
    @Override
    public String toString(){
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        String area2D = twoDForm.format(this.getArea());
        /*
        String filledIndicator = "not filled";
        if (isFilled()){
            filledIndicator = "filled";
        }
        return ("Circle2(" + radius + ") " + area2D + " " + getColour()
                + " " + getDateCreated() + " " + filledIndicator);
         *
         */
        return ("(from Circle2) radius: " + radius
                + ", area: " + area2D + super.toString());
    }
}
