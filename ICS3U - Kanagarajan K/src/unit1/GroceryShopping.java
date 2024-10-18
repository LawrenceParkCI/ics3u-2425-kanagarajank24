package unit1;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 * Description: This completes or Unit 1 final assignment. It helps the user create a receipt of their grocery shopping. <br>
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
		Double price1, price2;
		int amount1, amount2;
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		DecimalFormat time1 = new DecimalFormat("00:00");
		
		//Title
		System.out.println("|| $$$ \\\\\\ ========== \"Kaleena's Grocery Store\" ========== /// $$$ ||");
		
		//Get user input
	
	    /*
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
		
		System.out.println(item1 + price1 + amount1);
		
		System.out.println("\n\nItem 2:");
		System.out.print("What are you buying today? ");
		item2 = sc.nextLine();
		System.out.print("How much does it cost? $");
		price2 = sc.nextDouble();
		System.out.print("How many are you buying? ");
		amount2 = sc.nextInt();
		System.out.println("Great!");
		System.out.println( item2 + price2 + amount2);
		
		*/
		
		item1 = "apples";
		item2 = "mangos";
		price1 = 2.0;
		price2 = 3.0; 
		amount1 = 4;
		amount2 = 5;
		
		
		
		//Receipt
		
		System.out.println("Here is your receipt: ");
		
		
		
		
		//date and time
		
	   // System.out.println(date);
	    //System.out.println(time1.format(time));
		
		//Items
		System.out.printf("|%-15s|%-15s|%-15s|%-15s|", "Item", "Price", "Quant.", "Total Price");
		System.out.printf("|%-15s|%-15s|%-15s|%-15s|", "Item", "Price", "Quant.", "Total Price");
		
		sc.close();
	
		
	}

}
