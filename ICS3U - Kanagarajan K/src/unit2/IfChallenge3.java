package unit2;
import java.util.Scanner;

/**
 * Description: This completes the If Challenge 3 worksheet, in which there is a multiple choice interactive quiz for the user. <br>
 * Date: Nov 13, 2024
 * @author Kaleena Kanagarajan
 */

public class IfChallenge3 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		//This is for the portfolio

		/*
	    Write an interactive quiz. It should ask the user three 
	    multiple-choice or true/false questions about something. 
	    It must keep track of how many they get wrong, and print 
	    out a "score" at the end.

	    Sample:

	    Are you ready for a quiz?  N
	    Okay, here it comes!

	    Q1) What is the capital of Alaska?
	      1) Melbourne
	      2) Anchorage
	      3) Juneau

	    > 3

	    That's right!
		 */

		Scanner sc = new Scanner(System.in);

		//Variables
		String userInput;
		int score = 0;
		int favNum;

		System.out.println("MULTIPLE CHOICE QUIZ");
		System.out.println("---------------------");

		//Question 1
		//Ask question and get input
		System.out.println("1) Who said \"Survival of the fittest\"?");
		System.out.println("a) Jean Lamarck\nb) Charles Darwin\nc) Gregor Mendel");
		System.out.print("\nYour answer(please input a, b or c): ");
		userInput = sc.next();

		//Check answer
		if (userInput.equalsIgnoreCase("b")) {
			System.out.println("That's corect!");
			score ++;
		}
		else {
			System.out.println("Sorry, wrong answer:(");
		}


		//Question 2
		//Ask question and get input
		System.out.println("\n2) When did World War 1 end?");
		System.out.println("a) 1897\nb) 1945\nc) 1918");
		System.out.print("\nYour answer(please input a, b or c): ");
		userInput = sc.next();

		//Check answer
		if (userInput.equalsIgnoreCase("c")) {
			System.out.println("That's corect!");
			score ++;
		}
		else {
			System.out.println("Sorry, wrong answer:(");
		}
		
		//Question 3
		//Get user input
		System.out.println("\nWhat is your favourite number?");
		favNum = sc.nextInt();
		
		//Ask question and get answer
		System.out.println("\n3) If " + favNum + " = x, what is 7x - 2?");
		System.out.println("a) " + (3* favNum - 6) + "\nb) " + (7* favNum - 2) +"\nc) " + (5* favNum));
		System.out.print("\nYour answer(please input a, b or c): ");
		userInput = sc.next();

		//Check answer
		if (userInput.equalsIgnoreCase("b")) {
			System.out.println("That's corect!");
			score ++;
		}
		else {
			System.out.println("Sorry, wrong answer:(");
		}
		
		//End message
		System.out.println("\nYou scored " + score + "/3!");
		System.out.println("Thank you for playing!");
		
		sc.close();

	}
}