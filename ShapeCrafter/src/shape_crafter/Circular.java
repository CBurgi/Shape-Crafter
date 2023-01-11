/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package shape_crafter;

/**
 * Abstract class that extends shape, used for circular shapes.
 * 
 * @author  CBurgi
 * @see     Shape
 * @see     Circle
 * @see     Ellipse
 */
public abstract class Circular extends Shape implements Zoomable{
    private int radius = 0;
    
    /**
     * Sets a given circular shape's passed radius to the absolute of the passed value r.
     * If the passed value r is 0, sets the circular shape's radius to 1.
     * Pass any value to whichR to set main radius.
     * 
     * @param r         the value to set the radius
     * @param whichR    used for shapes with multiple radii.
     * @see             getR()
     */
    void setR(int r, int whichR){
        if(r!=0)this.radius = Math.abs(r);
        else this.radius = 1;
    }
    /**
     * Returns a given circular shape's passed radius.
     * Pass any value to whichR to get main radius.
     * 
     * @param whichR    used for shapes with multiple radii.
     * @return          int
     * @see             setR()
     */
    int getR(int whichR){
        return radius;
    }
    
    /**
     * Double's a given circular shape's radius.
     * 
     * see zoomOut()
     */
    @Override
    public void zoomIn() {
        setR(this.getR(0)*2, 0);
    }
    /**
     * Attempts to halve a given circular shape's radius.
     * 
     * @throws IllegalZoomException Gets thrown if halving the given shape's radius would set it to 0.
     * @see                         zoomIn()
     */
    @Override
    public void zoomOut() throws IllegalZoomException {
        if(this.getR(0)/2 == 0) throw new IllegalZoomException();
        else setR(this.getR(0)/2, 0);
    }
    
}
