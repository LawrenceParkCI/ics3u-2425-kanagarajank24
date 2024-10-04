package unit1;
import java.util.Scanner;
/**
 * Description: This program follows the Integer Variables Worksheet. <br>
 * Date: Oct 2, 2024
 * @author Kaleena Kanagarajan
 */
public class RectangleArea {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaring Variable
		int length, width, depth;

		//Get user's input

		System.out.println("AREA PROGRAM");
		System.out.println("------------");

		//Getting Length
		System.out.println("\n Type in the length of the rectangular prism and <Enter>");
		length = sc.nextInt();

		// Getting width
		System.out.println("\n Type in the width of the rectangular prism and <Enter>");
		width = sc.nextInt();
		
		//If this was a rectangle, this would be the area
		int area = width * length;
		
		System.out.println("If this was a rectangle, the area would be " + area + " units sqaured.");

		// Getting depth
				System.out.println("\n Type in the depth of the rectangular prism and <Enter>");
				depth = sc.nextInt();

		// Calculate volume
		int volume = length * width * depth;

		//Print the output
		System.out.println("The volume of the rectangle is " + volume + " units cubed.");

		sc.close();



	}

}
 
