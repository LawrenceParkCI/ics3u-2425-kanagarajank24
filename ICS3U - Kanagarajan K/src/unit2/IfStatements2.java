package unit2;
import java.util.Scanner;

/**
 * Description: This completes the If Statements 2 worksheet. <br>
 * Date: Nov 5, 2024
 * @author Kaleena Kanagarajan
 */

public class IfStatements2 {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your age?");
		int userAge = in.nextInt();
		/*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
		 */
		//Looking at the logic above, why do you think the 
		//program won't work? 
		// This program will not work, because the output variable title is declared inside of the if statement.
		//If the condition is false, that code will not run, title will never be created and an error will come when title is called.

		//Copy the code below, and try to find a solution.
		//Comment the code above to avoid compilation errors.
		
		//Declare Title
		String title;
		
		if (userAge > 18) { //If they're over 18, they are titled an adult
			title = "Adult";
			System.out.println(title);
		} 
		else {  //if they're not over 18, I don't want a title
			
			System.out.println("Sorry, not quite yet.");
		}

	
	}
}