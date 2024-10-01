package unit1;
/**
 * Description: This programs follows the Creating Variables worksheet. <br>
 * Date: September 30, 2024
 * @author Kaleena Kanagarajan
 */
public class CreatingVariables {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */

	public static void main(String[] args) {
		System.out.println("Warm-up");
		//Warmup: print your name
		System.out.println("Kaleena K\n");

		//Warmup: print the calculation for the area of a square with side length 25
		int sideLength = 25;
		int area = sideLength*sideLength;
		System.out.println(sideLength + " x " + sideLength + " = " + area);
		System.out.println("The area of the sqaure is " + area + ".\n");


		//Key Question: what if the value I want to use needs to change?
		/*
		 * Then we can change it like this: sideLength = newValue;.
		 * Also, this must come before the calculation you want to include it in the average and print statements. 
		 * If not, then you should recalculate the average and make new print statements.
		 */

		/*
		Variables
		- A variable is a place in memory that you can tell your computer to set aside when you make a program.
		- This location can be used to store a piece of information.
		- You can give this location a name
		- You can change the information that the location holds.
		- You can recall the value of this memory location later and use in different parts of your program

		*/

		System.out.println("Part 1");
		//what do you notice is being printed out?
		//The value of myNum is printed, then it is reassigned and printed again
		int myNum;
		myNum = 10;
		System.out.print("myNum = ");
		System.out.println(myNum);

		myNum = 20;
		System.out.println("myNum is now " + myNum + ".");
		
		//Why do the two codes print out different things?
		// Because myNum was orginally assigned the number 10 in the first print statement, then it was reassigned 20 in the second on.


		System.out.println("\nPart 2 - Creating a Variable");

		/*
		A variable be:
		*declared* (Necessary) - you're telling the computer that you need to keep a value, and the computer will create a space in memory for it

		ie.
		int myNum; //you are declaring a variable called myNum that stores an int type of data

		*initialized*(Necessary) - in order to use the variable, you first need to give it an initial value. Otherwise, the computer won't be able to do something with the variable

		myNum = 10; //initializes the value of myNum to 10, so I can use it in other ways

		*assigned* - similar to initialize, that you're setting the value of the variable to another value

		myNum = 20; //I've changed the value of myNum

		Once your variable has been given a value, it can then be *referenced* - that is, it can be used by its name
		*/

		//Declare and initialize an int variable called myAge that stores your age.
		int myAge = 15;


		//Print it out in a sentence (Hint: remember how we combined text and numbers in a print statement)
		System.out.println("My age is " + myAge + ".");

		//Assign it a new value, that is 10 more than the original value
		myAge = 25;

		//Print it out in a new sentence (Hint: remember how we combined text and numbers in a print statement)
		System.out.println("In 10 years, I will be " + myAge + " years old.");



		//Note: When I use the word create in the future, I typically mean declare and initialize

	}

}
