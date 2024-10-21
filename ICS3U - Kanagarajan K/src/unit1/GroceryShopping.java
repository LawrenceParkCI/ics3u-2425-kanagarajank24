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
		Scanner sc = new Scanner(System.in);


		//Variables

		String item1, item2;
		String item1C, item2C;
		double price1, price2;
		int amount1, amount2;
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter timeF = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
		DecimalFormat money = new DecimalFormat("##.00");
		double nearestFive;
		double subtotal, total, tax;
		final double TAX_RATE = 0.13;

		//Title
		System.out.println("|| $$$ \\\\\\ ========== \"Kaleena's Grocery Store\" ========== /// $$$ ||");

		//Get user input

		/*
		//TODO change the first letter of the product name to be capitalized
		System.out.println("\nItem 1:");
		System.out.print("What are you buying today? ");
		item1 = sc.nextLine();
		System.out.print("How much does it cost? $");
		price1 = sc.nextDouble();
		System.out.print("How many are you buying? ");
		amount1 = sc.nextInt();
		//This scan get rid of the enter when getting item2 and fixes the error
		sc.nextLine();
		System.out.println("Great!");


		System.out.println("\n\nItem 2:");
		System.out.print("What are you buying today? ");
		item2 = sc.nextLine();
		System.out.print("How much does it cost? $");
		price2 = sc.nextDouble();
		System.out.print("How many are you buying? ");
		amount2 = sc.nextInt();
		System.out.println("Great!");


		 */
		///*
		item1 = "Apples";
		item2 = "Mangos";
		price1 = 2.33;
		price2 = 3.0; 
		amount1 = 10;
		amount2 = 5;
		//*/
		
		//To format the item name so that the first letter is the only one capitalized
		item1C = item1.toUpperCase();
		item1 = item1.toLowerCase();
		item1 = item1.replace(item1.charAt(0), item1C.charAt(0));
		
		item2C = item2.toUpperCase();
		item2 = item2.toLowerCase();
		item2 = item2.replace(item2.charAt(0), item2C.charAt(0));


		
		//Receipt

		System.out.println("Here is your receipt:\n\n");


		//date and time
		System.out.println(timeF.format(dateTime));


		//Items
		System.out.printf(" %-15s|%-15s|%-15s|%-15s", "Item", "     Price", "    Quant.", "  Total Price");
		System.out.println("\n-----------------------------------------------------------------");
		System.out.printf(" %-15s|   $  %5s    |%9s      |   $  %5s", item1, money.format(price1), "      " + amount1, money.format(price1*amount1));
		System.out.printf("\n %-15s|   $  %5s    |%9s      |   $  %5s", item2, money.format(price2), "      " + amount2, money.format(price2*amount2));
		System.out.println("\n-----------------------------------------------------------------");

		subtotal = price1 * amount1 + price2 * amount2;
		tax = subtotal * TAX_RATE;
		total = subtotal + tax;
		nearestFive = total - (total % 0.05);

		System.out.printf("%54s %5s\n", "Subtotal:    $ ", money.format(subtotal));
		System.out.printf("%54s %5s\n", "Tax:    $ ", money.format(tax));
		System.out.printf("%54s %5s", "Total:    $ ", money.format(total));


		System.out.println("\nThis is approximately $" + Math.round(total) + ".");
		System.out.println("This is approximately $" + money.format(nearestFive) + ".");

		System.out.println("\nHave a good day!");
		System.out.println("Thank you for shopping at Kaleena's Grocery Store!");

		sc.close();


	}

}


