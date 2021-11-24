import java.util.Scanner;

// chase dustevich

public class dayOfTheWeek {
  
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner (System.in);
    
    System.out.print ("Enter day number: ");
    int dNum = scan.nextInt();
    
    System.out.println ("You entered: " + (dNum));
    
    if (dNum == 1)
      System.out.println ("Monday");
    
    if (dNum == 2)
      System.out.println ("Tuesday");
    
    if (dNum == 3)
      System.out.println ("Wednesday");
    
    if (dNum == 4)
      System.out.println ("Thursday");
    
    
    if (dNum == 5)
      System.out.println ("Friday");
    
    
    if (dNum == 6)
      System.out.println ("Saturday");
    
    if (dNum == 7)
      System.out.println ("Sunday");
     
    if (dNum > 7)
      System.out.println ("Not a day of the week");
    
  }
  
}
