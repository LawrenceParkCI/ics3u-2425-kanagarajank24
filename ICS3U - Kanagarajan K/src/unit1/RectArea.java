package unit1;
import java.util.Scanner;
/**
 * Description: This program follows the Integer Variables Worksheet. <br>
 * Date: Oct 2, 2024
 * @author Kaleena Kanagarajan
 */
public class RectArea {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaring Variable
		int length, width;

		//Get user's input

		System.out.println("AREA PROGRAM");
		System.out.println("------------");

		//Getting Length
		System.out.println("\n Type in the length of the rectangle and <Enter>");
		length = sc.nextInt();

		// Getting width
		System.out.println("\n Type in the width of the rectangle and <Enter>");
		width = sc.nextInt();

		// Calculate area
		int area = length * width;

		//Print the output
		System.out.println("The area of the rectangle is" + area + "units sqaured.");
		
		sc.close();



	}

}
