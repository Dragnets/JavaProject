package pse1.wk2;

import java.util.Random;

/**
 *
 * @author kupcer 
 */
public class ClassRoomExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myvar;
        myvar =10;
        Random rnd =new Random ();
        int range = 10-5 +1;
        for (int i=0;i<100; i++){
            System.out.print(" "+(rnd.nextInt(range)+5));
            if( i % 10 == 9)
                System.out.println("");
        }
            
       }
}
