//Week 8 SimpleGeometricObject
package pse2.wk8.misc;

/**
 *
 * @author Peter Rosner,
 * @Version 1.2, November 2012
 * based on example in Daniel Liang book
 * changed to give selection-type type
 * and also added border thickness
 */
public abstract class SimpleGeometricObject {

    public static final int THIN_BORDER = 1;
    public static final int NORMAL_BORDER = 2;
    public static final int THICK_BORDER = 3;
    /**
     * The colour of the geometric object
     */
    //private String colour = "white";
    private Colour colour = Colour.WHITE;
    /**
     * Whether or not it is filled
     */
    private boolean filled;
    /**
     * The date it was created
     */
    private java.util.Date dateCreated;
    /**
     * Thickness of border
     */
    private int borderThickness = NORMAL_BORDER;

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
     * @param thickness the starting thickness of the border
     * @throws ShapeException if invalid thickness
     */
    public SimpleGeometricObject(Colour colour, boolean filled, int thickness) throws ShapeException {
        this();
        checkThickness(thickness);
        this.colour = colour;
        this.filled = filled;
        this.borderThickness = thickness;
    }

    /**
     * get the colour
     * @return the colour as String
     */
    public Colour getColour() {
        return colour;
    }

    /**
     * set the colour
     * @param colour the new colour
     */
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    /**
     * find out if filled
     * @return true if filled, false if not filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * set filled status
     * @param filled true if to be filled, false if not to be filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * get the border thickness
     * @return the current border thickness
     */
    public int getBorderThickness() {
        return this.borderThickness;
    }

    /**
     * Set the border thickness
     * @param thickness the new thickness for the border
     * @throws ShapeException if invalid thickness
     */
    public void setBorderThickness(int thickness) throws ShapeException {
        checkThickness(thickness);
        this.borderThickness = thickness;
    }

    /**
     * get date created
     * @return the date as java.util.Date
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Check that that the thickness is within bounds of max and min thickness
     * @param thickness
     * @throws ShapeException if outside the bounds
     */
    private void checkThickness(int thickness) throws ShapeException {
         if (thickness < THIN_BORDER
                || thickness > THICK_BORDER) {
            throw new ShapeException("Invalid thickness " + thickness);
        }
    }

    /**
     * Get string representation of this object
     * @return as String
     */
    @Override
    public String toString() {
        return ", created on: " + dateCreated + ", colour: " + colour
                + ", filled: " + filled + ", thickness: " + borderThickness;
    }
}
