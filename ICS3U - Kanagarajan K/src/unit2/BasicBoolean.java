package unit2;

/**
 * Description: This completes the Basic Boolean Worksheet. <br>
 * Date: Nov 4, 2024
 * @author Kaleena Kanagarajan
 */

public class BasicBoolean {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		//we've declared a variable called isPurple of boolean type
		//Recall: boolean holds either true or false (1 or 0)
		//boolean isPurple = false; (I turned it into a comment because it is not used and creating a problem)


		/*
      Boolean Operators, Expressions
		 */

		//boolean expressions are ways we can "calculate" whether
		//something is true or false

		int firstNum = 5;
		int secondNum = 10;
		double thirdNum = 5.5;

		//this prints out true because firstNum is smaller than secondNum, or 5 is smaller than 10.
		System.out.println("1: " + (firstNum < secondNum)); 

		//this prints out false because firstNum is not bigger than secondNum, or 5 is not bigger than 10.
		System.out.println("2: " + (firstNum > secondNum)); 
		
		//this prints out true because (int)thirdNum = 5, therefore firstNum is less than or equal to (int)thirdNum. The question is 5 <= 5 is being asked, and since 5 = 5, it is true. 
		System.out.println("3: " + (firstNum <= (int)thirdNum)); 
		
		//this prints out true because thirdNum = 5.5, therefore firstNum is less than or equal to (int)thirdNum. The question is 5 <= 5.5 is being asked, and since 5 < 5.5, it is true.
		System.out.println("4: " + (firstNum <= thirdNum)); 

		
		/*Test out these boolean operators. Figure out the meaning
		 * > means: greater than 
		 * < means: less than
		 * <= means: less than or equal to
		 * >= means: greater than and equal to
		 * == means: equal to
		 * != means: not equal to
		 */

	}
}