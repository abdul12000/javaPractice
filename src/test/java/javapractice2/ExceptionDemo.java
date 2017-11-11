package javapractice2;

import org.testng.annotations.Test;

//Exceptions can be used in situation where for instance we except pop up to come and in some cases it may not come up
// so in that instance where the pop up  does not come up, we can catch the error with an exception so script execution can continue
public class ExceptionDemo {

	
	@Test
	//Throwing Arithmetic exception
	public void runExceptionMultipleExceptions() throws Exception{

		runGenericException(9,0);
		runArithmeticException(10,0);

		runOutOfBoundException(7);
	}


	public void runGenericException(int a, int b){
	
	try
	{
	int k = a/b;
	System.out.println(k);
	}
	catch(Exception e)// this is a generic exception
	// There are different types of exceptions - Generic one is -
	//catch(Exception e)// this is a generic exception
	//Another one is 
	//catch(ArithmeticException e)// this is a generic exception
	{
		System.out.println("Catching Generic exception");
	}
	finally // finally keyword is always executed when used in try-catch. For instance it could be used to close browser
	//to delete cookies irrespective of whether test fails or not.
	//Also note that that catch block is not mandatory to be used. 
	{
		System.out.println("Using Finally to delete cookies or close browser");
	}
	
}

	
	public void runArithmeticException(int c, int d){
		
		try
		{
		int p = c/d;
		System.out.println(p);
		}
		catch(ArithmeticException ae)// this is a generic exception
		// There are different types of exceptions - Generic one is -
		//catch(Exception e)// this is a generic exception
		//Another one is 
		//catch(ArithmeticException e)// this is a generic exception
		{
			System.out.println("Catching Arithmetic exception");
		}
		
	}
	
	public void runOutOfBoundException(int c){
		
		try
		{
		int arr[] = new int[c];
		System.out.println(arr[7]);
		}
		catch(IndexOutOfBoundsException ie)// this is a generic exception
		// There are different types of exceptions - Generic one is -
		//catch(Exception e)// this is a generic exception
		//Another one is 
		//catch(ArithmeticException e)// this is a generic exception
		{
			System.out.println("Catching IndexOutOfBounds exception");
		}
		
	}

}
