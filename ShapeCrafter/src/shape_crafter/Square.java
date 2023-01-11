/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape_crafter;

/**
 *
 * @author cburg
 */
public class Square extends Non_Circular implements Zoomable{
    
    public Square(int x, int y, int l){
        setPosition(x, y);
        setHeight(l);
    }
    public Square(){
        
    }
    
    /**
     * Sets both the height and the width of the given square to the passed value.
     * If the passed value r is 0, sets the square's height and width to 1.
     * 
     * @param l set to both height and width
     * @see     setWidth()
     * @see     getHeight()
     * @see     getWidth()
     */
    @Override
    void setHeight(int l){
        if(l != 0){
            super.setHeight(Math.abs(l));
            super.setWidth(Math.abs(l));
        }
        else {
            super.setHeight(1);
            super.setWidth(1);
        }
    }
    
    /**
     * Sets both the height and the width of the given square to the passed value.
     * If the passed value r is 0, sets the square's height and width to 1.
     * 
     * @param l set to both height and width
     * @see     setHeight()
     * @see     getHeight()
     * @see     getWidth()
     */
    @Override
    void setWidth(int l){
        if(l != 0){
            super.setHeight(Math.abs(l));
            super.setWidth(Math.abs(l));
        }
        else {
            super.setHeight(1);
            super.setWidth(1);
        }
    }

}
