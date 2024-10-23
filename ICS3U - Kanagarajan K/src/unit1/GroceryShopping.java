package unit1;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
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

		//This variable helps to capitalize the item names
		String[] itemC;

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
		//The while loop is used to handle user input errors
		while (true) {
			System.out.print("How many items would you like to buy today? ");
			try {
				n = sc.nextInt() + 1;
				break;
			}
			catch (InputMismatchException e){
				System.out.println("\nERROR! Please input a number.");

				////This line helps get rid of the scanner error
				sc.nextLine();
			}			
		}

		//Initializing my arrays
		items = new String[n];
		prices = new double[n];
		amounts = new int[n];
		itemC = new String[n];

		//This line helps get rid of the scanner error
		sc.nextLine();

		//This for loop helps collect data about the users shopping trip
		//It does one iteration for every item the user wants to buy
		for(var i = 1; i < n; i++) {
			System.out.println("\nItem " + i + ":");

			//Item name
			System.out.print("What are you buying? ");
			items[i] = sc.nextLine();

			//Item cost
			//The while loop is used to handle user input errors
			while(true) {
				System.out.print("How much does it cost? $");
				try {
					prices[i] = sc.nextDouble();
					break;
				}
				catch (InputMismatchException e){					
					System.out.println("\nERROR! Please input a number.");

					////This line helps get rid of the scanner error
					sc.nextLine();
				}
			}

			//Item quantity 
			while(true) {
				System.out.print("How many are you buying? ");
				try {
					amounts[i] = sc.nextInt();
					break;
				}
				catch (InputMismatchException e) {
					System.out.println("\nERROR! Please input a number.");

					////This line helps get rid of the scanner error
					sc.nextLine();
				}
			}

			//This line helps get rid of the scanner error
			sc.nextLine();

			System.out.println("Great!");

			//Keep track of sub total here
			subtotal += prices[i] * amounts[i];

			//To format the item name so that the first letter is the only one capitalized
			itemC[i] = items[i].toUpperCase();
			items[i] = items[i].toLowerCase();
			items[i] = items[i].replace(items[i].charAt(0), itemC[i].charAt(0));

		}		

		//Receipt
		System.out.println("\nHere is your receipt:\n");

		System.out.println("--------------------Kaleena's Grocery Store--------------------");

		//date and time
		System.out.println(timeF.format(dateTime));

		System.out.printf("\n %-15s|%-15s|%-15s|%-15s", "Item", "     Price", "    Quant.", "  Total Price");

		//Items
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


