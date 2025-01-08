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
		String user;
		char [] correct;

		user = sc.nextLine();
		char[] userArray = user.toCharArray();
		
//		for(int i = 0; i < guess.length; i ++) {
//			System.out.println(guess[i]);
//		}
//		
		sc.close();

	}

	//when checking if green or yellow, check arrays duplicate letters or make array with 5 charcters, but ir correct, put 0 in chars place
	/**
	 *Description: This method checks if any of the letters in the user’s guess are in the correct word.
	 *@param userArray -> This is the user’s guess, which is stored in an array of characters
	 *@param word -> This is the correct word
	 *@return an array of integers where 0s will represent incorrect letters, and correct will be 1s.
	 */
	
	public static char []containLetter(char[] userArray, String word) {
		char[] containsLetter = new char [5];
		
		for (int i = 0; i < 5; i++) {
			
			if(word.indexOf(userArray[i]) == -1) {
				containsLeter[i] = 0;
			}
			
		}
		
		return containsLetter;
	

	}


}
