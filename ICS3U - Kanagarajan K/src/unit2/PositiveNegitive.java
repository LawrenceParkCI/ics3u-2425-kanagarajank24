package unit2;

import java.util.Scanner;
/**
 * Description: This program takes an integer from the user and returns if is positive or negitive and if it is divisible by 7.<br>
 * Date: November 1, 2024
 * @author Kaleena Kanagarajan
 */

public class PositiveNegitive {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int posNeg;

		//Get user input
		System.out.println("Please input an integer and <Enter>");
		posNeg = sc.nextInt();
		
		//Check if positive or negitive and tell user
		if (posNeg == 0) {
			System.out.println("Your number is neither negitive nor positive. It is 0!");
		}
		else{
			if (posNeg > 0) {
				System.out.println("Your number is positive!");
			}
			else{
				System.out.println("Your number is negitive!");
			}
			
		}

		//Check if it is divisible by 7 and tell user
		if (posNeg % 7 == 0){
			System.out.println("Your number is divisible by 7 :)");
		}
		else{
			System.out.println("Your number is not divisble by 7 :(");
		}

		sc.close();

	}

}
