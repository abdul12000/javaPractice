package javapractice;

import org.testng.annotations.Test;

public class ArraysDemo {

	
	@Test
	public void runArraysDemo(){
//int a =4;

//-An array is a container which stores multiple values of same type

int a[] = new int[5];//this declares an array and allocates memory for the values

//Assigning values to the array
a[0]=2;
a[1]=4;
a[2]=6;
a[3]=8;
a[4]=10;

//Dynamically allocating values and allocating memory in an array
int b[] = {1,3,5,7,9};



for (int i =0; i<a.length; i++){
	System.out.println(a[i]);
}


for (int j =0; j<a.length; j++){
	System.out.println(b[j]);
}
}
}
