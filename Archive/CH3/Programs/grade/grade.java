import java.util.Scanner;

// chase dustevich

public class grade {
  
  public static void main(String[] args) { 
   
    Scanner scan = new Scanner (System.in);
    
    double grade;
     System.out.print ("Enter your grade percentage: ");
    grade = scan.nextDouble();
    
    if (grade == 100 && grade >= 96.5)
      System.out.println ("You got an A+");
    if (grade < 96.5 && grade >= 92.5)
     System.out.println ("You got an A");
    if (grade < 92.5 && grade >= 89.5)
     System.out.println ("You got an A-");
    if (grade < 89.5 && grade >= 86.5)
     System.out.println ("You got a B+");
    if (grade < 86.5 && grade >= 82.5)
     System.out.println ("You got a B");
    if (grade < 82.5 && grade >= 79.5)
     System.out.println ("You got a B-");
    if (grade < 79.5 && grade >= 76.5)
     System.out.println ("You got a C+");
    if (grade < 76.5 && grade >= 72.5)
     System.out.println ("You got a C");
    if (grade < 72.5 && grade >= 69.5)
     System.out.println ("You got a C-");
    if (grade < 69.5 && grade >= 59.5)
     System.out.println ("You got a D");
    if (grade < 59.5 && grade >= 0)
     System.out.println ("You got an F");
  }
  
}
