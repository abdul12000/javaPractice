package javapractice;

import org.testng.annotations.Test;

public class InterviewMinNumber {
	
	/* Question:
	 * Print max number from the column that has the Minimum number from the matrix below:
	 * 2 4 5
	 * 7 4 7
	 * 1 2 9
	 */
	@Test
	public void minNumber(){
		
	int abc[][] = {{2,4,5},{7,4,7},{1,2,9}};
	int min =abc[0][0];
	int mincolumn = 0;
	

 for (int i=0; i<3; i++){
	 
	 for (int j=0; j<3; j++){
	 
	 if (abc[i][j]<min){
		 min = abc[i][j];
		 mincolumn = j;
	 }

	 }
 }
 System.out.println("Minimum number is "+ min);
 System.out.println("value of j is  "+ mincolumn);
 
 int max = abc[0][mincolumn];
 for (int k=0; k<3; k++){
	///Note : we could also use while (k<3) loop here
	if (abc[k][mincolumn]>max){
		max = abc[k][mincolumn];
		
	}
	 }
 
 System.out.println("max number in the column is  "+ max);
	 
	}
	
}
