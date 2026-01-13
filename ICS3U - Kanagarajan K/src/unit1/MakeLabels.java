package unit1;
import java.util.Scanner;
/**
 * Description: This program follows the String Variables Worksheet. <br>
 * Date: Oct 2, 2024
 * @author Kaleena Kanagarajan
 */

public class MakeLabels {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		//Creating the scanner object
		Scanner sc = new Scanner(System.in);
		
		//Creating the fullName variable
		String fullName;
		// This line asks the user to input their name
		System.out.println("Type in your full name and press <Enter>");
		//assigning it the value of the the next line the user inputs
		fullName = sc.nextLine();

		// Creating the subject variable
		String subject;
		// This line asks for user input
		System.out.println("Type in the subject and press <Enter>");
		//assigning it the value of the the next line the user inputs
		subject = sc.nextLine();

		// The program inputs this after you put in your name and subject
		System.out.println();
		System.out.println("************************************");
		System.out.println(fullName);
		System.out.println(subject);
		System.out.println("************************************");
		sc.close();

	}

}
