//Week 3 IntSummary
package pse1.wk3;

import java.text.DecimalFormat;

/**
 * @author peterrosner
 */
public class IntSummary {
    private int total = 0;
    private int count = 0;
    private int min = 0;
    private int max = 0;


    public IntSummary(){
    }

    public void nextNumber(int num){
        this.total += num;
        this.count++;
        if (this.count == 1) { //this is the first number
            this.min = num;
            this.max = num;
        } else {
            if (this.max < num){
                this.max = num;
            } else if (this.min > num){
                this.min = num;
            }
        }
    }

    public int getCount() {
        return this.count;
    }

    public int getTotal() {
        return this.total;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    public double getAverage() {
        if (this.count == 0){ //this should be an error
            return 0.0;
        } else {
            return (double)this.total/this.count;
        }
    }

    public String toString() {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        String average2D = twoDForm.format(this.getAverage());
        return ("count = " + count +
                "\nTotal = " + total +
                "\nMin value = " + min +
                "\nMax value = " + max +
                "\naverage = " + average2D);
    }


    
}
