/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape_crafter;

/**
 * Represents a circle, extends the circular abstract class.
 * 
 * @author  CBurgi
 * @see     Circular
 */
public class Circle extends Circular implements Zoomable {
    
    public Circle(int x, int y, int r){
        setR(r, 0);
        setPosition(x, y);
    }
    public Circle(){
        
    }
    
    
}
