//Week 4 RectangleCounterControllerDemo
package pse1.wk4.rect;
import java.io.FileNotFoundException;

/**
 *
 * @author Peter Rosner
 */
public class RectangleCounterControllerDemo {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("\t Phil and Pete's Tremendous helping hand");
        System.out.println("First calculating with the file reca.csv");
        RectangleCounterController d = new RectangleCounterController("reca.csv");
        d.displayResults();
        System.out.println("and now the file recb.csv");
        d.newFile("recb.csv");
        d.displayResults();
    }
}