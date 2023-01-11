/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape_crafter;

/**
 *  Abstract class that extends shape, used for non-circular shapes.
 * 
 * @author  CBurgi
 * @see     Shape
 * @see     Rectangle
 * @see     Square
 */
public abstract class Non_Circular extends Shape implements Zoomable{
    private int height = 0;
    private int width = 0;
    
    /**
     * Sets the height of a given non-circular shape to the passed value.
     * If the passed value r is 0, sets the non-circular shape's height to 1.
     * 
     * @param h the height to be set
     * @see     getHeight()
     */
    void setHeight(int h){
        if(h != 0)this.height = Math.abs(h);
        else this.height = 1;
    }
    /**
     * Returns a given non-circular shape's height.
     * 
     * @return          int
     * @see             setHeight()
     */
    int getHeight(){
        return this.height;
    }
    
    /**
     * Sets the width of a given non-circular shape to the passed value.
     * If the passed value r is 0, sets the non-circular shape's width to 1.
     * 
     * @param w the width to be set
     * @see     getWidth()
     */
    void setWidth(int w){
        if(w != 0)this.width = Math.abs(w);
        else this.width = 1;
    }
    /**
     * Returns a given non-circular shape's width.
     * 
     * @return          int
     * @see             setWidth()
     */
    int getWidth(){
        return this.width;
    }
    
    /**
     * Double's a given non-circular shape's height and width.
     * 
     * see zoomOut()
     */
    @Override
    public void zoomIn() {
        setHeight(this.getHeight() *2);
        setWidth(this.getWidth() *2);
    }
    /**
     * Attempts to halve a given circular shape's height and width.
     * 
     * @throws IllegalZoomException Gets thrown if halving the given shape's height or width would set it to 0.
     * @see                         zoomIn()
     */
    @Override
    public void zoomOut() throws IllegalZoomException {
        if(this.getHeight()/2 ==0 || this.getWidth()/2 ==0) throw new IllegalZoomException();
        else{
            setHeight(this.getHeight() /2);
            setWidth(this.getWidth() /2);
        }
    }
}
