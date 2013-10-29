//Week 5 Rectangle2
package pse2.wk5.inh;

/**
 *
 * @author Peter Rosner
 */
public class Rectangle2 extends SimpleGeometricObject{
    private int width;
    private int height;


    public Rectangle2(int width, int height, String colour,boolean filled) {
        super(colour,filled);
        this.width = width;
        this.height = height;
        
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

   
    public double  getArea() {
        return this.width * this.height;
    }

/*
    @Override
    public String toString() {
        return "Rectangle2(" + this.width +"," + this.height +
                ") " +  this.getArea() + " " + getColour() + " " + getDateCreated() + " " + isFilled();
    }
 *
 */
    @Override
    public String toString() {
        return "(from Rectangle2) width: " + this.width + " ,height: " + this.height +
               " ,area: " +  this.getArea() + " " + super.toString();
    }
}
