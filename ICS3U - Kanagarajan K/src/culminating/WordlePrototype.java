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
	public static void main(String[] args) throws InterruptedException {
		Console c = new Console(70, 150, 10, "Wordle");
		Scanner sc = new Scanner(System.in);
		
		//Variables
		String [] words = {"WEARY", "HAPPY", "MAGIC", "SHIFT", "RUINS", "ABOUT", "ALIVE", "ALERT", "BOOST", "BUYER", "CARRY", "CHAIN", "DEPTH", "DEBUT", "EQUAL", 
				"EXTRA", "FRAME", "FRAUD", "GUESS", "GUARD", "HOTEL", "HORSE", "INDES", "IRONY", "JUICE", "JOINT", "KNOWN", "KINGS", "LOGIC", "LASER", "MONEY", "MUSIC", 
				"NEEDS", "NEVER", "OCEAN", "ORDER", "PAINT", "PAPER", "RATIO", "READY", "QUICK", "QUEEN", "SIXTH", "SHAPE", "TODAY", "TOPIC", "UNITY", "UPSET", "VAILD", 
				"VALUE", "WORSE", "WATER", "VIRUS", "VOICE"};
		int guess;

		//User input
		String user = "";
		char[] userArray = new char [5];
		String playAgain = "";

		//Chose a random word from words array 
		int randomNum = (int) (Math.random()*(words.length));
		String word = words[randomNum];
		System.out.println("The word is: " + word);

		// will holds the correctness of the user's guess
		int [] correct = new int [5];
		
		int x = 70;
		int y = 100;
		int x1 = 230;
		int y1 = 240;

		//Check what happens when anything other than letters is inputted
		//Ex. check if four letters and 1 space or something.

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
		 
		//Instructions Page 
		// x and y variables are used here
		
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

		//Continue
		Thread.sleep(2000);
		c.setFont(new Font("SansSerif", Font.BOLD, 35));
		c.drawString("Hit any key to continue", x + 200, y + 790);
		c.getChar();
		
		
		do {
			c.clear();
	 
			//Player Grid
			//x1 and y1 variables are used here
			
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
			
			//New console for user input
			Console s = new Console(30, 20, 15, "Input");
			
			guess = 0;
	
			while(guess < 6) {
				
				//Get user input
				
				s.print("Your guess: ");
				s.setCursorVisible(true);
				user = s.readLine();
				user = user.toUpperCase();
				
				//Check is user put correct input, and if not, handle it
				while(user.length() != 5) {
					
					s.setTextColor(Color.RED);
					s.print("ERROR: Wrong input. Please try again\n");
					s.setTextColor(Color.BLACK);
					s.print("Your guess: ");
					user = s.readLine();
					user = user.toUpperCase();
				}
				
				//Turn user's input into an array of letter, so that it can be put in correctPlace and containsLetter Methods
				userArray = user.toCharArray();
	
				correct = correctPlace(userArray, word, containsLetter(userArray, word));
				
				//Use x1 value to align boxes
				//Re-intialize so that it is reset after every guess.
				x1 = 230;
	
				for(int j = 0; j < 5; j ++) {
					
					//maybe put colour output in a method
					if(correct[j] == 2) {
						c.setColor(new Color(120, 178, 123));
					}
					else if(correct[j] == 1) {
						c.setColor(new Color(219, 204, 90)); 
					}
					else {
						c.setColor(Color.GRAY);
					}
					c.fillRect(x1, y1 + 90 * guess, 70, 70);
	
					c.setFont(new Font("SansSerif", Font.BOLD, 50));
					c.setColor(Color.WHITE);
					if(userArray[j] == 73) {
						c.drawString(userArray[j] + "", x1 + 27, 295 + 90* guess);
					}
					else {
						c.drawString(userArray[j] + "", x1 + 17, 295 + 90* guess);
					}
	
					x1 += 90;
				}
	
				if(word.equals(user)) {
					
					//Pause before moving to next screen
					Thread.sleep(1500);
					
					s.close();
					c.clear();
					
					c.setColor(new Color(120, 178, 123)); 
					c.fillRect(0, 0, 1000, 1000);
	
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
					
					c.setFont(new Font("SansSerif", Font.PLAIN, 70)); 
					c.setColor(Color.WHITE); 
					c.drawString("Do you want play again?", 100, 425);
					c.drawString("Input y for yes and n for no", 50, 500);
					
					Console p = new Console (10, 20, 15, "Play Again");
					p.print("You answer: ");
					playAgain = p.readLine();
					
					//Check is user put correct input, and if not, handle it
					while(!(playAgain.equalsIgnoreCase("y")) && !(playAgain.equalsIgnoreCase("n"))) {
						
						p.setTextColor(Color.RED);
						p.print("ERROR: Wrong input. Please try again\n");
						
						p.setTextColor(Color.BLACK);
						p.print("Your answer: ");
						playAgain = p.readLine();
					}
					
					p.close();
					
					guess = 6;
				}
	
				guess ++;
	
			}
	
			if(!(word.equals(user))) {
				
				//Pause before moving to next screen
				Thread.sleep(1500);
				
				s.close();
				c.clear();
				
				c.setColor(new Color(120, 178, 123)); 
				c.fillRect(0, 0, 1000, 1000);
	
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
				
				
				c.setFont(new Font("SansSerif", Font.PLAIN, 70)); 
				c.setColor(Color.WHITE); 
				c.drawString("Do you want play again?", 100, 425);
				c.drawString("Input y for yes and n for no", 50, 500);
				
				Console p = new Console (10, 20, 15, "Play Again");
				p.print("You answer: ");
				playAgain = p.readLine();
				
				//Check is user put correct input, and if not, handle it
				while(!(playAgain.equalsIgnoreCase("y")) && !(playAgain.equalsIgnoreCase("n"))) {
					
					p.setTextColor(Color.RED);
					p.print("ERROR: Wrong input. Please try again\n");
					
					p.setTextColor(Color.BLACK);
					p.print("Your answer: ");
					playAgain = p.readLine();
				}
				
				p.close();
	
			}
			
		} while (playAgain.equalsIgnoreCase("y"));
		
		
		
		c.clear();
		
		//Ending Message
		c.setColor(new Color(120, 178, 123)); 
		c.fillRect(0, 0, 1000, 1000);
		
		c.setColor(Color.WHITE); 
		c.setFont(new Font("SansSerif", Font.PLAIN, 70)); 
		c.drawString("Thank You for Playing!", 100, 450);
		
		Thread.sleep(2000);
		
		c.close();
		

		sc.close();
		//

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
}
