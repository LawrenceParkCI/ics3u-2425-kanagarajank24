package unit2;
import java.util.Scanner;

/**
 * Description: This completes the If Challenge 2 worksheet. <br>
 * Date: Nov 5, 2024
 * @author Kaleena Kanagarajan
 */

public class IfChallenge2 {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//This is for the portfolio

		/*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
		 */
		
		//Variables
		int num1;
		int num2;
		int num3;
		
		//get user input
		System.out.println("Please input 3 numbers and <Enter> between each one.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//check if strictly in order
		if (num1 < num2 && num2 < num3){
			
			System.out.println("Your numbers are strictly in order!");
			
		}
		else {
			
			System.out.println("Your numbers are not stricly in order :(");
			
		}
		
		sc.close();
	}
}