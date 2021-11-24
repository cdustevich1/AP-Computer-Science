import java.util.Scanner;      
import java.text.NumberFormat;

// chase dustevich
public class garden {
 
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner(System.in);      // yes sir
    NumberFormat finalCostCurrency = NumberFormat.getCurrencyInstance();      // need these cause
    
    // define                        also how do i have so many varibles
    double length;
    double width;
    double fertCost;
    double fencCost;
    double gArea;
    double gPeri;
    double roundedArea;
    double roundedPeri;
    // double totalFert;
    // double totalFenc;
    // double fertCostpFoot;
    double fertUnitSize;
    double periUnitSize;
    double test1;                // sorry abt the naming i gave up on these, the ones below this bad too but ig at least they have names
    double test2;                // ^^^^^^^
    double roundedAreaCost;
    double roundedPeriCost;
    double finalCostFert;
    double finalCostPeri;
    double fertBags;
    double combinedTotal;
    
    // define this stuff
    fertCost = 1.25;    // per 10x10
    fencCost = 2;       // per foot
    
    // user input
    System.out.println("Enter length of garden (in feet)");
    length = scan.nextDouble();
    System.out.println("Enter width of garden (in feet)");
    width = scan.nextDouble();
    
    // math
    gArea = (length) * (width);
    gPeri = (2 * (length)) + (2 * (width));
    roundedArea = Math.ceil(gArea);
    roundedPeri = Math.ceil(gPeri);
    
             // convert to int cause clean, jk im not smart ill do later
    //       int roundedAreaInt = (int)roundedArea;
    //               int roundedPeriInt = (int)roundedPeri;
    //     fertCostpFoot = (fertCost) * 0.01;         cant do like this
    //     totalFert = (roundedArea) * (fertCostpFoot);              ^^^^^^^
    
    // rllllllly wack/bad way of doing this i dont like it but it works
    fertUnitSize = 100;
    test1 = (roundedArea) / (fertUnitSize);
    roundedAreaCost = Math.ceil(test1);
    periUnitSize = 1;
    test2 = (roundedPeri) / (periUnitSize);
    roundedPeriCost = Math.ceil(test2);
    
    // final costs down here
    finalCostFert = (roundedAreaCost) * (fertCost);
    finalCostPeri = (roundedPeriCost) * (fencCost);
    
    // a little more math
    fertBags = (roundedAreaCost);
    combinedTotal = (finalCostFert) + (finalCostPeri);
    
    // convert to ints
    int fertBagsInt = (int)fertBags;
    int fenceTotalLength = (int)roundedPeriCost;
    
    //  System.out.println ((finalCostPeri)); // for testing
    
    System.out.println ("Total number of bags of fertilizer: " + (fertBagsInt)); 
    System.out.println ("Total cost for fertilizer: " + (finalCostCurrency.format(finalCostFert))); 
    System.out.println ("Total length of the fence: " + (fenceTotalLength)); 
    System.out.println ("Total cost for the fence: " + (finalCostCurrency.format(finalCostPeri))); 
    System.out.println ("Total combined cost of the fertilizer and fence: " + (finalCostCurrency.format(combinedTotal))); 
    
  }
  
}
