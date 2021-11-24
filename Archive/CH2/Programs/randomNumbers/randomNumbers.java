import java.util.Random;         // guess whar

// chase dustevich

public class randomNumbers {
  
  
  
    public static void main(String[] args) {            // i may be stupid
      
      
      
      
  Random generator = new Random(); // i think this makes the thing
  
  
         // defining the variables lamp

         int int110;
         int int1567;
         double double754;
         double double12001400;
         
         
  int110 = generator.nextInt(10) + 1;
      System.out.println ("Integer from 1-10: " + "\t" + (int110));         // this finally works nice
      
      int1567 = generator.nextInt(52) + 15;
      System.out.println ("Integer from 15-67: " + "\t" + (int1567)); //   took me way too long
      
      
      double754 = generator.nextDouble() * 47 + 7;
      System.out.println ("Double from 7-54: " + "\t" + (double754));
      
      
      double12001400 = generator.nextDouble() * 200 + 1200;
      System.out.println ("Double from 1200-1400: " + "\t" + (double12001400));
  

    
    
    
    
    
  }
  
}
