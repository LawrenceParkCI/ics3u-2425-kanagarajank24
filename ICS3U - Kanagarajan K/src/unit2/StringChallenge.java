package unit2;
import java.util.Scanner;

/**
 * Description: This follows the String Challenge worksheet, in which I take the users input and manipulate it. <br>
 * Date: Nov 8, 2024
 * @author Kaleena Kanagarajan
 */

public class StringChallenge {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		//This is for the portfolio

		/*
    Create a program that demonstrates the use of .equals()(used), .equalsIgnoreCase()(used), .compareTo().  You should be using if statements for this program.

    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
		 */

		Scanner sc = new Scanner (System.in);  

		//Variables
		String userAns;
		double userNum;
		int favNum;
		String friend1, friend2;
		int score = 0;

		System.out.println("General Knowlege Trivia");
		System.out.println("------------------------\n");

		//Ask first question
		System.out.println("Who was the first person to walk on the moon?");
		userAns = sc.nextLine();

		//Check if it is correct
		/*
		 * I used .equalsIgnoreCase() here to check if the user had inputed the correct answer. 
		 * I used .equalsIngoreCase rather than .equals because the user could input "Neil Armstrong", "neil armstrong
		 * or something similar to that, but they would all still be the correct answer. So I must consider this with .equalsIgnoreCase().
		 */
		if(userAns.equalsIgnoreCase("Neil Armstrong")){

			System.out.println("That's correct! Good job.");
			score ++;

		}
		else {

			System.out.println("Sorry wrong answer:(");

		}

		//Ask second question
		System.out.println("\nHow many provinces and territories does Canada have?");
		userAns = sc.nextLine();

		//Check if correct
		/*
		 * I used .equals() here to check if the user had inputed the correct answer. 
		 * This is because, even though the answer is a number, it is still stored in a string value and it is not used in any 
		 * calculations, so it can remain a string. Additionally, you cannot capitalize any of the characters in 13, so there is no 
		 * reason to use .equalsIgnoreCase().
		 */
		if(userAns.equals("13")){

			System.out.println("That's correct! Good job.");
			score ++;

		}
		else {

			System.out.println("Sorry, wrong answer:(");

		}

		//Get user information
		/*
		 * After taking the user information, I explicitly cast it to an integer and double. This is because they are taken a Strings, but I need them as number values
		 * that I can use in calculations. This must be done explicitly, because when changing a bigger value to a smaller one, data can be lost. 
		 */
		System.out.println("\nWhat is your favourite number?");
		userAns = sc.nextLine();
		favNum = Integer.parseInt(userAns);

		//Ask third question
		System.out.println("\nIf your favourite number is x, what is x/100 + 5");
		userAns = sc.nextLine();
		userNum =  Double.parseDouble(userAns);


		//Check answer 
		/*
		 * I explicitly cast the favNum to be a double in the calculation, because it does not get implicitly casted and the answer is most likely a double.
		 * So if we do not cast it, it will not give the correct answer. For example, when favNum = 1, favNum/100 + 5 will be equal to 5. 
		 * But (double) favNum/100 + 5 will be equal to 5.01 (the correct answer).
		 */

		if (userNum == ((double) favNum/100 + 5)) {

			System.out.println("That's correct! Good Job.");
			score ++;

		}
		else {

			System.out.println("Sorry, wrong answer:(");

		}


		//Ask fourth question
		System.out.println("\nIf your favourite number is x, what is - 7.25 + x * 0.5");
		userAns = sc.nextLine();

		//Explicit casting
		userNum = Double.parseDouble(userAns);

		//Check answer 
		if (userNum == (-7.25 + favNum * 0.5)) {

			System.out.println("That's correct! Good Job.");
			score ++;

		}
		else {

			System.out.println("Sorry, wrong answer:(");

		}




		//Get user information

		System.out.println("\nWhat are two of your friends' names?");
		System.out.print("Friend 1: ");
		friend1 = sc.nextLine();

		System.out.print("Friend 2: ");
		friend2 = sc.nextLine();


		//Ask fifth question
		System.out.println("\nWhich of your friends name comes first alphabetically");
		userAns = sc.nextLine();

		//Check Answer
		//I use .compareTo() to compare the two names and find out which one comes alphabetically first. 
		if (friend1.toLowerCase().compareTo(friend2.toLowerCase()) > 0 && userAns.equalsIgnoreCase(friend2)) {

			System.out.println("That's Correct");
			score ++;

		}
		else if (friend1.toLowerCase().compareTo(friend2.toLowerCase()) < 0 && userAns.equalsIgnoreCase(friend1)) {

			System.out.println("That's Correct");
			score ++;

		}
		else {

			System.out.println("Sorry, wrong answer:(");

		}

		//End message
		System.out.println("\nYou scored " + score + "/5.");
		System.out.println("Thank you for playing!");

		sc.close();

	}
}
