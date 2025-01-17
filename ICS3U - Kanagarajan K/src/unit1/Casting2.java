package unit1;
/**
 * Description:This follows the casting 2 worksheet
 * Date: Oct 14, 2024
 * @author Kaleena Kanagarajan
 */
public class Casting2 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
    Char and int
		 */
		char myChar = 'a';
		System.out.println(myChar);
		System.out.println(myChar + 1);

		char myChar2 = (char) (myChar + 1);

		System.out.println(myChar2);

		//Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
		/*
		 * When we print myChar, we are just regularly printing out myChar, but when we print out myChar + 1 we get 98.
		 * This is because when we try to do an operation on a char, we implicitly cast it into its ASCII Value as an int.
		 * In this case a = 97, so a + 1 = 98. When we create a variable with the value of myChar + 1 and then cast it to a char,
		 * we will get the char with a ASCII value of 98. This is b.
		 */

		//Why do you think this happens?
		// I think this happens because when a char is used in an operation, it is automatically casted to an int with its ASCII Value.

		//Investigate what is ASCII. What is it?
		// ASCII stands for American Standard Code for Information Interchange. It is a 7 bit character code, meaning it holds up to 128 values (or from 0 to 127)
		// Each number from 0 to 127 represents a different character. This is number, letters, arithmetic operators and more

		//Can you find the number value for 'a'? Does it match with your findings above?
		// The number value of a is 97, so it does match my findings above, as a + 1= 98, so a has to be 97.

		//create a new character myCharCap, and transform myChar into a capital 'A' and print it


		//Create the variable myCharCap
		char myCharCap;
		//This is to give myCharCap the ASCII value of 65, which represents A. I also cast it to a char, so myCharCap is A and not 65
		myCharCap = (char) (myChar - 32);
		//Print out the variable
		System.out.println(myCharCap);

	}
}

