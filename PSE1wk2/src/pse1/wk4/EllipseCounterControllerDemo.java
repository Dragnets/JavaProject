/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pse1.wk4;
import java.io.FileNotFoundException;
/**
 *
 * @author kupcer
 */
public class EllipseCounterControllerDemo {
    public static void main (String[] args) throws FileNotFoundException{
        System.out.println("Working on reca.csv");
        EllipseCounterController a = new EllipseCounterController("reca.csv");
        a.displayResult();
        System.out.println("\nWorking on reca.csv");
        a.newFile("reca.csv");
        System.out.println("Object List: ");
        a.displayObjectList();
                }  
}