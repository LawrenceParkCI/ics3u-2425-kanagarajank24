package unit2;
/**
Name: Mr. Lee
Date: Oct 29, 2021
Description: Tracing through code
 */
public class Main {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		int num1 = 0;
		String word = "Que";

		while (num1 < 15) {
			System.out.println(word);
			num1 = num1 + 1;
		}
		word = word + word;
		while (num1 > 0) {
			System.out.println(word);
			num1 = num1 - 1;
		}
	}
}
