
/**
 * Write a description of class Players here.
 *
 * @Russell Zhang
 * @5.30
 */
import java.util.Scanner;
 public class Players{
    public static void main(String[] args){
        //Initialize player
        System.out.println("May I have your name?");	//Collect user's name
        Scanner sc = new Scanner(System.in); 	//Create scanner
        String p1Name = sc.nextLine();	//Read user's name with scanner
        System.out.println("Hello, " + p1Name+ " you are playing Prisoners dilemma now");	//Print out the greeting sentence
        //Game loop
        for (int round = 1;round<=5; round++) {	
            System.out.println("Round" + round);	//Round number output
            System.out.println("Enter your choice (C for cooperate, D for defect)");	//Ask users for their choice
            String humanChoice =  sc.nextLine();	//Read user's choice
            char humanStrategy = humanChoice.charAt(0);	//Preventing incorrect input
            char robotStrategy
		if (round == 1)	{
			robotChoice = 'C';
	    }else{
			robotChoice = humanChoice;
					 }
        	
        	System.out.println("Human chose:" + humanChoice);
		System.out.println("Robot chose:" + robotChoice);
		System.out.println("Scores:Human = " + humanScore + ", Robot = " + robotScore)
		String winner
			if (humanScore > robotScore){
 				winner = "Human";
		}else{	
   			winner = "Robot"
    		System.out.println("Game over!Winner: "+winner);
    		
    
}
}
