package unit2;
import java.util.Scanner;
/**
Description: This completes the Loop Challenge 1 worksheet. <br>
Date: Nov 22, 2024
@author Kaleena Kanagarajan
 */
public class LoopChallenge1 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
     Create a program that will ask for the password.  If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.

     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
		 */

		Scanner sc = new Scanner(System.in);

		//Variables
		String pass;
		int loop = 0;


		// Ask for password, and repeat 3 times max if incorrect.
		do {
			System.out.print("Please enter the password: ");
			pass = sc.nextLine();
			loop ++;
			
			if (!pass.equals("Ms.Kemp115") && loop != 3) {
				System.out.println("Sorry, wrong passcode:( Try again.\n");	
			}
			
		} while (!pass.equals("Ms.Kemp115") && loop < 3);

		//Output depending on if the user got the password right, or failed too many times
		if (loop == 3) {
			System.out.println("Sorry, too many incorrect entries. Try again another time.");
		}
		else {
		System.out.println("\nWelcome back!");
		}
		
		sc.close();
	}
}