package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description: This completes our Unit 1 final assignment. It helps the user create a receipt of their grocery shopping. <br>
 * Date: October 23, 2024
 * @author Kaleena Kanagarajan
 */
public class GroceryShopping {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {

		//Variables

		//Scanner
		Scanner sc = new Scanner(System.in);

		//Stores the number of items the user is going to input
		int n;

		//These are arrays to store the user input 
		String[] items;
		double[] prices;
		int[] amounts;

		//Formats
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter timeF = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
		DecimalFormat money = new DecimalFormat("##.00");

		//Final Calculations
		double subtotal = 0; 
		double tax;
		double total;
		double nearestFive;
		final double TAX_RATE = 0.13;

		System.out.println("|| $$$ \\\\\\ ========== \"Kaleena's Grocery Store\" ========== /// $$$ ||\n");
		System.out.println("Welcome to Kaleena's Grocery Store!\n");
		System.out.println();

		//Get user input about how many items they want to buy
		System.out.print("How many items would you like to buy today? ");
		n = sc.nextInt() + 1;


		//Initializing my arrays
		items = new String[n];
		prices = new double[n];
		amounts = new int[n];

		//This line helps get rid of the scanner error
		sc.nextLine();

		//This for loop helps collect data about the users shopping trip
		//It does one iteration for every item the user wants to buy
		for(var i = 1; i < n; i++) {
			System.out.println("\nItem " + i + ":");

			//Gets user input for item name, cost and quantity
			System.out.print("What are you buying? ");
			items[i] = sc.nextLine();

			System.out.print("How much does it cost? $");
			prices[i] = sc.nextDouble();

			System.out.print("How many are you buying? ");
			amounts[i] = sc.nextInt();

			//This line helps get rid of the scanner error
			sc.nextLine();

			System.out.println("Great!");

			//Keep track of sub total here
			subtotal += prices[i] * amounts[i];

			//To format the item name so that the first letter is the only one capitalized
			items[i] = items[i].toLowerCase();
			items[i] = items[i].substring(0, 1).toUpperCase() + items[i].substring(1);

		}		

		//Receipt Header
		System.out.println("\nHere is your receipt:\n");

		System.out.println("--------------------Kaleena's Grocery Store--------------------");

		//Date and Time
		System.out.println(timeF.format(dateTime));


		//Receipt
		System.out.printf("\n %-15s|%-15s|%-15s|%-15s", "Item", "     Price", "    Quant.", "  Total Price");
		System.out.println("\n-----------------------------------------------------------------");

		for (var i = 1; i < n; i++) {
			System.out.printf(" %-15s|   $ %7s   |%9s      |   $  %5s\n", items[i], money.format(prices[i]), "      " + amounts[i], money.format(prices[i]*amounts[i]));
		}

		System.out.println("-----------------------------------------------------------------");

		//Final Calculations
		tax = subtotal * TAX_RATE;
		total = subtotal + tax;
		nearestFive = Math.round(total / 0.05) * 0.05;

		//Outputs
		System.out.printf("%54s %5s\n", "Subtotal:    $ ", money.format(subtotal));
		System.out.printf("%54s %5s\n", "Tax:    $ ", money.format(tax));
		System.out.printf("%54s %5s", "Total:    $ ", money.format(total));

		System.out.println("\n\n\nThis is approximately $" + Math.round(total) + ".");
		System.out.println("This is approximately $" + money.format(nearestFive) + ", when rounded to the nearest 5 cents.");

		//Goodbye messages
		System.out.println("\nThank you for shopping at Kaleena's Grocery Store!");
		System.out.println("Have a good day:)");

		sc.close();

	}

}


