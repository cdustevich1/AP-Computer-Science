import java.util.Scanner;
import java.text.DecimalFormat;

// chase dustevich

public class areasOfRectangles {
  
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner (System.in);
    DecimalFormat dFormat2 = new DecimalFormat("0.00"); 
    
    double a1;
    double a2;
    
    System.out.print ("Enter length of rectangle 1: ");
    double l1 = scan.nextDouble();
    
    System.out.print ("Enter width of rectangle 1: ");
    double w1 = scan.nextDouble();
    
    System.out.print ("Enter length of rectangle 2: ");
    double l2 = scan.nextDouble();
    
    System.out.print ("Enter width of rectangle 2: ");
    double w2 = scan.nextDouble();
    
    a1 = (l1) * (w1);
    a2 = (l2) * (w2);  
    
    System.out.println ("Area of Rectangle 1: " + (dFormat2.format(a1)));
    System.out.println ("Area of Rectangle 2: " + (dFormat2.format(a2)));
    
    if (a1 > a2)
      System.out.println ("Rectangle 1 has a larger area than Rectangle 2");
    
    if (a1 < a2)
      System.out.println ("Rectangle 2 has a larger area than Rectangle 1");
    
    if (a1 == a2)
      System.out.println ("Rectangle 1 has an equal area to Rectangle 2");
    
  }
  
}
