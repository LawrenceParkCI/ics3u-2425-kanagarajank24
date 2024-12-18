package unit1;
/**
 * Description: This program completes Part 1: Net Pay of Assignment 2. <br>
 * Date: Oct 5, 2024
 * @author Kaleena Kanagarajan
 */
public class NetPay {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		//Creating Variables
		double hours = 40;
		double wage = 5;
		double insurance = 2;
		double tax = 0.22;

		//Creating Variable for netPay
		double netPay = (hours * wage - insurance) - tax * (hours * wage - insurance);


		//Print Statement to express the net pay
		System.out.println("This employee has a net pay of $" + netPay);
	}
}
