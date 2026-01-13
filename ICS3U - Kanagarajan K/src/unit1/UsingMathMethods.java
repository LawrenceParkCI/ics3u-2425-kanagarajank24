package unit1;
import java.util.Scanner;
/**
 * Description: Ths follows the Using Math Methods Worksheet
 * Date: Oct 12, 2024
 * @author Kaleena Kanagarajan
 */
public class UsingMathMethods {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("Part A");

		//Write code to ask the user for any real number to be input.
		//Store their input into the num variable

		System.out.println("Please input any real number and <Enter>");
		num = sc.nextDouble();

		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num, num));
		System.out.println(Math.pow(num, 3));

		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 *
		 * 					   num = 16.75		 | num = 4.0	| num = -23.45
		 * 					   -----------------------------------------------
		 * Math.round(num)		   	    17		 | 		4		|-23
		 * Math.rint(num)			    17.0	 | 		4.0		|-23.0
		 * Math.sqrt(num)		    4.0926...    |		2.0		|NaN
		 * Math.abs(num)		    	16.75	 |		4.0		|23.45
		 * Math.pow(num, 2)	  	        280.5625 |		16.0	|549.9024999999999
		 * Math.pow(num, num)3.178689376746782E20|		256.0	|Nan
		 * Math.pow(num, 3)	     4699.421875...  |		64.0	|-12895.213624999999
		 *
		 */

		//Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		// This is because Math.sqrt(num) gives the square root of num, but in this case, num is negative. The square root of a negative number is imaginary, so there will only be a NaN result (not a number).
		//Nan stands for Not a number!

		//In your own words describe what the following Math methods does
		/*
		 * round: round to the nearest one's place (ex. 6.51 -> 7).
		 * rint: round to the nearest integer, so that there is .0 at the end of the number.
		 * sqrt: find the sqaure root of the number.
		 * abs: find the absolute value of the integer(basically make it positive).
		 * pow: this method has two parameters, which represent a base and power. The first argument is the base, and the second is the exponent.
		 *      So if we have Math.pow(num, 2), it means num to the power of 2.
		 */

		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		// This is because we do not need a second number to complete these methods. We only need on parameter.
		//For example, in Math.sqrt, we do not need to say (num, 2), because square root automatically means find the 2nd root

		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		//In pow, we have both the base and the power. They are both needed to complete the method and will change the result, so they both need to be inputed as a parameter.
		//The first argument is the base, which is the number that is getting multiplied by itself. The second is the exponent, which tells us how many times to multiply parameter 1 by itself.


		System.out.println("Part B");
		//Ask the user for any real number and an integer to be input. Display the real number,
		//and its square root. Also determine and display the real number raised to the integer power.
		//Use suitable headings, displaying the results across the screen.\
		//
		//Eg. If the real number 13.5 and the integer 2 are input, display
		//REAL NUMBER	SQUARE ROOT		RAISED TO POWER 2 <- display power here
		//   13.5		   3.6742			182.25

		//Define variables
		double num1;
		double int1;

		//Get Input
		System.out.println("Please input any real number and <Enter>");
		num1 = sc.nextDouble();
		System.out.println("Please input another real number and <Enter>");
		int1 = sc.nextDouble();

		//Do methods and store results in variables
		double sqrt = Math.sqrt(num1);
		double pow = Math.pow(num1,  int1);

		//Output results
		System.out.printf("%-20s%-20s%-20s\n", "REAL NUMBER", "SQUARE ROOT", "RAISED TO POWER " + int1);
		System.out.printf("%-20s%-20s%-20s", num1, sqrt, pow);


		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input.

		/*
		 * Sqrt = 2.8104270138183627
		 * Pow = 492.75820832162503
		 */


		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:
		//a) the number 16 and the real number power 0.5
		//sqrt = 4.0, pow = 4.0
		//b) the number 8 and the real number power 0.33
		// sqrt =  2.8284271247461903, pow =  1.9861849908740719


		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		// It does give a different output, because there are more digits. Even though we know that this number goes on with threes for infinity (we usually consider 0.33 to be the same as 1/3),
		//the computer does not consider this and only uses the digits it has.

		sc.close();


	}
}
