package unit3;

/**
Description:This follows the Method Challenge 1 worksheet. <br>
Date: Dec 13, 2024
@author Kaleena Kanagarajan
 */
public class MethodChallenge1 {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main( String[] args )    {
		// Complete the function below. Don't forget to comment.
		double d1 = distance(-2,1 , 1,5);
		System.out.println(" (-2,1) to (1,5) => " + d1 );

		double d2 = distance(-2,-3 , -4,4);
		System.out.println(" (-2,-3) to (-4,4) => " + d2 );

		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );

		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
	}

	/**
 Decription: This methods calulctes the distance between two (x, y) coordinates.
 @param x1 -> x value of first coordinate
 @param y1 -> y value of first coordinate
 @param x2 -> x value of second coordinate
 @param y2 -> y value of second coordinate
 @return distance between the two coordinates
	 */
	public static double distance(int x1, int y1, int x2, int y2 ){
		double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return length;
	}
}