//Week 4 RectangleFileReader
package pse1.wk4.rect;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Peter Rosner
 */
public class RectangleFileReader {

    private RectangleCounter counter;
    private String filename;

    public RectangleFileReader(String filename, RectangleCounter counter) {
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
        String colour = new String();
        while (csvFile.hasNext()) {
            dataRow = csvFile.next();
            if (first) {
                first = false;
                continue;
            }
            String[] fields = dataRow.split(",");
            wd = Integer.parseInt(fields[0].trim());
            ht = Integer.parseInt(fields[1].trim());
            colour = fields[2].trim();
            this.counter.add(new Rectangle(wd,ht,colour));
        }
        csvFile.close();
    }
}
