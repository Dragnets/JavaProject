/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pse2.wk5.inh;

/**
 *
 * @author kupcer
 */
public class Square extends SimpleGeometricObject {
    int width;
    
    public Square (int width, String colour, boolean filled){
        super(colour,filled);
        this.width=width;
        
    }
    
    public int getSide(){
        return this.width;
    }
    
    public double getArea2(){
        return this.width * this.width;
    }
    
    @Override
    public String toString(){
        return ("(from Square)"+
                " size of each side = "+this.getSide()+
                "Area  = "+this.getArea2()+
                ""+super.toString());
    }
}