//Week 7 ShapeException
package pse2.wk7.exc;

/**
 *
 * @author Peter Rosner
 * Version 1.0
 * This exception is thrown when invalid parameters
 * are passed to classes that represent shapes
 */
public class ShapeException extends java.lang.Exception {
    /**
     * Constructor
     * @param detail is a String that get passed up to
     * constructor for Throwable
     */
    public ShapeException(String detail){
        super(detail);
    }
}
