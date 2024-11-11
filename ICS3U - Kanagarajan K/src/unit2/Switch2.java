package unit2;
import java.util.Scanner;

/**
Description: This completes the Switch 2 worksheet. <br>
Date: Nov 11, 2024
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
		/*
		 * To start, we can remove the break in the default statement, because there are no other conditions after to check.
		 * 
		 */

		Scanner sc = new Scanner (System.in);

		//Variables
		String month;
		int year;
		
		//Get user input
		System.out.println("Input a month and <Enter>.");
		month = sc.nextLine();

		System.out.println("Input a year and <Enter>.");
		year = sc.nextInt();


		//Check the user input, and output the corresponding answer
		switch (month.toLowerCase()) {

		case "january":
			System.out.println("January has 31 days.");
			break;

		case "febuary":
			if (year % 4 == 0) {
				System.out.println("It's a leap year! Febuary has 29 days.");
			}
			else {
				System.out.println("Febuary has 28 days.");
			}	
			break;

		case "march":
			System.out.println("March has 31 days.");
			break;

		case "april":
			System.out.println("April has 30 days.");
			break;

		case "may":
			System.out.println("May has 31 days.");
			break;

		case "june":
			System.out.println("June has 30 days.");
			break;

		case "july":
			System.out.println("July has 31 days.");
			break;

		case "august":
			System.out.println("August has 31 days.");
			break;

		case "september":
			System.out.println("Spetember has 30 days.");
			break;

		case "october":
			System.out.println("October has 31 days.");
			break;

		case "november":
			System.out.println("November has 30 days.");
			break;

		case "december":
			System.out.println("December has 31 days.");
			break;

		default:
			System.out.println("I don't know that month.");

		}

		sc.close();
	}
}