package unit1;
/**
 * Description:This follows the commenting worksheet
 * Date:Oct 14, 2024
 * @author Kaleena Kanagarajan
 */
public class Commenting {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 * Comments are meant to communicate ideas with other programmers and to keep track of one's logic
		 */
		
		/**
		 * This is a javadoc comment
		 *
		 * These comments are used to create official documentation. We see them at the top of our programs (header) as well as to describe java-defined blocks of code (class, methods, attributes)
		 *
		 * Javadoc comments can be multi-line.
		 * For now, we don't use Javdoc comments beside the header until unit 3.
		 */
		
		/*
		 * This is a block comment
		 *
		 * Block comments can be multi-line
		 * These comments are used to explain a section of code.
		 */
		
		//this is a line comment
		//line comments are single line
		
		System.out.println("Testing"); //line comments can also be placed at the end of a line
		/*
		 * Tracing Practice
		 * For the following code:
		 * -every time a variable is assigned a new value, write a line comment beside it telling what is the value currently stored in the variable.
		 *
		 * -every time you see the block comment, write down each variable and what are the values at that time in the code
		 */
		int num1 = 20; // the initial value of num1 is 20
		double num2 = 36.2; // initial value of num2 is 36.2
		String stringNum = ""; // the initial value of stringNum is "" (nothing).
		/*
		 * Variables Name    |   Value
		 * ---------------------------------
		 * num1              |20
		 * num2              |36.2
		 * stringNum         |""
		 */
		num1 += 20; //now it is 20 + 20 or 40
		num1 = num1 / 3 * 2; // now it is 40/3 * 2 or 26
		num1 = (int)(num2 * 3 - (2 + 5) * 8); // now it is 36.2 * 3 - (2+5) * 8 and is converted to an int, or 52
		num2 = ((int)num2) - num1; // now num2 is casted to a int and num1 is subtracted from it. This is also equal to -16.0.
		stringNum = num1 + " " + num2; // now stringNum is "56 -16.0"
		System.out.println(stringNum);
		System.out.println(num1);
		System.out.println(num2);
		/*
		 * Variables Name    |   Value
		 * ---------------------------------
		 * num1              |52
		 * num2              |-16.0
		 * stringNum         |"56 -16.0"
		 */
		num2 /= 2.5; // Now is -16.0/2.5 or -6.4
		num1 /= 2; // Now is 52/2 or 26
		stringNum = stringNum + "; "; //Now is "52 -16.0; "
		stringNum = stringNum + num1 + " " + num2; // now is "52 -16.0; 26 -6.4"
		/*
		 * Variables Name    |   Value
		 * ---------------------------------
		 * num1              |26
		 * num2              |-6.4
		 * stringNum         |"52 -16.0; 26 -6.4"
		 */
	}
}

