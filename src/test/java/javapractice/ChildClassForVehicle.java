package javapractice;

import org.testng.annotations.Test;



//Learning Inheritance
public class ChildClassForVehicle extends ParentClassForVehicle {
	
	public void engine(){
		System.out.println("new Engine");
	}
	
	public void colour(){
		System.out.println(colour);
	}
	
	@Override
	public void brakes(){
		System.out.println("brakes code is implemented in childclass");
	}
@Test
public void printcolour(){
	ChildClassForVehicle cd = new ChildClassForVehicle();
	cd.colour();
	cd.brakes();
	cd.audioSystem();
}
}
