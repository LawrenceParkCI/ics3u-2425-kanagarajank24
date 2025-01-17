package culminating;

import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;
import hsa_new.Console;

/**
Description: This program is a copy of the New York Time game, Wordle. In this game, players my try to guess a five letter word in six tries <br>
Date: January 16, 2025
@author Kaleena Kanagarajan
 */
public class Wordle {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 * @throws InterruptedException 
	 */	
	public static void main(String[] args) throws InterruptedException {
		Console c = new Console(70, 150, 10, "Wordle");
		Scanner sc = new Scanner(System.in);

		//Variables
		String [] words = {"WEARY", "MAGIC", "SHIFT", "RUINS", "ABOUT", "ALIVE", "ALERT", "BUYER", "CHAIN", "DEPTH", "DEBUT", "EQUAL", "EXTRA", "FRAME", 
				"FRAUD", "GUARD", "HOTEL", "HORSE", "INDEX", "IRONY", "JUICE", "JOINT", "KINGS", "LOGIC", "LASER", "MONEY", "MUSIC",  "OCEAN", "ORDER", 
				"PAINT", "RATIO", "READY", "QUICK", "SIXTH", "SHAPE", "TODAY", "TOPIC", "UNITY", "UPSET", "VAILD", "VALUE", "WORSE", "WATER", "VIRUS", "VOICE"};

		//To help chose a random word from the words array
		int randomNum;
		String word;

		//User input
		String user = "";
		char[] userArray = new char [5];
		String playAgain = "";

		int [] correct = new int [5]; // To hold the correctness of the user's guesses

		int guessCount;

		//x and y coordinates for graphics
		int x = 70;
		int y = 100;
		int x1 = 230;
		int y1 = 240;


		//Start Page
		c.setColor(new Color(120, 178, 123)); 
		c.fillRect(0, 0, 1000, 1000);

		c.setColor(Color.WHITE); 
		c.setFont(new Font("SansSerif", Font.PLAIN, 125)); 
		c.drawString("Wordle", 250, 450);

		Thread.sleep(1000); 
		c.setFont(new Font("SansSerif", Font.PLAIN, 20));
		c.drawString("Hit any key to start", 360, 510);

		c.getChar(); 
		c.clear();


		//Rules Page 
		//x and y variables are used here

		c.setColor(Color.BLACK);
		c.setFont(new Font("SansSerif", Font.BOLD, 70));
		c.drawString("How to Play", x, y);

		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("- You have 6 chances to guess the wordle", x + 30, y + 70);
		c.drawString("- The colour of the tiles will change to show you how", x + 30, y + 115);
		c.drawString("   close you were", x + 30, y + 155);

		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("Examples", x, y + 220);

		//Green example
		c.setColor(new Color(120, 178, 123)); 
		c.fillRect(x + 30, y + 265, 70, 70);

		c.setColor(Color.BLACK); 
		c.drawRect(x + 30, y + 265, 70, 70);
		c.drawRect(x + 120, y + 265, 70, 70);
		c.drawRect(x + 210, y + 265, 70, 70);
		c.drawRect(x + 300, y + 265, 70, 70);
		c.drawRect(x + 390, y + 265, 70, 70);

		c.setColor(Color.WHITE);
		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("W", x + 45, y + 315);

		c.setColor(Color.BLACK);
		c.drawString("O", x + 140, y + 315);
		c.drawString("R", x + 230, y + 315);
		c.drawString("D", x + 320, y + 315);
		c.drawString("Y", x + 410, y + 315);

		c.setFont(new Font("SansSerif", Font.BOLD, 30));
		c.drawString("W", x + 30, y + 395);

		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("     is in the word and in the correct spot", x + 30, y + 395);

		//Yellow example
		c.setColor(Color.BLACK); 
		c.drawRect(x + 30, y + 445, 70, 70);

		c.setColor(new Color(219, 204, 90)); 
		c.fillRect(x + 120, y + 445, 70, 70);

		c.setColor(Color.BLACK);  
		c.drawRect(x + 120, y + 445, 70, 70);
		c.drawRect(x + 210, y + 445, 70, 70);
		c.drawRect(x + 300, y + 445, 70, 70);
		c.drawRect(x + 390, y + 445, 70, 70);


		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("L", x + 50, y + 495);

		c.setColor(Color.WHITE);
		c.drawString("I", x + 150, y + 495);

		c.setColor(Color.BLACK);
		c.drawString("G", x + 230, y + 495);
		c.drawString("H", x + 320, y + 495);
		c.drawString("T", x + 410, y + 495);

		c.setFont(new Font("SansSerif", Font.BOLD, 30));
		c.drawString("I", x + 30, y + 565);

		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("   is in the word but in the wrong spot", x + 30, y + 565);

		//Grey example
		c.setColor(Color.BLACK); 
		c.drawRect(x + 30, y + 615, 70, 70);

		c.setColor(Color.GRAY); 
		c.fillRect(x + 300, y + 615, 70, 70);

		c.setColor(Color.BLACK);  
		c.drawRect(x + 120, y + 615, 70, 70);
		c.drawRect(x + 210, y + 615, 70, 70);
		c.drawRect(x + 300, y + 615, 70, 70);
		c.drawRect(x + 390, y + 615, 70, 70);

		c.setFont(new Font("SansSerif", Font.BOLD, 40));
		c.drawString("R", x + 50, y + 665);
		c.drawString("O", x + 140, y + 665);
		c.drawString("G", x + 230, y + 665);

		c.setColor(Color.WHITE);
		c.drawString("U", x + 320, y + 665);

		c.setColor(Color.BLACK);
		c.drawString("E", x + 410, y + 665);

		c.setFont(new Font("SansSerif", Font.BOLD, 30));
		c.drawString("U", x + 30, y + 735);

		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("    is not in the word in any spot", x + 30, y + 735);


		Thread.sleep(2000);
		c.setFont(new Font("SansSerif", Font.BOLD, 35));
		c.drawString("Hit any key to continue", x + 200, y + 790);

		c.getChar();


		do { // Do-While loop, so that user can play multiple times

			//reset before starting each game
			c.clear(); 

			randomNum = (int) (Math.random()*(words.length));
			word = words[randomNum];

			x1 = 230;
			y1 = 240;

			//Player Grid
			//x1 and y1 variables are used here

			c.setColor(Color.BLACK);
			c.setFont(new Font("SansSerif", Font.PLAIN, 70));
			c.drawString("Wordle", x1 + 100, y1 - 50);

			//Row 1
			c.drawRect(x1, y1, 70, 70);
			c.drawRect(x1 + 90, y1, 70, 70);
			c.drawRect(x1 + 180, y1, 70, 70);
			c.drawRect(x1 + 270, y1, 70, 70);
			c.drawRect(x1 + 360, y1, 70, 70);

			//Row 2
			c.drawRect(x1, y1 + 90, 70, 70);
			c.drawRect(x1 + 90, y1 + 90, 70, 70);
			c.drawRect(x1 + 180, y1 + 90, 70, 70);
			c.drawRect(x1 + 270, y1 + 90, 70, 70);
			c.drawRect(x1 + 360, y1 + 90, 70, 70);

			//Row 3
			c.drawRect(x1, y1 + 180, 70, 70);
			c.drawRect(x1 + 90, y1 + 180, 70, 70);
			c.drawRect(x1 + 180, y1 + 180, 70, 70);
			c.drawRect(x1 + 270, y1 + 180, 70, 70);
			c.drawRect(x1 + 360, y1 + 180, 70, 70);

			//Row 4
			c.drawRect(x1, y1 + 270, 70, 70);
			c.drawRect(x1 + 90, y1 + 270, 70, 70);
			c.drawRect(x1 + 180, y1 + 270, 70, 70);
			c.drawRect(x1 + 270, y1 + 270, 70, 70);
			c.drawRect(x1 + 360, y1 + 270, 70, 70);

			//Row 5
			c.drawRect(x1, y1 + 360, 70, 70);
			c.drawRect(x1 + 90, y1 + 360, 70, 70);
			c.drawRect(x1 + 180, y1 + 360, 70, 70);
			c.drawRect(x1 + 270, y1 + 360, 70, 70);
			c.drawRect(x1 + 360, y1 + 360, 70, 70);

			//Row 6
			c.drawRect(x1, y1 + 450, 70, 70);
			c.drawRect(x1 + 90, y1 + 450, 70, 70);
			c.drawRect(x1 + 180, y1 + 450, 70, 70);
			c.drawRect(x1 + 270, y1 + 450, 70, 70);
			c.drawRect(x1 + 360, y1 + 450, 70, 70);

			Console c1 = new Console(30, 20, 15, "Input"); //Console for user input

			guessCount = 0; //Assign to 0 here, so that it reset after each game

			while(guessCount < 6) {

				//Get user input
				c1.print("Your guess: ");
				c1.setCursorVisible(true);
				user = c1.readLine();
				user = user.toUpperCase();

				//To handle input errors (if input is not 5 characters or it does not have only letters)
				while((user.length() != 5) || (user.charAt(0) < 65 || user.charAt(0) > 90 || user.charAt(1) < 65 || user.charAt(1) > 90 || user.charAt(2) < 65 || 
						user.charAt(2) > 90 || user.charAt(3) < 65 || user.charAt(3) > 90 || user.charAt(4) < 65 || user.charAt(4) > 90)) {

					c1.setTextColor(Color.RED);
					c1.print("ERROR: Wrong input. Please try again\n");
					c1.setTextColor(Color.BLACK);
					c1.print("Your guess: ");
					user = c1.readLine();
					user = user.toUpperCase();
				}

				//Turn user's input into an array of letter, so that it can be put in correctPlace and containsLetter methods
				userArray = user.toCharArray();

				correct = containsLetter(userArray, word, correctPlace(userArray, word));

				x1 = 230; //Re-intialize so that it is reset after every guess.

				for(int j = 0; j < 5; j ++) {

					//Output box
					//Choose box colour according to correctness
					if(correct[j] == 2) {

						c.setColor(new Color(120, 178, 123));

					}
					else if(correct[j] == 1) {

						c.setColor(new Color(219, 204, 90)); 

					}
					else {

						c.setColor(Color.GRAY);

					}

					c.fillRect(x1, y1 + 90 * guessCount, 70, 70);

					c.setFont(new Font("SansSerif", Font.BOLD, 50));
					c.setColor(Color.WHITE);

					//Output Letters
					//Position the letter i (ASCII code 73) differently to center it on the box
					if(userArray[j] == 73) {

						c.drawString(userArray[j] + "", x1 + 27, 295 + 90* guessCount);

					}
					else {

						c.drawString(userArray[j] + "", x1 + 17, 295 + 90* guessCount);

					}

					x1 += 90;
				}

				if(word.equals(user)) {

					//Pause before moving to next screen
					Thread.sleep(1500);

					c1.close();
					c.clear();

					c.setColor(new Color(120, 178, 123)); 
					c.fillRect(0, 0, 1000, 1000);

					//Winning Message
					c.setColor(Color.WHITE); 
					c.setFont(new Font("SansSerif", Font.PLAIN, 70)); 
					c.drawString("You guessed", 240, 425);
					c.drawString("the word!", 305, 500);

					Thread.sleep(1000);
					c.setFont(new Font("SansSerif", Font.PLAIN, 35));
					c.drawString("Hit any key to continue", 270, 600);
					c.getChar();


					c.clear();

					c.setColor(new Color(120, 178, 123)); 
					c.fillRect(0, 0, 1000, 1000);

					//Ask user if they want to play again
					c.setFont(new Font("SansSerif", Font.PLAIN, 70)); 
					c.setColor(Color.WHITE); 
					c.drawString("Do you want play again?", 100, 425);
					c.drawString("Input y for yes and n for no", 50, 500);

					Console c2 = new Console (10, 20, 15, "Play Again"); //Another console for user input
					c2.print("You answer: ");
					playAgain = c2.readLine();

					//To handle user input errors
					while(!(playAgain.equalsIgnoreCase("y")) && !(playAgain.equalsIgnoreCase("n"))) {

						c2.setTextColor(Color.RED);
						c2.print("ERROR: Wrong input. Please try again\n");

						c2.setTextColor(Color.BLACK);
						c2.print("Your answer: ");
						playAgain = c2.readLine();

					}

					c2.close();

					guessCount = 6; //To break loop
				}

				guessCount ++;

			}

			if(!(word.equals(user))) {

				//Pause before moving to next screen
				Thread.sleep(1500);

				c1.close();
				c.clear();

				c.setColor(new Color(120, 178, 123)); 
				c.fillRect(0, 0, 1000, 1000);

				//Losing Message
				c.setColor(Color.WHITE); 
				c.setFont(new Font("SansSerif", Font.PLAIN, 70)); 
				c.drawString("You ran out of", 240, 350);
				c.drawString("guesses", 320, 420);
				c.setFont(new Font("SansSerif", Font.PLAIN, 70));
				c.drawString("The word was: " + word.toLowerCase(), 140, 550);

				Thread.sleep(1000); 
				c.setFont(new Font("SansSerif", Font.PLAIN, 35));
				c.drawString("Hit any key to continue", 260, 650);
				c.getChar();

				c.clear();

				c.setColor(new Color(120, 178, 123)); 
				c.fillRect(0, 0, 1000, 1000);

				//Ask user if they want to play again
				c.setFont(new Font("SansSerif", Font.PLAIN, 70)); 
				c.setColor(Color.WHITE); 
				c.drawString("Do you want play again?", 100, 425);
				c.drawString("Input y for yes and n for no", 50, 500);

				Console c2 = new Console (10, 20, 15, "Play Again"); //Another console for user input
				c2.print("You answer: ");
				playAgain = c2.readLine();

				//To handle user input errors
				while(!(playAgain.equalsIgnoreCase("y")) && !(playAgain.equalsIgnoreCase("n"))) {

					c2.setTextColor(Color.RED);
					c2.print("ERROR: Wrong input. Please try again\n");

					c2.setTextColor(Color.BLACK);
					c2.print("Your answer: ");
					playAgain = c2.readLine();

				}

				c2.close();

			}

		} while (playAgain.equalsIgnoreCase("y"));


		c.clear();

		//Ending Message
		c.setColor(new Color(120, 178, 123)); 
		c.fillRect(0, 0, 1000, 1000);

		c.setColor(Color.WHITE); 
		c.setFont(new Font("SansSerif", Font.PLAIN, 70)); 
		c.drawString("Thank You for Playing!", 100, 450);

		Thread.sleep(1500);
		c.close();

		sc.close();

	}

	/**
	 *Description: This method checks if any of the letters in the user’s guess are in the correct word.
	 *@param userArray -> This is the user’s guess, which is stored in an array of characters
	 *@param word -> This is the correct word
	 *@param correctness -> array, which is returned from correctPlacement method, that stores integers indicating which letters are in the correct place
	 *@return an array of integers where 0s will represent incorrect letters, correct with wrong placement will be 1s, and correct placement will be 2s.
	 */
	public static int []containsLetter(char[] userArray, String word, int [] correctness) {
		int[] letterCounts = new int[26]; // This holds a space to count the occurrences of every letter in the alphabet

		// Count letter occurrences in the word
		char[] wordArray = word.toCharArray(); 
		for (int i = 0; i < 5; i++) {

			letterCounts[wordArray[i] - 'A']++; // This adds one to the space that holds the quantity of wordArray[i]
		}

		for (int i = 0; i < 5; i++) {

			if(correctness[i] == 2) { // This deals with duplicate letter issues

				letterCounts[wordArray[i] - 'A']--;
			}

			if (correctness[i] != 2) { // Only check letters not already marked correct by correctPlace method

				if (letterCounts[userArray[i] - 'A'] > 0) {

					correctness[i] = 1;
					letterCounts[userArray[i] - 'A']--; 
				} 
				else {
					correctness[i] = 0;
				}
			}
		}

		return correctness;
	}


	/**
	 *Description: This method checks if the correct letters in user’s guess are in the correct place
	 *@param  userArray -> This is the user’s guess, which is stored in an array of characters
	 *@param word -> This is the correct word
	 *@return an array of integers where 0s will represent letters with incorrect placement, and 2s for correct letter and placement
	 */
	public static int []correctPlace(char[] userArray, String word) {
		int [] correctness = new int [5]; // Stores integers which indicate the correctness of each letter

		for (int i = 0; i < 5; i++) {

			if(word.charAt(i) == userArray[i]) {
				correctness[i] = 2;

			}
		}
		return correctness;
	}
}