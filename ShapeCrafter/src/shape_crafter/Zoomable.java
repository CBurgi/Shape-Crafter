/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package shape_crafter;

/**
 * If implemented, a class can be zoomed in or out.
 * 
 * @author  CBurgi
 * @see     Circular
 * @see     Non_Circular
 * @see     Utils.zoom()
 */
public interface Zoomable {
    void zoomIn();
    void zoomOut() throws IllegalOperationException;
}
