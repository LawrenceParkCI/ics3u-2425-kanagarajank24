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
		Console c = new Console(70, 150, 15, "Wordle");
		Console s = new Console(10, 10, 15, "Input");

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
		/*
		c.setColor(new Color(120, 178, 123)); 
		c.fillRect(0, 0, 2000, 1000);

		c.setColor(Color.WHITE); 
		c.setFont(new Font("SansSerif", Font.PLAIN, 150)); 
		c.drawString("Wordle", 420, 450);

		Thread.sleep(1000); 
		c.setFont(new Font("SansSerif", Font.PLAIN, 20));
		c.drawString("Hit any key to continue", 550, 510);

		c.getChar(); 
		c.clear();
		// 
		
		 
		//Instructions 
		
		int x = 70;
		int y = 100;

		c.setColor(Color.BLACK);
		c.setFont(new Font("SansSerif", Font.BOLD, 70));
		c.drawString("How to Play", x, y);

		c.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.drawString("- You have 6 chances to guess the wordle", x + 30, y + 70);
		c.drawString("- The colour of the tiles will change to show you how close you were", x + 30, y + 135);

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

		//Continue
		Thread.sleep(2000);
		c.setFont(new Font("SansSerif", Font.BOLD, 35));
		c.drawString("Hit any key to continue", x + 420, y + 790);
		c.getChar();
		*/


		c.clear();
 
		//Player Grid
		
		int x1 = 400;
		int y1 = 150;
		
		c.setColor(Color.BLACK);

		c.setFont(new Font("SansSerif", Font.PLAIN, 70));
		c.drawString("Wordle", x1 + 100, y1 - 50);

		//Guess 1
		c.drawRect(x1, y1, 70, 70);
		c.drawRect(x1 + 90, y1, 70, 70);
		c.drawRect(x1 + 180, y1, 70, 70);
		c.drawRect(x1 + 270, y1, 70, 70);
		c.drawRect(x1 + 360, y1, 70, 70);

		//Guess 2
		c.drawRect(x1, y1 + 90, 70, 70);
		c.drawRect(x1 + 90, y1 + 90, 70, 70);
		c.drawRect(x1 + 180, y1 + 90, 70, 70);
		c.drawRect(x1 + 270, y1 + 90, 70, 70);
		c.drawRect(x1 + 360, y1 + 90, 70, 70);

		//Guess 3
		c.drawRect(x1, y1 + 180, 70, 70);
		c.drawRect(x1 + 90, y1 + 180, 70, 70);
		c.drawRect(x1 + 180, y1 + 180, 70, 70);
		c.drawRect(x1 + 270, y1 + 180, 70, 70);
		c.drawRect(x1 + 360, y1 + 180, 70, 70);

		//Guess 4
		c.drawRect(x1, y1 + 270, 70, 70);
		c.drawRect(x1 + 90, y1 + 270, 70, 70);
		c.drawRect(x1 + 180, y1 + 270, 70, 70);
		c.drawRect(x1 + 270, y1 + 270, 70, 70);
		c.drawRect(x1 + 360, y1 + 270, 70, 70);

		//Guess 5
		c.drawRect(x1, y1 + 360, 70, 70);
		c.drawRect(x1 + 90, y1 + 360, 70, 70);
		c.drawRect(x1 + 180, y1 + 360, 70, 70);
		c.drawRect(x1 + 270, y1 + 360, 70, 70);
		c.drawRect(x1 + 360, y1 + 360, 70, 70);

		//Guess 6
		c.drawRect(x1, y1 + 450, 70, 70);
		c.drawRect(x1 + 90, y1 + 450, 70, 70);
		c.drawRect(x1 + 180, y1 + 450, 70, 70);
		c.drawRect(x1 + 270, y1 + 450, 70, 70);
		c.drawRect(x1 + 360, y1 + 450, 70, 70);


		//for(int i = 0; i < 6; i++) {
		while(guess < 6) {

			//Get user input
			
			c.setCursor(30, 70);
			c.print("Your guess: ");
			c.setCursorVisible(true);
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

			int x2 = 230;

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
				c.fillRect(x2, 240 + 90 * guess, 70, 70);

				c.setFont(new Font("SansSerif", Font.BOLD, 50));
				c.setColor(Color.WHITE);
				if(userArray[j] == 73) {
					c.drawString(userArray[j] + "", x2 + 27, 295 + 90* guess);
				}
				else {
					c.drawString(userArray[j] + "", x2 + 17, 295 + 90* guess);
				}

				x2 += 90;
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
