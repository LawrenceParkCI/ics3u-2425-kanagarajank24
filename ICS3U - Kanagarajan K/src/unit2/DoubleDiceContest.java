package unit2;
import java.util.Scanner;
/**
 * Description: This follows the Double Dice Contest worksheet.
 * Date: Nov 18, 2024
 * @author Kaleena Kanagarajan
 */
public class DoubleDiceContest {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */

		Scanner sc = new Scanner (System.in);

		//Variables and random numbers
		int userDice1 = ((int)(Math.random()* 6) + 1);
		int userDice2 = ((int)(Math.random()* 6) + 1);
		int userTotal = userDice1 + userDice2;

		int comDice1 = ((int)(Math.random()* 6) + 1);
		int comDice2 = ((int)(Math.random()* 6) + 1);
		int comTotal = comDice1 + comDice2;

		//Roll the dice
		System.out.println("DICE GAME");
		System.out.println("----------");
		System.out.println("\nHit <Enter> to roll the dice");
		sc.nextLine();

		//Print results
		System.out.println("You got " + userDice1 + " and " + userDice2 + ", or " + userTotal + " Total");
		System.out.println("The computer got " + comDice1 + " and " + comDice2 + ", or " + comTotal + " Total\n");

		//Check who won and output result
		if (userTotal > comTotal) {
			System.out.println("You win!");
		}
		else if(userTotal == comTotal) {
			System.out.println("You tied!");
		}
		else {
			System.out.println("The computer won! You lost:(");
		}

		sc.close();
	}

}
