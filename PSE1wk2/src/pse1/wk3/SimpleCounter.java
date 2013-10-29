package pse1.wk3;

/**
 *
 * @author Raitis
 */
public class SimpleCounter {
    private int count;
    private int firstValue;
    // a) Create a method called reset() ?????????
    
    public SimpleCounter(int startValue) {
        this.count = startValue;
        this.firstValue = startValue;
    }
    
    public void reset(){
        this.count = this.firstValue;
        
    }

    public void click() {
        this.count++;
    }
    
    public void unclick() {
        this.count -=1;
    }
    
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return ("The count is " + count);
    }
}
