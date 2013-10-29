/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pse1.wk3;
import java.util.ArrayList;

/**
 *This class is a representation of a Ellipse
 * @author Raitis Kupce
 * @version 1.0, October 16 2012
 */

public class EllipseDemo {
    /**
     * This class creates an object of ellipse and demonstrate it
     * @param args accepts of an array string
     */
    public static void main(String[] args) {

        Ellipse a = new Ellipse (3,4,"yellow");     
        System.out.println(a);
        
        EllipseSummary myObject = new EllipseSummary();
        Ellipse[] ellipses  = 
        {new Ellipse (9,2,"Blue"), new Ellipse(5,4,"blue"),new Ellipse(6,9,"yellow"),new Ellipse(3,4,"blue"),
            new Ellipse(8,1,"red"), new Ellipse(5,6,"blue")};
        int count;
        double areaSum;
        for ( Ellipse object: ellipses){
            myObject.addEllipse(object);
            double area = object.getArea();
            myObject.calArea(area);
            String colour = object.getColour();
            myObject.compare(area,colour);
            
        }
        System.out.println("\nWorking with List , ");
        count=myObject.getCount();
        System.out.printf("There are %d ellipses.\n",count);
        System.out.printf("The area of total eclipse is: %.0f \n",myObject.getTotalArea());
        System.out.printf("The largest area of eclipse is: %.0f \n",myObject.getlargestArea());
        System.out.printf("The largest eclipse colour is: %s \n", myObject.getLargestColour());
        System.out.printf("The blue eclipse appears %d times.\n", myObject.getBlueCount());
        //ArrayList ellipses; 
        //ellipses = new ArrayList (5);
        ArrayList major;
        major = new ArrayList();
        major.add(5);
        major.add(6);
        major.add("red");
        
        System.out.println(major);
    }
}
        // NEXT TASK, FIND out The area of Largest Ellipse 