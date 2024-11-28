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
		String favNum = in.nextLine();
		int num = Integer.parseInt(favNum);

		
		//Check if negative
		if (num < 0) {
			
			System.out.println("You need to look on the brightside.");
			
		}

		//Check if odd
		if (num % 2 != 0) {
			
			System.out.println("That's a bit weird.");

		}
		
		//Check is divisible by 2 and 3
		if (num % 2 == 0 && num % 3 == 0) {
			
			System.out.println("You should consider 6.");
			
		}
		else {
			
			System.out.println("You can keep wholesome.");
			
		}
		
		//Check ones place digit
		
		//Instead of the actual numbers 8 and 9, I used their ASCII code, because the ones place I am finding below is also an ASCII value.
		if ((favNum.charAt(favNum.length() - 1)) == 56) {
			
			System.out.println("You are too full.");
			
		}
		else if (favNum.charAt(favNum.length() - 1) == 57) {
			
			System.out.println("Canada is a nice country");
			
		}
		else {
			
			System.out.println("\"don't count on it\"");
		}
		

		in.close();

	}
}
