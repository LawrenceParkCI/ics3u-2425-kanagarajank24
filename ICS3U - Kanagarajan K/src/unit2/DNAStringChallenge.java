package unit2;
/**
Description: This follows the DNA String Challenge worksheet. <br>
Date: Nov 26, 2024
@author: Kaleena Kanagarajan
*/

public class DNAStringChallenge {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
  public static void main(String[] args) {
    /**
      http://rosalind.info/problems/dna/
    */
	  
	 //variables
	  String dNA = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
	  int a = 0;
	  int c = 0;
	  int g = 0;
	  int t = 0;

	  //For loop to count how many of each there is
	  for(int i = 0; i < dNA.length(); i++) {
		  switch(dNA.charAt(i)) {
		  case 'A':
			  a ++;
			  break;
		  case 'C':
			  c ++;
			  break;
		  case 'G':
			  g ++;
			  break;
		  case 'T':
			  t ++;
			  break;
			  
		  }
	  }
	  
	  //output
	  System.out.println(a + " " + c  + " " + g  + " " + t);
	  
  }
}