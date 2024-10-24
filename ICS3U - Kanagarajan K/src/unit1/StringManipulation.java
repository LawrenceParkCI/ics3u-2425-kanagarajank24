package unit1;
import java.util.Scanner;
/**
 * Description: This program completes Part 3: String Manipulation of Assignment 2. <br>
 * Date: Oct 5, 2024
 * @author Kaleena Kanagarajan
 */
public class StringManipulation {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Asks for the user’s input
		System.out.println("Please input and string and <Enter>");
		//Creates a variable, which stores the string
		String str = sc.nextLine();
		//Output
		System.out.println("\n" + str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		//Bonus
		//First Word
		int i = str.indexOf(" ");
		System.out.println(str.substring(0,i));

		//Last Word
		System.out.println(str.substring(i + 1));

		sc.close();
	}
}

