package unit1;
import java.util.Scanner;
/**
 * Description: This programs follows the Characters Variables Worksheet. <br>
 * Date: Oct 3, 2024
 * @author Kaleena Kanagarajan
 */
public class InputChars {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaring my variables
		char ch1, ch2, ch3;
		
		//Input prompt
		System.out.println("Type in any three chracters on the keyboard");
		System.out.println("Press <Enter> after each");
		
		//Assigning my variables values
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);

		//Print a blank line
		System.out.println();
		
		//Print out the three characters (this was shows the sum of the ascii values)
		System.out.println("Together these 3 letters spell: " + (ch1 + ch2 + ch3));
		
		//Print out the three characters (this show the chars as a string)
		System.out.println("Together these 3 letters spell: " + ch1 + ch2 + ch3);
		
		sc.close();



	}

}
