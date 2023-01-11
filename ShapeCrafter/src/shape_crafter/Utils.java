/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape_crafter;

/**
 * This class contains utilities that will affect every shape in a given canvas.
 * @author CBurgi
 */
public class Utils {
    /**
     * Zooms a given array of Zoomable objects either in or out.
     * 
     * @param z     the array of shapes to be zoomed
     * @param in    if true, zooms in. Else zooms out.
     * @see         Zoomable
     */
    void zoom(Zoomable[] z, Boolean in){
        for(Zoomable n: z){
            if(in){
                n.zoomIn();
            }else{
                try{
                    n.zoomOut();
                }catch(IllegalOperationException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
