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

		//Method is needed. this wont work. Or make word a global variable
		int randomNum = (int) (Math.random()*(words.length));
		String word = words[randomNum];
		String userGuess;
		char [] correct;

		userGuess = sc.nextLine();
		char[] guess = userGuess.toCharArray();
		
		for(int i = 0; i < guess.length; i ++) {
			System.out.println(guess[i]);
		}
		

	}

	//when checking if green or yellow, check arrays duplicate letters or make array with 5 charcters, but ir correct, put 0 in chars place
	/**
	 *Description: This methods find which letter are correct in the user's Guess
	 *@param user -> this is the guess the user has made.
	 *@param word -> actual word
	 *@return an array of the correct letters
	 */
	public static char []contains(String user) {
		return null;
	

	}


}
