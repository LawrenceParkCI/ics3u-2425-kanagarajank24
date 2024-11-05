package unit2;
import java.util.Scanner;

/**
 * Description:This completes the If Challenge worksheet. <br>
 * Date: Nov 5, 2024
 * @author Kaleena Kanagarajan
 */

public class IfChallenge {


	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*

    (IF)

    ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
		 */

		//Get user input
		System.out.println("What is your favourite number (integers only pls)?");
		int favNum = in.nextInt();

		//Check if negative
		if (favNum < 0) {
			System.out.println("You need to look on the brightside.");
		}

		//Check if odd
		if (favNum % 2 != 0) {
			System.out.println("That's a bit weird");

		}
		



	}
}
