package javaPractice3;

import java.util.ArrayList;


import org.testng.annotations.Test;


/*
 * List
 * A List is an ordered Collection (Sometimes called a sequence). List may contain duplicate elements.
 * Below are the classed that implement List interface
 * - ArrayList
 * - LinkedList
 * - Vector
 * 
 */
public class ArrayListExample {
//List Collection framework contains 3 classes - ArrayList, LinkedList and Vector that implements the List Interface
	//Arraylist has dynamic size where you can remove and add data anytime - Unlike Arrays.
	ArrayList<String> a = new ArrayList<String>();
	ArrayList<String> b = new ArrayList<String>();


	
	@Test
	public void runArrayList(){
		a.add("Lateef");
		a.add("Java");
		a.add("Java");
		a.add("Java"); // Accepts duplicate values and prints in sequential order
		a.add("Sherif");
		System.out.println(a);
		a.add(0, "Student");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.remove("Java");
		System.out.println(a);

		
		
		///Using ArrayList<String> b;
		b.add("Paul");
		b.add("Paul");
		b.add("Peter");
		b.add("Patrick"); //ArrayList can accept duplicate values
		System.out.println(b.get(2));
		System.out.println(b.contains("Peter"));
		System.out.println(b.contains("Lateef"));
		System.out.println(b.indexOf("Paul"));
		System.out.println(b.isEmpty());
		System.out.println(b.size());
		
	}
	
}
