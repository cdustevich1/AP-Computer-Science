import java.util.Scanner;

// chase dustevich

public class pizzaCost {
  
  public static void main(String[] args) { 
    
    
    // varibles cause yea
    
    double diameter;
    double labor;
    double rent;
    double finalCost;
    
    // define labor and rent cause
    
    labor = 0.75;
    rent = 1.00;
    
    // scannnnnnn
    
    Scanner scan = new Scanner(System.in);
    
    // lamp user input
    
    System.out.println("Enter diameter of pizza (in inches)");
    
    diameter = scan.nextDouble();
    
    // omgg so much math
    
    finalCost = 0.05 * (diameter) * (diameter) + (rent) + (labor);
    
    // printing extra lines is fun
    
    System.out.println("Cost of labor for this pizza: " + (labor) + " dollars");
    System.out.println("Cost of rent for this pizza: " + (rent) + " dollar");
    System.out.println("Cost of materials for this pizza: " + (finalCost - (rent + labor)) + " dollars");
    
    // guess what
    
    System.out.println(" ");
    System.out.println(" ");
    //System.out.println(" ");       two space lines were good
    
    // final pizza cost, this u?
    
    System.out.println("Total cost of this pizza: " + (finalCost) + " dollars");
    
    // made with <3 from deru
    
  }
  
}
