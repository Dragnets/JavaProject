//Week 2 Example 3
package pse1.wk2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author peterrosner
 */
public class Example3 {

    public static void main(String[] args) {

        List<String> colours = Arrays.asList("Red", "Green", "Blue", "Red", "Blue", "Red");
        Scanner in = new Scanner(System.in);

        //first part
        System.out.println("\n\t\tpart 1\n");
        int count = 0;
        for (String colour : colours) {
            if (colour.equals("Red")) {
                count++;
            }
        }

        System.out.printf("There are %d Reds\n", count);

        //second part - allows user input
        System.out.println("\n\t\tpart 2\n");
        System.out.print("Which colour? ");
        String toFind = in.next();
        String toFindLower = toFind.toLowerCase();
        count = 0;
        for (String colour : colours) {
            if (colour.toLowerCase().equals(toFindLower)) {
                count++;
            }
        }
        System.out.printf("There are %d %ss\n", count, toFind);

        System.out.println("\n\t\tpart 3\n");

        /**
         * the next version uses a function to take a List as a parameter and
         * then return the number of reds
         */
        int result = countReds(colours);
        System.out.printf("I found %d Reds\n", result);

        List<String> colours2 = Arrays.asList("Blue", "Blue", "Blue", "Red", "Green", "Green");

        result = countReds(colours2);
        System.out.printf("I then found %d Reds\n", result);

        //The next parts look at arrays of integers

        System.out.println("\n\t\tpart 4 - adding numbers\n");

        List<Integer> nums = Arrays.asList(37, 2, 51, 16, 4, 19, 18, 35, 15, 99);

        int total = 0;
        for (int num : nums) {
            total = total + num;
        }
        System.out.println(nums + " has total " + total);

        System.out.println("\n\t\tpart 5 - counting with condition\n");
        final int LIMIT = 20;  //this is treated as a constant
        count = 0;
        for (int num : nums) {
            if (num < LIMIT) {
                count++;
            }
        }
        System.out.printf("There are %d less than %d in %s\n", count, LIMIT, nums);

        System.out.println("\n\t\tpart 6 - creating a list of 20 numbers from 14 to 73 inclusive\n");
        List<Integer> theList = createIntArray(20, 14, 73); //<-- formal parameters
        System.out.println("The list created is " + theList);
    }

    public static int countReds(List<String> cols) {
        int count = 0;
        for (String colour : cols) {
            if (colour.equals("Red")) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> createIntArray(int size, int lower, int upper) {  // <-- formal parameters
        List<Integer> ints = new ArrayList<Integer>();
        Random rn = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers : ");
        int loopCount = in.nextInt();
        int range = upper - lower + 1;
        for (int i = 0; i <loopCount;i++) {
            ints.add(rn.nextInt(range) + lower);
        }
        return ints;
    }
}