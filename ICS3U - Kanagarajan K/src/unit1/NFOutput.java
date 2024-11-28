package unit1;
import java.text.NumberFormat;
import java.util.Scanner;
/**
 * Description: This follows the Number Format worksheet
 * Date: Oct 16, 2024
 * @author Kaleena Kanagarajan
 */
public class NFOutput {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		//How can you change how your value is displayed?
		//No, because the getCurrencyInstance only formats the way it is.
		//The only way to change it would to be how we set up the number format.
		
		//What other formats does NumberFormat offer?
		//Number format offers specific number formats for specific types of data.
		//Above we can see how it can be used for currency and percent.
		
		// We can also use getIntegerInstance, which helps round any number into the nearest integer (no decimal places).
		//it would be uses like this: NumberFormat x = NumberFormat.getIntegerInstance();
		// For example, we could format 3.14 to be 3
		
		//There is also getCompactNumberInstance, which formats the number into the short data type
		//it would be uses like this: NumberFormat x = NumberFormat.getCompactNumberInstance();
		sc.close();
	}

}
