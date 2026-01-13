package unit2;
import java.util.Scanner;
/**
Description: This follows the While worksheet. <br>
Date: Nov 21, 2024
@author Kaleena Kanagarajan
 */
public class While {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many people are you planning to see?");

		//Why do you think I coded it this way?
		//Because when we get input for types other than strings multiple times, we often get scanner issues. So when we take everything as a strong then parse it, there are none.
		int numPeople = Integer.parseInt(in.nextLine());

		while (numPeople > 0) {
			System.out.print("What is this person's name? ");

			//Why do you think the variable is declared here?
			String name = in.nextLine();
			System.out.println("Welcome, " + name + "!");

			numPeople = numPeople - 1;
		}


		//Run the code Using the debugger. 
		//Explain the code in your own words
		//This code takes how many people you are inviting, then all their names and says welcome to them.

		//What code is repeated?
		//Because there are multiple guests, which we cannot predicate before the user tells us.

		//When does it decide whether to repeat or not?
		//It is pre-conditional meaning it decides to run before the while code block.


		//What is the condition for repeating?
		// (numPeople > 0)

		//What is the difference between a while loop and a do-while loop?
		// While loop is pre-conditional (checks condition before code block), and do-while is post-conditional (check condition after code block)


		//Create a while loop that asks for a word, 
		//and prints it out 20 times.

		//Variables
		String word;
		int loop = 0;

		//Get user input
		System.out.println("\nPlease input a word and <Enter>.");
		word = in.next();

		while (loop < 20){
			System.out.println(word);
			loop ++;
		}

		in.close();
	}

}
