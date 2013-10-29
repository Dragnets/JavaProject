package pse1.wk4;

/**
 *This class is a representation of a Ellipse
 * @author Raitis Kupce
 * @version 1.0, October 16 2012
 */
public class EllipseCounter {
    private int count = 0;
    private int area = 0;
    private Ellipse[] mylist =new Ellipse[10]; // = new Ellipse[10]; // FIX the SIZE PLEASE ALRIGHT???
    private int majorRadius;
    private int minorRadius;
    private String colour; 
    
    public EllipseCounter() {
    }
    
    public void add(Ellipse ellipse){
        this.majorRadius = ellipse.getMajoRadius();
        this.minorRadius = ellipse.getMinorRadius();
        this.colour = ellipse.getColour();
        this.mylist[count] = new Ellipse (this.majorRadius, this.minorRadius, this.colour) ;
        this.area +=ellipse.getArea();
        this.count++;
    }
    
    public void showList(){
        int objCount = 0;
        for ( Ellipse object: mylist){
            System.out.println("\nObject "+objCount);
            System.out.println("SemiMajorRadius = "+object.getMajoRadius());
            System.out.println("SemiMinorRadius = "+object.getMinorRadius());
            System.out.println("The colour is   = "+object.getColour());
            objCount++;
        }
    }
    
    public String displayString() {
        return ("count = " + this.count+
                "\nArea = "+this.area);
    }
    
    public void reset(){
        this.area=0;
        this.count=0;
    } 
}