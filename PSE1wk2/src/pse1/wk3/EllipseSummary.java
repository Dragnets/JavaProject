package pse1.wk3;

/**
 *
 * @author kupcer
 */
public class EllipseSummary {
    int myCount = 0;
    double totalArea = 0;
    double largestArea = 0;
    String largestColour;
    int blueCount = 0;
    
    public EllipseSummary(){ 
    }
    
    public void addEllipse(Ellipse object){
        this.myCount ++;
        }
    
    public void calArea(double area){
        this.totalArea +=area;
    }
    
    public double getTotalArea(){
        return this.totalArea;
    }
    
   public int getCount(){
       return this.myCount;
   }
   
   public void compare(double area, String colour){
       String current = colour.toLowerCase();
       if (area > this.largestArea ) {
           this.largestArea = area;
           this.largestColour = colour;
       }if (current.equals("blue")){
           this.blueCount++;           
       }   
   }
 
   public double getlargestArea(){
       return this.largestArea;
   }
   
   public String getLargestColour() {
       return this.largestColour;
   }
   public int getBlueCount() {
       return this.blueCount;
   }
}


