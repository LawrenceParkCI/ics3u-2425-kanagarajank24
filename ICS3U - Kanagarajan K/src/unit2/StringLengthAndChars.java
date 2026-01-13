package unit2;
import java.util.Scanner;
/**
Description: This follows the String Length and Chars woksheet. <br>
Date: Nov 26, 2024
@author Kaleena Kanagarajan
 */

public class StringLengthAndChars {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
	      Goal: Using string methods with a for loop
	        .length()
	        .charAt(<position>)
		 */

		String name = "Ms. Kemp";

		//write comments for the following code - what does it print out, and why?

		//8 because there are 8 characters in the String
		System.out.println(name.length());

		//It prints out 's', because in the string 's' is the second character, or in index 1
		System.out.println(name.charAt(1));

		//It prints out '.', because in the string '.' is the third character, or in index 2
		System.out.println(name.charAt(2));

		//It prints out ' ', because in the string ' ' is the second character, or in index 1
		System.out.println(name.charAt(3));

		//.length() gets the length of the String, or the amount of characters
		//.charAt(position) gets the characters located at the given index
		//counting starts at 0.

		/**
      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
		 */
		Scanner sc = new Scanner(System.in);

		//Get name
		System.out.println("What is your name?");
		String userName = sc.nextLine();
		System.out.println(" ");

		//For loop that prints each letter
		for(int i = 0; i < userName.length(); i++) {
			System.out.println(userName.charAt(i));
		}

		sc.close();
	}
}