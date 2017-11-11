package javapractice;

import org.testng.annotations.Test;

public class MultidimensionalArrays {
	
	@Test
public void testingMulitDimensionalArray(){
		
		/*
		 * writing multidimensional array of the form
		 * 3 5 7
		 * 6 8 9
		 * using array declaration and assigning values separately
		 * */
		 
		int a [][] = new int[2][3];
		a[0][0] = 3;
		a[0][1] = 5;
	    a[0][2] = 7;
		a[1][0] = 6;
		a[1][1] = 8;
		a[1][2] = 9;
		
		System.out.println(a[1][0]);
		System.out.println(a[1][2]);
		
		/*
		 * writing multidimensional array of the form
		 * 13 25 17
		 * 65 88 39
		 * 105,98,349
		 * using dynamic array declaration and assigning values 
		 * */
		
		
		int b[][]= {{13,25,17},{65,88,39},{105,98,349}};
		System.out.println(b[1][0]);
		System.out.println(b[1][2]);
		
		System.out.println(b.length);
		//to print all the values in the array
		for (int i=0; i<b.length; i++)// This stands for row
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(b[i][j]);// This stands for column
				
			}
		}
		
	}
	
	
}
