//Week 7 ShapeCounterDemo
package pse2.wk7.exc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Peter Rosner 
 * A demonstration class to show the use of Java interfaces
 * Reads a file of shape data and passes objects representing
 * the shapes to a ShapeCounter
 * @Version 1.1, November 2012 passes up ShapeException from constructor
 * for Circle. Also user is now prompted for the file storing shapes.
 */
public class ShapeCounterDemo {

    //public static void main(String[] args) throws FileNotFoundException {
    public static void main(String[] args) {
        ShapeCounter sc = new ShapeCounter();
        
        //Scanner csvFile = new Scanner(new File("shapea.csv"));
        Scanner userInput = new Scanner(System.in);
        Scanner csvFile = null;
        System.out.println("Enter name of file containing shapes");
        boolean validFile = false;
        while (!validFile) {
            try {
                String csvFileName = userInput.next();
                csvFile = new Scanner(new File(csvFileName));
                validFile = true;
            } catch (FileNotFoundException e) {
                System.out.println("Not a valid file, try again");
            }
        }
        //
        
        csvFile.useDelimiter("\n");
        String dataRow = new String();
        Shape shape;
        System.out.println("Reading file");
        while (csvFile.hasNext()) {
            dataRow = csvFile.next();
            System.out.println(dataRow);
            String[] fields = dataRow.split(",");
            for (int i = 0; i < fields.length; i++) {
                fields[i] = fields[i].trim();
            }
            String shapeType = fields[0];
            shapeType = shapeType.trim().toLowerCase();
            if (shapeType.equals("rectangle")) {
                shape = new Rectangle(Integer.parseInt(fields[1]),
                        Integer.parseInt(fields[2]), fields[3], true);
            } else if (shapeType.equals("circle")) {
                /*
                shape = new Circle(Integer.parseInt(fields[1]),
                fields[2], true);
                 *
                 */
                try {
                    shape = new Circle(Integer.parseInt(fields[1]),
                            fields[2], true);
                } catch (ShapeException e) {
                    System.out.println("Error in circle, " + e);
                    continue;
                }
                //

            } else if (shapeType.equals("square")) {
                shape = new Square(Integer.parseInt(fields[1]),
                        fields[2], true);
            } else {//shape not recognised
                continue;
            }
            sc.add(shape);
        }
        csvFile.close();

        System.out.println("\nProcessed file");

        List<Shape> shapes = sc.getShapes();
        for (Shape s : shapes) {
            System.out.printf("\n%s,%d,%d,%5.2f",
                    s.getTypeOfShape(),
                    s.getWidth(),
                    s.getHeight(),
                    s.getArea());
        }

        System.out.println(sc);

    }
}
