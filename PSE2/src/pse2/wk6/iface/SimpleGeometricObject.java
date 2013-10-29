//Week 6 SimpleGeometricObject
package pse2.wk6.iface;

/**
 *
 * @author Peter Rosner,
 * @Version 1.1
 * based on example in Daniel Liang book
 * now made abstract
 */
public abstract class SimpleGeometricObject {
    /**
     * The colour of the geometric object
     */
    private String colour = "white";
    /**
     * Whether or not it is filled
     */
    private boolean filled;
    /**
     * The date it was created
     */
    private java.util.Date dateCreated;

    /**
     * Constructor for default geometric object
     **/
    public SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with the specified colour
     * and filled value
     * @param colour the colour of the object
     * @param filled whether or not it is filled
     */
    public SimpleGeometricObject(String colour, boolean filled){
        dateCreated = new java.util.Date();
        this.colour = colour;
        this.filled = filled;
    }

    /**
     * get the colour
     * @return the colour as String
     */
    public String getColour(){
        return colour;
    }

    /**
     * set the colour
     * @param colour the new colour as String
     */
    public void setColour(String colour){
        this.colour = colour;
    }

    /**
     * find out if filled
     * @return true if filled, false if not filled
     */
    public boolean isFilled(){
        return filled;
    }

    /**
     * set filled status
     * @param filled true if to be filled, false if not to be filled
     */
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    /**
     * get date created
     * @return the date as java.util.Date
     */
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    /**
     * Get string representation of this object
     * @return as String
     */
    @Override
    public String toString(){
        return ", created on: " + dateCreated + ", colour: " + colour +
                ", filled: " + filled;
    }
}
