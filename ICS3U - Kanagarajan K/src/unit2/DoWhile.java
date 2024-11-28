package unit2;
import java.util.Scanner;
/**
Description: This follows the Do While worksheet. <br>
Date: Nov 21, 2024
@author Kaleena Kanagarajan
 */
public class DoWhile {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
		 */

		Scanner in = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = in.nextLine();
		} while (!name.equals("Mr. Lee"));

		System.out.println("You are welcome into the secret secret pogchamp club.");



		//Run the code. Explain the code in your own words

		//What code is repeated?
		//Because the while condition is satisfied, and the code in the do block will continue to run until it is not.

		//When does it decide whether to repeat or not?
		// It decides to repeat when it reads the while condition. Since the condition comes seconds, the code will always run once before checking it.

		//What is the condition for repeating?
		// (!name.equals("Mr. Lee")) is the condition. It is true when name is not Mr. Lee.


		/*
    Note:Pay attention to the brackets, and the semicolon
		 */

		/*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
		 */

		//Create a do-while loop that asks for a word, and 
		//prints it out 20 times.

		//Variables
		String word;
		int loop = 0;

		//Get user input
		System.out.println("\nPlease input a word and <Enter>.");
		word = in.next();

		do{
			System.out.println(word);
			loop ++;
		} while (loop < 20);

		in.close();
	}
}