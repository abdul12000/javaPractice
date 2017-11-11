package javaPractice3;

import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.Test;


/*
 * Set
 * A set is a Collection that cannot contain duplicate elements.
 * However it makes no guarantees concerning the order of iteration
 * Below are classes that implement Set Interface
 *  - HashSet
 *  - LinkedHashSet
 *  - TreeSet
 * 
 */
public class HashSetExample {

	
	//HashSet treeset, LinkedHashset implements Set Interface
	//does not accept duplicate values
	// There is no guarantee elements stored in sequential order.. Random order
	HashSet<String> hs=new HashSet<String>();
	
	//iterator
	
	
	
	@Test
	public void runHashSet(){
		hs.add("USA");
		hs.add("UK");
		hs.add("Nigeria");
		hs.add("France");
		hs.add("France");//Note this does not print because it does not accept duplicate values
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		System.out.println(hs.size());
		hs.remove("France");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());

		System.out.println("   ");
		
		Iterator<String> i = hs.iterator();
		while (i.hasNext()){
			System.out.println(i.next());
		}
		
		
	}
}
