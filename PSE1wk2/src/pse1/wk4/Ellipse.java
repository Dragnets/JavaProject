/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pse1.wk4;

import pse1.wk3.*;


/**
 *This class is a representation of a Ellipse
 * @author Raitis Kupce
 * @version 1.0, October 16 2012
 */
public class Ellipse {
    
    /** The current radius of semiMajor */ 
    private int semiMajorRadius ;
    
    /**The current radius of semi Minor */  
    private int semiMinorRadius ;
    
    /**The current colour */
    private String colour ;
    
    /**The constructor 
     * Sets up initial value for semiMajorRadius, semiMinorRadius and colour
     * @param semiMajorRadius the major radius that the ellipse will be initialised with
     * @param semiMinorRadius the minor radius that the ellipse will be initialised with
     * @param colour  the colours that the ellipse will be initialised with 
     */
    public Ellipse (int semimajorradius, int semiminorradius, String colour) {
        this.semiMajorRadius=semimajorradius; 
        this.semiMinorRadius=semiminorradius;
        this.colour=colour;
    }
    /**
     * gets the current major radius of the ellipse
     * @return the major radius as a double int
     */
    public int getMajoRadius () {
       return semiMajorRadius;
        
    }
    /**
     * gets the current Minor Radius of the ellipse
     * @return the minor radius as a double int
     */
    public int getMinorRadius () {
        return semiMinorRadius;
    }
    
    /**
     * gets the current colour for the ellipse
     * @return the colour as a String
     */
    public String getColour (){
        return colour;
    }
    
    /**
     * gets the current area of the ellipse
     * @return the area as a double int
     */
    public double getArea () {
        return Math.PI*this.semiMajorRadius*this.semiMinorRadius;
    }
    
    /**
     * generate a string of showing the data for the ellipse
     * - the Major Radius, Minor Radius, area and colour of ellipse
     * @return the data for the ellipse and String
     */
    @Override
    public String toString (){    
      return ("Semi major axi = "+semiMajorRadius+ 
              "\nSemi minor axi = "+semiMinorRadius+
              "\nArea = "+String.format("%.2f",getArea())+
              "\nColour = "+colour);
    }  
}