//week 1 Example

package pse1.wk1;

import java.util.Scanner;


/**
 *
 * @author peterrosner
 */
public class Example {

    public static void main(String[] args) {
        int myvar;
        myvar = 10;
        System.out.println("1 - myvar = " + myvar);
        myvar = 5;
        System.out.println("2 - myvar = " + myvar);
        myvar = myvar * 3;
        myvar -= 4;
        System.out.println("3 - myvar = " + myvar);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        myvar = sc.nextInt();
        if (myvar > 60) {
            System.out.println(myvar + " hot");
        } else if (myvar < 40) {
            System.out.println(myvar + " cold");
        } else {
            System.out.println(myvar + " warm");
        }
    }
}
