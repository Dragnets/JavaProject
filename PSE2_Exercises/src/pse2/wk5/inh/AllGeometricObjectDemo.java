/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pse2.wk5.inh;
import java.util.Random;
/**
 *
 * @author kupcer
 */
public class AllGeometricObjectDemo {
    public static void main (String[]arg){
        SimpleGeometricObject[] objectList = {new SimpleGeometricObject("blue",false),
        new SimpleGeometricObject("yellow",true),new SimpleGeometricObject("green",false),
        new SimpleGeometricObject("blue",true),new SimpleGeometricObject("blue",false)};//,
        
        int pos = 0;
        for ( SimpleGeometricObject object:objectList){
            Random randomGenerator = new Random();
            int statusCode = randomGenerator.nextInt(3);
            System.out.println("My number is "+statusCode);
            switch(statusCode){
                case 1:
                    objectList[pos] = new Rectangle2(5,10,"black",true);
                    break;
                case 2:
                    objectList[pos] = new Circle2 (3,"green",false);
                    break;
                case 3:
                    objectList[pos] = new Square(3,"blue",false);
                default:
                    System.out.println("Incorrect");
                    break;
            }
            pos++;
            }
            
        int pos2 = 0; 
        for (SimpleGeometricObject object: objectList){
            System.out.println("\nObject "+pos2);
            System.out.println(object);
            pos2++;
        }
        
        
        
        
        
        
    }
}
