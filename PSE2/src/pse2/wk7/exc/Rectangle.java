//Week 6 Rectangle
package pse2.wk7.exc;

/**
 *
 * @author Peter Rosner
 */
public class Rectangle extends SimpleGeometricObject implements Shape{
    private int width;
    private int height;


    public Rectangle(int width, int height, String colour,boolean filled) {
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

    public String getTypeOfShape(){
        return "Rectangle";
    }

/*
    @Override
    public String toString() {
        return "Rectangle(" + this.width +"," + this.height +
                ") " +  this.getArea() + " " + getColour() + " " + getDateCreated();
    }
 *
 */
    public String toString() {
        return "Rectangle: width: " + this.width + " ,height: " + this.height +
                " ,area: " +  this.getArea() + " " + super.toString();
    }



}
