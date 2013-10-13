 //Week 2 Example 2
package pse1.wk2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author peterrosner
 */
public class Example2 {
     public static void main(String[] args) {
        List cols = getRandomColours();
        System.out.println(cols);
     }

     public static List getRandomColours() {
        Scanner in = new Scanner(System.in);
        System.out.print("How many colours : ");
        int loopCount = in.nextInt();

        List<String> colours = new ArrayList<String>();
        Random randomGenerator = new Random();
        String colour;
        int num;
        for (int count = 0; count < loopCount; count++) {
            num = randomGenerator.nextInt(4000);
            if (num > 2000) {
                colour = "Blue";
            } else if (num > 1500) {
                colour = "Red";
            } else if (num > 1000) {
                colour = "Green";
            } else {
                colour = "Orange";
            }
            colours.add(colour);
        }
        return colours;
     }
}
