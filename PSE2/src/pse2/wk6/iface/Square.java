//Week 6 Square
package pse2.wk6.iface;
/**
 *
 * This class is a representation of a square
 * @author Peter Rosner
 * @version 1.0, October 2012
 */
public class Square extends SimpleGeometricObject implements Shape {
    /**
     * the length of the side (all sides have same length)
     */
    private int side;
    /**
     * The constructor
     * @param side the length of the side to be used for the square
     * @param colour the colour to be used as String
     * @param filled whether or not it is to be filled as boolean
     */
    public Square(int side,String colour, boolean filled){
        super(colour,filled);
        this.side = side;
    }

    /**
     * 
     * @return the width of the square (will be the side length)
     */
    public int getWidth(){
        return side;
    }

    /**
     * 
     * @return the height of the square (will be the side length)
     */
    public int getHeight(){
        return side;
    }

    /**
     * get the area of the square
     * @return the area (will be the side squared)
     */
    public double getArea() {
        return side*side;
    }

    /**
     * get the type of shape
     * @return the String "Square" in this case
     */
    public String getTypeOfShape(){
        return "Square";
    }

    /**
     * Generate a string for the data for the Square 
     * - i.e. the side and the area
     * @return all the data concatenated as String
     */
    @Override
    public String toString(){
        return "Square side = " + side + ", area = " + getArea() + super.toString();
    }
}
