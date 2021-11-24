import java.util.Scanner;

// chase dustevich
public class evenSum {
  
  public static void main(String[] args) { 
    Scanner scan = new Scanner (System.in);
      int count = 2;
      int num = 0;
      int input;
      
      System.out.println("Enter a number greater than 2: ");
    input = scan.nextInt();
      
      while (count <= input)
      {
        num = num + count; //counting by 1
        count += 2; //same as count = count + 2;
  }
      System.out.println ("The sum of all the even numbers between 2 and " +input+ " is: " + num);
  }
}

