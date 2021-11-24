import java.util.Random;       // guess whar
// chase dustevich
public class phoneNumber {
  
  public static void main(String[] args) {  
    
    Random generator = new Random();        // i think this makes the thing
    
    // define everything cause
    int num1;
    int num2;
    int num3;
    int num4;
    //  int num5;
    //  int num6;
    int num7;
    int num8;
    int num9;
    int num10;
    
    // first three
    num1 = generator.nextInt(7) + 1;
    num2 = generator.nextInt(7) + 1;
    num3 = generator.nextInt(7) + 1;
    
    // did it
    num4 = generator.nextInt(742) + 1;
    
    // last
    num7 = generator.nextInt(10);
    num8 = generator.nextInt(10);
    num9 = generator.nextInt(10);
    num10 = generator.nextInt(10);
    
    // wow it works, prob better way to do this tho
    System.out.printf ("Random phone number: " + (num1) + "" + (num2) + "" + (num3) + "-");        
    System.out.format("%03d", (num4));   
    System.out.println ("-" + (num7) + "" + (num8) + "" + (num9) + "" + (num10));        
  }
  
}
