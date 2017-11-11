package javapractice;

import org.testng.annotations.Test;

public class SortArray {

	//Sorting an array
	@Test
public void sortArr(){
		int a[]={2,6,1,4,9};
		int temp;
		for (int i=0; i<a.length; i++){
			for (int j=i+1; j<a.length; j++){
				if (a[i]>a[j]){
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i=0; i<a.length; i++){
		System.out.println(a[i]);
		}
		
	}
	
	//Swapping numbers
	@Test
	public void swapNumbers(){
		int a = 4;
		int b = 8;
		//To swap the two numbers above, do the following:
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	//Swapping numbers without use of temp variable
	@Test
	public void swapNumbersWithoutTUsingTemp(){
		int a = 4;
		int b = 8;
		//To swap the two numbers above without using temp variable, do the following:
	a= a+b;//12
	b=a-b;//12-8 =4
	a=a-b;//12-5=8
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	


}
