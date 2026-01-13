package unit1;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Description: This follows the Decimal Format worksheet
 * Date: Oct 16, 2024
 * @author Kaleena Kanagarajan
 */
public class DFOutput {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Run the following program with a cost of 10.00.
		//What value is displayed in the output?

		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);

		//System.out.println("The cost of your item with tax is " + total);
		System.out.println("The cost of your item with tax is " + money.format(total));


		//Change the above print statement on line 23 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?
		//Though the output looks the same, it is different, because, the money.format makes it so only 2 decimal places appear.
		//So if I input a number which will result in a total of many decimal places, only 2 will be shown in the output.
		//In the original print statement, all the available decimal places would be shown, because there were no format restrictions.


		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?
		//Now the output includes a dollar sign in front of it

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?
		//Now the output does not include the placeholder 0 at the end of the value.
		//This means that only two decimal places will be in the output, as long as the last digit is not 0

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = 
		//Run the program again with the cost of 10.50, what is happening?
		//10.50 X 1.13 = 11.865, but the program outputs $11.87.
		//This is because the computer automatically rounds it to two decimals because of the money.format.

		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?
		//Modification: DecimalFormat money = new DecimalFormat("$0.00");
		//I chose this format because normally we write money with two decimals at the end, even if the last place is 0
		//Output: The cost of your item with tax is $139505.28


		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.
		//Output: The cost of your item with tax is $139,505.28
		//This time the program accounts for the places before the decimal
		//When we reach 1000, we usually start to write it like this, 1,000, to separate the hundred from the thousands
		//The programs does this for larger numbers by making the digits before the ones place optional, so smaller numbers are not affected.
		//The # the basically 0, but only works if a digit belongs in that place.


		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		//The variable TAX_Rate is printed. Its value is 10.13
		//The final  double used to assign it means that it cannot be changed and is a constant, not a variable. 

		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?
		//Now the value is displayed as a percentage.


		sc.close();
	}

}
