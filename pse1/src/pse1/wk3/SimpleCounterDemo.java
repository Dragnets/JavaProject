//Week 3 SimpleCounterDemo
package pse1.wk3;

/**
 *
 * @author peterrosner
 */
public class SimpleCounterDemo {

    public static void main(String[] args) {

        SimpleCounter a = new SimpleCounter(5);
        SimpleCounter b = new SimpleCounter(10);
        System.out.println("a says " + a);
        System.out.println("The value of a is " + a.getCount());
        System.out.println("b says " + b);
        System.out.println("About to click() on a");
        a.click();
        System.out.println("a now says " + a);
        System.out.println("b now says " + b);
        System.out.println("Clicking b twice");
        b.click();
        b.click();
        System.out.println("a now says " + a);
        System.out.println("b now says " + b);

    }
}
