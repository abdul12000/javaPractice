package javapractice2;

import org.testng.annotations.Test;

public class ChildDemo extends ParentDemo {
String name = "Lateef";

public ChildDemo()
{
	super();// Using super Keyword with Constructors - This should always be in the first line
	System.out.println("I am in Child Class Constructor");
	}

public void getData(){
	
	System.out.println("I am in child class");

	super.getData(); 	//Handling super method
}

public void getStringdata(){
	System.out.println(name);
	System.out.println(super.name); //Handling super varible
	
}
@Test
public void displayname(){
	ChildDemo cd = new ChildDemo();
	cd.getStringdata();
	cd.getData();

}
}
