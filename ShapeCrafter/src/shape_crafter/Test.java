/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape_crafter;

/**
 * Tester class, holds main method.
 * @author CBurgi
 */
public class Test {

    /**
     * Main method for testing program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle();
        Ellipse e = new Ellipse();
        Rectangle r = new Rectangle();
        Square s = new Square();
        
        //Should throw IllegalZoomException for 1, 2, and 3
        Circular[] testCirculars = new Circular[4];
        testCirculars[0] = new Circle(4, 2, 2);
        testCirculars[1] = new Circle(4, 2, 1);
        testCirculars[2] = new Ellipse(4, 2, 1, 2);
        testCirculars[3] = new Ellipse(4, 2, 2, 1);
        
        int i = 0;
        for(Circular n: testCirculars){
            System.out.println("Radius of Circular " + i +  " = " +n.getR(0));
            if(n.getClass() == e.getClass())System.out.println("Radius2 = " +n.getR(2));
            i++;
        }
        
        Utils testUtil = new Utils();
        testUtil.zoom(testCirculars, false);
        
        i = 0;
        for(Circular n: testCirculars){
            System.out.println("Radius of Circular " + i +  " = " +n.getR(0));
            if(n.getClass() == e.getClass())System.out.println("Radius2 = " +n.getR(2));
            i++;
        }
        
        //Should throw IllegalZoomException for 1, 2, and 3
        Non_Circular[] testNon_Circulars = new Non_Circular[4];
        testNon_Circulars[0] = new Square(4, 2, 2);
        testNon_Circulars[1] = new Square(4, 2, 1);
        testNon_Circulars[2] = new Rectangle(4, 2, 1, 2);
        testNon_Circulars[3] = new Rectangle(4, 2, 2, 1);
        
        i = 0;
        for(Non_Circular n: testNon_Circulars){
            System.out.println("Height of Non_Circular " + i +  " = " +n.getHeight());
            if(n.getClass() == r.getClass())System.out.println("Width = " +n.getWidth());
            i++;
        }
        testUtil.zoom(testNon_Circulars, false);
        i = 0;
        for(Non_Circular n: testNon_Circulars){
            System.out.println("Height of Non_Circular " + i +  " = " +n.getHeight());
            if(n.getClass() == r.getClass())System.out.println("Width = " +n.getWidth());
            i++;
        }
    }
    
}
