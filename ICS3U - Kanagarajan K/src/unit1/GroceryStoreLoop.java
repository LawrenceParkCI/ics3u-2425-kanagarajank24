package unit1;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GroceryStoreLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		//Variables

		//stores the number of items the user is going to input
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
		double nearestFive;
		double subtotal = 0; 
		double total, tax;
		final double TAX_RATE = 0.13;

		System.out.println("|| $$$ \\\\\\ ========== \"Kaleena's Grocery Store\" ========== /// $$$ ||\n");

		System.out.println("Welcome to Kaleenas's Grocery Store!\n");

		//The while loop is used to handle user input errors
		while (true) {
			System.out.print("How many items would you like to buy? ");
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

			System.out.print("What are you buying today? ");
			items[i] = sc.nextLine();

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
			//System.out.println(items[i] + prices[i] + amounts[i]);

		}		

		//Receipt

		System.out.println("Here is your receipt:\n\n");


		//date and time
		System.out.println(timeF.format(dateTime));


		//Items
		System.out.printf("\n %-15s|%-15s|%-15s|%-15s", "Item", "     Price", "    Quant.", "  Total Price");
		System.out.println("\n-----------------------------------------------------------------");

		for (var i = 1; i < n; i++) {
			System.out.printf(" %-15s|   $ %7s   |%9s      |   $  %5s\n", items[i], money.format(prices[i]), "      " + amounts[i], money.format(prices[i]*amounts[i]));
		}

		System.out.println("-----------------------------------------------------------------");


		tax = subtotal * TAX_RATE;
		total = subtotal + tax;
		nearestFive = total - (total % 0.05);

		System.out.printf("%54s %5s\n", "Subtotal:    $ ", money.format(subtotal));
		System.out.printf("%54s %5s\n", "Tax:    $ ", money.format(tax));
		System.out.printf("%54s %5s", "Total:    $ ", money.format(total));


		System.out.println("\nThis is approximately $" + Math.round(total) + ".");
		System.out.println("This is approximately $" + money.format(nearestFive) + ".");


		System.out.println("\nThank you for shopping at Kaleena's Grocery Store!");
		System.out.println("Have a good day:)");

		sc.close();

	}

}
