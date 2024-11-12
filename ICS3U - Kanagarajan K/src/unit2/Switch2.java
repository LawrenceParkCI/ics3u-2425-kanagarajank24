package unit2;
import java.util.Scanner;

/**
Description: This completes the Switch 2 worksheet. <br>
Date: Nov 12, 2024
@author Kaleena Kanagarajan
 */

public class Switch2 {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {

		/*Create a program that asks for a month, and print out how many days there are in that month. (For "February", just put 28). This will be a part of your portfolio.

    Challenge: Ask for the year, and change "February" to 29 if the year is a leap year (divisible by 4)
		 */

		//Can you create it such that you can remove some breaks?
		// I can do this by grouping the cases, so that the cases with the months with the same amount of days will fall-through each other and reach the same print statement. This requires on one brake statement for each group.
		

		Scanner sc = new Scanner (System.in);

		//Variables
		String month;
		int year = 0;
		
		//Get user input
		System.out.println("Input a month and <Enter>.");
		month = sc.nextLine();

		if (month.equalsIgnoreCase("Febuary")) {
		System.out.println("Input a year and <Enter>.");
		year = sc.nextInt();
		}

		//Check the user input, and output the corresponding answer
		switch (month.toLowerCase()) {

		case "january":
			
		case "march":
			
		case "may":
			
		case "july":

		case "august":
			
		case "october":
			
		case "december":
			System.out.println(month + " has 31 days.");
			break;

		case "febuary":
			if (year % 4 == 0) {
				System.out.println("It's a leap year! Febuary has 29 days.");
			}
			else {
				System.out.println("Febuary has 28 days.");
			}	
			break;

		
		case "april":
			
		case "june":

		case "september":

		case "november":
			System.out.println(month + " has 30 days.");
			break;

		default:
			System.out.println("I don't know that month.");

		}

		sc.close();
	}
}