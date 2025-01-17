package unit1;
import java.util.Scanner;
/**
 * Description: This program completes Part 4: Carpet of Assignment 2. <br>
 * Date: Oct 5, 2024
 * @author Kaleena Kanagarajan
 */
public class Carpet {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Title
		System.out.println("Carpet Cost Calculator");
		System.out.println("----------------------\n");
		//Variables
		int length, width, area;
		double cost, totalCost;

		//Get user input
		System.out.println("Please input the length of your room in metres and <Enter>");
		length = sc.nextInt();
		System.out.println("Please input the width of your room in metres and <Enter>");
		width = sc.nextInt();
		System.out.println("Please input the cost of the carpet per sq metres and <Enter>");
		cost = sc.nextDouble();

		//Calculations
		//Area
		area = width * length;
		//Total cost of carpet
		totalCost = area * cost;

		//Print out results
		System.out.println("\nThe total area of the room is " + area + "sq metres.");
		System.out.printf("It will cost $%.2f to buy a carpet for this room.", totalCost);

		sc.close();
	}
}
