
/**
 * Write a description of class Players here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
 public class Players{
    public static void main(String[] args){
        //Initialize player
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String p1Name = sc.nextLine();
        System.out.println("Hello, " + p1Name+ " you are playing Prisoners dilemma now");
        //Game loop
        for (int round = 1;round<=5; round++) {
            System.out.println("Round" + round);
            System.out.println("Enter your choice (C for cooperate, D for defect)");
            String humanChoice =  sc.nextLine();
            char humanStrategy = humanChoice.charAt(0);
            
        }
        
        

 
   
    
    
    
}
}
