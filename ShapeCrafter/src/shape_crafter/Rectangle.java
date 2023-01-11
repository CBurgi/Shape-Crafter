/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape_crafter;

/**
 *
 * @author cburg
 */
public class Rectangle extends Non_Circular implements Zoomable{
    
    public Rectangle(int x, int y, int h, int w){
        setPosition(x, y);
        setHeight(h);
        setWidth(w);
    }
    public Rectangle(){
        
    }

}
