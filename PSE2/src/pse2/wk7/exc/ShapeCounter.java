//Week 7 ShapeCounter
package pse2.wk7.exc;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Peter Rosner
 * @version 1.0
 * A ShapeCounter is presented with shapes, stores them
 * and keeps a count of the number presented and total area
 */
public class ShapeCounter {
    /**
     * the count of shapes presented
     */
    private int count = 0;
    /**the total area
     *
     */
    private double totalArea = 0;
    /**
     * the list of shapes
     */
    private List<Shape> shapes = new ArrayList<Shape>();
    //private List<Shape> shapes = new LinkedList<Shape>();

    /**
     * the constructor
     * sets up the list of shapes
     */
    public ShapeCounter(){
    }

    /**
     * add a shape, and update the count and the total area
     * @param shape the instance of Shape passed in
     */
    public void add(Shape shape) {
        this.count++;
        shapes.add(shape);
        this.totalArea += shape.getArea();
    }

    /**
     * get the shapes presented so far
     * @return the shapes as a List
     */
    public List<Shape> getShapes(){
        return shapes;
    }

   /** 
    * @return the count and the total area concatenated as a String
    */
    @Override
    public String toString(){
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        String area2D = twoDForm.format(this.totalArea);
        return ("\nSummary: count = " + this.count +
                ", total area = " + area2D );
    }


    public void reset() {
        this.count = 0;
        this.totalArea = 0;
        this.shapes.clear();
    }

}
