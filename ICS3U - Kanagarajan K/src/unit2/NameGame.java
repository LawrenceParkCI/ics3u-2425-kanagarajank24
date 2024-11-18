package unit2;
import java.util.Scanner;
/**
 * Description: This follows the Name Game worksheet.
 * Date: Nov 18, 2024
 * @author Kaleena Kanagarajan
 */
public class NameGame {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */

		Scanner sc = new Scanner (System.in);

		//Variables
		String name;
		int random = (int)(Math.random() * 10);

		//Get user's name
		System.out.println("What is your name?");
		name = sc.nextLine();

		if(random < 6) {
			System.out.println( name + "! That's my favourite name ( ˶ˆᗜˆ˵ )");
		}
		else {
			System.out.println(name + "! I hate that name ᕦ(ò_óˇ)ᕤ");
		}

		sc.close();
	}

}