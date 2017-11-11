package javapractice2;

import org.testng.annotations.Test;
// this keyword
public class ThisDemo {
	int a = 2;//global variable
	
	public void getData(){
		int a = 3;//local variable
		System.out.println(a);
		System.out.println(this.a); //this refers to the current object - Object lies in the class level
		
		//Adding up local variable - Global variable
		int b = a + this.a;
		System.out.println(b);
	}
	
	
	@Test
	public void runDemo(){
	ThisDemo td=new ThisDemo();
	td.getData();
	}
}
