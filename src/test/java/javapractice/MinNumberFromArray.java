package javapractice;

import org.testng.annotations.Test;



public class MinNumberFromArray {
	/*
	 * Question:
	 * Print Minimum number from the matrix below:
	 * 2 4 5
	 * 3 4 7
	 * 1 2 9
	 * 
	 */
	@Test
	public void minNumber(){
		
	int abc[][] = {{2,4,5},{3,4,7},{1,2,9}};
	int min =abc[0][0];
 for (int i=0; i<3; i++){
	 
	 for (int j=0; j<3; j++){
	 
	 if (abc[i][j]<min){
		 min = abc[i][j];
	 }

	 }

 }
 System.out.println("Minimum number is "+ min);
	 
	}
	
	
	/*
	 * Question:
	 * Print Maximum number from the matrix below:
	 * 2 4 5
	 * 3 4 7
	 * 1 2 9
	 * 
	 */
	@Test
	public void maxNumber(){
		
	int bcd[][] = {{2,4,5},{3,4,7},{1,2,9}};
	int max =bcd[0][0];
 for (int i=0; i<3; i++){
	 
	 for (int j=0; j<3; j++){
	 
	 if (bcd[i][j]>max){
		 max =bcd[i][j];
	 }

	 }

 }
 System.out.println("Maximum number is "+ max);
	 
	}
}
