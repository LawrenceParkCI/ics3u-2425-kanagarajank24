package unit1;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GroceryStoreLoop {

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
		int n;
		String[] items;
		double[] prices;
		int[] amounts;
		
		
		System.out.println("Welcome to Kaleens's Grocery Store!");
		System.out.println("How many items would you like to buy? ");
		n = sc.nextInt();
		
		items = new String[n];
		prices = new double[n];
		amounts = new int[n];
		
		for(var i = 1; i < n; i++) {
			
			System.out.println("\nItem " + i + ":");
			System.out.print("What are you buying today? ");
			items[i] = sc.nextLine();
			System.out.print("How much does it cost? $");
			prices[i] = sc.nextDouble();
			System.out.print("How many are you buying? ");
			amounts[i] = sc.nextInt();
			//This scan get rid of the enter when getting item2 and fixes the error
			sc.nextLine();
			System.out.println("Great!");

			
		}		
		


	}

}
