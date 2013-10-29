//Week 4 Rectangle2 Demo
package pse2.wk5.inh;

/**
 *
 * @author Peter Rosner
 */
public class Rectangle2Demo {

    public static void main(String[] args){
        Rectangle2 a = new Rectangle2(1,2,"red",true);
        Rectangle2 b = new Rectangle2(2,5,"yellow",true);
        Square c = new Square(4,"pink",true);
        System.out.println("a says:\n" + a);
        System.out.println("\nThe area of a is " + a.getArea());
        System.out.println("\nb says:\n" + b);
        System.out.println("\nThe area of b is " + b.getArea());
        System.out.println("\nThe Square is: "+c);
    }
}
