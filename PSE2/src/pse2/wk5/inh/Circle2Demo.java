//Week 5 Circle2Demo
package pse2.wk5.inh;

/**
 *
 * @author Peter Rosner
 */
public class Circle2Demo {
    public static void main(String[] args){
        
        Circle2 a = new Circle2(5,"yellow",true);
        System.out.printf("The area of a is %5.2f\n", a.getArea());


        a.setColour("red");
        a.setRadius(6);
        System.out.println("colour for a is now set to red, and radius to 6");
        System.out.println("a now says:\n" + a + "\n");
        a.reset();
        System.out.println("a now reset");
        System.out.println("a now says:\n" + a);

        SimpleGeometricObject b = new Circle2(2,"red",false);
        System.out.println("\nSimpleGeometricObject b = new Circle2(2,\"red\",false);");
        System.out.println("Declared type of b is SimpleGeometricObject, but actual type is Circle2");
        System.out.println("call toString() on b:\n" + b.toString() );

        Circle2 bCastToCircle2 = (Circle2)b;
        System.out.println("\nWidth of b is " + bCastToCircle2.getWidth()+
                "\nachieved by casting since b was typed to SimpleGeometricObject");

       
        SimpleGeometricObject c = new SimpleGeometricObject("green",true);
        System.out.println("\nSimpleGeometricObject c = new SimpleGeometricObject(\"green\",true);");
        System.out.println("Declared type and actual type of c is SimpleGeometricObject");
        System.out.println("call toString() on c:\n" + c.toString() );
    }

}
