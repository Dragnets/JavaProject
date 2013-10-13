//Week 4 RectangleCounterController
package pse1.wk4.rect;
import java.io.FileNotFoundException;

/**
 * This class  gets a reader of a file containing rectangle data
 * to store, into an instance of a counter class, summary information
 * about the areas of the rectangles
 *
 * @author Peter Rosner
 * @version 1.0, October 2012
 *  
 * 
 */
public class RectangleCounterController{
    /** a reference to the the counter */
    private RectangleCounter counter;

    /** a reference to the file reader */
    private RectangleFileReader reader;

    /**
     * The constructor creates a new RectangleCounter and RectangleFileReader
     * based on a particular filename and then runs the reader
     * @param filename the name of the file on which the RectangleFileReader
     * will be based
     * @throws FileNotFoundException if the file does not exist
     * when the reader is run
     */
    
    public RectangleCounterController(String filename)throws FileNotFoundException {
        this.counter = new RectangleCounter();
        this.reader = new RectangleFileReader(filename,this.counter);
        this.reader.run();
    }

    /**
     * displays the summary data from the counter to the console by
     * invoking displayString() on the counter
     */
    public void displayResults(){
        System.out.println(this.counter.displayString());
    }

    /**
     * generates a new FileReader based on a different filename, and
     * resets the counter and reruns the reader
     * @param filename the name of the new file
     * @throws FileNotFoundException
     */
    public void newFile(String filename) throws FileNotFoundException{
        this.counter.reset();
        this.reader = new RectangleFileReader(filename,this.counter);
        this.reader.run();
    }


}
