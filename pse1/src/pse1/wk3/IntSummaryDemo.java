//Week 3 IntSummaryDemonstrator
package pse1.wk3;
import java.util.Random;

/**
 *
 * @author Peter Rosner
 */
public class IntSummaryDemo {
    public static void main(String[] args){
        System.out.println("Creating new object");
        IntSummary summary = new IntSummary();
        System.out.println("and now adding numbers 9 7 5");
        summary.nextNumber(9);
        summary.nextNumber(7);
        summary.nextNumber(5);
        System.out.println("and the object now says\n"
                + summary);
        System.out.println("\nnow create lots of number and bung them into the object");
        Random randomGenerator = new Random();
        for (int num = 0; num < 30; num++){
            summary.nextNumber(randomGenerator.nextInt(100) + 1);
        }

        System.out.println("printing individual results");
        System.out.printf("The min is %d and the average is %5.2f", summary.getMin(),
                summary.getAverage());
        System.out.println("\nand the object says " + summary);
    }

}
