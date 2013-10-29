//Week 8 ShapeCounterDemo
package pse2.wk8.misc;

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
 * @Version 1.2, November 2012
 * colour for concrete shapes now based on Colour
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
            Colour colour;
            try {
                if (shapeType.equals("rectangle")) {
                    colour = getColour(fields[3]);
                    shape = new Rectangle(Integer.parseInt(fields[1]),
                            Integer.parseInt(fields[2]), colour, true,SimpleGeometricObject.THIN_BORDER);
                } else if (shapeType.equals("circle")) {
                    colour = getColour(fields[2]);
                    shape = new Circle(Integer.parseInt(fields[1]),
                            colour, true, SimpleGeometricObject.THICK_BORDER);
                } else if (shapeType.equals("square")) {
                    colour = getColour(fields[2]);
                    shape = new Square(Integer.parseInt(fields[1]),
                            colour, true, SimpleGeometricObject.NORMAL_BORDER);
                } else {//shape not recognised
                    throw new ShapeException("Shape " + fields[0] + " not recognized");
                }
                sc.add(shape);
            } catch (ShapeException e) {
                System.out.println("Error " + e);
                continue;
            }
        }
        csvFile.close();

        System.out.println("\nProcessed file");

        List<Shape> shapes = sc.getShapes();
        for (Shape s : shapes) {
            /*
            System.out.printf("\n%s,%d,%d,%5.2f",
                    s.getTypeOfShape(),
                    s.getWidth(),
                    s.getHeight(),
                    s.getArea());
             *
             */
            System.out.println(s);
        }

        System.out.println(sc);

    }

    private static Colour getColour(String colourString) throws ShapeException {
        String colourStringModified = colourString.trim().toLowerCase();
        Colour colour;
        if (colourStringModified.equals("red")) {
            colour = Colour.RED;
        } else if (colourStringModified.equals("green")) {
            colour = Colour.GREEN;
        } else if (colourStringModified.equals("blue")) {
            colour = Colour.BLUE;
        } else if (colourStringModified.equals("white")) {
            colour = Colour.WHITE;
        } else if (colourStringModified.equals("yellow")) {
            colour = Colour.YELLOW;
        } else {
            throw new ShapeException("Invalid colour " + colourString);
        }
        return colour;
    }
}
