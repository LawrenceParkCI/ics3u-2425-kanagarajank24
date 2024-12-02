package unit2;

/**
Name: Mr. Lee
Date: Oct 29, 2021
Description: Tracing through code
 */
public class Main2 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		int num2 = 500;

		while (num2 > 1) {
			if (num2 % 2 == 0) {
				num2 = num2 / 2;
			} else if (num2 % 3 == 0) {
				num2 = num2 + 7;
			} else  {
				num2 = num2 + 1;
			}
		}
		System.out.println(num2);
	}
}