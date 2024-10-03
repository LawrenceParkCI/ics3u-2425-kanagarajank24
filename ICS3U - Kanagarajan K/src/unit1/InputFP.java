package unit1;
import java.util.Scanner;
/**
 * Description: This programs follows the Floating-Point Variables Worksheet. <br>
 * Date: Oct 3, 2024
 * @author Kaleena Kanagarajan
 */
public class InputFP {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//This line declares my variables
		double num1, num2;
		
		//Assigning value to num1
		System.out.println("Type in a decimal number and <Enter>");
		num1 = sc.nextDouble();
		
		//Assigning value to num2
		System.out.println("Type in another decimal number and <Enter>");
		num2 = sc.nextDouble();
		
		//prints and empty line
		System.out.println();
		
		//Printing out the variable values
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		
		sc.close();
		
		

	}

}
