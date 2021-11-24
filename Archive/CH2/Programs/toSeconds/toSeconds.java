import java.util.Scanner;

// chase dustevich
public class toSeconds {
  
  
  public static void main(String[] args) { 
    
// varibles, hours, seconds, minutes
    
    double hours;
    double minutes;
    double seconds;
    
    
// conversions from hours, minutes, and seconds into seconds varibles
    
    double HtoS;
    double MtoS;
    double StoS;
    
// final seconds variables
    
    double finalSeconds;
    // int finalSecondsInt;        put this at bottom cause website i used for reference had it there
    
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter hours, minutes, and seconds");
    
    hours = scan.nextDouble();
    minutes = scan.nextDouble();
    seconds = scan.nextDouble();
    
    
    
    
// some math to make everything into seconds, i.e. defining the conversions
    
    HtoS = (hours) * (60*60);
    MtoS = (minutes) * (60);
    StoS = (seconds);
    
    
// more lamp math to add evrything together to make final sum of seconds
    
    
    finalSeconds = (HtoS) + (MtoS) + (StoS);
    
    
// funnt for convert double to int, this isn't really needed by i liked the answer as a clean whole number
    
    int finalSecondsInt = (int)finalSeconds;
    
// final print of answer, this u?
    
    System.out.println("The total number of seconds is " + (finalSecondsInt) + " seconds");
    
    
  }
  
}
