package pse1.wk2;
import java.util.Scanner;

/**
 *
 * @author kupcer
 */
public class Exercise1 {
    
    public static void main (String[] args) {
        int[] ages = ask_ages();
        for (int year_old:ages){
            System.out.print(year_old+" ");
        }
    }
    
        public static int[] ask_ages() {
               
        System.out.println("Hello World");
        Scanner num = new Scanner(System.in);
        System.out.print("Please enter count: ");
        
        int count = num.nextInt();
        int[] ages = new int[count];
        for (int i = 0; i < count; i++){
            
            int age;
            Scanner start = new Scanner(System.in);
            System.out.print("Please enter age: ");
            age = start.nextInt();
            //System.out.println("Age is "+age);
            Scanner sc = new Scanner(System.in);
            System.out.println("The age now is: "+age);
            String ageGroup;
            if (age < 16) {
                ageGroup = "Child";
                System.out.println("This is " +ageGroup);
            } else if (age >= 18) {
                ageGroup= "Adult";
                System.out.println("This is " +ageGroup);
            } else {
                ageGroup= "Youth";
                System.out.println("This is " +ageGroup);
            }
            ages[i]= age;
        }
        return ages;
 
        }
}

        
