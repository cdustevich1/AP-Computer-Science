import java.util.Random;         // guess whar

// chase dustevich

public class slotMachine {
  
  public static void main(String[] args) { 
    
    Random generator = new Random(); // i think this makes the thing
    
    int ran1;
    int ran2;
    int ran3;
    
    ran1 = generator.nextInt(10);
    ran2 = generator.nextInt(10);
    ran3 = generator.nextInt(10);
    
    System.out.print (ran1);         
    System.out.print (ran2);        
    System.out.print (ran3);        
    System.out.println ();    
    
    if (ran1==ran2 && ran2==ran3)
      System.out.println("All numbers match");
    if (ran1==ran2 && ran2!=ran3)
      System.out.println("You matched 2 numbers");
    if (ran1!=ran2 && ran2==ran3)
      System.out.println("You matched 2 numbers");
    if (ran1==ran3 && ran2!=ran3)
      System.out.println("You matched 2 numbers");
    if (ran1!=ran3 && ran1!=ran2 && ran2!=ran3)
      System.out.println("You matched 0 numbers");
    
  }
  
}
