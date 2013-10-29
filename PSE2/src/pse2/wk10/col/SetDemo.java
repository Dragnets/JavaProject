//Week 10 SetDemo
package pse2.wk10.col;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Peter Rosner
 */
public class SetDemo {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        //TreeSet<String> set = new TreeSet<String>();
        set.add("Pete");
        set.add("Pete");
        set.add("John");
        System.out.println(set);
    }
}
