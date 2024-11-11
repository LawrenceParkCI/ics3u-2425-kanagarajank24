package unit2;
import java.util.Scanner;

/**
Description: This completes the Switch 1 worksheet. <br>
Date: Nov 11, 2024
@author Kaleena Kanagarajan
 */

public class Switch1 {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
///*
		System.out.println("What number day is it?");
		int day = in.nextInt();

		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("We don't have that day yet");
			break;
		}
//*/
		//Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result?
		//The result is "We don't have that day yet"

		//What do you think default means?
		//default is basically the same as else. If the value does not satisfy any of the conditions, it will go to default.

		//What do you think break means? What happens when you remove a break?
		//The break stops the program from checking the next case after one is already satisfied. When I remove it, it satisfies the next case after the first, so two days are printed. 


		//Create another program, this time asking what day it is (String), and printing out how many days until the weekend
		
		//To get rid of scanner errors, scan the next line
		in.nextLine();
		
		//Get user input
		System.out.println("\nWhat day is it?");
		String dayName = in.nextLine();

		//Check what the input is and output the correct response 
		switch(dayName.toLowerCase()) {
		case "sunday":
			System.out.println("It is the weekend!");
			break;
		case "monday":
			System.out.println("Oh no! 5 more days until the weekend:(");
			break;
		case "tuesday":
			System.out.println("4 more days until the weekend. You can do it!");
			break;
		case "wednesday":
			System.out.println("Only 3 more days until the weekend!");
			break;
		case "thursday":
			System.out.println("You're almost there! 2 more days until the weekend.");
			break;
		case "friday":
			System.out.println("Just 1 more day until the weekend:)");
			break;
		case "saturday":
			System.out.println("Yay! It's the weekend");
			break;
		default:
			System.out.println("That's not a day!");
			break;
		}
		
		in.close();
	}
}