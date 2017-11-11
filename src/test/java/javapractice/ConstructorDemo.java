package javapractice;

import org.testng.annotations.Test;

public class ConstructorDemo {

	public ConstructorDemo(){
		System.out.println("I am in the default constructor");
		System.out.println("I am in the default constructor lecture 1");
	}
	
	public ConstructorDemo(int a, int b){
		System.out.println("I am in the parametarized constructor");
	}
	public void getData(){
		System.out.println("I am a method");
	}
	
	@Test
	public void runConstructors(){
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cda = new ConstructorDemo(3, 5);
				
	}
}
