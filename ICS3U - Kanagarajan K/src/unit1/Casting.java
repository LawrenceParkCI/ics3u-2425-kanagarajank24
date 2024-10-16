package unit1;
import java.util.Scanner;
/**
 * Description: This follows the Casting worksheet.
 * Date: Oct 14, 2024
 * @author Kaleena Kanagarajan
 */
public class Casting {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 *Casting* means to change data from one type to another.
		 *Implicit casting - changing of data types without specifically writing extra code
		 *Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");
		int intNum;
		intNum = 10;
		double doubleNum;
		//implicit casting
		doubleNum = intNum;

		//What type of data is printed here? Why?
		System.out.println(doubleNum);
		//A double type is printed out, because the intNum is implicitly casted into a double type.
		//This is done by first creating an int variable, then creating a double variable with the assignment value of intNum (the integer variable).
		// So when we print out doubleNum (the double variable), the intNum will be changed to a double (10 -> 10.0) and printed.

		//can you explain what is happening in this code?
		doubleNum = doubleNum + 2.2;
		// In this code, the int 10, which has been casted into a double in the doubleNum variable, is added to 2.2. At this point, doubleNum = 12.2

		//explicit casting
		intNum = (int) doubleNum;

		//What type of data is printed here? Why?
		System.out.println(intNum);
		//int num = sc.nextInt();
		// An integer is printed out here. This is because the (int) in front of the doubleNum in the reassignment of the intNum variable, us explicitly casting the doubleNum into a variable.
		// We cannot implicitly cast a double to an int, because a double holds more space than an int, so information will be lost in this conversion. We must explicitly state that we are going to do this.

		/*
		   Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
		     int to double
		     Explicit
		     doubleNum = (double) intNum;
		     Implicit
		     intNum = 10;
		     doubleNum = intNum;

		     double to int
		     Explicit
		     intNum = (int) doubleNum;

		     int to long
		     Explicit
		     longNum = (long) intNum;
		     Implicit
		     intNum = 10;
		     longNum = intNum;

		     long to int
		     Explicit
		     intNum = (int) longNum;

		     Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
		     This is because int the casting smaller types can go into bigger types easily(ex. int into double), but when we try to do this vice versa,
		     we can lose information as there is less space in the smaller data type. So this is why when casting a bigger type to a smaller one,
		     we must explicitly state that this what we are trying to do.
		 */

		System.out.println("Part 2");

		//understanding what you can do with casting, can you round the following variable to the nearest 10th?
		double myNum;
		Scanner in = new Scanner(System.in);
		System.out.println("Give me decimal number up to the hundredth");
		// first let myNum be assigned the value of the double inputed
		myNum = in.nextDouble();
		System.out.print("Rounding down to the nearest tenth, it is: ");
		// Next mutliply the number by 10 and then change it to the short, so that we have up to the tenth place value as an integer. (ex. 12.34 -> 123)
		myNum= (int) (myNum*10);
		// Now we convert the myNum back into a double and divide it by 10, so that the last place which is suppossed to be the tenth decimal place, will become it.
		//(ex. 123 -> 12.3)
		myNum = (double) (myNum/10);
		//Print out the result
		System.out.println(myNum);

		sc.close();
		in.close();
	}
}

