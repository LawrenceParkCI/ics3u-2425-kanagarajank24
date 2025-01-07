package Culminating;
import java.util.Scanner;

public class WordlePrototype {
	//static Console c; <- add this in real program so that the console applys to all methods?
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] words = {"weary", "happy", "magic", "shift", "ruins"};
		
		//Method is needed. this wont work. Or make word a global variable
		int randomNum = (int) (Math.random()*(words.length));
		String word = words[randomNum];
		String userGuess;
		char [] correct;
		
		//System.out.format("%-3c%-3c%-3c%-3c%-3c");
		userGuess = sc.nextLine();
		
		for (int i = 0; i < 5; i++) {
			
		
			
		}
		
		System.out.format("\n%-3c%-3c%-3c%-3c%-3c", '-', '-', '-', '-', '-');
		
		
		
		//System.out.println(randomWord(words));
		//System.out.println(words.length);

	}

	//This method is needed
	/**
	 *Description: This methods gets a random word from an array of Strings.
	 *@param words -> a String array of 5 letter words 
	 *@return a random word from the array 
	 */
	public static String randomWord(String[] words) {
		
		int randomNum =(int) (Math.random()*(words.length));
		String randomWord = words[randomNum];
		
		return randomWord;
	}
	
	/**
	 *Description: This methods find which letter are correct in the user's Guess
	 *@param user -> this is the guess the user has made.
	 *@return an array of the correct letters
	 */
	//public static char [] randomWord(String user) {
		//String word = randomWord(words);
	
	//}

 
}
