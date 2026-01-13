package unit2;

/**
Description: This follows the Randomness worksheet. <br>
Date: Nov 18, 2024
@author: Kaleena Kanagarajan
*/
public class Randomness {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(Math.random());
    }

    //Run the program a few times. What do you think is the 
    //range of the numbers generated?
    //0 - 1 (non-inclusive of 1)

    //Read the demo program. Write the code so that the program 
    //will produce a random number between 100 and 1000.
    
    //The line below is inclusive of 1000
    System.out.println((int)(Math.random()*901) + 100);
    
    //The line below is non-inclusive of 1000
    System.out.println((int)(Math.random()*900) + 100);
  }
}