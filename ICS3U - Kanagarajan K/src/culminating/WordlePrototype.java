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
		Console c = new Console(100, 150, 20, "Wordle");

		Scanner sc = new Scanner(System.in);
		String [] words = {"WEARY", "HAPPY", "MAGIC", "SHIFT", "RUINS"};
		String [] output = new String [5];
		int guess = 0;
		String playAgain = "";


		//User input
		String user = "";
		char[] userArray = new char [5];


		//Chose a random word from words array 
		int randomNum = (int) (Math.random()*(words.length));
		String word = words[randomNum];
		System.out.println("The word is: " + word);

		int [] correct = new int [5];





		//Intro

		c.setColor(new Color(120, 178, 123)); 
		c.fillRect(0, 0, 1000, 1000);

		c.setColor(Color.WHITE); 
		c.setFont(new Font("SansSerif", Font.PLAIN, 100)); 
		c.drawString("Wordle", 290, 475);

		Thread.sleep(1000); 
		c.setFont(new Font("SansSerif", Font.PLAIN, 20));
		c.drawString("Hit any key to continue", 350, 525);

		c.getChar(); 
		c.clear();
		// 
		//Instructions 

		c.setColor(Color.BLACK);
		c.setFont(new Font("SansSerif", Font.BOLD, 70));
		c.drawString("How to Play", 70, 100);

		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("- You have 6 chances to guess the wordle", 100, 170);
		c.drawString("- The colour of the tiles will change to show you how", 100, 235);
		c.drawString("  close you were", 100, 275);

		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("Examples", 70, 375);

		//Green example
		c.setColor(new Color(120, 178, 123)); 
		c.fillRect(100, 420, 70, 70);

		c.setColor(Color.BLACK); 
		c.drawRect(100, 420, 70, 70);
		c.drawRect(190, 420, 70, 70);
		c.drawRect(280, 420, 70, 70);
		c.drawRect(370, 420, 70, 70);
		c.drawRect(460, 420, 70, 70);

		c.setColor(Color.WHITE);
		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("W", 115, 470);

		c.setColor(Color.BLACK);
		c.drawString("O", 210, 470);
		c.drawString("R", 300, 470);
		c.drawString("D", 390, 470);
		c.drawString("Y", 480, 470);

		c.setFont(new Font("SansSerif", Font.BOLD, 30));
		c.drawString("W", 100, 540);
		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("     is in the word and in the correct spot", 100, 540);

		//Yellow example
		c.setColor(Color.BLACK); 
		c.drawRect(100, 590, 70, 70);

		c.setColor(new Color(219, 204, 90)); 
		c.fillRect(190, 590, 70, 70);

		c.setColor(Color.BLACK);  
		c.drawRect(190, 590, 70, 70);
		c.drawRect(280, 590, 70, 70);
		c.drawRect(370, 590, 70, 70);
		c.drawRect(460, 590, 70, 70);


		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("L", 120, 640);

		c.setColor(Color.WHITE);
		c.drawString("I", 220, 640);

		c.setColor(Color.BLACK);
		c.drawString("G", 300, 640);
		c.drawString("H", 390, 640);
		c.drawString("T", 480, 640);

		c.setFont(new Font("SansSerif", Font.BOLD, 30));
		c.drawString("I", 100, 710);
		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("   is in the word but in the wrong spot", 100, 710);

		//Grey example

		c.setColor(Color.BLACK); 
		c.drawRect(100, 760, 70, 70);

		c.setColor(Color.GRAY); 
		c.fillRect(370, 760, 70, 70);

		c.setColor(Color.BLACK);  
		c.drawRect(190, 760, 70, 70);
		c.drawRect(280, 760, 70, 70);
		c.drawRect(370, 760, 70, 70);
		c.drawRect(460, 760, 70, 70);


		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("R", 120, 810);
		c.drawString("O", 210, 810);
		c.drawString("G", 300, 810);

		c.setColor(Color.WHITE);
		c.drawString("U", 390, 810);

		c.setColor(Color.BLACK);
		c.drawString("E", 480, 810);

		c.setFont(new Font("SansSerif", Font.BOLD, 30));
		c.drawString("U", 100, 880);
		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("    is not in the word in any spot", 100, 880);

		//Continue
		Thread.sleep(1000);
		c.setFont(new Font("SansSerif", Font.PLAIN, 20));
		c.drawString("Hit any key to continue", 350, 910);
		c.getChar();



		c.clear();

		//Player Grid
		c.setColor(Color.BLACK);

		c.setFont(new Font("SansSerif", Font.PLAIN, 70));
		c.drawString("Wordle", 330, 150);

		//Guess 1
		c.drawRect(230, 240, 70, 70);
		c.drawRect(320, 240, 70, 70);
		c.drawRect(410, 240, 70, 70);
		c.drawRect(500, 240, 70, 70);
		c.drawRect(590, 240, 70, 70);

		//Guess 2
		c.drawRect(230, 330, 70, 70);
		c.drawRect(320, 330, 70, 70);
		c.drawRect(410, 330, 70, 70);
		c.drawRect(500, 330, 70, 70);
		c.drawRect(590, 330, 70, 70);

		//Guess 3
		c.drawRect(230, 420, 70, 70);
		c.drawRect(320, 420, 70, 70);
		c.drawRect(410, 420, 70, 70);
		c.drawRect(500, 420, 70, 70);
		c.drawRect(590, 420, 70, 70);

		//Guess 4
		c.drawRect(230, 510, 70, 70);
		c.drawRect(320, 510, 70, 70);
		c.drawRect(410, 510, 70, 70);
		c.drawRect(500, 510, 70, 70);
		c.drawRect(590, 510, 70, 70);

		//Guess 5
		c.drawRect(230, 600, 70, 70);
		c.drawRect(320, 600, 70, 70);
		c.drawRect(410, 600, 70, 70);
		c.drawRect(500, 600, 70, 70);
		c.drawRect(590, 600, 70, 70);

		//Guess 6
		c.drawRect(230, 690, 70, 70);
		c.drawRect(320, 690, 70, 70);
		c.drawRect(410, 690, 70, 70);
		c.drawRect(500, 690, 70, 70);
		c.drawRect(590, 690, 70, 70);


		//for(int i = 0; i < 6; i++) {
		while(guess < 6) {

			//Get user input

			c.print("Your guess: ");
			user = c.readLine();
			user = user.toUpperCase();
			
			while(user.length() != 5) {
				c.setTextColor(Color.RED);
				c.print("ERROR: Wrong input. Please try again\n");
				c.setTextColor(Color.BLACK);
				c.print("Your guess: ");
				user = c.readLine();
				user = user.toUpperCase();
			}
			
			userArray = user.toCharArray();

			correct = correctPlace(userArray, word, containsLetter(userArray, word));

			//Delete this method if not needed
			//output = output(userArray, correctPlace(userArray, word, containsLetter(userArray, word)));

			//Decide box colour for letter

			int x = 230;

			for(int j = 0; j < 5; j ++) {

				if(correct[j] == 2) {
					c.setColor(new Color(120, 178, 123));
				}
				else if(correct[j] == 1) {
					c.setColor(new Color(219, 204, 90)); 
				}
				else {
					c.setColor(Color.GRAY);
				}
				c.fillRect(x, 240 + 90 * guess, 70, 70);

				c.setFont(new Font("SansSerif", Font.BOLD, 50));
				c.setColor(Color.WHITE);
				if(userArray[j] == 73) {
					c.drawString(userArray[j] + "", x + 27, 295 + 90* guess);
				}
				else {
					c.drawString(userArray[j] + "", x + 17, 295 + 90* guess);
				}

				x += 90;
			}

			if(word.equals(user)) {

				//c.println("You guessed the word!");
				Thread.sleep(1500);

				c.setColor(new Color(120, 178, 123)); 
				c.fillRect(0, 0, 1000, 1000);

				c.setColor(Color.WHITE); 
				c.setFont(new Font("SansSerif", Font.PLAIN, 70)); 
				c.drawString("You guessed", 240, 425);
				c.drawString("the word!", 300, 500);

				guess = 6;
			}

			guess ++;

		}

		if(!(word.equals(user))) {

			c.setColor(new Color(120, 178, 123)); 
			c.fillRect(0, 0, 1000, 1000);

			c.setColor(Color.WHITE); 
			c.setFont(new Font("SansSerif", Font.PLAIN, 70)); 
			c.drawString("You ran out of", 240, 350);
			c.drawString("guesses", 320, 420);
			c.setFont(new Font("SansSerif", Font.PLAIN, 70));
			c.drawString("The word was: " + word.toLowerCase(), 140, 550);

		}




		sc.close();

	}
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
