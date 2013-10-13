//Week 3 StringCounterDemo
package pse1.wk3;

/**
 *
 * @author peterrosner
 */
public class StringCounterDemo {

    public static void main(String[] args) {
        StringCounter myCounter = new StringCounter();
        String[] myStrings = {
            "red", "blue", "RED", "Green", "Red"};
        for (String s: myStrings){
            myCounter.addString(s);
        }

        System.out.println(myCounter);

    }
}
