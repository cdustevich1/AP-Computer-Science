import java.util.Scanner;
import java.text.NumberFormat;

// chase dustevich
public class printingPrices {
  
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner (System.in);
    NumberFormat finalCostCurrency = NumberFormat.getCurrencyInstance();
    double pNum;
    System.out.println ("Enter the number of copies: ");
    pNum = scan.nextDouble();
    if (pNum >= 0 && pNum <= 499)
    {
      System.out.println ("The price per copy is: $0.30");
      System.out.println ("Total cost of the copies is: " + (finalCostCurrency.format(((pNum) * (0.30)))));
    }
    if (pNum >= 500 && pNum <= 749)
    {
      System.out.println ("The price per copy is: $0.28");
      System.out.println ("Total cost of the copies is: " + (finalCostCurrency.format(((pNum) * (0.28)))));
    }
    if (pNum >= 750 && pNum <= 999)
    {
      System.out.println ("The price per copy is: $0.27");
      System.out.println ("Total cost of the copies is: " + (finalCostCurrency.format(((pNum) * (0.27)))));
    }
    if (pNum >= 1000)
    {
      System.out.println ("The price per copy is: $0.25");
      System.out.println ("Total cost of the copies is: " + (finalCostCurrency.format(((pNum) * (0.25)))));
    }
    
  }
  
}
