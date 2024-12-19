package unit3;

import java.lang.reflect.Array;

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
		double[] x = {1, 2, 3, 4, 5, -4.9, 7.3};
		double[] y = {10000, 2000000,30000000, 40000000.35, 5, -4, 7};
		System.out.println(min(x));
		System.out.println(max(x));
		System.out.println(factors(6));
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
	
	/**
	 *Description: This method finds the sum of all the numbers given in the array parameter
	 *@param nums -> an array of integers
	 *@return sum of all integers in the nums array
	 */
	public static int sum(int[] nums){
		int total = 0;
		for (int i = nums.length; i > 0; i --) {
			total += nums[i];
		}
		return total;
	}
	
	/**
	 *Description: This method finds the sum of all the numbers given in the array parameter
	 *@param nums -> an array of doubles
	 *@return sum of all doubles in the nums array
	 */
	public static double sum(double[] nums){
		double total = 0;
		for (int i = nums.length; i > 0; i --) {
			total += nums[i];
		}
		return total;
	}
	

	/**
	 *Description: This method finds the smallest number in the array, given by the parameter, and returns its index 
	 *@param nums -> an array of integers
	 *@return index of smallest number in the nums array
	 */
	public static int min(int[] nums){
		int min = 0;
		
		for(int i = nums.length; i > 0; i --) {
			if ((nums[i - 1] < nums[min])) {
				min = i - 1;
			}
		}
		
		return min;
	}
	
	/**
	 *Description: This method finds the smallest number in the array, given by the parameter, and returns its index 
	 *@param nums -> an array of doubles
	 *@return index of smallest number in the nums array
	 */
	public static int min(double[] nums){
		int min = 0;
		
		for(int i = nums.length; i > 0; i --) {
			if ((nums[i - 1] < nums[min])) {
				min = i - 1;
			}
		}
		
		return min;
	}
	
	/**
	 *Description: This method finds the biggest number in the array, given by the parameter, and returns its index 
	 *@param nums -> an array of integer
	 *@return index of biggest number in the nums array
	 */
	public static int max(int[] nums){
		int max = 0;
		
		for(int i = nums.length; i > 0; i --) {
			if ((nums[i - 1] > nums[max])) {
				max = i - 1;
			}
		}
		
		return max;
	}
	
	/**
	 *Description: This method finds the biggest number in the array, given by the parameter, and returns its index 
	 *@param nums -> an array of doubles
	 *@return index of biggest number in the nums array
	 */
	public static int max(double[] nums){
		int max = 0;
		
		for(int i = nums.length; i > 0; i --) {
			if ((nums[i - 1] > nums[max])) {
				max = i - 1;
			}
		}
		
		return max;
	}
	
	/**
	 *Description: This method finds the biggest and smallest numbers in the array, given by the parameter, and returning the difference between the two
	 *@param nums -> an array of integers
	 *@return index of biggest number in the nums array
	 */
	public static int bigDifference(int[] nums){
		int max = 0;
		int min = 0;
		int difference;
		
		//Get smallest integer
		for(int i = nums.length; i > 0; i --) {
			if ((nums[i - 1] > nums[max])) {
				max = i - 1;
			}
		}
	
		//Get biggest integer
		for(int i = nums.length; i > 0; i --) {
			if ((nums[i - 1] < nums[min])) {
				min = i - 1;
			}
		}
		
		difference = nums[max] - nums[min];
		
		return difference;
	}
	
	/**
	 *Description: This method finds the biggest and smallest numbers in the array, given by the parameter, and returning the difference between the two
	 *@param nums -> an array of doubles
	 *@return index of biggest number in the nums array
	 */
	public static double bigDifference(double[] nums){
		int max = 0;
		int min = 0;
		double difference;
		
		//Get smallest integer
		for(int i = nums.length; i > 0; i --) {
			if ((nums[i - 1] > nums[max])) {
				max = i - 1;
			}
		}
	
		//Get biggest integer
		for(int i = nums.length; i > 0; i --) {
			if ((nums[i - 1] < nums[min])) {
				min = i - 1;
			}
		}
		
		difference = nums[max] - nums[min];
		
		return difference;
	}
	
	/**
	 *Description: This method finds all the factors of the number given by the parameter
	 *@param num -> any integer
	 *@return array of all the factors of the num
	 */
	public static int[] factors(int num){
		int[] factors = new int[numOfFactors(num)];
		int index = 0;
		String printFactors;
		
		for (int i = num; i > 0; i --) {
			if(num % i == 0) {
				factors[index] = i;
				index ++;
			}
		}
		
		for (int i = factors.length - 1; i >= 0; i --) {
			
		}
		
		return ;
		
	}
	
	
	


}
