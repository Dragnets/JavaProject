//Week 6 Circle
package pse2.wk6.iface;

import java.text.DecimalFormat;

/**
 * This class is a representation of a circle
 * @author Peter Rosner
 * @version 1.2, October 2012
 * now implements Shape
 */
public class Circle extends SimpleGeometricObject implements Shape {

    /** The current radius */
    private int radius;

 
    /** The stored value of the inital radius */
    private int firstRadius;

    /** The stored value of the inital colour */
    private String firstColour;

    /** The constructor
     * sets up inital values for radius and colour and also stores initial values
     * @param radius the radius that the Circle will be initialised with
     * @param colour the colour that the Circle will be initialised with
     * @param filled whether the circle will be filled
     */
    public Circle (int radius, String colour, boolean filled){
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
     * gets the width of the circle
     * @return the width, which is twice the radius
     */
    public int getWidth(){
        return radius*2;
    }

    /**
     * gets the height of the circle
     * @return the height, which is twice the radius
     */
    public int getHeight(){
        return radius*2;
    }

    /**
     * gets the area of the circle given its current radius
     * @return the area 
     */
    public double getArea() {
        return Math.PI*radius*radius;
    }


   /**
    * gets the type of Shape
    * @return the String "Circle"
    */
    public String getTypeOfShape(){
       return "Circle";
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
     * @return the concatenated data for the circle
     */
    @Override
    public String toString(){
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        String area2D = twoDForm.format(this.getArea());
        return ("Circle: radius: " + radius
                + ", area: " + area2D + super.toString());
    }

}
