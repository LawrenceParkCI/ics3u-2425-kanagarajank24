package unit1;
/**
 * Description: This program follows the Working with Strings Worksheet. <br>
 * Date: Oct 4, 2024
 * @author Kaleena Kanagarajan
 */
public class PlayingWithStrings {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		//Part 1: Create class called PlayingWithStrings
		
		//Part 2
		//a)
		String fruit = "apple";
		fruit = "banana";
		System.out.println(fruit + " split");
		
		//b)
		String num1 = "12";
		String num2 = "34";
		System.out.println(num1 + num2);
		
		//c)
		System.out.println(num1 + num2 + 56);
		
		//d)
		String number1 = 13 + "";
		System.out.println(number1);
		
		//e)
		fruit = "apple";
		System.out.println(fruit.length());
		
		//f)
		String name = "Runnymede";
		System.out.println(name.length() + "Ravens".length());
		
		//Part 3
		//a)
		String message = "Themouseranuptheclock";
		String word = message.substring(3,8);
		System.out.println(word);
		
		//b)
		message = "JackandJillwentupthehill";
		System.out.println(message.substring(20));
		
		//c)
		System.out.println(message.substring(message.length() - 4));
		
		//d)
		System.out.println("hello".substring(3));
		
		//e)
		System.out.println("hello".substring(5));
		
		//f)
		//System.out.println("hello".substring(6));
		
		//g)
		String spaces = "     Trim Me     ";
		String noSpaces = spaces.trim();
		System.out.println(spaces);
		System.out.println(noSpaces);
		
		//h)
		String digits ="1234567890";
		System.out.println(digits.indexOf("6") + digits.indexOf("a"));
		
		//i)
		System.out.println("Ilovesandwiches".substring(5).length());
		
		//j)
		String word1 = "Hello";
		String word2 = word1;
		word1 = word1.substring(1,2);
		System.out.println(word2);
		
		//k)
		String  name1 = "Pierre Elliot Trudeau";
		String name2 = name1.substring(0,6) + name1.substring(15);
		System.out.println(name2);
		
		//Part 4
		String msg  = "I am enjoying this class.";
		
		String msg1 = msg.toUpperCase();
		String msg2 = msg.toLowerCase();
		char letter = msg.charAt(6);
		
		System.out.println(msg);
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("Character at index 6 = " +  letter);
		System.out.println("msg has " + msg.length() + " characters.");
		
		//Part 5
		//Done on the sheet
		
		
		
		
		
		
		

	}

}
