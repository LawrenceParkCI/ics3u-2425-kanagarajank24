package unit1;
/**
 * Description: This programs follows the Math Operators worksheet. <br>
 * Date: Oct 1, 2024
 * @author Kaleena Kanagarajan
 */

public class MathOperators {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		 /*
        Pre: Kind of Math, but not really
        What do you notice is happening?
     */
     
	// The strings "Butter" and "fly" combine.
     System.out.println("Butter" + "fly");
     
     // This is fully a string, so the literal string of "1 + 2 + 3 + 4 + 5" is printed, not the sum.
     System.out.println("1 + 2 + 3 + 4 + 5");
     
     //This is not a string, so the sum of these numbers is calculated then printed.
     System.out.println(1 + 2 + 3 + 4 + 5);
     
     // 1 + 2 is not a string, so their sum is calculated, then combined with the "3 + 4 + 5" string.
     System.out.println(1 + 2 + "3 + 4 + 5");
     
     // The same thing as above except, the string "1 + 2 + 3" comes first, which makes a the output a string. So 4 + 5 does not give the sum, but literally prints 4 and 5 after the string.
     System.out.println("1 + 2 + 3" + 4 + 5);
     
     
     //Why do you think the last two outputs act so differently?
     // The first one acts differently, because we are combining a string with an operations that results in an int. So the out put will be int + string
     // The second one is even more different, because we start out with a string, meaning the 4 + 5 will not result in an integer. It will also be a string. So 4 and 5 will be printed, not their sum.
     
     
     //Summary: What are two possible roles of the + operator?
     // + can be used to add to numbers together, but also combine to types when printing something.
     // the types of each thing and order in which they are combined also matter.
    
     
     /*
        Part 1 
        Figure out what is the meaning of each operator. Use print statements
        to verify your answer and explain.
     */
     
     System.out.println("\nPart 1");
     
        
     /*
      *  + means: to add two things together. 
      *  As shown below, this could be to find the sum of two numbers or to combine two things together. 
      *  This case I have combined two strings.
      */
     System.out.println(3 + 5);
     System.out.println("Hello" + " World");
     
     // - means: - is used to find the difference between two numbers. It cannot be used to between other types like strings, as shown below.
     System.out.println(3 - 5);
     //System.out.println("Hello" - " World");
     
     // * means: * is used to find the product between two numbers. It cannot be used to between other types like strings, as shown below.
     System.out.println(3 * 5);
     //System.out.println("Hello" * 3);
     
     // / means:  / is used to find the quotient  between two numbers. It cannot be used to between other types like strings, as shown below.
     // Also, when combined with other things like another slash or a *, it can be used to make comment.
     System.out.println(10 / 5);
     //System.out.println("Hello" / 3);
     
     System.out.println();
     //Print the following expression: (3 + 2) * 5
     System.out.println((3+2)*5);
     //Print the following expression: 3 + 2 * 5
     System.out.println(3 + 2 *5);
     
     //Was this expected? Why or why not?
     // This was expected because Java follows the order od operations.
     
     /*
        Part 2 - Calculate Using Operators
        Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit
        
        
        Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
     */   
     
     int celsius = 45;
     int fahrenheit = (celsius * 9/5) + 32;
     
     System.out.println("\n45 degress celsius is " + fahrenheit + " degrees fahrenheit");
     
     fahrenheit = 900;
     celsius = (fahrenheit - 32) * 5/9;
     
     System.out.println("900 degress farenheit is " + celsius + " degrees celsius\n");
     
     /*
        Part 3
        Figure out what is the meaning of % as a math operator. Use print statements
        to check your answer.
     */
     
     System.out.println(5%2);
     
     //I think % means: This operator mean the remainder of the division between two operands.
     

	}

}
