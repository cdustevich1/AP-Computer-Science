// import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.NumberFormat;

// chase dustevich

public class eggs {
  
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner (System.in);
    NumberFormat finalCostCurrency = NumberFormat.getCurrencyInstance();
  //  DecimalFormat dFormat2 = new DecimalFormat("0"); 
    double eNum;
    double eDozens;
    System.out.println ("Enter the number of eggs: ");
    eNum = scan.nextDouble();
    eDozens = (Math.floor((eNum) / (12)));
    System.out.println ("Number of eggs: " + (eNum));
    System.out.println ("Number of dozens: " + (eDozens));
    System.out.println ("Extra eggs: " + ((eNum) - ((eDozens) * (12))));
    
    if (eNum >= 0 && eNum <= 48)
    {
      System.out.println ("The price per dozen is: $0.50");
      System.out.println ("Total cost of the eggs is: " + (finalCostCurrency.format((((eNum) / (12)) * (0.50)))));
    }
    if (eNum >= 48 && eNum < 84)
    {
      System.out.println ("The price per dozen is: $0.45");
      System.out.println ("Total cost of the eggs is: " + (finalCostCurrency.format(((eNum) * (0.45)))));
    }
    if (eNum >= 84 && eNum < 108)
    {
      System.out.println ("The price per dozen is: $0.40");
      System.out.println ("Total cost of the eggs is: " + (finalCostCurrency.format(((eNum) * (0.40)))));
    }
    if (eNum >= 108)
    {
      System.out.println ("The price per dozen is: $0.35");
      System.out.println ("Total cost of the eggs is: " + (finalCostCurrency.format(((eNum) * (0.35)))));
    }
  }
  
}
