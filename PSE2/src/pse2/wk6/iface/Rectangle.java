//Week 6 Rectangle
package pse2.wk6.iface;

/**
 *
 * @author Peter Rosner
 */
public class Rectangle extends SimpleGeometricObject implements Shape{

     /** the width of the rectangle */
    private int width;
    /** the height of the rectangle */
    private int height;

    /**
     * The constructor initialises the initial data for the rectangle
     * @param width the initial width 
     * @param height the initial height 
     * @param colour the initial colour 
     * @param filled whether initially filled as boolean
     */
    public Rectangle(int width, int height, String colour,boolean filled) {
        super(colour,filled);
        this.width = width;
        this.height = height;
        
    }

     /** 
     * @return the current width 
     */
    public int getWidth() {
        return this.width;
    }


    /**
     * @return the current height
     */
    public int getHeight() {
        return this.height;
    }

   
    /**
     * gets the calculated area
     * @return the area as double
     */
    public double  getArea() {
        return this.width * this.height;
    }

    /**
     * gets the type of Shape - will always be the same
     * @return the type of shape as String
     */
    public String getTypeOfShape(){
        return "Rectangle";
    }


     /**
     * get the concatenated string version of the data for the rectangle
     * @return the concatenated data as String
     */
    @Override
    public String toString() {
        return "Rectangle: width: " + this.width + " ,height: " + this.height +
                " ,area: " +  this.getArea() + " " + super.toString();
    }
}
