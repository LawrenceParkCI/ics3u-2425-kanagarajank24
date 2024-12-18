package unit3;

/**
Description:This program has multiple methods which complete math calculations . <br>
Date: Dec 17, 2024
@author Kaleena Kanagarajan
 */
public class MathPlus {

	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {

	}

	/**
	 *Description: This methods finds the distance between two (x, y) coordinates given by the parameters
	 *@param x1 -> x value of first coordinate
	 *@param y1 -> y value of first coordinate
	 *@param x2 -> x value of second coordinate
	 *@param y2 -> y value of second coordinate
	 *@return distance between two (x, y) coordinates 
	 */
	public static double distance(int x1, int y1, int x2, int y2 ){
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return distance;
	}

	/**
	 *Description: This method finds the length of the hypotenuse created by the two arm lengths given by the parameters
	 *@param length1 -> length of first arm of the right angle triangle
	 *@param length1 -> length of second arm of the right angle triangle
	 *@return length hypotenuse of the triangle created by the two lengths
	 */
	public static double hypotenuse(double length1, double length2){
		double hypotenuse = Math.sqrt(Math.pow(length1, 2) + Math.pow(length2, 2));
		return hypotenuse;
	}

	/**
	 *Description: This method finds the number of factors the integer given by the parameter has 
	 *@param num -> any integer number
	 *@return number of factors the integer has
	 */
	public static int numOfFactors(int num){
		int numOfFactors = 0;
		for(int i = num; i > 0; i --) {

			if(num % i == 0) {
				numOfFactors ++;
			}

		}
		return numOfFactors;
	}

	/**
	 *Description: This method finds whether the integer given by the parameter is prime or not
	 *@param num -> any integer number
	 *@return true if prime and false if not
	 */
	public static boolean isPrime(int num){
		boolean isPrime = numOfFactors(num) <= 2;
		return isPrime;
	}


}
