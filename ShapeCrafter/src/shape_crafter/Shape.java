/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape_crafter;

/**
 * Abstract class that holds the methods necessary for all shapes in program.
 * Specific shapes are built off this class.
 * 
 * @author  CBurgi
 * 
 * @see     Zoomable
 * @see     Circular
 * @see     Non_Circular
 */
public abstract class Shape {
    private int[] position = {0, 0};
    
    
    
    /**
     * Sets a given shape's position in a window to the values passed.
     * 
     * @param x x-position to be set
     * @param y y-position to be set 
     */
    void setPosition(int x, int y) {
        position[0] = x;
        position[1] = y;
    }
    /**
     * returns a given shape's position.
     * 
     * @return 2 ints
     */
    int[] getPosition(){
        return position;
    }
    
    
}
