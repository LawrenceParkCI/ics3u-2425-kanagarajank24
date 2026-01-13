package unit2;

/**
 * Description: This follows the If Statements 1 worksheet. <br>
 * Date: Nov 5, 2024
 * @author Kaleena Kanagarajan
 */

public class IfStatements1 {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}    

		//What prints out? Why?
		// Nothing prints out because firstNum > secondNum is not true (10 cannot be greater than 30)
		// The code in the if statement is skipped, if the condition is not true.

		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		// "XQCL" is printed because like the if statement in part 1, the condition is false.
		// But this time, there is an else statement under it. If the condition is not true, the else statement will run.

		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		/*"sykSHY" is printed out, because now an else if statement is added.
		*else if is basically a another if statement to check, if the first condition is not true. 
		*The condition is firstNum % 2 == 0 && secondNum % 3 == 0. This is true because firstNum % 2 == 0 AND secondNum % 3 == 0.
		*In java, %% means and. Therefore, it is only true if both conditions are true. If one was false, then the entire thing would be considered false.
		*/

		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		/*
		 *"1\nKEKW\nOMEGALUL\n2\nKEKW\nOMEGALUL\nsykSHY" printed out.
		 *This is because in the first if, else if, else statements the first conditions is true (firstNum < secondNum is true). So "KEKW\nOMEGALUL" prints out.
		 *Next, the same condition is asked again (true) and "KEKW\nOMEGALUL" prints out.
		 *Then, firstNum % 2 == 0 && secondNum % 3 == 0 is asked, and is true as I explained above. So "sykSHY" is printed.
		 *Finally, !(firstNum < secondNum) is asked (it is asking if firstNum < secondNum is not true), which is false because firstNum < secondNum is true.
		 *
		 */
		//What is the difference between the first and second part?
		// the difference is the first part has if, else if and else statements that rely on each other (meaning that only if one is false, it will move on to the next).
		//the second part is individual if statements that will all run regardless of each other.

	}
}
