package unit2;
/**
Description: This follows the For 2 worksheet. <br>
Date: Nov 25, 2024
@author Kaleena Kanagarajan
*/

public class For2 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
  public static void main(String[] args) {
    //Recall - create a for loop printing 1 to 10:


    //though we are repeating a certain number of times, we can use variables in our for loops as well

//    int times = 20;
//
//    for (int i = 15; i < times; i++) {
//      System.out.println(i);
//    }

    //In addition, the counter doesn't necessarily have to be an integer
//    double increment = 0.1;
//    for (double i = 0; i < 2; i += increment) {
//      System.out.println(i);
//    }

    //create a variable to store the starting number, and use it in a for loop. Be able to use a double value:

    double loop = 0.2;
    
    for(double i = 0; i < 5.2; i += loop) {
    	System.out.println(i);
    }
    

   //Look at the following code. Explain what is happening?

    int sum = 0; 

    for (int i = 1; i < 10; i++) {
      sum += i;
    }

    System.out.println(sum);
    
    //Rather than counting, the loop is adding increasing number to the variable sum
    //When the loop is done, it prints out the sum
    // This can be used when calculating something that is often increasing, like when an amount is compounded annually with interest

    
  }
}