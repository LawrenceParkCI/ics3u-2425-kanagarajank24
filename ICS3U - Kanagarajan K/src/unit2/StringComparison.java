package unit2;
import java.util.Scanner;

/**
 * Description: This follows the String Comparison worksheet. <br>
 * Date: Nov 8, 2024
 * @author Kaleena Kanagarajan
 */

class StringComparison {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();

		if (answer == "Toronto") {
			System.out.println("Correct!");
		} 
		else {
			System.out.println("Sorry, that's incorrect.");
		}

		//Run the code. What happens when you type the correct answer? The incorrect answer?

		/*
      Strings are objects, not primitives and as such are a 
		 *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
       String name1 = "Bob";
        String name2 = "Anna";
      
        .compareTo()
        if (name1.compare2(name2) < 0){
        	System.out.println(name1 + " comes before " + name2);
        }
        else{
        	System.out.println(name2 + " comes before " + name1);
        }
        
        output:
        Anna comes before Bob
        
        .equals()
        if (name1.equals(name2)){
        	 System.out.println(name1 + " is the same as " + name2);
        }
        else{
        	System.out.println(name1 + " is not the same as " + name2);
        }
        
        output:
        Bob is not the same as Anna
        
        .equalsIgnoreCase()
        String s = "hello";
        String t = "Hello";
        
        if (s.equalsIgnoreCase(t)){
        	System.out.println(s + " the same as " + t);
        }
        else{
        	System.out.println(s + " is not the same as " + t);
        }
        
        output:
        hello is the same as Hello
        
		 */


		//What values does compareTo() return? How can we 
		//interpret the value?
		/*
		 * In Java, we use comapreTo() like this s.compareTo(t).
		 * The method will check if the first letter of s comes before the first letter of g in their ASCII codes. 
		 * This is almost the same as alphabetically, expect if one is capital letter and the other is not,
		 * the program will still return that the capital is alphabetically first, even if it is not.
		 * This method will return 0 if the strings are the exact same, a negative number if the first one comes before the second, 
		 * and a positive number if the first one comes after the second.
		 * The actual calculation being done is (ASCII code of first letter in string 1) - (ASCII code of first letter in string 2).
		 * Ex. if string 1 starts with A, and string two starts with B, A will come before be in the ASCII code (so ASCII code of A <B),
		 * therefore, when A - B is done, a negative number will be returned. 
		 */

		//what value does equals() and equalsIgnoreCase() return? 
		//What is the difference between these two functions?
		/*
		 * In general, the functions do the exact same thing. if we were to do s.equals("Hello") or s.equalsIgnoreCase(), 
		 * then the function will check if the string holds "Hello". The only difference, is that in equalsIgnoreCase,
		 * true will be returned, even if it "hello" or "heLlO". It does not care about the case of any e
		 */
		
		in.close();
	}
	
}