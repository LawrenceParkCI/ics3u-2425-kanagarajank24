package unit2;
import java.util.Scanner;
/**
Description: This follows the For Challenge 1 worksheet. <br>
Date: Nov 26, 2024
@author Kaleena Kanagarajan
 */

public class ForChallenge1 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		/*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
		 */
		Scanner sc = new Scanner(System.in);

		//Variables
		double start, end, increment;

		//Get user input
		System.out.println("What number would you like to start at?");
		start = sc.nextDouble();

		System.out.println("What number would you like to end at?");
		end = sc.nextDouble();

		System.out.println("How much would you like to count by?");
		increment = sc.nextDouble();

		//For loop for counting
		for(double i = start; i <= end; i += increment) {
			System.out.print(i + " ");
			//to make the program wait for 700 milliseconds between each number, so that it seems like it is counting 
			Thread.sleep(700);
		}


		sc.close();

	}
}