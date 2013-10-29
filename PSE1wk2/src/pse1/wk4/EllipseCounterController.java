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
public class EllipseCounterController {
   /** a reference to the counter */
    private EllipseCounter counter;
    
    /** a reference to the file reader */
    private EllipseFileReader reader;
    
    /**
     * The constructor creates a new EllipseCounter and EllipseFileReader 
     *based on a particular filename and then runs the reader
     */
   
    public EllipseCounterController(String filename) throws FileNotFoundException {
        this.counter = new EllipseCounter();
        this.reader = new EllipseFileReader(filename,this.counter);
        this.reader.run();
    }
    
    /** display the summary data from the counter to the console by
     * invoking displayString() on the counter
     */
    public void displayResult(){
        System.out.println(this.counter.displayString());
    }
    public void displayObjectList(){
        this.counter.showList();
    }
    
    /** generates a new FileReader based on a different filename, and
     * resets the counter and return the reader
     */
    public void newFile(String filename) throws FileNotFoundException{
        this.counter.reset();
        this.reader = new EllipseFileReader(filename,this.counter);
        this.reader.run();
    }
}