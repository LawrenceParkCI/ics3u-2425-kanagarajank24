package unit2;

import java.util.Scanner;

/**
 * Description: This program takes an integer from the user and returns if is odd or even. <br>
 * Date: November 1, 2024
 * @author Kaleena Kanagarajan
 */

public class OddEven {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Variables
		int oddEven;
		
		//Get integer
		System.out.println("Please input an integer and <Enter>");
		oddEven = sc.nextInt();
		
		//Check if it is even or odd and tell user
		if(oddEven % 2 == 0) {
			
			System.out.println("Your number is even!");
			
		}
		else {
			
			System.out.println("Your number is odd!");
			
		}
		
		sc.close();
	}

}
