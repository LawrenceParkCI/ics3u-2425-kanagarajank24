/**
 * Description: This programs describes the rules of Bingo and gives an example of a Bingo card. <br>
 * Date: September 25, 2024
 * @author Kaleena Kanagarajan
 */
package unit1;

public class BingoRules {
	
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		//These statements print the title
		System.out.println("How to Play Bingo");
		System.out.println("-----------------");
		
		//These statements print the rules of Bingo
		System.out.println("1. The caller randomly pulls a numbered bingo ball.");
		System.out.println("2. The number is placed on the bingo board and called out.");
		System.out.println("3. Players look for the called number on their bingo card.");
		System.out.println("4. If the number is located, it is marked off.");
		System.out.println("5. Steps 1 to 4 are repeated until a play matches the BINGO pattern.");
		System.out.println("6. The winning player yells BINGO!");
		
		//These statements print out an example of a Bingo card
		System.out.println("\nBingo Card");
		System.out.println("----------");
		System.out.println("_______________________");
		System.out.printf("|%-5s%-5s%-5s%-5s%-1s|", "B", "I", "N", "G", "O");
		System.out.println("\n|---------------------|");
		System.out.printf("|%-4s%-5s%-5s%-5s%-1s|", "2", "16", "32", "48", "62");
		System.out.printf("\n|%-4s%-5s%-5s%-5s%-1s|", "5", "19", "35", "52", "74");
		System.out.printf("\n|%-4s%-4s%-6s%-5s%-1s|", "4", "22", "Free", "59", "65");
		System.out.printf("\n|%-4s%-5s%-5s%-5s%-1s|", "7", "27", "43", "56", "72");
		System.out.printf("\n|%-4s%-5s%-5s%-5s%-1s|", "6", "20", "39", "58", "63");
		System.out.println("\n|_____________________|");
	}

}
