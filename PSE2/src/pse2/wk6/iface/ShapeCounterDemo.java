//Week 6 ShapeCounterDemo
package pse2.wk6.iface;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Peter Rosner Version 1.0
 * A demonstration class to show the use of Java interfaces
 * Reads a file of shape data and passes objects representing
 * the shapes to a ShapeCounter
 */
public class ShapeCounterDemo {

    public static void main(String[] args) throws FileNotFoundException {
        ShapeCounter sc = new ShapeCounter();
        Scanner csvFile = new Scanner(new File("shapea.csv"));
        csvFile.useDelimiter("\n");
        String dataRow = new String();
        Shape shape;
        System.out.println("Reading file");
        while (csvFile.hasNext()) {
            dataRow = csvFile.next();
            System.out.println(dataRow);
            String[] fields = dataRow.split(",");
            for (int i = 0;i<fields.length;i++){
                 fields[i] = fields[i].trim();
            }
            String shapeType = fields[0];
            shapeType = shapeType.trim().toLowerCase();
            if (shapeType.equals("rectangle")) {
                shape = new Rectangle(Integer.parseInt(fields[1]),
                        Integer.parseInt(fields[2]), fields[3], true);
            } else if (shapeType.equals("circle")) {
                shape = new Circle(Integer.parseInt(fields[1]),
                        fields[2], true);
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
