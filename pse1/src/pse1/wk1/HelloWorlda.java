// Author Raitis Kupce
//Date: 25/09/2013

package pse1.wk1;
import java.util.Scanner;

public class HelloWorlda{
    

    public static void main (String[] args) {

        int age;
        age = 10;
        System.out.println("Hello World");
        System.out.println("Age is "+age);
        Scanner sc = new Scanner(System.in);
        System.out.print("How much add to age:");
        age +=sc.nextInt();
        System.out.println("The age now is :"+age);
        if (age < 16) {
            System.out.println("This is Child");
        } else if (age >= 18) {
            System.out.println("This is Adult");
        } else {
            System.out.println("This is Youth");
        }
    
    }
}

