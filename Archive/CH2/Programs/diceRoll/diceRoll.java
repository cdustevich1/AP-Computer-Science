import java.util.Random;       // guess whar
import java.util.Scanner;       // hold up it's 2

// chase dustevich

public class diceRoll {
  
  
  public static void main(String[] args) { 
    
    
    Random generator = new Random();        // i think this makes the thing
    
    Scanner scan = new Scanner(System.in);      // yes sir
    
    
    // defineeeeeeeee
    
    int diceSides1;
    int diceSides2;
    
    int randomDice1;
    int randomDice2;
    
    int totalSum;
    
        System.out.println ("Number of sides on dice 1:");        
    diceSides1 = scan.nextInt();
    // user input in here somewhere i think
            System.out.println ("Number of sides on dice 2:");        
    diceSides2 = scan.nextInt();
    
    
    
    
    
    
    // hopefully this ezz (it was not ezz)
    
    randomDice1 = generator.nextInt(diceSides1) + 1;
    System.out.println ("Random Dice Roll 1: " + "\t" + (randomDice1));        
    
    randomDice2 = generator.nextInt(diceSides2) + 1;
    System.out.println ("Random Dice Roll 2: " + "\t" + (randomDice2)); 
    
    // summ
    
    totalSum = (randomDice1) + (randomDice2);
    
    // final output
    System.out.println ("Sum of Random Dice Rolls 1 and 2: " + (totalSum)); 
    
    
  }
  
  
  
}
