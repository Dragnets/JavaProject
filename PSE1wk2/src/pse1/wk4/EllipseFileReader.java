/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pse1.wk4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author kupcer
 */
public class EllipseFileReader {
    
    private EllipseCounter counter;
    private String filename;
    
    public EllipseFileReader(String filename, EllipseCounter counter) {
        this.counter = counter;
        this.filename = filename;
        
    }
    
    public void run() throws FileNotFoundException {
        Scanner csvFile = new Scanner(new File(filename));
        csvFile.useDelimiter("\n");
        String dataRow = new String();
        boolean first = true;
        int wd = 0;
        int ht = 0;
        int row=0;
        String colour = new String();
        while (csvFile.hasNext()) {
            row++;
            dataRow = csvFile.next();
            if (first) {
                first = false;
                continue;
            }
            String[] fields = dataRow.split(",");
            wd = Integer.parseInt(fields[0].trim());
            ht = Integer.parseInt(fields[1].trim());
            colour = fields[2].trim();
            this.counter.add(new Ellipse(wd,ht,colour));
        }
        csvFile.close();
    }
}

