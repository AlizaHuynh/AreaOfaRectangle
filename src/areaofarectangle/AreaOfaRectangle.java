/*
 * Aliza Huynh
 * AreaofaRectangle.java
 * This program calculates the area of a rectangle when given the length and width
 */
package areaofarectangle;

/**
 *
 * @author AlizaHuynh
 */
public class AreaOfaRectangle
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        double width = 5.7;
        double length = 4.8;
        double area = 0.0;
        
        area = width*length;
        
        System.out.println("The width of the rectangle is " + width + " units.");
        System.out.println("The length of the rectangle is " + length + " units.");
        System.out.println("Therefore, the area of the rectangle is " + area + " units.");
        
    }
    
}


