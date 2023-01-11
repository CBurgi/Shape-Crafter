/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape_crafter;

/**
 * Represents an ellipse, extends the circular abstract class.
 * 
 * @author CBurgi
 */
public class Ellipse extends Circular implements Zoomable {
    
    private int radius2 = 0;
    
    public Ellipse(int x, int y, int r, int r2){
        setR(r, 1);
        setR(r2, 2);
        setPosition(x, y);
    }
    public Ellipse(){
        
    }
    
    /**
     * Sets the given ellipse's passed radius to the absolute of the passed value r.
     * If the passed value r is 0, sets the circular shape's radius to 1.
     * Pass any value except 2 to whichR to set main radius.
     * Pass 2 to whichR to get second radius.
     * 
     * @param r         the value to set the radius
     * @param whichR    determines which radius to set
     * @see             getR()
     */
    @Override
    void setR(int r, int whichR){
        if(whichR == 2){
            if(r!=0)this.radius2 = Math.abs(r);
            else this.radius2 = 1;
        }else{
            if(r!=0)super.setR(r, 0);
            else super.setR(1, 0);
        }
    }
    /**
     * Returns a given circular shape's passed radius.
     * Pass any value except 2 to whichR to get main radius.
     * Pass 2 to whichR to get second radius.
     * 
     * @param whichR    determines which radius to get
     * @return          int
     * @see             setR()
     */
    @Override
    int getR(int whichR){
        if(whichR == 2)return radius2;
        return super.getR(0);
    }
    
    /**
     * Double's the given circular shape's radii.
     */
    @Override
    public void zoomIn() {
        super.zoomIn();
        this.radius2 *= 2;
    }
    /**
     * Attempts to halve the given circular shape's radius.
     * 
     * @throws IllegalZoomException Gets thrown if halving either of the given shape's radii would set it to 0.
     */
    @Override
    public void zoomOut() throws IllegalZoomException {
        if(this.getR(1)/2 == 0 || this.getR(2)/2==0) throw new IllegalZoomException();
        else{
            setR(this.getR(1)/2, 1);
            setR(this.getR(2)/2, 2);
        }
    }
    
    
}
