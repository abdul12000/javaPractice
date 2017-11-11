package javaPractice3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;
/*
 * Hashtable
 * Very similar to HashMap but with 3 major differences
 * 1 - Synchronisation or Thread safe: This is the most importance difference between the two
 * Hashmap is non synchronised and not thread safe. On the other hand Hashtable is thread safe and synchronized.
 * When to use HashMap? Answer is when your application does not require any multi-threading task, in other wordshashmap is better 
 * for non- threading  applications. Hashtable should be used in multithreading applications.
 * 
 * 2 - Null keys and null values : Hashmap allows one null key and any number of null values, while Hastable do not allow null keys
 *  in HashTable object
 * 
 * 3 - Iterating values : HashMap object values are iterated by using iterator. HashTable is the only class other than vector 
 * which uses enumerator to iterate the values of Hashtable object
 * 
 * 
 */
public class HashTableExample {
	
	Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
	
	
	
	@Test
	public void runHashMap(){
		hm.put(0, "Hello");
		hm.put(1, "Goodbye");
		hm.put(2, "Morning");
		hm.put(3, "Afternoon");
		hm.put(4, "Night");
		hm.put(6, "");// Hasmap allows for null values
		//hm.put(null, "Testing null key with this value");// HashTable does not allow for null keys
		
		System.out.println(hm.get(3));
		System.out.println(hm.replace(1, "GoodMorning"));
		hm.remove(3);
		System.out.println(hm);
		
/*
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while (it.hasNext()){
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
	
		}
	*/
		
	}

}