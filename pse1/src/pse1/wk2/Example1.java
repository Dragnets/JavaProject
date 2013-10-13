//Week 2 Example 1
package pse1.wk2;

import java.util.Scanner;


/**
 *
 * @author peterrosner
 */
public class Example1 {

    public static void main(String[] args) {
        getItems();
    }
    
    public static void getItems(){
        Scanner in = new Scanner(System.in);
        System.out.print("How many items : ");
        int loop_count = in.nextInt();
        if (loop_count > 5) {
            loop_count = 5;
        }
        int num;
        String desc;
        String colour;
        for (int count = 0; count < loop_count; count++) {
            
            System.out.print("Item No : ");
            num = in.nextInt();
            System.out.print("Description : ");
            desc = in.next();
            if (num > 2000) {
                colour = "Blue";
            } else if (num > 1500) {
                colour = "Red";
            } else if (num > 1000) {
                colour = "Green";
            } else {
                colour = "Orange";
            }
            System.out.println(num + ", " + colour + ", " + desc);
        }
    }
}

