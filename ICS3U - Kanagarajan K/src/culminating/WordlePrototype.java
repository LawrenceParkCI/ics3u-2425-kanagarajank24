package culminating;
import java.util.Scanner;

/**
Description:This program is where I am planning and testing my Wordle Final project. <br>
Date: Jan 8, 2025
@author Kaleena Kanagarajan
 */
public class WordlePrototype {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */	
	//static Console c; <- add this in real program so that the console applys to all methods?
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String [] words = {"weary", "happy", "magic", "shift", "ruins"};

		//Chose a random word from words array 
		int randomNum = (int) (Math.random()*(words.length));
		String word = words[randomNum];
		System.out.println("The word is: " + word);
		
		int [] correct = new int [5];
				
		//Get user input
		System.out.println("What is your guess?");
		String user = sc.nextLine();
		char[] userArray = user.toLowerCase().toCharArray();
		
		//test contansLetter
		
		int [] test = containsLetter(userArray, word);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(test[i]);
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
		int [] containsLetter = new int [5];
		int indexOf;
		
		//to check for duplicates
		boolean [] dupes = {true, true, true, true, true};
		
		for (int i = 0; i < 5; i++) {
			
			indexOf = word.indexOf(userArray[i]);

			
			if(dupes[indexOf] && indexOf != -1 ) {
				containsLetter[i] = 1;
				dupes[indexOf] = false;

			}
			else {
				containsLetter[i] = 0;
				
			}
		
		}
		
		return containsLetter;
	}
	
	//This Methods Works
	/**
	 *Description: This method checks if the correct letters in user’s guess are in the correct place
	 *@param  userArray -> This is the user’s guess, which is stored in an array of characters
	 *@param word -> This is the correct word
	 *@return an array of integers where 0s will represent letters with incorrect placement, and 2s for correct letter and placement
	 */
	public static int []correctPlace(char[] userArray, String word) {
		int [] correctPlace = containsLetter(userArray, word);
		
		for (int i = 0; i < 5; i++) {
			
			if(word.charAt(i) == userArray[i]) {
				correctPlace[i] = 2;
			}
		}
		
		return correctPlace;
	}
	
	



}
