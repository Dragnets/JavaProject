//Week 3 SimpleCounter
package pse1.wk3;

/**
 *
 * @author peterrosner
 */
public class SimpleCounter {
    private int count;

    public SimpleCounter(int startValue) {
        this.count = startValue;
    }

    public void click() {
        this.count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return ("The count is " + count);
    }
}
