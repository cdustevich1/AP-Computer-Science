import java.text.DecimalFormat;
import java.util.Random;         // guess whar

// chase dustevich

public class randomNumbersPart2 {
  
  
  
    public static void main(String[] args) {            // i may be stupid
      
      
          DecimalFormat dFormat2 = new DecimalFormat("0.00"); 

      
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
      
      // new stuff below 
      
      
      double754 = generator.nextDouble() * 47 + 7;
      System.out.println ("Double from 7-54: " + (dFormat2.format(double754)));
      
      
      double12001400 = generator.nextDouble() * 200 + 1200;
      System.out.println ("Double from 1200-1400: " + (dFormat2.format(double12001400)));
  

    
    
    
    
    
  }
  
}
