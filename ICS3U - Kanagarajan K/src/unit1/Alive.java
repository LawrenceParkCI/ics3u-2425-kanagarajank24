package unit1;
import java.util.Scanner;
/**
* Description: This program completes Part 2: Alive of Assignment 2. <br>
* Date: Oct 5, 2024
* @author Kaleena Kanagarajan
*/
public class Alive {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		//Title
		System.out.println("ALIVE");
		System.out.println("-----");




		//Declaring Variables
		int year1, year2, day1, day2, month1, month2;




		//Getting their values through user input
		//Birthday
		System.out.println("\nPlease enter your Birthday");
		System.out.print("Year: ");
		year1 = sc.nextInt();
		System.out.print("Month(in numbers): " );
		month1 = sc.nextInt();
		System.out.print("Day: ");
		day1 = sc.nextInt();


		//Today’s date
		System.out.println("\nPlease enter Today’s date");
		System.out.print("Year: ");
		year2 = sc.nextInt();
		System.out.print("Month(in numbers): ");
		month2 = sc.nextInt();
		System.out.print("Day: ");
		day2 = sc.nextInt();




		//Calculations
		int daysAlive =(year2 - year1) * (365) + (month2 - month1) * (30) + (day2 - day1);
		int sleepTime = daysAlive * 8;
		//This multiples the number of days you have lived by 8, as we assume that we sleep 8 hours/day




		//Print Statements which present the calculations
		System.out.println("\nYou have been alive for " + daysAlive + " days.");
		System.out.println("You have slept for " + sleepTime + " hours.");


		sc.close();
	}
}

