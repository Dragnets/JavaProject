//Week 2 Example 4
package pse1.wk2;

import java.util.Scanner;

/**
 *
 * @author peterrosner
 */
public class Example4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your status in the university");
        System.out.println("1 - teaching staff\n2 - admin staff\n3- student");
        int statusCode = sc.nextInt();

        switch (statusCode) {
            case 1:
                System.out.println("Your salary is practically static");
                break;
            case 2:
                System.out.println("Your salary is pretty low anyway");
                break;
            case 3:
                System.out.println("You are paying exorbitant fees");
                break;
            default:
                System.out.println("You entered an incorrect status");
                break;

        }
    }
}
