/**We draw a circle whose center is at the origin.
 * 
 * Code to calculate the area of a circle without the use of the formula: A = pi * r^2. This is using the Riemann sum method
 * i.e, to divide the circle into almost infinitely many rectangular strips, find a way to calculate the area of a general strip and
 * then sum up the area of all the strips to find the total area of the circle (approximately).
 * 
 * @author : SriRangaTarun
 * @version : 12/03/2016
 */
import java.io.*;
public class CircleArea
{
    public static void main() throws IOException
    {
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       
       //the radius of the circle that we want to find the area of (input)
       System.out.println("Enter the radius of the circle :");
       double r = Double.parseDouble(br.readLine());
       
       //the height of each rectangular strip above the x-axis 
       double x = -r; //(ranges from -r to +r)
        
       //the height of each small strip
       double dx = 0.0000001;
       
       //the area of the circle
       double area = 0;
       
       //the width of each strip
       double w = 0;
       
       
       //(value of x starts at -r (at the bottom of the circle) and is incremented by dx each time till it approaches r (the top of the circle)
       for(x=-r;x<=r;x=x+dx)//
       {
       
            //the width of the ith strip (a general strip) is expressed as a function of the x value of that particular strip
            w = 2*Math.pow(Math.pow(r,2)-Math.pow(x,2),0.5);
            
            //the area of each strip is given by the product of w and dx. The area of each strip is summed up using a for loop imitating the role of the sigma function
            area = area + w*dx;
       }
       
       //predicted area
       System.out.println(area);
       
       //actual area
       System.out.println(Math.PI*r*r);
       
       //Note:
       //The smaller the value of dx is, the more strips we create, approximating the area more accurartely
    }
}