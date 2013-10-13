//RectFile
package pse1.wk3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author peterrosner
 */
public class Rectfile {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Scanner csvFile = new Scanner(new File("rect.csv"));
        csvFile.useDelimiter("\n");
        boolean first = true;
        String dataRow = new String();
        int wd = 0;
        int ht = 0;
        int wtotal = 0;
        int atotal = 0;
        while (csvFile.hasNext()) {
            dataRow = csvFile.next();
            if (first) {
                first = false;
                continue;
            }
            String[] fields = dataRow.split(",");
            wd = Integer.parseInt(fields[0].trim());
            ht = Integer.parseInt(fields[1].trim());
            wtotal += wd;       //add up widths
            atotal += wd * ht;  //add up areas
        }
        // Close the file once all data has been read.
        csvFile.close();
        System.out.printf("width total = %d area total = %d\n",
                wtotal, atotal);

    }
}
