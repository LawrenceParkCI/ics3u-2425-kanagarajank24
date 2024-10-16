package unit1;
/**
 * Description: This follows the casting 3 worksheet
 * Date: Oct 14, 2024
 * @author Kaleena Kanagarajan
 */
public class Casting3 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/* 
		 * Strings and Back Again
		 */
		//Recall:
		System.out.println("Part 1");
		System.out.println("1 + 2 + 3" + 4 + 5);
		//why did it print out this way?
		// This is because first the string "1 + 2 + 3" is printed, then we have 4 and 5, which have be casted as strings. 
		//So "45" will be printed right after the first string.

		//Demonstrate casting a double value to a String in this way
		System.out.println("12" + 12.3);
		//Demonstrate casting a boolean value to a String in this way
		System.out.println("12" + false);
		//Demonstrate casting a char value to a String in this way
		System.out.println("12" + 'a');


		System.out.println("Part 2");
		//In order to change a String into an integer, we need another set of code

		String strNum = "-5";
		int myNum = Integer.parseInt(strNum);

		System.out.println(strNum + " x 2 = " + (myNum + myNum));

		/*Change strNum to the following values, and see if they work:
		 * "25.2"
		 * This does not work because 25.2 has a decimal, but the string is being changed to an int.
		 * 
		 * "23c"
		 * This does not work because 25.2 has a character, but the string is being changed to an int. An int cannot have a character in it.
		 * The c did not become its ASCII value in this case, because no operator was used.
		 * 
		 * "2 3"
		 * This does not work, because the space in between the 2 and 3 is not considered an int.
		 * 
		 * "Lol23"
		 * Does not work because Lol is not an int.
		 * 
		 * "-5"
		 * This works because -5 is an int.
		 * 
		 */
		//What can you say about how we can use the function, Integer.parseInt()?
		// I can say that we use this function only to convert a string into an int. 
		//Everything within the string must create an int, or else an error will occur.


		// What do you think the code to change a String to double would look like?
		// Maybe we must use a function like this:Double.parseDouble()

		//Similarly, test out the code and write down what instructions
		strNum = "-5";
		double myNum1 = Double.parseDouble(strNum);
		System.out.println(strNum + " x 2 = " + (myNum1 + myNum1));

		/*Change strNum to the following values, and see if they work:
		 * "25.2"
		 * This works because 25.2 is a double.
		 * 
		 * "23c"
		 * This does not work because 25.2 has a character, but the string is being changed to an double. An double cannot have a character in it.
		 * 
		 * "2 3"
		 * This does not work, because the space in between the 2 and 3 is not considered an double.
		 * 
		 * "Lol23"
		 * Does not work because Lol is not an double.
		 * 
		 * "-5"
		 * This works because -5 is an int, but it is casted into a double. So it becomes -5.0.
		 * 
		 */
		
		//What can you say about how we can use the function, Double.parseDouble()?
		// I can say that we use this function only to convert a string into an Double. 
		//Everything within the string must create a number (a Double or an int), or else an error will occur.


		//When do you think it might be necessary to change a string value into an integer value/double value?
		//I think that this could be useful when receiving data from users. A user might input an int as a string,
		//but the computer might need to do some calculations with it. So this is helpful when we need to cast it to be an int.
		//Another case could be when processing information from a file. Some important numbers maybe accepted as strings, so we must change that.
	}
}
