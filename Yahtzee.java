/* Darrell Gadsden Jr
 * Comp163
 * This code will represent the game Yahtzee 
 */
import java.util.Random;
import java.util.Scanner;
public class Yahtzee {
	private static Scanner scnr;
	public static void main(String args[]) {
		Random rand = new Random();
		int total;
		Boolean reroll = true;
		String sContinue = "y";
		
		
		System.out.println("Rolling 5 Dice...");
		
		for ( int i=1; i<5; i++);
		{
			int roll=rand.nextInt(6)+1;
			System.out.print(roll+" ");
			int roll1=rand.nextInt(6)+1;
			System.out.print(roll1+" ");
			int roll2=rand.nextInt(6)+1;
			System.out.print(roll2+" ");
			int roll3=rand.nextInt(6)+1;
			System.out.print(roll3+" ");
			int roll4=rand.nextInt(6)+1;
			System.out.print(roll4+" ");

			total = roll + roll1 + roll2 + roll3 + roll4;
			
		}
		System.out.println("\nThe total dice roll is " + total);
		
		System.out.println("The Average dice roll is " + total/5.0); 
		
		do {
								
		int nTotal;
		
		scnr = new Scanner(System.in);		
		
		System.out.println("Would you like a re-roll? [y/n]");
		sContinue = scnr.next();
		if(sContinue.equalsIgnoreCase("y")) {
			reroll = true;
		}else {
			reroll = false;
			System.out.println("Okay, Goodbye!");
			System.exit(0);
		}
		
		
		for ( int i=1; i<5; i++);
		{
			int roll=rand.nextInt(6)+1;
			System.out.print(roll+" ");
			int roll1=rand.nextInt(6)+1;
			System.out.print(roll1+" ");
			int roll2=rand.nextInt(6)+1;
			System.out.print(roll2+" ");
			int roll3=rand.nextInt(6)+1;
			System.out.print(roll3+" ");
			int roll4=rand.nextInt(6)+1;
			System.out.print(roll4+" ");

			nTotal = roll + roll1 + roll2 + roll3 + roll4;
			
		}
		System.out.println("\nThe total dice roll is " + nTotal);
		
		if(nTotal > total) {
			System.out.println("Your total roll went up!");
		}else if(nTotal < total) {
			System.out.println("Your total roll went down!");	
		}else {
			System.out.println("Your total roll stayed the same!");
		}
		
		}while (reroll);
		
	}
}