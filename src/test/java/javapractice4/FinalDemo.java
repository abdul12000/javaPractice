package javapractice4;

import org.testng.annotations.Test;

public class FinalDemo extends ParentForFinalDemo {

	final int i =4;


/*void setdata(){//As this appears in a parent class, then it cannot be overwritten in this sub class.
		int a = 8; 
		System.out.println("HelloWorld");
	}
	*/
	
	//Also if the parent class name was final, then you cannot extend it.
	
	
	@Test
	public void runFinalDemo(){
		
		/*
		 * i=3;
		 * 
		 * Here it is not possible to change the i variable because it has been declared as final
		 */

	
		
		
	}
}
