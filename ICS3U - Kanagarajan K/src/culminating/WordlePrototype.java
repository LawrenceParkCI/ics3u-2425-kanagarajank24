package culminating;
import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

import hsa_new.Console;

/**
Description: This program is where I am planning and testing my Wordle Final project. <br>
Date: Jan 8, 2025
@author Kaleena Kanagarajan
 */
public class WordlePrototype {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 * @throws InterruptedException 
	 */	
	//static Console c; <- add this in real program so that the console applies to all methods?
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Things to add
		 * - Handle User error
		 * - Comment
		 * - Graphics
		 * - Music
		 * - If I have time, add score storing method
		 */
		Console c = new Console(100, 150, 10, "Wordle");
		
		Scanner sc = new Scanner(System.in);
		String [] words = {"weary", "happy", "magic", "shift", "ruins"};
		String [] output = new String [5];
		int guess = 0;


		//User input
		String user;
		char[] userArray = new char [5];


		//Chose a random word from words array 
		int randomNum = (int) (Math.random()*(words.length));
		String word = words[randomNum];
		System.out.println("The word is: " + word);

		int [] correct = new int [5];
		
		
		
		
		
		//Intro
		/*
		c.setColor(new Color(120, 178, 123)); 
		c.fillRect(0, 0, 1000, 1000);
		c.setTextColor(Color.WHITE); 
		c.setColor(Color.WHITE); 
		c.setFont(new Font("SansSerif", Font.PLAIN, 100)); 
		c.drawString("Wordle", 290, 475);
		  
		//Thread.sleep(1000); 
		c.setFont(new Font("SansSerif", Font.PLAIN, 20));
		c.drawString("Hit any key to continue", 350, 525);
		  
		c.getChar(); 
		c.clear();
		 */
		//Instructions 
		
		c.setColor(Color.BLACK);
		c.setFont(new Font("SansSerif", Font.BOLD, 70));
		c.drawString("How to Play", 70, 100);
		
		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("- You have 6 chances to guess the wordle", 100, 200);
		c.drawString("- The colour of the tiles will change to show you how", 100, 265);
		c.drawString("  close you were", 100, 305);
		
		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("Examples", 70, 405);
		
		c.setColor(new Color(120, 178, 123)); 
		c.fillRect(100, 450, 70, 70);
		
		c.setColor(new Color(0, 0, 0)); 
		c.drawRect(100, 450, 70, 70);
		c.drawRect(190, 450, 70, 70);
		c.drawRect(280, 450, 70, 70);
		c.drawRect(370, 450, 70, 70);
		c.drawRect(460, 450, 70, 70);
		
		c.setColor(Color.WHITE);
		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("W", 115, 500);
		
		c.setColor(Color.BLACK);
		c.drawString("O", 210, 500);
		c.drawString("R", 300, 500);
		c.drawString("D", 390, 500);
		c.drawString("Y", 480, 500);
		
		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("W", 100, 570);
		c.setFont(new Font("SansSerif", Font.PLAIN, 40));
		c.drawString("     is in the word and in the correct spot", 100, 570);
		
		



		//test containsLetter

		//int [] test = ;

		//guess
		for(int i = 0; i < 6; i++) {

			//Get user input
			System.out.println("What is your guess?");
			user = sc.nextLine();
			userArray = user.toLowerCase().toCharArray();
			
			correct = correctPlace(userArray, word, containsLetter(userArray, word));
			
			output = output(userArray, correctPlace(userArray, word, containsLetter(userArray, word)));

			//Print out guess to grid
			System.out.printf("%-5s%-5s%-5s%-5s%-5s\n\n", output[0], output[1], output[2], output[3], output[4]);
			
			if(word.equals(user)) {
				break;
			}
			
			guess ++;
		
		}
		
		if(guess < 6) {
			System.out.println("You guessed the word!");
		}
		else {
			System.out.println("The word was " + word + ". You lose :(");
		}
	
		
		


		sc.close();

	}

	//how do I check for duplicates?
	//when checking if green or yellow, check arrays duplicate letters or make array with 5 characters, but if correct, put 0 in chars place


	//Maybe combine the methods
	//This Method Words
	/**
	 *Description: This method checks if any of the letters in the user’s guess are in the correct word.
	 *@param userArray -> This is the user’s guess, which is stored in an array of characters
	 *@param word -> This is the correct word
	 *@return an array of integers where 0s will represent incorrect letters, and correct will be 1s.
	 */
	public static int []containsLetter(char[] userArray, String word) {
		int [] correctness = new int [5];
		int indexOf;

		//to check for duplicates
		boolean [] dupes = {true, true, true, true, true};

		for (int i = 0; i < 5; i++) {

			indexOf = word.indexOf(userArray[i]);


			if(indexOf != -1 && dupes[indexOf]) {
				correctness[i] = 1;
				dupes[indexOf] = false;

			}
			else {
				correctness[i] = 0;

			}

		}

		return correctness;
	}

	//This Methods Works
	/**
	 *Description: This method checks if the correct letters in user’s guess are in the correct place
	 *@param  userArray -> This is the user’s guess, which is stored in an array of characters
	 *@param word -> This is the correct word
	 *@param correctness -> array, which is returned from containsLetter method, that stores how correct each letter in the user's guess is
	 *@return an array of integers where 0s will represent letters with incorrect placement, and 2s for correct letter and placement
	 */
	public static int []correctPlace(char[] userArray, String word, int [] correctness) {

		for (int i = 0; i < 5; i++) {

			if(word.charAt(i) == userArray[i]) {
				correctness[i] = 2;
			}
		}

		return correctness;
	}

	/**
	 *Description: This method will create the output for the letter based on their correctness
	 *@param  userArray -> This is the user’s guess, which is stored in an array of characters
	 *@param correctness -> the array which holds the correctness of each letter in the user's guess, which is returned from correctPlace
	 *@return an array of string where the a letter and symbol according to correctness (x for wrong, - for wrong placement and + for correct) will be stored.
	 */
	public static String []output(char[] userArray, int[] correctness) {
		String[] output = new String [5];

		for(int i = 0; i < 5; i ++) {
			if(correctness[i] == 0) {
				output[i] =  userArray[i] + "x";
			}
			else if(correctness[i] == 1) {
				output[i] =  userArray[i] + "-";
			}
			else {
				output[i] =  userArray[i] + "+";
			}
		}
		
		return output;
	}





}
